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

import com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment;

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
 * The cache model class for representing VRCOPProductionPlantProdEquipment in entity cache.
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantProdEquipment
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantProdEquipmentCacheModel implements CacheModel<VRCOPProductionPlantProdEquipment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductionPlantProdEquipmentCacheModel)) {
			return false;
		}

		VRCOPProductionPlantProdEquipmentCacheModel vrcopProductionPlantProdEquipmentCacheModel =
			(VRCOPProductionPlantProdEquipmentCacheModel)obj;

		if (id == vrcopProductionPlantProdEquipmentCacheModel.id) {
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
		StringBundler sb = new StringBundler(37);

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
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPProductionPlantProdEquipment toEntityModel() {
		VRCOPProductionPlantProdEquipmentImpl vrcopProductionPlantProdEquipmentImpl =
			new VRCOPProductionPlantProdEquipmentImpl();

		vrcopProductionPlantProdEquipmentImpl.setId(id);
		vrcopProductionPlantProdEquipmentImpl.setMtCore(mtCore);
		vrcopProductionPlantProdEquipmentImpl.setCOPReportRepositoryID(COPReportRepositoryID);

		if (COPReportNo == null) {
			vrcopProductionPlantProdEquipmentImpl.setCOPReportNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setCOPReportNo(COPReportNo);
		}

		vrcopProductionPlantProdEquipmentImpl.setSequenceNo(sequenceNo);

		if (equipmentCode == null) {
			vrcopProductionPlantProdEquipmentImpl.setEquipmentCode(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setEquipmentCode(equipmentCode);
		}

		if (equipmentName == null) {
			vrcopProductionPlantProdEquipmentImpl.setEquipmentName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setEquipmentName(equipmentName);
		}

		if (equipmentType == null) {
			vrcopProductionPlantProdEquipmentImpl.setEquipmentType(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setEquipmentType(equipmentType);
		}

		if (tradeMark == null) {
			vrcopProductionPlantProdEquipmentImpl.setTradeMark(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setTradeMark(tradeMark);
		}

		if (tradeMarkName == null) {
			vrcopProductionPlantProdEquipmentImpl.setTradeMarkName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setTradeMarkName(tradeMarkName);
		}

		if (commercialName == null) {
			vrcopProductionPlantProdEquipmentImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vrcopProductionPlantProdEquipmentImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setModelCode(modelCode);
		}

		if (designSymbolNo == null) {
			vrcopProductionPlantProdEquipmentImpl.setDesignSymbolNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setDesignSymbolNo(designSymbolNo);
		}

		vrcopProductionPlantProdEquipmentImpl.setProductionCountryCode(productionCountryCode);

		if (equipmentStatus == null) {
			vrcopProductionPlantProdEquipmentImpl.setEquipmentStatus(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setEquipmentStatus(equipmentStatus);
		}

		if (notes == null) {
			vrcopProductionPlantProdEquipmentImpl.setNotes(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setNotes(notes);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcopProductionPlantProdEquipmentImpl.setModifyDate(null);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setModifyDate(new Date(
					modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopProductionPlantProdEquipmentImpl.setSyncDate(null);
		}
		else {
			vrcopProductionPlantProdEquipmentImpl.setSyncDate(new Date(syncDate));
		}

		vrcopProductionPlantProdEquipmentImpl.resetOriginalValues();

		return vrcopProductionPlantProdEquipmentImpl;
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
	public long modifyDate;
	public long syncDate;
}