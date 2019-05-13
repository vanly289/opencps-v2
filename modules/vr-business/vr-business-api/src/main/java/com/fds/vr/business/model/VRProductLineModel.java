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
 * The base model interface for the VRProductLine service. Represents a row in the &quot;vr_productline&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRProductLineModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRProductLineImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductLine
 * @see com.fds.vr.business.model.impl.VRProductLineImpl
 * @see com.fds.vr.business.model.impl.VRProductLineModelImpl
 * @generated
 */
@ProviderType
public interface VRProductLineModel extends BaseModel<VRProductLine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr product line model instance should use the {@link VRProductLine} interface instead.
	 */

	/**
	 * Returns the primary key of this vr product line.
	 *
	 * @return the primary key of this vr product line
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr product line.
	 *
	 * @param primaryKey the primary key of this vr product line
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr product line.
	 *
	 * @return the ID of this vr product line
	 */
	public long getId();

	/**
	 * Sets the ID of this vr product line.
	 *
	 * @param id the ID of this vr product line
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr product line.
	 *
	 * @return the mt core of this vr product line
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr product line.
	 *
	 * @param mtCore the mt core of this vr product line
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the product plant ID of this vr product line.
	 *
	 * @return the product plant ID of this vr product line
	 */
	public long getProductPlantID();

	/**
	 * Sets the product plant ID of this vr product line.
	 *
	 * @param productPlantID the product plant ID of this vr product line
	 */
	public void setProductPlantID(long productPlantID);

	/**
	 * Returns the product type ID of this vr product line.
	 *
	 * @return the product type ID of this vr product line
	 */
	public long getProductTypeID();

	/**
	 * Sets the product type ID of this vr product line.
	 *
	 * @param productTypeID the product type ID of this vr product line
	 */
	public void setProductTypeID(long productTypeID);

	/**
	 * Returns the sequence no of this vr product line.
	 *
	 * @return the sequence no of this vr product line
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vr product line.
	 *
	 * @param sequenceNo the sequence no of this vr product line
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the trademark of this vr product line.
	 *
	 * @return the trademark of this vr product line
	 */
	@AutoEscape
	public String getTrademark();

	/**
	 * Sets the trademark of this vr product line.
	 *
	 * @param trademark the trademark of this vr product line
	 */
	public void setTrademark(String trademark);

	/**
	 * Returns the trademark name of this vr product line.
	 *
	 * @return the trademark name of this vr product line
	 */
	@AutoEscape
	public String getTrademarkName();

	/**
	 * Sets the trademark name of this vr product line.
	 *
	 * @param trademarkName the trademark name of this vr product line
	 */
	public void setTrademarkName(String trademarkName);

	/**
	 * Returns the commercial name of this vr product line.
	 *
	 * @return the commercial name of this vr product line
	 */
	@AutoEscape
	public String getCommercialName();

	/**
	 * Sets the commercial name of this vr product line.
	 *
	 * @param commercialName the commercial name of this vr product line
	 */
	public void setCommercialName(String commercialName);

	/**
	 * Returns the model code of this vr product line.
	 *
	 * @return the model code of this vr product line
	 */
	@AutoEscape
	public String getModelCode();

	/**
	 * Sets the model code of this vr product line.
	 *
	 * @param modelCode the model code of this vr product line
	 */
	public void setModelCode(String modelCode);

	/**
	 * Returns the modify date of this vr product line.
	 *
	 * @return the modify date of this vr product line
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr product line.
	 *
	 * @param modifyDate the modify date of this vr product line
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr product line.
	 *
	 * @return the sync date of this vr product line
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr product line.
	 *
	 * @param syncDate the sync date of this vr product line
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
	public int compareTo(VRProductLine vrProductLine);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRProductLine> toCacheModel();

	@Override
	public VRProductLine toEscapedModel();

	@Override
	public VRProductLine toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}