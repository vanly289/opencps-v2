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

import com.fds.vr.cop.model.VRCOPProductType;
import com.fds.vr.cop.model.VRCOPProductionPlantEmployee;
import com.fds.vr.cop.service.base.VRCOPProductTypeLocalServiceBaseImpl;
import com.fds.vr.cop.service.persistence.VRCOPProductTypeUtils;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantEmployeeUtils;
import com.fds.vr.cop.xmlmodel.VRCOPProductTypeModel;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEmployeeModel;

import java.util.ArrayList;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop product type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.cop.service.VRCOPProductTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductTypeLocalServiceBaseImpl
 * @see com.fds.vr.cop.service.VRCOPProductTypeLocalServiceUtil
 */
@ProviderType
public class VRCOPProductTypeLocalServiceImpl
	extends VRCOPProductTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.cop.service.VRCOPProductTypeLocalServiceUtil} to access the vrcop product type local service.
	 */
	
	
	public List<VRCOPProductTypeModel> getListBy(String COPReportNo){
		
		List<VRCOPProductTypeModel> list = new ArrayList<VRCOPProductTypeModel>();
		
		List<VRCOPProductType> dataList = vrcopProductTypePersistence.findByCOP_REPORT_NO(COPReportNo);
		
		VRCOPProductTypeUtils actions = new VRCOPProductTypeUtils();
		
		list = actions.mapperModel(dataList);
		return list;
	}
}