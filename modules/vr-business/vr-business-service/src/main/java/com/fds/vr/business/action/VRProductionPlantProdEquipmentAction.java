package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONArray;

/**
 * @author trungnt
 *
 */
public interface VRProductionPlantProdEquipmentAction {
	public JSONArray findByProductionPlanCode(String productionPlantCodes);
}
