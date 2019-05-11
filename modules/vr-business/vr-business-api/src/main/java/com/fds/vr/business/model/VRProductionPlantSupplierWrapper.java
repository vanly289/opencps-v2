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
 * This class is a wrapper for {@link VRProductionPlantSupplier}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantSupplier
 * @generated
 */
@ProviderType
public class VRProductionPlantSupplierWrapper
	implements VRProductionPlantSupplier,
		ModelWrapper<VRProductionPlantSupplier> {
	public VRProductionPlantSupplierWrapper(
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		_vrProductionPlantSupplier = vrProductionPlantSupplier;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductionPlantSupplier.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductionPlantSupplier.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("supplierId", getSupplierId());
		attributes.put("supplierName", getSupplierName());
		attributes.put("supplieraddress", getSupplieraddress());
		attributes.put("corporationCode", getCorporationCode());
		attributes.put("corporationName", getCorporationName());
		attributes.put("corporationAddress", getCorporationAddress());
		attributes.put("applicantprofileId", getApplicantprofileId());
		attributes.put("productPlantID", getProductPlantID());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("markupImporter", getMarkupImporter());
		attributes.put("mappingMA_CTY", getMappingMA_CTY());
		attributes.put("mappingTEN_CTY", getMappingTEN_CTY());
		attributes.put("mappingDIA_CHI_CTY", getMappingDIA_CHI_CTY());
		attributes.put("mappingMA_XUONG_LR", getMappingMA_XUONG_LR());
		attributes.put("mappingTEN_XUONG_LR", getMappingTEN_XUONG_LR());
		attributes.put("mappingDIA_CHI_XUONG_LR", getMappingDIA_CHI_XUONG_LR());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		String supplierId = (String)attributes.get("supplierId");

		if (supplierId != null) {
			setSupplierId(supplierId);
		}

		String supplierName = (String)attributes.get("supplierName");

		if (supplierName != null) {
			setSupplierName(supplierName);
		}

		String supplieraddress = (String)attributes.get("supplieraddress");

		if (supplieraddress != null) {
			setSupplieraddress(supplieraddress);
		}

		String corporationCode = (String)attributes.get("corporationCode");

		if (corporationCode != null) {
			setCorporationCode(corporationCode);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		String corporationAddress = (String)attributes.get("corporationAddress");

		if (corporationAddress != null) {
			setCorporationAddress(corporationAddress);
		}

		Long applicantprofileId = (Long)attributes.get("applicantprofileId");

		if (applicantprofileId != null) {
			setApplicantprofileId(applicantprofileId);
		}

		Long productPlantID = (Long)attributes.get("productPlantID");

		if (productPlantID != null) {
			setProductPlantID(productPlantID);
		}

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		String productionPlantName = (String)attributes.get(
				"productionPlantName");

		if (productionPlantName != null) {
			setProductionPlantName(productionPlantName);
		}

		String productionPlantAddress = (String)attributes.get(
				"productionPlantAddress");

		if (productionPlantAddress != null) {
			setProductionPlantAddress(productionPlantAddress);
		}

		Integer markupImporter = (Integer)attributes.get("markupImporter");

		if (markupImporter != null) {
			setMarkupImporter(markupImporter);
		}

		String mappingMA_CTY = (String)attributes.get("mappingMA_CTY");

		if (mappingMA_CTY != null) {
			setMappingMA_CTY(mappingMA_CTY);
		}

		String mappingTEN_CTY = (String)attributes.get("mappingTEN_CTY");

		if (mappingTEN_CTY != null) {
			setMappingTEN_CTY(mappingTEN_CTY);
		}

		String mappingDIA_CHI_CTY = (String)attributes.get("mappingDIA_CHI_CTY");

		if (mappingDIA_CHI_CTY != null) {
			setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
		}

		String mappingMA_XUONG_LR = (String)attributes.get("mappingMA_XUONG_LR");

		if (mappingMA_XUONG_LR != null) {
			setMappingMA_XUONG_LR(mappingMA_XUONG_LR);
		}

		String mappingTEN_XUONG_LR = (String)attributes.get(
				"mappingTEN_XUONG_LR");

		if (mappingTEN_XUONG_LR != null) {
			setMappingTEN_XUONG_LR(mappingTEN_XUONG_LR);
		}

		String mappingDIA_CHI_XUONG_LR = (String)attributes.get(
				"mappingDIA_CHI_XUONG_LR");

		if (mappingDIA_CHI_XUONG_LR != null) {
			setMappingDIA_CHI_XUONG_LR(mappingDIA_CHI_XUONG_LR);
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
	public VRProductionPlantSupplier toEscapedModel() {
		return new VRProductionPlantSupplierWrapper(_vrProductionPlantSupplier.toEscapedModel());
	}

	@Override
	public VRProductionPlantSupplier toUnescapedModel() {
		return new VRProductionPlantSupplierWrapper(_vrProductionPlantSupplier.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductionPlantSupplier.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductionPlantSupplier.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductionPlantSupplier.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductionPlantSupplier.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductionPlantSupplier> toCacheModel() {
		return _vrProductionPlantSupplier.toCacheModel();
	}

	@Override
	public int compareTo(VRProductionPlantSupplier vrProductionPlantSupplier) {
		return _vrProductionPlantSupplier.compareTo(vrProductionPlantSupplier);
	}

	/**
	* Returns the markup importer of this vr production plant supplier.
	*
	* @return the markup importer of this vr production plant supplier
	*/
	@Override
	public int getMarkupImporter() {
		return _vrProductionPlantSupplier.getMarkupImporter();
	}

	@Override
	public int hashCode() {
		return _vrProductionPlantSupplier.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductionPlantSupplier.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductionPlantSupplierWrapper((VRProductionPlantSupplier)_vrProductionPlantSupplier.clone());
	}

	/**
	* Returns the corporation address of this vr production plant supplier.
	*
	* @return the corporation address of this vr production plant supplier
	*/
	@Override
	public java.lang.String getCorporationAddress() {
		return _vrProductionPlantSupplier.getCorporationAddress();
	}

	/**
	* Returns the corporation code of this vr production plant supplier.
	*
	* @return the corporation code of this vr production plant supplier
	*/
	@Override
	public java.lang.String getCorporationCode() {
		return _vrProductionPlantSupplier.getCorporationCode();
	}

	/**
	* Returns the corporation name of this vr production plant supplier.
	*
	* @return the corporation name of this vr production plant supplier
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _vrProductionPlantSupplier.getCorporationName();
	}

	/**
	* Returns the mapping dia_chi_cty of this vr production plant supplier.
	*
	* @return the mapping dia_chi_cty of this vr production plant supplier
	*/
	@Override
	public java.lang.String getMappingDIA_CHI_CTY() {
		return _vrProductionPlantSupplier.getMappingDIA_CHI_CTY();
	}

	/**
	* Returns the mapping dia_chi_xuong_lr of this vr production plant supplier.
	*
	* @return the mapping dia_chi_xuong_lr of this vr production plant supplier
	*/
	@Override
	public java.lang.String getMappingDIA_CHI_XUONG_LR() {
		return _vrProductionPlantSupplier.getMappingDIA_CHI_XUONG_LR();
	}

	/**
	* Returns the mapping ma_cty of this vr production plant supplier.
	*
	* @return the mapping ma_cty of this vr production plant supplier
	*/
	@Override
	public java.lang.String getMappingMA_CTY() {
		return _vrProductionPlantSupplier.getMappingMA_CTY();
	}

	/**
	* Returns the mapping ma_xuong_lr of this vr production plant supplier.
	*
	* @return the mapping ma_xuong_lr of this vr production plant supplier
	*/
	@Override
	public java.lang.String getMappingMA_XUONG_LR() {
		return _vrProductionPlantSupplier.getMappingMA_XUONG_LR();
	}

	/**
	* Returns the mapping ten_cty of this vr production plant supplier.
	*
	* @return the mapping ten_cty of this vr production plant supplier
	*/
	@Override
	public java.lang.String getMappingTEN_CTY() {
		return _vrProductionPlantSupplier.getMappingTEN_CTY();
	}

	/**
	* Returns the mapping ten_xuong_lr of this vr production plant supplier.
	*
	* @return the mapping ten_xuong_lr of this vr production plant supplier
	*/
	@Override
	public java.lang.String getMappingTEN_XUONG_LR() {
		return _vrProductionPlantSupplier.getMappingTEN_XUONG_LR();
	}

	/**
	* Returns the production plant address of this vr production plant supplier.
	*
	* @return the production plant address of this vr production plant supplier
	*/
	@Override
	public java.lang.String getProductionPlantAddress() {
		return _vrProductionPlantSupplier.getProductionPlantAddress();
	}

	/**
	* Returns the production plant code of this vr production plant supplier.
	*
	* @return the production plant code of this vr production plant supplier
	*/
	@Override
	public java.lang.String getProductionPlantCode() {
		return _vrProductionPlantSupplier.getProductionPlantCode();
	}

	/**
	* Returns the production plant name of this vr production plant supplier.
	*
	* @return the production plant name of this vr production plant supplier
	*/
	@Override
	public java.lang.String getProductionPlantName() {
		return _vrProductionPlantSupplier.getProductionPlantName();
	}

	/**
	* Returns the supplier ID of this vr production plant supplier.
	*
	* @return the supplier ID of this vr production plant supplier
	*/
	@Override
	public java.lang.String getSupplierId() {
		return _vrProductionPlantSupplier.getSupplierId();
	}

	/**
	* Returns the supplier name of this vr production plant supplier.
	*
	* @return the supplier name of this vr production plant supplier
	*/
	@Override
	public java.lang.String getSupplierName() {
		return _vrProductionPlantSupplier.getSupplierName();
	}

	/**
	* Returns the supplieraddress of this vr production plant supplier.
	*
	* @return the supplieraddress of this vr production plant supplier
	*/
	@Override
	public java.lang.String getSupplieraddress() {
		return _vrProductionPlantSupplier.getSupplieraddress();
	}

	/**
	* Returns the uuid of this vr production plant supplier.
	*
	* @return the uuid of this vr production plant supplier
	*/
	@Override
	public java.lang.String getUuid() {
		return _vrProductionPlantSupplier.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductionPlantSupplier.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductionPlantSupplier.toXmlString();
	}

	/**
	* Returns the modify date of this vr production plant supplier.
	*
	* @return the modify date of this vr production plant supplier
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductionPlantSupplier.getModifyDate();
	}

	/**
	* Returns the sync date of this vr production plant supplier.
	*
	* @return the sync date of this vr production plant supplier
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductionPlantSupplier.getSyncDate();
	}

	/**
	* Returns the applicantprofile ID of this vr production plant supplier.
	*
	* @return the applicantprofile ID of this vr production plant supplier
	*/
	@Override
	public long getApplicantprofileId() {
		return _vrProductionPlantSupplier.getApplicantprofileId();
	}

	/**
	* Returns the ID of this vr production plant supplier.
	*
	* @return the ID of this vr production plant supplier
	*/
	@Override
	public long getId() {
		return _vrProductionPlantSupplier.getId();
	}

	/**
	* Returns the mt core of this vr production plant supplier.
	*
	* @return the mt core of this vr production plant supplier
	*/
	@Override
	public long getMtCore() {
		return _vrProductionPlantSupplier.getMtCore();
	}

	/**
	* Returns the primary key of this vr production plant supplier.
	*
	* @return the primary key of this vr production plant supplier
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductionPlantSupplier.getPrimaryKey();
	}

	/**
	* Returns the product plant ID of this vr production plant supplier.
	*
	* @return the product plant ID of this vr production plant supplier
	*/
	@Override
	public long getProductPlantID() {
		return _vrProductionPlantSupplier.getProductPlantID();
	}

	@Override
	public void persist() {
		_vrProductionPlantSupplier.persist();
	}

	/**
	* Sets the applicantprofile ID of this vr production plant supplier.
	*
	* @param applicantprofileId the applicantprofile ID of this vr production plant supplier
	*/
	@Override
	public void setApplicantprofileId(long applicantprofileId) {
		_vrProductionPlantSupplier.setApplicantprofileId(applicantprofileId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductionPlantSupplier.setCachedModel(cachedModel);
	}

	/**
	* Sets the corporation address of this vr production plant supplier.
	*
	* @param corporationAddress the corporation address of this vr production plant supplier
	*/
	@Override
	public void setCorporationAddress(java.lang.String corporationAddress) {
		_vrProductionPlantSupplier.setCorporationAddress(corporationAddress);
	}

	/**
	* Sets the corporation code of this vr production plant supplier.
	*
	* @param corporationCode the corporation code of this vr production plant supplier
	*/
	@Override
	public void setCorporationCode(java.lang.String corporationCode) {
		_vrProductionPlantSupplier.setCorporationCode(corporationCode);
	}

	/**
	* Sets the corporation name of this vr production plant supplier.
	*
	* @param corporationName the corporation name of this vr production plant supplier
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_vrProductionPlantSupplier.setCorporationName(corporationName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductionPlantSupplier.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductionPlantSupplier.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductionPlantSupplier.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr production plant supplier.
	*
	* @param id the ID of this vr production plant supplier
	*/
	@Override
	public void setId(long id) {
		_vrProductionPlantSupplier.setId(id);
	}

	/**
	* Sets the mapping dia_chi_cty of this vr production plant supplier.
	*
	* @param mappingDIA_CHI_CTY the mapping dia_chi_cty of this vr production plant supplier
	*/
	@Override
	public void setMappingDIA_CHI_CTY(java.lang.String mappingDIA_CHI_CTY) {
		_vrProductionPlantSupplier.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
	}

	/**
	* Sets the mapping dia_chi_xuong_lr of this vr production plant supplier.
	*
	* @param mappingDIA_CHI_XUONG_LR the mapping dia_chi_xuong_lr of this vr production plant supplier
	*/
	@Override
	public void setMappingDIA_CHI_XUONG_LR(
		java.lang.String mappingDIA_CHI_XUONG_LR) {
		_vrProductionPlantSupplier.setMappingDIA_CHI_XUONG_LR(mappingDIA_CHI_XUONG_LR);
	}

	/**
	* Sets the mapping ma_cty of this vr production plant supplier.
	*
	* @param mappingMA_CTY the mapping ma_cty of this vr production plant supplier
	*/
	@Override
	public void setMappingMA_CTY(java.lang.String mappingMA_CTY) {
		_vrProductionPlantSupplier.setMappingMA_CTY(mappingMA_CTY);
	}

	/**
	* Sets the mapping ma_xuong_lr of this vr production plant supplier.
	*
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr of this vr production plant supplier
	*/
	@Override
	public void setMappingMA_XUONG_LR(java.lang.String mappingMA_XUONG_LR) {
		_vrProductionPlantSupplier.setMappingMA_XUONG_LR(mappingMA_XUONG_LR);
	}

	/**
	* Sets the mapping ten_cty of this vr production plant supplier.
	*
	* @param mappingTEN_CTY the mapping ten_cty of this vr production plant supplier
	*/
	@Override
	public void setMappingTEN_CTY(java.lang.String mappingTEN_CTY) {
		_vrProductionPlantSupplier.setMappingTEN_CTY(mappingTEN_CTY);
	}

	/**
	* Sets the mapping ten_xuong_lr of this vr production plant supplier.
	*
	* @param mappingTEN_XUONG_LR the mapping ten_xuong_lr of this vr production plant supplier
	*/
	@Override
	public void setMappingTEN_XUONG_LR(java.lang.String mappingTEN_XUONG_LR) {
		_vrProductionPlantSupplier.setMappingTEN_XUONG_LR(mappingTEN_XUONG_LR);
	}

	/**
	* Sets the markup importer of this vr production plant supplier.
	*
	* @param markupImporter the markup importer of this vr production plant supplier
	*/
	@Override
	public void setMarkupImporter(int markupImporter) {
		_vrProductionPlantSupplier.setMarkupImporter(markupImporter);
	}

	/**
	* Sets the modify date of this vr production plant supplier.
	*
	* @param modifyDate the modify date of this vr production plant supplier
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductionPlantSupplier.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr production plant supplier.
	*
	* @param mtCore the mt core of this vr production plant supplier
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrProductionPlantSupplier.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductionPlantSupplier.setNew(n);
	}

	/**
	* Sets the primary key of this vr production plant supplier.
	*
	* @param primaryKey the primary key of this vr production plant supplier
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductionPlantSupplier.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductionPlantSupplier.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product plant ID of this vr production plant supplier.
	*
	* @param productPlantID the product plant ID of this vr production plant supplier
	*/
	@Override
	public void setProductPlantID(long productPlantID) {
		_vrProductionPlantSupplier.setProductPlantID(productPlantID);
	}

	/**
	* Sets the production plant address of this vr production plant supplier.
	*
	* @param productionPlantAddress the production plant address of this vr production plant supplier
	*/
	@Override
	public void setProductionPlantAddress(
		java.lang.String productionPlantAddress) {
		_vrProductionPlantSupplier.setProductionPlantAddress(productionPlantAddress);
	}

	/**
	* Sets the production plant code of this vr production plant supplier.
	*
	* @param productionPlantCode the production plant code of this vr production plant supplier
	*/
	@Override
	public void setProductionPlantCode(java.lang.String productionPlantCode) {
		_vrProductionPlantSupplier.setProductionPlantCode(productionPlantCode);
	}

	/**
	* Sets the production plant name of this vr production plant supplier.
	*
	* @param productionPlantName the production plant name of this vr production plant supplier
	*/
	@Override
	public void setProductionPlantName(java.lang.String productionPlantName) {
		_vrProductionPlantSupplier.setProductionPlantName(productionPlantName);
	}

	/**
	* Sets the supplier ID of this vr production plant supplier.
	*
	* @param supplierId the supplier ID of this vr production plant supplier
	*/
	@Override
	public void setSupplierId(java.lang.String supplierId) {
		_vrProductionPlantSupplier.setSupplierId(supplierId);
	}

	/**
	* Sets the supplier name of this vr production plant supplier.
	*
	* @param supplierName the supplier name of this vr production plant supplier
	*/
	@Override
	public void setSupplierName(java.lang.String supplierName) {
		_vrProductionPlantSupplier.setSupplierName(supplierName);
	}

	/**
	* Sets the supplieraddress of this vr production plant supplier.
	*
	* @param supplieraddress the supplieraddress of this vr production plant supplier
	*/
	@Override
	public void setSupplieraddress(java.lang.String supplieraddress) {
		_vrProductionPlantSupplier.setSupplieraddress(supplieraddress);
	}

	/**
	* Sets the sync date of this vr production plant supplier.
	*
	* @param syncDate the sync date of this vr production plant supplier
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductionPlantSupplier.setSyncDate(syncDate);
	}

	/**
	* Sets the uuid of this vr production plant supplier.
	*
	* @param uuid the uuid of this vr production plant supplier
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_vrProductionPlantSupplier.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantSupplierWrapper)) {
			return false;
		}

		VRProductionPlantSupplierWrapper vrProductionPlantSupplierWrapper = (VRProductionPlantSupplierWrapper)obj;

		if (Objects.equals(_vrProductionPlantSupplier,
					vrProductionPlantSupplierWrapper._vrProductionPlantSupplier)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductionPlantSupplier getWrappedModel() {
		return _vrProductionPlantSupplier;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductionPlantSupplier.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductionPlantSupplier.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductionPlantSupplier.resetOriginalValues();
	}

	private final VRProductionPlantSupplier _vrProductionPlantSupplier;
}