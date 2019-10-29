package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRApplicantProfileAction;
import com.fds.vr.business.action.impl.VRApplicantProfileActionImpl;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.exception.NoSuchVRApplicantProfileException;
import com.fds.vr.business.exception.NoSuchVRProductionPlantException;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.impl.VRApplicantProfileImpl;
import com.fds.vr.business.model.impl.VRProductTypeImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRProductionPlantModelImpl;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.fds.vr.controler.VRApplicantManagement;
import com.fds.vr.model.VRApplicantProfileApiModel;
import com.fds.vr.model.VRApplicantProfileBeanParam;
import com.fds.vr.model.VRProductionPlantApiModel;
import com.fds.vr.model.VRProductionPlantEmployeeApiModel;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.LinkedHashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public class VRApplicantManagementImpl implements VRApplicantManagement {
	private Log _log = LogFactoryUtil.getLog(VRApplicantManagementImpl.class);

	@Override
	public Response findApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRApplicantProfileBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRApplicantProfileAction actionImpl = new VRApplicantProfileActionImpl();
			result = actionImpl.findVRApplicantProfile(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrappicantprofile")).build();
		}
	}

	@Override
	public Response findApplicantProfileDetail(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRApplicantProfileBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRApplicantProfileAction actionImpl = new VRApplicantProfileActionImpl();
			result = actionImpl.findVRApplicantProfileDetail(user, serviceContext, params);
			if (result != null && result.length() > 0) {
				return Response.status(200).entity(result.toJSONString()).build();
			} else {
				return Response.status(404).entity(VRRestUtil.errorMessage("Not found")).build();
			}

		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrappicantprofile")).build();
		}
	}

	@Override
	public Response updateVRApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRApplicantProfileApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRApplicantProfile targetModel = new VRApplicantProfileImpl();

			targetModel = VRApplicantProfileLocalServiceUtil.getVRApplicantProfile(model.getId());

			VRApplicantProfile object = (VRApplicantProfile) VRRestUtil.mappingModel(model,
					VRProductionPlantEmployeeApiModel.class, targetModel, VRApplicantProfileImpl.class);

			object = VRApplicantProfileLocalServiceUtil.updateVRApplicantProfile(object);

			result = ActionUtil.object2Json(object, VRApplicantProfileImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRApplicantProfileException) {

				error.setCode(500);
				error.setMessage(NoSuchVRApplicantProfileException.class.toString());
				error.setDescription("id not found");

			} else if (e instanceof NullPointerException) {

				error.setCode(500);
				error.setMessage(NullPointerException.class.toString());
				error.setDescription("id required");

			} else {

				_log.error(e);
				error.setMessage(e.toString());
			}

			return Response.status(500).entity(error).build();
		}

	}

	@Override
	public Response createVRApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRApplicantProfileApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRApplicantProfile targetModel = new VRApplicantProfileImpl();

			model.setId((long) 0);

			VRApplicantProfile object = (VRApplicantProfile) VRRestUtil.mappingModel(model,
					VRProductionPlantEmployeeApiModel.class, targetModel, VRApplicantProfileImpl.class);

			object = VRApplicantProfileLocalServiceUtil.updateVRApplicantProfile(object);

			result = ActionUtil.object2Json(object, VRApplicantProfileImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();
		} catch (Exception e) {
			_log.error(e);

			ErrorMsg error = new ErrorMsg();

			error.setCode(500);
			error.setMessage(e.toString());

			return Response.status(500).entity(error).build();
		}

	}

}
