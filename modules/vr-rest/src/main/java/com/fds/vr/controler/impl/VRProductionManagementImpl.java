package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.impl.VRProductionPlantActionImpl;
import com.fds.vr.business.action.util.ActionUtil;
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
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

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

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionPlant targetModel = new VRProductionPlantImpl();

			targetModel = VRProductionPlantLocalServiceUtil.getVRProductionPlant(model.getId());

			VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model,
					VRProductionPlantApiModel.class, targetModel, VRProductionPlantModelImpl.class);

			object = VRProductionPlantLocalServiceUtil.updateProductionPlant(object);

			result = ActionUtil.object2Json(object, VRProductionPlantImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionPlantException) {

				error.setCode(500);
				error.setMessage(NoSuchVRProductionPlantException.class.toString());
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
	public Response createVRProductionPlant(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionPlant targetModel = new VRProductionPlantImpl();

			model.setId((long) 0);

			VRProductionPlant object = (VRProductionPlant) VRRestUtil.mappingModel(model,
					VRProductionPlantApiModel.class, targetModel, VRProductionPlantModelImpl.class);

			object = VRProductionPlantLocalServiceUtil.updateProductionPlant(object);

			result = ActionUtil.object2Json(object, VRProductionPlantImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();
		} catch (Exception e) {
			_log.error(e);

			ErrorMsg error = new ErrorMsg();

			error.setCode(500);
			error.setMessage(e.toString());

			return Response.status(500).entity(error).build();
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

			object = VRProductTypeLocalServiceUtil.updateVRProductType(object);

			result = ActionUtil.object2Json(object, VRProductTypeImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductTypeException) {

				error.setCode(500);
				error.setMessage(NoSuchVRProductTypeException.class.toString());
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
	public Response createVRProductType(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRProductTypeApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductType targetModel = new VRProductTypeImpl();

			model.setId((long) 0);

			VRProductType object = (VRProductType) VRRestUtil.mappingModel(model, VRProductTypeApiModel.class,
					targetModel, VRProductTypeModelImpl.class);

			object = VRProductTypeLocalServiceUtil.updateVRProductType(object);

			result = ActionUtil.object2Json(object, VRProductTypeImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();
		} catch (Exception e) {
			_log.error(e);

			ErrorMsg error = new ErrorMsg();

			error.setCode(500);
			error.setMessage(e.toString());

			return Response.status(500).entity(error).build();
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

			object = VRProductionPlantProdEquipmentLocalServiceUtil.updatePlantProdEquipment(object);

			result = ActionUtil.object2Json(object, VRProductionPlantProdEquipmentImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionPlantProdEquipmentException) {

				error.setCode(500);
				error.setMessage(NoSuchVRProductionPlantProdEquipmentException.class.toString());
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
	public Response createVRProductionPlantProdEquiment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionPlantProdEquipment targetModel = new VRProductionPlantProdEquipmentImpl();

			model.setId((long) 0);

			VRProductionPlantProdEquipment object = (VRProductionPlantProdEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantProdEquipmentApiModel.class, targetModel,
					VRProductionPlantProdEquipmentImpl.class);

			object = VRProductionPlantProdEquipmentLocalServiceUtil.updatePlantProdEquipment(object);

			result = ActionUtil.object2Json(object, VRProductionPlantProdEquipmentImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();
		} catch (Exception e) {
			_log.error(e);

			ErrorMsg error = new ErrorMsg();

			error.setCode(500);
			error.setMessage(e.toString());

			return Response.status(500).entity(error).build();
		}

	}

	@Override
	public Response updateVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionPlantEquipment targetModel = new VRProductionPlantEquipmentImpl();

			targetModel = VRProductionPlantEquipmentLocalServiceUtil.getVRProductionPlantEquipment(model.getId());

			VRProductionPlantEquipment object = (VRProductionPlantEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantEquipmentApiModel.class, targetModel, VRProductTypeModelImpl.class);

			object = VRProductionPlantEquipmentLocalServiceUtil.updateProductionPlantEquipment(object);

			result = ActionUtil.object2Json(object, VRProductionPlantEquipmentImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionPlantEquipmentException) {

				error.setCode(500);
				error.setMessage(NoSuchVRProductionPlantEquipmentException.class.toString());
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
	public Response createVRProductionPlantEquiptment(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionPlantEquipment targetModel = new VRProductionPlantEquipmentImpl();

			model.setId((long) 0);

			VRProductionPlantEquipment object = (VRProductionPlantEquipment) VRRestUtil.mappingModel(model,
					VRProductionPlantEquipmentApiModel.class, targetModel, VRProductTypeModelImpl.class);

			object = VRProductionPlantEquipmentLocalServiceUtil.updateProductionPlantEquipment(object);

			result = ActionUtil.object2Json(object, VRProductionPlantEquipmentImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();
		} catch (Exception e) {
			_log.error(e);

			ErrorMsg error = new ErrorMsg();

			error.setCode(500);
			error.setMessage(e.toString());

			return Response.status(500).entity(error).build();
		}

	}

	@Override
	public Response updateVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionPlantEmployee targetModel = new VRProductionPlantEmployeeImpl();

			targetModel = VRProductionPlantEmployeeLocalServiceUtil.getVRProductionPlantEmployee(model.getId());

			VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
					VRProductionPlantEmployeeApiModel.class, targetModel, VRProductionPlantEmployeeImpl.class);

			object = VRProductionPlantEmployeeLocalServiceUtil.updateProductionPlantEmployee(object);

			result = ActionUtil.object2Json(object, VRProductionPlantEmployeeImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionPlantEmployeeException) {

				error.setCode(500);
				error.setMessage(NoSuchVRProductionPlantEmployeeException.class.toString());
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
	public Response createVRProductionPlantEmployee(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionPlantEmployee targetModel = new VRProductionPlantEmployeeImpl();

			model.setId((long) 0);

			VRProductionPlantEmployee object = (VRProductionPlantEmployee) VRRestUtil.mappingModel(model,
					VRProductionPlantEmployeeApiModel.class, targetModel, VRProductionPlantEmployeeImpl.class);

			object = VRProductionPlantEmployeeLocalServiceUtil.updateProductionPlantEmployee(object);

			result = ActionUtil.object2Json(object, VRProductionPlantEmployeeImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			_log.error(e);

			ErrorMsg error = new ErrorMsg();

			error.setCode(500);
			error.setMessage(e.toString());

			return Response.status(500).entity(error).build();
		}

	}

	@Override
	public Response updateVRProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionClassificationApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionClassification targetModel = new VRProductionClassificationImpl();

			targetModel = VRProductionClassificationLocalServiceUtil.getVRProductionClassification(model.getId());

			VRProductionClassification object = (VRProductionClassification) VRRestUtil.mappingModel(model,
					VRProductionClassificationApiModel.class, targetModel, VRProductionClassificationImpl.class);

			object = VRProductionClassificationLocalServiceUtil.updateProductionClassification(object);

			result = ActionUtil.object2Json(object, VRProductionClassificationImpl.class, StringPool.BLANK);

			return Response.status(200).entity(result.toString()).build();

		} catch (SystemException | PortalException | NullPointerException e) {

			ErrorMsg error = new ErrorMsg();
			if (e instanceof NoSuchVRProductionClassificationException) {

				error.setCode(500);
				error.setMessage(NoSuchVRProductionClassificationException.class.toString());
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
	public Response createVRProductionClassification(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRProductionClassificationApiModel model) {

		try {

			JSONObject result = JSONFactoryUtil.createJSONObject();
			VRProductionClassification targetModel = new VRProductionClassificationImpl();

			model.setId((long) 0);

			VRProductionClassification object = (VRProductionClassification) VRRestUtil.mappingModel(model,
					VRProductionClassificationApiModel.class, targetModel, VRProductionClassificationImpl.class);

			object = VRProductionClassificationLocalServiceUtil.updateProductionClassification(object);

			result = ActionUtil.object2Json(object, VRProductionClassificationImpl.class, StringPool.BLANK);

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
