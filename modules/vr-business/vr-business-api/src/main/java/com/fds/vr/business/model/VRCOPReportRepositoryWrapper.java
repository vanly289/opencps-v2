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
 * This class is a wrapper for {@link VRCOPReportRepository}.
 * </p>
 *
 * @author LamTV
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
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("copReportStatus", getCopReportStatus());
		attributes.put("copReportType", getCopReportType());
		attributes.put("copReportMetadata", getCopReportMetadata());
		attributes.put("copReportSignName", getCopReportSignName());
		attributes.put("copReportSignTitle", getCopReportSignTitle());
		attributes.put("copReportSignPlace", getCopReportSignPlace());
		attributes.put("copReportDate", getCopReportDate());
		attributes.put("copReportApprovedDate", getCopReportApprovedDate());
		attributes.put("copReportExpiredDate", getCopReportExpiredDate());
		attributes.put("COPFileEntryId", getCOPFileEntryId());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("importerManufacturerCode", getImporterManufacturerCode());
		attributes.put("importerManufacturerName", getImporterManufacturerName());
		attributes.put("importerManufacturerAddress",
			getImporterManufacturerAddress());
		attributes.put("markupDomesticsManufacturer",
			getMarkupDomesticsManufacturer());
		attributes.put("markupImporter", getMarkupImporter());
		attributes.put("copClassification", getCopClassification());
		attributes.put("productClassificationDescription",
			getProductClassificationDescription());
		attributes.put("totalPointA", getTotalPointA());
		attributes.put("totalPointB", getTotalPointB());
		attributes.put("totalPointC", getTotalPointC());
		attributes.put("copNonConformity", getCopNonConformity());
		attributes.put("inspectionRecordNo", getInspectionRecordNo());
		attributes.put("inspectionRecordDate", getInspectionRecordDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("inspectionSite", getInspectionSite());
		attributes.put("inspectionDateFrom", getInspectionDateFrom());
		attributes.put("inspectionDateTo", getInspectionDateTo());
		attributes.put("subInspector", getSubInspector());
		attributes.put("description", getDescription());
		attributes.put("applicantRepresentative", getApplicantRepresentative());
		attributes.put("applicantRepresentativeTitle",
			getApplicantRepresentativeTitle());
		attributes.put("inspectionRecordFileEntryId",
			getInspectionRecordFileEntryId());
		attributes.put("copReportRefNo", getCopReportRefNo());
		attributes.put("copReportRefDate", getCopReportRefDate());
		attributes.put("copReportPreviousNo", getCopReportPreviousNo());
		attributes.put("copReportPreviousDate", getCopReportPreviousDate());
		attributes.put("expiredStatus", getExpiredStatus());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("dossierNo", getDossierNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

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

		String copReportNo = (String)attributes.get("copReportNo");

		if (copReportNo != null) {
			setCopReportNo(copReportNo);
		}

		String copReportStatus = (String)attributes.get("copReportStatus");

		if (copReportStatus != null) {
			setCopReportStatus(copReportStatus);
		}

		String copReportType = (String)attributes.get("copReportType");

		if (copReportType != null) {
			setCopReportType(copReportType);
		}

		String copReportMetadata = (String)attributes.get("copReportMetadata");

		if (copReportMetadata != null) {
			setCopReportMetadata(copReportMetadata);
		}

		String copReportSignName = (String)attributes.get("copReportSignName");

		if (copReportSignName != null) {
			setCopReportSignName(copReportSignName);
		}

		String copReportSignTitle = (String)attributes.get("copReportSignTitle");

		if (copReportSignTitle != null) {
			setCopReportSignTitle(copReportSignTitle);
		}

		String copReportSignPlace = (String)attributes.get("copReportSignPlace");

		if (copReportSignPlace != null) {
			setCopReportSignPlace(copReportSignPlace);
		}

		Date copReportDate = (Date)attributes.get("copReportDate");

		if (copReportDate != null) {
			setCopReportDate(copReportDate);
		}

		Date copReportApprovedDate = (Date)attributes.get(
				"copReportApprovedDate");

		if (copReportApprovedDate != null) {
			setCopReportApprovedDate(copReportApprovedDate);
		}

		Date copReportExpiredDate = (Date)attributes.get("copReportExpiredDate");

		if (copReportExpiredDate != null) {
			setCopReportExpiredDate(copReportExpiredDate);
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

		String importerManufacturerCode = (String)attributes.get(
				"importerManufacturerCode");

		if (importerManufacturerCode != null) {
			setImporterManufacturerCode(importerManufacturerCode);
		}

		String importerManufacturerName = (String)attributes.get(
				"importerManufacturerName");

		if (importerManufacturerName != null) {
			setImporterManufacturerName(importerManufacturerName);
		}

		String importerManufacturerAddress = (String)attributes.get(
				"importerManufacturerAddress");

		if (importerManufacturerAddress != null) {
			setImporterManufacturerAddress(importerManufacturerAddress);
		}

		String markupDomesticsManufacturer = (String)attributes.get(
				"markupDomesticsManufacturer");

		if (markupDomesticsManufacturer != null) {
			setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
		}

		String markupImporter = (String)attributes.get("markupImporter");

		if (markupImporter != null) {
			setMarkupImporter(markupImporter);
		}

		String copClassification = (String)attributes.get("copClassification");

		if (copClassification != null) {
			setCopClassification(copClassification);
		}

		String productClassificationDescription = (String)attributes.get(
				"productClassificationDescription");

		if (productClassificationDescription != null) {
			setProductClassificationDescription(productClassificationDescription);
		}

		Integer totalPointA = (Integer)attributes.get("totalPointA");

		if (totalPointA != null) {
			setTotalPointA(totalPointA);
		}

		Integer totalPointB = (Integer)attributes.get("totalPointB");

		if (totalPointB != null) {
			setTotalPointB(totalPointB);
		}

		Integer totalPointC = (Integer)attributes.get("totalPointC");

		if (totalPointC != null) {
			setTotalPointC(totalPointC);
		}

		String copNonConformity = (String)attributes.get("copNonConformity");

		if (copNonConformity != null) {
			setCopNonConformity(copNonConformity);
		}

		String inspectionRecordNo = (String)attributes.get("inspectionRecordNo");

		if (inspectionRecordNo != null) {
			setInspectionRecordNo(inspectionRecordNo);
		}

		Date inspectionRecordDate = (Date)attributes.get("inspectionRecordDate");

		if (inspectionRecordDate != null) {
			setInspectionRecordDate(inspectionRecordDate);
		}

		Long corporationId = (Long)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		String inspectionSite = (String)attributes.get("inspectionSite");

		if (inspectionSite != null) {
			setInspectionSite(inspectionSite);
		}

		Date inspectionDateFrom = (Date)attributes.get("inspectionDateFrom");

		if (inspectionDateFrom != null) {
			setInspectionDateFrom(inspectionDateFrom);
		}

		Date inspectionDateTo = (Date)attributes.get("inspectionDateTo");

		if (inspectionDateTo != null) {
			setInspectionDateTo(inspectionDateTo);
		}

		String subInspector = (String)attributes.get("subInspector");

		if (subInspector != null) {
			setSubInspector(subInspector);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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

		Long inspectionRecordFileEntryId = (Long)attributes.get(
				"inspectionRecordFileEntryId");

		if (inspectionRecordFileEntryId != null) {
			setInspectionRecordFileEntryId(inspectionRecordFileEntryId);
		}

		String copReportRefNo = (String)attributes.get("copReportRefNo");

		if (copReportRefNo != null) {
			setCopReportRefNo(copReportRefNo);
		}

		Date copReportRefDate = (Date)attributes.get("copReportRefDate");

		if (copReportRefDate != null) {
			setCopReportRefDate(copReportRefDate);
		}

		String copReportPreviousNo = (String)attributes.get(
				"copReportPreviousNo");

		if (copReportPreviousNo != null) {
			setCopReportPreviousNo(copReportPreviousNo);
		}

		Date copReportPreviousDate = (Date)attributes.get(
				"copReportPreviousDate");

		if (copReportPreviousDate != null) {
			setCopReportPreviousDate(copReportPreviousDate);
		}

		String expiredStatus = (String)attributes.get("expiredStatus");

		if (expiredStatus != null) {
			setExpiredStatus(expiredStatus);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
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
	* Returns the total point a of this vrcop report repository.
	*
	* @return the total point a of this vrcop report repository
	*/
	@Override
	public int getTotalPointA() {
		return _vrcopReportRepository.getTotalPointA();
	}

	/**
	* Returns the total point b of this vrcop report repository.
	*
	* @return the total point b of this vrcop report repository
	*/
	@Override
	public int getTotalPointB() {
		return _vrcopReportRepository.getTotalPointB();
	}

	/**
	* Returns the total point c of this vrcop report repository.
	*
	* @return the total point c of this vrcop report repository
	*/
	@Override
	public int getTotalPointC() {
		return _vrcopReportRepository.getTotalPointC();
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
	* Returns the applicant representative of this vrcop report repository.
	*
	* @return the applicant representative of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantRepresentative() {
		return _vrcopReportRepository.getApplicantRepresentative();
	}

	/**
	* Returns the applicant representative title of this vrcop report repository.
	*
	* @return the applicant representative title of this vrcop report repository
	*/
	@Override
	public java.lang.String getApplicantRepresentativeTitle() {
		return _vrcopReportRepository.getApplicantRepresentativeTitle();
	}

	/**
	* Returns the cop classification of this vrcop report repository.
	*
	* @return the cop classification of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopClassification() {
		return _vrcopReportRepository.getCopClassification();
	}

	/**
	* Returns the cop non conformity of this vrcop report repository.
	*
	* @return the cop non conformity of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopNonConformity() {
		return _vrcopReportRepository.getCopNonConformity();
	}

	/**
	* Returns the cop report metadata of this vrcop report repository.
	*
	* @return the cop report metadata of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportMetadata() {
		return _vrcopReportRepository.getCopReportMetadata();
	}

	/**
	* Returns the cop report no of this vrcop report repository.
	*
	* @return the cop report no of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrcopReportRepository.getCopReportNo();
	}

	/**
	* Returns the cop report previous no of this vrcop report repository.
	*
	* @return the cop report previous no of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportPreviousNo() {
		return _vrcopReportRepository.getCopReportPreviousNo();
	}

	/**
	* Returns the cop report ref no of this vrcop report repository.
	*
	* @return the cop report ref no of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportRefNo() {
		return _vrcopReportRepository.getCopReportRefNo();
	}

	/**
	* Returns the cop report sign name of this vrcop report repository.
	*
	* @return the cop report sign name of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportSignName() {
		return _vrcopReportRepository.getCopReportSignName();
	}

	/**
	* Returns the cop report sign place of this vrcop report repository.
	*
	* @return the cop report sign place of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportSignPlace() {
		return _vrcopReportRepository.getCopReportSignPlace();
	}

	/**
	* Returns the cop report sign title of this vrcop report repository.
	*
	* @return the cop report sign title of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportSignTitle() {
		return _vrcopReportRepository.getCopReportSignTitle();
	}

	/**
	* Returns the cop report status of this vrcop report repository.
	*
	* @return the cop report status of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportStatus() {
		return _vrcopReportRepository.getCopReportStatus();
	}

	/**
	* Returns the cop report type of this vrcop report repository.
	*
	* @return the cop report type of this vrcop report repository
	*/
	@Override
	public java.lang.String getCopReportType() {
		return _vrcopReportRepository.getCopReportType();
	}

	/**
	* Returns the description of this vrcop report repository.
	*
	* @return the description of this vrcop report repository
	*/
	@Override
	public java.lang.String getDescription() {
		return _vrcopReportRepository.getDescription();
	}

	/**
	* Returns the dossier ID ctn of this vrcop report repository.
	*
	* @return the dossier ID ctn of this vrcop report repository
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrcopReportRepository.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vrcop report repository.
	*
	* @return the dossier no of this vrcop report repository
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrcopReportRepository.getDossierNo();
	}

	/**
	* Returns the expired status of this vrcop report repository.
	*
	* @return the expired status of this vrcop report repository
	*/
	@Override
	public java.lang.String getExpiredStatus() {
		return _vrcopReportRepository.getExpiredStatus();
	}

	/**
	* Returns the importer manufacturer address of this vrcop report repository.
	*
	* @return the importer manufacturer address of this vrcop report repository
	*/
	@Override
	public java.lang.String getImporterManufacturerAddress() {
		return _vrcopReportRepository.getImporterManufacturerAddress();
	}

	/**
	* Returns the importer manufacturer code of this vrcop report repository.
	*
	* @return the importer manufacturer code of this vrcop report repository
	*/
	@Override
	public java.lang.String getImporterManufacturerCode() {
		return _vrcopReportRepository.getImporterManufacturerCode();
	}

	/**
	* Returns the importer manufacturer name of this vrcop report repository.
	*
	* @return the importer manufacturer name of this vrcop report repository
	*/
	@Override
	public java.lang.String getImporterManufacturerName() {
		return _vrcopReportRepository.getImporterManufacturerName();
	}

	/**
	* Returns the inspection record no of this vrcop report repository.
	*
	* @return the inspection record no of this vrcop report repository
	*/
	@Override
	public java.lang.String getInspectionRecordNo() {
		return _vrcopReportRepository.getInspectionRecordNo();
	}

	/**
	* Returns the inspection site of this vrcop report repository.
	*
	* @return the inspection site of this vrcop report repository
	*/
	@Override
	public java.lang.String getInspectionSite() {
		return _vrcopReportRepository.getInspectionSite();
	}

	/**
	* Returns the markup domestics manufacturer of this vrcop report repository.
	*
	* @return the markup domestics manufacturer of this vrcop report repository
	*/
	@Override
	public java.lang.String getMarkupDomesticsManufacturer() {
		return _vrcopReportRepository.getMarkupDomesticsManufacturer();
	}

	/**
	* Returns the markup importer of this vrcop report repository.
	*
	* @return the markup importer of this vrcop report repository
	*/
	@Override
	public java.lang.String getMarkupImporter() {
		return _vrcopReportRepository.getMarkupImporter();
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
	* Returns the product classification description of this vrcop report repository.
	*
	* @return the product classification description of this vrcop report repository
	*/
	@Override
	public java.lang.String getProductClassificationDescription() {
		return _vrcopReportRepository.getProductClassificationDescription();
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

	/**
	* Returns the sub inspector of this vrcop report repository.
	*
	* @return the sub inspector of this vrcop report repository
	*/
	@Override
	public java.lang.String getSubInspector() {
		return _vrcopReportRepository.getSubInspector();
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
	public Date getCopReportApprovedDate() {
		return _vrcopReportRepository.getCopReportApprovedDate();
	}

	/**
	* Returns the cop report date of this vrcop report repository.
	*
	* @return the cop report date of this vrcop report repository
	*/
	@Override
	public Date getCopReportDate() {
		return _vrcopReportRepository.getCopReportDate();
	}

	/**
	* Returns the cop report expired date of this vrcop report repository.
	*
	* @return the cop report expired date of this vrcop report repository
	*/
	@Override
	public Date getCopReportExpiredDate() {
		return _vrcopReportRepository.getCopReportExpiredDate();
	}

	/**
	* Returns the cop report previous date of this vrcop report repository.
	*
	* @return the cop report previous date of this vrcop report repository
	*/
	@Override
	public Date getCopReportPreviousDate() {
		return _vrcopReportRepository.getCopReportPreviousDate();
	}

	/**
	* Returns the cop report ref date of this vrcop report repository.
	*
	* @return the cop report ref date of this vrcop report repository
	*/
	@Override
	public Date getCopReportRefDate() {
		return _vrcopReportRepository.getCopReportRefDate();
	}

	/**
	* Returns the inspection date from of this vrcop report repository.
	*
	* @return the inspection date from of this vrcop report repository
	*/
	@Override
	public Date getInspectionDateFrom() {
		return _vrcopReportRepository.getInspectionDateFrom();
	}

	/**
	* Returns the inspection date to of this vrcop report repository.
	*
	* @return the inspection date to of this vrcop report repository
	*/
	@Override
	public Date getInspectionDateTo() {
		return _vrcopReportRepository.getInspectionDateTo();
	}

	/**
	* Returns the inspection record date of this vrcop report repository.
	*
	* @return the inspection record date of this vrcop report repository
	*/
	@Override
	public Date getInspectionRecordDate() {
		return _vrcopReportRepository.getInspectionRecordDate();
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
	* Returns the corporation ID of this vrcop report repository.
	*
	* @return the corporation ID of this vrcop report repository
	*/
	@Override
	public long getCorporationId() {
		return _vrcopReportRepository.getCorporationId();
	}

	/**
	* Returns the dossier ID of this vrcop report repository.
	*
	* @return the dossier ID of this vrcop report repository
	*/
	@Override
	public long getDossierId() {
		return _vrcopReportRepository.getDossierId();
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
	* Returns the inspection record file entry ID of this vrcop report repository.
	*
	* @return the inspection record file entry ID of this vrcop report repository
	*/
	@Override
	public long getInspectionRecordFileEntryId() {
		return _vrcopReportRepository.getInspectionRecordFileEntryId();
	}

	/**
	* Returns the inspector ID of this vrcop report repository.
	*
	* @return the inspector ID of this vrcop report repository
	*/
	@Override
	public long getInspectorId() {
		return _vrcopReportRepository.getInspectorId();
	}

	/**
	* Returns the mt core of this vrcop report repository.
	*
	* @return the mt core of this vrcop report repository
	*/
	@Override
	public long getMtCore() {
		return _vrcopReportRepository.getMtCore();
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
	* Sets the applicant representative of this vrcop report repository.
	*
	* @param applicantRepresentative the applicant representative of this vrcop report repository
	*/
	@Override
	public void setApplicantRepresentative(
		java.lang.String applicantRepresentative) {
		_vrcopReportRepository.setApplicantRepresentative(applicantRepresentative);
	}

	/**
	* Sets the applicant representative title of this vrcop report repository.
	*
	* @param applicantRepresentativeTitle the applicant representative title of this vrcop report repository
	*/
	@Override
	public void setApplicantRepresentativeTitle(
		java.lang.String applicantRepresentativeTitle) {
		_vrcopReportRepository.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
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

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopReportRepository.setCachedModel(cachedModel);
	}

	/**
	* Sets the cop classification of this vrcop report repository.
	*
	* @param copClassification the cop classification of this vrcop report repository
	*/
	@Override
	public void setCopClassification(java.lang.String copClassification) {
		_vrcopReportRepository.setCopClassification(copClassification);
	}

	/**
	* Sets the cop non conformity of this vrcop report repository.
	*
	* @param copNonConformity the cop non conformity of this vrcop report repository
	*/
	@Override
	public void setCopNonConformity(java.lang.String copNonConformity) {
		_vrcopReportRepository.setCopNonConformity(copNonConformity);
	}

	/**
	* Sets the cop report approved date of this vrcop report repository.
	*
	* @param copReportApprovedDate the cop report approved date of this vrcop report repository
	*/
	@Override
	public void setCopReportApprovedDate(Date copReportApprovedDate) {
		_vrcopReportRepository.setCopReportApprovedDate(copReportApprovedDate);
	}

	/**
	* Sets the cop report date of this vrcop report repository.
	*
	* @param copReportDate the cop report date of this vrcop report repository
	*/
	@Override
	public void setCopReportDate(Date copReportDate) {
		_vrcopReportRepository.setCopReportDate(copReportDate);
	}

	/**
	* Sets the cop report expired date of this vrcop report repository.
	*
	* @param copReportExpiredDate the cop report expired date of this vrcop report repository
	*/
	@Override
	public void setCopReportExpiredDate(Date copReportExpiredDate) {
		_vrcopReportRepository.setCopReportExpiredDate(copReportExpiredDate);
	}

	/**
	* Sets the cop report metadata of this vrcop report repository.
	*
	* @param copReportMetadata the cop report metadata of this vrcop report repository
	*/
	@Override
	public void setCopReportMetadata(java.lang.String copReportMetadata) {
		_vrcopReportRepository.setCopReportMetadata(copReportMetadata);
	}

	/**
	* Sets the cop report no of this vrcop report repository.
	*
	* @param copReportNo the cop report no of this vrcop report repository
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrcopReportRepository.setCopReportNo(copReportNo);
	}

	/**
	* Sets the cop report previous date of this vrcop report repository.
	*
	* @param copReportPreviousDate the cop report previous date of this vrcop report repository
	*/
	@Override
	public void setCopReportPreviousDate(Date copReportPreviousDate) {
		_vrcopReportRepository.setCopReportPreviousDate(copReportPreviousDate);
	}

	/**
	* Sets the cop report previous no of this vrcop report repository.
	*
	* @param copReportPreviousNo the cop report previous no of this vrcop report repository
	*/
	@Override
	public void setCopReportPreviousNo(java.lang.String copReportPreviousNo) {
		_vrcopReportRepository.setCopReportPreviousNo(copReportPreviousNo);
	}

	/**
	* Sets the cop report ref date of this vrcop report repository.
	*
	* @param copReportRefDate the cop report ref date of this vrcop report repository
	*/
	@Override
	public void setCopReportRefDate(Date copReportRefDate) {
		_vrcopReportRepository.setCopReportRefDate(copReportRefDate);
	}

	/**
	* Sets the cop report ref no of this vrcop report repository.
	*
	* @param copReportRefNo the cop report ref no of this vrcop report repository
	*/
	@Override
	public void setCopReportRefNo(java.lang.String copReportRefNo) {
		_vrcopReportRepository.setCopReportRefNo(copReportRefNo);
	}

	/**
	* Sets the cop report sign name of this vrcop report repository.
	*
	* @param copReportSignName the cop report sign name of this vrcop report repository
	*/
	@Override
	public void setCopReportSignName(java.lang.String copReportSignName) {
		_vrcopReportRepository.setCopReportSignName(copReportSignName);
	}

	/**
	* Sets the cop report sign place of this vrcop report repository.
	*
	* @param copReportSignPlace the cop report sign place of this vrcop report repository
	*/
	@Override
	public void setCopReportSignPlace(java.lang.String copReportSignPlace) {
		_vrcopReportRepository.setCopReportSignPlace(copReportSignPlace);
	}

	/**
	* Sets the cop report sign title of this vrcop report repository.
	*
	* @param copReportSignTitle the cop report sign title of this vrcop report repository
	*/
	@Override
	public void setCopReportSignTitle(java.lang.String copReportSignTitle) {
		_vrcopReportRepository.setCopReportSignTitle(copReportSignTitle);
	}

	/**
	* Sets the cop report status of this vrcop report repository.
	*
	* @param copReportStatus the cop report status of this vrcop report repository
	*/
	@Override
	public void setCopReportStatus(java.lang.String copReportStatus) {
		_vrcopReportRepository.setCopReportStatus(copReportStatus);
	}

	/**
	* Sets the cop report type of this vrcop report repository.
	*
	* @param copReportType the cop report type of this vrcop report repository
	*/
	@Override
	public void setCopReportType(java.lang.String copReportType) {
		_vrcopReportRepository.setCopReportType(copReportType);
	}

	/**
	* Sets the corporation ID of this vrcop report repository.
	*
	* @param corporationId the corporation ID of this vrcop report repository
	*/
	@Override
	public void setCorporationId(long corporationId) {
		_vrcopReportRepository.setCorporationId(corporationId);
	}

	/**
	* Sets the description of this vrcop report repository.
	*
	* @param description the description of this vrcop report repository
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vrcopReportRepository.setDescription(description);
	}

	/**
	* Sets the dossier ID of this vrcop report repository.
	*
	* @param dossierId the dossier ID of this vrcop report repository
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrcopReportRepository.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vrcop report repository.
	*
	* @param dossierIdCTN the dossier ID ctn of this vrcop report repository
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrcopReportRepository.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vrcop report repository.
	*
	* @param dossierNo the dossier no of this vrcop report repository
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrcopReportRepository.setDossierNo(dossierNo);
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
	* Sets the expired status of this vrcop report repository.
	*
	* @param expiredStatus the expired status of this vrcop report repository
	*/
	@Override
	public void setExpiredStatus(java.lang.String expiredStatus) {
		_vrcopReportRepository.setExpiredStatus(expiredStatus);
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
	* Sets the importer manufacturer address of this vrcop report repository.
	*
	* @param importerManufacturerAddress the importer manufacturer address of this vrcop report repository
	*/
	@Override
	public void setImporterManufacturerAddress(
		java.lang.String importerManufacturerAddress) {
		_vrcopReportRepository.setImporterManufacturerAddress(importerManufacturerAddress);
	}

	/**
	* Sets the importer manufacturer code of this vrcop report repository.
	*
	* @param importerManufacturerCode the importer manufacturer code of this vrcop report repository
	*/
	@Override
	public void setImporterManufacturerCode(
		java.lang.String importerManufacturerCode) {
		_vrcopReportRepository.setImporterManufacturerCode(importerManufacturerCode);
	}

	/**
	* Sets the importer manufacturer name of this vrcop report repository.
	*
	* @param importerManufacturerName the importer manufacturer name of this vrcop report repository
	*/
	@Override
	public void setImporterManufacturerName(
		java.lang.String importerManufacturerName) {
		_vrcopReportRepository.setImporterManufacturerName(importerManufacturerName);
	}

	/**
	* Sets the inspection date from of this vrcop report repository.
	*
	* @param inspectionDateFrom the inspection date from of this vrcop report repository
	*/
	@Override
	public void setInspectionDateFrom(Date inspectionDateFrom) {
		_vrcopReportRepository.setInspectionDateFrom(inspectionDateFrom);
	}

	/**
	* Sets the inspection date to of this vrcop report repository.
	*
	* @param inspectionDateTo the inspection date to of this vrcop report repository
	*/
	@Override
	public void setInspectionDateTo(Date inspectionDateTo) {
		_vrcopReportRepository.setInspectionDateTo(inspectionDateTo);
	}

	/**
	* Sets the inspection record date of this vrcop report repository.
	*
	* @param inspectionRecordDate the inspection record date of this vrcop report repository
	*/
	@Override
	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_vrcopReportRepository.setInspectionRecordDate(inspectionRecordDate);
	}

	/**
	* Sets the inspection record file entry ID of this vrcop report repository.
	*
	* @param inspectionRecordFileEntryId the inspection record file entry ID of this vrcop report repository
	*/
	@Override
	public void setInspectionRecordFileEntryId(long inspectionRecordFileEntryId) {
		_vrcopReportRepository.setInspectionRecordFileEntryId(inspectionRecordFileEntryId);
	}

	/**
	* Sets the inspection record no of this vrcop report repository.
	*
	* @param inspectionRecordNo the inspection record no of this vrcop report repository
	*/
	@Override
	public void setInspectionRecordNo(java.lang.String inspectionRecordNo) {
		_vrcopReportRepository.setInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Sets the inspection site of this vrcop report repository.
	*
	* @param inspectionSite the inspection site of this vrcop report repository
	*/
	@Override
	public void setInspectionSite(java.lang.String inspectionSite) {
		_vrcopReportRepository.setInspectionSite(inspectionSite);
	}

	/**
	* Sets the inspector ID of this vrcop report repository.
	*
	* @param inspectorId the inspector ID of this vrcop report repository
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_vrcopReportRepository.setInspectorId(inspectorId);
	}

	/**
	* Sets the markup domestics manufacturer of this vrcop report repository.
	*
	* @param markupDomesticsManufacturer the markup domestics manufacturer of this vrcop report repository
	*/
	@Override
	public void setMarkupDomesticsManufacturer(
		java.lang.String markupDomesticsManufacturer) {
		_vrcopReportRepository.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
	}

	/**
	* Sets the markup importer of this vrcop report repository.
	*
	* @param markupImporter the markup importer of this vrcop report repository
	*/
	@Override
	public void setMarkupImporter(java.lang.String markupImporter) {
		_vrcopReportRepository.setMarkupImporter(markupImporter);
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
	public void setMtCore(long mtCore) {
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
	* Sets the product classification description of this vrcop report repository.
	*
	* @param productClassificationDescription the product classification description of this vrcop report repository
	*/
	@Override
	public void setProductClassificationDescription(
		java.lang.String productClassificationDescription) {
		_vrcopReportRepository.setProductClassificationDescription(productClassificationDescription);
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
	* Sets the sub inspector of this vrcop report repository.
	*
	* @param subInspector the sub inspector of this vrcop report repository
	*/
	@Override
	public void setSubInspector(java.lang.String subInspector) {
		_vrcopReportRepository.setSubInspector(subInspector);
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

	/**
	* Sets the total point a of this vrcop report repository.
	*
	* @param totalPointA the total point a of this vrcop report repository
	*/
	@Override
	public void setTotalPointA(int totalPointA) {
		_vrcopReportRepository.setTotalPointA(totalPointA);
	}

	/**
	* Sets the total point b of this vrcop report repository.
	*
	* @param totalPointB the total point b of this vrcop report repository
	*/
	@Override
	public void setTotalPointB(int totalPointB) {
		_vrcopReportRepository.setTotalPointB(totalPointB);
	}

	/**
	* Sets the total point c of this vrcop report repository.
	*
	* @param totalPointC the total point c of this vrcop report repository
	*/
	@Override
	public void setTotalPointC(int totalPointC) {
		_vrcopReportRepository.setTotalPointC(totalPointC);
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