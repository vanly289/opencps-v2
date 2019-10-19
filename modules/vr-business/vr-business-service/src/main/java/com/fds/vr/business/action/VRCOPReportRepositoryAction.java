package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRCOPReportRepositoryAction {
	public JSONObject findVRCOPReportRepositoryYear(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);
	
	public JSONObject findVRCOPReportRepository(User user, ServiceContext serviceContext, Integer year,
			LinkedHashMap<String, Object> params);
}
