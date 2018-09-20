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

import com.backend.migrate.vr.exception.NoSuchILPhuongTienException;
import com.backend.migrate.vr.model.ILPhuongTien;
import com.backend.migrate.vr.service.base.ILPhuongTienLocalServiceBaseImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the il phuong tien local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.backend.migrate.vr.service.ILPhuongTienLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ILPhuongTienLocalServiceBaseImpl
 * @see com.backend.migrate.vr.service.ILPhuongTienLocalServiceUtil
 */
@ProviderType
public class ILPhuongTienLocalServiceImpl
	extends ILPhuongTienLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.backend.migrate.vr.service.ILPhuongTienLocalServiceUtil} to access the il phuong tien local service.
	 */
	
	public ILPhuongTien addPhuongTien(
			long id,
			String bienkiemsoat,
			int succhua,
			long loaighe_id,
			int namsanxuat,
			long nuocsanxuat_id,
			long tenhieuxe_id,
			long mauson_id,
			String sokhung,
			String somay,
			int namhetnienhansudung,
			Date namcaitao,
			int trongtai,
			int loaihinhvantai_id,
			int la_xegiuongnam,
			int sogiuongnam,
			String tennguoisohuu,
			int doanhnghiep_id,
			int tuyenkhaithac_id,
			String web_giamsathanhtrinh,
			String tendangnhap_gsht,
			String ghichu,
			int trangthai,
			int coquanquanly_id,
			long congdan_id
			) {
			ILPhuongTien phuongTien = ilPhuongTienPersistence.create(id);
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
			
			return ilPhuongTienPersistence.update(phuongTien);
		}
		
		public ILPhuongTien getLastPhuongTien() throws NoSuchILPhuongTienException {
			return ilPhuongTienPersistence.findByGT_ID_Last(0l, null);
		}
		
		public ILPhuongTien deletePhuongTien(long id) throws NoSuchILPhuongTienException {
			return ilPhuongTienPersistence.remove(id);
		}	
}