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

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRCOPProductionPlantEmployee;
import com.fds.vr.business.model.VRCOPProductionPlantEquipment;
import com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentImpl;
import com.fds.vr.business.service.base.VRCOPProductionPlantEquipmentLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop production plant equipment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPProductionPlantEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalServiceUtil
 */
@ProviderType
public class VRCOPProductionPlantEquipmentLocalServiceImpl
	extends VRCOPProductionPlantEquipmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalServiceUtil} to access the vrcop production plant equipment local service.
	 */
	public List<VRCOPProductionPlantEquipment> findBycopReportRepositoryID(long mtCore, long copReportRepositoryID) throws PortalException, SystemException {
		try {
			return vrcopProductionPlantEquipmentPersistence.findBycopReportRepositoryID(mtCore, copReportRepositoryID);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPProductionPlantEquipment>();
		
	}


	public List<VRCOPProductionPlantEquipment> findBycopReportNo(long mtCore, String copReportNo) throws PortalException, SystemException {
		try {
			return vrcopProductionPlantEquipmentPersistence.findBycopReportNo(mtCore, copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPProductionPlantEquipment>();
		
	}

	public VRCOPProductionPlantEquipment updateCOPProductionPlantEquipment(Map<String, String> mapValues, int mtCore) {
		
		Date now = new Date();

		long vrCOPProductionPlantEquipmentId = counterLocalService.increment(VRCOPProductionPlantEquipment.class.getName());

		VRCOPProductionPlantEquipment object = vrcopProductionPlantEquipmentPersistence.create(vrCOPProductionPlantEquipmentId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setCopReportRepositoryID(Long.valueOf(mapValues.get("copReportRepositoryId")));
		object.setCopReportNo(mapValues.get("copReportNo"));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setEquipmentCode(mapValues.get("equipmentCode"));
		object.setEquipmentName(mapValues.get("equipmentName"));
		object.setEquipmentType(mapValues.get("equipmentType"));
		object.setTrademark(mapValues.get("trademark"));
		object.setTrademarkName(mapValues.get("trademarkName"));
		object.setCommercialName(mapValues.get("commercialName"));
		object.setModelCode(mapValues.get("modelCode"));
		//object.setDesignSymbolNo(mapValues.get("designSymbolNo"));
		object.setProductionCountryCode(mapValues.get("productionCountryCode"));
		object.setEquipmentStatus(mapValues.get("equipmentStatus"));
		object.setNotes(mapValues.get("notes"));

		return vrcopProductionPlantEquipmentPersistence.update(object);
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return  vrcopProductionPlantEquipmentFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopProductionPlantEquipmentFinder.countData(sql);
	}
	
	public JSONArray getByCOPReportNo(long mtCore,String COPReportNo) throws SystemException, PortalException{
		
		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		List<VRCOPProductionPlantEquipment> dataList =findBycopReportNo(mtCore,COPReportNo);
		
		for(VRCOPProductionPlantEquipment data:dataList) {
			
			jsonObject = JSONFactoryUtil.createJSONObject();
			
			jsonObject = ActionUtil.object2Json(data, VRCOPProductionPlantEquipmentImpl.class, StringPool.BLANK);
			
			if(Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}


	public int adminProcessData(JSONArray arrayData, long dossierId) {

		int result = 0;
		
		try {
			System.out.println("VRCOPProductionPlantEquipmentLocalServiceImpl.adminProcessData()" + dossierId);
			vrcopProductionPlantEquipmentPersistence.removeBycopDossierId(dossierId);
			
			for (int i = 0; i < arrayData.length(); i++) {
				JSONObject objectData = arrayData.getJSONObject(i);
				
				VRCOPProductionPlantEquipment object = null;

				long id = counterLocalService.increment(VRCOPProductionPlantEquipment.class.getName());

				object = vrcopProductionPlantEquipmentPersistence.create(id);

				object.setModifyDate(new Date());
				object.setMtCore(objectData.getLong("mtCore"));
				if (!"".equals(objectData.getString("syncDate"))) {
					object.setSyncDate(new Date(objectData.getString("syncDate")));
				}

				object.setCopReportRepositoryID(objectData.getLong("copReportRepositoryID"));
				object.setCopReportNo(objectData.getString("copReportNo"));
				object.setSequenceNo(objectData.getLong("sequenceNo"));
				object.setEquipmentCode(objectData.getString("equipmentCode"));
				object.setEquipmentName(objectData.getString("equipmentName"));
				object.setEquipmentType(objectData.getString("equipmentType"));
				object.setTrademark(objectData.getString("trademark"));
				object.setTrademarkName(objectData.getString("trademarkName"));
				object.setCommercialName(objectData.getString("commercialName"));
				object.setModelCode(objectData.getString("modelCode"));
				object.setProductionCountryCode(objectData.getString("productionCountryCode"));
				object.setEquipmentStatus(objectData.getString("equipmentStatus"));
				if (!"".equals(objectData.getString("expireDate"))) {
					object.setSyncDate(new Date(objectData.getString("expireDate")));
				}
				object.setNotes(objectData.getString("notes"));
				object.setEquipmentSerialNo(objectData.getString("equipmentSerialNo"));
				if (!"".equals(objectData.getString("productionYear"))) {
					object.setProductionYear(new Date(objectData.getString("productionYear")));
				}
				if (!"".equals(objectData.getString("registrationYear"))) {
					object.setRegistrationYear(new Date(objectData.getString("registrationYear")));
				}
				object.setMarkupXCG(objectData.getLong("markupXCG"));
				object.setMarkupXCGNK(objectData.getLong("markupXCGNK"));
				object.setMarkupSMRM(objectData.getLong("markupSMRM"));
				object.setMarkupXCH(objectData.getLong("markupXCH"));
				object.setMarkupXCN(objectData.getLong("markupXCN"));
				object.setMarkupXMY(objectData.getLong("markupXMY"));
				object.setMarkupXDD(objectData.getLong("markupXDD"));
				object.setTestingResult(objectData.getInt("testingResult"));
				object.setDescription(objectData.getString("description"));
				object.setInspectionRecordNumber(objectData.getString("inspectionRecordNumber"));

				if (!"".equals(objectData.getString("inspectionRecordDate"))) {
					object.setInspectionRecordDate(new Date(objectData.getString("inspectionRecordDate")));
				}

				if (!"".equals(objectData.getString("expiredDate"))) {
					object.setExpiredDate(new Date(objectData.getString("expiredDate")));
				}
				object.setExpiredStatus(objectData.getInt("expiredStatus"));
				object.setStampTestingNo(objectData.getString("stampTestingNo"));
				
				object.setDossierId(objectData.getLong("dossierId"));
				object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
				object.setDossierNo(objectData.getString("dossierNo"));
				object.setProductionPlantId(objectData.getLong("productionPlantId"));
				object.setProductionPlantCode(objectData.getString("productionPlantCode"));
				
				vrcopProductionPlantEquipmentPersistence.update(object);
				
				result = i;
			}
		} catch (Exception e) {
			// TODO: handle exception
			result = -500;
		}
		
		return result;
	}

	private Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantEquipmentLocalServiceImpl.class);
}