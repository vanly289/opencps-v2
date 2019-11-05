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

import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.service.base.VRProductionPlantEquipmentLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;

import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr production plant equipment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRProductionPlantEquipmentLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRProductionPlantEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil
 */
@ProviderType
public class VRProductionPlantEquipmentLocalServiceImpl extends VRProductionPlantEquipmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil} to
	 * access the vr production plant equipment local service.
	 */
	/*
	 * public List<VRProductionPlantEquipment> findByproductPlantID(long mtCore,
	 * long productPlantID) throws PortalException, SystemException { try { return
	 * vrProductionPlantEquipmentPersistence.findByproductPlantID(mtCore,
	 * productPlantID); } catch (Exception e) { _log.error(e); } return new
	 * ArrayList<VRProductionPlantEquipment>();
	 * 
	 * }
	 * 
	 * public void deleteByproductPlantId(long mtCore, long productPlantId) {
	 * 
	 * vrProductionPlantEquipmentPersistence.removeByproductPlantID(mtCore,
	 * productPlantId); }
	 */
	public VRProductionPlantEquipment updateProductionPlantEquipment(Map<String, String> mapValues, int mtCore) {

		Date now = new Date();

		long vrProductionPlantEquipmentId = counterLocalService.increment(VRProductionPlantEquipment.class.getName());

		VRProductionPlantEquipment object = vrProductionPlantEquipmentPersistence.create(vrProductionPlantEquipmentId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		// object.setProductPlantID(Long.valueOf(mapValues.get("productPlantId")));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setEquipmentCode(mapValues.get("equipmentCode"));
		object.setEquipmentName(mapValues.get("equipmentName"));
		object.setEquipmentType(mapValues.get("equipmentType"));
		object.setTrademark(mapValues.get("trademark"));
		object.setTrademarkName(mapValues.get("trademarkName"));
		object.setCommercialName(mapValues.get("commercialName"));
		object.setModelCode(mapValues.get("modelCode"));
		// object.setDesignSymbolNo(mapValues.get("designSymbolNo"));
		object.setProductionCountryCode(mapValues.get("productionCountryCode"));
		object.setEquipmentStatus(mapValues.get("equipmentStatus"));
		object.setExpireDate(ConvertFormatDate.parseStringToDate(mapValues.get("expireDate")));
		object.setNotes(mapValues.get("notes"));

		object.setProductionPlantCode(mapValues.get("productionPlantCode"));

		return vrProductionPlantEquipmentPersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrProductionPlantEquipmentFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start,
				end);
	}

	public long counData(String sql) throws SystemException {

		return vrProductionPlantEquipmentFinder.countData(sql);
	}

	public List<VRProductionPlantEquipment> findByProductionPlanCode(String productionPlantCode) {
		return vrProductionPlantEquipmentPersistence.findByPPC(productionPlantCode);
	}

	public VRProductionPlantEquipment createVRProductionPlantEquipment(VRProductionPlantEquipment object)
			throws SystemException {

		long id = counterLocalService.increment(VRProductionPlantEquipment.class.getName());

		object.setId(id);

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductionPlantEquipmentPersistence.update(object);
	}

	public VRProductionPlantEquipment updateVRProductionPlantEquipment(VRProductionPlantEquipment object)
			throws SystemException {

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductionPlantEquipmentPersistence.update(object);
	}

}