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

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.backend.migrate.vr.model.SRCGiayPhepLienVan;
import com.backend.migrate.vr.service.base.SRCGiayPhepLienVanLocalServiceBaseImpl;

/**
 * The implementation of the src giay phep lien van local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.backend.migrate.vr.service.SRCGiayPhepLienVanLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SRCGiayPhepLienVanLocalServiceBaseImpl
 * @see com.backend.migrate.vr.service.SRCGiayPhepLienVanLocalServiceUtil
 */
@ProviderType
public class SRCGiayPhepLienVanLocalServiceImpl
	extends SRCGiayPhepLienVanLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.backend.migrate.vr.service.SRCGiayPhepLienVanLocalServiceUtil} to access the src giay phep lien van local service.
	 */
	
	public List<SRCGiayPhepLienVan> getLastest(long currentId) {
		return srcGiayPhepLienVanPersistence.findByGT_ID(currentId);
	}
	
}