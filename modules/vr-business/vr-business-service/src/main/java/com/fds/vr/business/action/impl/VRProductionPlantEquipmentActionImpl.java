package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantEquipmentAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryInstance;
import com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentImpl;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.LinkedHashMap;
import java.util.List;

public class VRProductionPlantEquipmentActionImpl implements VRProductionPlantEquipmentAction {

	private static Log _log = LogFactoryUtil.getLog(VRProductionPlantEquipmentActionImpl.class);

	@Override
	public JSONArray findByProductionPlanCode_ProductClassificationCode(String productionPlantCode,
			String productClassificationCode) {

		JSONArray result = JSONFactoryUtil.createJSONArray();

		try {
			List<VRProductionPlantEquipment> dataList = VRProductionPlantEquipmentLocalServiceUtil
					.findByProductionPlanCode(productionPlantCode);

			if (Validator.isNotNull(productClassificationCode)) {
				switch (productClassificationCode) {
				case "XCG":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCG() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCGNK":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCGNK() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "SMRM":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupSMRM() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCH":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCH() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCN":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCN() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XMY":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXMY() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XDD":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXDD() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				default:
					for (VRProductionPlantEquipment data : dataList) {

						result.put(
								ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class, StringPool.BLANK));

					}
					break;
				}
			} else {
				for (VRProductionPlantEquipment data : dataList) {

					result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class, StringPool.BLANK));

				}

			}
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}
	
	@Override
	public boolean deleteProductionPlantEquipment(String ids) {

		boolean flag = false;

		long defaultValue = 0;

		long[] idArray = StringUtil.split(ids, defaultValue);

		VRProductionPlantEquipment vrProductionPlantEquipment = null;

		for (long id : idArray) {

			vrProductionPlantEquipment = null;

			try {

				vrProductionPlantEquipment = VRProductionPlantEquipmentLocalServiceUtil
						.getVRProductionPlantEquipment(id);

				VRProductionPlantEquipmentLocalServiceUtil.deleteVRProductionPlantEquipment(vrProductionPlantEquipment);

				flag = true;

			} catch (Exception e) {

				if (e instanceof NoSuchVRProductionPlantEquipmentException) {

					flag = false;

				}

			}

		}

		return flag;
	}
	
	
	private String createMarkUpParam(String productClassificationCodes) {
		
		StringBuilder result = new StringBuilder();
		StringBuilder condition = new StringBuilder();

		String[] productClassificationCodesArray = StringUtil.split(productClassificationCodes);
		
		
		
		for(String productClassificationCode: productClassificationCodesArray) {
		
			if(productClassificationCode.equals("XCG")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXCG", 1, StringPool.BLANK,StringPool.EQUAL, StringPool.BLANK));
				break;
				
			}else if(productClassificationCode.equals("XCGNK")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXCGNK", 1, StringPool.BLANK,StringPool.EQUAL, StringPool.BLANK));
				break;
				
			}else if(productClassificationCode.equals("SMRM")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupSMRM", 1, StringPool.BLANK,StringPool.EQUAL, StringPool.BLANK));
				break;
				
			}else if(productClassificationCode.equals("XCH")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXCH", 1, StringPool.BLANK,StringPool.EQUAL, StringPool.BLANK));
				break;
				
			}else if(productClassificationCode.equals("XCN")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXCN", 1, StringPool.BLANK,StringPool.EQUAL, StringPool.BLANK));
				break;
				
			}else if(productClassificationCode.equals("XMY")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXMY", 1, StringPool.BLANK,StringPool.EQUAL, StringPool.BLANK));
				break;
				
			}else if(productClassificationCode.equals("XDD")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXDD", 1, StringPool.BLANK,StringPool.EQUAL, StringPool.BLANK));
				break;
			}
		}
		
		for(String productClassificationCode: productClassificationCodesArray) {
			
			if(productClassificationCode.equals("XCG")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXCG", 1, " OR ",StringPool.EQUAL, StringPool.BLANK));
			}else if(productClassificationCode.equals("XCGNK")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXCGNK", 1, " OR ",StringPool.EQUAL, StringPool.BLANK));
			}else if(productClassificationCode.equals("SMRM")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupSMRM", 1, " OR ",StringPool.EQUAL, StringPool.BLANK));
			}else if(productClassificationCode.equals("XCH")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXCH", 1, " OR ",StringPool.EQUAL, StringPool.BLANK));
			}else if(productClassificationCode.equals("XCN")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXCN", 1, " OR ",StringPool.EQUAL, StringPool.BLANK));
			}else if(productClassificationCode.equals("XMY")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXMY", 1, " OR ",StringPool.EQUAL, StringPool.BLANK));
			}else if(productClassificationCode.equals("XDD")) {
				
				condition.append(ActionUtil.buildSQLCondition("markupXDD", 1, " OR ",StringPool.EQUAL, StringPool.BLANK));
			}
			
		}
		
		
		if(condition.length() > 0) {
			result.append(StringPool.OPEN_PARENTHESIS);
			result.append(condition);
			result.append(StringPool.CLOSE_PARENTHESIS);
		}

		return result.toString();
	}
	
	@Override
	public JSONObject findVRProductionPlantEquipment(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);

		Long productionPlantId = null;
		String productClassificationCodes = StringPool.BLANK;

		if (params != null) {

			if (params.containsKey("productplantid")) {
				productionPlantId = GetterUtil.getLong(params.get("productplantid"));
			}

			if (params.containsKey("productclassificationcode")) {
				productClassificationCodes = GetterUtil.getString(params.get("productclassificationcode"));
			}

			
		}

		String joinStatements = StringPool.BLANK;
		String tableAlias = StringPool.BLANK;
		LinkedHashMap<String, String> columnStatementMap = new LinkedHashMap<String, String>();

		

		String sqlStatementPattern = "SELECT [$STATEMENT_COLUMN$] FROM vr_productionplantequipment"
				+ (Validator.isNotNull(tableAlias) ? " AS " + tableAlias : StringPool.BLANK)
				+ " [$STATEMENT_JOIN$] [$CONDITION$] [$ORDERBY$]";

		StringBuilder conditions = new StringBuilder();

		conditions.append(" WHERE 1=1 ");

		if (productionPlantId != null) {
			conditions.append(ActionUtil.buildSQLCondition("productionPlantId", productionPlantId, " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productClassificationCodes)) {
			
			String condition = createMarkUpParam(productClassificationCodes);
			
			if(condition.length() > 0) {
				conditions.append(ActionUtil.buildSQLCondition(condition,StringPool.BLANK, " AND ",StringPool.BLANK));
			}
			
		}

		LinkedHashMap<String, String> sortedby = ActionUtil.getOrderFiledMap(params, columnStatementMap);

		SQLQueryInstance instance = ActionUtil.createSQLQueryInstance(sqlStatementPattern, columnStatementMap,
				conditions, sortedby, VRProductionPlantEquipmentImpl.class, "VRProductionPlantEquipment", tableAlias, joinStatements);

		JSONArray array = null;

		if (Validator.isNotNull(joinStatements)) {

			array = VRProductionPlantEquipmentLocalServiceUtil.findData(instance.getSqlStatemanent(),
					instance.getColumnAliasNames(), instance.getColumnDataTypes(), null, StringPool.BLANK, start, end);

		} else {
			

			array = VRProductionPlantEquipmentLocalServiceUtil.findData(instance.getSqlStatemanent(),
					instance.getColumnAliasNames(), instance.getColumnDataTypes(), instance.getReturnClassName(),
					instance.getClassName(), start, end);
		}

		long total = VRProductionPlantEquipmentLocalServiceUtil.counData(instance.getCountStatemanent());

		JSONObject result = JSONFactoryUtil.createJSONObject();

		result.put("total", total);
		result.put("data", array);
		return result;
	}
	

}
