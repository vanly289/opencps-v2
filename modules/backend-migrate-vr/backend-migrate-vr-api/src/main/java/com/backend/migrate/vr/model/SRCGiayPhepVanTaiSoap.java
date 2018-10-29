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
public class SRCGiayPhepVanTaiSoap implements Serializable {
	public static SRCGiayPhepVanTaiSoap toSoapModel(SRCGiayPhepVanTai model) {
		SRCGiayPhepVanTaiSoap soapModel = new SRCGiayPhepVanTaiSoap();

		soapModel.setId(model.getId());
		soapModel.setCoquanquanly_id(model.getCoquanquanly_id());
		soapModel.setTen_coquancapphep(model.getTen_coquancapphep());
		soapModel.setDoanhnghiep_id(model.getDoanhnghiep_id());
		soapModel.setTen_doanhnghiep(model.getTen_doanhnghiep());
		soapModel.setDiachi_doanhnghiep(model.getDiachi_doanhnghiep());
		soapModel.setDienthoai_doanhnghiep(model.getDienthoai_doanhnghiep());
		soapModel.setFax_doanhnghiep(model.getFax_doanhnghiep());
		soapModel.setEmail_doanhnghiep(model.getEmail_doanhnghiep());
		soapModel.setWebsite_doanhnghiep(model.getWebsite_doanhnghiep());
		soapModel.setNgay_ky(model.getNgay_ky());
		soapModel.setTen_nguoiky(model.getTen_nguoiky());
		soapModel.setNguoi_ky_id(model.getNguoi_ky_id());
		soapModel.setUrl_file_gpvt(model.getUrl_file_gpvt());
		soapModel.setSogiayphep(model.getSogiayphep());
		soapModel.setLancapphep(model.getLancapphep());
		soapModel.setNgaycap(model.getNgaycap());
		soapModel.setNguoicap(model.getNguoicap());
		soapModel.setNgayhethan(model.getNgayhethan());
		soapModel.setNgay_thuhoi(model.getNgay_thuhoi());
		soapModel.setLydo_thuhoi(model.getLydo_thuhoi());
		soapModel.setGhichu(model.getGhichu());
		soapModel.setTrangthai(model.getTrangthai());
		soapModel.setQuocgia_id(model.getQuocgia_id());

		return soapModel;
	}

	public static SRCGiayPhepVanTaiSoap[] toSoapModels(
		SRCGiayPhepVanTai[] models) {
		SRCGiayPhepVanTaiSoap[] soapModels = new SRCGiayPhepVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SRCGiayPhepVanTaiSoap[][] toSoapModels(
		SRCGiayPhepVanTai[][] models) {
		SRCGiayPhepVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SRCGiayPhepVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SRCGiayPhepVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SRCGiayPhepVanTaiSoap[] toSoapModels(
		List<SRCGiayPhepVanTai> models) {
		List<SRCGiayPhepVanTaiSoap> soapModels = new ArrayList<SRCGiayPhepVanTaiSoap>(models.size());

		for (SRCGiayPhepVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SRCGiayPhepVanTaiSoap[soapModels.size()]);
	}

	public SRCGiayPhepVanTaiSoap() {
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

	public long getCoquanquanly_id() {
		return _coquanquanly_id;
	}

	public void setCoquanquanly_id(long coquanquanly_id) {
		_coquanquanly_id = coquanquanly_id;
	}

	public String getTen_coquancapphep() {
		return _ten_coquancapphep;
	}

	public void setTen_coquancapphep(String ten_coquancapphep) {
		_ten_coquancapphep = ten_coquancapphep;
	}

	public long getDoanhnghiep_id() {
		return _doanhnghiep_id;
	}

	public void setDoanhnghiep_id(long doanhnghiep_id) {
		_doanhnghiep_id = doanhnghiep_id;
	}

	public String getTen_doanhnghiep() {
		return _ten_doanhnghiep;
	}

	public void setTen_doanhnghiep(String ten_doanhnghiep) {
		_ten_doanhnghiep = ten_doanhnghiep;
	}

	public String getDiachi_doanhnghiep() {
		return _diachi_doanhnghiep;
	}

	public void setDiachi_doanhnghiep(String diachi_doanhnghiep) {
		_diachi_doanhnghiep = diachi_doanhnghiep;
	}

	public String getDienthoai_doanhnghiep() {
		return _dienthoai_doanhnghiep;
	}

	public void setDienthoai_doanhnghiep(String dienthoai_doanhnghiep) {
		_dienthoai_doanhnghiep = dienthoai_doanhnghiep;
	}

	public String getFax_doanhnghiep() {
		return _fax_doanhnghiep;
	}

	public void setFax_doanhnghiep(String fax_doanhnghiep) {
		_fax_doanhnghiep = fax_doanhnghiep;
	}

	public String getEmail_doanhnghiep() {
		return _email_doanhnghiep;
	}

	public void setEmail_doanhnghiep(String email_doanhnghiep) {
		_email_doanhnghiep = email_doanhnghiep;
	}

	public String getWebsite_doanhnghiep() {
		return _website_doanhnghiep;
	}

	public void setWebsite_doanhnghiep(String website_doanhnghiep) {
		_website_doanhnghiep = website_doanhnghiep;
	}

	public Date getNgay_ky() {
		return _ngay_ky;
	}

	public void setNgay_ky(Date ngay_ky) {
		_ngay_ky = ngay_ky;
	}

	public String getTen_nguoiky() {
		return _ten_nguoiky;
	}

	public void setTen_nguoiky(String ten_nguoiky) {
		_ten_nguoiky = ten_nguoiky;
	}

	public long getNguoi_ky_id() {
		return _nguoi_ky_id;
	}

	public void setNguoi_ky_id(long nguoi_ky_id) {
		_nguoi_ky_id = nguoi_ky_id;
	}

	public String getUrl_file_gpvt() {
		return _url_file_gpvt;
	}

	public void setUrl_file_gpvt(String url_file_gpvt) {
		_url_file_gpvt = url_file_gpvt;
	}

	public String getSogiayphep() {
		return _sogiayphep;
	}

	public void setSogiayphep(String sogiayphep) {
		_sogiayphep = sogiayphep;
	}

	public int getLancapphep() {
		return _lancapphep;
	}

	public void setLancapphep(int lancapphep) {
		_lancapphep = lancapphep;
	}

	public Date getNgaycap() {
		return _ngaycap;
	}

	public void setNgaycap(Date ngaycap) {
		_ngaycap = ngaycap;
	}

	public String getNguoicap() {
		return _nguoicap;
	}

	public void setNguoicap(String nguoicap) {
		_nguoicap = nguoicap;
	}

	public Date getNgayhethan() {
		return _ngayhethan;
	}

	public void setNgayhethan(Date ngayhethan) {
		_ngayhethan = ngayhethan;
	}

	public Date getNgay_thuhoi() {
		return _ngay_thuhoi;
	}

	public void setNgay_thuhoi(Date ngay_thuhoi) {
		_ngay_thuhoi = ngay_thuhoi;
	}

	public String getLydo_thuhoi() {
		return _lydo_thuhoi;
	}

	public void setLydo_thuhoi(String lydo_thuhoi) {
		_lydo_thuhoi = lydo_thuhoi;
	}

	public String getGhichu() {
		return _ghichu;
	}

	public void setGhichu(String ghichu) {
		_ghichu = ghichu;
	}

	public int getTrangthai() {
		return _trangthai;
	}

	public void setTrangthai(int trangthai) {
		_trangthai = trangthai;
	}

	public long getQuocgia_id() {
		return _quocgia_id;
	}

	public void setQuocgia_id(long quocgia_id) {
		_quocgia_id = quocgia_id;
	}

	private long _id;
	private long _coquanquanly_id;
	private String _ten_coquancapphep;
	private long _doanhnghiep_id;
	private String _ten_doanhnghiep;
	private String _diachi_doanhnghiep;
	private String _dienthoai_doanhnghiep;
	private String _fax_doanhnghiep;
	private String _email_doanhnghiep;
	private String _website_doanhnghiep;
	private Date _ngay_ky;
	private String _ten_nguoiky;
	private long _nguoi_ky_id;
	private String _url_file_gpvt;
	private String _sogiayphep;
	private int _lancapphep;
	private Date _ngaycap;
	private String _nguoicap;
	private Date _ngayhethan;
	private Date _ngay_thuhoi;
	private String _lydo_thuhoi;
	private String _ghichu;
	private int _trangthai;
	private long _quocgia_id;
}