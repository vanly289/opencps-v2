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
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRCOPProductLine;
import com.fds.vr.business.model.VRCOPProductType;
import com.fds.vr.business.service.base.VRCOPProductTypeLocalServiceBaseImpl;

/**
 * The implementation of the vrcop product type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRCOPProductTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPProductTypeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPProductTypeLocalServiceUtil
 */
@ProviderType
public class VRCOPProductTypeLocalServiceImpl
	extends VRCOPProductTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRCOPProductTypeLocalServiceUtil} to access the vrcop product type local service.
	 */
	public List<VRCOPProductType> findBycopReportRepositoryID(long mtCore, long copReportRepositoryID) throws PortalException, SystemException {
		try {
			return vrcopProductTypePersistence.findBycopReportRepositoryID(mtCore, copReportRepositoryID);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPProductType>();
		
	}


	public List<VRCOPProductType> findBycopReportNo(long mtCore, String copReportNo) throws PortalException, SystemException {
		try {
			return vrcopProductTypePersistence.findBycopReportNo(mtCore, copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPProductType>();
		
	}

	public VRCOPProductType updateCOPProductType(LinkedHashMap<String, String> mapValues) {
		
		Date now = new Date();

		long vrCOPProductTypeId = counterLocalService.increment(VRCOPProductType.class.getName());

		VRCOPProductType object = vrcopProductTypePersistence.create(vrCOPProductTypeId);

		/// Add audit fields
		object.setSyncDate(now);

		// Add other fields
		object.setMtCore(Long.valueOf(mapValues.get("")));
		object.setCopReportRepositoryID(Long.valueOf(mapValues.get("")));
		object.setCopReportNo(mapValues.get(""));
		object.setSequenceNo(Long.valueOf(mapValues.get("")));
		object.setVehicleClass(mapValues.get(""));
		object.setVehicleTypeCode(mapValues.get(""));
		object.setVehicleTypeDescription(mapValues.get(""));

		object.setModifyDate(ConvertFormatDate.parseStringToDate(mapValues.get("")));

		return vrcopProductTypePersistence.update(object);
	}

	private Log _log = LogFactoryUtil.getLog(VRCOPProductTypeLocalServiceImpl.class);
}