package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.impl.VRProductionPlantActionImpl;
import com.fds.vr.business.exception.NoSuchVRProductTypeException;
import com.fds.vr.business.exception.NoSuchVRProductionClassificationException;
import com.fds.vr.business.exception.NoSuchVRProductionPlantEmployeeException;
import com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException;
import com.fds.vr.business.exception.NoSuchVRProductionPlantException;
import com.fds.vr.business.exception.NoSuchVRProductionPlantProdEquipmentException;
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
import com.fds.vr.business.service.VRProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalServiceUtil;
import com.fds.vr.controler.VRProductionManagement;
import com.fds.vr.model.VRProductTypeApiModel;
import com.fds.vr.model.VRProductionClassificationApiModel;
import com.fds.vr.model.VRProductionPlantApiModel;
import com.fds.vr.model.VRProductionPlantBeanParam;
import com.fds.vr.model.VRProductionPlantEmployeeApiModel;
import com.fds.vr.model.VRProductionPlantEquipmentApiModel;
import com.fds.vr.model.VRProductionPlantProdEquipmentApiModel;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
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

import javax.net.ssl.HttpsURLConnection;
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
	
	@Override
	public Response findProductionPlant( HttpServletRequest request,  HttpHeaders header,
			 Company company,  Locale locale,  User user,
			 ServiceContext serviceContext,  VRProductionPlantBeanParam query) {
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
	public Response getProductionPlantProdEquipment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, String[] productionPlantCode) {

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

		try {

			VRProductionPlant targetModel = new VRProductionPlantImpl();

			targetModel = VRProductionPlantLocalServiceUtil.getVRProductionPlant(model.getId());

			VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model,
					VRProductionPlantApiModel.class, targetModel, VRProductionPlantModelImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.updateVRProductionPlant(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionPlantException) {

				error.setDescription("id not found");

			} else if (e instanceof NullPointerException) {

				error.setDescription("id required");

			} else {

				_log.error(e);
			}

			return Response.status(500).entity(error).build();
		}

	}

	@Override
	public Response createVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {

		try {

			VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model,
					VRProductionPlantApiModel.class, new VRProductionPlantImpl(), VRProductionPlantModelImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.createVRProductionPlant(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).build();
		}

	}

	@Override
	public Response updateVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductTypeApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductType targetModel = new VRProductTypeImpl();

			targetModel = VRProductTypeLocalServiceUtil.getVRProductType(model.getId());

			VRProductType object = (VRProductType) VRRestUtil.mappingModel(model, VRProductTypeApiModel.class,
					targetModel, VRProductTypeModelImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			result = action.updateVRProductType(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductTypeException) {

				error.setDescription("id not found");

			} else if (e instanceof NullPointerException) {

				error.setDescription("id required");

			} else {

				_log.error(e);
				error.setDescription(e.toString());
			}

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();
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

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).build();
		}

	}

	@Override
	public Response updateVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionPlantProdEquipment targetModel = new VRProductionPlantProdEquipmentImpl();

			targetModel = VRProductionPlantProdEquipmentLocalServiceUtil
					.getVRProductionPlantProdEquipment(model.getId());

			VRProductionPlantProdEquipment object = (VRProductionPlantProdEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantProdEquipmentApiModel.class, targetModel,
					VRProductionPlantProdEquipmentImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			result = action.updatePlantProdEquipment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionPlantProdEquipmentException) {

				error.setDescription("id not found");

			} else if (e instanceof NullPointerException) {

				error.setDescription("id required");

			} else {

				_log.error(e);
				error.setMessage(e.toString());
			}

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();
		}

	}

	@Override
	public Response createVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		try {

			VRProductionPlantProdEquipment object = (VRProductionPlantProdEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantProdEquipmentApiModel.class, new VRProductionPlantProdEquipmentImpl(),
					VRProductionPlantProdEquipmentImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.createPlantProdEquipment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).build();
		}

	}

	@Override
	public Response updateVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model) {

		try {

			VRProductionPlantEquipment targetModel = new VRProductionPlantEquipmentImpl();

			targetModel = VRProductionPlantEquipmentLocalServiceUtil.getVRProductionPlantEquipment(model.getId());

			VRProductionPlantEquipment object = (VRProductionPlantEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantEquipmentApiModel.class, targetModel, VRProductTypeModelImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.updateVRProductionPlantEquiptment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionPlantEquipmentException) {

				error.setDescription("id not found");

			} else if (e instanceof NullPointerException) {

				error.setDescription("id required");

			} else {

				_log.error(e);
			}

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).build();
		}

	}

	@Override
	public Response createVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model) {

		try {

			VRProductionPlantEquipment object = (VRProductionPlantEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantEquipmentApiModel.class, new VRProductionPlantEquipmentImpl(),
					VRProductTypeModelImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.createVRProductionPlantEquiptment(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();
		} catch (Exception e) {
			_log.error(e);

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).build();
		}

	}

	@Override
	public Response updateVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		try {

			VRProductionPlantEmployee targetModel = new VRProductionPlantEmployeeImpl();

			targetModel = VRProductionPlantEmployeeLocalServiceUtil.getVRProductionPlantEmployee(model.getId());

			VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
					VRProductionPlantEmployeeApiModel.class, targetModel, VRProductionPlantEmployeeImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.updateVRProductionPlantEmployee(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionPlantEmployeeException) {

				error.setDescription("id not found");

			} else if (e instanceof NullPointerException) {

				error.setDescription("id required");

			} else {

				_log.error(e);
			}

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();
		}

	}

	@Override
	public Response createVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		try {

			VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
					VRProductionPlantEmployeeApiModel.class, new VRProductionPlantEmployeeImpl(),
					VRProductionPlantEmployeeImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.createVRProductionPlantEmployee(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {
			_log.error(e);

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).build();
		}

	}

	@Override
	public Response updateVRProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionClassificationApiModel model) {

		try {

			VRProductionClassification targetModel = new VRProductionClassificationImpl();

			targetModel = VRProductionClassificationLocalServiceUtil.getVRProductionClassification(model.getId());

			VRProductionClassification object = (VRProductionClassification) VRRestUtil.mappingModel(model,
					VRProductionClassificationApiModel.class, targetModel, VRProductionClassificationImpl.class);

			VRProductionPlantAction action = new VRProductionPlantActionImpl();

			JSONObject result = action.updateVRProductionClassification(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionClassificationException) {

				error.setDescription("id not found");

			} else if (e instanceof NullPointerException) {

				error.setDescription("id required");

			} else {

				_log.error(e);

			}

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();
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

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).build();
		}

	}
	
}
