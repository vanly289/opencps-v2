package com.fds.vr.business.engine;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.lang.reflect.Field;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author trungnt
 *
 */
public class SQLQueryBuilder {

	private String selectQuery;
	private String countQuery;
	private String from;
	private List<String> columnNames = new ArrayList<String>();
	private List<String> columnInstances = new ArrayList<String>();
	private List<String> conditions = new ArrayList<String>();
	private List<String> joins = new ArrayList<String>();
	private List<String> joinConditions = new ArrayList<String>();
	private List<String> dataTypes = new ArrayList<String>();

	public SQLQueryBuilder build() {
		String query = getFrom();
		if (!getJoins().isEmpty()) {
			query += StringPool.SPACE + StringUtil.merge(getJoins(), StringPool.SPACE);
		}

		if (!getJoinConditions().isEmpty()) {
			query += StringPool.SPACE + StringUtil.merge(getJoinConditions(), StringPool.SPACE);
		}

		if (!getConditions().isEmpty()) {
			query += " WHERE 1 = 1 " + StringUtil.merge(getConditions(), StringPool.SPACE);
		}

		this.setSelectQuery(getSelect() + StringPool.SPACE + query);

		this.setCountQuery("SELECT count(*) AS total " + query);

		return this;
	}

	public SQLQueryBuilder select(String... columns) {
		if (columns != null && columns.length > 0) {
			this.setColumnNames(ListUtil.toList(columns));
			this.setColumnInstances(ListUtil.toList(columns));
		}

		return this;
	}

	public SQLQueryBuilder select(String alias, String... columns) {
		if (columns != null && columns.length > 0) {
			if (Validator.isNotNull(alias)) {

				List<String> _tmp = new ArrayList<String>();
				List<String> _tmpAlias = new ArrayList<String>();
				for (String column : columns) {
					_tmp.add(column + " AS " + alias);
					_tmpAlias.add(alias);
				}

				this.setColumnNames(_tmp);
				this.setColumnInstances(_tmpAlias);

			} else {
				this.setColumnNames(ListUtil.toList(columns));
				this.setColumnInstances(ListUtil.toList(columns));
			}
		}

		return this;
	}

	public SQLQueryBuilder select(Class<?>... clazzs) {
		if (clazzs != null && clazzs.length >= 0) {
			for (int i = 0; i < clazzs.length; i++) {
				HashMap<String, Integer> TABLE_COLUMNS_MAP = null;
				try {
					Field tableColumnsMapField = clazzs[i].getField("TABLE_COLUMNS_MAP");
					TABLE_COLUMNS_MAP = (HashMap<String, Integer>) tableColumnsMapField.get(null);
				} catch (Exception e) {
					_log.error(e);
				}

				if (TABLE_COLUMNS_MAP != null) {
					List<String> _tmp = new ArrayList<String>();

					for (Entry<String, Integer> entry : TABLE_COLUMNS_MAP.entrySet()) {
						String columnName = entry.getKey();
						int type = entry.getValue();
						_tmp.add(columnName);
						this.setDataTypes(type);
					}

					this.setColumnInstances(_tmp);
					this.setColumnNames(_tmp);
				}
			}
		}
		return this;
	}

	public SQLQueryBuilder select(String alias, Class<?>... clazzs) {

		if (Validator.isNull(alias)) {
			return select(clazzs);
		} else {
			if (clazzs != null && clazzs.length >= 0) {
				for (int i = 0; i < clazzs.length; i++) {
					HashMap<String, Integer> TABLE_COLUMNS_MAP = null;
					try {
						Field tableColumnsMapField = clazzs[i].getField("TABLE_COLUMNS_MAP");
						TABLE_COLUMNS_MAP = (HashMap<String, Integer>) tableColumnsMapField.get(null);
					} catch (Exception e) {
						_log.error(e);
					}

					if (TABLE_COLUMNS_MAP != null) {
						List<String> _tmp = new ArrayList<String>();
						List<String> _tmpAlias = new ArrayList<String>();

						for (Entry<String, Integer> entry : TABLE_COLUMNS_MAP.entrySet()) {
							String columnName = entry.getKey();
							int type = entry.getValue();
							_tmp.add(columnName + " AS " + alias);
							this.setDataTypes(type);
							_tmpAlias.add(alias);
						}

						this.setColumnNames(_tmp);
						this.setColumnInstances(_tmpAlias);
					}
				}
			}
			return this;
		}

	}

	public SQLQueryBuilder selectAll() {
		return this;
	}

	public SQLQueryBuilder from(String table) {
		this.setFrom("FROM " + table);
		return this;
	}

	public SQLQueryBuilder from(String table, String alias) {
		this.setFrom("FROM " + table + (Validator.isNotNull(alias) ? " AS " + alias : StringPool.BLANK));
		return this;
	}

	public SQLQueryBuilder join(String joinType, String left, String leftcolName, String right, String rightcolName) {
		String join = joinType + " ON " + left + "." + leftcolName + " = " + right + "." + rightcolName;
		this.setJoins(join);
		return this;
	}

	public SQLQueryBuilder joinwhere(String column, Object value, String condition, String searchOperator) {
		String joincondition = condition(column, value, condition, searchOperator);
		this.setJoinConditions(joincondition);
		return this;
	}

	public SQLQueryBuilder joinwhere(String column, Object value, String condition, String searchOperator,
			boolean parenthesis, String... alias) {
		String joincondition = condition(column, value, condition, searchOperator, parenthesis, alias);
		this.setJoinConditions(joincondition);
		return this;
	}

	public SQLQueryBuilder where(String column, Object value, String condition, String searchOperator) {

		String queryCondition = condition(column, value, condition, searchOperator);

		if (queryCondition != null) {
			this.setConditions(queryCondition);
		}

		return this;
	}

	public SQLQueryBuilder where(String column, Object value, String condition, String searchOperator,
			boolean parenthesis, String... alias) {

		String queryCondition = condition(column, value, condition, searchOperator, parenthesis, alias);
		if (queryCondition != null) {
			this.setConditions(queryCondition);
		}

		return this;
	}

	public String condition(String column, Object value, String condition, String searchOperator) {

		String queryCondition = StringPool.BLANK;

		if (value != null) {

			queryCondition += StringPool.SPACE + condition + StringPool.SPACE

					+ column + StringPool.SPACE + searchOperator + StringPool.SPACE;
			if (Validator.isNotNull(searchOperator)) {
				if (searchOperator.equals(StringPool.LIKE)) {
					queryCondition += "'%" + value + "%'";
				} else {
					if (value instanceof String) {
						queryCondition += "'" + value + "'";
					} else {
						queryCondition += value;
					}
				}

			}
		}

		return queryCondition;
	}

	public String condition(String column, Object value, String condition, String searchOperator, boolean parenthesis,
			String... alias) {

		String queryCondition = StringPool.BLANK;
		if (value != null) {

			queryCondition += StringPool.SPACE + condition + StringPool.SPACE + (parenthesis ? "(" : StringPool.BLANK)
					+ (alias != null && alias.length > 0
							? (Validator.isNotNull(alias[0]) ? (alias[0] + StringPool.PERIOD) : StringPool.BLANK)
							: StringPool.BLANK)
					+ column + StringPool.SPACE + searchOperator + StringPool.SPACE;

			if (Validator.isNotNull(searchOperator)) {
				if (searchOperator.equals(StringPool.LIKE)) {
					queryCondition += "'%" + value + "%'";
				} else {
					if (value instanceof String) {
						queryCondition += "'" + value + "'";
					} else {
						queryCondition += value;
					}
				}

			}
			if (parenthesis) {
				queryCondition += ")";
			}

		}

		return queryCondition;
	}

	public String getSelect() {
		return "SELECT " + (columnNames.isEmpty() ? "*" : StringUtil.merge(columnNames));
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public List<String> getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(List<String> columnNames) {
		this.columnNames.addAll(columnNames);
	}

	public List<String> getConditions() {
		return conditions;
	}

	public void setConditions(String condition) {
		this.conditions.add(condition);
	}

	public List<String> getJoins() {
		return joins;
	}

	public void setJoins(String join) {
		this.joins.add(join);
	}

	public List<String> getJoinConditions() {
		return joinConditions;
	}

	public void setJoinConditions(String joinCondition) {
		this.joinConditions.add(joinCondition);
	}

	public String getSelectQuery() {
		return selectQuery;
	}

	public void setSelectQuery(String selectQuery) {
		this.selectQuery = selectQuery;
	}

	public String getCountQuery() {
		return countQuery;
	}

	public void setCountQuery(String countQuery) {
		this.countQuery = countQuery;
	}

	public List<String> getColumnInstances() {
		return columnInstances;
	}

	public void setColumnInstances(List<String> columnInstances) {
		this.columnInstances = columnInstances;
	}

	public List<String> getDataTypes() {

		return dataTypes;
	}

	public void setDataTypes(List<String> dataTypes) {
		this.dataTypes = dataTypes;
	}

	public void setDataTypes(int type) {
		if (type == Types.VARCHAR || type == Types.LONGNVARCHAR || type == Types.NVARCHAR) {
			this.dataTypes.add(String.class.getName());
		} else if (type == Types.BIGINT) {
			this.dataTypes.add(long.class.getName());
		} else if (type == Types.INTEGER || type == Types.SMALLINT || type == Types.TINYINT) {
			this.dataTypes.add(int.class.getName());
		} else if (type == Types.DOUBLE) {
			this.dataTypes.add(double.class.getName());
		} else if (type == Types.FLOAT) {
			this.dataTypes.add(float.class.getName());
		} else if (type == Types.BOOLEAN) {
			this.dataTypes.add(boolean.class.getName());
		} else if (type == Types.DATE || type == Types.TIME || type == Types.TIMESTAMP
				|| type == Types.TIME_WITH_TIMEZONE || type == Types.TIMESTAMP_WITH_TIMEZONE) {
			this.dataTypes.add(Date.class.getName());
		}
	}

	private Log _log = LogFactoryUtil.getLog(SQLQueryBuilder.class);
}
