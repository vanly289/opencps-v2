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

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl;
import com.fds.vr.business.service.base.VRCOPReportRepositoryLocalServiceBaseImpl;
import com.fds.vr.business.service.persistence.VRCOPReportRepositoryPersistence;
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
	
	public JSONObject getByCOPReportNo(long mtCore,String COPReportNo) throws SystemException, PortalException{
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		
		VRCOPReportRepository vrCOPReportRepository = findBycopReportNo(mtCore,COPReportNo);
		
		result = ActionUtil.object2Json(vrCOPReportRepository, VRCOPReportRepositoryImpl.class,StringPool.BLANK);
		
		
		return result;
	}

	public VRCOPReportRepository adminProcessData(JSONObject objectData, long dossierId) {
		VRCOPReportRepository object = null;

		vrcopReportRepositoryPersistence.removeBycopDossierId(dossierId);

		long id = counterLocalService.increment(VRCOPReportRepository.class.getName());

		object = vrcopReportRepositoryPersistence.create(id);

		object.setModifyDate(new Date());

		object.setMtCore(objectData.getLong("mtCore"));
		object.setApplicantProfileId(objectData.getLong("applicantProfileId"));
		object.setApplicantCode(objectData.getString("applicantCode"));
		object.setApplicantName(objectData.getString("applicantName"));
		object.setApplicantAddress(objectData.getString("applicantAddress"));
		object.setOverseasManufacturerCode(objectData.getString("overseasManufacturerCode"));
		object.setOverseasManufacturerName(objectData.getString("overseasManufacturerName"));
		object.setOverseasManufacturerAddress(objectData.getString("overseasManufacturerAddress"));
		object.setProductionPlantId(objectData.getLong("productionPlantId"));
		object.setProductionPlantCode(objectData.getString("productionPlantCode"));
		object.setProductionPlantName(objectData.getString("productionPlantName"));
		object.setProductionPlantAddress(objectData.getString("productionPlantAddress"));
		object.setCopReportNo(objectData.getString("copReportNo"));
		object.setCopReportStatus(objectData.getString("copReportStatus"));
		object.setCopReportType(objectData.getString("copReportType"));
		object.setCopReportMetadata(objectData.getString("copReportMetadata"));
		object.setCopReportSignName(objectData.getString("copReportSignName"));
		object.setCopReportSignTitle(objectData.getString("copReportSignTitle"));
		object.setCopReportSignPlace(objectData.getString("copReportSignPlace"));
		if (!"".equals(objectData.getString("copReportDate"))) {
			object.setCopReportDate(new Date(objectData.getString("copReportDate")));
		}
		if (!"".equals(objectData.getString("copReportApprovedDate"))) {
			object.setCopReportApprovedDate(new Date(objectData.getString("copReportApprovedDate")));
		}
		if (!"".equals(objectData.getString("copReportExpiredDate"))) {
			object.setCopReportExpiredDate(new Date(objectData.getString("copReportExpiredDate")));
		}
		object.setCOPFileEntryId(objectData.getLong("COPFileEntryId"));
		if (!"".equals(objectData.getString("syncDate"))) {
			object.setSyncDate(new Date(objectData.getString("syncDate")));
		}
		object.setImporterManufacturerCode(objectData.getString("importerManufacturerCode"));
		object.setImporterManufacturerName(objectData.getString("importerManufacturerName"));
		object.setImporterManufacturerAddress(objectData.getString("importerManufacturerAddress"));
		object.setMarkupDomesticsManufacturer(objectData.getString("markupDomesticsManufacturer"));
		object.setMarkupImporter(objectData.getString("markupImporter"));
		object.setCopClassification(objectData.getString("copClassification"));
		object.setProductClassificationDescription(objectData.getString("productClassificationDescription"));
		object.setTotalPointA(objectData.getInt("totalPointA"));
		object.setTotalPointB(objectData.getInt("totalPointB"));
		object.setTotalPointC(objectData.getInt("totalPointC"));
		object.setCopNonConformity(objectData.getString("copNonConformity"));
		object.setInspectionRecordNo(objectData.getString("inspectionRecordNo"));
		if (!"".equals(objectData.getString("inspectionRecordDate"))) {
			object.setInspectionRecordDate(new Date(objectData.getString("inspectionRecordDate")));
		}
		object.setCorporationId(objectData.getLong("corporationId"));
		object.setInspectorId(objectData.getLong("inspectorId"));
		object.setInspectionSite(objectData.getString("inspectionSite"));
		if (!"".equals(objectData.getString("inspectionDateFrom"))) {
			object.setInspectionDateFrom(new Date(objectData.getString("inspectionDateFrom")));
		}
		if (!"".equals(objectData.getString("inspectionDateTo"))) {
			object.setInspectionDateTo(new Date(objectData.getString("inspectionDateTo")));
		}
		object.setSubInspector(objectData.getString("subInspector"));
		object.setDescription(objectData.getString("description"));
		object.setApplicantRepresentative(objectData.getString("applicantRepresentative"));
		object.setApplicantRepresentativeTitle(objectData.getString("applicantRepresentativeTitle"));
		object.setInspectionRecordFileEntryId(objectData.getLong("inspectionRecordFileEntryId"));
		object.setCopReportRefNo(objectData.getString("copReportRefNo"));
		if (!"".equals(objectData.getString("copReportRefDate"))) {
			object.setCopReportRefDate(new Date(objectData.getString("copReportRefDate")));
		}
		object.setCopReportPreviousNo(objectData.getString("copReportPreviousNo"));
		if (!"".equals(objectData.getString("copReportPreviousDate"))) {
			object.setCopReportPreviousDate(new Date(objectData.getString("copReportPreviousDate")));
		}
		object.setExpiredStatus(objectData.getString("expiredStatus"));
		object.setDossierId(objectData.getLong("dossierId"));
		object.setDossierIdCTN(objectData.getString("dossierIdCTN"));
		object.setDossierNo(objectData.getString("dossierNo"));

		vrcopReportRepositoryPersistence.update(object);

		return object;
	}
	
	private Log _log = LogFactoryUtil.getLog(VRCOPReportRepositoryLocalServiceImpl.class);
}