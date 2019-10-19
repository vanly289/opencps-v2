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

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRProductionPlantSupplier;
import com.fds.vr.business.service.base.VRProductionPlantSupplierLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr production plant supplier local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRProductionPlantSupplierLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantSupplierLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductionPlantSupplierLocalServiceUtil
 */
@ProviderType
public class VRProductionPlantSupplierLocalServiceImpl
	extends VRProductionPlantSupplierLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRProductionPlantSupplierLocalServiceUtil} to access the vr production plant supplier local service.
	 */

	public VRProductionPlantSupplier updateProductionPlantSupplier(LinkedHashMap<String, String> mapValues) {
		
		Date now = new Date();

		long vrProductionPlantSupplierId = counterLocalService.increment(VRProductionPlantSupplier.class.getName());

		VRProductionPlantSupplier object = vrProductionPlantSupplierPersistence.create(vrProductionPlantSupplierId);

		/// Add audit fields
		object.setSyncDate(now);

		// Add other fields
		object.setMtCore(Long.valueOf(mapValues.get("")));
		object.setProductPlantID(Long.valueOf(mapValues.get("")));
		object.setSupplierId(mapValues.get(""));
		object.setSupplierName(mapValues.get(""));
		object.setSupplieraddress(mapValues.get(""));
		object.setCorporationCode(mapValues.get(""));
		object.setCorporationName(mapValues.get(""));
		object.setCorporationAddress(mapValues.get(""));
		object.setApplicantprofileId(Long.valueOf(mapValues.get("")));
		object.setProductPlantID(Long.valueOf(mapValues.get("")));
		object.setProductionPlantCode(mapValues.get(""));
		object.setProductionPlantName(mapValues.get(""));
		object.setProductionPlantAddress(mapValues.get(""));
		object.setMarkupImporter(Integer.valueOf(mapValues.get("")));
		object.setMappingMA_CTY(mapValues.get(""));
		object.setMappingTEN_CTY(mapValues.get(""));
		object.setMappingDIA_CHI_CTY(mapValues.get(""));
		object.setMappingMA_XUONG_LR(mapValues.get(""));
		object.setMappingTEN_XUONG_LR(mapValues.get(""));
		object.setMappingDIA_CHI_XUONG_LR(mapValues.get(""));

		object.setModifyDate(ConvertFormatDate.parseStringToDate(mapValues.get("")));

		return vrProductionPlantSupplierPersistence.update(object);
	}
	
	/*
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrProductionPlantSupplierFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrProductionPlantSupplierFinder.countData(sql);
	}
	*/
}