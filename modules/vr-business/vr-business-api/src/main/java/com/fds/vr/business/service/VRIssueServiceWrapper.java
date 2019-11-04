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
 * Provides a wrapper for {@link VRIssueService}.
 *
 * @author LamTV
 * @see VRIssueService
 * @generated
 */
@ProviderType
public class VRIssueServiceWrapper implements VRIssueService,
	ServiceWrapper<VRIssueService> {
	public VRIssueServiceWrapper(VRIssueService vrIssueService) {
		_vrIssueService = vrIssueService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrIssueService.getOSGiServiceIdentifier();
	}

	@Override
	public VRIssueService getWrappedService() {
		return _vrIssueService;
	}

	@Override
	public void setWrappedService(VRIssueService vrIssueService) {
		_vrIssueService = vrIssueService;
	}

	private VRIssueService _vrIssueService;
}