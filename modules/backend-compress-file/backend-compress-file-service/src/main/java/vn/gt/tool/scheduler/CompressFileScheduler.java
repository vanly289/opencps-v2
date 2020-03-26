package vn.gt.tool.scheduler;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;
import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;

import vn.gt.dao.model.CompressFileJob;
import vn.gt.dao.service.CompressFileJobLocalServiceUtil;
import vn.gt.tool.util.CompressFileUtil;

@Component(
		immediate = true, property = {"cron.expression=0 0/5 1,2,3,4,5 * * ?"},
		service = CompressFileScheduler.class)
public class CompressFileScheduler 
extends BaseSchedulerEntryMessageListener 
{

	@Override
	public void doReceive(Message message) throws MessageListenerException {
		try {
			_log.info("CompressFileStart: " + new Date());
			
			long adminUserId = 20164;	//TODO: FIX USER ADMIN ID
			User user = UserLocalServiceUtil.getUser(adminUserId);
			
			PrincipalThreadLocal.setName(adminUserId);
			PermissionChecker permissionChecker = PermissionCheckerFactoryUtil.create(user);
			PermissionThreadLocal.setPermissionChecker(permissionChecker);
			
			long lastedHoSoId = CompressFileJobLocalServiceUtil.getLastedHoSoId();
			
			DynamicQuery hosoQuery = DossierLocalServiceUtil.dynamicQuery();
			
			String[] trangThais = new String[]{TrangThaiHoSo.APPROVED,TrangThaiHoSo.CANCELED,TrangThaiHoSo.ENDED};
			
			hosoQuery.add(PropertyFactoryUtil.forName("groupId").eq(55301l));
			hosoQuery.add(PropertyFactoryUtil.forName("dossierStatus").in(trangThais));
			hosoQuery.add(PropertyFactoryUtil.forName("dossierId").gt(lastedHoSoId));
			hosoQuery.addOrder(OrderFactoryUtil.asc("dossierId"));
	
			
			List<Dossier> listHoSo = DossierLocalServiceUtil.dynamicQuery(hosoQuery, 0, 300);
			
			doCompress(listHoSo);
			
			_log.info("CompressFileEnd: " + new Date());
		} catch(Exception e) {
			_log.error(e);
		}
	}
	
	public static void doCompress(List<Dossier> listHoSo) throws SystemException, PortalException, IOException, InterruptedException, TimeoutException {
		
		if(listHoSo != null && listHoSo.size() > 0) {
			CompressFileJob compressFileJob = CompressFileJobLocalServiceUtil.addJob(listHoSo);
			
			for(Dossier hoSo : listHoSo) {
				_log.info("CompressFile:" + listHoSo.size() + ": " + hoSo.getDossierTemplateNo() + ": " + hoSo.getReferenceUid() + ": " + hoSo.getDossierNo());
				
				List<DossierFile> listGiayToDinhKemHoSo = DossierFileLocalServiceUtil.getDossierFilesByDossierId(hoSo.getDossierId());
				
				for(DossierFile giayToDinhKemHoSo : listGiayToDinhKemHoSo) {
					if(giayToDinhKemHoSo.getDossierPartType() == 1) {
						CompressFileUtil.compressFile(hoSo.getDossierId(), giayToDinhKemHoSo.getFileEntryId());
					}
				}
			}
			
			CompressFileJobLocalServiceUtil.updateCompressFileJob(compressFileJob.getId());
		}
	}
	
	private static interface TrangThaiHoSo{
		final public static String APPROVED = "done";
		final public static String ENDED = "ended";
		final public static String CANCELED = "cancelled";
	}	
	
	/**
	   * activate: Called whenever the properties for the component change (ala Config Admin)
	   * or OSGi is activating the component.
	   * @param properties The properties map from Config Admin.
	   * @throws SchedulerException in case of error.
	   */
	  @Activate
	  @Modified
	  protected void activate(Map<String,Object> properties) throws SchedulerException {

	    // extract the cron expression from the properties
	    String cronExpression = GetterUtil.getString(properties.get("cron.expression"), _DEFAULT_CRON_EXPRESSION);

	    // create a new trigger definition for the job.
	    String listenerClass = getEventListenerClass();
	    Trigger jobTrigger = _triggerFactory.createTrigger(listenerClass, listenerClass, new Date(), null, cronExpression);

	    // wrap the current scheduler entry in our new wrapper.
	    // use the persisted storaget type and set the wrapper back to the class field.
	    schedulerEntryImpl = new StorageTypeAwareSchedulerEntryImpl(schedulerEntryImpl, StorageType.PERSISTED);

	    // update the trigger for the scheduled job.
	    schedulerEntryImpl.setTrigger(jobTrigger);

	    // if we were initialized (i.e. if this is called due to CA modification)
	    if (_initialized) {
	      // first deactivate the current job before we schedule.
	      deactivate();
	    }

	    // register the scheduled task
	    _schedulerEngineHelper.register(this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);

	    // set the initialized flag.
	    _initialized = true;
	  }

	  /**
	   * deactivate: Called when OSGi is deactivating the component.
	   */
	  @Deactivate
	  protected void deactivate() {
	    // if we previously were initialized
	    if (_initialized) {
	      // unschedule the job so it is cleaned up
	      try {
	        _schedulerEngineHelper.unschedule(schedulerEntryImpl, getStorageType());
	      } catch (SchedulerException se) {
	        if (_log.isWarnEnabled()) {
	          _log.warn("Unable to unschedule trigger", se);
	        }
	      }

	      // unregister this listener
	      _schedulerEngineHelper.unregister(this);
	    }
	    
	    // clear the initialized flag
	    _initialized = false;
	  }

	  /**
	   * getStorageType: Utility method to get the storage type from the scheduler entry wrapper.
	   * @return StorageType The storage type to use.
	   */
	  protected StorageType getStorageType() {
	    if (schedulerEntryImpl instanceof StorageTypeAware) {
	      return ((StorageTypeAware) schedulerEntryImpl).getStorageType();
	    }
	    
	    return StorageType.MEMORY_CLUSTERED;
	  }
	  
	  /**
	   * setModuleServiceLifecycle: So this requires some explanation...
	   * 
	   * OSGi will start a component once all of it's dependencies are satisfied.  However, there
	   * are times where you want to hold off until the portal is completely ready to go.
	   * 
	   * This reference declaration is waiting for the ModuleServiceLifecycle's PORTAL_INITIALIZED
	   * component which will not be available until, surprise surprise, the portal has finished
	   * initializing.
	   * 
	   * With this reference, this component activation waits until portal initialization has completed.
	   * @param moduleServiceLifecycle
	   */
	  @Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	  protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
	  }

	  @Reference(unbind = "-")
	  protected void setTriggerFactory(TriggerFactory triggerFactory) {
	    _triggerFactory = triggerFactory;
	  }

	  @Reference(unbind = "-")
	  protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {
	    _schedulerEngineHelper = schedulerEngineHelper;
	  }

	  // the default cron expression is to run daily at midnight
	  private static final String _DEFAULT_CRON_EXPRESSION = "0 0 0 * * ?";

	  private volatile boolean _initialized;
	  private TriggerFactory _triggerFactory;
	  private SchedulerEngineHelper _schedulerEngineHelper;
	
	private static final Log _log = LogFactoryUtil.getLog(CompressFileScheduler.class);
}