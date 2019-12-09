package org.opencps.dossiermgt.vr.utils;

import com.fds.vr.business.action.util.ConvertJONObjectUtils;
import com.fds.vr.business.model.VRActionconfig;
import com.fds.vr.business.service.VRActionconfigLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleSpecificationLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.opencps.dossiermgt.action.util.ConstantsUtils;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;

public class VRBussinessUtils {

	public static void processVRBussiness(long groupId, Dossier dossier, DossierAction dossierAction, int mtCore,
			String payload) throws PortalException {
		
		_log.info("====processVRBussiness====" + dossierAction.getServiceProcessId() + "=" + dossierAction.getActionCode());
		
		// HuyMQ: Process save techspec by vr_action_config
		ServiceProcess sp = ServiceProcessLocalServiceUtil.getServiceProcess(dossierAction.getServiceProcessId());
		VRActionconfig actionConfig = VRActionconfigLocalServiceUtil.fetchByA_P(dossierAction.getActionCode(), sp.getProcessNo());
		
		if(actionConfig != null) {
			String vehicleClass = actionConfig.getVehicleClass();
			DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(dossier.getDossierId(), actionConfig.getFileTemplateNo(), false, null);
			
			LinkedHashMap<String, String> mapValues = ConvertJONObjectUtils.getKeyValuesMap(dossierFile.getFormData());
			
			for (Map.Entry<String, String> entry : mapValues.entrySet()) {
			    _log.info(entry.getKey() + "/" + entry.getValue());
			}
			
//			if(vehicleClass.equalsIgnoreCase("xcg")) {
//				String formData = dossierFile.getFormData();
//				
//				boolean save = false;
//				
//				try {
//					if(formData != null && formData.length() > 0) {
//						JSONObject json = JSONFactoryUtil.createJSONObject(formData);
//						
//						Iterator<String> keys = json.keys();
//						
//						while (keys.hasNext()) {
//							String key = keys.next();
//							if (key.indexOf("bb_") > -1) {
//								_log.info("====keys===" + key);
//								String tmp = StringUtil.replace(key, "bb_", "");
//								_log.info("====tmp===" + tmp + "=" + json.get(key));
//
//							}
//						}
//					}
//				} catch(Exception e) {
//					_log.error(e);
//				}
//			}

			if (vehicleClass.equalsIgnoreCase("xcg")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCG(dossierFile.getFormData(), 0l,
						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
						dossierFile.getDeliverableCode());
			} else if (vehicleClass.equalsIgnoreCase("xmy")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XMY(dossierFile.getFormData(), 0l,
						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
						dossierFile.getDeliverableCode());
			} else if (vehicleClass.equalsIgnoreCase("xdd")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XDD(dossierFile.getFormData(), 0l,
						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
						dossierFile.getDeliverableCode());
			} else if (vehicleClass.equalsIgnoreCase("xcn")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCN(dossierFile.getFormData(), 0l,
						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
						dossierFile.getDeliverableCode());
			} else if (vehicleClass.equalsIgnoreCase("xch")) {
				VRVehicleSpecificationLocalServiceUtil.updateVRTechnicalSpec_XCH(dossierFile.getFormData(), 0l,
						dossier.getDossierId(), "", dossier.getDossierNo(), new Date(),
						dossierFile.getDeliverableCode());
			}
		}

		//Process update DossierStatistic
		VRRPDossierStatisticUtils.updateRPdossierstatistics(dossierAction, payload.toString());

		// SONVH bosung 10/05/2019: Cap nhat thong tin ho so CHO CAP PHAT PXX
		String vrStepCode = dossierAction.getStepCode();
		if (groupId == ConstantsUtils.GROUP_CXL && Validator.isNotNull(vrStepCode)
				&& vrStepCode.equalsIgnoreCase("136")) {
			ProcessStep proStep = ProcessStepLocalServiceUtil.fetchBySC_GID(vrStepCode, groupId,
					dossierAction.getServiceProcessId());
			if (proStep != null && proStep.getDossierSubStatus().equalsIgnoreCase("PROCESSING_72")) {
				VRIssueContentUtils.updateVRIssueCertificate(dossier, dossierAction, mtCore);
			}
		}
	}
	
	private static final Log _log = LogFactoryUtil.getLog(VRBussinessUtils.class);

}
