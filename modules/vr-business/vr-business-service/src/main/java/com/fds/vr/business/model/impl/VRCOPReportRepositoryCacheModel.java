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

import com.fds.vr.business.model.VRCOPReportRepository;

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
 * @author LamTV
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
		StringBundler sb = new StringBundler(115);

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
		sb.append(", copReportNo=");
		sb.append(copReportNo);
		sb.append(", copReportStatus=");
		sb.append(copReportStatus);
		sb.append(", copReportType=");
		sb.append(copReportType);
		sb.append(", copReportMetadata=");
		sb.append(copReportMetadata);
		sb.append(", copReportSignName=");
		sb.append(copReportSignName);
		sb.append(", copReportSignTitle=");
		sb.append(copReportSignTitle);
		sb.append(", copReportSignPlace=");
		sb.append(copReportSignPlace);
		sb.append(", copReportDate=");
		sb.append(copReportDate);
		sb.append(", copReportApprovedDate=");
		sb.append(copReportApprovedDate);
		sb.append(", copReportExpiredDate=");
		sb.append(copReportExpiredDate);
		sb.append(", COPFileEntryId=");
		sb.append(COPFileEntryId);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append(", importerManufacturerCode=");
		sb.append(importerManufacturerCode);
		sb.append(", importerManufacturerName=");
		sb.append(importerManufacturerName);
		sb.append(", importerManufacturerAddress=");
		sb.append(importerManufacturerAddress);
		sb.append(", markupDomesticsManufacturer=");
		sb.append(markupDomesticsManufacturer);
		sb.append(", markupImporter=");
		sb.append(markupImporter);
		sb.append(", copClassification=");
		sb.append(copClassification);
		sb.append(", productClassificationDescription=");
		sb.append(productClassificationDescription);
		sb.append(", totalPointA=");
		sb.append(totalPointA);
		sb.append(", totalPointB=");
		sb.append(totalPointB);
		sb.append(", totalPointC=");
		sb.append(totalPointC);
		sb.append(", copNonConformity=");
		sb.append(copNonConformity);
		sb.append(", inspectionRecordNo=");
		sb.append(inspectionRecordNo);
		sb.append(", inspectionRecordDate=");
		sb.append(inspectionRecordDate);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", inspectionSite=");
		sb.append(inspectionSite);
		sb.append(", inspectionDateFrom=");
		sb.append(inspectionDateFrom);
		sb.append(", inspectionDateTo=");
		sb.append(inspectionDateTo);
		sb.append(", subInspector=");
		sb.append(subInspector);
		sb.append(", description=");
		sb.append(description);
		sb.append(", applicantRepresentative=");
		sb.append(applicantRepresentative);
		sb.append(", applicantRepresentativeTitle=");
		sb.append(applicantRepresentativeTitle);
		sb.append(", inspectionRecordFileEntryId=");
		sb.append(inspectionRecordFileEntryId);
		sb.append(", copReportRefNo=");
		sb.append(copReportRefNo);
		sb.append(", copReportRefDate=");
		sb.append(copReportRefDate);
		sb.append(", copReportPreviousNo=");
		sb.append(copReportPreviousNo);
		sb.append(", copReportPreviousDate=");
		sb.append(copReportPreviousDate);
		sb.append(", expiredStatus=");
		sb.append(expiredStatus);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierIdCTN=");
		sb.append(dossierIdCTN);
		sb.append(", dossierNo=");
		sb.append(dossierNo);
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

		if (copReportNo == null) {
			vrcopReportRepositoryImpl.setCopReportNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportNo(copReportNo);
		}

		if (copReportStatus == null) {
			vrcopReportRepositoryImpl.setCopReportStatus(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportStatus(copReportStatus);
		}

		if (copReportType == null) {
			vrcopReportRepositoryImpl.setCopReportType(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportType(copReportType);
		}

		if (copReportMetadata == null) {
			vrcopReportRepositoryImpl.setCopReportMetadata(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportMetadata(copReportMetadata);
		}

		if (copReportSignName == null) {
			vrcopReportRepositoryImpl.setCopReportSignName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportSignName(copReportSignName);
		}

		if (copReportSignTitle == null) {
			vrcopReportRepositoryImpl.setCopReportSignTitle(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportSignTitle(copReportSignTitle);
		}

		if (copReportSignPlace == null) {
			vrcopReportRepositoryImpl.setCopReportSignPlace(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportSignPlace(copReportSignPlace);
		}

		if (copReportDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportDate(new Date(copReportDate));
		}

		if (copReportApprovedDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportApprovedDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportApprovedDate(new Date(
					copReportApprovedDate));
		}

		if (copReportExpiredDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportExpiredDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportExpiredDate(new Date(
					copReportExpiredDate));
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

		if (importerManufacturerCode == null) {
			vrcopReportRepositoryImpl.setImporterManufacturerCode(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setImporterManufacturerCode(importerManufacturerCode);
		}

		if (importerManufacturerName == null) {
			vrcopReportRepositoryImpl.setImporterManufacturerName(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setImporterManufacturerName(importerManufacturerName);
		}

		if (importerManufacturerAddress == null) {
			vrcopReportRepositoryImpl.setImporterManufacturerAddress(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setImporterManufacturerAddress(importerManufacturerAddress);
		}

		if (markupDomesticsManufacturer == null) {
			vrcopReportRepositoryImpl.setMarkupDomesticsManufacturer(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMarkupDomesticsManufacturer(markupDomesticsManufacturer);
		}

		if (markupImporter == null) {
			vrcopReportRepositoryImpl.setMarkupImporter(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setMarkupImporter(markupImporter);
		}

		if (copClassification == null) {
			vrcopReportRepositoryImpl.setCopClassification(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopClassification(copClassification);
		}

		if (productClassificationDescription == null) {
			vrcopReportRepositoryImpl.setProductClassificationDescription(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setProductClassificationDescription(productClassificationDescription);
		}

		vrcopReportRepositoryImpl.setTotalPointA(totalPointA);
		vrcopReportRepositoryImpl.setTotalPointB(totalPointB);
		vrcopReportRepositoryImpl.setTotalPointC(totalPointC);

		if (copNonConformity == null) {
			vrcopReportRepositoryImpl.setCopNonConformity(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopNonConformity(copNonConformity);
		}

		if (inspectionRecordNo == null) {
			vrcopReportRepositoryImpl.setInspectionRecordNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionRecordNo(inspectionRecordNo);
		}

		if (inspectionRecordDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setInspectionRecordDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionRecordDate(new Date(
					inspectionRecordDate));
		}

		vrcopReportRepositoryImpl.setCorporationId(corporationId);
		vrcopReportRepositoryImpl.setInspectorId(inspectorId);

		if (inspectionSite == null) {
			vrcopReportRepositoryImpl.setInspectionSite(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionSite(inspectionSite);
		}

		if (inspectionDateFrom == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setInspectionDateFrom(null);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionDateFrom(new Date(
					inspectionDateFrom));
		}

		if (inspectionDateTo == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setInspectionDateTo(null);
		}
		else {
			vrcopReportRepositoryImpl.setInspectionDateTo(new Date(
					inspectionDateTo));
		}

		if (subInspector == null) {
			vrcopReportRepositoryImpl.setSubInspector(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setSubInspector(subInspector);
		}

		if (description == null) {
			vrcopReportRepositoryImpl.setDescription(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setDescription(description);
		}

		if (applicantRepresentative == null) {
			vrcopReportRepositoryImpl.setApplicantRepresentative(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantRepresentative(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			vrcopReportRepositoryImpl.setApplicantRepresentativeTitle(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
		}

		vrcopReportRepositoryImpl.setInspectionRecordFileEntryId(inspectionRecordFileEntryId);

		if (copReportRefNo == null) {
			vrcopReportRepositoryImpl.setCopReportRefNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportRefNo(copReportRefNo);
		}

		if (copReportRefDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportRefDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportRefDate(new Date(
					copReportRefDate));
		}

		if (copReportPreviousNo == null) {
			vrcopReportRepositoryImpl.setCopReportPreviousNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportPreviousNo(copReportPreviousNo);
		}

		if (copReportPreviousDate == Long.MIN_VALUE) {
			vrcopReportRepositoryImpl.setCopReportPreviousDate(null);
		}
		else {
			vrcopReportRepositoryImpl.setCopReportPreviousDate(new Date(
					copReportPreviousDate));
		}

		if (expiredStatus == null) {
			vrcopReportRepositoryImpl.setExpiredStatus(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setExpiredStatus(expiredStatus);
		}

		vrcopReportRepositoryImpl.setDossierId(dossierId);

		if (dossierIdCTN == null) {
			vrcopReportRepositoryImpl.setDossierIdCTN(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setDossierIdCTN(dossierIdCTN);
		}

		if (dossierNo == null) {
			vrcopReportRepositoryImpl.setDossierNo(StringPool.BLANK);
		}
		else {
			vrcopReportRepositoryImpl.setDossierNo(dossierNo);
		}

		vrcopReportRepositoryImpl.resetOriginalValues();

		return vrcopReportRepositoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();

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
		copReportNo = objectInput.readUTF();
		copReportStatus = objectInput.readUTF();
		copReportType = objectInput.readUTF();
		copReportMetadata = objectInput.readUTF();
		copReportSignName = objectInput.readUTF();
		copReportSignTitle = objectInput.readUTF();
		copReportSignPlace = objectInput.readUTF();
		copReportDate = objectInput.readLong();
		copReportApprovedDate = objectInput.readLong();
		copReportExpiredDate = objectInput.readLong();

		COPFileEntryId = objectInput.readLong();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
		importerManufacturerCode = objectInput.readUTF();
		importerManufacturerName = objectInput.readUTF();
		importerManufacturerAddress = objectInput.readUTF();
		markupDomesticsManufacturer = objectInput.readUTF();
		markupImporter = objectInput.readUTF();
		copClassification = objectInput.readUTF();
		productClassificationDescription = objectInput.readUTF();

		totalPointA = objectInput.readInt();

		totalPointB = objectInput.readInt();

		totalPointC = objectInput.readInt();
		copNonConformity = objectInput.readUTF();
		inspectionRecordNo = objectInput.readUTF();
		inspectionRecordDate = objectInput.readLong();

		corporationId = objectInput.readLong();

		inspectorId = objectInput.readLong();
		inspectionSite = objectInput.readUTF();
		inspectionDateFrom = objectInput.readLong();
		inspectionDateTo = objectInput.readLong();
		subInspector = objectInput.readUTF();
		description = objectInput.readUTF();
		applicantRepresentative = objectInput.readUTF();
		applicantRepresentativeTitle = objectInput.readUTF();

		inspectionRecordFileEntryId = objectInput.readLong();
		copReportRefNo = objectInput.readUTF();
		copReportRefDate = objectInput.readLong();
		copReportPreviousNo = objectInput.readUTF();
		copReportPreviousDate = objectInput.readLong();
		expiredStatus = objectInput.readUTF();

		dossierId = objectInput.readLong();
		dossierIdCTN = objectInput.readUTF();
		dossierNo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

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

		if (copReportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportNo);
		}

		if (copReportStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportStatus);
		}

		if (copReportType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportType);
		}

		if (copReportMetadata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportMetadata);
		}

		if (copReportSignName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportSignName);
		}

		if (copReportSignTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportSignTitle);
		}

		if (copReportSignPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportSignPlace);
		}

		objectOutput.writeLong(copReportDate);
		objectOutput.writeLong(copReportApprovedDate);
		objectOutput.writeLong(copReportExpiredDate);

		objectOutput.writeLong(COPFileEntryId);
		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);

		if (importerManufacturerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerManufacturerCode);
		}

		if (importerManufacturerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerManufacturerName);
		}

		if (importerManufacturerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerManufacturerAddress);
		}

		if (markupDomesticsManufacturer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupDomesticsManufacturer);
		}

		if (markupImporter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(markupImporter);
		}

		if (copClassification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copClassification);
		}

		if (productClassificationDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productClassificationDescription);
		}

		objectOutput.writeInt(totalPointA);

		objectOutput.writeInt(totalPointB);

		objectOutput.writeInt(totalPointC);

		if (copNonConformity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copNonConformity);
		}

		if (inspectionRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionRecordNo);
		}

		objectOutput.writeLong(inspectionRecordDate);

		objectOutput.writeLong(corporationId);

		objectOutput.writeLong(inspectorId);

		if (inspectionSite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionSite);
		}

		objectOutput.writeLong(inspectionDateFrom);
		objectOutput.writeLong(inspectionDateTo);

		if (subInspector == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subInspector);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (applicantRepresentative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentative);
		}

		if (applicantRepresentativeTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantRepresentativeTitle);
		}

		objectOutput.writeLong(inspectionRecordFileEntryId);

		if (copReportRefNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportRefNo);
		}

		objectOutput.writeLong(copReportRefDate);

		if (copReportPreviousNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copReportPreviousNo);
		}

		objectOutput.writeLong(copReportPreviousDate);

		if (expiredStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expiredStatus);
		}

		objectOutput.writeLong(dossierId);

		if (dossierIdCTN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierIdCTN);
		}

		if (dossierNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierNo);
		}
	}

	public long id;
	public long mtCore;
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
	public String copReportNo;
	public String copReportStatus;
	public String copReportType;
	public String copReportMetadata;
	public String copReportSignName;
	public String copReportSignTitle;
	public String copReportSignPlace;
	public long copReportDate;
	public long copReportApprovedDate;
	public long copReportExpiredDate;
	public long COPFileEntryId;
	public long modifyDate;
	public long syncDate;
	public String importerManufacturerCode;
	public String importerManufacturerName;
	public String importerManufacturerAddress;
	public String markupDomesticsManufacturer;
	public String markupImporter;
	public String copClassification;
	public String productClassificationDescription;
	public int totalPointA;
	public int totalPointB;
	public int totalPointC;
	public String copNonConformity;
	public String inspectionRecordNo;
	public long inspectionRecordDate;
	public long corporationId;
	public long inspectorId;
	public String inspectionSite;
	public long inspectionDateFrom;
	public long inspectionDateTo;
	public String subInspector;
	public String description;
	public String applicantRepresentative;
	public String applicantRepresentativeTitle;
	public long inspectionRecordFileEntryId;
	public String copReportRefNo;
	public long copReportRefDate;
	public String copReportPreviousNo;
	public long copReportPreviousDate;
	public String expiredStatus;
	public long dossierId;
	public String dossierIdCTN;
	public String dossierNo;
}