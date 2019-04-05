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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.ILVehicle;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ILVehicle in entity cache.
 *
 * @author LamTV
 * @see ILVehicle
 * @generated
 */
@ProviderType
public class ILVehicleCacheModel implements CacheModel<ILVehicle>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ILVehicleCacheModel)) {
			return false;
		}

		ILVehicleCacheModel ilVehicleCacheModel = (ILVehicleCacheModel)obj;

		if (id == ilVehicleCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", issuingDispatchNo=");
		sb.append(issuingDispatchNo);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", registrationNumber=");
		sb.append(registrationNumber);
		sb.append(", registrationDriver=");
		sb.append(registrationDriver);
		sb.append(", vehicleModelCode=");
		sb.append(vehicleModelCode);
		sb.append(", vehicleModelName=");
		sb.append(vehicleModelName);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", manufacturedYear=");
		sb.append(manufacturedYear);
		sb.append(", vehicleExpImpGateCode=");
		sb.append(vehicleExpImpGateCode);
		sb.append(", vehicleExpImpGate=");
		sb.append(vehicleExpImpGate);
		sb.append(", operationType=");
		sb.append(operationType);
		sb.append(", passengerOrCargo=");
		sb.append(passengerOrCargo);
		sb.append(", lienVanNo=");
		sb.append(lienVanNo);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ILVehicle toEntityModel() {
		ILVehicleImpl ilVehicleImpl = new ILVehicleImpl();

		ilVehicleImpl.setId(id);

		if (issuingDispatchNo == null) {
			ilVehicleImpl.setIssuingDispatchNo(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setIssuingDispatchNo(issuingDispatchNo);
		}

		ilVehicleImpl.setSequenceNo(sequenceNo);

		if (registrationNumber == null) {
			ilVehicleImpl.setRegistrationNumber(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setRegistrationNumber(registrationNumber);
		}

		if (registrationDriver == null) {
			ilVehicleImpl.setRegistrationDriver(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setRegistrationDriver(registrationDriver);
		}

		if (vehicleModelCode == null) {
			ilVehicleImpl.setVehicleModelCode(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setVehicleModelCode(vehicleModelCode);
		}

		if (vehicleModelName == null) {
			ilVehicleImpl.setVehicleModelName(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setVehicleModelName(vehicleModelName);
		}

		if (capacity == null) {
			ilVehicleImpl.setCapacity(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setCapacity(capacity);
		}

		if (manufacturedYear == null) {
			ilVehicleImpl.setManufacturedYear(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setManufacturedYear(manufacturedYear);
		}

		if (vehicleExpImpGateCode == null) {
			ilVehicleImpl.setVehicleExpImpGateCode(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setVehicleExpImpGateCode(vehicleExpImpGateCode);
		}

		if (vehicleExpImpGate == null) {
			ilVehicleImpl.setVehicleExpImpGate(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setVehicleExpImpGate(vehicleExpImpGate);
		}

		if (operationType == null) {
			ilVehicleImpl.setOperationType(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setOperationType(operationType);
		}

		if (passengerOrCargo == null) {
			ilVehicleImpl.setPassengerOrCargo(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setPassengerOrCargo(passengerOrCargo);
		}

		if (lienVanNo == null) {
			ilVehicleImpl.setLienVanNo(StringPool.BLANK);
		}
		else {
			ilVehicleImpl.setLienVanNo(lienVanNo);
		}

		if (syncDate == Long.MIN_VALUE) {
			ilVehicleImpl.setSyncDate(null);
		}
		else {
			ilVehicleImpl.setSyncDate(new Date(syncDate));
		}

		ilVehicleImpl.resetOriginalValues();

		return ilVehicleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		issuingDispatchNo = objectInput.readUTF();

		sequenceNo = objectInput.readInt();
		registrationNumber = objectInput.readUTF();
		registrationDriver = objectInput.readUTF();
		vehicleModelCode = objectInput.readUTF();
		vehicleModelName = objectInput.readUTF();
		capacity = objectInput.readUTF();
		manufacturedYear = objectInput.readUTF();
		vehicleExpImpGateCode = objectInput.readUTF();
		vehicleExpImpGate = objectInput.readUTF();
		operationType = objectInput.readUTF();
		passengerOrCargo = objectInput.readUTF();
		lienVanNo = objectInput.readUTF();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (issuingDispatchNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuingDispatchNo);
		}

		objectOutput.writeInt(sequenceNo);

		if (registrationNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registrationNumber);
		}

		if (registrationDriver == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registrationDriver);
		}

		if (vehicleModelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleModelCode);
		}

		if (vehicleModelName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleModelName);
		}

		if (capacity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(capacity);
		}

		if (manufacturedYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturedYear);
		}

		if (vehicleExpImpGateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleExpImpGateCode);
		}

		if (vehicleExpImpGate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleExpImpGate);
		}

		if (operationType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(operationType);
		}

		if (passengerOrCargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passengerOrCargo);
		}

		if (lienVanNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lienVanNo);
		}

		objectOutput.writeLong(syncDate);
	}

	public long id;
	public String issuingDispatchNo;
	public int sequenceNo;
	public String registrationNumber;
	public String registrationDriver;
	public String vehicleModelCode;
	public String vehicleModelName;
	public String capacity;
	public String manufacturedYear;
	public String vehicleExpImpGateCode;
	public String vehicleExpImpGate;
	public String operationType;
	public String passengerOrCargo;
	public String lienVanNo;
	public long syncDate;
}