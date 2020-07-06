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
import com.fds.vr.business.constant.VRKeys;
import com.fds.vr.business.exception.NoSuchVRApplicantProfileException;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.service.base.VRApplicantProfileLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr applicant profile local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRApplicantProfileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRApplicantProfileLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil
 */
@ProviderType
public class VRApplicantProfileLocalServiceImpl
	extends VRApplicantProfileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil} to access the vr applicant profile local service.
	 */
	
	public VRApplicantProfile updateApplicantProfile(LinkedHashMap<String, String> mapValues) {
		
		Date now = new Date();

		long vrApplicantProfileId = counterLocalService.increment(VRApplicantProfile.class.getName());

		VRApplicantProfile object = vrApplicantProfilePersistence.create(vrApplicantProfileId);

		/// Add audit fields
		object.setSyncDate(now);

		// Add other fields
		object.setApplicantCode(mapValues.get(""));
		object.setApplicantName(mapValues.get(""));
		object.setApplicantAddress(mapValues.get(""));
		object.setApplicantPhone(mapValues.get(""));
		object.setApplicantEmail(mapValues.get(""));
		object.setApplicantFax(mapValues.get(""));
		object.setApplicantRepresentative(mapValues.get(""));
		object.setApplicantRepresentativeTitle(mapValues.get(""));
		object.setApplicantContactName(mapValues.get(""));
		object.setApplicantContactEmail(mapValues.get(""));
		object.setApplicantContactPhone(mapValues.get(""));
		object.setApplicantNationality(mapValues.get(""));
		object.setMarkupCorporation(mapValues.get(""));
		object.setCorporationId(mapValues.get(""));
		object.setMarkupDesigner(mapValues.get(""));
		object.setMarkupOverseasManufacturer(mapValues.get(""));
		object.setMarkupDomesticsManufacturer(mapValues.get(""));
		object.setMarkupImporter(mapValues.get(""));
		object.setMarkupComponentXCG(mapValues.get(""));
		object.setMarkupComponentXMY(mapValues.get(""));
		object.setMarkupComponentXCD(mapValues.get(""));
		object.setMarkupComponentXDD(mapValues.get(""));
		object.setMarkupComponentXCN(mapValues.get(""));
		object.setMarkupComponentXCH(mapValues.get(""));
		object.setMarkupXCG(mapValues.get(""));
		object.setMarkupXMY(mapValues.get(""));
		object.setMarkupXCD(mapValues.get(""));
		object.setMarkupXDD(mapValues.get(""));
		object.setMarkupXCN(mapValues.get(""));
		object.setMarkupXCH(mapValues.get(""));
		object.setIssueTypeXCG(mapValues.get(""));
		object.setIssueTypeXMY(mapValues.get(""));
		object.setIssueTypeXCD(mapValues.get(""));
		object.setIssueTypeXDD(mapValues.get(""));
		object.setIssueTypeXCN(mapValues.get(""));
		object.setIssueTypeXCH(mapValues.get(""));
		object.setIssueTypeDescription(mapValues.get(""));
		object.setApplicantRegion(mapValues.get(""));
		object.setApplicantCeremonyDate(mapValues.get(""));
		object.setApplicantOperationPeriod(mapValues.get(""));
		object.setApplicantBusinessType(mapValues.get(""));
		object.setApplicantMetadata(mapValues.get(""));
		object.setApplicantStatus(mapValues.get(""));

//		object.setModifyDate(DATEEEEEEE);

		return vrApplicantProfilePersistence.update(object);
	}
	
	public List<VRApplicantProfile> findBymappingStatus(long mtCore, String mappingStatus)  throws SystemException {
		try {
			return vrApplicantProfilePersistence.findBymappingStatus(mtCore, mappingStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfile>();
		
	}
	
	public List<VRApplicantProfile> findByapplicantCode(long mtCore, String applicantCode)  throws SystemException {
		try {
			return vrApplicantProfilePersistence.findByapplicantCode(mtCore, applicantCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfile>();
		
	}

	public List<VRApplicantProfile> findBymappingMA_CTY(long mtCore, String mappingMA_CTY)  throws SystemException {
		try {
			return vrApplicantProfilePersistence.findBymappingMA_CTY(mtCore, mappingMA_CTY);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfile>();
		
	}

	public List<VRApplicantProfile> findBymappingTEN_CTY(long mtCore, String mappingTEN_CTY)  throws SystemException {
		try {
			return vrApplicantProfilePersistence.findBymappingTEN_CTY(mtCore, mappingTEN_CTY);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfile>();
		
	}

	public List<VRApplicantProfile> findByapplicantRegion(long mtCore, String applicantRegion) throws SystemException {
		try {
			return vrApplicantProfilePersistence.findByapplicantRegion(mtCore, applicantRegion);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfile>();
		
	}

	public List<VRApplicantProfile> findByapplicantCity(long mtCore, String applicantCity) throws SystemException {
		try {
			return vrApplicantProfilePersistence.findByapplicantCity(mtCore, applicantCity);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfile>();
		
	}

	public List<VRApplicantProfile> findByapplicantStatus(long mtCore, String applicantStatus) throws SystemException {
		try {
			return vrApplicantProfilePersistence.findByapplicantStatus(mtCore, applicantStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRApplicantProfile>();
		
	}

	public VRApplicantProfile findByMT_APP_CODE(long mtCore, String applicantCode) {
		try {
			return vrApplicantProfilePersistence.findByMT_APP_CODE(mtCore, applicantCode);
		} catch (NoSuchVRApplicantProfileException e) {
			return null;
		}
	}
	

	public JSONArray findVRAppicantProfile(String sql, List<String> columnNames, List<String> dataTypes,
			Class<?> modelClazz, String modelClassName, int start, int end) throws SystemException {
		
		return vrApplicantProfileFinder.findVRAppicantProfile(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long countVRAppicantProfile(String sql) throws SystemException {

		return vrApplicantProfileFinder.countVRAppicantProfile(sql);
	}
	
	public VRApplicantProfile createVRApplicantProfile(VRApplicantProfile object)
			throws SystemException {

		long id = counterLocalService.increment(VRApplicantProfile.class.getName());

		object.setId(id);

		Date now = new Date();

		object.setModifyDate(now);

		return vrApplicantProfilePersistence.update(object);
	}
	
	public VRApplicantProfile updateVRApplicantProfile(VRApplicantProfile object) throws SystemException{

		Date now = new Date();

		object.setModifyDate(now);

		return vrApplicantProfilePersistence.update(object);
	}
	
	public VRApplicantProfile adminProcessData(JSONObject objectData, long mtCore, String applicantCode) {
		VRApplicantProfile object = null;

		object = vrApplicantProfilePersistence.fetchByMT_APP_CODE(mtCore, applicantCode);
		if(object == null) {
			long id = counterLocalService.increment(VRApplicantProfile.class.getName());
	
			object = vrApplicantProfilePersistence.create(id);
		} else {
			String applicantStatus = object.getApplicantStatus();
			if(applicantStatus.equals(VRKeys.CHO_DUYET) || applicantStatus.equals(VRKeys.DA_DUYET)) {
				_log.info("Error: Khong duoc sua thong tin neu doanh nghiep dang cho duyet hoac da duyet");
				return null;
			}
		}
		
		Date now = new Date();
		object.setModifyDate(now);
		if (objectData.getString("syncDate") != null && !StringPool.BLANK.equals(objectData.getString("syncDate"))) {
			object.setSyncDate(ConvertFormatDate.parseStringToDate(objectData.getString("syncDate"), ConvertFormatDate._ddMMyyy_HHmm));
		}
		
		object.setMtCore(objectData.getLong("mtCore"));
		object.setMappingMA_CTY(objectData.getString("mappingMA_CTY"));
		object.setMappingTEN_CTY(objectData.getString("mappingTEN_CTY"));
		object.setMappingDIA_CHI_CTY(objectData.getString("mappingDIA_CHI_CTY"));
		object.setMappingNote(objectData.getString("mappingNote"));
		object.setMappingStatus(objectData.getString("mappingStatus"));
		object.setApplicantCode(applicantCode);
		object.setApplicantName(objectData.getString("applicantName"));
		object.setApplicantAddress(objectData.getString("applicantAddress"));
		object.setApplicantPhone(objectData.getString("applicantPhone"));
		object.setApplicantEmail(objectData.getString("applicantEmail"));
		object.setApplicantFax(objectData.getString("applicantFax"));
		object.setApplicantWebsite(objectData.getString("applicantWebsite"));
		object.setApplicantRepresentativePhone(objectData.getString("applicantRepresentativePhone"));
		object.setApplicantRepresentative(objectData.getString("applicantRepresentative"));
		object.setApplicantRepresentativeTitle(objectData.getString("applicantRepresentativeTitle"));
		object.setApplicantContactName(objectData.getString("applicantContactName"));
		object.setApplicantContactEmail(objectData.getString("applicantContactEmail"));
		object.setApplicantContactPhone(objectData.getString("applicantContactPhone"));
		object.setApplicantNationality(objectData.getString("applicantNationality"));
		object.setApplicantRegion(objectData.getString("applicantRegion"));
		object.setApplicantCity(objectData.getString("applicantCity"));
		object.setApplicantCityCode(objectData.getString("applicantCityCode"));
		object.setApplicantDistrictCode(objectData.getString("applicantDistrictCode"));
		object.setApplicantDistrictName(objectData.getString("applicantDistrictName"));
		object.setApplicantWardCode(objectData.getString("applicantWardCode"));
		object.setApplicantWardName(objectData.getString("applicantWardName"));
		object.setApplicantRegionCode(objectData.getString("applicantRegionCode"));
		object.setApplicantNationalityCode(objectData.getString("applicantNationalityCode"));
		object.setMarkupCorporation(objectData.getString("markupCorporation"));
		object.setCorporationId(objectData.getString("corporationId"));
		object.setMarkupDesigner(objectData.getString("markupDesigner"));
		object.setMarkupOverseasManufacturer(objectData.getString("markupOverseasManufacturer"));
		object.setMarkupDomesticsManufacturer(objectData.getString("markupDomesticsManufacturer"));
		object.setMarkupMaintainer(objectData.getString("markupMaintainer"));
		object.setMarkupImporter(objectData.getString("markupImporter"));
		object.setMarkupComponentXCG(objectData.getString("markupComponentXCG"));
		object.setMarkupComponentXMY(objectData.getString("markupComponentXMY"));
		object.setMarkupComponentXCD(objectData.getString("markupComponentXCD"));
		object.setMarkupComponentXDD(objectData.getString("markupComponentXDD"));
		object.setMarkupComponentXCN(objectData.getString("markupComponentXCN"));
		object.setMarkupComponentXCH(objectData.getString("markupComponentXCH"));
		object.setMarkupXCG(objectData.getString("markupXCG"));
		object.setMarkupXMY(objectData.getString("markupXMY"));
		object.setMarkupXCD(objectData.getString("markupXCD"));
		object.setMarkupXDD(objectData.getString("markupXDD"));
		object.setMarkupXCN(objectData.getString("markupXCN"));
		object.setMarkupXCH(objectData.getString("markupXCH"));
		object.setIssueTypeXCG(objectData.getString("issueTypeXCG"));
		object.setIssueTypeXMY(objectData.getString("issueTypeXMY"));
		object.setIssueTypeXCD(objectData.getString("issueTypeXCD"));
		object.setIssueTypeXDD(objectData.getString("issueTypeXDD"));
		object.setIssueTypeXCN(objectData.getString("issueTypeXCN"));
		object.setIssueTypeXCH(objectData.getString("issueTypeXCH"));
		object.setIssueTypeDescription(objectData.getString("issueTypeDescription"));
		object.setApplicantCeremonyDate(objectData.getString("applicantCeremonyDate"));
		object.setApplicantOperationPeriod(objectData.getString("applicantOperationPeriod"));
		object.setApplicantBusinessType(objectData.getString("applicantBusinessType"));
		object.setApplicantIdentityType(objectData.getString("applicantIdentityType"));
		object.setApplicantIdentityDescription(objectData.getString("applicantIdentityDescription"));
		object.setApplicantIdentityFileName(objectData.getString("applicantIdentityFileName"));
		object.setApplicantIdentityFileEntryId(objectData.getLong("applicantIdentityFileEntryId"));
		object.setApplicantXcgFileName(objectData.getString("applicantXcgFileName"));
		object.setApplicantXcgFileEntryId(objectData.getLong("applicantXcgFileEntryId"));
		object.setApplicantMetadata(objectData.getString("applicantMetadata"));
		object.setApplicantStatus(objectData.getString("applicantStatus"));

		object = vrApplicantProfilePersistence.update(object);

		return object;
	}
	
	private Log _log = LogFactoryUtil.getLog(VRApplicantProfileLocalServiceImpl.class);

}