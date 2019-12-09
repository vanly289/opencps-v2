package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRVehicleTypeCertificateAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.engine.SQLQueryInstance;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentModelImpl;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateImpl;
import com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
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

import java.util.LinkedHashMap;

import javax.net.ssl.HttpsURLConnection;

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
		columnStatementMap.put(ActionUtil.createSCNWTAS("year(certificaterecorddate) AS record_year", ""),
				int.class.getName());
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
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		Long dossierId = null;
		String dossierType = null;
		String dossierNo = null;
		String referenceUid = null;
		String serviceCode = null;
		String serviceName = null;
		Long convertassembleId = null;
		String applicantIdNo = null;
		String applicantName = null;
		String applicantIdDate = null;
		String applicantAddress = null;
		String applicantRepresentative = null;
		String applicantRepresentativeTitle = null;
		String applicantEmail = null;
		String applicantPhone = null;
		String applicantFax = null;
		String applicantContactName = null;
		String applicantContactEmail = null;
		String applicantcontactPhone = null;
		String cityCode = null;
		String manufacturerForeignCode = null;
		String manufacturerName = null;
		String manufacturerAddress = null;
		String manufacturerRepresentative = null;
		String manufacturerRepresentativeTitle = null;
		String manufacturerEmail = null;
		String manufacturerPhone = null;
		String manufacturerFax = null;
		String productionPlantCode = null;
		String productionPlantName = null;
		String productionPlantAddress = null;
		String productionPlantRepresentative = null;
		String productionPlantRepresentativeTitle = null;
		String copReportNo = null;
		String copReportDate = null;
		String copReportExpireDate = null;
		String designerCode = null;
		String designerName = null;
		String designerAddress = null;
		String designerRepresentative = null;
		String designerRepresentativeTitle = null;
		String designerEmail = null;
		String designerPhone = null;
		String designerFax = null;
		String verificationCertificateNo = null;
		String verificationCertificateDate = null;
		String verificationRefNo = null;
		String verificationRefDate = null;
		String typeApprovalCertificateNo = null;
		String typeApprovalCertificateDate = null;
		String designModelCode = null;
		String designModelDescription = null;
		String designSymbol = null;
		String registeredNumber = null;
		String inspectorReceiveDate = null;
		String inspectorSubmitDate = null;
		String inspectorendorSementDate = null;
		String inspectorDeadline = null;
		String inspectorFinishDate = null;
		String inspectorCancelDate = null;
		String inspectorOrganization = null;
		String inspectorDivision = null;
		String inspectorSignName = null;
		String inspectorSignTitle = null;
		String inspectorSignPlace = null;
		String certificateType = null;
		String referenceCertificateNo = null;
		String referenceCertificateDate = null;
		String certificateRecordNo = null;
		String certificateSignName = null;
		String certificateSignTitle = null;
		String certificateSignPlace = null;
		String certificateRecordDate = null;
		String certificateRecordExpireDate = null;
		String expiredStatus = null;
		String certificateRecordStatus = null;
		String digitalIssueStatus = null;
		String vehicleClass = null;
		String certifiedVehicleType = null;
		String certifiedVehicleTypeDescription = null;
		String certifiedTrademark = null;
		String certifiedTrademarkName = null;
		String certifiedCommercialName = null;
		String certifiedModelCode = null;
		String certifiedAssemblyType = null;
		String certifiedAssemblyTypeDescription = null;
		String certifiedVINNo = null;
		String certifiedVINPosition = null;
		String certifiedFrameNo = null;
		String certifiedFrameAttachPlace = null;
		String certifiedFramePosition = null;
		String certifiedEngineNo = null;
		String certifiedEngineAttachPlace = null;
		String certifiedEnginePosition = null;
		String safetyTestReportNo = null;
		String safetyTestReportDate = null;
		String emissionTestReportNo = null;
		String emissionTestReportDate = null;
		String commonSafetyStandard = null;
		String emissionStandard = null;
		String commonSafetyDescription = null;
		String emissionDescription = null;
		String otherTestReportNo = null;
		String otherTestReportDate = null;
		String sampleFrameNo = null;
		String sampleVINNo = null;
		String sampleEngineNo = null;
		String sampleVehicleType = null;
		String sampleVehicleTypeDescription = null;
		String sampleTrademark = null;
		String sampleTrademarkName = null;
		String sampleCommercialName = null;
		String sampleModelCode = null;
		String customsDeclarationNo = null;
		String customsDeclarationDate = null;
		String productionCountry = null;
		Long importerQuantity = null;
		String inspectionRecordNo = null;
		String inspectionDate = null;
		String inspectionSite = null;
		String inspectionDistrictCode = null;
		String inspectionDistrictName = null;
		String inspectionProvinceCode = null;
		String inspectionProvinceName = null;
		String corporationId = null;
		Long inspectorId = null;
		String remarks = null;
		String inspectionNote = null;
		String certificateNote = null;
		String deliverableCode = null;
		String module = null;
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
			if (params.containsKey("dossiertype")) {
				dossierType = GetterUtil.getString(params.get("dossiertype"));
			}
			if (params.containsKey("dossierno")) {
				dossierNo = GetterUtil.getString(params.get("dossierno"));
			}
			if (params.containsKey("referenceuid")) {
				referenceUid = GetterUtil.getString(params.get("referenceuid"));
			}
			if (params.containsKey("servicecode")) {
				serviceCode = GetterUtil.getString(params.get("servicecode"));
			}
			if (params.containsKey("servicename")) {
				serviceName = GetterUtil.getString(params.get("servicename"));
			}
			if (params.containsKey("convertassembleid")) {
				convertassembleId = GetterUtil.getLong(params.get("convertassembleid"));
			}
			if (params.containsKey("applicantidno")) {
				applicantIdNo = GetterUtil.getString(params.get("applicantidno"));
			}
			if (params.containsKey("applicantname")) {
				applicantName = GetterUtil.getString(params.get("applicantname"));
			}
			if (params.containsKey("applicantiddate")) {
				applicantIdDate = GetterUtil.getString(params.get("applicantiddate"));
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
				applicantcontactPhone = GetterUtil.getString(params.get("applicantcontactphone"));
			}
			if (params.containsKey("citycode")) {
				cityCode = GetterUtil.getString(params.get("citycode"));
			}
			if (params.containsKey("manufacturerforeigncode")) {
				manufacturerForeignCode = GetterUtil.getString(params.get("manufacturerforeigncode"));
			}
			if (params.containsKey("manufacturername")) {
				manufacturerName = GetterUtil.getString(params.get("manufacturername"));
			}
			if (params.containsKey("manufactureraddress")) {
				manufacturerAddress = GetterUtil.getString(params.get("manufactureraddress"));
			}
			if (params.containsKey("manufacturerrepresentative")) {
				manufacturerRepresentative = GetterUtil.getString(params.get("manufacturerrepresentative"));
			}
			if (params.containsKey("manufacturerrepresentativetitle")) {
				manufacturerRepresentativeTitle = GetterUtil.getString(params.get("manufacturerrepresentativetitle"));
			}
			if (params.containsKey("manufactureremail")) {
				manufacturerEmail = GetterUtil.getString(params.get("manufactureremail"));
			}
			if (params.containsKey("manufacturerphone")) {
				manufacturerPhone = GetterUtil.getString(params.get("manufacturerphone"));
			}
			if (params.containsKey("manufacturerfax")) {
				manufacturerFax = GetterUtil.getString(params.get("manufacturerfax"));
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
			if (params.containsKey("productionplantrepresentative")) {
				productionPlantRepresentative = GetterUtil.getString(params.get("productionplantrepresentative"));
			}
			if (params.containsKey("productionplantrepresentativetitle")) {
				productionPlantRepresentativeTitle = GetterUtil
						.getString(params.get("productionplantrepresentativetitle"));
			}
			if (params.containsKey("copreportno")) {
				copReportNo = GetterUtil.getString(params.get("copreportno"));
			}
			if (params.containsKey("copreportdate")) {
				copReportDate = GetterUtil.getString(params.get("copreportdate"));
			}
			if (params.containsKey("copreportexpiredate")) {
				copReportExpireDate = GetterUtil.getString(params.get("copreportexpiredate"));
			}
			if (params.containsKey("designercode")) {
				designerCode = GetterUtil.getString(params.get("designercode"));
			}
			if (params.containsKey("designername")) {
				designerName = GetterUtil.getString(params.get("designername"));
			}
			if (params.containsKey("designeraddress")) {
				designerAddress = GetterUtil.getString(params.get("designeraddress"));
			}
			if (params.containsKey("designerrepresentative")) {
				designerRepresentative = GetterUtil.getString(params.get("designerrepresentative"));
			}
			if (params.containsKey("designerrepresentativetitle")) {
				designerRepresentativeTitle = GetterUtil.getString(params.get("designerrepresentativetitle"));
			}
			if (params.containsKey("designeremail")) {
				designerEmail = GetterUtil.getString(params.get("designeremail"));
			}
			if (params.containsKey("designerphone")) {
				designerPhone = GetterUtil.getString(params.get("designerphone"));
			}
			if (params.containsKey("designerfax")) {
				designerFax = GetterUtil.getString(params.get("designerfax"));
			}
			if (params.containsKey("verificationcertificateno")) {
				verificationCertificateNo = GetterUtil.getString(params.get("verificationcertificateno"));
			}
			if (params.containsKey("verificationcertificatedate")) {
				verificationCertificateDate = GetterUtil.getString(params.get("verificationcertificatedate"));
			}
			if (params.containsKey("verificationrefno")) {
				verificationRefNo = GetterUtil.getString(params.get("verificationrefno"));
			}
			if (params.containsKey("verificationrefdate")) {
				verificationRefDate = GetterUtil.getString(params.get("verificationrefdate"));
			}
			if (params.containsKey("typeapprovalcertificateno")) {
				typeApprovalCertificateNo = GetterUtil.getString(params.get("typeapprovalcertificateno"));
			}
			if (params.containsKey("typeapprovalcertificatedate")) {
				typeApprovalCertificateDate = GetterUtil.getString(params.get("typeapprovalcertificatedate"));
			}
			if (params.containsKey("designmodelcode")) {
				designModelCode = GetterUtil.getString(params.get("designmodelcode"));
			}
			if (params.containsKey("designmodeldescription")) {
				designModelDescription = GetterUtil.getString(params.get("designmodeldescription"));
			}
			if (params.containsKey("designsymbol")) {
				designSymbol = GetterUtil.getString(params.get("designsymbol"));
			}
			if (params.containsKey("registerednumber")) {
				registeredNumber = GetterUtil.getString(params.get("registerednumber"));
			}
			if (params.containsKey("inspectorreceivedate")) {
				inspectorReceiveDate = GetterUtil.getString(params.get("inspectorreceivedate"));
			}
			if (params.containsKey("inspectorsubmitdate")) {
				inspectorSubmitDate = GetterUtil.getString(params.get("inspectorsubmitdate"));
			}
			if (params.containsKey("inspectorendorsementdate")) {
				inspectorendorSementDate = GetterUtil.getString(params.get("inspectorendorsementdate"));
			}
			if (params.containsKey("inspectordeadline")) {
				inspectorDeadline = GetterUtil.getString(params.get("inspectordeadline"));
			}
			if (params.containsKey("inspectorfinishdate")) {
				inspectorFinishDate = GetterUtil.getString(params.get("inspectorfinishdate"));
			}
			if (params.containsKey("inspectorcanceldate")) {
				inspectorCancelDate = GetterUtil.getString(params.get("inspectorcanceldate"));
			}
			if (params.containsKey("inspectororganization")) {
				inspectorOrganization = GetterUtil.getString(params.get("inspectororganization"));
			}
			if (params.containsKey("inspectordivision")) {
				inspectorDivision = GetterUtil.getString(params.get("inspectordivision"));
			}
			if (params.containsKey("inspectorsignname")) {
				inspectorSignName = GetterUtil.getString(params.get("inspectorsignname"));
			}
			if (params.containsKey("inspectorsigntitle")) {
				inspectorSignTitle = GetterUtil.getString(params.get("inspectorsigntitle"));
			}
			if (params.containsKey("inspectorsignplace")) {
				inspectorSignPlace = GetterUtil.getString(params.get("inspectorsignplace"));
			}
			if (params.containsKey("certificatetype")) {
				certificateType = GetterUtil.getString(params.get("certificatetype"));
			}
			if (params.containsKey("referencecertificateno")) {
				referenceCertificateNo = GetterUtil.getString(params.get("referencecertificateno"));
			}
			if (params.containsKey("referencecertificatedate")) {
				referenceCertificateDate = GetterUtil.getString(params.get("referencecertificatedate"));
			}
			if (params.containsKey("certificaterecordno")) {
				certificateRecordNo = GetterUtil.getString(params.get("certificaterecordno"));
			}
			if (params.containsKey("certificatesignname")) {
				certificateSignName = GetterUtil.getString(params.get("certificatesignname"));
			}
			if (params.containsKey("certificatesigntitle")) {
				certificateSignTitle = GetterUtil.getString(params.get("certificatesigntitle"));
			}
			if (params.containsKey("certificatesignplace")) {
				certificateSignPlace = GetterUtil.getString(params.get("certificatesignplace"));
			}
			if (params.containsKey("certificaterecorddate")) {
				certificateRecordDate = GetterUtil.getString(params.get("certificaterecorddate"));
			}
			if (params.containsKey("certificaterecordexpiredate")) {
				certificateRecordExpireDate = GetterUtil.getString(params.get("certificaterecordexpiredate"));
			}
			if (params.containsKey("expiredstatus")) {
				expiredStatus = GetterUtil.getString(params.get("expiredstatus"));
			}
			if (params.containsKey("certificaterecordstatus")) {
				certificateRecordStatus = GetterUtil.getString(params.get("certificaterecordstatus"));
			}
			if (params.containsKey("digitalissuestatus")) {
				digitalIssueStatus = GetterUtil.getString(params.get("digitalissuestatus"));
			}
			if (params.containsKey("vehicleclass")) {
				vehicleClass = GetterUtil.getString(params.get("vehicleclass"));
			}
			if (params.containsKey("certifiedvehicletype")) {
				certifiedVehicleType = GetterUtil.getString(params.get("certifiedvehicletype"));
			}
			if (params.containsKey("certifiedvehicletypedescription")) {
				certifiedVehicleTypeDescription = GetterUtil.getString(params.get("certifiedvehicletypedescription"));
			}
			if (params.containsKey("certifiedtrademark")) {
				certifiedTrademark = GetterUtil.getString(params.get("certifiedtrademark"));
			}
			if (params.containsKey("certifiedtrademarkname")) {
				certifiedTrademarkName = GetterUtil.getString(params.get("certifiedtrademarkname"));
			}
			if (params.containsKey("certifiedcommercialname")) {
				certifiedCommercialName = GetterUtil.getString(params.get("certifiedcommercialname"));
			}
			if (params.containsKey("certifiedmodelcode")) {
				certifiedModelCode = GetterUtil.getString(params.get("certifiedmodelcode"));
			}
			if (params.containsKey("certifiedassemblytype")) {
				certifiedAssemblyType = GetterUtil.getString(params.get("certifiedassemblytype"));
			}
			if (params.containsKey("certifiedassemblytypedescription")) {
				certifiedAssemblyTypeDescription = GetterUtil.getString(params.get("certifiedassemblytypedescription"));
			}
			if (params.containsKey("certifiedvinno")) {
				certifiedVINNo = GetterUtil.getString(params.get("certifiedvinno"));
			}
			if (params.containsKey("certifiedvinposition")) {
				certifiedVINPosition = GetterUtil.getString(params.get("certifiedvinposition"));
			}
			if (params.containsKey("certifiedframeno")) {
				certifiedFrameNo = GetterUtil.getString(params.get("certifiedframeno"));
			}
			if (params.containsKey("certifiedframeattachplace")) {
				certifiedFrameAttachPlace = GetterUtil.getString(params.get("certifiedframeattachplace"));
			}
			if (params.containsKey("certifiedframeposition")) {
				certifiedFramePosition = GetterUtil.getString(params.get("certifiedframeposition"));
			}
			if (params.containsKey("certifiedengineno")) {
				certifiedEngineNo = GetterUtil.getString(params.get("certifiedengineno"));
			}
			if (params.containsKey("certifiedengineattachplace")) {
				certifiedEngineAttachPlace = GetterUtil.getString(params.get("certifiedengineattachplace"));
			}
			if (params.containsKey("certifiedengineposition")) {
				certifiedEnginePosition = GetterUtil.getString(params.get("certifiedengineposition"));
			}
			if (params.containsKey("safetytestreportno")) {
				safetyTestReportNo = GetterUtil.getString(params.get("safetytestreportno"));
			}
			if (params.containsKey("safetytestreportdate")) {
				safetyTestReportDate = GetterUtil.getString(params.get("safetytestreportdate"));
			}
			if (params.containsKey("emissiontestreportno")) {
				emissionTestReportNo = GetterUtil.getString(params.get("emissiontestreportno"));
			}
			if (params.containsKey("emissiontestreportdate")) {
				emissionTestReportDate = GetterUtil.getString(params.get("emissiontestreportdate"));
			}
			if (params.containsKey("commonsafetystandard")) {
				commonSafetyStandard = GetterUtil.getString(params.get("commonsafetystandard"));
			}
			if (params.containsKey("emissionstandard")) {
				emissionStandard = GetterUtil.getString(params.get("emissionstandard"));
			}
			if (params.containsKey("commonsafetydescription")) {
				commonSafetyDescription = GetterUtil.getString(params.get("commonsafetydescription"));
			}
			if (params.containsKey("emissiondescription")) {
				emissionDescription = GetterUtil.getString(params.get("emissiondescription"));
			}
			if (params.containsKey("othertestreportno")) {
				otherTestReportNo = GetterUtil.getString(params.get("othertestreportno"));
			}
			if (params.containsKey("othertestreportdate")) {
				otherTestReportDate = GetterUtil.getString(params.get("othertestreportdate"));
			}
			if (params.containsKey("sampleframeno")) {
				sampleFrameNo = GetterUtil.getString(params.get("sampleframeno"));
			}
			if (params.containsKey("samplevinno")) {
				sampleVINNo = GetterUtil.getString(params.get("samplevinno"));
			}
			if (params.containsKey("sampleengineno")) {
				sampleEngineNo = GetterUtil.getString(params.get("sampleengineno"));
			}
			if (params.containsKey("samplevehicletype")) {
				sampleVehicleType = GetterUtil.getString(params.get("samplevehicletype"));
			}
			if (params.containsKey("samplevehicletypedescription")) {
				sampleVehicleTypeDescription = GetterUtil.getString(params.get("samplevehicletypedescription"));
			}
			if (params.containsKey("sampletrademark")) {
				sampleTrademark = GetterUtil.getString(params.get("sampletrademark"));
			}
			if (params.containsKey("sampletrademarkname")) {
				sampleTrademarkName = GetterUtil.getString(params.get("sampletrademarkname"));
			}
			if (params.containsKey("samplecommercialname")) {
				sampleCommercialName = GetterUtil.getString(params.get("samplecommercialname"));
			}
			if (params.containsKey("samplemodelcode")) {
				sampleModelCode = GetterUtil.getString(params.get("samplemodelcode"));
			}
			if (params.containsKey("customsdeclarationno")) {
				customsDeclarationNo = GetterUtil.getString(params.get("customsdeclarationno"));
			}
			if (params.containsKey("customsdeclarationdate")) {
				customsDeclarationDate = GetterUtil.getString(params.get("customsdeclarationdate"));
			}
			if (params.containsKey("productioncountry")) {
				productionCountry = GetterUtil.getString(params.get("productioncountry"));
			}
			if (params.containsKey("importerquantity")) {
				importerQuantity = GetterUtil.getLong(params.get("importerquantity"));
			}
			if (params.containsKey("inspectionrecordno")) {
				inspectionRecordNo = GetterUtil.getString(params.get("inspectionrecordno"));
			}
			if (params.containsKey("inspectiondate")) {
				inspectionDate = GetterUtil.getString(params.get("inspectiondate"));
			}
			if (params.containsKey("inspectionsite")) {
				inspectionSite = GetterUtil.getString(params.get("inspectionsite"));
			}
			if (params.containsKey("inspectiondistrictcode")) {
				inspectionDistrictCode = GetterUtil.getString(params.get("inspectiondistrictcode"));
			}
			if (params.containsKey("inspectiondistrictname")) {
				inspectionDistrictName = GetterUtil.getString(params.get("inspectiondistrictname"));
			}
			if (params.containsKey("inspectionprovincecode")) {
				inspectionProvinceCode = GetterUtil.getString(params.get("inspectionprovincecode"));
			}
			if (params.containsKey("inspectionprovincename")) {
				inspectionProvinceName = GetterUtil.getString(params.get("inspectionprovincename"));
			}
			if (params.containsKey("corporationid")) {
				corporationId = GetterUtil.getString(params.get("corporationid"));
			}
			if (params.containsKey("inspectorid")) {
				inspectorId = GetterUtil.getLong(params.get("inspectorid"));
			}
			if (params.containsKey("remarks")) {
				remarks = GetterUtil.getString(params.get("remarks"));
			}
			if (params.containsKey("inspectionnote")) {
				inspectionNote = GetterUtil.getString(params.get("inspectionnote"));
			}
			if (params.containsKey("certificatenote")) {
				certificateNote = GetterUtil.getString(params.get("certificatenote"));
			}
			if (params.containsKey("deliverablecode")) {
				deliverableCode = GetterUtil.getString(params.get("deliverablecode"));
			}
			if (params.containsKey("module")) {
				module = GetterUtil.getString(params.get("module"));
			}
			/*if (params.containsKey("modifydate")) {
				modifyDate = GetterUtil.getString(params.get("modifydate"));
			}
			if (params.containsKey("syncdate")) {
				syncDate = GetterUtil.getString(params.get("syncdate"));
			}*/
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("dossierType", keyword, "", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("dossierNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("referenceUid", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("serviceCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("serviceName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("applicantIdNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantFax", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantcontactPhone", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("cityCode", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("manufacturerForeignCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerFax", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("copReportNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("designerCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerFax", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("verificationCertificateNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("verificationRefNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("typeApprovalCertificateNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("designModelCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designModelDescription", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("designSymbol", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("registeredNumber", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorOrganization", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("inspectorDivision", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorSignName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorSignTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorSignPlace", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certificateType", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("referenceCertificateNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certificateRecordNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificateSignName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificateSignTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificateSignPlace", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("expiredStatus", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certificateRecordStatus", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("digitalIssueStatus", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("vehicleClass", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedVehicleType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedVehicleTypeDescription", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedTrademark", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedTrademarkName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedCommercialName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedModelCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedAssemblyType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedAssemblyTypeDescription", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedVINNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedVINPosition", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedFrameNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedFrameAttachPlace", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedFramePosition", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedEngineNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedEngineAttachPlace", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedEnginePosition", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("safetyTestReportNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("emissionTestReportNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("commonSafetyStandard", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("emissionStandard", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("commonSafetyDescription", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("emissionDescription", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("otherTestReportNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("sampleFrameNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("sampleVINNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("sampleEngineNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleVehicleType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleVehicleTypeDescription", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleTrademark", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleTrademarkName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleCommercialName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("sampleModelCode", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("customsDeclarationNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionCountry", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("inspectionRecordNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectionSite", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("inspectionDistrictCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectionDistrictName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("inspectionProvinceCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectionProvinceName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("corporationId", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("remarks", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectionNote", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificateNote", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("deliverableCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("module", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_vehicletypecertificate").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL).where("dossierid", dossierId, "AND", StringPool.EQUAL)
				.where("dossiertype", dossierType, "AND", StringPool.EQUAL)
				.where("dossierno", dossierNo, "AND", StringPool.EQUAL)
				.where("referenceuid", referenceUid, "AND", StringPool.EQUAL)
				.where("servicecode", serviceCode, "AND", StringPool.EQUAL)
				.where("servicename", serviceName, "AND", StringPool.EQUAL)
				.where("convertassembleid", convertassembleId, "AND", StringPool.EQUAL)
				.where("applicantidno", applicantIdNo, "AND", StringPool.EQUAL)
				.where("applicantname", applicantName, "AND", StringPool.EQUAL)
				.where("applicantiddate", applicantIdDate, "AND", StringPool.EQUAL)
				.where("applicantaddress", applicantAddress, "AND", StringPool.EQUAL)
				.where("applicantrepresentative", applicantRepresentative, "AND", StringPool.EQUAL)
				.where("applicantrepresentativetitle", applicantRepresentativeTitle, "AND", StringPool.EQUAL)
				.where("applicantemail", applicantEmail, "AND", StringPool.EQUAL)
				.where("applicantphone", applicantPhone, "AND", StringPool.EQUAL)
				.where("applicantfax", applicantFax, "AND", StringPool.EQUAL)
				.where("applicantcontactname", applicantContactName, "AND", StringPool.EQUAL)
				.where("applicantcontactemail", applicantContactEmail, "AND", StringPool.EQUAL)
				.where("applicantcontactphone", applicantcontactPhone, "AND", StringPool.EQUAL)
				.where("citycode", cityCode, "AND", StringPool.EQUAL)
				.where("manufacturerforeigncode", manufacturerForeignCode, "AND", StringPool.EQUAL)
				.where("manufacturername", manufacturerName, "AND", StringPool.EQUAL)
				.where("manufactureraddress", manufacturerAddress, "AND", StringPool.EQUAL)
				.where("manufacturerrepresentative", manufacturerRepresentative, "AND", StringPool.EQUAL)
				.where("manufacturerrepresentativetitle", manufacturerRepresentativeTitle, "AND", StringPool.EQUAL)
				.where("manufactureremail", manufacturerEmail, "AND", StringPool.EQUAL)
				.where("manufacturerphone", manufacturerPhone, "AND", StringPool.EQUAL)
				.where("manufacturerfax", manufacturerFax, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("productionplantname", productionPlantName, "AND", StringPool.EQUAL)
				.where("productionplantaddress", productionPlantAddress, "AND", StringPool.EQUAL)
				.where("productionplantrepresentative", productionPlantRepresentative, "AND", StringPool.EQUAL)
				.where("productionplantrepresentativetitle", productionPlantRepresentativeTitle, "AND",
						StringPool.EQUAL)
				.where("copreportno", copReportNo, "AND", StringPool.EQUAL)
				.where("copreportdate", copReportDate, "AND", StringPool.EQUAL)
				.where("copreportexpiredate", copReportExpireDate, "AND", StringPool.EQUAL)
				.where("designercode", designerCode, "AND", StringPool.EQUAL)
				.where("designername", designerName, "AND", StringPool.EQUAL)
				.where("designeraddress", designerAddress, "AND", StringPool.EQUAL)
				.where("designerrepresentative", designerRepresentative, "AND", StringPool.EQUAL)
				.where("designerrepresentativetitle", designerRepresentativeTitle, "AND", StringPool.EQUAL)
				.where("designeremail", designerEmail, "AND", StringPool.EQUAL)
				.where("designerphone", designerPhone, "AND", StringPool.EQUAL)
				.where("designerfax", designerFax, "AND", StringPool.EQUAL)
				.where("verificationcertificateno", verificationCertificateNo, "AND", StringPool.EQUAL)
				.where("verificationcertificatedate", verificationCertificateDate, "AND", StringPool.EQUAL)
				.where("verificationrefno", verificationRefNo, "AND", StringPool.EQUAL)
				.where("verificationrefdate", verificationRefDate, "AND", StringPool.EQUAL)
				.where("typeapprovalcertificateno", typeApprovalCertificateNo, "AND", StringPool.EQUAL)
				.where("typeapprovalcertificatedate", typeApprovalCertificateDate, "AND", StringPool.EQUAL)
				.where("designmodelcode", designModelCode, "AND", StringPool.EQUAL)
				.where("designmodeldescription", designModelDescription, "AND", StringPool.EQUAL)
				.where("designsymbol", designSymbol, "AND", StringPool.EQUAL)
				.where("registerednumber", registeredNumber, "AND", StringPool.EQUAL)
				.where("inspectorreceivedate", inspectorReceiveDate, "AND", StringPool.EQUAL)
				.where("inspectorsubmitdate", inspectorSubmitDate, "AND", StringPool.EQUAL)
				.where("inspectorendorsementdate", inspectorendorSementDate, "AND", StringPool.EQUAL)
				.where("inspectordeadline", inspectorDeadline, "AND", StringPool.EQUAL)
				.where("inspectorfinishdate", inspectorFinishDate, "AND", StringPool.EQUAL)
				.where("inspectorcanceldate", inspectorCancelDate, "AND", StringPool.EQUAL)
				.where("inspectororganization", inspectorOrganization, "AND", StringPool.EQUAL)
				.where("inspectordivision", inspectorDivision, "AND", StringPool.EQUAL)
				.where("inspectorsignname", inspectorSignName, "AND", StringPool.EQUAL)
				.where("inspectorsigntitle", inspectorSignTitle, "AND", StringPool.EQUAL)
				.where("inspectorsignplace", inspectorSignPlace, "AND", StringPool.EQUAL)
				.where("certificatetype", certificateType, "AND", StringPool.EQUAL)
				.where("referencecertificateno", referenceCertificateNo, "AND", StringPool.EQUAL)
				.where("referencecertificatedate", referenceCertificateDate, "AND", StringPool.EQUAL)
				.where("certificaterecordno", certificateRecordNo, "AND", StringPool.EQUAL)
				.where("certificatesignname", certificateSignName, "AND", StringPool.EQUAL)
				.where("certificatesigntitle", certificateSignTitle, "AND", StringPool.EQUAL)
				.where("certificatesignplace", certificateSignPlace, "AND", StringPool.EQUAL)
				.where("certificaterecorddate", certificateRecordDate, "AND", StringPool.EQUAL)
				.where("certificaterecordexpiredate", certificateRecordExpireDate, "AND", StringPool.EQUAL)
				.where("expiredstatus", expiredStatus, "AND", StringPool.EQUAL)
				.where("certificaterecordstatus", certificateRecordStatus, "AND", StringPool.EQUAL)
				.where("digitalissuestatus", digitalIssueStatus, "AND", StringPool.EQUAL)
				.where("vehicleclass", vehicleClass, "AND", StringPool.EQUAL)
				.where("certifiedvehicletype", certifiedVehicleType, "AND", StringPool.EQUAL)
				.where("certifiedvehicletypedescription", certifiedVehicleTypeDescription, "AND", StringPool.EQUAL)
				.where("certifiedtrademark", certifiedTrademark, "AND", StringPool.EQUAL)
				.where("certifiedtrademarkname", certifiedTrademarkName, "AND", StringPool.EQUAL)
				.where("certifiedcommercialname", certifiedCommercialName, "AND", StringPool.EQUAL)
				.where("certifiedmodelcode", certifiedModelCode, "AND", StringPool.EQUAL)
				.where("certifiedassemblytype", certifiedAssemblyType, "AND", StringPool.EQUAL)
				.where("certifiedassemblytypedescription", certifiedAssemblyTypeDescription, "AND", StringPool.EQUAL)
				.where("certifiedvinno", certifiedVINNo, "AND", StringPool.EQUAL)
				.where("certifiedvinposition", certifiedVINPosition, "AND", StringPool.EQUAL)
				.where("certifiedframeno", certifiedFrameNo, "AND", StringPool.EQUAL)
				.where("certifiedframeattachplace", certifiedFrameAttachPlace, "AND", StringPool.EQUAL)
				.where("certifiedframeposition", certifiedFramePosition, "AND", StringPool.EQUAL)
				.where("certifiedengineno", certifiedEngineNo, "AND", StringPool.EQUAL)
				.where("certifiedengineattachplace", certifiedEngineAttachPlace, "AND", StringPool.EQUAL)
				.where("certifiedengineposition", certifiedEnginePosition, "AND", StringPool.EQUAL)
				.where("safetytestreportno", safetyTestReportNo, "AND", StringPool.EQUAL)
				.where("safetytestreportdate", safetyTestReportDate, "AND", StringPool.EQUAL)
				.where("emissiontestreportno", emissionTestReportNo, "AND", StringPool.EQUAL)
				.where("emissiontestreportdate", emissionTestReportDate, "AND", StringPool.EQUAL)
				.where("commonsafetystandard", commonSafetyStandard, "AND", StringPool.EQUAL)
				.where("emissionstandard", emissionStandard, "AND", StringPool.EQUAL)
				.where("commonsafetydescription", commonSafetyDescription, "AND", StringPool.EQUAL)
				.where("emissiondescription", emissionDescription, "AND", StringPool.EQUAL)
				.where("othertestreportno", otherTestReportNo, "AND", StringPool.EQUAL)
				.where("othertestreportdate", otherTestReportDate, "AND", StringPool.EQUAL)
				.where("sampleframeno", sampleFrameNo, "AND", StringPool.EQUAL)
				.where("samplevinno", sampleVINNo, "AND", StringPool.EQUAL)
				.where("sampleengineno", sampleEngineNo, "AND", StringPool.EQUAL)
				.where("samplevehicletype", sampleVehicleType, "AND", StringPool.EQUAL)
				.where("samplevehicletypedescription", sampleVehicleTypeDescription, "AND", StringPool.EQUAL)
				.where("sampletrademark", sampleTrademark, "AND", StringPool.EQUAL)
				.where("sampletrademarkname", sampleTrademarkName, "AND", StringPool.EQUAL)
				.where("samplecommercialname", sampleCommercialName, "AND", StringPool.EQUAL)
				.where("samplemodelcode", sampleModelCode, "AND", StringPool.EQUAL)
				.where("customsdeclarationno", customsDeclarationNo, "AND", StringPool.EQUAL)
				.where("customsdeclarationdate", customsDeclarationDate, "AND", StringPool.EQUAL)
				.where("productioncountry", productionCountry, "AND", StringPool.EQUAL)
				.where("importerquantity", importerQuantity, "AND", StringPool.EQUAL)
				.where("inspectionrecordno", inspectionRecordNo, "AND", StringPool.EQUAL)
				.where("inspectiondate", inspectionDate, "AND", StringPool.EQUAL)
				.where("inspectionsite", inspectionSite, "AND", StringPool.EQUAL)
				.where("inspectiondistrictcode", inspectionDistrictCode, "AND", StringPool.EQUAL)
				.where("inspectiondistrictname", inspectionDistrictName, "AND", StringPool.EQUAL)
				.where("inspectionprovincecode", inspectionProvinceCode, "AND", StringPool.EQUAL)
				.where("inspectionprovincename", inspectionProvinceName, "AND", StringPool.EQUAL)
				.where("corporationid", corporationId, "AND", StringPool.EQUAL)
				.where("inspectorid", inspectorId, "AND", StringPool.EQUAL)
				.where("remarks", remarks, "AND", StringPool.EQUAL)
				.where("inspectionnote", inspectionNote, "AND", StringPool.EQUAL)
				.where("certificatenote", certificateNote, "AND", StringPool.EQUAL)
				.where("deliverablecode", deliverableCode, "AND", StringPool.EQUAL)
				.where("module", module, "AND", StringPool.EQUAL)
				//.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				//.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRVehicleTypeCertificateLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRVehicleTypeCertificateLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRVehicleTypeCertificateImpl.class, "VRVehicleTypeCertificate", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	@Override
	public JSONObject createVRVehicleTypeCertificate(VRVehicleTypeCertificate object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		try {
			object = VRVehicleTypeCertificateLocalServiceUtil.createVRVehicleTypeCertificate(object);

			JSONObject result = ActionUtil.object2Json(object, VRVehicleTypeCertificateModelImpl.class,
					StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

	@Override
	public JSONObject deleteVRVehicleTypeCertificate(long id) {
		VRVehicleTypeCertificate vrVehicleRecord = VRVehicleTypeCertificateLocalServiceUtil.fetchVRVehicleTypeCertificate(id);
		if (vrVehicleRecord == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}
		try {
			VRVehicleTypeCertificateLocalServiceUtil.deleteVRVehicleTypeCertificate(id);
		} catch (Exception e) {
			_log.error(e);
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);
		}

		return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, StringPool.BLANK);
	}

	@Override
	public JSONObject findVRVehicleTypeCertificate(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		Long dossierId = null;
		String dossierType = null;
		String dossierNo = null;
		String referenceUid = null;
		String serviceCode = null;
		String serviceName = null;
		Long convertassembleId = null;
		String applicantIdNo = null;
		String applicantName = null;
		String applicantIdDate = null;
		String applicantAddress = null;
		String applicantRepresentative = null;
		String applicantRepresentativeTitle = null;
		String applicantEmail = null;
		String applicantPhone = null;
		String applicantFax = null;
		String applicantContactName = null;
		String applicantContactEmail = null;
		String applicantcontactPhone = null;
		String cityCode = null;
		String manufacturerForeignCode = null;
		String manufacturerName = null;
		String manufacturerAddress = null;
		String manufacturerRepresentative = null;
		String manufacturerRepresentativeTitle = null;
		String manufacturerEmail = null;
		String manufacturerPhone = null;
		String manufacturerFax = null;
		String productionPlantCode = null;
		String productionPlantName = null;
		String productionPlantAddress = null;
		String productionPlantRepresentative = null;
		String productionPlantRepresentativeTitle = null;
		String copReportNo = null;
		String copReportDate = null;
		String copReportExpireDate = null;
		String designerCode = null;
		String designerName = null;
		String designerAddress = null;
		String designerRepresentative = null;
		String designerRepresentativeTitle = null;
		String designerEmail = null;
		String designerPhone = null;
		String designerFax = null;
		String verificationCertificateNo = null;
		String verificationCertificateDate = null;
		String verificationRefNo = null;
		String verificationRefDate = null;
		String typeApprovalCertificateNo = null;
		String typeApprovalCertificateDate = null;
		String designModelCode = null;
		String designModelDescription = null;
		String designSymbol = null;
		String registeredNumber = null;
		String inspectorReceiveDate = null;
		String inspectorSubmitDate = null;
		String inspectorendorSementDate = null;
		String inspectorDeadline = null;
		String inspectorFinishDate = null;
		String inspectorCancelDate = null;
		String inspectorOrganization = null;
		String inspectorDivision = null;
		String inspectorSignName = null;
		String inspectorSignTitle = null;
		String inspectorSignPlace = null;
		String certificateType = null;
		String referenceCertificateNo = null;
		String referenceCertificateDate = null;
		String certificateRecordNo = null;
		String certificateSignName = null;
		String certificateSignTitle = null;
		String certificateSignPlace = null;
		String certificateRecordDate = null;
		String certificateRecordExpireDate = null;
		String expiredStatus = null;
		String certificateRecordStatus = null;
		String digitalIssueStatus = null;
		String vehicleClass = null;
		String certifiedVehicleType = null;
		String certifiedVehicleTypeDescription = null;
		String certifiedTrademark = null;
		String certifiedTrademarkName = null;
		String certifiedCommercialName = null;
		String certifiedModelCode = null;
		String certifiedAssemblyType = null;
		String certifiedAssemblyTypeDescription = null;
		String certifiedVINNo = null;
		String certifiedVINPosition = null;
		String certifiedFrameNo = null;
		String certifiedFrameAttachPlace = null;
		String certifiedFramePosition = null;
		String certifiedEngineNo = null;
		String certifiedEngineAttachPlace = null;
		String certifiedEnginePosition = null;
		String safetyTestReportNo = null;
		String safetyTestReportDate = null;
		String emissionTestReportNo = null;
		String emissionTestReportDate = null;
		String commonSafetyStandard = null;
		String emissionStandard = null;
		String commonSafetyDescription = null;
		String emissionDescription = null;
		String otherTestReportNo = null;
		String otherTestReportDate = null;
		String sampleFrameNo = null;
		String sampleVINNo = null;
		String sampleEngineNo = null;
		String sampleVehicleType = null;
		String sampleVehicleTypeDescription = null;
		String sampleTrademark = null;
		String sampleTrademarkName = null;
		String sampleCommercialName = null;
		String sampleModelCode = null;
		String customsDeclarationNo = null;
		String customsDeclarationDate = null;
		String productionCountry = null;
		Long importerQuantity = null;
		String inspectionRecordNo = null;
		String inspectionDate = null;
		String inspectionSite = null;
		String inspectionDistrictCode = null;
		String inspectionDistrictName = null;
		String inspectionProvinceCode = null;
		String inspectionProvinceName = null;
		String corporationId = null;
		Long inspectorId = null;
		String remarks = null;
		String inspectionNote = null;
		String certificateNote = null;
		String deliverableCode = null;
		String module = null;
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
			if (params.containsKey("dossiertype")) {
				dossierType = GetterUtil.getString(params.get("dossiertype"));
			}
			if (params.containsKey("dossierno")) {
				dossierNo = GetterUtil.getString(params.get("dossierno"));
			}
			if (params.containsKey("referenceuid")) {
				referenceUid = GetterUtil.getString(params.get("referenceuid"));
			}
			if (params.containsKey("servicecode")) {
				serviceCode = GetterUtil.getString(params.get("servicecode"));
			}
			if (params.containsKey("servicename")) {
				serviceName = GetterUtil.getString(params.get("servicename"));
			}
			if (params.containsKey("convertassembleid")) {
				convertassembleId = GetterUtil.getLong(params.get("convertassembleid"));
			}
			if (params.containsKey("applicantidno")) {
				applicantIdNo = GetterUtil.getString(params.get("applicantidno"));
			}
			if (params.containsKey("applicantname")) {
				applicantName = GetterUtil.getString(params.get("applicantname"));
			}
			if (params.containsKey("applicantiddate")) {
				applicantIdDate = GetterUtil.getString(params.get("applicantiddate"));
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
				applicantcontactPhone = GetterUtil.getString(params.get("applicantcontactphone"));
			}
			if (params.containsKey("citycode")) {
				cityCode = GetterUtil.getString(params.get("citycode"));
			}
			if (params.containsKey("manufacturerforeigncode")) {
				manufacturerForeignCode = GetterUtil.getString(params.get("manufacturerforeigncode"));
			}
			if (params.containsKey("manufacturername")) {
				manufacturerName = GetterUtil.getString(params.get("manufacturername"));
			}
			if (params.containsKey("manufactureraddress")) {
				manufacturerAddress = GetterUtil.getString(params.get("manufactureraddress"));
			}
			if (params.containsKey("manufacturerrepresentative")) {
				manufacturerRepresentative = GetterUtil.getString(params.get("manufacturerrepresentative"));
			}
			if (params.containsKey("manufacturerrepresentativetitle")) {
				manufacturerRepresentativeTitle = GetterUtil.getString(params.get("manufacturerrepresentativetitle"));
			}
			if (params.containsKey("manufactureremail")) {
				manufacturerEmail = GetterUtil.getString(params.get("manufactureremail"));
			}
			if (params.containsKey("manufacturerphone")) {
				manufacturerPhone = GetterUtil.getString(params.get("manufacturerphone"));
			}
			if (params.containsKey("manufacturerfax")) {
				manufacturerFax = GetterUtil.getString(params.get("manufacturerfax"));
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
			if (params.containsKey("productionplantrepresentative")) {
				productionPlantRepresentative = GetterUtil.getString(params.get("productionplantrepresentative"));
			}
			if (params.containsKey("productionplantrepresentativetitle")) {
				productionPlantRepresentativeTitle = GetterUtil
						.getString(params.get("productionplantrepresentativetitle"));
			}
			if (params.containsKey("copreportno")) {
				copReportNo = GetterUtil.getString(params.get("copreportno"));
			}
			if (params.containsKey("copreportdate")) {
				copReportDate = GetterUtil.getString(params.get("copreportdate"));
			}
			if (params.containsKey("copreportexpiredate")) {
				copReportExpireDate = GetterUtil.getString(params.get("copreportexpiredate"));
			}
			if (params.containsKey("designercode")) {
				designerCode = GetterUtil.getString(params.get("designercode"));
			}
			if (params.containsKey("designername")) {
				designerName = GetterUtil.getString(params.get("designername"));
			}
			if (params.containsKey("designeraddress")) {
				designerAddress = GetterUtil.getString(params.get("designeraddress"));
			}
			if (params.containsKey("designerrepresentative")) {
				designerRepresentative = GetterUtil.getString(params.get("designerrepresentative"));
			}
			if (params.containsKey("designerrepresentativetitle")) {
				designerRepresentativeTitle = GetterUtil.getString(params.get("designerrepresentativetitle"));
			}
			if (params.containsKey("designeremail")) {
				designerEmail = GetterUtil.getString(params.get("designeremail"));
			}
			if (params.containsKey("designerphone")) {
				designerPhone = GetterUtil.getString(params.get("designerphone"));
			}
			if (params.containsKey("designerfax")) {
				designerFax = GetterUtil.getString(params.get("designerfax"));
			}
			if (params.containsKey("verificationcertificateno")) {
				verificationCertificateNo = GetterUtil.getString(params.get("verificationcertificateno"));
			}
			if (params.containsKey("verificationcertificatedate")) {
				verificationCertificateDate = GetterUtil.getString(params.get("verificationcertificatedate"));
			}
			if (params.containsKey("verificationrefno")) {
				verificationRefNo = GetterUtil.getString(params.get("verificationrefno"));
			}
			if (params.containsKey("verificationrefdate")) {
				verificationRefDate = GetterUtil.getString(params.get("verificationrefdate"));
			}
			if (params.containsKey("typeapprovalcertificateno")) {
				typeApprovalCertificateNo = GetterUtil.getString(params.get("typeapprovalcertificateno"));
			}
			if (params.containsKey("typeapprovalcertificatedate")) {
				typeApprovalCertificateDate = GetterUtil.getString(params.get("typeapprovalcertificatedate"));
			}
			if (params.containsKey("designmodelcode")) {
				designModelCode = GetterUtil.getString(params.get("designmodelcode"));
			}
			if (params.containsKey("designmodeldescription")) {
				designModelDescription = GetterUtil.getString(params.get("designmodeldescription"));
			}
			if (params.containsKey("designsymbol")) {
				designSymbol = GetterUtil.getString(params.get("designsymbol"));
			}
			if (params.containsKey("registerednumber")) {
				registeredNumber = GetterUtil.getString(params.get("registerednumber"));
			}
			if (params.containsKey("inspectorreceivedate")) {
				inspectorReceiveDate = GetterUtil.getString(params.get("inspectorreceivedate"));
			}
			if (params.containsKey("inspectorsubmitdate")) {
				inspectorSubmitDate = GetterUtil.getString(params.get("inspectorsubmitdate"));
			}
			if (params.containsKey("inspectorendorsementdate")) {
				inspectorendorSementDate = GetterUtil.getString(params.get("inspectorendorsementdate"));
			}
			if (params.containsKey("inspectordeadline")) {
				inspectorDeadline = GetterUtil.getString(params.get("inspectordeadline"));
			}
			if (params.containsKey("inspectorfinishdate")) {
				inspectorFinishDate = GetterUtil.getString(params.get("inspectorfinishdate"));
			}
			if (params.containsKey("inspectorcanceldate")) {
				inspectorCancelDate = GetterUtil.getString(params.get("inspectorcanceldate"));
			}
			if (params.containsKey("inspectororganization")) {
				inspectorOrganization = GetterUtil.getString(params.get("inspectororganization"));
			}
			if (params.containsKey("inspectordivision")) {
				inspectorDivision = GetterUtil.getString(params.get("inspectordivision"));
			}
			if (params.containsKey("inspectorsignname")) {
				inspectorSignName = GetterUtil.getString(params.get("inspectorsignname"));
			}
			if (params.containsKey("inspectorsigntitle")) {
				inspectorSignTitle = GetterUtil.getString(params.get("inspectorsigntitle"));
			}
			if (params.containsKey("inspectorsignplace")) {
				inspectorSignPlace = GetterUtil.getString(params.get("inspectorsignplace"));
			}
			if (params.containsKey("certificatetype")) {
				certificateType = GetterUtil.getString(params.get("certificatetype"));
			}
			if (params.containsKey("referencecertificateno")) {
				referenceCertificateNo = GetterUtil.getString(params.get("referencecertificateno"));
			}
			if (params.containsKey("referencecertificatedate")) {
				referenceCertificateDate = GetterUtil.getString(params.get("referencecertificatedate"));
			}
			if (params.containsKey("certificaterecordno")) {
				certificateRecordNo = GetterUtil.getString(params.get("certificaterecordno"));
			}
			if (params.containsKey("certificatesignname")) {
				certificateSignName = GetterUtil.getString(params.get("certificatesignname"));
			}
			if (params.containsKey("certificatesigntitle")) {
				certificateSignTitle = GetterUtil.getString(params.get("certificatesigntitle"));
			}
			if (params.containsKey("certificatesignplace")) {
				certificateSignPlace = GetterUtil.getString(params.get("certificatesignplace"));
			}
			if (params.containsKey("certificaterecorddate")) {
				certificateRecordDate = GetterUtil.getString(params.get("certificaterecorddate"));
			}
			if (params.containsKey("certificaterecordexpiredate")) {
				certificateRecordExpireDate = GetterUtil.getString(params.get("certificaterecordexpiredate"));
			}
			if (params.containsKey("expiredstatus")) {
				expiredStatus = GetterUtil.getString(params.get("expiredstatus"));
			}
			if (params.containsKey("certificaterecordstatus")) {
				certificateRecordStatus = GetterUtil.getString(params.get("certificaterecordstatus"));
			}
			if (params.containsKey("digitalissuestatus")) {
				digitalIssueStatus = GetterUtil.getString(params.get("digitalissuestatus"));
			}
			if (params.containsKey("vehicleclass")) {
				vehicleClass = GetterUtil.getString(params.get("vehicleclass"));
			}
			if (params.containsKey("certifiedvehicletype")) {
				certifiedVehicleType = GetterUtil.getString(params.get("certifiedvehicletype"));
			}
			if (params.containsKey("certifiedvehicletypedescription")) {
				certifiedVehicleTypeDescription = GetterUtil.getString(params.get("certifiedvehicletypedescription"));
			}
			if (params.containsKey("certifiedtrademark")) {
				certifiedTrademark = GetterUtil.getString(params.get("certifiedtrademark"));
			}
			if (params.containsKey("certifiedtrademarkname")) {
				certifiedTrademarkName = GetterUtil.getString(params.get("certifiedtrademarkname"));
			}
			if (params.containsKey("certifiedcommercialname")) {
				certifiedCommercialName = GetterUtil.getString(params.get("certifiedcommercialname"));
			}
			if (params.containsKey("certifiedmodelcode")) {
				certifiedModelCode = GetterUtil.getString(params.get("certifiedmodelcode"));
			}
			if (params.containsKey("certifiedassemblytype")) {
				certifiedAssemblyType = GetterUtil.getString(params.get("certifiedassemblytype"));
			}
			if (params.containsKey("certifiedassemblytypedescription")) {
				certifiedAssemblyTypeDescription = GetterUtil.getString(params.get("certifiedassemblytypedescription"));
			}
			if (params.containsKey("certifiedvinno")) {
				certifiedVINNo = GetterUtil.getString(params.get("certifiedvinno"));
			}
			if (params.containsKey("certifiedvinposition")) {
				certifiedVINPosition = GetterUtil.getString(params.get("certifiedvinposition"));
			}
			if (params.containsKey("certifiedframeno")) {
				certifiedFrameNo = GetterUtil.getString(params.get("certifiedframeno"));
			}
			if (params.containsKey("certifiedframeattachplace")) {
				certifiedFrameAttachPlace = GetterUtil.getString(params.get("certifiedframeattachplace"));
			}
			if (params.containsKey("certifiedframeposition")) {
				certifiedFramePosition = GetterUtil.getString(params.get("certifiedframeposition"));
			}
			if (params.containsKey("certifiedengineno")) {
				certifiedEngineNo = GetterUtil.getString(params.get("certifiedengineno"));
			}
			if (params.containsKey("certifiedengineattachplace")) {
				certifiedEngineAttachPlace = GetterUtil.getString(params.get("certifiedengineattachplace"));
			}
			if (params.containsKey("certifiedengineposition")) {
				certifiedEnginePosition = GetterUtil.getString(params.get("certifiedengineposition"));
			}
			if (params.containsKey("safetytestreportno")) {
				safetyTestReportNo = GetterUtil.getString(params.get("safetytestreportno"));
			}
			if (params.containsKey("safetytestreportdate")) {
				safetyTestReportDate = GetterUtil.getString(params.get("safetytestreportdate"));
			}
			if (params.containsKey("emissiontestreportno")) {
				emissionTestReportNo = GetterUtil.getString(params.get("emissiontestreportno"));
			}
			if (params.containsKey("emissiontestreportdate")) {
				emissionTestReportDate = GetterUtil.getString(params.get("emissiontestreportdate"));
			}
			if (params.containsKey("commonsafetystandard")) {
				commonSafetyStandard = GetterUtil.getString(params.get("commonsafetystandard"));
			}
			if (params.containsKey("emissionstandard")) {
				emissionStandard = GetterUtil.getString(params.get("emissionstandard"));
			}
			if (params.containsKey("commonsafetydescription")) {
				commonSafetyDescription = GetterUtil.getString(params.get("commonsafetydescription"));
			}
			if (params.containsKey("emissiondescription")) {
				emissionDescription = GetterUtil.getString(params.get("emissiondescription"));
			}
			if (params.containsKey("othertestreportno")) {
				otherTestReportNo = GetterUtil.getString(params.get("othertestreportno"));
			}
			if (params.containsKey("othertestreportdate")) {
				otherTestReportDate = GetterUtil.getString(params.get("othertestreportdate"));
			}
			if (params.containsKey("sampleframeno")) {
				sampleFrameNo = GetterUtil.getString(params.get("sampleframeno"));
			}
			if (params.containsKey("samplevinno")) {
				sampleVINNo = GetterUtil.getString(params.get("samplevinno"));
			}
			if (params.containsKey("sampleengineno")) {
				sampleEngineNo = GetterUtil.getString(params.get("sampleengineno"));
			}
			if (params.containsKey("samplevehicletype")) {
				sampleVehicleType = GetterUtil.getString(params.get("samplevehicletype"));
			}
			if (params.containsKey("samplevehicletypedescription")) {
				sampleVehicleTypeDescription = GetterUtil.getString(params.get("samplevehicletypedescription"));
			}
			if (params.containsKey("sampletrademark")) {
				sampleTrademark = GetterUtil.getString(params.get("sampletrademark"));
			}
			if (params.containsKey("sampletrademarkname")) {
				sampleTrademarkName = GetterUtil.getString(params.get("sampletrademarkname"));
			}
			if (params.containsKey("samplecommercialname")) {
				sampleCommercialName = GetterUtil.getString(params.get("samplecommercialname"));
			}
			if (params.containsKey("samplemodelcode")) {
				sampleModelCode = GetterUtil.getString(params.get("samplemodelcode"));
			}
			if (params.containsKey("customsdeclarationno")) {
				customsDeclarationNo = GetterUtil.getString(params.get("customsdeclarationno"));
			}
			if (params.containsKey("customsdeclarationdate")) {
				customsDeclarationDate = GetterUtil.getString(params.get("customsdeclarationdate"));
			}
			if (params.containsKey("productioncountry")) {
				productionCountry = GetterUtil.getString(params.get("productioncountry"));
			}
			if (params.containsKey("importerquantity")) {
				importerQuantity = GetterUtil.getLong(params.get("importerquantity"));
			}
			if (params.containsKey("inspectionrecordno")) {
				inspectionRecordNo = GetterUtil.getString(params.get("inspectionrecordno"));
			}
			if (params.containsKey("inspectiondate")) {
				inspectionDate = GetterUtil.getString(params.get("inspectiondate"));
			}
			if (params.containsKey("inspectionsite")) {
				inspectionSite = GetterUtil.getString(params.get("inspectionsite"));
			}
			if (params.containsKey("inspectiondistrictcode")) {
				inspectionDistrictCode = GetterUtil.getString(params.get("inspectiondistrictcode"));
			}
			if (params.containsKey("inspectiondistrictname")) {
				inspectionDistrictName = GetterUtil.getString(params.get("inspectiondistrictname"));
			}
			if (params.containsKey("inspectionprovincecode")) {
				inspectionProvinceCode = GetterUtil.getString(params.get("inspectionprovincecode"));
			}
			if (params.containsKey("inspectionprovincename")) {
				inspectionProvinceName = GetterUtil.getString(params.get("inspectionprovincename"));
			}
			if (params.containsKey("corporationid")) {
				corporationId = GetterUtil.getString(params.get("corporationid"));
			}
			if (params.containsKey("inspectorid")) {
				inspectorId = GetterUtil.getLong(params.get("inspectorid"));
			}
			if (params.containsKey("remarks")) {
				remarks = GetterUtil.getString(params.get("remarks"));
			}
			if (params.containsKey("inspectionnote")) {
				inspectionNote = GetterUtil.getString(params.get("inspectionnote"));
			}
			if (params.containsKey("certificatenote")) {
				certificateNote = GetterUtil.getString(params.get("certificatenote"));
			}
			if (params.containsKey("deliverablecode")) {
				deliverableCode = GetterUtil.getString(params.get("deliverablecode"));
			}
			if (params.containsKey("module")) {
				module = GetterUtil.getString(params.get("module"));
			}
			/*if (params.containsKey("modifydate")) {
				modifyDate = GetterUtil.getString(params.get("modifydate"));
			}
			if (params.containsKey("syncdate")) {
				syncDate = GetterUtil.getString(params.get("syncdate"));
			}*/
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("dossierType", keyword, "", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("dossierNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("referenceUid", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("serviceCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("serviceName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("applicantIdNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantFax", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantContactEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("applicantcontactPhone", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("cityCode", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("manufacturerForeignCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("manufacturerFax", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("copReportNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("designerCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerRepresentative", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerRepresentativeTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerEmail", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerPhone", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designerFax", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("verificationCertificateNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("verificationRefNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("typeApprovalCertificateNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("designModelCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("designModelDescription", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("designSymbol", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("registeredNumber", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorOrganization", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("inspectorDivision", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorSignName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorSignTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectorSignPlace", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certificateType", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("referenceCertificateNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certificateRecordNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificateSignName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificateSignTitle", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificateSignPlace", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("expiredStatus", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certificateRecordStatus", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("digitalIssueStatus", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("vehicleClass", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedVehicleType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedVehicleTypeDescription", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedTrademark", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedTrademarkName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedCommercialName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedModelCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedAssemblyType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedAssemblyTypeDescription", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedVINNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedVINPosition", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedFrameNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedFrameAttachPlace", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedFramePosition", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("certifiedEngineNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedEngineAttachPlace", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certifiedEnginePosition", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("safetyTestReportNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("emissionTestReportNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("commonSafetyStandard", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("emissionStandard", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("commonSafetyDescription", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("emissionDescription", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("otherTestReportNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("sampleFrameNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("sampleVINNo", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("sampleEngineNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleVehicleType", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleVehicleTypeDescription", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleTrademark", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleTrademarkName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("sampleCommercialName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("sampleModelCode", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("customsDeclarationNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionCountry", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("inspectionRecordNo", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectionSite", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("inspectionDistrictCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectionDistrictName", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("inspectionProvinceCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectionProvinceName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("corporationId", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("remarks", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("inspectionNote", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("certificateNote", keyword, "OR", StringPool.LIKE, "")
				//+ ActionUtil.buildSQLCondition("deliverableCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("module", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_vehicletypecertificate").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL).where("dossierid", dossierId, "AND", StringPool.EQUAL)
				.where("dossiertype", dossierType, "AND", StringPool.EQUAL)
				.where("dossierno", dossierNo, "AND", StringPool.EQUAL)
				.where("referenceuid", referenceUid, "AND", StringPool.EQUAL)
				.where("servicecode", serviceCode, "AND", StringPool.EQUAL)
				.where("servicename", serviceName, "AND", StringPool.EQUAL)
				.where("convertassembleid", convertassembleId, "AND", StringPool.EQUAL)
				.where("applicantidno", applicantIdNo, "AND", StringPool.EQUAL)
				.where("applicantname", applicantName, "AND", StringPool.EQUAL)
				.where("applicantiddate", applicantIdDate, "AND", StringPool.EQUAL)
				.where("applicantaddress", applicantAddress, "AND", StringPool.EQUAL)
				.where("applicantrepresentative", applicantRepresentative, "AND", StringPool.EQUAL)
				.where("applicantrepresentativetitle", applicantRepresentativeTitle, "AND", StringPool.EQUAL)
				.where("applicantemail", applicantEmail, "AND", StringPool.EQUAL)
				.where("applicantphone", applicantPhone, "AND", StringPool.EQUAL)
				.where("applicantfax", applicantFax, "AND", StringPool.EQUAL)
				.where("applicantcontactname", applicantContactName, "AND", StringPool.EQUAL)
				.where("applicantcontactemail", applicantContactEmail, "AND", StringPool.EQUAL)
				.where("applicantcontactphone", applicantcontactPhone, "AND", StringPool.EQUAL)
				.where("citycode", cityCode, "AND", StringPool.EQUAL)
				.where("manufacturerforeigncode", manufacturerForeignCode, "AND", StringPool.EQUAL)
				.where("manufacturername", manufacturerName, "AND", StringPool.EQUAL)
				.where("manufactureraddress", manufacturerAddress, "AND", StringPool.EQUAL)
				.where("manufacturerrepresentative", manufacturerRepresentative, "AND", StringPool.EQUAL)
				.where("manufacturerrepresentativetitle", manufacturerRepresentativeTitle, "AND", StringPool.EQUAL)
				.where("manufactureremail", manufacturerEmail, "AND", StringPool.EQUAL)
				.where("manufacturerphone", manufacturerPhone, "AND", StringPool.EQUAL)
				.where("manufacturerfax", manufacturerFax, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("productionplantname", productionPlantName, "AND", StringPool.EQUAL)
				.where("productionplantaddress", productionPlantAddress, "AND", StringPool.EQUAL)
				.where("productionplantrepresentative", productionPlantRepresentative, "AND", StringPool.EQUAL)
				.where("productionplantrepresentativetitle", productionPlantRepresentativeTitle, "AND",
						StringPool.EQUAL)
				.where("copreportno", copReportNo, "AND", StringPool.EQUAL)
				.where("copreportdate", copReportDate, "AND", StringPool.EQUAL)
				.where("copreportexpiredate", copReportExpireDate, "AND", StringPool.EQUAL)
				.where("designercode", designerCode, "AND", StringPool.EQUAL)
				.where("designername", designerName, "AND", StringPool.EQUAL)
				.where("designeraddress", designerAddress, "AND", StringPool.EQUAL)
				.where("designerrepresentative", designerRepresentative, "AND", StringPool.EQUAL)
				.where("designerrepresentativetitle", designerRepresentativeTitle, "AND", StringPool.EQUAL)
				.where("designeremail", designerEmail, "AND", StringPool.EQUAL)
				.where("designerphone", designerPhone, "AND", StringPool.EQUAL)
				.where("designerfax", designerFax, "AND", StringPool.EQUAL)
				.where("verificationcertificateno", verificationCertificateNo, "AND", StringPool.EQUAL)
				.where("verificationcertificatedate", verificationCertificateDate, "AND", StringPool.EQUAL)
				.where("verificationrefno", verificationRefNo, "AND", StringPool.EQUAL)
				.where("verificationrefdate", verificationRefDate, "AND", StringPool.EQUAL)
				.where("typeapprovalcertificateno", typeApprovalCertificateNo, "AND", StringPool.EQUAL)
				.where("typeapprovalcertificatedate", typeApprovalCertificateDate, "AND", StringPool.EQUAL)
				.where("designmodelcode", designModelCode, "AND", StringPool.EQUAL)
				.where("designmodeldescription", designModelDescription, "AND", StringPool.EQUAL)
				.where("designsymbol", designSymbol, "AND", StringPool.EQUAL)
				.where("registerednumber", registeredNumber, "AND", StringPool.EQUAL)
				.where("inspectorreceivedate", inspectorReceiveDate, "AND", StringPool.EQUAL)
				.where("inspectorsubmitdate", inspectorSubmitDate, "AND", StringPool.EQUAL)
				.where("inspectorendorsementdate", inspectorendorSementDate, "AND", StringPool.EQUAL)
				.where("inspectordeadline", inspectorDeadline, "AND", StringPool.EQUAL)
				.where("inspectorfinishdate", inspectorFinishDate, "AND", StringPool.EQUAL)
				.where("inspectorcanceldate", inspectorCancelDate, "AND", StringPool.EQUAL)
				.where("inspectororganization", inspectorOrganization, "AND", StringPool.EQUAL)
				.where("inspectordivision", inspectorDivision, "AND", StringPool.EQUAL)
				.where("inspectorsignname", inspectorSignName, "AND", StringPool.EQUAL)
				.where("inspectorsigntitle", inspectorSignTitle, "AND", StringPool.EQUAL)
				.where("inspectorsignplace", inspectorSignPlace, "AND", StringPool.EQUAL)
				.where("certificatetype", certificateType, "AND", StringPool.EQUAL)
				.where("referencecertificateno", referenceCertificateNo, "AND", StringPool.EQUAL)
				.where("referencecertificatedate", referenceCertificateDate, "AND", StringPool.EQUAL)
				.where("certificaterecordno", certificateRecordNo, "AND", StringPool.EQUAL)
				.where("certificatesignname", certificateSignName, "AND", StringPool.EQUAL)
				.where("certificatesigntitle", certificateSignTitle, "AND", StringPool.EQUAL)
				.where("certificatesignplace", certificateSignPlace, "AND", StringPool.EQUAL)
				.where("certificaterecorddate", certificateRecordDate, "AND", StringPool.EQUAL)
				.where("certificaterecordexpiredate", certificateRecordExpireDate, "AND", StringPool.EQUAL)
				.where("expiredstatus", expiredStatus, "AND", StringPool.EQUAL)
				.where("certificaterecordstatus", certificateRecordStatus, "AND", StringPool.EQUAL)
				.where("digitalissuestatus", digitalIssueStatus, "AND", StringPool.EQUAL)
				.where("vehicleclass", vehicleClass, "AND", StringPool.EQUAL)
				.where("certifiedvehicletype", certifiedVehicleType, "AND", StringPool.EQUAL)
				.where("certifiedvehicletypedescription", certifiedVehicleTypeDescription, "AND", StringPool.EQUAL)
				.where("certifiedtrademark", certifiedTrademark, "AND", StringPool.EQUAL)
				.where("certifiedtrademarkname", certifiedTrademarkName, "AND", StringPool.EQUAL)
				.where("certifiedcommercialname", certifiedCommercialName, "AND", StringPool.EQUAL)
				.where("certifiedmodelcode", certifiedModelCode, "AND", StringPool.EQUAL)
				.where("certifiedassemblytype", certifiedAssemblyType, "AND", StringPool.EQUAL)
				.where("certifiedassemblytypedescription", certifiedAssemblyTypeDescription, "AND", StringPool.EQUAL)
				.where("certifiedvinno", certifiedVINNo, "AND", StringPool.EQUAL)
				.where("certifiedvinposition", certifiedVINPosition, "AND", StringPool.EQUAL)
				.where("certifiedframeno", certifiedFrameNo, "AND", StringPool.EQUAL)
				.where("certifiedframeattachplace", certifiedFrameAttachPlace, "AND", StringPool.EQUAL)
				.where("certifiedframeposition", certifiedFramePosition, "AND", StringPool.EQUAL)
				.where("certifiedengineno", certifiedEngineNo, "AND", StringPool.EQUAL)
				.where("certifiedengineattachplace", certifiedEngineAttachPlace, "AND", StringPool.EQUAL)
				.where("certifiedengineposition", certifiedEnginePosition, "AND", StringPool.EQUAL)
				.where("safetytestreportno", safetyTestReportNo, "AND", StringPool.EQUAL)
				.where("safetytestreportdate", safetyTestReportDate, "AND", StringPool.EQUAL)
				.where("emissiontestreportno", emissionTestReportNo, "AND", StringPool.EQUAL)
				.where("emissiontestreportdate", emissionTestReportDate, "AND", StringPool.EQUAL)
				.where("commonsafetystandard", commonSafetyStandard, "AND", StringPool.EQUAL)
				.where("emissionstandard", emissionStandard, "AND", StringPool.EQUAL)
				.where("commonsafetydescription", commonSafetyDescription, "AND", StringPool.EQUAL)
				.where("emissiondescription", emissionDescription, "AND", StringPool.EQUAL)
				.where("othertestreportno", otherTestReportNo, "AND", StringPool.EQUAL)
				.where("othertestreportdate", otherTestReportDate, "AND", StringPool.EQUAL)
				.where("sampleframeno", sampleFrameNo, "AND", StringPool.EQUAL)
				.where("samplevinno", sampleVINNo, "AND", StringPool.EQUAL)
				.where("sampleengineno", sampleEngineNo, "AND", StringPool.EQUAL)
				.where("samplevehicletype", sampleVehicleType, "AND", StringPool.EQUAL)
				.where("samplevehicletypedescription", sampleVehicleTypeDescription, "AND", StringPool.EQUAL)
				.where("sampletrademark", sampleTrademark, "AND", StringPool.EQUAL)
				.where("sampletrademarkname", sampleTrademarkName, "AND", StringPool.EQUAL)
				.where("samplecommercialname", sampleCommercialName, "AND", StringPool.EQUAL)
				.where("samplemodelcode", sampleModelCode, "AND", StringPool.EQUAL)
				.where("customsdeclarationno", customsDeclarationNo, "AND", StringPool.EQUAL)
				.where("customsdeclarationdate", customsDeclarationDate, "AND", StringPool.EQUAL)
				.where("productioncountry", productionCountry, "AND", StringPool.EQUAL)
				.where("importerquantity", importerQuantity, "AND", StringPool.EQUAL)
				.where("inspectionrecordno", inspectionRecordNo, "AND", StringPool.EQUAL)
				.where("inspectiondate", inspectionDate, "AND", StringPool.EQUAL)
				.where("inspectionsite", inspectionSite, "AND", StringPool.EQUAL)
				.where("inspectiondistrictcode", inspectionDistrictCode, "AND", StringPool.EQUAL)
				.where("inspectiondistrictname", inspectionDistrictName, "AND", StringPool.EQUAL)
				.where("inspectionprovincecode", inspectionProvinceCode, "AND", StringPool.EQUAL)
				.where("inspectionprovincename", inspectionProvinceName, "AND", StringPool.EQUAL)
				.where("corporationid", corporationId, "AND", StringPool.EQUAL)
				.where("inspectorid", inspectorId, "AND", StringPool.EQUAL)
				.where("remarks", remarks, "AND", StringPool.EQUAL)
				.where("inspectionnote", inspectionNote, "AND", StringPool.EQUAL)
				.where("certificatenote", certificateNote, "AND", StringPool.EQUAL)
				.where("deliverablecode", deliverableCode, "AND", StringPool.EQUAL)
				.where("module", module, "AND", StringPool.EQUAL)
				//.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				//.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRVehicleTypeCertificateLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRVehicleTypeCertificateLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRVehicleTypeCertificateImpl.class, "VRVehicleTypeCertificate", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

	@Override
	public JSONObject updateVRVehicleTypeCertificate(VRVehicleTypeCertificate object) {
		// validate
		if (object == null) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_BAD_REQUEST, StringPool.BLANK);
		}
		if (object.getId() <= 0) {
			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_NOT_FOUND, StringPool.BLANK);
		}

		try {

			object = VRVehicleTypeCertificateLocalServiceUtil.updateVRVehicleTypeCertificate(object);

			JSONObject result = ActionUtil.object2Json(object, VRProductionPlantEquipmentModelImpl.class,
					StringPool.BLANK);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_OK, result);

		} catch (Exception e) {
			_log.error(e);

			return ActionUtil.createResponseContent(HttpsURLConnection.HTTP_INTERNAL_ERROR, StringPool.BLANK);

		}
	}

}
