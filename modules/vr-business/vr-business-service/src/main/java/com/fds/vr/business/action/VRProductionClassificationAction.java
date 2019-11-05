package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONArray;

/**
 * @author trungnt
 *
 */
public interface VRProductionClassificationAction {
	public JSONArray findVRProductionClassification(String productionPlantCode);
}
