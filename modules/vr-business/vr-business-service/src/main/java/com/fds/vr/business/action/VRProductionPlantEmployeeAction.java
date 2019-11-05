package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONArray;

/**
 * @author trungnt
 *
 */
public interface VRProductionPlantEmployeeAction {
	public JSONArray findVRProductionPlantEmployee(String productionPlantCode);
}
