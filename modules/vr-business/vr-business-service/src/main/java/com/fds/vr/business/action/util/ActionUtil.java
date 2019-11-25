package com.fds.vr.business.action.util;

import com.fds.vr.business.engine.SQLQueryInstance;
import com.fds.vr.filterconfig.model.VRCondition;
import com.fds.vr.filterconfig.service.VRConditionLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;

import org.opencps.datamgt.utils.DateTimeUtils;

/**
 * @author trungnt
 *
 */
public class ActionUtil {
	private static Log _log = LogFactoryUtil.getLog(ActionUtil.class);

	public static SQLQueryInstance createSQLQueryInstance(String sqlStatementPattern,
			LinkedHashMap<String, String> columnMap, StringBuilder conditions, LinkedHashMap<String, String> sortedby,
			Class<?> returnClassName, String className, String tableAlias, String joinStatements) {
		SQLQueryInstance instance = new SQLQueryInstance(sqlStatementPattern, columnMap, conditions, sortedby,
				returnClassName, className, tableAlias, joinStatements);
		return instance;
	}

	// create statement column name with table alias
	public static String createSCNWTAS(String columnName, String tableAlias) {
		columnName = columnName.toLowerCase();
		if (Validator.isNotNull(tableAlias)) {
			_log.info("====>>> tableAlias " + tableAlias);
			return tableAlias + "." + columnName + " AS " + tableAlias + "_" + columnName;
		} else {
			_log.info("====>>> columnName " + columnName);
			return columnName;
		}
	}

	public static String buildSQLCondition(String columnName, Object value, String condition, String searchOperator,
			String... alias) {
		String queryCondition = StringPool.BLANK;
		queryCondition += StringPool.SPACE + condition + StringPool.SPACE
				+ (alias != null && alias.length > 0
						? (Validator.isNotNull(alias[0]) ? (alias[0] + StringPool.PERIOD) : StringPool.BLANK)
						: StringPool.BLANK)
				+ columnName + StringPool.SPACE + searchOperator + StringPool.SPACE + value;

		return queryCondition;
	}

	public static JSONObject array2Json(Object[] objects, List<String> columnNames, List<String> dataTypes) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		if (objects != null && objects.length > 0 && dataTypes != null && dataTypes.size() == objects.length
				&& columnNames != null && columnNames.size() == objects.length) {
			for (int o = 0; o < objects.length; o++) {
				Object object = objects[o];
				String columnName = columnNames.get(o);
				result.put(columnName.toLowerCase(), object);
			}
		}
		return result;
	}

	public static JSONObject object2Json(Object object, Class<?> clazz, String tableAlias) throws JSONException {

		JSONObject result = JSONFactoryUtil.createJSONObject(JSONFactoryUtil.looseSerialize(object));

		LinkedHashMap<String, Integer> TABLE_COLUMNS_MAP = null;
		try {
			Field tableColumnsMapField = clazz.getField("TABLE_COLUMNS_MAP");
			TABLE_COLUMNS_MAP = (LinkedHashMap<String, Integer>) tableColumnsMapField.get(null);
		} catch (Exception e) {
			_log.error(e);
		}

		if (TABLE_COLUMNS_MAP != null) {

			for (Entry<String, Integer> entry : TABLE_COLUMNS_MAP.entrySet()) {
				String columnName = entry.getKey();
				int type = entry.getValue();
				if (result.has(columnName)) {

					Object value = result.get(columnName);

					if (type == Types.DATE || type == Types.TIME || type == Types.TIMESTAMP
							|| type == Types.TIME_WITH_TIMEZONE || type == Types.TIMESTAMP_WITH_TIMEZONE) {
						String strDate = StringPool.BLANK;
						long time = (Long) result.getLong(columnName);
						if (time > 0) {
							Calendar c = Calendar.getInstance();
							c.setTimeInMillis(time);
							Date date = c.getTime();
							strDate = DateTimeUtils.convertDateToString(date, DateTimeUtils._VN_DATE_TIME_FORMAT_HOUR);
							value = strDate;
						}
					}
					result.remove(columnName);
					result.put(columnName.toLowerCase(), value);

				}
			}
		}

		return result;
	}

	public static JSONObject mergeJSON(JSONObject object1, JSONObject object2, Class<?> clazz) {

		HashMap<String, String> fieldMap = new HashMap<String, String>();

		String object2IdMappingName = (clazz.getSimpleName().substring(0, 1).toLowerCase()
				+ clazz.getSimpleName().substring(1)).replace("ModelImpl", "") + "Id";

		Field[] fields = clazz.getDeclaredFields();

		if (fields != null) {
			for (int i = 0; i < fields.length; i++) {
				String fieldName = fields[i].getName();
				String type = fields[i].getType().getName();
				if (String.valueOf(fieldName.charAt(0)).equals("_")) {
					fieldName = fieldName.substring(1);
				}

				fieldMap.put(fieldName.toLowerCase(), type);
			}
		}

		if (object2.has(object2IdMappingName) && !object1.has(object2IdMappingName)) {
			object1.put(object2IdMappingName, object2.getLong(object2IdMappingName));
		}

		Iterator<String> keys = object2.keys();

		while (keys.hasNext()) {
			String key = keys.next();

			if (key.equals("id")) {

				long id = object2.getLong("id");

				object1.put(object2IdMappingName, id);
			}
			if (!object1.has(key) && fieldMap.containsKey(key.toLowerCase())) {
				Object value = null;
				String type = fieldMap.get(key.toLowerCase());
				if (type.equals("java.lang.String")) {
					value = object2.getString(key);
					object1.put(key, value.toString());
				} else if (type.equals("int")) {
					value = object2.getInt(key);
					object1.put(key, (Integer) value);
				} else if (type.equals("long")) {
					value = object2.getLong(key);
					object1.put(key, (Long) value);
				} else if (type.equals("double")) {
					value = object2.getDouble(key);
					object1.put(key, (Double) value);
				} else if (type.equals("boolean")) {
					value = object2.getBoolean(key);
					object1.put(key, (Boolean) value);
				} else if (type.equals("java.util.Date")) {
					value = object2.getLong(key);
					long time = (Long) value;
					String strDate = StringPool.BLANK;
					if (time > 0) {
						Calendar c = Calendar.getInstance();
						c.setTimeInMillis(time);
						Date date = c.getTime();
						strDate = DateTimeUtils.convertDateToString(date, DateTimeUtils._VN_TIME_FORMAT_HOUR);
					}

					object1.put(key, strDate);
				}
			}
		}
		return object1;
	}

	public static int getStart(LinkedHashMap<String, Object> params) {
		int start = 0;
		if (params != null) {

			if (params.containsKey("start")) {
				start = (int) params.get("start");
			}
		}
		return start;
	}

	public static int getEnd(LinkedHashMap<String, Object> params) {
		int end = 0;
		if (params != null) {
			if (params.containsKey("end")) {
				end = (int) params.get("end");
			}
		}
		return end;
	}

	public static String getKeyword(LinkedHashMap<String, Object> params) {
		String keyword = StringPool.BLANK;
		if (params != null) {
			if (params.containsKey("keyword")) {
				keyword = (String) params.get("keyword");
			}
		}
		return keyword;
	}

	public static LinkedHashMap<String, String> getOrderFiledMap(LinkedHashMap<String, Object> params,
			LinkedHashMap<String, String> statementColumnNames) {
		LinkedHashMap<String, String> orderMap = new LinkedHashMap<String, String>();
		if (params != null) {

			String order_asc = StringPool.BLANK;
			String order_desc = StringPool.BLANK;

			if (params.containsKey("order_asc")) {
				order_asc = (String) params.get("order_asc");
			}
			if (params.containsKey("order_desc")) {
				order_desc = (String) params.get("order_desc");
			}

			if ((Validator.isNotNull(order_asc) || Validator.isNotNull(order_desc))) {

				if (statementColumnNames != null && !statementColumnNames.isEmpty()) {
					HashMap<String, String> _tmp = new HashMap<String, String>();
					statementColumnNames.forEach((k, v) -> {
						k = k.trim();
						String fileld = StringPool.BLANK;
						String alias = StringPool.BLANK;
						if (k.contains(" ")) {
							alias = k.substring(k.lastIndexOf(" ") + 1, k.length());
							if (k.contains(".")) {
								fileld = k.substring(k.lastIndexOf(".") + 1, k.indexOf(" "));
							} else {
								fileld = k.substring(0, k.indexOf(" "));
							}

						} else {
							if (k.contains(".")) {
								fileld = k.substring(k.lastIndexOf(".") + 1, k.length());
							} else {
								fileld = k;
							}

							alias = fileld;
						}

						if (Validator.isNotNull(fileld) && Validator.isNotNull(alias)) {
							_tmp.put(fileld, alias);
						}

					});

					if (Validator.isNotNull(order_asc)) {
						String[] orderASC = StringUtil.split(order_asc);
						if (orderASC != null && orderASC.length > 0) {
							for (int i = 0; i < orderASC.length; i++) {
								String field = orderASC[i];
								if (_tmp.containsKey(field)) {
									orderMap.put(_tmp.get(field), "ASC");
								}
							}
						}
					}

					if (Validator.isNotNull(order_desc)) {
						String[] orderDESC = StringUtil.split(order_desc);
						if (orderDESC != null && orderDESC.length > 0) {
							for (int i = 0; i < orderDESC.length; i++) {
								String field = orderDESC[i];
								if (_tmp.containsKey(field)) {
									orderMap.put(_tmp.get(field), "DESC");
								}
							}
						}
					}
				} else {
					if (Validator.isNotNull(order_asc)) {
						String[] orderASC = StringUtil.split(order_asc);
						if (orderASC != null && orderASC.length > 0) {
							for (int i = 0; i < orderASC.length; i++) {
								String field = orderASC[i];
								orderMap.put(field, "ASC");
							}
						}
					}

					if (Validator.isNotNull(order_desc)) {
						String[] orderDESC = StringUtil.split(order_desc);
						if (orderDESC != null && orderDESC.length > 0) {
							for (int i = 0; i < orderDESC.length; i++) {
								String field = orderDESC[i];
								orderMap.put(field, "DESC");
							}
						}
					}
				}
			}
		}
		return orderMap;
	}

	public static String buildJoinCondition(String advanceSearchParams) {
		// _log.info("======advanceSearchParams====>>>>>>>>>>>>>>>>>>> " +
		// advanceSearchParams);
		StringBuilder conditions = new StringBuilder();
		List<String> joinStatements = new ArrayList<String>();
		if (Validator.isNotNull(advanceSearchParams)) {
			try {
				JSONArray params = JSONFactoryUtil.createJSONArray(advanceSearchParams);
				if (params != null) {
					for (int i = 0; i < params.length(); i++) {
						try {
							JSONObject param = params.getJSONObject(i);
							String specificationcode = param.getString("specificationcode");
							VRCondition vrCondition = VRConditionLocalServiceUtil.getVRCondition(specificationcode);
							String operator = param.getString("operator");
							String value = param.getString("value");
							String tableName = vrCondition.getFilterTableName();
							String tableField = vrCondition.getFilterTableField();

							String joinStatement = vrCondition.getSpecificationGroup();
							_log.info("===>>> specificationcode|operator|value|specificationgroup|tableName|tableField "
									+ specificationcode + "|" + "|" + operator + "|" + value + "|" + joinStatement + "|"
									+ tableName + "|" + tableField);
							if (Validator.isNull(operator) || Validator.isNull(tableField)
									|| Validator.isNull(tableName)) {
								continue;
							}

							if (operator.equalsIgnoreCase("like")) {
								conditions.append(buildSQLCondition(tableField, "'%" + value + "%'", " AND ",
										StringPool.LIKE, tableName));
							} else {
								conditions.append(
										buildSQLCondition(tableField, "'" + value + "'", " AND ", operator, tableName));
							}

							if (!joinStatements.contains(joinStatement)) {
								joinStatements.add(joinStatement);
							}
						} catch (Exception e) {
							_log.info(e.getMessage());
							continue;
						}
					}
				}
			} catch (Exception e) {
				_log.error(e);
			}
		}

		return StringUtil.merge(joinStatements, StringPool.SPACE) + StringPool.SPACE + conditions.toString();
	}

	public static JSONObject createResponseContent(int status, Object content) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("status", status);
		result.put("content", content);

		return result;
	}

	public static Object mergeObject(Object source, Object target) throws Exception {
		if (source != null && target != null) {
			Method[] methods = source.getClass().getMethods();
			if (methods != null && methods.length > 0) {
				for (Method method : methods) {
					String getMethodName = method.getName();
					if (getMethodName.startsWith("get")) {
						Class<?> dataType = method.getReturnType();
						String setMethodName = getMethodName.replace("get", "set");

						Object sourceValue = method.invoke(source);
						try {
							Method setMethod = target.getClass().getMethod(setMethodName, dataType);
							if (dataType.getName().equals(Date.class.getName())) {
								setMethod.invoke(target, sourceValue);
							} else {
								if (sourceValue != null) {
									setMethod.invoke(target, sourceValue);
								}
							}
						} catch (Exception e) {
							continue;
						}
					}
				}
			}
		}
		return target;
	}

	public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
		File destFile = new File(destinationDir, zipEntry.getName());

		String destDirPath = destinationDir.getCanonicalPath();
		String destFilePath = destFile.getCanonicalPath();

		if (!destFilePath.startsWith(destDirPath + File.separator)) {
			throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
		}

		return destFile;
	}

}
