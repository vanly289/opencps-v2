package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRCOPReportRepositoryAction;
import com.fds.vr.business.action.impl.VRCOPReportRepositoryActionImpl;
import com.fds.vr.controler.VRCOPManagement;
import com.fds.vr.model.VRCOPReportRepositoryBeanParam;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public class VRCOPManagementImpl implements VRCOPManagement {
	private Log _log = LogFactoryUtil.getLog(VRCOPManagementImpl.class);

	@Override
	public Response findReportRepositoryYear(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRCOPReportRepositoryBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRCOPReportRepositoryAction actionImpl = new VRCOPReportRepositoryActionImpl();
			result = actionImpl.findVRCOPReportRepositoryYear(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get reportrepositoryyear")).build();
		}
	}

	@Override
	public Response findReportRepository(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, Integer year, VRCOPReportRepositoryBeanParam query, String advancesearchParams) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			_log.info("=========================>>>>>>>>>>>>>>>>>>>>>>>> advancesearchParams " + advancesearchParams);
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRCOPReportRepositoryAction actionImpl = new VRCOPReportRepositoryActionImpl();
			result = actionImpl.findVRCOPReportRepository(user, serviceContext, year, params, advancesearchParams);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get reportrepository")).build();
		}
	}

}
