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
 * This class is a wrapper for {@link VRCorporationInspector}.
 * </p>
 *
 * @author LamTV
 * @see VRCorporationInspector
 * @generated
 */
@ProviderType
public class VRCorporationInspectorWrapper implements VRCorporationInspector,
	ModelWrapper<VRCorporationInspector> {
	public VRCorporationInspectorWrapper(
		VRCorporationInspector vrCorporationInspector) {
		_vrCorporationInspector = vrCorporationInspector;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCorporationInspector.class;
	}

	@Override
	public String getModelClassName() {
		return VRCorporationInspector.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectorPhone", getInspectorPhone());
		attributes.put("inspectorEmail", getInspectorEmail());
		attributes.put("contactCode", getContactCode());
		attributes.put("teamId", getTeamId());
		attributes.put("markupTeamLeader", getMarkupTeamLeader());
		attributes.put("markupBoss", getMarkupBoss());
		attributes.put("place", getPlace());
		attributes.put("title", getTitle());
		attributes.put("fileChuKyId", getFileChuKyId());
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

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		String inspectorPhone = (String)attributes.get("inspectorPhone");

		if (inspectorPhone != null) {
			setInspectorPhone(inspectorPhone);
		}

		String inspectorEmail = (String)attributes.get("inspectorEmail");

		if (inspectorEmail != null) {
			setInspectorEmail(inspectorEmail);
		}

		Date contactCode = (Date)attributes.get("contactCode");

		if (contactCode != null) {
			setContactCode(contactCode);
		}

		Long teamId = (Long)attributes.get("teamId");

		if (teamId != null) {
			setTeamId(teamId);
		}

		Long markupTeamLeader = (Long)attributes.get("markupTeamLeader");

		if (markupTeamLeader != null) {
			setMarkupTeamLeader(markupTeamLeader);
		}

		Long markupBoss = (Long)attributes.get("markupBoss");

		if (markupBoss != null) {
			setMarkupBoss(markupBoss);
		}

		String place = (String)attributes.get("place");

		if (place != null) {
			setPlace(place);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Long fileChuKyId = (Long)attributes.get("fileChuKyId");

		if (fileChuKyId != null) {
			setFileChuKyId(fileChuKyId);
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
	public VRCorporationInspector toEscapedModel() {
		return new VRCorporationInspectorWrapper(_vrCorporationInspector.toEscapedModel());
	}

	@Override
	public VRCorporationInspector toUnescapedModel() {
		return new VRCorporationInspectorWrapper(_vrCorporationInspector.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrCorporationInspector.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrCorporationInspector.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrCorporationInspector.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrCorporationInspector.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCorporationInspector> toCacheModel() {
		return _vrCorporationInspector.toCacheModel();
	}

	@Override
	public int compareTo(VRCorporationInspector vrCorporationInspector) {
		return _vrCorporationInspector.compareTo(vrCorporationInspector);
	}

	@Override
	public int hashCode() {
		return _vrCorporationInspector.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrCorporationInspector.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCorporationInspectorWrapper((VRCorporationInspector)_vrCorporationInspector.clone());
	}

	/**
	* Returns the corporation ID of this vr corporation inspector.
	*
	* @return the corporation ID of this vr corporation inspector
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _vrCorporationInspector.getCorporationId();
	}

	/**
	* Returns the inspector email of this vr corporation inspector.
	*
	* @return the inspector email of this vr corporation inspector
	*/
	@Override
	public java.lang.String getInspectorEmail() {
		return _vrCorporationInspector.getInspectorEmail();
	}

	/**
	* Returns the inspector name of this vr corporation inspector.
	*
	* @return the inspector name of this vr corporation inspector
	*/
	@Override
	public java.lang.String getInspectorName() {
		return _vrCorporationInspector.getInspectorName();
	}

	/**
	* Returns the inspector phone of this vr corporation inspector.
	*
	* @return the inspector phone of this vr corporation inspector
	*/
	@Override
	public java.lang.String getInspectorPhone() {
		return _vrCorporationInspector.getInspectorPhone();
	}

	/**
	* Returns the place of this vr corporation inspector.
	*
	* @return the place of this vr corporation inspector
	*/
	@Override
	public java.lang.String getPlace() {
		return _vrCorporationInspector.getPlace();
	}

	/**
	* Returns the title of this vr corporation inspector.
	*
	* @return the title of this vr corporation inspector
	*/
	@Override
	public java.lang.String getTitle() {
		return _vrCorporationInspector.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _vrCorporationInspector.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrCorporationInspector.toXmlString();
	}

	/**
	* Returns the contact code of this vr corporation inspector.
	*
	* @return the contact code of this vr corporation inspector
	*/
	@Override
	public Date getContactCode() {
		return _vrCorporationInspector.getContactCode();
	}

	/**
	* Returns the modify date of this vr corporation inspector.
	*
	* @return the modify date of this vr corporation inspector
	*/
	@Override
	public Date getModifyDate() {
		return _vrCorporationInspector.getModifyDate();
	}

	/**
	* Returns the sync date of this vr corporation inspector.
	*
	* @return the sync date of this vr corporation inspector
	*/
	@Override
	public Date getSyncDate() {
		return _vrCorporationInspector.getSyncDate();
	}

	/**
	* Returns the file chu ky ID of this vr corporation inspector.
	*
	* @return the file chu ky ID of this vr corporation inspector
	*/
	@Override
	public long getFileChuKyId() {
		return _vrCorporationInspector.getFileChuKyId();
	}

	/**
	* Returns the ID of this vr corporation inspector.
	*
	* @return the ID of this vr corporation inspector
	*/
	@Override
	public long getId() {
		return _vrCorporationInspector.getId();
	}

	/**
	* Returns the inspector ID of this vr corporation inspector.
	*
	* @return the inspector ID of this vr corporation inspector
	*/
	@Override
	public long getInspectorId() {
		return _vrCorporationInspector.getInspectorId();
	}

	/**
	* Returns the markup boss of this vr corporation inspector.
	*
	* @return the markup boss of this vr corporation inspector
	*/
	@Override
	public long getMarkupBoss() {
		return _vrCorporationInspector.getMarkupBoss();
	}

	/**
	* Returns the markup team leader of this vr corporation inspector.
	*
	* @return the markup team leader of this vr corporation inspector
	*/
	@Override
	public long getMarkupTeamLeader() {
		return _vrCorporationInspector.getMarkupTeamLeader();
	}

	/**
	* Returns the primary key of this vr corporation inspector.
	*
	* @return the primary key of this vr corporation inspector
	*/
	@Override
	public long getPrimaryKey() {
		return _vrCorporationInspector.getPrimaryKey();
	}

	/**
	* Returns the team ID of this vr corporation inspector.
	*
	* @return the team ID of this vr corporation inspector
	*/
	@Override
	public long getTeamId() {
		return _vrCorporationInspector.getTeamId();
	}

	@Override
	public void persist() {
		_vrCorporationInspector.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrCorporationInspector.setCachedModel(cachedModel);
	}

	/**
	* Sets the contact code of this vr corporation inspector.
	*
	* @param contactCode the contact code of this vr corporation inspector
	*/
	@Override
	public void setContactCode(Date contactCode) {
		_vrCorporationInspector.setContactCode(contactCode);
	}

	/**
	* Sets the corporation ID of this vr corporation inspector.
	*
	* @param corporationId the corporation ID of this vr corporation inspector
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_vrCorporationInspector.setCorporationId(corporationId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrCorporationInspector.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrCorporationInspector.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrCorporationInspector.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file chu ky ID of this vr corporation inspector.
	*
	* @param fileChuKyId the file chu ky ID of this vr corporation inspector
	*/
	@Override
	public void setFileChuKyId(long fileChuKyId) {
		_vrCorporationInspector.setFileChuKyId(fileChuKyId);
	}

	/**
	* Sets the ID of this vr corporation inspector.
	*
	* @param id the ID of this vr corporation inspector
	*/
	@Override
	public void setId(long id) {
		_vrCorporationInspector.setId(id);
	}

	/**
	* Sets the inspector email of this vr corporation inspector.
	*
	* @param inspectorEmail the inspector email of this vr corporation inspector
	*/
	@Override
	public void setInspectorEmail(java.lang.String inspectorEmail) {
		_vrCorporationInspector.setInspectorEmail(inspectorEmail);
	}

	/**
	* Sets the inspector ID of this vr corporation inspector.
	*
	* @param inspectorId the inspector ID of this vr corporation inspector
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_vrCorporationInspector.setInspectorId(inspectorId);
	}

	/**
	* Sets the inspector name of this vr corporation inspector.
	*
	* @param inspectorName the inspector name of this vr corporation inspector
	*/
	@Override
	public void setInspectorName(java.lang.String inspectorName) {
		_vrCorporationInspector.setInspectorName(inspectorName);
	}

	/**
	* Sets the inspector phone of this vr corporation inspector.
	*
	* @param inspectorPhone the inspector phone of this vr corporation inspector
	*/
	@Override
	public void setInspectorPhone(java.lang.String inspectorPhone) {
		_vrCorporationInspector.setInspectorPhone(inspectorPhone);
	}

	/**
	* Sets the markup boss of this vr corporation inspector.
	*
	* @param markupBoss the markup boss of this vr corporation inspector
	*/
	@Override
	public void setMarkupBoss(long markupBoss) {
		_vrCorporationInspector.setMarkupBoss(markupBoss);
	}

	/**
	* Sets the markup team leader of this vr corporation inspector.
	*
	* @param markupTeamLeader the markup team leader of this vr corporation inspector
	*/
	@Override
	public void setMarkupTeamLeader(long markupTeamLeader) {
		_vrCorporationInspector.setMarkupTeamLeader(markupTeamLeader);
	}

	/**
	* Sets the modify date of this vr corporation inspector.
	*
	* @param modifyDate the modify date of this vr corporation inspector
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrCorporationInspector.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrCorporationInspector.setNew(n);
	}

	/**
	* Sets the place of this vr corporation inspector.
	*
	* @param place the place of this vr corporation inspector
	*/
	@Override
	public void setPlace(java.lang.String place) {
		_vrCorporationInspector.setPlace(place);
	}

	/**
	* Sets the primary key of this vr corporation inspector.
	*
	* @param primaryKey the primary key of this vr corporation inspector
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrCorporationInspector.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrCorporationInspector.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sync date of this vr corporation inspector.
	*
	* @param syncDate the sync date of this vr corporation inspector
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrCorporationInspector.setSyncDate(syncDate);
	}

	/**
	* Sets the team ID of this vr corporation inspector.
	*
	* @param teamId the team ID of this vr corporation inspector
	*/
	@Override
	public void setTeamId(long teamId) {
		_vrCorporationInspector.setTeamId(teamId);
	}

	/**
	* Sets the title of this vr corporation inspector.
	*
	* @param title the title of this vr corporation inspector
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vrCorporationInspector.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCorporationInspectorWrapper)) {
			return false;
		}

		VRCorporationInspectorWrapper vrCorporationInspectorWrapper = (VRCorporationInspectorWrapper)obj;

		if (Objects.equals(_vrCorporationInspector,
					vrCorporationInspectorWrapper._vrCorporationInspector)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCorporationInspector getWrappedModel() {
		return _vrCorporationInspector;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrCorporationInspector.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrCorporationInspector.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrCorporationInspector.resetOriginalValues();
	}

	private final VRCorporationInspector _vrCorporationInspector;
}