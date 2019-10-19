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

package com.fds.vr.cop.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.cop.model.VRCOPProductType;

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
 * The cache model class for representing VRCOPProductType in entity cache.
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductType
 * @generated
 */
@ProviderType
public class VRCOPProductTypeCacheModel implements CacheModel<VRCOPProductType>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductTypeCacheModel)) {
			return false;
		}

		VRCOPProductTypeCacheModel vrcopProductTypeCacheModel = (VRCOPProductTypeCacheModel)obj;

		if (id == vrcopProductTypeCacheModel.id) {
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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", COPReportRepositoryID=");
		sb.append(COPReportRepositoryID);
		sb.append(", COPReportNo=");
		sb.append(COPReportNo);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", vehicleTypeCode=");
		sb.append(vehicleTypeCode);
		sb.append(", vehicleTypeDescription=");
		sb.append(vehicleTypeDescription);
		sb.append(", productClassificationCode=");
		sb.append(productClassificationCode);
		sb.append(", productClassificationDescription=");
		sb.append(productClassificationDescription);
		sb.append(", tradeMark=");
		sb.append(tradeMark);
		sb.append(", tradeMarkName=");
		sb.append(tradeMarkName);
		sb.append(", commercialName=");
		sb.append(commercialName);
		sb.append(", modelCode=");
		sb.append(modelCode);
		sb.append(", designSymbolNo=");
		sb.append(designSymbolNo);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPProductType toEntityModel() {
		VRCOPProductTypeImpl vrcopProductTypeImpl = new VRCOPProductTypeImpl();

		vrcopProductTypeImpl.setId(id);
		vrcopProductTypeImpl.setMtCore(mtCore);
		vrcopProductTypeImpl.setCOPReportRepositoryID(COPReportRepositoryID);

		if (COPReportNo == null) {
			vrcopProductTypeImpl.setCOPReportNo(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setCOPReportNo(COPReportNo);
		}

		vrcopProductTypeImpl.setSequenceNo(sequenceNo);

		if (vehicleClass == null) {
			vrcopProductTypeImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setVehicleClass(vehicleClass);
		}

		if (vehicleTypeCode == null) {
			vrcopProductTypeImpl.setVehicleTypeCode(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setVehicleTypeCode(vehicleTypeCode);
		}

		if (vehicleTypeDescription == null) {
			vrcopProductTypeImpl.setVehicleTypeDescription(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setVehicleTypeDescription(vehicleTypeDescription);
		}

		if (productClassificationCode == null) {
			vrcopProductTypeImpl.setProductClassificationCode(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setProductClassificationCode(productClassificationCode);
		}

		if (productClassificationDescription == null) {
			vrcopProductTypeImpl.setProductClassificationDescription(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setProductClassificationDescription(productClassificationDescription);
		}

		if (tradeMark == null) {
			vrcopProductTypeImpl.setTradeMark(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setTradeMark(tradeMark);
		}

		if (tradeMarkName == null) {
			vrcopProductTypeImpl.setTradeMarkName(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setTradeMarkName(tradeMarkName);
		}

		if (commercialName == null) {
			vrcopProductTypeImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrcopProductTypeImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setModelCode(modelCode);
		}

		if (designSymbolNo == null) {
			vrcopProductTypeImpl.setDesignSymbolNo(StringPool.BLANK);
		}
		else {
			vrcopProductTypeImpl.setDesignSymbolNo(designSymbolNo);
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopProductTypeImpl.setSyncDate(null);
		}
		else {
			vrcopProductTypeImpl.setSyncDate(new Date(syncDate));
		}

		vrcopProductTypeImpl.resetOriginalValues();

		return vrcopProductTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readInt();

		COPReportRepositoryID = objectInput.readLong();
		COPReportNo = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		vehicleTypeCode = objectInput.readUTF();
		vehicleTypeDescription = objectInput.readUTF();
		productClassificationCode = objectInput.readUTF();
		productClassificationDescription = objectInput.readUTF();
		tradeMark = objectInput.readUTF();
		tradeMarkName = objectInput.readUTF();
		commercialName = objectInput.readUTF();
		modelCode = objectInput.readUTF();
		designSymbolNo = objectInput.readUTF();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeInt(mtCore);

		objectOutput.writeLong(COPReportRepositoryID);

		if (COPReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportNo);
		}

		objectOutput.writeLong(sequenceNo);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (vehicleTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleTypeCode);
		}

		if (vehicleTypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleTypeDescription);
		}

		if (productClassificationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productClassificationCode);
		}

		if (productClassificationDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productClassificationDescription);
		}

		if (tradeMark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tradeMark);
		}

		if (tradeMarkName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tradeMarkName);
		}

		if (commercialName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commercialName);
		}

		if (modelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modelCode);
		}

		if (designSymbolNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designSymbolNo);
		}

		objectOutput.writeLong(syncDate);
	}

	public long id;
	public int mtCore;
	public long COPReportRepositoryID;
	public String COPReportNo;
	public long sequenceNo;
	public String vehicleClass;
	public String vehicleTypeCode;
	public String vehicleTypeDescription;
	public String productClassificationCode;
	public String productClassificationDescription;
	public String tradeMark;
	public String tradeMarkName;
	public String commercialName;
	public String modelCode;
	public String designSymbolNo;
	public long syncDate;
}