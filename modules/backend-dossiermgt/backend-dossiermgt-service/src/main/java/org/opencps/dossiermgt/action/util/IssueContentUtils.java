package org.opencps.dossiermgt.action.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.opencps.dossiermgt.action.PaymentFileActions;
import org.opencps.dossiermgt.action.impl.PaymentFileActionsImpl;
import org.opencps.dossiermgt.constants.DossierStatusConstants;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.PaymentFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.model.impl.DossierFileImpl;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import com.fds.vr.business.action.util.ConvertJONObjectUtils;
import org.opencps.dossiermgt.model.impl.DossierFileImpl;
import com.fds.vr.business.model.VRIssue;
import com.fds.vr.business.model.VRIssueEquipmentCertificate;
import com.fds.vr.business.model.VRIssueVehiclecertificate;
import com.fds.vr.business.model.VRVehicleRecord;
import com.fds.vr.business.model.VRClearingStampbook;
import com.fds.vr.business.model.VRRPDossierStatistics;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.model.impl.VRRPDossierStatisticsImpl;
import com.fds.vr.business.model.impl.VRCorporationAttendeeImpl;
import com.fds.vr.business.model.impl.VRIssueImpl;
import com.fds.vr.business.model.impl.VRIssueEquipmentCertificateImpl;
import com.fds.vr.business.model.impl.VRIssueVehiclecertificateImpl;
import com.fds.vr.business.model.impl.VRVehicleRecordImpl;
import com.fds.vr.business.model.impl.VRClearingStampbookImpl;
import com.fds.vr.business.service.VRRPDossierStatisticsLocalServiceUtil;
import com.fds.vr.business.service.base.VRCorporationAttendeeLocalServiceBaseImpl;
import com.fds.vr.business.service.VRCorporationAttendeeLocalServiceUtil;
import com.fds.vr.business.service.VRIssueLocalServiceUtil;
import com.fds.vr.business.service.VRIssueEquipmentCertificateLocalServiceUtil;
import com.fds.vr.business.service.VRIssueVehiclecertificateLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleRecordLocalServiceUtil;
import com.fds.vr.business.service.VRClearingStampbookLocalServiceUtil;
import org.opencps.dossiermgt.action.keypay.util.HashFunction;
import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import backend.utils.APIDateTimeUtils;


public class IssueContentUtils {

	private static final Log _log = LogFactoryUtil.getLog(IssueContentUtils.class);
	private final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private final String PATTERN_DATE_3 = "dd/MM/yyyy";
	
	public String updateVRIssueCertificate(DossierAction dossierActionModel) throws PortalException {
		// SONVH bosung 10/05/2019: Cap nhat thong tin ho so CHO CAP PHAT PXX
		// 1. vr_issue; 
		// 2. vr_issue_vehiclecertificate
		// 3. vr_vehiclerecord
		// 4. vr_issue_equipmentcertificate
		try {
			long groupId = dossierActionModel.getGroupId(); 
			String fileTemplateNo = StringPool.BLANK;
			String issueVehicleClass = StringPool.BLANK;
			String formData = StringPool.BLANK;
			DossierFile dossierFile = new DossierFileImpl();
			Dossier objDossier = DossierLocalServiceUtil.fetchDossier(dossierActionModel.getDossierId());
			String dossierTemplateNo = objDossier.getDossierTemplateNo();
			//ProcessAction processAction = ProcessActionLocalServiceUtil.fetchBySPID_AC(serviceProcessId, actionCode);
			
			String postStepCode = dossierActionModel.getStepCode();
			List <ProcessStep> lstProcessStep = ProcessStepLocalServiceUtil.getBySC_SPID(postStepCode, dossierActionModel.getServiceProcessId());				
			if (Validator.isNotNull(lstProcessStep) && lstProcessStep.size() > 0 ) {
				if (groupId == 55301 && postStepCode.equalsIgnoreCase("136") && lstProcessStep.get(0).getDossierSubStatus().equalsIgnoreCase("PROCESSING_72")) {
					if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXBBCH")) {
						fileTemplateNo = "TT302011BGTVTCPPXBBCHBTTX";
						issueVehicleClass = "PXX_XCH";
					} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXBBCN")) {
						fileTemplateNo = "TT302011BGTVTCPPXBBCNBTTX";
						issueVehicleClass = "PXX_XCN";
					} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXDD")) {
						fileTemplateNo = "TT302011BGTVTCPPGNTUAC";
						issueVehicleClass = "PXX_XDD";
					} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXMTGM")) {
						fileTemplateNo = "TT302011BGTVTCPPXMTGMBTTX";
						issueVehicleClass = "PXX_XMY";
					} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXCG")) {
						fileTemplateNo = "TT302011BGTVTCPPXCGBTTX";
						issueVehicleClass = "PXX_XCG";
					} else if (dossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCPPXCD")) {
						fileTemplateNo = "TT302011BGTVTCPPXCDBTTX";
						issueVehicleClass = "PXX_XCD";
					} else {
						return "";
					}
					
					
					dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(dossierActionModel.getDossierId(), fileTemplateNo, 1,
							false, new DossierFileComparator(false, "createDate", Date.class));
					formData = dossierFile.getFormData();
				}
			}
			if (Validator.isNull(formData)) {
				return "";
			}
			
			_log.info("Start update Issue for vehicle");
			
			boolean flagDelete = false;
			// Firstly, delete all VRVehicleRecord, VRIssueVehiclecertificate, VRIssueEquipmentCertificate, VRIssue
			List<VRVehicleRecord> lstVRVehicleRecord = VRVehicleRecordLocalServiceUtil.findBydossierId(1, dossierActionModel.getDossierId());
			if (Validator.isNotNull(lstVRVehicleRecord) && lstVRVehicleRecord.size() > 0 ) {
				flagDelete = true;
				for (VRVehicleRecord vrVehicleRecord : lstVRVehicleRecord) {
					VRVehicleRecordLocalServiceUtil.deleteVRVehicleRecord(vrVehicleRecord);
				}
			}
			List<VRIssueVehiclecertificate> lstVRIssueVehiclecertificate = VRIssueVehiclecertificateLocalServiceUtil.findBydossierId(1, dossierActionModel.getDossierId());
			if (Validator.isNotNull(lstVRIssueVehiclecertificate) && lstVRIssueVehiclecertificate.size() > 0 ) {
				flagDelete = true;
				for (VRIssueVehiclecertificate vrIssueVehiclecertificate : lstVRIssueVehiclecertificate) {
					// Tam rao
//					List<VRIssueEquipmentCertificate> lstVRIssueEquipmentCertificate = VRIssueEquipmentCertificateLocalServiceUtil.findByIssueVehicleCertificateId(Integer.valueOf(objVRIssueVehiclecertificate.getId()+""));
//					if (Validator.isNotNull(lstVRIssueEquipmentCertificate) && lstVRIssueEquipmentCertificate.size() > 0 ) {
//						for (VRIssueEquipmentCertificate vrIssueEquipmentCertificate : lstVRIssueEquipmentCertificate) {
//							VRIssueEquipmentCertificateLocalServiceUtil.deleteVRIssueEquipmentCertificate(vrIssueEquipmentCertificate);
//						}
//					}
					VRIssueVehiclecertificateLocalServiceUtil.deleteVRIssueVehiclecertificate(vrIssueVehiclecertificate);
				}
			}

			
			List<VRIssue> lstVRIssue = VRIssueLocalServiceUtil.findBydossierId(1, dossierActionModel.getDossierId());
			if (Validator.isNotNull(lstVRIssue) && lstVRIssue.size() > 0 ) {
				flagDelete = true;
				for (VRIssue vrIssue : lstVRIssue) {
					VRIssueLocalServiceUtil.deleteVRIssue(vrIssue);
				}
			}
			
			
			if (flagDelete == true) {
				_log.info("NEXT Issue for vehicle");
			} else {
				_log.info("FIRST Issue for vehicle");
			}
			VRIssue objVRIssue = new VRIssueImpl();
			VRIssueVehiclecertificate objVRIssueVehiclecertificate = new VRIssueVehiclecertificateImpl();
			VRVehicleRecord objVRVehicleRecord = new VRVehicleRecordImpl();
			VRIssueEquipmentCertificate objVRIssueEquipmentCertificate = new VRIssueEquipmentCertificateImpl();
			
			long idVRIssue = CounterLocalServiceUtil.increment(VRIssue.class.getName());
			
			
			// create objVRIssue
			objVRIssue.setId(idVRIssue);
			objVRIssue.setModifyDate(new Date());
			objVRIssue.setSyncDate(new Date());
			
			objVRIssue.setMtCore(1);
			objVRIssue.setDossierId(dossierActionModel.getDossierId());
			objVRIssue.setStampIssueNo(objDossier.getDossierNo());
/*			objVRIssue.setAppliedDate(new Date()); // phai lay tu dossierstatistics
			objVRIssue.setApprovedDate(new Date()); // phai lay tu dossierstatistics
			objVRIssue.setVehicleClass(issueVehicleClass);
			objVRIssue.setApplicantProfileId(applicantProfileId);
			objVRIssue.setApplicantName(applicantName);
			objVRIssue.setApplicantAddress(applicantAddress);
			objVRIssue.setApplicantPhone(applicantPhone);
			objVRIssue.setApplicantEmail(applicantEmail);
			objVRIssue.setApplicantFax(applicantFax);
			objVRIssue.setApplicantRepresentative(applicantRepresentative);
			objVRIssue.setApplicantRepresentativeTitle(applicantRepresentativeTitle);
			objVRIssue.setApplicantmaker(applicantmaker);
			objVRIssue.setApplicantchecker(applicantchecker);
			objVRIssue.setApplicantContactName(applicantContactName);
			objVRIssue.setApplicantContactPhone(applicantContactPhone);
			objVRIssue.setApplicantContactEmail(applicantContactEmail);
			objVRIssue.setProductionPlantId(productionPlantId);
			objVRIssue.setProductionPlantCode(productionPlantCode);
			objVRIssue.setProductionPlantName(productionPlantName);
			objVRIssue.setProductionPlantAddress(productionPlantAddress);
			objVRIssue.setRemarks(remarks);
			
			objVRIssue.setMethodOfIssue(methodOfIssue);
			objVRIssue.setIssueType(issueType);
			objVRIssue.setTotalInDocument(totalInDocument);
			objVRIssue.setAverageSTBQuantity(averageSTBQuantity);
			objVRIssue.setMaxMonthQuantity(maxMonthQuantity);
			objVRIssue.setAverageSTMQuantity(averageSTMQuantity);
			objVRIssue.setAccumulatedMonthQuantity(accumulatedMonthQuantity);
			
			objVRIssue.setTotalInUse(totalInUse);
			objVRIssue.setTotalCancelled(totalCancelled);
			objVRIssue.setTotalLost(totalLost);
			objVRIssue.setTotalNotUsed(totalNotUsed);
			objVRIssue.setTotalReturned(totalReturned);
			objVRIssue.setFlow(flow);
			objVRIssue.setExaminationRequired(examinationRequired);
			objVRIssue.setExaminationPeriod(examinationPeriod);
			objVRIssue.setExaminationLastTime(examinationLastTime);
			objVRIssue.setCopresult(copresult);
			objVRIssue.setCopreportno(copreportno);
			objVRIssue.setCopreportdate(copreportdate);
			objVRIssue.setPostreview(postreview);
			objVRIssue.setPostreviewrecordno(postreviewrecordno);
			objVRIssue.setPostreviewrecorddate(postreviewrecorddate);
			objVRIssue.setCorporationId(corporationId);
			//objVRIssue.setInspectorId(inspectorId);
			objVRIssue.setInspectorcode(inspectorcode);
			objVRIssue.setInspectorname(inspectorname);
			objVRIssue.setLeadername(leadername);
			objVRIssue.setIssueCorporationId(issueCorporationId); // Don vi cap phat
			//objVRIssue.setIssueInspectorId(issueInspectorId);
			objVRIssue.setVerifyCorporationId(verifyCorporationId);
			//objVRIssue.setVerifyInspectorId(verifyInspectorId);
			objVRIssue.setDigitalissuestatus(digitalissuestatus);
			
			*/
			
			VRIssueLocalServiceUtil.addVRIssue(objVRIssue);
			
			int sizeOfVRIssueVehiclecertificate = 1; // default
			int sizeOfVRVehicleRecord = 1; // default
			int sizeOfVRIssueEquipmentCertificate = 1; // default
			
			for (int i=0; i < sizeOfVRIssueVehiclecertificate;) {
				long idVRIssueVehiclecertificate = CounterLocalServiceUtil.increment(VRIssueVehiclecertificate.class.getName());
				objVRIssueVehiclecertificate = new VRIssueVehiclecertificateImpl();
				objVRIssueVehiclecertificate.setId(idVRIssueVehiclecertificate);
				
				objVRIssueVehiclecertificate.setMtCore(1);
				objVRIssueVehiclecertificate.setDossierId(dossierActionModel.getDossierId());
				objVRIssueVehiclecertificate.setIssueId(objVRIssue.getId());
				/*
				objVRIssueVehiclecertificate.setCertificateId(certificateId);
				objVRIssueVehiclecertificate.setCertificaterecordno(certificaterecordno);
				objVRIssueVehiclecertificate.setVehiclePrice(vehiclePrice);				
				objVRIssueVehiclecertificate.setTotalQuantity(totalQuantity);
				objVRIssueVehiclecertificate.setUnitPrice(unitPrice);
				objVRIssueVehiclecertificate.setProductionexamreportno(productionexamreportno);
				objVRIssueVehiclecertificate.setTotalproduct(totalproduct);
				*/
				objVRIssueVehiclecertificate.setModifyDate(new Date());
				objVRIssueVehiclecertificate.setSyncDate(new Date());
				
				
				VRIssueVehiclecertificateLocalServiceUtil.addVRIssueVehiclecertificate(objVRIssueVehiclecertificate);
				
				
				// Them bang ke phuong tien
				for (int j=0; j < sizeOfVRVehicleRecord;) {
					long idVRVehicleRecord = CounterLocalServiceUtil.increment(VRVehicleRecord.class.getName());
					objVRVehicleRecord = new VRVehicleRecordImpl();
					objVRVehicleRecord.setId(idVRVehicleRecord);
					objVRVehicleRecord.setMtCore(1);
					objVRVehicleRecord.setIssueId(objVRIssue.getId());
					objVRVehicleRecord.setIssueVehicleCertificateId(objVRIssueVehiclecertificate.getId());
					objVRVehicleRecord.setDossierId(dossierActionModel.getDossierId());
					/*
					objVRVehicleRecord.setApplicantProfileId(applicantProfileId);
					objVRVehicleRecord.setApplicantName(applicantName);
					objVRVehicleRecord.setApplicantAddress(applicantAddress);
					objVRVehicleRecord.setCertificateId(certificateId);
					objVRVehicleRecord.setCertificaterecordno(certificaterecordno);
					objVRVehicleRecord.setProductionNumber(productionNumber);
					objVRVehicleRecord.setProductionDate(productionDate);
		
					objVRVehicleRecord.setFrameNo(frameNo);
					objVRVehicleRecord.setBoxNo(boxNo);
					objVRVehicleRecord.setEngineNo(engineNo);
					objVRVehicleRecord.setColor(color);
					objVRVehicleRecord.setStampShortNo(stampShortNo);
					objVRVehicleRecord.setSerialNo(serialNo);
					objVRVehicleRecord.setVehicleRecordStatus(vehicleRecordStatus);
					objVRVehicleRecord.setPrintingStatus(printingStatus);
					objVRVehicleRecord.setAttachedFile(attachedFile);
					objVRVehicleRecord.setSignName(signName);
					objVRVehicleRecord.setSignTitle(signTitle);
					objVRVehicleRecord.setSignPlace(signPlace);
					objVRVehicleRecord.setSignDate(signDate);
					*/
					
					objVRVehicleRecord.setModifyDate(new Date());
					objVRVehicleRecord.setSyncDate(new Date());
					
					VRVehicleRecordLocalServiceUtil.addVRVehicleRecord(objVRVehicleRecord);
				}
				
				// Them bang ke linh kien
				for (int k=0; k < sizeOfVRIssueEquipmentCertificate;) {
					long idVRIssueEquipmentCertificate = CounterLocalServiceUtil.increment(VRIssueEquipmentCertificate.class.getName());
					objVRIssueEquipmentCertificate = new VRIssueEquipmentCertificateImpl();
					objVRIssueEquipmentCertificate.setId(idVRIssueEquipmentCertificate);;
					objVRIssueEquipmentCertificate.setMtcore(1);
					objVRIssueEquipmentCertificate.setIssueId(objVRIssue.getId());
					objVRIssueEquipmentCertificate.setIssueVehicleCertificateId(objVRIssueVehiclecertificate.getId());
/*					objVRIssueEquipmentCertificate.setVehiclecertificaterecordno(vehiclecertificaterecordno);
					objVRIssueEquipmentCertificate.setEquipmentName(equipmentName);
					objVRIssueEquipmentCertificate.setEquipmentType(equipmentType);
					objVRIssueEquipmentCertificate.setEquipmentCertificateType(equipmentCertificateType);
					objVRIssueEquipmentCertificate.setEquipmentDocumentNo(equipmentDocumentNo);
					objVRIssueEquipmentCertificate.setEquipmentCertificateRecordNo(equipmentCertificateRecordNo);
					objVRIssueEquipmentCertificate.setEquipmentExamRecordNo(equipmentExamRecordNo);
					objVRIssueEquipmentCertificate.setEquipmentCertificateRecordId(EquipmentCertificateRecordId);
					objVRIssueEquipmentCertificate.setTotalQuantity(TotalQuantity);
					objVRIssueEquipmentCertificate.setTotalProductUsed(TotalProductUsed);
					objVRIssueEquipmentCertificate.setTotalInUse(TotalInUse);
					objVRIssueEquipmentCertificate.setTotalNotUsed(TotalNotUsed);
					objVRIssueEquipmentCertificate.setApplicantNo(applicantNo);
					objVRIssueEquipmentCertificate.setApplicantname(applicantname);
					objVRIssueEquipmentCertificate.setApplicantaddress(applicantaddress);
					objVRIssueEquipmentCertificate.setProductionplantname(productionplantname);
					objVRIssueEquipmentCertificate.setProductionplantaddress(productionplantaddress);*/
		
					
					objVRIssueEquipmentCertificate.setModifyDate(new Date());
					objVRIssueEquipmentCertificate.setSyncDate(new Date());
					
					
					VRIssueEquipmentCertificateLocalServiceUtil.addVRIssueEquipmentCertificate(objVRIssueEquipmentCertificate);
				}
				
			}
			
	
			return "";	
		} catch (SystemException e) {
			_log.error(e);
			return "";
		}
	}
	
	private JSONObject getValueFormData(String fileTemplateNo, long dossierId) {
		DossierFile dossierFile = new DossierFileImpl();
		JSONObject formValue = JSONFactoryUtil.createJSONObject();
		
		try {
			dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(dossierId, fileTemplateNo, 2,
					false, new DossierFileComparator(false, "createDate", Date.class));

			if (Validator.isNotNull(dossierFile)) {				
				formValue = JSONFactoryUtil.createJSONObject(dossierFile.getFormData());				
			}

		} catch (Exception e) {
			_log.info("File " + fileTemplateNo + " is null or json is not correct");
		}

		return formValue;
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


	
	
	}
