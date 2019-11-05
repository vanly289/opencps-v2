package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryInstance;
import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductTypeImpl;
import com.fds.vr.business.model.impl.VRProductionClassificationImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentImpl;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentImpl;
import com.fds.vr.business.service.VRProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author trungnt
 *
 */
public class VRProductionPlantActionImpl implements VRProductionPlantAction {

	private static Log _log = LogFactoryUtil.getLog(VRProductionPlantActionImpl.class);

	@Override
	public JSONObject findVRVRProductionPlant(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long mtcore = null;
		Long applicantprofileid = null;
		String productionPlantStatus = StringPool.BLANK;
		String productionPlantType = StringPool.BLANK;
		Long supplierId = null;

		if (params != null) {

			if (params.containsKey("mtcore")) {
				mtcore = GetterUtil.getLong( params.get("mtcore"));
			}
			
			if (params.containsKey("applicantprofileid")) {
				applicantprofileid = GetterUtil.getLong(params.get("applicantprofileid"));
			}
			
			if(params.containsKey("applicantcode")) {
				
				String applicantCode = GetterUtil.getString(params.get("applicantcode"));
				
				LinkedHashMap<String, Object> applicantParams = new LinkedHashMap<String, Object>();
				applicantParams.put("applicantcode", applicantCode);
				applicantParams.put("mtcore", mtcore);
				
				VRApplicantProfileActionImpl applicantProfileAction = new VRApplicantProfileActionImpl();

				JSONObject applicantProfile = applicantProfileAction.findVRApplicantProfileDetail(null, null,
						applicantParams);
				
				if(Validator.isNotNull(applicantProfile)) {
					applicantprofileid= GetterUtil.getLong(applicantProfile.getLong("primaryKey"));
				}
				
			}
			
			
			if (params.containsKey("productionplantstatus")) {
				productionPlantStatus = GetterUtil.getString(params.get("productionplantstatus"));
			}
			if (params.containsKey("productionplanttype")) {
				productionPlantType = GetterUtil.getString(params.get("productionplanttype"));
			}
			
			if (params.containsKey("supplierid")) {
				supplierId = GetterUtil.getLong(params.get("supplierid")) ;
			}
		}
		
		String joinStatements = StringPool.BLANK;
		String tableAlias = StringPool.BLANK;
		String joinWithTableAlias = StringPool.BLANK;
		LinkedHashMap<String, String> columnStatementMap = new LinkedHashMap<String, String>();
		
		
		if (Validator.isNotNull(supplierId)) {
			
			tableAlias = "vr_productionplant";
			joinWithTableAlias = "vr_productionplantsupplier";
			
			joinStatements = "INNER JOIN  "+joinWithTableAlias+" ON "+tableAlias+".supplierid = "+joinWithTableAlias+".id";
			
			columnStatementMap.put(ActionUtil.createSCNWTAS("id", tableAlias),long.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantType", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantName", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantCode", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mtCore", tableAlias),long.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mappingMA_CTY", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mappingTEN_CTY", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mappingDIA_CHI_CTY", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mappingMA_XUONG_LR", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mappingTEN_XUONG_LR", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mappingDIA_CHI_XUONG_LR", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mappingNote", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("mappingStatus", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantAddress", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantStateCode", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantStateName", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantProvinceCode", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantProvinceName", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantDistrictCode", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantDistrictName", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantEmail", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantPhone", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantFax", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantRepresentative", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantRepresentativeTitle", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantContactName", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantContactEmail", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantContactPhone", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantStatus", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantEmployeesNote", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantEquipmentsNote", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("productionPlantProdEquipmentsNote", tableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("registrationId", tableAlias),long.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("registrationFormId", tableAlias),long.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("applicantProfileId", tableAlias),long.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("supplierId", tableAlias),long.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("modifyDate", tableAlias),Date.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("syncDate", tableAlias),Date.class.getName());
			
			
			columnStatementMap.put(ActionUtil.createSCNWTAS("corporationCode", joinWithTableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("corporationName", joinWithTableAlias),String.class.getName());
			columnStatementMap.put(ActionUtil.createSCNWTAS("corporationAddress", joinWithTableAlias),String.class.getName());
		
		}

		String sqlStatementPattern = "SELECT [$STATEMENT_COLUMN$] FROM vr_productionplant"
				+ (Validator.isNotNull(tableAlias) ? " AS " + tableAlias : StringPool.BLANK)
				+ " [$STATEMENT_JOIN$] [$CONDITION$] [$ORDERBY$]";

		
		

		StringBuilder conditions = new StringBuilder();

		conditions.append(" WHERE 1 = 1 ");

		if (mtcore != null) {
			conditions.append(ActionUtil.buildSQLCondition("mtcore", mtcore, " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(applicantprofileid)) {
			conditions.append(ActionUtil.buildSQLCondition("applicantprofileid", applicantprofileid, " AND ",
					StringPool.EQUAL, tableAlias));
		}
		
		if (Validator.isNotNull(productionPlantStatus)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantstatus", "'"+productionPlantStatus+"'", " AND ",
					StringPool.LIKE, tableAlias));
		}
		
		if (Validator.isNotNull(productionPlantType)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplanttype", "'"+productionPlantType+"'", " AND ",
					StringPool.LIKE, tableAlias));
		}
		
		
//		if (Validator.isNotNull(supplierId)) {
//			
//			conditions.append(ActionUtil.buildSQLCondition("supplierid", supplierId, " AND ",
//					StringPool.GREATER_THAN, tableAlias));
//			
//			
//		}

		if (Validator.isNotNull(keyword)) {
			conditions
					.append(ActionUtil.buildSQLCondition(
							"(" + ActionUtil.buildSQLCondition("mappingma_cty", "'%" + keyword + "%'", "",
									StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingten_cty", "'%" + keyword + "%'", " OR ",
											StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingdia_chi_cty", "'%" + keyword + "%'", " OR ",
											StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingma_xuong_lr", "'%" + keyword + "%'", " OR ",
											StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingten_xuong_lr", "'%" + keyword + "%'", " OR ",
											StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingdia_chi_xuong_lr", "'%" + keyword + "%'",
											" OR ", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("productionplantcode", "'%" + keyword + "%'", " OR ",
											StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("productionplantname", "'%" + keyword + "%'", " OR ",
											StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("productionplantaddress", "'%" + keyword + "%'",
											" OR ", StringPool.LIKE, tableAlias)
									+ ")",
							StringPool.BLANK, " AND ", StringPool.BLANK));
		}

		LinkedHashMap<String, String> sortedby = ActionUtil.getOrderFiledMap(params, columnStatementMap);

		SQLQueryInstance instance = ActionUtil.createSQLQueryInstance(sqlStatementPattern, columnStatementMap,
				conditions, sortedby, VRProductionPlantImpl.class, "VRProductionPlant", tableAlias, joinStatements);

		// System.out.println("SQL Statement:" + instance.getSqlStatemanent());
		
		JSONArray array = null;
		
		if(Validator.isNotNull(joinStatements)) {
			
			 array = VRProductionPlantLocalServiceUtil.findData(instance.getSqlStatemanent(),
					instance.getColumnAliasNames(), instance.getColumnDataTypes(),  null,
					StringPool.BLANK, start, end);
			
		}else {
			
			 array = VRProductionPlantLocalServiceUtil.findData(instance.getSqlStatemanent(),
					instance.getColumnAliasNames(), instance.getColumnDataTypes(),  instance.getReturnClassName(),
					instance.getClassName(), start, end);
		}
		

		long total = VRProductionPlantLocalServiceUtil.counData(instance.getCountStatemanent());

		JSONObject result = JSONFactoryUtil.createJSONObject();

		result.put("total", total);
		result.put("data", array);
		return result;
	}
	

	public JSONObject updatePlantProdEquipment(VRProductionPlantProdEquipment object) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			object = VRProductionPlantProdEquipmentLocalServiceUtil.updatePlantProdEquipment(object);

			result = ActionUtil.object2Json(object, VRProductionPlantProdEquipmentImpl.class, StringPool.BLANK);

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", result);

		} catch (Exception e) {
			_log.error(e);

			returnObj.put("status", HttpsURLConnection.HTTP_INTERNAL_ERROR);

		}

		return returnObj;
	}

	public JSONObject createPlantProdEquipment(VRProductionPlantProdEquipment object) {

		object.setId(0);

		return updatePlantProdEquipment(object);
	}

	public JSONObject createVRProductionPlant(VRProductionPlant object) {

		object.setId(0);

		return updateVRProductionPlant(object);
	}

	public JSONObject updateVRProductionPlant(VRProductionPlant object) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			object = VRProductionPlantLocalServiceUtil.updateProductionPlant(object);

			result = ActionUtil.object2Json(object, VRProductionPlantImpl.class, StringPool.BLANK);

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", result);

		} catch (Exception e) {
			_log.error(e);

			returnObj.put("status", HttpsURLConnection.HTTP_INTERNAL_ERROR);

		}

		return returnObj;
	}

	public JSONObject createVRProductionPlantEmployee(VRProductionPlantEmployee object) {

		object.setId(0);

		return updateVRProductionPlantEmployee(object);
	}

	public JSONObject updateVRProductionPlantEmployee(VRProductionPlantEmployee object) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			object = VRProductionPlantEmployeeLocalServiceUtil.updateVRProductionPlantEmployee(object);

			result = ActionUtil.object2Json(object, VRProductionPlantEmployeeImpl.class, StringPool.BLANK);

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", result);

		} catch (Exception e) {
			_log.error(e);

			returnObj.put("status", HttpsURLConnection.HTTP_INTERNAL_ERROR);

		}

		return returnObj;
	}

	public JSONObject createVRProductionPlantEquiptment(VRProductionPlantEquipment object) {

		object.setId(0);

		return updateVRProductionPlantEquiptment(object);
	}

	public JSONObject updateVRProductionPlantEquiptment(VRProductionPlantEquipment object) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			object = VRProductionPlantEquipmentLocalServiceUtil.updateProductionPlantEquipment(object);

			result = ActionUtil.object2Json(object, VRProductionPlantEquipmentImpl.class, StringPool.BLANK);

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", result);

		} catch (Exception e) {
			_log.error(e);

			returnObj.put("status", HttpsURLConnection.HTTP_INTERNAL_ERROR);

		}

		return returnObj;
	}

	public JSONObject createVRProductType(VRProductType object) {

		object.setId(0);

		return updateVRProductType(object);
	}

	public JSONObject updateVRProductType(VRProductType object) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			object = VRProductTypeLocalServiceUtil.updateVRProductType(object);

			result = ActionUtil.object2Json(object, VRProductTypeImpl.class, StringPool.BLANK);

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", result.toString());

		} catch (Exception e) {
			_log.error(e);

			returnObj.put("status", HttpsURLConnection.HTTP_INTERNAL_ERROR);

		}

		return returnObj;
	}

	public JSONObject createVRProductionClassification(VRProductionClassification object) {

		object.setId(0);

		return updateVRProductionClassification(object);
	}

	public JSONObject updateVRProductionClassification(VRProductionClassification object) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			object = VRProductionClassificationLocalServiceUtil.updateProductionClassification(object);

			result = ActionUtil.object2Json(object, VRProductionClassificationImpl.class, StringPool.BLANK);

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", result);

		} catch (Exception e) {
			_log.error(e);

			returnObj.put("status", HttpsURLConnection.HTTP_INTERNAL_ERROR);

		}

		return returnObj;
	}

}
