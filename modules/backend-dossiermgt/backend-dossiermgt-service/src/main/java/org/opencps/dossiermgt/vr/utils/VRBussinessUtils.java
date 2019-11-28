package org.opencps.dossiermgt.vr.utils;

import com.fds.vr.business.model.VRActionconfig;
import com.fds.vr.business.model.VRTechnicalSpec_LKXCG;
import com.fds.vr.business.model.VRTechnicalSpec_LKXMY;
import com.fds.vr.business.model.VRTechnicalSpec_XCG;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXCGImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGImpl;
import com.fds.vr.business.service.VRActionconfigLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_LKXCGLocalServiceUtil;
import com.fds.vr.business.service.VRTechnicalSpec_XCGLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.lang.reflect.Field;
import java.util.Iterator;

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
			
			if(vehicleClass.equalsIgnoreCase("xcg")) {
				DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(dossier.getDossierId(), actionConfig.getFileTemplateNo(), false, null);
				
				String formData = dossierFile.getFormData();
				
				VRTechnicalSpec_XCG o = new VRTechnicalSpec_XCGImpl();
				boolean save = false;
				
				try {
					if(formData != null && formData.length() > 0) {
						JSONObject json = JSONFactoryUtil.createJSONObject(formData);
						
						Iterator<String> keys = json.keys();
						
						while(keys.hasNext()) {
						    String key = keys.next();
						    _log.info("====keys===" + key);
						    if (key.indexOf("bb_") > -1) {
						    	String tmp = StringUtil.replace(key, "bb_", "");
						    	_log.info("====tmp===" + tmp);
						    	try {
						    		Field field = VRTechnicalSpec_XCGImpl.class.getField(tmp);
							    	field.set(o, json.get(key));
							    	save = true;
						    	} catch(NoSuchFieldException nsfe) {
						    		
						    	}
							    	
						    }
						}
					}
					
					if(save) {
						o.setId(CounterLocalServiceUtil.increment(VRTechnicalSpec_XCG.class.getName()));
						
						VRTechnicalSpec_XCGLocalServiceUtil.addVRTechnicalSpec_XCG(o);
					}
				} catch(Exception e) {
					_log.error(e);
				}
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
