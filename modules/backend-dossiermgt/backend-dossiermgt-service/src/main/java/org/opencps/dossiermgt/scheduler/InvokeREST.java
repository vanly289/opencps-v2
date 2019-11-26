package org.opencps.dossiermgt.scheduler;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;

public class InvokeREST {

	public JSONObject callAPI(long groupId, String httpMethod, String accept, String pathBase, String endPoint,
			String username, String password, HashMap<String, String> properties, ServiceContext serviceContext) {

		JSONObject response = JSONFactoryUtil.createJSONObject();
		
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse clientResponse = null;
		BufferedReader br = null;

		try {
			CredentialsProvider provider = new BasicCredentialsProvider();
			UsernamePasswordCredentials credentials
			 = new UsernamePasswordCredentials(username, password);
			provider.setCredentials(AuthScope.ANY, credentials);
			
			int timeout = 15;
			RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout * 1000)
					.setConnectionRequestTimeout(timeout * 1000).setSocketTimeout(timeout * 1000).build();
			
			httpClient = HttpClientBuilder.create()
					.setDefaultRequestConfig(config)
					.setDefaultCredentialsProvider(provider)
					.build();
			
//			HttpGet getRequest = new HttpGet(pathBase + endPoint);
 			
			Header groupHeader = new BasicHeader("groupId", String.valueOf(groupId));
// 			getRequest.addHeader(HttpHeaders.ACCEPT, "application/json");
// 			getRequest.addHeader(groupHeader);
 			
 			HttpUriRequest request = RequestBuilder.create(httpMethod)
 					.setUri(pathBase + endPoint)
 					.addHeader(HttpHeaders.ACCEPT, "application/json")
 					.addHeader(groupHeader)
 					.build();
 			
 			if (!properties.isEmpty()) {
				for (Map.Entry<String, String> m : properties.entrySet()) {
					request.setHeader(m.getKey().toString(), m.getValue().toString());
				}
			}
 			
 			clientResponse = httpClient.execute(request);

			/*URL url = new URL(pathBase + endPoint);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			String authString = username + ":" + password;

			String authStringEnc = new String(Base64.getEncoder().encodeToString(authString.getBytes()));
			conn.setRequestProperty("Authorization", "Basic " + authStringEnc);

			conn.setRequestMethod(httpMethod);
			conn.setRequestProperty("Accept", accept);
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestProperty("groupId", String.valueOf(groupId));

			if (!properties.isEmpty()) {
				for (Map.Entry m : properties.entrySet()) {
					conn.setRequestProperty(m.getKey().toString(), m.getValue().toString());
				}
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));*/

			/*String output;

			StringBuilder sb = new StringBuilder();

			while ((output = br.readLine()) != null) {
				sb.append(output);
			}*/
			
			if (clientResponse.getStatusLine().getStatusCode() == 200) {
				br = new BufferedReader(new InputStreamReader((clientResponse.getEntity().getContent())));
				String output = "";
				StringBuilder jsonStr = new StringBuilder();
				
				while ((output = br.readLine()) != null) {
					jsonStr.append(output);
				}
				
				response.put(RESTFulConfiguration.MESSAGE, jsonStr.toString());
			}
			
			response.put(RESTFulConfiguration.STATUS, clientResponse.getStatusLine().getStatusCode());

		} catch (Exception e) {
			response.put(RESTFulConfiguration.STATUS, HttpURLConnection.HTTP_FORBIDDEN);
			_log.error(e);
		} finally {
			if(httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					_log.error(e);
				}
			}
			
			if(clientResponse != null) {
				try {
					clientResponse.close();
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

		return response;
	}

	public JSONObject callPostAPI(long groupId, String httpMethod, String accept, String pathBase, String endPoint,
			String username, String password, HashMap<String, String> properties, Map<String, Object> params,
			ServiceContext serviceContext) {

		JSONObject response = JSONFactoryUtil.createJSONObject();

		/*HttpURLConnection conn = null;*/
		 
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse clientResponse = null;

		BufferedReader br = null;

		try {
			CredentialsProvider provider = new BasicCredentialsProvider();
			UsernamePasswordCredentials credentials
			 = new UsernamePasswordCredentials(username, password);
			provider.setCredentials(AuthScope.ANY, credentials);
			
			int timeout = 15;
			RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout * 1000)
					.setConnectionRequestTimeout(timeout * 1000).setSocketTimeout(timeout * 1000).build();
			
			httpClient = HttpClientBuilder.create()
					.setDefaultRequestConfig(config)
					.setDefaultCredentialsProvider(provider)
					.build();
			
			HttpPost clientRequest = new HttpPost(pathBase + endPoint);
 			Header groupHeader = new BasicHeader("groupId", String.valueOf(groupId));
 			clientRequest.addHeader(HttpHeaders.ACCEPT, "application/json");
 			clientRequest.addHeader(groupHeader);
 			
 			if (!properties.isEmpty()) {
				for (Map.Entry<String, String> m : properties.entrySet()) {
					clientRequest.setHeader(m.getKey().toString(), m.getValue().toString());
				}
			}
 			
			List<NameValuePair> clientParams = new ArrayList<NameValuePair>();
			
			for (Map.Entry<String, Object> param : params.entrySet()) {
				clientParams.add(new BasicNameValuePair(param.getKey(), String.valueOf(param.getValue())));
			}
			
			clientRequest.setEntity(new UrlEncodedFormEntity(clientParams, "UTF-8"));
			
			clientResponse = httpClient.execute(clientRequest);

			if (clientResponse.getStatusLine().getStatusCode() == 200) {
				br = new BufferedReader(new InputStreamReader((clientResponse.getEntity().getContent())));
				String output = "";
				StringBuilder jsonStr = new StringBuilder();
				
				while ((output = br.readLine()) != null) {
					jsonStr.append(output);
				}
				
				response.put(RESTFulConfiguration.MESSAGE, jsonStr.toString());
			}
			
			response.put(RESTFulConfiguration.STATUS, clientResponse.getStatusLine().getStatusCode());

			/*URL url = new URL(pathBase + endPoint);

			conn = (HttpURLConnection) url.openConnection();

			String authString = username + ":" + password;

			String authStringEnc = new String(Base64.getEncoder().encodeToString(authString.getBytes()));

			conn.setRequestProperty("Authorization", "Basic " + authStringEnc);

			conn.setRequestMethod(httpMethod);
			conn.setDoInput(true);
			conn.setDoOutput(true);

			conn.setRequestProperty("Accept", accept);
			conn.setRequestProperty("groupId", String.valueOf(groupId));

			if (!properties.isEmpty()) {
				for (Map.Entry m : properties.entrySet()) {
					conn.setRequestProperty(m.getKey().toString(), m.getValue().toString());
				}
			}

			StringBuilder postData = new StringBuilder();

			for (Map.Entry<String, Object> param : params.entrySet()) {
				if (postData.length() != 0)
					postData.append('&');
				postData.append(java.net.URLEncoder.encode(param.getKey(), "UTF-8"));
				postData.append('=');
				postData.append(java.net.URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
			}

			byte[] postDataBytes = postData.toString().getBytes("UTF-8");

			conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));

			conn.getOutputStream().write(postDataBytes);

			br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;

			StringBuilder sb = new StringBuilder();

			while ((output = br.readLine()) != null) {
				sb.append(output);
			}*/

			/*response.put(RESTFulConfiguration.STATUS, conn.getResponseCode());
			response.put(RESTFulConfiguration.MESSAGE, sb.toString());*/

			/*conn.disconnect();*/

		} catch (Exception e) {
			response.put(RESTFulConfiguration.STATUS, HttpURLConnection.HTTP_FORBIDDEN);
			_log.error("Can't invoke api " + pathBase + endPoint, e);
		} finally {
			/*if (conn != null) {
				conn.disconnect();
			}

			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					_log.error(e);
				}
			}*/
			
			if(httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					_log.error(e);
				}
			}
			
			if(clientResponse != null) {
				try {
					clientResponse.close();
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

		return response;
	}
	
	public JSONObject callPostFileAPI(long groupId, String httpMethod, String accept, String pathBase, String endPoint,
			String username, String password, HashMap<String, String> properties, File file,
			ServiceContext serviceContext) {
		JSONObject response = JSONFactoryUtil.createJSONObject();

		CloseableHttpClient httpClient = null;
		
		CloseableHttpResponse clientResponse = null;

		BufferedReader br = null;

		try {
			CredentialsProvider provider = new BasicCredentialsProvider();
			UsernamePasswordCredentials credentials
			 = new UsernamePasswordCredentials(username, password);
			provider.setCredentials(AuthScope.ANY, credentials);
			
			int timeout = 15;
			RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout * 1000)
					.setConnectionRequestTimeout(timeout * 1000).setSocketTimeout(timeout * 1000).build();
			
			httpClient = HttpClientBuilder.create()
					.setDefaultRequestConfig(config)
					.setDefaultCredentialsProvider(provider)
					.build();
			
			HttpPost clientRequest = new HttpPost(pathBase + endPoint);
 			Header groupHeader = new BasicHeader("groupId", String.valueOf(groupId));
 			clientRequest.addHeader(HttpHeaders.ACCEPT, "application/json");
 			clientRequest.addHeader(groupHeader);
 			
 			if (!properties.isEmpty()) {
				for (Map.Entry<String, String> m : properties.entrySet()) {
					clientRequest.setHeader(m.getKey().toString(), m.getValue().toString());
				}
			}
 			
 			MultipartEntityBuilder builder = MultipartEntityBuilder.create();
			builder.addBinaryBody("file", file);

			HttpEntity multipart = builder.build();
			clientRequest.setEntity(multipart);
			
			clientResponse = httpClient.execute(clientRequest);

			if (clientResponse.getStatusLine().getStatusCode() == 200) {
				br = new BufferedReader(new InputStreamReader((clientResponse.getEntity().getContent())));
				String output = "";
				StringBuilder jsonStr = new StringBuilder();
				
				while ((output = br.readLine()) != null) {
					jsonStr.append(output);
				}
				
				response.put(RESTFulConfiguration.MESSAGE, jsonStr.toString());
			}
			
			response.put(RESTFulConfiguration.STATUS, clientResponse.getStatusLine().getStatusCode());

		} catch (Exception e) {
			response.put(RESTFulConfiguration.STATUS, HttpURLConnection.HTTP_FORBIDDEN);
			_log.error("Can't invoke api " + pathBase + endPoint, e);
		} finally {
			
			if(httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					_log.error(e);
				}
			}
			
			if(clientResponse != null) {
				try {
					clientResponse.close();
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

		return response;
	}

	/*public JSONObject callPostFileAPI(long groupId, String httpMethod, String accept, String pathBase, String endPoint,
			String username, String password, HashMap<String, String> properties, File file,
			ServiceContext serviceContext) {

		JSONObject response = JSONFactoryUtil.createJSONObject();

		try {

			String authString = username + ":" + password;

			String authStringEnc = new String(Base64.getEncoder().encodeToString(authString.getBytes()));

			String requestURL = pathBase + endPoint;

			MultipartUtility multipart = new MultipartUtility(requestURL, "UTF-8", groupId, authStringEnc);

			multipart.addFilePart("file", file);

			if (!properties.isEmpty()) {
				for (Map.Entry m : properties.entrySet()) {
					multipart.addFormField(m.getKey().toString(), m.getValue().toString());

				}
			}

			List<String> res = multipart.finish();

			StringBuilder sb = new StringBuilder();

			for (String line : res) {
				sb.append(line);
			}

			response.put(RESTFulConfiguration.STATUS, HttpURLConnection.HTTP_OK);
			response.put(RESTFulConfiguration.MESSAGE, sb.toString());

		} catch (Exception e) {
			response.put(RESTFulConfiguration.STATUS, HttpURLConnection.HTTP_FORBIDDEN);
			response.put(RESTFulConfiguration.MESSAGE, e.getMessage());
		}

		return response;
	}*/

	private static final Log _log = LogFactoryUtil.getLog(InvokeREST.class.getName());
}
