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
 * This class is a wrapper for {@link VRCOPProductionPlantProdEquipment}.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantProdEquipment
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantProdEquipmentWrapper
	implements VRCOPProductionPlantProdEquipment,
		ModelWrapper<VRCOPProductionPlantProdEquipment> {
	public VRCOPProductionPlantProdEquipmentWrapper(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		_vrcopProductionPlantProdEquipment = vrcopProductionPlantProdEquipment;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPProductionPlantProdEquipment.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPProductionPlantProdEquipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("COPReportRepositoryID", getCOPReportRepositoryID());
		attributes.put("COPReportNo", getCOPReportNo());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("equipmentCode", getEquipmentCode());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("equipmentType", getEquipmentType());
		attributes.put("tradeMark", getTradeMark());
		attributes.put("tradeMarkName", getTradeMarkName());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("designSymbolNo", getDesignSymbolNo());
		attributes.put("productionCountryCode", getProductionCountryCode());
		attributes.put("equipmentStatus", getEquipmentStatus());
		attributes.put("notes", getNotes());
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

		String equipmentCode = (String)attributes.get("equipmentCode");

		if (equipmentCode != null) {
			setEquipmentCode(equipmentCode);
		}

		String equipmentName = (String)attributes.get("equipmentName");

		if (equipmentName != null) {
			setEquipmentName(equipmentName);
		}

		String equipmentType = (String)attributes.get("equipmentType");

		if (equipmentType != null) {
			setEquipmentType(equipmentType);
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

		Long productionCountryCode = (Long)attributes.get(
				"productionCountryCode");

		if (productionCountryCode != null) {
			setProductionCountryCode(productionCountryCode);
		}

		String equipmentStatus = (String)attributes.get("equipmentStatus");

		if (equipmentStatus != null) {
			setEquipmentStatus(equipmentStatus);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
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
	public VRCOPProductionPlantProdEquipment toEscapedModel() {
		return new VRCOPProductionPlantProdEquipmentWrapper(_vrcopProductionPlantProdEquipment.toEscapedModel());
	}

	@Override
	public VRCOPProductionPlantProdEquipment toUnescapedModel() {
		return new VRCOPProductionPlantProdEquipmentWrapper(_vrcopProductionPlantProdEquipment.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopProductionPlantProdEquipment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopProductionPlantProdEquipment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopProductionPlantProdEquipment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopProductionPlantProdEquipment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPProductionPlantProdEquipment> toCacheModel() {
		return _vrcopProductionPlantProdEquipment.toCacheModel();
	}

	@Override
	public int compareTo(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return _vrcopProductionPlantProdEquipment.compareTo(vrcopProductionPlantProdEquipment);
	}

	/**
	* Returns the mt core of this vrcop production plant prod equipment.
	*
	* @return the mt core of this vrcop production plant prod equipment
	*/
	@Override
	public int getMtCore() {
		return _vrcopProductionPlantProdEquipment.getMtCore();
	}

	@Override
	public int hashCode() {
		return _vrcopProductionPlantProdEquipment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopProductionPlantProdEquipment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPProductionPlantProdEquipmentWrapper((VRCOPProductionPlantProdEquipment)_vrcopProductionPlantProdEquipment.clone());
	}

	/**
	* Returns the cop report no of this vrcop production plant prod equipment.
	*
	* @return the cop report no of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getCOPReportNo() {
		return _vrcopProductionPlantProdEquipment.getCOPReportNo();
	}

	/**
	* Returns the commercial name of this vrcop production plant prod equipment.
	*
	* @return the commercial name of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrcopProductionPlantProdEquipment.getCommercialName();
	}

	/**
	* Returns the design symbol no of this vrcop production plant prod equipment.
	*
	* @return the design symbol no of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getDesignSymbolNo() {
		return _vrcopProductionPlantProdEquipment.getDesignSymbolNo();
	}

	/**
	* Returns the equipment code of this vrcop production plant prod equipment.
	*
	* @return the equipment code of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getEquipmentCode() {
		return _vrcopProductionPlantProdEquipment.getEquipmentCode();
	}

	/**
	* Returns the equipment name of this vrcop production plant prod equipment.
	*
	* @return the equipment name of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getEquipmentName() {
		return _vrcopProductionPlantProdEquipment.getEquipmentName();
	}

	/**
	* Returns the equipment status of this vrcop production plant prod equipment.
	*
	* @return the equipment status of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getEquipmentStatus() {
		return _vrcopProductionPlantProdEquipment.getEquipmentStatus();
	}

	/**
	* Returns the equipment type of this vrcop production plant prod equipment.
	*
	* @return the equipment type of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getEquipmentType() {
		return _vrcopProductionPlantProdEquipment.getEquipmentType();
	}

	/**
	* Returns the model code of this vrcop production plant prod equipment.
	*
	* @return the model code of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrcopProductionPlantProdEquipment.getModelCode();
	}

	/**
	* Returns the notes of this vrcop production plant prod equipment.
	*
	* @return the notes of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getNotes() {
		return _vrcopProductionPlantProdEquipment.getNotes();
	}

	/**
	* Returns the trade mark of this vrcop production plant prod equipment.
	*
	* @return the trade mark of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getTradeMark() {
		return _vrcopProductionPlantProdEquipment.getTradeMark();
	}

	/**
	* Returns the trade mark name of this vrcop production plant prod equipment.
	*
	* @return the trade mark name of this vrcop production plant prod equipment
	*/
	@Override
	public java.lang.String getTradeMarkName() {
		return _vrcopProductionPlantProdEquipment.getTradeMarkName();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopProductionPlantProdEquipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopProductionPlantProdEquipment.toXmlString();
	}

	/**
	* Returns the modify date of this vrcop production plant prod equipment.
	*
	* @return the modify date of this vrcop production plant prod equipment
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopProductionPlantProdEquipment.getModifyDate();
	}

	/**
	* Returns the sync date of this vrcop production plant prod equipment.
	*
	* @return the sync date of this vrcop production plant prod equipment
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopProductionPlantProdEquipment.getSyncDate();
	}

	/**
	* Returns the cop report repository ID of this vrcop production plant prod equipment.
	*
	* @return the cop report repository ID of this vrcop production plant prod equipment
	*/
	@Override
	public long getCOPReportRepositoryID() {
		return _vrcopProductionPlantProdEquipment.getCOPReportRepositoryID();
	}

	/**
	* Returns the ID of this vrcop production plant prod equipment.
	*
	* @return the ID of this vrcop production plant prod equipment
	*/
	@Override
	public long getId() {
		return _vrcopProductionPlantProdEquipment.getId();
	}

	/**
	* Returns the primary key of this vrcop production plant prod equipment.
	*
	* @return the primary key of this vrcop production plant prod equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopProductionPlantProdEquipment.getPrimaryKey();
	}

	/**
	* Returns the production country code of this vrcop production plant prod equipment.
	*
	* @return the production country code of this vrcop production plant prod equipment
	*/
	@Override
	public long getProductionCountryCode() {
		return _vrcopProductionPlantProdEquipment.getProductionCountryCode();
	}

	/**
	* Returns the sequence no of this vrcop production plant prod equipment.
	*
	* @return the sequence no of this vrcop production plant prod equipment
	*/
	@Override
	public long getSequenceNo() {
		return _vrcopProductionPlantProdEquipment.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcopProductionPlantProdEquipment.persist();
	}

	/**
	* Sets the cop report no of this vrcop production plant prod equipment.
	*
	* @param COPReportNo the cop report no of this vrcop production plant prod equipment
	*/
	@Override
	public void setCOPReportNo(java.lang.String COPReportNo) {
		_vrcopProductionPlantProdEquipment.setCOPReportNo(COPReportNo);
	}

	/**
	* Sets the cop report repository ID of this vrcop production plant prod equipment.
	*
	* @param COPReportRepositoryID the cop report repository ID of this vrcop production plant prod equipment
	*/
	@Override
	public void setCOPReportRepositoryID(long COPReportRepositoryID) {
		_vrcopProductionPlantProdEquipment.setCOPReportRepositoryID(COPReportRepositoryID);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopProductionPlantProdEquipment.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vrcop production plant prod equipment.
	*
	* @param commercialName the commercial name of this vrcop production plant prod equipment
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrcopProductionPlantProdEquipment.setCommercialName(commercialName);
	}

	/**
	* Sets the design symbol no of this vrcop production plant prod equipment.
	*
	* @param designSymbolNo the design symbol no of this vrcop production plant prod equipment
	*/
	@Override
	public void setDesignSymbolNo(java.lang.String designSymbolNo) {
		_vrcopProductionPlantProdEquipment.setDesignSymbolNo(designSymbolNo);
	}

	/**
	* Sets the equipment code of this vrcop production plant prod equipment.
	*
	* @param equipmentCode the equipment code of this vrcop production plant prod equipment
	*/
	@Override
	public void setEquipmentCode(java.lang.String equipmentCode) {
		_vrcopProductionPlantProdEquipment.setEquipmentCode(equipmentCode);
	}

	/**
	* Sets the equipment name of this vrcop production plant prod equipment.
	*
	* @param equipmentName the equipment name of this vrcop production plant prod equipment
	*/
	@Override
	public void setEquipmentName(java.lang.String equipmentName) {
		_vrcopProductionPlantProdEquipment.setEquipmentName(equipmentName);
	}

	/**
	* Sets the equipment status of this vrcop production plant prod equipment.
	*
	* @param equipmentStatus the equipment status of this vrcop production plant prod equipment
	*/
	@Override
	public void setEquipmentStatus(java.lang.String equipmentStatus) {
		_vrcopProductionPlantProdEquipment.setEquipmentStatus(equipmentStatus);
	}

	/**
	* Sets the equipment type of this vrcop production plant prod equipment.
	*
	* @param equipmentType the equipment type of this vrcop production plant prod equipment
	*/
	@Override
	public void setEquipmentType(java.lang.String equipmentType) {
		_vrcopProductionPlantProdEquipment.setEquipmentType(equipmentType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopProductionPlantProdEquipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopProductionPlantProdEquipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopProductionPlantProdEquipment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcop production plant prod equipment.
	*
	* @param id the ID of this vrcop production plant prod equipment
	*/
	@Override
	public void setId(long id) {
		_vrcopProductionPlantProdEquipment.setId(id);
	}

	/**
	* Sets the model code of this vrcop production plant prod equipment.
	*
	* @param modelCode the model code of this vrcop production plant prod equipment
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrcopProductionPlantProdEquipment.setModelCode(modelCode);
	}

	/**
	* Sets the modify date of this vrcop production plant prod equipment.
	*
	* @param modifyDate the modify date of this vrcop production plant prod equipment
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopProductionPlantProdEquipment.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vrcop production plant prod equipment.
	*
	* @param mtCore the mt core of this vrcop production plant prod equipment
	*/
	@Override
	public void setMtCore(int mtCore) {
		_vrcopProductionPlantProdEquipment.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopProductionPlantProdEquipment.setNew(n);
	}

	/**
	* Sets the notes of this vrcop production plant prod equipment.
	*
	* @param notes the notes of this vrcop production plant prod equipment
	*/
	@Override
	public void setNotes(java.lang.String notes) {
		_vrcopProductionPlantProdEquipment.setNotes(notes);
	}

	/**
	* Sets the primary key of this vrcop production plant prod equipment.
	*
	* @param primaryKey the primary key of this vrcop production plant prod equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopProductionPlantProdEquipment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopProductionPlantProdEquipment.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the production country code of this vrcop production plant prod equipment.
	*
	* @param productionCountryCode the production country code of this vrcop production plant prod equipment
	*/
	@Override
	public void setProductionCountryCode(long productionCountryCode) {
		_vrcopProductionPlantProdEquipment.setProductionCountryCode(productionCountryCode);
	}

	/**
	* Sets the sequence no of this vrcop production plant prod equipment.
	*
	* @param sequenceNo the sequence no of this vrcop production plant prod equipment
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcopProductionPlantProdEquipment.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vrcop production plant prod equipment.
	*
	* @param syncDate the sync date of this vrcop production plant prod equipment
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopProductionPlantProdEquipment.setSyncDate(syncDate);
	}

	/**
	* Sets the trade mark of this vrcop production plant prod equipment.
	*
	* @param tradeMark the trade mark of this vrcop production plant prod equipment
	*/
	@Override
	public void setTradeMark(java.lang.String tradeMark) {
		_vrcopProductionPlantProdEquipment.setTradeMark(tradeMark);
	}

	/**
	* Sets the trade mark name of this vrcop production plant prod equipment.
	*
	* @param tradeMarkName the trade mark name of this vrcop production plant prod equipment
	*/
	@Override
	public void setTradeMarkName(java.lang.String tradeMarkName) {
		_vrcopProductionPlantProdEquipment.setTradeMarkName(tradeMarkName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductionPlantProdEquipmentWrapper)) {
			return false;
		}

		VRCOPProductionPlantProdEquipmentWrapper vrcopProductionPlantProdEquipmentWrapper =
			(VRCOPProductionPlantProdEquipmentWrapper)obj;

		if (Objects.equals(_vrcopProductionPlantProdEquipment,
					vrcopProductionPlantProdEquipmentWrapper._vrcopProductionPlantProdEquipment)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPProductionPlantProdEquipment getWrappedModel() {
		return _vrcopProductionPlantProdEquipment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopProductionPlantProdEquipment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopProductionPlantProdEquipment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopProductionPlantProdEquipment.resetOriginalValues();
	}

	private final VRCOPProductionPlantProdEquipment _vrcopProductionPlantProdEquipment;
}