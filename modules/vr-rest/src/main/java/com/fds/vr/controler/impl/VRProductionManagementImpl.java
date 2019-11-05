package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.impl.VRProductionClassificationActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantEmployeeActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantEquipmentActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantProdEquipmentActionImpl;
import com.fds.vr.business.action.impl.VRProductionTypeActionImpl;
import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductTypeImpl;
import com.fds.vr.business.model.impl.VRProductTypeModelImpl;
import com.fds.vr.business.model.impl.VRProductionClassificationImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentImpl;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRProductionPlantModelImpl;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentImpl;
import com.fds.vr.controler.VRProductionManagement;
import com.fds.vr.model.VRProductTypeApiModel;
import com.fds.vr.model.VRProductionClassificationApiModel;
import com.fds.vr.model.VRProductionPlantApiModel;
import com.fds.vr.model.VRProductionPlantBeanParam;
import com.fds.vr.model.VRProductionPlantEmployeeApiModel;
import com.fds.vr.model.VRProductionPlantEquipmentApiModel;
import com.fds.vr.model.VRProductionPlantProdEquipmentApiModel;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONArray;
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
public class VRProductionManagementImpl implements VRProductionManagement {
	private Log _log = LogFactoryUtil.getLog(VRProductionManagementImpl.class);

	@Override
	public Response findProductionPlant(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductionPlantBeanParam query) {
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
	public Response findVRProductionPlantProdEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCodes) {

		try {
			VRProductionPlantProdEquipmentActionImpl actionImpl = new VRProductionPlantProdEquipmentActionImpl();

			JSONArray result = actionImpl.findByProductionPlanCode(productionPlantCodes);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}
	}

	@Override
	public Response findVRProductionPlantEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode,
			String productClassificationCode) {

		try {

			VRProductionPlantEquipmentActionImpl actionImpl = new VRProductionPlantEquipmentActionImpl();

			JSONArray result = actionImpl.findByProductionPlanCode_ProductClassificationCode(productionPlantCode,
					productClassificationCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}
	}

	@Override
	public Response findVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String productionPlantCode, String productClassificationCode) {

		try {
			VRProductionTypeActionImpl actionImpl = new VRProductionTypeActionImpl();
			JSONArray result = actionImpl.findProductType(productionPlantCode, productClassificationCode);
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}
	}

	@Override
	public Response findVRProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode) {
		try {

			VRProductionClassificationActionImpl actionImpl = new VRProductionClassificationActionImpl();

			JSONArray result = actionImpl.findVRProductionClassification(productionPlantCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}
	}

	@Override
	public Response findVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String productionPlantCode) {

		try {
			VRProductionPlantEmployeeActionImpl actionImpl = new VRProductionPlantEmployeeActionImpl();
			JSONArray result = actionImpl.findVRProductionPlantEmployee(productionPlantCode);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}
	}

	@Override
	public Response updateVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {

		try {

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model,
					VRProductionPlantApiModel.class, new VRProductionPlantImpl(), VRProductionPlantModelImpl.class);

			JSONObject result = actionImpl.updateVRProductionPlant(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response createVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {

		try {

			VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model,
					VRProductionPlantApiModel.class, new VRProductionPlantImpl(), VRProductionPlantModelImpl.class);

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.createVRProductionPlant(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response updateVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductTypeApiModel model) {

		try {

			VRProductType object = (VRProductType) VRRestUtil.mappingModel(model, VRProductTypeApiModel.class,
					new VRProductTypeImpl(), VRProductTypeModelImpl.class);

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.updateVRProductType(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response createVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductTypeApiModel model) {

		try {

			VRProductType object = (VRProductType) VRRestUtil.mappingModel(model, VRProductTypeApiModel.class,
					new VRProductTypeImpl(), VRProductTypeModelImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.createVRProductType(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response updateVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();

			VRProductionPlantProdEquipment object = (VRProductionPlantProdEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantProdEquipmentApiModel.class, new VRProductionPlantProdEquipmentImpl(),
					VRProductionPlantProdEquipmentImpl.class);

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			result = actionImpl.updateVRProductionPlantProdEquipment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response createVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		try {

			VRProductionPlantProdEquipment object = (VRProductionPlantProdEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantProdEquipmentApiModel.class, new VRProductionPlantProdEquipmentImpl(),
					VRProductionPlantProdEquipmentImpl.class);

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.createVRProductionPlantProdEquipment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response updateVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model) {

		try {

			VRProductionPlantEquipment object = (VRProductionPlantEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantEquipmentApiModel.class, new VRProductionPlantEquipmentImpl(),
					VRProductTypeModelImpl.class);

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.updateVRProductionPlantEquiptment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response createVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model) {

		try {

			VRProductionPlantEquipment object = (VRProductionPlantEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantEquipmentApiModel.class, new VRProductionPlantEquipmentImpl(),
					VRProductTypeModelImpl.class);

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.createVRProductionPlantEquiptment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response updateVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		try {

			VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
					VRProductionPlantEmployeeApiModel.class, new VRProductionPlantEmployeeImpl(),
					VRProductionPlantEmployeeImpl.class);

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.updateVRProductionPlantEmployee(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response createVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		try {

			VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
					VRProductionPlantEmployeeApiModel.class, new VRProductionPlantEmployeeImpl(),
					VRProductionPlantEmployeeImpl.class);

			VRProductionPlantActionImpl actionImpl = new VRProductionPlantActionImpl();

			JSONObject result = actionImpl.createVRProductionPlantEmployee(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response updateVRProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionClassificationApiModel model) {

		try {

			VRProductionClassification object = (VRProductionClassification) VRRestUtil.mappingModel(model,
					VRProductionClassificationApiModel.class, new VRProductionClassificationImpl(),
					VRProductionClassificationImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.updateVRProductionClassification(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response createVRProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionClassificationApiModel model) {

		try {

			VRProductionClassification object = (VRProductionClassification) VRRestUtil.mappingModel(model,
					VRProductionClassificationApiModel.class, new VRProductionClassificationImpl(),
					VRProductionClassificationImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.createVRProductionClassification(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

}
