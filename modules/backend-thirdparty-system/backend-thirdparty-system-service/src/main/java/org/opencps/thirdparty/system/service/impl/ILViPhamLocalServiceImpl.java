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

import org.opencps.thirdparty.system.model.ILViPham;
import org.opencps.thirdparty.system.service.base.ILViPhamLocalServiceBaseImpl;

/**
 * The implementation of the il vi pham local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.thirdparty.system.service.ILViPhamLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see ILViPhamLocalServiceBaseImpl
 * @see org.opencps.thirdparty.system.service.ILViPhamLocalServiceUtil
 */
@ProviderType
public class ILViPhamLocalServiceImpl extends ILViPhamLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.opencps.thirdparty.system.service.ILViPhamLocalServiceUtil} to access the il vi pham local service.
	 */
	
	public ILViPham addViPham(long id, long phuongtien_id, Date ngayvipham, long loaivipham_id, String mota, String url_bienban) {
		ILViPham viPham = ilViPhamPersistence.create(id);
		
		viPham.setPhuongtien_id(phuongtien_id);
		viPham.setNgayvipham(ngayvipham);
		viPham.setLoaivipham_id(loaivipham_id);
		viPham.setMota(mota);
		viPham.setUrl_bienban(url_bienban);
		
		return ilViPhamPersistence.update(viPham);
	}
	
	public List<ILViPham> getByPhuongTien(long phuongtienId) {
		return ilViPhamPersistence.findByPTID(phuongtienId);
	}
}