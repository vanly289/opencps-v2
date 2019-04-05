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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ILVehicle}.
 * </p>
 *
 * @author LamTV
 * @see ILVehicle
 * @generated
 */
@ProviderType
public class ILVehicleWrapper implements ILVehicle, ModelWrapper<ILVehicle> {
	public ILVehicleWrapper(ILVehicle ilVehicle) {
		_ilVehicle = ilVehicle;
	}

	@Override
	public Class<?> getModelClass() {
		return ILVehicle.class;
	}

	@Override
	public String getModelClassName() {
		return ILVehicle.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("issuingDispatchNo", getIssuingDispatchNo());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("registrationNumber", getRegistrationNumber());
		attributes.put("registrationDriver", getRegistrationDriver());
		attributes.put("vehicleModelCode", getVehicleModelCode());
		attributes.put("vehicleModelName", getVehicleModelName());
		attributes.put("capacity", getCapacity());
		attributes.put("manufacturedYear", getManufacturedYear());
		attributes.put("vehicleExpImpGateCode", getVehicleExpImpGateCode());
		attributes.put("vehicleExpImpGate", getVehicleExpImpGate());
		attributes.put("operationType", getOperationType());
		attributes.put("passengerOrCargo", getPassengerOrCargo());
		attributes.put("lienVanNo", getLienVanNo());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String issuingDispatchNo = (String)attributes.get("issuingDispatchNo");

		if (issuingDispatchNo != null) {
			setIssuingDispatchNo(issuingDispatchNo);
		}

		Integer sequenceNo = (Integer)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String registrationNumber = (String)attributes.get("registrationNumber");

		if (registrationNumber != null) {
			setRegistrationNumber(registrationNumber);
		}

		String registrationDriver = (String)attributes.get("registrationDriver");

		if (registrationDriver != null) {
			setRegistrationDriver(registrationDriver);
		}

		String vehicleModelCode = (String)attributes.get("vehicleModelCode");

		if (vehicleModelCode != null) {
			setVehicleModelCode(vehicleModelCode);
		}

		String vehicleModelName = (String)attributes.get("vehicleModelName");

		if (vehicleModelName != null) {
			setVehicleModelName(vehicleModelName);
		}

		String capacity = (String)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		String manufacturedYear = (String)attributes.get("manufacturedYear");

		if (manufacturedYear != null) {
			setManufacturedYear(manufacturedYear);
		}

		String vehicleExpImpGateCode = (String)attributes.get(
				"vehicleExpImpGateCode");

		if (vehicleExpImpGateCode != null) {
			setVehicleExpImpGateCode(vehicleExpImpGateCode);
		}

		String vehicleExpImpGate = (String)attributes.get("vehicleExpImpGate");

		if (vehicleExpImpGate != null) {
			setVehicleExpImpGate(vehicleExpImpGate);
		}

		String operationType = (String)attributes.get("operationType");

		if (operationType != null) {
			setOperationType(operationType);
		}

		String passengerOrCargo = (String)attributes.get("passengerOrCargo");

		if (passengerOrCargo != null) {
			setPassengerOrCargo(passengerOrCargo);
		}

		String lienVanNo = (String)attributes.get("lienVanNo");

		if (lienVanNo != null) {
			setLienVanNo(lienVanNo);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public ILVehicle toEscapedModel() {
		return new ILVehicleWrapper(_ilVehicle.toEscapedModel());
	}

	@Override
	public ILVehicle toUnescapedModel() {
		return new ILVehicleWrapper(_ilVehicle.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ilVehicle.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ilVehicle.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ilVehicle.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ilVehicle.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ILVehicle> toCacheModel() {
		return _ilVehicle.toCacheModel();
	}

	@Override
	public int compareTo(ILVehicle ilVehicle) {
		return _ilVehicle.compareTo(ilVehicle);
	}

	/**
	* Returns the sequence no of this il vehicle.
	*
	* @return the sequence no of this il vehicle
	*/
	@Override
	public int getSequenceNo() {
		return _ilVehicle.getSequenceNo();
	}

	@Override
	public int hashCode() {
		return _ilVehicle.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ilVehicle.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ILVehicleWrapper((ILVehicle)_ilVehicle.clone());
	}

	/**
	* Returns the capacity of this il vehicle.
	*
	* @return the capacity of this il vehicle
	*/
	@Override
	public java.lang.String getCapacity() {
		return _ilVehicle.getCapacity();
	}

	/**
	* Returns the issuing dispatch no of this il vehicle.
	*
	* @return the issuing dispatch no of this il vehicle
	*/
	@Override
	public java.lang.String getIssuingDispatchNo() {
		return _ilVehicle.getIssuingDispatchNo();
	}

	/**
	* Returns the lien van no of this il vehicle.
	*
	* @return the lien van no of this il vehicle
	*/
	@Override
	public java.lang.String getLienVanNo() {
		return _ilVehicle.getLienVanNo();
	}

	/**
	* Returns the manufactured year of this il vehicle.
	*
	* @return the manufactured year of this il vehicle
	*/
	@Override
	public java.lang.String getManufacturedYear() {
		return _ilVehicle.getManufacturedYear();
	}

	/**
	* Returns the operation type of this il vehicle.
	*
	* @return the operation type of this il vehicle
	*/
	@Override
	public java.lang.String getOperationType() {
		return _ilVehicle.getOperationType();
	}

	/**
	* Returns the passenger or cargo of this il vehicle.
	*
	* @return the passenger or cargo of this il vehicle
	*/
	@Override
	public java.lang.String getPassengerOrCargo() {
		return _ilVehicle.getPassengerOrCargo();
	}

	/**
	* Returns the registration driver of this il vehicle.
	*
	* @return the registration driver of this il vehicle
	*/
	@Override
	public java.lang.String getRegistrationDriver() {
		return _ilVehicle.getRegistrationDriver();
	}

	/**
	* Returns the registration number of this il vehicle.
	*
	* @return the registration number of this il vehicle
	*/
	@Override
	public java.lang.String getRegistrationNumber() {
		return _ilVehicle.getRegistrationNumber();
	}

	/**
	* Returns the vehicle exp imp gate of this il vehicle.
	*
	* @return the vehicle exp imp gate of this il vehicle
	*/
	@Override
	public java.lang.String getVehicleExpImpGate() {
		return _ilVehicle.getVehicleExpImpGate();
	}

	/**
	* Returns the vehicle exp imp gate code of this il vehicle.
	*
	* @return the vehicle exp imp gate code of this il vehicle
	*/
	@Override
	public java.lang.String getVehicleExpImpGateCode() {
		return _ilVehicle.getVehicleExpImpGateCode();
	}

	/**
	* Returns the vehicle model code of this il vehicle.
	*
	* @return the vehicle model code of this il vehicle
	*/
	@Override
	public java.lang.String getVehicleModelCode() {
		return _ilVehicle.getVehicleModelCode();
	}

	/**
	* Returns the vehicle model name of this il vehicle.
	*
	* @return the vehicle model name of this il vehicle
	*/
	@Override
	public java.lang.String getVehicleModelName() {
		return _ilVehicle.getVehicleModelName();
	}

	@Override
	public java.lang.String toString() {
		return _ilVehicle.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ilVehicle.toXmlString();
	}

	/**
	* Returns the sync date of this il vehicle.
	*
	* @return the sync date of this il vehicle
	*/
	@Override
	public Date getSyncDate() {
		return _ilVehicle.getSyncDate();
	}

	/**
	* Returns the ID of this il vehicle.
	*
	* @return the ID of this il vehicle
	*/
	@Override
	public long getId() {
		return _ilVehicle.getId();
	}

	/**
	* Returns the primary key of this il vehicle.
	*
	* @return the primary key of this il vehicle
	*/
	@Override
	public long getPrimaryKey() {
		return _ilVehicle.getPrimaryKey();
	}

	@Override
	public void persist() {
		_ilVehicle.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ilVehicle.setCachedModel(cachedModel);
	}

	/**
	* Sets the capacity of this il vehicle.
	*
	* @param capacity the capacity of this il vehicle
	*/
	@Override
	public void setCapacity(java.lang.String capacity) {
		_ilVehicle.setCapacity(capacity);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ilVehicle.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ilVehicle.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ilVehicle.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this il vehicle.
	*
	* @param id the ID of this il vehicle
	*/
	@Override
	public void setId(long id) {
		_ilVehicle.setId(id);
	}

	/**
	* Sets the issuing dispatch no of this il vehicle.
	*
	* @param issuingDispatchNo the issuing dispatch no of this il vehicle
	*/
	@Override
	public void setIssuingDispatchNo(java.lang.String issuingDispatchNo) {
		_ilVehicle.setIssuingDispatchNo(issuingDispatchNo);
	}

	/**
	* Sets the lien van no of this il vehicle.
	*
	* @param lienVanNo the lien van no of this il vehicle
	*/
	@Override
	public void setLienVanNo(java.lang.String lienVanNo) {
		_ilVehicle.setLienVanNo(lienVanNo);
	}

	/**
	* Sets the manufactured year of this il vehicle.
	*
	* @param manufacturedYear the manufactured year of this il vehicle
	*/
	@Override
	public void setManufacturedYear(java.lang.String manufacturedYear) {
		_ilVehicle.setManufacturedYear(manufacturedYear);
	}

	@Override
	public void setNew(boolean n) {
		_ilVehicle.setNew(n);
	}

	/**
	* Sets the operation type of this il vehicle.
	*
	* @param operationType the operation type of this il vehicle
	*/
	@Override
	public void setOperationType(java.lang.String operationType) {
		_ilVehicle.setOperationType(operationType);
	}

	/**
	* Sets the passenger or cargo of this il vehicle.
	*
	* @param passengerOrCargo the passenger or cargo of this il vehicle
	*/
	@Override
	public void setPassengerOrCargo(java.lang.String passengerOrCargo) {
		_ilVehicle.setPassengerOrCargo(passengerOrCargo);
	}

	/**
	* Sets the primary key of this il vehicle.
	*
	* @param primaryKey the primary key of this il vehicle
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ilVehicle.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ilVehicle.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the registration driver of this il vehicle.
	*
	* @param registrationDriver the registration driver of this il vehicle
	*/
	@Override
	public void setRegistrationDriver(java.lang.String registrationDriver) {
		_ilVehicle.setRegistrationDriver(registrationDriver);
	}

	/**
	* Sets the registration number of this il vehicle.
	*
	* @param registrationNumber the registration number of this il vehicle
	*/
	@Override
	public void setRegistrationNumber(java.lang.String registrationNumber) {
		_ilVehicle.setRegistrationNumber(registrationNumber);
	}

	/**
	* Sets the sequence no of this il vehicle.
	*
	* @param sequenceNo the sequence no of this il vehicle
	*/
	@Override
	public void setSequenceNo(int sequenceNo) {
		_ilVehicle.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this il vehicle.
	*
	* @param syncDate the sync date of this il vehicle
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_ilVehicle.setSyncDate(syncDate);
	}

	/**
	* Sets the vehicle exp imp gate of this il vehicle.
	*
	* @param vehicleExpImpGate the vehicle exp imp gate of this il vehicle
	*/
	@Override
	public void setVehicleExpImpGate(java.lang.String vehicleExpImpGate) {
		_ilVehicle.setVehicleExpImpGate(vehicleExpImpGate);
	}

	/**
	* Sets the vehicle exp imp gate code of this il vehicle.
	*
	* @param vehicleExpImpGateCode the vehicle exp imp gate code of this il vehicle
	*/
	@Override
	public void setVehicleExpImpGateCode(java.lang.String vehicleExpImpGateCode) {
		_ilVehicle.setVehicleExpImpGateCode(vehicleExpImpGateCode);
	}

	/**
	* Sets the vehicle model code of this il vehicle.
	*
	* @param vehicleModelCode the vehicle model code of this il vehicle
	*/
	@Override
	public void setVehicleModelCode(java.lang.String vehicleModelCode) {
		_ilVehicle.setVehicleModelCode(vehicleModelCode);
	}

	/**
	* Sets the vehicle model name of this il vehicle.
	*
	* @param vehicleModelName the vehicle model name of this il vehicle
	*/
	@Override
	public void setVehicleModelName(java.lang.String vehicleModelName) {
		_ilVehicle.setVehicleModelName(vehicleModelName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ILVehicleWrapper)) {
			return false;
		}

		ILVehicleWrapper ilVehicleWrapper = (ILVehicleWrapper)obj;

		if (Objects.equals(_ilVehicle, ilVehicleWrapper._ilVehicle)) {
			return true;
		}

		return false;
	}

	@Override
	public ILVehicle getWrappedModel() {
		return _ilVehicle;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ilVehicle.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ilVehicle.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ilVehicle.resetOriginalValues();
	}

	private final ILVehicle _ilVehicle;
}