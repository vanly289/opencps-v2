/**
 * 
 */
package com.fds.vr.service.util;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.lang.reflect.Field;
import java.sql.Types;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import org.opencps.datamgt.utils.DateTimeUtils;

/**
 * @author ddung
 *
 */
public class BusinessUtil {

	private static final Log _log = LogFactoryUtil.getLog(BusinessUtil.class);

	public static JSONObject object2Json_originColumnName(Object object, Class<?> clazz, String tableAlias)
			throws JSONException {

		JSONObject jObject = JSONFactoryUtil.createJSONObject(JSONFactoryUtil.looseSerialize(object));
		JSONObject result = JSONFactoryUtil.createJSONObject();
		HashMap<String, Integer> TABLE_COLUMNS_MAP = null;
		try {
			Field tableColumnsMapField = clazz.getField("TABLE_COLUMNS_MAP");
			TABLE_COLUMNS_MAP = (HashMap<String, Integer>) tableColumnsMapField.get(null);
		} catch (Exception e) {
			_log.error(e);
		}

		if (TABLE_COLUMNS_MAP != null) {

			for (Entry<String, Integer> entry : TABLE_COLUMNS_MAP.entrySet()) {
				String columnName = entry.getKey();
				int type = entry.getValue();
				if (jObject.has(columnName)) {

					Object value = jObject.get(columnName);

					if (type == Types.DATE || type == Types.TIME || type == Types.TIMESTAMP
							|| type == Types.TIME_WITH_TIMEZONE || type == Types.TIMESTAMP_WITH_TIMEZONE) {
						String strDate = StringPool.BLANK;
						long time = (Long) jObject.getLong(columnName);
						if (time > 0) {
							Calendar c = Calendar.getInstance();
							c.setTimeInMillis(time);
							Date date = c.getTime();
							strDate = DateTimeUtils.convertDateToString(date, DateTimeUtils._VN_DATE_TIME_FORMAT_HOUR);
							value = strDate;
						}
					}
					result.put(columnName, value);
				}
			}
		}

		return result;
	}

	// Don't convert type date
	public static JSONObject object2Json_originValue(Object object, Class<?> clazz, String tableAlias)
			throws JSONException {

		JSONObject jObject = JSONFactoryUtil.createJSONObject(JSONFactoryUtil.looseSerialize(object));
		JSONObject result = JSONFactoryUtil.createJSONObject();

		HashMap<String, Integer> TABLE_COLUMNS_MAP = null;
		try {
			Field tableColumnsMapField = clazz.getField("TABLE_COLUMNS_MAP");
			TABLE_COLUMNS_MAP = (HashMap<String, Integer>) tableColumnsMapField.get(null);
		} catch (Exception e) {
			_log.error(e);
		}

		if (TABLE_COLUMNS_MAP != null) {

			for (Entry<String, Integer> entry : TABLE_COLUMNS_MAP.entrySet()) {
				String columnName = entry.getKey();
				if (jObject.has(columnName)) {
					Object value = jObject.get(columnName);
					result.put(columnName, value);
				}
			}
		}

		return result;
	}
}
