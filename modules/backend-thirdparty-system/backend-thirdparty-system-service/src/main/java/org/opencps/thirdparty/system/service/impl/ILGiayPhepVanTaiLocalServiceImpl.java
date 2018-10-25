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

import java.util.List;

import org.opencps.thirdparty.system.model.ILGiayPhepVanTai;
import org.opencps.thirdparty.system.service.base.ILGiayPhepVanTaiLocalServiceBaseImpl;

/**
 * The implementation of the il giay phep van tai local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.thirdparty.system.service.ILGiayPhepVanTaiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see ILGiayPhepVanTaiLocalServiceBaseImpl
 * @see org.opencps.thirdparty.system.service.ILGiayPhepVanTaiLocalServiceUtil
 */
@ProviderType
public class ILGiayPhepVanTaiLocalServiceImpl
	extends ILGiayPhepVanTaiLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.opencps.thirdparty.system.service.ILGiayPhepVanTaiLocalServiceUtil} to access the il giay phep van tai local service.
	 */
	
	public ILGiayPhepVanTai getLastest() {
		List<ILGiayPhepVanTai> ls = ilGiayPhepVanTaiPersistence.findAll(0, 1);
		
		if (ls.isEmpty()) {
			return null;
		} else {
			return ls.get(0);
		}
	}
	
	public List<ILGiayPhepVanTai> getByDoanhNghiep(long doanhnghiep_id, int start, int end) {
		return ilGiayPhepVanTaiPersistence.findByB_DN(doanhnghiep_id, start, end);
	}
	
	public long countByDoanhNghiep(long doanhnghiep_id) {
		return ilGiayPhepVanTaiPersistence.countByB_DN(doanhnghiep_id);
	}
}