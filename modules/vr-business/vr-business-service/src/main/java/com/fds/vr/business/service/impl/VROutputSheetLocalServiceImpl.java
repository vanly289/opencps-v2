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
import com.fds.vr.business.model.VROutputSheet;
import com.fds.vr.business.service.base.VROutputSheetLocalServiceBaseImpl;

/**
 * The implementation of the vr output sheet local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VROutputSheetLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VROutputSheetLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VROutputSheetLocalServiceUtil
 */
@ProviderType
public class VROutputSheetLocalServiceImpl
	extends VROutputSheetLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VROutputSheetLocalServiceUtil} to access the vr output sheet local service.
	 */
	
	public List<VROutputSheet> findByinputSheetNo(long mtCore, String outputSheetNo) throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findByinputSheetNo(mtCore, outputSheetNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();
		
	}


	public List<VROutputSheet> findBypurchaserCorporationId(long mtCore, String purchaserCorporationId) throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findBypurchaserCorporationId(mtCore, purchaserCorporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();
		
	}
	
	public List<VROutputSheet> findBysupplierCorporationId(long mtCore, String supplierCorporationId) throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findBysupplierCorporationId(mtCore, supplierCorporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();
		
	}
	
	public List<VROutputSheet> findBydossierId(long mtCore, long dossierId) throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findBydossierId(mtCore, dossierId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();
		
	}
	
	public List<VROutputSheet> findByoutputSheetType(long mtCore, long outputSheetType) throws PortalException, SystemException {
		try {
			return vrOutputSheetPersistence.findByoutputSheetType(mtCore, outputSheetType);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VROutputSheet>();
		
	}
	
	private Log _log = LogFactoryUtil.getLog(VROutputSheetLocalServiceImpl.class);
}