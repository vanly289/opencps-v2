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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRTechnicalSpec_XCGPart2;
import com.fds.vr.business.service.VRTechnicalSpec_XCGPart2LocalServiceUtil;

/**
 * The extended model base implementation for the VRTechnicalSpec_XCGPart2 service. Represents a row in the &quot;vr_technicalspec_xcg&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRTechnicalSpec_XCGPart2Impl}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart2Impl
 * @see VRTechnicalSpec_XCGPart2
 * @generated
 */
@ProviderType
public abstract class VRTechnicalSpec_XCGPart2BaseImpl
	extends VRTechnicalSpec_XCGPart2ModelImpl
	implements VRTechnicalSpec_XCGPart2 {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr technical spec_xcg part2 model instance should use the {@link VRTechnicalSpec_XCGPart2} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			VRTechnicalSpec_XCGPart2LocalServiceUtil.addVRTechnicalSpec_XCGPart2(this);
		}
		else {
			VRTechnicalSpec_XCGPart2LocalServiceUtil.updateVRTechnicalSpec_XCGPart2(this);
		}
	}
}