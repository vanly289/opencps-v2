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

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.cop.model.VRCOPProductionPlantEmployee;
import com.fds.vr.cop.model.VRCOPReportAttach;
import com.fds.vr.cop.service.base.VRCOPReportAttachLocalServiceBaseImpl;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantEmployeeUtils;
import com.fds.vr.cop.service.persistence.VRCOPReportAttachUtils;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEmployeeModel;
import com.fds.vr.cop.xmlmodel.VRCOPReportAttachModel;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<VRCOPReportAttachModel> getListBy(String COPReportNo){
		
		List<VRCOPReportAttachModel> list = new ArrayList<VRCOPReportAttachModel>();
		
		List<VRCOPReportAttach> dataList = vrcopReportAttachPersistence.findByCOP_REPORT_NO(COPReportNo);
		
		VRCOPReportAttachUtils actions = new VRCOPReportAttachUtils();
		
		list = actions.mapperModel(dataList);
		return list;
	}
}