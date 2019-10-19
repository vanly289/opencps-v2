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
public class VRCOPProductTypeSoap implements Serializable {
	public static VRCOPProductTypeSoap toSoapModel(VRCOPProductType model) {
		VRCOPProductTypeSoap soapModel = new VRCOPProductTypeSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCOPReportRepositoryID(model.getCOPReportRepositoryID());
		soapModel.setCOPReportNo(model.getCOPReportNo());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setVehicleTypeCode(model.getVehicleTypeCode());
		soapModel.setVehicleTypeDescription(model.getVehicleTypeDescription());
		soapModel.setProductClassificationCode(model.getProductClassificationCode());
		soapModel.setProductClassificationDescription(model.getProductClassificationDescription());
		soapModel.setTradeMark(model.getTradeMark());
		soapModel.setTradeMarkName(model.getTradeMarkName());
		soapModel.setCommercialName(model.getCommercialName());
		soapModel.setModelCode(model.getModelCode());
		soapModel.setDesignSymbolNo(model.getDesignSymbolNo());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRCOPProductTypeSoap[] toSoapModels(VRCOPProductType[] models) {
		VRCOPProductTypeSoap[] soapModels = new VRCOPProductTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCOPProductTypeSoap[][] toSoapModels(
		VRCOPProductType[][] models) {
		VRCOPProductTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCOPProductTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCOPProductTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCOPProductTypeSoap[] toSoapModels(
		List<VRCOPProductType> models) {
		List<VRCOPProductTypeSoap> soapModels = new ArrayList<VRCOPProductTypeSoap>(models.size());

		for (VRCOPProductType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCOPProductTypeSoap[soapModels.size()]);
	}

	public VRCOPProductTypeSoap() {
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

	public long getCOPReportRepositoryID() {
		return _COPReportRepositoryID;
	}

	public void setCOPReportRepositoryID(long COPReportRepositoryID) {
		_COPReportRepositoryID = COPReportRepositoryID;
	}

	public String getCOPReportNo() {
		return _COPReportNo;
	}

	public void setCOPReportNo(String COPReportNo) {
		_COPReportNo = COPReportNo;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getVehicleTypeCode() {
		return _vehicleTypeCode;
	}

	public void setVehicleTypeCode(String vehicleTypeCode) {
		_vehicleTypeCode = vehicleTypeCode;
	}

	public String getVehicleTypeDescription() {
		return _vehicleTypeDescription;
	}

	public void setVehicleTypeDescription(String vehicleTypeDescription) {
		_vehicleTypeDescription = vehicleTypeDescription;
	}

	public String getProductClassificationCode() {
		return _productClassificationCode;
	}

	public void setProductClassificationCode(String productClassificationCode) {
		_productClassificationCode = productClassificationCode;
	}

	public String getProductClassificationDescription() {
		return _productClassificationDescription;
	}

	public void setProductClassificationDescription(
		String productClassificationDescription) {
		_productClassificationDescription = productClassificationDescription;
	}

	public String getTradeMark() {
		return _tradeMark;
	}

	public void setTradeMark(String tradeMark) {
		_tradeMark = tradeMark;
	}

	public String getTradeMarkName() {
		return _tradeMarkName;
	}

	public void setTradeMarkName(String tradeMarkName) {
		_tradeMarkName = tradeMarkName;
	}

	public String getCommercialName() {
		return _commercialName;
	}

	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;
	}

	public String getModelCode() {
		return _modelCode;
	}

	public void setModelCode(String modelCode) {
		_modelCode = modelCode;
	}

	public String getDesignSymbolNo() {
		return _designSymbolNo;
	}

	public void setDesignSymbolNo(String designSymbolNo) {
		_designSymbolNo = designSymbolNo;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private int _mtCore;
	private long _COPReportRepositoryID;
	private String _COPReportNo;
	private long _sequenceNo;
	private String _vehicleClass;
	private String _vehicleTypeCode;
	private String _vehicleTypeDescription;
	private String _productClassificationCode;
	private String _productClassificationDescription;
	private String _tradeMark;
	private String _tradeMarkName;
	private String _commercialName;
	private String _modelCode;
	private String _designSymbolNo;
	private Date _syncDate;
}