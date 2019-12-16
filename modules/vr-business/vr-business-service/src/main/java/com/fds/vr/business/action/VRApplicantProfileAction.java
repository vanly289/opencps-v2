package com.fds.vr.business.action;

import com.fds.vr.business.model.VRApplicantProfile;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRApplicantProfileAction {
	public JSONObject createVRApplicantProfile(VRApplicantProfile object);

	public JSONObject findVRApplicantProfile(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject findVRApplicantProfileDetail(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);

	public JSONObject findVRApplicantProfileByAppicantCode(User user, ServiceContext serviceContext, long mtCore,
			String applicantCode);

	public JSONObject updateVRApplicantProfile(VRApplicantProfile object);
}
