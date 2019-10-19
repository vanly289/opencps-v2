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

import com.fds.vr.cop.model.VRCOPProductionPlantEquipment;

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
 * The cache model class for representing VRCOPProductionPlantEquipment in entity cache.
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantEquipment
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEquipmentCacheModel implements CacheModel<VRCOPProductionPlantEquipment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductionPlantEquipmentCacheModel)) {
			return false;
		}

		VRCOPProductionPlantEquipmentCacheModel vrcopProductionPlantEquipmentCacheModel =
			(VRCOPProductionPlantEquipmentCacheModel)obj;

		if (id == vrcopProductionPlantEquipmentCacheModel.id) {
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
		StringBundler sb = new StringBundler(39);

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
		sb.append(", equipmentCode=");
		sb.append(equipmentCode);
		sb.append(", equipmentName=");
		sb.append(equipmentName);
		sb.append(", equipmentType=");
		sb.append(equipmentType);
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
		sb.append(", productionCountryCode=");
		sb.append(productionCountryCode);
		sb.append(", equipmentStatus=");
		sb.append(equipmentStatus);
		sb.append(", notes=");
		sb.append(notes);
		sb.append(", expireDate=");
		sb.append(expireDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPProductionPlantEquipment toEntityModel() {
		VRCOPProductionPlantEquipmentImpl vrcopProductionPlantEquipmentImpl = new VRCOPProductionPlantEquipmentImpl();

		vrcopProductionPlantEquipmentImpl.setId(id);
		vrcopProductionPlantEquipmentImpl.setMtCore(mtCore);
		vrcopProductionPlantEquipmentImpl.setCOPReportRepositoryID(COPReportRepositoryID);

		if (COPReportNo == null) {
			vrcopProductionPlantEquipmentImpl.setCOPReportNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setCOPReportNo(COPReportNo);
		}

		vrcopProductionPlantEquipmentImpl.setSequenceNo(sequenceNo);

		if (equipmentCode == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentCode(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentCode(equipmentCode);
		}

		if (equipmentName == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentName(equipmentName);
		}

		if (equipmentType == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentType(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentType(equipmentType);
		}

		if (tradeMark == null) {
			vrcopProductionPlantEquipmentImpl.setTradeMark(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setTradeMark(tradeMark);
		}

		if (tradeMarkName == null) {
			vrcopProductionPlantEquipmentImpl.setTradeMarkName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setTradeMarkName(tradeMarkName);
		}

		if (commercialName == null) {
			vrcopProductionPlantEquipmentImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrcopProductionPlantEquipmentImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setModelCode(modelCode);
		}

		if (designSymbolNo == null) {
			vrcopProductionPlantEquipmentImpl.setDesignSymbolNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setDesignSymbolNo(designSymbolNo);
		}

		vrcopProductionPlantEquipmentImpl.setProductionCountryCode(productionCountryCode);

		if (equipmentStatus == null) {
			vrcopProductionPlantEquipmentImpl.setEquipmentStatus(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setEquipmentStatus(equipmentStatus);
		}

		if (notes == null) {
			vrcopProductionPlantEquipmentImpl.setNotes(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setNotes(notes);
		}

		if (expireDate == Long.MIN_VALUE) {
			vrcopProductionPlantEquipmentImpl.setExpireDate(null);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setExpireDate(new Date(expireDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcopProductionPlantEquipmentImpl.setModifyDate(null);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopProductionPlantEquipmentImpl.setSyncDate(null);
		}
		else {
			vrcopProductionPlantEquipmentImpl.setSyncDate(new Date(syncDate));
		}

		vrcopProductionPlantEquipmentImpl.resetOriginalValues();

		return vrcopProductionPlantEquipmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readInt();

		COPReportRepositoryID = objectInput.readLong();
		COPReportNo = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		equipmentCode = objectInput.readUTF();
		equipmentName = objectInput.readUTF();
		equipmentType = objectInput.readUTF();
		tradeMark = objectInput.readUTF();
		tradeMarkName = objectInput.readUTF();
		commercialName = objectInput.readUTF();
		modelCode = objectInput.readUTF();
		designSymbolNo = objectInput.readUTF();

		productionCountryCode = objectInput.readLong();
		equipmentStatus = objectInput.readUTF();
		notes = objectInput.readUTF();
		expireDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
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

		if (equipmentCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentCode);
		}

		if (equipmentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentName);
		}

		if (equipmentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentType);
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

		objectOutput.writeLong(productionCountryCode);

		if (equipmentStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipmentStatus);
		}

		if (notes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notes);
		}

		objectOutput.writeLong(expireDate);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public int mtCore;
	public long COPReportRepositoryID;
	public String COPReportNo;
	public long sequenceNo;
	public String equipmentCode;
	public String equipmentName;
	public String equipmentType;
	public String tradeMark;
	public String tradeMarkName;
	public String commercialName;
	public String modelCode;
	public String designSymbolNo;
	public long productionCountryCode;
	public String equipmentStatus;
	public String notes;
	public long expireDate;
	public long modifyDate;
	public long syncDate;
}