package com.fds.vr.util;

import org.opencps.thirdparty.system.model.ILDoanhNghiep;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class ILDoanhNghiepUtils {
	public static JSONObject convertToJSON(ILDoanhNghiep dn) {
		JSONObject obj = JSONFactoryUtil.createJSONObject();
		obj.put("ten", dn.getTen());
		obj.put("ten_viettat", dn.getTen_viettat());
		return obj;
	}
}
