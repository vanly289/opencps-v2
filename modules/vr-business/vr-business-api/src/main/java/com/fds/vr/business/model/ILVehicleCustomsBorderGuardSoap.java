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
public class ILVehicleCustomsBorderGuardSoap implements Serializable {
	public static ILVehicleCustomsBorderGuardSoap toSoapModel(
		ILVehicleCustomsBorderGuard model) {
		ILVehicleCustomsBorderGuardSoap soapModel = new ILVehicleCustomsBorderGuardSoap();

		soapModel.setId(model.getId());
		soapModel.setRegistrationNumber(model.getRegistrationNumber());
		soapModel.setExpImpGateType(model.getExpImpGateType());
		soapModel.setExpImpGate(model.getExpImpGate());
		soapModel.setDriverName(model.getDriverName());
		soapModel.setDriverLicenceNo(model.getDriverLicenceNo());
		soapModel.setRegistrationDate(model.getRegistrationDate());
		soapModel.setCustomsDepartureDate(model.getCustomsDepartureDate());
		soapModel.setCustomsArrivalDate(model.getCustomsArrivalDate());
		soapModel.setBorderGuardsDepartureDate(model.getBorderGuardsDepartureDate());
		soapModel.setBorderGuardsArrivalDate(model.getBorderGuardsArrivalDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static ILVehicleCustomsBorderGuardSoap[] toSoapModels(
		ILVehicleCustomsBorderGuard[] models) {
		ILVehicleCustomsBorderGuardSoap[] soapModels = new ILVehicleCustomsBorderGuardSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ILVehicleCustomsBorderGuardSoap[][] toSoapModels(
		ILVehicleCustomsBorderGuard[][] models) {
		ILVehicleCustomsBorderGuardSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ILVehicleCustomsBorderGuardSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ILVehicleCustomsBorderGuardSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ILVehicleCustomsBorderGuardSoap[] toSoapModels(
		List<ILVehicleCustomsBorderGuard> models) {
		List<ILVehicleCustomsBorderGuardSoap> soapModels = new ArrayList<ILVehicleCustomsBorderGuardSoap>(models.size());

		for (ILVehicleCustomsBorderGuard model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ILVehicleCustomsBorderGuardSoap[soapModels.size()]);
	}

	public ILVehicleCustomsBorderGuardSoap() {
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

	public String getRegistrationNumber() {
		return _registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		_registrationNumber = registrationNumber;
	}

	public String getExpImpGateType() {
		return _expImpGateType;
	}

	public void setExpImpGateType(String expImpGateType) {
		_expImpGateType = expImpGateType;
	}

	public String getExpImpGate() {
		return _expImpGate;
	}

	public void setExpImpGate(String expImpGate) {
		_expImpGate = expImpGate;
	}

	public String getDriverName() {
		return _driverName;
	}

	public void setDriverName(String driverName) {
		_driverName = driverName;
	}

	public String getDriverLicenceNo() {
		return _driverLicenceNo;
	}

	public void setDriverLicenceNo(String driverLicenceNo) {
		_driverLicenceNo = driverLicenceNo;
	}

	public Date getRegistrationDate() {
		return _registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		_registrationDate = registrationDate;
	}

	public Date getCustomsDepartureDate() {
		return _customsDepartureDate;
	}

	public void setCustomsDepartureDate(Date customsDepartureDate) {
		_customsDepartureDate = customsDepartureDate;
	}

	public Date getCustomsArrivalDate() {
		return _customsArrivalDate;
	}

	public void setCustomsArrivalDate(Date customsArrivalDate) {
		_customsArrivalDate = customsArrivalDate;
	}

	public Date getBorderGuardsDepartureDate() {
		return _borderGuardsDepartureDate;
	}

	public void setBorderGuardsDepartureDate(Date borderGuardsDepartureDate) {
		_borderGuardsDepartureDate = borderGuardsDepartureDate;
	}

	public Date getBorderGuardsArrivalDate() {
		return _borderGuardsArrivalDate;
	}

	public void setBorderGuardsArrivalDate(Date borderGuardsArrivalDate) {
		_borderGuardsArrivalDate = borderGuardsArrivalDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private String _registrationNumber;
	private String _expImpGateType;
	private String _expImpGate;
	private String _driverName;
	private String _driverLicenceNo;
	private Date _registrationDate;
	private Date _customsDepartureDate;
	private Date _customsArrivalDate;
	private Date _borderGuardsDepartureDate;
	private Date _borderGuardsArrivalDate;
	private Date _syncDate;
}