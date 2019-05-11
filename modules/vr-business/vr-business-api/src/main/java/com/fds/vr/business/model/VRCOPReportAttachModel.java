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

import java.util.Date;

/**
 * The base model interface for the VRCOPReportAttach service. Represents a row in the &quot;vr_copreport_attach&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRCOPReportAttachModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRCOPReportAttachImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPReportAttach
 * @see com.fds.vr.business.model.impl.VRCOPReportAttachImpl
 * @see com.fds.vr.business.model.impl.VRCOPReportAttachModelImpl
 * @generated
 */
@ProviderType
public interface VRCOPReportAttachModel extends BaseModel<VRCOPReportAttach> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vrcop report attach model instance should use the {@link VRCOPReportAttach} interface instead.
	 */

	/**
	 * Returns the primary key of this vrcop report attach.
	 *
	 * @return the primary key of this vrcop report attach
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vrcop report attach.
	 *
	 * @param primaryKey the primary key of this vrcop report attach
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vrcop report attach.
	 *
	 * @return the ID of this vrcop report attach
	 */
	public long getId();

	/**
	 * Sets the ID of this vrcop report attach.
	 *
	 * @param id the ID of this vrcop report attach
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vrcop report attach.
	 *
	 * @return the mt core of this vrcop report attach
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vrcop report attach.
	 *
	 * @param mtCore the mt core of this vrcop report attach
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the cop report repository ID of this vrcop report attach.
	 *
	 * @return the cop report repository ID of this vrcop report attach
	 */
	public long getCopReportRepositoryID();

	/**
	 * Sets the cop report repository ID of this vrcop report attach.
	 *
	 * @param copReportRepositoryID the cop report repository ID of this vrcop report attach
	 */
	public void setCopReportRepositoryID(long copReportRepositoryID);

	/**
	 * Returns the cop report no of this vrcop report attach.
	 *
	 * @return the cop report no of this vrcop report attach
	 */
	@AutoEscape
	public String getCopReportNo();

	/**
	 * Sets the cop report no of this vrcop report attach.
	 *
	 * @param copReportNo the cop report no of this vrcop report attach
	 */
	public void setCopReportNo(String copReportNo);

	/**
	 * Returns the sequence no of this vrcop report attach.
	 *
	 * @return the sequence no of this vrcop report attach
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vrcop report attach.
	 *
	 * @param sequenceNo the sequence no of this vrcop report attach
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the doc name of this vrcop report attach.
	 *
	 * @return the doc name of this vrcop report attach
	 */
	@AutoEscape
	public String getDocName();

	/**
	 * Sets the doc name of this vrcop report attach.
	 *
	 * @param DocName the doc name of this vrcop report attach
	 */
	public void setDocName(String DocName);

	/**
	 * Returns the doc no of this vrcop report attach.
	 *
	 * @return the doc no of this vrcop report attach
	 */
	@AutoEscape
	public String getDocNo();

	/**
	 * Sets the doc no of this vrcop report attach.
	 *
	 * @param DocNo the doc no of this vrcop report attach
	 */
	public void setDocNo(String DocNo);

	/**
	 * Returns the remarks of this vrcop report attach.
	 *
	 * @return the remarks of this vrcop report attach
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this vrcop report attach.
	 *
	 * @param Remarks the remarks of this vrcop report attach
	 */
	public void setRemarks(String Remarks);

	/**
	 * Returns the modify date of this vrcop report attach.
	 *
	 * @return the modify date of this vrcop report attach
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vrcop report attach.
	 *
	 * @param modifyDate the modify date of this vrcop report attach
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vrcop report attach.
	 *
	 * @return the sync date of this vrcop report attach
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vrcop report attach.
	 *
	 * @param syncDate the sync date of this vrcop report attach
	 */
	public void setSyncDate(Date syncDate);

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
	public int compareTo(VRCOPReportAttach vrcopReportAttach);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRCOPReportAttach> toCacheModel();

	@Override
	public VRCOPReportAttach toEscapedModel();

	@Override
	public VRCOPReportAttach toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}