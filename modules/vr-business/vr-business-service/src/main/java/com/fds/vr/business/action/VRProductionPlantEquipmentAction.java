package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONArray;

/**
 * @author trungnt
 *
 */
public interface VRProductionPlantEquipmentAction {
	public JSONArray findByProductionPlanCode_ProductClassificationCode(String productionPlantCode,
			String productClassificationCode);
	public boolean deleteProductionPlantEquipment(String ids);
}
