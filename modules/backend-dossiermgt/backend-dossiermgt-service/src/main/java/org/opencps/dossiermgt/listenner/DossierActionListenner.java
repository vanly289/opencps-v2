package org.opencps.dossiermgt.listenner;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierLog;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLogLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;
import org.opencps.usermgt.action.impl.EmployeeActions;
import org.opencps.usermgt.action.impl.JobposActions;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.model.JobPos;
import org.opencps.usermgt.model.WorkingUnit;
import org.opencps.usermgt.model.EmployeeJobPos;
import org.opencps.usermgt.model.impl.ApplicantImpl;
import org.opencps.usermgt.model.impl.EmployeeImpl;
import org.opencps.usermgt.model.impl.JobPosImpl;
import org.opencps.usermgt.model.impl.WorkingUnitImpl;
import org.opencps.usermgt.model.impl.EmployeeJobPosImpl;
import org.opencps.usermgt.service.ApplicantLocalServiceUtil;
import org.opencps.usermgt.service.EmployeeLocalServiceUtil;
import org.opencps.usermgt.service.JobPosLocalServiceUtil;
import org.opencps.usermgt.service.WorkingUnitLocalServiceUtil;
import org.opencps.usermgt.service.EmployeeJobPosLocalServiceUtil;

import org.opencps.dossiermgt.action.util.IssueContentUtils;
import com.fds.vr.business.action.util.ConvertJONObjectUtils;
import org.opencps.dossiermgt.model.impl.DossierFileImpl;
import com.fds.vr.business.model.VRRPDossierStatistics;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.model.impl.VRRPDossierStatisticsImpl;
import com.fds.vr.business.model.impl.VRCorporationAttendeeImpl;
import com.fds.vr.business.service.VRRPDossierStatisticsLocalServiceUtil;
import com.fds.vr.business.service.VRCorporationAttendeeLocalServiceUtil;
import org.opencps.dossiermgt.action.keypay.util.HashFunction;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import backend.utils.APIDateTimeUtils;

@Component(immediate = true, service = ModelListener.class)
public class DossierActionListenner extends BaseModelListener<DossierAction> {
	@Override
	public void onAfterCreate(DossierAction model) throws ModelListenerException {

		_log.info("START Dossier Action");
		Indexer<DossierLog> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(DossierLog.class);
		if (true) {

			ServiceContext serviceContext = new ServiceContext();

			EmployeeActions employeeActions = new EmployeeActions();

			JobposActions jobposActions = new JobposActions();

			try {

				long userId = model.getUserId();

				Employee employee = employeeActions.getEmployeeByMappingUserId(model.getGroupId(), userId);

				long mainJobposId = employee != null ? employee.getMainJobPostId() : 0;

				long dossierId = model.getDossierId();

				String jobPosName = StringPool.BLANK;

				if (mainJobposId > 0) {

					JobPos jobPos = jobposActions.getJobPos(mainJobposId);

					jobPosName = (jobPos != null && Validator.isNotNull(jobPos.getTitle())) ? jobPos.getTitle()
							: StringPool.BLANK;
				}

				String content = model.getActionNote();

				JSONObject payload = JSONFactoryUtil.createJSONObject();

				JSONArray files = JSONFactoryUtil.createJSONArray();

				if (dossierId > 0) {
					long now = System.currentTimeMillis();
					_log.info("START Dossier Action11111: " + (System.currentTimeMillis() - now));
					List<DossierLog> dossierLogs = DossierLogLocalServiceUtil.getByDossierAndType(dossierId,
							DossierFileListenerMessageKeys.DOSSIER_LOG_CREATE_TYPE, QueryUtil.ALL_POS,
							QueryUtil.ALL_POS);
					_log.info("START Dossier Action2222: " + (System.currentTimeMillis() - now));
					for (DossierLog log : dossierLogs) {
						long dossierFileId = 0;

						try {
							JSONObject payloadFile = JSONFactoryUtil.createJSONObject(log.getPayload());

							dossierFileId = GetterUtil.getLong(payloadFile.get("dossierFileId"));
						} catch (Exception e) {

						}
						_log.info("START Dossier Action333: " + (System.currentTimeMillis() - now));
						if (dossierFileId != 0) {
							DossierFile dossierFile = DossierFileLocalServiceUtil.fetchDossierFile(dossierFileId);

							if (Validator.isNotNull(dossierFile)) {
								JSONObject file = JSONFactoryUtil.createJSONObject();

								file.put("dossierFileId", dossierFile.getDossierFileId());
								file.put("fileName", dossierFile.getDisplayName());
								file.put("createDate", APIDateTimeUtils.convertDateToString(dossierFile.getCreateDate(),
										APIDateTimeUtils._TIMESTAMP));
								files.put(file);
							}
						}

						//DossierLogLocalServiceUtil.deleteDossierLog(log);
						indexer.delete(log);
					}
					DossierLogLocalServiceUtil.deleteByDossierAndType(dossierId,
							DossierFileListenerMessageKeys.DOSSIER_LOG_CREATE_TYPE);
					_log.info("START Dossier Action4444: " + (System.currentTimeMillis() - now));
				}

				payload.put("jobPosName", jobPosName);
				payload.put("stepName", model.getActionName());
				payload.put("stepInstruction", model.getStepInstruction());
				payload.put("files", files);

				serviceContext.setCompanyId(model.getCompanyId());
				serviceContext.setUserId(userId);

				ProcessAction processAction = ProcessActionLocalServiceUtil
						.getByNameActionNo(model.getServiceProcessId(), model.getActionCode(), model.getActionName());

				boolean ok = true;

				if (Validator.isNotNull(processAction)) {
					if ((processAction.getPreCondition().contains("cancelling")
							&& processAction.getAutoEvent().contains("timmer"))
							|| (processAction.getPreCondition().contains("correcting")
									&& processAction.getAutoEvent().contains("timmer"))
							|| (processAction.getPreCondition().contains("submitting"))
									&& processAction.getAutoEvent().contains("timmer")) {
						ok = false;

					}
				}

				if (processAction.getPreCondition().contains("reject_cancelling")
						|| processAction.getPreCondition().contains("reject_correcting")
						|| processAction.getPreCondition().contains("reject_submitting")) {
					ok = false;
				}

				_log.debug("content: "+content);
				if (ok) {
					_log.info("START Dossier Action11111");
					DossierLog dossierLog = DossierLogLocalServiceUtil.addDossierLog(model.getGroupId(), model.getDossierId(),
							model.getActionUser(), content, "PROCESS_TYPE", payload.toString(),
							serviceContext);
					//_log.debug("dossierLog: "+dossierLog);
				}
				
				// SONVH bosung 25/03/2019: Ghi vao vr_rp_dossierstatistics
				//String processNo = UpdateRPdossierstatistics(model, payload.toString());
				
				// Sau khi update VRRPDossierStatistics, cap nhat thong tin phieu phan cong Dang kiem vien VRCorporationAttendee
				updateVRCorporationAttendee(model);
				// Cap nhat thong tin ho so CAP PHAT PHIEU
				IssueContentUtils issueContent = new IssueContentUtils();
				issueContent.updateVRIssueCertificate(model, 1);
				

			} catch (SystemException | PortalException e) {
				_log.error(e);
			}
		}

		if (Validator.isNotNull(model.getSyncActionCode()) && model.getSyncActionCode().length() != 0) {
			String content = "On DossiserAction Created";
			String notificationType = "";
			String payload = "";

			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setCompanyId(model.getCompanyId());
			serviceContext.setUserId(model.getUserId());

			try {
				_log.info("START Dossier Action11111");
				DossierLogLocalServiceUtil.addDossierLog(model.getGroupId(), model.getDossierId(), model.getUserName(),
						content, notificationType, payload, serviceContext);
			} catch (SystemException | PortalException e) {
				_log.error(e);
			}
		}
	}

	private String getUserName(long userId, long groupId) {
		String userName = StringPool.BLANK;

		Employee employee = null;

		Applicant applicant = null;

		employee = EmployeeLocalServiceUtil.fetchByF_mappingUserId(groupId, userId);

		if (Validator.isNotNull(employee)) {
			return employee.getFullName();

		}

		applicant = ApplicantLocalServiceUtil.fetchByMappingID(userId);

		if (Validator.isNotNull(applicant)) {
			return applicant.getApplicantName();
		}

		return userName;
	}

	public String updateVRCorporationAttendee(DossierAction dossierActionModel) throws PortalException {
		try {
			//Lan luot tung quy trinh
			long serviceProcessId = dossierActionModel.getServiceProcessId();
			String postStepCode = dossierActionModel.getStepCode();
			String actionUserName =  dossierActionModel.getActionUser();
			String actionCode =  dossierActionModel.getActionCode();
			boolean flagUpdate = true; 
			long groupId = dossierActionModel.getGroupId(); 
			String fileTemplateNo = "PPC";
			
			String formData = StringPool.BLANK;
			DossierFile dossierFile = new DossierFileImpl();
			Dossier objDossier = DossierLocalServiceUtil.fetchDossier(dossierActionModel.getDossierId());
			ProcessAction processAction = ProcessActionLocalServiceUtil.fetchBySPID_AC(serviceProcessId, actionCode);
			
			if (Validator.isNotNull(postStepCode) && groupId == 55301
					&& Validator.isNotNull(processAction.getCreateDossierFiles()) && processAction.getCreateDossierFiles().equalsIgnoreCase(fileTemplateNo) ) {
				dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(dossierActionModel.getDossierId(), fileTemplateNo, 2,
						false, new DossierFileComparator(false, "createDate", Date.class));
				formData = dossierFile.getFormData();
			}
			if (Validator.isNull(formData)) {
				return "";
			}
			
			LinkedHashMap<String, String> mapValues = ConvertJONObjectUtils.getKeyValuesMap(formData);
			if (Validator.isNull(mapValues)) {
				return "";
			}
			// (mapValues.get(""));
			
			List<VRCorporationAttendee> lstVRCorporationAttendee = VRCorporationAttendeeLocalServiceUtil
					.findByDossierIdAssignType(dossierActionModel.getDossierId(), postStepCode);
			
			
			// Co 3 truong hop: 
			// 1. Phan cong lan dau; 2: Phan cong cap lai giay phep da cap; 3: Phan cong sua doi bo sung sau khi cap phep
			// Ghi lai tung lan phan cong theo postStepCode. Moi lan cap phep, neu phan cong lai nhieu lan, thi xoa lan truoc do.
			
			if (Validator.isNotNull(lstVRCorporationAttendee) && lstVRCorporationAttendee.size() > 0) {
				for (VRCorporationAttendee vrCorporationAttendee : lstVRCorporationAttendee) {
					VRCorporationAttendeeLocalServiceUtil.deleteVRCorporationAttendee(vrCorporationAttendee);
				}
			}
			VRCorporationAttendee objVRCorporationAttendee = new VRCorporationAttendeeImpl();
			long vrCorporationAttendeeId = CounterLocalServiceUtil.increment(VRCorporationAttendee.class.getName());
			objVRCorporationAttendee.setId(vrCorporationAttendeeId);
			
			objVRCorporationAttendee.setMtCore(1);
			objVRCorporationAttendee.setCreateDate(new Date());
			objVRCorporationAttendee.setModifyDate(new Date());
			objVRCorporationAttendee.setSyncDate(new Date());
			
			Employee employee = EmployeeLocalServiceUtil.fetchByF_mappingUserId(groupId, dossierActionModel.getUserId());
			
			EmployeeJobPos objEmployeeJobPos = employee != null ? EmployeeJobPosLocalServiceUtil
					.fetchEmployeeJobPos(employee.getMainJobPostId())
					: null;
			
			WorkingUnit objWorkingUnit = objEmployeeJobPos != null
					? WorkingUnitLocalServiceUtil.fetchWorkingUnit(objEmployeeJobPos.getWorkingUnitId()) : null;
			if (objWorkingUnit != null) {
				String corporationCode = objWorkingUnit.getGovAgencyCode();
				String corporationName = objWorkingUnit.getName();
				objVRCorporationAttendee.setCorporationCode(corporationCode);
				objVRCorporationAttendee.setCorporationName(corporationName);
			}
			
			try {
				if (Validator.isNotNull(mapValues.get("ngay_bat_dau_tham_dinh"))) {
					_log.info("ngay_bat_dau_tham_dinh: "+mapValues.get("ngay_bat_dau_tham_dinh"));
					objVRCorporationAttendee.setInspectionDate(parseStringToDate(mapValues.get("ngay_bat_dau_tham_dinh")));
				}
			} catch (Exception e) {
				_log.debug(e);
			}
			

			objVRCorporationAttendee.setActivityId(dossierActionModel.getDossierActionId()); //dossierActionId
			objVRCorporationAttendee.setUserId(dossierActionModel.getUserId());
			objVRCorporationAttendee.setUserName(dossierActionModel.getUserName());
			objVRCorporationAttendee.setActivityType("EVENT");		
			objVRCorporationAttendee.setCategoryName(actionCode);
			String DossierTemplateNo = dossierFile.getDossierTemplateNo();
			objVRCorporationAttendee.setActivityCatetory(DossierTemplateNo);
			objVRCorporationAttendee.setDossierId(dossierActionModel.getDossierId());
			
			objVRCorporationAttendee.setServiceName(objDossier.getServiceName());
			objVRCorporationAttendee.setSubject(dossierActionModel.getActionName());
			objVRCorporationAttendee.setLocation("Phòng Chất lượng xe cơ giới (VAQ)");
			objVRCorporationAttendee.setState("9");
			objVRCorporationAttendee.setStateName("Đã kết thúc");
			objVRCorporationAttendee.setStateColor("#FFBD33");
			objVRCorporationAttendee.setPriority("0");
			objVRCorporationAttendee.setOverdue(dossierActionModel.getActionOverdue()+"");			
			objVRCorporationAttendee.setProgress("100");
			objVRCorporationAttendee.setPermission("read");
			objVRCorporationAttendee.setManagerId(dossierFile.getUserId());
			objVRCorporationAttendee.setManagerName(dossierFile.getUserName());
			long leaderId = Long.valueOf(mapValues.get("userAction"));
			objVRCorporationAttendee.setLeaderId(leaderId);
			objVRCorporationAttendee.setLeaderName(mapValues.get("userNameAction") + " -" + mapValues.get("userNoAction"));
			objVRCorporationAttendee.setLeaderJobTitle("");
			objVRCorporationAttendee.setDescription(dossierActionModel.getActionNote());
			String resultNote = StringPool.BLANK;
			objVRCorporationAttendee.setResultNote(resultNote);
			objVRCorporationAttendee.setAssignType(postStepCode);
			JobPos objJobPos = JobPosLocalServiceUtil.fetchJobPos(objEmployeeJobPos.getJobPostId());
			
			objVRCorporationAttendee.setJobPosId(objJobPos.getJobPosId());
			objVRCorporationAttendee.setJobPosTitle(objJobPos.getTitle());
			//Set Invitation
			JSONObject jsonData = JSONFactoryUtil.createJSONObject(formData);
			if (jsonData.has("subUsers") && Validator.isNotNull(jsonData.get("subUsers"))) {
				JSONArray subUserArr = jsonData.getJSONArray("subUsers");
				StringBuilder sb = new StringBuilder();
				if (subUserArr != null && subUserArr.length() > 0) {
					int length = subUserArr.length();
					for (int i = 0; i < length; i++) {
						JSONObject jsonUserInfo = subUserArr.getJSONObject(i);
						if (i == length - 1) {
							sb.append(jsonUserInfo.getString("fullName"));
						} else {
							sb.append(jsonUserInfo.getString("fullName"));
							sb.append(StringPool.COMMA);
						}
					}
					//
					objVRCorporationAttendee.setInvitation(sb.toString());
				}
			}
			//
			objVRCorporationAttendee.setEditable("0");
			objVRCorporationAttendee.setRegisterednumber(objDossier.getDossierNo());

			if (DossierTemplateNo.equalsIgnoreCase("TT302011BGTVTCOP") 
					|| DossierTemplateNo.equalsIgnoreCase("TT302011BGTVTKTSPMXCG")
					|| DossierTemplateNo.equalsIgnoreCase("TT302011BGTVTKTSPMXBBCN")
					|| DossierTemplateNo.equalsIgnoreCase("TT302011BGTVTKTTBLANDAU")
					|| DossierTemplateNo.equalsIgnoreCase("TT192012TTBGTVTDGLD")
					) {
				String testingRegisteredPlace = mapValues.get("dia_chi_nha_xuong");
				String testingPlaceDistrict = StringPool.BLANK;
				String testingPlaceCity = StringPool.BLANK;
				String testingPlaceRegion = StringPool.BLANK;
				String testingPlaceCountry = StringPool.BLANK;
 
				objVRCorporationAttendee.setTestingRegisteredPlace(testingRegisteredPlace);
				objVRCorporationAttendee.setTestingPlaceDistrict(testingPlaceDistrict);
				objVRCorporationAttendee.setTestingPlaceCity(testingPlaceCity);
				objVRCorporationAttendee.setTestingPlaceRegion(testingPlaceRegion);
				objVRCorporationAttendee.setTestingPlaceCountry(testingPlaceCountry);				
				
				objVRCorporationAttendee.setTenCoSoSanXuat(mapValues.get("ten_doanh_nghiep"));
				objVRCorporationAttendee.setDiaChiCoSoSanXuat(mapValues.get("dia_chi_doanh_nghiep"));
				objVRCorporationAttendee.setTenXuongSanXuat(mapValues.get("ten_nha_xuong"));
				objVRCorporationAttendee.setDiaChiXuongSanXuat(mapValues.get("dia_chi_nha_xuong"));
				// Tam thoi chua dien du lieu.
				
				/*
				objVRCorporationAttendee.setSoTKHQ(soTKHQ);
				objVRCorporationAttendee.setNgayTKHQ(ngayTKHQ);
				objVRCorporationAttendee.setMaChiCucHQ(maChiCucHQ);
				objVRCorporationAttendee.setNhanHieu(mapValues.get("HINO"));
				objVRCorporationAttendee.setTenThuongMai(tenThuongMai);
				objVRCorporationAttendee.setMaKieuLoai(maKieuLoai);
				objVRCorporationAttendee.setLoaiPhuongTien(mapValues.get("loai_phuong_tien"));
				objVRCorporationAttendee.setSoKhung(soKhung);
				objVRCorporationAttendee.setSoDongCo(soDongCo);
				objVRCorporationAttendee.setTinhTrangPhuongTien(tinhTrangPhuongTien);
				objVRCorporationAttendee.setKyHieuThietKe(kyHieuThietKe);
				objVRCorporationAttendee.setSoGCNThamDinhThietKe(soGCNThamDinhThietKe);
				objVRCorporationAttendee.setSoGCNPheDuyetKieuLoaiNuocNgoai(soGCNPheDuyetKieuLoaiNuocNgoai);

				*/
				
			} else {
				objVRCorporationAttendee.setTestingRegisteredPlace(objVRCorporationAttendee.getLocation());
			}
			
			
			objVRCorporationAttendee.setTestingRemarks(objDossier.getBriefNote());
			
			objVRCorporationAttendee.setVaqcontactname(mapValues.get("userNameAction") + " -" + mapValues.get("userNoAction"));
			objVRCorporationAttendee.setVaqcontactphone(mapValues.get(""));
			objVRCorporationAttendee.setApplicantIdNo(objDossier.getApplicantIdNo());			
			objVRCorporationAttendee.setImportercontactname(mapValues.get("nguoi_lien_he"));
			objVRCorporationAttendee.setImportercontactemail(objDossier.getContactEmail());
			objVRCorporationAttendee.setImportercontactphone(mapValues.get("dien_thoai_lien_he"));
			objVRCorporationAttendee.setImporterfax(mapValues.get(""));
			if (Validator.isNotNull(objVRCorporationAttendee.getTenCoSoSanXuat())) {
				objVRCorporationAttendee.setTenCoSoSanXuat(objDossier.getApplicantName());
			}
			if (Validator.isNotNull(objVRCorporationAttendee.getDiaChiCoSoSanXuat())) {
				objVRCorporationAttendee.setDiaChiCoSoSanXuat(objDossier.getAddress());
			}
			
			VRCorporationAttendeeLocalServiceUtil.addVRCorporationAttendee(objVRCorporationAttendee);
			return postStepCode;	
		} catch (SystemException e) {
			_log.error(e);
			return "";
		}
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

	private Log _log = LogFactoryUtil.getLog(DossierActionListenner.class.getName());
	private final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private final String PATTERN_DATE_3 = "dd/MM/yyyy";

}