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

import com.fds.vr.business.exception.NoSuchVRApplicantProfileException;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.service.base.VRApplicantProfileLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

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
	
	public VRApplicantProfile updateVRApplicantProfile(VRApplicantProfile object) {

		if (object.getId() <= 0) {

			long id = counterLocalService.increment(VRApplicantProfile.class.getName());

			object = vrApplicantProfilePersistence.create(id);
		}

		return vrApplicantProfilePersistence.update(object);
	}
	
	private Log _log = LogFactoryUtil.getLog(VRApplicantProfileLocalServiceImpl.class);

}