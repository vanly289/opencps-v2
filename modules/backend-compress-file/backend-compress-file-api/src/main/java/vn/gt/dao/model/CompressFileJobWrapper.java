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
 * This class is a wrapper for {@link CompressFileJob}.
 * </p>
 *
 * @author huymq
 * @see CompressFileJob
 * @generated
 */
@ProviderType
public class CompressFileJobWrapper implements CompressFileJob,
	ModelWrapper<CompressFileJob> {
	public CompressFileJobWrapper(CompressFileJob compressFileJob) {
		_compressFileJob = compressFileJob;
	}

	@Override
	public Class<?> getModelClass() {
		return CompressFileJob.class;
	}

	@Override
	public String getModelClassName() {
		return CompressFileJob.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("listHoSoId", getListHoSoId());
		attributes.put("lastedHoSoId", getLastedHoSoId());
		attributes.put("status", getStatus());

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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String listHoSoId = (String)attributes.get("listHoSoId");

		if (listHoSoId != null) {
			setListHoSoId(listHoSoId);
		}

		Long lastedHoSoId = (Long)attributes.get("lastedHoSoId");

		if (lastedHoSoId != null) {
			setLastedHoSoId(lastedHoSoId);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the status of this compress file job.
	*
	* @return the status of this compress file job
	*/
	@Override
	public boolean getStatus() {
		return _compressFileJob.getStatus();
	}

	@Override
	public boolean isCachedModel() {
		return _compressFileJob.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _compressFileJob.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _compressFileJob.isNew();
	}

	/**
	* Returns <code>true</code> if this compress file job is status.
	*
	* @return <code>true</code> if this compress file job is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _compressFileJob.isStatus();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _compressFileJob.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gt.dao.model.CompressFileJob> toCacheModel() {
		return _compressFileJob.toCacheModel();
	}

	@Override
	public int compareTo(vn.gt.dao.model.CompressFileJob compressFileJob) {
		return _compressFileJob.compareTo(compressFileJob);
	}

	@Override
	public int hashCode() {
		return _compressFileJob.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _compressFileJob.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CompressFileJobWrapper((CompressFileJob)_compressFileJob.clone());
	}

	/**
	* Returns the list ho so ID of this compress file job.
	*
	* @return the list ho so ID of this compress file job
	*/
	@Override
	public java.lang.String getListHoSoId() {
		return _compressFileJob.getListHoSoId();
	}

	@Override
	public java.lang.String toString() {
		return _compressFileJob.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _compressFileJob.toXmlString();
	}

	/**
	* Returns the create date of this compress file job.
	*
	* @return the create date of this compress file job
	*/
	@Override
	public Date getCreateDate() {
		return _compressFileJob.getCreateDate();
	}

	/**
	* Returns the modified date of this compress file job.
	*
	* @return the modified date of this compress file job
	*/
	@Override
	public Date getModifiedDate() {
		return _compressFileJob.getModifiedDate();
	}

	/**
	* Returns the ID of this compress file job.
	*
	* @return the ID of this compress file job
	*/
	@Override
	public long getId() {
		return _compressFileJob.getId();
	}

	/**
	* Returns the lasted ho so ID of this compress file job.
	*
	* @return the lasted ho so ID of this compress file job
	*/
	@Override
	public long getLastedHoSoId() {
		return _compressFileJob.getLastedHoSoId();
	}

	/**
	* Returns the primary key of this compress file job.
	*
	* @return the primary key of this compress file job
	*/
	@Override
	public long getPrimaryKey() {
		return _compressFileJob.getPrimaryKey();
	}

	@Override
	public vn.gt.dao.model.CompressFileJob toEscapedModel() {
		return new CompressFileJobWrapper(_compressFileJob.toEscapedModel());
	}

	@Override
	public vn.gt.dao.model.CompressFileJob toUnescapedModel() {
		return new CompressFileJobWrapper(_compressFileJob.toUnescapedModel());
	}

	@Override
	public void persist() {
		_compressFileJob.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_compressFileJob.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this compress file job.
	*
	* @param createDate the create date of this compress file job
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_compressFileJob.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_compressFileJob.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_compressFileJob.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_compressFileJob.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this compress file job.
	*
	* @param id the ID of this compress file job
	*/
	@Override
	public void setId(long id) {
		_compressFileJob.setId(id);
	}

	/**
	* Sets the lasted ho so ID of this compress file job.
	*
	* @param lastedHoSoId the lasted ho so ID of this compress file job
	*/
	@Override
	public void setLastedHoSoId(long lastedHoSoId) {
		_compressFileJob.setLastedHoSoId(lastedHoSoId);
	}

	/**
	* Sets the list ho so ID of this compress file job.
	*
	* @param listHoSoId the list ho so ID of this compress file job
	*/
	@Override
	public void setListHoSoId(java.lang.String listHoSoId) {
		_compressFileJob.setListHoSoId(listHoSoId);
	}

	/**
	* Sets the modified date of this compress file job.
	*
	* @param modifiedDate the modified date of this compress file job
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_compressFileJob.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_compressFileJob.setNew(n);
	}

	/**
	* Sets the primary key of this compress file job.
	*
	* @param primaryKey the primary key of this compress file job
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_compressFileJob.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_compressFileJob.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this compress file job is status.
	*
	* @param status the status of this compress file job
	*/
	@Override
	public void setStatus(boolean status) {
		_compressFileJob.setStatus(status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CompressFileJobWrapper)) {
			return false;
		}

		CompressFileJobWrapper compressFileJobWrapper = (CompressFileJobWrapper)obj;

		if (Objects.equals(_compressFileJob,
					compressFileJobWrapper._compressFileJob)) {
			return true;
		}

		return false;
	}

	@Override
	public CompressFileJob getWrappedModel() {
		return _compressFileJob;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _compressFileJob.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _compressFileJob.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_compressFileJob.resetOriginalValues();
	}

	private final CompressFileJob _compressFileJob;
}