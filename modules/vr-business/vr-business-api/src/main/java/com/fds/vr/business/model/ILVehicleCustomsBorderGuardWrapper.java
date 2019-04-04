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
 * This class is a wrapper for {@link ILVehicleCustomsBorderGuard}.
 * </p>
 *
 * @author LamTV
 * @see ILVehicleCustomsBorderGuard
 * @generated
 */
@ProviderType
public class ILVehicleCustomsBorderGuardWrapper
	implements ILVehicleCustomsBorderGuard,
		ModelWrapper<ILVehicleCustomsBorderGuard> {
	public ILVehicleCustomsBorderGuardWrapper(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		_ilVehicleCustomsBorderGuard = ilVehicleCustomsBorderGuard;
	}

	@Override
	public Class<?> getModelClass() {
		return ILVehicleCustomsBorderGuard.class;
	}

	@Override
	public String getModelClassName() {
		return ILVehicleCustomsBorderGuard.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registrationNumber", getRegistrationNumber());
		attributes.put("expImpGateType", getExpImpGateType());
		attributes.put("expImpGate", getExpImpGate());
		attributes.put("driverName", getDriverName());
		attributes.put("driverLicenceNo", getDriverLicenceNo());
		attributes.put("registrationDate", getRegistrationDate());
		attributes.put("customsDepartureDate", getCustomsDepartureDate());
		attributes.put("customsArrivalDate", getCustomsArrivalDate());
		attributes.put("borderGuardsDepartureDate",
			getBorderGuardsDepartureDate());
		attributes.put("borderGuardsArrivalDate", getBorderGuardsArrivalDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String registrationNumber = (String)attributes.get("registrationNumber");

		if (registrationNumber != null) {
			setRegistrationNumber(registrationNumber);
		}

		String expImpGateType = (String)attributes.get("expImpGateType");

		if (expImpGateType != null) {
			setExpImpGateType(expImpGateType);
		}

		String expImpGate = (String)attributes.get("expImpGate");

		if (expImpGate != null) {
			setExpImpGate(expImpGate);
		}

		String driverName = (String)attributes.get("driverName");

		if (driverName != null) {
			setDriverName(driverName);
		}

		String driverLicenceNo = (String)attributes.get("driverLicenceNo");

		if (driverLicenceNo != null) {
			setDriverLicenceNo(driverLicenceNo);
		}

		Date registrationDate = (Date)attributes.get("registrationDate");

		if (registrationDate != null) {
			setRegistrationDate(registrationDate);
		}

		Date customsDepartureDate = (Date)attributes.get("customsDepartureDate");

		if (customsDepartureDate != null) {
			setCustomsDepartureDate(customsDepartureDate);
		}

		Date customsArrivalDate = (Date)attributes.get("customsArrivalDate");

		if (customsArrivalDate != null) {
			setCustomsArrivalDate(customsArrivalDate);
		}

		Date borderGuardsDepartureDate = (Date)attributes.get(
				"borderGuardsDepartureDate");

		if (borderGuardsDepartureDate != null) {
			setBorderGuardsDepartureDate(borderGuardsDepartureDate);
		}

		Date borderGuardsArrivalDate = (Date)attributes.get(
				"borderGuardsArrivalDate");

		if (borderGuardsArrivalDate != null) {
			setBorderGuardsArrivalDate(borderGuardsArrivalDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public ILVehicleCustomsBorderGuard toEscapedModel() {
		return new ILVehicleCustomsBorderGuardWrapper(_ilVehicleCustomsBorderGuard.toEscapedModel());
	}

	@Override
	public ILVehicleCustomsBorderGuard toUnescapedModel() {
		return new ILVehicleCustomsBorderGuardWrapper(_ilVehicleCustomsBorderGuard.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ilVehicleCustomsBorderGuard.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ilVehicleCustomsBorderGuard.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ilVehicleCustomsBorderGuard.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ilVehicleCustomsBorderGuard.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ILVehicleCustomsBorderGuard> toCacheModel() {
		return _ilVehicleCustomsBorderGuard.toCacheModel();
	}

	@Override
	public int compareTo(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return _ilVehicleCustomsBorderGuard.compareTo(ilVehicleCustomsBorderGuard);
	}

	@Override
	public int hashCode() {
		return _ilVehicleCustomsBorderGuard.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ilVehicleCustomsBorderGuard.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ILVehicleCustomsBorderGuardWrapper((ILVehicleCustomsBorderGuard)_ilVehicleCustomsBorderGuard.clone());
	}

	/**
	* Returns the driver licence no of this il vehicle customs border guard.
	*
	* @return the driver licence no of this il vehicle customs border guard
	*/
	@Override
	public java.lang.String getDriverLicenceNo() {
		return _ilVehicleCustomsBorderGuard.getDriverLicenceNo();
	}

	/**
	* Returns the driver name of this il vehicle customs border guard.
	*
	* @return the driver name of this il vehicle customs border guard
	*/
	@Override
	public java.lang.String getDriverName() {
		return _ilVehicleCustomsBorderGuard.getDriverName();
	}

	/**
	* Returns the exp imp gate of this il vehicle customs border guard.
	*
	* @return the exp imp gate of this il vehicle customs border guard
	*/
	@Override
	public java.lang.String getExpImpGate() {
		return _ilVehicleCustomsBorderGuard.getExpImpGate();
	}

	/**
	* Returns the exp imp gate type of this il vehicle customs border guard.
	*
	* @return the exp imp gate type of this il vehicle customs border guard
	*/
	@Override
	public java.lang.String getExpImpGateType() {
		return _ilVehicleCustomsBorderGuard.getExpImpGateType();
	}

	/**
	* Returns the registration number of this il vehicle customs border guard.
	*
	* @return the registration number of this il vehicle customs border guard
	*/
	@Override
	public java.lang.String getRegistrationNumber() {
		return _ilVehicleCustomsBorderGuard.getRegistrationNumber();
	}

	@Override
	public java.lang.String toString() {
		return _ilVehicleCustomsBorderGuard.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ilVehicleCustomsBorderGuard.toXmlString();
	}

	/**
	* Returns the border guards arrival date of this il vehicle customs border guard.
	*
	* @return the border guards arrival date of this il vehicle customs border guard
	*/
	@Override
	public Date getBorderGuardsArrivalDate() {
		return _ilVehicleCustomsBorderGuard.getBorderGuardsArrivalDate();
	}

	/**
	* Returns the border guards departure date of this il vehicle customs border guard.
	*
	* @return the border guards departure date of this il vehicle customs border guard
	*/
	@Override
	public Date getBorderGuardsDepartureDate() {
		return _ilVehicleCustomsBorderGuard.getBorderGuardsDepartureDate();
	}

	/**
	* Returns the customs arrival date of this il vehicle customs border guard.
	*
	* @return the customs arrival date of this il vehicle customs border guard
	*/
	@Override
	public Date getCustomsArrivalDate() {
		return _ilVehicleCustomsBorderGuard.getCustomsArrivalDate();
	}

	/**
	* Returns the customs departure date of this il vehicle customs border guard.
	*
	* @return the customs departure date of this il vehicle customs border guard
	*/
	@Override
	public Date getCustomsDepartureDate() {
		return _ilVehicleCustomsBorderGuard.getCustomsDepartureDate();
	}

	/**
	* Returns the registration date of this il vehicle customs border guard.
	*
	* @return the registration date of this il vehicle customs border guard
	*/
	@Override
	public Date getRegistrationDate() {
		return _ilVehicleCustomsBorderGuard.getRegistrationDate();
	}

	/**
	* Returns the sync date of this il vehicle customs border guard.
	*
	* @return the sync date of this il vehicle customs border guard
	*/
	@Override
	public Date getSyncDate() {
		return _ilVehicleCustomsBorderGuard.getSyncDate();
	}

	/**
	* Returns the ID of this il vehicle customs border guard.
	*
	* @return the ID of this il vehicle customs border guard
	*/
	@Override
	public long getId() {
		return _ilVehicleCustomsBorderGuard.getId();
	}

	/**
	* Returns the primary key of this il vehicle customs border guard.
	*
	* @return the primary key of this il vehicle customs border guard
	*/
	@Override
	public long getPrimaryKey() {
		return _ilVehicleCustomsBorderGuard.getPrimaryKey();
	}

	@Override
	public void persist() {
		_ilVehicleCustomsBorderGuard.persist();
	}

	/**
	* Sets the border guards arrival date of this il vehicle customs border guard.
	*
	* @param borderGuardsArrivalDate the border guards arrival date of this il vehicle customs border guard
	*/
	@Override
	public void setBorderGuardsArrivalDate(Date borderGuardsArrivalDate) {
		_ilVehicleCustomsBorderGuard.setBorderGuardsArrivalDate(borderGuardsArrivalDate);
	}

	/**
	* Sets the border guards departure date of this il vehicle customs border guard.
	*
	* @param borderGuardsDepartureDate the border guards departure date of this il vehicle customs border guard
	*/
	@Override
	public void setBorderGuardsDepartureDate(Date borderGuardsDepartureDate) {
		_ilVehicleCustomsBorderGuard.setBorderGuardsDepartureDate(borderGuardsDepartureDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ilVehicleCustomsBorderGuard.setCachedModel(cachedModel);
	}

	/**
	* Sets the customs arrival date of this il vehicle customs border guard.
	*
	* @param customsArrivalDate the customs arrival date of this il vehicle customs border guard
	*/
	@Override
	public void setCustomsArrivalDate(Date customsArrivalDate) {
		_ilVehicleCustomsBorderGuard.setCustomsArrivalDate(customsArrivalDate);
	}

	/**
	* Sets the customs departure date of this il vehicle customs border guard.
	*
	* @param customsDepartureDate the customs departure date of this il vehicle customs border guard
	*/
	@Override
	public void setCustomsDepartureDate(Date customsDepartureDate) {
		_ilVehicleCustomsBorderGuard.setCustomsDepartureDate(customsDepartureDate);
	}

	/**
	* Sets the driver licence no of this il vehicle customs border guard.
	*
	* @param driverLicenceNo the driver licence no of this il vehicle customs border guard
	*/
	@Override
	public void setDriverLicenceNo(java.lang.String driverLicenceNo) {
		_ilVehicleCustomsBorderGuard.setDriverLicenceNo(driverLicenceNo);
	}

	/**
	* Sets the driver name of this il vehicle customs border guard.
	*
	* @param driverName the driver name of this il vehicle customs border guard
	*/
	@Override
	public void setDriverName(java.lang.String driverName) {
		_ilVehicleCustomsBorderGuard.setDriverName(driverName);
	}

	/**
	* Sets the exp imp gate of this il vehicle customs border guard.
	*
	* @param expImpGate the exp imp gate of this il vehicle customs border guard
	*/
	@Override
	public void setExpImpGate(java.lang.String expImpGate) {
		_ilVehicleCustomsBorderGuard.setExpImpGate(expImpGate);
	}

	/**
	* Sets the exp imp gate type of this il vehicle customs border guard.
	*
	* @param expImpGateType the exp imp gate type of this il vehicle customs border guard
	*/
	@Override
	public void setExpImpGateType(java.lang.String expImpGateType) {
		_ilVehicleCustomsBorderGuard.setExpImpGateType(expImpGateType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ilVehicleCustomsBorderGuard.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ilVehicleCustomsBorderGuard.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ilVehicleCustomsBorderGuard.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this il vehicle customs border guard.
	*
	* @param id the ID of this il vehicle customs border guard
	*/
	@Override
	public void setId(long id) {
		_ilVehicleCustomsBorderGuard.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_ilVehicleCustomsBorderGuard.setNew(n);
	}

	/**
	* Sets the primary key of this il vehicle customs border guard.
	*
	* @param primaryKey the primary key of this il vehicle customs border guard
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ilVehicleCustomsBorderGuard.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ilVehicleCustomsBorderGuard.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the registration date of this il vehicle customs border guard.
	*
	* @param registrationDate the registration date of this il vehicle customs border guard
	*/
	@Override
	public void setRegistrationDate(Date registrationDate) {
		_ilVehicleCustomsBorderGuard.setRegistrationDate(registrationDate);
	}

	/**
	* Sets the registration number of this il vehicle customs border guard.
	*
	* @param registrationNumber the registration number of this il vehicle customs border guard
	*/
	@Override
	public void setRegistrationNumber(java.lang.String registrationNumber) {
		_ilVehicleCustomsBorderGuard.setRegistrationNumber(registrationNumber);
	}

	/**
	* Sets the sync date of this il vehicle customs border guard.
	*
	* @param syncDate the sync date of this il vehicle customs border guard
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_ilVehicleCustomsBorderGuard.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ILVehicleCustomsBorderGuardWrapper)) {
			return false;
		}

		ILVehicleCustomsBorderGuardWrapper ilVehicleCustomsBorderGuardWrapper = (ILVehicleCustomsBorderGuardWrapper)obj;

		if (Objects.equals(_ilVehicleCustomsBorderGuard,
					ilVehicleCustomsBorderGuardWrapper._ilVehicleCustomsBorderGuard)) {
			return true;
		}

		return false;
	}

	@Override
	public ILVehicleCustomsBorderGuard getWrappedModel() {
		return _ilVehicleCustomsBorderGuard;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ilVehicleCustomsBorderGuard.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ilVehicleCustomsBorderGuard.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ilVehicleCustomsBorderGuard.resetOriginalValues();
	}

	private final ILVehicleCustomsBorderGuard _ilVehicleCustomsBorderGuard;
}