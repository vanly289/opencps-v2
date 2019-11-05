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

import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.service.base.VRProductionPlantEmployeeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;

import java.util.Date;
import java.util.List;
import java.util.Map;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr production plant employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.fds.vr.business.service.VRProductionPlantEmployeeLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRProductionPlantEmployeeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil
 */
@ProviderType
public class VRProductionPlantEmployeeLocalServiceImpl extends VRProductionPlantEmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil} to
	 * access the vr production plant employee local service.
	 */
	/*
	 * public List<VRProductionPlantEmployee> findByproductPlantID(long mtCore, long
	 * productPlantID) throws PortalException, SystemException { try { return
	 * vrProductionPlantEmployeePersistence.findByproductPlantID(mtCore,
	 * productPlantID); } catch (Exception e) { _log.error(e); } return new
	 * ArrayList<VRProductionPlantEmployee>(); }
	 * 
	 * public void deleteByproductPlantId(long mtCore, long productPlantId) {
	 * vrProductionPlantEmployeePersistence.removeByproductPlantID(mtCore,
	 * productPlantId); }
	 */
	public VRProductionPlantEmployee updateProductionPlantEmployee(Map<String, String> mapValues, int mtCore) {

		Date now = new Date();

		long vrProductionPlantEmployeeId = counterLocalService.increment(VRProductionPlantEmployee.class.getName());

		VRProductionPlantEmployee object = vrProductionPlantEmployeePersistence.create(vrProductionPlantEmployeeId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		// object.setProductPlantID(Long.valueOf(mapValues.get("productPlantId")));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setEmployeeName(mapValues.get("employeeName"));
		object.setEmployeeCertificateNo(mapValues.get("employeeCertificateNo"));
		object.setTrainningAt(mapValues.get("trainningAt"));

		return vrProductionPlantEmployeePersistence.update(object);
	}

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrProductionPlantEmployeeFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start,
				end);
	}

	public long counData(String sql) throws SystemException {

		return vrProductionPlantEmployeeFinder.countData(sql);
	}

	public List<VRProductionPlantEmployee> findByProductionPlanCode(String productionPlantCode) {
		return vrProductionPlantEmployeePersistence.findByPPC(productionPlantCode);
	}

	public VRProductionPlantEmployee createVRProductionPlantEmployee(VRProductionPlantEmployee object)
			throws SystemException {

		long id = counterLocalService.increment(VRProductionPlantEmployee.class.getName());

		object.setId(id);

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductionPlantEmployeePersistence.update(object);
	}

	public VRProductionPlantEmployee updateVRProductionPlantEmployee(VRProductionPlantEmployee object)
			throws SystemException {

		Date now = new Date();

		object.setModifyDate(now);

		return vrProductionPlantEmployeePersistence.update(object);
	}
}