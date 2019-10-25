package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.impl.VRProductionPlantActionImpl;
import com.fds.vr.business.service.VRProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalServiceUtil;
import com.fds.vr.controler.VRProductionManagement;
import com.fds.vr.model.VRProductionPlantApiModel;
import com.fds.vr.model.VRProductionPlantBeanParam;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONArray;
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
import javax.ws.rs.BeanParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public class VRProductionManagementImpl implements VRProductionManagement {
	private Log _log = LogFactoryUtil.getLog(VRProductionManagementImpl.class);

	public Response findProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRProductionPlantBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRProductionPlantAction actionImpl = new VRProductionPlantActionImpl();
			result = actionImpl.findVRVRProductionPlant(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrproductionplant")).build();
		}
	}

	@Override
	public Response getProductionPlantEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode,
			String productClassificationCode) {

		try {

			JSONArray result = VRProductionPlantEquipmentLocalServiceUtil.findByProductionPlanCode(productionPlantCode,
					productClassificationCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}

	@Override
	public Response getProductionPlantProdEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode) {

		try {

			JSONArray result = VRProductionPlantProdEquipmentLocalServiceUtil
					.findByProductionPlanCode(productionPlantCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}

	@Override
	public Response getProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String productionPlantCode, String productClassificationCode) {

		try {

			JSONArray result = VRProductTypeLocalServiceUtil.findByProductionPlanCode(productionPlantCode,
					productClassificationCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}

	@Override
	public Response getProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode) {

		try {

			JSONArray result = VRProductionClassificationLocalServiceUtil.findByProductionPlanCode(productionPlantCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}

	@Override
	public Response getProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode) {

		try {

			JSONArray result = VRProductionPlantEmployeeLocalServiceUtil.findByProductionPlanCode(productionPlantCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}

	@Override
	public Response createVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		_log.info("=============>>>> model:" + model.getMappingTEN_CTY());
		return Response.status(200).entity(result.toString()).build();
	}
}
