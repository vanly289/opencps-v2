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
public class ILVehicleSoap implements Serializable {
	public static ILVehicleSoap toSoapModel(ILVehicle model) {
		ILVehicleSoap soapModel = new ILVehicleSoap();

		soapModel.setId(model.getId());
		soapModel.setIssuingDispatchNo(model.getIssuingDispatchNo());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setRegistrationNumber(model.getRegistrationNumber());
		soapModel.setRegistrationDriver(model.getRegistrationDriver());
		soapModel.setVehicleModelCode(model.getVehicleModelCode());
		soapModel.setVehicleModelName(model.getVehicleModelName());
		soapModel.setCapacity(model.getCapacity());
		soapModel.setManufacturedYear(model.getManufacturedYear());
		soapModel.setVehicleExpImpGateCode(model.getVehicleExpImpGateCode());
		soapModel.setVehicleExpImpGate(model.getVehicleExpImpGate());
		soapModel.setOperationType(model.getOperationType());
		soapModel.setPassengerOrCargo(model.getPassengerOrCargo());
		soapModel.setLienVanNo(model.getLienVanNo());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static ILVehicleSoap[] toSoapModels(ILVehicle[] models) {
		ILVehicleSoap[] soapModels = new ILVehicleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ILVehicleSoap[][] toSoapModels(ILVehicle[][] models) {
		ILVehicleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ILVehicleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ILVehicleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ILVehicleSoap[] toSoapModels(List<ILVehicle> models) {
		List<ILVehicleSoap> soapModels = new ArrayList<ILVehicleSoap>(models.size());

		for (ILVehicle model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ILVehicleSoap[soapModels.size()]);
	}

	public ILVehicleSoap() {
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

	public String getIssuingDispatchNo() {
		return _issuingDispatchNo;
	}

	public void setIssuingDispatchNo(String issuingDispatchNo) {
		_issuingDispatchNo = issuingDispatchNo;
	}

	public int getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getRegistrationNumber() {
		return _registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		_registrationNumber = registrationNumber;
	}

	public String getRegistrationDriver() {
		return _registrationDriver;
	}

	public void setRegistrationDriver(String registrationDriver) {
		_registrationDriver = registrationDriver;
	}

	public String getVehicleModelCode() {
		return _vehicleModelCode;
	}

	public void setVehicleModelCode(String vehicleModelCode) {
		_vehicleModelCode = vehicleModelCode;
	}

	public String getVehicleModelName() {
		return _vehicleModelName;
	}

	public void setVehicleModelName(String vehicleModelName) {
		_vehicleModelName = vehicleModelName;
	}

	public String getCapacity() {
		return _capacity;
	}

	public void setCapacity(String capacity) {
		_capacity = capacity;
	}

	public String getManufacturedYear() {
		return _manufacturedYear;
	}

	public void setManufacturedYear(String manufacturedYear) {
		_manufacturedYear = manufacturedYear;
	}

	public String getVehicleExpImpGateCode() {
		return _vehicleExpImpGateCode;
	}

	public void setVehicleExpImpGateCode(String vehicleExpImpGateCode) {
		_vehicleExpImpGateCode = vehicleExpImpGateCode;
	}

	public String getVehicleExpImpGate() {
		return _vehicleExpImpGate;
	}

	public void setVehicleExpImpGate(String vehicleExpImpGate) {
		_vehicleExpImpGate = vehicleExpImpGate;
	}

	public String getOperationType() {
		return _operationType;
	}

	public void setOperationType(String operationType) {
		_operationType = operationType;
	}

	public String getPassengerOrCargo() {
		return _passengerOrCargo;
	}

	public void setPassengerOrCargo(String passengerOrCargo) {
		_passengerOrCargo = passengerOrCargo;
	}

	public String getLienVanNo() {
		return _lienVanNo;
	}

	public void setLienVanNo(String lienVanNo) {
		_lienVanNo = lienVanNo;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private String _issuingDispatchNo;
	private int _sequenceNo;
	private String _registrationNumber;
	private String _registrationDriver;
	private String _vehicleModelCode;
	private String _vehicleModelName;
	private String _capacity;
	private String _manufacturedYear;
	private String _vehicleExpImpGateCode;
	private String _vehicleExpImpGate;
	private String _operationType;
	private String _passengerOrCargo;
	private String _lienVanNo;
	private Date _syncDate;
}