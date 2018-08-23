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

package org.opencps.dossiermgt.service.impl;

import java.util.Date;
import java.util.List;

import org.opencps.dossiermgt.model.ProcessPlugin;
import org.opencps.dossiermgt.service.base.ProcessPluginLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the process plugin local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.dossiermgt.service.ProcessPluginLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author huymq
 * @see ProcessPluginLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.ProcessPluginLocalServiceUtil
 */
@ProviderType
public class ProcessPluginLocalServiceImpl
	extends ProcessPluginLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.opencps.dossiermgt.service.ProcessPluginLocalServiceUtil} to access the process plugin local service.
	 */
	public List<ProcessPlugin> getProcessPlugins(long serviceProcessId, String stepCode) {
		return processPluginPersistence.findBySC_SPID(stepCode, serviceProcessId);
	}
	
	public List<ProcessPlugin> getProcessPluginsBySPID(long groupId, long serviceProcessId) {
		return processPluginPersistence.findBySPID(groupId, serviceProcessId);
	}
	
	@Indexable(type = IndexableType.REINDEX)
	public ProcessPlugin updateProcessPlugin(long groupId, 
			long processPluginId, String stepCode, long serviceProcessId, String pluginName, String sequenceNo, 
			String pluginForm, String sampleData, boolean autoRun, ServiceContext context) throws PortalException {
		Date now = new Date();
		User userAction = userLocalService.getUser(context.getUserId());

		ProcessPlugin object = null;
		if (processPluginId == 0) {
			processPluginId = counterLocalService.increment(ProcessPlugin.class.getName());
			
			object = processPluginPersistence.create(processPluginId);
			// Add audit fields
			object.setProcessPluginId(processPluginId);
			object.setCompanyId(context.getCompanyId());
			object.setGroupId(groupId);
			object.setCreateDate(now);
			object.setModifiedDate(now);
			object.setUserId(userAction.getUserId());
			object.setUserName(userAction.getFullName());
			
			object.setServiceProcessId(serviceProcessId);
			object.setStepCode(stepCode);
			object.setPluginName(pluginName);
			object.setPluginForm(pluginForm);
			object.setSequenceNo(sequenceNo);
			object.setSampleData(sampleData);
			object.setAutoRun(autoRun);
		}
		else {
			object = processPluginPersistence.fetchByPrimaryKey(processPluginId);
			
			object.setModifiedDate(now);
			object.setUserId(userAction.getUserId());
			object.setUserName(userAction.getFullName());
			
			object.setServiceProcessId(serviceProcessId);
			object.setStepCode(stepCode);
			object.setPluginName(pluginName);
			object.setPluginForm(pluginForm);
			object.setSequenceNo(sequenceNo);
			object.setSampleData(sampleData);
			object.setAutoRun(autoRun);
			
		}
		
		object = processPluginPersistence.update(object);
		
		return object;
	}
	
	@Indexable(type = IndexableType.DELETE)
	public ProcessPlugin removeProcessPlugin(long processPluginId) throws PortalException {

		ProcessPlugin processPlugin = processPluginPersistence.fetchByPrimaryKey(processPluginId);

		return processPluginPersistence.remove(processPlugin);
	}	
}