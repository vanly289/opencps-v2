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
 * This class is a wrapper for {@link PhuHieuBienHieu}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PhuHieuBienHieu
 * @generated
 */
@ProviderType
public class PhuHieuBienHieuWrapper implements PhuHieuBienHieu,
	ModelWrapper<PhuHieuBienHieu> {
	public PhuHieuBienHieuWrapper(PhuHieuBienHieu phuHieuBienHieu) {
		_phuHieuBienHieu = phuHieuBienHieu;
	}

	@Override
	public Class<?> getModelClass() {
		return PhuHieuBienHieu.class;
	}

	@Override
	public String getModelClassName() {
		return PhuHieuBienHieu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("sophuhieu", getSophuhieu());
		attributes.put("phuongtien_id", getPhuongtien_id());
		attributes.put("loaihinh_id", getLoaihinh_id());
		attributes.put("tuyenkhaithac_id", getTuyenkhaithac_id());
		attributes.put("phamvi_id", getPhamvi_id());
		attributes.put("loai", getLoai());
		attributes.put("ngaycap", getNgaycap());
		attributes.put("ngayhethan", getNgayhethan());
		attributes.put("ngaythuhoi", getNgaythuhoi());
		attributes.put("lydo_thuhoi", getLydo_thuhoi());
		attributes.put("nguoitao", getNguoitao());
		attributes.put("ngaytao", getNgaytao());
		attributes.put("nguoiky", getNguoiky());
		attributes.put("nguoiky_id", getNguoiky_id());
		attributes.put("ngayky", getNgayky());
		attributes.put("ghichu", getGhichu());
		attributes.put("trangthai", getTrangthai());
		attributes.put("coquanquanly_id", getCoquanquanly_id());
		attributes.put("labienhieu", getLabienhieu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String sophuhieu = (String)attributes.get("sophuhieu");

		if (sophuhieu != null) {
			setSophuhieu(sophuhieu);
		}

		Long phuongtien_id = (Long)attributes.get("phuongtien_id");

		if (phuongtien_id != null) {
			setPhuongtien_id(phuongtien_id);
		}

		Long loaihinh_id = (Long)attributes.get("loaihinh_id");

		if (loaihinh_id != null) {
			setLoaihinh_id(loaihinh_id);
		}

		Long tuyenkhaithac_id = (Long)attributes.get("tuyenkhaithac_id");

		if (tuyenkhaithac_id != null) {
			setTuyenkhaithac_id(tuyenkhaithac_id);
		}

		Long phamvi_id = (Long)attributes.get("phamvi_id");

		if (phamvi_id != null) {
			setPhamvi_id(phamvi_id);
		}

		Integer loai = (Integer)attributes.get("loai");

		if (loai != null) {
			setLoai(loai);
		}

		Date ngaycap = (Date)attributes.get("ngaycap");

		if (ngaycap != null) {
			setNgaycap(ngaycap);
		}

		Date ngayhethan = (Date)attributes.get("ngayhethan");

		if (ngayhethan != null) {
			setNgayhethan(ngayhethan);
		}

		Date ngaythuhoi = (Date)attributes.get("ngaythuhoi");

		if (ngaythuhoi != null) {
			setNgaythuhoi(ngaythuhoi);
		}

		String lydo_thuhoi = (String)attributes.get("lydo_thuhoi");

		if (lydo_thuhoi != null) {
			setLydo_thuhoi(lydo_thuhoi);
		}

		String nguoitao = (String)attributes.get("nguoitao");

		if (nguoitao != null) {
			setNguoitao(nguoitao);
		}

		Date ngaytao = (Date)attributes.get("ngaytao");

		if (ngaytao != null) {
			setNgaytao(ngaytao);
		}

		String nguoiky = (String)attributes.get("nguoiky");

		if (nguoiky != null) {
			setNguoiky(nguoiky);
		}

		Long nguoiky_id = (Long)attributes.get("nguoiky_id");

		if (nguoiky_id != null) {
			setNguoiky_id(nguoiky_id);
		}

		Date ngayky = (Date)attributes.get("ngayky");

		if (ngayky != null) {
			setNgayky(ngayky);
		}

		String ghichu = (String)attributes.get("ghichu");

		if (ghichu != null) {
			setGhichu(ghichu);
		}

		Integer trangthai = (Integer)attributes.get("trangthai");

		if (trangthai != null) {
			setTrangthai(trangthai);
		}

		Long coquanquanly_id = (Long)attributes.get("coquanquanly_id");

		if (coquanquanly_id != null) {
			setCoquanquanly_id(coquanquanly_id);
		}

		Integer labienhieu = (Integer)attributes.get("labienhieu");

		if (labienhieu != null) {
			setLabienhieu(labienhieu);
		}
	}

	@Override
	public PhuHieuBienHieu toEscapedModel() {
		return new PhuHieuBienHieuWrapper(_phuHieuBienHieu.toEscapedModel());
	}

	@Override
	public PhuHieuBienHieu toUnescapedModel() {
		return new PhuHieuBienHieuWrapper(_phuHieuBienHieu.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _phuHieuBienHieu.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _phuHieuBienHieu.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _phuHieuBienHieu.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _phuHieuBienHieu.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<PhuHieuBienHieu> toCacheModel() {
		return _phuHieuBienHieu.toCacheModel();
	}

	@Override
	public int compareTo(PhuHieuBienHieu phuHieuBienHieu) {
		return _phuHieuBienHieu.compareTo(phuHieuBienHieu);
	}

	/**
	* Returns the labienhieu of this phu hieu bien hieu.
	*
	* @return the labienhieu of this phu hieu bien hieu
	*/
	@Override
	public int getLabienhieu() {
		return _phuHieuBienHieu.getLabienhieu();
	}

	/**
	* Returns the loai of this phu hieu bien hieu.
	*
	* @return the loai of this phu hieu bien hieu
	*/
	@Override
	public int getLoai() {
		return _phuHieuBienHieu.getLoai();
	}

	/**
	* Returns the trangthai of this phu hieu bien hieu.
	*
	* @return the trangthai of this phu hieu bien hieu
	*/
	@Override
	public int getTrangthai() {
		return _phuHieuBienHieu.getTrangthai();
	}

	@Override
	public int hashCode() {
		return _phuHieuBienHieu.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _phuHieuBienHieu.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PhuHieuBienHieuWrapper((PhuHieuBienHieu)_phuHieuBienHieu.clone());
	}

	/**
	* Returns the ghichu of this phu hieu bien hieu.
	*
	* @return the ghichu of this phu hieu bien hieu
	*/
	@Override
	public java.lang.String getGhichu() {
		return _phuHieuBienHieu.getGhichu();
	}

	/**
	* Returns the lydo_thuhoi of this phu hieu bien hieu.
	*
	* @return the lydo_thuhoi of this phu hieu bien hieu
	*/
	@Override
	public java.lang.String getLydo_thuhoi() {
		return _phuHieuBienHieu.getLydo_thuhoi();
	}

	/**
	* Returns the nguoiky of this phu hieu bien hieu.
	*
	* @return the nguoiky of this phu hieu bien hieu
	*/
	@Override
	public java.lang.String getNguoiky() {
		return _phuHieuBienHieu.getNguoiky();
	}

	/**
	* Returns the nguoitao of this phu hieu bien hieu.
	*
	* @return the nguoitao of this phu hieu bien hieu
	*/
	@Override
	public java.lang.String getNguoitao() {
		return _phuHieuBienHieu.getNguoitao();
	}

	/**
	* Returns the sophuhieu of this phu hieu bien hieu.
	*
	* @return the sophuhieu of this phu hieu bien hieu
	*/
	@Override
	public java.lang.String getSophuhieu() {
		return _phuHieuBienHieu.getSophuhieu();
	}

	@Override
	public java.lang.String toString() {
		return _phuHieuBienHieu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phuHieuBienHieu.toXmlString();
	}

	/**
	* Returns the ngaycap of this phu hieu bien hieu.
	*
	* @return the ngaycap of this phu hieu bien hieu
	*/
	@Override
	public Date getNgaycap() {
		return _phuHieuBienHieu.getNgaycap();
	}

	/**
	* Returns the ngayhethan of this phu hieu bien hieu.
	*
	* @return the ngayhethan of this phu hieu bien hieu
	*/
	@Override
	public Date getNgayhethan() {
		return _phuHieuBienHieu.getNgayhethan();
	}

	/**
	* Returns the ngayky of this phu hieu bien hieu.
	*
	* @return the ngayky of this phu hieu bien hieu
	*/
	@Override
	public Date getNgayky() {
		return _phuHieuBienHieu.getNgayky();
	}

	/**
	* Returns the ngaytao of this phu hieu bien hieu.
	*
	* @return the ngaytao of this phu hieu bien hieu
	*/
	@Override
	public Date getNgaytao() {
		return _phuHieuBienHieu.getNgaytao();
	}

	/**
	* Returns the ngaythuhoi of this phu hieu bien hieu.
	*
	* @return the ngaythuhoi of this phu hieu bien hieu
	*/
	@Override
	public Date getNgaythuhoi() {
		return _phuHieuBienHieu.getNgaythuhoi();
	}

	/**
	* Returns the coquanquanly_id of this phu hieu bien hieu.
	*
	* @return the coquanquanly_id of this phu hieu bien hieu
	*/
	@Override
	public long getCoquanquanly_id() {
		return _phuHieuBienHieu.getCoquanquanly_id();
	}

	/**
	* Returns the ID of this phu hieu bien hieu.
	*
	* @return the ID of this phu hieu bien hieu
	*/
	@Override
	public long getId() {
		return _phuHieuBienHieu.getId();
	}

	/**
	* Returns the loaihinh_id of this phu hieu bien hieu.
	*
	* @return the loaihinh_id of this phu hieu bien hieu
	*/
	@Override
	public long getLoaihinh_id() {
		return _phuHieuBienHieu.getLoaihinh_id();
	}

	/**
	* Returns the nguoiky_id of this phu hieu bien hieu.
	*
	* @return the nguoiky_id of this phu hieu bien hieu
	*/
	@Override
	public long getNguoiky_id() {
		return _phuHieuBienHieu.getNguoiky_id();
	}

	/**
	* Returns the phamvi_id of this phu hieu bien hieu.
	*
	* @return the phamvi_id of this phu hieu bien hieu
	*/
	@Override
	public long getPhamvi_id() {
		return _phuHieuBienHieu.getPhamvi_id();
	}

	/**
	* Returns the phuongtien_id of this phu hieu bien hieu.
	*
	* @return the phuongtien_id of this phu hieu bien hieu
	*/
	@Override
	public long getPhuongtien_id() {
		return _phuHieuBienHieu.getPhuongtien_id();
	}

	/**
	* Returns the primary key of this phu hieu bien hieu.
	*
	* @return the primary key of this phu hieu bien hieu
	*/
	@Override
	public long getPrimaryKey() {
		return _phuHieuBienHieu.getPrimaryKey();
	}

	/**
	* Returns the tuyenkhaithac_id of this phu hieu bien hieu.
	*
	* @return the tuyenkhaithac_id of this phu hieu bien hieu
	*/
	@Override
	public long getTuyenkhaithac_id() {
		return _phuHieuBienHieu.getTuyenkhaithac_id();
	}

	@Override
	public void persist() {
		_phuHieuBienHieu.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phuHieuBienHieu.setCachedModel(cachedModel);
	}

	/**
	* Sets the coquanquanly_id of this phu hieu bien hieu.
	*
	* @param coquanquanly_id the coquanquanly_id of this phu hieu bien hieu
	*/
	@Override
	public void setCoquanquanly_id(long coquanquanly_id) {
		_phuHieuBienHieu.setCoquanquanly_id(coquanquanly_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_phuHieuBienHieu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_phuHieuBienHieu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_phuHieuBienHieu.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ghichu of this phu hieu bien hieu.
	*
	* @param ghichu the ghichu of this phu hieu bien hieu
	*/
	@Override
	public void setGhichu(java.lang.String ghichu) {
		_phuHieuBienHieu.setGhichu(ghichu);
	}

	/**
	* Sets the ID of this phu hieu bien hieu.
	*
	* @param id the ID of this phu hieu bien hieu
	*/
	@Override
	public void setId(long id) {
		_phuHieuBienHieu.setId(id);
	}

	/**
	* Sets the labienhieu of this phu hieu bien hieu.
	*
	* @param labienhieu the labienhieu of this phu hieu bien hieu
	*/
	@Override
	public void setLabienhieu(int labienhieu) {
		_phuHieuBienHieu.setLabienhieu(labienhieu);
	}

	/**
	* Sets the loai of this phu hieu bien hieu.
	*
	* @param loai the loai of this phu hieu bien hieu
	*/
	@Override
	public void setLoai(int loai) {
		_phuHieuBienHieu.setLoai(loai);
	}

	/**
	* Sets the loaihinh_id of this phu hieu bien hieu.
	*
	* @param loaihinh_id the loaihinh_id of this phu hieu bien hieu
	*/
	@Override
	public void setLoaihinh_id(long loaihinh_id) {
		_phuHieuBienHieu.setLoaihinh_id(loaihinh_id);
	}

	/**
	* Sets the lydo_thuhoi of this phu hieu bien hieu.
	*
	* @param lydo_thuhoi the lydo_thuhoi of this phu hieu bien hieu
	*/
	@Override
	public void setLydo_thuhoi(java.lang.String lydo_thuhoi) {
		_phuHieuBienHieu.setLydo_thuhoi(lydo_thuhoi);
	}

	@Override
	public void setNew(boolean n) {
		_phuHieuBienHieu.setNew(n);
	}

	/**
	* Sets the ngaycap of this phu hieu bien hieu.
	*
	* @param ngaycap the ngaycap of this phu hieu bien hieu
	*/
	@Override
	public void setNgaycap(Date ngaycap) {
		_phuHieuBienHieu.setNgaycap(ngaycap);
	}

	/**
	* Sets the ngayhethan of this phu hieu bien hieu.
	*
	* @param ngayhethan the ngayhethan of this phu hieu bien hieu
	*/
	@Override
	public void setNgayhethan(Date ngayhethan) {
		_phuHieuBienHieu.setNgayhethan(ngayhethan);
	}

	/**
	* Sets the ngayky of this phu hieu bien hieu.
	*
	* @param ngayky the ngayky of this phu hieu bien hieu
	*/
	@Override
	public void setNgayky(Date ngayky) {
		_phuHieuBienHieu.setNgayky(ngayky);
	}

	/**
	* Sets the ngaytao of this phu hieu bien hieu.
	*
	* @param ngaytao the ngaytao of this phu hieu bien hieu
	*/
	@Override
	public void setNgaytao(Date ngaytao) {
		_phuHieuBienHieu.setNgaytao(ngaytao);
	}

	/**
	* Sets the ngaythuhoi of this phu hieu bien hieu.
	*
	* @param ngaythuhoi the ngaythuhoi of this phu hieu bien hieu
	*/
	@Override
	public void setNgaythuhoi(Date ngaythuhoi) {
		_phuHieuBienHieu.setNgaythuhoi(ngaythuhoi);
	}

	/**
	* Sets the nguoiky of this phu hieu bien hieu.
	*
	* @param nguoiky the nguoiky of this phu hieu bien hieu
	*/
	@Override
	public void setNguoiky(java.lang.String nguoiky) {
		_phuHieuBienHieu.setNguoiky(nguoiky);
	}

	/**
	* Sets the nguoiky_id of this phu hieu bien hieu.
	*
	* @param nguoiky_id the nguoiky_id of this phu hieu bien hieu
	*/
	@Override
	public void setNguoiky_id(long nguoiky_id) {
		_phuHieuBienHieu.setNguoiky_id(nguoiky_id);
	}

	/**
	* Sets the nguoitao of this phu hieu bien hieu.
	*
	* @param nguoitao the nguoitao of this phu hieu bien hieu
	*/
	@Override
	public void setNguoitao(java.lang.String nguoitao) {
		_phuHieuBienHieu.setNguoitao(nguoitao);
	}

	/**
	* Sets the phamvi_id of this phu hieu bien hieu.
	*
	* @param phamvi_id the phamvi_id of this phu hieu bien hieu
	*/
	@Override
	public void setPhamvi_id(long phamvi_id) {
		_phuHieuBienHieu.setPhamvi_id(phamvi_id);
	}

	/**
	* Sets the phuongtien_id of this phu hieu bien hieu.
	*
	* @param phuongtien_id the phuongtien_id of this phu hieu bien hieu
	*/
	@Override
	public void setPhuongtien_id(long phuongtien_id) {
		_phuHieuBienHieu.setPhuongtien_id(phuongtien_id);
	}

	/**
	* Sets the primary key of this phu hieu bien hieu.
	*
	* @param primaryKey the primary key of this phu hieu bien hieu
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phuHieuBienHieu.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_phuHieuBienHieu.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sophuhieu of this phu hieu bien hieu.
	*
	* @param sophuhieu the sophuhieu of this phu hieu bien hieu
	*/
	@Override
	public void setSophuhieu(java.lang.String sophuhieu) {
		_phuHieuBienHieu.setSophuhieu(sophuhieu);
	}

	/**
	* Sets the trangthai of this phu hieu bien hieu.
	*
	* @param trangthai the trangthai of this phu hieu bien hieu
	*/
	@Override
	public void setTrangthai(int trangthai) {
		_phuHieuBienHieu.setTrangthai(trangthai);
	}

	/**
	* Sets the tuyenkhaithac_id of this phu hieu bien hieu.
	*
	* @param tuyenkhaithac_id the tuyenkhaithac_id of this phu hieu bien hieu
	*/
	@Override
	public void setTuyenkhaithac_id(long tuyenkhaithac_id) {
		_phuHieuBienHieu.setTuyenkhaithac_id(tuyenkhaithac_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhuHieuBienHieuWrapper)) {
			return false;
		}

		PhuHieuBienHieuWrapper phuHieuBienHieuWrapper = (PhuHieuBienHieuWrapper)obj;

		if (Objects.equals(_phuHieuBienHieu,
					phuHieuBienHieuWrapper._phuHieuBienHieu)) {
			return true;
		}

		return false;
	}

	@Override
	public PhuHieuBienHieu getWrappedModel() {
		return _phuHieuBienHieu;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _phuHieuBienHieu.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _phuHieuBienHieu.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_phuHieuBienHieu.resetOriginalValues();
	}

	private final PhuHieuBienHieu _phuHieuBienHieu;
}