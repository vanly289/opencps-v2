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

package com.fds.vr.cop.model;

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
 * This class is a wrapper for {@link VRCOPReportRepository}.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPReportRepository
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryWrapper implements VRCOPReportRepository,
	ModelWrapper<VRCOPReportRepository> {
	public VRCOPReportRepositoryWrapper(
		VRCOPReportRepository vrcopReportRepository) {
		_vrcopReportRepository = vrcopReportRepository;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPReportRepository.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPReportRepository.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("applicantProfileId", getApplicantProfileId());
		attributes.put("applicantCode", getApplicantCode());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("overseasManufacturerCode", getOverseasManufacturerCode());
		attributes.put("overseasManufacturerName", getOverseasManufacturerName());
		attributes.put("overseasManufacturerAddress",
			getOverseasManufacturerAddress());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("COPReportNo", getCOPReportNo());
		attributes.put("COPReportStatus", getCOPReportStatus());
		attributes.put("COPReportType", getCOPReportType());
		attributes.put("COPReportMetadata", getCOPReportMetadata());
		attributes.put("COPReportSignName", getCOPReportSignName());
		attributes.put("COPReportSignTitle", getCOPReportSignTitle());
		attributes.put("COPReportSignPlace", getCOPReportSignPlace());
		attributes.put("COPReportDate", getCOPReportDate());
		attributes.put("COPReportApprovedDate", getCOPReportApprovedDate());
		attributes.put("COPReportExpiredDate", getCOPReportExpiredDate());
		attributes.put("COPFileEntryId", getCOPFileEntryId());
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

		Integer mtCore = (Integer)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long applicantProfileId = (Long)attributes.get("applicantProfileId");

		if (applicantProfileId != null) {
			setApplicantProfileId(applicantProfileId);
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

		String overseasManufacturerCode = (String)attributes.get(
				"overseasManufacturerCode");

		if (overseasManufacturerCode != null) {
			setOverseasManufacturerCode(overseasManufacturerCode);
		}

		String overseasManufacturerName = (String)attributes.get(
				"overseasManufacturerName");

		if (overseasManufacturerName != null) {
			setOverseasManufacturerName(overseasManufacturerName);
		}

		String overseasManufacturerAddress = (String)attributes.get(
				"overseasManufacturerAddress");

		if (overseasManufacturerAddress != null) {
			setOverseasManufacturerAddress(overseasManufacturerAddress);
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

		String COPReportNo = (String)attributes.get("COPReportNo");

		if (COPReportNo != null) {
			setCOPReportNo(COPReportNo);
		}

		String COPReportStatus = (String)attributes.get("COPReportStatus");

		if (COPReportStatus != null) {
			setCOPReportStatus(COPReportStatus);
		}

		String COPReportType = (String)attributes.get("COPReportType");

		if (COPReportType != null) {
			setCOPReportType(COPReportType);
		}

		String COPReportMetadata = (String)attributes.get("COPReportMetadata");

		if (COPReportMetadata != null) {
			setCOPReportMetadata(COPReportMetadata);
		}

		String COPReportSignName = (String)attributes.get("COPReportSignName");

		if (COPReportSignName != null) {
			setCOPReportSignName(COPReportSignName);
		}

		String COPReportSignTitle = (String)attributes.get("COPReportSignTitle");

		if (COPReportSignTitle != null) {
			setCOPReportSignTitle(COPReportSignTitle);
		}

		String COPReportSignPlace = (String)attributes.get("COPReportSignPlace");

		if (COPReportSignPlace != null) {
			setCOPReportSignPlace(COPReportSignPlace);
		}

		Date COPReportDate = (Date)attributes.get("COPReportDate");

		if (COPReportDate != null) {
			setCOPReportDate(COPReportDate);
		}

		Date COPReportApprovedDate = (Date)attributes.get(
				"COPReportApprovedDate");

		if (COPReportApprovedDate != null) {
			setCOPReportApprovedDate(COPReportApprovedDate);
		}

		Date COPReportExpiredDate = (Date)attributes.get("COPReportExpiredDate");

		if (COPReportExpiredDate != null) {
			setCOPReportExpiredDate(COPReportExpiredDate);
		}

		Long COPFileEntryId = (Long)attributes.get("COPFileEntryId");

		if (COPFileEntryId != null) {
			setCOPFileEntryId(COPFileEntryId);
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
	public VRCOPReportRepository toEscapedModel() {
		return new VRCOPReportRepositoryWrapper(_vrcopReportRepository.toEscapedModel());
	}

	@Override
	public VRCOPReportRepository toUnescapedModel() {
		return new VRCOPReportRepositoryWrapper(_vrcopReportRepository.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopReportRepository.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopReportRepository.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopReportRepository.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopReportRepository.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPReportRepository> toCacheModel() {
		return _vrcopReportRepository.toCacheModel();
	}

	@Override
	public int compareTo(VRCOPReportRepository vrcopReportRepository) {
		return _vrcopReportRepository.compareTo(vrcopReportRepository);
	}

	/**
	* Returns the mt core of this vrcop report repository.
	*
	* @return the mt core of this vrcop report repository
	*/
	@Override
	public int getMtCore() {
		return _vrcopReportRepository.getMtCore();
	}

	@Override
	public int hashCode() {
		return _vrcopReportRepository.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopReportRepository.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPReportRepositoryWrapper((VRCOPReportRepository)_vrcopReportRepository.clone());
	}

	/**
	* Returns the applicant address of this vrcop report repository.
	*
	* @return the applicant address of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _vrcopReportRepository.getApplicantAddress();
	}

	/**
	* Returns the applicant code of this vrcop report repository.
	*
	* @return the applicant code of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantCode() {
		return _vrcopReportRepository.getApplicantCode();
	}

	/**
	* Returns the applicant name of this vrcop report repository.
	*
	* @return the applicant name of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _vrcopReportRepository.getApplicantName();
	}

	/**
	* Returns the cop report metadata of this vrcop report repository.
	*
	* @return the cop report metadata of this vrcop report repository
	*/
	@Override
	public java.lang.String getCOPReportMetadata() {
		return _vrcopReportRepository.getCOPReportMetadata();
	}

	/**
	* Returns the cop report no of this vrcop report repository.
	*
	* @return the cop report no of this vrcop report repository
	*/
	@Override
	public java.lang.String getCOPReportNo() {
		return _vrcopReportRepository.getCOPReportNo();
	}

	/**
	* Returns the cop report sign name of this vrcop report repository.
	*
	* @return the cop report sign name of this vrcop report repository
	*/
	@Override
	public java.lang.String getCOPReportSignName() {
		return _vrcopReportRepository.getCOPReportSignName();
	}

	/**
	* Returns the cop report sign place of this vrcop report repository.
	*
	* @return the cop report sign place of this vrcop report repository
	*/
	@Override
	public java.lang.String getCOPReportSignPlace() {
		return _vrcopReportRepository.getCOPReportSignPlace();
	}

	/**
	* Returns the cop report sign title of this vrcop report repository.
	*
	* @return the cop report sign title of this vrcop report repository
	*/
	@Override
	public java.lang.String getCOPReportSignTitle() {
		return _vrcopReportRepository.getCOPReportSignTitle();
	}

	/**
	* Returns the cop report status of this vrcop report repository.
	*
	* @return the cop report status of this vrcop report repository
	*/
	@Override
	public java.lang.String getCOPReportStatus() {
		return _vrcopReportRepository.getCOPReportStatus();
	}

	/**
	* Returns the cop report type of this vrcop report repository.
	*
	* @return the cop report type of this vrcop report repository
	*/
	@Override
	public java.lang.String getCOPReportType() {
		return _vrcopReportRepository.getCOPReportType();
	}

	/**
	* Returns the overseas manufacturer address of this vrcop report repository.
	*
	* @return the overseas manufacturer address of this vrcop report repository
	*/
	@Override
	public java.lang.String getOverseasManufacturerAddress() {
		return _vrcopReportRepository.getOverseasManufacturerAddress();
	}

	/**
	* Returns the overseas manufacturer code of this vrcop report repository.
	*
	* @return the overseas manufacturer code of this vrcop report repository
	*/
	@Override
	public java.lang.String getOverseasManufacturerCode() {
		return _vrcopReportRepository.getOverseasManufacturerCode();
	}

	/**
	* Returns the overseas manufacturer name of this vrcop report repository.
	*
	* @return the overseas manufacturer name of this vrcop report repository
	*/
	@Override
	public java.lang.String getOverseasManufacturerName() {
		return _vrcopReportRepository.getOverseasManufacturerName();
	}

	/**
	* Returns the production plant address of this vrcop report repository.
	*
	* @return the production plant address of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantAddress() {
		return _vrcopReportRepository.getProductionPlantAddress();
	}

	/**
	* Returns the production plant code of this vrcop report repository.
	*
	* @return the production plant code of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrcopReportRepository.getProductionPlantCode();
	}

	/**
	* Returns the production plant name of this vrcop report repository.
	*
	* @return the production plant name of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductionPlantName() {
		return _vrcopReportRepository.getProductionPlantName();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopReportRepository.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopReportRepository.toXmlString();
	}

	/**
	* Returns the cop report approved date of this vrcop report repository.
	*
	* @return the cop report approved date of this vrcop report repository
	*/
	@Override
	public Date getCOPReportApprovedDate() {
		return _vrcopReportRepository.getCOPReportApprovedDate();
	}

	/**
	* Returns the cop report date of this vrcop report repository.
	*
	* @return the cop report date of this vrcop report repository
	*/
	@Override
	public Date getCOPReportDate() {
		return _vrcopReportRepository.getCOPReportDate();
	}

	/**
	* Returns the cop report expired date of this vrcop report repository.
	*
	* @return the cop report expired date of this vrcop report repository
	*/
	@Override
	public Date getCOPReportExpiredDate() {
		return _vrcopReportRepository.getCOPReportExpiredDate();
	}

	/**
	* Returns the modify date of this vrcop report repository.
	*
	* @return the modify date of this vrcop report repository
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopReportRepository.getModifyDate();
	}

	/**
	* Returns the sync date of this vrcop report repository.
	*
	* @return the sync date of this vrcop report repository
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopReportRepository.getSyncDate();
	}

	/**
	* Returns the applicant profile ID of this vrcop report repository.
	*
	* @return the applicant profile ID of this vrcop report repository
	*/
	@Override
	public long getApplicantProfileId() {
		return _vrcopReportRepository.getApplicantProfileId();
	}

	/**
	* Returns the cop file entry ID of this vrcop report repository.
	*
	* @return the cop file entry ID of this vrcop report repository
	*/
	@Override
	public long getCOPFileEntryId() {
		return _vrcopReportRepository.getCOPFileEntryId();
	}

	/**
	* Returns the ID of this vrcop report repository.
	*
	* @return the ID of this vrcop report repository
	*/
	@Override
	public long getId() {
		return _vrcopReportRepository.getId();
	}

	/**
	* Returns the primary key of this vrcop report repository.
	*
	* @return the primary key of this vrcop report repository
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopReportRepository.getPrimaryKey();
	}

	/**
	* Returns the production plant ID of this vrcop report repository.
	*
	* @return the production plant ID of this vrcop report repository
	*/
	@Override
	public long getProductionPlantId() {
		return _vrcopReportRepository.getProductionPlantId();
	}

	@Override
	public void persist() {
		_vrcopReportRepository.persist();
	}

	/**
	* Sets the applicant address of this vrcop report repository.
	*
	* @param applicantAddress the applicant address of this vrcop report repository
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_vrcopReportRepository.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant code of this vrcop report repository.
	*
	* @param applicantCode the applicant code of this vrcop report repository
	*/
	@Override
	public void setApplicantCode(java.lang.String applicantCode) {
		_vrcopReportRepository.setApplicantCode(applicantCode);
	}

	/**
	* Sets the applicant name of this vrcop report repository.
	*
	* @param applicantName the applicant name of this vrcop report repository
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_vrcopReportRepository.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant profile ID of this vrcop report repository.
	*
	* @param applicantProfileId the applicant profile ID of this vrcop report repository
	*/
	@Override
	public void setApplicantProfileId(long applicantProfileId) {
		_vrcopReportRepository.setApplicantProfileId(applicantProfileId);
	}

	/**
	* Sets the cop file entry ID of this vrcop report repository.
	*
	* @param COPFileEntryId the cop file entry ID of this vrcop report repository
	*/
	@Override
	public void setCOPFileEntryId(long COPFileEntryId) {
		_vrcopReportRepository.setCOPFileEntryId(COPFileEntryId);
	}

	/**
	* Sets the cop report approved date of this vrcop report repository.
	*
	* @param COPReportApprovedDate the cop report approved date of this vrcop report repository
	*/
	@Override
	public void setCOPReportApprovedDate(Date COPReportApprovedDate) {
		_vrcopReportRepository.setCOPReportApprovedDate(COPReportApprovedDate);
	}

	/**
	* Sets the cop report date of this vrcop report repository.
	*
	* @param COPReportDate the cop report date of this vrcop report repository
	*/
	@Override
	public void setCOPReportDate(Date COPReportDate) {
		_vrcopReportRepository.setCOPReportDate(COPReportDate);
	}

	/**
	* Sets the cop report expired date of this vrcop report repository.
	*
	* @param COPReportExpiredDate the cop report expired date of this vrcop report repository
	*/
	@Override
	public void setCOPReportExpiredDate(Date COPReportExpiredDate) {
		_vrcopReportRepository.setCOPReportExpiredDate(COPReportExpiredDate);
	}

	/**
	* Sets the cop report metadata of this vrcop report repository.
	*
	* @param COPReportMetadata the cop report metadata of this vrcop report repository
	*/
	@Override
	public void setCOPReportMetadata(java.lang.String COPReportMetadata) {
		_vrcopReportRepository.setCOPReportMetadata(COPReportMetadata);
	}

	/**
	* Sets the cop report no of this vrcop report repository.
	*
	* @param COPReportNo the cop report no of this vrcop report repository
	*/
	@Override
	public void setCOPReportNo(java.lang.String COPReportNo) {
		_vrcopReportRepository.setCOPReportNo(COPReportNo);
	}

	/**
	* Sets the cop report sign name of this vrcop report repository.
	*
	* @param COPReportSignName the cop report sign name of this vrcop report repository
	*/
	@Override
	public void setCOPReportSignName(java.lang.String COPReportSignName) {
		_vrcopReportRepository.setCOPReportSignName(COPReportSignName);
	}

	/**
	* Sets the cop report sign place of this vrcop report repository.
	*
	* @param COPReportSignPlace the cop report sign place of this vrcop report repository
	*/
	@Override
	public void setCOPReportSignPlace(java.lang.String COPReportSignPlace) {
		_vrcopReportRepository.setCOPReportSignPlace(COPReportSignPlace);
	}

	/**
	* Sets the cop report sign title of this vrcop report repository.
	*
	* @param COPReportSignTitle the cop report sign title of this vrcop report repository
	*/
	@Override
	public void setCOPReportSignTitle(java.lang.String COPReportSignTitle) {
		_vrcopReportRepository.setCOPReportSignTitle(COPReportSignTitle);
	}

	/**
	* Sets the cop report status of this vrcop report repository.
	*
	* @param COPReportStatus the cop report status of this vrcop report repository
	*/
	@Override
	public void setCOPReportStatus(java.lang.String COPReportStatus) {
		_vrcopReportRepository.setCOPReportStatus(COPReportStatus);
	}

	/**
	* Sets the cop report type of this vrcop report repository.
	*
	* @param COPReportType the cop report type of this vrcop report repository
	*/
	@Override
	public void setCOPReportType(java.lang.String COPReportType) {
		_vrcopReportRepository.setCOPReportType(COPReportType);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopReportRepository.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopReportRepository.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopReportRepository.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopReportRepository.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcop report repository.
	*
	* @param id the ID of this vrcop report repository
	*/
	@Override
	public void setId(long id) {
		_vrcopReportRepository.setId(id);
	}

	/**
	* Sets the modify date of this vrcop report repository.
	*
	* @param modifyDate the modify date of this vrcop report repository
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopReportRepository.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vrcop report repository.
	*
	* @param mtCore the mt core of this vrcop report repository
	*/
	@Override
	public void setMtCore(int mtCore) {
		_vrcopReportRepository.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopReportRepository.setNew(n);
	}

	/**
	* Sets the overseas manufacturer address of this vrcop report repository.
	*
	* @param overseasManufacturerAddress the overseas manufacturer address of this vrcop report repository
	*/
	@Override
	public void setOverseasManufacturerAddress(
		java.lang.String overseasManufacturerAddress) {
		_vrcopReportRepository.setOverseasManufacturerAddress(overseasManufacturerAddress);
	}

	/**
	* Sets the overseas manufacturer code of this vrcop report repository.
	*
	* @param overseasManufacturerCode the overseas manufacturer code of this vrcop report repository
	*/
	@Override
	public void setOverseasManufacturerCode(
		java.lang.String overseasManufacturerCode) {
		_vrcopReportRepository.setOverseasManufacturerCode(overseasManufacturerCode);
	}

	/**
	* Sets the overseas manufacturer name of this vrcop report repository.
	*
	* @param overseasManufacturerName the overseas manufacturer name of this vrcop report repository
	*/
	@Override
	public void setOverseasManufacturerName(
		java.lang.String overseasManufacturerName) {
		_vrcopReportRepository.setOverseasManufacturerName(overseasManufacturerName);
	}

	/**
	* Sets the primary key of this vrcop report repository.
	*
	* @param primaryKey the primary key of this vrcop report repository
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopReportRepository.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopReportRepository.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production plant address of this vrcop report repository.
	*
	* @param productionPlantAddress the production plant address of this vrcop report repository
	*/
	@Override
	public void setProductionPlantAddress(
		java.lang.String productionPlantAddress) {
		_vrcopReportRepository.setProductionPlantAddress(productionPlantAddress);
	}

	/**
	* Sets the production plant code of this vrcop report repository.
	*
	* @param productionPlantCode the production plant code of this vrcop report repository
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrcopReportRepository.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant ID of this vrcop report repository.
	*
	* @param productionPlantId the production plant ID of this vrcop report repository
	*/
	@Override
	public void setProductionPlantId(long productionPlantId) {
		_vrcopReportRepository.setProductionPlantId(productionPlantId);
	}

	/**
	* Sets the production plant name of this vrcop report repository.
	*
	* @param productionPlantName the production plant name of this vrcop report repository
	*/
	@Override
	public void setProductionPlantName(java.lang.String productionPlantName) {
		_vrcopReportRepository.setProductionPlantName(productionPlantName);
	}

	/**
	* Sets the sync date of this vrcop report repository.
	*
	* @param syncDate the sync date of this vrcop report repository
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopReportRepository.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPReportRepositoryWrapper)) {
			return false;
		}

		VRCOPReportRepositoryWrapper vrcopReportRepositoryWrapper = (VRCOPReportRepositoryWrapper)obj;

		if (Objects.equals(_vrcopReportRepository,
					vrcopReportRepositoryWrapper._vrcopReportRepository)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPReportRepository getWrappedModel() {
		return _vrcopReportRepository;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopReportRepository.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopReportRepository.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopReportRepository.resetOriginalValues();
	}

	private final VRCOPReportRepository _vrcopReportRepository;
}