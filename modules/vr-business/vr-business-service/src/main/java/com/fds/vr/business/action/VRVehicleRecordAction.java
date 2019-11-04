package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.InputStream;

/**
 * @author trungnt
 *
 */
public interface VRVehicleRecordAction {
	public JSONObject importVRVehicleRecord(User user, ServiceContext serviceContext,
			InputStream inputStream);
}
