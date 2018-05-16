package org.opencps.thirdparty.system.scheduler;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.model.ServiceInfo;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.service.DeliverableLocalService;
import org.opencps.dossiermgt.service.DossierActionLocalService;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalService;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalService;
import org.opencps.dossiermgt.service.DossierSyncLocalService;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceInfoLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
import org.opencps.thirdparty.system.constants.SyncServerTerm;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueDetailModel;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueInputModel;
import org.opencps.thirdparty.system.model.ThirdPartyDossierSync;
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
import org.opencps.thirdparty.system.rest.client.OpenCPSRestClient;
import org.opencps.thirdparty.system.rest.client.PrefsProperties;
import org.opencps.thirdparty.system.service.ThirdPartyDossierSyncLocalService;
import org.opencps.thirdparty.system.util.OutsideSystemConverter;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

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
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

@Component(immediate = true, service = OutsideSystemSyncScheduler.class)
public class OutsideSystemSyncScheduler extends BaseSchedulerEntryMessageListener {
	@SuppressWarnings("deprecation")
	@Override
	protected void doReceive(Message message) throws Exception {
		_log.info("Starting sync with third party system is starting at  : "
				+ APIDateTimeUtils.convertDateToString(new Date()));

		List<ThirdPartyDossierSync> lstSyncs = _thirdPartyDossierSyncLocalService.findAll(QueryUtil.ALL_POS,
				QueryUtil.ALL_POS);

		OpenCPSRestClient client = new OpenCPSRestClient(PrefsProperties.getJaxRsUrl());
		String jaxRsPublicUrl = PrefsPropsUtil.getString(SyncServerTerm.JAXRS_PUBLIC_URL);

		for (ThirdPartyDossierSync sync : lstSyncs) {
			if (sync.getMethod() == 0) {
				Dossier dossier = _dossierLocalService.fetchDossier(sync.getDossierId());
				ThirdPartyDossierSync dossierSync = _thirdPartyDossierSyncLocalService
						.fetchThirdPartyDossierSync(sync.getDossierSyncId());

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
				from.setOrganizationCode("TCDBVN");
				if (!dossier.getGovAgencyCode().equals("TCDBVN")) {
					from.setUnitCode(dossier.getGovAgencyCode());					
				}
				header.setFrom(from);
				To to = new To();
				to.setName(dossier.getApplicantName());
				to.setIdentity(dossier.getApplicantIdNo());
				to.setMinistryCode("BTC");
				to.setOrganizationCode("BTC");
				to.setUnitCode("BTC");
				header.setTo(to);
				org.opencps.thirdparty.system.nsw.model.Reference reference = new org.opencps.thirdparty.system.nsw.model.Reference();

				reference.setVersion("1.0");
				reference.setMessageId(PortalUUIDUtil.generate());

				header.setReference(reference);

				Subject subject = new Subject();
				subject.setDocumentType(dossier.getServiceCode());

				header.setSubject(subject);
				subject.setReference(dossier.getReferenceUid());
				subject.setPreReference(dossier.getReferenceUid());
				Calendar cal = Calendar.getInstance();

				if (dossier.getReceiveDate() != null) {
					cal.setTime(dossier.getReceiveDate());
					subject.setDocumentYear(cal.get(Calendar.YEAR));
				} else {
					cal.setTime(dossier.getCreateDate());
					subject.setDocumentYear(cal.get(Calendar.YEAR));
				}
				Body body = new Body();
				envelope.setBody(body);
				Content content = new Content();
				body.setContent(content);

				DossierAction dossierAction = _dossierActionLocalService.fetchDossierAction(dossierActionId);
				if (dossierAction != null) {
					if (dossierAction.getSyncActionCode().equals("1105")) {
						nswRequest.setDocumentType(dossier.getServiceCode());

						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("11");
						subject.setFunction("05");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						KetQuaXuLy ketqua = new KetQuaXuLy();
						content.setKetQuaXuLy(ketqua);
						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());

//						String rawMessage = OutsideSystemConverter.convertToNSWXML(nswRequest);
						body.setPersonSignature("");
						envelope.setSystemSignature("");
						String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);
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
						cal.setTime(dossier.getCreateDate());
						model.setDocumentYear(cal.get(Calendar.YEAR));
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						model.setRetryCount(1);
						model.setDirection(2);

						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());

							DossierAction foundAction = DossierActionLocalServiceUtil
									.fetchDossierAction(clientDossierActionId);

							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
							}

							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					} else if (dossierAction.getSyncActionCode().equals("1106")) {
						nswRequest.setDocumentType(dossier.getServiceCode());

						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("11");
						subject.setFunction("06");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						KetQuaXuLy ketqua = new KetQuaXuLy();
						content.setKetQuaXuLy(ketqua);

						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());

						body.setPersonSignature("");
						envelope.setSystemSignature("");

						List<DossierFile> dossierFileList = DossierFileLocalServiceUtil
								.getAllDossierFile(dossier.getDossierId());

						String templateNo = StringPool.BLANK;

						ServiceInfo serviceInfo = ServiceInfoLocalServiceUtil.getByCode(dossier.getGroupId(),
								dossier.getServiceCode());
						ServiceConfig serviceConfig = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(
								dossier.getGroupId(), serviceInfo.getServiceCode(), dossier.getGovAgencyCode());

						ProcessOption processOption = ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(
								dossier.getGroupId(), dossier.getDossierTemplateNo(),
								serviceConfig.getServiceConfigId());

						ServiceProcess serviceProcess = ServiceProcessLocalServiceUtil
								.fetchServiceProcess(processOption.getServiceProcessId());
						ProcessAction processAction = ProcessActionLocalServiceUtil
								.fetchBySPID_AC(serviceProcess.getServiceProcessId(), dossierAction.getActionCode());

						for (DossierFile dossierFile : dossierFileList) {
							templateNo = dossierFile.getFileTemplateNo();

							String returnDossierFiles = processAction.getReturnDossierFiles();
							String[] returnDossierFilesArr = StringUtil.split(returnDossierFiles);
							for (String returnDossierFile : returnDossierFilesArr) {
								if (templateNo.equals(returnDossierFile)) {
									String linkCongVan = jaxRsPublicUrl + "dossiers/" + dossier.getDossierId()
											+ "/files/" + dossierFile.getReferenceUid();
									if (dossier.getPassword() != null) {
										linkCongVan += "/public/" + dossier.getPassword();
									}
									ketqua.setLinkCongvan(linkCongVan);
								}
							}
						}

//						String rawMessage = OutsideSystemConverter.convertToNSWXML(nswRequest);

						String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);
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
						cal.setTime(dossier.getCreateDate());
						model.setDocumentYear(cal.get(Calendar.YEAR));
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));
						model.setRetryCount(1);
						model.setDirection(2);

						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());

							DossierAction foundAction = DossierActionLocalServiceUtil
									.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
							}

							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					} else if (dossierAction.getSyncActionCode().equals("1114")) {
						nswRequest.setDocumentType(dossier.getServiceCode());

						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("11");
						subject.setFunction("14");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						KetQuaXuLy ketqua = new KetQuaXuLy();
						content.setKetQuaXuLy(ketqua);

						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());

//						String rawMessage = OutsideSystemConverter.convertToNSWXML(nswRequest);

						body.setPersonSignature("");
						envelope.setSystemSignature("");

						String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);
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
						if (dossier.getReceiveDate() != null) {
							cal.setTime(dossier.getReceiveDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						} else {
							cal.setTime(dossier.getCreateDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						}
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);

						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());

							DossierAction foundAction = DossierActionLocalServiceUtil
									.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
							}

							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					} else if (dossierAction.getSyncActionCode().equals("1117")) {
						nswRequest.setDocumentType(dossier.getServiceCode());

						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("11");
						subject.setFunction("17");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						KetQuaXuLy ketqua = new KetQuaXuLy();
						content.setKetQuaXuLy(ketqua);

						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());
						body.setPersonSignature("");
						envelope.setSystemSignature("");

//						String rawMessage = OutsideSystemConverter.convertToNSWXML(nswRequest);
						String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);

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

						if (dossier.getReceiveDate() != null) {
							cal.setTime(dossier.getReceiveDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						} else {
							cal.setTime(dossier.getCreateDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						}
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);

						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());

							DossierAction foundAction = DossierActionLocalServiceUtil
									.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
							}

							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					} else if (dossierAction.getSyncActionCode().equals("1409")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("14");
						subject.setFunction("09");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						KetQuaXuLy ketqua = new KetQuaXuLy();
						content.setKetQuaXuLy(ketqua);

						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());
						body.setPersonSignature("");
						envelope.setSystemSignature("");

//						String rawMessage = OutsideSystemConverter.convertToNSWXML(nswRequest);
						String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);

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
						if (dossier.getReceiveDate() != null) {
							cal.setTime(dossier.getReceiveDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						} else {
							cal.setTime(dossier.getCreateDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						}
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);

						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());

							DossierAction foundAction = DossierActionLocalServiceUtil
									.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
							}

							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					} else if (dossierAction.getSyncActionCode().equals("1410")) {
						nswRequest.setDocumentType(dossier.getServiceCode());

						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("14");
						subject.setFunction("10");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						KetQuaXuLy ketqua = new KetQuaXuLy();
						content.setKetQuaXuLy(ketqua);

						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());
						body.setPersonSignature("");
						envelope.setSystemSignature("");

//						String rawMessage = OutsideSystemConverter.convertToNSWXML(nswRequest);
						String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);

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
						if (dossier.getReceiveDate() != null) {
							cal.setTime(dossier.getReceiveDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						} else {
							cal.setTime(dossier.getCreateDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						}
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);

						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());

							DossierAction foundAction = DossierActionLocalServiceUtil
									.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
							}

							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					} else if (dossierAction.getSyncActionCode().equals("1815")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("18");
						subject.setFunction("15");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						body.setPersonSignature("");
						envelope.setSystemSignature("");
						if (dossier.getReceiveDate() != null) {
							cal.setTime(dossier.getReceiveDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						} else {
							cal.setTime(dossier.getCreateDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						}

						if (dossier.getServiceCode().equals("BGTVT0600001")
								|| dossier.getServiceCode().equals("BGTVT0600002")
								|| dossier.getServiceCode().equals("BGTVT0600003")
								|| dossier.getServiceCode().equals("BGTVT0600004")) {

							MessageQueueInputModel model = BGTVT060001.convertResult(dossier, dossierSync, envelope, "18", "15");

							MessageQueueDetailModel result = client.postMessageQueue(model);
							if (result != null) {
								long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK()
										: sync.getMethod());

								DossierAction foundAction = DossierActionLocalServiceUtil
										.fetchDossierAction(clientDossierActionId);
								if (foundAction != null) {
									DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
								}

								_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

								_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
							}
						}
					} else if (dossierAction.getSyncActionCode().equals("1613")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("16");
						subject.setFunction("13");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						body.setPersonSignature("");
						envelope.setSystemSignature("");
						
						KetQuaXuLy ketqua = new KetQuaXuLy();
						content.setKetQuaXuLy(ketqua);

						ketqua.setNoiDung(dossierAction.getActionNote());
						ketqua.setDonViXuLy(dossier.getGovAgencyName());
						
//						String rawMessage = OutsideSystemConverter.convertToNSWXML(nswRequest);

						String rawMessage = OutsideSystemConverter.convertToNSWXML(envelope);
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
						if (dossier.getReceiveDate() != null) {
							cal.setTime(dossier.getReceiveDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						} else {
							cal.setTime(dossier.getCreateDate());
							subject.setDocumentYear(cal.get(Calendar.YEAR));
						}
						model.setPreReference(dossier.getReferenceUid());
						model.setSendDate(APIDateTimeUtils.convertDateToString(new Date()));
						model.setRetryCount(1);
						model.setDirection(2);

						MessageQueueDetailModel result = client.postMessageQueue(model);
						if (result != null) {
							long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK() : sync.getMethod());

							DossierAction foundAction = DossierActionLocalServiceUtil
									.fetchDossierAction(clientDossierActionId);
							if (foundAction != null) {
								DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
							}

							_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

							_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
						}
					} else if (dossierAction.getSyncActionCode().equals("1816")) {
						nswRequest.setDocumentType(dossier.getServiceCode());
						subject.setDocumentType(dossier.getServiceCode());
						subject.setType("18");
						subject.setFunction("16");
						subject.setReference(dossier.getReferenceUid());
						subject.setPreReference(dossier.getReferenceUid());
						subject.setSendDate(
								APIDateTimeUtils.convertDateToString(new Date(), APIDateTimeUtils._NSW_PATTERN));

						body.setPersonSignature("");
						envelope.setSystemSignature("");
						
						if (dossier.getServiceCode().equals("BGTVT0600001")
								|| dossier.getServiceCode().equals("BGTVT0600002")
								|| dossier.getServiceCode().equals("BGTVT0600003")
								|| dossier.getServiceCode().equals("BGTVT0600004")) {
							if (dossier.getServiceCode().equals("BGTVT0600001")
									|| dossier.getServiceCode().equals("BGTVT0600002")
									|| dossier.getServiceCode().equals("BGTVT0600003")
									|| dossier.getServiceCode().equals("BGTVT0600004")) {

								MessageQueueInputModel model = BGTVT060001.convertResult(dossier, dossierSync, envelope, "18", "15");

								MessageQueueDetailModel result = client.postMessageQueue(model);
								if (result != null) {
									long clientDossierActionId = (sync.getMethod() == 0 ? sync.getClassPK()
											: sync.getMethod());

									DossierAction foundAction = DossierActionLocalServiceUtil
											.fetchDossierAction(clientDossierActionId);
									if (foundAction != null) {
										DossierActionLocalServiceUtil.updatePending(clientDossierActionId, false);
									}

									_dossierSyncLocalService.deleteDossierSync(sync.getBaseDossierSyncId());

									_thirdPartyDossierSyncLocalService.deleteThirdPartyDossierSync(sync.getDossierSyncId());
								}
							}
						}
					} else {
						long clientDossierActionId = (dossierSync.getMethod() == 0 ? dossierSync.getClassPK()
								: dossierSync.getMethod());

						DossierAction foundAction = DossierActionLocalServiceUtil
								.fetchDossierAction(clientDossierActionId);
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
		schedulerEntryImpl.setTrigger(TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(),
				15, TimeUnit.SECOND));
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
