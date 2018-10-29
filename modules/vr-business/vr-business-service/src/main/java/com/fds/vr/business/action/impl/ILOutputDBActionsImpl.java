package com.fds.vr.business.action.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.model.Deliverable;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.impl.DossierImpl;
import org.opencps.dossiermgt.service.DeliverableLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.thirdparty.system.model.ILDoanhNghiep;
import org.opencps.thirdparty.system.model.ILPhuongTien;
import org.opencps.thirdparty.system.service.ILDoanhNghiepLocalServiceUtil;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.service.ApplicantLocalServiceUtil;

import com.fds.vr.business.action.ILOutputDBActions;
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.ILCertificate;
import com.fds.vr.business.model.ILVehicle;
import com.fds.vr.business.model.ILVehicleCustomsBorderGuard;
import com.fds.vr.business.service.ILCertificateLocalServiceUtil;
import com.fds.vr.business.service.ILSyncDateLocalServiceUtil;
import com.fds.vr.business.service.ILVehicleCustomsBorderGuardLocalServiceUtil;
import com.fds.vr.business.service.ILVehicleLocalServiceUtil;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class ILOutputDBActionsImpl implements ILOutputDBActions {

	private static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";
	private Log _log = LogFactoryUtil.getLog(ILOutputDBActionsImpl.class);

	@Override
	public boolean processOutputDB() throws ParseException, SearchException, JSONException {

		Date syncDate = ILSyncDateLocalServiceUtil.getSyncDate();

		_log.info("synsDate: "+syncDate);
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME);
		String strSyncDate = sdf.format(syncDate);

		List<Deliverable> deliverableList = DeliverableLocalServiceUtil.findDeliverableByDateAndState(strSyncDate, 2);
		_log.info("deliverableList: "+deliverableList.size());

		if (deliverableList != null && deliverableList.size() > 0) {
			// List<String> formDataList = new ArrayList<String>();
			// List<Date> modifiedDateList = new ArrayList<Date>();
			String formData = StringPool.BLANK;
			Date modifiedDate = null;
			DossierFile dossierFile = null;
			Dossier dossier = null;
			long dossierFileId = 0;
			// Registration registration = null;
			for (Deliverable deliverable : deliverableList) {
				// _log.info("Length deliverable: "+deliverableList.size());
				// String applicantIdNo = deliverable.getApplicantIdNo();
				String deliverableCode = deliverable.getDeliverableCode();
				String dossierTemplateNo = StringPool.BLANK;
				String dossierPartNo = StringPool.BLANK;
				String fileTemplateNo = StringPool.BLANK;
				String referenceUid = StringPool.BLANK;
				// if (Validator.isNotNull(applicantIdNo)) {
				// registration =
				// RegistrationLocalServiceUtil.getByApplicantIdNo(applicantIdNo);
				// }
				if (Validator.isNotNull(deliverableCode)) {
					dossierFile = DossierFileLocalServiceUtil.getByDeliverableCode(deliverableCode);
					if (dossierFile != null) {
						dossierFileId = dossierFile.getDossierFileId();
						dossierTemplateNo = dossierFile.getDossierTemplateNo();
						dossierPartNo = dossierFile.getDossierPartNo();
						fileTemplateNo = dossierFile.getFileTemplateNo();
						referenceUid = dossierFile.getReferenceUid();
						dossier = DossierLocalServiceUtil.fetchDossier(dossierFile.getDossierId());
					}
				} else {
					dossier = new DossierImpl();
				}

				// _log.info("registration: "+registration);
				// _log.info("dossierFile: "+dossierFile);
				formData = deliverable.getFormData();
				// _log.info("formData: "+formData);
				modifiedDate = deliverable.getModifiedDate();
				if (Validator.isNotNull(formData)) {
					// LinkedHashMap<String, String> mapValues =
					// ConvertJONObjectUtils.getKeyValuesMap(formData);
					JSONObject formJson = JSONFactoryUtil.createJSONObject(formData);
					// _log.info("formJson: "+formJson);
					if (formJson != null) {
						
						
						updateCSDLNghiepVu(deliverable, formJson, modifiedDate, dossier, dossierFileId,
								dossierTemplateNo, dossierPartNo, fileTemplateNo, referenceUid);

						/*
						 * outputDBAction(formJson, modifiedDate, dossier,
						 * dossierFileId, dossierTemplateNo, dossierPartNo,
						 * fileTemplateNo, referenceUid);
						 */ }
				}
			}
		}

		return true;
	}

	private ILDoanhNghiep updateThongTinDoanhNghiep(JSONObject formJsonData) {

		String sogcnDkkd = formJsonData.getString("BizCertificationNo");

		String ten = formJsonData.getString("NameOfCompany");

		Date ngayCap = ConvertFormatDate.parseStringToDate(formJsonData.getString("BizCertificationDate"));

		String donviCapPhep = formJsonData.getString("BizCertificationIssuedBy");

		String diaChi = formJsonData.getString("Address");

		String fax = formJsonData.getString("Fax");

		String email = formJsonData.getString("Email");

		String dienThoai = formJsonData.getString("Tel");

		return ILDoanhNghiepLocalServiceUtil.capNhatDoanhNghiep(ten, sogcnDkkd, ngayCap, donviCapPhep, diaChi,
				dienThoai, fax, email);

	}

	private ILVehicle updateThongtinPhuongTien(JSONObject formJsonData) {
		return ILVehicleLocalServiceUtil.capNhatVehicle(formJsonData, formJsonData.getString("IssuingDispatchNo"));
	}

	public void updateCSDLNghiepVu(Deliverable deliverable, JSONObject formJsonData, Date modifiedDate, Dossier dossier,
			long dossierFileId, String dossierTemplateNo, String dossierPartNo, String fileTemplateNo,
			String referenceUid) {
		DictCollection collection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("CSDL_NGHIEPVU",
				deliverable.getGroupId());

		List<DictItem> dictItems = DictItemLocalServiceUtil.findByF_dictCollectionId(collection.getDictCollectionId());

		List<String> lsKeyDoanhNghiep = new ArrayList<String>();
		List<String> lsKeyTuyenCoDinh = new ArrayList<String>();
		List<String> lsKeyPhuongTien = new ArrayList<String>();

		for (DictItem dictItem : dictItems) {
			if (dictItem.getItemDescription().contentEquals("DN")) {
				lsKeyDoanhNghiep.add(dictItem.getItemCode());
			}
			if (dictItem.getItemDescription().contentEquals("TCD")) {
				lsKeyTuyenCoDinh.add(dictItem.getItemCode());
			}
			if (dictItem.getItemDescription().contentEquals("PT")) {
				lsKeyPhuongTien.add(dictItem.getItemCode());
			}
		}
		
		_log.info("DN:" + lsKeyDoanhNghiep.toString());
		_log.info("TCD:" + lsKeyTuyenCoDinh.toString());
		_log.info("PT" + lsKeyPhuongTien.toString());
		
		_log.info("DELI_TYPE" + deliverable.getDeliverableType());
		
		boolean flag = false;
		if (dossierFileId != 0) {
			List<ILCertificate> certificateList = ILCertificateLocalServiceUtil.getAllCertificate();
			if (certificateList != null && certificateList.size() > 0) {
				long dossierIdCert = 0;
				for (ILCertificate certInfo : certificateList) {
					if (certInfo != null) {
						dossierIdCert = certInfo.getDossierFileId();
						if (dossierFileId == dossierIdCert) {
							flag = true;
							break;
						}
					}
				}
			}
		}
		
		
		if (lsKeyDoanhNghiep.contains(deliverable.getDeliverableType())) {
			_log.info("*****DOANH_NGHIEP_UPDATE");
			
			ILDoanhNghiep doanhNghiep = updateThongTinDoanhNghiep(formJsonData);
			// add certificate
			
			if (flag) {
				ILCertificateLocalServiceUtil.updateCertificate(formJsonData, dossierFileId);
			} else {
				ILCertificateLocalServiceUtil.addCertificate(formJsonData, dossier, dossierFileId, dossierTemplateNo,
						dossierPartNo, fileTemplateNo, referenceUid, doanhNghiep.getId(), 0);
			}
			
		} 
		
		if (lsKeyPhuongTien.contains(deliverable.getDeliverableType())) {
			_log.info("*****PHUONG_TIEN_UPDATE");
			ILVehicle phuongTien = updateThongtinPhuongTien(formJsonData);
			// add certificate
			
			if (flag) {
				ILCertificateLocalServiceUtil.updateCertificate(formJsonData, dossierFileId);
			} else {
				ILCertificateLocalServiceUtil.addCertificate(formJsonData, dossier, dossierFileId, dossierTemplateNo,
						dossierPartNo, fileTemplateNo, referenceUid, 0, phuongTien.getId());
			}

		} 
		
		if (lsKeyTuyenCoDinh.contains(deliverable.getDeliverableType())) {
			_log.info("*****TCD_UPDATE");
			if (flag) {
				ILCertificateLocalServiceUtil.updateCertificate(formJsonData, dossierFileId);
			} else {
				ILCertificateLocalServiceUtil.addCertificate(formJsonData, dossier, dossierFileId, dossierTemplateNo,
						dossierPartNo, fileTemplateNo, referenceUid, 0, 0);
			}

		}

		ILSyncDateLocalServiceUtil.updateSyncDate(modifiedDate);

	}

	private void outputDBAction(JSONObject formJsonData, Date modifiedDate, Dossier dossier, long dossierFileId,
			String dossierTemplateNo, String dossierPartNo, String fileTemplateNo, String referenceUid) {
		// _log.info("dossierFileId: "+dossierFileId);

		DictCollection collection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("CSDL_NGHIEPVU",
				dossier.getGroupId());

		List<DictItem> dictItems = DictItemLocalServiceUtil.findByF_dictCollectionId(collection.getDictCollectionId());

		List<String> lsKeyDoanhNghiep = new ArrayList<String>();
		List<String> lsKeyChungChi = new ArrayList<String>();
		List<String> lsKeyPhuongTien = new ArrayList<String>();

		for (DictItem dictItem : dictItems) {
			if (dictItem.getItemDescription().contentEquals("DN")) {
				lsKeyDoanhNghiep.add(dictItem.getItemCode());
			}
			if (dictItem.getItemDescription().contentEquals("TCD")) {
				lsKeyChungChi.add(dictItem.getItemCode());
			}
			if (dictItem.getItemDescription().contentEquals("PT")) {
				lsKeyPhuongTien.add(dictItem.getItemCode());
			}
		}

		// Check condition dossier had exits
		boolean flag = false;
		if (dossierFileId != 0) {
			List<ILCertificate> certificateList = ILCertificateLocalServiceUtil.getAllCertificate();
			if (certificateList != null && certificateList.size() > 0) {
				long dossierIdCert = 0;
				for (ILCertificate certInfo : certificateList) {
					if (certInfo != null) {
						dossierIdCert = certInfo.getDossierFileId();
						if (dossierFileId == dossierIdCert) {
							flag = true;
							break;
						}
					}
				}
			}
		}

		if (flag) {
			ILCertificate ilCertificate = ILCertificateLocalServiceUtil.updateCertificate(formJsonData, dossierFileId);
			if (ilCertificate != null) {
				String issuingDispatchNo = ilCertificate.getIssuingDispatchNo();
				String registrationNumber = ilCertificate.getRegistrationNumber();
				if (Validator.isNotNull(registrationNumber)) {
					List<ILVehicleCustomsBorderGuard> cbGuardList = ILVehicleCustomsBorderGuardLocalServiceUtil
							.getBorderGuardList(registrationNumber);
					if (cbGuardList != null && cbGuardList.size() > 0) {
						for (ILVehicleCustomsBorderGuard cbGuard : cbGuardList) {
							ILVehicleCustomsBorderGuardLocalServiceUtil.deleteILVehicleCustomsBorderGuard(cbGuard);
						}
					}
				}

				if (Validator.isNotNull(issuingDispatchNo)) {
					List<ILVehicle> vehicleList = ILVehicleLocalServiceUtil.getVehicleList(issuingDispatchNo);
					if (vehicleList != null && vehicleList.size() > 0) {
						for (ILVehicle vehicle : vehicleList) {
							ILVehicleLocalServiceUtil.deleteILVehicle(vehicle);
						}
					}
				}

			}
		} else {
			/*
			 * ILCertificateLocalServiceUtil.addCertificate(formJsonData,
			 * dossier, dossierFileId, dossierTemplateNo, dossierPartNo,
			 * fileTemplateNo, referenceUid);
			 */ }

		String issuingDispatchNoForm = formJsonData.getString("IssuingDispatchNo");
		String registrationNumberForm = formJsonData.getString("RegistrationNumber");
		if (Validator.isNotNull(registrationNumberForm)) {

			ILVehicleLocalServiceUtil.createVehicle(formJsonData, issuingDispatchNoForm);
		}

		if (Validator.isNotNull(registrationNumberForm)) {
			String cbGruardArr = formJsonData.getString("CustomsBorderGuards");
			if (Validator.isNotNull(cbGruardArr)) {
				try {
					JSONArray jsonGuardArr = JSONFactoryUtil.createJSONArray(cbGruardArr);
					if (jsonGuardArr != null && jsonGuardArr.length() > 0) {
						int lengthGuard = jsonGuardArr.length();
						// _log.info("LamTV_lengthGuard: "+lengthGuard);
						for (int i = 0; i < lengthGuard; i++) {
							JSONObject tempGuardJSON = jsonGuardArr.getJSONObject(i);
							// _log.info("LamTV_tempGuardJSON: "+tempGuardJSON);
							if (tempGuardJSON != null) {
								ILVehicleCustomsBorderGuardLocalServiceUtil.createCustomsBorderGuard(tempGuardJSON,
										registrationNumberForm);
							}
						}
					}
					// _log.info("END");
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
		}
		ILSyncDateLocalServiceUtil.updateSyncDate(modifiedDate);

	}

}
