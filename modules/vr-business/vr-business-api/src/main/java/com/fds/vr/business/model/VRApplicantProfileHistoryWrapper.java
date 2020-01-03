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
 * This class is a wrapper for {@link VRApplicantProfileHistory}.
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfileHistory
 * @generated
 */
@ProviderType
public class VRApplicantProfileHistoryWrapper
	implements VRApplicantProfileHistory,
		ModelWrapper<VRApplicantProfileHistory> {
	public VRApplicantProfileHistoryWrapper(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		_vrApplicantProfileHistory = vrApplicantProfileHistory;
	}

	@Override
	public Class<?> getModelClass() {
		return VRApplicantProfileHistory.class;
	}

	@Override
	public String getModelClassName() {
		return VRApplicantProfileHistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantRepresentative", getApplicantRepresentative());
		attributes.put("applicantRepresentativeTitle",
			getApplicantRepresentativeTitle());
		attributes.put("applicantPhone", getApplicantPhone());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantFax", getApplicantFax());
		attributes.put("applicantContactName", getApplicantContactName());
		attributes.put("applicantContactEmail", getApplicantContactEmail());
		attributes.put("applicantContactPhone", getApplicantContactPhone());
		attributes.put("applicantNationality", getApplicantNationality());
		attributes.put("applicantRegion", getApplicantRegion());
		attributes.put("applicantCeremonyDate", getApplicantCeremonyDate());
		attributes.put("applicantOperationPeriod", getApplicantOperationPeriod());
		attributes.put("applicantBusinessType", getApplicantBusinessType());
		attributes.put("applicantMetadata", getApplicantMetadata());
		attributes.put("applicantStatus", getApplicantStatus());
		attributes.put("applicantIssueType", getApplicantIssueType());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String applicantCode = (String)attributes.get("applicantCode");

		if (applicantCode != null) {
			setApplicantCode(applicantCode);
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

		String applicantPhone = (String)attributes.get("applicantPhone");

		if (applicantPhone != null) {
			setApplicantPhone(applicantPhone);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
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

		String applicantNationality = (String)attributes.get(
				"applicantNationality");

		if (applicantNationality != null) {
			setApplicantNationality(applicantNationality);
		}

		String applicantRegion = (String)attributes.get("applicantRegion");

		if (applicantRegion != null) {
			setApplicantRegion(applicantRegion);
		}

		String applicantCeremonyDate = (String)attributes.get(
				"applicantCeremonyDate");

		if (applicantCeremonyDate != null) {
			setApplicantCeremonyDate(applicantCeremonyDate);
		}

		String applicantOperationPeriod = (String)attributes.get(
				"applicantOperationPeriod");

		if (applicantOperationPeriod != null) {
			setApplicantOperationPeriod(applicantOperationPeriod);
		}

		String applicantBusinessType = (String)attributes.get(
				"applicantBusinessType");

		if (applicantBusinessType != null) {
			setApplicantBusinessType(applicantBusinessType);
		}

		String applicantMetadata = (String)attributes.get("applicantMetadata");

		if (applicantMetadata != null) {
			setApplicantMetadata(applicantMetadata);
		}

		String applicantStatus = (String)attributes.get("applicantStatus");

		if (applicantStatus != null) {
			setApplicantStatus(applicantStatus);
		}

		String applicantIssueType = (String)attributes.get("applicantIssueType");

		if (applicantIssueType != null) {
			setApplicantIssueType(applicantIssueType);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRApplicantProfileHistory toEscapedModel() {
		return new VRApplicantProfileHistoryWrapper(_vrApplicantProfileHistory.toEscapedModel());
	}

	@Override
	public VRApplicantProfileHistory toUnescapedModel() {
		return new VRApplicantProfileHistoryWrapper(_vrApplicantProfileHistory.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrApplicantProfileHistory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrApplicantProfileHistory.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrApplicantProfileHistory.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrApplicantProfileHistory.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRApplicantProfileHistory> toCacheModel() {
		return _vrApplicantProfileHistory.toCacheModel();
	}

	@Override
	public int compareTo(VRApplicantProfileHistory vrApplicantProfileHistory) {
		return _vrApplicantProfileHistory.compareTo(vrApplicantProfileHistory);
	}

	@Override
	public int hashCode() {
		return _vrApplicantProfileHistory.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrApplicantProfileHistory.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRApplicantProfileHistoryWrapper((VRApplicantProfileHistory)_vrApplicantProfileHistory.clone());
	}

	/**
	* Returns the applicant address of this vr applicant profile history.
	*
	* @return the applicant address of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrApplicantProfileHistory.getApplicantAddress();
	}

	/**
	* Returns the applicant business type of this vr applicant profile history.
	*
	* @return the applicant business type of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantBusinessType() {
		return _vrApplicantProfileHistory.getApplicantBusinessType();
	}

	/**
	* Returns the applicant ceremony date of this vr applicant profile history.
	*
	* @return the applicant ceremony date of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantCeremonyDate() {
		return _vrApplicantProfileHistory.getApplicantCeremonyDate();
	}

	/**
	* Returns the applicant code of this vr applicant profile history.
	*
	* @return the applicant code of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrApplicantProfileHistory.getApplicantCode();
	}

	/**
	* Returns the applicant contact email of this vr applicant profile history.
	*
	* @return the applicant contact email of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantContactEmail() {
		return _vrApplicantProfileHistory.getApplicantContactEmail();
	}

	/**
	* Returns the applicant contact name of this vr applicant profile history.
	*
	* @return the applicant contact name of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantContactName() {
		return _vrApplicantProfileHistory.getApplicantContactName();
	}

	/**
	* Returns the applicant contact phone of this vr applicant profile history.
	*
	* @return the applicant contact phone of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantContactPhone() {
		return _vrApplicantProfileHistory.getApplicantContactPhone();
	}

	/**
	* Returns the applicant email of this vr applicant profile history.
	*
	* @return the applicant email of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantEmail() {
		return _vrApplicantProfileHistory.getApplicantEmail();
	}

	/**
	* Returns the applicant fax of this vr applicant profile history.
	*
	* @return the applicant fax of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantFax() {
		return _vrApplicantProfileHistory.getApplicantFax();
	}

	/**
	* Returns the applicant issue type of this vr applicant profile history.
	*
	* @return the applicant issue type of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantIssueType() {
		return _vrApplicantProfileHistory.getApplicantIssueType();
	}

	/**
	* Returns the applicant metadata of this vr applicant profile history.
	*
	* @return the applicant metadata of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantMetadata() {
		return _vrApplicantProfileHistory.getApplicantMetadata();
	}

	/**
	* Returns the applicant name of this vr applicant profile history.
	*
	* @return the applicant name of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrApplicantProfileHistory.getApplicantName();
	}

	/**
	* Returns the applicant nationality of this vr applicant profile history.
	*
	* @return the applicant nationality of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantNationality() {
		return _vrApplicantProfileHistory.getApplicantNationality();
	}

	/**
	* Returns the applicant operation period of this vr applicant profile history.
	*
	* @return the applicant operation period of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantOperationPeriod() {
		return _vrApplicantProfileHistory.getApplicantOperationPeriod();
	}

	/**
	* Returns the applicant phone of this vr applicant profile history.
	*
	* @return the applicant phone of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantPhone() {
		return _vrApplicantProfileHistory.getApplicantPhone();
	}

	/**
	* Returns the applicant region of this vr applicant profile history.
	*
	* @return the applicant region of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantRegion() {
		return _vrApplicantProfileHistory.getApplicantRegion();
	}

	/**
	* Returns the applicant representative of this vr applicant profile history.
	*
	* @return the applicant representative of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantRepresentative() {
		return _vrApplicantProfileHistory.getApplicantRepresentative();
	}

	/**
	* Returns the applicant representative title of this vr applicant profile history.
	*
	* @return the applicant representative title of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantRepresentativeTitle() {
		return _vrApplicantProfileHistory.getApplicantRepresentativeTitle();
	}

	/**
	* Returns the applicant status of this vr applicant profile history.
	*
	* @return the applicant status of this vr applicant profile history
	*/
	@Override
	public java.lang.String getApplicantStatus() {
		return _vrApplicantProfileHistory.getApplicantStatus();
	}

	@Override
	public java.lang.String toString() {
		return _vrApplicantProfileHistory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrApplicantProfileHistory.toXmlString();
	}

	/**
	* Returns the modify date of this vr applicant profile history.
	*
	* @return the modify date of this vr applicant profile history
	*/
	@Override
	public Date getModifyDate() {
		return _vrApplicantProfileHistory.getModifyDate();
	}

	/**
	* Returns the sync date of this vr applicant profile history.
	*
	* @return the sync date of this vr applicant profile history
	*/
	@Override
	public Date getSyncDate() {
		return _vrApplicantProfileHistory.getSyncDate();
	}

	/**
	* Returns the ID of this vr applicant profile history.
	*
	* @return the ID of this vr applicant profile history
	*/
	@Override
	public long getId() {
		return _vrApplicantProfileHistory.getId();
	}

	/**
	* Returns the primary key of this vr applicant profile history.
	*
	* @return the primary key of this vr applicant profile history
	*/
	@Override
	public long getPrimaryKey() {
		return _vrApplicantProfileHistory.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrApplicantProfileHistory.persist();
	}

	/**
	* Sets the applicant address of this vr applicant profile history.
	*
	* @param applicantAddress the applicant address of this vr applicant profile history
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrApplicantProfileHistory.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant business type of this vr applicant profile history.
	*
	* @param applicantBusinessType the applicant business type of this vr applicant profile history
	*/
	@Override
	public void setApplicantBusinessType(java.lang.String applicantBusinessType) {
		_vrApplicantProfileHistory.setApplicantBusinessType(applicantBusinessType);
	}

	/**
	* Sets the applicant ceremony date of this vr applicant profile history.
	*
	* @param applicantCeremonyDate the applicant ceremony date of this vr applicant profile history
	*/
	@Override
	public void setApplicantCeremonyDate(java.lang.String applicantCeremonyDate) {
		_vrApplicantProfileHistory.setApplicantCeremonyDate(applicantCeremonyDate);
	}

	/**
	* Sets the applicant code of this vr applicant profile history.
	*
	* @param applicantCode the applicant code of this vr applicant profile history
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrApplicantProfileHistory.setApplicantCode(applicantCode);
	}

	/**
	* Sets the applicant contact email of this vr applicant profile history.
	*
	* @param applicantContactEmail the applicant contact email of this vr applicant profile history
	*/
	@Override
	public void setApplicantContactEmail(java.lang.String applicantContactEmail) {
		_vrApplicantProfileHistory.setApplicantContactEmail(applicantContactEmail);
	}

	/**
	* Sets the applicant contact name of this vr applicant profile history.
	*
	* @param applicantContactName the applicant contact name of this vr applicant profile history
	*/
	@Override
	public void setApplicantContactName(java.lang.String applicantContactName) {
		_vrApplicantProfileHistory.setApplicantContactName(applicantContactName);
	}

	/**
	* Sets the applicant contact phone of this vr applicant profile history.
	*
	* @param applicantContactPhone the applicant contact phone of this vr applicant profile history
	*/
	@Override
	public void setApplicantContactPhone(java.lang.String applicantContactPhone) {
		_vrApplicantProfileHistory.setApplicantContactPhone(applicantContactPhone);
	}

	/**
	* Sets the applicant email of this vr applicant profile history.
	*
	* @param applicantEmail the applicant email of this vr applicant profile history
	*/
	@Override
	public void setApplicantEmail(java.lang.String applicantEmail) {
		_vrApplicantProfileHistory.setApplicantEmail(applicantEmail);
	}

	/**
	* Sets the applicant fax of this vr applicant profile history.
	*
	* @param applicantFax the applicant fax of this vr applicant profile history
	*/
	@Override
	public void setApplicantFax(java.lang.String applicantFax) {
		_vrApplicantProfileHistory.setApplicantFax(applicantFax);
	}

	/**
	* Sets the applicant issue type of this vr applicant profile history.
	*
	* @param applicantIssueType the applicant issue type of this vr applicant profile history
	*/
	@Override
	public void setApplicantIssueType(java.lang.String applicantIssueType) {
		_vrApplicantProfileHistory.setApplicantIssueType(applicantIssueType);
	}

	/**
	* Sets the applicant metadata of this vr applicant profile history.
	*
	* @param applicantMetadata the applicant metadata of this vr applicant profile history
	*/
	@Override
	public void setApplicantMetadata(java.lang.String applicantMetadata) {
		_vrApplicantProfileHistory.setApplicantMetadata(applicantMetadata);
	}

	/**
	* Sets the applicant name of this vr applicant profile history.
	*
	* @param applicantName the applicant name of this vr applicant profile history
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrApplicantProfileHistory.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant nationality of this vr applicant profile history.
	*
	* @param applicantNationality the applicant nationality of this vr applicant profile history
	*/
	@Override
	public void setApplicantNationality(java.lang.String applicantNationality) {
		_vrApplicantProfileHistory.setApplicantNationality(applicantNationality);
	}

	/**
	* Sets the applicant operation period of this vr applicant profile history.
	*
	* @param applicantOperationPeriod the applicant operation period of this vr applicant profile history
	*/
	@Override
	public void setApplicantOperationPeriod(
		java.lang.String applicantOperationPeriod) {
		_vrApplicantProfileHistory.setApplicantOperationPeriod(applicantOperationPeriod);
	}

	/**
	* Sets the applicant phone of this vr applicant profile history.
	*
	* @param applicantPhone the applicant phone of this vr applicant profile history
	*/
	@Override
	public void setApplicantPhone(java.lang.String applicantPhone) {
		_vrApplicantProfileHistory.setApplicantPhone(applicantPhone);
	}

	/**
	* Sets the applicant region of this vr applicant profile history.
	*
	* @param applicantRegion the applicant region of this vr applicant profile history
	*/
	@Override
	public void setApplicantRegion(java.lang.String applicantRegion) {
		_vrApplicantProfileHistory.setApplicantRegion(applicantRegion);
	}

	/**
	* Sets the applicant representative of this vr applicant profile history.
	*
	* @param applicantRepresentative the applicant representative of this vr applicant profile history
	*/
	@Override
	public void setApplicantRepresentative(
		java.lang.String applicantRepresentative) {
		_vrApplicantProfileHistory.setApplicantRepresentative(applicantRepresentative);
	}

	/**
	* Sets the applicant representative title of this vr applicant profile history.
	*
	* @param applicantRepresentativeTitle the applicant representative title of this vr applicant profile history
	*/
	@Override
	public void setApplicantRepresentativeTitle(
		java.lang.String applicantRepresentativeTitle) {
		_vrApplicantProfileHistory.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
	}

	/**
	* Sets the applicant status of this vr applicant profile history.
	*
	* @param applicantStatus the applicant status of this vr applicant profile history
	*/
	@Override
	public void setApplicantStatus(java.lang.String applicantStatus) {
		_vrApplicantProfileHistory.setApplicantStatus(applicantStatus);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrApplicantProfileHistory.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrApplicantProfileHistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrApplicantProfileHistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrApplicantProfileHistory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr applicant profile history.
	*
	* @param id the ID of this vr applicant profile history
	*/
	@Override
	public void setId(long id) {
		_vrApplicantProfileHistory.setId(id);
	}

	/**
	* Sets the modify date of this vr applicant profile history.
	*
	* @param modifyDate the modify date of this vr applicant profile history
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrApplicantProfileHistory.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrApplicantProfileHistory.setNew(n);
	}

	/**
	* Sets the primary key of this vr applicant profile history.
	*
	* @param primaryKey the primary key of this vr applicant profile history
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrApplicantProfileHistory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrApplicantProfileHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sync date of this vr applicant profile history.
	*
	* @param syncDate the sync date of this vr applicant profile history
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrApplicantProfileHistory.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRApplicantProfileHistoryWrapper)) {
			return false;
		}

		VRApplicantProfileHistoryWrapper vrApplicantProfileHistoryWrapper = (VRApplicantProfileHistoryWrapper)obj;

		if (Objects.equals(_vrApplicantProfileHistory,
					vrApplicantProfileHistoryWrapper._vrApplicantProfileHistory)) {
			return true;
		}

		return false;
	}

	@Override
	public VRApplicantProfileHistory getWrappedModel() {
		return _vrApplicantProfileHistory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrApplicantProfileHistory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrApplicantProfileHistory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrApplicantProfileHistory.resetOriginalValues();
	}

	private final VRApplicantProfileHistory _vrApplicantProfileHistory;
}