package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRProductionPlantSupplierAction {
	public JSONObject findVRProductionPlantSupplier(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);
}
