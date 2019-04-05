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

import com.fds.vr.business.model.ILVehicleCustomsBorderGuard;

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
 * The cache model class for representing ILVehicleCustomsBorderGuard in entity cache.
 *
 * @author LamTV
 * @see ILVehicleCustomsBorderGuard
 * @generated
 */
@ProviderType
public class ILVehicleCustomsBorderGuardCacheModel implements CacheModel<ILVehicleCustomsBorderGuard>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ILVehicleCustomsBorderGuardCacheModel)) {
			return false;
		}

		ILVehicleCustomsBorderGuardCacheModel ilVehicleCustomsBorderGuardCacheModel =
			(ILVehicleCustomsBorderGuardCacheModel)obj;

		if (id == ilVehicleCustomsBorderGuardCacheModel.id) {
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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registrationNumber=");
		sb.append(registrationNumber);
		sb.append(", expImpGateType=");
		sb.append(expImpGateType);
		sb.append(", expImpGate=");
		sb.append(expImpGate);
		sb.append(", driverName=");
		sb.append(driverName);
		sb.append(", driverLicenceNo=");
		sb.append(driverLicenceNo);
		sb.append(", registrationDate=");
		sb.append(registrationDate);
		sb.append(", customsDepartureDate=");
		sb.append(customsDepartureDate);
		sb.append(", customsArrivalDate=");
		sb.append(customsArrivalDate);
		sb.append(", borderGuardsDepartureDate=");
		sb.append(borderGuardsDepartureDate);
		sb.append(", borderGuardsArrivalDate=");
		sb.append(borderGuardsArrivalDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ILVehicleCustomsBorderGuard toEntityModel() {
		ILVehicleCustomsBorderGuardImpl ilVehicleCustomsBorderGuardImpl = new ILVehicleCustomsBorderGuardImpl();

		ilVehicleCustomsBorderGuardImpl.setId(id);

		if (registrationNumber == null) {
			ilVehicleCustomsBorderGuardImpl.setRegistrationNumber(StringPool.BLANK);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setRegistrationNumber(registrationNumber);
		}

		if (expImpGateType == null) {
			ilVehicleCustomsBorderGuardImpl.setExpImpGateType(StringPool.BLANK);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setExpImpGateType(expImpGateType);
		}

		if (expImpGate == null) {
			ilVehicleCustomsBorderGuardImpl.setExpImpGate(StringPool.BLANK);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setExpImpGate(expImpGate);
		}

		if (driverName == null) {
			ilVehicleCustomsBorderGuardImpl.setDriverName(StringPool.BLANK);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setDriverName(driverName);
		}

		if (driverLicenceNo == null) {
			ilVehicleCustomsBorderGuardImpl.setDriverLicenceNo(StringPool.BLANK);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setDriverLicenceNo(driverLicenceNo);
		}

		if (registrationDate == Long.MIN_VALUE) {
			ilVehicleCustomsBorderGuardImpl.setRegistrationDate(null);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setRegistrationDate(new Date(
					registrationDate));
		}

		if (customsDepartureDate == Long.MIN_VALUE) {
			ilVehicleCustomsBorderGuardImpl.setCustomsDepartureDate(null);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setCustomsDepartureDate(new Date(
					customsDepartureDate));
		}

		if (customsArrivalDate == Long.MIN_VALUE) {
			ilVehicleCustomsBorderGuardImpl.setCustomsArrivalDate(null);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setCustomsArrivalDate(new Date(
					customsArrivalDate));
		}

		if (borderGuardsDepartureDate == Long.MIN_VALUE) {
			ilVehicleCustomsBorderGuardImpl.setBorderGuardsDepartureDate(null);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setBorderGuardsDepartureDate(new Date(
					borderGuardsDepartureDate));
		}

		if (borderGuardsArrivalDate == Long.MIN_VALUE) {
			ilVehicleCustomsBorderGuardImpl.setBorderGuardsArrivalDate(null);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setBorderGuardsArrivalDate(new Date(
					borderGuardsArrivalDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			ilVehicleCustomsBorderGuardImpl.setSyncDate(null);
		}
		else {
			ilVehicleCustomsBorderGuardImpl.setSyncDate(new Date(syncDate));
		}

		ilVehicleCustomsBorderGuardImpl.resetOriginalValues();

		return ilVehicleCustomsBorderGuardImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registrationNumber = objectInput.readUTF();
		expImpGateType = objectInput.readUTF();
		expImpGate = objectInput.readUTF();
		driverName = objectInput.readUTF();
		driverLicenceNo = objectInput.readUTF();
		registrationDate = objectInput.readLong();
		customsDepartureDate = objectInput.readLong();
		customsArrivalDate = objectInput.readLong();
		borderGuardsDepartureDate = objectInput.readLong();
		borderGuardsArrivalDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (registrationNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registrationNumber);
		}

		if (expImpGateType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expImpGateType);
		}

		if (expImpGate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expImpGate);
		}

		if (driverName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(driverName);
		}

		if (driverLicenceNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(driverLicenceNo);
		}

		objectOutput.writeLong(registrationDate);
		objectOutput.writeLong(customsDepartureDate);
		objectOutput.writeLong(customsArrivalDate);
		objectOutput.writeLong(borderGuardsDepartureDate);
		objectOutput.writeLong(borderGuardsArrivalDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public String registrationNumber;
	public String expImpGateType;
	public String expImpGate;
	public String driverName;
	public String driverLicenceNo;
	public long registrationDate;
	public long customsDepartureDate;
	public long customsArrivalDate;
	public long borderGuardsDepartureDate;
	public long borderGuardsArrivalDate;
	public long syncDate;
}