package org.opencps.thirdparty.system.scheduler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.datamgt.utils.DateTimeUtils;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.model.ServiceInfo;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceInfoLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
import org.opencps.thirdparty.system.constants.SyncServerTerm;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueInputModel;
import org.opencps.thirdparty.system.model.ThirdPartyDossierSync;
import org.opencps.thirdparty.system.nsw.model.AttachedFile;
import org.opencps.thirdparty.system.nsw.model.Envelope;
import org.opencps.thirdparty.system.nsw.model.GMSInterRoadTransportLicence;
import org.opencps.thirdparty.system.nsw.model.GMSInterRoadTransportLicence.AllocatedNumber;
import org.opencps.thirdparty.system.nsw.model.IssuingAuthority;
import org.opencps.thirdparty.system.util.OutsideSystemConverter;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

public class BGTVT0600058 {
	private static Log _log = LogFactoryUtil.getLog(BGTVT0600058.class);
	
	public static MessageQueueInputModel convertResult(Dossier dossier, ThirdPartyDossierSync dossierSync, Envelope envelope, String type, String function) throws PortalException {
		long dossierActionId = dossierSync.getMethod() == 0 ? dossierSync.getClassPK() : 0;
		String jaxRsPublicUrl = PrefsPropsUtil.getString(SyncServerTerm.JAXRS_PUBLIC_URL);

		GMSInterRoadTransportLicence gmsInterRoadTransportLicense = new GMSInterRoadTransportLicence();
		AttachedFile attachedFile = new AttachedFile();
		List<AttachedFile> lstFiles = new ArrayList<>();

		MessageQueueInputModel model = new MessageQueueInputModel();
		model.setContent("");
		model.setSender("BGTVT");
		model.setReceiver("NSW");
		model.setPersonSignature("");
		model.setSystemSignature("");
		model.setStatus(0);
		model.setMessageId(PortalUUIDUtil.generate());
		model.setFromName("BGTVT");
		model.setFromCountryCode("VN");
		model.setFromMinistryCode("BGTVT");
		model.setFromOrganizationCode("TCDBVN");
		model.setFromUnitCode("");
		model.setFromIdentity("");
		model.setToName("NSW");
		model.setToCountryCode("VN");
		model.setToIdentity("");
		model.setToMinistryCode("NSW");
		model.setToOrganizationCode("NSW");
		model.setToUnitCode("");
		model.setDocumentType(dossier.getServiceCode());
		model.setType(type);
		model.setFunction(function);
		Calendar cal = Calendar.getInstance();
		
		if (dossier.getReceiveDate() != null) {
			cal.setTime(dossier.getReceiveDate());
		} else {
			cal.setTime(dossier.getCreateDate());
		}
		model.setDocumentYear(cal.get(Calendar.YEAR));
		
		model.setReference(dossier.getReferenceUid());
		model.setPreReference(dossier.getReferenceUid());
		model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
		model.setRetryCount(0);
		model.setDirection(2);

		List<DossierFile> dossierFileList = DossierFileLocalServiceUtil
				.getAllDossierFile(dossier.getDossierId());

		String templateNo = StringPool.BLANK;
		String partNo = StringPool.BLANK;
		int partType = 2;
		boolean eSign = true;
		String deliverableCode = StringPool.BLANK;

		ServiceInfo serviceInfo = ServiceInfoLocalServiceUtil.getByCode(dossier.getGroupId(),
				dossier.getServiceCode());
		ServiceConfig serviceConfig = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(
				dossier.getGroupId(), serviceInfo.getServiceCode(), dossier.getGovAgencyCode());

		ProcessOption processOption = ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(
				dossier.getGroupId(), dossier.getDossierTemplateNo(),
				serviceConfig.getServiceConfigId());

		ServiceProcess serviceProcess = ServiceProcessLocalServiceUtil
				.fetchServiceProcess(processOption.getServiceProcessId());
		DossierAction dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierActionId);

		ProcessAction processAction = ProcessActionLocalServiceUtil.fetchBySPID_AC(
				serviceProcess.getServiceProcessId(), dossierAction.getActionCode());

		for (DossierFile dossierFile : dossierFileList) {
			templateNo = dossierFile.getFileTemplateNo();
			partNo = dossierFile.getDossierPartNo();

			String returnDossierFiles = processAction.getReturnDossierFiles();
			String[] returnDossierFilesArr = StringUtil.split(returnDossierFiles);
			for (String returnDossierFile : returnDossierFilesArr) {
				
				if (templateNo.equals(returnDossierFile)) {
					attachedFile = new AttachedFile();
					attachedFile.setAttachedNote("");
					attachedFile.setAttachedTypeCode(templateNo);
					attachedFile.setAttachedTypeName(partNo);
					attachedFile.setFullFileName(dossierFile.getDisplayName());

					lstFiles.add(attachedFile);

					String linkCongVan = jaxRsPublicUrl + "dossiers/" + dossier.getDossierId()
							+ "/files/" + dossierFile.getReferenceUid();
					if (dossier.getPassword() != null) {
						linkCongVan += "/public/" + dossier.getPassword();
					}
					attachedFile.setFileURL(linkCongVan);

//					if (dossierFile.getFileEntryId() > 0) {
//						FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dossierFile.getFileEntryId());
//
//						File file = DLFileEntryLocalServiceUtil.getFile(fileEntry.getFileEntryId(), fileEntry.getVersion(),
//								true);
//						
//				        String encodedBase64 = null;
//				        try {
//				            FileInputStream fileInputStreamReader = new FileInputStream(file);
//				            byte[] bytes = new byte[(int)file.length()];
//				            fileInputStreamReader.read(bytes);
//				            encodedBase64 = new String(Base64.getEncoder().encodeToString(bytes));
//				            
//				            fileInputStreamReader.close();
//				        } catch (FileNotFoundException e) {
//				            e.printStackTrace();
//				        } catch (IOException e) {
//				            e.printStackTrace();
//				        }						
//				        
//					}
					
					JSONObject formDataObj = JSONFactoryUtil
							.createJSONObject(dossierFile.getFormData());
					
					if (formDataObj.has("Itinerary")) {
						String itineraryStr = formDataObj.getString("Itinerary");
						Date itineraryDate = DateTimeUtils.convertStringToDate(itineraryStr);
						
						gmsInterRoadTransportLicense.setItinerary(DateTimeUtils.convertDateToString(itineraryDate, DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					else {
						gmsInterRoadTransportLicense.setItinerary(DateTimeUtils.convertDateToString(new Date(), DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					if (formDataObj.has("PermitNo")) {
						gmsInterRoadTransportLicense.setPermitNo(formDataObj.getString("PermitNo"));						
					}
					else {
						gmsInterRoadTransportLicense.setPermitNo(formDataObj.getString("PermitNo"));						
					}
					if (formDataObj.has("CountryCode")) {
						gmsInterRoadTransportLicense.setCountryCode(formDataObj.getString("CountryCode"));						
					}
					else {
						gmsInterRoadTransportLicense.setCountryCode(formDataObj.getString("CountryCode"));						
					}
					if (formDataObj.has("PermitNumber")) {
						gmsInterRoadTransportLicense.setPermitNumber(formDataObj.getString("PermitNumber"));						
					}
					else {
						gmsInterRoadTransportLicense.setPermitNumber(formDataObj.getString("PermitNumber"));						
					}
					if (formDataObj.has("BarCode")) {
						gmsInterRoadTransportLicense.setBarCode(formDataObj.getString("BarCode"));						
					}
					else {
						gmsInterRoadTransportLicense.setBarCode(formDataObj.getString("BarCode"));						
					}
					
					if (formDataObj.has("ScheduledPassenger")) {
						gmsInterRoadTransportLicense.getTypeOfPermit().setScheduledPassenger(formDataObj.getString("ScheduledPassenger"));
					}
					if (formDataObj.has("NonScheduledPassenger")) {
						gmsInterRoadTransportLicense.getTypeOfPermit().setNonScheduledPassenger(formDataObj.getString("NonScheduledPassenger"));
					}
					if (formDataObj.has("Cargo")) {
						gmsInterRoadTransportLicense.getTypeOfPermit().setCargo(formDataObj.getString("Cargo"));
					}
					if (formDataObj.has("IssuingAuthorityName")) {
						gmsInterRoadTransportLicense.setIssuingAuthorityName(formDataObj.getString("IssuingAuthorityName"));
					}
					if (formDataObj.has("IssuingAuthorityAddress")) {
						gmsInterRoadTransportLicense.setIssuingAuthorityAddress(formDataObj.getString("IssuingAuthorityAddress"));
					}
					if (formDataObj.has("IssuingAuthorityContact")) {
						gmsInterRoadTransportLicense.setIssuingAuthorityContact(formDataObj.getString("IssuingAuthorityContact"));
					}
					if (formDataObj.has("BeneficiaryName")) {
						gmsInterRoadTransportLicense.setBeneficiaryName(formDataObj.getString("BeneficiaryName"));
					}
					if (formDataObj.has("BeneficiaryAddress")) {
						gmsInterRoadTransportLicense.setBeneficiaryAddress(formDataObj.getString("BeneficiaryAddress"));
					}
					if (formDataObj.has("BeneficiaryContact")) {
						gmsInterRoadTransportLicense.setBeneficiaryContact(formDataObj.getString("BeneficiaryContact"));
					}
					if (formDataObj.has("LicenceNumber")) {
						gmsInterRoadTransportLicense.setLicenceNumber(formDataObj.getString("LicenceNumber"));
					}
					if (formDataObj.has("FrequencyOperations ")) {
						gmsInterRoadTransportLicense.setFrequencyOperations(formDataObj.getString("FrequencyOperations "));
					}
					if (formDataObj.has("MaximumCapacity")) {
						gmsInterRoadTransportLicense.setMaximumCapacity(formDataObj.getString("MaximumCapacity"));
					}
					if (formDataObj.has("OtherRestrictions")) {
						gmsInterRoadTransportLicense.setOtherRestrictions(formDataObj.getString("OtherRestrictions"));
					}
					if (formDataObj.has("PeriodValidityFrom")) {
						gmsInterRoadTransportLicense.setPeriodValidityFrom(formDataObj.getString("PeriodValidityFrom"));
					}
					if (formDataObj.has("PeriodValidityTo")) {
						gmsInterRoadTransportLicense.setPeriodValidityTo(formDataObj.getString("PeriodValidityTo"));
					}
					AllocatedNumber allocatedNumber = new AllocatedNumber();
					if (formDataObj.has("Order")) {
						allocatedNumber.setOrder(formDataObj.getString("Order"));
					}
					if (formDataObj.has("VehicleType")) {
						allocatedNumber.setVehicleType(formDataObj.getString("VehicleType"));
					}
					if (formDataObj.has("AllocatedNo")) {
						allocatedNumber.setAllocatedNo(formDataObj.getString("AllocatedNo"));
					}
					IssuingAuthority issuingAuthority = new IssuingAuthority();
					if (formDataObj.has("SignName")) {
						issuingAuthority.setSignName(formDataObj.getString("SignName"));						
					}
					else {
						issuingAuthority.setSignName("Nguyễn Tô An");						
					}
					if (formDataObj.has("SignDate")) {
						String signDateStr = formDataObj.getString("SignDate");
						Date signDate = DateTimeUtils.convertStringToDate(signDateStr);
						
						issuingAuthority.setSignDate(DateTimeUtils.convertDateToString(signDate, DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					else {
						issuingAuthority.setSignDate(DateTimeUtils.convertDateToString(new Date(), DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					if (formDataObj.has("SignPlace")) {
						issuingAuthority.setSignPlace(formDataObj.getString("SignPlace"));						
					}
					else {
						issuingAuthority.setSignPlace("Hà Nội");						
					}
					if (formDataObj.has("SignTitle")) {
						issuingAuthority.setSignTitle(formDataObj.getString("SignTitle"));						
					}
					else {
						issuingAuthority.setSignTitle("Cục trưởng");												
					}
					
					gmsInterRoadTransportLicense.setIssuingAuthority(issuingAuthority);
					
				}
			}
		}

		gmsInterRoadTransportLicense.getAttachedFile().addAll(lstFiles);
		envelope.getBody().getContent().setGMSInterRoadTransportLicence(gmsInterRoadTransportLicense);

		String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);

		model.setRawMessage(rawMessage);
		
		return model;
	}
}
