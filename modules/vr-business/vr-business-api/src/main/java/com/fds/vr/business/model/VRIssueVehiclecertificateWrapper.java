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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRIssueVehiclecertificate}.
 * </p>
 *
 * @author LamTV
 * @see VRIssueVehiclecertificate
 * @generated
 */
@ProviderType
public class VRIssueVehiclecertificateWrapper
	implements VRIssueVehiclecertificate,
		ModelWrapper<VRIssueVehiclecertificate> {
	public VRIssueVehiclecertificateWrapper(
		VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		_vrIssueVehiclecertificate = vrIssueVehiclecertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return VRIssueVehiclecertificate.class;
	}

	@Override
	public String getModelClassName() {
		return VRIssueVehiclecertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("issueId", getIssueId());
		attributes.put("dossierId", getDossierId());
		attributes.put("certificateId", getCertificateId());
		attributes.put("vehiclePrice", getVehiclePrice());
		attributes.put("totalQuantity", getTotalQuantity());
		attributes.put("unitPrice", getUnitPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long issueId = (Long)attributes.get("issueId");

		if (issueId != null) {
			setIssueId(issueId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long certificateId = (Long)attributes.get("certificateId");

		if (certificateId != null) {
			setCertificateId(certificateId);
		}

		Long vehiclePrice = (Long)attributes.get("vehiclePrice");

		if (vehiclePrice != null) {
			setVehiclePrice(vehiclePrice);
		}

		Long totalQuantity = (Long)attributes.get("totalQuantity");

		if (totalQuantity != null) {
			setTotalQuantity(totalQuantity);
		}

		Long unitPrice = (Long)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}
	}

	@Override
	public VRIssueVehiclecertificate toEscapedModel() {
		return new VRIssueVehiclecertificateWrapper(_vrIssueVehiclecertificate.toEscapedModel());
	}

	@Override
	public VRIssueVehiclecertificate toUnescapedModel() {
		return new VRIssueVehiclecertificateWrapper(_vrIssueVehiclecertificate.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrIssueVehiclecertificate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrIssueVehiclecertificate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrIssueVehiclecertificate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrIssueVehiclecertificate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRIssueVehiclecertificate> toCacheModel() {
		return _vrIssueVehiclecertificate.toCacheModel();
	}

	@Override
	public int compareTo(VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		return _vrIssueVehiclecertificate.compareTo(vrIssueVehiclecertificate);
	}

	@Override
	public int hashCode() {
		return _vrIssueVehiclecertificate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrIssueVehiclecertificate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRIssueVehiclecertificateWrapper((VRIssueVehiclecertificate)_vrIssueVehiclecertificate.clone());
	}

	@Override
	public java.lang.String toString() {
		return _vrIssueVehiclecertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrIssueVehiclecertificate.toXmlString();
	}

	/**
	* Returns the certificate ID of this vr issue vehiclecertificate.
	*
	* @return the certificate ID of this vr issue vehiclecertificate
	*/
	@Override
	public long getCertificateId() {
		return _vrIssueVehiclecertificate.getCertificateId();
	}

	/**
	* Returns the dossier ID of this vr issue vehiclecertificate.
	*
	* @return the dossier ID of this vr issue vehiclecertificate
	*/
	@Override
	public long getDossierId() {
		return _vrIssueVehiclecertificate.getDossierId();
	}

	/**
	* Returns the ID of this vr issue vehiclecertificate.
	*
	* @return the ID of this vr issue vehiclecertificate
	*/
	@Override
	public long getId() {
		return _vrIssueVehiclecertificate.getId();
	}

	/**
	* Returns the issue ID of this vr issue vehiclecertificate.
	*
	* @return the issue ID of this vr issue vehiclecertificate
	*/
	@Override
	public long getIssueId() {
		return _vrIssueVehiclecertificate.getIssueId();
	}

	/**
	* Returns the primary key of this vr issue vehiclecertificate.
	*
	* @return the primary key of this vr issue vehiclecertificate
	*/
	@Override
	public long getPrimaryKey() {
		return _vrIssueVehiclecertificate.getPrimaryKey();
	}

	/**
	* Returns the total quantity of this vr issue vehiclecertificate.
	*
	* @return the total quantity of this vr issue vehiclecertificate
	*/
	@Override
	public long getTotalQuantity() {
		return _vrIssueVehiclecertificate.getTotalQuantity();
	}

	/**
	* Returns the unit price of this vr issue vehiclecertificate.
	*
	* @return the unit price of this vr issue vehiclecertificate
	*/
	@Override
	public long getUnitPrice() {
		return _vrIssueVehiclecertificate.getUnitPrice();
	}

	/**
	* Returns the vehicle price of this vr issue vehiclecertificate.
	*
	* @return the vehicle price of this vr issue vehiclecertificate
	*/
	@Override
	public long getVehiclePrice() {
		return _vrIssueVehiclecertificate.getVehiclePrice();
	}

	@Override
	public void persist() {
		_vrIssueVehiclecertificate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrIssueVehiclecertificate.setCachedModel(cachedModel);
	}

	/**
	* Sets the certificate ID of this vr issue vehiclecertificate.
	*
	* @param certificateId the certificate ID of this vr issue vehiclecertificate
	*/
	@Override
	public void setCertificateId(long certificateId) {
		_vrIssueVehiclecertificate.setCertificateId(certificateId);
	}

	/**
	* Sets the dossier ID of this vr issue vehiclecertificate.
	*
	* @param dossierId the dossier ID of this vr issue vehiclecertificate
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrIssueVehiclecertificate.setDossierId(dossierId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrIssueVehiclecertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrIssueVehiclecertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrIssueVehiclecertificate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr issue vehiclecertificate.
	*
	* @param id the ID of this vr issue vehiclecertificate
	*/
	@Override
	public void setId(long id) {
		_vrIssueVehiclecertificate.setId(id);
	}

	/**
	* Sets the issue ID of this vr issue vehiclecertificate.
	*
	* @param issueId the issue ID of this vr issue vehiclecertificate
	*/
	@Override
	public void setIssueId(long issueId) {
		_vrIssueVehiclecertificate.setIssueId(issueId);
	}

	@Override
	public void setNew(boolean n) {
		_vrIssueVehiclecertificate.setNew(n);
	}

	/**
	* Sets the primary key of this vr issue vehiclecertificate.
	*
	* @param primaryKey the primary key of this vr issue vehiclecertificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrIssueVehiclecertificate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrIssueVehiclecertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the total quantity of this vr issue vehiclecertificate.
	*
	* @param totalQuantity the total quantity of this vr issue vehiclecertificate
	*/
	@Override
	public void setTotalQuantity(long totalQuantity) {
		_vrIssueVehiclecertificate.setTotalQuantity(totalQuantity);
	}

	/**
	* Sets the unit price of this vr issue vehiclecertificate.
	*
	* @param unitPrice the unit price of this vr issue vehiclecertificate
	*/
	@Override
	public void setUnitPrice(long unitPrice) {
		_vrIssueVehiclecertificate.setUnitPrice(unitPrice);
	}

	/**
	* Sets the vehicle price of this vr issue vehiclecertificate.
	*
	* @param vehiclePrice the vehicle price of this vr issue vehiclecertificate
	*/
	@Override
	public void setVehiclePrice(long vehiclePrice) {
		_vrIssueVehiclecertificate.setVehiclePrice(vehiclePrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueVehiclecertificateWrapper)) {
			return false;
		}

		VRIssueVehiclecertificateWrapper vrIssueVehiclecertificateWrapper = (VRIssueVehiclecertificateWrapper)obj;

		if (Objects.equals(_vrIssueVehiclecertificate,
					vrIssueVehiclecertificateWrapper._vrIssueVehiclecertificate)) {
			return true;
		}

		return false;
	}

	@Override
	public VRIssueVehiclecertificate getWrappedModel() {
		return _vrIssueVehiclecertificate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrIssueVehiclecertificate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrIssueVehiclecertificate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrIssueVehiclecertificate.resetOriginalValues();
	}

	private final VRIssueVehiclecertificate _vrIssueVehiclecertificate;
}