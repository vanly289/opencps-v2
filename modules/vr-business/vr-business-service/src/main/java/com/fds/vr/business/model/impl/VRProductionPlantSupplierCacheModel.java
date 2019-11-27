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

import com.fds.vr.business.model.VRProductionPlantSupplier;

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
 * The cache model class for representing VRProductionPlantSupplier in entity cache.
 *
 * @author LamTV
 * @see VRProductionPlantSupplier
 * @generated
 */
@ProviderType
public class VRProductionPlantSupplierCacheModel implements CacheModel<VRProductionPlantSupplier>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantSupplierCacheModel)) {
			return false;
		}

		VRProductionPlantSupplierCacheModel vrProductionPlantSupplierCacheModel = (VRProductionPlantSupplierCacheModel)obj;

		if (id == vrProductionPlantSupplierCacheModel.id) {
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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", corporationCode=");
		sb.append(corporationCode);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", corporationAddress=");
		sb.append(corporationAddress);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRProductionPlantSupplier toEntityModel() {
		VRProductionPlantSupplierImpl vrProductionPlantSupplierImpl = new VRProductionPlantSupplierImpl();

		vrProductionPlantSupplierImpl.setId(id);
		vrProductionPlantSupplierImpl.setMtCore(mtCore);

		if (corporationCode == null) {
			vrProductionPlantSupplierImpl.setCorporationCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setCorporationCode(corporationCode);
		}

		if (corporationName == null) {
			vrProductionPlantSupplierImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setCorporationName(corporationName);
		}

		if (corporationAddress == null) {
			vrProductionPlantSupplierImpl.setCorporationAddress(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setCorporationAddress(corporationAddress);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrProductionPlantSupplierImpl.setModifyDate(null);
		}
		else {
			vrProductionPlantSupplierImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrProductionPlantSupplierImpl.setSyncDate(null);
		}
		else {
			vrProductionPlantSupplierImpl.setSyncDate(new Date(syncDate));
		}

		vrProductionPlantSupplierImpl.resetOriginalValues();

		return vrProductionPlantSupplierImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		corporationCode = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		corporationAddress = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		if (corporationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationCode);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
		}

		if (corporationAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationAddress);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public String corporationCode;
	public String corporationName;
	public String corporationAddress;
	public long modifyDate;
	public long syncDate;
}