/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRReport;
import com.fds.vr.business.model.VRReportModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VRReport service. Represents a row in the &quot;vr_report&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRReportModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRReportImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRReportImpl
 * @see VRReport
 * @see VRReportModel
 * @generated
 */
@ProviderType
public class VRReportModelImpl extends BaseModelImpl<VRReport>
	implements VRReportModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr report model instance should use the {@link VRReport} interface instead.
	 */
	public static final String TABLE_NAME = "vr_report";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "reportCode", Types.VARCHAR },
			{ "reportName", Types.VARCHAR },
			{ "formReport", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("reportCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("reportName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("formReport", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table vr_report (id LONG not null primary key,reportCode VARCHAR(75) null,reportName VARCHAR(75) null,formReport VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table vr_report";
	public static final String ORDER_BY_JPQL = " ORDER BY vrReport.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_report.id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRReport"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRReport"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.fds.vr.business.model.VRReport"),
			true);
	public static final long REPORTCODE_COLUMN_BITMASK = 1L;
	public static final long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRReport"));

	public VRReportModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VRReport.class;
	}

	@Override
	public String getModelClassName() {
		return VRReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("reportCode", getReportCode());
		attributes.put("reportName", getReportName());
		attributes.put("formReport", getFormReport());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String reportCode = (String)attributes.get("reportCode");

		if (reportCode != null) {
			setReportCode(reportCode);
		}

		String reportName = (String)attributes.get("reportName");

		if (reportName != null) {
			setReportName(reportName);
		}

		String formReport = (String)attributes.get("formReport");

		if (formReport != null) {
			setFormReport(formReport);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public String getReportCode() {
		if (_reportCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _reportCode;
		}
	}

	@Override
	public void setReportCode(String reportCode) {
		_columnBitmask |= REPORTCODE_COLUMN_BITMASK;

		if (_originalReportCode == null) {
			_originalReportCode = _reportCode;
		}

		_reportCode = reportCode;
	}

	public String getOriginalReportCode() {
		return GetterUtil.getString(_originalReportCode);
	}

	@Override
	public String getReportName() {
		if (_reportName == null) {
			return StringPool.BLANK;
		}
		else {
			return _reportName;
		}
	}

	@Override
	public void setReportName(String reportName) {
		_reportName = reportName;
	}

	@Override
	public String getFormReport() {
		if (_formReport == null) {
			return StringPool.BLANK;
		}
		else {
			return _formReport;
		}
	}

	@Override
	public void setFormReport(String formReport) {
		_formReport = formReport;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VRReport.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRReport toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRReport)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRReportImpl vrReportImpl = new VRReportImpl();

		vrReportImpl.setId(getId());
		vrReportImpl.setReportCode(getReportCode());
		vrReportImpl.setReportName(getReportName());
		vrReportImpl.setFormReport(getFormReport());

		vrReportImpl.resetOriginalValues();

		return vrReportImpl;
	}

	@Override
	public int compareTo(VRReport vrReport) {
		long primaryKey = vrReport.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRReport)) {
			return false;
		}

		VRReport vrReport = (VRReport)obj;

		long primaryKey = vrReport.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		VRReportModelImpl vrReportModelImpl = this;

		vrReportModelImpl._originalReportCode = vrReportModelImpl._reportCode;

		vrReportModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VRReport> toCacheModel() {
		VRReportCacheModel vrReportCacheModel = new VRReportCacheModel();

		vrReportCacheModel.id = getId();

		vrReportCacheModel.reportCode = getReportCode();

		String reportCode = vrReportCacheModel.reportCode;

		if ((reportCode != null) && (reportCode.length() == 0)) {
			vrReportCacheModel.reportCode = null;
		}

		vrReportCacheModel.reportName = getReportName();

		String reportName = vrReportCacheModel.reportName;

		if ((reportName != null) && (reportName.length() == 0)) {
			vrReportCacheModel.reportName = null;
		}

		vrReportCacheModel.formReport = getFormReport();

		String formReport = vrReportCacheModel.formReport;

		if ((formReport != null) && (formReport.length() == 0)) {
			vrReportCacheModel.formReport = null;
		}

		return vrReportCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", reportCode=");
		sb.append(getReportCode());
		sb.append(", reportName=");
		sb.append(getReportName());
		sb.append(", formReport=");
		sb.append(getFormReport());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRReport");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportCode</column-name><column-value><![CDATA[");
		sb.append(getReportCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportName</column-name><column-value><![CDATA[");
		sb.append(getReportName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formReport</column-name><column-value><![CDATA[");
		sb.append(getFormReport());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VRReport.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRReport.class
		};
	private long _id;
	private String _reportCode;
	private String _originalReportCode;
	private String _reportName;
	private String _formReport;
	private long _columnBitmask;
	private VRReport _escapedModel;
}