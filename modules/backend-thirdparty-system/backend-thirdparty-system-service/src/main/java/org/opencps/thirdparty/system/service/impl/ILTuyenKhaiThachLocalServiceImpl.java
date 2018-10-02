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

import org.opencps.thirdparty.system.model.ILTuyenKhaiThach;
import org.opencps.thirdparty.system.service.base.ILTuyenKhaiThachLocalServiceBaseImpl;

/**
 * The implementation of the il tuyen khai thach local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.thirdparty.system.service.ILTuyenKhaiThachLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see ILTuyenKhaiThachLocalServiceBaseImpl
 * @see org.opencps.thirdparty.system.service.ILTuyenKhaiThachLocalServiceUtil
 */
@ProviderType
public class ILTuyenKhaiThachLocalServiceImpl
	extends ILTuyenKhaiThachLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.opencps.thirdparty.system.service.ILTuyenKhaiThachLocalServiceUtil} to access the il tuyen khai thach local service.
	 */
	
	public List<ILTuyenKhaiThach> getByDoanhNghiep(long doanhnghiep_id, int start, int end) {
		return ilTuyenKhaiThachPersistence.findByB_DN(doanhnghiep_id, start, end);
	}
	
	public long count(long doanhnghiep_id) {
		return ilTuyenKhaiThachPersistence.countByB_DN(doanhnghiep_id);
	}
}