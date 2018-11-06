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
 * This class is a wrapper for {@link SRCPHBHGiayPhepVanTai}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SRCPHBHGiayPhepVanTai
 * @generated
 */
@ProviderType
public class SRCPHBHGiayPhepVanTaiWrapper implements SRCPHBHGiayPhepVanTai,
	ModelWrapper<SRCPHBHGiayPhepVanTai> {
	public SRCPHBHGiayPhepVanTaiWrapper(
		SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		_srcphbhGiayPhepVanTai = srcphbhGiayPhepVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return SRCPHBHGiayPhepVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return SRCPHBHGiayPhepVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("coquanquanly_id", getCoquanquanly_id());
		attributes.put("doanhnghiep_id", getDoanhnghiep_id());
		attributes.put("sogiayphep", getSogiayphep());
		attributes.put("lancapphep", getLancapphep());
		attributes.put("ngaycap", getNgaycap());
		attributes.put("nguoicap", getNguoicap());
		attributes.put("ngayhethan", getNgayhethan());
		attributes.put("nguoidieuhanh", getNguoidieuhanh());
		attributes.put("bangcap", getBangcap());
		attributes.put("ngaysinh", getNgaysinh());
		attributes.put("socmnd", getSocmnd());
		attributes.put("nguoiky", getNguoiky());
		attributes.put("nguoiky_id", getNguoiky_id());
		attributes.put("ngayky", getNgayky());
		attributes.put("ngay_thuhoi", getNgay_thuhoi());
		attributes.put("lydo_thuhoi", getLydo_thuhoi());
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

		Long coquanquanly_id = (Long)attributes.get("coquanquanly_id");

		if (coquanquanly_id != null) {
			setCoquanquanly_id(coquanquanly_id);
		}

		Long doanhnghiep_id = (Long)attributes.get("doanhnghiep_id");

		if (doanhnghiep_id != null) {
			setDoanhnghiep_id(doanhnghiep_id);
		}

		String sogiayphep = (String)attributes.get("sogiayphep");

		if (sogiayphep != null) {
			setSogiayphep(sogiayphep);
		}

		Integer lancapphep = (Integer)attributes.get("lancapphep");

		if (lancapphep != null) {
			setLancapphep(lancapphep);
		}

		Date ngaycap = (Date)attributes.get("ngaycap");

		if (ngaycap != null) {
			setNgaycap(ngaycap);
		}

		String nguoicap = (String)attributes.get("nguoicap");

		if (nguoicap != null) {
			setNguoicap(nguoicap);
		}

		Date ngayhethan = (Date)attributes.get("ngayhethan");

		if (ngayhethan != null) {
			setNgayhethan(ngayhethan);
		}

		String nguoidieuhanh = (String)attributes.get("nguoidieuhanh");

		if (nguoidieuhanh != null) {
			setNguoidieuhanh(nguoidieuhanh);
		}

		String bangcap = (String)attributes.get("bangcap");

		if (bangcap != null) {
			setBangcap(bangcap);
		}

		Date ngaysinh = (Date)attributes.get("ngaysinh");

		if (ngaysinh != null) {
			setNgaysinh(ngaysinh);
		}

		String socmnd = (String)attributes.get("socmnd");

		if (socmnd != null) {
			setSocmnd(socmnd);
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

		Date ngay_thuhoi = (Date)attributes.get("ngay_thuhoi");

		if (ngay_thuhoi != null) {
			setNgay_thuhoi(ngay_thuhoi);
		}

		String lydo_thuhoi = (String)attributes.get("lydo_thuhoi");

		if (lydo_thuhoi != null) {
			setLydo_thuhoi(lydo_thuhoi);
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
	public SRCPHBHGiayPhepVanTai toEscapedModel() {
		return new SRCPHBHGiayPhepVanTaiWrapper(_srcphbhGiayPhepVanTai.toEscapedModel());
	}

	@Override
	public SRCPHBHGiayPhepVanTai toUnescapedModel() {
		return new SRCPHBHGiayPhepVanTaiWrapper(_srcphbhGiayPhepVanTai.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _srcphbhGiayPhepVanTai.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _srcphbhGiayPhepVanTai.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _srcphbhGiayPhepVanTai.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _srcphbhGiayPhepVanTai.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SRCPHBHGiayPhepVanTai> toCacheModel() {
		return _srcphbhGiayPhepVanTai.toCacheModel();
	}

	@Override
	public int compareTo(SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		return _srcphbhGiayPhepVanTai.compareTo(srcphbhGiayPhepVanTai);
	}

	/**
	* Returns the lancapphep of this srcphbh giay phep van tai.
	*
	* @return the lancapphep of this srcphbh giay phep van tai
	*/
	@Override
	public int getLancapphep() {
		return _srcphbhGiayPhepVanTai.getLancapphep();
	}

	/**
	* Returns the trangthai of this srcphbh giay phep van tai.
	*
	* @return the trangthai of this srcphbh giay phep van tai
	*/
	@Override
	public int getTrangthai() {
		return _srcphbhGiayPhepVanTai.getTrangthai();
	}

	@Override
	public int hashCode() {
		return _srcphbhGiayPhepVanTai.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _srcphbhGiayPhepVanTai.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SRCPHBHGiayPhepVanTaiWrapper((SRCPHBHGiayPhepVanTai)_srcphbhGiayPhepVanTai.clone());
	}

	/**
	* Returns the bangcap of this srcphbh giay phep van tai.
	*
	* @return the bangcap of this srcphbh giay phep van tai
	*/
	@Override
	public java.lang.String getBangcap() {
		return _srcphbhGiayPhepVanTai.getBangcap();
	}

	/**
	* Returns the ghichu of this srcphbh giay phep van tai.
	*
	* @return the ghichu of this srcphbh giay phep van tai
	*/
	@Override
	public java.lang.String getGhichu() {
		return _srcphbhGiayPhepVanTai.getGhichu();
	}

	/**
	* Returns the lydo_thuhoi of this srcphbh giay phep van tai.
	*
	* @return the lydo_thuhoi of this srcphbh giay phep van tai
	*/
	@Override
	public java.lang.String getLydo_thuhoi() {
		return _srcphbhGiayPhepVanTai.getLydo_thuhoi();
	}

	/**
	* Returns the nguoicap of this srcphbh giay phep van tai.
	*
	* @return the nguoicap of this srcphbh giay phep van tai
	*/
	@Override
	public java.lang.String getNguoicap() {
		return _srcphbhGiayPhepVanTai.getNguoicap();
	}

	/**
	* Returns the nguoidieuhanh of this srcphbh giay phep van tai.
	*
	* @return the nguoidieuhanh of this srcphbh giay phep van tai
	*/
	@Override
	public java.lang.String getNguoidieuhanh() {
		return _srcphbhGiayPhepVanTai.getNguoidieuhanh();
	}

	/**
	* Returns the nguoiky of this srcphbh giay phep van tai.
	*
	* @return the nguoiky of this srcphbh giay phep van tai
	*/
	@Override
	public java.lang.String getNguoiky() {
		return _srcphbhGiayPhepVanTai.getNguoiky();
	}

	/**
	* Returns the socmnd of this srcphbh giay phep van tai.
	*
	* @return the socmnd of this srcphbh giay phep van tai
	*/
	@Override
	public java.lang.String getSocmnd() {
		return _srcphbhGiayPhepVanTai.getSocmnd();
	}

	/**
	* Returns the sogiayphep of this srcphbh giay phep van tai.
	*
	* @return the sogiayphep of this srcphbh giay phep van tai
	*/
	@Override
	public java.lang.String getSogiayphep() {
		return _srcphbhGiayPhepVanTai.getSogiayphep();
	}

	@Override
	public java.lang.String toString() {
		return _srcphbhGiayPhepVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _srcphbhGiayPhepVanTai.toXmlString();
	}

	/**
	* Returns the ngay_thuhoi of this srcphbh giay phep van tai.
	*
	* @return the ngay_thuhoi of this srcphbh giay phep van tai
	*/
	@Override
	public Date getNgay_thuhoi() {
		return _srcphbhGiayPhepVanTai.getNgay_thuhoi();
	}

	/**
	* Returns the ngaycap of this srcphbh giay phep van tai.
	*
	* @return the ngaycap of this srcphbh giay phep van tai
	*/
	@Override
	public Date getNgaycap() {
		return _srcphbhGiayPhepVanTai.getNgaycap();
	}

	/**
	* Returns the ngayhethan of this srcphbh giay phep van tai.
	*
	* @return the ngayhethan of this srcphbh giay phep van tai
	*/
	@Override
	public Date getNgayhethan() {
		return _srcphbhGiayPhepVanTai.getNgayhethan();
	}

	/**
	* Returns the ngayky of this srcphbh giay phep van tai.
	*
	* @return the ngayky of this srcphbh giay phep van tai
	*/
	@Override
	public Date getNgayky() {
		return _srcphbhGiayPhepVanTai.getNgayky();
	}

	/**
	* Returns the ngaysinh of this srcphbh giay phep van tai.
	*
	* @return the ngaysinh of this srcphbh giay phep van tai
	*/
	@Override
	public Date getNgaysinh() {
		return _srcphbhGiayPhepVanTai.getNgaysinh();
	}

	/**
	* Returns the coquanquanly_id of this srcphbh giay phep van tai.
	*
	* @return the coquanquanly_id of this srcphbh giay phep van tai
	*/
	@Override
	public long getCoquanquanly_id() {
		return _srcphbhGiayPhepVanTai.getCoquanquanly_id();
	}

	/**
	* Returns the doanhnghiep_id of this srcphbh giay phep van tai.
	*
	* @return the doanhnghiep_id of this srcphbh giay phep van tai
	*/
	@Override
	public long getDoanhnghiep_id() {
		return _srcphbhGiayPhepVanTai.getDoanhnghiep_id();
	}

	/**
	* Returns the ID of this srcphbh giay phep van tai.
	*
	* @return the ID of this srcphbh giay phep van tai
	*/
	@Override
	public long getId() {
		return _srcphbhGiayPhepVanTai.getId();
	}

	/**
	* Returns the nguoiky_id of this srcphbh giay phep van tai.
	*
	* @return the nguoiky_id of this srcphbh giay phep van tai
	*/
	@Override
	public long getNguoiky_id() {
		return _srcphbhGiayPhepVanTai.getNguoiky_id();
	}

	/**
	* Returns the primary key of this srcphbh giay phep van tai.
	*
	* @return the primary key of this srcphbh giay phep van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _srcphbhGiayPhepVanTai.getPrimaryKey();
	}

	@Override
	public void persist() {
		_srcphbhGiayPhepVanTai.persist();
	}

	/**
	* Sets the bangcap of this srcphbh giay phep van tai.
	*
	* @param bangcap the bangcap of this srcphbh giay phep van tai
	*/
	@Override
	public void setBangcap(java.lang.String bangcap) {
		_srcphbhGiayPhepVanTai.setBangcap(bangcap);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_srcphbhGiayPhepVanTai.setCachedModel(cachedModel);
	}

	/**
	* Sets the coquanquanly_id of this srcphbh giay phep van tai.
	*
	* @param coquanquanly_id the coquanquanly_id of this srcphbh giay phep van tai
	*/
	@Override
	public void setCoquanquanly_id(long coquanquanly_id) {
		_srcphbhGiayPhepVanTai.setCoquanquanly_id(coquanquanly_id);
	}

	/**
	* Sets the doanhnghiep_id of this srcphbh giay phep van tai.
	*
	* @param doanhnghiep_id the doanhnghiep_id of this srcphbh giay phep van tai
	*/
	@Override
	public void setDoanhnghiep_id(long doanhnghiep_id) {
		_srcphbhGiayPhepVanTai.setDoanhnghiep_id(doanhnghiep_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_srcphbhGiayPhepVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_srcphbhGiayPhepVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_srcphbhGiayPhepVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ghichu of this srcphbh giay phep van tai.
	*
	* @param ghichu the ghichu of this srcphbh giay phep van tai
	*/
	@Override
	public void setGhichu(java.lang.String ghichu) {
		_srcphbhGiayPhepVanTai.setGhichu(ghichu);
	}

	/**
	* Sets the ID of this srcphbh giay phep van tai.
	*
	* @param id the ID of this srcphbh giay phep van tai
	*/
	@Override
	public void setId(long id) {
		_srcphbhGiayPhepVanTai.setId(id);
	}

	/**
	* Sets the lancapphep of this srcphbh giay phep van tai.
	*
	* @param lancapphep the lancapphep of this srcphbh giay phep van tai
	*/
	@Override
	public void setLancapphep(int lancapphep) {
		_srcphbhGiayPhepVanTai.setLancapphep(lancapphep);
	}

	/**
	* Sets the lydo_thuhoi of this srcphbh giay phep van tai.
	*
	* @param lydo_thuhoi the lydo_thuhoi of this srcphbh giay phep van tai
	*/
	@Override
	public void setLydo_thuhoi(java.lang.String lydo_thuhoi) {
		_srcphbhGiayPhepVanTai.setLydo_thuhoi(lydo_thuhoi);
	}

	@Override
	public void setNew(boolean n) {
		_srcphbhGiayPhepVanTai.setNew(n);
	}

	/**
	* Sets the ngay_thuhoi of this srcphbh giay phep van tai.
	*
	* @param ngay_thuhoi the ngay_thuhoi of this srcphbh giay phep van tai
	*/
	@Override
	public void setNgay_thuhoi(Date ngay_thuhoi) {
		_srcphbhGiayPhepVanTai.setNgay_thuhoi(ngay_thuhoi);
	}

	/**
	* Sets the ngaycap of this srcphbh giay phep van tai.
	*
	* @param ngaycap the ngaycap of this srcphbh giay phep van tai
	*/
	@Override
	public void setNgaycap(Date ngaycap) {
		_srcphbhGiayPhepVanTai.setNgaycap(ngaycap);
	}

	/**
	* Sets the ngayhethan of this srcphbh giay phep van tai.
	*
	* @param ngayhethan the ngayhethan of this srcphbh giay phep van tai
	*/
	@Override
	public void setNgayhethan(Date ngayhethan) {
		_srcphbhGiayPhepVanTai.setNgayhethan(ngayhethan);
	}

	/**
	* Sets the ngayky of this srcphbh giay phep van tai.
	*
	* @param ngayky the ngayky of this srcphbh giay phep van tai
	*/
	@Override
	public void setNgayky(Date ngayky) {
		_srcphbhGiayPhepVanTai.setNgayky(ngayky);
	}

	/**
	* Sets the ngaysinh of this srcphbh giay phep van tai.
	*
	* @param ngaysinh the ngaysinh of this srcphbh giay phep van tai
	*/
	@Override
	public void setNgaysinh(Date ngaysinh) {
		_srcphbhGiayPhepVanTai.setNgaysinh(ngaysinh);
	}

	/**
	* Sets the nguoicap of this srcphbh giay phep van tai.
	*
	* @param nguoicap the nguoicap of this srcphbh giay phep van tai
	*/
	@Override
	public void setNguoicap(java.lang.String nguoicap) {
		_srcphbhGiayPhepVanTai.setNguoicap(nguoicap);
	}

	/**
	* Sets the nguoidieuhanh of this srcphbh giay phep van tai.
	*
	* @param nguoidieuhanh the nguoidieuhanh of this srcphbh giay phep van tai
	*/
	@Override
	public void setNguoidieuhanh(java.lang.String nguoidieuhanh) {
		_srcphbhGiayPhepVanTai.setNguoidieuhanh(nguoidieuhanh);
	}

	/**
	* Sets the nguoiky of this srcphbh giay phep van tai.
	*
	* @param nguoiky the nguoiky of this srcphbh giay phep van tai
	*/
	@Override
	public void setNguoiky(java.lang.String nguoiky) {
		_srcphbhGiayPhepVanTai.setNguoiky(nguoiky);
	}

	/**
	* Sets the nguoiky_id of this srcphbh giay phep van tai.
	*
	* @param nguoiky_id the nguoiky_id of this srcphbh giay phep van tai
	*/
	@Override
	public void setNguoiky_id(long nguoiky_id) {
		_srcphbhGiayPhepVanTai.setNguoiky_id(nguoiky_id);
	}

	/**
	* Sets the primary key of this srcphbh giay phep van tai.
	*
	* @param primaryKey the primary key of this srcphbh giay phep van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_srcphbhGiayPhepVanTai.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_srcphbhGiayPhepVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the socmnd of this srcphbh giay phep van tai.
	*
	* @param socmnd the socmnd of this srcphbh giay phep van tai
	*/
	@Override
	public void setSocmnd(java.lang.String socmnd) {
		_srcphbhGiayPhepVanTai.setSocmnd(socmnd);
	}

	/**
	* Sets the sogiayphep of this srcphbh giay phep van tai.
	*
	* @param sogiayphep the sogiayphep of this srcphbh giay phep van tai
	*/
	@Override
	public void setSogiayphep(java.lang.String sogiayphep) {
		_srcphbhGiayPhepVanTai.setSogiayphep(sogiayphep);
	}

	/**
	* Sets the trangthai of this srcphbh giay phep van tai.
	*
	* @param trangthai the trangthai of this srcphbh giay phep van tai
	*/
	@Override
	public void setTrangthai(int trangthai) {
		_srcphbhGiayPhepVanTai.setTrangthai(trangthai);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SRCPHBHGiayPhepVanTaiWrapper)) {
			return false;
		}

		SRCPHBHGiayPhepVanTaiWrapper srcphbhGiayPhepVanTaiWrapper = (SRCPHBHGiayPhepVanTaiWrapper)obj;

		if (Objects.equals(_srcphbhGiayPhepVanTai,
					srcphbhGiayPhepVanTaiWrapper._srcphbhGiayPhepVanTai)) {
			return true;
		}

		return false;
	}

	@Override
	public SRCPHBHGiayPhepVanTai getWrappedModel() {
		return _srcphbhGiayPhepVanTai;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _srcphbhGiayPhepVanTai.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _srcphbhGiayPhepVanTai.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_srcphbhGiayPhepVanTai.resetOriginalValues();
	}

	private final SRCPHBHGiayPhepVanTai _srcphbhGiayPhepVanTai;
}