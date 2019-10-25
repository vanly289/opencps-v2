package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRVehicleTypeCertificateAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryInstance;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public class VRVehicleTypeCertificateActionImpl implements VRVehicleTypeCertificateAction {
	private Log _log = LogFactoryUtil.getLog(VRVehicleTypeCertificateActionImpl.class);

	@Override
	public JSONObject findVehicleTypeCertificateYear(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		Integer mtcore = null;
		Long productionplantid = null;
		String module = StringPool.BLANK;
		String productionPlantCode = StringPool.BLANK;
		if (params != null) {

			if (params.containsKey("mtcore")) {
				mtcore = (Integer) params.get("mtcore");
			}
			if (params.containsKey("productionplantid")) {
				productionplantid = (Long) params.get("productionplantid");
			}
			if (params.containsKey("module")) {
				module = (String) params.get("module");
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = (String) params.get("productionplantcode");
			}
		}

		String tableAlias = StringPool.BLANK;

		String sqlStatementPattern = "SELECT [$STATEMENT_COLUMN$] FROM vr_vehicletypecertificate"
				+ (Validator.isNotNull(tableAlias) ? " AS " + tableAlias : StringPool.BLANK)
				+ " [$CONDITION$] ORDER BY record_year DESC";

		LinkedHashMap<String, String> columnStatementMap = new LinkedHashMap<String, String>();
		columnStatementMap.put(ActionUtil.createSCNWTAS("year(certificaterecorddate) AS record_year", ""), int.class.getName());
		StringBuilder conditions = new StringBuilder();

		conditions.append(" WHERE year(certificaterecorddate) > 0 ");

		if (mtcore != null) {
			conditions.append(ActionUtil.buildSQLCondition("mtcore", mtcore, " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productionplantid)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantid", productionplantid, " AND ",
					StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(module)) {
			conditions.append(
					ActionUtil.buildSQLCondition("module", "'" + module + "'", " AND ", StringPool.EQUAL, tableAlias));
		}

		if (Validator.isNotNull(productionPlantCode)) {
			conditions.append(ActionUtil.buildSQLCondition("productionplantcode", "'" + productionPlantCode + "'",
					" AND ", StringPool.EQUAL, tableAlias));
		}

		conditions.append(" GROUP BY year(COPReportDate) ");

		LinkedHashMap<String, String> sortedby = ActionUtil.getOrderFiledMap(params, columnStatementMap);

		SQLQueryInstance instance = ActionUtil.createSQLQueryInstance(sqlStatementPattern, columnStatementMap,
				conditions, sortedby, VRCOPReportRepositoryImpl.class, StringPool.BLANK, tableAlias, StringPool.BLANK);

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
	public JSONObject findVehicleTypeCertificate(User user, ServiceContext serviceContext, Integer year,
			LinkedHashMap<String, Object> params, String advancesearchParams) {
		// TODO Auto-generated method stub
		return null;
	}

}
