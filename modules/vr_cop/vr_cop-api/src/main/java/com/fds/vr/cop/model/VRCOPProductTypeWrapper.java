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

package com.fds.vr.cop.model;

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
 * This class is a wrapper for {@link VRCOPProductType}.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductType
 * @generated
 */
@ProviderType
public class VRCOPProductTypeWrapper implements VRCOPProductType,
	ModelWrapper<VRCOPProductType> {
	public VRCOPProductTypeWrapper(VRCOPProductType vrcopProductType) {
		_vrcopProductType = vrcopProductType;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPProductType.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPProductType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("COPReportRepositoryID", getCOPReportRepositoryID());
		attributes.put("COPReportNo", getCOPReportNo());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("vehicleTypeCode", getVehicleTypeCode());
		attributes.put("vehicleTypeDescription", getVehicleTypeDescription());
		attributes.put("productClassificationCode",
			getProductClassificationCode());
		attributes.put("productClassificationDescription",
			getProductClassificationDescription());
		attributes.put("tradeMark", getTradeMark());
		attributes.put("tradeMarkName", getTradeMarkName());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("designSymbolNo", getDesignSymbolNo());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer mtCore = (Integer)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long COPReportRepositoryID = (Long)attributes.get(
				"COPReportRepositoryID");

		if (COPReportRepositoryID != null) {
			setCOPReportRepositoryID(COPReportRepositoryID);
		}

		String COPReportNo = (String)attributes.get("COPReportNo");

		if (COPReportNo != null) {
			setCOPReportNo(COPReportNo);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String vehicleTypeCode = (String)attributes.get("vehicleTypeCode");

		if (vehicleTypeCode != null) {
			setVehicleTypeCode(vehicleTypeCode);
		}

		String vehicleTypeDescription = (String)attributes.get(
				"vehicleTypeDescription");

		if (vehicleTypeDescription != null) {
			setVehicleTypeDescription(vehicleTypeDescription);
		}

		String productClassificationCode = (String)attributes.get(
				"productClassificationCode");

		if (productClassificationCode != null) {
			setProductClassificationCode(productClassificationCode);
		}

		String productClassificationDescription = (String)attributes.get(
				"productClassificationDescription");

		if (productClassificationDescription != null) {
			setProductClassificationDescription(productClassificationDescription);
		}

		String tradeMark = (String)attributes.get("tradeMark");

		if (tradeMark != null) {
			setTradeMark(tradeMark);
		}

		String tradeMarkName = (String)attributes.get("tradeMarkName");

		if (tradeMarkName != null) {
			setTradeMarkName(tradeMarkName);
		}

		String commercialName = (String)attributes.get("commercialName");

		if (commercialName != null) {
			setCommercialName(commercialName);
		}

		String modelCode = (String)attributes.get("modelCode");

		if (modelCode != null) {
			setModelCode(modelCode);
		}

		String designSymbolNo = (String)attributes.get("designSymbolNo");

		if (designSymbolNo != null) {
			setDesignSymbolNo(designSymbolNo);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRCOPProductType toEscapedModel() {
		return new VRCOPProductTypeWrapper(_vrcopProductType.toEscapedModel());
	}

	@Override
	public VRCOPProductType toUnescapedModel() {
		return new VRCOPProductTypeWrapper(_vrcopProductType.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopProductType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopProductType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopProductType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopProductType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPProductType> toCacheModel() {
		return _vrcopProductType.toCacheModel();
	}

	@Override
	public int compareTo(VRCOPProductType vrcopProductType) {
		return _vrcopProductType.compareTo(vrcopProductType);
	}

	/**
	* Returns the mt core of this vrcop product type.
	*
	* @return the mt core of this vrcop product type
	*/
	@Override
	public int getMtCore() {
		return _vrcopProductType.getMtCore();
	}

	@Override
	public int hashCode() {
		return _vrcopProductType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopProductType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPProductTypeWrapper((VRCOPProductType)_vrcopProductType.clone());
	}

	/**
	* Returns the cop report no of this vrcop product type.
	*
	* @return the cop report no of this vrcop product type
	*/
	@Override
	public java.lang.String getCOPReportNo() {
		return _vrcopProductType.getCOPReportNo();
	}

	/**
	* Returns the commercial name of this vrcop product type.
	*
	* @return the commercial name of this vrcop product type
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrcopProductType.getCommercialName();
	}

	/**
	* Returns the design symbol no of this vrcop product type.
	*
	* @return the design symbol no of this vrcop product type
	*/
	@Override
	public java.lang.String getDesignSymbolNo() {
		return _vrcopProductType.getDesignSymbolNo();
	}

	/**
	* Returns the model code of this vrcop product type.
	*
	* @return the model code of this vrcop product type
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrcopProductType.getModelCode();
	}

	/**
	* Returns the product classification code of this vrcop product type.
	*
	* @return the product classification code of this vrcop product type
	*/
	@Override
	public java.lang.String getProductClassificationCode() {
		return _vrcopProductType.getProductClassificationCode();
	}

	/**
	* Returns the product classification description of this vrcop product type.
	*
	* @return the product classification description of this vrcop product type
	*/
	@Override
	public java.lang.String getProductClassificationDescription() {
		return _vrcopProductType.getProductClassificationDescription();
	}

	/**
	* Returns the trade mark of this vrcop product type.
	*
	* @return the trade mark of this vrcop product type
	*/
	@Override
	public java.lang.String getTradeMark() {
		return _vrcopProductType.getTradeMark();
	}

	/**
	* Returns the trade mark name of this vrcop product type.
	*
	* @return the trade mark name of this vrcop product type
	*/
	@Override
	public java.lang.String getTradeMarkName() {
		return _vrcopProductType.getTradeMarkName();
	}

	/**
	* Returns the vehicle class of this vrcop product type.
	*
	* @return the vehicle class of this vrcop product type
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vrcopProductType.getVehicleClass();
	}

	/**
	* Returns the vehicle type code of this vrcop product type.
	*
	* @return the vehicle type code of this vrcop product type
	*/
	@Override
	public java.lang.String getVehicleTypeCode() {
		return _vrcopProductType.getVehicleTypeCode();
	}

	/**
	* Returns the vehicle type description of this vrcop product type.
	*
	* @return the vehicle type description of this vrcop product type
	*/
	@Override
	public java.lang.String getVehicleTypeDescription() {
		return _vrcopProductType.getVehicleTypeDescription();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopProductType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopProductType.toXmlString();
	}

	/**
	* Returns the sync date of this vrcop product type.
	*
	* @return the sync date of this vrcop product type
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopProductType.getSyncDate();
	}

	/**
	* Returns the cop report repository ID of this vrcop product type.
	*
	* @return the cop report repository ID of this vrcop product type
	*/
	@Override
	public long getCOPReportRepositoryID() {
		return _vrcopProductType.getCOPReportRepositoryID();
	}

	/**
	* Returns the ID of this vrcop product type.
	*
	* @return the ID of this vrcop product type
	*/
	@Override
	public long getId() {
		return _vrcopProductType.getId();
	}

	/**
	* Returns the primary key of this vrcop product type.
	*
	* @return the primary key of this vrcop product type
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopProductType.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vrcop product type.
	*
	* @return the sequence no of this vrcop product type
	*/
	@Override
	public long getSequenceNo() {
		return _vrcopProductType.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcopProductType.persist();
	}

	/**
	* Sets the cop report no of this vrcop product type.
	*
	* @param COPReportNo the cop report no of this vrcop product type
	*/
	@Override
	public void setCOPReportNo(java.lang.String COPReportNo) {
		_vrcopProductType.setCOPReportNo(COPReportNo);
	}

	/**
	* Sets the cop report repository ID of this vrcop product type.
	*
	* @param COPReportRepositoryID the cop report repository ID of this vrcop product type
	*/
	@Override
	public void setCOPReportRepositoryID(long COPReportRepositoryID) {
		_vrcopProductType.setCOPReportRepositoryID(COPReportRepositoryID);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopProductType.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vrcop product type.
	*
	* @param commercialName the commercial name of this vrcop product type
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrcopProductType.setCommercialName(commercialName);
	}

	/**
	* Sets the design symbol no of this vrcop product type.
	*
	* @param designSymbolNo the design symbol no of this vrcop product type
	*/
	@Override
	public void setDesignSymbolNo(java.lang.String designSymbolNo) {
		_vrcopProductType.setDesignSymbolNo(designSymbolNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopProductType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopProductType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopProductType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcop product type.
	*
	* @param id the ID of this vrcop product type
	*/
	@Override
	public void setId(long id) {
		_vrcopProductType.setId(id);
	}

	/**
	* Sets the model code of this vrcop product type.
	*
	* @param modelCode the model code of this vrcop product type
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrcopProductType.setModelCode(modelCode);
	}

	/**
	* Sets the mt core of this vrcop product type.
	*
	* @param mtCore the mt core of this vrcop product type
	*/
	@Override
	public void setMtCore(int mtCore) {
		_vrcopProductType.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopProductType.setNew(n);
	}

	/**
	* Sets the primary key of this vrcop product type.
	*
	* @param primaryKey the primary key of this vrcop product type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopProductType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopProductType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product classification code of this vrcop product type.
	*
	* @param productClassificationCode the product classification code of this vrcop product type
	*/
	@Override
	public void setProductClassificationCode(
		java.lang.String productClassificationCode) {
		_vrcopProductType.setProductClassificationCode(productClassificationCode);
	}

	/**
	* Sets the product classification description of this vrcop product type.
	*
	* @param productClassificationDescription the product classification description of this vrcop product type
	*/
	@Override
	public void setProductClassificationDescription(
		java.lang.String productClassificationDescription) {
		_vrcopProductType.setProductClassificationDescription(productClassificationDescription);
	}

	/**
	* Sets the sequence no of this vrcop product type.
	*
	* @param sequenceNo the sequence no of this vrcop product type
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcopProductType.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vrcop product type.
	*
	* @param syncDate the sync date of this vrcop product type
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopProductType.setSyncDate(syncDate);
	}

	/**
	* Sets the trade mark of this vrcop product type.
	*
	* @param tradeMark the trade mark of this vrcop product type
	*/
	@Override
	public void setTradeMark(java.lang.String tradeMark) {
		_vrcopProductType.setTradeMark(tradeMark);
	}

	/**
	* Sets the trade mark name of this vrcop product type.
	*
	* @param tradeMarkName the trade mark name of this vrcop product type
	*/
	@Override
	public void setTradeMarkName(java.lang.String tradeMarkName) {
		_vrcopProductType.setTradeMarkName(tradeMarkName);
	}

	/**
	* Sets the vehicle class of this vrcop product type.
	*
	* @param vehicleClass the vehicle class of this vrcop product type
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vrcopProductType.setVehicleClass(vehicleClass);
	}

	/**
	* Sets the vehicle type code of this vrcop product type.
	*
	* @param vehicleTypeCode the vehicle type code of this vrcop product type
	*/
	@Override
	public void setVehicleTypeCode(java.lang.String vehicleTypeCode) {
		_vrcopProductType.setVehicleTypeCode(vehicleTypeCode);
	}

	/**
	* Sets the vehicle type description of this vrcop product type.
	*
	* @param vehicleTypeDescription the vehicle type description of this vrcop product type
	*/
	@Override
	public void setVehicleTypeDescription(
		java.lang.String vehicleTypeDescription) {
		_vrcopProductType.setVehicleTypeDescription(vehicleTypeDescription);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductTypeWrapper)) {
			return false;
		}

		VRCOPProductTypeWrapper vrcopProductTypeWrapper = (VRCOPProductTypeWrapper)obj;

		if (Objects.equals(_vrcopProductType,
					vrcopProductTypeWrapper._vrcopProductType)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPProductType getWrappedModel() {
		return _vrcopProductType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopProductType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopProductType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopProductType.resetOriginalValues();
	}

	private final VRCOPProductType _vrcopProductType;
}