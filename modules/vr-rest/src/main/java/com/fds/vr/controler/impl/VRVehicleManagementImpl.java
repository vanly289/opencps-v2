package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRVehicleTypeCertificateAction;
import com.fds.vr.business.action.impl.VRVehicleRecordActionImpl;
import com.fds.vr.business.action.impl.VRVehicleTypeCertificateActionImpl;
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

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Locale;

import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

/**
 * @author trungnt
 *
 */
public class VRVehicleManagementImpl implements VRVehicleManagement {
	private Log _log = LogFactoryUtil.getLog(VRVehicleManagementImpl.class);

	@Override
	public Response findVRVehicleCertificateRecordYear(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRVehicleTypeCertificateBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		_log.info("rest method:findVRVehicleCertificateRecordYear");
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRVehicleTypeCertificateAction actionImpl = new VRVehicleTypeCertificateActionImpl();
			result = actionImpl.findVehicleTypeCertificateYear(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get certificateYear")).build();
		}
	}

	@Override
	public Response findVRVehicleCertificate(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, Integer year,
			VRVehicleTypeCertificateBeanParam query, String advancesearchParams) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		_log.info("rest method:findVRVehicleCertificate");
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRVehicleTypeCertificateAction actionImpl = new VRVehicleTypeCertificateActionImpl();
			result = actionImpl.findVehicleTypeCertificate(user, serviceContext, year, params, advancesearchParams);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get certificateYear")).build();
		}
	}

	@Override
	public Response getVRVehicleCertificate(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long mtCore, String copReportNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response importVRVehiclerecord(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, Attachment attachment) {
		InputStream inputStream = null;

		try {

			DataHandler dataHandler = attachment.getDataHandler();

			inputStream = dataHandler.getInputStream();

			VRVehicleRecordActionImpl actionImpl = new VRVehicleRecordActionImpl();

			actionImpl.importVRVehicleRecord(user, serviceContext, inputStream);

			return Response.status(200).entity("").build();

		} catch (Exception e) {

			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get certificateYear")).build();

		}

	}

}
