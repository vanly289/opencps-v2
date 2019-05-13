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
public class VRProductionPlantSupplierSoap implements Serializable {
	public static VRProductionPlantSupplierSoap toSoapModel(
		VRProductionPlantSupplier model) {
		VRProductionPlantSupplierSoap soapModel = new VRProductionPlantSupplierSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setSupplierId(model.getSupplierId());
		soapModel.setSupplierName(model.getSupplierName());
		soapModel.setSupplieraddress(model.getSupplieraddress());
		soapModel.setCorporationCode(model.getCorporationCode());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setCorporationAddress(model.getCorporationAddress());
		soapModel.setApplicantprofileId(model.getApplicantprofileId());
		soapModel.setProductPlantID(model.getProductPlantID());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
		soapModel.setProductionPlantName(model.getProductionPlantName());
		soapModel.setProductionPlantAddress(model.getProductionPlantAddress());
		soapModel.setMarkupImporter(model.getMarkupImporter());
		soapModel.setMappingMA_CTY(model.getMappingMA_CTY());
		soapModel.setMappingTEN_CTY(model.getMappingTEN_CTY());
		soapModel.setMappingDIA_CHI_CTY(model.getMappingDIA_CHI_CTY());
		soapModel.setMappingMA_XUONG_LR(model.getMappingMA_XUONG_LR());
		soapModel.setMappingTEN_XUONG_LR(model.getMappingTEN_XUONG_LR());
		soapModel.setMappingDIA_CHI_XUONG_LR(model.getMappingDIA_CHI_XUONG_LR());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRProductionPlantSupplierSoap[] toSoapModels(
		VRProductionPlantSupplier[] models) {
		VRProductionPlantSupplierSoap[] soapModels = new VRProductionPlantSupplierSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantSupplierSoap[][] toSoapModels(
		VRProductionPlantSupplier[][] models) {
		VRProductionPlantSupplierSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRProductionPlantSupplierSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRProductionPlantSupplierSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRProductionPlantSupplierSoap[] toSoapModels(
		List<VRProductionPlantSupplier> models) {
		List<VRProductionPlantSupplierSoap> soapModels = new ArrayList<VRProductionPlantSupplierSoap>(models.size());

		for (VRProductionPlantSupplier model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRProductionPlantSupplierSoap[soapModels.size()]);
	}

	public VRProductionPlantSupplierSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
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

	public String getSupplierId() {
		return _supplierId;
	}

	public void setSupplierId(String supplierId) {
		_supplierId = supplierId;
	}

	public String getSupplierName() {
		return _supplierName;
	}

	public void setSupplierName(String supplierName) {
		_supplierName = supplierName;
	}

	public String getSupplieraddress() {
		return _supplieraddress;
	}

	public void setSupplieraddress(String supplieraddress) {
		_supplieraddress = supplieraddress;
	}

	public String getCorporationCode() {
		return _corporationCode;
	}

	public void setCorporationCode(String corporationCode) {
		_corporationCode = corporationCode;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	public String getCorporationAddress() {
		return _corporationAddress;
	}

	public void setCorporationAddress(String corporationAddress) {
		_corporationAddress = corporationAddress;
	}

	public long getApplicantprofileId() {
		return _applicantprofileId;
	}

	public void setApplicantprofileId(long applicantprofileId) {
		_applicantprofileId = applicantprofileId;
	}

	public long getProductPlantID() {
		return _productPlantID;
	}

	public void setProductPlantID(long productPlantID) {
		_productPlantID = productPlantID;
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

	public int getMarkupImporter() {
		return _markupImporter;
	}

	public void setMarkupImporter(int markupImporter) {
		_markupImporter = markupImporter;
	}

	public String getMappingMA_CTY() {
		return _mappingMA_CTY;
	}

	public void setMappingMA_CTY(String mappingMA_CTY) {
		_mappingMA_CTY = mappingMA_CTY;
	}

	public String getMappingTEN_CTY() {
		return _mappingTEN_CTY;
	}

	public void setMappingTEN_CTY(String mappingTEN_CTY) {
		_mappingTEN_CTY = mappingTEN_CTY;
	}

	public String getMappingDIA_CHI_CTY() {
		return _mappingDIA_CHI_CTY;
	}

	public void setMappingDIA_CHI_CTY(String mappingDIA_CHI_CTY) {
		_mappingDIA_CHI_CTY = mappingDIA_CHI_CTY;
	}

	public String getMappingMA_XUONG_LR() {
		return _mappingMA_XUONG_LR;
	}

	public void setMappingMA_XUONG_LR(String mappingMA_XUONG_LR) {
		_mappingMA_XUONG_LR = mappingMA_XUONG_LR;
	}

	public String getMappingTEN_XUONG_LR() {
		return _mappingTEN_XUONG_LR;
	}

	public void setMappingTEN_XUONG_LR(String mappingTEN_XUONG_LR) {
		_mappingTEN_XUONG_LR = mappingTEN_XUONG_LR;
	}

	public String getMappingDIA_CHI_XUONG_LR() {
		return _mappingDIA_CHI_XUONG_LR;
	}

	public void setMappingDIA_CHI_XUONG_LR(String mappingDIA_CHI_XUONG_LR) {
		_mappingDIA_CHI_XUONG_LR = mappingDIA_CHI_XUONG_LR;
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

	private String _uuid;
	private long _id;
	private long _mtCore;
	private String _supplierId;
	private String _supplierName;
	private String _supplieraddress;
	private String _corporationCode;
	private String _corporationName;
	private String _corporationAddress;
	private long _applicantprofileId;
	private long _productPlantID;
	private String _productionPlantCode;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private int _markupImporter;
	private String _mappingMA_CTY;
	private String _mappingTEN_CTY;
	private String _mappingDIA_CHI_CTY;
	private String _mappingMA_XUONG_LR;
	private String _mappingTEN_XUONG_LR;
	private String _mappingDIA_CHI_XUONG_LR;
	private Date _modifyDate;
	private Date _syncDate;
}