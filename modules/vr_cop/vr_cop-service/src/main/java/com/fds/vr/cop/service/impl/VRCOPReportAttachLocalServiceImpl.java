/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.cop.service.impl;

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.cop.model.VRCOPReportAttach;
import com.fds.vr.cop.service.base.VRCOPReportAttachLocalServiceBaseImpl;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop report attach local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.cop.service.VRCOPReportAttachLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPReportAttachLocalServiceBaseImpl
 * @see com.fds.vr.cop.service.VRCOPReportAttachLocalServiceUtil
 */
@ProviderType
public class VRCOPReportAttachLocalServiceImpl
	extends VRCOPReportAttachLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.cop.service.VRCOPReportAttachLocalServiceUtil} to access the vrcop report attach local service.
	 */
	
	public JSONArray getListBy(String COPReportNo) throws JSONException{
		
		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		List<VRCOPReportAttach> dataList = vrcopReportAttachPersistence.findByCOP_REPORT_NO(COPReportNo);
		
		for(VRCOPReportAttach data:dataList) {
			
			jsonObject = JSONFactoryUtil.createJSONObject();
			
			jsonObject = ActionUtil.object2Json(data, VRCOPReportAttach.class, "vr_copreportattach");
			
			if(Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}
}