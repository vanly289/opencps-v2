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

package com.backend.migrate.vr.service.impl;

import java.util.Date;
import java.util.List;

import com.backend.migrate.vr.exception.NoSuchPhuongTienException;
import com.backend.migrate.vr.model.PhuongTien;
import com.backend.migrate.vr.service.base.PhuongTienLocalServiceBaseImpl;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the phuong tien local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.backend.migrate.vr.service.PhuongTienLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PhuongTienLocalServiceBaseImpl
 * @see com.backend.migrate.vr.service.PhuongTienLocalServiceUtil
 */
@ProviderType
public class PhuongTienLocalServiceImpl extends PhuongTienLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.backend.migrate.vr.service.PhuongTienLocalServiceUtil} to access the
	 * phuong tien local service.
	 */
	public PhuongTien addPhuongTien(long id, String bienkiemsoat, int succhua, long loaighe_id, int namsanxuat,
			long nuocsanxuat_id, long tenhieuxe_id, long mauson_id, String sokhung, String somay,
			int namhetnienhansudung, Date namcaitao, int trongtai, int loaihinhvantai_id, int la_xegiuongnam,
			int sogiuongnam, String tennguoisohuu, int doanhnghiep_id, int tuyenkhaithac_id,
			String web_giamsathanhtrinh, String tendangnhap_gsht, String ghichu, int trangthai, int coquanquanly_id,
			long congdan_id) {
		PhuongTien phuongTien = phuongTienPersistence.create(id);
		phuongTien.setBienkiemsoat(bienkiemsoat);
		phuongTien.setSucchua(succhua);
		phuongTien.setLoaighe_id(loaighe_id);
		phuongTien.setNamsanxuat(namsanxuat);
		phuongTien.setNuocsanxuat_id(nuocsanxuat_id);
		phuongTien.setTenhieuxe_id(tenhieuxe_id);
		phuongTien.setMauson_id(mauson_id);
		phuongTien.setSokhung(sokhung);
		phuongTien.setSomay(somay);
		phuongTien.setNamhetnienhansudung(namhetnienhansudung);
		phuongTien.setNamcaitao(namcaitao);
		phuongTien.setTrongtai(trongtai);
		phuongTien.setTrongtai(trongtai);
		phuongTien.setLoaihinhvantai_id(loaihinhvantai_id);
		phuongTien.setLa_xegiuongnam(la_xegiuongnam);
		phuongTien.setSogiuongnam(sogiuongnam);
		phuongTien.setTennguoisohuu(tennguoisohuu);
		phuongTien.setDoanhnghiep_id(doanhnghiep_id);
		phuongTien.setTuyenkhaithac_id(tuyenkhaithac_id);
		phuongTien.setWeb_giamsathanhtrinh(web_giamsathanhtrinh);
		phuongTien.setTendangnhap_gsht(tendangnhap_gsht);
		phuongTien.setGhichu(ghichu);
		phuongTien.setTrangthai(trangthai);
		phuongTien.setCoquanquanly_id(coquanquanly_id);
		phuongTien.setCongdan_id(congdan_id);

		return phuongTienPersistence.update(phuongTien);
	}

	public PhuongTien deletePhuongTien(long id) throws NoSuchPhuongTienException {
		return phuongTienPersistence.remove(id);
	}

	public List<PhuongTien> getListGreaterThanId(long id) {
		return phuongTienPersistence.findByGT_ID(id);
	}

	public PhuongTien getFirstGreaterThanId(long id) throws NoSuchPhuongTienException {
		return phuongTienPersistence.findByGT_ID_First(id, null);
	}
	
	public long countAll() {
		return phuongTienPersistence.countAll();
	}

	public PhuongTien findByBKS(String bienkiemsoat) {
		return phuongTienPersistence.fetchByBKS(bienkiemsoat);
	}
}