package com.backend.migrate.vr.scheduler;

import java.util.Date;
import java.util.List;

import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.thirdparty.system.exception.NoSuchILPhuongTienException;
import org.opencps.thirdparty.system.model.ILDoanhNghiep;
import org.opencps.thirdparty.system.model.ILGiayPhepLienVan;
import org.opencps.thirdparty.system.model.ILPhuHieuBienHieu;
import org.opencps.thirdparty.system.model.ILPhuongTien;
import org.opencps.thirdparty.system.model.ILViPham;
import org.opencps.thirdparty.system.model.impl.ILGiayPhepLienVanImpl;
import org.opencps.thirdparty.system.service.ILDoanhNghiepLocalServiceUtil;
import org.opencps.thirdparty.system.service.ILGiayPhepLienVanLocalServiceUtil;
import org.opencps.thirdparty.system.service.ILPhuHieuBienHieuLocalServiceUtil;
import org.opencps.thirdparty.system.service.ILPhuongTienLocalServiceUtil;
import org.opencps.thirdparty.system.service.ILViPhamLocalServiceUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.backend.migrate.vr.exception.NoSuchPhuongTienException;
import com.backend.migrate.vr.model.DoanhNghiep;
import com.backend.migrate.vr.model.PhuHieuBienHieu;
import com.backend.migrate.vr.model.PhuongTien;
import com.backend.migrate.vr.model.SRCGiayPhepLienVan;
import com.backend.migrate.vr.model.ViPham;
import com.backend.migrate.vr.service.DoanhNghiepLocalServiceUtil;
import com.backend.migrate.vr.service.PhuHieuBienHieuLocalServiceUtil;
import com.backend.migrate.vr.service.PhuongTienLocalService;
import com.backend.migrate.vr.service.PhuongTienLocalServiceUtil;
import com.backend.migrate.vr.service.SRCGiayPhepLienVanLocalServiceUtil;
import com.backend.migrate.vr.service.ViPhamLocalServiceUtil;
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
import com.liferay.portal.kernel.util.Validator;

@Component(immediate = true, service = ILDBSyncScheduler.class)
public class ILDBSyncScheduler extends BaseSchedulerEntryMessageListener {
	@Override
	protected void doReceive(Message message) throws Exception {
		 
		syncGiayPhepLienVan();

		_log.info("DB sync is starting at  : "
				+ APIDateTimeUtils.convertDateToString(new Date()));
		long id = 0l;
		
		try {
			try {
				ILPhuongTien lastPt = ILPhuongTienLocalServiceUtil.getLastPhuongTien();
				if (lastPt != null) {
					id = lastPt.getId();
				}
			}
			catch (NoSuchILPhuongTienException e) {
				
			}
			PhuongTien pt = PhuongTienLocalServiceUtil.getFirstGreaterThanId(id);
			ILPhuongTien ilPt = ILPhuongTienLocalServiceUtil.fetchILPhuongTien(pt.getId());
			
			if (pt != null) {
				List<ViPham> lstViphams = ViPhamLocalServiceUtil.getListByPhuongTien(pt.getId());
				if (ilPt == null) {
					ILPhuongTienLocalServiceUtil.addPhuongTien(pt.getId(), 
							pt.getBienkiemsoat(), 
							pt.getSucchua(), 
							pt.getLoaighe_id(), 
							pt.getNamsanxuat(), 
							pt.getNuocsanxuat_id(), 
							pt.getTenhieuxe_id(), 
							pt.getMauson_id(), 
							pt.getSokhung(), 
							pt.getSomay(), 
							pt.getNamhetnienhansudung(), 
							pt.getNamcaitao(), 
							pt.getTrongtai(), 
							pt.getLoaihinhvantai_id(), 
							pt.getLa_xegiuongnam(), 
							pt.getSogiuongnam(), 
							pt.getTennguoisohuu(), 
							pt.getDoanhnghiep_id(), 
							pt.getTuyenkhaithac_id(), 
							pt.getWeb_giamsathanhtrinh(), 
							pt.getTendangnhap_gsht(), 
							pt.getGhichu(), 
							pt.getTrangthai(), 
							pt.getCoquanquanly_id(), 
							pt.getCongdan_id());
				}
				for (ViPham vp : lstViphams) {
					ILViPham ilVp = ILViPhamLocalServiceUtil.fetchILViPham(vp.getId());
					if (ilVp == null) {
						ILViPhamLocalServiceUtil.addViPham(vp.getId(), vp.getPhuongtien_id(), vp.getNgayvipham(), vp.getLoaivipham_id(), vp.getMota(), vp.getUrl_bienban());
					}
				}
				
				List<PhuHieuBienHieu> lstPhbhs = PhuHieuBienHieuLocalServiceUtil.getListByPhuongTien(pt.getId());
				for (PhuHieuBienHieu phbh : lstPhbhs) {
					ILPhuHieuBienHieu ilPhbh = ILPhuHieuBienHieuLocalServiceUtil.fetchILPhuHieuBienHieu(phbh.getId());
					if (ilPhbh != null) {
						ILPhuHieuBienHieuLocalServiceUtil.addPhuHieuBienHieu(
								phbh.getId(), 
								phbh.getSophuhieu(), 
								phbh.getPhuongtien_id(), 
								phbh.getLoaihinh_id(), 
								phbh.getTuyenkhaithac_id(), 
								phbh.getPhamvi_id(), 
								phbh.getLoai(), 
								phbh.getNgaycap(), 
								phbh.getNgayhethan(), 
								phbh.getNgaythuhoi(), 
								phbh.getLydo_thuhoi(), 
								phbh.getNguoitao(),
								phbh.getNgaytao(), 
								phbh.getNguoiky(), 
								phbh.getNguoiky_id(), 
								phbh.getNgayky(), 
								phbh.getGhichu(), 
								phbh.getTrangthai(), 
								phbh.getCoquanquanly_id(), 
								phbh.getLabienhieu());
					}
				}
				
				DoanhNghiep dn = DoanhNghiepLocalServiceUtil.fetchDoanhNghiep(pt.getDoanhnghiep_id());
				
				ILDoanhNghiep ilDn = ILDoanhNghiepLocalServiceUtil.fetchILDoanhNghiep(dn != null ? dn.getId() : 0l);
				
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
		catch (NoSuchPhuongTienException e) {
			
		}
		
		_log.info("DB sync finished at  : " + APIDateTimeUtils.convertDateToString(new Date()));
	}
	
	private void syncGiayPhepLienVan() {
		ILGiayPhepLienVan giayPhepLienVan = ILGiayPhepLienVanLocalServiceUtil.getLastest();
		
		if (Validator.isNotNull(giayPhepLienVan)) {
			
			List<SRCGiayPhepLienVan> giayPhepLienVans = SRCGiayPhepLienVanLocalServiceUtil.getLastest(giayPhepLienVan.getId());
			
			_log.info("********* ROW NEED UPDATE ** +++ ^-^" + giayPhepLienVans.size());
			
			for (SRCGiayPhepLienVan src : giayPhepLienVans) {
				ILGiayPhepLienVan elmGiayPhepLienVan = new ILGiayPhepLienVanImpl();
				
				elmGiayPhepLienVan.setId(src.getId());
				elmGiayPhepLienVan.setSo_phuhieu_lienvan(src.getSo_phuhieu_lienvan());
				elmGiayPhepLienVan.setLancapphep(src.getLancapphep());
				elmGiayPhepLienVan.setPhuongtien_id(src.getPhuongtien_id());
				elmGiayPhepLienVan.setBienkiemsoat(src.getBienkiemsoat());
				elmGiayPhepLienVan.setSucchua(src.getSucchua());
				elmGiayPhepLienVan.setNamsanxuat(src.getNamsanxuat());
				elmGiayPhepLienVan.setNhanhieu_id(src.getNhanhieu_id());
				elmGiayPhepLienVan.setSokhung(src.getSokhung());
				elmGiayPhepLienVan.setSomay(src.getSomay());
				elmGiayPhepLienVan.setMauson_id(src.getMauson_id());
				elmGiayPhepLienVan.setLoaihinh_id(src.getLoaihinh_id());
				elmGiayPhepLienVan.setCuakhau_id(src.getCuakhau_id());
				elmGiayPhepLienVan.setDenghi_capden(src.getDenghi_capden());
				elmGiayPhepLienVan.setDenghi_captu(src.getDenghi_captu());
				elmGiayPhepLienVan.setNgaycap(src.getNgaycap());
				elmGiayPhepLienVan.setNguoicap(src.getNguoicap());
				elmGiayPhepLienVan.setNgayhethan(src.getNgayhethan());
				elmGiayPhepLienVan.setNgaythuhoi(src.getNgaythuhoi());
				elmGiayPhepLienVan.setLydo_thuhoi(src.getLydo_thuhoi());
				elmGiayPhepLienVan.setNgayky(src.getNgayky());
				elmGiayPhepLienVan.setNguoi_ky_id(src.getNguoi_ky_id());
				elmGiayPhepLienVan.setNguoiky(src.getNguoiky());
				elmGiayPhepLienVan.setGhichu(src.getGhichu());
				elmGiayPhepLienVan.setUrl_file_gplv(src.getUrl_file_gplv());
				//elmGiayPhepLienVan.setTrangthai(src.getTrangthai());
				elmGiayPhepLienVan.setQuocgia_id(src.getQuocgia_id());
				elmGiayPhepLienVan.setTuyen_id(src.getQuocgia_id());
				elmGiayPhepLienVan.setCoquanquanly_id(src.getCoquanquanly_id());

				ILGiayPhepLienVanLocalServiceUtil.addILGiayPhepLienVan(elmGiayPhepLienVan);
			}
		}
		

	}
	
	@Activate
	@Modified
	protected void activate() {
		schedulerEntryImpl.setTrigger(TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(),
				15, TimeUnit.SECOND));
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

	private Log _log = LogFactoryUtil.getLog(ILDBSyncScheduler.class);	
}