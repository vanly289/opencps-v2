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

import org.opencps.thirdparty.system.model.ViewPhuongTien;
import org.opencps.thirdparty.system.service.base.ViewPhuongTienLocalServiceBaseImpl;

/**
 * The implementation of the view phuong tien local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.thirdparty.system.service.ViewPhuongTienLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see ViewPhuongTienLocalServiceBaseImpl
 * @see org.opencps.thirdparty.system.service.ViewPhuongTienLocalServiceUtil
 */
@ProviderType
public class ViewPhuongTienLocalServiceImpl
	extends ViewPhuongTienLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.opencps.thirdparty.system.service.ViewPhuongTienLocalServiceUtil} to access the view phuong tien local service.
	 */
	
	public List<ViewPhuongTien> searchPhuongTien(String keyword, int start, int end) {
		
		return viewPhuongTienFinder.searchPhuongTien(keyword, start, end);
	}
	
	public int countPhuongTien(String keyword) {
		
		return viewPhuongTienFinder.countPhuongTien(keyword);
	}
}