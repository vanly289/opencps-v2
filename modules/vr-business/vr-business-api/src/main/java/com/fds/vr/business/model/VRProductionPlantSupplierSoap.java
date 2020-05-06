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

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCorporationCode(model.getCorporationCode());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setCorporationAddress(model.getCorporationAddress());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());
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

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
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
	private long _mtCore;
	private String _corporationCode;
	private String _corporationName;
	private String _corporationAddress;
	private String _productionPlantCode;
	private Date _modifyDate;
	private Date _syncDate;
}