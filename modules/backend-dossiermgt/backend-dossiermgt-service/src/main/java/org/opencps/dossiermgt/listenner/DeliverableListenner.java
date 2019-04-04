package org.opencps.dossiermgt.listenner;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.opencps.dossiermgt.model.Deliverable;
import org.opencps.dossiermgt.service.DeliverableLocalServiceUtil;

import org.osgi.service.component.annotations.Component;

import com.fds.vr.business.action.util.ConvertJONObjectUtils;
import com.fds.vr.business.model.DossierFile;
import com.fds.vr.business.model.Registration;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRConfigTechSpec;
import com.fds.vr.business.model.VRVehicleSpecification;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.VRVehicleSpecificationImpl;
import com.fds.vr.business.service.DossierFileLocalServiceUtil;
import com.fds.vr.business.service.RegistrationLocalServiceUtil;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRConfigTechSpecLocalServiceUtil;
import com.fds.vr.business.service.VRSyncDateLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

@Component(immediate = true, service = ModelListener.class)
public class DeliverableListenner extends BaseModelListener<Deliverable> {

	@Override
	public void onAfterCreate(Deliverable model) throws ModelListenerException {
		try {
			if (model == null) {
				return;
			}
			_log.info("Deliverable VRBusiness Insert.....");			
			// update VRBusiness here
			String businessTypeCode = model.getDeliverableType();
			int mtCore = 1;
			String businessResult = UpdateVrBusiness(model, mtCore);
			_log.info("====businessTypeCode====" + businessTypeCode + "==businessResult==" + businessResult);
			
			
			
		} catch (Exception e) {
			_log.error(e);
		}
	
	}

	@Override
	public void onAfterUpdate(Deliverable model) throws ModelListenerException {		
		try {
			if (modelBeforeUpdate == null) {
				return;
			}
			_log.info("Deliverable VRBusiness Update.....");			
			// update VRBusiness here
			String businessTypeCode = model.getDeliverableType();
			int mtCore = 1;
			String businessResult = UpdateVrBusiness(model, mtCore);
			_log.info("====businessTypeCode====" + businessTypeCode + "==businessResult==" + businessResult);
			
			
			
		} catch (Exception e) {
			_log.error(e);
		}
	}

	@Override
	public void onBeforeUpdate(Deliverable model) throws ModelListenerException {
		try {
			modelBeforeUpdate = DeliverableLocalServiceUtil.getDeliverable(model.getPrimaryKey());
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public static Deliverable modelBeforeUpdate;

	private Log _log = LogFactoryUtil.getLog(DeliverableListenner.class.getName());
	

	public String UpdateVrBusiness(Deliverable dossierDeliverableModel, int mtCore) throws PortalException {
		try {
			if (dossierDeliverableModel == null || (dossierDeliverableModel !=  null && !dossierDeliverableModel.getDeliverableState().equalsIgnoreCase("2"))) {
				return "";
			}
			
			String formData = dossierDeliverableModel.getFormData();
			Date modifiedDate = dossierDeliverableModel.getModifiedDate();
			DossierFile dossierFile = null;
			Registration registration = null;
			VRApplicantProfile appProfile = null;

			String applicantIdNo = dossierDeliverableModel.getApplicantIdNo();
			String deliverableCode = dossierDeliverableModel.getDeliverableCode();
			if (Validator.isNotNull(applicantIdNo)) {
				List <VRApplicantProfile> lstVRApplicantProfile = VRApplicantProfileLocalServiceUtil.findByapplicantCode(1, applicantIdNo);
				if (lstVRApplicantProfile != null && lstVRApplicantProfile.size() > 0 ) {
					appProfile = lstVRApplicantProfile.get(0);
				}
				registration = RegistrationLocalServiceUtil.getByApplicantIdNo(applicantIdNo);
				
			}
			if (Validator.isNotNull(deliverableCode)) {
				dossierFile = DossierFileLocalServiceUtil.getByDeliverableCode(deliverableCode);
			}			
			
			if (Validator.isNull(formData)) {
				return "";
			}
			LinkedHashMap<String, String> mapValues = ConvertJONObjectUtils.getKeyValuesMap(formData);
			if (Validator.isNull(mapValues)) {
				return "";
			}
						
			String businessTypeCode = dossierDeliverableModel.getDeliverableType();
			switch (businessTypeCode) {
			case "GCN_TDTK_XCG":  //Tham dinh thiet ke Xe co gioi
				// update table VRVehicleTypeCertificate
				if (mtCore == 1) {
					/*
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.updateTT302011BGTVTTTKXCG_VehicleTypeCertificate(mapValues, modifiedDate, registration, appProfile, dossierFile);
	
					long vrVehicleTypeCertificateId = vrVehicleTypeCertificate.getId();
					
					updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId, modifiedDate);
	
					// update table VR_VEHICLESPECIFICATION
					VRVehicleSpecificationLocalServiceUtil.updateVehicleSpecification(mapValues, vrVehicleTypeCertificateId,
							modifiedDate, dossierFile);
					*/
				}
				break;				
			case "TT302011BGTVTTDTKXMCD": //Tham dinh thiet ke Xe may chuyen dung
				
				break;		
			case "TT302011BGTVTKTSPMXCG":  //Kiem tra san pham mau Xe co gioi
				
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
			
			return "finished";	
		} catch (SystemException e) {
			_log.error(e);
			return "";
		}
	}
	
	private void updateVehicleSpecification(LinkedHashMap<String, String> mapValues, long vrVehicleTypeCertificateId, Date modifiedDate) {
		//_log.info("**mapValues** " + mapValues);
		
		String strChungChi = mapValues.get("bien_ban");
		
		try {
			JSONObject objChungChi = JSONFactoryUtil.createJSONObject(strChungChi);
			
			List<VRConfigTechSpec> configTechSpecs = VRConfigTechSpecLocalServiceUtil.getByVCMD("XCG", "21");

			String prefix = "bb_";
			
			String prefixResult = "kl_";

			for (VRConfigTechSpec configTechSpec : configTechSpecs) {
				
				
				String specificationCode = prefix + configTechSpec.getSpecificationCode();
				
				String specificationValue = objChungChi.getString(specificationCode);
				
				String specificationResult = objChungChi.getString(prefixResult + configTechSpec.getSpecificationCode());
				
				VRVehicleSpecification elm = VRVehicleSpecificationLocalServiceUtil.findByCode(vrVehicleTypeCertificateId, configTechSpec.getSpecificationCode());

				VRVehicleSpecification specification = new VRVehicleSpecificationImpl();
				
				boolean isnew = false;
				
				if (Validator.isNotNull(elm)) {
					 specification = elm;
				} else {
					long specId = CounterLocalServiceUtil.increment(VRVehicleSpecification.class.getName());
					
					specification.setPrimaryKey(specId);
					
					isnew = true;
				}
				
				
				specification.setVehicleCertificateId(vrVehicleTypeCertificateId);
				specification.setSpecificationCode(configTechSpec.getSpecificationCode());
				specification.setSpecificationName(configTechSpec.getSpecificationDisplayName());
				specification.setSpecificationValue(specificationValue);
				specification.setSpecificationValueDescription(configTechSpec.getSpecificationEntryPlaceholder());
				//TODO
				specification.setSequenceNo(configTechSpec.getSequenceNo());
				specification.setSpecificationBasicUnit(configTechSpec.getSpecificationBasicUnit());
				specification.setSpecificationStandard(configTechSpec.getSpecificationStandard());
				specification.setSpecificationGroup(Integer.toString(configTechSpec.getSpecificationGroup()));
				specification.setSpecificationDataCollectionID(configTechSpec.getSpecificationDataCollectionId());
				specification.setSpecificationResult(specificationResult);
				specification.setSyncDate(GetterUtil.getDate(modifiedDate, new SimpleDateFormat("dd:MM:yyyy hh:mm:ss")));
				
				if (isnew) {
					VRVehicleSpecificationLocalServiceUtil.addVRVehicleSpecification(specification);

				} else {
					VRVehicleSpecificationLocalServiceUtil.updateVRVehicleSpecification(specification);

				}
			}
			
		} catch (JSONException e) {
			_log.info("**ERROR** CAN NOT CREATE");

		}
	}

}
