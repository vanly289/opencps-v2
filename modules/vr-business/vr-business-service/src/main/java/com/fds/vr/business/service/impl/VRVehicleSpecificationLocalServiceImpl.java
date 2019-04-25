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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.service.base.VRVehicleSpecificationLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr vehicle specification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRVehicleSpecificationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRVehicleSpecificationLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil
 */
@ProviderType
public class VRVehicleSpecificationLocalServiceImpl
	extends VRVehicleSpecificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil} to access the vr vehicle specification local service.
	 */
	public VRVehicleSpecification findByCode(long vehiceTypeId, String specificationCode) {
		return vrVehicleSpecificationPersistence.fetchBySC_VCID(vehiceTypeId, specificationCode);
	}

	public List<VRVehicleSpecification> findByVehicleCertificateId(long vehicleCertificateId) throws PortalException, SystemException {
		try {
			return vrVehicleSpecificationPersistence.findByVehicleCertificateId(vehicleCertificateId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleSpecification>();
		
	}


	public List<VRVehicleSpecification> findByDeliverableCode(String deliverableCode) throws PortalException, SystemException {
		try {
			return vrVehicleSpecificationPersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleSpecification>();
		
	}

	public VRVehicleSpecification updateVehicleSpecification(LinkedHashMap<String, String> mapValues,
			long vrVehicleTypeCertificateId, Date modifiedDate, VRDossierFile dossierFile) {
		
		Date now = new Date();

		long vrVehicleSpecificationId = counterLocalService.increment(VRVehicleSpecification.class.getName());

		VRVehicleSpecification object = vrVehicleSpecificationPersistence.create(vrVehicleSpecificationId);

		/// Add audit fields
		object.setSyncDate(now);

		// Add other fields
		//TODO
		object.setVehicleCertificateId(vrVehicleTypeCertificateId);
		object.setSpecificationCode(mapValues.get(""));
		object.setSpecificationName(mapValues.get(""));
		object.setSpecificationValue(mapValues.get(""));
		object.setSpecificationValueDescription(mapValues.get(""));
		//TODO
		object.setSequenceNo(GetterUtil.getLong(mapValues.get("")));
		object.setSpecificationBasicUnit(mapValues.get(""));
		object.setSpecificationStandard(mapValues.get(""));
		object.setSpecificationGroup(mapValues.get(""));
		object.setSpecificationDataCollectionID(mapValues.get(""));
		object.setSpecificationResult(mapValues.get(""));
		object.setModifyDate(GetterUtil.getDate(modifiedDate, new SimpleDateFormat("dd:MM:yyyy hh:mm:ss")));

		return vrVehicleSpecificationPersistence.update(object);
	}
	
	private Log _log = LogFactoryUtil.getLog(VRVehicleSpecificationLocalServiceImpl.class);
}