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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class ILCertificateSoap implements Serializable {
	public static ILCertificateSoap toSoapModel(ILCertificate model) {
		ILCertificateSoap soapModel = new ILCertificateSoap();

		soapModel.setId(model.getId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierFileId(model.getDossierFileId());
		soapModel.setDossierTemplateNo(model.getDossierTemplateNo());
		soapModel.setDossierPartNo(model.getDossierPartNo());
		soapModel.setFileTemplateNo(model.getFileTemplateNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setServiceCode(model.getServiceCode());
		soapModel.setValidFrom(model.getValidFrom());
		soapModel.setValidUntil(model.getValidUntil());
		soapModel.setTransportOperation(model.getTransportOperation());
		soapModel.setApplicantName(model.getApplicantName());
		soapModel.setApplicantIdNo(model.getApplicantIdNo());
		soapModel.setApplicantAddress(model.getApplicantAddress());
		soapModel.setApplicantTel(model.getApplicantTel());
		soapModel.setApplicantFax(model.getApplicantFax());
		soapModel.setApplicantEmail(model.getApplicantEmail());
		soapModel.setApplicantWebsite(model.getApplicantWebsite());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setLicenceNo(model.getLicenceNo());
		soapModel.setLicenceName(model.getLicenceName());
		soapModel.setGovAgencyCode(model.getGovAgencyCode());
		soapModel.setGovAgencyName(model.getGovAgencyName());
		soapModel.setRegistrationNumber(model.getRegistrationNumber());
		soapModel.setManufacturedYear(model.getManufacturedYear());
		soapModel.setTechnicalData(model.getTechnicalData());
		soapModel.setTrademarkCode(model.getTrademarkCode());
		soapModel.setTrademarkName(model.getTrademarkName());
		soapModel.setModel(model.getModel());
		soapModel.setVehicleType(model.getVehicleType());
		soapModel.setVehicleColor(model.getVehicleColor());
		soapModel.setEngineNumber(model.getEngineNumber());
		soapModel.setChassisNumber(model.getChassisNumber());
		soapModel.setExpiredDate(model.getExpiredDate());
		soapModel.setBorderGate(model.getBorderGate());
		soapModel.setTravelingArea(model.getTravelingArea());
		soapModel.setDestination(model.getDestination());
		soapModel.setExtendedUntil(model.getExtendedUntil());
		soapModel.setNoticesOfExtension(model.getNoticesOfExtension());
		soapModel.setPurposeOfTheTrip(model.getPurposeOfTheTrip());
		soapModel.setIssuingDispatchNo(model.getIssuingDispatchNo());
		soapModel.setOfficialDispatchNo(model.getOfficialDispatchNo());
		soapModel.setOfficialDispatchDate(model.getOfficialDispatchDate());
		soapModel.setDepartureFrom(model.getDepartureFrom());
		soapModel.setDepartureTo(model.getDepartureTo());
		soapModel.setFromParkingLot(model.getFromParkingLot());
		soapModel.setFromProvinceCode(model.getFromProvinceCode());
		soapModel.setFromProvinceName(model.getFromProvinceName());
		soapModel.setToParkingLot(model.getToParkingLot());
		soapModel.setToProvinceCode(model.getToProvinceCode());
		soapModel.setToProvinceName(model.getToProvinceName());
		soapModel.setDistance(model.getDistance());
		soapModel.setRouteDescription(model.getRouteDescription());
		soapModel.setExpImpGateCode(model.getExpImpGateCode());
		soapModel.setExpImpGate(model.getExpImpGate());
		soapModel.setItemNo(model.getItemNo());
		soapModel.setCircularNo(model.getCircularNo());
		soapModel.setCircularDate(model.getCircularDate());
		soapModel.setNumberOfVehicle(model.getNumberOfVehicle());
		soapModel.setToVNAuthority(model.getToVNAuthority());
		soapModel.setToLAOAuthority(model.getToLAOAuthority());
		soapModel.setAtParkingLot(model.getAtParkingLot());
		soapModel.setAtProvinceName(model.getAtProvinceName());
		soapModel.setNumberOfLot(model.getNumberOfLot());
		soapModel.setApplicantContactName(model.getApplicantContactName());
		soapModel.setPassenger(model.getPassenger());
		soapModel.setCapacity(model.getCapacity());
		soapModel.setPurpose(model.getPurpose());
		soapModel.setRoutes(model.getRoutes());
		soapModel.setGoodsType(model.getGoodsType());
		soapModel.setStops(model.getStops());
		soapModel.setLicenceType(model.getLicenceType());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static ILCertificateSoap[] toSoapModels(ILCertificate[] models) {
		ILCertificateSoap[] soapModels = new ILCertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ILCertificateSoap[][] toSoapModels(ILCertificate[][] models) {
		ILCertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ILCertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ILCertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ILCertificateSoap[] toSoapModels(List<ILCertificate> models) {
		List<ILCertificateSoap> soapModels = new ArrayList<ILCertificateSoap>(models.size());

		for (ILCertificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ILCertificateSoap[soapModels.size()]);
	}

	public ILCertificateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getDossierFileId() {
		return _dossierFileId;
	}

	public void setDossierFileId(long dossierFileId) {
		_dossierFileId = dossierFileId;
	}

	public String getDossierTemplateNo() {
		return _dossierTemplateNo;
	}

	public void setDossierTemplateNo(String dossierTemplateNo) {
		_dossierTemplateNo = dossierTemplateNo;
	}

	public String getDossierPartNo() {
		return _dossierPartNo;
	}

	public void setDossierPartNo(String dossierPartNo) {
		_dossierPartNo = dossierPartNo;
	}

	public String getFileTemplateNo() {
		return _fileTemplateNo;
	}

	public void setFileTemplateNo(String fileTemplateNo) {
		_fileTemplateNo = fileTemplateNo;
	}

	public String getReferenceUid() {
		return _referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		_referenceUid = referenceUid;
	}

	public String getServiceCode() {
		return _serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		_serviceCode = serviceCode;
	}

	public Date getValidFrom() {
		return _validFrom;
	}

	public void setValidFrom(Date validFrom) {
		_validFrom = validFrom;
	}

	public Date getValidUntil() {
		return _validUntil;
	}

	public void setValidUntil(Date validUntil) {
		_validUntil = validUntil;
	}

	public String getTransportOperation() {
		return _transportOperation;
	}

	public void setTransportOperation(String transportOperation) {
		_transportOperation = transportOperation;
	}

	public String getApplicantName() {
		return _applicantName;
	}

	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	public String getApplicantIdNo() {
		return _applicantIdNo;
	}

	public void setApplicantIdNo(String applicantIdNo) {
		_applicantIdNo = applicantIdNo;
	}

	public String getApplicantAddress() {
		return _applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	public String getApplicantTel() {
		return _applicantTel;
	}

	public void setApplicantTel(String applicantTel) {
		_applicantTel = applicantTel;
	}

	public String getApplicantFax() {
		return _applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		_applicantFax = applicantFax;
	}

	public String getApplicantEmail() {
		return _applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		_applicantEmail = applicantEmail;
	}

	public String getApplicantWebsite() {
		return _applicantWebsite;
	}

	public void setApplicantWebsite(String applicantWebsite) {
		_applicantWebsite = applicantWebsite;
	}

	public String getSignName() {
		return _signName;
	}

	public void setSignName(String signName) {
		_signName = signName;
	}

	public String getSignTitle() {
		return _signTitle;
	}

	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public String getLicenceNo() {
		return _licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		_licenceNo = licenceNo;
	}

	public String getLicenceName() {
		return _licenceName;
	}

	public void setLicenceName(String licenceName) {
		_licenceName = licenceName;
	}

	public String getGovAgencyCode() {
		return _govAgencyCode;
	}

	public void setGovAgencyCode(String govAgencyCode) {
		_govAgencyCode = govAgencyCode;
	}

	public String getGovAgencyName() {
		return _govAgencyName;
	}

	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;
	}

	public String getRegistrationNumber() {
		return _registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		_registrationNumber = registrationNumber;
	}

	public String getManufacturedYear() {
		return _manufacturedYear;
	}

	public void setManufacturedYear(String manufacturedYear) {
		_manufacturedYear = manufacturedYear;
	}

	public String getTechnicalData() {
		return _technicalData;
	}

	public void setTechnicalData(String technicalData) {
		_technicalData = technicalData;
	}

	public String getTrademarkCode() {
		return _trademarkCode;
	}

	public void setTrademarkCode(String trademarkCode) {
		_trademarkCode = trademarkCode;
	}

	public String getTrademarkName() {
		return _trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		_trademarkName = trademarkName;
	}

	public String getModel() {
		return _model;
	}

	public void setModel(String model) {
		_model = model;
	}

	public String getVehicleType() {
		return _vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		_vehicleType = vehicleType;
	}

	public String getVehicleColor() {
		return _vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		_vehicleColor = vehicleColor;
	}

	public String getEngineNumber() {
		return _engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;
	}

	public String getChassisNumber() {
		return _chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;
	}

	public Date getExpiredDate() {
		return _expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		_expiredDate = expiredDate;
	}

	public String getBorderGate() {
		return _borderGate;
	}

	public void setBorderGate(String borderGate) {
		_borderGate = borderGate;
	}

	public String getTravelingArea() {
		return _travelingArea;
	}

	public void setTravelingArea(String travelingArea) {
		_travelingArea = travelingArea;
	}

	public String getDestination() {
		return _destination;
	}

	public void setDestination(String destination) {
		_destination = destination;
	}

	public Date getExtendedUntil() {
		return _extendedUntil;
	}

	public void setExtendedUntil(Date extendedUntil) {
		_extendedUntil = extendedUntil;
	}

	public String getNoticesOfExtension() {
		return _noticesOfExtension;
	}

	public void setNoticesOfExtension(String noticesOfExtension) {
		_noticesOfExtension = noticesOfExtension;
	}

	public String getPurposeOfTheTrip() {
		return _purposeOfTheTrip;
	}

	public void setPurposeOfTheTrip(String purposeOfTheTrip) {
		_purposeOfTheTrip = purposeOfTheTrip;
	}

	public String getIssuingDispatchNo() {
		return _issuingDispatchNo;
	}

	public void setIssuingDispatchNo(String issuingDispatchNo) {
		_issuingDispatchNo = issuingDispatchNo;
	}

	public String getOfficialDispatchNo() {
		return _officialDispatchNo;
	}

	public void setOfficialDispatchNo(String officialDispatchNo) {
		_officialDispatchNo = officialDispatchNo;
	}

	public Date getOfficialDispatchDate() {
		return _officialDispatchDate;
	}

	public void setOfficialDispatchDate(Date officialDispatchDate) {
		_officialDispatchDate = officialDispatchDate;
	}

	public String getDepartureFrom() {
		return _departureFrom;
	}

	public void setDepartureFrom(String departureFrom) {
		_departureFrom = departureFrom;
	}

	public String getDepartureTo() {
		return _departureTo;
	}

	public void setDepartureTo(String departureTo) {
		_departureTo = departureTo;
	}

	public String getFromParkingLot() {
		return _fromParkingLot;
	}

	public void setFromParkingLot(String fromParkingLot) {
		_fromParkingLot = fromParkingLot;
	}

	public String getFromProvinceCode() {
		return _fromProvinceCode;
	}

	public void setFromProvinceCode(String fromProvinceCode) {
		_fromProvinceCode = fromProvinceCode;
	}

	public String getFromProvinceName() {
		return _fromProvinceName;
	}

	public void setFromProvinceName(String fromProvinceName) {
		_fromProvinceName = fromProvinceName;
	}

	public String getToParkingLot() {
		return _toParkingLot;
	}

	public void setToParkingLot(String toParkingLot) {
		_toParkingLot = toParkingLot;
	}

	public String getToProvinceCode() {
		return _toProvinceCode;
	}

	public void setToProvinceCode(String toProvinceCode) {
		_toProvinceCode = toProvinceCode;
	}

	public String getToProvinceName() {
		return _toProvinceName;
	}

	public void setToProvinceName(String toProvinceName) {
		_toProvinceName = toProvinceName;
	}

	public String getDistance() {
		return _distance;
	}

	public void setDistance(String distance) {
		_distance = distance;
	}

	public String getRouteDescription() {
		return _routeDescription;
	}

	public void setRouteDescription(String routeDescription) {
		_routeDescription = routeDescription;
	}

	public String getExpImpGateCode() {
		return _expImpGateCode;
	}

	public void setExpImpGateCode(String expImpGateCode) {
		_expImpGateCode = expImpGateCode;
	}

	public String getExpImpGate() {
		return _expImpGate;
	}

	public void setExpImpGate(String expImpGate) {
		_expImpGate = expImpGate;
	}

	public String getItemNo() {
		return _itemNo;
	}

	public void setItemNo(String itemNo) {
		_itemNo = itemNo;
	}

	public String getCircularNo() {
		return _circularNo;
	}

	public void setCircularNo(String circularNo) {
		_circularNo = circularNo;
	}

	public Date getCircularDate() {
		return _circularDate;
	}

	public void setCircularDate(Date circularDate) {
		_circularDate = circularDate;
	}

	public String getNumberOfVehicle() {
		return _numberOfVehicle;
	}

	public void setNumberOfVehicle(String numberOfVehicle) {
		_numberOfVehicle = numberOfVehicle;
	}

	public String getToVNAuthority() {
		return _toVNAuthority;
	}

	public void setToVNAuthority(String toVNAuthority) {
		_toVNAuthority = toVNAuthority;
	}

	public String getToLAOAuthority() {
		return _toLAOAuthority;
	}

	public void setToLAOAuthority(String toLAOAuthority) {
		_toLAOAuthority = toLAOAuthority;
	}

	public String getAtParkingLot() {
		return _atParkingLot;
	}

	public void setAtParkingLot(String atParkingLot) {
		_atParkingLot = atParkingLot;
	}

	public String getAtProvinceName() {
		return _atProvinceName;
	}

	public void setAtProvinceName(String atProvinceName) {
		_atProvinceName = atProvinceName;
	}

	public long getNumberOfLot() {
		return _numberOfLot;
	}

	public void setNumberOfLot(long numberOfLot) {
		_numberOfLot = numberOfLot;
	}

	public String getApplicantContactName() {
		return _applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		_applicantContactName = applicantContactName;
	}

	public String getPassenger() {
		return _passenger;
	}

	public void setPassenger(String passenger) {
		_passenger = passenger;
	}

	public String getCapacity() {
		return _capacity;
	}

	public void setCapacity(String capacity) {
		_capacity = capacity;
	}

	public String getPurpose() {
		return _purpose;
	}

	public void setPurpose(String purpose) {
		_purpose = purpose;
	}

	public String getRoutes() {
		return _routes;
	}

	public void setRoutes(String routes) {
		_routes = routes;
	}

	public String getGoodsType() {
		return _goodsType;
	}

	public void setGoodsType(String goodsType) {
		_goodsType = goodsType;
	}

	public String getStops() {
		return _stops;
	}

	public void setStops(String stops) {
		_stops = stops;
	}

	public String getLicenceType() {
		return _licenceType;
	}

	public void setLicenceType(String licenceType) {
		_licenceType = licenceType;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _dossierId;
	private long _dossierFileId;
	private String _dossierTemplateNo;
	private String _dossierPartNo;
	private String _fileTemplateNo;
	private String _referenceUid;
	private String _serviceCode;
	private Date _validFrom;
	private Date _validUntil;
	private String _transportOperation;
	private String _applicantName;
	private String _applicantIdNo;
	private String _applicantAddress;
	private String _applicantTel;
	private String _applicantFax;
	private String _applicantEmail;
	private String _applicantWebsite;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private String _licenceNo;
	private String _licenceName;
	private String _govAgencyCode;
	private String _govAgencyName;
	private String _registrationNumber;
	private String _manufacturedYear;
	private String _technicalData;
	private String _trademarkCode;
	private String _trademarkName;
	private String _model;
	private String _vehicleType;
	private String _vehicleColor;
	private String _engineNumber;
	private String _chassisNumber;
	private Date _expiredDate;
	private String _borderGate;
	private String _travelingArea;
	private String _destination;
	private Date _extendedUntil;
	private String _noticesOfExtension;
	private String _purposeOfTheTrip;
	private String _issuingDispatchNo;
	private String _officialDispatchNo;
	private Date _officialDispatchDate;
	private String _departureFrom;
	private String _departureTo;
	private String _fromParkingLot;
	private String _fromProvinceCode;
	private String _fromProvinceName;
	private String _toParkingLot;
	private String _toProvinceCode;
	private String _toProvinceName;
	private String _distance;
	private String _routeDescription;
	private String _expImpGateCode;
	private String _expImpGate;
	private String _itemNo;
	private String _circularNo;
	private Date _circularDate;
	private String _numberOfVehicle;
	private String _toVNAuthority;
	private String _toLAOAuthority;
	private String _atParkingLot;
	private String _atProvinceName;
	private long _numberOfLot;
	private String _applicantContactName;
	private String _passenger;
	private String _capacity;
	private String _purpose;
	private String _routes;
	private String _goodsType;
	private String _stops;
	private String _licenceType;
	private Date _syncDate;
}