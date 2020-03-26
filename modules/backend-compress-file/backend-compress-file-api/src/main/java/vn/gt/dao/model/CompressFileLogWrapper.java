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

package vn.gt.dao.model;

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
 * This class is a wrapper for {@link CompressFileLog}.
 * </p>
 *
 * @author huymq
 * @see CompressFileLog
 * @generated
 */
@ProviderType
public class CompressFileLogWrapper implements CompressFileLog,
	ModelWrapper<CompressFileLog> {
	public CompressFileLogWrapper(CompressFileLog compressFileLog) {
		_compressFileLog = compressFileLog;
	}

	@Override
	public Class<?> getModelClass() {
		return CompressFileLog.class;
	}

	@Override
	public String getModelClassName() {
		return CompressFileLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("createDate", getCreateDate());
		attributes.put("hoSoId", getHoSoId());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("oldSize", getOldSize());
		attributes.put("newSize", getNewSize());
		attributes.put("status", getStatus());
		attributes.put("errorMsg", getErrorMsg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long hoSoId = (Long)attributes.get("hoSoId");

		if (hoSoId != null) {
			setHoSoId(hoSoId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Long oldSize = (Long)attributes.get("oldSize");

		if (oldSize != null) {
			setOldSize(oldSize);
		}

		Long newSize = (Long)attributes.get("newSize");

		if (newSize != null) {
			setNewSize(newSize);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String errorMsg = (String)attributes.get("errorMsg");

		if (errorMsg != null) {
			setErrorMsg(errorMsg);
		}
	}

	/**
	* Returns the status of this compress file log.
	*
	* @return the status of this compress file log
	*/
	@Override
	public boolean getStatus() {
		return _compressFileLog.getStatus();
	}

	@Override
	public boolean isCachedModel() {
		return _compressFileLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _compressFileLog.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _compressFileLog.isNew();
	}

	/**
	* Returns <code>true</code> if this compress file log is status.
	*
	* @return <code>true</code> if this compress file log is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _compressFileLog.isStatus();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _compressFileLog.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gt.dao.model.CompressFileLog> toCacheModel() {
		return _compressFileLog.toCacheModel();
	}

	@Override
	public int compareTo(vn.gt.dao.model.CompressFileLog compressFileLog) {
		return _compressFileLog.compareTo(compressFileLog);
	}

	@Override
	public int hashCode() {
		return _compressFileLog.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _compressFileLog.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CompressFileLogWrapper((CompressFileLog)_compressFileLog.clone());
	}

	/**
	* Returns the error msg of this compress file log.
	*
	* @return the error msg of this compress file log
	*/
	@Override
	public java.lang.String getErrorMsg() {
		return _compressFileLog.getErrorMsg();
	}

	@Override
	public java.lang.String toString() {
		return _compressFileLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _compressFileLog.toXmlString();
	}

	/**
	* Returns the create date of this compress file log.
	*
	* @return the create date of this compress file log
	*/
	@Override
	public Date getCreateDate() {
		return _compressFileLog.getCreateDate();
	}

	/**
	* Returns the file entry ID of this compress file log.
	*
	* @return the file entry ID of this compress file log
	*/
	@Override
	public long getFileEntryId() {
		return _compressFileLog.getFileEntryId();
	}

	/**
	* Returns the ho so ID of this compress file log.
	*
	* @return the ho so ID of this compress file log
	*/
	@Override
	public long getHoSoId() {
		return _compressFileLog.getHoSoId();
	}

	/**
	* Returns the ID of this compress file log.
	*
	* @return the ID of this compress file log
	*/
	@Override
	public long getId() {
		return _compressFileLog.getId();
	}

	/**
	* Returns the new size of this compress file log.
	*
	* @return the new size of this compress file log
	*/
	@Override
	public long getNewSize() {
		return _compressFileLog.getNewSize();
	}

	/**
	* Returns the old size of this compress file log.
	*
	* @return the old size of this compress file log
	*/
	@Override
	public long getOldSize() {
		return _compressFileLog.getOldSize();
	}

	/**
	* Returns the primary key of this compress file log.
	*
	* @return the primary key of this compress file log
	*/
	@Override
	public long getPrimaryKey() {
		return _compressFileLog.getPrimaryKey();
	}

	@Override
	public vn.gt.dao.model.CompressFileLog toEscapedModel() {
		return new CompressFileLogWrapper(_compressFileLog.toEscapedModel());
	}

	@Override
	public vn.gt.dao.model.CompressFileLog toUnescapedModel() {
		return new CompressFileLogWrapper(_compressFileLog.toUnescapedModel());
	}

	@Override
	public void persist() {
		_compressFileLog.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_compressFileLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this compress file log.
	*
	* @param createDate the create date of this compress file log
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_compressFileLog.setCreateDate(createDate);
	}

	/**
	* Sets the error msg of this compress file log.
	*
	* @param errorMsg the error msg of this compress file log
	*/
	@Override
	public void setErrorMsg(java.lang.String errorMsg) {
		_compressFileLog.setErrorMsg(errorMsg);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_compressFileLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_compressFileLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_compressFileLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file entry ID of this compress file log.
	*
	* @param fileEntryId the file entry ID of this compress file log
	*/
	@Override
	public void setFileEntryId(long fileEntryId) {
		_compressFileLog.setFileEntryId(fileEntryId);
	}

	/**
	* Sets the ho so ID of this compress file log.
	*
	* @param hoSoId the ho so ID of this compress file log
	*/
	@Override
	public void setHoSoId(long hoSoId) {
		_compressFileLog.setHoSoId(hoSoId);
	}

	/**
	* Sets the ID of this compress file log.
	*
	* @param id the ID of this compress file log
	*/
	@Override
	public void setId(long id) {
		_compressFileLog.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_compressFileLog.setNew(n);
	}

	/**
	* Sets the new size of this compress file log.
	*
	* @param newSize the new size of this compress file log
	*/
	@Override
	public void setNewSize(long newSize) {
		_compressFileLog.setNewSize(newSize);
	}

	/**
	* Sets the old size of this compress file log.
	*
	* @param oldSize the old size of this compress file log
	*/
	@Override
	public void setOldSize(long oldSize) {
		_compressFileLog.setOldSize(oldSize);
	}

	/**
	* Sets the primary key of this compress file log.
	*
	* @param primaryKey the primary key of this compress file log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_compressFileLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_compressFileLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this compress file log is status.
	*
	* @param status the status of this compress file log
	*/
	@Override
	public void setStatus(boolean status) {
		_compressFileLog.setStatus(status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CompressFileLogWrapper)) {
			return false;
		}

		CompressFileLogWrapper compressFileLogWrapper = (CompressFileLogWrapper)obj;

		if (Objects.equals(_compressFileLog,
					compressFileLogWrapper._compressFileLog)) {
			return true;
		}

		return false;
	}

	@Override
	public CompressFileLog getWrappedModel() {
		return _compressFileLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _compressFileLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _compressFileLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_compressFileLog.resetOriginalValues();
	}

	private final CompressFileLog _compressFileLog;
}