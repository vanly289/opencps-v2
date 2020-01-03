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

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VRProductionPlantEmployeeService}.
 *
 * @author LamTV
 * @see VRProductionPlantEmployeeService
 * @generated
 */
@ProviderType
public class VRProductionPlantEmployeeServiceWrapper
	implements VRProductionPlantEmployeeService,
		ServiceWrapper<VRProductionPlantEmployeeService> {
	public VRProductionPlantEmployeeServiceWrapper(
		VRProductionPlantEmployeeService vrProductionPlantEmployeeService) {
		_vrProductionPlantEmployeeService = vrProductionPlantEmployeeService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrProductionPlantEmployeeService.getOSGiServiceIdentifier();
	}

	@Override
	public VRProductionPlantEmployeeService getWrappedService() {
		return _vrProductionPlantEmployeeService;
	}

	@Override
	public void setWrappedService(
		VRProductionPlantEmployeeService vrProductionPlantEmployeeService) {
		_vrProductionPlantEmployeeService = vrProductionPlantEmployeeService;
	}

	private VRProductionPlantEmployeeService _vrProductionPlantEmployeeService;
}