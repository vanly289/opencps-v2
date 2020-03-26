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

package vn.gt.dao.service.impl;

import java.util.Date;
import java.util.List;

import org.opencps.dossiermgt.model.Dossier;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.GetterUtil;

import vn.gt.dao.model.CompressFileJob;
import vn.gt.dao.service.CompressFileJobLocalServiceUtil;
import vn.gt.dao.service.base.CompressFileJobLocalServiceBaseImpl;

/**
 * The implementation of the compress file job local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.service.CompressFileJobLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author huymq
 * @see vn.gt.dao.service.base.CompressFileJobLocalServiceBaseImpl
 * @see vn.gt.dao.service.CompressFileJobLocalServiceUtil
 */
public class CompressFileJobLocalServiceImpl
	extends CompressFileJobLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.service.CompressFileJobLocalServiceUtil} to access the compress file job local service.
	 */
	
	public CompressFileJob addJob(List<Dossier> listHoSo) throws SystemException {
		long id = counterLocalService.increment(CompressFileJob.class.getName());
		
		CompressFileJob compressFileJob = compressFileJobPersistence.create(id);
		
		StringBuilder sb = new StringBuilder();
		long lastedHoSoId = 0;
		for(Dossier hoSo : listHoSo) {
			sb.append(hoSo.getDossierId());
			sb.append(",");
			
			if(hoSo.getDossierId() > lastedHoSoId) {
				lastedHoSoId = hoSo.getDossierId();
			}
		}
		
		compressFileJob.setCreateDate(new Date());
		compressFileJob.setModifiedDate(new Date());
		compressFileJob.setListHoSoId(sb.toString());
		compressFileJob.setStatus(false);
		compressFileJob.setLastedHoSoId(lastedHoSoId);
		
		return compressFileJobPersistence.update(compressFileJob);
	}
	
	public long getLastedHoSoId() throws SystemException {
		DynamicQuery dynamicQuery = CompressFileJobLocalServiceUtil.dynamicQuery();//DynamicQueryFactoryUtil.forClass(CompressFileJob.class, PortletClassLoaderUtil.getClassLoader());
		dynamicQuery.setProjection(ProjectionFactoryUtil.max("lastedHoSoId"));
		List results = CompressFileJobLocalServiceUtil.dynamicQuery(dynamicQuery);
		
		if(results != null && results.size() > 0) {
			return GetterUtil.getLong(results.get(0));
		} else {
			return 0;
		}
	}
	
	public CompressFileJob updateCompressFileJob(long id) throws PortalException, SystemException {
		
		CompressFileJob compressFileJob = compressFileJobPersistence.findByPrimaryKey(id);
		
		compressFileJob.setStatus(true);
		compressFileJob.setModifiedDate(new Date());
		
		
		return compressFileJobPersistence.update(compressFileJob);
	}
}