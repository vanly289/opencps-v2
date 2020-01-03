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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRIssue}.
 * </p>
 *
 * @author LamTV
 * @see VRIssue
 * @generated
 */
@ProviderType
public class VRIssueWrapper implements VRIssue, ModelWrapper<VRIssue> {
	public VRIssueWrapper(VRIssue vrIssue) {
		_vrIssue = vrIssue;
	}

	@Override
	public Class<?> getModelClass() {
		return VRIssue.class;
	}

	@Override
	public String getModelClassName() {
		return VRIssue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dossierId", getDossierId());
		attributes.put("stampIssueNo", getStampIssueNo());
		attributes.put("appliedDate", getAppliedDate());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("applicantProfileId", getApplicantProfileId());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantRepresentative", getApplicantRepresentative());
		attributes.put("applicantRepresentativeTitle",
			getApplicantRepresentativeTitle());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantPhone", getApplicantPhone());
		attributes.put("applicantFax", getApplicantFax());
		attributes.put("applicantContactName", getApplicantContactName());
		attributes.put("applicantContactEmail", getApplicantContactEmail());
		attributes.put("applicantContactPhone", getApplicantContactPhone());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("remarks", getRemarks());
		attributes.put("methodOfIssue", getMethodOfIssue());
		attributes.put("totalInDocument", getTotalInDocument());
		attributes.put("issueCorporationId", getIssueCorporationId());
		attributes.put("verifyCorporationId", getVerifyCorporationId());
		attributes.put("digitalissuestatus", getDigitalissuestatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String stampIssueNo = (String)attributes.get("stampIssueNo");

		if (stampIssueNo != null) {
			setStampIssueNo(stampIssueNo);
		}

		Date appliedDate = (Date)attributes.get("appliedDate");

		if (appliedDate != null) {
			setAppliedDate(appliedDate);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		Long applicantProfileId = (Long)attributes.get("applicantProfileId");

		if (applicantProfileId != null) {
			setApplicantProfileId(applicantProfileId);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantRepresentative = (String)attributes.get(
				"applicantRepresentative");

		if (applicantRepresentative != null) {
			setApplicantRepresentative(applicantRepresentative);
		}

		String applicantRepresentativeTitle = (String)attributes.get(
				"applicantRepresentativeTitle");

		if (applicantRepresentativeTitle != null) {
			setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
		}

		String applicantPhone = (String)attributes.get("applicantPhone");

		if (applicantPhone != null) {
			setApplicantPhone(applicantPhone);
		}

		String applicantFax = (String)attributes.get("applicantFax");

		if (applicantFax != null) {
			setApplicantFax(applicantFax);
		}

		String applicantContactName = (String)attributes.get(
				"applicantContactName");

		if (applicantContactName != null) {
			setApplicantContactName(applicantContactName);
		}

		String applicantContactEmail = (String)attributes.get(
				"applicantContactEmail");

		if (applicantContactEmail != null) {
			setApplicantContactEmail(applicantContactEmail);
		}

		String applicantContactPhone = (String)attributes.get(
				"applicantContactPhone");

		if (applicantContactPhone != null) {
			setApplicantContactPhone(applicantContactPhone);
		}

		Long productionPlantId = (Long)attributes.get("productionPlantId");

		if (productionPlantId != null) {
			setProductionPlantId(productionPlantId);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		String productionPlantName = (String)attributes.get(
				"productionPlantName");

		if (productionPlantName != null) {
			setProductionPlantName(productionPlantName);
		}

		String productionPlantAddress = (String)attributes.get(
				"productionPlantAddress");

		if (productionPlantAddress != null) {
			setProductionPlantAddress(productionPlantAddress);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String methodOfIssue = (String)attributes.get("methodOfIssue");

		if (methodOfIssue != null) {
			setMethodOfIssue(methodOfIssue);
		}

		Long totalInDocument = (Long)attributes.get("totalInDocument");

		if (totalInDocument != null) {
			setTotalInDocument(totalInDocument);
		}

		String issueCorporationId = (String)attributes.get("issueCorporationId");

		if (issueCorporationId != null) {
			setIssueCorporationId(issueCorporationId);
		}

		String verifyCorporationId = (String)attributes.get(
				"verifyCorporationId");

		if (verifyCorporationId != null) {
			setVerifyCorporationId(verifyCorporationId);
		}

		String digitalissuestatus = (String)attributes.get("digitalissuestatus");

		if (digitalissuestatus != null) {
			setDigitalissuestatus(digitalissuestatus);
		}
	}

	@Override
	public VRIssue toEscapedModel() {
		return new VRIssueWrapper(_vrIssue.toEscapedModel());
	}

	@Override
	public VRIssue toUnescapedModel() {
		return new VRIssueWrapper(_vrIssue.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrIssue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrIssue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrIssue.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrIssue.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRIssue> toCacheModel() {
		return _vrIssue.toCacheModel();
	}

	@Override
	public int compareTo(VRIssue vrIssue) {
		return _vrIssue.compareTo(vrIssue);
	}

	@Override
	public int hashCode() {
		return _vrIssue.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrIssue.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRIssueWrapper((VRIssue)_vrIssue.clone());
	}

	/**
	* Returns the applicant address of this vr issue.
	*
	* @return the applicant address of this vr issue
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrIssue.getApplicantAddress();
	}

	/**
	* Returns the applicant contact email of this vr issue.
	*
	* @return the applicant contact email of this vr issue
	*/
	@Override
	public java.lang.String getApplicantContactEmail() {
		return _vrIssue.getApplicantContactEmail();
	}

	/**
	* Returns the applicant contact name of this vr issue.
	*
	* @return the applicant contact name of this vr issue
	*/
	@Override
	public java.lang.String getApplicantContactName() {
		return _vrIssue.getApplicantContactName();
	}

	/**
	* Returns the applicant contact phone of this vr issue.
	*
	* @return the applicant contact phone of this vr issue
	*/
	@Override
	public java.lang.String getApplicantContactPhone() {
		return _vrIssue.getApplicantContactPhone();
	}

	/**
	* Returns the applicant email of this vr issue.
	*
	* @return the applicant email of this vr issue
	*/
	@Override
	public java.lang.String getApplicantEmail() {
		return _vrIssue.getApplicantEmail();
	}

	/**
	* Returns the applicant fax of this vr issue.
	*
	* @return the applicant fax of this vr issue
	*/
	@Override
	public java.lang.String getApplicantFax() {
		return _vrIssue.getApplicantFax();
	}

	/**
	* Returns the applicant name of this vr issue.
	*
	* @return the applicant name of this vr issue
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrIssue.getApplicantName();
	}

	/**
	* Returns the applicant phone of this vr issue.
	*
	* @return the applicant phone of this vr issue
	*/
	@Override
	public java.lang.String getApplicantPhone() {
		return _vrIssue.getApplicantPhone();
	}

	/**
	* Returns the applicant representative of this vr issue.
	*
	* @return the applicant representative of this vr issue
	*/
	@Override
	public java.lang.String getApplicantRepresentative() {
		return _vrIssue.getApplicantRepresentative();
	}

	/**
	* Returns the applicant representative title of this vr issue.
	*
	* @return the applicant representative title of this vr issue
	*/
	@Override
	public java.lang.String getApplicantRepresentativeTitle() {
		return _vrIssue.getApplicantRepresentativeTitle();
	}

	/**
	* Returns the digitalissuestatus of this vr issue.
	*
	* @return the digitalissuestatus of this vr issue
	*/
	@Override
	public java.lang.String getDigitalissuestatus() {
		return _vrIssue.getDigitalissuestatus();
	}

	/**
	* Returns the issue corporation ID of this vr issue.
	*
	* @return the issue corporation ID of this vr issue
	*/
	@Override
	public java.lang.String getIssueCorporationId() {
		return _vrIssue.getIssueCorporationId();
	}

	/**
	* Returns the method of issue of this vr issue.
	*
	* @return the method of issue of this vr issue
	*/
	@Override
	public java.lang.String getMethodOfIssue() {
		return _vrIssue.getMethodOfIssue();
	}

	/**
	* Returns the production plant address of this vr issue.
	*
	* @return the production plant address of this vr issue
	*/
	@Override
	public java.lang.String getProductionPlantAddress() {
		return _vrIssue.getProductionPlantAddress();
	}

	/**
	* Returns the production plant code of this vr issue.
	*
	* @return the production plant code of this vr issue
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrIssue.getProductionPlantCode();
	}

	/**
	* Returns the production plant name of this vr issue.
	*
	* @return the production plant name of this vr issue
	*/
	@Override
	public java.lang.String getProductionPlantName() {
		return _vrIssue.getProductionPlantName();
	}

	/**
	* Returns the remarks of this vr issue.
	*
	* @return the remarks of this vr issue
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrIssue.getRemarks();
	}

	/**
	* Returns the stamp issue no of this vr issue.
	*
	* @return the stamp issue no of this vr issue
	*/
	@Override
	public java.lang.String getStampIssueNo() {
		return _vrIssue.getStampIssueNo();
	}

	/**
	* Returns the vehicle class of this vr issue.
	*
	* @return the vehicle class of this vr issue
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrIssue.getVehicleClass();
	}

	/**
	* Returns the verify corporation ID of this vr issue.
	*
	* @return the verify corporation ID of this vr issue
	*/
	@Override
	public java.lang.String getVerifyCorporationId() {
		return _vrIssue.getVerifyCorporationId();
	}

	@Override
	public java.lang.String toString() {
		return _vrIssue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrIssue.toXmlString();
	}

	/**
	* Returns the applied date of this vr issue.
	*
	* @return the applied date of this vr issue
	*/
	@Override
	public Date getAppliedDate() {
		return _vrIssue.getAppliedDate();
	}

	/**
	* Returns the approved date of this vr issue.
	*
	* @return the approved date of this vr issue
	*/
	@Override
	public Date getApprovedDate() {
		return _vrIssue.getApprovedDate();
	}

	/**
	* Returns the applicant profile ID of this vr issue.
	*
	* @return the applicant profile ID of this vr issue
	*/
	@Override
	public long getApplicantProfileId() {
		return _vrIssue.getApplicantProfileId();
	}

	/**
	* Returns the dossier ID of this vr issue.
	*
	* @return the dossier ID of this vr issue
	*/
	@Override
	public long getDossierId() {
		return _vrIssue.getDossierId();
	}

	/**
	* Returns the ID of this vr issue.
	*
	* @return the ID of this vr issue
	*/
	@Override
	public long getId() {
		return _vrIssue.getId();
	}

	/**
	* Returns the primary key of this vr issue.
	*
	* @return the primary key of this vr issue
	*/
	@Override
	public long getPrimaryKey() {
		return _vrIssue.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vr issue.
	*
	* @return the production plant ID of this vr issue
	*/
	@Override
	public long getProductionPlantId() {
		return _vrIssue.getProductionPlantId();
	}

	/**
	* Returns the total in document of this vr issue.
	*
	* @return the total in document of this vr issue
	*/
	@Override
	public long getTotalInDocument() {
		return _vrIssue.getTotalInDocument();
	}

	@Override
	public void persist() {
		_vrIssue.persist();
	}

	/**
	* Sets the applicant address of this vr issue.
	*
	* @param applicantAddress the applicant address of this vr issue
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrIssue.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant contact email of this vr issue.
	*
	* @param applicantContactEmail the applicant contact email of this vr issue
	*/
	@Override
	public void setApplicantContactEmail(java.lang.String applicantContactEmail) {
		_vrIssue.setApplicantContactEmail(applicantContactEmail);
	}

	/**
	* Sets the applicant contact name of this vr issue.
	*
	* @param applicantContactName the applicant contact name of this vr issue
	*/
	@Override
	public void setApplicantContactName(java.lang.String applicantContactName) {
		_vrIssue.setApplicantContactName(applicantContactName);
	}

	/**
	* Sets the applicant contact phone of this vr issue.
	*
	* @param applicantContactPhone the applicant contact phone of this vr issue
	*/
	@Override
	public void setApplicantContactPhone(java.lang.String applicantContactPhone) {
		_vrIssue.setApplicantContactPhone(applicantContactPhone);
	}

	/**
	* Sets the applicant email of this vr issue.
	*
	* @param applicantEmail the applicant email of this vr issue
	*/
	@Override
	public void setApplicantEmail(java.lang.String applicantEmail) {
		_vrIssue.setApplicantEmail(applicantEmail);
	}

	/**
	* Sets the applicant fax of this vr issue.
	*
	* @param applicantFax the applicant fax of this vr issue
	*/
	@Override
	public void setApplicantFax(java.lang.String applicantFax) {
		_vrIssue.setApplicantFax(applicantFax);
	}

	/**
	* Sets the applicant name of this vr issue.
	*
	* @param applicantName the applicant name of this vr issue
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrIssue.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant phone of this vr issue.
	*
	* @param applicantPhone the applicant phone of this vr issue
	*/
	@Override
	public void setApplicantPhone(java.lang.String applicantPhone) {
		_vrIssue.setApplicantPhone(applicantPhone);
	}

	/**
	* Sets the applicant profile ID of this vr issue.
	*
	* @param applicantProfileId the applicant profile ID of this vr issue
	*/
	@Override
	public void setApplicantProfileId(long applicantProfileId) {
		_vrIssue.setApplicantProfileId(applicantProfileId);
	}

	/**
	* Sets the applicant representative of this vr issue.
	*
	* @param applicantRepresentative the applicant representative of this vr issue
	*/
	@Override
	public void setApplicantRepresentative(
		java.lang.String applicantRepresentative) {
		_vrIssue.setApplicantRepresentative(applicantRepresentative);
	}

	/**
	* Sets the applicant representative title of this vr issue.
	*
	* @param applicantRepresentativeTitle the applicant representative title of this vr issue
	*/
	@Override
	public void setApplicantRepresentativeTitle(
		java.lang.String applicantRepresentativeTitle) {
		_vrIssue.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
	}

	/**
	* Sets the applied date of this vr issue.
	*
	* @param appliedDate the applied date of this vr issue
	*/
	@Override
	public void setAppliedDate(Date appliedDate) {
		_vrIssue.setAppliedDate(appliedDate);
	}

	/**
	* Sets the approved date of this vr issue.
	*
	* @param approvedDate the approved date of this vr issue
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_vrIssue.setApprovedDate(approvedDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrIssue.setCachedModel(cachedModel);
	}

	/**
	* Sets the digitalissuestatus of this vr issue.
	*
	* @param digitalissuestatus the digitalissuestatus of this vr issue
	*/
	@Override
	public void setDigitalissuestatus(java.lang.String digitalissuestatus) {
		_vrIssue.setDigitalissuestatus(digitalissuestatus);
	}

	/**
	* Sets the dossier ID of this vr issue.
	*
	* @param dossierId the dossier ID of this vr issue
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrIssue.setDossierId(dossierId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrIssue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrIssue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrIssue.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr issue.
	*
	* @param id the ID of this vr issue
	*/
	@Override
	public void setId(long id) {
		_vrIssue.setId(id);
	}

	/**
	* Sets the issue corporation ID of this vr issue.
	*
	* @param issueCorporationId the issue corporation ID of this vr issue
	*/
	@Override
	public void setIssueCorporationId(java.lang.String issueCorporationId) {
		_vrIssue.setIssueCorporationId(issueCorporationId);
	}

	/**
	* Sets the method of issue of this vr issue.
	*
	* @param methodOfIssue the method of issue of this vr issue
	*/
	@Override
	public void setMethodOfIssue(java.lang.String methodOfIssue) {
		_vrIssue.setMethodOfIssue(methodOfIssue);
	}

	@Override
	public void setNew(boolean n) {
		_vrIssue.setNew(n);
	}

	/**
	* Sets the primary key of this vr issue.
	*
	* @param primaryKey the primary key of this vr issue
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrIssue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrIssue.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant address of this vr issue.
	*
	* @param productionPlantAddress the production plant address of this vr issue
	*/
	@Override
	public void setProductionPlantAddress(
		java.lang.String productionPlantAddress) {
		_vrIssue.setProductionPlantAddress(productionPlantAddress);
	}

	/**
	* Sets the production plant code of this vr issue.
	*
	* @param productionPlantCode the production plant code of this vr issue
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrIssue.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vr issue.
	*
	* @param productionPlantId the production plant ID of this vr issue
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrIssue.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the production plant name of this vr issue.
	*
	* @param productionPlantName the production plant name of this vr issue
	*/
	@Override
	public void setProductionPlantName(java.lang.String productionPlantName) {
		_vrIssue.setProductionPlantName(productionPlantName);
	}

	/**
	* Sets the remarks of this vr issue.
	*
	* @param remarks the remarks of this vr issue
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrIssue.setRemarks(remarks);
	}

	/**
	* Sets the stamp issue no of this vr issue.
	*
	* @param stampIssueNo the stamp issue no of this vr issue
	*/
	@Override
	public void setStampIssueNo(java.lang.String stampIssueNo) {
		_vrIssue.setStampIssueNo(stampIssueNo);
	}

	/**
	* Sets the total in document of this vr issue.
	*
	* @param totalInDocument the total in document of this vr issue
	*/
	@Override
	public void setTotalInDocument(long totalInDocument) {
		_vrIssue.setTotalInDocument(totalInDocument);
	}

	/**
	* Sets the vehicle class of this vr issue.
	*
	* @param vehicleClass the vehicle class of this vr issue
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrIssue.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the verify corporation ID of this vr issue.
	*
	* @param verifyCorporationId the verify corporation ID of this vr issue
	*/
	@Override
	public void setVerifyCorporationId(java.lang.String verifyCorporationId) {
		_vrIssue.setVerifyCorporationId(verifyCorporationId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueWrapper)) {
			return false;
		}

		VRIssueWrapper vrIssueWrapper = (VRIssueWrapper)obj;

		if (Objects.equals(_vrIssue, vrIssueWrapper._vrIssue)) {
			return true;
		}

		return false;
	}

	@Override
	public VRIssue getWrappedModel() {
		return _vrIssue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrIssue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrIssue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrIssue.resetOriginalValues();
	}

	private final VRIssue _vrIssue;
}