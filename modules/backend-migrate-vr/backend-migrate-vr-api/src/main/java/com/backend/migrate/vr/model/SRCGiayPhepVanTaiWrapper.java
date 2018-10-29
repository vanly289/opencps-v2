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
 * This class is a wrapper for {@link SRCGiayPhepVanTai}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SRCGiayPhepVanTai
 * @generated
 */
@ProviderType
public class SRCGiayPhepVanTaiWrapper implements SRCGiayPhepVanTai,
	ModelWrapper<SRCGiayPhepVanTai> {
	public SRCGiayPhepVanTaiWrapper(SRCGiayPhepVanTai srcGiayPhepVanTai) {
		_srcGiayPhepVanTai = srcGiayPhepVanTai;
	}

	@Override
	public Class<?> getModelClass() {
		return SRCGiayPhepVanTai.class;
	}

	@Override
	public String getModelClassName() {
		return SRCGiayPhepVanTai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("coquanquanly_id", getCoquanquanly_id());
		attributes.put("ten_coquancapphep", getTen_coquancapphep());
		attributes.put("doanhnghiep_id", getDoanhnghiep_id());
		attributes.put("ten_doanhnghiep", getTen_doanhnghiep());
		attributes.put("diachi_doanhnghiep", getDiachi_doanhnghiep());
		attributes.put("dienthoai_doanhnghiep", getDienthoai_doanhnghiep());
		attributes.put("fax_doanhnghiep", getFax_doanhnghiep());
		attributes.put("email_doanhnghiep", getEmail_doanhnghiep());
		attributes.put("website_doanhnghiep", getWebsite_doanhnghiep());
		attributes.put("ngay_ky", getNgay_ky());
		attributes.put("ten_nguoiky", getTen_nguoiky());
		attributes.put("nguoi_ky_id", getNguoi_ky_id());
		attributes.put("url_file_gpvt", getUrl_file_gpvt());
		attributes.put("sogiayphep", getSogiayphep());
		attributes.put("lancapphep", getLancapphep());
		attributes.put("ngaycap", getNgaycap());
		attributes.put("nguoicap", getNguoicap());
		attributes.put("ngayhethan", getNgayhethan());
		attributes.put("ngay_thuhoi", getNgay_thuhoi());
		attributes.put("lydo_thuhoi", getLydo_thuhoi());
		attributes.put("ghichu", getGhichu());
		attributes.put("trangthai", getTrangthai());
		attributes.put("quocgia_id", getQuocgia_id());

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

		String ten_coquancapphep = (String)attributes.get("ten_coquancapphep");

		if (ten_coquancapphep != null) {
			setTen_coquancapphep(ten_coquancapphep);
		}

		Long doanhnghiep_id = (Long)attributes.get("doanhnghiep_id");

		if (doanhnghiep_id != null) {
			setDoanhnghiep_id(doanhnghiep_id);
		}

		String ten_doanhnghiep = (String)attributes.get("ten_doanhnghiep");

		if (ten_doanhnghiep != null) {
			setTen_doanhnghiep(ten_doanhnghiep);
		}

		String diachi_doanhnghiep = (String)attributes.get("diachi_doanhnghiep");

		if (diachi_doanhnghiep != null) {
			setDiachi_doanhnghiep(diachi_doanhnghiep);
		}

		String dienthoai_doanhnghiep = (String)attributes.get(
				"dienthoai_doanhnghiep");

		if (dienthoai_doanhnghiep != null) {
			setDienthoai_doanhnghiep(dienthoai_doanhnghiep);
		}

		String fax_doanhnghiep = (String)attributes.get("fax_doanhnghiep");

		if (fax_doanhnghiep != null) {
			setFax_doanhnghiep(fax_doanhnghiep);
		}

		String email_doanhnghiep = (String)attributes.get("email_doanhnghiep");

		if (email_doanhnghiep != null) {
			setEmail_doanhnghiep(email_doanhnghiep);
		}

		String website_doanhnghiep = (String)attributes.get(
				"website_doanhnghiep");

		if (website_doanhnghiep != null) {
			setWebsite_doanhnghiep(website_doanhnghiep);
		}

		Date ngay_ky = (Date)attributes.get("ngay_ky");

		if (ngay_ky != null) {
			setNgay_ky(ngay_ky);
		}

		String ten_nguoiky = (String)attributes.get("ten_nguoiky");

		if (ten_nguoiky != null) {
			setTen_nguoiky(ten_nguoiky);
		}

		Long nguoi_ky_id = (Long)attributes.get("nguoi_ky_id");

		if (nguoi_ky_id != null) {
			setNguoi_ky_id(nguoi_ky_id);
		}

		String url_file_gpvt = (String)attributes.get("url_file_gpvt");

		if (url_file_gpvt != null) {
			setUrl_file_gpvt(url_file_gpvt);
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

		Long quocgia_id = (Long)attributes.get("quocgia_id");

		if (quocgia_id != null) {
			setQuocgia_id(quocgia_id);
		}
	}

	@Override
	public SRCGiayPhepVanTai toEscapedModel() {
		return new SRCGiayPhepVanTaiWrapper(_srcGiayPhepVanTai.toEscapedModel());
	}

	@Override
	public SRCGiayPhepVanTai toUnescapedModel() {
		return new SRCGiayPhepVanTaiWrapper(_srcGiayPhepVanTai.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _srcGiayPhepVanTai.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _srcGiayPhepVanTai.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _srcGiayPhepVanTai.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _srcGiayPhepVanTai.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SRCGiayPhepVanTai> toCacheModel() {
		return _srcGiayPhepVanTai.toCacheModel();
	}

	@Override
	public int compareTo(SRCGiayPhepVanTai srcGiayPhepVanTai) {
		return _srcGiayPhepVanTai.compareTo(srcGiayPhepVanTai);
	}

	/**
	* Returns the lancapphep of this src giay phep van tai.
	*
	* @return the lancapphep of this src giay phep van tai
	*/
	@Override
	public int getLancapphep() {
		return _srcGiayPhepVanTai.getLancapphep();
	}

	/**
	* Returns the trangthai of this src giay phep van tai.
	*
	* @return the trangthai of this src giay phep van tai
	*/
	@Override
	public int getTrangthai() {
		return _srcGiayPhepVanTai.getTrangthai();
	}

	@Override
	public int hashCode() {
		return _srcGiayPhepVanTai.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _srcGiayPhepVanTai.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SRCGiayPhepVanTaiWrapper((SRCGiayPhepVanTai)_srcGiayPhepVanTai.clone());
	}

	/**
	* Returns the diachi_doanhnghiep of this src giay phep van tai.
	*
	* @return the diachi_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public java.lang.String getDiachi_doanhnghiep() {
		return _srcGiayPhepVanTai.getDiachi_doanhnghiep();
	}

	/**
	* Returns the dienthoai_doanhnghiep of this src giay phep van tai.
	*
	* @return the dienthoai_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public java.lang.String getDienthoai_doanhnghiep() {
		return _srcGiayPhepVanTai.getDienthoai_doanhnghiep();
	}

	/**
	* Returns the email_doanhnghiep of this src giay phep van tai.
	*
	* @return the email_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public java.lang.String getEmail_doanhnghiep() {
		return _srcGiayPhepVanTai.getEmail_doanhnghiep();
	}

	/**
	* Returns the fax_doanhnghiep of this src giay phep van tai.
	*
	* @return the fax_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public java.lang.String getFax_doanhnghiep() {
		return _srcGiayPhepVanTai.getFax_doanhnghiep();
	}

	/**
	* Returns the ghichu of this src giay phep van tai.
	*
	* @return the ghichu of this src giay phep van tai
	*/
	@Override
	public java.lang.String getGhichu() {
		return _srcGiayPhepVanTai.getGhichu();
	}

	/**
	* Returns the lydo_thuhoi of this src giay phep van tai.
	*
	* @return the lydo_thuhoi of this src giay phep van tai
	*/
	@Override
	public java.lang.String getLydo_thuhoi() {
		return _srcGiayPhepVanTai.getLydo_thuhoi();
	}

	/**
	* Returns the nguoicap of this src giay phep van tai.
	*
	* @return the nguoicap of this src giay phep van tai
	*/
	@Override
	public java.lang.String getNguoicap() {
		return _srcGiayPhepVanTai.getNguoicap();
	}

	/**
	* Returns the sogiayphep of this src giay phep van tai.
	*
	* @return the sogiayphep of this src giay phep van tai
	*/
	@Override
	public java.lang.String getSogiayphep() {
		return _srcGiayPhepVanTai.getSogiayphep();
	}

	/**
	* Returns the ten_coquancapphep of this src giay phep van tai.
	*
	* @return the ten_coquancapphep of this src giay phep van tai
	*/
	@Override
	public java.lang.String getTen_coquancapphep() {
		return _srcGiayPhepVanTai.getTen_coquancapphep();
	}

	/**
	* Returns the ten_doanhnghiep of this src giay phep van tai.
	*
	* @return the ten_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public java.lang.String getTen_doanhnghiep() {
		return _srcGiayPhepVanTai.getTen_doanhnghiep();
	}

	/**
	* Returns the ten_nguoiky of this src giay phep van tai.
	*
	* @return the ten_nguoiky of this src giay phep van tai
	*/
	@Override
	public java.lang.String getTen_nguoiky() {
		return _srcGiayPhepVanTai.getTen_nguoiky();
	}

	/**
	* Returns the url_file_gpvt of this src giay phep van tai.
	*
	* @return the url_file_gpvt of this src giay phep van tai
	*/
	@Override
	public java.lang.String getUrl_file_gpvt() {
		return _srcGiayPhepVanTai.getUrl_file_gpvt();
	}

	/**
	* Returns the website_doanhnghiep of this src giay phep van tai.
	*
	* @return the website_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public java.lang.String getWebsite_doanhnghiep() {
		return _srcGiayPhepVanTai.getWebsite_doanhnghiep();
	}

	@Override
	public java.lang.String toString() {
		return _srcGiayPhepVanTai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _srcGiayPhepVanTai.toXmlString();
	}

	/**
	* Returns the ngay_ky of this src giay phep van tai.
	*
	* @return the ngay_ky of this src giay phep van tai
	*/
	@Override
	public Date getNgay_ky() {
		return _srcGiayPhepVanTai.getNgay_ky();
	}

	/**
	* Returns the ngay_thuhoi of this src giay phep van tai.
	*
	* @return the ngay_thuhoi of this src giay phep van tai
	*/
	@Override
	public Date getNgay_thuhoi() {
		return _srcGiayPhepVanTai.getNgay_thuhoi();
	}

	/**
	* Returns the ngaycap of this src giay phep van tai.
	*
	* @return the ngaycap of this src giay phep van tai
	*/
	@Override
	public Date getNgaycap() {
		return _srcGiayPhepVanTai.getNgaycap();
	}

	/**
	* Returns the ngayhethan of this src giay phep van tai.
	*
	* @return the ngayhethan of this src giay phep van tai
	*/
	@Override
	public Date getNgayhethan() {
		return _srcGiayPhepVanTai.getNgayhethan();
	}

	/**
	* Returns the coquanquanly_id of this src giay phep van tai.
	*
	* @return the coquanquanly_id of this src giay phep van tai
	*/
	@Override
	public long getCoquanquanly_id() {
		return _srcGiayPhepVanTai.getCoquanquanly_id();
	}

	/**
	* Returns the doanhnghiep_id of this src giay phep van tai.
	*
	* @return the doanhnghiep_id of this src giay phep van tai
	*/
	@Override
	public long getDoanhnghiep_id() {
		return _srcGiayPhepVanTai.getDoanhnghiep_id();
	}

	/**
	* Returns the ID of this src giay phep van tai.
	*
	* @return the ID of this src giay phep van tai
	*/
	@Override
	public long getId() {
		return _srcGiayPhepVanTai.getId();
	}

	/**
	* Returns the nguoi_ky_id of this src giay phep van tai.
	*
	* @return the nguoi_ky_id of this src giay phep van tai
	*/
	@Override
	public long getNguoi_ky_id() {
		return _srcGiayPhepVanTai.getNguoi_ky_id();
	}

	/**
	* Returns the primary key of this src giay phep van tai.
	*
	* @return the primary key of this src giay phep van tai
	*/
	@Override
	public long getPrimaryKey() {
		return _srcGiayPhepVanTai.getPrimaryKey();
	}

	/**
	* Returns the quocgia_id of this src giay phep van tai.
	*
	* @return the quocgia_id of this src giay phep van tai
	*/
	@Override
	public long getQuocgia_id() {
		return _srcGiayPhepVanTai.getQuocgia_id();
	}

	@Override
	public void persist() {
		_srcGiayPhepVanTai.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_srcGiayPhepVanTai.setCachedModel(cachedModel);
	}

	/**
	* Sets the coquanquanly_id of this src giay phep van tai.
	*
	* @param coquanquanly_id the coquanquanly_id of this src giay phep van tai
	*/
	@Override
	public void setCoquanquanly_id(long coquanquanly_id) {
		_srcGiayPhepVanTai.setCoquanquanly_id(coquanquanly_id);
	}

	/**
	* Sets the diachi_doanhnghiep of this src giay phep van tai.
	*
	* @param diachi_doanhnghiep the diachi_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public void setDiachi_doanhnghiep(java.lang.String diachi_doanhnghiep) {
		_srcGiayPhepVanTai.setDiachi_doanhnghiep(diachi_doanhnghiep);
	}

	/**
	* Sets the dienthoai_doanhnghiep of this src giay phep van tai.
	*
	* @param dienthoai_doanhnghiep the dienthoai_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public void setDienthoai_doanhnghiep(java.lang.String dienthoai_doanhnghiep) {
		_srcGiayPhepVanTai.setDienthoai_doanhnghiep(dienthoai_doanhnghiep);
	}

	/**
	* Sets the doanhnghiep_id of this src giay phep van tai.
	*
	* @param doanhnghiep_id the doanhnghiep_id of this src giay phep van tai
	*/
	@Override
	public void setDoanhnghiep_id(long doanhnghiep_id) {
		_srcGiayPhepVanTai.setDoanhnghiep_id(doanhnghiep_id);
	}

	/**
	* Sets the email_doanhnghiep of this src giay phep van tai.
	*
	* @param email_doanhnghiep the email_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public void setEmail_doanhnghiep(java.lang.String email_doanhnghiep) {
		_srcGiayPhepVanTai.setEmail_doanhnghiep(email_doanhnghiep);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_srcGiayPhepVanTai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_srcGiayPhepVanTai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_srcGiayPhepVanTai.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fax_doanhnghiep of this src giay phep van tai.
	*
	* @param fax_doanhnghiep the fax_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public void setFax_doanhnghiep(java.lang.String fax_doanhnghiep) {
		_srcGiayPhepVanTai.setFax_doanhnghiep(fax_doanhnghiep);
	}

	/**
	* Sets the ghichu of this src giay phep van tai.
	*
	* @param ghichu the ghichu of this src giay phep van tai
	*/
	@Override
	public void setGhichu(java.lang.String ghichu) {
		_srcGiayPhepVanTai.setGhichu(ghichu);
	}

	/**
	* Sets the ID of this src giay phep van tai.
	*
	* @param id the ID of this src giay phep van tai
	*/
	@Override
	public void setId(long id) {
		_srcGiayPhepVanTai.setId(id);
	}

	/**
	* Sets the lancapphep of this src giay phep van tai.
	*
	* @param lancapphep the lancapphep of this src giay phep van tai
	*/
	@Override
	public void setLancapphep(int lancapphep) {
		_srcGiayPhepVanTai.setLancapphep(lancapphep);
	}

	/**
	* Sets the lydo_thuhoi of this src giay phep van tai.
	*
	* @param lydo_thuhoi the lydo_thuhoi of this src giay phep van tai
	*/
	@Override
	public void setLydo_thuhoi(java.lang.String lydo_thuhoi) {
		_srcGiayPhepVanTai.setLydo_thuhoi(lydo_thuhoi);
	}

	@Override
	public void setNew(boolean n) {
		_srcGiayPhepVanTai.setNew(n);
	}

	/**
	* Sets the ngay_ky of this src giay phep van tai.
	*
	* @param ngay_ky the ngay_ky of this src giay phep van tai
	*/
	@Override
	public void setNgay_ky(Date ngay_ky) {
		_srcGiayPhepVanTai.setNgay_ky(ngay_ky);
	}

	/**
	* Sets the ngay_thuhoi of this src giay phep van tai.
	*
	* @param ngay_thuhoi the ngay_thuhoi of this src giay phep van tai
	*/
	@Override
	public void setNgay_thuhoi(Date ngay_thuhoi) {
		_srcGiayPhepVanTai.setNgay_thuhoi(ngay_thuhoi);
	}

	/**
	* Sets the ngaycap of this src giay phep van tai.
	*
	* @param ngaycap the ngaycap of this src giay phep van tai
	*/
	@Override
	public void setNgaycap(Date ngaycap) {
		_srcGiayPhepVanTai.setNgaycap(ngaycap);
	}

	/**
	* Sets the ngayhethan of this src giay phep van tai.
	*
	* @param ngayhethan the ngayhethan of this src giay phep van tai
	*/
	@Override
	public void setNgayhethan(Date ngayhethan) {
		_srcGiayPhepVanTai.setNgayhethan(ngayhethan);
	}

	/**
	* Sets the nguoi_ky_id of this src giay phep van tai.
	*
	* @param nguoi_ky_id the nguoi_ky_id of this src giay phep van tai
	*/
	@Override
	public void setNguoi_ky_id(long nguoi_ky_id) {
		_srcGiayPhepVanTai.setNguoi_ky_id(nguoi_ky_id);
	}

	/**
	* Sets the nguoicap of this src giay phep van tai.
	*
	* @param nguoicap the nguoicap of this src giay phep van tai
	*/
	@Override
	public void setNguoicap(java.lang.String nguoicap) {
		_srcGiayPhepVanTai.setNguoicap(nguoicap);
	}

	/**
	* Sets the primary key of this src giay phep van tai.
	*
	* @param primaryKey the primary key of this src giay phep van tai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_srcGiayPhepVanTai.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_srcGiayPhepVanTai.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the quocgia_id of this src giay phep van tai.
	*
	* @param quocgia_id the quocgia_id of this src giay phep van tai
	*/
	@Override
	public void setQuocgia_id(long quocgia_id) {
		_srcGiayPhepVanTai.setQuocgia_id(quocgia_id);
	}

	/**
	* Sets the sogiayphep of this src giay phep van tai.
	*
	* @param sogiayphep the sogiayphep of this src giay phep van tai
	*/
	@Override
	public void setSogiayphep(java.lang.String sogiayphep) {
		_srcGiayPhepVanTai.setSogiayphep(sogiayphep);
	}

	/**
	* Sets the ten_coquancapphep of this src giay phep van tai.
	*
	* @param ten_coquancapphep the ten_coquancapphep of this src giay phep van tai
	*/
	@Override
	public void setTen_coquancapphep(java.lang.String ten_coquancapphep) {
		_srcGiayPhepVanTai.setTen_coquancapphep(ten_coquancapphep);
	}

	/**
	* Sets the ten_doanhnghiep of this src giay phep van tai.
	*
	* @param ten_doanhnghiep the ten_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public void setTen_doanhnghiep(java.lang.String ten_doanhnghiep) {
		_srcGiayPhepVanTai.setTen_doanhnghiep(ten_doanhnghiep);
	}

	/**
	* Sets the ten_nguoiky of this src giay phep van tai.
	*
	* @param ten_nguoiky the ten_nguoiky of this src giay phep van tai
	*/
	@Override
	public void setTen_nguoiky(java.lang.String ten_nguoiky) {
		_srcGiayPhepVanTai.setTen_nguoiky(ten_nguoiky);
	}

	/**
	* Sets the trangthai of this src giay phep van tai.
	*
	* @param trangthai the trangthai of this src giay phep van tai
	*/
	@Override
	public void setTrangthai(int trangthai) {
		_srcGiayPhepVanTai.setTrangthai(trangthai);
	}

	/**
	* Sets the url_file_gpvt of this src giay phep van tai.
	*
	* @param url_file_gpvt the url_file_gpvt of this src giay phep van tai
	*/
	@Override
	public void setUrl_file_gpvt(java.lang.String url_file_gpvt) {
		_srcGiayPhepVanTai.setUrl_file_gpvt(url_file_gpvt);
	}

	/**
	* Sets the website_doanhnghiep of this src giay phep van tai.
	*
	* @param website_doanhnghiep the website_doanhnghiep of this src giay phep van tai
	*/
	@Override
	public void setWebsite_doanhnghiep(java.lang.String website_doanhnghiep) {
		_srcGiayPhepVanTai.setWebsite_doanhnghiep(website_doanhnghiep);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SRCGiayPhepVanTaiWrapper)) {
			return false;
		}

		SRCGiayPhepVanTaiWrapper srcGiayPhepVanTaiWrapper = (SRCGiayPhepVanTaiWrapper)obj;

		if (Objects.equals(_srcGiayPhepVanTai,
					srcGiayPhepVanTaiWrapper._srcGiayPhepVanTai)) {
			return true;
		}

		return false;
	}

	@Override
	public SRCGiayPhepVanTai getWrappedModel() {
		return _srcGiayPhepVanTai;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _srcGiayPhepVanTai.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _srcGiayPhepVanTai.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_srcGiayPhepVanTai.resetOriginalValues();
	}

	private final SRCGiayPhepVanTai _srcGiayPhepVanTai;
}