package org.opencps.thirdparty.system.rest.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueDetailModel;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueInputModel;

import com.google.gson.Gson;
import com.liferay.portal.kernel.json.JSONObject;

public class OpenCPSConverter {
	public static List<NameValuePair> convertHttpParams(MessageQueueInputModel model) {
	    List<NameValuePair> params = new ArrayList<NameValuePair>();
	    params.add(new BasicNameValuePair(MessageQueueTerm.RAW_MESSAGE, model.getRawMessage()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.CONTENT, model.getContent()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.SENDER, model.getSender()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.RECEIVER, model.getReceiver()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.PERSON_SIGNATURE, model.getPersonSignature()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.SYSTEM_SIGNATURE, model.getSystemSignature()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.STATUS, String.valueOf(model.getStatus())));
	    params.add(new BasicNameValuePair(MessageQueueTerm.VERSION, model.getVersion()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.MESSAGE_ID, model.getMessageId()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.FROM_NAME, model.getFromName()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.FROM_IDENTITY, model.getFromIdentity()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.FROM_COUNTRY_CODE, model.getFromCountryCode()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.FROM_MINISTRY_CODE, model.getFromMinistryCode()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.FROM_ORGANIZATION_CODE, model.getFromOrganizationCode()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.FROM_UNIT_CODE, model.getFromUnitCode()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.TO_NAME, model.getToName()));	    
	    params.add(new BasicNameValuePair(MessageQueueTerm.TO_IDENTITY, model.getToIdentity()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.TO_COUNTRY_CODE, model.getToCountryCode()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.TO_MINISTRY_CODE, model.getToMinistryCode()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.TO_ORGANIZATION_CODE, model.getToOrganizationCode()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.TO_UNIT_CODE, model.getToUnitCode()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.DOCUMENT_TYPE, model.getDocumentType()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.TYPE, String.valueOf(model.getType())));
	    params.add(new BasicNameValuePair(MessageQueueTerm.FUNCTION, String.valueOf(model.getFunction())));
	    params.add(new BasicNameValuePair(MessageQueueTerm.REFERENCE, model.getReference()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.DOCUMENT_YEAR, String.valueOf(model.getDocumentYear())));
	    params.add(new BasicNameValuePair(MessageQueueTerm.PRE_REFERENCE, model.getPreReference()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.SEND_DATE, model.getSendDate()));
	    params.add(new BasicNameValuePair(MessageQueueTerm.RETRY_COUNT, String.valueOf(model.getRetryCount())));
	    params.add(new BasicNameValuePair(MessageQueueTerm.DIRECTION, String.valueOf(model.getDirection())));
	    return params;
	}
	
	public static MessageQueueDetailModel convertMessageQueueDetail(JSONObject obj) {
		Gson gson = new Gson();
		
		return gson.fromJson(obj.toJSONString(), MessageQueueDetailModel.class);
	}
}
