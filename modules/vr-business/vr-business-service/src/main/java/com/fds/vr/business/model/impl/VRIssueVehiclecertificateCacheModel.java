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

import com.fds.vr.business.model.VRIssueVehiclecertificate;

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
 * The cache model class for representing VRIssueVehiclecertificate in entity cache.
 *
 * @author LamTV
 * @see VRIssueVehiclecertificate
 * @generated
 */
@ProviderType
public class VRIssueVehiclecertificateCacheModel implements CacheModel<VRIssueVehiclecertificate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueVehiclecertificateCacheModel)) {
			return false;
		}

		VRIssueVehiclecertificateCacheModel vrIssueVehiclecertificateCacheModel = (VRIssueVehiclecertificateCacheModel)obj;

		if (id == vrIssueVehiclecertificateCacheModel.id) {
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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", issueId=");
		sb.append(issueId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", certificateId=");
		sb.append(certificateId);
		sb.append(", vehiclePrice=");
		sb.append(vehiclePrice);
		sb.append(", totalQuantity=");
		sb.append(totalQuantity);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", totalProduct=");
		sb.append(totalProduct);
		sb.append(", certificaterecordno=");
		sb.append(certificaterecordno);
		sb.append(", productionexamreportno=");
		sb.append(productionexamreportno);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VRIssueVehiclecertificate toEntityModel() {
		VRIssueVehiclecertificateImpl vrIssueVehiclecertificateImpl = new VRIssueVehiclecertificateImpl();

		vrIssueVehiclecertificateImpl.setId(id);
		vrIssueVehiclecertificateImpl.setMtCore(mtCore);
		vrIssueVehiclecertificateImpl.setIssueId(issueId);
		vrIssueVehiclecertificateImpl.setDossierId(dossierId);
		vrIssueVehiclecertificateImpl.setCertificateId(certificateId);
		vrIssueVehiclecertificateImpl.setVehiclePrice(vehiclePrice);
		vrIssueVehiclecertificateImpl.setTotalQuantity(totalQuantity);
		vrIssueVehiclecertificateImpl.setUnitPrice(unitPrice);
		vrIssueVehiclecertificateImpl.setTotalProduct(totalProduct);

		if (certificaterecordno == null) {
			vrIssueVehiclecertificateImpl.setCertificaterecordno(StringPool.BLANK);
		}
		else {
			vrIssueVehiclecertificateImpl.setCertificaterecordno(certificaterecordno);
		}

		if (productionexamreportno == null) {
			vrIssueVehiclecertificateImpl.setProductionexamreportno(StringPool.BLANK);
		}
		else {
			vrIssueVehiclecertificateImpl.setProductionexamreportno(productionexamreportno);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrIssueVehiclecertificateImpl.setModifyDate(null);
		}
		else {
			vrIssueVehiclecertificateImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrIssueVehiclecertificateImpl.setSyncDate(null);
		}
		else {
			vrIssueVehiclecertificateImpl.setSyncDate(new Date(syncDate));
		}

		vrIssueVehiclecertificateImpl.resetOriginalValues();

		return vrIssueVehiclecertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

		issueId = objectInput.readLong();

		dossierId = objectInput.readLong();

		certificateId = objectInput.readLong();

		vehiclePrice = objectInput.readLong();

		totalQuantity = objectInput.readLong();

		unitPrice = objectInput.readLong();

		totalProduct = objectInput.readInt();
		certificaterecordno = objectInput.readUTF();
		productionexamreportno = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		objectOutput.writeLong(issueId);

		objectOutput.writeLong(dossierId);

		objectOutput.writeLong(certificateId);

		objectOutput.writeLong(vehiclePrice);

		objectOutput.writeLong(totalQuantity);

		objectOutput.writeLong(unitPrice);

		objectOutput.writeInt(totalProduct);

		if (certificaterecordno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificaterecordno);
		}

		if (productionexamreportno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionexamreportno);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public long issueId;
	public long dossierId;
	public long certificateId;
	public long vehiclePrice;
	public long totalQuantity;
	public long unitPrice;
	public int totalProduct;
	public String certificaterecordno;
	public String productionexamreportno;
	public long modifyDate;
	public long syncDate;
}