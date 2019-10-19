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

import com.fds.vr.cop.model.VRCOPProductionPlantEmployee;

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
 * The cache model class for representing VRCOPProductionPlantEmployee in entity cache.
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantEmployee
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEmployeeCacheModel implements CacheModel<VRCOPProductionPlantEmployee>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductionPlantEmployeeCacheModel)) {
			return false;
		}

		VRCOPProductionPlantEmployeeCacheModel vrcopProductionPlantEmployeeCacheModel =
			(VRCOPProductionPlantEmployeeCacheModel)obj;

		if (id == vrcopProductionPlantEmployeeCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", employeeCertificateNo=");
		sb.append(employeeCertificateNo);
		sb.append(", COPReportRepositoryID=");
		sb.append(COPReportRepositoryID);
		sb.append(", COPReportNo=");
		sb.append(COPReportNo);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", trainningAt=");
		sb.append(trainningAt);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRCOPProductionPlantEmployee toEntityModel() {
		VRCOPProductionPlantEmployeeImpl vrcopProductionPlantEmployeeImpl = new VRCOPProductionPlantEmployeeImpl();

		vrcopProductionPlantEmployeeImpl.setId(id);
		vrcopProductionPlantEmployeeImpl.setMtCore(mtCore);

		if (employeeName == null) {
			vrcopProductionPlantEmployeeImpl.setEmployeeName(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEmployeeImpl.setEmployeeName(employeeName);
		}

		if (employeeCertificateNo == null) {
			vrcopProductionPlantEmployeeImpl.setEmployeeCertificateNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEmployeeImpl.setEmployeeCertificateNo(employeeCertificateNo);
		}

		vrcopProductionPlantEmployeeImpl.setCOPReportRepositoryID(COPReportRepositoryID);

		if (COPReportNo == null) {
			vrcopProductionPlantEmployeeImpl.setCOPReportNo(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEmployeeImpl.setCOPReportNo(COPReportNo);
		}

		vrcopProductionPlantEmployeeImpl.setSequenceNo(sequenceNo);

		if (trainningAt == null) {
			vrcopProductionPlantEmployeeImpl.setTrainningAt(StringPool.BLANK);
		}
		else {
			vrcopProductionPlantEmployeeImpl.setTrainningAt(trainningAt);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrcopProductionPlantEmployeeImpl.setModifyDate(null);
		}
		else {
			vrcopProductionPlantEmployeeImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrcopProductionPlantEmployeeImpl.setSyncDate(null);
		}
		else {
			vrcopProductionPlantEmployeeImpl.setSyncDate(new Date(syncDate));
		}

		vrcopProductionPlantEmployeeImpl.resetOriginalValues();

		return vrcopProductionPlantEmployeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readInt();
		employeeName = objectInput.readUTF();
		employeeCertificateNo = objectInput.readUTF();

		COPReportRepositoryID = objectInput.readLong();
		COPReportNo = objectInput.readUTF();

		sequenceNo = objectInput.readLong();
		trainningAt = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeInt(mtCore);

		if (employeeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeName);
		}

		if (employeeCertificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeCertificateNo);
		}

		objectOutput.writeLong(COPReportRepositoryID);

		if (COPReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COPReportNo);
		}

		objectOutput.writeLong(sequenceNo);

		if (trainningAt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trainningAt);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public int mtCore;
	public String employeeName;
	public String employeeCertificateNo;
	public long COPReportRepositoryID;
	public String COPReportNo;
	public long sequenceNo;
	public String trainningAt;
	public long modifyDate;
	public long syncDate;
}