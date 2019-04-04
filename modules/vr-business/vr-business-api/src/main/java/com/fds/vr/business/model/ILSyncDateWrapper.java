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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ILSyncDate}.
 * </p>
 *
 * @author LamTV
 * @see ILSyncDate
 * @generated
 */
@ProviderType
public class ILSyncDateWrapper implements ILSyncDate, ModelWrapper<ILSyncDate> {
	public ILSyncDateWrapper(ILSyncDate ilSyncDate) {
		_ilSyncDate = ilSyncDate;
	}

	@Override
	public Class<?> getModelClass() {
		return ILSyncDate.class;
	}

	@Override
	public String getModelClassName() {
		return ILSyncDate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tableName", getTableName());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tableName = (String)attributes.get("tableName");

		if (tableName != null) {
			setTableName(tableName);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public ILSyncDate toEscapedModel() {
		return new ILSyncDateWrapper(_ilSyncDate.toEscapedModel());
	}

	@Override
	public ILSyncDate toUnescapedModel() {
		return new ILSyncDateWrapper(_ilSyncDate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ilSyncDate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ilSyncDate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ilSyncDate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ilSyncDate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ILSyncDate> toCacheModel() {
		return _ilSyncDate.toCacheModel();
	}

	@Override
	public int compareTo(ILSyncDate ilSyncDate) {
		return _ilSyncDate.compareTo(ilSyncDate);
	}

	@Override
	public int hashCode() {
		return _ilSyncDate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ilSyncDate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ILSyncDateWrapper((ILSyncDate)_ilSyncDate.clone());
	}

	/**
	* Returns the table name of this il sync date.
	*
	* @return the table name of this il sync date
	*/
	@Override
	public java.lang.String getTableName() {
		return _ilSyncDate.getTableName();
	}

	@Override
	public java.lang.String toString() {
		return _ilSyncDate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ilSyncDate.toXmlString();
	}

	/**
	* Returns the sync date of this il sync date.
	*
	* @return the sync date of this il sync date
	*/
	@Override
	public Date getSyncDate() {
		return _ilSyncDate.getSyncDate();
	}

	/**
	* Returns the ID of this il sync date.
	*
	* @return the ID of this il sync date
	*/
	@Override
	public long getId() {
		return _ilSyncDate.getId();
	}

	/**
	* Returns the primary key of this il sync date.
	*
	* @return the primary key of this il sync date
	*/
	@Override
	public long getPrimaryKey() {
		return _ilSyncDate.getPrimaryKey();
	}

	@Override
	public void persist() {
		_ilSyncDate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ilSyncDate.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ilSyncDate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ilSyncDate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ilSyncDate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this il sync date.
	*
	* @param id the ID of this il sync date
	*/
	@Override
	public void setId(long id) {
		_ilSyncDate.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_ilSyncDate.setNew(n);
	}

	/**
	* Sets the primary key of this il sync date.
	*
	* @param primaryKey the primary key of this il sync date
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ilSyncDate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ilSyncDate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sync date of this il sync date.
	*
	* @param syncDate the sync date of this il sync date
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_ilSyncDate.setSyncDate(syncDate);
	}

	/**
	* Sets the table name of this il sync date.
	*
	* @param tableName the table name of this il sync date
	*/
	@Override
	public void setTableName(java.lang.String tableName) {
		_ilSyncDate.setTableName(tableName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ILSyncDateWrapper)) {
			return false;
		}

		ILSyncDateWrapper ilSyncDateWrapper = (ILSyncDateWrapper)obj;

		if (Objects.equals(_ilSyncDate, ilSyncDateWrapper._ilSyncDate)) {
			return true;
		}

		return false;
	}

	@Override
	public ILSyncDate getWrappedModel() {
		return _ilSyncDate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ilSyncDate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ilSyncDate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ilSyncDate.resetOriginalValues();
	}

	private final ILSyncDate _ilSyncDate;
}