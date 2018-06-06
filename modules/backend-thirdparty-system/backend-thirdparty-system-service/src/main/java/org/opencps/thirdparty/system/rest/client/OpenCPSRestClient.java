package org.opencps.thirdparty.system.rest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueDetailModel;
import org.opencps.thirdparty.system.messagequeue.model.MessageQueueInputModel;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

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

		try {

			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			List<NameValuePair> params = OpenCPSConverter.convertHttpParams(model);

			HttpPost postRequest = new HttpPost(baseUrl + MESSAGE_QUEUE_BASE_PATH);
			postRequest.setHeader("Accept", "application/json");

			postRequest.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

//			System.out.println("Params: " + params.toString());
			CloseableHttpResponse httpresponse = httpClient.execute(postRequest);
			
			if (httpresponse.getStatusLine().getStatusCode() >= 401) {
				return result;
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((httpresponse.getEntity().getContent())));
			String output = "";

			StringBuilder jsonString = new StringBuilder();

			while ((output = br.readLine()) != null) {
				jsonString.append(output);
			}

			JSONObject jsonObj = JSONFactoryUtil.createJSONObject(jsonString.toString());

			result = OpenCPSConverter.convertMessageQueueDetail(jsonObj);

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
}
