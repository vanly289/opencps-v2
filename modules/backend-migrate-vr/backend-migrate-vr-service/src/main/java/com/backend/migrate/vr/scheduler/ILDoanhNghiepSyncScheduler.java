package com.backend.migrate.vr.scheduler;

import java.util.Date;

import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.thirdparty.system.exception.NoSuchILDoanhNghiepException;
import org.opencps.thirdparty.system.model.ILDoanhNghiep;
import org.opencps.thirdparty.system.service.ILDoanhNghiepLocalServiceUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.backend.migrate.vr.exception.NoSuchDoanhNghiepException;
import com.backend.migrate.vr.model.DoanhNghiep;
import com.backend.migrate.vr.service.DoanhNghiepLocalServiceUtil;
import com.backend.migrate.vr.service.PhuongTienLocalService;
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

@Component(immediate = true, service = ILDoanhNghiepSyncScheduler.class)
public class ILDoanhNghiepSyncScheduler extends BaseSchedulerEntryMessageListener {
	@Override
	protected void doReceive(Message message) throws Exception {
		_log.info("Doanh nghiep sync is starting at  : "
				+ APIDateTimeUtils.convertDateToString(new Date()));
		long id = 0l;
		
		try {
			try {
				ILDoanhNghiep lastDn = ILDoanhNghiepLocalServiceUtil.getLastDoanhNghiep();
				if (lastDn != null) {
					id = lastDn.getId();
				}
			}
			catch (NoSuchILDoanhNghiepException e) {
				
			}
			DoanhNghiep dn = DoanhNghiepLocalServiceUtil.getFirstGreaterThanId(id);
			ILDoanhNghiep ilDn = ILDoanhNghiepLocalServiceUtil.fetchILDoanhNghiep(dn.getId());
			
			if (dn != null) {
				if (ilDn == null) {
					ILDoanhNghiepLocalServiceUtil.addDoanhNghiep(
							dn.getId(), 
							dn.getTen(), 
							dn.getTen_viettat(), 
							dn.getTen_tienganh(), 
							dn.getSogcn_dkkd(), 
							dn.getNgaycap_dkkd(), 
							dn.getNgayhethan_dkkd(), 
							dn.getTen_donvicapphep(), 
							dn.getMasothue(), 
							dn.getTen_nguoidaidien(), 
							dn.getChucvu_nguoidaidien(), 
							dn.getGioitinh_nguoidaidien(), 
							dn.getDiachi_nguoidaidien(), 
							dn.getDiachi_ndd_tinh_id(), 
							dn.getDiachi_ndd_huyen_id(), 
							dn.getDiachi_ndd_xa_id(), 
							dn.getHktt_nguoidaidien(), 
							dn.getDantoc_nguoidaidien_id(), 
							dn.getTongiao_nguoidaidien_id(), 
							dn.getQuoctich_nguoidaidien_id(), 
							dn.getNgaysinh_nguoidaidien(), 
							dn.getDienthoai_nguoidaidien(), 
							dn.getGiayto_canhan_nguoidaidien(), 
							dn.getGiayto_ngaycap_nguoidaidien(), 
							dn.getGiayto_noicap_nguoidaidien(), 
							dn.getLoai_doanhnghiep_id(), 
							dn.getDiachi_trusochinh(), 
							dn.getDiachi_truso_tinh_id(), 
							dn.getDiachi_truso_huyen_id(), 
							dn.getDiachi_truso_xa_id(), 
							dn.getDienthoai(), 
							dn.getFax(), 
							dn.getEmail(), 
							dn.getWebsite(), 
							dn.getVon_dieule(), 
							dn.getVon_phapdinh(), 
							dn.getUser_id(), 
							dn.getDoituongsudung_id(), 
							dn.getTrangthai(), 
							dn.getNgaytao(), 
							dn.getNgaycap_taikhoan());					
				}
			}
		}
		catch (NoSuchDoanhNghiepException e) {
			
		}
		
		_log.info("Doanh nghiep sync finished at  : " + APIDateTimeUtils.convertDateToString(new Date()));
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
	private PhuongTienLocalService _phuongTienLocalService;

	private Log _log = LogFactoryUtil.getLog(ILDoanhNghiepSyncScheduler.class);	
}