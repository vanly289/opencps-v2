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
 * Provides a wrapper for {@link VRConfigTechSpecService}.
 *
 * @author LamTV
 * @see VRConfigTechSpecService
 * @generated
 */
@ProviderType
public class VRConfigTechSpecServiceWrapper implements VRConfigTechSpecService,
	ServiceWrapper<VRConfigTechSpecService> {
	public VRConfigTechSpecServiceWrapper(
		VRConfigTechSpecService vrConfigTechSpecService) {
		_vrConfigTechSpecService = vrConfigTechSpecService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrConfigTechSpecService.getOSGiServiceIdentifier();
	}

	@Override
	public VRConfigTechSpecService getWrappedService() {
		return _vrConfigTechSpecService;
	}

	@Override
	public void setWrappedService(
		VRConfigTechSpecService vrConfigTechSpecService) {
		_vrConfigTechSpecService = vrConfigTechSpecService;
	}

	private VRConfigTechSpecService _vrConfigTechSpecService;
}