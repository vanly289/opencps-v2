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
 * This class is used by SOAP remote services, specifically {@link com.fds.vr.business.service.http.VRProductionPlantServiceSoap}.
 *
 * @author LamTV
 * @see com.fds.vr.business.service.http.VRProductionPlantServiceSoap
 * @generated
 */
@ProviderType
public class VRProductionPlantSoap implements Serializable {
	public static VRProductionPlantSoap toSoapModel(VRProductionPlant model) {
		VRProductionPlantSoap soapModel = new VRProductionPlantSoap();

		soapModel.setId(model.getId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setProductionPlantStateCode(model.getProductionPlantStateCode());
		soapModel.setProductionPlantStateName(model.getProductionPlantStateName());
		soapModel.setProductionPlantProvinceCode(model.getProductionPlantProvinceCode());
		soapModel.setProductionPlantProvinceName(model.getProductionPlantProvinceName());
		soapModel.setProductionPlantDistrictCode(model.getProductionPlantDistrictCode());
		soapModel.setProductionPlantDistrictName(model.getProductionPlantDistrictName());
		soapModel.setProductionPlantEmail(model.getProductionPlantEmail());
		soapModel.setProductionPlantPhone(model.getProductionPlantPhone());
		soapModel.setProductionPlantFax(model.getProductionPlantFax());
		soapModel.setProductionPlantRepresentative(model.getProductionPlantRepresentative());
		soapModel.setProductionPlantRepresentativeTitle(model.getProductionPlantRepresentativeTitle());
		soapModel.setProductionPlantContactName(model.getProductionPlantContactName());
		soapModel.setProductionPlantContactEmail(model.getProductionPlantContactEmail());
		soapModel.setProductionPlantContactPhone(model.getProductionPlantContactPhone());
		soapModel.setProductionPlantType(model.getProductionPlantType());
		soapModel.setProductionPlantStatus(model.getProductionPlantStatus());
		soapModel.setProductionPlantEmployeesNote(model.getProductionPlantEmployeesNote());
		soapModel.setProductionPlantEquipmentsNote(model.getProductionPlantEquipmentsNote());
		soapModel.setProductionPlantProdEquipmentsNote(model.getProductionPlantProdEquipmentsNote());
		soapModel.setApplicantProfileId(model.getApplicantProfileId());
		soapModel.setLatestCOPReportDate(model.getLatestCOPReportDate());
		soapModel.setLatestCOPReportResult(model.getLatestCOPReportResult());
		soapModel.setNextCOPReportDate(model.getNextCOPReportDate());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRProductionPlantSoap[] toSoapModels(
		VRProductionPlant[] models) {
		VRProductionPlantSoap[] soapModels = new VRProductionPlantSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantSoap[][] toSoapModels(
		VRProductionPlant[][] models) {
		VRProductionPlantSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductionPlantSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductionPlantSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantSoap[] toSoapModels(
		List<VRProductionPlant> models) {
		List<VRProductionPlantSoap> soapModels = new ArrayList<VRProductionPlantSoap>(models.size());

		for (VRProductionPlant model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductionPlantSoap[soapModels.size()]);
	}

	public VRProductionPlantSoap() {
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

	public String getProductionPlantStateCode() {
		return _productionPlantStateCode;
	}

	public void setProductionPlantStateCode(String productionPlantStateCode) {
		_productionPlantStateCode = productionPlantStateCode;
	}

	public String getProductionPlantStateName() {
		return _productionPlantStateName;
	}

	public void setProductionPlantStateName(String productionPlantStateName) {
		_productionPlantStateName = productionPlantStateName;
	}

	public String getProductionPlantProvinceCode() {
		return _productionPlantProvinceCode;
	}

	public void setProductionPlantProvinceCode(
		String productionPlantProvinceCode) {
		_productionPlantProvinceCode = productionPlantProvinceCode;
	}

	public String getProductionPlantProvinceName() {
		return _productionPlantProvinceName;
	}

	public void setProductionPlantProvinceName(
		String productionPlantProvinceName) {
		_productionPlantProvinceName = productionPlantProvinceName;
	}

	public String getProductionPlantDistrictCode() {
		return _productionPlantDistrictCode;
	}

	public void setProductionPlantDistrictCode(
		String productionPlantDistrictCode) {
		_productionPlantDistrictCode = productionPlantDistrictCode;
	}

	public String getProductionPlantDistrictName() {
		return _productionPlantDistrictName;
	}

	public void setProductionPlantDistrictName(
		String productionPlantDistrictName) {
		_productionPlantDistrictName = productionPlantDistrictName;
	}

	public String getProductionPlantEmail() {
		return _productionPlantEmail;
	}

	public void setProductionPlantEmail(String productionPlantEmail) {
		_productionPlantEmail = productionPlantEmail;
	}

	public String getProductionPlantPhone() {
		return _productionPlantPhone;
	}

	public void setProductionPlantPhone(String productionPlantPhone) {
		_productionPlantPhone = productionPlantPhone;
	}

	public String getProductionPlantFax() {
		return _productionPlantFax;
	}

	public void setProductionPlantFax(String productionPlantFax) {
		_productionPlantFax = productionPlantFax;
	}

	public String getProductionPlantRepresentative() {
		return _productionPlantRepresentative;
	}

	public void setProductionPlantRepresentative(
		String productionPlantRepresentative) {
		_productionPlantRepresentative = productionPlantRepresentative;
	}

	public String getProductionPlantRepresentativeTitle() {
		return _productionPlantRepresentativeTitle;
	}

	public void setProductionPlantRepresentativeTitle(
		String productionPlantRepresentativeTitle) {
		_productionPlantRepresentativeTitle = productionPlantRepresentativeTitle;
	}

	public String getProductionPlantContactName() {
		return _productionPlantContactName;
	}

	public void setProductionPlantContactName(String productionPlantContactName) {
		_productionPlantContactName = productionPlantContactName;
	}

	public String getProductionPlantContactEmail() {
		return _productionPlantContactEmail;
	}

	public void setProductionPlantContactEmail(
		String productionPlantContactEmail) {
		_productionPlantContactEmail = productionPlantContactEmail;
	}

	public String getProductionPlantContactPhone() {
		return _productionPlantContactPhone;
	}

	public void setProductionPlantContactPhone(
		String productionPlantContactPhone) {
		_productionPlantContactPhone = productionPlantContactPhone;
	}

	public String getProductionPlantType() {
		return _productionPlantType;
	}

	public void setProductionPlantType(String productionPlantType) {
		_productionPlantType = productionPlantType;
	}

	public String getProductionPlantStatus() {
		return _productionPlantStatus;
	}

	public void setProductionPlantStatus(String productionPlantStatus) {
		_productionPlantStatus = productionPlantStatus;
	}

	public String getProductionPlantEmployeesNote() {
		return _productionPlantEmployeesNote;
	}

	public void setProductionPlantEmployeesNote(
		String productionPlantEmployeesNote) {
		_productionPlantEmployeesNote = productionPlantEmployeesNote;
	}

	public String getProductionPlantEquipmentsNote() {
		return _productionPlantEquipmentsNote;
	}

	public void setProductionPlantEquipmentsNote(
		String productionPlantEquipmentsNote) {
		_productionPlantEquipmentsNote = productionPlantEquipmentsNote;
	}

	public String getProductionPlantProdEquipmentsNote() {
		return _productionPlantProdEquipmentsNote;
	}

	public void setProductionPlantProdEquipmentsNote(
		String productionPlantProdEquipmentsNote) {
		_productionPlantProdEquipmentsNote = productionPlantProdEquipmentsNote;
	}

	public long getApplicantProfileId() {
		return _applicantProfileId;
	}

	public void setApplicantProfileId(long applicantProfileId) {
		_applicantProfileId = applicantProfileId;
	}

	public Date getLatestCOPReportDate() {
		return _latestCOPReportDate;
	}

	public void setLatestCOPReportDate(Date latestCOPReportDate) {
		_latestCOPReportDate = latestCOPReportDate;
	}

	public String getLatestCOPReportResult() {
		return _latestCOPReportResult;
	}

	public void setLatestCOPReportResult(String latestCOPReportResult) {
		_latestCOPReportResult = latestCOPReportResult;
	}

	public Date getNextCOPReportDate() {
		return _nextCOPReportDate;
	}

	public void setNextCOPReportDate(Date nextCOPReportDate) {
		_nextCOPReportDate = nextCOPReportDate;
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
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private String _productionPlantStateCode;
	private String _productionPlantStateName;
	private String _productionPlantProvinceCode;
	private String _productionPlantProvinceName;
	private String _productionPlantDistrictCode;
	private String _productionPlantDistrictName;
	private String _productionPlantEmail;
	private String _productionPlantPhone;
	private String _productionPlantFax;
	private String _productionPlantRepresentative;
	private String _productionPlantRepresentativeTitle;
	private String _productionPlantContactName;
	private String _productionPlantContactEmail;
	private String _productionPlantContactPhone;
	private String _productionPlantType;
	private String _productionPlantStatus;
	private String _productionPlantEmployeesNote;
	private String _productionPlantEquipmentsNote;
	private String _productionPlantProdEquipmentsNote;
	private long _applicantProfileId;
	private Date _latestCOPReportDate;
	private String _latestCOPReportResult;
	private Date _nextCOPReportDate;
	private Date _modifyDate;
	private Date _syncDate;
}