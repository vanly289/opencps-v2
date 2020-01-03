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
 * This class is a wrapper for {@link VRCorporationView}.
 * </p>
 *
 * @author LamTV
 * @see VRCorporationView
 * @generated
 */
@ProviderType
public class VRCorporationViewWrapper implements VRCorporationView,
	ModelWrapper<VRCorporationView> {
	public VRCorporationViewWrapper(VRCorporationView vrCorporationView) {
		_vrCorporationView = vrCorporationView;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCorporationView.class;
	}

	@Override
	public String getModelClassName() {
		return VRCorporationView.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("corporationName", getCorporationName());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("isLeader", getIsLeader());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Long isLeader = (Long)attributes.get("isLeader");

		if (isLeader != null) {
			setIsLeader(isLeader);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRCorporationView toEscapedModel() {
		return new VRCorporationViewWrapper(_vrCorporationView.toEscapedModel());
	}

	@Override
	public VRCorporationView toUnescapedModel() {
		return new VRCorporationViewWrapper(_vrCorporationView.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrCorporationView.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrCorporationView.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrCorporationView.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrCorporationView.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCorporationView> toCacheModel() {
		return _vrCorporationView.toCacheModel();
	}

	@Override
	public int compareTo(VRCorporationView vrCorporationView) {
		return _vrCorporationView.compareTo(vrCorporationView);
	}

	@Override
	public int hashCode() {
		return _vrCorporationView.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrCorporationView.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCorporationViewWrapper((VRCorporationView)_vrCorporationView.clone());
	}

	/**
	* Returns the corporation ID of this vr corporation view.
	*
	* @return the corporation ID of this vr corporation view
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrCorporationView.getCorporationId();
	}

	/**
	* Returns the corporation name of this vr corporation view.
	*
	* @return the corporation name of this vr corporation view
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _vrCorporationView.getCorporationName();
	}

	@Override
	public java.lang.String toString() {
		return _vrCorporationView.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrCorporationView.toXmlString();
	}

	/**
	* Returns the modify date of this vr corporation view.
	*
	* @return the modify date of this vr corporation view
	*/
	@Override
	public Date getModifyDate() {
		return _vrCorporationView.getModifyDate();
	}

	/**
	* Returns the sync date of this vr corporation view.
	*
	* @return the sync date of this vr corporation view
	*/
	@Override
	public Date getSyncDate() {
		return _vrCorporationView.getSyncDate();
	}

	/**
	* Returns the ID of this vr corporation view.
	*
	* @return the ID of this vr corporation view
	*/
	@Override
	public long getId() {
		return _vrCorporationView.getId();
	}

	/**
	* Returns the inspector ID of this vr corporation view.
	*
	* @return the inspector ID of this vr corporation view
	*/
	@Override
	public long getInspectorId() {
		return _vrCorporationView.getInspectorId();
	}

	/**
	* Returns the is leader of this vr corporation view.
	*
	* @return the is leader of this vr corporation view
	*/
	@Override
	public long getIsLeader() {
		return _vrCorporationView.getIsLeader();
	}

	/**
	* Returns the primary key of this vr corporation view.
	*
	* @return the primary key of this vr corporation view
	*/
	@Override
	public long getPrimaryKey() {
		return _vrCorporationView.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrCorporationView.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrCorporationView.setCachedModel(cachedModel);
	}

	/**
	* Sets the corporation ID of this vr corporation view.
	*
	* @param corporationId the corporation ID of this vr corporation view
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrCorporationView.setCorporationId(corporationId);
	}

	/**
	* Sets the corporation name of this vr corporation view.
	*
	* @param corporationName the corporation name of this vr corporation view
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_vrCorporationView.setCorporationName(corporationName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrCorporationView.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrCorporationView.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrCorporationView.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr corporation view.
	*
	* @param id the ID of this vr corporation view
	*/
	@Override
	public void setId(long id) {
		_vrCorporationView.setId(id);
	}

	/**
	* Sets the inspector ID of this vr corporation view.
	*
	* @param inspectorId the inspector ID of this vr corporation view
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_vrCorporationView.setInspectorId(inspectorId);
	}

	/**
	* Sets the is leader of this vr corporation view.
	*
	* @param isLeader the is leader of this vr corporation view
	*/
	@Override
	public void setIsLeader(long isLeader) {
		_vrCorporationView.setIsLeader(isLeader);
	}

	/**
	* Sets the modify date of this vr corporation view.
	*
	* @param modifyDate the modify date of this vr corporation view
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrCorporationView.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrCorporationView.setNew(n);
	}

	/**
	* Sets the primary key of this vr corporation view.
	*
	* @param primaryKey the primary key of this vr corporation view
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrCorporationView.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrCorporationView.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sync date of this vr corporation view.
	*
	* @param syncDate the sync date of this vr corporation view
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrCorporationView.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCorporationViewWrapper)) {
			return false;
		}

		VRCorporationViewWrapper vrCorporationViewWrapper = (VRCorporationViewWrapper)obj;

		if (Objects.equals(_vrCorporationView,
					vrCorporationViewWrapper._vrCorporationView)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCorporationView getWrappedModel() {
		return _vrCorporationView;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrCorporationView.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrCorporationView.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrCorporationView.resetOriginalValues();
	}

	private final VRCorporationView _vrCorporationView;
}