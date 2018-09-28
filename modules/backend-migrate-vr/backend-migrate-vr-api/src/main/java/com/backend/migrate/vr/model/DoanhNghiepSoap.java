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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class DoanhNghiepSoap implements Serializable {
	public static DoanhNghiepSoap toSoapModel(DoanhNghiep model) {
		DoanhNghiepSoap soapModel = new DoanhNghiepSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());
		soapModel.setTen_viettat(model.getTen_viettat());
		soapModel.setTen_tienganh(model.getTen_tienganh());
		soapModel.setSogcn_dkkd(model.getSogcn_dkkd());
		soapModel.setNgaycap_dkkd(model.getNgaycap_dkkd());
		soapModel.setNgayhethan_dkkd(model.getNgayhethan_dkkd());
		soapModel.setTen_donvicapphep(model.getTen_donvicapphep());
		soapModel.setMasothue(model.getMasothue());
		soapModel.setTen_nguoidaidien(model.getTen_nguoidaidien());
		soapModel.setChucvu_nguoidaidien(model.getChucvu_nguoidaidien());
		soapModel.setGioitinh_nguoidaidien(model.getGioitinh_nguoidaidien());
		soapModel.setDiachi_nguoidaidien(model.getDiachi_nguoidaidien());
		soapModel.setDiachi_ndd_tinh_id(model.getDiachi_ndd_tinh_id());
		soapModel.setDiachi_ndd_huyen_id(model.getDiachi_ndd_huyen_id());
		soapModel.setDiachi_ndd_xa_id(model.getDiachi_ndd_xa_id());
		soapModel.setHktt_nguoidaidien(model.getHktt_nguoidaidien());
		soapModel.setDantoc_nguoidaidien_id(model.getDantoc_nguoidaidien_id());
		soapModel.setTongiao_nguoidaidien_id(model.getTongiao_nguoidaidien_id());
		soapModel.setQuoctich_nguoidaidien_id(model.getQuoctich_nguoidaidien_id());
		soapModel.setNgaysinh_nguoidaidien(model.getNgaysinh_nguoidaidien());
		soapModel.setDienthoai_nguoidaidien(model.getDienthoai_nguoidaidien());
		soapModel.setGiayto_canhan_nguoidaidien(model.getGiayto_canhan_nguoidaidien());
		soapModel.setGiayto_ngaycap_nguoidaidien(model.getGiayto_ngaycap_nguoidaidien());
		soapModel.setGiayto_noicap_nguoidaidien(model.getGiayto_noicap_nguoidaidien());
		soapModel.setLoai_doanhnghiep_id(model.getLoai_doanhnghiep_id());
		soapModel.setDiachi_trusochinh(model.getDiachi_trusochinh());
		soapModel.setDiachi_truso_tinh_id(model.getDiachi_truso_tinh_id());
		soapModel.setDiachi_truso_huyen_id(model.getDiachi_truso_huyen_id());
		soapModel.setDiachi_truso_xa_id(model.getDiachi_truso_xa_id());
		soapModel.setDienthoai(model.getDienthoai());
		soapModel.setFax(model.getFax());
		soapModel.setEmail(model.getEmail());
		soapModel.setWebsite(model.getWebsite());
		soapModel.setVon_dieule(model.getVon_dieule());
		soapModel.setVon_phapdinh(model.getVon_phapdinh());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setDoituongsudung_id(model.getDoituongsudung_id());
		soapModel.setTrangthai(model.getTrangthai());
		soapModel.setNgaytao(model.getNgaytao());
		soapModel.setNgaycap_taikhoan(model.getNgaycap_taikhoan());

		return soapModel;
	}

	public static DoanhNghiepSoap[] toSoapModels(DoanhNghiep[] models) {
		DoanhNghiepSoap[] soapModels = new DoanhNghiepSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DoanhNghiepSoap[][] toSoapModels(DoanhNghiep[][] models) {
		DoanhNghiepSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DoanhNghiepSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DoanhNghiepSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DoanhNghiepSoap[] toSoapModels(List<DoanhNghiep> models) {
		List<DoanhNghiepSoap> soapModels = new ArrayList<DoanhNghiepSoap>(models.size());

		for (DoanhNghiep model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DoanhNghiepSoap[soapModels.size()]);
	}

	public DoanhNghiepSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getTen() {
		return _ten;
	}

	public void setTen(String ten) {
		_ten = ten;
	}

	public String getTen_viettat() {
		return _ten_viettat;
	}

	public void setTen_viettat(String ten_viettat) {
		_ten_viettat = ten_viettat;
	}

	public String getTen_tienganh() {
		return _ten_tienganh;
	}

	public void setTen_tienganh(String ten_tienganh) {
		_ten_tienganh = ten_tienganh;
	}

	public String getSogcn_dkkd() {
		return _sogcn_dkkd;
	}

	public void setSogcn_dkkd(String sogcn_dkkd) {
		_sogcn_dkkd = sogcn_dkkd;
	}

	public Date getNgaycap_dkkd() {
		return _ngaycap_dkkd;
	}

	public void setNgaycap_dkkd(Date ngaycap_dkkd) {
		_ngaycap_dkkd = ngaycap_dkkd;
	}

	public Date getNgayhethan_dkkd() {
		return _ngayhethan_dkkd;
	}

	public void setNgayhethan_dkkd(Date ngayhethan_dkkd) {
		_ngayhethan_dkkd = ngayhethan_dkkd;
	}

	public String getTen_donvicapphep() {
		return _ten_donvicapphep;
	}

	public void setTen_donvicapphep(String ten_donvicapphep) {
		_ten_donvicapphep = ten_donvicapphep;
	}

	public String getMasothue() {
		return _masothue;
	}

	public void setMasothue(String masothue) {
		_masothue = masothue;
	}

	public String getTen_nguoidaidien() {
		return _ten_nguoidaidien;
	}

	public void setTen_nguoidaidien(String ten_nguoidaidien) {
		_ten_nguoidaidien = ten_nguoidaidien;
	}

	public String getChucvu_nguoidaidien() {
		return _chucvu_nguoidaidien;
	}

	public void setChucvu_nguoidaidien(String chucvu_nguoidaidien) {
		_chucvu_nguoidaidien = chucvu_nguoidaidien;
	}

	public long getGioitinh_nguoidaidien() {
		return _gioitinh_nguoidaidien;
	}

	public void setGioitinh_nguoidaidien(long gioitinh_nguoidaidien) {
		_gioitinh_nguoidaidien = gioitinh_nguoidaidien;
	}

	public String getDiachi_nguoidaidien() {
		return _diachi_nguoidaidien;
	}

	public void setDiachi_nguoidaidien(String diachi_nguoidaidien) {
		_diachi_nguoidaidien = diachi_nguoidaidien;
	}

	public long getDiachi_ndd_tinh_id() {
		return _diachi_ndd_tinh_id;
	}

	public void setDiachi_ndd_tinh_id(long diachi_ndd_tinh_id) {
		_diachi_ndd_tinh_id = diachi_ndd_tinh_id;
	}

	public long getDiachi_ndd_huyen_id() {
		return _diachi_ndd_huyen_id;
	}

	public void setDiachi_ndd_huyen_id(long diachi_ndd_huyen_id) {
		_diachi_ndd_huyen_id = diachi_ndd_huyen_id;
	}

	public long getDiachi_ndd_xa_id() {
		return _diachi_ndd_xa_id;
	}

	public void setDiachi_ndd_xa_id(long diachi_ndd_xa_id) {
		_diachi_ndd_xa_id = diachi_ndd_xa_id;
	}

	public String getHktt_nguoidaidien() {
		return _hktt_nguoidaidien;
	}

	public void setHktt_nguoidaidien(String hktt_nguoidaidien) {
		_hktt_nguoidaidien = hktt_nguoidaidien;
	}

	public long getDantoc_nguoidaidien_id() {
		return _dantoc_nguoidaidien_id;
	}

	public void setDantoc_nguoidaidien_id(long dantoc_nguoidaidien_id) {
		_dantoc_nguoidaidien_id = dantoc_nguoidaidien_id;
	}

	public long getTongiao_nguoidaidien_id() {
		return _tongiao_nguoidaidien_id;
	}

	public void setTongiao_nguoidaidien_id(long tongiao_nguoidaidien_id) {
		_tongiao_nguoidaidien_id = tongiao_nguoidaidien_id;
	}

	public long getQuoctich_nguoidaidien_id() {
		return _quoctich_nguoidaidien_id;
	}

	public void setQuoctich_nguoidaidien_id(long quoctich_nguoidaidien_id) {
		_quoctich_nguoidaidien_id = quoctich_nguoidaidien_id;
	}

	public Date getNgaysinh_nguoidaidien() {
		return _ngaysinh_nguoidaidien;
	}

	public void setNgaysinh_nguoidaidien(Date ngaysinh_nguoidaidien) {
		_ngaysinh_nguoidaidien = ngaysinh_nguoidaidien;
	}

	public String getDienthoai_nguoidaidien() {
		return _dienthoai_nguoidaidien;
	}

	public void setDienthoai_nguoidaidien(String dienthoai_nguoidaidien) {
		_dienthoai_nguoidaidien = dienthoai_nguoidaidien;
	}

	public String getGiayto_canhan_nguoidaidien() {
		return _giayto_canhan_nguoidaidien;
	}

	public void setGiayto_canhan_nguoidaidien(String giayto_canhan_nguoidaidien) {
		_giayto_canhan_nguoidaidien = giayto_canhan_nguoidaidien;
	}

	public Date getGiayto_ngaycap_nguoidaidien() {
		return _giayto_ngaycap_nguoidaidien;
	}

	public void setGiayto_ngaycap_nguoidaidien(Date giayto_ngaycap_nguoidaidien) {
		_giayto_ngaycap_nguoidaidien = giayto_ngaycap_nguoidaidien;
	}

	public String getGiayto_noicap_nguoidaidien() {
		return _giayto_noicap_nguoidaidien;
	}

	public void setGiayto_noicap_nguoidaidien(String giayto_noicap_nguoidaidien) {
		_giayto_noicap_nguoidaidien = giayto_noicap_nguoidaidien;
	}

	public long getLoai_doanhnghiep_id() {
		return _loai_doanhnghiep_id;
	}

	public void setLoai_doanhnghiep_id(long loai_doanhnghiep_id) {
		_loai_doanhnghiep_id = loai_doanhnghiep_id;
	}

	public String getDiachi_trusochinh() {
		return _diachi_trusochinh;
	}

	public void setDiachi_trusochinh(String diachi_trusochinh) {
		_diachi_trusochinh = diachi_trusochinh;
	}

	public long getDiachi_truso_tinh_id() {
		return _diachi_truso_tinh_id;
	}

	public void setDiachi_truso_tinh_id(long diachi_truso_tinh_id) {
		_diachi_truso_tinh_id = diachi_truso_tinh_id;
	}

	public long getDiachi_truso_huyen_id() {
		return _diachi_truso_huyen_id;
	}

	public void setDiachi_truso_huyen_id(long diachi_truso_huyen_id) {
		_diachi_truso_huyen_id = diachi_truso_huyen_id;
	}

	public long getDiachi_truso_xa_id() {
		return _diachi_truso_xa_id;
	}

	public void setDiachi_truso_xa_id(long diachi_truso_xa_id) {
		_diachi_truso_xa_id = diachi_truso_xa_id;
	}

	public String getDienthoai() {
		return _dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		_dienthoai = dienthoai;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getWebsite() {
		return _website;
	}

	public void setWebsite(String website) {
		_website = website;
	}

	public String getVon_dieule() {
		return _von_dieule;
	}

	public void setVon_dieule(String von_dieule) {
		_von_dieule = von_dieule;
	}

	public String getVon_phapdinh() {
		return _von_phapdinh;
	}

	public void setVon_phapdinh(String von_phapdinh) {
		_von_phapdinh = von_phapdinh;
	}

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public long getDoituongsudung_id() {
		return _doituongsudung_id;
	}

	public void setDoituongsudung_id(long doituongsudung_id) {
		_doituongsudung_id = doituongsudung_id;
	}

	public int getTrangthai() {
		return _trangthai;
	}

	public void setTrangthai(int trangthai) {
		_trangthai = trangthai;
	}

	public Date getNgaytao() {
		return _ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		_ngaytao = ngaytao;
	}

	public Date getNgaycap_taikhoan() {
		return _ngaycap_taikhoan;
	}

	public void setNgaycap_taikhoan(Date ngaycap_taikhoan) {
		_ngaycap_taikhoan = ngaycap_taikhoan;
	}

	private long _id;
	private String _ten;
	private String _ten_viettat;
	private String _ten_tienganh;
	private String _sogcn_dkkd;
	private Date _ngaycap_dkkd;
	private Date _ngayhethan_dkkd;
	private String _ten_donvicapphep;
	private String _masothue;
	private String _ten_nguoidaidien;
	private String _chucvu_nguoidaidien;
	private long _gioitinh_nguoidaidien;
	private String _diachi_nguoidaidien;
	private long _diachi_ndd_tinh_id;
	private long _diachi_ndd_huyen_id;
	private long _diachi_ndd_xa_id;
	private String _hktt_nguoidaidien;
	private long _dantoc_nguoidaidien_id;
	private long _tongiao_nguoidaidien_id;
	private long _quoctich_nguoidaidien_id;
	private Date _ngaysinh_nguoidaidien;
	private String _dienthoai_nguoidaidien;
	private String _giayto_canhan_nguoidaidien;
	private Date _giayto_ngaycap_nguoidaidien;
	private String _giayto_noicap_nguoidaidien;
	private long _loai_doanhnghiep_id;
	private String _diachi_trusochinh;
	private long _diachi_truso_tinh_id;
	private long _diachi_truso_huyen_id;
	private long _diachi_truso_xa_id;
	private String _dienthoai;
	private String _fax;
	private String _email;
	private String _website;
	private String _von_dieule;
	private String _von_phapdinh;
	private long _user_id;
	private long _doituongsudung_id;
	private int _trangthai;
	private Date _ngaytao;
	private Date _ngaycap_taikhoan;
}