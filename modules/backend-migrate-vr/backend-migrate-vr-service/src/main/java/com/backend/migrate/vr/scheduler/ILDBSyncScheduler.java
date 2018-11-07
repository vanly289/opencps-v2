package com.backend.migrate.vr.scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.thirdparty.system.exception.NoSuchILPhuongTienException;
import org.opencps.thirdparty.system.model.ILDoanhNghiep;
import org.opencps.thirdparty.system.model.ILGiayPhepLienVan;
import org.opencps.thirdparty.system.model.ILGiayPhepVanTai;
import org.opencps.thirdparty.system.model.ILGiayPhepVanTaiQuocTe;
import org.opencps.thirdparty.system.model.ILHopDongThue;
import org.opencps.thirdparty.system.model.ILPhuHieuBienHieu;
import org.opencps.thirdparty.system.model.ILPhuongTien;
import org.opencps.thirdparty.system.model.ILViPham;
import org.opencps.thirdparty.system.model.impl.ILGiayPhepLienVanImpl;
import org.opencps.thirdparty.system.model.impl.ILGiayPhepVanTaiImpl;
import org.opencps.thirdparty.system.model.impl.ILGiayPhepVanTaiQuocTeImpl;
import org.opencps.thirdparty.system.model.impl.ILHopDongThueImpl;
import org.opencps.thirdparty.system.model.impl.ILPhuHieuBienHieuImpl;
import org.opencps.thirdparty.system.model.impl.ILPhuongTienImpl;
import org.opencps.thirdparty.system.model.impl.ILViPhamImpl;
import org.opencps.thirdparty.system.service.ILDoanhNghiepLocalServiceUtil;
import org.opencps.thirdparty.system.service.ILGiayPhepLienVanLocalServiceUtil;
import org.opencps.thirdparty.system.service.ILGiayPhepVanTaiLocalServiceUtil;
import org.opencps.thirdparty.system.service.ILGiayPhepVanTaiQuocTeLocalServiceUtil;
import org.opencps.thirdparty.system.service.ILHopDongThueLocalServiceUtil;
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
import com.backend.migrate.vr.model.SRCGiayPhepVanTai;
import com.backend.migrate.vr.model.SRCILHopDongThue;
import com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai;
import com.backend.migrate.vr.model.ViPham;
import com.backend.migrate.vr.service.DoanhNghiepLocalServiceUtil;
import com.backend.migrate.vr.service.PhuHieuBienHieuLocalServiceUtil;
import com.backend.migrate.vr.service.PhuongTienLocalService;
import com.backend.migrate.vr.service.PhuongTienLocalServiceUtil;
import com.backend.migrate.vr.service.SRCGiayPhepLienVanLocalServiceUtil;
import com.backend.migrate.vr.service.SRCGiayPhepVanTaiLocalServiceUtil;
import com.backend.migrate.vr.service.SRCILHopDongThueLocalServiceUtil;
import com.backend.migrate.vr.service.SRCPHBHGiayPhepVanTaiLocalServiceUtil;
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
		_log.info("DB SYNC IS STARTING AT  : " + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
		 
		syncGiayPhepLienVan();
		
		syncGiayPhepVanTai();
		
		syncPhBHGiayPhepVanTai();
		
		syncHopDongThue();
		
		syncPhuHieuBienHieu();
		
		syncPhuongTien();
		
		syncVipham();
		
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
			
			if (pt != null) {

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
	
	private void syncVipham() {
		
		ILViPham viPham = ILViPhamLocalServiceUtil.getLastest();
		
		if (Validator.isNotNull(viPham)) {
			
			List<ViPham> viphams = ViPhamLocalServiceUtil.getLastest(viPham.getId());
			
			_log.info("********* ROW NEED UPDATE - VIPHAM ** +++ ^-^" + viphams.size());

			for (ViPham src : viphams) {
				ILViPham elm = new ILViPhamImpl();
				
				elm.setId(src.getId());
				elm.setPhuongtien_id(src.getPhuongtien_id());
				elm.setNgayvipham(src.getNgayvipham());
				elm.setLoaivipham_id(src.getLoaivipham_id());
				elm.setMota(src.getMota());
				elm.setUrl_bienban(src.getUrl_bienban());
				
				ILViPhamLocalServiceUtil.addILViPham(elm);
			}
		}
	}	
	
	private void syncPhuongTien() {
		
		ILPhuongTien phuongtien = ILPhuongTienLocalServiceUtil.getLastest();
		
		if (Validator.isNotNull(phuongtien)) {
			
			List<PhuongTien> phuongtiens = PhuongTienLocalServiceUtil.getListGreaterThanId(phuongtien.getId());
			
			
			_log.info("********* ROW NEED UPDATE - PHUONG TIEN ** +++ ^-^" + phuongtiens.size());

			for (PhuongTien src : phuongtiens) {
				ILPhuongTien elm = new ILPhuongTienImpl();
				
				elm.setId(src.getId());
				elm.setCoquanquanly_id(src.getCoquanquanly_id());
				elm.setDoanhnghiep_id(src.getDoanhnghiep_id());
				elm.setBienkiemsoat(src.getBienkiemsoat());
				elm.setSucchua(src.getSucchua());
				elm.setLoaighe_id(src.getLoaighe_id());
				elm.setNamsanxuat(src.getNamsanxuat());
				elm.setNuocsanxuat_id(src.getNuocsanxuat_id());
				elm.setTenhieuxe_id(src.getTenhieuxe_id());
				elm.setMauson_id(src.getMauson_id());
				elm.setSokhung(src.getSokhung());
				elm.setSomay(src.getSomay());
				elm.setNamhetnienhansudung(src.getNamhetnienhansudung());
				elm.setNamcaitao(src.getNamcaitao());
				elm.setTrongtai(src.getTrongtai());
				elm.setLoaihinhvantai_id(src.getLoaihinhvantai_id());
				elm.setLa_xegiuongnam(src.getLa_xegiuongnam());
				elm.setSogiuongnam(src.getSogiuongnam());
				elm.setTennguoisohuu(src.getTennguoisohuu());
				elm.setDoanhnghiep_id(src.getDoanhnghiep_id());
				elm.setTuyenkhaithac_id(src.getTuyenkhaithac_id());
				elm.setWeb_giamsathanhtrinh(src.getWeb_giamsathanhtrinh());
				elm.setTendangnhap_gsht(src.getTendangnhap_gsht());
				elm.setMatkhau_gsht(src.getMatkhau_gsht());
				elm.setCongdan_id(src.getCongdan_id());
				elm.setGhichu(src.getGhichu());
				elm.setTrangthai(src.getTrangthai());
				
				ILPhuongTienLocalServiceUtil.addILPhuongTien(elm);
			}
		}
	}	
	
	
	
	
	private void syncPhBHGiayPhepVanTai() {
		
		ILGiayPhepVanTai giayPhepVanTai = ILGiayPhepVanTaiLocalServiceUtil.getLastest();
		
		if (Validator.isNotNull(giayPhepVanTai)) {
			
			List<SRCPHBHGiayPhepVanTai> giayPhepVanTais = SRCPHBHGiayPhepVanTaiLocalServiceUtil.getLastest(giayPhepVanTai.getId());
			
			
			_log.info("********* ROW NEED UPDATE - PHBH GPVT ** +++ ^-^" + giayPhepVanTais.size());

			for (SRCPHBHGiayPhepVanTai src : giayPhepVanTais) {
				ILGiayPhepVanTai elm = new ILGiayPhepVanTaiImpl();
				
				elm.setId(src.getId());
				elm.setCoquanquanly_id(src.getCoquanquanly_id());
				elm.setDoanhnghiep_id(src.getDoanhnghiep_id());
				
				elm.setSogiayphep(src.getSogiayphep());
				elm.setLancapphep(src.getLancapphep());
				elm.setNgaycap(src.getNgaycap());
				elm.setNguoicap(src.getNguoicap());
				elm.setNgayhethan(src.getNgayhethan());
				elm.setNguoidieuhanh(src.getNguoidieuhanh());
				elm.setBangcap(src.getBangcap());
				elm.setNgaysinh(src.getNgaysinh());
				elm.setSocmnd(src.getSocmnd());
				elm.setNguoiky(src.getNguoiky());
				elm.setNguoiky_id(src.getNguoiky_id());
				elm.setNgayky(src.getNgayky());
				elm.setNgay_thuhoi(src.getNgay_thuhoi());
				elm.setLydo_thuhoi(src.getLydo_thuhoi());
				elm.setGhichu(src.getGhichu());
				elm.setTrangthai(src.getTrangthai());
				
				ILGiayPhepVanTaiLocalServiceUtil.addILGiayPhepVanTai(elm);
			}
		}
	}	
	
	private void syncPhuHieuBienHieu() {
		
		ILPhuHieuBienHieu bienHieu = ILPhuHieuBienHieuLocalServiceUtil.getLastest();
		

		if (Validator.isNotNull(bienHieu)) {
			
			List<PhuHieuBienHieu> phuHieuBienHieus = PhuHieuBienHieuLocalServiceUtil.getLastest(bienHieu.getId());
			
			
			_log.info("********* ROW NEED UPDATE - PHU HIEU BIEN HIEU ** +++ ^-^" + phuHieuBienHieus.size());

			for (PhuHieuBienHieu src : phuHieuBienHieus) {
				ILPhuHieuBienHieu elm = new ILPhuHieuBienHieuImpl();
				
				elm.setId(src.getId());
				elm.setSophuhieu(src.getSophuhieu());
				elm.setPhuongtien_id(src.getPhuongtien_id());
				elm.setLoaihinh_id(src.getLoaihinh_id());
				elm.setTuyenkhaithac_id(src.getTuyenkhaithac_id());
				elm.setPhamvi_id(src.getPhamvi_id());
				elm.setLoai(src.getLoai());
				elm.setNgaycap(src.getNgaycap());
				elm.setNgayhethan(src.getNgayhethan());
				elm.setNgaythuhoi(src.getNgaythuhoi());
				elm.setLydo_thuhoi(src.getLydo_thuhoi());
				elm.setNguoitao(src.getNguoitao());
				elm.setNgaytao(src.getNgaytao());
				elm.setNguoiky(src.getNguoiky());
				elm.setNguoiky_id(src.getNguoiky_id());
				elm.setNgayky(src.getNgayky());
				elm.setGhichu(src.getGhichu());
				elm.setTrangthai(src.getTrangthai());
				
				ILPhuHieuBienHieuLocalServiceUtil.addILPhuHieuBienHieu(elm);
				
			}
		}
	}
	
	
	private void syncHopDongThue() {
		
		ILHopDongThue hopDongThue = ILHopDongThueLocalServiceUtil.getLastest();

		if (Validator.isNotNull(hopDongThue)) {
			
			List<SRCILHopDongThue> hopDongThues = SRCILHopDongThueLocalServiceUtil.getLastest(hopDongThue.getId());
			
			_log.info("********* ROW NEED UPDATE - HOP DONG THUE ** +++ ^-^" + hopDongThues.size());

			for (SRCILHopDongThue src : hopDongThues) {
				ILHopDongThue elm = new ILHopDongThueImpl();
				elm.setId(src.getId());
				elm.setPhuongtien_id(src.getPhuongtien_id());
				elm.setLoaihinhthue_id(src.getLoaihinhthue_id());
				elm.setTendoituongchothue(src.getTendoituongchothue());
				elm.setDiachi_doituong_tinh_id(src.getDiachi_doituong_tinh_id());
				elm.setDiachi_doituong_huyen_id(src.getDiachi_doituong_huyen_id());
				elm.setDiachi_doituong_xa_id(src.getDiachi_doituong_xa_id());
				elm.setDiachi_doituong_chitiet(src.getDiachi_doituong_chitiet());
				elm.setNgayky(src.getNgayky());
				elm.setThoihan(src.getThoihan());
				elm.setLa_hopdongcuoi(src.getLa_hopdongcuoi());
				elm.setGhichu(src.getGhichu());
				elm.setTrangthai(src.getTrangthai());
				
				ILHopDongThueLocalServiceUtil.addILHopDongThue(elm);
				
			}
		}
	}
	
	
	private void syncGiayPhepVanTai() {
		
		ILGiayPhepVanTaiQuocTe giayPhepVanTai = ILGiayPhepVanTaiQuocTeLocalServiceUtil.getLastest();
		
		if (Validator.isNotNull(giayPhepVanTai)) {
			List<SRCGiayPhepVanTai> giayPhepVanTais = SRCGiayPhepVanTaiLocalServiceUtil.getLastest(giayPhepVanTai.getId());
			
			_log.info("********* ROW NEED UPDATE - GPVT ** +++ ^-^" + giayPhepVanTais.size());

			for (SRCGiayPhepVanTai src : giayPhepVanTais) {
				ILGiayPhepVanTaiQuocTe elm = new ILGiayPhepVanTaiQuocTeImpl();
				
				elm.setId(src.getId());
				elm.setCoquanquanly_id(src.getCoquanquanly_id());
				elm.setTen_coquancapphep(src.getTen_coquancapphep());
				elm.setDoanhnghiep_id(src.getDoanhnghiep_id());
				elm.setTen_doanhnghiep(src.getTen_doanhnghiep());
				elm.setDiachi_doanhnghiep(src.getDiachi_doanhnghiep());
				elm.setDienthoai_doanhnghiep(src.getDienthoai_doanhnghiep());
				elm.setFax_doanhnghiep(src.getFax_doanhnghiep());
				elm.setEmail_doanhnghiep(src.getEmail_doanhnghiep());
				elm.setWebsite_doanhnghiep(src.getWebsite_doanhnghiep());
				elm.setNgay_ky(src.getNgay_ky());
				elm.setTen_nguoiky(src.getTen_nguoiky());
				elm.setNguoi_ky_id(src.getNguoi_ky_id());
				elm.setUrl_file_gpvt(src.getUrl_file_gpvt());
				
				elm.setSogiayphep(src.getSogiayphep());
				elm.setLancapphep(src.getLancapphep());
				elm.setNgaycap(src.getNgaycap());
				elm.setNguoicap(src.getNguoicap());
				elm.setNgayhethan(src.getNgayhethan());
				elm.setNgay_thuhoi(src.getNgay_thuhoi());
				elm.setLydo_thuhoi(src.getLydo_thuhoi());
				elm.setGhichu(src.getGhichu());
				elm.setTrangthai(src.getTrangthai());
				elm.setQuocgia_id(src.getQuocgia_id());
				
				ILGiayPhepVanTaiQuocTeLocalServiceUtil.addILGiayPhepVanTaiQuocTe(elm);
			}

		}
		

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