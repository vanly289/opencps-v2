package org.opencps.api.controller.util;

import org.opencps.api.processplugin.model.ProcessPluginModel;
import org.opencps.dossiermgt.model.ProcessPlugin;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;

import com.liferay.portal.kernel.util.StringPool;

public class ProcessPluginUtils {
	public static ProcessPluginModel mappingToDetail(ProcessPlugin processPlugin) {
		ProcessPluginModel model = new ProcessPluginModel();
		ProcessStep processStep = ProcessStepLocalServiceUtil.fetchBySC_GID(processPlugin.getStepCode(), processPlugin.getGroupId(), processPlugin.getServiceProcessId());
		
		model.setStepCode(processPlugin.getStepCode());
		model.setStepName(processStep != null ? processStep.getStepName() : StringPool.BLANK);
		model.setAutoRun(processPlugin.getAutoRun());
		model.setPluginForm(processPlugin.getPluginForm());
		model.setPluginName(processPlugin.getPluginName());
		model.setProcessPluginId(processPlugin.getProcessPluginId());
		model.setSampleData(processPlugin.getSampleData());
		model.setSequenceNo(processPlugin.getSequenceNo());
		model.setServiceProcessId(processPlugin.getServiceProcessId());
		
		return model;
	}
}
