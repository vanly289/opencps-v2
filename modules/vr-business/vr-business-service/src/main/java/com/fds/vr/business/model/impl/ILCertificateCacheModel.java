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

import com.fds.vr.business.model.ILCertificate;

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
 * The cache model class for representing ILCertificate in entity cache.
 *
 * @author LamTV
 * @see ILCertificate
 * @generated
 */
@ProviderType
public class ILCertificateCacheModel implements CacheModel<ILCertificate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ILCertificateCacheModel)) {
			return false;
		}

		ILCertificateCacheModel ilCertificateCacheModel = (ILCertificateCacheModel)obj;

		if (id == ilCertificateCacheModel.id) {
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
		StringBundler sb = new StringBundler(153);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", dossierFileId=");
		sb.append(dossierFileId);
		sb.append(", dossierTemplateNo=");
		sb.append(dossierTemplateNo);
		sb.append(", dossierPartNo=");
		sb.append(dossierPartNo);
		sb.append(", fileTemplateNo=");
		sb.append(fileTemplateNo);
		sb.append(", referenceUid=");
		sb.append(referenceUid);
		sb.append(", serviceCode=");
		sb.append(serviceCode);
		sb.append(", validFrom=");
		sb.append(validFrom);
		sb.append(", validUntil=");
		sb.append(validUntil);
		sb.append(", transportOperation=");
		sb.append(transportOperation);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantIdNo=");
		sb.append(applicantIdNo);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", applicantTel=");
		sb.append(applicantTel);
		sb.append(", applicantFax=");
		sb.append(applicantFax);
		sb.append(", applicantEmail=");
		sb.append(applicantEmail);
		sb.append(", applicantWebsite=");
		sb.append(applicantWebsite);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", licenceNo=");
		sb.append(licenceNo);
		sb.append(", licenceName=");
		sb.append(licenceName);
		sb.append(", govAgencyCode=");
		sb.append(govAgencyCode);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", registrationNumber=");
		sb.append(registrationNumber);
		sb.append(", manufacturedYear=");
		sb.append(manufacturedYear);
		sb.append(", technicalData=");
		sb.append(technicalData);
		sb.append(", trademarkCode=");
		sb.append(trademarkCode);
		sb.append(", trademarkName=");
		sb.append(trademarkName);
		sb.append(", model=");
		sb.append(model);
		sb.append(", vehicleType=");
		sb.append(vehicleType);
		sb.append(", vehicleColor=");
		sb.append(vehicleColor);
		sb.append(", engineNumber=");
		sb.append(engineNumber);
		sb.append(", chassisNumber=");
		sb.append(chassisNumber);
		sb.append(", expiredDate=");
		sb.append(expiredDate);
		sb.append(", borderGate=");
		sb.append(borderGate);
		sb.append(", travelingArea=");
		sb.append(travelingArea);
		sb.append(", destination=");
		sb.append(destination);
		sb.append(", extendedUntil=");
		sb.append(extendedUntil);
		sb.append(", noticesOfExtension=");
		sb.append(noticesOfExtension);
		sb.append(", purposeOfTheTrip=");
		sb.append(purposeOfTheTrip);
		sb.append(", issuingDispatchNo=");
		sb.append(issuingDispatchNo);
		sb.append(", officialDispatchNo=");
		sb.append(officialDispatchNo);
		sb.append(", officialDispatchDate=");
		sb.append(officialDispatchDate);
		sb.append(", departureFrom=");
		sb.append(departureFrom);
		sb.append(", departureTo=");
		sb.append(departureTo);
		sb.append(", fromParkingLot=");
		sb.append(fromParkingLot);
		sb.append(", fromProvinceCode=");
		sb.append(fromProvinceCode);
		sb.append(", fromProvinceName=");
		sb.append(fromProvinceName);
		sb.append(", toParkingLot=");
		sb.append(toParkingLot);
		sb.append(", toProvinceCode=");
		sb.append(toProvinceCode);
		sb.append(", toProvinceName=");
		sb.append(toProvinceName);
		sb.append(", distance=");
		sb.append(distance);
		sb.append(", routeDescription=");
		sb.append(routeDescription);
		sb.append(", expImpGateCode=");
		sb.append(expImpGateCode);
		sb.append(", expImpGate=");
		sb.append(expImpGate);
		sb.append(", itemNo=");
		sb.append(itemNo);
		sb.append(", circularNo=");
		sb.append(circularNo);
		sb.append(", circularDate=");
		sb.append(circularDate);
		sb.append(", numberOfVehicle=");
		sb.append(numberOfVehicle);
		sb.append(", toVNAuthority=");
		sb.append(toVNAuthority);
		sb.append(", toLAOAuthority=");
		sb.append(toLAOAuthority);
		sb.append(", atParkingLot=");
		sb.append(atParkingLot);
		sb.append(", atProvinceName=");
		sb.append(atProvinceName);
		sb.append(", numberOfLot=");
		sb.append(numberOfLot);
		sb.append(", applicantContactName=");
		sb.append(applicantContactName);
		sb.append(", passenger=");
		sb.append(passenger);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", purpose=");
		sb.append(purpose);
		sb.append(", routes=");
		sb.append(routes);
		sb.append(", goodsType=");
		sb.append(goodsType);
		sb.append(", stops=");
		sb.append(stops);
		sb.append(", licenceType=");
		sb.append(licenceType);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ILCertificate toEntityModel() {
		ILCertificateImpl ilCertificateImpl = new ILCertificateImpl();

		ilCertificateImpl.setId(id);
		ilCertificateImpl.setDossierId(dossierId);
		ilCertificateImpl.setDossierFileId(dossierFileId);

		if (dossierTemplateNo == null) {
			ilCertificateImpl.setDossierTemplateNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setDossierTemplateNo(dossierTemplateNo);
		}

		if (dossierPartNo == null) {
			ilCertificateImpl.setDossierPartNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setDossierPartNo(dossierPartNo);
		}

		if (fileTemplateNo == null) {
			ilCertificateImpl.setFileTemplateNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setFileTemplateNo(fileTemplateNo);
		}

		if (referenceUid == null) {
			ilCertificateImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setReferenceUid(referenceUid);
		}

		if (serviceCode == null) {
			ilCertificateImpl.setServiceCode(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setServiceCode(serviceCode);
		}

		if (validFrom == Long.MIN_VALUE) {
			ilCertificateImpl.setValidFrom(null);
		}
		else {
			ilCertificateImpl.setValidFrom(new Date(validFrom));
		}

		if (validUntil == Long.MIN_VALUE) {
			ilCertificateImpl.setValidUntil(null);
		}
		else {
			ilCertificateImpl.setValidUntil(new Date(validUntil));
		}

		if (transportOperation == null) {
			ilCertificateImpl.setTransportOperation(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setTransportOperation(transportOperation);
		}

		if (applicantName == null) {
			ilCertificateImpl.setApplicantName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setApplicantName(applicantName);
		}

		if (applicantIdNo == null) {
			ilCertificateImpl.setApplicantIdNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setApplicantIdNo(applicantIdNo);
		}

		if (applicantAddress == null) {
			ilCertificateImpl.setApplicantAddress(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantTel == null) {
			ilCertificateImpl.setApplicantTel(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setApplicantTel(applicantTel);
		}

		if (applicantFax == null) {
			ilCertificateImpl.setApplicantFax(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setApplicantFax(applicantFax);
		}

		if (applicantEmail == null) {
			ilCertificateImpl.setApplicantEmail(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setApplicantEmail(applicantEmail);
		}

		if (applicantWebsite == null) {
			ilCertificateImpl.setApplicantWebsite(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setApplicantWebsite(applicantWebsite);
		}

		if (signName == null) {
			ilCertificateImpl.setSignName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setSignName(signName);
		}

		if (signTitle == null) {
			ilCertificateImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			ilCertificateImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			ilCertificateImpl.setSignDate(null);
		}
		else {
			ilCertificateImpl.setSignDate(new Date(signDate));
		}

		if (licenceNo == null) {
			ilCertificateImpl.setLicenceNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setLicenceNo(licenceNo);
		}

		if (licenceName == null) {
			ilCertificateImpl.setLicenceName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setLicenceName(licenceName);
		}

		if (govAgencyCode == null) {
			ilCertificateImpl.setGovAgencyCode(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setGovAgencyCode(govAgencyCode);
		}

		if (govAgencyName == null) {
			ilCertificateImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setGovAgencyName(govAgencyName);
		}

		if (registrationNumber == null) {
			ilCertificateImpl.setRegistrationNumber(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setRegistrationNumber(registrationNumber);
		}

		if (manufacturedYear == null) {
			ilCertificateImpl.setManufacturedYear(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setManufacturedYear(manufacturedYear);
		}

		if (technicalData == null) {
			ilCertificateImpl.setTechnicalData(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setTechnicalData(technicalData);
		}

		if (trademarkCode == null) {
			ilCertificateImpl.setTrademarkCode(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setTrademarkCode(trademarkCode);
		}

		if (trademarkName == null) {
			ilCertificateImpl.setTrademarkName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setTrademarkName(trademarkName);
		}

		if (model == null) {
			ilCertificateImpl.setModel(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setModel(model);
		}

		if (vehicleType == null) {
			ilCertificateImpl.setVehicleType(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setVehicleType(vehicleType);
		}

		if (vehicleColor == null) {
			ilCertificateImpl.setVehicleColor(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setVehicleColor(vehicleColor);
		}

		if (engineNumber == null) {
			ilCertificateImpl.setEngineNumber(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setEngineNumber(engineNumber);
		}

		if (chassisNumber == null) {
			ilCertificateImpl.setChassisNumber(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setChassisNumber(chassisNumber);
		}

		if (expiredDate == Long.MIN_VALUE) {
			ilCertificateImpl.setExpiredDate(null);
		}
		else {
			ilCertificateImpl.setExpiredDate(new Date(expiredDate));
		}

		if (borderGate == null) {
			ilCertificateImpl.setBorderGate(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setBorderGate(borderGate);
		}

		if (travelingArea == null) {
			ilCertificateImpl.setTravelingArea(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setTravelingArea(travelingArea);
		}

		if (destination == null) {
			ilCertificateImpl.setDestination(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setDestination(destination);
		}

		if (extendedUntil == Long.MIN_VALUE) {
			ilCertificateImpl.setExtendedUntil(null);
		}
		else {
			ilCertificateImpl.setExtendedUntil(new Date(extendedUntil));
		}

		if (noticesOfExtension == null) {
			ilCertificateImpl.setNoticesOfExtension(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setNoticesOfExtension(noticesOfExtension);
		}

		if (purposeOfTheTrip == null) {
			ilCertificateImpl.setPurposeOfTheTrip(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setPurposeOfTheTrip(purposeOfTheTrip);
		}

		if (issuingDispatchNo == null) {
			ilCertificateImpl.setIssuingDispatchNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setIssuingDispatchNo(issuingDispatchNo);
		}

		if (officialDispatchNo == null) {
			ilCertificateImpl.setOfficialDispatchNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setOfficialDispatchNo(officialDispatchNo);
		}

		if (officialDispatchDate == Long.MIN_VALUE) {
			ilCertificateImpl.setOfficialDispatchDate(null);
		}
		else {
			ilCertificateImpl.setOfficialDispatchDate(new Date(
					officialDispatchDate));
		}

		if (departureFrom == null) {
			ilCertificateImpl.setDepartureFrom(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setDepartureFrom(departureFrom);
		}

		if (departureTo == null) {
			ilCertificateImpl.setDepartureTo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setDepartureTo(departureTo);
		}

		if (fromParkingLot == null) {
			ilCertificateImpl.setFromParkingLot(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setFromParkingLot(fromParkingLot);
		}

		if (fromProvinceCode == null) {
			ilCertificateImpl.setFromProvinceCode(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setFromProvinceCode(fromProvinceCode);
		}

		if (fromProvinceName == null) {
			ilCertificateImpl.setFromProvinceName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setFromProvinceName(fromProvinceName);
		}

		if (toParkingLot == null) {
			ilCertificateImpl.setToParkingLot(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setToParkingLot(toParkingLot);
		}

		if (toProvinceCode == null) {
			ilCertificateImpl.setToProvinceCode(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setToProvinceCode(toProvinceCode);
		}

		if (toProvinceName == null) {
			ilCertificateImpl.setToProvinceName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setToProvinceName(toProvinceName);
		}

		if (distance == null) {
			ilCertificateImpl.setDistance(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setDistance(distance);
		}

		if (routeDescription == null) {
			ilCertificateImpl.setRouteDescription(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setRouteDescription(routeDescription);
		}

		if (expImpGateCode == null) {
			ilCertificateImpl.setExpImpGateCode(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setExpImpGateCode(expImpGateCode);
		}

		if (expImpGate == null) {
			ilCertificateImpl.setExpImpGate(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setExpImpGate(expImpGate);
		}

		if (itemNo == null) {
			ilCertificateImpl.setItemNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setItemNo(itemNo);
		}

		if (circularNo == null) {
			ilCertificateImpl.setCircularNo(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setCircularNo(circularNo);
		}

		if (circularDate == Long.MIN_VALUE) {
			ilCertificateImpl.setCircularDate(null);
		}
		else {
			ilCertificateImpl.setCircularDate(new Date(circularDate));
		}

		if (numberOfVehicle == null) {
			ilCertificateImpl.setNumberOfVehicle(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setNumberOfVehicle(numberOfVehicle);
		}

		if (toVNAuthority == null) {
			ilCertificateImpl.setToVNAuthority(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setToVNAuthority(toVNAuthority);
		}

		if (toLAOAuthority == null) {
			ilCertificateImpl.setToLAOAuthority(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setToLAOAuthority(toLAOAuthority);
		}

		if (atParkingLot == null) {
			ilCertificateImpl.setAtParkingLot(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setAtParkingLot(atParkingLot);
		}

		if (atProvinceName == null) {
			ilCertificateImpl.setAtProvinceName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setAtProvinceName(atProvinceName);
		}

		ilCertificateImpl.setNumberOfLot(numberOfLot);

		if (applicantContactName == null) {
			ilCertificateImpl.setApplicantContactName(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setApplicantContactName(applicantContactName);
		}

		if (passenger == null) {
			ilCertificateImpl.setPassenger(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setPassenger(passenger);
		}

		if (capacity == null) {
			ilCertificateImpl.setCapacity(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setCapacity(capacity);
		}

		if (purpose == null) {
			ilCertificateImpl.setPurpose(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setPurpose(purpose);
		}

		if (routes == null) {
			ilCertificateImpl.setRoutes(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setRoutes(routes);
		}

		if (goodsType == null) {
			ilCertificateImpl.setGoodsType(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setGoodsType(goodsType);
		}

		if (stops == null) {
			ilCertificateImpl.setStops(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setStops(stops);
		}

		if (licenceType == null) {
			ilCertificateImpl.setLicenceType(StringPool.BLANK);
		}
		else {
			ilCertificateImpl.setLicenceType(licenceType);
		}

		if (syncDate == Long.MIN_VALUE) {
			ilCertificateImpl.setSyncDate(null);
		}
		else {
			ilCertificateImpl.setSyncDate(new Date(syncDate));
		}

		ilCertificateImpl.resetOriginalValues();

		return ilCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		dossierId = objectInput.readLong();

		dossierFileId = objectInput.readLong();
		dossierTemplateNo = objectInput.readUTF();
		dossierPartNo = objectInput.readUTF();
		fileTemplateNo = objectInput.readUTF();
		referenceUid = objectInput.readUTF();
		serviceCode = objectInput.readUTF();
		validFrom = objectInput.readLong();
		validUntil = objectInput.readLong();
		transportOperation = objectInput.readUTF();
		applicantName = objectInput.readUTF();
		applicantIdNo = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		applicantTel = objectInput.readUTF();
		applicantFax = objectInput.readUTF();
		applicantEmail = objectInput.readUTF();
		applicantWebsite = objectInput.readUTF();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		licenceNo = objectInput.readUTF();
		licenceName = objectInput.readUTF();
		govAgencyCode = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		registrationNumber = objectInput.readUTF();
		manufacturedYear = objectInput.readUTF();
		technicalData = objectInput.readUTF();
		trademarkCode = objectInput.readUTF();
		trademarkName = objectInput.readUTF();
		model = objectInput.readUTF();
		vehicleType = objectInput.readUTF();
		vehicleColor = objectInput.readUTF();
		engineNumber = objectInput.readUTF();
		chassisNumber = objectInput.readUTF();
		expiredDate = objectInput.readLong();
		borderGate = objectInput.readUTF();
		travelingArea = objectInput.readUTF();
		destination = objectInput.readUTF();
		extendedUntil = objectInput.readLong();
		noticesOfExtension = objectInput.readUTF();
		purposeOfTheTrip = objectInput.readUTF();
		issuingDispatchNo = objectInput.readUTF();
		officialDispatchNo = objectInput.readUTF();
		officialDispatchDate = objectInput.readLong();
		departureFrom = objectInput.readUTF();
		departureTo = objectInput.readUTF();
		fromParkingLot = objectInput.readUTF();
		fromProvinceCode = objectInput.readUTF();
		fromProvinceName = objectInput.readUTF();
		toParkingLot = objectInput.readUTF();
		toProvinceCode = objectInput.readUTF();
		toProvinceName = objectInput.readUTF();
		distance = objectInput.readUTF();
		routeDescription = objectInput.readUTF();
		expImpGateCode = objectInput.readUTF();
		expImpGate = objectInput.readUTF();
		itemNo = objectInput.readUTF();
		circularNo = objectInput.readUTF();
		circularDate = objectInput.readLong();
		numberOfVehicle = objectInput.readUTF();
		toVNAuthority = objectInput.readUTF();
		toLAOAuthority = objectInput.readUTF();
		atParkingLot = objectInput.readUTF();
		atProvinceName = objectInput.readUTF();

		numberOfLot = objectInput.readLong();
		applicantContactName = objectInput.readUTF();
		passenger = objectInput.readUTF();
		capacity = objectInput.readUTF();
		purpose = objectInput.readUTF();
		routes = objectInput.readUTF();
		goodsType = objectInput.readUTF();
		stops = objectInput.readUTF();
		licenceType = objectInput.readUTF();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(dossierId);

		objectOutput.writeLong(dossierFileId);

		if (dossierTemplateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierTemplateNo);
		}

		if (dossierPartNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierPartNo);
		}

		if (fileTemplateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileTemplateNo);
		}

		if (referenceUid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(referenceUid);
		}

		if (serviceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceCode);
		}

		objectOutput.writeLong(validFrom);
		objectOutput.writeLong(validUntil);

		if (transportOperation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(transportOperation);
		}

		if (applicantName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (applicantIdNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantIdNo);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		if (applicantTel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantTel);
		}

		if (applicantFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantFax);
		}

		if (applicantEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantEmail);
		}

		if (applicantWebsite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantWebsite);
		}

		if (signName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signName);
		}

		if (signTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signTitle);
		}

		if (signPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signPlace);
		}

		objectOutput.writeLong(signDate);

		if (licenceNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(licenceNo);
		}

		if (licenceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(licenceName);
		}

		if (govAgencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyCode);
		}

		if (govAgencyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyName);
		}

		if (registrationNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registrationNumber);
		}

		if (manufacturedYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturedYear);
		}

		if (technicalData == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(technicalData);
		}

		if (trademarkCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trademarkCode);
		}

		if (trademarkName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trademarkName);
		}

		if (model == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(model);
		}

		if (vehicleType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleType);
		}

		if (vehicleColor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleColor);
		}

		if (engineNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(engineNumber);
		}

		if (chassisNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chassisNumber);
		}

		objectOutput.writeLong(expiredDate);

		if (borderGate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(borderGate);
		}

		if (travelingArea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(travelingArea);
		}

		if (destination == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(destination);
		}

		objectOutput.writeLong(extendedUntil);

		if (noticesOfExtension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noticesOfExtension);
		}

		if (purposeOfTheTrip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(purposeOfTheTrip);
		}

		if (issuingDispatchNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuingDispatchNo);
		}

		if (officialDispatchNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(officialDispatchNo);
		}

		objectOutput.writeLong(officialDispatchDate);

		if (departureFrom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(departureFrom);
		}

		if (departureTo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(departureTo);
		}

		if (fromParkingLot == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fromParkingLot);
		}

		if (fromProvinceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fromProvinceCode);
		}

		if (fromProvinceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fromProvinceName);
		}

		if (toParkingLot == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toParkingLot);
		}

		if (toProvinceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toProvinceCode);
		}

		if (toProvinceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toProvinceName);
		}

		if (distance == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(distance);
		}

		if (routeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(routeDescription);
		}

		if (expImpGateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expImpGateCode);
		}

		if (expImpGate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expImpGate);
		}

		if (itemNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemNo);
		}

		if (circularNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(circularNo);
		}

		objectOutput.writeLong(circularDate);

		if (numberOfVehicle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberOfVehicle);
		}

		if (toVNAuthority == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toVNAuthority);
		}

		if (toLAOAuthority == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toLAOAuthority);
		}

		if (atParkingLot == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(atParkingLot);
		}

		if (atProvinceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(atProvinceName);
		}

		objectOutput.writeLong(numberOfLot);

		if (applicantContactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicantContactName);
		}

		if (passenger == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passenger);
		}

		if (capacity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(capacity);
		}

		if (purpose == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(purpose);
		}

		if (routes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(routes);
		}

		if (goodsType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodsType);
		}

		if (stops == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stops);
		}

		if (licenceType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(licenceType);
		}

		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long dossierId;
	public long dossierFileId;
	public String dossierTemplateNo;
	public String dossierPartNo;
	public String fileTemplateNo;
	public String referenceUid;
	public String serviceCode;
	public long validFrom;
	public long validUntil;
	public String transportOperation;
	public String applicantName;
	public String applicantIdNo;
	public String applicantAddress;
	public String applicantTel;
	public String applicantFax;
	public String applicantEmail;
	public String applicantWebsite;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public String licenceNo;
	public String licenceName;
	public String govAgencyCode;
	public String govAgencyName;
	public String registrationNumber;
	public String manufacturedYear;
	public String technicalData;
	public String trademarkCode;
	public String trademarkName;
	public String model;
	public String vehicleType;
	public String vehicleColor;
	public String engineNumber;
	public String chassisNumber;
	public long expiredDate;
	public String borderGate;
	public String travelingArea;
	public String destination;
	public long extendedUntil;
	public String noticesOfExtension;
	public String purposeOfTheTrip;
	public String issuingDispatchNo;
	public String officialDispatchNo;
	public long officialDispatchDate;
	public String departureFrom;
	public String departureTo;
	public String fromParkingLot;
	public String fromProvinceCode;
	public String fromProvinceName;
	public String toParkingLot;
	public String toProvinceCode;
	public String toProvinceName;
	public String distance;
	public String routeDescription;
	public String expImpGateCode;
	public String expImpGate;
	public String itemNo;
	public String circularNo;
	public long circularDate;
	public String numberOfVehicle;
	public String toVNAuthority;
	public String toLAOAuthority;
	public String atParkingLot;
	public String atProvinceName;
	public long numberOfLot;
	public String applicantContactName;
	public String passenger;
	public String capacity;
	public String purpose;
	public String routes;
	public String goodsType;
	public String stops;
	public String licenceType;
	public long syncDate;
}