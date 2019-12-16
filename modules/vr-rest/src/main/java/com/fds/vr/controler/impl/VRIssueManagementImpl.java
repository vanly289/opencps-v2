package com.fds.vr.controler.impl;

import com.fds.vr.business.action.impl.VRIssueActionImpl;
import com.fds.vr.controler.VRIssueManagement;
import com.fds.vr.model.VRIssueBeanParam;
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

public class VRIssueManagementImpl implements VRIssueManagement{
	
	@Override
	public Response countVRIssue(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRIssueBeanParam query) {
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			
			VRIssueActionImpl actionImpl = new VRIssueActionImpl();
			
			return Response.status(200).entity(actionImpl.countVRIssue(user, serviceContext, params)).build();
			
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't count vrissue").toJSONString()).build();
		}
	}

	@Override
	public Response searchVRIssue(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRIssueBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			
			VRIssueActionImpl actionImpl = new VRIssueActionImpl();
			
			result = actionImpl.findVRIssue(user, serviceContext, params);
			
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't search vrissue").toJSONString()).build();
		}
	}
	
	private Log _log = LogFactoryUtil.getLog(VRIssueManagementImpl.class.getName());

	
	
}
