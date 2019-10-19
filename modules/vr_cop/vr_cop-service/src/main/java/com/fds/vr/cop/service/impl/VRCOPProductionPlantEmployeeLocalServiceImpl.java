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

import com.fds.vr.cop.model.VRCOPProductionPlantEmployee;
import com.fds.vr.cop.service.base.VRCOPProductionPlantEmployeeLocalServiceBaseImpl;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantEmployeeUtils;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEmployeeModel;

import java.util.ArrayList;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop production plant employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.cop.service.VRCOPProductionPlantEmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantEmployeeLocalServiceBaseImpl
 * @see com.fds.vr.cop.service.VRCOPProductionPlantEmployeeLocalServiceUtil
 */
@ProviderType
public class VRCOPProductionPlantEmployeeLocalServiceImpl
	extends VRCOPProductionPlantEmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.cop.service.VRCOPProductionPlantEmployeeLocalServiceUtil} to access the vrcop production plant employee local service.
	 */
	
	public List<VRCOPProductionPlantEmployeeModel> getListBy(String COPReportNo){
		
		List<VRCOPProductionPlantEmployeeModel> list = new ArrayList<VRCOPProductionPlantEmployeeModel>();
		
		List<VRCOPProductionPlantEmployee> dataList = vrcopProductionPlantEmployeePersistence.findByCOP_REPORT_NO(COPReportNo);
		
		VRCOPProductionPlantEmployeeUtils actions = new VRCOPProductionPlantEmployeeUtils();
		
		list = actions.mapperModel(dataList);
		return list;
	}
}