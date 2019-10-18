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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.service.base.VRCOPReportRepositoryLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop report repository local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRCOPReportRepositoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPReportRepositoryLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil
 */
@ProviderType
public class VRCOPReportRepositoryLocalServiceImpl
	extends VRCOPReportRepositoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil} to access the vrcop report repository local service.
	 */
	public List<VRCOPReportRepository> findBycopReportStatus(long mtCore, String copReportStatus) throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findBycopReportStatus(mtCore, copReportStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportRepository>();
		
	}


	public VRCOPReportRepository findBycopReportNo(long mtCore, String copReportNo) throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findBycopReportNo(mtCore, copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
		
	}
	
	public List<VRCOPReportRepository> findByapplicantProfileId(long mtCore, long applicantProfileId) throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findByapplicantProfileId(mtCore, applicantProfileId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportRepository>();
		
	}
	
	public List<VRCOPReportRepository> findByproductionPlantCode(long mtCore, long applicantProfileId, String productionPlantCode) throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findByproductionPlantCode(mtCore, applicantProfileId, productionPlantCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportRepository>();
		
	}
	
	public List<VRCOPReportRepository> findByproductionPlantName(long mtCore, long applicantProfileId, String productionPlantName, String productionPlantAddress) throws PortalException, SystemException {
		try {
			return vrcopReportRepositoryPersistence.findByproductionPlantName(mtCore, applicantProfileId, productionPlantName, productionPlantAddress);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPReportRepository>();
		
	}

	public VRCOPReportRepository updateCOPReportRepository(Map<String, String> mapValues, int mtCore) {
		
		Date now = new Date();

		long vrCOPReportRepositoryId = counterLocalService.increment(VRCOPReportRepository.class.getName());

		VRCOPReportRepository object = vrcopReportRepositoryPersistence.create(vrCOPReportRepositoryId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setApplicantProfileId(Long.valueOf(mapValues.get("applicantProfileId")));
		object.setApplicantName(mapValues.get("applicantName"));
		object.setApplicantAddress(mapValues.get("applicantAddress"));
		object.setOverseasManufacturerCode(mapValues.get("overseasManufacturerCode"));
		object.setOverseasManufacturerName(mapValues.get("overseasManufacturerName"));
		object.setOverseasManufacturerAddress(mapValues.get("overseasManufacturerAddress"));
		System.out.println("productionPlantId: "+mapValues.get("productionPlantId"));
		object.setProductionPlantId(Long.valueOf(mapValues.get("productionPlantId")));
		object.setProductionPlantCode(mapValues.get("productionPlantCode"));
		object.setProductionPlantName(mapValues.get("productionPlantName"));
		object.setProductionPlantAddress(mapValues.get("productionPlantAddress"));
		object.setCopReportNo(mapValues.get("copReportNo"));
		object.setCopReportStatus(mapValues.get("copReportStatus"));
		object.setCopReportType(mapValues.get("copReportType"));
		object.setCopReportMetadata(mapValues.get("copReportMetadata"));
		object.setCopReportSignName(mapValues.get("copReportSignName"));
		object.setCopReportSignTitle(mapValues.get("copReportSignTitle"));
		object.setCopReportSignPlace(mapValues.get("copReportSignPlace"));
		object.setCopReportDate(ConvertFormatDate.parseStringToDate(mapValues.get("copReportDate")));
		object.setCopReportApprovedDate(ConvertFormatDate.parseStringToDate(mapValues.get("copReportApprovedDate")));
		object.setCopReportExpiredDate(ConvertFormatDate.parseStringToDate(mapValues.get("copReportExpiredDate")));

		return vrcopReportRepositoryPersistence.update(object);
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrcopReportRepositoryFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopReportRepositoryFinder.countData(sql);
	}


	private Log _log = LogFactoryUtil.getLog(VRCOPReportRepositoryLocalServiceImpl.class);
}