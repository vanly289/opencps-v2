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

import aQute.bnd.annotation.ProviderType;

import java.util.Date;
import java.util.List;

import org.opencps.thirdparty.system.model.ILPhuHieuBienHieu;
import org.opencps.thirdparty.system.service.base.ILPhuHieuBienHieuLocalServiceBaseImpl;

/**
 * The implementation of the il phu hieu bien hieu local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.thirdparty.system.service.ILPhuHieuBienHieuLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see ILPhuHieuBienHieuLocalServiceBaseImpl
 * @see org.opencps.thirdparty.system.service.ILPhuHieuBienHieuLocalServiceUtil
 */
@ProviderType
public class ILPhuHieuBienHieuLocalServiceImpl
	extends ILPhuHieuBienHieuLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.opencps.thirdparty.system.service.ILPhuHieuBienHieuLocalServiceUtil} to access the il phu hieu bien hieu local service.
	 */
	
	public ILPhuHieuBienHieu addPhuHieuBienHieu(
			long id,
			String sophuhieu,
			long phuongtien_id,
			long loaihinh_id,
			long tuyenkhaithac_id,
			long phamvi_id,
			int loai,
			Date ngaycap,
			Date ngayhethan,
			Date ngaythuhoi,
			String lydo_thuhoi,
			String nguoitao,
			Date ngaytao,
			String nguoiky,
			long nguoiky_id,
			Date ngayky,
			String ghichu,
			int trangthai,
			long coquanquanly_id,
			int labienhieu
			) {
		ILPhuHieuBienHieu phbh = ilPhuHieuBienHieuPersistence.create(id);
		phbh.setSophuhieu(sophuhieu);
		phbh.setPhuongtien_id(phuongtien_id);
		phbh.setLoaihinh_id(loaihinh_id);
		phbh.setTuyenkhaithac_id(tuyenkhaithac_id);
		phbh.setPhamvi_id(phamvi_id);
		phbh.setLoai(loai);
		phbh.setNgaycap(ngaycap);
		phbh.setNgayhethan(ngayhethan);
		phbh.setNgaythuhoi(ngaythuhoi);
		phbh.setLydo_thuhoi(lydo_thuhoi);
		phbh.setNguoitao(nguoitao);
		phbh.setNguoiky(nguoiky);
		phbh.setNguoiky_id(nguoiky_id);
		phbh.setNgayky(ngayky);
		phbh.setGhichu(ghichu);
		phbh.setTrangthai(trangthai);
		phbh.setCoquanquanly_id(coquanquanly_id);
		phbh.setLabienhieu(labienhieu);
		return ilPhuHieuBienHieuPersistence.update(phbh);
	}
	
	public List<ILPhuHieuBienHieu> getByPhuongTien(long phuongtienid) {
		
		return ilPhuHieuBienHieuPersistence.findByPTID(phuongtienid);
		
	}
}