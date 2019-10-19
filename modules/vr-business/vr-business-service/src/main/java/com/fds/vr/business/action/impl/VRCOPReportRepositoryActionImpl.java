package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRCOPReportRepositoryAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryInstance;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
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
public class VRCOPReportRepositoryActionImpl implements VRCOPReportRepositoryAction {

	@Override
	public JSONObject findVRCOPReportRepositoryYear(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		Integer mtcore = null;
		Long productionplantid = null;

		if (params != null) {

			if (params.containsKey("mtcore")) {
				mtcore = (Integer) params.get("mtcore");
			}
			if (params.containsKey("productionplantid")) {
				productionplantid = (Long) params.get("productionplantid");
			}
		}

		String tableAlias = StringPool.BLANK;

		String sqlStatementPattern = "SELECT [$STATEMENT_COLUMN$] FROM vr_copreportrepository"
				+ (Validator.isNotNull(tableAlias) ? " AS " + tableAlias : StringPool.BLANK)
				+ " [$CONDITION$] ORDER BY report_year DESC";

		LinkedHashMap<String, String> columnStatementMap = new LinkedHashMap<String, String>();
		columnStatementMap.put(ActionUtil.createSCNWTAS("year(COPReportDate) AS report_year", ""), int.class.getName());
		StringBuilder conditions = new StringBuilder();

		conditions.append(" WHERE year(COPReportDate) > 0 ");

		if (mtcore != null) {
			conditions.append(ActionUtil.buildSQLCondition("mtcore", mtcore, " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productionplantid)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantid", productionplantid, " AND ",
					StringPool.EQUAL, tableAlias));
		}

		conditions.append(" GROUP BY year(COPReportDate) ");

		LinkedHashMap<String, String> sortedby = ActionUtil.getOrderFiledMap(params, columnStatementMap);

		SQLQueryInstance instance = ActionUtil.createSQLQueryInstance(sqlStatementPattern, columnStatementMap,
				conditions, sortedby, VRCOPReportRepositoryImpl.class, StringPool.BLANK);

		// System.out.println("SQL Statement:" + instance.getSqlStatemanent());

		JSONArray array = VRCOPReportRepositoryLocalServiceUtil.findData(instance.getSqlStatemanent(),
				instance.getColumnAliasNames(), instance.getColumnDataTypes(), instance.getReturnClassName(),
				instance.getClassName(), start, end);

		long total = array != null ? array.length() : 0;

		JSONObject result = JSONFactoryUtil.createJSONObject();

		result.put("total", total);
		result.put("data", array);
		return result;
	}

	@Override
	public JSONObject findVRCOPReportRepository(User user, ServiceContext serviceContext, Integer year,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		Integer mtcore = null;
		Long productionplantid = null;

		if (params != null) {

			if (params.containsKey("mtcore")) {
				mtcore = (Integer) params.get("mtcore");
			}
			if (params.containsKey("productionplantid")) {
				productionplantid = (Long) params.get("productionplantid");
			}
		}

		String tableAlias = StringPool.BLANK;

		String sqlStatementPattern = "SELECT [$STATEMENT_COLUMN$] FROM vr_copreportrepository"
				+ (Validator.isNotNull(tableAlias) ? " AS " + tableAlias : StringPool.BLANK)
				+ " [$CONDITION$] [$ORDERBY$]";

		LinkedHashMap<String, String> columnStatementMap = new LinkedHashMap<String, String>();

		StringBuilder conditions = new StringBuilder();

		conditions.append(" WHERE 1 = 1 ");

		if (mtcore != null) {
			conditions.append(ActionUtil.buildSQLCondition("mtcore", mtcore, " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productionplantid)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantid", productionplantid, " AND ",
					StringPool.EQUAL, tableAlias));
		}

		if (year != null) {
			conditions.append(" AND year(COPReportDate) = " + year);
		}

		LinkedHashMap<String, String> sortedby = ActionUtil.getOrderFiledMap(params, columnStatementMap);

		SQLQueryInstance instance = ActionUtil.createSQLQueryInstance(sqlStatementPattern, columnStatementMap,
				conditions, sortedby, VRCOPReportRepositoryImpl.class, "VRCOPReportRepository");

		// System.out.println("SQL Statement:" + instance.getSqlStatemanent());

		JSONArray array = VRCOPReportRepositoryLocalServiceUtil.findData(instance.getSqlStatemanent(),
				instance.getColumnAliasNames(), instance.getColumnDataTypes(), instance.getReturnClassName(),
				instance.getClassName(), start, end);

		long total = VRCOPReportRepositoryLocalServiceUtil.counData(instance.getCountStatemanent());

		JSONObject result = JSONFactoryUtil.createJSONObject();

		result.put("total", total);
		result.put("data", array);
		return result;
	}

}
