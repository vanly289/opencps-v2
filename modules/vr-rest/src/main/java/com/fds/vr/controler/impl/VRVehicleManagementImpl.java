package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRCOPReportRepositoryAction;
import com.fds.vr.business.action.impl.VRCOPReportRepositoryActionImpl;
import com.fds.vr.controler.VRVehicleManagement;
import com.fds.vr.model.VRVehicleTypeCertificateBeanParam;
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
public class VRVehicleManagementImpl implements VRVehicleManagement {
	private Log _log = LogFactoryUtil.getLog(VRVehicleManagementImpl.class);

	@Override
	public Response findReportRepositoryYear(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRVehicleTypeCertificateBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		_log.info("rest method:findReportRepositoryYear");
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
			User user, ServiceContext serviceContext, Integer year, VRVehicleTypeCertificateBeanParam query,
			String advancesearchParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getVRCOPReportRepository(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long mtCore, String COPReportNo) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
