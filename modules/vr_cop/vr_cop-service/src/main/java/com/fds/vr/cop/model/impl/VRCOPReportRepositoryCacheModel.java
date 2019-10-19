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

import com.fds.vr.cop.model.VRCOPReportRepository;

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
 * The cache model class for representing VRCOPReportRepository in entity cache.
 *
 * @author HoangLeTrongNhan
 * @see VRCOPReportRepository
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryCacheModel implements CacheModel<VRCOPReportRepository>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPReportRepositoryCacheModel)) {
			return false;
		}

		VRCOPReportRepositoryCacheModel vrcopReportRepositoryCacheModel = (VRCOPReportRepositoryCacheModel)obj;

		if (id == vrcopReportRepositoryCacheModel.id) {
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
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", applicantProfileId=");
		sb.append(applicantProfileId);
		sb.append(", applicantCode=");
		sb.append(applicantCode);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", overseasManufacturerCode=");
		sb.append(overseasManufacturerCode);
		sb.append(", overseasManufacturerName=");
		sb.append(overseasManufacturerName);
		sb.append(", overseasManufacturerAddress=");
		sb.append(overseasManufacturerAddress);
		sb.append(", productionPlantId=");
		sb.append(productionPlantId);
		sb.append(", productionPlantCode=");
		sb.append(productionPlantCode);
		sb.append(", productionPlantName=");
		sb.append(productionPlantName);
		sb.append(", productionPlantAddress=");
		sb.append(productionPlantAddress);
		sb.append(", COPReportNo=");
		sb.append(COPReportNo);
		sb.append(", COPReportStatus=");
		sb.append(COPReportStatus);
		sb.append(", COPReportType=");
		sb.append(COPReportType);
		sb.append(", COPReportMetadata=");
		sb.append(COPReportMetadata);
		sb.append(", COPReportSignName=");
		sb.append(COPReportSignName);
		sb.append(", COPReportSignTitle=");
		sb.append(COPReportSignTitle);
		sb.append(", COPReportSignPlace=");
		sb.append(COPReportSignPlace);
		sb.append(", COPReportDate=");
		sb.append(COPReportDate);
		sb.append(", COPReportApprovedDate=");
		sb.append(COPReportApprovedDate);
		sb.append(", COPReportExpiredDate=");
		sb.append(COPReportExpiredDate);
		sb.append(", COPFileEntryId=");
		sb.append(COPFileEntryId);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPReportRepository toEntityModel() {
		VRCOPReportRepositoryImpl vrcopReportRepositoryImpl = new VRCOPReportRepositoryImpl();

		vrcopReportRepositoryImpl.setId(id);
		vrcopReportRepositoryImpl.setMtCore(mtCore);
		vrcopReportRepositoryImpl.setApplicantProfileId(applicantProfileId);

		if (applicantCode == null) {
			vrcopReportRepositoryImpl.setApplicantCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantCode(applicantCode);
		}

		if (applicantName == null) {
			vrcopReportRepositoryImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			vrcopReportRepositoryImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantAddress(applicantAddress);
		}

		if (overseasManufacturerCode == null) {
			vrcopReportRepositoryImpl.setOverseasManufacturerCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setOverseasManufacturerCode(overseasManufacturerCode);
		}

		if (overseasManufacturerName == null) {
			vrcopReportRepositoryImpl.setOverseasManufacturerName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setOverseasManufacturerName(overseasManufacturerName);
		}

		if (overseasManufacturerAddress == null) {
			vrcopReportRepositoryImpl.setOverseasManufacturerAddress(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setOverseasManufacturerAddress(overseasManufacturerAddress);
		}

		vrcopReportRepositoryImpl.setProductionPlantId(productionPlantId);

		if (productionPlantCode == null) {
			vrcopReportRepositoryImpl.setProductionPlantCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantCode(productionPlantCode);
		}

		if (productionPlantName == null) {
			vrcopReportRepositoryImpl.setProductionPlantName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantName(productionPlantName);
		}

		if (productionPlantAddress == null) {
			vrcopReportRepositoryImpl.setProductionPlantAddress(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductionPlantAddress(productionPlantAddress);
		}

		if (COPReportNo == null) {
			vrcopReportRepositoryImpl.setCOPReportNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportNo(COPReportNo);
		}

		if (COPReportStatus == null) {
			vrcopReportRepositoryImpl.setCOPReportStatus(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportStatus(COPReportStatus);
		}

		if (COPReportType == null) {
			vrcopReportRepositoryImpl.setCOPReportType(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportType(COPReportType);
		}

		if (COPReportMetadata == null) {
			vrcopReportRepositoryImpl.setCOPReportMetadata(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportMetadata(COPReportMetadata);
		}

		if (COPReportSignName == null) {
			vrcopReportRepositoryImpl.setCOPReportSignName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportSignName(COPReportSignName);
		}

		if (COPReportSignTitle == null) {
			vrcopReportRepositoryImpl.setCOPReportSignTitle(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportSignTitle(COPReportSignTitle);
		}

		if (COPReportSignPlace == null) {
			vrcopReportRepositoryImpl.setCOPReportSignPlace(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportSignPlace(COPReportSignPlace);
		}

		if (COPReportDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCOPReportDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportDate(new Date(COPReportDate));
		}

		if (COPReportApprovedDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCOPReportApprovedDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportApprovedDate(new Date(
					COPReportApprovedDate));
		}

		if (COPReportExpiredDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCOPReportExpiredDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCOPReportExpiredDate(new Date(
					COPReportExpiredDate));
		}

		vrcopReportRepositoryImpl.setCOPFileEntryId(COPFileEntryId);

		if (modifyDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setModifyDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setSyncDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setSyncDate(new Date(syncDate));
		}

		vrcopReportRepositoryImpl.resetOriginalValues();

		return vrcopReportRepositoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readInt();

		applicantProfileId = objectInput.readLong();
		applicantCode = objectInput.readUTF();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		overseasManufacturerCode = objectInput.readUTF();
		overseasManufacturerName = objectInput.readUTF();
		overseasManufacturerAddress = objectInput.readUTF();

		productionPlantId = objectInput.readLong();
		productionPlantCode = objectInput.readUTF();
		productionPlantName = objectInput.readUTF();
		productionPlantAddress = objectInput.readUTF();
		COPReportNo = objectInput.readUTF();
		COPReportStatus = objectInput.readUTF();
		COPReportType = objectInput.readUTF();
		COPReportMetadata = objectInput.readUTF();
		COPReportSignName = objectInput.readUTF();
		COPReportSignTitle = objectInput.readUTF();
		COPReportSignPlace = objectInput.readUTF();
		COPReportDate = objectInput.readLong();
		COPReportApprovedDate = objectInput.readLong();
		COPReportExpiredDate = objectInput.readLong();

		COPFileEntryId = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeInt(mtCore);

		objectOutput.writeLong(applicantProfileId);

		if (applicantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantCode);
		}

		if (applicantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		if (overseasManufacturerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(overseasManufacturerCode);
		}

		if (overseasManufacturerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(overseasManufacturerName);
		}

		if (overseasManufacturerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(overseasManufacturerAddress);
		}

		objectOutput.writeLong(productionPlantId);

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

		if (COPReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportNo);
		}

		if (COPReportStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportStatus);
		}

		if (COPReportType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportType);
		}

		if (COPReportMetadata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportMetadata);
		}

		if (COPReportSignName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportSignName);
		}

		if (COPReportSignTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportSignTitle);
		}

		if (COPReportSignPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportSignPlace);
		}

		objectOutput.writeLong(COPReportDate);
		objectOutput.writeLong(COPReportApprovedDate);
		objectOutput.writeLong(COPReportExpiredDate);

		objectOutput.writeLong(COPFileEntryId);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public int mtCore;
	public long applicantProfileId;
	public String applicantCode;
	public String applicantName;
	public String applicantAddress;
	public String overseasManufacturerCode;
	public String overseasManufacturerName;
	public String overseasManufacturerAddress;
	public long productionPlantId;
	public String productionPlantCode;
	public String productionPlantName;
	public String productionPlantAddress;
	public String COPReportNo;
	public String COPReportStatus;
	public String COPReportType;
	public String COPReportMetadata;
	public String COPReportSignName;
	public String COPReportSignTitle;
	public String COPReportSignPlace;
	public long COPReportDate;
	public long COPReportApprovedDate;
	public long COPReportExpiredDate;
	public long COPFileEntryId;
	public long modifyDate;
	public long syncDate;
}