package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.impl.VRProductionPlantActionImpl;
import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductTypeImpl;
import com.fds.vr.business.model.impl.VRProductTypeModelImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentImpl;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRProductionPlantModelImpl;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentImpl;
import com.fds.vr.business.service.VRProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalServiceUtil;
import com.fds.vr.controler.VRProductionManagement;
import com.fds.vr.model.VRProductTypeApiModel;
import com.fds.vr.model.VRProductionPlantApiModel;
import com.fds.vr.model.VRProductionPlantBeanParam;
import com.fds.vr.model.VRProductionPlantEmployeeApiModel;
import com.fds.vr.model.VRProductionPlantEquipmentApiModel;
import com.fds.vr.model.VRProductionPlantProdEquipmentApiModel;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.exception.PortalException;
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
	public Response updateVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {

		_log.info("=============>>>> model:" + model.getMappingNote());

		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRProductionPlant targetModel = new VRProductionPlantImpl();
		try {
			targetModel = VRProductionPlantLocalServiceUtil.getVRProductionPlant(model.getId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model, VRProductionPlantApiModel.class,
				targetModel, VRProductionPlantModelImpl.class);

		return Response.status(200).entity(result.toString()).build();
	}

	@Override
	public Response createVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {

		return updateVRProductionPlant(request, header, company, locale, user, serviceContext, model);
	}

	@Override
	public Response updateVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductTypeApiModel model) {

		_log.info("=============>>>> model:" + model.getId());

		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRProductType targetModel = new VRProductTypeImpl();
		try {
			targetModel = VRProductTypeLocalServiceUtil.getVRProductType(model.getId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		VRProductType object = (VRProductType) VRRestUtil.mappingModel(model, VRProductTypeApiModel.class, targetModel,
				VRProductTypeModelImpl.class);

		return Response.status(200).entity(result.toString()).build();
	}

	@Override
	public Response createVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductTypeApiModel model) {

		return updateVRProductType(request, header, company, locale, user, serviceContext, model);
	}

	@Override
	public Response updateVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		_log.info("=============>>>> model:" + model.getId());

		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRProductionPlantProdEquipment targetModel = new VRProductionPlantProdEquipmentImpl();
		try {
			targetModel = VRProductionPlantProdEquipmentLocalServiceUtil
					.getVRProductionPlantProdEquipment(model.getId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		VRProductionPlantProdEquipment object = (VRProductionPlantProdEquipment) VRRestUtil.mappingModel(model,
				VRProductionPlantProdEquipmentApiModel.class, targetModel, VRProductionPlantProdEquipmentImpl.class);

		return Response.status(200).entity(result.toString()).build();
	}

	@Override
	public Response createVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		return updateVRProductionPlantProdEquiment(request, header, company, locale, user, serviceContext, model);
	}

	@Override
	public Response updateVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model) {

		_log.info("=============>>>> model:" + model.getId());

		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRProductionPlantEquipment targetModel = new VRProductionPlantEquipmentImpl();
		try {
			targetModel = VRProductionPlantEquipmentLocalServiceUtil.getVRProductionPlantEquipment(model.getId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		VRProductionPlantEquipment object = (VRProductionPlantEquipment) VRRestUtil.mappingModel(model,
				VRProductionPlantEquipmentApiModel.class, targetModel, VRProductTypeModelImpl.class);

		return Response.status(200).entity(result.toString()).build();
	}

	@Override
	public Response createVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model) {

		return updateVRProductionPlantEquiptment(request, header, company, locale, user, serviceContext, model);
	}

	@Override
	public Response updateVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		_log.info("=============>>>> model:" + model.getId());

		JSONObject result = JSONFactoryUtil.createJSONObject();
		VRProductionPlantEmployee targetModel = new VRProductionPlantEmployeeImpl();
		try {
			targetModel = VRProductionPlantEmployeeLocalServiceUtil.getVRProductionPlantEmployee(model.getId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
				VRProductionPlantEmployeeApiModel.class, targetModel, VRProductionPlantEmployeeImpl.class);

		return Response.status(200).entity(result.toString()).build();
	}

	@Override
	public Response createVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		return updateVRProductionPlantEmployee(request, header, company, locale, user, serviceContext, model);
	}
}
