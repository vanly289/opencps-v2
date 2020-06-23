/**
 * 
 */
package dklr.application;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author ddung
 *
 */
public class VRUtil {
	
	private static Log _log = LogFactoryUtil.getLog(VRUtil.class);
	
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
