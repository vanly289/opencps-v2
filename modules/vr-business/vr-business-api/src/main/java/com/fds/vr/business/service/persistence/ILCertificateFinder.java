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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author LamTV
 * @generated
 */
@ProviderType
public interface ILCertificateFinder {
	public java.util.List<com.fds.vr.business.model.ILCertificate> findILCertificateByServiceCode(
		java.lang.String keywords, java.lang.String serviceCode,
		java.lang.String govAgencyCode, java.lang.String routeCode,
		java.lang.String fromDate, java.lang.String toDate, int start, int limit);

	public long countILCertificateByServiceCode(java.lang.String keywords,
		java.lang.String serviceCode, java.lang.String govAgencyCode,
		java.lang.String routeCode, java.lang.String fromDate,
		java.lang.String toDate);

	public java.util.List<com.fds.vr.business.model.ILCertificate> findILCertificateByApplicant(
		java.lang.String serviceCode, java.lang.String applicant);

	public long countILCertificateByApplicant(java.lang.String serviceCode,
		java.lang.String applicant);
}