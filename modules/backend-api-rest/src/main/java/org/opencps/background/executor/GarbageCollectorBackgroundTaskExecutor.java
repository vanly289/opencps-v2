package org.opencps.background.executor;

import java.io.Serializable;
import java.util.Map;

import org.opencps.api.controller.util.SystemUtils;
import org.opencps.background.garbagecollector.BackgroundGarbageCollector;
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
        property = {"background.task.executor.class.name=org.opencps.background.executor.GarbageCollectorBackgroundTaskExecutor"},
        service = BackgroundTaskExecutor.class
)
public class GarbageCollectorBackgroundTaskExecutor extends BaseBackgroundTaskExecutor {
	public static final Log LOGGER = LogFactoryUtil
			.getLog(GarbageCollectorBackgroundTaskExecutor.class);
	
    public GarbageCollectorBackgroundTaskExecutor() {
    	setBackgroundTaskStatusMessageTranslator(
				new GarbageCollectorBackgroundTaskStatusMessageTranslator());
    }
    
	@Override
	public BackgroundTaskResult execute(BackgroundTask backgroundTask) throws Exception {
        Map<String,Serializable> taskContextMap = backgroundTask.getTaskContextMap();

        Long siteId = (Long)taskContextMap.get("groupId") ;
        String excludeFolders = (String)taskContextMap.get("excludeFolders");
        String excludeFiles = (String)taskContextMap.get("excludeFiles");
        
        Group site = GroupLocalServiceUtil.fetchGroup(GetterUtil.getLong(siteId));
        int progress = 0;
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCompanyId(site.getCompanyId());
		
        SystemUtils.garbageCollector(siteId, 0l, excludeFolders, excludeFiles, serviceContext);
        
        BackgroundGarbageCollector messageContent = new BackgroundGarbageCollector();
		messageContent.setExecutionLog("Hoàn thành dọn sạch dữ liệu!");
		messageContent.setPercentage(100);

		// Sending the data to util for MessageBus
		GarbageCollectorDataHandlerStatusMessageSenderUtil.sendStatusMessage(messageContent);

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
