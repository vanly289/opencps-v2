package org.opencps.thirdparty.system.scheduler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.dossiermgt.model.Deliverable;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierPart;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.model.ServiceInfo;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.service.DeliverableLocalService;
import org.opencps.dossiermgt.service.DeliverableLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierActionLocalService;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalService;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalService;
import org.opencps.dossiermgt.service.DossierPartLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierSyncLocalService;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceInfoLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueDetailModel;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueInputModel;
import org.opencps.thirdparty.system.model.ThirdPartyDossierSync;
import org.opencps.thirdparty.system.nsw.model.AttachedFile;
import org.opencps.thirdparty.system.nsw.model.Body;
import org.opencps.thirdparty.system.nsw.model.Content;
import org.opencps.thirdparty.system.nsw.model.Envelope;
import org.opencps.thirdparty.system.nsw.model.From;
import org.opencps.thirdparty.system.nsw.model.Header;
import org.opencps.thirdparty.system.nsw.model.KetQuaXuLy;
import org.opencps.thirdparty.system.nsw.model.NSWRequest;
import org.opencps.thirdparty.system.nsw.model.RequestPayload;
import org.opencps.thirdparty.system.nsw.model.Subject;
import org.opencps.thirdparty.system.nsw.model.To;
import org.opencps.thirdparty.system.nsw.model.Transporter;
import org.opencps.thirdparty.system.nsw.model.VLInterRoadTransportLicence;
import org.opencps.thirdparty.system.rest.client.OpenCPSRestClient;
import org.opencps.thirdparty.system.rest.client.PrefsProperties;
import org.opencps.thirdparty.system.service.ThirdPartyDossierSyncLocalService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.liferay.document.library.kernel.util.DLUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

@Component(immediate = true, service = OutsideSystemSyncScheduler.class)
public class OutsideSystemSyncScheduler extends BaseSchedulerEntryMessageListener {
	@SuppressWarnings("deprecation")
	@Override
	protected void doReceive(Message message) throws Exception {
		_log.info("Starting sync with third party system is starting at  : " + APIDateTimeUtils.convertDateToString(new Date()));
		
		List<ThirdPartyDossierSync> lstSyncs = _thirdPartyDossierSyncLocalService.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		OpenCPSRestClient client = new OpenCPSRestClient(PrefsProperties.getJaxRsUrl());
		
		for (ThirdPartyDossierSync sync : lstSyncs) {
			if (sync.getMethod() == 0) {
				Dossier dossier = _dossierLocalService.fetchDossier(sync.getDossierId());
				ThirdPartyDossierSync dossierSync = _thirdPartyDossierSyncLocalService.fetchThirdPartyDossierSync(sync.getDossierSyncId());
				
				long dossierActionId = dossierSync.getMethod() == 0 ? dossierSync.getClassPK() : 0;
				
				NSWRequest nswRequest = new NSWRequest();
				RequestPayload requestPayload = new RequestPayload();
				
				nswRequest.setRequestPayload(requestPayload);
				
				nswRequest.setOfficeCode("BGTVT");
				Envelope envelope = new Envelope();
				Header header = new Header();
				envelope.setHeader(header);
				requestPayload.setEnvelope(envelope);
				From from = new From();
				from.setCountryCode("VN");
				from.setIdentity("BGTVT");
				from.setMinistryCode("BGTVT");
				header.setFrom(from);
				To to = new To();
				to.setName("NSW");
				to.setIdentity("NSW");
				to.setMinistryCode("NSW");
				Subject subject = new Subject();
				header.setSubject(subject);
				subject.setReference(dossier.getReferenceUid());
				subject.setPreReference(dossier.getReferenceUid());
				if (dossier.getReceiveDate() != null) {
					subject.setDocumentYear(dossier.getReceiveDate().getYear());					
				}
				else {
					subject.setDocumentYear(dossier.getCreateDate().getYear());					
				}
				Body body = new Body();
				envelope.setBody(body);
				Content content = new Content();
				body.setContent(content);
				KetQuaXuLy ketqua = new KetQuaXuLy();
				content.setKetQuaXuLy(ketqua);
				
				DossierAction dossierAction = _dossierActionLocalService.fetchDossierAction(dossierActionId);
				if (dossierAction != null) {
					if (dossierAction.getSyncActionCode().equals("1105")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(05);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						ketqua.setSoTn("");
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());

						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());
						
						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setRawMessage(rawMessage);
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("11");
						model.setFunction("05");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());
							
							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}				
					}
					else if (dossierAction.getSyncActionCode().equals("1106")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(06);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						ketqua.setSoTn("");
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());

						List<DossierFile> dossierFileList = DossierFileLocalServiceUtil.getAllDossierFile(dossier.getDossierId());

						String partNo = StringPool.BLANK;
						ProcessAction processAction = ProcessActionLocalServiceUtil.fetchProcessAction(dossierActionId);
						
						for (DossierFile dossierFile : dossierFileList) {
							partNo = dossierFile.getDossierPartNo();
							String returnDossierFiles = processAction.getReturnDossierFiles();
							String[] returnDossierFilesArr = StringUtil.split(returnDossierFiles);
							for (String returnDossierFile : returnDossierFilesArr) {
								if (partNo.equals(returnDossierFile)) {
									ketqua.setLinkCongvan("");
								}
							}
						}
						
						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());

						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setRawMessage(rawMessage);
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("11");
						model.setFunction("06");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					}
					else if (dossierAction.getSyncActionCode().equals("1114")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(05);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						ketqua.setSoTn("");
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());

						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());

						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setRawMessage(rawMessage);
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("11");
						model.setFunction("14");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					}			
					else if (dossierAction.getSyncActionCode().equals("1117")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(05);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						ketqua.setSoTn("");
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());

						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());

						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setRawMessage(rawMessage);
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("11");
						model.setFunction("17");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					}			
					else if (dossierAction.getSyncActionCode().equals("1409")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(05);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						ketqua.setSoTn("");
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());
						
						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());

						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setRawMessage(rawMessage);
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("14");
						model.setFunction("09");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					}			
					else if (dossierAction.getSyncActionCode().equals("1410")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(05);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						ketqua.setSoTn("");
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());

						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());

						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setRawMessage(rawMessage);
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("14");
						model.setFunction("10");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					}			
					else if (dossierAction.getSyncActionCode().equals("1815")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(05);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						VLInterRoadTransportLicence vlInterRoadTransportLicense = new VLInterRoadTransportLicence();
						vlInterRoadTransportLicense.setLicenceNo("");
						vlInterRoadTransportLicense.setFirstRegistrationDate("");
						vlInterRoadTransportLicense.setValidUntil("");
						vlInterRoadTransportLicense.setTransportOperation("");
						Transporter transporter = new Transporter();
						vlInterRoadTransportLicense.setTransporter(transporter);
						transporter.setNameOfCompany("");
						transporter.setAddress("");
						transporter.setTel("");
						transporter.setFax("");
						transporter.setEmail("");
						transporter.setWebsite("");
						AttachedFile attachedFile = new AttachedFile();
						List<AttachedFile> lstFiles = new ArrayList<>();
						
						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("18");
						model.setFunction("15");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						List<DossierFile> dossierFileList = DossierFileLocalServiceUtil.getAllDossierFile(dossier.getDossierId());

						String templateNo = StringPool.BLANK;
						String partNo = StringPool.BLANK;
						int partType = 2;
						boolean eSign = true;
						String deliverableCode = StringPool.BLANK;
						
						ServiceInfo serviceInfo = ServiceInfoLocalServiceUtil.getByCode(dossier.getGroupId(), dossier.getServiceCode());
						ServiceConfig serviceConfig = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(dossier.getGroupId(), serviceInfo.getServiceCode(), dossier.getGovAgencyCode());
						
						ProcessOption processOption = ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(dossier.getGroupId(), dossier.getDossierTemplateNo(), serviceConfig.getServiceConfigId());
						
						ServiceProcess serviceProcess = ServiceProcessLocalServiceUtil.fetchServiceProcess(processOption.getServiceProcessId());
						ProcessAction processAction = ProcessActionLocalServiceUtil.fetchBySPID_AC(serviceProcess.getServiceProcessId(), dossierAction.getActionCode());
													
						for (DossierFile dossierFile : dossierFileList) {
							partNo = dossierFile.getDossierPartNo();
							templateNo = dossierFile.getFileTemplateNo();
							
							String returnDossierFiles = processAction.getReturnDossierFiles();
							
							String[] returnDossierFilesArr = StringUtil.split(returnDossierFiles);
							for (String returnDossierFile : returnDossierFilesArr) {
								if (templateNo.equals(returnDossierFile)) {
									attachedFile = new AttachedFile();
									attachedFile.setAttachedNote("");
									attachedFile.setAttachedTypeCode(partNo);
									attachedFile.setAttachedTypeName(templateNo);
									attachedFile.setFileURL("");
									attachedFile.setFullFileName(dossierFile.getDisplayName());
									
									lstFiles.add(attachedFile);
									
									DossierPart dossierPart = DossierPartLocalServiceUtil.getByPartTypeEsign (templateNo,
											partNo, partType, eSign);
									if (dossierPart != null) {
										List<DossierFile> dossierFileRefList = DossierFileLocalServiceUtil
												.getByReferenceUid(dossierFile.getReferenceUid());
										if (dossierFileRefList != null && dossierFileRefList.size() > 0) {
											for (DossierFile dof : dossierFileRefList) {
												deliverableCode = dof.getDeliverableCode();
												if (Validator.isNotNull(deliverableCode)) {
													Deliverable deli = DeliverableLocalServiceUtil.getByCodeAndState(deliverableCode, "2");
													if (deli != null) {
														String formData = StringPool.BLANK;
														formData = deli.getFormData();
													}
												}
											}
										}
									}									
								}
							}
						}

						vlInterRoadTransportLicense.getAttachedFile().addAll(lstFiles);
						content.setVLInterRoadTransportLicence(vlInterRoadTransportLicense);
						
						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());
						model.setRawMessage(rawMessage);
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					}
					else if (dossierAction.getSyncActionCode().equals("1613")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(05);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						ketqua.setSoTn("");
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());
						
						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());

						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setRawMessage(rawMessage);
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("16");
						model.setFunction("13");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					}			
					else if (dossierAction.getSyncActionCode().equals("1816")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType(11);
						subject.setFunction(05);
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						
						ketqua.setSoTn("");
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());
						
						String rawMessage = "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode><documentType>" + nswRequest.getDocumentType() + "</documentType>" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());

						MessageQueueInputModel model = new MessageQueueInputModel();
						model.setRawMessage(rawMessage);
						model.setContent("");
						model.setSender("BGTVT");
						model.setReceiver("NSW");
						model.setPersonSignature("");
						model.setSystemSignature("");
						model.setStatus(1);
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
						model.setType("18");
						model.setFunction("16");
						model.setReference(dossier.getReferenceUid());
						model.setDocumentYear(dossier.getCreateDate().getYear());
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);
						
						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());
							
							DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
							}
							
							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					}
					else {
						long clientDossierActionId = (dossierSync.getMethod() == 0 ? dossierSync.getClassPK() : dossierSync.getMethod());
						
						DossierAction foundAction = DossierActionLocalServiceUtil.fetchDossierAction(clientDossierActionId);
						if (foundAction != null) {
							DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);				
						}
						
						_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

						_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());				
					}				
				}				
			}
		}
		
		_log.info("Sync with third party system finished at  : " + APIDateTimeUtils.convertDateToString(new Date()));
	}
	
	@Activate
	@Modified
	protected void activate() {
		schedulerEntryImpl.setTrigger(
				TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(), 15, TimeUnit.SECOND));
		_schedulerEngineHelper.register(this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
	}

	@Deactivate
	protected void deactivate() {
		_schedulerEngineHelper.unregister(this);
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {

		_schedulerEngineHelper = schedulerEngineHelper;
	}

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {
	}

	private SchedulerEngineHelper _schedulerEngineHelper;

	@Reference
	private DossierLocalService _dossierLocalService;
	
	@Reference
	private ThirdPartyDossierSyncLocalService _thirdPartyDossierSyncLocalService;
	
	@Reference
	private DossierSyncLocalService _dossierSyncLocalService;
	
	@Reference
	private DossierFileLocalService _dossierFileLocalService;
	
	@Reference
	private DeliverableLocalService _deliverableLocalService;
	
	@Reference
	private DossierActionLocalService _dossierActionLocalService;
	
	private Log _log = LogFactoryUtil.getLog(OutsideSystemSyncScheduler.class);	
}
