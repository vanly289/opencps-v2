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
 * Provides a wrapper for {@link VRProductionPlantService}.
 *
 * @author LamTV
 * @see VRProductionPlantService
 * @generated
 */
@ProviderType
public class VRProductionPlantServiceWrapper implements VRProductionPlantService,
	ServiceWrapper<VRProductionPlantService> {
	public VRProductionPlantServiceWrapper(
		VRProductionPlantService vrProductionPlantService) {
		_vrProductionPlantService = vrProductionPlantService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrProductionPlantService.getOSGiServiceIdentifier();
	}

	@Override
	public VRProductionPlantService getWrappedService() {
		return _vrProductionPlantService;
	}

	@Override
	public void setWrappedService(
		VRProductionPlantService vrProductionPlantService) {
		_vrProductionPlantService = vrProductionPlantService;
	}

	private VRProductionPlantService _vrProductionPlantService;
}