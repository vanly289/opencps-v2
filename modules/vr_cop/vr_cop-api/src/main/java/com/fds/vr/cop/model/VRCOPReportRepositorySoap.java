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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author HoangLeTrongNhan
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
		soapModel.setCOPReportNo(model.getCOPReportNo());
		soapModel.setCOPReportStatus(model.getCOPReportStatus());
		soapModel.setCOPReportType(model.getCOPReportType());
		soapModel.setCOPReportMetadata(model.getCOPReportMetadata());
		soapModel.setCOPReportSignName(model.getCOPReportSignName());
		soapModel.setCOPReportSignTitle(model.getCOPReportSignTitle());
		soapModel.setCOPReportSignPlace(model.getCOPReportSignPlace());
		soapModel.setCOPReportDate(model.getCOPReportDate());
		soapModel.setCOPReportApprovedDate(model.getCOPReportApprovedDate());
		soapModel.setCOPReportExpiredDate(model.getCOPReportExpiredDate());
		soapModel.setCOPFileEntryId(model.getCOPFileEntryId());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

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

	public int getMtCore() {
		return _mtCore;
	}

	public void setMtCore(int mtCore) {
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

	public String getCOPReportNo() {
		return _COPReportNo;
	}

	public void setCOPReportNo(String COPReportNo) {
		_COPReportNo = COPReportNo;
	}

	public String getCOPReportStatus() {
		return _COPReportStatus;
	}

	public void setCOPReportStatus(String COPReportStatus) {
		_COPReportStatus = COPReportStatus;
	}

	public String getCOPReportType() {
		return _COPReportType;
	}

	public void setCOPReportType(String COPReportType) {
		_COPReportType = COPReportType;
	}

	public String getCOPReportMetadata() {
		return _COPReportMetadata;
	}

	public void setCOPReportMetadata(String COPReportMetadata) {
		_COPReportMetadata = COPReportMetadata;
	}

	public String getCOPReportSignName() {
		return _COPReportSignName;
	}

	public void setCOPReportSignName(String COPReportSignName) {
		_COPReportSignName = COPReportSignName;
	}

	public String getCOPReportSignTitle() {
		return _COPReportSignTitle;
	}

	public void setCOPReportSignTitle(String COPReportSignTitle) {
		_COPReportSignTitle = COPReportSignTitle;
	}

	public String getCOPReportSignPlace() {
		return _COPReportSignPlace;
	}

	public void setCOPReportSignPlace(String COPReportSignPlace) {
		_COPReportSignPlace = COPReportSignPlace;
	}

	public Date getCOPReportDate() {
		return _COPReportDate;
	}

	public void setCOPReportDate(Date COPReportDate) {
		_COPReportDate = COPReportDate;
	}

	public Date getCOPReportApprovedDate() {
		return _COPReportApprovedDate;
	}

	public void setCOPReportApprovedDate(Date COPReportApprovedDate) {
		_COPReportApprovedDate = COPReportApprovedDate;
	}

	public Date getCOPReportExpiredDate() {
		return _COPReportExpiredDate;
	}

	public void setCOPReportExpiredDate(Date COPReportExpiredDate) {
		_COPReportExpiredDate = COPReportExpiredDate;
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

	private long _id;
	private int _mtCore;
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
	private String _COPReportNo;
	private String _COPReportStatus;
	private String _COPReportType;
	private String _COPReportMetadata;
	private String _COPReportSignName;
	private String _COPReportSignTitle;
	private String _COPReportSignPlace;
	private Date _COPReportDate;
	private Date _COPReportApprovedDate;
	private Date _COPReportExpiredDate;
	private long _COPFileEntryId;
	private Date _modifyDate;
	private Date _syncDate;
}