/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.thirdparty.system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.opencps.thirdparty.system.exception.NoSuchILDoanhNghiepException;
import org.opencps.thirdparty.system.model.ILDoanhNghiep;
import org.opencps.thirdparty.system.model.impl.ILDoanhNghiepImpl;
import org.opencps.thirdparty.system.service.ILDoanhNghiepLocalServiceUtil;
import org.opencps.thirdparty.system.service.base.ILDoanhNghiepLocalServiceBaseImpl;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the il doanh nghiep local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.opencps.thirdparty.system.service.ILDoanhNghiepLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see ILDoanhNghiepLocalServiceBaseImpl
 * @see org.opencps.thirdparty.system.service.ILDoanhNghiepLocalServiceUtil
 */
@ProviderType
public class ILDoanhNghiepLocalServiceImpl extends ILDoanhNghiepLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * org.opencps.thirdparty.system.service.ILDoanhNghiepLocalServiceUtil} to
	 * access the il doanh nghiep local service.
	 */
	
	public ILDoanhNghiep capNhatDoanhNghiep(String ten, String sogcnDkkd, Date ngayCap, String donviCapPhep,
			String diaChi, String dienThoai, String fax, String email) {
		
		ILDoanhNghiep doanhNghiep = ilDoanhNghiepPersistence.fetchBySCNDKKD(sogcnDkkd);
		
		if (Validator.isNull(doanhNghiep)) {
			doanhNghiep = ilDoanhNghiepPersistence.create(CounterLocalServiceUtil.increment(ILDoanhNghiep.class.getName()));
		} 
		
		doanhNghiep.setTen(ten);
		doanhNghiep.setSogcn_dkkd(sogcnDkkd);
		doanhNghiep.setNgaycap_dkkd(ngayCap);
		doanhNghiep.setTen_donvicapphep(donviCapPhep);
		doanhNghiep.setDiachi_trusochinh(diaChi);
		doanhNghiep.setDienthoai(dienThoai);
		doanhNghiep.setFax(fax);
		doanhNghiep.setEmail(email);
		
		return ilDoanhNghiepPersistence.update(doanhNghiep);
		
	}

	public ILDoanhNghiep addDoanhNghiep(long id, String ten, String ten_viettat, String ten_tienganh, String sogcn_dkkd,
			Date ngaycap_dkkd, Date ngayhethan_dkkd, String ten_donvicapphep, String masothue, String ten_nguoidaidien,
			String chucvu_nguoidaidien, long gioitinh_nguoidaidien, String diachi_nguoidaidien, long diachi_ndd_tinh_id,
			long diachi_ndd_huyen_id, long diachi_ndd_xa_id, String hktt_nguoidaidien, long dantoc_nguoidaidien_id,
			long tongiao_nguoidaidien_id, long quoctich_nguoidaidien_id, Date ngaysinh_nguoidaidien,
			String dienthoai_nguoidaidien, String giayto_canhan_nguoidaidien, Date giayto_ngaycap_nguoidaidien,
			String giayto_noicap_nguoidaidien, long loaidoanhnghiep_id, String diachi_trusochinh,
			long diachi_truso_tinh_id, long diachi_truso_huyen_id, long diachi_truso_xa_id, String dienthoai,
			String fax, String email, String website, String von_dieule, String von_phapdinh, long user_id,
			long doituongsudung_id, int trangthai, Date ngaytao, Date ngaycap_taikhoan) {
		ILDoanhNghiep dn = ilDoanhNghiepPersistence.create(id);
		dn.setTen(ten);
		dn.setTen_viettat(ten_viettat);
		dn.setTen_tienganh(ten_tienganh);
		dn.setSogcn_dkkd(sogcn_dkkd);
		dn.setNgaycap_dkkd(ngaycap_dkkd);
		dn.setNgayhethan_dkkd(ngayhethan_dkkd);
		dn.setTen_donvicapphep(ten_donvicapphep);
		dn.setMasothue(masothue);
		dn.setTen_nguoidaidien(ten_nguoidaidien);
		dn.setChucvu_nguoidaidien(chucvu_nguoidaidien);
		dn.setGioitinh_nguoidaidien(gioitinh_nguoidaidien);
		dn.setDiachi_nguoidaidien(diachi_nguoidaidien);
		dn.setDiachi_ndd_tinh_id(diachi_ndd_tinh_id);
		dn.setDiachi_ndd_huyen_id(diachi_ndd_huyen_id);
		dn.setDiachi_ndd_xa_id(diachi_ndd_xa_id);
		dn.setHktt_nguoidaidien(hktt_nguoidaidien);
		dn.setDantoc_nguoidaidien_id(dantoc_nguoidaidien_id);
		dn.setTongiao_nguoidaidien_id(tongiao_nguoidaidien_id);
		dn.setQuoctich_nguoidaidien_id(quoctich_nguoidaidien_id);
		dn.setNgaysinh_nguoidaidien(ngaysinh_nguoidaidien);
		dn.setDienthoai_nguoidaidien(dienthoai_nguoidaidien);
		dn.setGiayto_canhan_nguoidaidien(giayto_canhan_nguoidaidien);
		dn.setGiayto_ngaycap_nguoidaidien(giayto_ngaycap_nguoidaidien);
		dn.setGiayto_noicap_nguoidaidien(giayto_noicap_nguoidaidien);
		dn.setLoai_doanhnghiep_id(loaidoanhnghiep_id);
		dn.setDiachi_trusochinh(diachi_trusochinh);
		dn.setDiachi_truso_tinh_id(diachi_truso_tinh_id);
		dn.setDiachi_truso_huyen_id(diachi_truso_huyen_id);
		dn.setDiachi_truso_xa_id(diachi_truso_xa_id);
		dn.setDienthoai(dienthoai);
		dn.setFax(fax);
		dn.setEmail(email);
		dn.setWebsite(website);
		dn.setVon_dieule(von_dieule);
		dn.setVon_phapdinh(von_phapdinh);
		dn.setUser_id(user_id);
		dn.setDoituongsudung_id(doituongsudung_id);
		dn.setTrangthai(trangthai);
		dn.setNgaytao(ngaytao);
		dn.setNgaycap_taikhoan(ngaycap_taikhoan);

		return ilDoanhNghiepPersistence.update(dn);
	}
	
	
	

	public ILDoanhNghiep updateDoanhNghiep(String applicationNo, long id, String ten, String ten_viettat, String ten_tienganh, String sogcn_dkkd,
			Date ngaycap_dkkd, Date ngayhethan_dkkd, String ten_donvicapphep, String masothue, String ten_nguoidaidien,
			String chucvu_nguoidaidien, long gioitinh_nguoidaidien, String diachi_nguoidaidien, long diachi_ndd_tinh_id,
			long diachi_ndd_huyen_id, long diachi_ndd_xa_id, String hktt_nguoidaidien, long dantoc_nguoidaidien_id,
			long tongiao_nguoidaidien_id, long quoctich_nguoidaidien_id, Date ngaysinh_nguoidaidien,
			String dienthoai_nguoidaidien, String giayto_canhan_nguoidaidien, Date giayto_ngaycap_nguoidaidien,
			String giayto_noicap_nguoidaidien, long loaidoanhnghiep_id, String diachi_trusochinh,
			long diachi_truso_tinh_id, long diachi_truso_huyen_id, long diachi_truso_xa_id, String dienthoai,
			String fax, String email, String website, String von_dieule, String von_phapdinh, long user_id,
			long doituongsudung_id, int trangthai, Date ngaytao, Date ngaycap_taikhoan) {
		
		ILDoanhNghiep dn = ilDoanhNghiepPersistence.fetchByAPP_NO(applicationNo);
		
		if (Validator.isNull(applicationNo)) {
			dn = ilDoanhNghiepPersistence.create(CounterLocalServiceUtil.increment(ILDoanhNghiep.class.getName()));
			dn.setApplicationNo(applicationNo);
		} 
		
		dn.setTen(ten);
		dn.setTen_viettat(ten_viettat);
		dn.setTen_tienganh(ten_tienganh);
		dn.setSogcn_dkkd(sogcn_dkkd);
		dn.setNgaycap_dkkd(ngaycap_dkkd);
		dn.setNgayhethan_dkkd(ngayhethan_dkkd);
		dn.setTen_donvicapphep(ten_donvicapphep);
		dn.setMasothue(masothue);
		dn.setTen_nguoidaidien(ten_nguoidaidien);
		dn.setChucvu_nguoidaidien(chucvu_nguoidaidien);
		dn.setGioitinh_nguoidaidien(gioitinh_nguoidaidien);
		dn.setDiachi_nguoidaidien(diachi_nguoidaidien);
		dn.setDiachi_ndd_tinh_id(diachi_ndd_tinh_id);
		dn.setDiachi_ndd_huyen_id(diachi_ndd_huyen_id);
		dn.setDiachi_ndd_xa_id(diachi_ndd_xa_id);
		dn.setHktt_nguoidaidien(hktt_nguoidaidien);
		dn.setDantoc_nguoidaidien_id(dantoc_nguoidaidien_id);
		dn.setTongiao_nguoidaidien_id(tongiao_nguoidaidien_id);
		dn.setQuoctich_nguoidaidien_id(quoctich_nguoidaidien_id);
		dn.setNgaysinh_nguoidaidien(ngaysinh_nguoidaidien);
		dn.setDienthoai_nguoidaidien(dienthoai_nguoidaidien);
		dn.setGiayto_canhan_nguoidaidien(giayto_canhan_nguoidaidien);
		dn.setGiayto_ngaycap_nguoidaidien(giayto_ngaycap_nguoidaidien);
		dn.setGiayto_noicap_nguoidaidien(giayto_noicap_nguoidaidien);
		dn.setLoai_doanhnghiep_id(loaidoanhnghiep_id);
		dn.setDiachi_trusochinh(diachi_trusochinh);
		dn.setDiachi_truso_tinh_id(diachi_truso_tinh_id);
		dn.setDiachi_truso_huyen_id(diachi_truso_huyen_id);
		dn.setDiachi_truso_xa_id(diachi_truso_xa_id);
		dn.setDienthoai(dienthoai);
		dn.setFax(fax);
		dn.setEmail(email);
		dn.setWebsite(website);
		dn.setVon_dieule(von_dieule);
		dn.setVon_phapdinh(von_phapdinh);
		dn.setUser_id(user_id);
		dn.setDoituongsudung_id(doituongsudung_id);
		dn.setTrangthai(trangthai);
		dn.setNgaytao(ngaytao);
		dn.setNgaycap_taikhoan(ngaycap_taikhoan);

		return ilDoanhNghiepPersistence.update(dn);
	}
	
	

	public ILDoanhNghiep getLastDoanhNghiep() throws NoSuchILDoanhNghiepException {
		return ilDoanhNghiepPersistence.findByGT_ID_Last(0l, null);
	}

	public List<ILDoanhNghiep> findByKeyword(String keyword, int start, int end) {
		
		if (Validator.isNotNull(keyword)) { 
			return ilDoanhNghiepFinder.searchDoanhNghiep(keyword, start, end);
		} else {
			return ilDoanhNghiepPersistence.findAll(start, end);
		}

	}

	public long countByKeyword(String keyword) {

		if (Validator.isNotNull(keyword)) { 
			return ilDoanhNghiepFinder.searchDoanhNghiep(keyword, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
		} else {
			return ilDoanhNghiepPersistence.countAll();
		}
	}
}