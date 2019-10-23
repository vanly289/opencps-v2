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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRCOPReportRepositorySoap implements Serializable {
	public static VRCOPReportRepositorySoap toSoapModel(
		VRCOPReportRepository model) {
		VRCOPReportRepositorySoap soapModel = new VRCOPReportRepositorySoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setApplicantCode(model.getApplicantCode());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setOverseasManufacturerCode(model.getOverseasManufacturerCode());
		soapModel.setOverseasManufacturerName(model.getOverseasManufacturerName());
		soapModel.setOverseasManufacturerAddress(model.getOverseasManufacturerAddress());
		soapModel.setProductionPlantId(model.getProductionPlantId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setCopReportNo(model.getCopReportNo());
		soapModel.setCopReportStatus(model.getCopReportStatus());
		soapModel.setCopReportType(model.getCopReportType());
		soapModel.setCopReportMetadata(model.getCopReportMetadata());
		soapModel.setCopReportSignName(model.getCopReportSignName());
		soapModel.setCopReportSignTitle(model.getCopReportSignTitle());
		soapModel.setCopReportSignPlace(model.getCopReportSignPlace());
		soapModel.setCopReportDate(model.getCopReportDate());
		soapModel.setCopReportApprovedDate(model.getCopReportApprovedDate());
		soapModel.setCopReportExpiredDate(model.getCopReportExpiredDate());
		soapModel.setCOPFileEntryId(model.getCOPFileEntryId());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setImporterManufacturerCode(model.getImporterManufacturerCode());
		soapModel.setImporterManufacturerName(model.getImporterManufacturerName());
		soapModel.setImporterManufacturerAddress(model.getImporterManufacturerAddress());
		soapModel.setMarkupDomesticsManufacturer(model.getMarkupDomesticsManufacturer());
		soapModel.setMarkupImporter(model.getMarkupImporter());
		soapModel.setCopClassification(model.getCopClassification());
		soapModel.setProductClassificationDescription(model.getProductClassificationDescription());
		soapModel.setTotalPointA(model.getTotalPointA());
		soapModel.setTotalPointB(model.getTotalPointB());
		soapModel.setTotalPointC(model.getTotalPointC());
		soapModel.setCopNonConformity(model.getCopNonConformity());
		soapModel.setInspectionRecordNo(model.getInspectionRecordNo());
		soapModel.setInspectionRecordDate(model.getInspectionRecordDate());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setInspectionSite(model.getInspectionSite());
		soapModel.setInspectionDateFrom(model.getInspectionDateFrom());
		soapModel.setInspectionDateTo(model.getInspectionDateTo());
		soapModel.setSubInspector(model.getSubInspector());
		soapModel.setDescription(model.getDescription());
		soapModel.setApplicantRepresentative(model.getApplicantRepresentative());
		soapModel.setApplicantRepresentativeTitle(model.getApplicantRepresentativeTitle());
		soapModel.setInspectionRecordFileEntryId(model.getInspectionRecordFileEntryId());
		soapModel.setCopReportRefNo(model.getCopReportRefNo());
		soapModel.setCopReportRefDate(model.getCopReportRefDate());
		soapModel.setCopReportPreviousNo(model.getCopReportPreviousNo());
		soapModel.setCopReportPreviousDate(model.getCopReportPreviousDate());
		soapModel.setExpiredStatus(model.getExpiredStatus());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());

		return soapModel;
	}

	public static VRCOPReportRepositorySoap[] toSoapModels(
		VRCOPReportRepository[] models) {
		VRCOPReportRepositorySoap[] soapModels = new VRCOPReportRepositorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCOPReportRepositorySoap[][] toSoapModels(
		VRCOPReportRepository[][] models) {
		VRCOPReportRepositorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCOPReportRepositorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCOPReportRepositorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCOPReportRepositorySoap[] toSoapModels(
		List<VRCOPReportRepository> models) {
		List<VRCOPReportRepositorySoap> soapModels = new ArrayList<VRCOPReportRepositorySoap>(models.size());

		for (VRCOPReportRepository model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCOPReportRepositorySoap[soapModels.size()]);
	}

	public VRCOPReportRepositorySoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
	}

	public String getApplicantCode() {
		return _applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		_applicantCode = applicantCode;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return _applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	public String getOverseasManufacturerCode() {
		return _overseasManufacturerCode;
	}

	public void setOverseasManufacturerCode(String overseasManufacturerCode) {
		_overseasManufacturerCode = overseasManufacturerCode;
	}

	public String getOverseasManufacturerName() {
		return _overseasManufacturerName;
	}

	public void setOverseasManufacturerName(String overseasManufacturerName) {
		_overseasManufacturerName = overseasManufacturerName;
	}

	public String getOverseasManufacturerAddress() {
		return _overseasManufacturerAddress;
	}

	public void setOverseasManufacturerAddress(
		String overseasManufacturerAddress) {
		_overseasManufacturerAddress = overseasManufacturerAddress;
	}

	public long getProductionPlantId() {
		return _productionPlantId;
	}

	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return _productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		_productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return _productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		_productionPlantAddress = productionPlantAddress;
	}

	public String getCopReportNo() {
		return _copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		_copReportNo = copReportNo;
	}

	public String getCopReportStatus() {
		return _copReportStatus;
	}

	public void setCopReportStatus(String copReportStatus) {
		_copReportStatus = copReportStatus;
	}

	public String getCopReportType() {
		return _copReportType;
	}

	public void setCopReportType(String copReportType) {
		_copReportType = copReportType;
	}

	public String getCopReportMetadata() {
		return _copReportMetadata;
	}

	public void setCopReportMetadata(String copReportMetadata) {
		_copReportMetadata = copReportMetadata;
	}

	public String getCopReportSignName() {
		return _copReportSignName;
	}

	public void setCopReportSignName(String copReportSignName) {
		_copReportSignName = copReportSignName;
	}

	public String getCopReportSignTitle() {
		return _copReportSignTitle;
	}

	public void setCopReportSignTitle(String copReportSignTitle) {
		_copReportSignTitle = copReportSignTitle;
	}

	public String getCopReportSignPlace() {
		return _copReportSignPlace;
	}

	public void setCopReportSignPlace(String copReportSignPlace) {
		_copReportSignPlace = copReportSignPlace;
	}

	public Date getCopReportDate() {
		return _copReportDate;
	}

	public void setCopReportDate(Date copReportDate) {
		_copReportDate = copReportDate;
	}

	public Date getCopReportApprovedDate() {
		return _copReportApprovedDate;
	}

	public void setCopReportApprovedDate(Date copReportApprovedDate) {
		_copReportApprovedDate = copReportApprovedDate;
	}

	public Date getCopReportExpiredDate() {
		return _copReportExpiredDate;
	}

	public void setCopReportExpiredDate(Date copReportExpiredDate) {
		_copReportExpiredDate = copReportExpiredDate;
	}

	public long getCOPFileEntryId() {
		return _COPFileEntryId;
	}

	public void setCOPFileEntryId(long COPFileEntryId) {
		_COPFileEntryId = COPFileEntryId;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	public String getImporterManufacturerCode() {
		return _importerManufacturerCode;
	}

	public void setImporterManufacturerCode(String importerManufacturerCode) {
		_importerManufacturerCode = importerManufacturerCode;
	}

	public String getImporterManufacturerName() {
		return _importerManufacturerName;
	}

	public void setImporterManufacturerName(String importerManufacturerName) {
		_importerManufacturerName = importerManufacturerName;
	}

	public String getImporterManufacturerAddress() {
		return _importerManufacturerAddress;
	}

	public void setImporterManufacturerAddress(
		String importerManufacturerAddress) {
		_importerManufacturerAddress = importerManufacturerAddress;
	}

	public String getMarkupDomesticsManufacturer() {
		return _markupDomesticsManufacturer;
	}

	public void setMarkupDomesticsManufacturer(
		String markupDomesticsManufacturer) {
		_markupDomesticsManufacturer = markupDomesticsManufacturer;
	}

	public String getMarkupImporter() {
		return _markupImporter;
	}

	public void setMarkupImporter(String markupImporter) {
		_markupImporter = markupImporter;
	}

	public String getCopClassification() {
		return _copClassification;
	}

	public void setCopClassification(String copClassification) {
		_copClassification = copClassification;
	}

	public String getProductClassificationDescription() {
		return _productClassificationDescription;
	}

	public void setProductClassificationDescription(
		String productClassificationDescription) {
		_productClassificationDescription = productClassificationDescription;
	}

	public int getTotalPointA() {
		return _totalPointA;
	}

	public void setTotalPointA(int totalPointA) {
		_totalPointA = totalPointA;
	}

	public int getTotalPointB() {
		return _totalPointB;
	}

	public void setTotalPointB(int totalPointB) {
		_totalPointB = totalPointB;
	}

	public int getTotalPointC() {
		return _totalPointC;
	}

	public void setTotalPointC(int totalPointC) {
		_totalPointC = totalPointC;
	}

	public String getCopNonConformity() {
		return _copNonConformity;
	}

	public void setCopNonConformity(String copNonConformity) {
		_copNonConformity = copNonConformity;
	}

	public String getInspectionRecordNo() {
		return _inspectionRecordNo;
	}

	public void setInspectionRecordNo(String inspectionRecordNo) {
		_inspectionRecordNo = inspectionRecordNo;
	}

	public Date getInspectionRecordDate() {
		return _inspectionRecordDate;
	}

	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_inspectionRecordDate = inspectionRecordDate;
	}

	public long getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(long corporationId) {
		_corporationId = corporationId;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public String getInspectionSite() {
		return _inspectionSite;
	}

	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;
	}

	public Date getInspectionDateFrom() {
		return _inspectionDateFrom;
	}

	public void setInspectionDateFrom(Date inspectionDateFrom) {
		_inspectionDateFrom = inspectionDateFrom;
	}

	public Date getInspectionDateTo() {
		return _inspectionDateTo;
	}

	public void setInspectionDateTo(Date inspectionDateTo) {
		_inspectionDateTo = inspectionDateTo;
	}

	public String getSubInspector() {
		return _subInspector;
	}

	public void setSubInspector(String subInspector) {
		_subInspector = subInspector;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getApplicantRepresentative() {
		return _applicantRepresentative;
	}

	public void setApplicantRepresentative(String applicantRepresentative) {
		_applicantRepresentative = applicantRepresentative;
	}

	public String getApplicantRepresentativeTitle() {
		return _applicantRepresentativeTitle;
	}

	public void setApplicantRepresentativeTitle(
		String applicantRepresentativeTitle) {
		_applicantRepresentativeTitle = applicantRepresentativeTitle;
	}

	public long getInspectionRecordFileEntryId() {
		return _inspectionRecordFileEntryId;
	}

	public void setInspectionRecordFileEntryId(long inspectionRecordFileEntryId) {
		_inspectionRecordFileEntryId = inspectionRecordFileEntryId;
	}

	public String getCopReportRefNo() {
		return _copReportRefNo;
	}

	public void setCopReportRefNo(String copReportRefNo) {
		_copReportRefNo = copReportRefNo;
	}

	public Date getCopReportRefDate() {
		return _copReportRefDate;
	}

	public void setCopReportRefDate(Date copReportRefDate) {
		_copReportRefDate = copReportRefDate;
	}

	public String getCopReportPreviousNo() {
		return _copReportPreviousNo;
	}

	public void setCopReportPreviousNo(String copReportPreviousNo) {
		_copReportPreviousNo = copReportPreviousNo;
	}

	public Date getCopReportPreviousDate() {
		return _copReportPreviousDate;
	}

	public void setCopReportPreviousDate(Date copReportPreviousDate) {
		_copReportPreviousDate = copReportPreviousDate;
	}

	public String getExpiredStatus() {
		return _expiredStatus;
	}

	public void setExpiredStatus(String expiredStatus) {
		_expiredStatus = expiredStatus;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	private long _id;
	private long _mtCore;
	private long _applicantProfileId;
	private String _applicantCode;
	private String _applicantName;
	private String _applicantAddress;
	private String _overseasManufacturerCode;
	private String _overseasManufacturerName;
	private String _overseasManufacturerAddress;
	private long _productionPlantId;
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private String _copReportNo;
	private String _copReportStatus;
	private String _copReportType;
	private String _copReportMetadata;
	private String _copReportSignName;
	private String _copReportSignTitle;
	private String _copReportSignPlace;
	private Date _copReportDate;
	private Date _copReportApprovedDate;
	private Date _copReportExpiredDate;
	private long _COPFileEntryId;
	private Date _modifyDate;
	private Date _syncDate;
	private String _importerManufacturerCode;
	private String _importerManufacturerName;
	private String _importerManufacturerAddress;
	private String _markupDomesticsManufacturer;
	private String _markupImporter;
	private String _copClassification;
	private String _productClassificationDescription;
	private int _totalPointA;
	private int _totalPointB;
	private int _totalPointC;
	private String _copNonConformity;
	private String _inspectionRecordNo;
	private Date _inspectionRecordDate;
	private long _corporationId;
	private long _inspectorId;
	private String _inspectionSite;
	private Date _inspectionDateFrom;
	private Date _inspectionDateTo;
	private String _subInspector;
	private String _description;
	private String _applicantRepresentative;
	private String _applicantRepresentativeTitle;
	private long _inspectionRecordFileEntryId;
	private String _copReportRefNo;
	private Date _copReportRefDate;
	private String _copReportPreviousNo;
	private Date _copReportPreviousDate;
	private String _expiredStatus;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
}