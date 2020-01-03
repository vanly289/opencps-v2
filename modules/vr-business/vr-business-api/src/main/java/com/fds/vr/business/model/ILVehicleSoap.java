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
 * This class is used by SOAP remote services, specifically {@link com.fds.vr.business.service.http.ILVehicleServiceSoap}.
 *
 * @author LamTV
 * @see com.fds.vr.business.service.http.ILVehicleServiceSoap
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
		soapModel.setTrademarkCode(model.getTrademarkCode());
		soapModel.setTrademarkName(model.getTrademarkName());
		soapModel.setChassisNumber(model.getChassisNumber());
		soapModel.setEngineNumber(model.getEngineNumber());
		soapModel.setVehicleColor(model.getVehicleColor());
		soapModel.setRegistrationType(model.getRegistrationType());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setVehicleOwner(model.getVehicleOwner());
		soapModel.setVehicleOwnerAddress(model.getVehicleOwnerAddress());
		soapModel.setVehicleOwnerTel(model.getVehicleOwnerTel());
		soapModel.setVehicleOwnerFax(model.getVehicleOwnerFax());
		soapModel.setNameOfCompany(model.getNameOfCompany());
		soapModel.setAddress(model.getAddress());

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

	public String getTrademarkCode() {
		return _trademarkCode;
	}

	public void setTrademarkCode(String trademarkCode) {
		_trademarkCode = trademarkCode;
	}

	public String getTrademarkName() {
		return _trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		_trademarkName = trademarkName;
	}

	public String getChassisNumber() {
		return _chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return _engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;
	}

	public String getVehicleColor() {
		return _vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		_vehicleColor = vehicleColor;
	}

	public String getRegistrationType() {
		return _registrationType;
	}

	public void setRegistrationType(String registrationType) {
		_registrationType = registrationType;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	public String getVehicleOwner() {
		return _VehicleOwner;
	}

	public void setVehicleOwner(String VehicleOwner) {
		_VehicleOwner = VehicleOwner;
	}

	public String getVehicleOwnerAddress() {
		return _VehicleOwnerAddress;
	}

	public void setVehicleOwnerAddress(String VehicleOwnerAddress) {
		_VehicleOwnerAddress = VehicleOwnerAddress;
	}

	public String getVehicleOwnerTel() {
		return _VehicleOwnerTel;
	}

	public void setVehicleOwnerTel(String VehicleOwnerTel) {
		_VehicleOwnerTel = VehicleOwnerTel;
	}

	public String getVehicleOwnerFax() {
		return _VehicleOwnerFax;
	}

	public void setVehicleOwnerFax(String VehicleOwnerFax) {
		_VehicleOwnerFax = VehicleOwnerFax;
	}

	public String getNameOfCompany() {
		return _NameOfCompany;
	}

	public void setNameOfCompany(String NameOfCompany) {
		_NameOfCompany = NameOfCompany;
	}

	public String getAddress() {
		return _Address;
	}

	public void setAddress(String Address) {
		_Address = Address;
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
	private String _trademarkCode;
	private String _trademarkName;
	private String _chassisNumber;
	private String _engineNumber;
	private String _vehicleColor;
	private String _registrationType;
	private Date _syncDate;
	private String _VehicleOwner;
	private String _VehicleOwnerAddress;
	private String _VehicleOwnerTel;
	private String _VehicleOwnerFax;
	private String _NameOfCompany;
	private String _Address;
}