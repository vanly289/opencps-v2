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

package com.fds.vr.business.service.impl;

import aQute.bnd.annotation.ProviderType;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.fds.vr.business.model.VRInventory;
import com.fds.vr.business.service.base.VRInventoryLocalServiceBaseImpl;

/**
 * The implementation of the vr inventory local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRInventoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRInventoryLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRInventoryLocalServiceUtil
 */
@ProviderType
public class VRInventoryLocalServiceImpl extends VRInventoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRInventoryLocalServiceUtil} to access the vr inventory local service.
	 */
	
	public List<VRInventory> findByYearofPeriod(long mtCore, long yearofPeriod) throws PortalException, SystemException {
		try {
			return vrInventoryPersistence.findByYearofPeriod(mtCore, yearofPeriod);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInventory>();
		
	}


	public List<VRInventory> findByYearofPeriodAndCorporationId(long mtCore, long yearofPeriod, String corporationId) throws PortalException, SystemException {
		try {
			return vrInventoryPersistence.findByYearofPeriodAndCorporationId(mtCore, yearofPeriod, corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInventory>();
		
	}
	
	public List<VRInventory> findByYearofPeriodAndVehicleClass(long mtCore, long yearofPeriod, String vehicleClass) throws PortalException, SystemException {
		try {
			return vrInventoryPersistence.findByYearofPeriodAndVehicleClass(mtCore, yearofPeriod, vehicleClass);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInventory>();
		
	}
	
	public List<VRInventory> findByBookIdAndVehicleClass(long mtCore, long bookId, String vehicleClass) throws PortalException, SystemException {
		try {
			return vrInventoryPersistence.findByBookIdAndVehicleClass(mtCore, bookId, vehicleClass);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInventory>();
		
	}
	
	public List<VRInventory> findByBookId(long mtCore, long bookId) throws PortalException, SystemException {
		try {
			return vrInventoryPersistence.findByBookId(mtCore, bookId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInventory>();
		
	}
	
	public List<VRInventory> findBycheckType(long mtCore, long checkType) throws PortalException, SystemException {
		try {
			return vrInventoryPersistence.findBycheckType(mtCore, checkType);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInventory>();
		
	}
	
	public List<VRInventory> findBycheckStatus(long mtCore, long checkStatus) throws PortalException, SystemException {
		try {
			return vrInventoryPersistence.findBycheckStatus(mtCore, checkStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInventory>();
		
	}
	
	private Log _log = LogFactoryUtil.getLog(VRInventoryLocalServiceImpl.class);
}