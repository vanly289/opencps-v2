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
 * This class is a wrapper for {@link DoanhNghiep}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DoanhNghiep
 * @generated
 */
@ProviderType
public class DoanhNghiepWrapper implements DoanhNghiep,
	ModelWrapper<DoanhNghiep> {
	public DoanhNghiepWrapper(DoanhNghiep doanhNghiep) {
		_doanhNghiep = doanhNghiep;
	}

	@Override
	public Class<?> getModelClass() {
		return DoanhNghiep.class;
	}

	@Override
	public String getModelClassName() {
		return DoanhNghiep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ten", getTen());
		attributes.put("ten_viettat", getTen_viettat());
		attributes.put("ten_tienganh", getTen_tienganh());
		attributes.put("sogcn_dkkd", getSogcn_dkkd());
		attributes.put("ngaycap_dkkd", getNgaycap_dkkd());
		attributes.put("ngayhethan_dkkd", getNgayhethan_dkkd());
		attributes.put("ten_donvicapphep", getTen_donvicapphep());
		attributes.put("masothue", getMasothue());
		attributes.put("ten_nguoidaidien", getTen_nguoidaidien());
		attributes.put("chucvu_nguoidaidien", getChucvu_nguoidaidien());
		attributes.put("gioitinh_nguoidaidien", getGioitinh_nguoidaidien());
		attributes.put("diachi_nguoidaidien", getDiachi_nguoidaidien());
		attributes.put("diachi_ndd_tinh_id", getDiachi_ndd_tinh_id());
		attributes.put("diachi_ndd_huyen_id", getDiachi_ndd_huyen_id());
		attributes.put("diachi_ndd_xa_id", getDiachi_ndd_xa_id());
		attributes.put("hktt_nguoidaidien", getHktt_nguoidaidien());
		attributes.put("dantoc_nguoidaidien_id", getDantoc_nguoidaidien_id());
		attributes.put("tongiao_nguoidaidien_id", getTongiao_nguoidaidien_id());
		attributes.put("quoctich_nguoidaidien_id", getQuoctich_nguoidaidien_id());
		attributes.put("ngaysinh_nguoidaidien", getNgaysinh_nguoidaidien());
		attributes.put("dienthoai_nguoidaidien", getDienthoai_nguoidaidien());
		attributes.put("giayto_canhan_nguoidaidien",
			getGiayto_canhan_nguoidaidien());
		attributes.put("giayto_ngaycap_nguoidaidien",
			getGiayto_ngaycap_nguoidaidien());
		attributes.put("giayto_noicap_nguoidaidien",
			getGiayto_noicap_nguoidaidien());
		attributes.put("loai_doanhnghiep_id", getLoai_doanhnghiep_id());
		attributes.put("diachi_trusochinh", getDiachi_trusochinh());
		attributes.put("diachi_truso_tinh_id", getDiachi_truso_tinh_id());
		attributes.put("diachi_truso_huyen_id", getDiachi_truso_huyen_id());
		attributes.put("diachi_truso_xa_id", getDiachi_truso_xa_id());
		attributes.put("dienthoai", getDienthoai());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("website", getWebsite());
		attributes.put("von_dieule", getVon_dieule());
		attributes.put("von_phapdinh", getVon_phapdinh());
		attributes.put("user_id", getUser_id());
		attributes.put("doituongsudung_id", getDoituongsudung_id());
		attributes.put("trangthai", getTrangthai());
		attributes.put("ngaytao", getNgaytao());
		attributes.put("ngaycap_taikhoan", getNgaycap_taikhoan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String ten = (String)attributes.get("ten");

		if (ten != null) {
			setTen(ten);
		}

		String ten_viettat = (String)attributes.get("ten_viettat");

		if (ten_viettat != null) {
			setTen_viettat(ten_viettat);
		}

		String ten_tienganh = (String)attributes.get("ten_tienganh");

		if (ten_tienganh != null) {
			setTen_tienganh(ten_tienganh);
		}

		String sogcn_dkkd = (String)attributes.get("sogcn_dkkd");

		if (sogcn_dkkd != null) {
			setSogcn_dkkd(sogcn_dkkd);
		}

		Date ngaycap_dkkd = (Date)attributes.get("ngaycap_dkkd");

		if (ngaycap_dkkd != null) {
			setNgaycap_dkkd(ngaycap_dkkd);
		}

		Date ngayhethan_dkkd = (Date)attributes.get("ngayhethan_dkkd");

		if (ngayhethan_dkkd != null) {
			setNgayhethan_dkkd(ngayhethan_dkkd);
		}

		String ten_donvicapphep = (String)attributes.get("ten_donvicapphep");

		if (ten_donvicapphep != null) {
			setTen_donvicapphep(ten_donvicapphep);
		}

		String masothue = (String)attributes.get("masothue");

		if (masothue != null) {
			setMasothue(masothue);
		}

		String ten_nguoidaidien = (String)attributes.get("ten_nguoidaidien");

		if (ten_nguoidaidien != null) {
			setTen_nguoidaidien(ten_nguoidaidien);
		}

		String chucvu_nguoidaidien = (String)attributes.get(
				"chucvu_nguoidaidien");

		if (chucvu_nguoidaidien != null) {
			setChucvu_nguoidaidien(chucvu_nguoidaidien);
		}

		Long gioitinh_nguoidaidien = (Long)attributes.get(
				"gioitinh_nguoidaidien");

		if (gioitinh_nguoidaidien != null) {
			setGioitinh_nguoidaidien(gioitinh_nguoidaidien);
		}

		String diachi_nguoidaidien = (String)attributes.get(
				"diachi_nguoidaidien");

		if (diachi_nguoidaidien != null) {
			setDiachi_nguoidaidien(diachi_nguoidaidien);
		}

		Long diachi_ndd_tinh_id = (Long)attributes.get("diachi_ndd_tinh_id");

		if (diachi_ndd_tinh_id != null) {
			setDiachi_ndd_tinh_id(diachi_ndd_tinh_id);
		}

		Long diachi_ndd_huyen_id = (Long)attributes.get("diachi_ndd_huyen_id");

		if (diachi_ndd_huyen_id != null) {
			setDiachi_ndd_huyen_id(diachi_ndd_huyen_id);
		}

		Long diachi_ndd_xa_id = (Long)attributes.get("diachi_ndd_xa_id");

		if (diachi_ndd_xa_id != null) {
			setDiachi_ndd_xa_id(diachi_ndd_xa_id);
		}

		String hktt_nguoidaidien = (String)attributes.get("hktt_nguoidaidien");

		if (hktt_nguoidaidien != null) {
			setHktt_nguoidaidien(hktt_nguoidaidien);
		}

		Long dantoc_nguoidaidien_id = (Long)attributes.get(
				"dantoc_nguoidaidien_id");

		if (dantoc_nguoidaidien_id != null) {
			setDantoc_nguoidaidien_id(dantoc_nguoidaidien_id);
		}

		Long tongiao_nguoidaidien_id = (Long)attributes.get(
				"tongiao_nguoidaidien_id");

		if (tongiao_nguoidaidien_id != null) {
			setTongiao_nguoidaidien_id(tongiao_nguoidaidien_id);
		}

		Long quoctich_nguoidaidien_id = (Long)attributes.get(
				"quoctich_nguoidaidien_id");

		if (quoctich_nguoidaidien_id != null) {
			setQuoctich_nguoidaidien_id(quoctich_nguoidaidien_id);
		}

		Date ngaysinh_nguoidaidien = (Date)attributes.get(
				"ngaysinh_nguoidaidien");

		if (ngaysinh_nguoidaidien != null) {
			setNgaysinh_nguoidaidien(ngaysinh_nguoidaidien);
		}

		String dienthoai_nguoidaidien = (String)attributes.get(
				"dienthoai_nguoidaidien");

		if (dienthoai_nguoidaidien != null) {
			setDienthoai_nguoidaidien(dienthoai_nguoidaidien);
		}

		String giayto_canhan_nguoidaidien = (String)attributes.get(
				"giayto_canhan_nguoidaidien");

		if (giayto_canhan_nguoidaidien != null) {
			setGiayto_canhan_nguoidaidien(giayto_canhan_nguoidaidien);
		}

		Date giayto_ngaycap_nguoidaidien = (Date)attributes.get(
				"giayto_ngaycap_nguoidaidien");

		if (giayto_ngaycap_nguoidaidien != null) {
			setGiayto_ngaycap_nguoidaidien(giayto_ngaycap_nguoidaidien);
		}

		String giayto_noicap_nguoidaidien = (String)attributes.get(
				"giayto_noicap_nguoidaidien");

		if (giayto_noicap_nguoidaidien != null) {
			setGiayto_noicap_nguoidaidien(giayto_noicap_nguoidaidien);
		}

		Long loai_doanhnghiep_id = (Long)attributes.get("loai_doanhnghiep_id");

		if (loai_doanhnghiep_id != null) {
			setLoai_doanhnghiep_id(loai_doanhnghiep_id);
		}

		String diachi_trusochinh = (String)attributes.get("diachi_trusochinh");

		if (diachi_trusochinh != null) {
			setDiachi_trusochinh(diachi_trusochinh);
		}

		Long diachi_truso_tinh_id = (Long)attributes.get("diachi_truso_tinh_id");

		if (diachi_truso_tinh_id != null) {
			setDiachi_truso_tinh_id(diachi_truso_tinh_id);
		}

		Long diachi_truso_huyen_id = (Long)attributes.get(
				"diachi_truso_huyen_id");

		if (diachi_truso_huyen_id != null) {
			setDiachi_truso_huyen_id(diachi_truso_huyen_id);
		}

		Long diachi_truso_xa_id = (Long)attributes.get("diachi_truso_xa_id");

		if (diachi_truso_xa_id != null) {
			setDiachi_truso_xa_id(diachi_truso_xa_id);
		}

		String dienthoai = (String)attributes.get("dienthoai");

		if (dienthoai != null) {
			setDienthoai(dienthoai);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String von_dieule = (String)attributes.get("von_dieule");

		if (von_dieule != null) {
			setVon_dieule(von_dieule);
		}

		String von_phapdinh = (String)attributes.get("von_phapdinh");

		if (von_phapdinh != null) {
			setVon_phapdinh(von_phapdinh);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long doituongsudung_id = (Long)attributes.get("doituongsudung_id");

		if (doituongsudung_id != null) {
			setDoituongsudung_id(doituongsudung_id);
		}

		Integer trangthai = (Integer)attributes.get("trangthai");

		if (trangthai != null) {
			setTrangthai(trangthai);
		}

		Date ngaytao = (Date)attributes.get("ngaytao");

		if (ngaytao != null) {
			setNgaytao(ngaytao);
		}

		Date ngaycap_taikhoan = (Date)attributes.get("ngaycap_taikhoan");

		if (ngaycap_taikhoan != null) {
			setNgaycap_taikhoan(ngaycap_taikhoan);
		}
	}

	@Override
	public DoanhNghiep toEscapedModel() {
		return new DoanhNghiepWrapper(_doanhNghiep.toEscapedModel());
	}

	@Override
	public DoanhNghiep toUnescapedModel() {
		return new DoanhNghiepWrapper(_doanhNghiep.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _doanhNghiep.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _doanhNghiep.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _doanhNghiep.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _doanhNghiep.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<DoanhNghiep> toCacheModel() {
		return _doanhNghiep.toCacheModel();
	}

	@Override
	public int compareTo(DoanhNghiep doanhNghiep) {
		return _doanhNghiep.compareTo(doanhNghiep);
	}

	/**
	* Returns the trangthai of this doanh nghiep.
	*
	* @return the trangthai of this doanh nghiep
	*/
	@Override
	public int getTrangthai() {
		return _doanhNghiep.getTrangthai();
	}

	@Override
	public int hashCode() {
		return _doanhNghiep.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _doanhNghiep.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DoanhNghiepWrapper((DoanhNghiep)_doanhNghiep.clone());
	}

	/**
	* Returns the chucvu_nguoidaidien of this doanh nghiep.
	*
	* @return the chucvu_nguoidaidien of this doanh nghiep
	*/
	@Override
	public java.lang.String getChucvu_nguoidaidien() {
		return _doanhNghiep.getChucvu_nguoidaidien();
	}

	/**
	* Returns the diachi_nguoidaidien of this doanh nghiep.
	*
	* @return the diachi_nguoidaidien of this doanh nghiep
	*/
	@Override
	public java.lang.String getDiachi_nguoidaidien() {
		return _doanhNghiep.getDiachi_nguoidaidien();
	}

	/**
	* Returns the diachi_trusochinh of this doanh nghiep.
	*
	* @return the diachi_trusochinh of this doanh nghiep
	*/
	@Override
	public java.lang.String getDiachi_trusochinh() {
		return _doanhNghiep.getDiachi_trusochinh();
	}

	/**
	* Returns the dienthoai of this doanh nghiep.
	*
	* @return the dienthoai of this doanh nghiep
	*/
	@Override
	public java.lang.String getDienthoai() {
		return _doanhNghiep.getDienthoai();
	}

	/**
	* Returns the dienthoai_nguoidaidien of this doanh nghiep.
	*
	* @return the dienthoai_nguoidaidien of this doanh nghiep
	*/
	@Override
	public java.lang.String getDienthoai_nguoidaidien() {
		return _doanhNghiep.getDienthoai_nguoidaidien();
	}

	/**
	* Returns the email of this doanh nghiep.
	*
	* @return the email of this doanh nghiep
	*/
	@Override
	public java.lang.String getEmail() {
		return _doanhNghiep.getEmail();
	}

	/**
	* Returns the fax of this doanh nghiep.
	*
	* @return the fax of this doanh nghiep
	*/
	@Override
	public java.lang.String getFax() {
		return _doanhNghiep.getFax();
	}

	/**
	* Returns the giayto_canhan_nguoidaidien of this doanh nghiep.
	*
	* @return the giayto_canhan_nguoidaidien of this doanh nghiep
	*/
	@Override
	public java.lang.String getGiayto_canhan_nguoidaidien() {
		return _doanhNghiep.getGiayto_canhan_nguoidaidien();
	}

	/**
	* Returns the giayto_noicap_nguoidaidien of this doanh nghiep.
	*
	* @return the giayto_noicap_nguoidaidien of this doanh nghiep
	*/
	@Override
	public java.lang.String getGiayto_noicap_nguoidaidien() {
		return _doanhNghiep.getGiayto_noicap_nguoidaidien();
	}

	/**
	* Returns the hktt_nguoidaidien of this doanh nghiep.
	*
	* @return the hktt_nguoidaidien of this doanh nghiep
	*/
	@Override
	public java.lang.String getHktt_nguoidaidien() {
		return _doanhNghiep.getHktt_nguoidaidien();
	}

	/**
	* Returns the masothue of this doanh nghiep.
	*
	* @return the masothue of this doanh nghiep
	*/
	@Override
	public java.lang.String getMasothue() {
		return _doanhNghiep.getMasothue();
	}

	/**
	* Returns the sogcn_dkkd of this doanh nghiep.
	*
	* @return the sogcn_dkkd of this doanh nghiep
	*/
	@Override
	public java.lang.String getSogcn_dkkd() {
		return _doanhNghiep.getSogcn_dkkd();
	}

	/**
	* Returns the ten of this doanh nghiep.
	*
	* @return the ten of this doanh nghiep
	*/
	@Override
	public java.lang.String getTen() {
		return _doanhNghiep.getTen();
	}

	/**
	* Returns the ten_donvicapphep of this doanh nghiep.
	*
	* @return the ten_donvicapphep of this doanh nghiep
	*/
	@Override
	public java.lang.String getTen_donvicapphep() {
		return _doanhNghiep.getTen_donvicapphep();
	}

	/**
	* Returns the ten_nguoidaidien of this doanh nghiep.
	*
	* @return the ten_nguoidaidien of this doanh nghiep
	*/
	@Override
	public java.lang.String getTen_nguoidaidien() {
		return _doanhNghiep.getTen_nguoidaidien();
	}

	/**
	* Returns the ten_tienganh of this doanh nghiep.
	*
	* @return the ten_tienganh of this doanh nghiep
	*/
	@Override
	public java.lang.String getTen_tienganh() {
		return _doanhNghiep.getTen_tienganh();
	}

	/**
	* Returns the ten_viettat of this doanh nghiep.
	*
	* @return the ten_viettat of this doanh nghiep
	*/
	@Override
	public java.lang.String getTen_viettat() {
		return _doanhNghiep.getTen_viettat();
	}

	/**
	* Returns the von_dieule of this doanh nghiep.
	*
	* @return the von_dieule of this doanh nghiep
	*/
	@Override
	public java.lang.String getVon_dieule() {
		return _doanhNghiep.getVon_dieule();
	}

	/**
	* Returns the von_phapdinh of this doanh nghiep.
	*
	* @return the von_phapdinh of this doanh nghiep
	*/
	@Override
	public java.lang.String getVon_phapdinh() {
		return _doanhNghiep.getVon_phapdinh();
	}

	/**
	* Returns the website of this doanh nghiep.
	*
	* @return the website of this doanh nghiep
	*/
	@Override
	public java.lang.String getWebsite() {
		return _doanhNghiep.getWebsite();
	}

	@Override
	public java.lang.String toString() {
		return _doanhNghiep.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _doanhNghiep.toXmlString();
	}

	/**
	* Returns the giayto_ngaycap_nguoidaidien of this doanh nghiep.
	*
	* @return the giayto_ngaycap_nguoidaidien of this doanh nghiep
	*/
	@Override
	public Date getGiayto_ngaycap_nguoidaidien() {
		return _doanhNghiep.getGiayto_ngaycap_nguoidaidien();
	}

	/**
	* Returns the ngaycap_dkkd of this doanh nghiep.
	*
	* @return the ngaycap_dkkd of this doanh nghiep
	*/
	@Override
	public Date getNgaycap_dkkd() {
		return _doanhNghiep.getNgaycap_dkkd();
	}

	/**
	* Returns the ngaycap_taikhoan of this doanh nghiep.
	*
	* @return the ngaycap_taikhoan of this doanh nghiep
	*/
	@Override
	public Date getNgaycap_taikhoan() {
		return _doanhNghiep.getNgaycap_taikhoan();
	}

	/**
	* Returns the ngayhethan_dkkd of this doanh nghiep.
	*
	* @return the ngayhethan_dkkd of this doanh nghiep
	*/
	@Override
	public Date getNgayhethan_dkkd() {
		return _doanhNghiep.getNgayhethan_dkkd();
	}

	/**
	* Returns the ngaysinh_nguoidaidien of this doanh nghiep.
	*
	* @return the ngaysinh_nguoidaidien of this doanh nghiep
	*/
	@Override
	public Date getNgaysinh_nguoidaidien() {
		return _doanhNghiep.getNgaysinh_nguoidaidien();
	}

	/**
	* Returns the ngaytao of this doanh nghiep.
	*
	* @return the ngaytao of this doanh nghiep
	*/
	@Override
	public Date getNgaytao() {
		return _doanhNghiep.getNgaytao();
	}

	/**
	* Returns the dantoc_nguoidaidien_id of this doanh nghiep.
	*
	* @return the dantoc_nguoidaidien_id of this doanh nghiep
	*/
	@Override
	public long getDantoc_nguoidaidien_id() {
		return _doanhNghiep.getDantoc_nguoidaidien_id();
	}

	/**
	* Returns the diachi_ndd_huyen_id of this doanh nghiep.
	*
	* @return the diachi_ndd_huyen_id of this doanh nghiep
	*/
	@Override
	public long getDiachi_ndd_huyen_id() {
		return _doanhNghiep.getDiachi_ndd_huyen_id();
	}

	/**
	* Returns the diachi_ndd_tinh_id of this doanh nghiep.
	*
	* @return the diachi_ndd_tinh_id of this doanh nghiep
	*/
	@Override
	public long getDiachi_ndd_tinh_id() {
		return _doanhNghiep.getDiachi_ndd_tinh_id();
	}

	/**
	* Returns the diachi_ndd_xa_id of this doanh nghiep.
	*
	* @return the diachi_ndd_xa_id of this doanh nghiep
	*/
	@Override
	public long getDiachi_ndd_xa_id() {
		return _doanhNghiep.getDiachi_ndd_xa_id();
	}

	/**
	* Returns the diachi_truso_huyen_id of this doanh nghiep.
	*
	* @return the diachi_truso_huyen_id of this doanh nghiep
	*/
	@Override
	public long getDiachi_truso_huyen_id() {
		return _doanhNghiep.getDiachi_truso_huyen_id();
	}

	/**
	* Returns the diachi_truso_tinh_id of this doanh nghiep.
	*
	* @return the diachi_truso_tinh_id of this doanh nghiep
	*/
	@Override
	public long getDiachi_truso_tinh_id() {
		return _doanhNghiep.getDiachi_truso_tinh_id();
	}

	/**
	* Returns the diachi_truso_xa_id of this doanh nghiep.
	*
	* @return the diachi_truso_xa_id of this doanh nghiep
	*/
	@Override
	public long getDiachi_truso_xa_id() {
		return _doanhNghiep.getDiachi_truso_xa_id();
	}

	/**
	* Returns the doituongsudung_id of this doanh nghiep.
	*
	* @return the doituongsudung_id of this doanh nghiep
	*/
	@Override
	public long getDoituongsudung_id() {
		return _doanhNghiep.getDoituongsudung_id();
	}

	/**
	* Returns the gioitinh_nguoidaidien of this doanh nghiep.
	*
	* @return the gioitinh_nguoidaidien of this doanh nghiep
	*/
	@Override
	public long getGioitinh_nguoidaidien() {
		return _doanhNghiep.getGioitinh_nguoidaidien();
	}

	/**
	* Returns the ID of this doanh nghiep.
	*
	* @return the ID of this doanh nghiep
	*/
	@Override
	public long getId() {
		return _doanhNghiep.getId();
	}

	/**
	* Returns the loai_doanhnghiep_id of this doanh nghiep.
	*
	* @return the loai_doanhnghiep_id of this doanh nghiep
	*/
	@Override
	public long getLoai_doanhnghiep_id() {
		return _doanhNghiep.getLoai_doanhnghiep_id();
	}

	/**
	* Returns the primary key of this doanh nghiep.
	*
	* @return the primary key of this doanh nghiep
	*/
	@Override
	public long getPrimaryKey() {
		return _doanhNghiep.getPrimaryKey();
	}

	/**
	* Returns the quoctich_nguoidaidien_id of this doanh nghiep.
	*
	* @return the quoctich_nguoidaidien_id of this doanh nghiep
	*/
	@Override
	public long getQuoctich_nguoidaidien_id() {
		return _doanhNghiep.getQuoctich_nguoidaidien_id();
	}

	/**
	* Returns the tongiao_nguoidaidien_id of this doanh nghiep.
	*
	* @return the tongiao_nguoidaidien_id of this doanh nghiep
	*/
	@Override
	public long getTongiao_nguoidaidien_id() {
		return _doanhNghiep.getTongiao_nguoidaidien_id();
	}

	/**
	* Returns the user_id of this doanh nghiep.
	*
	* @return the user_id of this doanh nghiep
	*/
	@Override
	public long getUser_id() {
		return _doanhNghiep.getUser_id();
	}

	@Override
	public void persist() {
		_doanhNghiep.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_doanhNghiep.setCachedModel(cachedModel);
	}

	/**
	* Sets the chucvu_nguoidaidien of this doanh nghiep.
	*
	* @param chucvu_nguoidaidien the chucvu_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setChucvu_nguoidaidien(java.lang.String chucvu_nguoidaidien) {
		_doanhNghiep.setChucvu_nguoidaidien(chucvu_nguoidaidien);
	}

	/**
	* Sets the dantoc_nguoidaidien_id of this doanh nghiep.
	*
	* @param dantoc_nguoidaidien_id the dantoc_nguoidaidien_id of this doanh nghiep
	*/
	@Override
	public void setDantoc_nguoidaidien_id(long dantoc_nguoidaidien_id) {
		_doanhNghiep.setDantoc_nguoidaidien_id(dantoc_nguoidaidien_id);
	}

	/**
	* Sets the diachi_ndd_huyen_id of this doanh nghiep.
	*
	* @param diachi_ndd_huyen_id the diachi_ndd_huyen_id of this doanh nghiep
	*/
	@Override
	public void setDiachi_ndd_huyen_id(long diachi_ndd_huyen_id) {
		_doanhNghiep.setDiachi_ndd_huyen_id(diachi_ndd_huyen_id);
	}

	/**
	* Sets the diachi_ndd_tinh_id of this doanh nghiep.
	*
	* @param diachi_ndd_tinh_id the diachi_ndd_tinh_id of this doanh nghiep
	*/
	@Override
	public void setDiachi_ndd_tinh_id(long diachi_ndd_tinh_id) {
		_doanhNghiep.setDiachi_ndd_tinh_id(diachi_ndd_tinh_id);
	}

	/**
	* Sets the diachi_ndd_xa_id of this doanh nghiep.
	*
	* @param diachi_ndd_xa_id the diachi_ndd_xa_id of this doanh nghiep
	*/
	@Override
	public void setDiachi_ndd_xa_id(long diachi_ndd_xa_id) {
		_doanhNghiep.setDiachi_ndd_xa_id(diachi_ndd_xa_id);
	}

	/**
	* Sets the diachi_nguoidaidien of this doanh nghiep.
	*
	* @param diachi_nguoidaidien the diachi_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setDiachi_nguoidaidien(java.lang.String diachi_nguoidaidien) {
		_doanhNghiep.setDiachi_nguoidaidien(diachi_nguoidaidien);
	}

	/**
	* Sets the diachi_truso_huyen_id of this doanh nghiep.
	*
	* @param diachi_truso_huyen_id the diachi_truso_huyen_id of this doanh nghiep
	*/
	@Override
	public void setDiachi_truso_huyen_id(long diachi_truso_huyen_id) {
		_doanhNghiep.setDiachi_truso_huyen_id(diachi_truso_huyen_id);
	}

	/**
	* Sets the diachi_truso_tinh_id of this doanh nghiep.
	*
	* @param diachi_truso_tinh_id the diachi_truso_tinh_id of this doanh nghiep
	*/
	@Override
	public void setDiachi_truso_tinh_id(long diachi_truso_tinh_id) {
		_doanhNghiep.setDiachi_truso_tinh_id(diachi_truso_tinh_id);
	}

	/**
	* Sets the diachi_truso_xa_id of this doanh nghiep.
	*
	* @param diachi_truso_xa_id the diachi_truso_xa_id of this doanh nghiep
	*/
	@Override
	public void setDiachi_truso_xa_id(long diachi_truso_xa_id) {
		_doanhNghiep.setDiachi_truso_xa_id(diachi_truso_xa_id);
	}

	/**
	* Sets the diachi_trusochinh of this doanh nghiep.
	*
	* @param diachi_trusochinh the diachi_trusochinh of this doanh nghiep
	*/
	@Override
	public void setDiachi_trusochinh(java.lang.String diachi_trusochinh) {
		_doanhNghiep.setDiachi_trusochinh(diachi_trusochinh);
	}

	/**
	* Sets the dienthoai of this doanh nghiep.
	*
	* @param dienthoai the dienthoai of this doanh nghiep
	*/
	@Override
	public void setDienthoai(java.lang.String dienthoai) {
		_doanhNghiep.setDienthoai(dienthoai);
	}

	/**
	* Sets the dienthoai_nguoidaidien of this doanh nghiep.
	*
	* @param dienthoai_nguoidaidien the dienthoai_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setDienthoai_nguoidaidien(
		java.lang.String dienthoai_nguoidaidien) {
		_doanhNghiep.setDienthoai_nguoidaidien(dienthoai_nguoidaidien);
	}

	/**
	* Sets the doituongsudung_id of this doanh nghiep.
	*
	* @param doituongsudung_id the doituongsudung_id of this doanh nghiep
	*/
	@Override
	public void setDoituongsudung_id(long doituongsudung_id) {
		_doanhNghiep.setDoituongsudung_id(doituongsudung_id);
	}

	/**
	* Sets the email of this doanh nghiep.
	*
	* @param email the email of this doanh nghiep
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_doanhNghiep.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_doanhNghiep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_doanhNghiep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_doanhNghiep.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fax of this doanh nghiep.
	*
	* @param fax the fax of this doanh nghiep
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_doanhNghiep.setFax(fax);
	}

	/**
	* Sets the giayto_canhan_nguoidaidien of this doanh nghiep.
	*
	* @param giayto_canhan_nguoidaidien the giayto_canhan_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setGiayto_canhan_nguoidaidien(
		java.lang.String giayto_canhan_nguoidaidien) {
		_doanhNghiep.setGiayto_canhan_nguoidaidien(giayto_canhan_nguoidaidien);
	}

	/**
	* Sets the giayto_ngaycap_nguoidaidien of this doanh nghiep.
	*
	* @param giayto_ngaycap_nguoidaidien the giayto_ngaycap_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setGiayto_ngaycap_nguoidaidien(Date giayto_ngaycap_nguoidaidien) {
		_doanhNghiep.setGiayto_ngaycap_nguoidaidien(giayto_ngaycap_nguoidaidien);
	}

	/**
	* Sets the giayto_noicap_nguoidaidien of this doanh nghiep.
	*
	* @param giayto_noicap_nguoidaidien the giayto_noicap_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setGiayto_noicap_nguoidaidien(
		java.lang.String giayto_noicap_nguoidaidien) {
		_doanhNghiep.setGiayto_noicap_nguoidaidien(giayto_noicap_nguoidaidien);
	}

	/**
	* Sets the gioitinh_nguoidaidien of this doanh nghiep.
	*
	* @param gioitinh_nguoidaidien the gioitinh_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setGioitinh_nguoidaidien(long gioitinh_nguoidaidien) {
		_doanhNghiep.setGioitinh_nguoidaidien(gioitinh_nguoidaidien);
	}

	/**
	* Sets the hktt_nguoidaidien of this doanh nghiep.
	*
	* @param hktt_nguoidaidien the hktt_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setHktt_nguoidaidien(java.lang.String hktt_nguoidaidien) {
		_doanhNghiep.setHktt_nguoidaidien(hktt_nguoidaidien);
	}

	/**
	* Sets the ID of this doanh nghiep.
	*
	* @param id the ID of this doanh nghiep
	*/
	@Override
	public void setId(long id) {
		_doanhNghiep.setId(id);
	}

	/**
	* Sets the loai_doanhnghiep_id of this doanh nghiep.
	*
	* @param loai_doanhnghiep_id the loai_doanhnghiep_id of this doanh nghiep
	*/
	@Override
	public void setLoai_doanhnghiep_id(long loai_doanhnghiep_id) {
		_doanhNghiep.setLoai_doanhnghiep_id(loai_doanhnghiep_id);
	}

	/**
	* Sets the masothue of this doanh nghiep.
	*
	* @param masothue the masothue of this doanh nghiep
	*/
	@Override
	public void setMasothue(java.lang.String masothue) {
		_doanhNghiep.setMasothue(masothue);
	}

	@Override
	public void setNew(boolean n) {
		_doanhNghiep.setNew(n);
	}

	/**
	* Sets the ngaycap_dkkd of this doanh nghiep.
	*
	* @param ngaycap_dkkd the ngaycap_dkkd of this doanh nghiep
	*/
	@Override
	public void setNgaycap_dkkd(Date ngaycap_dkkd) {
		_doanhNghiep.setNgaycap_dkkd(ngaycap_dkkd);
	}

	/**
	* Sets the ngaycap_taikhoan of this doanh nghiep.
	*
	* @param ngaycap_taikhoan the ngaycap_taikhoan of this doanh nghiep
	*/
	@Override
	public void setNgaycap_taikhoan(Date ngaycap_taikhoan) {
		_doanhNghiep.setNgaycap_taikhoan(ngaycap_taikhoan);
	}

	/**
	* Sets the ngayhethan_dkkd of this doanh nghiep.
	*
	* @param ngayhethan_dkkd the ngayhethan_dkkd of this doanh nghiep
	*/
	@Override
	public void setNgayhethan_dkkd(Date ngayhethan_dkkd) {
		_doanhNghiep.setNgayhethan_dkkd(ngayhethan_dkkd);
	}

	/**
	* Sets the ngaysinh_nguoidaidien of this doanh nghiep.
	*
	* @param ngaysinh_nguoidaidien the ngaysinh_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setNgaysinh_nguoidaidien(Date ngaysinh_nguoidaidien) {
		_doanhNghiep.setNgaysinh_nguoidaidien(ngaysinh_nguoidaidien);
	}

	/**
	* Sets the ngaytao of this doanh nghiep.
	*
	* @param ngaytao the ngaytao of this doanh nghiep
	*/
	@Override
	public void setNgaytao(Date ngaytao) {
		_doanhNghiep.setNgaytao(ngaytao);
	}

	/**
	* Sets the primary key of this doanh nghiep.
	*
	* @param primaryKey the primary key of this doanh nghiep
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_doanhNghiep.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_doanhNghiep.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the quoctich_nguoidaidien_id of this doanh nghiep.
	*
	* @param quoctich_nguoidaidien_id the quoctich_nguoidaidien_id of this doanh nghiep
	*/
	@Override
	public void setQuoctich_nguoidaidien_id(long quoctich_nguoidaidien_id) {
		_doanhNghiep.setQuoctich_nguoidaidien_id(quoctich_nguoidaidien_id);
	}

	/**
	* Sets the sogcn_dkkd of this doanh nghiep.
	*
	* @param sogcn_dkkd the sogcn_dkkd of this doanh nghiep
	*/
	@Override
	public void setSogcn_dkkd(java.lang.String sogcn_dkkd) {
		_doanhNghiep.setSogcn_dkkd(sogcn_dkkd);
	}

	/**
	* Sets the ten of this doanh nghiep.
	*
	* @param ten the ten of this doanh nghiep
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_doanhNghiep.setTen(ten);
	}

	/**
	* Sets the ten_donvicapphep of this doanh nghiep.
	*
	* @param ten_donvicapphep the ten_donvicapphep of this doanh nghiep
	*/
	@Override
	public void setTen_donvicapphep(java.lang.String ten_donvicapphep) {
		_doanhNghiep.setTen_donvicapphep(ten_donvicapphep);
	}

	/**
	* Sets the ten_nguoidaidien of this doanh nghiep.
	*
	* @param ten_nguoidaidien the ten_nguoidaidien of this doanh nghiep
	*/
	@Override
	public void setTen_nguoidaidien(java.lang.String ten_nguoidaidien) {
		_doanhNghiep.setTen_nguoidaidien(ten_nguoidaidien);
	}

	/**
	* Sets the ten_tienganh of this doanh nghiep.
	*
	* @param ten_tienganh the ten_tienganh of this doanh nghiep
	*/
	@Override
	public void setTen_tienganh(java.lang.String ten_tienganh) {
		_doanhNghiep.setTen_tienganh(ten_tienganh);
	}

	/**
	* Sets the ten_viettat of this doanh nghiep.
	*
	* @param ten_viettat the ten_viettat of this doanh nghiep
	*/
	@Override
	public void setTen_viettat(java.lang.String ten_viettat) {
		_doanhNghiep.setTen_viettat(ten_viettat);
	}

	/**
	* Sets the tongiao_nguoidaidien_id of this doanh nghiep.
	*
	* @param tongiao_nguoidaidien_id the tongiao_nguoidaidien_id of this doanh nghiep
	*/
	@Override
	public void setTongiao_nguoidaidien_id(long tongiao_nguoidaidien_id) {
		_doanhNghiep.setTongiao_nguoidaidien_id(tongiao_nguoidaidien_id);
	}

	/**
	* Sets the trangthai of this doanh nghiep.
	*
	* @param trangthai the trangthai of this doanh nghiep
	*/
	@Override
	public void setTrangthai(int trangthai) {
		_doanhNghiep.setTrangthai(trangthai);
	}

	/**
	* Sets the user_id of this doanh nghiep.
	*
	* @param user_id the user_id of this doanh nghiep
	*/
	@Override
	public void setUser_id(long user_id) {
		_doanhNghiep.setUser_id(user_id);
	}

	/**
	* Sets the von_dieule of this doanh nghiep.
	*
	* @param von_dieule the von_dieule of this doanh nghiep
	*/
	@Override
	public void setVon_dieule(java.lang.String von_dieule) {
		_doanhNghiep.setVon_dieule(von_dieule);
	}

	/**
	* Sets the von_phapdinh of this doanh nghiep.
	*
	* @param von_phapdinh the von_phapdinh of this doanh nghiep
	*/
	@Override
	public void setVon_phapdinh(java.lang.String von_phapdinh) {
		_doanhNghiep.setVon_phapdinh(von_phapdinh);
	}

	/**
	* Sets the website of this doanh nghiep.
	*
	* @param website the website of this doanh nghiep
	*/
	@Override
	public void setWebsite(java.lang.String website) {
		_doanhNghiep.setWebsite(website);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DoanhNghiepWrapper)) {
			return false;
		}

		DoanhNghiepWrapper doanhNghiepWrapper = (DoanhNghiepWrapper)obj;

		if (Objects.equals(_doanhNghiep, doanhNghiepWrapper._doanhNghiep)) {
			return true;
		}

		return false;
	}

	@Override
	public DoanhNghiep getWrappedModel() {
		return _doanhNghiep;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _doanhNghiep.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _doanhNghiep.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_doanhNghiep.resetOriginalValues();
	}

	private final DoanhNghiep _doanhNghiep;
}