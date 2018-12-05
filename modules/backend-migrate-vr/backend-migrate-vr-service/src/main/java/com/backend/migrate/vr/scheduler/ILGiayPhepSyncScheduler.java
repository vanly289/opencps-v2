package com.backend.migrate.vr.scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.backend.migrate.vr.model.SRCGiayPhepLienVan;
import com.backend.migrate.vr.service.SRCGiayPhepLienVanLocalServiceUtil;
import com.backend.migrate.vr.service.SRCGiayPhepVanTaiLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;

@Component(immediate = true, service = ILGiayPhepSyncScheduler.class)
public class ILGiayPhepSyncScheduler  extends BaseSchedulerEntryMessageListener {

	@Override
	protected void doReceive(Message message) throws Exception {
		_log.info("**** ||||| ******** STARTING SYNC ILGiayPhepSyncScheduler *** " + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
		
		List<SRCGiayPhepLienVan> giayPhepLienVans = _giayPhepLienVanLocalServiceUtil.getLastest(1901l);
		
		_log.info("ROW NEED UPDATE ** " + giayPhepLienVans.size());
	}
	
	@Activate
	@Modified
	protected void activate() {
		schedulerEntryImpl.setTrigger(TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(),
				8, TimeUnit.HOUR));
		_schedulerEngineHelper.register(this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
	}

	@Deactivate
	protected void deactivate() {
		_schedulerEngineHelper.unregister(this);
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {

		_schedulerEngineHelper = schedulerEngineHelper;
	}

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {
	}

	private SchedulerEngineHelper _schedulerEngineHelper;

	@Reference
	private SRCGiayPhepLienVanLocalServiceUtil _giayPhepLienVanLocalServiceUtil;

	@Reference
	private SRCGiayPhepVanTaiLocalServiceUtil _giayPhepVanTaiLocalServiceUtil;

	private Log _log = LogFactoryUtil.getLog(ILGiayPhepSyncScheduler.class);	
}
