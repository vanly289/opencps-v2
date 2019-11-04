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
 * This class is used by SOAP remote services, specifically {@link com.fds.vr.business.service.http.VRIssueServiceSoap}.
 *
 * @author LamTV
 * @see com.fds.vr.business.service.http.VRIssueServiceSoap
 * @generated
 */
@ProviderType
public class VRIssueSoap implements Serializable {
	public static VRIssueSoap toSoapModel(VRIssue model) {
		VRIssueSoap soapModel = new VRIssueSoap();

		soapModel.setId(model.getId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setStampIssueNo(model.getStampIssueNo());
		soapModel.setAppliedDate(model.getAppliedDate());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setApplicantRepresentative(model.getApplicantRepresentative());
		soapModel.setApplicantRepresentativeTitle(model.getApplicantRepresentativeTitle());
		soapModel.setApplicantEmail(model.getApplicantEmail());
		soapModel.setApplicantPhone(model.getApplicantPhone());
		soapModel.setApplicantFax(model.getApplicantFax());
		soapModel.setApplicantContactName(model.getApplicantContactName());
		soapModel.setApplicantContactEmail(model.getApplicantContactEmail());
		soapModel.setApplicantContactPhone(model.getApplicantContactPhone());
		soapModel.setProductionPlantId(model.getProductionPlantId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setMethodOfIssue(model.getMethodOfIssue());
		soapModel.setTotalInDocument(model.getTotalInDocument());
		soapModel.setIssueCorporationId(model.getIssueCorporationId());
		soapModel.setVerifyCorporationId(model.getVerifyCorporationId());
		soapModel.setDigitalissuestatus(model.getDigitalissuestatus());

		return soapModel;
	}

	public static VRIssueSoap[] toSoapModels(VRIssue[] models) {
		VRIssueSoap[] soapModels = new VRIssueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRIssueSoap[][] toSoapModels(VRIssue[][] models) {
		VRIssueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRIssueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRIssueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRIssueSoap[] toSoapModels(List<VRIssue> models) {
		List<VRIssueSoap> soapModels = new ArrayList<VRIssueSoap>(models.size());

		for (VRIssue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRIssueSoap[soapModels.size()]);
	}

	public VRIssueSoap() {
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

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getStampIssueNo() {
		return _stampIssueNo;
	}

	public void setStampIssueNo(String stampIssueNo) {
		_stampIssueNo = stampIssueNo;
	}

	public Date getAppliedDate() {
		return _appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		_appliedDate = appliedDate;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
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

	public String getApplicantEmail() {
		return _applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		_applicantEmail = applicantEmail;
	}

	public String getApplicantPhone() {
		return _applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		_applicantPhone = applicantPhone;
	}

	public String getApplicantFax() {
		return _applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		_applicantFax = applicantFax;
	}

	public String getApplicantContactName() {
		return _applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		_applicantContactName = applicantContactName;
	}

	public String getApplicantContactEmail() {
		return _applicantContactEmail;
	}

	public void setApplicantContactEmail(String applicantContactEmail) {
		_applicantContactEmail = applicantContactEmail;
	}

	public String getApplicantContactPhone() {
		return _applicantContactPhone;
	}

	public void setApplicantContactPhone(String applicantContactPhone) {
		_applicantContactPhone = applicantContactPhone;
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

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getMethodOfIssue() {
		return _methodOfIssue;
	}

	public void setMethodOfIssue(String methodOfIssue) {
		_methodOfIssue = methodOfIssue;
	}

	public long getTotalInDocument() {
		return _totalInDocument;
	}

	public void setTotalInDocument(long totalInDocument) {
		_totalInDocument = totalInDocument;
	}

	public String getIssueCorporationId() {
		return _issueCorporationId;
	}

	public void setIssueCorporationId(String issueCorporationId) {
		_issueCorporationId = issueCorporationId;
	}

	public String getVerifyCorporationId() {
		return _verifyCorporationId;
	}

	public void setVerifyCorporationId(String verifyCorporationId) {
		_verifyCorporationId = verifyCorporationId;
	}

	public String getDigitalissuestatus() {
		return _digitalissuestatus;
	}

	public void setDigitalissuestatus(String digitalissuestatus) {
		_digitalissuestatus = digitalissuestatus;
	}

	private long _id;
	private long _dossierId;
	private String _stampIssueNo;
	private Date _appliedDate;
	private Date _approvedDate;
	private String _vehicleClass;
	private long _applicantProfileId;
	private String _applicantName;
	private String _applicantAddress;
	private String _applicantRepresentative;
	private String _applicantRepresentativeTitle;
	private String _applicantEmail;
	private String _applicantPhone;
	private String _applicantFax;
	private String _applicantContactName;
	private String _applicantContactEmail;
	private String _applicantContactPhone;
	private long _productionPlantId;
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private String _remarks;
	private String _methodOfIssue;
	private long _totalInDocument;
	private String _issueCorporationId;
	private String _verifyCorporationId;
	private String _digitalissuestatus;
}