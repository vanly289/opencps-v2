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

package com.backend.migrate.vr.model;

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
 * This class is a wrapper for {@link ViPham}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ViPham
 * @generated
 */
@ProviderType
public class ViPhamWrapper implements ViPham, ModelWrapper<ViPham> {
	public ViPhamWrapper(ViPham viPham) {
		_viPham = viPham;
	}

	@Override
	public Class<?> getModelClass() {
		return ViPham.class;
	}

	@Override
	public String getModelClassName() {
		return ViPham.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phuongtien_id", getPhuongtien_id());
		attributes.put("ngayvipham", getNgayvipham());
		attributes.put("loaivipham_id", getLoaivipham_id());
		attributes.put("mota", getMota());
		attributes.put("url_bienban", getUrl_bienban());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long phuongtien_id = (Long)attributes.get("phuongtien_id");

		if (phuongtien_id != null) {
			setPhuongtien_id(phuongtien_id);
		}

		Date ngayvipham = (Date)attributes.get("ngayvipham");

		if (ngayvipham != null) {
			setNgayvipham(ngayvipham);
		}

		Long loaivipham_id = (Long)attributes.get("loaivipham_id");

		if (loaivipham_id != null) {
			setLoaivipham_id(loaivipham_id);
		}

		String mota = (String)attributes.get("mota");

		if (mota != null) {
			setMota(mota);
		}

		String url_bienban = (String)attributes.get("url_bienban");

		if (url_bienban != null) {
			setUrl_bienban(url_bienban);
		}
	}

	@Override
	public ViPham toEscapedModel() {
		return new ViPhamWrapper(_viPham.toEscapedModel());
	}

	@Override
	public ViPham toUnescapedModel() {
		return new ViPhamWrapper(_viPham.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _viPham.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _viPham.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _viPham.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _viPham.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ViPham> toCacheModel() {
		return _viPham.toCacheModel();
	}

	@Override
	public int compareTo(ViPham viPham) {
		return _viPham.compareTo(viPham);
	}

	@Override
	public int hashCode() {
		return _viPham.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _viPham.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ViPhamWrapper((ViPham)_viPham.clone());
	}

	/**
	* Returns the mota of this vi pham.
	*
	* @return the mota of this vi pham
	*/
	@Override
	public java.lang.String getMota() {
		return _viPham.getMota();
	}

	/**
	* Returns the url_bienban of this vi pham.
	*
	* @return the url_bienban of this vi pham
	*/
	@Override
	public java.lang.String getUrl_bienban() {
		return _viPham.getUrl_bienban();
	}

	@Override
	public java.lang.String toString() {
		return _viPham.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _viPham.toXmlString();
	}

	/**
	* Returns the ngayvipham of this vi pham.
	*
	* @return the ngayvipham of this vi pham
	*/
	@Override
	public Date getNgayvipham() {
		return _viPham.getNgayvipham();
	}

	/**
	* Returns the ID of this vi pham.
	*
	* @return the ID of this vi pham
	*/
	@Override
	public long getId() {
		return _viPham.getId();
	}

	/**
	* Returns the loaivipham_id of this vi pham.
	*
	* @return the loaivipham_id of this vi pham
	*/
	@Override
	public long getLoaivipham_id() {
		return _viPham.getLoaivipham_id();
	}

	/**
	* Returns the phuongtien_id of this vi pham.
	*
	* @return the phuongtien_id of this vi pham
	*/
	@Override
	public long getPhuongtien_id() {
		return _viPham.getPhuongtien_id();
	}

	/**
	* Returns the primary key of this vi pham.
	*
	* @return the primary key of this vi pham
	*/
	@Override
	public long getPrimaryKey() {
		return _viPham.getPrimaryKey();
	}

	@Override
	public void persist() {
		_viPham.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_viPham.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_viPham.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_viPham.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_viPham.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vi pham.
	*
	* @param id the ID of this vi pham
	*/
	@Override
	public void setId(long id) {
		_viPham.setId(id);
	}

	/**
	* Sets the loaivipham_id of this vi pham.
	*
	* @param loaivipham_id the loaivipham_id of this vi pham
	*/
	@Override
	public void setLoaivipham_id(long loaivipham_id) {
		_viPham.setLoaivipham_id(loaivipham_id);
	}

	/**
	* Sets the mota of this vi pham.
	*
	* @param mota the mota of this vi pham
	*/
	@Override
	public void setMota(java.lang.String mota) {
		_viPham.setMota(mota);
	}

	@Override
	public void setNew(boolean n) {
		_viPham.setNew(n);
	}

	/**
	* Sets the ngayvipham of this vi pham.
	*
	* @param ngayvipham the ngayvipham of this vi pham
	*/
	@Override
	public void setNgayvipham(Date ngayvipham) {
		_viPham.setNgayvipham(ngayvipham);
	}

	/**
	* Sets the phuongtien_id of this vi pham.
	*
	* @param phuongtien_id the phuongtien_id of this vi pham
	*/
	@Override
	public void setPhuongtien_id(long phuongtien_id) {
		_viPham.setPhuongtien_id(phuongtien_id);
	}

	/**
	* Sets the primary key of this vi pham.
	*
	* @param primaryKey the primary key of this vi pham
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_viPham.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_viPham.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the url_bienban of this vi pham.
	*
	* @param url_bienban the url_bienban of this vi pham
	*/
	@Override
	public void setUrl_bienban(java.lang.String url_bienban) {
		_viPham.setUrl_bienban(url_bienban);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ViPhamWrapper)) {
			return false;
		}

		ViPhamWrapper viPhamWrapper = (ViPhamWrapper)obj;

		if (Objects.equals(_viPham, viPhamWrapper._viPham)) {
			return true;
		}

		return false;
	}

	@Override
	public ViPham getWrappedModel() {
		return _viPham;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _viPham.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _viPham.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_viPham.resetOriginalValues();
	}

	private final ViPham _viPham;
}