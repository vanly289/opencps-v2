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

import com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment;
import com.fds.vr.cop.service.base.VRCOPProductionPlantProdEquipmentLocalServiceBaseImpl;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantProdEquipmentUtils;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantProdEquipmentModel;

import java.util.ArrayList;
import java.util.List;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop production plant prod equipment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.cop.service.VRCOPProductionPlantProdEquipmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantProdEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.cop.service.VRCOPProductionPlantProdEquipmentLocalServiceUtil
 */
@ProviderType
public class VRCOPProductionPlantProdEquipmentLocalServiceImpl
	extends VRCOPProductionPlantProdEquipmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.cop.service.VRCOPProductionPlantProdEquipmentLocalServiceUtil} to access the vrcop production plant prod equipment local service.
	 */
	
	public List<VRCOPProductionPlantProdEquipmentModel> getListBy(String COPReportNo){
		
		List<VRCOPProductionPlantProdEquipmentModel> list = new ArrayList<VRCOPProductionPlantProdEquipmentModel>();
		
		List<VRCOPProductionPlantProdEquipment> dataList = vrcopProductionPlantProdEquipmentPersistence.findByCOP_REPORT_NO(COPReportNo);
		
		VRCOPProductionPlantProdEquipmentUtils actions = new VRCOPProductionPlantProdEquipmentUtils();
		
		list = actions.mapperModel(dataList);
		return list;
	}
}