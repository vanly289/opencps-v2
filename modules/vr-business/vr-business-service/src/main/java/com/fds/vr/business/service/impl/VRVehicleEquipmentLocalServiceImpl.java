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
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.fds.vr.business.model.VRVehicleEquipment;
import com.fds.vr.business.service.base.VRVehicleEquipmentLocalServiceBaseImpl;

/**
 * The implementation of the vr vehicle equipment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRVehicleEquipmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRVehicleEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRVehicleEquipmentLocalServiceUtil
 */
@ProviderType
public class VRVehicleEquipmentLocalServiceImpl
	extends VRVehicleEquipmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRVehicleEquipmentLocalServiceUtil} to access the vr vehicle equipment local service.
	 */
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrVehicleEquipmentFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start,
				end);
	}

	public long counData(String sql) throws SystemException {

		return vrVehicleEquipmentFinder.countData(sql);
	}
	
	public List<VRVehicleEquipment> adminProcessData(JSONArray arrayData, long dossierId, long vehicleTypeCertificateId) {
		List<VRVehicleEquipment> vrVehicleEquipments = new ArrayList<VRVehicleEquipment>();
		try {
			vrVehicleEquipmentPersistence.removeBydossierId(dossierId);
			
			Date now = new Date();
			
			for (int i = 0; i < arrayData.length(); i++) {
				JSONObject objectData = arrayData.getJSONObject(i);
				
				VRVehicleEquipment object = null;
				
				long id = counterLocalService.increment(VRVehicleEquipment.class.getName());
				object = vrVehicleEquipmentPersistence.create(id);
				
				object.setSyncDate(now);
				object.setVehicleCertificateId(vehicleTypeCertificateId);
				object.setCertificateRecordId(objectData.getLong("certificateRecordId"));
				object.setDossierId(objectData.getLong("dossierId"));
				object.setDossierNo(objectData.getString("dossierNo"));
				object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				object.setModifyDate(now);
				
				object = vrVehicleEquipmentPersistence.update(object);
				
				vrVehicleEquipments.add(object);
			}
		}catch (Exception e) {
			_log.error(e);
		}
		return vrVehicleEquipments;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(VRVehicleEquipmentLocalServiceImpl.class);
}