package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantSupplierAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.engine.SQLQueryBuilder;
import com.fds.vr.business.model.impl.VRProductionPlantSupplierImpl;
import com.fds.vr.business.service.VRProductionPlantSupplierLocalServiceUtil;
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
public class VRProductionPlantSupplierActionImpl implements VRProductionPlantSupplierAction {

	@Override
	public JSONObject findVRProductionPlantSupplier(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params) {
		int start = ActionUtil.getStart(params);
		int end = ActionUtil.getEnd(params);
		String keyword = ActionUtil.getKeyword(params);
		Long id = null;
		Long mtCore = null;
		String supplierId = null;
		String supplierName = null;
		String supplieraddress = null;
		String corporationCode = null;
		String corporationName = null;
		String corporationAddress = null;
		Long applicantprofileId = null;
		Long productPlantID = null;
		String productionPlantCode = null;
		String productionPlantName = null;
		String productionPlantAddress = null;
		Integer markupImporter = null;
		String mappingMA_CTY = null;
		String mappingTEN_CTY = null;
		String mappingDIA_CHI_CTY = null;
		String mappingMA_XUONG_LR = null;
		String mappingTEN_XUONG_LR = null;
		String mappingDIA_CHI_XUONG_LR = null;
		String modifyDate = null;
		String syncDate = null;
		if (params != null) {
			if (params.containsKey("id")) {
				id = GetterUtil.getLong(params.get("id"));
			}
			if (params.containsKey("mtcore")) {
				mtCore = GetterUtil.getLong(params.get("mtcore"));
			}
			if (params.containsKey("supplierid")) {
				supplierId = GetterUtil.getString(params.get("supplierid"));
			}
			if (params.containsKey("suppliername")) {
				supplierName = GetterUtil.getString(params.get("suppliername"));
			}
			if (params.containsKey("supplieraddress")) {
				supplieraddress = GetterUtil.getString(params.get("supplieraddress"));
			}
			if (params.containsKey("corporationcode")) {
				corporationCode = GetterUtil.getString(params.get("corporationcode"));
			}
			if (params.containsKey("corporationname")) {
				corporationName = GetterUtil.getString(params.get("corporationname"));
			}
			if (params.containsKey("corporationaddress")) {
				corporationAddress = GetterUtil.getString(params.get("corporationaddress"));
			}
			if (params.containsKey("applicantprofileid")) {
				applicantprofileId = GetterUtil.getLong(params.get("applicantprofileid"));
			}
			if (params.containsKey("productplantid")) {
				productPlantID = GetterUtil.getLong(params.get("productplantid"));
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
			if (params.containsKey("markupimporter")) {
				markupImporter = GetterUtil.getInteger(params.get("markupimporter"));
			}
			if (params.containsKey("mappingma_cty")) {
				mappingMA_CTY = GetterUtil.getString(params.get("mappingma_cty"));
			}
			if (params.containsKey("mappingten_cty")) {
				mappingTEN_CTY = GetterUtil.getString(params.get("mappingten_cty"));
			}
			if (params.containsKey("mappingdia_chi_cty")) {
				mappingDIA_CHI_CTY = GetterUtil.getString(params.get("mappingdia_chi_cty"));
			}
			if (params.containsKey("mappingma_xuong_lr")) {
				mappingMA_XUONG_LR = GetterUtil.getString(params.get("mappingma_xuong_lr"));
			}
			if (params.containsKey("mappingten_xuong_lr")) {
				mappingTEN_XUONG_LR = GetterUtil.getString(params.get("mappingten_xuong_lr"));
			}
			if (params.containsKey("mappingdia_chi_xuong_lr")) {
				mappingDIA_CHI_XUONG_LR = GetterUtil.getString(params.get("mappingdia_chi_xuong_lr"));
			}
			if (params.containsKey("modifydate")) {
				modifyDate = GetterUtil.getString(params.get("modifydate"));
			}
			if (params.containsKey("syncdate")) {
				syncDate = GetterUtil.getString(params.get("syncdate"));
			}
		}
		String _keywordSearchCondition = ActionUtil.buildSQLCondition("supplierId", keyword, "", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("supplierName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("supplieraddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("corporationCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("corporationName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("corporationAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantCode", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantName", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("productionPlantAddress", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingMA_CTY", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingTEN_CTY", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingDIA_CHI_CTY", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingMA_XUONG_LR", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingTEN_XUONG_LR", keyword, "OR", StringPool.LIKE, "")
				+ ActionUtil.buildSQLCondition("mappingDIA_CHI_XUONG_LR", keyword, "OR", StringPool.LIKE, "");
		SQLQueryBuilder builder = new SQLQueryBuilder();
		builder.selectAll().from("vr_productionplantsupplier").where("id", id, "AND", StringPool.EQUAL)
				.where("mtcore", mtCore, "AND", StringPool.EQUAL)
				.where("supplierid", supplierId, "AND", StringPool.EQUAL)
				.where("suppliername", supplierName, "AND", StringPool.EQUAL)
				.where("supplieraddress", supplieraddress, "AND", StringPool.EQUAL)
				.where("corporationcode", corporationCode, "AND", StringPool.EQUAL)
				.where("corporationname", corporationName, "AND", StringPool.EQUAL)
				.where("corporationaddress", corporationAddress, "AND", StringPool.EQUAL)
				.where("applicantprofileid", applicantprofileId, "AND", StringPool.EQUAL)
				.where("productplantid", productPlantID, "AND", StringPool.EQUAL)
				.where("productionplantcode", productionPlantCode, "AND", StringPool.EQUAL)
				.where("productionplantname", productionPlantName, "AND", StringPool.EQUAL)
				.where("productionplantaddress", productionPlantAddress, "AND", StringPool.EQUAL)
				.where("markupimporter", markupImporter, "AND", StringPool.EQUAL)
				.where("mappingma_cty", mappingMA_CTY, "AND", StringPool.EQUAL)
				.where("mappingten_cty", mappingTEN_CTY, "AND", StringPool.EQUAL)
				.where("mappingdia_chi_cty", mappingDIA_CHI_CTY, "AND", StringPool.EQUAL)
				.where("mappingma_xuong_lr", mappingMA_XUONG_LR, "AND", StringPool.EQUAL)
				.where("mappingten_xuong_lr", mappingTEN_XUONG_LR, "AND", StringPool.EQUAL)
				.where("mappingdia_chi_xuong_lr", mappingDIA_CHI_XUONG_LR, "AND", StringPool.EQUAL)
				.where("modifydate", modifyDate, "AND", StringPool.EQUAL)
				.where("syncdate", syncDate, "AND", StringPool.EQUAL)
				.where(_keywordSearchCondition, null, "AND", "", true).build();
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long total = VRProductionPlantSupplierLocalServiceUtil.counData(builder.getCountQuery());
		JSONArray data = VRProductionPlantSupplierLocalServiceUtil.findData(builder.getSelectQuery(), null, null,
				VRProductionPlantSupplierImpl.class, "VRProductionPlantSupplier", start, end);
		result.put("total", total);
		result.put("data", data);
		return result;
	}

}
