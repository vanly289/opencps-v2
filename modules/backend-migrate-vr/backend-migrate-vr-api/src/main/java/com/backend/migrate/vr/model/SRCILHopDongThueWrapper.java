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
 * This class is a wrapper for {@link SRCILHopDongThue}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SRCILHopDongThue
 * @generated
 */
@ProviderType
public class SRCILHopDongThueWrapper implements SRCILHopDongThue,
	ModelWrapper<SRCILHopDongThue> {
	public SRCILHopDongThueWrapper(SRCILHopDongThue srcilHopDongThue) {
		_srcilHopDongThue = srcilHopDongThue;
	}

	@Override
	public Class<?> getModelClass() {
		return SRCILHopDongThue.class;
	}

	@Override
	public String getModelClassName() {
		return SRCILHopDongThue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phuongtien_id", getPhuongtien_id());
		attributes.put("loaihinhthue_id", getLoaihinhthue_id());
		attributes.put("tendoituongchothue", getTendoituongchothue());
		attributes.put("diachi_doituong_tinh_id", getDiachi_doituong_tinh_id());
		attributes.put("diachi_doituong_huyen_id", getDiachi_doituong_huyen_id());
		attributes.put("diachi_doituong_xa_id", getDiachi_doituong_xa_id());
		attributes.put("diachi_doituong_chitiet", getDiachi_doituong_chitiet());
		attributes.put("ngayky", getNgayky());
		attributes.put("thoihan", getThoihan());
		attributes.put("la_hopdongcuoi", getLa_hopdongcuoi());
		attributes.put("ghichu", getGhichu());
		attributes.put("trangthai", getTrangthai());

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

		Long loaihinhthue_id = (Long)attributes.get("loaihinhthue_id");

		if (loaihinhthue_id != null) {
			setLoaihinhthue_id(loaihinhthue_id);
		}

		String tendoituongchothue = (String)attributes.get("tendoituongchothue");

		if (tendoituongchothue != null) {
			setTendoituongchothue(tendoituongchothue);
		}

		Long diachi_doituong_tinh_id = (Long)attributes.get(
				"diachi_doituong_tinh_id");

		if (diachi_doituong_tinh_id != null) {
			setDiachi_doituong_tinh_id(diachi_doituong_tinh_id);
		}

		Long diachi_doituong_huyen_id = (Long)attributes.get(
				"diachi_doituong_huyen_id");

		if (diachi_doituong_huyen_id != null) {
			setDiachi_doituong_huyen_id(diachi_doituong_huyen_id);
		}

		Long diachi_doituong_xa_id = (Long)attributes.get(
				"diachi_doituong_xa_id");

		if (diachi_doituong_xa_id != null) {
			setDiachi_doituong_xa_id(diachi_doituong_xa_id);
		}

		String diachi_doituong_chitiet = (String)attributes.get(
				"diachi_doituong_chitiet");

		if (diachi_doituong_chitiet != null) {
			setDiachi_doituong_chitiet(diachi_doituong_chitiet);
		}

		Date ngayky = (Date)attributes.get("ngayky");

		if (ngayky != null) {
			setNgayky(ngayky);
		}

		Date thoihan = (Date)attributes.get("thoihan");

		if (thoihan != null) {
			setThoihan(thoihan);
		}

		Integer la_hopdongcuoi = (Integer)attributes.get("la_hopdongcuoi");

		if (la_hopdongcuoi != null) {
			setLa_hopdongcuoi(la_hopdongcuoi);
		}

		String ghichu = (String)attributes.get("ghichu");

		if (ghichu != null) {
			setGhichu(ghichu);
		}

		Integer trangthai = (Integer)attributes.get("trangthai");

		if (trangthai != null) {
			setTrangthai(trangthai);
		}
	}

	@Override
	public SRCILHopDongThue toEscapedModel() {
		return new SRCILHopDongThueWrapper(_srcilHopDongThue.toEscapedModel());
	}

	@Override
	public SRCILHopDongThue toUnescapedModel() {
		return new SRCILHopDongThueWrapper(_srcilHopDongThue.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _srcilHopDongThue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _srcilHopDongThue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _srcilHopDongThue.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _srcilHopDongThue.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SRCILHopDongThue> toCacheModel() {
		return _srcilHopDongThue.toCacheModel();
	}

	@Override
	public int compareTo(SRCILHopDongThue srcilHopDongThue) {
		return _srcilHopDongThue.compareTo(srcilHopDongThue);
	}

	/**
	* Returns the la_hopdongcuoi of this srcil hop dong thue.
	*
	* @return the la_hopdongcuoi of this srcil hop dong thue
	*/
	@Override
	public int getLa_hopdongcuoi() {
		return _srcilHopDongThue.getLa_hopdongcuoi();
	}

	/**
	* Returns the trangthai of this srcil hop dong thue.
	*
	* @return the trangthai of this srcil hop dong thue
	*/
	@Override
	public int getTrangthai() {
		return _srcilHopDongThue.getTrangthai();
	}

	@Override
	public int hashCode() {
		return _srcilHopDongThue.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _srcilHopDongThue.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SRCILHopDongThueWrapper((SRCILHopDongThue)_srcilHopDongThue.clone());
	}

	/**
	* Returns the diachi_doituong_chitiet of this srcil hop dong thue.
	*
	* @return the diachi_doituong_chitiet of this srcil hop dong thue
	*/
	@Override
	public java.lang.String getDiachi_doituong_chitiet() {
		return _srcilHopDongThue.getDiachi_doituong_chitiet();
	}

	/**
	* Returns the ghichu of this srcil hop dong thue.
	*
	* @return the ghichu of this srcil hop dong thue
	*/
	@Override
	public java.lang.String getGhichu() {
		return _srcilHopDongThue.getGhichu();
	}

	/**
	* Returns the tendoituongchothue of this srcil hop dong thue.
	*
	* @return the tendoituongchothue of this srcil hop dong thue
	*/
	@Override
	public java.lang.String getTendoituongchothue() {
		return _srcilHopDongThue.getTendoituongchothue();
	}

	@Override
	public java.lang.String toString() {
		return _srcilHopDongThue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _srcilHopDongThue.toXmlString();
	}

	/**
	* Returns the ngayky of this srcil hop dong thue.
	*
	* @return the ngayky of this srcil hop dong thue
	*/
	@Override
	public Date getNgayky() {
		return _srcilHopDongThue.getNgayky();
	}

	/**
	* Returns the thoihan of this srcil hop dong thue.
	*
	* @return the thoihan of this srcil hop dong thue
	*/
	@Override
	public Date getThoihan() {
		return _srcilHopDongThue.getThoihan();
	}

	/**
	* Returns the diachi_doituong_huyen_id of this srcil hop dong thue.
	*
	* @return the diachi_doituong_huyen_id of this srcil hop dong thue
	*/
	@Override
	public long getDiachi_doituong_huyen_id() {
		return _srcilHopDongThue.getDiachi_doituong_huyen_id();
	}

	/**
	* Returns the diachi_doituong_tinh_id of this srcil hop dong thue.
	*
	* @return the diachi_doituong_tinh_id of this srcil hop dong thue
	*/
	@Override
	public long getDiachi_doituong_tinh_id() {
		return _srcilHopDongThue.getDiachi_doituong_tinh_id();
	}

	/**
	* Returns the diachi_doituong_xa_id of this srcil hop dong thue.
	*
	* @return the diachi_doituong_xa_id of this srcil hop dong thue
	*/
	@Override
	public long getDiachi_doituong_xa_id() {
		return _srcilHopDongThue.getDiachi_doituong_xa_id();
	}

	/**
	* Returns the ID of this srcil hop dong thue.
	*
	* @return the ID of this srcil hop dong thue
	*/
	@Override
	public long getId() {
		return _srcilHopDongThue.getId();
	}

	/**
	* Returns the loaihinhthue_id of this srcil hop dong thue.
	*
	* @return the loaihinhthue_id of this srcil hop dong thue
	*/
	@Override
	public long getLoaihinhthue_id() {
		return _srcilHopDongThue.getLoaihinhthue_id();
	}

	/**
	* Returns the phuongtien_id of this srcil hop dong thue.
	*
	* @return the phuongtien_id of this srcil hop dong thue
	*/
	@Override
	public long getPhuongtien_id() {
		return _srcilHopDongThue.getPhuongtien_id();
	}

	/**
	* Returns the primary key of this srcil hop dong thue.
	*
	* @return the primary key of this srcil hop dong thue
	*/
	@Override
	public long getPrimaryKey() {
		return _srcilHopDongThue.getPrimaryKey();
	}

	@Override
	public void persist() {
		_srcilHopDongThue.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_srcilHopDongThue.setCachedModel(cachedModel);
	}

	/**
	* Sets the diachi_doituong_chitiet of this srcil hop dong thue.
	*
	* @param diachi_doituong_chitiet the diachi_doituong_chitiet of this srcil hop dong thue
	*/
	@Override
	public void setDiachi_doituong_chitiet(
		java.lang.String diachi_doituong_chitiet) {
		_srcilHopDongThue.setDiachi_doituong_chitiet(diachi_doituong_chitiet);
	}

	/**
	* Sets the diachi_doituong_huyen_id of this srcil hop dong thue.
	*
	* @param diachi_doituong_huyen_id the diachi_doituong_huyen_id of this srcil hop dong thue
	*/
	@Override
	public void setDiachi_doituong_huyen_id(long diachi_doituong_huyen_id) {
		_srcilHopDongThue.setDiachi_doituong_huyen_id(diachi_doituong_huyen_id);
	}

	/**
	* Sets the diachi_doituong_tinh_id of this srcil hop dong thue.
	*
	* @param diachi_doituong_tinh_id the diachi_doituong_tinh_id of this srcil hop dong thue
	*/
	@Override
	public void setDiachi_doituong_tinh_id(long diachi_doituong_tinh_id) {
		_srcilHopDongThue.setDiachi_doituong_tinh_id(diachi_doituong_tinh_id);
	}

	/**
	* Sets the diachi_doituong_xa_id of this srcil hop dong thue.
	*
	* @param diachi_doituong_xa_id the diachi_doituong_xa_id of this srcil hop dong thue
	*/
	@Override
	public void setDiachi_doituong_xa_id(long diachi_doituong_xa_id) {
		_srcilHopDongThue.setDiachi_doituong_xa_id(diachi_doituong_xa_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_srcilHopDongThue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_srcilHopDongThue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_srcilHopDongThue.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ghichu of this srcil hop dong thue.
	*
	* @param ghichu the ghichu of this srcil hop dong thue
	*/
	@Override
	public void setGhichu(java.lang.String ghichu) {
		_srcilHopDongThue.setGhichu(ghichu);
	}

	/**
	* Sets the ID of this srcil hop dong thue.
	*
	* @param id the ID of this srcil hop dong thue
	*/
	@Override
	public void setId(long id) {
		_srcilHopDongThue.setId(id);
	}

	/**
	* Sets the la_hopdongcuoi of this srcil hop dong thue.
	*
	* @param la_hopdongcuoi the la_hopdongcuoi of this srcil hop dong thue
	*/
	@Override
	public void setLa_hopdongcuoi(int la_hopdongcuoi) {
		_srcilHopDongThue.setLa_hopdongcuoi(la_hopdongcuoi);
	}

	/**
	* Sets the loaihinhthue_id of this srcil hop dong thue.
	*
	* @param loaihinhthue_id the loaihinhthue_id of this srcil hop dong thue
	*/
	@Override
	public void setLoaihinhthue_id(long loaihinhthue_id) {
		_srcilHopDongThue.setLoaihinhthue_id(loaihinhthue_id);
	}

	@Override
	public void setNew(boolean n) {
		_srcilHopDongThue.setNew(n);
	}

	/**
	* Sets the ngayky of this srcil hop dong thue.
	*
	* @param ngayky the ngayky of this srcil hop dong thue
	*/
	@Override
	public void setNgayky(Date ngayky) {
		_srcilHopDongThue.setNgayky(ngayky);
	}

	/**
	* Sets the phuongtien_id of this srcil hop dong thue.
	*
	* @param phuongtien_id the phuongtien_id of this srcil hop dong thue
	*/
	@Override
	public void setPhuongtien_id(long phuongtien_id) {
		_srcilHopDongThue.setPhuongtien_id(phuongtien_id);
	}

	/**
	* Sets the primary key of this srcil hop dong thue.
	*
	* @param primaryKey the primary key of this srcil hop dong thue
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_srcilHopDongThue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_srcilHopDongThue.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tendoituongchothue of this srcil hop dong thue.
	*
	* @param tendoituongchothue the tendoituongchothue of this srcil hop dong thue
	*/
	@Override
	public void setTendoituongchothue(java.lang.String tendoituongchothue) {
		_srcilHopDongThue.setTendoituongchothue(tendoituongchothue);
	}

	/**
	* Sets the thoihan of this srcil hop dong thue.
	*
	* @param thoihan the thoihan of this srcil hop dong thue
	*/
	@Override
	public void setThoihan(Date thoihan) {
		_srcilHopDongThue.setThoihan(thoihan);
	}

	/**
	* Sets the trangthai of this srcil hop dong thue.
	*
	* @param trangthai the trangthai of this srcil hop dong thue
	*/
	@Override
	public void setTrangthai(int trangthai) {
		_srcilHopDongThue.setTrangthai(trangthai);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SRCILHopDongThueWrapper)) {
			return false;
		}

		SRCILHopDongThueWrapper srcilHopDongThueWrapper = (SRCILHopDongThueWrapper)obj;

		if (Objects.equals(_srcilHopDongThue,
					srcilHopDongThueWrapper._srcilHopDongThue)) {
			return true;
		}

		return false;
	}

	@Override
	public SRCILHopDongThue getWrappedModel() {
		return _srcilHopDongThue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _srcilHopDongThue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _srcilHopDongThue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_srcilHopDongThue.resetOriginalValues();
	}

	private final SRCILHopDongThue _srcilHopDongThue;
}