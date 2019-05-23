package org.opencps.dossiermgt.vr.utils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;

import org.opencps.dossiermgt.action.util.ConstantsUtils;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;

public class VRBussinessUtils {

	public static void processVRBussiness(long groupId, Dossier dossier, DossierAction dossierAction, int mtCore,
			String payload) throws PortalException {

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

}
