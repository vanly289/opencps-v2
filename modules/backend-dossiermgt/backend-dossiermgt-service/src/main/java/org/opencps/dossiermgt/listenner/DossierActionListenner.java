package org.opencps.dossiermgt.listenner;

import java.util.Date;
import java.util.List;

import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierLog;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLogLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.usermgt.action.impl.EmployeeActions;
import org.opencps.usermgt.action.impl.JobposActions;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.model.JobPos;
import org.opencps.usermgt.service.ApplicantLocalServiceUtil;
import org.opencps.usermgt.service.EmployeeLocalServiceUtil;
import com.fds.vr.business.model.VRRPDossierStatistics;
import com.fds.vr.business.model.impl.VRRPDossierStatisticsImpl;
import com.fds.vr.business.service.VRRPDossierStatisticsLocalServiceUtil;

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

		_log.info("START Dossier Action Listenner");
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

					_log.info("START Dossier Action11111");
					List<DossierLog> dossierLogs = DossierLogLocalServiceUtil.getByDossierAndType(dossierId,
							DossierFileListenerMessageKeys.DOSSIER_LOG_CREATE_TYPE, QueryUtil.ALL_POS,
							QueryUtil.ALL_POS);

					for (DossierLog log : dossierLogs) {
						long dossierFileId = 0;

						try {
							JSONObject payloadFile = JSONFactoryUtil.createJSONObject(log.getPayload());

							dossierFileId = GetterUtil.getLong(payloadFile.get("dossierFileId"));
						} catch (Exception e) {

						}

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

						DossierLogLocalServiceUtil.deleteDossierLog(log);

					}

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
					
					// SONVH bosung 25/03/2019: Ghi vao vr_rp_dossierstatistics
					UpdateRPdossierstatistics(model, payload.toString());
				}

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

	public boolean UpdateRPdossierstatistics(DossierAction dossierActionModel, String payload) {
		try {
			//Lan luot tung quy trinh
			String processNo = StringPool.BLANK;
			String postStepCode = dossierActionModel.getStepCode();
			String actionUserName =  dossierActionModel.getActionUser();
			String actionCode =  dossierActionModel.getActionCode();
			boolean flagUpdate = true; 
			long groupId = dossierActionModel.getGroupId(); //fake
			if (Validator.isNotNull(processNo) && groupId == 55301) {
				VRRPDossierStatistics statistics = new VRRPDossierStatisticsImpl();
				
				
				if (Validator.isNull(statistics) || statistics.getId() == 0) {
					flagUpdate = false;
					statistics = new VRRPDossierStatisticsImpl();
					statistics.setId(CounterLocalServiceUtil.increment(VRRPDossierStatistics.class.getName()));
				}
				switch (processNo) {
				case "TT302011BGTVTTTKXCG":  //Tham dinh thiet ke Xe co gioi
					switch (postStepCode) {
					
					case "130": //1. Nop ho so truc tuyen (hstt) lan dau dossiersendingdate / 
						Date dossiersendingdate = dossierActionModel.getCreateDate();
						statistics.setDossiersendingdate(dossiersendingdate);
						break;
					case "133": //2. Can bo tiep nhan hstt, chuyen to truong dossierreceivingdate / men2receiving
						Date dossierreceivingdate =  dossierActionModel.getCreateDate();
						String men2receiving = dossierActionModel.getActionUser();		
						statistics.setDossierreceivingdate(dossierreceivingdate);
						statistics.setMen2receiving(men2receiving);
						break;
					case "131": //3. Ngay yeu cau bo sung hstt lan dau dossierfirstupdatingdate / men2firstupdating
						Date dossierfirstupdatingdate  =  dossierActionModel.getCreateDate();
						String men2firstupdating = dossierActionModel.getActionUser();
						if (Validator.isNotNull(statistics) && Validator.isNotNull(statistics.getDossierfirstupdatingdate())) {
							statistics.setDossierlastupdatingdate(dossierfirstupdatingdate);
							statistics.setMen2lastupdating(men2firstupdating);
						} else {
							statistics.setDossierfirstupdatingdate(dossierfirstupdatingdate);
							statistics.setMen2firstupdating(men2firstupdating);
							statistics.setDossierlastupdatingdate(dossierfirstupdatingdate);
							statistics.setMen2lastupdating(men2firstupdating);
						}
						break;
					case "205": //4. Ngay yeu cau bo sung hstt lan cuoi dossierlastupdatingdate / men2lastupdating
						Date dossierlastupdatingdate  =  dossierActionModel.getCreateDate();
						String men2lastupdating = dossierActionModel.getActionUser();
						if (Validator.isNotNull(statistics) && Validator.isNotNull(statistics.getDossierfirstupdatingdate())) {
							statistics.setDossierlastupdatingdate(dossierlastupdatingdate);
							statistics.setMen2lastupdating(men2lastupdating);
						} else {
							statistics.setDossierfirstupdatingdate(dossierlastupdatingdate);
							statistics.setMen2firstupdating(men2lastupdating);
							statistics.setDossierlastupdatingdate(dossierlastupdatingdate);
							statistics.setMen2lastupdating(men2lastupdating);
						}
						break;
					case "215": //4. Ngay yeu cau bo sung hstt lan cuoi dossierlastupdatingdate / men2lastupdating
						Date dossierlastupdatingdate2  =  dossierActionModel.getCreateDate();
						String men2lastupdating2 = dossierActionModel.getActionUser();
						if (Validator.isNotNull(statistics) && Validator.isNotNull(statistics.getDossierfirstupdatingdate())) {
							statistics.setDossierlastupdatingdate(dossierlastupdatingdate2);
							statistics.setMen2lastupdating(men2lastupdating2);
						} else {
							statistics.setDossierfirstupdatingdate(dossierlastupdatingdate2);
							statistics.setMen2firstupdating(men2lastupdating2);
							statistics.setDossierlastupdatingdate(dossierlastupdatingdate2);
							statistics.setMen2lastupdating(men2lastupdating2);
						}
						break;
					case "225": //4. Ngay yeu cau bo sung hstt lan cuoi dossierlastupdatingdate / men2lastupdating
						Date dossierlastupdatingdate3  =  dossierActionModel.getCreateDate();
						String men2lastupdating3 = dossierActionModel.getActionUser();
						if (Validator.isNotNull(statistics) && Validator.isNotNull(statistics.getDossierfirstupdatingdate())) {
							statistics.setDossierlastupdatingdate(dossierlastupdatingdate3);
							statistics.setMen2lastupdating(men2lastupdating3);
						} else {
							statistics.setDossierfirstupdatingdate(dossierlastupdatingdate3);
							statistics.setMen2firstupdating(men2lastupdating3);
							statistics.setDossierlastupdatingdate(dossierlastupdatingdate3);
							statistics.setMen2lastupdating(men2lastupdating3);
						}
						break;	
					case "134": //5. Ngay nop BSSD hstt lan cuoi dossierendorsementdate / men2endorsement
						Date dossierendorsementdate = dossierActionModel.getCreateDate();
						statistics.setDossierendorsementdate(dossierendorsementdate);
						break;
					case "227": //5. Ngay nop BSSD hstt lan cuoi dossierendorsementdate / men2endorsement
						Date dossierendorsementdate2 = dossierActionModel.getCreateDate();
						statistics.setDossierendorsementdate(dossierendorsementdate2);
						break;
					case "234": //5. Ngay nop BSSD hstt lan cuoi dossierendorsementdate / men2endorsement
						Date dossierendorsementdate3 = dossierActionModel.getCreateDate();
						statistics.setDossierendorsementdate(dossierendorsementdate3);
						break;
					case "235": //5. Ngay nop BSSD hstt lan cuoi dossierendorsementdate / men2endorsement
						Date dossierendorsementdate4 = dossierActionModel.getCreateDate();
						statistics.setDossierendorsementdate(dossierendorsementdate4);
						break;
					case "136": //6. Ngay cap so hstt, duoc to truong chap thuan ho so dang ky dossiersubmittingdate / men2submitting
						Date dossiersubmittingdate  = dossierActionModel.getCreateDate();
						String men2submitting = dossierActionModel.getActionUser();
						statistics.setDossiersubmittingdate(dossiersubmittingdate);
						statistics.setMen2submitting(men2submitting);
						break;
					case "300": //7. Ngay ky giay chung nhan moi, duoc lanh dao Cuc ky moi dossierfirstcertificatesigndate / men2firstcertificate
						Date dossierfirstcertificatesigndate   =  dossierActionModel.getCreateDate();
						String men2firstcertificate = dossierActionModel.getActionUser();
						statistics.setDossierfirstcertificatesigndate(dossierfirstcertificatesigndate);
						statistics.setMen2firstcertificate(men2firstcertificate);
						break;
					case "201": //8. Ngay phan cong DKV lan dau (hstt cap moi, cap mo rong) dossierfirstassignmentdate / men2firstassignment
						// Phai lay tu phieu phan cong PPC
						if (Validator.isNotNull(statistics) && actionCode.equalsIgnoreCase("1118")) {
							Date dossierfirstassignmentdate  = dossierActionModel.getCreateDate();
							String men2firstassignment = dossierActionModel.getActionUser();
							statistics.setDossierfirstassignmentdate(dossierfirstassignmentdate);
							statistics.setMen2firstassignment(men2firstassignment);
						}
						break;
					case "206": //9. Ngay bat dau soat xet hstt lan dau dossierfirstreviewdate / men2firstreview
						if (Validator.isNotNull(statistics) && statistics.getMen2firstreview().trim().length() == 0) {
							Date dossierfirstreviewdate  = dossierActionModel.getCreateDate();
							String men2firstreview = dossierActionModel.getActionUser();
							statistics.setDossierfirstreviewdate(dossierfirstreviewdate);
							statistics.setMen2firstreview(men2firstreview);
						}
						break;
					case "208": //10. Ngay ket thuc soat xet hstt lan dau dossiernexttreviewdate / men2nexttreview
						if (Validator.isNotNull(statistics) && statistics.getMen2firstreview().trim().length() > 0) {
							Date dossiernexttreviewdate  = dossierActionModel.getCreateDate();
							String men2nexttreview = dossierActionModel.getActionUser();
							statistics.setDossiernexttreviewdate(dossiernexttreviewdate);
							statistics.setMen2nexttreview(men2nexttreview);
						}
						break;
					case "211": //11. Ngay phan cong DKV lan cuoi (hstt cap lai, cap bo sung) dossierlastassignmentdate / men2lastassignment
						if (Validator.isNotNull(statistics) && (actionCode.equalsIgnoreCase("1138") || actionCode.equalsIgnoreCase("1320"))) {
							Date dossierlastassignmentdate  = dossierActionModel.getCreateDate();
							String men2lastassignment = dossierActionModel.getActionUser();
							statistics.setDossierlastassignmentdate(dossierlastassignmentdate);
							statistics.setMen2lastassignment(men2lastassignment);
						}
						break;
					case "221": //11. Ngay phan cong DKV lan cuoi (hstt cap lai, cap bo sung) dossierlastassignmentdate / men2lastassignment
						if (Validator.isNotNull(statistics) && (actionCode.equalsIgnoreCase("1161") || actionCode.equalsIgnoreCase("1322"))) {
							Date dossierlastassignmentdate  = dossierActionModel.getCreateDate();
							String men2lastassignment = dossierActionModel.getActionUser();
							statistics.setDossierlastassignmentdate(dossierlastassignmentdate);
							statistics.setMen2lastassignment(men2lastassignment);
						}
						break;
					case "216": //12. Ngay soat xet hstt dieu chinh (do cap lai, bo sung) dossierreviewadjustdate / men2reviewadjust
						if (Validator.isNotNull(statistics)) {
							Date dossierreviewadjustdate  = dossierActionModel.getCreateDate();
							String men2reviewadjust = dossierActionModel.getActionUser();
							statistics.setDossierreviewadjustdate(dossierreviewadjustdate);
							statistics.setMen2reviewadjust(men2reviewadjust);
						}
						break;
					case "218": //13. Ngay ket thuc soat xet hstt dieu chinh lan cuoi (do cap lai) dossierlastreviewadjustdate / men2lastreviewadjust
						if (Validator.isNotNull(statistics) && statistics.getMen2reviewadjust().trim().length() > 0 ) {
							Date dossierlastreviewadjustdate  = dossierActionModel.getCreateDate();
							String men2lastreviewadjust = dossierActionModel.getActionUser();
							statistics.setDossierlastreviewadjustdate(dossierlastreviewadjustdate);
							statistics.setMen2lastreviewadjust(men2lastreviewadjust);
						}
					case "226": //13. Ngay bat dau soat xet hstt dieu chinh lan cuoi (do bo sung) dossierlastreviewadjustdate / men2lastreviewadjust
						if (Validator.isNotNull(statistics) && statistics.getMen2reviewadjust().trim().length() > 0 ) {
							Date dossierlastreviewadjustdate  = dossierActionModel.getCreateDate();
							String men2lastreviewadjust = dossierActionModel.getActionUser();
							statistics.setDossierlastreviewadjustdate(dossierlastreviewadjustdate);
							statistics.setMen2lastreviewadjust(men2lastreviewadjust);
						} else if (Validator.isNotNull(statistics) && statistics.getMen2reviewadjust().trim().length() == 0 ) {
							Date dossierlastreviewadjustdate  = dossierActionModel.getCreateDate();
							String men2lastreviewadjust = dossierActionModel.getActionUser();
							statistics.setDossierlastreviewadjustdate(dossierlastreviewadjustdate);
							statistics.setMen2lastreviewadjust(men2lastreviewadjust);
							statistics.setDossierreviewadjustdate(dossierlastreviewadjustdate);
							statistics.setMen2reviewadjust(men2lastreviewadjust);
						}
						break;
					case "301": //14. Ngay ky giay chung nhan cap lai, lan cuoi, dossierlastcertificatesigndate / men2lastcertificatesign
						Date dossierlastcertificatesigndate   =  dossierActionModel.getCreateDate();
						String men2lastcertificatesign = dossierActionModel.getActionUser();
						statistics.setDossierlastcertificatesigndate(dossierlastcertificatesigndate);
						statistics.setMen2lastcertificatesign(men2lastcertificatesign);
						break;
					case "---": //15. Ngay ho so den han tra ket qua dossierdeadline / 
					
						break;
					case "----": //16. Ngay tra ket qua thuc te dossierfinisheddate / men2finished
					
						break;
					case "-----": //17. Ngay ho so de nghi huy bo dossiercancellingdate / men2cancelled
					
						break;
					case "+++": //18. Ngay giay chung nhan phai xem xet hieu luc dossierexpiredate / men2expired
					
						break;
					case "++++": //19. Ngay xem xet ho so tam dinh chi hieu luc / thu  hoi dossierviolatingdate / men2violated
					
						break;
					case "+++++": //20. Ngay giay chung nhan tam dinh chi hieu luc/ thu hoi tu ngay dossierviolatingfromdate
					//21. Ngay giay chung nhan tam dinh chi hieu luc/ thu hoi den ngay dossierviolatingtodate
					
					
						break;
					default:
						break;
					}		
				
					break;
				case "TT302011BGTVTTDTKXMCD": //Tham dinh thiet ke Xe may chuyen dung 
					
					break;
				
				case "TT302011BGTVTKTSPMXCG": //Kiem tra san pham mau Xe co gioi
					
					break;
				case "TT302011BGTVTKTSPMXBBCN": //Kiem tra san pham mau Xe cho nguoi bon banh co gan dong co
					
					break;
				
				case "TT302011BGTVTCOP": //Danh gia COP
					
					break;
				case "TT302011BGTVTKTTBLANDAU": //Kiem tra tinh trang hoat dong thiet bi kiem tra
					
					break;
				
				case "TT192012TTBGTVTDGLD": //Kiem tra, danh gia co so bao hanh bao duong
					
					break;
				case "432014TTLTBGTVTBCTTTNLNK": //Dang ky chung nhan muc tieu thu nhien lieu doi voi xe o to nhap khau 
					
					break;
				case "432014TTLTBGTVTBCTTTNLSXLR": //Dang ky chung nhan muc tieu thu nhien lieu doi voi xe o to san xuat, lap rap
					
					break;
				case "TT302011BGTVTCNCLKLLKXCG": //Chung nhan chat luong kieu loai linh kien Xe co gioi
					
					break;
				case "TT302011BGTVTCNCLKLLKXM": //Chung nhan chat luong kieu loai linh kien Xe mo to, xe gan may
					
					break;
				
				case "TT302011BGTVTCNCLKLTXXCG": //Chung nhan chat luong kieu loai toan xe Xe co gioi
					
					break;
				case "TT302011BGTVTCNCLKLTXXMTGM": //Chung nhan chat luong kieu loai toan xe Xe mo to, xe gan may
					
					break;
				case "TT302011BGTVTCNCLKLTXXDD": //Chung nhan chat luong kieu loai toan xe Xe dap dien
					
					break;
				case "TT302011BGTVTCNCLKLTXXBBCN": //Chung nhan chat luong kieu loai toan xe Xe cho nguoi bon banh co gan dong co
					
					break;
				case "TT302011BGTVTCNCLKLTXXBBCH": //Chung nhan chat luong kieu loai toan xe Xe cho hang bon banh co gan dong co
					
					break;
				case "TT302011BGTVTCPPXCG": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe co gioi
					
					break;
				case "TT302011BGTVTCPPXMTGM": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe mo to, xe gan may
					
					break;
				case "TT302011BGTVTCPPXDD": //Cap phat va su dung tem hop quy Xe dap dien 
					
					break;
				case "TT302011BGTVTCPPXBBCN": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe cho nguoi bon banh co gan dong co
					
					break;
				
				case "TT302011BGTVTCPPXBBCH": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe cho hang bon banh co gan dong co
					
					break;
				case "TT302011BGTVTCPPXCD": //Cap phat va su dung phieu kiem tra chat luong xuat xuong Xe may chuyen dung
					
					break;
				
				case "TT302011BGTVTCNCLKLXMCD": //Chung nhan chat luong kieu loai toan xe Xe may chuyen dung
					
					break;
				case "TT302011BGTVTCNCLKLLKXCD": //Chung nhan chat luong kieu loai linh kien Xe may chuyen dung
					
					break;
				
				case "TT302011BGTVTCNCLKLLKXDD": //Chung nhan chat luong kieu loai linh kien Xe dap dien
					
					break;
				case "TT302011BGTVTCNCLKLLKXCN": //Chung nhan chat luong kieu loai linh kien Xe cho nguoi bon banh co gan dong co
					
					break;
				case "TT302011BGTVTCNCLKLLKXCH": //Chung nhan chat luong kieu loai linh kien Xe cho hang bon banh co gan dong co
					
					break;
				case "TT302011BGTVTTHSPNK": //Trieu hoi san pham Xe co gioi nhap khau linh kien de san xuat lap rap xe
					
					break;
				case "TT302011BGTVTTHSPSXLR": //Trieu hoi san pham Xe co gioi san xuat, lap rap linh kien de san xuat lap rap xe
					
					break;
				
				default:
					break;
				}
			
				
				
				
				if (flagUpdate == true) {
					VRRPDossierStatisticsLocalServiceUtil.updateVRRPDossierStatistics(statistics);
				} else {
					VRRPDossierStatisticsLocalServiceUtil.addVRRPDossierStatistics(statistics);
				}
			}
			
			
		} catch (SystemException e) {
			_log.error(e);
			return false;
		}
				
		return true;
	}
	private Log _log = LogFactoryUtil.getLog(DossierActionListenner.class.getName());
}