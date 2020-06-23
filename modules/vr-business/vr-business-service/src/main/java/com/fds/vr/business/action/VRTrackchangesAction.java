/**
 * 
 */
package com.fds.vr.business.action;

import com.fds.vr.business.model.VRTrackchanges;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.IOException;
import java.util.Date;

/**
 * @author ddung
 *
 */
public interface VRTrackchangesAction {
	public VRTrackchanges updateVRTrackchanges(long id, String applicantCode, String productionPlantCode,
			long dossierId, String dossierIdCTN, String dossierNo, String contentType, JSONObject formData,
			Date syncDate, ServiceContext serviceContext) throws IOException;
	
	public JSONObject findByApplicantCode(String applicantCode, ServiceContext serviceContext);
	
	public JSONObject findByProductionPlantCode(String productionPlantCode, ServiceContext serviceContext);
	
	public JSONObject findByDossierId(long dossierId, ServiceContext serviceContext);
}
