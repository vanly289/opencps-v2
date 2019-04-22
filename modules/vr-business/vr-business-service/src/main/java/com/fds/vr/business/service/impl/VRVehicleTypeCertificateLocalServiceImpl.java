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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.fds.vr.business.model.Dossier;
import com.fds.vr.business.model.DossierFile;
import com.fds.vr.business.model.Registration;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.DossierImpl;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateImpl;
import com.fds.vr.business.service.DossierLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
import com.fds.vr.business.service.base.VRVehicleTypeCertificateLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr vehicle type certificate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRVehicleTypeCertificateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author LamTV
 * @see VRVehicleTypeCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil
 */
@ProviderType
public class VRVehicleTypeCertificateLocalServiceImpl
	extends VRVehicleTypeCertificateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil} to access the vr vehicle type certificate local service.
	 */

	private Log _log = LogFactoryUtil.getLog(VRVehicleTypeCertificateLocalServiceImpl.class);
	private final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private final String PATTERN_DATE_3 = "dd/MM/yyyy";

	public VRVehicleTypeCertificate updateVehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile) {
		
		Date now = new Date();

		long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());

		VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		//VRVehicleTypeCertificateLocalServiceUtil.
		/// Add audit fields
		object.setSyncDate(now);
		_log.info("Vao KHONG syncDateList:"+object.getSyncDate());

		// Add other fields
		object.setMtCore(1);
		if (dossierFile != null) {
			object.setDossierId(dossierFile.getDossierId());
		}
		object.setDossierType(mapValues.get("bien_ban@hinh_thuc_cap_giay"));
		object.setDossierNo(mapValues.get("so_ho_so"));
		object.setConvertassembleId(0);
		if (registration != null) {
			object.setApplicantIdNo(registration.getApplicantIdNo());
			object.setApplicantIdDate(registration.getApplicantIdDate());
			object.setApplicantName(registration.getApplicantName());
		}
		
		object.setApplicantAddress(mapValues.get(""));
		object.setApplicantRepresentative(mapValues.get(""));
		object.setApplicantRepresentativeTitle(mapValues.get(""));
		object.setApplicantEmail(mapValues.get(""));
		object.setApplicantPhone(mapValues.get(""));
		object.setApplicantFax(mapValues.get(""));
		object.setApplicantContactName(mapValues.get(""));
		object.setApplicantContactEmail(mapValues.get(""));
		object.setApplicantcontactPhone(mapValues.get(""));
		object.setManufacturerForeignCode(mapValues.get(""));
		
		object.setManufacturerName(mapValues.get("bien_ban@bb_XCG01001"));
		object.setManufacturerAddress(mapValues.get("bien_ban@bb_XCG01002"));		
		object.setManufacturerRepresentative(mapValues.get(""));
		object.setManufacturerRepresentativeTitle(mapValues.get(""));
		object.setManufacturerEmail(mapValues.get(""));
		object.setManufacturerPhone(mapValues.get(""));
		object.setManufacturerFax(mapValues.get(""));
		object.setProductionPlantCode(mapValues.get(""));
		object.setProductionPlantName(mapValues.get(""));
		object.setProductionPlantAddress(mapValues.get(""));
		object.setProductionPlantRepresentative(mapValues.get(""));
		object.setProductionPlantRepresentativeTitle(mapValues.get(""));
		object.setCopReportNo(mapValues.get(""));
		object.setCopReportDate(now);
		object.setCopReportExpireDate(now);

		object.setDesignerCode(registration.getApplicantIdNo().toString());
		object.setDesignerName(mapValues.get("bien_ban@bb_ten_co_so_thiet_ke"));
		object.setDesignerAddress(mapValues.get("bien_ban@bb_dia_chi_co_so_thiet_ke"));
		object.setDesignerRepresentative(mapValues.get("bien_ban@bb_XCG01003"));
		object.setDesignerRepresentativeTitle(mapValues.get(""));
		
		object.setDesignerEmail(mapValues.get("bien_ban@bb_XCG01006"));
		object.setDesignerPhone(mapValues.get("bien_ban@bb_XCG01005"));
		object.setDesignerFax(mapValues.get(""));
		object.setVerificationCertificateNo(mapValues.get("chung_chi@so_bien_ban"));
		object.setVerificationCertificateDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_tham_dinh")));
		object.setVerificationRefNo(mapValues.get("bien_ban@bb_XCG01020"));
		object.setVerificationRefDate(now);
		object.setTypeApprovalCertificateNo(mapValues.get(""));
		object.setTypeApprovalCertificateDate(now);
		object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
		object.setDesignModelDescription(mapValues.get("bien_ban@loai_hinh_thiet_ke_text"));
		object.setDesignSymbol(mapValues.get("bien_ban@bb_XCG01026"));
		
		object.setRegisteredNumber(mapValues.get(""));
		object.setInspectorReceiveDate(now);
		object.setInspectorSubmitDate(now);
		object.setInspectorendorSementDate(now);
		object.setInspectorDeadline(now);
		object.setInspectorFinishDate(now);
		object.setInspectorCancelDate(now);
		object.setInspectorOrganization(mapValues.get(""));
		object.setInspectorDivision(mapValues.get(""));
		object.setInspectorSignName(mapValues.get(""));
		object.setInspectorSignTitle(mapValues.get(""));
		object.setInspectorSignPlace(mapValues.get(""));
		object.setCertificateType(mapValues.get("de_xuat_cap_chung_chi"));
		object.setReferenceCertificateNo(mapValues.get("bien_ban@XCG01022"));
		object.setReferenceCertificateDate(now);
		object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
		object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
		object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
		object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
		object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
		object.setCertificateRecordExpireDate(now);
		object.setExpiredStatus("1");
		object.setCertificateRecordStatus("3");
		object.setDigitalIssueStatus("1");
		object.setVehicleClass(mapValues.get(""));
		object.setCertifiedVehicleType(mapValues.get("chung_chi@bb_XCG01050"));
		object.setCertifiedVehicleTypeDescription(mapValues.get("chung_chi@bb_XCG01050_text"));
		object.setCertifiedTrademark(mapValues.get("chung_chi@bb_XCG01051"));
		object.setCertifiedTrademarkName(mapValues.get("chung_chi@bb_XCG01051_text"));
		object.setCertifiedCommercialName(mapValues.get("chung_chi@bb_XCG01052"));
		object.setCertifiedModelCode(mapValues.get("chung_chi@bb_XCG01052"));
		object.setCertifiedAssemblyType(mapValues.get(""));
		object.setCertifiedAssemblyTypeDescription(mapValues.get(""));
		object.setCertifiedVINNo(mapValues.get(""));
		object.setCertifiedVINPosition(mapValues.get(""));
		object.setCertifiedFrameNo(mapValues.get(""));
		object.setCertifiedFrameAttachPlace(mapValues.get(""));
		object.setCertifiedFramePosition(mapValues.get(""));
		object.setCertifiedEngineNo(mapValues.get(""));
		object.setCertifiedEngineAttachPlace(mapValues.get(""));
		object.setCertifiedEnginePosition(mapValues.get(""));
		object.setSafetyTestReportNo(mapValues.get(""));
		object.setSafetyTestReportDate(now);
		object.setEmissionTestReportNo(mapValues.get(""));
		object.setEmissionTestReportDate(now);
		object.setCommonSafetyStandard(mapValues.get(""));
		object.setEmissionStandard(mapValues.get(""));
		object.setOtherTestReportNo(mapValues.get(""));
		object.setOtherTestReportDate(now);
		object.setSampleFrameNo(mapValues.get(""));
		object.setSampleVINNo(mapValues.get(""));
		object.setSampleEngineNo(mapValues.get(""));
		object.setSampleVehicleType(mapValues.get(""));
		object.setSampleVehicleTypeDescription(mapValues.get(""));
		object.setSampleTrademark(mapValues.get(""));
		object.setSampleTrademarkName(mapValues.get(""));
		object.setSampleCommercialName(mapValues.get(""));
		object.setSampleModelCode(mapValues.get(""));
		object.setCustomsDeclarationNo(mapValues.get(""));
		object.setCustomsDeclarationDate(now);
		object.setProductionCountry(mapValues.get(""));
		object.setImporterQuantity(Long.valueOf(mapValues.get("")));
		object.setInspectionRecordNo(mapValues.get(""));
		object.setInspectionDate(now);
		object.setInspectionSite(mapValues.get(""));
		object.setInspectionDistrictCode(mapValues.get(""));
		object.setInspectionDistrictName(mapValues.get(""));
		object.setInspectionProvinceCode(mapValues.get(""));
		object.setInspectionProvinceName(mapValues.get(""));
		object.setCorporationId(mapValues.get(""));
		object.setInspectorId(Long.valueOf(mapValues.get("")));
		object.setRemarks(mapValues.get(""));
		object.setInspectionNote(mapValues.get(""));
		object.setCertificateNote(mapValues.get(""));
		object.setModule(mapValues.get(""));
		object.setModifyDate(modifiedDate);

		return vrVehicleTypeCertificatePersistence.update(object);
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTTTKXCG_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date applicantIdDate, VRApplicantProfile appProfile, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();	
			boolean flagUpdate = true;
				
			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List <VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0 ) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0)) && lsVRVehicleTypeCertificate.get(0).getModule().contains("01")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);				
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("bien_ban@bb_XCG01013"));
				object.setApplicantContactEmail(mapValues.get("bien_ban@bb_XCG01012"));
				object.setApplicantcontactPhone(mapValues.get("bien_ban@bb_XCG01014"));
				object.setCityCode(appProfile.getApplicantCity());
				
			} else {
				return object;
			}
			Dossier objDossier = new DossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier  = DossierLocalServiceUtil.fetchDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@hinh_thuc_cap_giay"));
			
			object.setConvertassembleId(0);
			
			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());			
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}
			
			// Khong ap dung voi Tham dinh thiet ke
			/*object.setManufacturerForeignCode(mapValues.get(""));
			object.setManufacturerName(mapValues.get(""));
			object.setManufacturerAddress(mapValues.get(""));
			object.setManufacturerRepresentative(mapValues.get(""));
			object.setManufacturerRepresentativeTitle(mapValues.get(""));
			object.setManufacturerEmail(mapValues.get(""));
			object.setManufacturerPhone(mapValues.get(""));
			object.setManufacturerFax(mapValues.get(""));
			
			object.setCopReportNo(mapValues.get(""));
			object.setCopReportDate(null);
			object.setCopReportExpireDate(null);*/
			
			String productionPlantCode = mapValues.get("bien_ban@bb_XCG01007");
			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {				
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode) ;
				// fake
				List <VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0 ) {
					objVRProductionPlant = lstVRProductionPlant.get(0);				
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant) && objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCG01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01010"));

			}

			object.setDesignerCode(mapValues.get("ma_so_doanh_nghiep"));
			object.setDesignerName(Validator.isNotNull(mapValues.get("bien_ban@bb_ten_co_so_thiet_ke")) ? mapValues.get("bien_ban@bb_ten_co_so_thiet_ke") : appProfile.getApplicantName());
			object.setDesignerAddress(Validator.isNotNull(mapValues.get("bien_ban@bb_dia_chi_co_so_thiet_ke")) ? mapValues.get("bien_ban@bb_dia_chi_co_so_thiet_ke") : appProfile.getApplicantAddress());
			object.setDesignerRepresentative(mapValues.get("bien_ban@bb_XCG01003"));
			object.setDesignerRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01004")); // Chua xuat hien trong data bien ban
			
			object.setDesignerEmail(mapValues.get("bien_ban@bb_XCG01006"));
			object.setDesignerPhone(mapValues.get("bien_ban@bb_XCG01005")); // Chua xuat hien trong data bien ban
			object.setDesignerFax(mapValues.get(""));
			try {
				object.setVerificationCertificateNo(mapValues.get("so_chung_chi"));
				
				if (Validator.isNotNull(mapValues.get("ngay_ky_cc"))) {
					object.setVerificationCertificateDate(parseStringToDate(mapValues.get("ngay_ky_cc")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			
			
			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban")); 
				SimpleDateFormat formatDateShort = new SimpleDateFormat("dd/MM/yyyy"); 
				Date setDate = formatDateShort.parse(mapValues.get("chung_chi@ngay_ket_thuc_tham_dinh")); 
				object.setVerificationRefDate(setDate); 
			} catch (Exception e) {
				_log.debug(e);
			}
			
			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@XCG01020")); // Chua xuat hien trong data bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@XCG01021"))) { // Chua xuat hien trong data bien ban
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@XCG01021")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			object.setDesignModelDescription(mapValues.get("bien_ban@loai_hinh_thiet_ke_text"));
			object.setDesignSymbol(mapValues.get("bien_ban@bb_XCG01026"));
			
			// Khong ap dung voi Tham dinh thiet ke
			/*object.setTypeApprovalCertificateNo(mapValues.get(""));
			object.setTypeApprovalCertificateDate(now);
			object.setInspectorReceiveDate(now);
			object.setInspectorSubmitDate(now);
			object.setInspectorendorSementDate(now);
			object.setInspectorDeadline(now);
			object.setInspectorFinishDate(now);
			object.setInspectorCancelDate(now);
			object.setInspectorOrganization(mapValues.get(""));
			object.setInspectorDivision(mapValues.get(""));
			object.setInspectorSignName(mapValues.get(""));
			object.setInspectorSignTitle(mapValues.get(""));
			object.setInspectorSignPlace(mapValues.get(""));*/
			
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); //1: Giay chung nhan; 0: Thong bao khong dat			
			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc"))) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}
				object.setCertificateRecordExpireDate(null);
			} catch (Exception e) {
				_log.debug(e);
			}
			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCG");
			object.setCertifiedVehicleType(mapValues.get("chung_chi@bb_XCG01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("chung_chi@bb_XCG01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedTrademarkName(mapValues.get("chung_chi@bb_XCG01051_text"));
			object.setCertifiedCommercialName(mapValues.get("chung_chi@bb_XCG01052"));
			object.setCertifiedModelCode(mapValues.get("chung_chi@bb_XCG01053"));
			
			// Khong ap dung voi Tham dinh thiet ke
			/*object.setCertifiedAssemblyType(mapValues.get(""));
			object.setCertifiedAssemblyTypeDescription(mapValues.get(""));
			object.setCertifiedVINNo(mapValues.get(""));
			object.setCertifiedVINPosition(mapValues.get(""));
			object.setCertifiedFrameNo(mapValues.get(""));
			object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get(""));
			object.setCertifiedEngineNo(mapValues.get(""));
			object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get(""));
			object.setSafetyTestReportNo(mapValues.get(""));
			object.setSafetyTestReportDate(now);
			object.setEmissionTestReportNo(mapValues.get(""));
			object.setEmissionTestReportDate(now);*/
			
			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCG01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCG01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCG01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCG01032_text"));
			
			
			// Khong ap dung voi Tham dinh thiet ke
			/*object.setOtherTestReportNo(mapValues.get(""));
			object.setOtherTestReportDate(now);
			object.setSampleFrameNo(mapValues.get(""));
			object.setSampleVINNo(mapValues.get(""));
			object.setSampleEngineNo(mapValues.get(""));
			object.setSampleVehicleType(mapValues.get(""));
			object.setSampleVehicleTypeDescription(mapValues.get(""));
			object.setSampleTrademark(mapValues.get(""));
			object.setSampleTrademarkName(mapValues.get(""));
			object.setSampleCommercialName(mapValues.get(""));
			object.setSampleModelCode(mapValues.get(""));
			object.setCustomsDeclarationNo(mapValues.get(""));
			object.setCustomsDeclarationDate(now);
			object.setProductionCountry(mapValues.get(""));
			object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			object.setInspectionRecordNo(mapValues.get(""));
			object.setInspectionDate(now);
			object.setInspectionSite(mapValues.get(""));
			object.setInspectionDistrictCode(mapValues.get(""));
			object.setInspectionDistrictName(mapValues.get(""));
			object.setInspectionProvinceCode(mapValues.get(""));
			object.setInspectionProvinceName(mapValues.get(""));
			object.setCorporationId(mapValues.get(""));
			object.setInspectorId(Long.valueOf(mapValues.get("")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));*/
			
			object.setModule("01") ; // 01: Tham dinh thiet ke
			
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTTDTKXMCD_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date applicantIdDate, VRApplicantProfile appProfile, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}

	public VRVehicleTypeCertificate updateTT302011BGTVTKTSPMXCG_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date applicantIdDate, VRApplicantProfile appProfile, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();	
			boolean flagUpdate = true;
				
			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List <VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0)) && lsVRVehicleTypeCertificate.get(0).getModule().contains("02")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);				
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCG01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCG01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCG01014"));
				object.setCityCode(appProfile.getApplicantCity());
				
			} else {
				return object;
			}
			Dossier objDossier = new DossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier  = DossierLocalServiceUtil.fetchDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCG01019"));
			
			object.setConvertassembleId(0);
			
			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());		
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}
			
			// Khong ap dung voi Kiem tra san pham mau
			/*object.setManufacturerForeignCode(mapValues.get(""));
			object.setManufacturerName(mapValues.get(""));
			object.setManufacturerAddress(mapValues.get(""));
			object.setManufacturerRepresentative(mapValues.get(""));
			object.setManufacturerRepresentativeTitle(mapValues.get(""));
			object.setManufacturerEmail(mapValues.get(""));
			object.setManufacturerPhone(mapValues.get(""));
			object.setManufacturerFax(mapValues.get(""));*/
			
			String productionPlantCode = mapValues.get("bien_ban@bb_XCG01007");
			
			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {				
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode) ;
				
				List <VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0 ) {
					objVRProductionPlant = lstVRProductionPlant.get(0);				
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant) && objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCG01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01010"));

			}
			// Khong ap dung voi Kiem tra san pham mau
			/*object.setCopReportNo(mapValues.get(""));
			object.setCopReportDate(null);
			object.setCopReportExpireDate(null);

			object.setDesignerCode("");
			object.setDesignerName("");
			object.setDesignerAddress("");
			object.setDesignerRepresentative("");
			object.setDesignerRepresentativeTitle("");
			
			object.setDesignerEmail("");
			object.setDesignerPhone("");
			object.setDesignerFax("");
			object.setVerificationCertificateNo("");
			object.setVerificationCertificateDate(null);
			object.setDesignModelCode("");
			object.setDesignModelDescription("");
			object.setDesignSymbol("");*/
					
			// Khong ap dung voi Kiem tra san pham mau
			/*object.setTypeApprovalCertificateNo(mapValues.get(""));
			object.setTypeApprovalCertificateDate(now);
			object.setInspectorReceiveDate(now);
			object.setInspectorSubmitDate(now);
			object.setInspectorendorSementDate(now);
			object.setInspectorDeadline(now);
			object.setInspectorFinishDate(now);
			object.setInspectorCancelDate(now);
			object.setInspectorOrganization(mapValues.get(""));
			object.setInspectorDivision(mapValues.get(""));
			object.setInspectorSignName(mapValues.get(""));
			object.setInspectorSignTitle(mapValues.get(""));
			object.setInspectorSignPlace(mapValues.get(""));*/
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); //1: Giay chung nhan; 0: Thong bao khong dat
			
			object.setCertificateRecordNo(mapValues.get("chung_chi@so_bao_cao"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_bao_cao"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			//object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}				
				object.setCertificateRecordExpireDate(null);
			} catch (Exception e) {
				_log.debug(e);
			}
			
			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCG");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XCG01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCG01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCG01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCG01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XCG01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XCG01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCG01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCG01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCG01057"));
			//object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCG01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCG01059"));
			//object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCG01060"));
			
			
			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCG01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCG01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCG01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCG01032_text"));
			
			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XCG01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01035"))) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01035")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
						
			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XCG01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01041"))) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01041")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			
			// Khong ap dung voi Kiem tra san pham mau
			/*object.setOtherTestReportNo(mapValues.get(""));
			object.setOtherTestReportDate(now);*/
			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCG01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCG01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XCG01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCG01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCG01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XCG01069"));
			/*
			object.setCustomsDeclarationNo(mapValues.get(""));
			object.setCustomsDeclarationDate(now);
			object.setProductionCountry(mapValues.get(""));
			object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			*/
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCG01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra"))) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			
			
			if (Validator.isNotNull(objVRProductionPlant) && objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}
			
			object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));
			
			object.setModule("02") ; // 02: Kiem tra san pham mau
			
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTKTSPMXBBCN_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTCOP_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTKTTBLANDAU_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT192012TTBGTVTDGLD_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate update432014TTLTBGTVTBCTTTNLNK_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate update432014TTLTBGTVTBCTTTNLSXLR_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLLKXCG_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date applicantIdDate, VRApplicantProfile appProfile, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();	
			boolean flagUpdate = true;
				
			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List <VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0)) && lsVRVehicleTypeCertificate.get(0).getModule().contains("04")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);				
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCG01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCG01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCG01014"));
				object.setCityCode(appProfile.getApplicantCity());
				
			} else {
				return object;
			}
			Dossier objDossier = new DossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier  = DossierLocalServiceUtil.fetchDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCG01019"));
			
			object.setConvertassembleId(0);
			
			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());		
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}
			
			
			
			String productionPlantCode = mapValues.get("bien_ban@bb_XCG01007");
			String loai_hinh_san_xuat = mapValues.get("bien_ban@loai_hinh_san_xuat"); // sxlr / nk
			
			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {				
				if (Validator.isNotNull(loai_hinh_san_xuat) && loai_hinh_san_xuat.contains("sxlr")) {
					long productionPlantRegistrationId = Long.parseLong(productionPlantCode) ;
					
					List <VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
					if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0 ) {
						objVRProductionPlant = lstVRProductionPlant.get(0);				
					}
				} else {
					// Co so nhap khau
					// Chi ap dung voi Chung nhan chat luong linh kien Nhap khau
					/*object.setManufacturerForeignCode(mapValues.get(""));
					object.setManufacturerName(mapValues.get(""));
					object.setManufacturerAddress(mapValues.get(""));
					object.setManufacturerRepresentative(mapValues.get(""));
					object.setManufacturerRepresentativeTitle(mapValues.get(""));
					object.setManufacturerEmail(mapValues.get(""));
					object.setManufacturerPhone(mapValues.get(""));
					object.setManufacturerFax(mapValues.get(""));*/
				}
				
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant) && objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCG01009")); // Chua xuat hien trong data bien ban
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01010")); // Chua xuat hien trong data bien ban

			}
			
			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XCG01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01017")) && mapValues.get("chung_chi@bb_XCG01017").length() > 9) { 
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XCG01017"))); // Chua xuat hien trong data bien ban
				}				
				object.setCopReportExpireDate(null);
				
				// Kiem tra hieu luc COP cho lan ke tiep
				
			} catch (Exception e) {
				_log.debug(e);
			}

			//Khong ap dung voi Chung nhan chat luong linh kien
			/*
			object.setDesignerCode("");
			object.setDesignerName("");
			object.setDesignerAddress("");
			object.setDesignerRepresentative("");
			object.setDesignerRepresentativeTitle("");
			
			object.setDesignerEmail("");
			object.setDesignerPhone("");
			object.setDesignerFax("");
			object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			object.setDesignModelDescription(mapValues.get("bien_ban@loai_hinh_thiet_ke_text"));
			
			//object.setVerificationCertificateNo
			//object.setVerificationCertificateDate
			//object.setTypeApprovalCertificateNo
			//object.setTypeApprovalCertificateDate
			
			*/
			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban")); 
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")) && mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XCG01020")); // Chua xuat hien trong data bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01021")) && mapValues.get("bien_ban@bb_XCG01021").length() > 9) { 
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01021"))); // Chua xuat hien trong data bien ban
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			
			
			
			
			// Khong ap dung voi Chung nhan chat luong linh kien
			/*
			object.setInspectorReceiveDate(now);
			object.setInspectorSubmitDate(now);
			object.setInspectorendorSementDate(now);
			object.setInspectorDeadline(now);
			object.setInspectorFinishDate(now);
			object.setInspectorCancelDate(now);
			object.setInspectorOrganization(mapValues.get(""));
			object.setInspectorDivision(mapValues.get(""));
			object.setInspectorSignName(mapValues.get(""));
			object.setInspectorSignTitle(mapValues.get(""));
			object.setInspectorSignPlace(mapValues.get(""));*/
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); //1: Giay chung nhan; 0: Thong bao khong dat
			
			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc")) && mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}		
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_het_han_gcn")) && mapValues.get("bien_ban@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(parseStringToDate(mapValues.get("bien_ban@ngay_het_han_gcn"))); 
					// Moi co trong bien ban, chua co trong chung chi
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("LKXCG");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_loai_san_pham"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_loai_san_pham_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCG01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCG01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCG01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XCG01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XCG01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCG01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCG01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCG01057"));
			//object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCG01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCG01059"));
			//object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCG01060"));
			
			
			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_tieu_chuan_ap_dung"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@bb_tieu_chuan_ap_dung_text"));
			/*object.setEmissionStandard(mapValues.get("bien_ban@bb_XCG01032"));			
			object.setEmissionDescription(mapValues.get("bien_ban@XCG01032_text"));*/
			
			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_bao_cao_ket_qua_thu_nghiem"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem")) && mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem").length() > 9) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
						
			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_bao_cao_ket_qua_thu_nghiem_lien_quan"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan")) && mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_ngay_cap_bao_cao_ket_qua_thu_nghiem_lien_quan")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_bien_ban_kiem_tra_xac_nhan"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan")) && mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan").length() > 9) {
					object.setOtherTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_ngay_cap_bien_ban_kiem_tra_xac_nhan")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			
			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCG01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCG01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XCG01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCG01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCG01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XCG01069"));
			
			// Chi ap dung voi Chung nhan chat luong linh kien
			try {
				object.setCustomsDeclarationNo(mapValues.get("bien_ban@bb_LKXCG0401"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_LKXCG0402")) && mapValues.get("bien_ban@bb_LKXCG0402").length() > 9) {
					object.setCustomsDeclarationDate(parseStringToDate(mapValues.get("bien_ban@bb_LKXCG0402")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			
			try {
				object.setDesignSymbol(mapValues.get("bien_ban@bb_XCG01026")); // Chua xuat hien trong data bien ban
				object.setProductionCountry(mapValues.get("bien_ban@bb_LKXCG0405"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_LKXCG0404")) && mapValues.get("bien_ban@bb_LKXCG0404").length() > 0) {
					object.setImporterQuantity(Long.valueOf(mapValues.get("bien_ban@bb_LKXCG0404")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			
			
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCG01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")) && mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			// Con thieu: Cap lai: so_chung_chi va ngay_gcn_cu; Mo rong: so_gcn_goc va ngay_gcn_goc
			
			
			if (Validator.isNotNull(objVRProductionPlant) && objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}
			
			//object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));
			
			object.setModule("04") ; // 04: Chung nhan chat luong linh kien
			
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLLKXM_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXCG_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date applicantIdDate, VRApplicantProfile appProfile, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();	
			boolean flagUpdate = true;
				
			VRVehicleTypeCertificate object = new VRVehicleTypeCertificateImpl();
			List <VRVehicleTypeCertificate> lsVRVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil.findByDeliverableCode(dossierFile.getDeliverableCode());
			if (Validator.isNotNull(lsVRVehicleTypeCertificate) && lsVRVehicleTypeCertificate.size() > 0) {
				if (Validator.isNotNull(lsVRVehicleTypeCertificate.get(0)) && lsVRVehicleTypeCertificate.get(0).getModule().contains("03")) {
					object = lsVRVehicleTypeCertificate.get(0);
					flagUpdate = true;
				} else {
					flagUpdate = false;
					long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
					object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);				
				}
			} else {
				flagUpdate = false;
				long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
				object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
			}
			object.setMtCore(1);
			object.setModifyDate(new Date());
			object.setSyncDate(new Date());
			if (appProfile != null) {
				object.setApplicantIdNo(appProfile.getApplicantCode());
				object.setApplicantIdDate(applicantIdDate);
				object.setApplicantName(appProfile.getApplicantName());
				object.setApplicantAddress(appProfile.getApplicantAddress());
				object.setApplicantRepresentative(appProfile.getApplicantRepresentative());
				object.setApplicantRepresentativeTitle(appProfile.getApplicantRepresentativeTitle());
				object.setApplicantEmail(appProfile.getApplicantEmail());
				object.setApplicantPhone(appProfile.getApplicantPhone());
				object.setApplicantFax(mapValues.get(""));
				object.setApplicantContactName(mapValues.get("chungchi@bb_XCG01013"));
				object.setApplicantContactEmail(mapValues.get("chungchi@bb_XCG01012"));
				object.setApplicantcontactPhone(mapValues.get("chungchi@bb_XCG01014"));
				object.setCityCode(appProfile.getApplicantCity());
				
			} else {
				return object;
			}
			Dossier objDossier = new DossierImpl();
			if (dossierFile != null) {
				object.setDossierId(dossierFile.getDossierId());
				object.setDeliverableCode(dossierFile.getDeliverableCode());
				objDossier  = DossierLocalServiceUtil.fetchDossier(dossierFile.getDossierId());
			}
			object.setDossierType(mapValues.get("bien_ban@bb_XCG01019"));
			
			object.setConvertassembleId(0);
			
			if (Validator.isNotNull(objDossier)) {
				object.setDossierNo(objDossier.getDossierNo());
				object.setReferenceUid(objDossier.getReferenceUid());
				object.setServiceCode(objDossier.getServiceCode());
				object.setServiceName(objDossier.getServiceName());		
				object.setRegisteredNumber(mapValues.get("ma_ho_so"));
			}
			
			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*object.setManufacturerForeignCode(mapValues.get(""));
			object.setManufacturerName(mapValues.get(""));
			object.setManufacturerAddress(mapValues.get(""));
			object.setManufacturerRepresentative(mapValues.get(""));
			object.setManufacturerRepresentativeTitle(mapValues.get(""));
			object.setManufacturerEmail(mapValues.get(""));
			object.setManufacturerPhone(mapValues.get(""));
			object.setManufacturerFax(mapValues.get(""));*/
			
			String productionPlantCode = mapValues.get("bien_ban@bb_XCG01007");
			
			VRProductionPlant objVRProductionPlant = new VRProductionPlantImpl();
			try {				
				long productionPlantRegistrationId = Long.parseLong(productionPlantCode) ;
				
				List <VRProductionPlant> lstVRProductionPlant = VRProductionPlantLocalServiceUtil.findByRegistrationFormId(1, appProfile.getId(), productionPlantRegistrationId);
				if (Validator.isNotNull(lstVRProductionPlant) && lstVRProductionPlant.size() > 0 ) {
					objVRProductionPlant = lstVRProductionPlant.get(0);				
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			if (Validator.isNotNull(objVRProductionPlant) && objVRProductionPlant.getProductionPlantCode().length() > 0) {
				productionPlantCode = objVRProductionPlant.getProductionPlantCode();
				object.setProductionPlantCode(productionPlantCode);
				object.setProductionPlantName(objVRProductionPlant.getProductionPlantName());
				object.setProductionPlantAddress(objVRProductionPlant.getProductionPlantAddress());
				object.setProductionPlantRepresentative(mapValues.get("bien_ban@bb_XCG01009"));
				object.setProductionPlantRepresentativeTitle(mapValues.get("bien_ban@bb_XCG01010"));

			}
			
			try {
				object.setCopReportNo(mapValues.get("chung_chi@bb_XCG01016"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01017")) && mapValues.get("chung_chi@bb_XCG01017").length() > 9) {
					object.setCopReportDate(parseStringToDate(mapValues.get("chung_chi@bb_XCG01017")));
				}				
				object.setCopReportExpireDate(null);
				
				// Kiem tra hieu luc COP cho lan ke tiep
				
			} catch (Exception e) {
				_log.debug(e);
			}

			//Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			object.setDesignerCode("");
			object.setDesignerName("");
			object.setDesignerAddress("");
			object.setDesignerRepresentative("");
			object.setDesignerRepresentativeTitle("");
			
			object.setDesignerEmail("");
			object.setDesignerPhone("");
			object.setDesignerFax("");
			object.setDesignModelCode(mapValues.get("bien_ban@loai_hinh_thiet_ke"));
			object.setDesignModelDescription(mapValues.get("bien_ban@loai_hinh_thiet_ke_text"));*/
			
			
			
			try {
				object.setVerificationCertificateNo(mapValues.get("chung_chi@bb_XCG01024"));
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01025")) && mapValues.get("chung_chi@bb_XCG01025").length() > 9) {
					object.setVerificationCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XCG01025")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			
			try {
				object.setVerificationRefNo(mapValues.get("chung_chi@so_bien_ban")); 
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")) && mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setVerificationRefDate(parseStringToDate(mapValues.get("chung_chi@ngay_ket_thuc_kiem_tra")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			try {
				object.setReferenceCertificateNo(mapValues.get("bien_ban@bb_XCG01020")); // Chua xuat hien trong data bien ban
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01021")) && mapValues.get("bien_ban@bb_XCG01021").length() > 9) { // Chua xuat hien trong data bien ban
					object.setReferenceCertificateDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01021")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			object.setDesignSymbol(mapValues.get("bien_ban@bb_XCG01026")); // Chua xuat hien trong data bien ban
			
			try {
				object.setTypeApprovalCertificateNo(mapValues.get("chung_chi@bb_XCG01027")); // Chua xuat hien trong data bien ban
				if (Validator.isNotNull(mapValues.get("chung_chi@bb_XCG01028")) && mapValues.get("chung_chi@bb_XCG01028").length() > 9) { // Chua xuat hien trong data bien ban
					object.setTypeApprovalCertificateDate(parseStringToDate(mapValues.get("chung_chi@bb_XCG01028")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			object.setInspectorReceiveDate(now);
			object.setInspectorSubmitDate(now);
			object.setInspectorendorSementDate(now);
			object.setInspectorDeadline(now);
			object.setInspectorFinishDate(now);
			object.setInspectorCancelDate(now);
			object.setInspectorOrganization(mapValues.get(""));
			object.setInspectorDivision(mapValues.get(""));
			object.setInspectorSignName(mapValues.get(""));
			object.setInspectorSignTitle(mapValues.get(""));
			object.setInspectorSignPlace(mapValues.get(""));*/
			object.setCertificateType(mapValues.get("chung_chi@ket_luan_chung")); //1: Giay chung nhan; 0: Thong bao khong dat
			
			object.setCertificateRecordNo(mapValues.get("chung_chi@so_chung_chi"));
			object.setCertificateSignName(mapValues.get("chung_chi@nguoi_ky_cc_text"));
			object.setCertificateSignTitle(mapValues.get("chung_chi@chuc_danh_ky"));
			object.setCertificateSignPlace(mapValues.get("chung_chi@dia_diem_ky"));
			object.setCertificateNote(mapValues.get("chung_chi@ghi_chu_in_chung_chi"));
			try {
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_cap_cc")) && mapValues.get("chung_chi@ngay_cap_cc").length() > 9) {
					object.setCertificateRecordDate(parseStringToDate(mapValues.get("chung_chi@ngay_cap_cc")));
				}		
				if (Validator.isNotNull(mapValues.get("chung_chi@ngay_het_han_gcn")) && mapValues.get("chung_chi@ngay_het_han_gcn").length() > 9) {
					object.setCertificateRecordExpireDate(parseStringToDate(mapValues.get("chung_chi@ngay_het_han_gcn")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			object.setExpiredStatus("1");
			object.setCertificateRecordStatus("2");
			object.setDigitalIssueStatus("0");
			object.setVehicleClass("XCG");
			object.setCertifiedVehicleType(mapValues.get("bien_ban@bb_XCG01050"));
			object.setCertifiedVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01050_text"));
			object.setCertifiedTrademark(mapValues.get("bien_ban@bb_XCG01051"));
			object.setCertifiedTrademarkName(mapValues.get("bien_ban@bb_XCG01051_text"));
			object.setCertifiedCommercialName(mapValues.get("bien_ban@bb_XCG01052"));
			object.setCertifiedModelCode(mapValues.get("bien_ban@bb_XCG01053"));
			//
			object.setCertifiedAssemblyType(mapValues.get("bien_ban@bb_XCG01049"));
			object.setCertifiedAssemblyTypeDescription(mapValues.get("bien_ban@bb_XCG01049_text"));
			object.setCertifiedVINNo(mapValues.get("bien_ban@bb_XCG01055"));
			object.setCertifiedVINPosition(mapValues.get("bien_ban@bb_XCG01056"));
			object.setCertifiedFrameNo(mapValues.get("bien_ban@bb_XCG01057"));
			//object.setCertifiedFrameAttachPlace(mapValues.get(""));
			object.setCertifiedFramePosition(mapValues.get("bien_ban@bb_XCG01058"));
			object.setCertifiedEngineNo(mapValues.get("bien_ban@bb_XCG01059"));
			//object.setCertifiedEngineAttachPlace(mapValues.get(""));
			object.setCertifiedEnginePosition(mapValues.get("bien_ban@bb_XCG01060"));
			
			
			object.setCommonSafetyStandard(mapValues.get("bien_ban@bb_XCG01031"));
			object.setEmissionStandard(mapValues.get("bien_ban@bb_XCG01032"));
			object.setCommonSafetyDescription(mapValues.get("bien_ban@XCG01031_text"));
			object.setEmissionDescription(mapValues.get("bien_ban@XCG01032_text"));
			
			try {
				object.setSafetyTestReportNo(mapValues.get("bien_ban@bb_XCG01034"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01035")) && mapValues.get("bien_ban@bb_XCG01035").length() > 9) {
					object.setSafetyTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01035")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
						
			try {
				object.setEmissionTestReportNo(mapValues.get("bien_ban@bb_XCG01040"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01041")) && mapValues.get("bien_ban@bb_XCG01041").length() > 9) {
					object.setEmissionTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01041")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			try {
				object.setOtherTestReportNo(mapValues.get("bien_ban@bb_XCG01046"));
				if (Validator.isNotNull(mapValues.get("bien_ban@bb_XCG01047")) && mapValues.get("bien_ban@bb_XCG01047").length() > 9) {
					object.setOtherTestReportDate(parseStringToDate(mapValues.get("bien_ban@bb_XCG01047")));
				}				
			} catch (Exception e) {
				_log.debug(e);
			}
			
			
			object.setSampleFrameNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleVINNo(mapValues.get("bien_ban@bb_XCG01062"));
			object.setSampleEngineNo(mapValues.get("bien_ban@bb_XCG01063"));
			object.setSampleVehicleType(mapValues.get("bien_ban@bb_XCG01066"));
			object.setSampleVehicleTypeDescription(mapValues.get("bien_ban@bb_XCG01066_text"));
			object.setSampleTrademark(mapValues.get("bien_ban@bb_XCG01067"));
			object.setSampleTrademarkName(mapValues.get("bien_ban@bb_XCG01067_text"));
			object.setSampleCommercialName(mapValues.get("bien_ban@bb_XCG01068"));
			object.setSampleModelCode(mapValues.get("bien_ban@bb_XCG01069"));
			
			// Khong ap dung voi Chung nhan chat luong kieu loai toan xe
			/*
			object.setCustomsDeclarationNo(mapValues.get(""));
			object.setCustomsDeclarationDate(now);
			object.setProductionCountry(mapValues.get(""));
			object.setImporterQuantity(Long.valueOf(mapValues.get("")));
			*/
			object.setInspectionRecordNo(mapValues.get("bien_ban@so_bien_ban"));
			try {
				object.setInspectionSite(mapValues.get("bien_ban@bb_XCG01008"));
				if (Validator.isNotNull(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")) && mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra").length() > 9) {
					object.setInspectionDate(parseStringToDate(mapValues.get("bien_ban@ngay_ket_thuc_kiem_tra")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			// Con thieu: Cap lai: so_chung_chi va ngay_gcn_cu; Mo rong: so_gcn_goc va ngay_gcn_goc
			
			
			if (Validator.isNotNull(objVRProductionPlant) && objVRProductionPlant.getProductionPlantCode().length() > 0) {
				object.setInspectionDistrictCode(objVRProductionPlant.getProductionPlantDistrictCode());
				object.setInspectionDistrictName(objVRProductionPlant.getProductionPlantDistrictName());
				object.setInspectionProvinceCode(objVRProductionPlant.getProductionPlantProvinceCode());
				object.setInspectionProvinceName(objVRProductionPlant.getProductionPlantProvinceName());
			}
			
			//object.setCorporationId(mapValues.get("bien_ban@workingUnitId"));
			object.setInspectorId(Long.valueOf(mapValues.get("bien_ban@dang_kiem_vien_chinh_userId")));
			object.setRemarks(mapValues.get(""));
			object.setInspectionNote(mapValues.get(""));
			
			object.setModule("03") ; // 03: Chung nhan chat luong kieu loai toan xe
			
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXMTGM_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXDD_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXBBCN_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
	
	public VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXBBCH_VehicleTypeCertificate(LinkedHashMap<String, String> mapValues,
			Date modifiedDate, Registration registration, DossierFile dossierFile)  throws PortalException, SystemException {
		try {
			Date now = new Date();
	
			long vrVehicleTypeCertificateId = counterLocalService.increment(VRVehicleTypeCertificate.class.getName());
	
			VRVehicleTypeCertificate object = vrVehicleTypeCertificatePersistence.create(vrVehicleTypeCertificateId);
		
			return vrVehicleTypeCertificatePersistence.update(object);
		} catch (Exception e) {
			_log.error(e);
		}		
		return null;
	}
		
	private Date parseStringToDate(String strDate) {
			
			try {
				SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE);
				return df.parse(strDate);
			}
			catch (ParseException e) {
				
				try {
					SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_2);
					return df.parse(strDate);
				} catch (Exception e2) {
					try {
						SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_3);
						return df.parse(strDate);
					} catch (Exception e3) {
						
					}
				}
				
				//_log.error(e);
				return null;
			}
			
		}
	
	public List<VRVehicleTypeCertificate> findByInspectorId(long inspectorId) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByInspectorId(inspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByCorporationId(String corporationId) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(String corporationId, long inspectorId) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByInspectorIdCorporationId(corporationId, inspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByServiceCode(String serviceCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByServiceCode(serviceCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByApplicantIdNo(String applicantIdNo) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByApplicantIdNo(applicantIdNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(String applicantIdNo, String productionPlantCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByApplicantAndProductionPlant(applicantIdNo, productionPlantCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByDossier(String dossierNo) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDossier(dossierNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByDeliverableCode(String deliverableCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDeliverableCode(deliverableCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByManufacturerForeignCode(String manufacturerForeignCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByManufacturerForeignCode(manufacturerForeignCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByCopReportNo(String copReportNo) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByCopReportNo(copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByDesignerCode(String designerCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDesignerCode(designerCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByVerificationCertificateNo(String verificationCertificateNo) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByVerificationCertificateNo(verificationCertificateNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByDesignsymbol(String designSymbol) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDesignsymbol(designSymbol);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByCertificaterecordno(String certificateRecordNo, String serviceCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByCertificaterecordno(certificateRecordNo, serviceCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByExpiredstatus(String expiredStatus) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByExpiredstatus(expiredStatus);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(String expiredStatus, String serviceCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByExpiredstatusAndServiceCode(expiredStatus, serviceCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(String vehicleClass, String certifiedVehicleType, 
			String certifiedTrademarkName, String certifiedCommercialName, 
			String certifiedModelCode, String serviceCode) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByVehicletypeAndServiceCode(vehicleClass, certifiedVehicleType, certifiedTrademarkName, certifiedCommercialName, certifiedModelCode, serviceCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByCommonsafetystandard(String commonSafetyStandard) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByCommonsafetystandard(commonSafetyStandard);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByEmissionstandard(String emissionStandard) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByEmissionstandard(emissionStandard);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByInspectionRecordNo(String inspectionRecordNo) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByInspectionRecordNo(inspectionRecordNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByApplicantAndService(String serviceCode, String applicantIdNo, long mtCore) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByApplicantAndService(serviceCode, applicantIdNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByDossierId(long dossierId, long mtCore) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDossierId(dossierId, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByDossierNo(String dossierNo, long mtCore) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByDossierNo(dossierNo, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(String serviceCode, String applicantIdNo, String productionPlantCode, long mtCore) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByServiceCodeAndProductionPlantCode(serviceCode, applicantIdNo, productionPlantCode, mtCore);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	public List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(String serviceCode, String applicantIdNo, String productionPlantName, String productionPlantAddress) throws PortalException, SystemException {
		try {
			return vrVehicleTypeCertificatePersistence.findByServiceCodeAndProductionPlant(serviceCode, applicantIdNo, productionPlantName, productionPlantAddress);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRVehicleTypeCertificate>();
		
	}
	
	
	
}