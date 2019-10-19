package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryInstance;
import com.fds.vr.business.model.impl.VRApplicantProfileImpl;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public class VRProductionPlantActionImpl implements VRProductionPlantAction{

	@Override
	public JSONObject findVRVRProductionPlant(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Integer mtcore = null;
		Long applicantprofileid = null;
		

		if (params != null) {

			if (params.containsKey("mtcore")) {
				mtcore = (Integer) params.get("mtcore");
			}
			if (params.containsKey("applicantprofileid")) {
				applicantprofileid = (Long) params.get("applicantprofileid");
			}
		}

		String tableAlias = StringPool.BLANK;

		String sqlStatementPattern = "SELECT [$STATEMENT_COLUMN$] FROM vr_productionplant"
				+ (Validator.isNotNull(tableAlias) ? " AS " + tableAlias : StringPool.BLANK)
				+ " [$CONDITION$] [$ORDERBY$]";

		LinkedHashMap<String, String> columnStatementMap = new LinkedHashMap<String, String>();
		//columnStatementMap.put(ActionUtil.createSCNWTAS("*", tableAlias), StringPool.BLANK);

		StringBuilder conditions = new StringBuilder();

		conditions.append(" WHERE 1 = 1 ");

		if (mtcore != null) {
			conditions.append(ActionUtil.buildSQLCondition("mtcore", mtcore, " AND ", StringPool.EQUAL,
					tableAlias));
		}

		if (Validator.isNotNull(applicantprofileid)) {
			conditions.append(ActionUtil.buildSQLCondition("applicantprofileid", applicantprofileid, " AND ",
					StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(keyword)) {
			conditions
					.append(ActionUtil.buildSQLCondition(
							"(" 
									+ ActionUtil.buildSQLCondition("mappingma_cty", "'%" + keyword + "%'", "", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingten_cty", "'%" + keyword + "%'", " OR ", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingdia_chi_cty", "'%" + keyword + "%'", " OR ", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingma_xuong_lr", "'%" + keyword + "%'", " OR ", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingten_xuong_lr", "'%" + keyword + "%'", " OR ", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("mappingdia_chi_xuong_lr", "'%" + keyword + "%'", " OR ", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("productionplantcode", "'%" + keyword + "%'", " OR ", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("productionplantname", "'%" + keyword + "%'", " OR ", StringPool.LIKE, tableAlias)
									+ ActionUtil.buildSQLCondition("productionplantaddress", "'%" + keyword + "%'", " OR ", StringPool.LIKE, tableAlias)
									+ 
							")",
							StringPool.BLANK, " AND ", StringPool.BLANK));
		}

		LinkedHashMap<String, String> sortedby = ActionUtil.getOrderFiledMap(params, columnStatementMap);

		SQLQueryInstance instance = ActionUtil.createSQLQueryInstance(sqlStatementPattern, columnStatementMap,
				conditions, sortedby, VRApplicantProfileImpl.class, "VRApplicantProfile");

		// System.out.println("SQL Statement:" + instance.getSqlStatemanent());

		JSONArray array = VRProductionPlantLocalServiceUtil.findData(instance.getSqlStatemanent(),
				instance.getColumnAliasNames(), instance.getColumnDataTypes(), instance.getReturnClassName(),
				instance.getClassName(), start, end);

		long total = VRProductionPlantLocalServiceUtil.counData(instance.getCountStatemanent());

		JSONObject result = JSONFactoryUtil.createJSONObject();

		result.put("total", total);
		result.put("data", array);
		return result;
	}
	
}
