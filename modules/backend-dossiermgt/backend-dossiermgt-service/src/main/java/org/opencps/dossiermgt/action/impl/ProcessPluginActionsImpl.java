package org.opencps.dossiermgt.action.impl;

import java.util.List;

import org.opencps.dossiermgt.action.ProcessPluginActions;
import org.opencps.dossiermgt.model.ProcessPlugin;
import org.opencps.dossiermgt.service.ProcessPluginLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

public class ProcessPluginActionsImpl implements ProcessPluginActions {

	@Override
	public ProcessPlugin updateProcessPlugin(long groupId, long processPluginId, String stepCode, long serviceProcessId,
			String pluginName, String sequenceNo, String pluginForm, String sampleData, boolean autoRun,
			ServiceContext context) throws PortalException {
		return ProcessPluginLocalServiceUtil.updateProcessPlugin(groupId, processPluginId, stepCode, serviceProcessId, pluginName, sequenceNo, pluginForm, sampleData, autoRun, context);
	}

	@Override
	public ProcessPlugin deleteProcessPlugin(long processPluginId) throws PortalException {
		return ProcessPluginLocalServiceUtil.deleteProcessPlugin(processPluginId);
	}

	@Override
	public List<ProcessPlugin> getProcessPluginsBySPID(long groupId, long serviceProcessId) {
		return ProcessPluginLocalServiceUtil.getProcessPluginsBySPID(groupId, serviceProcessId);
	}

}
