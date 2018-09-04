package org.opencps.background.executor;

import org.opencps.background.garbagecollector.BackgroundGarbageCollector;

import com.liferay.portal.kernel.backgroundtask.BackgroundTaskThreadLocal;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;

public class GarbageCollectorDataHandlerStatusMessageSenderUtil {
	public static void sendStatusMessage(BackgroundGarbageCollector messageContent) {
		// Leave if no background task
		if (!BackgroundTaskThreadLocal.hasBackgroundTask()) {
			return;
		}

		// Message Creation
		Message message = createMessage(messageContent);

		// Send message to message bus
		MessageBusUtil.sendMessage(DestinationNames.BACKGROUND_TASK_STATUS,
				message);
	}

	protected static Message createMessage(BackgroundGarbageCollector messageContent) {

		Message message = new Message();
		message.put("backgroundTaskId",
				BackgroundTaskThreadLocal.getBackgroundTaskId());
		
		message.put("percentage", messageContent.getPercentage());
		message.put("executionLog", messageContent.getExecutionLog());

		return message;
	}
}
