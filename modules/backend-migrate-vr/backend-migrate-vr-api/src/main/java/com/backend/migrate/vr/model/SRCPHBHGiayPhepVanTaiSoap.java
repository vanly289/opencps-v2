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
public class SRCPHBHGiayPhepVanTaiSoap implements Serializable {
	public static SRCPHBHGiayPhepVanTaiSoap toSoapModel(
		SRCPHBHGiayPhepVanTai model) {
		SRCPHBHGiayPhepVanTaiSoap soapModel = new SRCPHBHGiayPhepVanTaiSoap();

		soapModel.setId(model.getId());
		soapModel.setCoquanquanly_id(model.getCoquanquanly_id());
		soapModel.setDoanhnghiep_id(model.getDoanhnghiep_id());
		soapModel.setSogiayphep(model.getSogiayphep());
		soapModel.setLancapphep(model.getLancapphep());
		soapModel.setNgaycap(model.getNgaycap());
		soapModel.setNguoicap(model.getNguoicap());
		soapModel.setNgayhethan(model.getNgayhethan());
		soapModel.setNguoidieuhanh(model.getNguoidieuhanh());
		soapModel.setBangcap(model.getBangcap());
		soapModel.setNgaysinh(model.getNgaysinh());
		soapModel.setSocmnd(model.getSocmnd());
		soapModel.setNguoiky(model.getNguoiky());
		soapModel.setNguoiky_id(model.getNguoiky_id());
		soapModel.setNgayky(model.getNgayky());
		soapModel.setNgay_thuhoi(model.getNgay_thuhoi());
		soapModel.setLydo_thuhoi(model.getLydo_thuhoi());
		soapModel.setGhichu(model.getGhichu());
		soapModel.setTrangthai(model.getTrangthai());

		return soapModel;
	}

	public static SRCPHBHGiayPhepVanTaiSoap[] toSoapModels(
		SRCPHBHGiayPhepVanTai[] models) {
		SRCPHBHGiayPhepVanTaiSoap[] soapModels = new SRCPHBHGiayPhepVanTaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SRCPHBHGiayPhepVanTaiSoap[][] toSoapModels(
		SRCPHBHGiayPhepVanTai[][] models) {
		SRCPHBHGiayPhepVanTaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SRCPHBHGiayPhepVanTaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SRCPHBHGiayPhepVanTaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SRCPHBHGiayPhepVanTaiSoap[] toSoapModels(
		List<SRCPHBHGiayPhepVanTai> models) {
		List<SRCPHBHGiayPhepVanTaiSoap> soapModels = new ArrayList<SRCPHBHGiayPhepVanTaiSoap>(models.size());

		for (SRCPHBHGiayPhepVanTai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SRCPHBHGiayPhepVanTaiSoap[soapModels.size()]);
	}

	public SRCPHBHGiayPhepVanTaiSoap() {
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

	public long getDoanhnghiep_id() {
		return _doanhnghiep_id;
	}

	public void setDoanhnghiep_id(long doanhnghiep_id) {
		_doanhnghiep_id = doanhnghiep_id;
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

	public String getNguoidieuhanh() {
		return _nguoidieuhanh;
	}

	public void setNguoidieuhanh(String nguoidieuhanh) {
		_nguoidieuhanh = nguoidieuhanh;
	}

	public String getBangcap() {
		return _bangcap;
	}

	public void setBangcap(String bangcap) {
		_bangcap = bangcap;
	}

	public Date getNgaysinh() {
		return _ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		_ngaysinh = ngaysinh;
	}

	public String getSocmnd() {
		return _socmnd;
	}

	public void setSocmnd(String socmnd) {
		_socmnd = socmnd;
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

	private long _id;
	private long _coquanquanly_id;
	private long _doanhnghiep_id;
	private String _sogiayphep;
	private int _lancapphep;
	private Date _ngaycap;
	private String _nguoicap;
	private Date _ngayhethan;
	private String _nguoidieuhanh;
	private String _bangcap;
	private Date _ngaysinh;
	private String _socmnd;
	private String _nguoiky;
	private long _nguoiky_id;
	private Date _ngayky;
	private Date _ngay_thuhoi;
	private String _lydo_thuhoi;
	private String _ghichu;
	private int _trangthai;
}