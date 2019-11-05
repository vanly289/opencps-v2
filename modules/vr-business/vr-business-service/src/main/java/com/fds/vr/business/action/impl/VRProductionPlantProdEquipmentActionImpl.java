package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantProdEquipmentAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentImpl;
import com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

/**
 * @author trungnt
 *
 */
public class VRProductionPlantProdEquipmentActionImpl implements VRProductionPlantProdEquipmentAction {
	private Log _log = LogFactoryUtil.getLog(VRProductionPlantProdEquipmentActionImpl.class.getName());

	@Override
	public JSONArray findByProductionPlanCode(String productionPlantCodes) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		if (Validator.isNotNull(productionPlantCodes)) {
			String[] arrProductionPlantCodes = StringUtil.split(productionPlantCodes);
			if (arrProductionPlantCodes != null && arrProductionPlantCodes.length > 0) {
				for (String productionPlantCode : arrProductionPlantCodes) {
					try {
						List<VRProductionPlantProdEquipment> productionPlantProdEquipments = VRProductionPlantProdEquipmentLocalServiceUtil
								.findByProductionPlanCode(productionPlantCode);
						for (VRProductionPlantProdEquipment productionPlantProdEquipment : productionPlantProdEquipments) {
							result.put(ActionUtil.object2Json(productionPlantProdEquipment,
									VRProductionPlantProdEquipmentImpl.class, StringPool.BLANK));
						}
					} catch (Exception e) {
						_log.info("can't find VRProductionPlantProdEquipment by productionPlantCode: "
								+ productionPlantCode);
						continue;
					}
				}
			}
		}
		return result;
	}

}
