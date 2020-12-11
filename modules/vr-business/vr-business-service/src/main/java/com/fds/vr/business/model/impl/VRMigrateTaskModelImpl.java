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

import com.fds.vr.business.model.VRMigrateTask;
import com.fds.vr.business.model.VRMigrateTaskModel;

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
 * The base model implementation for the VRMigrateTask service. Represents a row in the &quot;vr_migrate_task&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRMigrateTaskModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRMigrateTaskImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRMigrateTaskImpl
 * @see VRMigrateTask
 * @see VRMigrateTaskModel
 * @generated
 */
@ProviderType
public class VRMigrateTaskModelImpl extends BaseModelImpl<VRMigrateTask>
	implements VRMigrateTaskModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr migrate task model instance should use the {@link VRMigrateTask} interface instead.
	 */
	public static final String TABLE_NAME = "vr_migrate_task";
	public static final Object[][] TABLE_COLUMNS = {
			{ "task_id", Types.BIGINT },
			{ "task_name", Types.VARCHAR },
			{ "taskMigrationID", Types.INTEGER },
			{ "source_config", Types.VARCHAR },
			{ "target_config", Types.VARCHAR },
			{ "remarks", Types.VARCHAR },
			{ "status", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("task_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("task_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("taskMigrationID", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("source_config", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("target_config", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("remarks", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table vr_migrate_task (task_id LONG not null primary key,task_name VARCHAR(75) null,taskMigrationID INTEGER,source_config VARCHAR(75) null,target_config VARCHAR(75) null,remarks VARCHAR(75) null,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table vr_migrate_task";
	public static final String ORDER_BY_JPQL = " ORDER BY vrMigrateTask.task_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_migrate_task.task_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRMigrateTask"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRMigrateTask"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRMigrateTask"));

	public VRMigrateTaskModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _task_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTask_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _task_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VRMigrateTask.class;
	}

	@Override
	public String getModelClassName() {
		return VRMigrateTask.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("task_id", getTask_id());
		attributes.put("task_name", getTask_name());
		attributes.put("taskMigrationID", getTaskMigrationID());
		attributes.put("source_config", getSource_config());
		attributes.put("target_config", getTarget_config());
		attributes.put("remarks", getRemarks());
		attributes.put("status", getStatus());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long task_id = (Long)attributes.get("task_id");

		if (task_id != null) {
			setTask_id(task_id);
		}

		String task_name = (String)attributes.get("task_name");

		if (task_name != null) {
			setTask_name(task_name);
		}

		Integer taskMigrationID = (Integer)attributes.get("taskMigrationID");

		if (taskMigrationID != null) {
			setTaskMigrationID(taskMigrationID);
		}

		String source_config = (String)attributes.get("source_config");

		if (source_config != null) {
			setSource_config(source_config);
		}

		String target_config = (String)attributes.get("target_config");

		if (target_config != null) {
			setTarget_config(target_config);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getTask_id() {
		return _task_id;
	}

	@Override
	public void setTask_id(long task_id) {
		_task_id = task_id;
	}

	@Override
	public String getTask_name() {
		if (_task_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _task_name;
		}
	}

	@Override
	public void setTask_name(String task_name) {
		_task_name = task_name;
	}

	@Override
	public int getTaskMigrationID() {
		return _taskMigrationID;
	}

	@Override
	public void setTaskMigrationID(int taskMigrationID) {
		_taskMigrationID = taskMigrationID;
	}

	@Override
	public String getSource_config() {
		if (_source_config == null) {
			return StringPool.BLANK;
		}
		else {
			return _source_config;
		}
	}

	@Override
	public void setSource_config(String source_config) {
		_source_config = source_config;
	}

	@Override
	public String getTarget_config() {
		if (_target_config == null) {
			return StringPool.BLANK;
		}
		else {
			return _target_config;
		}
	}

	@Override
	public void setTarget_config(String target_config) {
		_target_config = target_config;
	}

	@Override
	public String getRemarks() {
		if (_remarks == null) {
			return StringPool.BLANK;
		}
		else {
			return _remarks;
		}
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VRMigrateTask.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRMigrateTask toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRMigrateTask)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRMigrateTaskImpl vrMigrateTaskImpl = new VRMigrateTaskImpl();

		vrMigrateTaskImpl.setTask_id(getTask_id());
		vrMigrateTaskImpl.setTask_name(getTask_name());
		vrMigrateTaskImpl.setTaskMigrationID(getTaskMigrationID());
		vrMigrateTaskImpl.setSource_config(getSource_config());
		vrMigrateTaskImpl.setTarget_config(getTarget_config());
		vrMigrateTaskImpl.setRemarks(getRemarks());
		vrMigrateTaskImpl.setStatus(getStatus());

		vrMigrateTaskImpl.resetOriginalValues();

		return vrMigrateTaskImpl;
	}

	@Override
	public int compareTo(VRMigrateTask vrMigrateTask) {
		long primaryKey = vrMigrateTask.getPrimaryKey();

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

		if (!(obj instanceof VRMigrateTask)) {
			return false;
		}

		VRMigrateTask vrMigrateTask = (VRMigrateTask)obj;

		long primaryKey = vrMigrateTask.getPrimaryKey();

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
	}

	@Override
	public CacheModel<VRMigrateTask> toCacheModel() {
		VRMigrateTaskCacheModel vrMigrateTaskCacheModel = new VRMigrateTaskCacheModel();

		vrMigrateTaskCacheModel.task_id = getTask_id();

		vrMigrateTaskCacheModel.task_name = getTask_name();

		String task_name = vrMigrateTaskCacheModel.task_name;

		if ((task_name != null) && (task_name.length() == 0)) {
			vrMigrateTaskCacheModel.task_name = null;
		}

		vrMigrateTaskCacheModel.taskMigrationID = getTaskMigrationID();

		vrMigrateTaskCacheModel.source_config = getSource_config();

		String source_config = vrMigrateTaskCacheModel.source_config;

		if ((source_config != null) && (source_config.length() == 0)) {
			vrMigrateTaskCacheModel.source_config = null;
		}

		vrMigrateTaskCacheModel.target_config = getTarget_config();

		String target_config = vrMigrateTaskCacheModel.target_config;

		if ((target_config != null) && (target_config.length() == 0)) {
			vrMigrateTaskCacheModel.target_config = null;
		}

		vrMigrateTaskCacheModel.remarks = getRemarks();

		String remarks = vrMigrateTaskCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			vrMigrateTaskCacheModel.remarks = null;
		}

		vrMigrateTaskCacheModel.status = getStatus();

		return vrMigrateTaskCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{task_id=");
		sb.append(getTask_id());
		sb.append(", task_name=");
		sb.append(getTask_name());
		sb.append(", taskMigrationID=");
		sb.append(getTaskMigrationID());
		sb.append(", source_config=");
		sb.append(getSource_config());
		sb.append(", target_config=");
		sb.append(getTarget_config());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRMigrateTask");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>task_id</column-name><column-value><![CDATA[");
		sb.append(getTask_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>task_name</column-name><column-value><![CDATA[");
		sb.append(getTask_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskMigrationID</column-name><column-value><![CDATA[");
		sb.append(getTaskMigrationID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>source_config</column-name><column-value><![CDATA[");
		sb.append(getSource_config());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>target_config</column-name><column-value><![CDATA[");
		sb.append(getTarget_config());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VRMigrateTask.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRMigrateTask.class
		};
	private long _task_id;
	private String _task_name;
	private int _taskMigrationID;
	private String _source_config;
	private String _target_config;
	private String _remarks;
	private int _status;
	private VRMigrateTask _escapedModel;
}