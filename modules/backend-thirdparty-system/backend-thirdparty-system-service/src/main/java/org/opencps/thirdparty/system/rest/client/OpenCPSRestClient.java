package org.opencps.thirdparty.system.rest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueDetailModel;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueInputModel;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class OpenCPSRestClient {
	private static final String MESSAGE_QUEUE_BASE_PATH = "/messagequeues";

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	private String baseUrl;

	public OpenCPSRestClient(String baseUrl) {
		if (baseUrl.charAt(baseUrl.length() - 1) == '/' && baseUrl.length() >= 2) {
			this.baseUrl = baseUrl.substring(0, baseUrl.length() - 2);
		} else {
			this.baseUrl = baseUrl;
		}
	}

	public MessageQueueDetailModel postMessageQueue(MessageQueueInputModel model) {
		MessageQueueDetailModel result = null;
		
		CloseableHttpClient httpClient = null;
		BufferedReader br = null;
		
		_log.info("===postMessageQueue===" + model.getMessageId());

		try {

			int timeout = 30;
			RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout * 1000)
					.setConnectionRequestTimeout(timeout * 1000).setSocketTimeout(timeout * 1000).build();

			httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
//			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			List<NameValuePair> params = OpenCPSConverter.convertHttpParams(model);

			HttpPost postRequest = new HttpPost(baseUrl + MESSAGE_QUEUE_BASE_PATH);
			postRequest.setHeader("Accept", "application/json");

			postRequest.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

//			System.out.println("Params: " + params.toString());
			CloseableHttpResponse httpresponse = httpClient.execute(postRequest);
			
			_log.info("===postMessageQueue===" + model.getMessageId() + "=" + httpresponse.getStatusLine().getStatusCode());
			
			if (httpresponse.getStatusLine().getStatusCode() == 200) {
				br = new BufferedReader(new InputStreamReader((httpresponse.getEntity().getContent())));
				String output = "";

				StringBuilder jsonString = new StringBuilder();

				while ((output = br.readLine()) != null) {
					jsonString.append(output);
				}

				JSONObject jsonObj = JSONFactoryUtil.createJSONObject(jsonString.toString());

				result = OpenCPSConverter.convertMessageQueueDetail(jsonObj);
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			
			if(httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					_log.error(e);
				}
			}
			
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					_log.error(e);
				}
			}
		}
		
		return result;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(OpenCPSConverter.class);
}
