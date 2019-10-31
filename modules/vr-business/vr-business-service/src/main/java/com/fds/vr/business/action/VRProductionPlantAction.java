package com.fds.vr.business.action;

import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRProductionPlantEmployee;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRProductionPlantAction {
	public JSONObject findVRVRProductionPlant(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);
	
	public JSONObject updatePlantProdEquipment(VRProductionPlantProdEquipment object);
	public JSONObject createPlantProdEquipment(VRProductionPlantProdEquipment object);
	
	public JSONObject createVRProductionPlant(VRProductionPlant object);
	public JSONObject updateVRProductionPlant(VRProductionPlant object);
	
	public JSONObject createVRProductionPlantEmployee(VRProductionPlantEmployee object);
	public JSONObject updateVRProductionPlantEmployee(VRProductionPlantEmployee object);
	
	public JSONObject createVRProductionPlantEquiptment(VRProductionPlantEquipment object);
	public JSONObject updateVRProductionPlantEquiptment(VRProductionPlantEquipment object);
	
	public JSONObject createVRProductType(VRProductType object);
	public JSONObject updateVRProductType(VRProductType object);
	
	public JSONObject createVRProductionClassification(VRProductionClassification object);
	public JSONObject updateVRProductionClassification(VRProductionClassification object);
	
	
}
