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
import com.fds.vr.business.exception.NoSuchVRIssueException;
import com.fds.vr.business.model.VRIssue;
import com.fds.vr.business.service.base.VRIssueLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr issue local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRIssueLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRIssueLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRIssueLocalServiceUtil
 */
@ProviderType
public class VRIssueLocalServiceImpl extends VRIssueLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRIssueLocalServiceUtil} to access the vr issue local service.
	 */
	
	public List<VRIssue> findBydossierId(long mtCore, long dossierId) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findBydossierId(mtCore, dossierId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}

	public VRIssue findByMT_DID(long mtCore, long dossierId) {
		try {
			return vrIssuePersistence.findByF_MT_DID(mtCore, dossierId);
		} catch (NoSuchVRIssueException e) {
			return null;
		}
	}


	public List<VRIssue> findBystampIssueNo(long mtCore, String stampIssueNo) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findBystampIssueNo(mtCore, stampIssueNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}
	
	public List<VRIssue> findByapplicantProfileId(long mtCore, long dossierId, long applicantProfileId) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findByapplicantProfileId(mtCore, dossierId, applicantProfileId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}
	
	public List<VRIssue> findBycorporationId(long mtCore, String corporationId) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findBycorporationId(mtCore, corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}
	
	public List<VRIssue> findByissueCorporationId(long mtCore, long issueCorporationId) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findByissueCorporationId(mtCore, issueCorporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}
	
	public List<VRIssue> findByverifyCorporationId(long mtCore, String verifyCorporationId) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findByverifyCorporationId(mtCore, verifyCorporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}
	

	public List<VRIssue> findByproductionPlantId(long mtCore, long productionPlantId) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findByproductionPlantId(mtCore, productionPlantId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}
	
	public List<VRIssue> findBycopreportno(long mtCore, String copreportno) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findBycopreportno(mtCore, copreportno);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}
	
	public List<VRIssue> findByIC_IS(long issueCorporationId, int digitalIssueStatus) throws PortalException, SystemException {
		try {
			return vrIssuePersistence.findByIC_IS(issueCorporationId, digitalIssueStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRIssue>();
		
	}

	public VRIssue updateVRIssue(Map<String, String> mapValue, int mtCore, boolean flagExits) throws NoSuchVRIssueException {

		VRIssue object = null;
		if (!flagExits) {
			long idVRIssue = CounterLocalServiceUtil.increment(VRIssue.class.getName());
			object = vrIssuePersistence.create(idVRIssue);
		} else {
			object = vrIssuePersistence.fetchByF_MT_DID(mtCore, Long.valueOf(mapValue.get("dossierId")));
		}
		//
		// create objVRIssue
		object.setModifyDate(new Date());
		object.setSyncDate(new Date());
		
		object.setMtCore(mtCore);
		object.setDossierId(GetterUtil.getLong(mapValue.get("dossierId")));
		object.setStampIssueNo(mapValue.get("stampIssueNo"));
		object.setAppliedDate(ConvertFormatDate.parseStringToDate(mapValue.get("appliedDate"), ConvertFormatDate.PATTERN_DATE)); // phai lay tu dossierstatistics
		object.setApprovedDate(new Date()); // phai lay tu dossierstatistics
		object.setVehicleClass(mapValue.get("issueVehicleClass"));
		object.setApplicantProfileId(GetterUtil.getLong(mapValue.get("applicantProfileId")));
		object.setApplicantName(mapValue.get("applicantName"));
		object.setApplicantAddress(mapValue.get("applicantAddress"));
		object.setApplicantPhone(mapValue.get("applicantPhone"));
		object.setApplicantEmail(mapValue.get("applicantEmail"));
		object.setApplicantFax(mapValue.get("applicantFax"));
		object.setApplicantRepresentative(mapValue.get("applicantRepresentative"));
		object.setApplicantRepresentativeTitle(mapValue.get("applicantRepresentativeTitle"));
		object.setApplicantmaker(mapValue.get("applicantmaker"));
		object.setApplicantchecker(mapValue.get("applicantchecker"));
		object.setApplicantContactName(mapValue.get("applicantContactName"));
		object.setApplicantContactPhone(mapValue.get("applicantContactPhone"));
		object.setApplicantContactEmail(mapValue.get("applicantContactEmail"));
		object.setProductionPlantId(GetterUtil.getLong(mapValue.get("productionPlantId")));
		object.setProductionPlantCode(mapValue.get("productionPlantCode"));
		object.setProductionPlantName(mapValue.get("productionPlantName"));
		object.setProductionPlantAddress(mapValue.get("productionPlantAddress"));
		object.setRemarks(mapValue.get("remarks"));
		
		object.setMethodOfIssue(mapValue.get("methodOfIssue"));
		object.setIssueType(mapValue.get("issueType"));
		object.setTotalInDocument(GetterUtil.getLong(mapValue.get("totalInDocument")));
		object.setAverageSTBQuantity(GetterUtil.getInteger(mapValue.get("averageSTBQuantity")));
		object.setMaxMonthQuantity(GetterUtil.getInteger(mapValue.get("maxMonthQuantity")));
		object.setAverageSTMQuantity(GetterUtil.getInteger(mapValue.get("averageSTMQuantity")));
		object.setAccumulatedMonthQuantity(GetterUtil.getInteger(mapValue.get("accumulatedMonthQuantity")));
		
		object.setTotalInUse(GetterUtil.getInteger(mapValue.get("totalInUse")));
		object.setTotalCancelled(GetterUtil.getInteger(mapValue.get("totalCancelled")));
		object.setTotalLost(GetterUtil.getInteger(mapValue.get("totalLost")));
		object.setTotalNotUsed(GetterUtil.getInteger(mapValue.get("totalNotUsed")));
		object.setTotalReturned(GetterUtil.getInteger(mapValue.get("totalReturned")));
		object.setFlow(mapValue.get("flow"));
		object.setExaminationRequired(mapValue.get("examinationRequired"));
		object.setExaminationPeriod(mapValue.get("examinationPeriod"));
		object.setExaminationLastTime(ConvertFormatDate.parseStringToDate(mapValue.get("examinationLastTime")));
		object.setCopresult(mapValue.get("copresult"));
		object.setCopreportno(mapValue.get("copreportno"));
		object.setCopreportdate(ConvertFormatDate.parseStringToDate(mapValue.get("copreportdate")));
		object.setPostreview(mapValue.get("postreview"));
		object.setPostreviewrecordno(mapValue.get("postreviewrecordno"));
		object.setPostreviewrecorddate(ConvertFormatDate.parseStringToDate(mapValue.get("postreviewrecorddate")));
		object.setCorporationId(mapValue.get("corporationId"));
		//object.setInspectorId(inspectorId"));
		object.setInspectorcode(mapValue.get("inspectorcode"));
		object.setInspectorname(mapValue.get("inspectorname"));
		object.setLeadername(mapValue.get("leadername"));
		object.setIssueCorporationId(GetterUtil.getInteger(mapValue.get("issueCorporationId"))); // Don vi cap phat
		//object.setIssueInspectorId(issueInspectorId"));
		object.setVerifyCorporationId(mapValue.get("verifyCorporationId"));
		//object.setVerifyInspectorId(verifyInspectorId"));
		object.setDigitalissuestatus(GetterUtil.getInteger(mapValue.get("digitalissuestatus")));

		return vrIssuePersistence.update(object);
	}

	public VRIssue updateDigitalIssueStatus(long id, int digitalIssueStatus) throws PortalException {
		VRIssue vrIssue = vrIssuePersistence.findByPrimaryKey(id);
		
		vrIssue.setDigitalissuestatus(digitalIssueStatus);
		vrIssue.setModifyDate(new Date());
		
		return vrIssuePersistence.update(vrIssue);
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrIssueFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrIssueFinder.countData(sql);
	}

	private Log _log = LogFactoryUtil.getLog(VRIssueLocalServiceImpl.class);
}