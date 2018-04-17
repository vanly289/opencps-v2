package org.opencps.thirdparty.system.rest.client;

import com.liferay.portal.kernel.util.PrefsPropsUtil;

public class PrefsProperties {
	public static final String JAXRS_URL = "opencps.gateway.jaxrs.url";	
		
	public static String getJaxRsUrl() {
		return PrefsPropsUtil.getString(PrefsProperties.JAXRS_URL);								
	}
}