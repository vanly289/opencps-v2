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

package com.fds.vr.business.service.impl;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;

import com.fds.vr.business.model.VRApplicantProfileHistory;
import com.fds.vr.business.service.base.VRApplicantProfileHistoryServiceBaseImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import aQute.bnd.annotation.ProviderType;



/**
 * The implementation of the vr applicant profile history remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRApplicantProfileHistoryService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author khoavd
 * @see VRApplicantProfileHistoryServiceBaseImpl
 * @see com.fds.vr.business.service.VRApplicantProfileHistoryServiceUtil
 */
@ProviderType
public class VRApplicantProfileHistoryServiceImpl
	extends VRApplicantProfileHistoryServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRApplicantProfileHistoryServiceUtil} to access the vr applicant profile history remote service.
	 */
	public List<VRApplicantProfileHistory> findBymappingStatus(long mtCore, String mappingStatus) {
		return vrApplicantProfileHistoryPersistence.findBymappingStatus(mtCore, mappingStatus);
	}
	
	public List<VRApplicantProfileHistory> findByapplicantCode(long mtCore, String applicantCode) {
		return vrApplicantProfileHistoryPersistence.findByapplicantCode(mtCore, applicantCode);
	}

	public List<VRApplicantProfileHistory> findBymappingMA_CTY(long mtCore, String mappingMA_CTY) {
		return vrApplicantProfileHistoryPersistence.findBymappingMA_CTY(mtCore, mappingMA_CTY);
	}

	public List<VRApplicantProfileHistory> findBymappingTEN_CTY(long mtCore, String mappingTEN_CTY) {
		return vrApplicantProfileHistoryPersistence.findBymappingTEN_CTY(mtCore, mappingTEN_CTY);
	}

	public List<VRApplicantProfileHistory> findByapplicantRegion(long mtCore, String applicantRegion) {
		return vrApplicantProfileHistoryPersistence.findByapplicantRegion(mtCore, applicantRegion);
	}

	public List<VRApplicantProfileHistory> findByapplicantCity(long mtCore, String applicantCity) {
		return vrApplicantProfileHistoryPersistence.findByapplicantCity(mtCore, applicantCity);
	}

	public List<VRApplicantProfileHistory> findByapplicantStatus(long mtCore, String applicantStatus) {
		return vrApplicantProfileHistoryPersistence.findByapplicantStatus(mtCore, applicantStatus);
	}
	
	private Log _log = LogFactoryUtil.getLog(VRApplicantProfileLocalServiceImpl.class);
}