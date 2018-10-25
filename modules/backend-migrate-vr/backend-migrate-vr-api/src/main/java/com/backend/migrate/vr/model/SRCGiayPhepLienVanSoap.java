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
public class SRCGiayPhepLienVanSoap implements Serializable {
	public static SRCGiayPhepLienVanSoap toSoapModel(SRCGiayPhepLienVan model) {
		SRCGiayPhepLienVanSoap soapModel = new SRCGiayPhepLienVanSoap();

		soapModel.setId(model.getId());
		soapModel.setSo_phuhieu_lienvan(model.getSo_phuhieu_lienvan());
		soapModel.setLancapphep(model.getLancapphep());
		soapModel.setPhuongtien_id(model.getPhuongtien_id());
		soapModel.setBienkiemsoat(model.getBienkiemsoat());
		soapModel.setSucchua(model.getSucchua());
		soapModel.setNamsanxuat(model.getNamsanxuat());
		soapModel.setNhanhieu_id(model.getNhanhieu_id());
		soapModel.setSokhung(model.getSokhung());
		soapModel.setSomay(model.getSomay());
		soapModel.setMauson_id(model.getMauson_id());
		soapModel.setLoaihinh_id(model.getLoaihinh_id());
		soapModel.setCuakhau_id(model.getCuakhau_id());
		soapModel.setDenghi_captu(model.getDenghi_captu());
		soapModel.setDenghi_capden(model.getDenghi_capden());
		soapModel.setNgaycap(model.getNgaycap());
		soapModel.setNguoicap(model.getNguoicap());
		soapModel.setNgayhethan(model.getNgayhethan());
		soapModel.setNgaythuhoi(model.getNgaythuhoi());
		soapModel.setLydo_thuhoi(model.getLydo_thuhoi());
		soapModel.setNgayky(model.getNgayky());
		soapModel.setNguoiky(model.getNguoiky());
		soapModel.setNguoi_ky_id(model.getNguoi_ky_id());
		soapModel.setGhichu(model.getGhichu());
		soapModel.setUrl_file_gplv(model.getUrl_file_gplv());
		soapModel.setTrangthai(model.getTrangthai());
		soapModel.setQuocgia_id(model.getQuocgia_id());
		soapModel.setTuyen_id(model.getTuyen_id());
		soapModel.setCoquanquanly_id(model.getCoquanquanly_id());

		return soapModel;
	}

	public static SRCGiayPhepLienVanSoap[] toSoapModels(
		SRCGiayPhepLienVan[] models) {
		SRCGiayPhepLienVanSoap[] soapModels = new SRCGiayPhepLienVanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SRCGiayPhepLienVanSoap[][] toSoapModels(
		SRCGiayPhepLienVan[][] models) {
		SRCGiayPhepLienVanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SRCGiayPhepLienVanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SRCGiayPhepLienVanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SRCGiayPhepLienVanSoap[] toSoapModels(
		List<SRCGiayPhepLienVan> models) {
		List<SRCGiayPhepLienVanSoap> soapModels = new ArrayList<SRCGiayPhepLienVanSoap>(models.size());

		for (SRCGiayPhepLienVan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SRCGiayPhepLienVanSoap[soapModels.size()]);
	}

	public SRCGiayPhepLienVanSoap() {
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

	public String getSo_phuhieu_lienvan() {
		return _so_phuhieu_lienvan;
	}

	public void setSo_phuhieu_lienvan(String so_phuhieu_lienvan) {
		_so_phuhieu_lienvan = so_phuhieu_lienvan;
	}

	public int getLancapphep() {
		return _lancapphep;
	}

	public void setLancapphep(int lancapphep) {
		_lancapphep = lancapphep;
	}

	public long getPhuongtien_id() {
		return _phuongtien_id;
	}

	public void setPhuongtien_id(long phuongtien_id) {
		_phuongtien_id = phuongtien_id;
	}

	public String getBienkiemsoat() {
		return _bienkiemsoat;
	}

	public void setBienkiemsoat(String bienkiemsoat) {
		_bienkiemsoat = bienkiemsoat;
	}

	public int getSucchua() {
		return _succhua;
	}

	public void setSucchua(int succhua) {
		_succhua = succhua;
	}

	public int getNamsanxuat() {
		return _namsanxuat;
	}

	public void setNamsanxuat(int namsanxuat) {
		_namsanxuat = namsanxuat;
	}

	public long getNhanhieu_id() {
		return _nhanhieu_id;
	}

	public void setNhanhieu_id(long nhanhieu_id) {
		_nhanhieu_id = nhanhieu_id;
	}

	public String getSokhung() {
		return _sokhung;
	}

	public void setSokhung(String sokhung) {
		_sokhung = sokhung;
	}

	public String getSomay() {
		return _somay;
	}

	public void setSomay(String somay) {
		_somay = somay;
	}

	public long getMauson_id() {
		return _mauson_id;
	}

	public void setMauson_id(long mauson_id) {
		_mauson_id = mauson_id;
	}

	public long getLoaihinh_id() {
		return _loaihinh_id;
	}

	public void setLoaihinh_id(long loaihinh_id) {
		_loaihinh_id = loaihinh_id;
	}

	public long getCuakhau_id() {
		return _cuakhau_id;
	}

	public void setCuakhau_id(long cuakhau_id) {
		_cuakhau_id = cuakhau_id;
	}

	public Date getDenghi_captu() {
		return _denghi_captu;
	}

	public void setDenghi_captu(Date denghi_captu) {
		_denghi_captu = denghi_captu;
	}

	public Date getDenghi_capden() {
		return _denghi_capden;
	}

	public void setDenghi_capden(Date denghi_capden) {
		_denghi_capden = denghi_capden;
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

	public Date getNgaythuhoi() {
		return _ngaythuhoi;
	}

	public void setNgaythuhoi(Date ngaythuhoi) {
		_ngaythuhoi = ngaythuhoi;
	}

	public String getLydo_thuhoi() {
		return _lydo_thuhoi;
	}

	public void setLydo_thuhoi(String lydo_thuhoi) {
		_lydo_thuhoi = lydo_thuhoi;
	}

	public Date getNgayky() {
		return _ngayky;
	}

	public void setNgayky(Date ngayky) {
		_ngayky = ngayky;
	}

	public String getNguoiky() {
		return _nguoiky;
	}

	public void setNguoiky(String nguoiky) {
		_nguoiky = nguoiky;
	}

	public long getNguoi_ky_id() {
		return _nguoi_ky_id;
	}

	public void setNguoi_ky_id(long nguoi_ky_id) {
		_nguoi_ky_id = nguoi_ky_id;
	}

	public String getGhichu() {
		return _ghichu;
	}

	public void setGhichu(String ghichu) {
		_ghichu = ghichu;
	}

	public String getUrl_file_gplv() {
		return _url_file_gplv;
	}

	public void setUrl_file_gplv(String url_file_gplv) {
		_url_file_gplv = url_file_gplv;
	}

	public String getTrangthai() {
		return _trangthai;
	}

	public void setTrangthai(String trangthai) {
		_trangthai = trangthai;
	}

	public long getQuocgia_id() {
		return _quocgia_id;
	}

	public void setQuocgia_id(long quocgia_id) {
		_quocgia_id = quocgia_id;
	}

	public long getTuyen_id() {
		return _tuyen_id;
	}

	public void setTuyen_id(long tuyen_id) {
		_tuyen_id = tuyen_id;
	}

	public long getCoquanquanly_id() {
		return _coquanquanly_id;
	}

	public void setCoquanquanly_id(long coquanquanly_id) {
		_coquanquanly_id = coquanquanly_id;
	}

	private long _id;
	private String _so_phuhieu_lienvan;
	private int _lancapphep;
	private long _phuongtien_id;
	private String _bienkiemsoat;
	private int _succhua;
	private int _namsanxuat;
	private long _nhanhieu_id;
	private String _sokhung;
	private String _somay;
	private long _mauson_id;
	private long _loaihinh_id;
	private long _cuakhau_id;
	private Date _denghi_captu;
	private Date _denghi_capden;
	private Date _ngaycap;
	private String _nguoicap;
	private Date _ngayhethan;
	private Date _ngaythuhoi;
	private String _lydo_thuhoi;
	private Date _ngayky;
	private String _nguoiky;
	private long _nguoi_ky_id;
	private String _ghichu;
	private String _url_file_gplv;
	private String _trangthai;
	private long _quocgia_id;
	private long _tuyen_id;
	private long _coquanquanly_id;
}