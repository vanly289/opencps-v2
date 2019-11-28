package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRIssueAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.impl.VRIssueImpl;
import com.fds.vr.business.service.VRIssueLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public class VRIssueActionImpl implements VRIssueAction {

	@Override
	public JSONObject findVRIssue(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		Long dossierId = null;
		String stampIssueNo = null;
		String appliedDate = null;
		String approvedDate = null;
		String vehicleClass = null;
		Long applicantProfileId = null;
		String applicantName = null;
		String applicantAddress = null;
		String applicantRepresentative = null;
		String applicantRepresentativeTitle = null;
		String applicantEmail = null;
		String applicantPhone = null;
		String applicantFax = null;
		String applicantContactName = null;
		String applicantContactEmail = null;
		String applicantContactPhone = null;
		Long productionPlantId = null;
		String productionPlantCode = null;
		String productionPlantName = null;
		String productionPlantAddress = null;
		String remarks = null;
		String methodOfIssue = null;
		Long totalInDocument = null;
		Long issueCorporationId = null;
		String verifyCorporationId = null;
		Integer digitalissuestatus = null;
		String issueType = null;
		Integer averageSTBQuantity = null;
		Integer maxMonthQuantity = null;
		Integer averageSTMQuantity = null;
		Integer accumulatedMonthQuantity = null;
		Integer totalInUse = null;
		Integer totalCancelled = null;
		Integer totalLost = null;
		Integer totalNotUsed = null;
		Integer totalReturned = null;
		String flow = null;
		String examinationRequired = null;
		String examinationPeriod = null;
		String examinationLastTime = null;
		String copresult = null;
		String copreportno = null;
		String copreportdate = null;
		String postreview = null;
		String postreviewrecordno = null;
		String postreviewrecorddate = null;
		String corporationId = null;
		String inspectorcode = null;
		String inspectorname = null;
		String leadername = null;
		String applicantmaker = null;
		String applicantchecker = null;
		Long inspectorId = null;
		Long issueInspectorId = null;
		Long verifyInspectorId = null;
		//String modifyDate = null;
		//String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("dossierid")) {
				dossierId = GetterUtil.getLong(params.get("dossierid"));
			}
			if (params.containsKey("stampissueno")) {
				stampIssueNo = GetterUtil.getString(params.get("stampissueno"));
			}
			if (params.containsKey("applieddate")) {
				appliedDate = GetterUtil.getString(params.get("applieddate"));
			}
			if (params.containsKey("approveddate")) {
				approvedDate = GetterUtil.getString(params.get("approveddate"));
			}
			if (params.containsKey("vehicleclass")) {
				vehicleClass = GetterUtil.getString(params.get("vehicleclass"));
			}
			if (params.containsKey("applicantprofileid")) {
				applicantProfileId = GetterUtil.getLong(params.get("applicantprofileid"));
			}
			if (params.containsKey("applicantname")) {
				applicantName = GetterUtil.getString(params.get("applicantname"));
			}
			if (params.containsKey("applicantaddress")) {
				applicantAddress = GetterUtil.getString(params.get("applicantaddress"));
			}
			if (params.containsKey("applicantrepresentative")) {
				applicantRepresentative = GetterUtil.getString(params.get("applicantrepresentative"));
			}
			if (params.containsKey("applicantrepresentativetitle")) {
				applicantRepresentativeTitle = GetterUtil.getString(params.get("applicantrepresentativetitle"));
			}
			if (params.containsKey("applicantemail")) {
				applicantEmail = GetterUtil.getString(params.get("applicantemail"));
			}
			if (params.containsKey("applicantphone")) {
				applicantPhone = GetterUtil.getString(params.get("applicantphone"));
			}
			if (params.containsKey("applicantfax")) {
				applicantFax = GetterUtil.getString(params.get("applicantfax"));
			}
			if (params.containsKey("applicantcontactname")) {
				applicantContactName = GetterUtil.getString(params.get("applicantcontactname"));
			}
			if (params.containsKey("applicantcontactemail")) {
				applicantContactEmail = GetterUtil.getString(params.get("applicantcontactemail"));
			}
			if (params.containsKey("applicantcontactphone")) {
				applicantContactPhone = GetterUtil.getString(params.get("applicantcontactphone"));
			}
			if (params.containsKey("productionplantid")) {
				productionPlantId = GetterUtil.getLong(params.get("productionplantid"));
			}
			if (params.containsKey("productionplantcode")) {
				productionPlantCode = GetterUtil.getString(params.get("productionplantcode"));
			}
			if (params.containsKey("productionplantname")) {
				productionPlantName = GetterUtil.getString(params.get("productionplantname"));
			}
			if (params.containsKey("productionplantaddress")) {
				productionPlantAddress = GetterUtil.getString(params.get("productionplantaddress"));
			}
			if (params.containsKey("remarks")) {
				remarks = GetterUtil.getString(params.get("remarks"));
			}
			if (params.containsKey("methodofissue")) {
				methodOfIssue = GetterUtil.getString(params.get("methodofissue"));
			}
			if (params.containsKey("totalindocument")) {
				totalInDocument = GetterUtil.getLong(params.get("totalindocument"));
			}
			if (params.containsKey("issuecorporationid")) {
				issueCorporationId = GetterUtil.getLong(params.get("issuecorporationid"));
			}
			if (params.containsKey("verifycorporationid")) {
				verifyCorporationId = GetterUtil.getString(params.get("verifycorporationid"));
			}
			if (params.containsKey("digitalissuestatus")) {
				digitalissuestatus = GetterUtil.getInteger(params.get("digitalissuestatus"));
			}
			if (params.containsKey("issuetype")) {
				issueType = GetterUtil.getString(params.get("issuetype"));
			}
			if (params.containsKey("averagestbquantity")) {
				averageSTBQuantity = GetterUtil.getInteger(params.get("averagestbquantity"));
			}
			if (params.containsKey("maxmonthquantity")) {
				maxMonthQuantity = GetterUtil.getInteger(params.get("maxmonthquantity"));
			}
			if (params.containsKey("averagestmquantity")) {
				averageSTMQuantity = GetterUtil.getInteger(params.get("averagestmquantity"));
			}
			if (params.containsKey("accumulatedmonthquantity")) {
				accumulatedMonthQuantity = GetterUtil.getInteger(params.get("accumulatedmonthquantity"));
			}
			if (params.containsKey("totalinuse")) {
				totalInUse = GetterUtil.getInteger(params.get("totalinuse"));
			}
			if (params.containsKey("totalcancelled")) {
				totalCancelled = GetterUtil.getInteger(params.get("totalcancelled"));
			}
			if (params.containsKey("totallost")) {
				totalLost = GetterUtil.getInteger(params.get("totallost"));
			}
			if (params.containsKey("totalnotused")) {
				totalNotUsed = GetterUtil.getInteger(params.get("totalnotused"));
			}
			if (params.containsKey("totalreturned")) {
				totalReturned = GetterUtil.getInteger(params.get("totalreturned"));
			}
			if (params.containsKey("flow")) {
				flow = GetterUtil.getString(params.get("flow"));
			}
			if (params.containsKey("examinationrequired")) {
				examinationRequired = GetterUtil.getString(params.get("examinationrequired"));
			}
			if (params.containsKey("examinationperiod")) {
				examinationPeriod = GetterUtil.getString(params.get("examinationperiod"));
			}
			if (params.containsKey("examinationlasttime")) {
				examinationLastTime = GetterUtil.getString(params.get("examinationlasttime"));
			}
			if (params.containsKey("copresult")) {
				copresult = GetterUtil.getString(params.get("copresult"));
			}
			if (params.containsKey("copreportno")) {
				copreportno = GetterUtil.getString(params.get("copreportno"));
			}
			if (params.containsKey("copreportdate")) {
				copreportdate = GetterUtil.getString(params.get("copreportdate"));
			}
			if (params.containsKey("postreview")) {
				postreview = GetterUtil.getString(params.get("postreview"));
			}
			if (params.containsKey("postreviewrecordno")) {
				postreviewrecordno = GetterUtil.getString(params.get("postreviewrecordno"));
			}
			if (params.containsKey("postreviewrecorddate")) {
				postreviewrecorddate = GetterUtil.getString(params.get("postreviewrecorddate"));
			}
			if (params.containsKey("corporationid")) {
				corporationId = GetterUtil.getString(params.get("corporationid"));
			}
			if (params.containsKey("inspectorcode")) {
				inspectorcode = GetterUtil.getString(params.get("inspectorcode"));
			}
			if (params.containsKey("inspectorname")) {
				inspectorname = GetterUtil.getString(params.get("inspectorname"));
			}
			if (params.containsKey("leadername")) {
				leadername = GetterUtil.getString(params.get("leadername"));
			}
			if (params.containsKey("applicantmaker")) {
				applicantmaker = GetterUtil.getString(params.get("applicantmaker"));
			}
			if (params.containsKey("applicantchecker")) {
				applicantchecker = GetterUtil.getString(params.get("applicantchecker"));
			}
			if (params.containsKey("inspectorid")) {
				inspectorId = GetterUtil.getLong(params.get("inspectorid"));
			}
			if (params.containsKey("issueinspectorid")) {
				issueInspectorId = GetterUtil.getLong(params.get("issueinspectorid"));
			}
			if (params.containsKey("verifyinspectorid")) {
				verifyInspectorId = GetterUtil.getLong(params.get("verifyinspectorid"));
			}
			/*if (params.containsKey("modifydate")) {
				modifyDate = GetterUtil.getString(params.get("modifydate"));
			}
			if (params.containsKey("syncdate")) {
				syncDate = GetterUtil.getString(params.get("syncdate"));
			}*/
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("stampIssueNo", keyword, "", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("vehicleClass", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantFax", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("remarks", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("methodOfIssue", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("verifyCorporationId", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("issueType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("flow", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("examinationRequired", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("examinationPeriod", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("copresult", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("copreportno", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("postreview", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("postreviewrecordno", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("corporationId", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorcode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorname", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("leadername", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantmaker", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantchecker", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_issue").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL).where("dossierid", dossierId, "AND", StringPool.EQUAL)
				.where("stampissueno", stampIssueNo, "AND", StringPool.EQUAL)
				.where("applieddate", appliedDate, "AND", StringPool.EQUAL)
				.where("approveddate", approvedDate, "AND", StringPool.EQUAL)
				.where("vehicleclass", vehicleClass, "AND", StringPool.EQUAL)
				.where("applicantprofileid", applicantProfileId, "AND", StringPool.EQUAL)
				.where("applicantname", applicantName, "AND", StringPool.EQUAL)
				.where("applicantaddress", applicantAddress, "AND", StringPool.EQUAL)
				.where("applicantrepresentative", applicantRepresentative, "AND", StringPool.EQUAL)
				.where("applicantrepresentativetitle", applicantRepresentativeTitle, "AND", StringPool.EQUAL)
				.where("applicantemail", applicantEmail, "AND", StringPool.EQUAL)
				.where("applicantphone", applicantPhone, "AND", StringPool.EQUAL)
				.where("applicantfax", applicantFax, "AND", StringPool.EQUAL)
				.where("applicantcontactname", applicantContactName, "AND", StringPool.EQUAL)
				.where("applicantcontactemail", applicantContactEmail, "AND", StringPool.EQUAL)
				.where("applicantcontactphone", applicantContactPhone, "AND", StringPool.EQUAL)
				.where("productionplantid", productionPlantId, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("productionplantname", productionPlantName, "AND", StringPool.EQUAL)
				.where("productionplantaddress", productionPlantAddress, "AND", StringPool.EQUAL)
				.where("remarks", remarks, "AND", StringPool.EQUAL)
				.where("methodofissue", methodOfIssue, "AND", StringPool.EQUAL)
				.where("totalindocument", totalInDocument, "AND", StringPool.EQUAL)
				.where("issuecorporationid", issueCorporationId, "AND", StringPool.EQUAL)
				.where("verifycorporationid", verifyCorporationId, "AND", StringPool.EQUAL)
				.where("digitalissuestatus", digitalissuestatus, "AND", StringPool.EQUAL)
				.where("issuetype", issueType, "AND", StringPool.EQUAL)
				.where("averagestbquantity", averageSTBQuantity, "AND", StringPool.EQUAL)
				.where("maxmonthquantity", maxMonthQuantity, "AND", StringPool.EQUAL)
				.where("averagestmquantity", averageSTMQuantity, "AND", StringPool.EQUAL)
				.where("accumulatedmonthquantity", accumulatedMonthQuantity, "AND", StringPool.EQUAL)
				.where("totalinuse", totalInUse, "AND", StringPool.EQUAL)
				.where("totalcancelled", totalCancelled, "AND", StringPool.EQUAL)
				.where("totallost", totalLost, "AND", StringPool.EQUAL)
				.where("totalnotused", totalNotUsed, "AND", StringPool.EQUAL)
				.where("totalreturned", totalReturned, "AND", StringPool.EQUAL)
				.where("flow", flow, "AND", StringPool.EQUAL)
				.where("examinationrequired", examinationRequired, "AND", StringPool.EQUAL)
				.where("examinationperiod", examinationPeriod, "AND", StringPool.EQUAL)
				.where("examinationlasttime", examinationLastTime, "AND", StringPool.EQUAL)
				.where("copresult", copresult, "AND", StringPool.EQUAL)
				.where("copreportno", copreportno, "AND", StringPool.EQUAL)
				.where("copreportdate", copreportdate, "AND", StringPool.EQUAL)
				.where("postreview", postreview, "AND", StringPool.EQUAL)
				.where("postreviewrecordno", postreviewrecordno, "AND", StringPool.EQUAL)
				.where("postreviewrecorddate", postreviewrecorddate, "AND", StringPool.EQUAL)
				.where("corporationid", corporationId, "AND", StringPool.EQUAL)
				.where("inspectorcode", inspectorcode, "AND", StringPool.EQUAL)
				.where("inspectorname", inspectorname, "AND", StringPool.EQUAL)
				.where("leadername", leadername, "AND", StringPool.EQUAL)
				.where("applicantmaker", applicantmaker, "AND", StringPool.EQUAL)
				.where("applicantchecker", applicantchecker, "AND", StringPool.EQUAL)
				.where("inspectorid", inspectorId, "AND", StringPool.EQUAL)
				.where("issueinspectorid", issueInspectorId, "AND", StringPool.EQUAL)
				.where("verifyinspectorid", verifyInspectorId, "AND", StringPool.EQUAL)
				//.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				//.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRIssueLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRIssueLocalServiceUtil.findData(builder.getSelectQuery(), null, null, VRIssueImpl.class,
				"VRIssue", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

}
