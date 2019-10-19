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
import com.fds.vr.cop.model.VRCOPReportRepository;
import com.fds.vr.cop.service.base.VRCOPReportRepositoryLocalServiceBaseImpl;
import com.fds.vr.cop.service.persistence.VRCOPReportRepositoryUtils;
import com.fds.vr.cop.xmlmodel.VRCOPReportRepositoryModel;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop report repository local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.cop.service.VRCOPReportRepositoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPReportRepositoryLocalServiceBaseImpl
 * @see com.fds.vr.cop.service.VRCOPReportRepositoryLocalServiceUtil
 */
@ProviderType
public class VRCOPReportRepositoryLocalServiceImpl
	extends VRCOPReportRepositoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.cop.service.VRCOPReportRepositoryLocalServiceUtil} to access the vrcop report repository local service.
	 */
	
	private Log _log = LogFactoryUtil.getLog(VRCOPReportRepositoryLocalServiceImpl.class);
//	public VRCOPReportRepositoryModel getCOPReport(String COPReportNo) throws SystemException{
//		
//		VRCOPReportRepositoryModel result = new VRCOPReportRepositoryModel();
//		
//		VRCOPReportRepository vrCOPReportRepository = vrcopReportRepositoryPersistence.fetchByCOP_REPORT_NO(COPReportNo);
//		
//		VRCOPReportRepositoryUtils actions = new VRCOPReportRepositoryUtils();
//		
//		result= actions.mapperModel(vrCOPReportRepository);
//		
//		
//		
//		return result;
//	}
	
	public JSONObject getCOPReport(String COPReportNo) throws SystemException, JSONException{
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		
		VRCOPReportRepository vrCOPReportRepository = vrcopReportRepositoryPersistence.fetchByCOP_REPORT_NO(COPReportNo);
		
		result = ActionUtil.object2Json(vrCOPReportRepository, VRCOPReportRepository.class,"vr_copreportrepository");
		
		_log.info("result:"+result);
		
		return result;
	}
	
//	public List<VRCOPReportRepositoryModel> getCOPReports(int start, int end) throws SystemException {
//
//		List<VRCOPReportRepositoryModel> list = new ArrayList<VRCOPReportRepositoryModel>();
//
//		List<VRCOPReportRepository> dataList = vrcopReportRepositoryPersistence.findAll(start, end);
//		
//		_log.info("dataList.size():"+dataList.size());
//
//		VRCOPReportRepositoryUtils actions = new VRCOPReportRepositoryUtils();
//
//		list = actions.mapperModel(dataList);
//		
//		_log.info("list.size():"+list.size());
//
//		return list;
//	}
	
	public JSONArray getCOPReports(int start, int end) throws SystemException, JSONException {

		JSONArray result = JSONFactoryUtil.createJSONArray();

		List<VRCOPReportRepository> dataList = vrcopReportRepositoryPersistence.findAll(start, end);
		
		result = ActionUtil.objectList2Json(dataList, VRCOPReportRepository.class,"vr_copreportrepository");
		
		_log.info("dataList.size():"+dataList.size());

		

		return result;
	}
	
}