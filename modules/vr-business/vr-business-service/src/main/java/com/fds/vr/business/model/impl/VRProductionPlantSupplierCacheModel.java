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
		StringBundler sb = new StringBundler(47);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", supplierId=");
		sb.append(supplierId);
		sb.append(", supplierName=");
		sb.append(supplierName);
		sb.append(", supplieraddress=");
		sb.append(supplieraddress);
		sb.append(", corporationCode=");
		sb.append(corporationCode);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", corporationAddress=");
		sb.append(corporationAddress);
		sb.append(", applicantprofileId=");
		sb.append(applicantprofileId);
		sb.append(", productPlantID=");
		sb.append(productPlantID);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", productionPlantName=");
		sb.append(productionPlantName);
		sb.append(", productionPlantAddress=");
		sb.append(productionPlantAddress);
		sb.append(", markupImporter=");
		sb.append(markupImporter);
		sb.append(", mappingMA_CTY=");
		sb.append(mappingMA_CTY);
		sb.append(", mappingTEN_CTY=");
		sb.append(mappingTEN_CTY);
		sb.append(", mappingDIA_CHI_CTY=");
		sb.append(mappingDIA_CHI_CTY);
		sb.append(", mappingMA_XUONG_LR=");
		sb.append(mappingMA_XUONG_LR);
		sb.append(", mappingTEN_XUONG_LR=");
		sb.append(mappingTEN_XUONG_LR);
		sb.append(", mappingDIA_CHI_XUONG_LR=");
		sb.append(mappingDIA_CHI_XUONG_LR);
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

		if (uuid == null) {
			vrProductionPlantSupplierImpl.setUuid(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setUuid(uuid);
		}

		vrProductionPlantSupplierImpl.setId(id);
		vrProductionPlantSupplierImpl.setMtCore(mtCore);

		if (supplierId == null) {
			vrProductionPlantSupplierImpl.setSupplierId(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setSupplierId(supplierId);
		}

		if (supplierName == null) {
			vrProductionPlantSupplierImpl.setSupplierName(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setSupplierName(supplierName);
		}

		if (supplieraddress == null) {
			vrProductionPlantSupplierImpl.setSupplieraddress(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setSupplieraddress(supplieraddress);
		}

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

		vrProductionPlantSupplierImpl.setApplicantprofileId(applicantprofileId);
		vrProductionPlantSupplierImpl.setProductPlantID(productPlantID);

		if (productionPlantCode == null) {
			vrProductionPlantSupplierImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setProductionPlantCode(productionPlantCode);
		}

		if (productionPlantName == null) {
			vrProductionPlantSupplierImpl.setProductionPlantName(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setProductionPlantName(productionPlantName);
		}

		if (productionPlantAddress == null) {
			vrProductionPlantSupplierImpl.setProductionPlantAddress(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setProductionPlantAddress(productionPlantAddress);
		}

		vrProductionPlantSupplierImpl.setMarkupImporter(markupImporter);

		if (mappingMA_CTY == null) {
			vrProductionPlantSupplierImpl.setMappingMA_CTY(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setMappingMA_CTY(mappingMA_CTY);
		}

		if (mappingTEN_CTY == null) {
			vrProductionPlantSupplierImpl.setMappingTEN_CTY(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setMappingTEN_CTY(mappingTEN_CTY);
		}

		if (mappingDIA_CHI_CTY == null) {
			vrProductionPlantSupplierImpl.setMappingDIA_CHI_CTY(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
		}

		if (mappingMA_XUONG_LR == null) {
			vrProductionPlantSupplierImpl.setMappingMA_XUONG_LR(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setMappingMA_XUONG_LR(mappingMA_XUONG_LR);
		}

		if (mappingTEN_XUONG_LR == null) {
			vrProductionPlantSupplierImpl.setMappingTEN_XUONG_LR(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setMappingTEN_XUONG_LR(mappingTEN_XUONG_LR);
		}

		if (mappingDIA_CHI_XUONG_LR == null) {
			vrProductionPlantSupplierImpl.setMappingDIA_CHI_XUONG_LR(StringPool.BLANK);
		}
		else {
			vrProductionPlantSupplierImpl.setMappingDIA_CHI_XUONG_LR(mappingDIA_CHI_XUONG_LR);
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
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		supplierId = objectInput.readUTF();
		supplierName = objectInput.readUTF();
		supplieraddress = objectInput.readUTF();
		corporationCode = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		corporationAddress = objectInput.readUTF();

		applicantprofileId = objectInput.readLong();

		productPlantID = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();
		productionPlantName = objectInput.readUTF();
		productionPlantAddress = objectInput.readUTF();

		markupImporter = objectInput.readInt();
		mappingMA_CTY = objectInput.readUTF();
		mappingTEN_CTY = objectInput.readUTF();
		mappingDIA_CHI_CTY = objectInput.readUTF();
		mappingMA_XUONG_LR = objectInput.readUTF();
		mappingTEN_XUONG_LR = objectInput.readUTF();
		mappingDIA_CHI_XUONG_LR = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		if (supplierId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(supplierId);
		}

		if (supplierName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(supplierName);
		}

		if (supplieraddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(supplieraddress);
		}

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

		objectOutput.writeLong(applicantprofileId);

		objectOutput.writeLong(productPlantID);

		if (productionPlantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantCode);
		}

		if (productionPlantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantName);
		}

		if (productionPlantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlantAddress);
		}

		objectOutput.writeInt(markupImporter);

		if (mappingMA_CTY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingMA_CTY);
		}

		if (mappingTEN_CTY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingTEN_CTY);
		}

		if (mappingDIA_CHI_CTY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingDIA_CHI_CTY);
		}

		if (mappingMA_XUONG_LR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingMA_XUONG_LR);
		}

		if (mappingTEN_XUONG_LR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingTEN_XUONG_LR);
		}

		if (mappingDIA_CHI_XUONG_LR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mappingDIA_CHI_XUONG_LR);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public String uuid;
	public long id;
	public long mtCore;
	public String supplierId;
	public String supplierName;
	public String supplieraddress;
	public String corporationCode;
	public String corporationName;
	public String corporationAddress;
	public long applicantprofileId;
	public long productPlantID;
	public String productionPlantCode;
	public String productionPlantName;
	public String productionPlantAddress;
	public int markupImporter;
	public String mappingMA_CTY;
	public String mappingTEN_CTY;
	public String mappingDIA_CHI_CTY;
	public String mappingMA_XUONG_LR;
	public String mappingTEN_XUONG_LR;
	public String mappingDIA_CHI_XUONG_LR;
	public long modifyDate;
	public long syncDate;
}