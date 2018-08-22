package org.opencps.dossiermgt.action;

import java.util.List;

import org.opencps.dossiermgt.model.ProcessPlugin;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

public interface ProcessPluginActions {
	public ProcessPlugin updateProcessPlugin(long groupId, long processPluginId, String stepCode, long serviceProcessId,
			String pluginName, String sequenceNo, String pluginForm, String sampleData, boolean autoRun, ServiceContext context) throws PortalException;
	public ProcessPlugin deleteProcessPlugin(long processPluginId) throws PortalException;
	public List<ProcessPlugin> getProcessPluginsBySPID(long groupId, long serviceProcessId);
}
