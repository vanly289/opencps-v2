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
public class PhuHieuBienHieuSoap implements Serializable {
	public static PhuHieuBienHieuSoap toSoapModel(PhuHieuBienHieu model) {
		PhuHieuBienHieuSoap soapModel = new PhuHieuBienHieuSoap();

		soapModel.setId(model.getId());
		soapModel.setSophuhieu(model.getSophuhieu());
		soapModel.setPhuongtien_id(model.getPhuongtien_id());
		soapModel.setLoaihinh_id(model.getLoaihinh_id());
		soapModel.setTuyenkhaithac_id(model.getTuyenkhaithac_id());
		soapModel.setPhamvi_id(model.getPhamvi_id());
		soapModel.setLoai(model.getLoai());
		soapModel.setNgaycap(model.getNgaycap());
		soapModel.setNgayhethan(model.getNgayhethan());
		soapModel.setNgaythuhoi(model.getNgaythuhoi());
		soapModel.setLydo_thuhoi(model.getLydo_thuhoi());
		soapModel.setNguoitao(model.getNguoitao());
		soapModel.setNgaytao(model.getNgaytao());
		soapModel.setNguoiky(model.getNguoiky());
		soapModel.setNguoiky_id(model.getNguoiky_id());
		soapModel.setNgayky(model.getNgayky());
		soapModel.setGhichu(model.getGhichu());
		soapModel.setTrangthai(model.getTrangthai());
		soapModel.setCoquanquanly_id(model.getCoquanquanly_id());
		soapModel.setLabienhieu(model.getLabienhieu());

		return soapModel;
	}

	public static PhuHieuBienHieuSoap[] toSoapModels(PhuHieuBienHieu[] models) {
		PhuHieuBienHieuSoap[] soapModels = new PhuHieuBienHieuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PhuHieuBienHieuSoap[][] toSoapModels(
		PhuHieuBienHieu[][] models) {
		PhuHieuBienHieuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PhuHieuBienHieuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PhuHieuBienHieuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PhuHieuBienHieuSoap[] toSoapModels(
		List<PhuHieuBienHieu> models) {
		List<PhuHieuBienHieuSoap> soapModels = new ArrayList<PhuHieuBienHieuSoap>(models.size());

		for (PhuHieuBienHieu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PhuHieuBienHieuSoap[soapModels.size()]);
	}

	public PhuHieuBienHieuSoap() {
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

	public String getSophuhieu() {
		return _sophuhieu;
	}

	public void setSophuhieu(String sophuhieu) {
		_sophuhieu = sophuhieu;
	}

	public long getPhuongtien_id() {
		return _phuongtien_id;
	}

	public void setPhuongtien_id(long phuongtien_id) {
		_phuongtien_id = phuongtien_id;
	}

	public long getLoaihinh_id() {
		return _loaihinh_id;
	}

	public void setLoaihinh_id(long loaihinh_id) {
		_loaihinh_id = loaihinh_id;
	}

	public long getTuyenkhaithac_id() {
		return _tuyenkhaithac_id;
	}

	public void setTuyenkhaithac_id(long tuyenkhaithac_id) {
		_tuyenkhaithac_id = tuyenkhaithac_id;
	}

	public long getPhamvi_id() {
		return _phamvi_id;
	}

	public void setPhamvi_id(long phamvi_id) {
		_phamvi_id = phamvi_id;
	}

	public int getLoai() {
		return _loai;
	}

	public void setLoai(int loai) {
		_loai = loai;
	}

	public Date getNgaycap() {
		return _ngaycap;
	}

	public void setNgaycap(Date ngaycap) {
		_ngaycap = ngaycap;
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

	public String getNguoitao() {
		return _nguoitao;
	}

	public void setNguoitao(String nguoitao) {
		_nguoitao = nguoitao;
	}

	public Date getNgaytao() {
		return _ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		_ngaytao = ngaytao;
	}

	public String getNguoiky() {
		return _nguoiky;
	}

	public void setNguoiky(String nguoiky) {
		_nguoiky = nguoiky;
	}

	public long getNguoiky_id() {
		return _nguoiky_id;
	}

	public void setNguoiky_id(long nguoiky_id) {
		_nguoiky_id = nguoiky_id;
	}

	public Date getNgayky() {
		return _ngayky;
	}

	public void setNgayky(Date ngayky) {
		_ngayky = ngayky;
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

	public long getCoquanquanly_id() {
		return _coquanquanly_id;
	}

	public void setCoquanquanly_id(long coquanquanly_id) {
		_coquanquanly_id = coquanquanly_id;
	}

	public int getLabienhieu() {
		return _labienhieu;
	}

	public void setLabienhieu(int labienhieu) {
		_labienhieu = labienhieu;
	}

	private long _id;
	private String _sophuhieu;
	private long _phuongtien_id;
	private long _loaihinh_id;
	private long _tuyenkhaithac_id;
	private long _phamvi_id;
	private int _loai;
	private Date _ngaycap;
	private Date _ngayhethan;
	private Date _ngaythuhoi;
	private String _lydo_thuhoi;
	private String _nguoitao;
	private Date _ngaytao;
	private String _nguoiky;
	private long _nguoiky_id;
	private Date _ngayky;
	private String _ghichu;
	private int _trangthai;
	private long _coquanquanly_id;
	private int _labienhieu;
}