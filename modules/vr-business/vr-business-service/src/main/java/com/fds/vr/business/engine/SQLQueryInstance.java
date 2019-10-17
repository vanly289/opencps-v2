package com.fds.vr.business.engine;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author trungnt
 *
 */
public class SQLQueryInstance {
	private String sqlStatementPattern;
	private String sqlStatemanent;
	private String countStatemanent;
	private Class<?> returnClassName;
	private List<String> columnDataTypes;
	private List<String> columnAliasNames;
	private StringBuilder conditions = new StringBuilder();
	private String className;


	public SQLQueryInstance(String sqlStatementPattern, LinkedHashMap<String, String> columnMap,
			StringBuilder conditions, LinkedHashMap<String, String> sortedby, Class<?> returnClassName,
			String className) {

		List<String> columnDataTypes = new ArrayList<String>();
		List<String> columnAliasNames = new ArrayList<String>();
		List<String> statementColumns = new ArrayList<String>();
		if (columnMap != null) {

			columnMap.forEach((k, v) -> {
				String alias = k.substring(k.lastIndexOf(" ") + 1, k.length());
				columnAliasNames.add(alias);
				columnDataTypes.add(v);
				statementColumns.add(k);
			});
		}

		setColumnDataTypes(columnDataTypes);
		setColumnAliasNames(columnAliasNames);
		setReturnClassName(returnClassName);
		setConditions(conditions);
		setSqlStatementPattern(sqlStatementPattern);
		setClassName(className);

		String sqlStatemanent = sqlStatementPattern;

		if (conditions != null && conditions.length() > 0) {
			sqlStatemanent = sqlStatemanent.replace("[$CONDITION$]", conditions.toString());
		} else {
			sqlStatemanent = sqlStatemanent.replace("[$CONDITION$]", StringPool.BLANK);
		}

		List<String> orders = new ArrayList<String>();
		if (sortedby != null && !sortedby.isEmpty()) {

			sortedby.forEach((k, v) -> {
				orders.add(k + StringPool.SPACE + v);
			});
		}

		String countStatemanent = sqlStatemanent.replace("[$STATEMENT_COLUMN$]", "count(*) AS total");

		countStatemanent = countStatemanent.replace("[$ORDERBY$]", StringPool.BLANK);

		if (!orders.isEmpty()) {
			sqlStatemanent = sqlStatemanent.replace("[$ORDERBY$]", " ORDER BY " + StringUtil.merge(orders));
		} else {
			sqlStatemanent = sqlStatemanent.replace("[$ORDERBY$]", StringPool.BLANK);
		}

		sqlStatemanent = sqlStatemanent.replace("[$STATEMENT_COLUMN$]", StringUtil.merge(statementColumns));

		this.setSqlStatemanent(sqlStatemanent);
		this.setCountStatemanent(countStatemanent);
	}

	public String getSqlStatemanent() {
		return sqlStatemanent;
	}

	public void setSqlStatemanent(String sqlStatemanent) {
		this.sqlStatemanent = sqlStatemanent;
	}

	public Class<?> getReturnClassName() {
		return returnClassName;
	}

	public void setReturnClassName(Class<?> returnClassName) {
		this.returnClassName = returnClassName;
	}

	public List<String> getColumnDataTypes() {
		return columnDataTypes;
	}

	public void setColumnDataTypes(List<String> columnDataTypes) {
		this.columnDataTypes = columnDataTypes;
	}

	public List<String> getColumnAliasNames() {
		return columnAliasNames;
	}

	public void setColumnAliasNames(List<String> columnAliasNames) {
		this.columnAliasNames = columnAliasNames;
	}

	public StringBuilder getConditions() {
		return conditions;
	}

	public void setConditions(StringBuilder conditions) {
		this.conditions = conditions;
	}

	public String getSqlStatementPattern() {
		return sqlStatementPattern;
	}

	public void setSqlStatementPattern(String sqlStatementPattern) {
		this.sqlStatementPattern = sqlStatementPattern;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCountStatemanent() {
		return countStatemanent;
	}

	public void setCountStatemanent(String countStatemanent) {
		this.countStatemanent = countStatemanent;
	}

}
