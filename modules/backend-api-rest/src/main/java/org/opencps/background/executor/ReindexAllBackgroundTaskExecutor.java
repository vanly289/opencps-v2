package org.opencps.background.executor;

import java.io.Serializable;
import java.util.Map;

import org.opencps.api.controller.util.SystemUtils;
import org.opencps.background.reindexall.BackgroundReindexAll;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.backgroundtask.BackgroundTask;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskConstants;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskExecutor;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskResult;
import com.liferay.portal.kernel.backgroundtask.BaseBackgroundTaskExecutor;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplay;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplayFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;

@Component(
        immediate = true,
        property = {"background.task.executor.class.name=org.opencps.background.executor.ReindexAllBackgroundTaskExecutor"},
        service = BackgroundTaskExecutor.class
)
public class ReindexAllBackgroundTaskExecutor extends BaseBackgroundTaskExecutor {
	public static final Log LOGGER = LogFactoryUtil
			.getLog(ReindexAllBackgroundTaskExecutor.class);
	
    public ReindexAllBackgroundTaskExecutor() {
    	setBackgroundTaskStatusMessageTranslator(
				new ReindexAllBackgroundTaskStatusMessageTranslator());
    }
    
	@Override
	public BackgroundTaskResult execute(BackgroundTask backgroundTask) throws Exception {
        Map<String,Serializable> taskContextMap = backgroundTask.getTaskContextMap();

        Long siteId = (Long)taskContextMap.get("groupId") ;
        Group site = GroupLocalServiceUtil.fetchGroup(GetterUtil.getLong(siteId));
        int progress = 0;
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCompanyId(site.getCompanyId());
		
        SystemUtils.reindexProcessAction(siteId, 0l, serviceContext);
        
        BackgroundReindexAll messageContent = new BackgroundReindexAll();
		messageContent.setExecutionLog("Hoàn thành đánh lại chỉ mục toàn bộ dữ liệu!");
		messageContent.setPercentage(100);

		// Sending the data to util for MessageBus
		ReindexAllDataHandlerStatusMessageSenderUtil.sendStatusMessage(messageContent);

    	// Telling the system if, background task is successful or not
    	BackgroundTaskResult backgroundTaskResult = new BackgroundTaskResult(
				BackgroundTaskConstants.STATUS_SUCCESSFUL);
		backgroundTaskResult.setStatusMessage("Success!");
		return backgroundTaskResult;	
	}

	@Override
	public BackgroundTaskDisplay getBackgroundTaskDisplay(BackgroundTask backgroundTask) {
		return BackgroundTaskDisplayFactoryUtil.getBackgroundTaskDisplay(backgroundTask);
	}

	@Override
	public BackgroundTaskExecutor clone() {
		return this;
	}

	@Override
	public boolean isSerial() {
	    return true;
	}	
}
