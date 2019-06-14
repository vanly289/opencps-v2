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

package com.fds.vr.business.service.impl;

import java.util.Date;
import java.util.List;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;

import com.fds.vr.business.action.impl.TransportOperationUtil;
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.ILCertificate;
import com.fds.vr.business.service.base.ILCertificateLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the il certificate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.ILCertificateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see ILCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.ILCertificateLocalServiceUtil
 */
@ProviderType
public class ILCertificateLocalServiceImpl
	extends ILCertificateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.ILCertificateLocalServiceUtil} to access the il certificate local service.
	 */

	private Log _log = LogFactoryUtil.getLog(ILCertificateLocalServiceImpl.class);
	
	public ILCertificate searchByRegNumbber(String keyword) {
		List<ILCertificate> lsCertificates = ilCertificateFinder.searchByRegNumber(keyword, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		if (lsCertificates.size() != 0) {
			return lsCertificates.get(0);
		} else {
			return null;
		}
	}
	
	public List<ILCertificate> searchListByRegistionNumber(String keyword) {
		return ilCertificateFinder.searchByRegNumber(keyword, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

	}
	
	public List<ILCertificate> searchLienVan(String keyword, int start, int end) {
		
		return ilCertificateFinder.searchLienVan(keyword, start, end);

	}
	
	public int countLienVan(String keyword) {
		
		return ilCertificateFinder.countLienVan(keyword);

	}
	
	public List<ILCertificate> searchGiayPhep(String keyword, int start, int end) {
		return ilCertificateFinder.searchGiayPhep(keyword, start, end);
	}
	
	public int countGiayPhep(String keyword) {
		return ilCertificateFinder.countGiayPhep(keyword);
	}
	
	public ILCertificate addCertificate(JSONObject jsonData, Dossier dossier, long dossierFileId,
			String dossierTemplateNo, String dossierPartNo, String fileTemplateNo, String referenceUid, long doanhnghiepid, long vehicleid) {
		
		Date now = new Date();

		long ilCertificateId = counterLocalService.increment(ILCertificate.class.getName());

		ILCertificate object = ilCertificatePersistence.create(ilCertificateId);

		/// Add audit fields
		object.setSyncDate(now);

		String transportOperation = "";
		
		if (Validator.isNotNull(dossier)) {
			transportOperation = TransportOperationUtil.getTransportOperation(jsonData, dossier);
		}
		
		
		String applicantName = String.valueOf(jsonData.get("NameOfCompany"));
		String applicantAddress = String.valueOf(jsonData.get("Address"));
		String applicantTel = String.valueOf(jsonData.get("Tel"));
		String applicantFax = String.valueOf(jsonData.get("Fax"));
		String applicantEmail = String.valueOf(jsonData.get("Email"));
		String applicantWebsite = String.valueOf(jsonData.get("Website"));
		String signName = String.valueOf(jsonData.get("SignName"));
		String signTitle = String.valueOf(jsonData.get("SignTitle"));
		String signPlace = String.valueOf(jsonData.get("SignPlace"));
		String licenceNo = String.valueOf(jsonData.get("LicenceNo"));
		String registrationNumber = String.valueOf(jsonData.get("RegistrationNumber"));
		String manufacturedYear = String.valueOf(jsonData.get("ManufacturedYear"));
		String technicalData = String.valueOf(jsonData.get("TechnicalData"));
		String trademarkCode = String.valueOf(jsonData.get("TrademarkCode"));
		String trademarkName = String.valueOf(jsonData.get("TrademarkName"));
		String model = String.valueOf(jsonData.get("Model"));
		String vehicleType = String.valueOf(jsonData.get("VehicleType"));
		String vehicleColor = String.valueOf(jsonData.get("VehicleColor"));
		String engineNumber = String.valueOf(jsonData.get("EngineNumber"));
		String chassisNumber = String.valueOf(jsonData.get("ChassisNumber"));
		String borderGate = String.valueOf(jsonData.get("BorderGate"));
		String travelingArea = String.valueOf(jsonData.get("TravelingArea"));
		String destination = String.valueOf(jsonData.get("Destination"));
		String noticesOfExtension = String.valueOf(jsonData.get("NoticesOfExtension"));
		String purposeOfTheTrip = String.valueOf(jsonData.get("PurposeOfTheTrip"));
		String issuingDispatchNo = String.valueOf(jsonData.get("IssuingDispatchNo"));
		String officialDispatchNo = String.valueOf(jsonData.get("OfficialDispatchNo"));
		String departureFrom = String.valueOf(jsonData.get("DepartureFrom"));
		String departureTo = String.valueOf(jsonData.get("DepartureTo"));
		String fromParkingLot = String.valueOf(jsonData.get("FromParkingLot"));
		String fromProvinceCode = String.valueOf(jsonData.get("FromProvinceCode"));
		String fromProvinceName = String.valueOf(jsonData.get("FromProvinceName"));
		String toParkingLot = String.valueOf(jsonData.get("ToParkingLot"));
		String toProvinceCode = String.valueOf(jsonData.get("ToProvinceCode"));
		String toProvinceName = String.valueOf(jsonData.get("ToProvinceName"));
		String distance = String.valueOf(jsonData.get("Distance"));
		String routeDescription = String.valueOf(jsonData.get("RouteName"));
		String expImpGateCode = String.valueOf(jsonData.get("ExpImpGateCode"));
		String expImpGate = String.valueOf(jsonData.get("ExpImpGate"));
		String itemNo = String.valueOf(jsonData.get("ItemNo"));
		String circularNo = String.valueOf(jsonData.get("CircularNo"));
		String numberOfVehicle = String.valueOf(jsonData.get("NumberOfVehicle"));
		String toVNAuthority = String.valueOf(jsonData.get("ToVNAuthority"));
		String toLAOAuthority = String.valueOf(jsonData.get("ToLAOAuthority"));
		String atParkingLot = String.valueOf(jsonData.get("AtParkingLot"));
		String atProvinceName = String.valueOf(jsonData.get("AtProvinceName"));
		String applicantContactName = String.valueOf(jsonData.get("ApplicantContactName"));
		String passenger = String.valueOf(jsonData.get("Passenger"));
		String capacity = String.valueOf(jsonData.get("Capacity"));
		String purpose = String.valueOf(jsonData.get("Purpose"));
		String routes = String.valueOf(jsonData.get("Routes"));
		String goodsType = String.valueOf(jsonData.get("GoodsType"));
		String stops = String.valueOf(jsonData.get("Stops"));
		String licenceType = String.valueOf(jsonData.get("LicenceType"));
		String signDate = String.valueOf(jsonData.get("SignDate"));
		
		// Add other fields
		//object.setValidUntil(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ValidUtil")), ConvertFormatDate._NORMAL_DATE));
		
		if (jsonData.has("ValidUntil") && Validator.isNotNull(jsonData.get("ValidUntil"))) {
			object.setValidUntil(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ValidUntil")), ConvertFormatDate._NORMAL_DATE));			
		} else if (jsonData.has("PeriodValidityTo") && Validator.isNotNull(jsonData.get("PeriodValidityTo"))) {
			object.setValidUntil(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("PeriodValidityTo")), ConvertFormatDate._NORMAL_DATE));			
		} 
		
		
		object.setDossierTemplateNo(dossierTemplateNo);
		object.setDossierPartNo(dossierPartNo);
		object.setFileTemplateNo(fileTemplateNo);
		object.setReferenceUid(referenceUid);
		//TODO: transportOperation
		if (Validator.isNotNull(transportOperation)) {
			object.setTransportOperation(transportOperation);
		}
		if (Validator.isNotNull(applicantName)) {
			object.setApplicantName(applicantName);
		} else if (dossier != null) {
			object.setApplicantName(dossier.getApplicantName());
		}
		if (Validator.isNotNull(applicantAddress)) {
			object.setApplicantAddress(applicantAddress);
		}
		if (Validator.isNotNull(applicantTel)) {
			object.setApplicantTel(applicantTel);
		}
		if (Validator.isNotNull(applicantFax)) {
			object.setApplicantFax(applicantFax);
		}
		if (Validator.isNotNull(applicantEmail)) {
			object.setApplicantEmail(applicantEmail);
		}
		if (Validator.isNotNull(applicantWebsite)) {
			object.setApplicantWebsite(applicantWebsite);
		}
		//
		if (Validator.isNotNull(signName)) {
			object.setSignName(signName);
		}
		if (Validator.isNotNull(signTitle)) {
			object.setSignTitle(signTitle);
		}
		if (Validator.isNotNull(signPlace)) {
			object.setSignPlace(signPlace);
		}
		if (Validator.isNotNull(licenceNo)) {
			object.setLicenceNo(licenceNo);
		}
		if (Validator.isNotNull(registrationNumber)) {
			object.setRegistrationNumber(registrationNumber);
		}
		if (Validator.isNotNull(manufacturedYear)) {
			object.setManufacturedYear(manufacturedYear);
		}
		if (Validator.isNotNull(technicalData)) {
			object.setTechnicalData(technicalData);
		}
		if (Validator.isNotNull(trademarkCode)) {
			object.setTrademarkCode(trademarkCode);
		}
		if (Validator.isNotNull(trademarkName)) {
			object.setTrademarkName(trademarkName);
		}
		if (Validator.isNotNull(model)) {
			object.setModel(model);
		}
		if (Validator.isNotNull(vehicleType)) {
			object.setVehicleType(vehicleType);
		}
		if (Validator.isNotNull(vehicleColor)) {
			object.setVehicleColor(vehicleColor);
		}
		if (Validator.isNotNull(engineNumber)) {
			object.setEngineNumber(engineNumber);
		}
		if (Validator.isNotNull(chassisNumber)) {
			object.setChassisNumber(chassisNumber);
		}
		if (Validator.isNotNull(borderGate)) {
			object.setBorderGate(borderGate);
		}
		if (Validator.isNotNull(travelingArea)) {
			object.setTravelingArea(travelingArea);
		}
		if (Validator.isNotNull(destination)) {
			object.setDestination(destination);
		}
		if (Validator.isNotNull(noticesOfExtension)) {
			object.setNoticesOfExtension(noticesOfExtension);
		}
		//TODO: purposeOfTheTrip
		if (Validator.isNotNull(purposeOfTheTrip)) {
			object.setPurposeOfTheTrip(purposeOfTheTrip);
		}
		if (Validator.isNotNull(issuingDispatchNo)) {
			object.setIssuingDispatchNo(issuingDispatchNo);
		}
		if (Validator.isNotNull(officialDispatchNo)) {
			object.setOfficialDispatchNo(officialDispatchNo);
		}
		if (Validator.isNotNull(departureFrom)) {
			object.setDepartureFrom(departureFrom);
		}
		if (Validator.isNotNull(departureTo)) {
			object.setDepartureTo(departureTo);
		}
		if (Validator.isNotNull(fromParkingLot)) {
			object.setFromParkingLot(fromParkingLot);
		}
		if (Validator.isNotNull(fromProvinceCode)) {
			object.setFromProvinceCode(fromProvinceCode);
		}
		if (Validator.isNotNull(fromProvinceName)) {
			object.setFromProvinceName(fromProvinceName);
		}
		if (Validator.isNotNull(toParkingLot)) {
			object.setToParkingLot(toParkingLot);
		}
		if (Validator.isNotNull(toProvinceCode)) {
			object.setToProvinceCode(toProvinceCode);
		}
		if (Validator.isNotNull(toProvinceName)) {
			object.setToProvinceName(toProvinceName);
		}
		if (Validator.isNotNull(distance)) {
			object.setDistance(distance);
		}
		if (Validator.isNotNull(routeDescription)) {
			object.setRouteDescription(routeDescription);
		}
		if (Validator.isNotNull(expImpGateCode)) {
			object.setExpImpGateCode(expImpGateCode);
		}
		if (Validator.isNotNull(expImpGate)) {
			object.setExpImpGate(expImpGate);
		}
		if (Validator.isNotNull(itemNo)) {
			object.setItemNo(itemNo);
		}
		if (Validator.isNotNull(circularNo)) {
			object.setCircularNo(circularNo);
		}
		if (Validator.isNotNull(numberOfVehicle)) {
			object.setNumberOfVehicle(numberOfVehicle);
		}
		if (Validator.isNotNull(toVNAuthority)) {
			object.setToVNAuthority(toVNAuthority);
		}
		if (Validator.isNotNull(toLAOAuthority)) {
			object.setToLAOAuthority(toLAOAuthority);
		}
		if (Validator.isNotNull(atParkingLot)) {
			object.setAtParkingLot(atParkingLot);
		}
		if (Validator.isNotNull(atProvinceName)) {
			object.setAtProvinceName(atProvinceName);
		}
		if (Validator.isNotNull(applicantContactName)) {
			object.setApplicantContactName(applicantContactName);
		}
		if (Validator.isNotNull(passenger)) {
			object.setPassenger(passenger);
		}
		if (Validator.isNotNull(capacity)) {
			object.setCapacity(capacity);
		}
		if (Validator.isNotNull(purpose)) {
			object.setPurpose(purpose);
		}
		if (Validator.isNotNull(routes)) {
			object.setRoutes(routes);
		}
		if (Validator.isNotNull(goodsType)) {
			object.setGoodsType(goodsType);
		}
		if (Validator.isNotNull(stops)) {
			object.setStops(stops);
		}
		if (Validator.isNotNull(licenceType)) {
			object.setLicenceType(licenceType);
		}
		
		if (dossier != null) {
			object.setDossierId(dossier.getDossierId());
			object.setServiceCode(dossier.getServiceCode());
			object.setGovAgencyCode(dossier.getGovAgencyCode());
			object.setGovAgencyName(dossier.getGovAgencyName());
			object.setApplicantIdNo(dossier.getApplicantIdNo());
		}
		
		DossierFile dossierFile = DossierFileLocalServiceUtil.fetchDossierFile(dossierFileId);
		
		object.setDossierFileId(dossierFileId);
		if (dossierFile != null) {
			object.setLicenceName(dossierFile.getDisplayName());
		}
		object.setSignDate(ConvertFormatDate.parseStringToDate(signDate));
		object.setExpiredDate(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ExpiredDate"))));
		if (jsonData.has("ValidFrom") && Validator.isNotNull(jsonData.get("ValidFrom"))) {
			object.setValidFrom(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ValidFrom")), ConvertFormatDate._NORMAL_DATE));			
		} else if (jsonData.has("PeriodValidityFrom") && Validator.isNotNull(jsonData.get("PeriodValidityFrom"))) {
			object.setValidFrom(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("PeriodValidityFrom")), ConvertFormatDate._NORMAL_DATE));			
		} else if (jsonData.has("FirstRegistrationDate") && Validator.isNotNull(jsonData.get("FirstRegistrationDate"))) {
			object.setValidFrom(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("FirstRegistrationDate")), ConvertFormatDate._NORMAL_DATE));			
		}

		object.setExtendedUntil(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ExtendedUntil"))));
		object.setOfficialDispatchDate(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("OfficialDispatchDate"))));
		object.setCircularDate(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("CircularDate"))));
		object.setNumberOfLot(GetterUtil.getLong(String.valueOf(jsonData.get("NumberOfLot"))));
		
		//add new
		
		object.setToTQAuthority(jsonData.getString("ToTQAuthority"));
		object.setFirstRegistrationDate(ConvertFormatDate.parseStringToDate(jsonData.getString("FirstRegistrationDate")));
		object.setIssuedDate(ConvertFormatDate.parseStringToDate(jsonData.getString("IssuedDate")));
		object.setIsFixedRoadTransport(jsonData.getString("IsFixedRoadTransport"));
		object.setIsPassengerTaxi(jsonData.getString("IsPassengerTaxi"));
		object.setIsCargoTransport(jsonData.getString("IsCargoTransport"));
		object.setIsPassengerTransport(jsonData.getString("IsPassengerTransport"));
		object.setIsContractRoadTransport(jsonData.getString("IsContractRoadTransport"));
		object.setFromParkingLotCode(jsonData.getString("FromParkingLotCode"));
		object.setToParkingLotCode(jsonData.getString("ToParkingLotCode"));
		object.setRouteCode(jsonData.getString("RouteCode"));
		object.setRouteName(jsonData.getString("RouteName"));
		object.setFromBorderGate(jsonData.getString("FromBorderGate"));
		object.setToBorderGate(jsonData.getString("ToBorderGate"));
		object.setVehicleOwner(jsonData.getString("VehicleOwner"));
		object.setVehicleOwnerAddress(jsonData.getString("VehicleOwnerAddress"));
		object.setVehicleOwnerTel(jsonData.getString("VehicleOwnerTel"));
		object.setVehicleOwnerFax(jsonData.getString("VehicleOwnerFax"));
		object.setOtherRemarks(jsonData.getString("OtherRemarks"));
		object.setDossierNo(jsonData.getString("DossierNo"));
		object.setPhuongtienid(vehicleid);
		object.setDoanhnghiepid(doanhnghiepid);
		
		return ilCertificatePersistence.update(object);
	}

	
	public ILCertificate updateCertificate(JSONObject jsonData, long dossierFileId) {
		
		Date now = new Date();

//		_log.info("dossierFileId111: "+dossierFileId);
		ILCertificate object = ilCertificatePersistence.fetchByF_DFILE_ID(dossierFileId);
//		_log.info("object: "+object);
		try{

		/// Add audit fields
		object.setSyncDate(now);
//		_log.info("Vao KHONG syncDateList:"+object.getSyncDate());

		String transportOperation = String.valueOf(jsonData.get("TransportOperation"));
		String applicantName = String.valueOf(jsonData.get("NameOfCompany"));
		String applicantAddress = String.valueOf(jsonData.get("Address"));
		String applicantTel = String.valueOf(jsonData.get("Tel"));
		String applicantFax = String.valueOf(jsonData.get("Fax"));
		String applicantEmail = String.valueOf(jsonData.get("Email"));
		String applicantWebsite = String.valueOf(jsonData.get("Website"));
		String signName = String.valueOf(jsonData.get("SignName"));
		String signTitle = String.valueOf(jsonData.get("SignTitle"));
		String signPlace = String.valueOf(jsonData.get("SignPlace"));
		String licenceNo = String.valueOf(jsonData.get("LicenceNo"));
		String registrationNumber = String.valueOf(jsonData.get("RegistrationNumber"));
		String manufacturedYear = String.valueOf(jsonData.get("ManufacturedYear"));
		String technicalData = String.valueOf(jsonData.get("TechnicalData"));
		String trademarkCode = String.valueOf(jsonData.get("TrademarkCode"));
		String trademarkName = String.valueOf(jsonData.get("TrademarkName"));
		String model = String.valueOf(jsonData.get("Model"));
		String vehicleType = String.valueOf(jsonData.get("VehicleType"));
		String vehicleColor = String.valueOf(jsonData.get("VehicleColor"));
		String engineNumber = String.valueOf(jsonData.get("EngineNumber"));
		String chassisNumber = String.valueOf(jsonData.get("ChassisNumber"));
		String borderGate = String.valueOf(jsonData.get("BorderGate"));
		String travelingArea = String.valueOf(jsonData.get("TravelingArea"));
		String destination = String.valueOf(jsonData.get("Destination"));
		String noticesOfExtension = String.valueOf(jsonData.get("NoticesOfExtension"));
		String purposeOfTheTrip = String.valueOf(jsonData.get("PurposeOfTheTrip"));
		String issuingDispatchNo = String.valueOf(jsonData.get("IssuingDispatchNo"));
		String officialDispatchNo = String.valueOf(jsonData.get("OfficialDispatchNo"));
		String departureFrom = String.valueOf(jsonData.get("DepartureFrom"));
		String departureTo = String.valueOf(jsonData.get("DepartureTo"));
		String fromParkingLot = String.valueOf(jsonData.get("FromParkingLot"));
		String fromProvinceCode = String.valueOf(jsonData.get("FromProvinceCode"));
		String fromProvinceName = String.valueOf(jsonData.get("FromProvinceName"));
		String toParkingLot = String.valueOf(jsonData.get("ToParkingLot"));
		String toProvinceCode = String.valueOf(jsonData.get("ToProvinceCode"));
		String toProvinceName = String.valueOf(jsonData.get("ToProvinceName"));
		String distance = String.valueOf(jsonData.get("Distance"));
		String routeDescription = String.valueOf(jsonData.get("RouteDescription"));
		String expImpGateCode = String.valueOf(jsonData.get("ExpImpGateCode"));
		String expImpGate = String.valueOf(jsonData.get("ExpImpGate"));
		String itemNo = String.valueOf(jsonData.get("ItemNo"));
		String circularNo = String.valueOf(jsonData.get("CircularNo"));
		String numberOfVehicle = String.valueOf(jsonData.get("NumberOfVehicle"));
		String toVNAuthority = String.valueOf(jsonData.get("ToVNAuthority"));
		String toLAOAuthority = String.valueOf(jsonData.get("ToLAOAuthority"));
		String atParkingLot = String.valueOf(jsonData.get("AtParkingLot"));
		String atProvinceName = String.valueOf(jsonData.get("AtProvinceName"));
		String applicantContactName = String.valueOf(jsonData.get("ApplicantContactName"));
		String passenger = String.valueOf(jsonData.get("Passenger"));
		String capacity = String.valueOf(jsonData.get("Capacity"));
		String purpose = String.valueOf(jsonData.get("Purpose"));
		String routes = String.valueOf(jsonData.get("Routes"));
		String goodsType = String.valueOf(jsonData.get("GoodsType"));
		String stops = String.valueOf(jsonData.get("Stops"));
		String licenceType = String.valueOf(jsonData.get("LicenceType"));

		// Add other fields
		if (jsonData.has("ValidUntil") && Validator.isNotNull(jsonData.get("ValidUntil"))) {
			object.setValidUntil(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ValidUntil")), ConvertFormatDate._NORMAL_DATE));			
		} else if (jsonData.has("PeriodValidityTo") && Validator.isNotNull(jsonData.get("PeriodValidityTo"))) {
			object.setValidUntil(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("PeriodValidityTo")), ConvertFormatDate._NORMAL_DATE));			
		} 
		
		if (Validator.isNotNull(transportOperation)) {
			object.setTransportOperation(transportOperation);
		}
		if (Validator.isNotNull(applicantName)) {
			object.setApplicantName(applicantName);
		}
		if (Validator.isNotNull(applicantAddress)) {
			object.setApplicantAddress(applicantAddress);
		}
		if (Validator.isNotNull(applicantTel)) {
			object.setApplicantTel(applicantTel);
		}
		if (Validator.isNotNull(applicantFax)) {
			object.setApplicantFax(applicantFax);
		}
		if (Validator.isNotNull(applicantEmail)) {
			object.setApplicantEmail(applicantEmail);
		}
		if (Validator.isNotNull(applicantWebsite)) {
			object.setApplicantWebsite(applicantWebsite);
		}
		if (Validator.isNotNull(signName)) {
			object.setSignName(signName);
		}
		if (Validator.isNotNull(signTitle)) {
			object.setSignTitle(signTitle);
		}
		if (Validator.isNotNull(signPlace)) {
			object.setSignPlace(signPlace);
		}
		if (Validator.isNotNull(licenceNo)) {
			object.setLicenceNo(licenceNo);
		}
		if (Validator.isNotNull(registrationNumber)) {
			object.setRegistrationNumber(registrationNumber);
		}
		if (Validator.isNotNull(manufacturedYear)) {
			object.setManufacturedYear(manufacturedYear);
		}
		if (Validator.isNotNull(technicalData)) {
			object.setTechnicalData(technicalData);
		}
		if (Validator.isNotNull(trademarkCode)) {
			object.setTrademarkCode(trademarkCode);
		}
		if (Validator.isNotNull(trademarkName)) {
			object.setTrademarkName(trademarkName);
		}
		if (Validator.isNotNull(model)) {
			object.setModel(model);
		}
		if (Validator.isNotNull(vehicleType)) {
			object.setVehicleType(vehicleType);
		}
		if (Validator.isNotNull(vehicleColor)) {
			object.setVehicleColor(vehicleColor);
		}
		if (Validator.isNotNull(engineNumber)) {
			object.setEngineNumber(engineNumber);
		}
		if (Validator.isNotNull(chassisNumber)) {
			object.setChassisNumber(chassisNumber);
		}
		if (Validator.isNotNull(borderGate)) {
			object.setBorderGate(borderGate);
		}
		if (Validator.isNotNull(travelingArea)) {
			object.setTravelingArea(travelingArea);
		}
		if (Validator.isNotNull(destination)) {
			object.setDestination(destination);
		}
		if (Validator.isNotNull(noticesOfExtension)) {
			object.setNoticesOfExtension(noticesOfExtension);
		}
		if (Validator.isNotNull(purposeOfTheTrip)) {
			object.setPurposeOfTheTrip(purposeOfTheTrip);
		}
		if (Validator.isNotNull(issuingDispatchNo)) {
			object.setIssuingDispatchNo(issuingDispatchNo);
		}
		if (Validator.isNotNull(officialDispatchNo)) {
			object.setOfficialDispatchNo(officialDispatchNo);
		}
		if (Validator.isNotNull(departureFrom)) {
			object.setDepartureFrom(departureFrom);
		}
		if (Validator.isNotNull(departureTo)) {
			object.setDepartureTo(departureTo);
		}
		if (Validator.isNotNull(fromParkingLot)) {
			object.setFromParkingLot(fromParkingLot);
		}
		if (Validator.isNotNull(fromProvinceCode)) {
			object.setFromProvinceCode(fromProvinceCode);
		}
		if (Validator.isNotNull(fromProvinceName)) {
			object.setFromProvinceName(fromProvinceName);
		}
		if (Validator.isNotNull(toParkingLot)) {
			object.setToParkingLot(toParkingLot);
		}
		if (Validator.isNotNull(toProvinceCode)) {
			object.setToProvinceCode(toProvinceCode);
		}
		if (Validator.isNotNull(toProvinceName)) {
			object.setToProvinceName(toProvinceName);
		}
		if (Validator.isNotNull(distance)) {
			object.setDistance(distance);
		}
		if (Validator.isNotNull(routeDescription)) {
			object.setRouteDescription(routeDescription);
		}
		if (Validator.isNotNull(expImpGateCode)) {
			object.setExpImpGateCode(expImpGateCode);
		}
		if (Validator.isNotNull(expImpGate)) {
			object.setExpImpGate(expImpGate);
		}
		if (Validator.isNotNull(itemNo)) {
			object.setItemNo(itemNo);
		}
		if (Validator.isNotNull(circularNo)) {
			object.setCircularNo(circularNo);
		}
		if (Validator.isNotNull(numberOfVehicle)) {
			object.setNumberOfVehicle(numberOfVehicle);
		}
		if (Validator.isNotNull(toVNAuthority)) {
			object.setToVNAuthority(toVNAuthority);
		}
		if (Validator.isNotNull(toLAOAuthority)) {
			object.setToLAOAuthority(toLAOAuthority);
		}
		if (Validator.isNotNull(atParkingLot)) {
			object.setAtParkingLot(atParkingLot);
		}
		if (Validator.isNotNull(atProvinceName)) {
			object.setAtProvinceName(atProvinceName);
		}
		if (Validator.isNotNull(applicantContactName)) {
			object.setApplicantContactName(applicantContactName);
		}
		if (Validator.isNotNull(passenger)) {
			object.setPassenger(passenger);
		}
		if (Validator.isNotNull(capacity)) {
			object.setCapacity(capacity);
		}
		if (Validator.isNotNull(purpose)) {
			object.setPurpose(purpose);
		}
		if (Validator.isNotNull(routes)) {
			object.setRoutes(routes);
		}
		if (Validator.isNotNull(goodsType)) {
			object.setGoodsType(goodsType);
		}
		if (Validator.isNotNull(stops)) {
			object.setStops(stops);
		}
		if (Validator.isNotNull(licenceType)) {
			object.setLicenceType(licenceType);
		}
		
		DossierFile dossierFile = DossierFileLocalServiceUtil.fetchDossierFile(dossierFileId);
		
		if (dossierFile != null) {
			object.setLicenceName(dossierFile.getDisplayName());
		}
		
		object.setDossierFileId(dossierFileId);
		object.setSignDate(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("SignDate"))));
		object.setExpiredDate(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ExpiredDate"))));
		if (jsonData.has("ValidFrom") && Validator.isNotNull(jsonData.get("ValidFrom"))) {
			object.setValidFrom(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ValidFrom")), ConvertFormatDate._NORMAL_DATE));			
		} else if (jsonData.has("PeriodValidityFrom") && Validator.isNotNull(jsonData.get("PeriodValidityFrom"))) {
			object.setValidFrom(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("PeriodValidityFrom")), ConvertFormatDate._NORMAL_DATE));			
		} else if (jsonData.has("FirstRegistrationDate") && Validator.isNotNull(jsonData.get("FirstRegistrationDate"))) {
			object.setValidFrom(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("FirstRegistrationDate")), ConvertFormatDate._NORMAL_DATE));			
		}

		if (jsonData.has("SignDate") && Validator.isNotNull(jsonData.get("SignDate"))) {
			object.setValidFrom(ConvertFormatDate.parseStringToDate(jsonData.getString("SignDate"), ConvertFormatDate._NORMAL_DATE));
		}
		object.setExtendedUntil(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("ExtendedUntil"))));
		object.setOfficialDispatchDate(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("OfficialDispatchDate"))));
		object.setCircularDate(ConvertFormatDate.parseStringToDate(String.valueOf(jsonData.get("CircularDate"))));
		object.setNumberOfLot(GetterUtil.getLong(String.valueOf(jsonData.get("NumberOfLot"))));
		} catch(Exception e) {
			_log.info("ERROR: "+e);
		}
		return ilCertificatePersistence.update(object);
	}

	public List<ILCertificate> getAllCertificate() {
		return ilCertificatePersistence.findAll();
	}

	public List<ILCertificate> getDocAcceptList(String keywords, String serviceCode, String govAgencyCode,
			String routeCode, String fromDate, String toDate, int start, int limit) {

		return ilCertificateFinder.findILCertificateByServiceCode(keywords, serviceCode, govAgencyCode, routeCode,
				fromDate, toDate, start, limit);
	}

	public long countDocAcceptList(String keywords, String serviceCode, String govAgencyCode,
			String routeCode, String fromDate, String toDate) {

		return ilCertificateFinder.countILCertificateByServiceCode(keywords, serviceCode, govAgencyCode, routeCode,
				fromDate, toDate);
	}

	public List<ILCertificate> getCertByValidFrom(String serviceCode, String applicant, String regSearch) {
		return ilCertificatePersistence.findByF_APP_REG(serviceCode, applicant, regSearch);
	}

	public List<ILCertificate> getByApplicant(String serviceCode, String applicant) {

		return ilCertificateFinder.findILCertificateByApplicant(serviceCode, applicant);
	}

	public long countByApplicant(String serviceCode, String applicant) {

		return ilCertificateFinder.countILCertificateByApplicant(serviceCode, applicant);
	}
	
	public ILCertificate fetchByLicenceNo(String licenceNo) throws PortalException {
		return ilCertificatePersistence.fetchByF_LICENCENO(licenceNo);
	}
	
	public ILCertificate fetchByDossierFileId(long dossierFileId) {
		return ilCertificatePersistence.fetchByF_DFILE_ID(dossierFileId);
	}
	
	public int countByDossierFileId(long dossierFileId) {
		return ilCertificatePersistence.countByF_DFILE_ID(dossierFileId);
	}
	
	public int countByServiceCode(String govAgencyCode, String[] serviceCodes, Date fromDate, Date toDate) {
		return ilCertificateFinder.countByServiceCode(govAgencyCode, serviceCodes, fromDate, toDate);
	}
}