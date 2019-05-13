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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the VRCorporationInspector service. Represents a row in the &quot;vr_corporation_inspector&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRCorporationInspectorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRCorporationInspectorImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRCorporationInspector
 * @see com.fds.vr.business.model.impl.VRCorporationInspectorImpl
 * @see com.fds.vr.business.model.impl.VRCorporationInspectorModelImpl
 * @generated
 */
@ProviderType
public interface VRCorporationInspectorModel extends BaseModel<VRCorporationInspector> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr corporation inspector model instance should use the {@link VRCorporationInspector} interface instead.
	 */

	/**
	 * Returns the primary key of this vr corporation inspector.
	 *
	 * @return the primary key of this vr corporation inspector
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr corporation inspector.
	 *
	 * @param primaryKey the primary key of this vr corporation inspector
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr corporation inspector.
	 *
	 * @return the ID of this vr corporation inspector
	 */
	public long getId();

	/**
	 * Sets the ID of this vr corporation inspector.
	 *
	 * @param id the ID of this vr corporation inspector
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr corporation inspector.
	 *
	 * @return the mt core of this vr corporation inspector
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr corporation inspector.
	 *
	 * @param mtCore the mt core of this vr corporation inspector
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the corporation ID of this vr corporation inspector.
	 *
	 * @return the corporation ID of this vr corporation inspector
	 */
	@AutoEscape
	public String getCorporationId();

	/**
	 * Sets the corporation ID of this vr corporation inspector.
	 *
	 * @param corporationId the corporation ID of this vr corporation inspector
	 */
	public void setCorporationId(String corporationId);

	/**
	 * Returns the inspectorid of this vr corporation inspector.
	 *
	 * @return the inspectorid of this vr corporation inspector
	 */
	public long getInspectorid();

	/**
	 * Sets the inspectorid of this vr corporation inspector.
	 *
	 * @param inspectorid the inspectorid of this vr corporation inspector
	 */
	public void setInspectorid(long inspectorid);

	/**
	 * Returns the inspector name of this vr corporation inspector.
	 *
	 * @return the inspector name of this vr corporation inspector
	 */
	@AutoEscape
	public String getInspectorName();

	/**
	 * Sets the inspector name of this vr corporation inspector.
	 *
	 * @param inspectorName the inspector name of this vr corporation inspector
	 */
	public void setInspectorName(String inspectorName);

	/**
	 * Returns the inspector phone of this vr corporation inspector.
	 *
	 * @return the inspector phone of this vr corporation inspector
	 */
	@AutoEscape
	public String getInspectorPhone();

	/**
	 * Sets the inspector phone of this vr corporation inspector.
	 *
	 * @param inspectorPhone the inspector phone of this vr corporation inspector
	 */
	public void setInspectorPhone(String inspectorPhone);

	/**
	 * Returns the inspector email of this vr corporation inspector.
	 *
	 * @return the inspector email of this vr corporation inspector
	 */
	@AutoEscape
	public String getInspectorEmail();

	/**
	 * Sets the inspector email of this vr corporation inspector.
	 *
	 * @param inspectorEmail the inspector email of this vr corporation inspector
	 */
	public void setInspectorEmail(String inspectorEmail);

	/**
	 * Returns the contactcode of this vr corporation inspector.
	 *
	 * @return the contactcode of this vr corporation inspector
	 */
	@AutoEscape
	public String getContactcode();

	/**
	 * Sets the contactcode of this vr corporation inspector.
	 *
	 * @param contactcode the contactcode of this vr corporation inspector
	 */
	public void setContactcode(String contactcode);

	/**
	 * Returns the regular tthc of this vr corporation inspector.
	 *
	 * @return the regular tthc of this vr corporation inspector
	 */
	public long getRegularTthc();

	/**
	 * Sets the regular tthc of this vr corporation inspector.
	 *
	 * @param regularTthc the regular tthc of this vr corporation inspector
	 */
	public void setRegularTthc(long regularTthc);

	/**
	 * Returns the search vehicle of this vr corporation inspector.
	 *
	 * @return the search vehicle of this vr corporation inspector
	 */
	public int getSearchVehicle();

	/**
	 * Sets the search vehicle of this vr corporation inspector.
	 *
	 * @param searchVehicle the search vehicle of this vr corporation inspector
	 */
	public void setSearchVehicle(int searchVehicle);

	/**
	 * Returns the team ID of this vr corporation inspector.
	 *
	 * @return the team ID of this vr corporation inspector
	 */
	public long getTeamId();

	/**
	 * Sets the team ID of this vr corporation inspector.
	 *
	 * @param teamId the team ID of this vr corporation inspector
	 */
	public void setTeamId(long teamId);

	/**
	 * Returns the markup team leader of this vr corporation inspector.
	 *
	 * @return the markup team leader of this vr corporation inspector
	 */
	public int getMarkupTeamLeader();

	/**
	 * Sets the markup team leader of this vr corporation inspector.
	 *
	 * @param markupTeamLeader the markup team leader of this vr corporation inspector
	 */
	public void setMarkupTeamLeader(int markupTeamLeader);

	/**
	 * Returns the mark up boss of this vr corporation inspector.
	 *
	 * @return the mark up boss of this vr corporation inspector
	 */
	public int getMarkUpBoss();

	/**
	 * Sets the mark up boss of this vr corporation inspector.
	 *
	 * @param markUpBoss the mark up boss of this vr corporation inspector
	 */
	public void setMarkUpBoss(int markUpBoss);

	/**
	 * Returns the executedictionary of this vr corporation inspector.
	 *
	 * @return the executedictionary of this vr corporation inspector
	 */
	@AutoEscape
	public String getExecutedictionary();

	/**
	 * Sets the executedictionary of this vr corporation inspector.
	 *
	 * @param executedictionary the executedictionary of this vr corporation inspector
	 */
	public void setExecutedictionary(String executedictionary);

	/**
	 * Returns the place of this vr corporation inspector.
	 *
	 * @return the place of this vr corporation inspector
	 */
	@AutoEscape
	public String getPlace();

	/**
	 * Sets the place of this vr corporation inspector.
	 *
	 * @param place the place of this vr corporation inspector
	 */
	public void setPlace(String place);

	/**
	 * Returns the title of this vr corporation inspector.
	 *
	 * @return the title of this vr corporation inspector
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this vr corporation inspector.
	 *
	 * @param title the title of this vr corporation inspector
	 */
	public void setTitle(String title);

	/**
	 * Returns the filechuky ID of this vr corporation inspector.
	 *
	 * @return the filechuky ID of this vr corporation inspector
	 */
	public long getFilechukyId();

	/**
	 * Sets the filechuky ID of this vr corporation inspector.
	 *
	 * @param filechukyId the filechuky ID of this vr corporation inspector
	 */
	public void setFilechukyId(long filechukyId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(VRCorporationInspector vrCorporationInspector);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRCorporationInspector> toCacheModel();

	@Override
	public VRCorporationInspector toEscapedModel();

	@Override
	public VRCorporationInspector toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}