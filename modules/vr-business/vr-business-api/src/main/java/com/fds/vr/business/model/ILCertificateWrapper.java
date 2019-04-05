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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ILCertificate}.
 * </p>
 *
 * @author LamTV
 * @see ILCertificate
 * @generated
 */
@ProviderType
public class ILCertificateWrapper implements ILCertificate,
	ModelWrapper<ILCertificate> {
	public ILCertificateWrapper(ILCertificate ilCertificate) {
		_ilCertificate = ilCertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return ILCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return ILCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierFileId", getDossierFileId());
		attributes.put("dossierTemplateNo", getDossierTemplateNo());
		attributes.put("dossierPartNo", getDossierPartNo());
		attributes.put("fileTemplateNo", getFileTemplateNo());
		attributes.put("referenceUid", getReferenceUid());
		attributes.put("serviceCode", getServiceCode());
		attributes.put("validFrom", getValidFrom());
		attributes.put("validUntil", getValidUntil());
		attributes.put("transportOperation", getTransportOperation());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantIdNo", getApplicantIdNo());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantTel", getApplicantTel());
		attributes.put("applicantFax", getApplicantFax());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantWebsite", getApplicantWebsite());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("licenceNo", getLicenceNo());
		attributes.put("licenceName", getLicenceName());
		attributes.put("govAgencyCode", getGovAgencyCode());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("registrationNumber", getRegistrationNumber());
		attributes.put("manufacturedYear", getManufacturedYear());
		attributes.put("technicalData", getTechnicalData());
		attributes.put("trademarkCode", getTrademarkCode());
		attributes.put("trademarkName", getTrademarkName());
		attributes.put("model", getModel());
		attributes.put("vehicleType", getVehicleType());
		attributes.put("vehicleColor", getVehicleColor());
		attributes.put("engineNumber", getEngineNumber());
		attributes.put("chassisNumber", getChassisNumber());
		attributes.put("expiredDate", getExpiredDate());
		attributes.put("borderGate", getBorderGate());
		attributes.put("travelingArea", getTravelingArea());
		attributes.put("destination", getDestination());
		attributes.put("extendedUntil", getExtendedUntil());
		attributes.put("noticesOfExtension", getNoticesOfExtension());
		attributes.put("purposeOfTheTrip", getPurposeOfTheTrip());
		attributes.put("issuingDispatchNo", getIssuingDispatchNo());
		attributes.put("officialDispatchNo", getOfficialDispatchNo());
		attributes.put("officialDispatchDate", getOfficialDispatchDate());
		attributes.put("departureFrom", getDepartureFrom());
		attributes.put("departureTo", getDepartureTo());
		attributes.put("fromParkingLot", getFromParkingLot());
		attributes.put("fromProvinceCode", getFromProvinceCode());
		attributes.put("fromProvinceName", getFromProvinceName());
		attributes.put("toParkingLot", getToParkingLot());
		attributes.put("toProvinceCode", getToProvinceCode());
		attributes.put("toProvinceName", getToProvinceName());
		attributes.put("distance", getDistance());
		attributes.put("routeDescription", getRouteDescription());
		attributes.put("expImpGateCode", getExpImpGateCode());
		attributes.put("expImpGate", getExpImpGate());
		attributes.put("itemNo", getItemNo());
		attributes.put("circularNo", getCircularNo());
		attributes.put("circularDate", getCircularDate());
		attributes.put("numberOfVehicle", getNumberOfVehicle());
		attributes.put("toVNAuthority", getToVNAuthority());
		attributes.put("toLAOAuthority", getToLAOAuthority());
		attributes.put("atParkingLot", getAtParkingLot());
		attributes.put("atProvinceName", getAtProvinceName());
		attributes.put("numberOfLot", getNumberOfLot());
		attributes.put("applicantContactName", getApplicantContactName());
		attributes.put("passenger", getPassenger());
		attributes.put("capacity", getCapacity());
		attributes.put("purpose", getPurpose());
		attributes.put("routes", getRoutes());
		attributes.put("goodsType", getGoodsType());
		attributes.put("stops", getStops());
		attributes.put("licenceType", getLicenceType());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long dossierFileId = (Long)attributes.get("dossierFileId");

		if (dossierFileId != null) {
			setDossierFileId(dossierFileId);
		}

		String dossierTemplateNo = (String)attributes.get("dossierTemplateNo");

		if (dossierTemplateNo != null) {
			setDossierTemplateNo(dossierTemplateNo);
		}

		String dossierPartNo = (String)attributes.get("dossierPartNo");

		if (dossierPartNo != null) {
			setDossierPartNo(dossierPartNo);
		}

		String fileTemplateNo = (String)attributes.get("fileTemplateNo");

		if (fileTemplateNo != null) {
			setFileTemplateNo(fileTemplateNo);
		}

		String referenceUid = (String)attributes.get("referenceUid");

		if (referenceUid != null) {
			setReferenceUid(referenceUid);
		}

		String serviceCode = (String)attributes.get("serviceCode");

		if (serviceCode != null) {
			setServiceCode(serviceCode);
		}

		Date validFrom = (Date)attributes.get("validFrom");

		if (validFrom != null) {
			setValidFrom(validFrom);
		}

		Date validUntil = (Date)attributes.get("validUntil");

		if (validUntil != null) {
			setValidUntil(validUntil);
		}

		String transportOperation = (String)attributes.get("transportOperation");

		if (transportOperation != null) {
			setTransportOperation(transportOperation);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantIdNo = (String)attributes.get("applicantIdNo");

		if (applicantIdNo != null) {
			setApplicantIdNo(applicantIdNo);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantTel = (String)attributes.get("applicantTel");

		if (applicantTel != null) {
			setApplicantTel(applicantTel);
		}

		String applicantFax = (String)attributes.get("applicantFax");

		if (applicantFax != null) {
			setApplicantFax(applicantFax);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
		}

		String applicantWebsite = (String)attributes.get("applicantWebsite");

		if (applicantWebsite != null) {
			setApplicantWebsite(applicantWebsite);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		String licenceNo = (String)attributes.get("licenceNo");

		if (licenceNo != null) {
			setLicenceNo(licenceNo);
		}

		String licenceName = (String)attributes.get("licenceName");

		if (licenceName != null) {
			setLicenceName(licenceName);
		}

		String govAgencyCode = (String)attributes.get("govAgencyCode");

		if (govAgencyCode != null) {
			setGovAgencyCode(govAgencyCode);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		String registrationNumber = (String)attributes.get("registrationNumber");

		if (registrationNumber != null) {
			setRegistrationNumber(registrationNumber);
		}

		String manufacturedYear = (String)attributes.get("manufacturedYear");

		if (manufacturedYear != null) {
			setManufacturedYear(manufacturedYear);
		}

		String technicalData = (String)attributes.get("technicalData");

		if (technicalData != null) {
			setTechnicalData(technicalData);
		}

		String trademarkCode = (String)attributes.get("trademarkCode");

		if (trademarkCode != null) {
			setTrademarkCode(trademarkCode);
		}

		String trademarkName = (String)attributes.get("trademarkName");

		if (trademarkName != null) {
			setTrademarkName(trademarkName);
		}

		String model = (String)attributes.get("model");

		if (model != null) {
			setModel(model);
		}

		String vehicleType = (String)attributes.get("vehicleType");

		if (vehicleType != null) {
			setVehicleType(vehicleType);
		}

		String vehicleColor = (String)attributes.get("vehicleColor");

		if (vehicleColor != null) {
			setVehicleColor(vehicleColor);
		}

		String engineNumber = (String)attributes.get("engineNumber");

		if (engineNumber != null) {
			setEngineNumber(engineNumber);
		}

		String chassisNumber = (String)attributes.get("chassisNumber");

		if (chassisNumber != null) {
			setChassisNumber(chassisNumber);
		}

		Date expiredDate = (Date)attributes.get("expiredDate");

		if (expiredDate != null) {
			setExpiredDate(expiredDate);
		}

		String borderGate = (String)attributes.get("borderGate");

		if (borderGate != null) {
			setBorderGate(borderGate);
		}

		String travelingArea = (String)attributes.get("travelingArea");

		if (travelingArea != null) {
			setTravelingArea(travelingArea);
		}

		String destination = (String)attributes.get("destination");

		if (destination != null) {
			setDestination(destination);
		}

		Date extendedUntil = (Date)attributes.get("extendedUntil");

		if (extendedUntil != null) {
			setExtendedUntil(extendedUntil);
		}

		String noticesOfExtension = (String)attributes.get("noticesOfExtension");

		if (noticesOfExtension != null) {
			setNoticesOfExtension(noticesOfExtension);
		}

		String purposeOfTheTrip = (String)attributes.get("purposeOfTheTrip");

		if (purposeOfTheTrip != null) {
			setPurposeOfTheTrip(purposeOfTheTrip);
		}

		String issuingDispatchNo = (String)attributes.get("issuingDispatchNo");

		if (issuingDispatchNo != null) {
			setIssuingDispatchNo(issuingDispatchNo);
		}

		String officialDispatchNo = (String)attributes.get("officialDispatchNo");

		if (officialDispatchNo != null) {
			setOfficialDispatchNo(officialDispatchNo);
		}

		Date officialDispatchDate = (Date)attributes.get("officialDispatchDate");

		if (officialDispatchDate != null) {
			setOfficialDispatchDate(officialDispatchDate);
		}

		String departureFrom = (String)attributes.get("departureFrom");

		if (departureFrom != null) {
			setDepartureFrom(departureFrom);
		}

		String departureTo = (String)attributes.get("departureTo");

		if (departureTo != null) {
			setDepartureTo(departureTo);
		}

		String fromParkingLot = (String)attributes.get("fromParkingLot");

		if (fromParkingLot != null) {
			setFromParkingLot(fromParkingLot);
		}

		String fromProvinceCode = (String)attributes.get("fromProvinceCode");

		if (fromProvinceCode != null) {
			setFromProvinceCode(fromProvinceCode);
		}

		String fromProvinceName = (String)attributes.get("fromProvinceName");

		if (fromProvinceName != null) {
			setFromProvinceName(fromProvinceName);
		}

		String toParkingLot = (String)attributes.get("toParkingLot");

		if (toParkingLot != null) {
			setToParkingLot(toParkingLot);
		}

		String toProvinceCode = (String)attributes.get("toProvinceCode");

		if (toProvinceCode != null) {
			setToProvinceCode(toProvinceCode);
		}

		String toProvinceName = (String)attributes.get("toProvinceName");

		if (toProvinceName != null) {
			setToProvinceName(toProvinceName);
		}

		String distance = (String)attributes.get("distance");

		if (distance != null) {
			setDistance(distance);
		}

		String routeDescription = (String)attributes.get("routeDescription");

		if (routeDescription != null) {
			setRouteDescription(routeDescription);
		}

		String expImpGateCode = (String)attributes.get("expImpGateCode");

		if (expImpGateCode != null) {
			setExpImpGateCode(expImpGateCode);
		}

		String expImpGate = (String)attributes.get("expImpGate");

		if (expImpGate != null) {
			setExpImpGate(expImpGate);
		}

		String itemNo = (String)attributes.get("itemNo");

		if (itemNo != null) {
			setItemNo(itemNo);
		}

		String circularNo = (String)attributes.get("circularNo");

		if (circularNo != null) {
			setCircularNo(circularNo);
		}

		Date circularDate = (Date)attributes.get("circularDate");

		if (circularDate != null) {
			setCircularDate(circularDate);
		}

		String numberOfVehicle = (String)attributes.get("numberOfVehicle");

		if (numberOfVehicle != null) {
			setNumberOfVehicle(numberOfVehicle);
		}

		String toVNAuthority = (String)attributes.get("toVNAuthority");

		if (toVNAuthority != null) {
			setToVNAuthority(toVNAuthority);
		}

		String toLAOAuthority = (String)attributes.get("toLAOAuthority");

		if (toLAOAuthority != null) {
			setToLAOAuthority(toLAOAuthority);
		}

		String atParkingLot = (String)attributes.get("atParkingLot");

		if (atParkingLot != null) {
			setAtParkingLot(atParkingLot);
		}

		String atProvinceName = (String)attributes.get("atProvinceName");

		if (atProvinceName != null) {
			setAtProvinceName(atProvinceName);
		}

		Long numberOfLot = (Long)attributes.get("numberOfLot");

		if (numberOfLot != null) {
			setNumberOfLot(numberOfLot);
		}

		String applicantContactName = (String)attributes.get(
				"applicantContactName");

		if (applicantContactName != null) {
			setApplicantContactName(applicantContactName);
		}

		String passenger = (String)attributes.get("passenger");

		if (passenger != null) {
			setPassenger(passenger);
		}

		String capacity = (String)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		String purpose = (String)attributes.get("purpose");

		if (purpose != null) {
			setPurpose(purpose);
		}

		String routes = (String)attributes.get("routes");

		if (routes != null) {
			setRoutes(routes);
		}

		String goodsType = (String)attributes.get("goodsType");

		if (goodsType != null) {
			setGoodsType(goodsType);
		}

		String stops = (String)attributes.get("stops");

		if (stops != null) {
			setStops(stops);
		}

		String licenceType = (String)attributes.get("licenceType");

		if (licenceType != null) {
			setLicenceType(licenceType);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public ILCertificate toEscapedModel() {
		return new ILCertificateWrapper(_ilCertificate.toEscapedModel());
	}

	@Override
	public ILCertificate toUnescapedModel() {
		return new ILCertificateWrapper(_ilCertificate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ilCertificate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ilCertificate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ilCertificate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ilCertificate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ILCertificate> toCacheModel() {
		return _ilCertificate.toCacheModel();
	}

	@Override
	public int compareTo(ILCertificate ilCertificate) {
		return _ilCertificate.compareTo(ilCertificate);
	}

	@Override
	public int hashCode() {
		return _ilCertificate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ilCertificate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ILCertificateWrapper((ILCertificate)_ilCertificate.clone());
	}

	/**
	* Returns the applicant address of this il certificate.
	*
	* @return the applicant address of this il certificate
	*/
	@Override
	public java.lang.String getApplicantAddress() {
		return _ilCertificate.getApplicantAddress();
	}

	/**
	* Returns the applicant contact name of this il certificate.
	*
	* @return the applicant contact name of this il certificate
	*/
	@Override
	public java.lang.String getApplicantContactName() {
		return _ilCertificate.getApplicantContactName();
	}

	/**
	* Returns the applicant email of this il certificate.
	*
	* @return the applicant email of this il certificate
	*/
	@Override
	public java.lang.String getApplicantEmail() {
		return _ilCertificate.getApplicantEmail();
	}

	/**
	* Returns the applicant fax of this il certificate.
	*
	* @return the applicant fax of this il certificate
	*/
	@Override
	public java.lang.String getApplicantFax() {
		return _ilCertificate.getApplicantFax();
	}

	/**
	* Returns the applicant ID no of this il certificate.
	*
	* @return the applicant ID no of this il certificate
	*/
	@Override
	public java.lang.String getApplicantIdNo() {
		return _ilCertificate.getApplicantIdNo();
	}

	/**
	* Returns the applicant name of this il certificate.
	*
	* @return the applicant name of this il certificate
	*/
	@Override
	public java.lang.String getApplicantName() {
		return _ilCertificate.getApplicantName();
	}

	/**
	* Returns the applicant tel of this il certificate.
	*
	* @return the applicant tel of this il certificate
	*/
	@Override
	public java.lang.String getApplicantTel() {
		return _ilCertificate.getApplicantTel();
	}

	/**
	* Returns the applicant website of this il certificate.
	*
	* @return the applicant website of this il certificate
	*/
	@Override
	public java.lang.String getApplicantWebsite() {
		return _ilCertificate.getApplicantWebsite();
	}

	/**
	* Returns the at parking lot of this il certificate.
	*
	* @return the at parking lot of this il certificate
	*/
	@Override
	public java.lang.String getAtParkingLot() {
		return _ilCertificate.getAtParkingLot();
	}

	/**
	* Returns the at province name of this il certificate.
	*
	* @return the at province name of this il certificate
	*/
	@Override
	public java.lang.String getAtProvinceName() {
		return _ilCertificate.getAtProvinceName();
	}

	/**
	* Returns the border gate of this il certificate.
	*
	* @return the border gate of this il certificate
	*/
	@Override
	public java.lang.String getBorderGate() {
		return _ilCertificate.getBorderGate();
	}

	/**
	* Returns the capacity of this il certificate.
	*
	* @return the capacity of this il certificate
	*/
	@Override
	public java.lang.String getCapacity() {
		return _ilCertificate.getCapacity();
	}

	/**
	* Returns the chassis number of this il certificate.
	*
	* @return the chassis number of this il certificate
	*/
	@Override
	public java.lang.String getChassisNumber() {
		return _ilCertificate.getChassisNumber();
	}

	/**
	* Returns the circular no of this il certificate.
	*
	* @return the circular no of this il certificate
	*/
	@Override
	public java.lang.String getCircularNo() {
		return _ilCertificate.getCircularNo();
	}

	/**
	* Returns the departure from of this il certificate.
	*
	* @return the departure from of this il certificate
	*/
	@Override
	public java.lang.String getDepartureFrom() {
		return _ilCertificate.getDepartureFrom();
	}

	/**
	* Returns the departure to of this il certificate.
	*
	* @return the departure to of this il certificate
	*/
	@Override
	public java.lang.String getDepartureTo() {
		return _ilCertificate.getDepartureTo();
	}

	/**
	* Returns the destination of this il certificate.
	*
	* @return the destination of this il certificate
	*/
	@Override
	public java.lang.String getDestination() {
		return _ilCertificate.getDestination();
	}

	/**
	* Returns the distance of this il certificate.
	*
	* @return the distance of this il certificate
	*/
	@Override
	public java.lang.String getDistance() {
		return _ilCertificate.getDistance();
	}

	/**
	* Returns the dossier part no of this il certificate.
	*
	* @return the dossier part no of this il certificate
	*/
	@Override
	public java.lang.String getDossierPartNo() {
		return _ilCertificate.getDossierPartNo();
	}

	/**
	* Returns the dossier template no of this il certificate.
	*
	* @return the dossier template no of this il certificate
	*/
	@Override
	public java.lang.String getDossierTemplateNo() {
		return _ilCertificate.getDossierTemplateNo();
	}

	/**
	* Returns the engine number of this il certificate.
	*
	* @return the engine number of this il certificate
	*/
	@Override
	public java.lang.String getEngineNumber() {
		return _ilCertificate.getEngineNumber();
	}

	/**
	* Returns the exp imp gate of this il certificate.
	*
	* @return the exp imp gate of this il certificate
	*/
	@Override
	public java.lang.String getExpImpGate() {
		return _ilCertificate.getExpImpGate();
	}

	/**
	* Returns the exp imp gate code of this il certificate.
	*
	* @return the exp imp gate code of this il certificate
	*/
	@Override
	public java.lang.String getExpImpGateCode() {
		return _ilCertificate.getExpImpGateCode();
	}

	/**
	* Returns the file template no of this il certificate.
	*
	* @return the file template no of this il certificate
	*/
	@Override
	public java.lang.String getFileTemplateNo() {
		return _ilCertificate.getFileTemplateNo();
	}

	/**
	* Returns the from parking lot of this il certificate.
	*
	* @return the from parking lot of this il certificate
	*/
	@Override
	public java.lang.String getFromParkingLot() {
		return _ilCertificate.getFromParkingLot();
	}

	/**
	* Returns the from province code of this il certificate.
	*
	* @return the from province code of this il certificate
	*/
	@Override
	public java.lang.String getFromProvinceCode() {
		return _ilCertificate.getFromProvinceCode();
	}

	/**
	* Returns the from province name of this il certificate.
	*
	* @return the from province name of this il certificate
	*/
	@Override
	public java.lang.String getFromProvinceName() {
		return _ilCertificate.getFromProvinceName();
	}

	/**
	* Returns the goods type of this il certificate.
	*
	* @return the goods type of this il certificate
	*/
	@Override
	public java.lang.String getGoodsType() {
		return _ilCertificate.getGoodsType();
	}

	/**
	* Returns the gov agency code of this il certificate.
	*
	* @return the gov agency code of this il certificate
	*/
	@Override
	public java.lang.String getGovAgencyCode() {
		return _ilCertificate.getGovAgencyCode();
	}

	/**
	* Returns the gov agency name of this il certificate.
	*
	* @return the gov agency name of this il certificate
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _ilCertificate.getGovAgencyName();
	}

	/**
	* Returns the issuing dispatch no of this il certificate.
	*
	* @return the issuing dispatch no of this il certificate
	*/
	@Override
	public java.lang.String getIssuingDispatchNo() {
		return _ilCertificate.getIssuingDispatchNo();
	}

	/**
	* Returns the item no of this il certificate.
	*
	* @return the item no of this il certificate
	*/
	@Override
	public java.lang.String getItemNo() {
		return _ilCertificate.getItemNo();
	}

	/**
	* Returns the licence name of this il certificate.
	*
	* @return the licence name of this il certificate
	*/
	@Override
	public java.lang.String getLicenceName() {
		return _ilCertificate.getLicenceName();
	}

	/**
	* Returns the licence no of this il certificate.
	*
	* @return the licence no of this il certificate
	*/
	@Override
	public java.lang.String getLicenceNo() {
		return _ilCertificate.getLicenceNo();
	}

	/**
	* Returns the licence type of this il certificate.
	*
	* @return the licence type of this il certificate
	*/
	@Override
	public java.lang.String getLicenceType() {
		return _ilCertificate.getLicenceType();
	}

	/**
	* Returns the manufactured year of this il certificate.
	*
	* @return the manufactured year of this il certificate
	*/
	@Override
	public java.lang.String getManufacturedYear() {
		return _ilCertificate.getManufacturedYear();
	}

	/**
	* Returns the model of this il certificate.
	*
	* @return the model of this il certificate
	*/
	@Override
	public java.lang.String getModel() {
		return _ilCertificate.getModel();
	}

	/**
	* Returns the notices of extension of this il certificate.
	*
	* @return the notices of extension of this il certificate
	*/
	@Override
	public java.lang.String getNoticesOfExtension() {
		return _ilCertificate.getNoticesOfExtension();
	}

	/**
	* Returns the number of vehicle of this il certificate.
	*
	* @return the number of vehicle of this il certificate
	*/
	@Override
	public java.lang.String getNumberOfVehicle() {
		return _ilCertificate.getNumberOfVehicle();
	}

	/**
	* Returns the official dispatch no of this il certificate.
	*
	* @return the official dispatch no of this il certificate
	*/
	@Override
	public java.lang.String getOfficialDispatchNo() {
		return _ilCertificate.getOfficialDispatchNo();
	}

	/**
	* Returns the passenger of this il certificate.
	*
	* @return the passenger of this il certificate
	*/
	@Override
	public java.lang.String getPassenger() {
		return _ilCertificate.getPassenger();
	}

	/**
	* Returns the purpose of this il certificate.
	*
	* @return the purpose of this il certificate
	*/
	@Override
	public java.lang.String getPurpose() {
		return _ilCertificate.getPurpose();
	}

	/**
	* Returns the purpose of the trip of this il certificate.
	*
	* @return the purpose of the trip of this il certificate
	*/
	@Override
	public java.lang.String getPurposeOfTheTrip() {
		return _ilCertificate.getPurposeOfTheTrip();
	}

	/**
	* Returns the reference uid of this il certificate.
	*
	* @return the reference uid of this il certificate
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _ilCertificate.getReferenceUid();
	}

	/**
	* Returns the registration number of this il certificate.
	*
	* @return the registration number of this il certificate
	*/
	@Override
	public java.lang.String getRegistrationNumber() {
		return _ilCertificate.getRegistrationNumber();
	}

	/**
	* Returns the route description of this il certificate.
	*
	* @return the route description of this il certificate
	*/
	@Override
	public java.lang.String getRouteDescription() {
		return _ilCertificate.getRouteDescription();
	}

	/**
	* Returns the routes of this il certificate.
	*
	* @return the routes of this il certificate
	*/
	@Override
	public java.lang.String getRoutes() {
		return _ilCertificate.getRoutes();
	}

	/**
	* Returns the service code of this il certificate.
	*
	* @return the service code of this il certificate
	*/
	@Override
	public java.lang.String getServiceCode() {
		return _ilCertificate.getServiceCode();
	}

	/**
	* Returns the sign name of this il certificate.
	*
	* @return the sign name of this il certificate
	*/
	@Override
	public java.lang.String getSignName() {
		return _ilCertificate.getSignName();
	}

	/**
	* Returns the sign place of this il certificate.
	*
	* @return the sign place of this il certificate
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _ilCertificate.getSignPlace();
	}

	/**
	* Returns the sign title of this il certificate.
	*
	* @return the sign title of this il certificate
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _ilCertificate.getSignTitle();
	}

	/**
	* Returns the stops of this il certificate.
	*
	* @return the stops of this il certificate
	*/
	@Override
	public java.lang.String getStops() {
		return _ilCertificate.getStops();
	}

	/**
	* Returns the technical data of this il certificate.
	*
	* @return the technical data of this il certificate
	*/
	@Override
	public java.lang.String getTechnicalData() {
		return _ilCertificate.getTechnicalData();
	}

	/**
	* Returns the to lao authority of this il certificate.
	*
	* @return the to lao authority of this il certificate
	*/
	@Override
	public java.lang.String getToLAOAuthority() {
		return _ilCertificate.getToLAOAuthority();
	}

	/**
	* Returns the to parking lot of this il certificate.
	*
	* @return the to parking lot of this il certificate
	*/
	@Override
	public java.lang.String getToParkingLot() {
		return _ilCertificate.getToParkingLot();
	}

	/**
	* Returns the to province code of this il certificate.
	*
	* @return the to province code of this il certificate
	*/
	@Override
	public java.lang.String getToProvinceCode() {
		return _ilCertificate.getToProvinceCode();
	}

	/**
	* Returns the to province name of this il certificate.
	*
	* @return the to province name of this il certificate
	*/
	@Override
	public java.lang.String getToProvinceName() {
		return _ilCertificate.getToProvinceName();
	}

	/**
	* Returns the to vn authority of this il certificate.
	*
	* @return the to vn authority of this il certificate
	*/
	@Override
	public java.lang.String getToVNAuthority() {
		return _ilCertificate.getToVNAuthority();
	}

	/**
	* Returns the trademark code of this il certificate.
	*
	* @return the trademark code of this il certificate
	*/
	@Override
	public java.lang.String getTrademarkCode() {
		return _ilCertificate.getTrademarkCode();
	}

	/**
	* Returns the trademark name of this il certificate.
	*
	* @return the trademark name of this il certificate
	*/
	@Override
	public java.lang.String getTrademarkName() {
		return _ilCertificate.getTrademarkName();
	}

	/**
	* Returns the transport operation of this il certificate.
	*
	* @return the transport operation of this il certificate
	*/
	@Override
	public java.lang.String getTransportOperation() {
		return _ilCertificate.getTransportOperation();
	}

	/**
	* Returns the traveling area of this il certificate.
	*
	* @return the traveling area of this il certificate
	*/
	@Override
	public java.lang.String getTravelingArea() {
		return _ilCertificate.getTravelingArea();
	}

	/**
	* Returns the vehicle color of this il certificate.
	*
	* @return the vehicle color of this il certificate
	*/
	@Override
	public java.lang.String getVehicleColor() {
		return _ilCertificate.getVehicleColor();
	}

	/**
	* Returns the vehicle type of this il certificate.
	*
	* @return the vehicle type of this il certificate
	*/
	@Override
	public java.lang.String getVehicleType() {
		return _ilCertificate.getVehicleType();
	}

	@Override
	public java.lang.String toString() {
		return _ilCertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ilCertificate.toXmlString();
	}

	/**
	* Returns the circular date of this il certificate.
	*
	* @return the circular date of this il certificate
	*/
	@Override
	public Date getCircularDate() {
		return _ilCertificate.getCircularDate();
	}

	/**
	* Returns the expired date of this il certificate.
	*
	* @return the expired date of this il certificate
	*/
	@Override
	public Date getExpiredDate() {
		return _ilCertificate.getExpiredDate();
	}

	/**
	* Returns the extended until of this il certificate.
	*
	* @return the extended until of this il certificate
	*/
	@Override
	public Date getExtendedUntil() {
		return _ilCertificate.getExtendedUntil();
	}

	/**
	* Returns the official dispatch date of this il certificate.
	*
	* @return the official dispatch date of this il certificate
	*/
	@Override
	public Date getOfficialDispatchDate() {
		return _ilCertificate.getOfficialDispatchDate();
	}

	/**
	* Returns the sign date of this il certificate.
	*
	* @return the sign date of this il certificate
	*/
	@Override
	public Date getSignDate() {
		return _ilCertificate.getSignDate();
	}

	/**
	* Returns the sync date of this il certificate.
	*
	* @return the sync date of this il certificate
	*/
	@Override
	public Date getSyncDate() {
		return _ilCertificate.getSyncDate();
	}

	/**
	* Returns the valid from of this il certificate.
	*
	* @return the valid from of this il certificate
	*/
	@Override
	public Date getValidFrom() {
		return _ilCertificate.getValidFrom();
	}

	/**
	* Returns the valid until of this il certificate.
	*
	* @return the valid until of this il certificate
	*/
	@Override
	public Date getValidUntil() {
		return _ilCertificate.getValidUntil();
	}

	/**
	* Returns the dossier file ID of this il certificate.
	*
	* @return the dossier file ID of this il certificate
	*/
	@Override
	public long getDossierFileId() {
		return _ilCertificate.getDossierFileId();
	}

	/**
	* Returns the dossier ID of this il certificate.
	*
	* @return the dossier ID of this il certificate
	*/
	@Override
	public long getDossierId() {
		return _ilCertificate.getDossierId();
	}

	/**
	* Returns the ID of this il certificate.
	*
	* @return the ID of this il certificate
	*/
	@Override
	public long getId() {
		return _ilCertificate.getId();
	}

	/**
	* Returns the number of lot of this il certificate.
	*
	* @return the number of lot of this il certificate
	*/
	@Override
	public long getNumberOfLot() {
		return _ilCertificate.getNumberOfLot();
	}

	/**
	* Returns the primary key of this il certificate.
	*
	* @return the primary key of this il certificate
	*/
	@Override
	public long getPrimaryKey() {
		return _ilCertificate.getPrimaryKey();
	}

	@Override
	public void persist() {
		_ilCertificate.persist();
	}

	/**
	* Sets the applicant address of this il certificate.
	*
	* @param applicantAddress the applicant address of this il certificate
	*/
	@Override
	public void setApplicantAddress(java.lang.String applicantAddress) {
		_ilCertificate.setApplicantAddress(applicantAddress);
	}

	/**
	* Sets the applicant contact name of this il certificate.
	*
	* @param applicantContactName the applicant contact name of this il certificate
	*/
	@Override
	public void setApplicantContactName(java.lang.String applicantContactName) {
		_ilCertificate.setApplicantContactName(applicantContactName);
	}

	/**
	* Sets the applicant email of this il certificate.
	*
	* @param applicantEmail the applicant email of this il certificate
	*/
	@Override
	public void setApplicantEmail(java.lang.String applicantEmail) {
		_ilCertificate.setApplicantEmail(applicantEmail);
	}

	/**
	* Sets the applicant fax of this il certificate.
	*
	* @param applicantFax the applicant fax of this il certificate
	*/
	@Override
	public void setApplicantFax(java.lang.String applicantFax) {
		_ilCertificate.setApplicantFax(applicantFax);
	}

	/**
	* Sets the applicant ID no of this il certificate.
	*
	* @param applicantIdNo the applicant ID no of this il certificate
	*/
	@Override
	public void setApplicantIdNo(java.lang.String applicantIdNo) {
		_ilCertificate.setApplicantIdNo(applicantIdNo);
	}

	/**
	* Sets the applicant name of this il certificate.
	*
	* @param applicantName the applicant name of this il certificate
	*/
	@Override
	public void setApplicantName(java.lang.String applicantName) {
		_ilCertificate.setApplicantName(applicantName);
	}

	/**
	* Sets the applicant tel of this il certificate.
	*
	* @param applicantTel the applicant tel of this il certificate
	*/
	@Override
	public void setApplicantTel(java.lang.String applicantTel) {
		_ilCertificate.setApplicantTel(applicantTel);
	}

	/**
	* Sets the applicant website of this il certificate.
	*
	* @param applicantWebsite the applicant website of this il certificate
	*/
	@Override
	public void setApplicantWebsite(java.lang.String applicantWebsite) {
		_ilCertificate.setApplicantWebsite(applicantWebsite);
	}

	/**
	* Sets the at parking lot of this il certificate.
	*
	* @param atParkingLot the at parking lot of this il certificate
	*/
	@Override
	public void setAtParkingLot(java.lang.String atParkingLot) {
		_ilCertificate.setAtParkingLot(atParkingLot);
	}

	/**
	* Sets the at province name of this il certificate.
	*
	* @param atProvinceName the at province name of this il certificate
	*/
	@Override
	public void setAtProvinceName(java.lang.String atProvinceName) {
		_ilCertificate.setAtProvinceName(atProvinceName);
	}

	/**
	* Sets the border gate of this il certificate.
	*
	* @param borderGate the border gate of this il certificate
	*/
	@Override
	public void setBorderGate(java.lang.String borderGate) {
		_ilCertificate.setBorderGate(borderGate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ilCertificate.setCachedModel(cachedModel);
	}

	/**
	* Sets the capacity of this il certificate.
	*
	* @param capacity the capacity of this il certificate
	*/
	@Override
	public void setCapacity(java.lang.String capacity) {
		_ilCertificate.setCapacity(capacity);
	}

	/**
	* Sets the chassis number of this il certificate.
	*
	* @param chassisNumber the chassis number of this il certificate
	*/
	@Override
	public void setChassisNumber(java.lang.String chassisNumber) {
		_ilCertificate.setChassisNumber(chassisNumber);
	}

	/**
	* Sets the circular date of this il certificate.
	*
	* @param circularDate the circular date of this il certificate
	*/
	@Override
	public void setCircularDate(Date circularDate) {
		_ilCertificate.setCircularDate(circularDate);
	}

	/**
	* Sets the circular no of this il certificate.
	*
	* @param circularNo the circular no of this il certificate
	*/
	@Override
	public void setCircularNo(java.lang.String circularNo) {
		_ilCertificate.setCircularNo(circularNo);
	}

	/**
	* Sets the departure from of this il certificate.
	*
	* @param departureFrom the departure from of this il certificate
	*/
	@Override
	public void setDepartureFrom(java.lang.String departureFrom) {
		_ilCertificate.setDepartureFrom(departureFrom);
	}

	/**
	* Sets the departure to of this il certificate.
	*
	* @param departureTo the departure to of this il certificate
	*/
	@Override
	public void setDepartureTo(java.lang.String departureTo) {
		_ilCertificate.setDepartureTo(departureTo);
	}

	/**
	* Sets the destination of this il certificate.
	*
	* @param destination the destination of this il certificate
	*/
	@Override
	public void setDestination(java.lang.String destination) {
		_ilCertificate.setDestination(destination);
	}

	/**
	* Sets the distance of this il certificate.
	*
	* @param distance the distance of this il certificate
	*/
	@Override
	public void setDistance(java.lang.String distance) {
		_ilCertificate.setDistance(distance);
	}

	/**
	* Sets the dossier file ID of this il certificate.
	*
	* @param dossierFileId the dossier file ID of this il certificate
	*/
	@Override
	public void setDossierFileId(long dossierFileId) {
		_ilCertificate.setDossierFileId(dossierFileId);
	}

	/**
	* Sets the dossier ID of this il certificate.
	*
	* @param dossierId the dossier ID of this il certificate
	*/
	@Override
	public void setDossierId(long dossierId) {
		_ilCertificate.setDossierId(dossierId);
	}

	/**
	* Sets the dossier part no of this il certificate.
	*
	* @param dossierPartNo the dossier part no of this il certificate
	*/
	@Override
	public void setDossierPartNo(java.lang.String dossierPartNo) {
		_ilCertificate.setDossierPartNo(dossierPartNo);
	}

	/**
	* Sets the dossier template no of this il certificate.
	*
	* @param dossierTemplateNo the dossier template no of this il certificate
	*/
	@Override
	public void setDossierTemplateNo(java.lang.String dossierTemplateNo) {
		_ilCertificate.setDossierTemplateNo(dossierTemplateNo);
	}

	/**
	* Sets the engine number of this il certificate.
	*
	* @param engineNumber the engine number of this il certificate
	*/
	@Override
	public void setEngineNumber(java.lang.String engineNumber) {
		_ilCertificate.setEngineNumber(engineNumber);
	}

	/**
	* Sets the exp imp gate of this il certificate.
	*
	* @param expImpGate the exp imp gate of this il certificate
	*/
	@Override
	public void setExpImpGate(java.lang.String expImpGate) {
		_ilCertificate.setExpImpGate(expImpGate);
	}

	/**
	* Sets the exp imp gate code of this il certificate.
	*
	* @param expImpGateCode the exp imp gate code of this il certificate
	*/
	@Override
	public void setExpImpGateCode(java.lang.String expImpGateCode) {
		_ilCertificate.setExpImpGateCode(expImpGateCode);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ilCertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ilCertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ilCertificate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired date of this il certificate.
	*
	* @param expiredDate the expired date of this il certificate
	*/
	@Override
	public void setExpiredDate(Date expiredDate) {
		_ilCertificate.setExpiredDate(expiredDate);
	}

	/**
	* Sets the extended until of this il certificate.
	*
	* @param extendedUntil the extended until of this il certificate
	*/
	@Override
	public void setExtendedUntil(Date extendedUntil) {
		_ilCertificate.setExtendedUntil(extendedUntil);
	}

	/**
	* Sets the file template no of this il certificate.
	*
	* @param fileTemplateNo the file template no of this il certificate
	*/
	@Override
	public void setFileTemplateNo(java.lang.String fileTemplateNo) {
		_ilCertificate.setFileTemplateNo(fileTemplateNo);
	}

	/**
	* Sets the from parking lot of this il certificate.
	*
	* @param fromParkingLot the from parking lot of this il certificate
	*/
	@Override
	public void setFromParkingLot(java.lang.String fromParkingLot) {
		_ilCertificate.setFromParkingLot(fromParkingLot);
	}

	/**
	* Sets the from province code of this il certificate.
	*
	* @param fromProvinceCode the from province code of this il certificate
	*/
	@Override
	public void setFromProvinceCode(java.lang.String fromProvinceCode) {
		_ilCertificate.setFromProvinceCode(fromProvinceCode);
	}

	/**
	* Sets the from province name of this il certificate.
	*
	* @param fromProvinceName the from province name of this il certificate
	*/
	@Override
	public void setFromProvinceName(java.lang.String fromProvinceName) {
		_ilCertificate.setFromProvinceName(fromProvinceName);
	}

	/**
	* Sets the goods type of this il certificate.
	*
	* @param goodsType the goods type of this il certificate
	*/
	@Override
	public void setGoodsType(java.lang.String goodsType) {
		_ilCertificate.setGoodsType(goodsType);
	}

	/**
	* Sets the gov agency code of this il certificate.
	*
	* @param govAgencyCode the gov agency code of this il certificate
	*/
	@Override
	public void setGovAgencyCode(java.lang.String govAgencyCode) {
		_ilCertificate.setGovAgencyCode(govAgencyCode);
	}

	/**
	* Sets the gov agency name of this il certificate.
	*
	* @param govAgencyName the gov agency name of this il certificate
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_ilCertificate.setGovAgencyName(govAgencyName);
	}

	/**
	* Sets the ID of this il certificate.
	*
	* @param id the ID of this il certificate
	*/
	@Override
	public void setId(long id) {
		_ilCertificate.setId(id);
	}

	/**
	* Sets the issuing dispatch no of this il certificate.
	*
	* @param issuingDispatchNo the issuing dispatch no of this il certificate
	*/
	@Override
	public void setIssuingDispatchNo(java.lang.String issuingDispatchNo) {
		_ilCertificate.setIssuingDispatchNo(issuingDispatchNo);
	}

	/**
	* Sets the item no of this il certificate.
	*
	* @param itemNo the item no of this il certificate
	*/
	@Override
	public void setItemNo(java.lang.String itemNo) {
		_ilCertificate.setItemNo(itemNo);
	}

	/**
	* Sets the licence name of this il certificate.
	*
	* @param licenceName the licence name of this il certificate
	*/
	@Override
	public void setLicenceName(java.lang.String licenceName) {
		_ilCertificate.setLicenceName(licenceName);
	}

	/**
	* Sets the licence no of this il certificate.
	*
	* @param licenceNo the licence no of this il certificate
	*/
	@Override
	public void setLicenceNo(java.lang.String licenceNo) {
		_ilCertificate.setLicenceNo(licenceNo);
	}

	/**
	* Sets the licence type of this il certificate.
	*
	* @param licenceType the licence type of this il certificate
	*/
	@Override
	public void setLicenceType(java.lang.String licenceType) {
		_ilCertificate.setLicenceType(licenceType);
	}

	/**
	* Sets the manufactured year of this il certificate.
	*
	* @param manufacturedYear the manufactured year of this il certificate
	*/
	@Override
	public void setManufacturedYear(java.lang.String manufacturedYear) {
		_ilCertificate.setManufacturedYear(manufacturedYear);
	}

	/**
	* Sets the model of this il certificate.
	*
	* @param model the model of this il certificate
	*/
	@Override
	public void setModel(java.lang.String model) {
		_ilCertificate.setModel(model);
	}

	@Override
	public void setNew(boolean n) {
		_ilCertificate.setNew(n);
	}

	/**
	* Sets the notices of extension of this il certificate.
	*
	* @param noticesOfExtension the notices of extension of this il certificate
	*/
	@Override
	public void setNoticesOfExtension(java.lang.String noticesOfExtension) {
		_ilCertificate.setNoticesOfExtension(noticesOfExtension);
	}

	/**
	* Sets the number of lot of this il certificate.
	*
	* @param numberOfLot the number of lot of this il certificate
	*/
	@Override
	public void setNumberOfLot(long numberOfLot) {
		_ilCertificate.setNumberOfLot(numberOfLot);
	}

	/**
	* Sets the number of vehicle of this il certificate.
	*
	* @param numberOfVehicle the number of vehicle of this il certificate
	*/
	@Override
	public void setNumberOfVehicle(java.lang.String numberOfVehicle) {
		_ilCertificate.setNumberOfVehicle(numberOfVehicle);
	}

	/**
	* Sets the official dispatch date of this il certificate.
	*
	* @param officialDispatchDate the official dispatch date of this il certificate
	*/
	@Override
	public void setOfficialDispatchDate(Date officialDispatchDate) {
		_ilCertificate.setOfficialDispatchDate(officialDispatchDate);
	}

	/**
	* Sets the official dispatch no of this il certificate.
	*
	* @param officialDispatchNo the official dispatch no of this il certificate
	*/
	@Override
	public void setOfficialDispatchNo(java.lang.String officialDispatchNo) {
		_ilCertificate.setOfficialDispatchNo(officialDispatchNo);
	}

	/**
	* Sets the passenger of this il certificate.
	*
	* @param passenger the passenger of this il certificate
	*/
	@Override
	public void setPassenger(java.lang.String passenger) {
		_ilCertificate.setPassenger(passenger);
	}

	/**
	* Sets the primary key of this il certificate.
	*
	* @param primaryKey the primary key of this il certificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ilCertificate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ilCertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the purpose of this il certificate.
	*
	* @param purpose the purpose of this il certificate
	*/
	@Override
	public void setPurpose(java.lang.String purpose) {
		_ilCertificate.setPurpose(purpose);
	}

	/**
	* Sets the purpose of the trip of this il certificate.
	*
	* @param purposeOfTheTrip the purpose of the trip of this il certificate
	*/
	@Override
	public void setPurposeOfTheTrip(java.lang.String purposeOfTheTrip) {
		_ilCertificate.setPurposeOfTheTrip(purposeOfTheTrip);
	}

	/**
	* Sets the reference uid of this il certificate.
	*
	* @param referenceUid the reference uid of this il certificate
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_ilCertificate.setReferenceUid(referenceUid);
	}

	/**
	* Sets the registration number of this il certificate.
	*
	* @param registrationNumber the registration number of this il certificate
	*/
	@Override
	public void setRegistrationNumber(java.lang.String registrationNumber) {
		_ilCertificate.setRegistrationNumber(registrationNumber);
	}

	/**
	* Sets the route description of this il certificate.
	*
	* @param routeDescription the route description of this il certificate
	*/
	@Override
	public void setRouteDescription(java.lang.String routeDescription) {
		_ilCertificate.setRouteDescription(routeDescription);
	}

	/**
	* Sets the routes of this il certificate.
	*
	* @param routes the routes of this il certificate
	*/
	@Override
	public void setRoutes(java.lang.String routes) {
		_ilCertificate.setRoutes(routes);
	}

	/**
	* Sets the service code of this il certificate.
	*
	* @param serviceCode the service code of this il certificate
	*/
	@Override
	public void setServiceCode(java.lang.String serviceCode) {
		_ilCertificate.setServiceCode(serviceCode);
	}

	/**
	* Sets the sign date of this il certificate.
	*
	* @param signDate the sign date of this il certificate
	*/
	@Override
	public void setSignDate(Date signDate) {
		_ilCertificate.setSignDate(signDate);
	}

	/**
	* Sets the sign name of this il certificate.
	*
	* @param signName the sign name of this il certificate
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_ilCertificate.setSignName(signName);
	}

	/**
	* Sets the sign place of this il certificate.
	*
	* @param signPlace the sign place of this il certificate
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_ilCertificate.setSignPlace(signPlace);
	}

	/**
	* Sets the sign title of this il certificate.
	*
	* @param signTitle the sign title of this il certificate
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_ilCertificate.setSignTitle(signTitle);
	}

	/**
	* Sets the stops of this il certificate.
	*
	* @param stops the stops of this il certificate
	*/
	@Override
	public void setStops(java.lang.String stops) {
		_ilCertificate.setStops(stops);
	}

	/**
	* Sets the sync date of this il certificate.
	*
	* @param syncDate the sync date of this il certificate
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_ilCertificate.setSyncDate(syncDate);
	}

	/**
	* Sets the technical data of this il certificate.
	*
	* @param technicalData the technical data of this il certificate
	*/
	@Override
	public void setTechnicalData(java.lang.String technicalData) {
		_ilCertificate.setTechnicalData(technicalData);
	}

	/**
	* Sets the to lao authority of this il certificate.
	*
	* @param toLAOAuthority the to lao authority of this il certificate
	*/
	@Override
	public void setToLAOAuthority(java.lang.String toLAOAuthority) {
		_ilCertificate.setToLAOAuthority(toLAOAuthority);
	}

	/**
	* Sets the to parking lot of this il certificate.
	*
	* @param toParkingLot the to parking lot of this il certificate
	*/
	@Override
	public void setToParkingLot(java.lang.String toParkingLot) {
		_ilCertificate.setToParkingLot(toParkingLot);
	}

	/**
	* Sets the to province code of this il certificate.
	*
	* @param toProvinceCode the to province code of this il certificate
	*/
	@Override
	public void setToProvinceCode(java.lang.String toProvinceCode) {
		_ilCertificate.setToProvinceCode(toProvinceCode);
	}

	/**
	* Sets the to province name of this il certificate.
	*
	* @param toProvinceName the to province name of this il certificate
	*/
	@Override
	public void setToProvinceName(java.lang.String toProvinceName) {
		_ilCertificate.setToProvinceName(toProvinceName);
	}

	/**
	* Sets the to vn authority of this il certificate.
	*
	* @param toVNAuthority the to vn authority of this il certificate
	*/
	@Override
	public void setToVNAuthority(java.lang.String toVNAuthority) {
		_ilCertificate.setToVNAuthority(toVNAuthority);
	}

	/**
	* Sets the trademark code of this il certificate.
	*
	* @param trademarkCode the trademark code of this il certificate
	*/
	@Override
	public void setTrademarkCode(java.lang.String trademarkCode) {
		_ilCertificate.setTrademarkCode(trademarkCode);
	}

	/**
	* Sets the trademark name of this il certificate.
	*
	* @param trademarkName the trademark name of this il certificate
	*/
	@Override
	public void setTrademarkName(java.lang.String trademarkName) {
		_ilCertificate.setTrademarkName(trademarkName);
	}

	/**
	* Sets the transport operation of this il certificate.
	*
	* @param transportOperation the transport operation of this il certificate
	*/
	@Override
	public void setTransportOperation(java.lang.String transportOperation) {
		_ilCertificate.setTransportOperation(transportOperation);
	}

	/**
	* Sets the traveling area of this il certificate.
	*
	* @param travelingArea the traveling area of this il certificate
	*/
	@Override
	public void setTravelingArea(java.lang.String travelingArea) {
		_ilCertificate.setTravelingArea(travelingArea);
	}

	/**
	* Sets the valid from of this il certificate.
	*
	* @param validFrom the valid from of this il certificate
	*/
	@Override
	public void setValidFrom(Date validFrom) {
		_ilCertificate.setValidFrom(validFrom);
	}

	/**
	* Sets the valid until of this il certificate.
	*
	* @param validUntil the valid until of this il certificate
	*/
	@Override
	public void setValidUntil(Date validUntil) {
		_ilCertificate.setValidUntil(validUntil);
	}

	/**
	* Sets the vehicle color of this il certificate.
	*
	* @param vehicleColor the vehicle color of this il certificate
	*/
	@Override
	public void setVehicleColor(java.lang.String vehicleColor) {
		_ilCertificate.setVehicleColor(vehicleColor);
	}

	/**
	* Sets the vehicle type of this il certificate.
	*
	* @param vehicleType the vehicle type of this il certificate
	*/
	@Override
	public void setVehicleType(java.lang.String vehicleType) {
		_ilCertificate.setVehicleType(vehicleType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ILCertificateWrapper)) {
			return false;
		}

		ILCertificateWrapper ilCertificateWrapper = (ILCertificateWrapper)obj;

		if (Objects.equals(_ilCertificate, ilCertificateWrapper._ilCertificate)) {
			return true;
		}

		return false;
	}

	@Override
	public ILCertificate getWrappedModel() {
		return _ilCertificate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ilCertificate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ilCertificate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ilCertificate.resetOriginalValues();
	}

	private final ILCertificate _ilCertificate;
}