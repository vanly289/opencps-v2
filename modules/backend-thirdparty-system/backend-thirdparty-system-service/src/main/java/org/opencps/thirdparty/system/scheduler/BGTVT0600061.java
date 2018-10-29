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
import org.opencps.thirdparty.system.nsw.model.GMSCrossBorderTransportPermit;
import org.opencps.thirdparty.system.nsw.model.IssuingAuthority;
import org.opencps.thirdparty.system.util.OutsideSystemConverter;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

public class BGTVT0600061 {
	private static String DUMMY_DATA = "1";
	
	public static List<MessageQueueInputModel> convertResult(Dossier dossier, ThirdPartyDossierSync dossierSync, Envelope envelope, String type, String function) throws PortalException {
		long dossierActionId = dossierSync.getMethod() == 0 ? dossierSync.getClassPK() : 0;
		String jaxRsPublicUrl = PrefsPropsUtil.getString(SyncServerTerm.JAXRS_PUBLIC_URL);

		GMSCrossBorderTransportPermit gmsCrossBorderTransportPermit = new GMSCrossBorderTransportPermit();

		List<MessageQueueInputModel> lstResults = new ArrayList<>();
		
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
					model.setReference(dossier.getReferenceUid());
					model.setPreReference(dossier.getReferenceUid());
					model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
					model.setRetryCount(0);
					model.setDirection(2);
					Calendar cal = Calendar.getInstance();
					
					if (dossier.getReceiveDate() != null) {
						cal.setTime(dossier.getReceiveDate());
					} else {
						cal.setTime(dossier.getCreateDate());
					}
					model.setDocumentYear(cal.get(Calendar.YEAR));
					
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
					JSONObject formDataObj = JSONFactoryUtil
							.createJSONObject(dossierFile.getFormData());
					gmsCrossBorderTransportPermit.setLicenceNo(dossierFile.getDeliverableCode());
					if (formDataObj.has("ValidUntil")) {
						String validUntilStr = formDataObj.getString("ValidUntil");
						Date validUntilDate = DateTimeUtils.convertStringToDate(validUntilStr);

						gmsCrossBorderTransportPermit.setValidUntil(DateTimeUtils.convertDateToString(validUntilDate, DateTimeUtils._NSW_DATE_TIME_FORMAT));
						
					}
					else {
						gmsCrossBorderTransportPermit.setValidUntil(DateTimeUtils.convertDateToString(new Date(), DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					if (formDataObj.has("RegistrationNumber")) {
						gmsCrossBorderTransportPermit.setRegistrationNumber(formDataObj.getString("RegistrationNumber"));						
					}
					else {
						gmsCrossBorderTransportPermit.setRegistrationNumber(DUMMY_DATA);
					}
					if (formDataObj.has("ManufacturedYear")) {
						gmsCrossBorderTransportPermit.setManufacturedyear(formDataObj.getString("ManufacturedYear"));						
					}
					else {
						gmsCrossBorderTransportPermit.setManufacturedyear(DUMMY_DATA);
					}
					if (formDataObj.has("TrademarkCode")) {
						gmsCrossBorderTransportPermit.setTrademarkCode(formDataObj.getString("TrademarkCode"));						
					}
					else {
						gmsCrossBorderTransportPermit.setTrademarkCode(DUMMY_DATA);
					}
					if (formDataObj.has("TrademarkName")) {
						gmsCrossBorderTransportPermit.setTrademarkName(formDataObj.getString("TrademarkName"));						
					}
					else {
						gmsCrossBorderTransportPermit.setTrademarkName(DUMMY_DATA);
					}
					if (formDataObj.has("Model")) {
						gmsCrossBorderTransportPermit.setModel(formDataObj.getString("Model"));
					}
					if (formDataObj.has("Truck")) {
						gmsCrossBorderTransportPermit.getVehicleType().setTruck(formDataObj.getString("Truck"));
					}
					if (formDataObj.has("Bus")) {
						gmsCrossBorderTransportPermit.getVehicleType().setBus(formDataObj.getString("Bus"));
					}
					if (formDataObj.has("Others")) {
						gmsCrossBorderTransportPermit.getVehicleType().setOthers(formDataObj.getString("Others"));
					}
					if (formDataObj.has("VehicleColor")) {
						gmsCrossBorderTransportPermit.setVehicleColor(formDataObj.getString("VehicleColor"));
					}
					if (formDataObj.has("EngineNumber")) {
						gmsCrossBorderTransportPermit.setEngineNumber(formDataObj.getString("EngineNumber"));
					}
					if (formDataObj.has("ChassisNumber")) {
						gmsCrossBorderTransportPermit.setChassisNumber(formDataObj.getString("ChassisNumber"));
					}
					if (formDataObj.has("NameOfCompany")) {
						gmsCrossBorderTransportPermit.setNameOfCompany(formDataObj.getString("NameOfCompany"));
					}
					if (formDataObj.has("Address")) {
						gmsCrossBorderTransportPermit.setAddress(formDataObj.getString("Address"));
					}
					if (formDataObj.has("Tel")) {
						gmsCrossBorderTransportPermit.setTel(formDataObj.getString("Tel"));
					}
					if (formDataObj.has("Fax")) {
						gmsCrossBorderTransportPermit.setFax(formDataObj.getString("Fax"));
					}
					StringBuilder transportOperation = new StringBuilder();
					if (formDataObj.has("IsFixedRoadTransport")) {
						if ("1".equals(formDataObj.getString("IsFixedRoadTransport"))) {
							if (transportOperation.toString().isEmpty()) {
								transportOperation.append("Vận tải hành khách bằng ô tô theo tuyến cố định");
							}
							else {
								transportOperation.append(",Vận tải hành khách bằng ô tô theo tuyến cố định");
							}
						}
					}
					if (formDataObj.has("IsContractRoadTransport")) {
						if ("1".equals(formDataObj.getString("IsContractRoadTransport"))) {
							if (transportOperation.toString().isEmpty()) {
								transportOperation.append("Vận tải hành khách theo hợp đồng");
							}
							else {
								transportOperation.append(",Vận tải hành khách theo hợp đồng");
							}
						}
					}
					if (formDataObj.has("IsPassengerTransport")) {
						if ("1".equals(formDataObj.getString("IsPassengerTransport"))) {
							if (transportOperation.toString().isEmpty()) {
								transportOperation.append("Vận tải khách du lịch bằng xe ô tô");
							}
							else {
								transportOperation.append(",Vận tải khách du lịch bằng xe ô tô");
							}
						}
					}
					if (formDataObj.has("IsCargoTransport")) {
						if ("1".equals(formDataObj.getString("IsCargoTransport"))) {
							if (transportOperation.toString().isEmpty()) {
								transportOperation.append("Vận tải hàng hóa bằng xe ô tô");
							}
							else {
								transportOperation.append(",Vận tải hàng hóa bằng xe ô tô");
							}
						}
					}
					if (formDataObj.has("IsTaxiTransport")) {
						if ("1".equals(formDataObj.getString("IsTaxiTransport"))) {
							if (transportOperation.toString().isEmpty()) {
								transportOperation.append("Vận tải hành khách bằng xe taxi");
							}
							else {
								transportOperation.append(",Vận tải hành khách bằng xe taxi");
							}
						}
					}
					gmsCrossBorderTransportPermit.setTransportOperation(transportOperation.toString());
					if (formDataObj.has("TransportOperation")) {
						gmsCrossBorderTransportPermit.setTransportOperation(formDataObj.getString("TransportOperation"));
					}
					
					if (formDataObj.has("ExpiredDate")) {
						String expiredDateStr = formDataObj.getString("ExpiredDate");
						Date expiredDate = DateTimeUtils.convertStringToDate(expiredDateStr);
						
						gmsCrossBorderTransportPermit.setExpiredDate(DateTimeUtils.convertDateToString(expiredDate, DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					else {
						gmsCrossBorderTransportPermit.setExpiredDate(DateTimeUtils.convertDateToString(new Date(), DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					
					if (formDataObj.has("ValidFrom")) {
						String validFromStr = formDataObj.getString("ValidFrom");
						Date validFromDate = DateTimeUtils.convertStringToDate(validFromStr);
						
						gmsCrossBorderTransportPermit.setValidFrom(DateTimeUtils.convertDateToString(validFromDate, DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					else {
						gmsCrossBorderTransportPermit.setValidFrom(DateTimeUtils.convertDateToString(new Date(), DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}

					if (formDataObj.has("ValidUntil")) {
						String validUntilStr = formDataObj.getString("ValidUntil");
						Date validUntilDate = DateTimeUtils.convertStringToDate(validUntilStr);
						
						gmsCrossBorderTransportPermit.setValidUntil(DateTimeUtils.convertDateToString(validUntilDate, DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					else {
						gmsCrossBorderTransportPermit.setValidUntil(DateTimeUtils.convertDateToString(new Date(), DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					
					if (formDataObj.has("TravelingArea")) {
						gmsCrossBorderTransportPermit.setTravelingArea(formDataObj.getString("TravelingArea"));
					}

					if (formDataObj.has("Destination")) {
						gmsCrossBorderTransportPermit.setDestination(formDataObj.getString("Destination"));
					}

					if (formDataObj.has("LicenceNoGMS ")) {
						gmsCrossBorderTransportPermit.setLicenceNoGMS(formDataObj.getString("LicenceNoGMS "));
					}

					if (formDataObj.has("ExpireDateGMS ")) {
						String expireDateGMSStr = formDataObj.getString("ExpireDateGMS ");
						Date expireDateGMSDate = DateTimeUtils.convertStringToDate(expireDateGMSStr);
						
						gmsCrossBorderTransportPermit.setExpireDateGMS(DateTimeUtils.convertDateToString(expireDateGMSDate, DateTimeUtils._NSW_DATE_TIME_FORMAT));						
					}
					else {
						gmsCrossBorderTransportPermit.setExpireDateGMS(DateTimeUtils.convertDateToString(new Date(), DateTimeUtils._NSW_DATE_TIME_FORMAT));						
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
					
					gmsCrossBorderTransportPermit.setIssuingAuthority(issuingAuthority);
					gmsCrossBorderTransportPermit.getAttachedFile().addAll(lstFiles);
					envelope.getBody().getContent().setGMSCrossBorderTransportPermit(gmsCrossBorderTransportPermit);

					String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);

					model.setRawMessage(rawMessage);
					
					lstResults.add(model);
				}
			}
		}

		return lstResults;
	}
}
