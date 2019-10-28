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

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductTypeImpl;
import com.fds.vr.business.model.impl.VRProductionClassificationImpl;
import com.fds.vr.business.service.base.VRProductionClassificationLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * The implementation of the vr production classification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRProductionClassificationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRProductionClassificationLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil
 */
@ProviderType
public class VRProductionClassificationLocalServiceImpl
	extends VRProductionClassificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil} to access the vr production classification local service.
	 */
	
	public JSONArray findByProductionPlanCode(String productionPlantCode) throws SystemException, PortalException{
		
		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		List<VRProductionClassification> dataList = vrProductionClassificationPersistence.findByPPC(productionPlantCode);
		
		for(VRProductionClassification data:dataList) {
			
			jsonObject = JSONFactoryUtil.createJSONObject();
			
			jsonObject = ActionUtil.object2Json(data, VRProductionClassificationImpl.class, StringPool.BLANK);
			
			if(Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}
	
	public VRProductionClassification updateVRProductionClassification(Map<String, String> mapValues, int mtCore) {
		
		Date now = new Date();
		VRProductionClassification object = new VRProductionClassificationImpl();

		long productionClassificationId = Long.valueOf(mapValues.get("productionClassificationId"));
		
		if(productionClassificationId <= 0) {
			
			productionClassificationId = counterLocalService.increment(VRProductionClassification.class.getName());
	
			object = vrProductionClassificationPersistence.create(productionClassificationId);
		}

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setApplicantProfileId(Long.valueOf(mapValues.get("applicantProfileId")));
		object.setApplicantCode(mapValues.get("applicantCode"));
		object.setProductionPlantId(Long.valueOf(mapValues.get("productionPlantId")));
		object.setProductionPlantCode(mapValues.get("productionPlantCode"));
		object.setSequenceNo(Integer.valueOf(mapValues.get("sequenceNo")));
		object.setProductClassificationCode(mapValues.get("productClassificationCode"));
		object.setProductClassificationDescription(mapValues.get("productClassificationDescription"));
		object.setClassificationModel(mapValues.get("classificationModel"));
		object.setRemarks(mapValues.get("remarks"));
		object.setStatus(mapValues.get("status"));
		//object.setSyncDate(ConvertFormatDate.parseStringToDate(mapValues.get("syncDate")));
		
		object.setProductionPlantCode(mapValues.get("productionPlantCode"));

		return vrProductionClassificationPersistence.update(object);
	}
	
	public VRProductionClassification updateProductionClassification(VRProductionClassification object) {

		if (object.getId() <= 0) {

			long id = counterLocalService.increment(VRProductionClassification.class.getName());

			object = vrProductionClassificationPersistence.create(id);
		}

		return vrProductionClassificationPersistence.update(object);
	}
}