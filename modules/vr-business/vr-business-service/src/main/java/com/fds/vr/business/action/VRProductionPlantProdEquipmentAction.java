package com.fds.vr.business.action;

import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRProductionPlantProdEquipmentAction {
	
	public JSONObject createVRProductionPlantProdEquipment(VRProductionPlantProdEquipment object);
	
	public JSONArray findByProductionPlanCode(String productionPlantCodes);

	public JSONObject findVRProductionPlantProdEquipment(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);
}
