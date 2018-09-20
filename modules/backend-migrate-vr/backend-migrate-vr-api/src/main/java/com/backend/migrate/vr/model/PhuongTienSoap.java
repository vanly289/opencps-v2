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
public class PhuongTienSoap implements Serializable {
	public static PhuongTienSoap toSoapModel(PhuongTien model) {
		PhuongTienSoap soapModel = new PhuongTienSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setBienkiemsoat(model.getBienkiemsoat());
		soapModel.setSucchua(model.getSucchua());
		soapModel.setLoaighe_id(model.getLoaighe_id());
		soapModel.setNamsanxuat(model.getNamsanxuat());
		soapModel.setNuocsanxuat_id(model.getNuocsanxuat_id());
		soapModel.setTenhieuxe_id(model.getTenhieuxe_id());
		soapModel.setMauson_id(model.getMauson_id());
		soapModel.setSokhung(model.getSokhung());
		soapModel.setSomay(model.getSomay());
		soapModel.setNamhetnienhansudung(model.getNamhetnienhansudung());
		soapModel.setNamcaitao(model.getNamcaitao());
		soapModel.setTrongtai(model.getTrongtai());
		soapModel.setLoaihinhvantai_id(model.getLoaihinhvantai_id());
		soapModel.setLa_xegiuongnam(model.getLa_xegiuongnam());
		soapModel.setSogiuongnam(model.getSogiuongnam());
		soapModel.setTennguoisohuu(model.getTennguoisohuu());
		soapModel.setDoanhnghiep_id(model.getDoanhnghiep_id());
		soapModel.setTuyenkhaithac_id(model.getTuyenkhaithac_id());
		soapModel.setWeb_giamsathanhtrinh(model.getWeb_giamsathanhtrinh());
		soapModel.setTendangnhap_gsht(model.getTendangnhap_gsht());
		soapModel.setMatkhau_gsht(model.getMatkhau_gsht());
		soapModel.setGhichu(model.getGhichu());
		soapModel.setTrangthai(model.getTrangthai());
		soapModel.setCoquanquanly_id(model.getCoquanquanly_id());
		soapModel.setCongdan_id(model.getCongdan_id());

		return soapModel;
	}

	public static PhuongTienSoap[] toSoapModels(PhuongTien[] models) {
		PhuongTienSoap[] soapModels = new PhuongTienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PhuongTienSoap[][] toSoapModels(PhuongTien[][] models) {
		PhuongTienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PhuongTienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PhuongTienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PhuongTienSoap[] toSoapModels(List<PhuongTien> models) {
		List<PhuongTienSoap> soapModels = new ArrayList<PhuongTienSoap>(models.size());

		for (PhuongTien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PhuongTienSoap[soapModels.size()]);
	}

	public PhuongTienSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
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

	public long getLoaighe_id() {
		return _loaighe_id;
	}

	public void setLoaighe_id(long loaighe_id) {
		_loaighe_id = loaighe_id;
	}

	public int getNamsanxuat() {
		return _namsanxuat;
	}

	public void setNamsanxuat(int namsanxuat) {
		_namsanxuat = namsanxuat;
	}

	public long getNuocsanxuat_id() {
		return _nuocsanxuat_id;
	}

	public void setNuocsanxuat_id(long nuocsanxuat_id) {
		_nuocsanxuat_id = nuocsanxuat_id;
	}

	public long getTenhieuxe_id() {
		return _tenhieuxe_id;
	}

	public void setTenhieuxe_id(long tenhieuxe_id) {
		_tenhieuxe_id = tenhieuxe_id;
	}

	public long getMauson_id() {
		return _mauson_id;
	}

	public void setMauson_id(long mauson_id) {
		_mauson_id = mauson_id;
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

	public int getNamhetnienhansudung() {
		return _namhetnienhansudung;
	}

	public void setNamhetnienhansudung(int namhetnienhansudung) {
		_namhetnienhansudung = namhetnienhansudung;
	}

	public Date getNamcaitao() {
		return _namcaitao;
	}

	public void setNamcaitao(Date namcaitao) {
		_namcaitao = namcaitao;
	}

	public int getTrongtai() {
		return _trongtai;
	}

	public void setTrongtai(int trongtai) {
		_trongtai = trongtai;
	}

	public int getLoaihinhvantai_id() {
		return _loaihinhvantai_id;
	}

	public void setLoaihinhvantai_id(int loaihinhvantai_id) {
		_loaihinhvantai_id = loaihinhvantai_id;
	}

	public int getLa_xegiuongnam() {
		return _la_xegiuongnam;
	}

	public void setLa_xegiuongnam(int la_xegiuongnam) {
		_la_xegiuongnam = la_xegiuongnam;
	}

	public int getSogiuongnam() {
		return _sogiuongnam;
	}

	public void setSogiuongnam(int sogiuongnam) {
		_sogiuongnam = sogiuongnam;
	}

	public String getTennguoisohuu() {
		return _tennguoisohuu;
	}

	public void setTennguoisohuu(String tennguoisohuu) {
		_tennguoisohuu = tennguoisohuu;
	}

	public int getDoanhnghiep_id() {
		return _doanhnghiep_id;
	}

	public void setDoanhnghiep_id(int doanhnghiep_id) {
		_doanhnghiep_id = doanhnghiep_id;
	}

	public int getTuyenkhaithac_id() {
		return _tuyenkhaithac_id;
	}

	public void setTuyenkhaithac_id(int tuyenkhaithac_id) {
		_tuyenkhaithac_id = tuyenkhaithac_id;
	}

	public String getWeb_giamsathanhtrinh() {
		return _web_giamsathanhtrinh;
	}

	public void setWeb_giamsathanhtrinh(String web_giamsathanhtrinh) {
		_web_giamsathanhtrinh = web_giamsathanhtrinh;
	}

	public String getTendangnhap_gsht() {
		return _tendangnhap_gsht;
	}

	public void setTendangnhap_gsht(String tendangnhap_gsht) {
		_tendangnhap_gsht = tendangnhap_gsht;
	}

	public String getMatkhau_gsht() {
		return _matkhau_gsht;
	}

	public void setMatkhau_gsht(String matkhau_gsht) {
		_matkhau_gsht = matkhau_gsht;
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

	public int getCoquanquanly_id() {
		return _coquanquanly_id;
	}

	public void setCoquanquanly_id(int coquanquanly_id) {
		_coquanquanly_id = coquanquanly_id;
	}

	public long getCongdan_id() {
		return _congdan_id;
	}

	public void setCongdan_id(long congdan_id) {
		_congdan_id = congdan_id;
	}

	private String _uuid;
	private long _id;
	private String _bienkiemsoat;
	private int _succhua;
	private long _loaighe_id;
	private int _namsanxuat;
	private long _nuocsanxuat_id;
	private long _tenhieuxe_id;
	private long _mauson_id;
	private String _sokhung;
	private String _somay;
	private int _namhetnienhansudung;
	private Date _namcaitao;
	private int _trongtai;
	private int _loaihinhvantai_id;
	private int _la_xegiuongnam;
	private int _sogiuongnam;
	private String _tennguoisohuu;
	private int _doanhnghiep_id;
	private int _tuyenkhaithac_id;
	private String _web_giamsathanhtrinh;
	private String _tendangnhap_gsht;
	private String _matkhau_gsht;
	private String _ghichu;
	private int _trangthai;
	private int _coquanquanly_id;
	private long _congdan_id;
}