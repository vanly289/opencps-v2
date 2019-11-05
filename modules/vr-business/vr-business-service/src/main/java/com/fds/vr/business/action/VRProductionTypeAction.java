package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONArray;

/**
 * @author trungnt
 *
 */
public interface VRProductionTypeAction {
	public JSONArray findProductType(String productionPlantCode, String productClassificationCode);
}
