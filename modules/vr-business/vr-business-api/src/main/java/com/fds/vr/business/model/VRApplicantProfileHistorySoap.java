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
 * This class is used by SOAP remote services, specifically {@link com.fds.vr.business.service.http.VRApplicantProfileHistoryServiceSoap}.
 *
 * @author LamTV
 * @see com.fds.vr.business.service.http.VRApplicantProfileHistoryServiceSoap
 * @generated
 */
@ProviderType
public class VRApplicantProfileHistorySoap implements Serializable {
	public static VRApplicantProfileHistorySoap toSoapModel(
		VRApplicantProfileHistory model) {
		VRApplicantProfileHistorySoap soapModel = new VRApplicantProfileHistorySoap();

		soapModel.setId(model.getId());
		soapModel.setApplicantCode(model.getApplicantCode());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setApplicantRepresentative(model.getApplicantRepresentative());
		soapModel.setApplicantRepresentativeTitle(model.getApplicantRepresentativeTitle());
		soapModel.setApplicantPhone(model.getApplicantPhone());
		soapModel.setApplicantEmail(model.getApplicantEmail());
		soapModel.setApplicantFax(model.getApplicantFax());
		soapModel.setApplicantContactName(model.getApplicantContactName());
		soapModel.setApplicantContactEmail(model.getApplicantContactEmail());
		soapModel.setApplicantContactPhone(model.getApplicantContactPhone());
		soapModel.setApplicantNationality(model.getApplicantNationality());
		soapModel.setApplicantRegion(model.getApplicantRegion());
		soapModel.setApplicantCeremonyDate(model.getApplicantCeremonyDate());
		soapModel.setApplicantOperationPeriod(model.getApplicantOperationPeriod());
		soapModel.setApplicantBusinessType(model.getApplicantBusinessType());
		soapModel.setApplicantMetadata(model.getApplicantMetadata());
		soapModel.setApplicantStatus(model.getApplicantStatus());
		soapModel.setApplicantIssueType(model.getApplicantIssueType());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRApplicantProfileHistorySoap[] toSoapModels(
		VRApplicantProfileHistory[] models) {
		VRApplicantProfileHistorySoap[] soapModels = new VRApplicantProfileHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRApplicantProfileHistorySoap[][] toSoapModels(
		VRApplicantProfileHistory[][] models) {
		VRApplicantProfileHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRApplicantProfileHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRApplicantProfileHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRApplicantProfileHistorySoap[] toSoapModels(
		List<VRApplicantProfileHistory> models) {
		List<VRApplicantProfileHistorySoap> soapModels = new ArrayList<VRApplicantProfileHistorySoap>(models.size());

		for (VRApplicantProfileHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRApplicantProfileHistorySoap[soapModels.size()]);
	}

	public VRApplicantProfileHistorySoap() {
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

	public String getApplicantPhone() {
		return _applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		_applicantPhone = applicantPhone;
	}

	public String getApplicantEmail() {
		return _applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		_applicantEmail = applicantEmail;
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

	public String getApplicantNationality() {
		return _applicantNationality;
	}

	public void setApplicantNationality(String applicantNationality) {
		_applicantNationality = applicantNationality;
	}

	public String getApplicantRegion() {
		return _applicantRegion;
	}

	public void setApplicantRegion(String applicantRegion) {
		_applicantRegion = applicantRegion;
	}

	public String getApplicantCeremonyDate() {
		return _applicantCeremonyDate;
	}

	public void setApplicantCeremonyDate(String applicantCeremonyDate) {
		_applicantCeremonyDate = applicantCeremonyDate;
	}

	public String getApplicantOperationPeriod() {
		return _applicantOperationPeriod;
	}

	public void setApplicantOperationPeriod(String applicantOperationPeriod) {
		_applicantOperationPeriod = applicantOperationPeriod;
	}

	public String getApplicantBusinessType() {
		return _applicantBusinessType;
	}

	public void setApplicantBusinessType(String applicantBusinessType) {
		_applicantBusinessType = applicantBusinessType;
	}

	public String getApplicantMetadata() {
		return _applicantMetadata;
	}

	public void setApplicantMetadata(String applicantMetadata) {
		_applicantMetadata = applicantMetadata;
	}

	public String getApplicantStatus() {
		return _applicantStatus;
	}

	public void setApplicantStatus(String applicantStatus) {
		_applicantStatus = applicantStatus;
	}

	public String getApplicantIssueType() {
		return _applicantIssueType;
	}

	public void setApplicantIssueType(String applicantIssueType) {
		_applicantIssueType = applicantIssueType;
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

	private long _id;
	private String _applicantCode;
	private String _applicantName;
	private String _applicantAddress;
	private String _applicantRepresentative;
	private String _applicantRepresentativeTitle;
	private String _applicantPhone;
	private String _applicantEmail;
	private String _applicantFax;
	private String _applicantContactName;
	private String _applicantContactEmail;
	private String _applicantContactPhone;
	private String _applicantNationality;
	private String _applicantRegion;
	private String _applicantCeremonyDate;
	private String _applicantOperationPeriod;
	private String _applicantBusinessType;
	private String _applicantMetadata;
	private String _applicantStatus;
	private String _applicantIssueType;
	private Date _modifyDate;
	private Date _syncDate;
}