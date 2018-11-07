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
public class SRCILHopDongThueSoap implements Serializable {
	public static SRCILHopDongThueSoap toSoapModel(SRCILHopDongThue model) {
		SRCILHopDongThueSoap soapModel = new SRCILHopDongThueSoap();

		soapModel.setId(model.getId());
		soapModel.setPhuongtien_id(model.getPhuongtien_id());
		soapModel.setLoaihinhthue_id(model.getLoaihinhthue_id());
		soapModel.setTendoituongchothue(model.getTendoituongchothue());
		soapModel.setDiachi_doituong_tinh_id(model.getDiachi_doituong_tinh_id());
		soapModel.setDiachi_doituong_huyen_id(model.getDiachi_doituong_huyen_id());
		soapModel.setDiachi_doituong_xa_id(model.getDiachi_doituong_xa_id());
		soapModel.setDiachi_doituong_chitiet(model.getDiachi_doituong_chitiet());
		soapModel.setNgayky(model.getNgayky());
		soapModel.setThoihan(model.getThoihan());
		soapModel.setLa_hopdongcuoi(model.getLa_hopdongcuoi());
		soapModel.setGhichu(model.getGhichu());
		soapModel.setTrangthai(model.getTrangthai());

		return soapModel;
	}

	public static SRCILHopDongThueSoap[] toSoapModels(SRCILHopDongThue[] models) {
		SRCILHopDongThueSoap[] soapModels = new SRCILHopDongThueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SRCILHopDongThueSoap[][] toSoapModels(
		SRCILHopDongThue[][] models) {
		SRCILHopDongThueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SRCILHopDongThueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SRCILHopDongThueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SRCILHopDongThueSoap[] toSoapModels(
		List<SRCILHopDongThue> models) {
		List<SRCILHopDongThueSoap> soapModels = new ArrayList<SRCILHopDongThueSoap>(models.size());

		for (SRCILHopDongThue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SRCILHopDongThueSoap[soapModels.size()]);
	}

	public SRCILHopDongThueSoap() {
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

	public long getPhuongtien_id() {
		return _phuongtien_id;
	}

	public void setPhuongtien_id(long phuongtien_id) {
		_phuongtien_id = phuongtien_id;
	}

	public long getLoaihinhthue_id() {
		return _loaihinhthue_id;
	}

	public void setLoaihinhthue_id(long loaihinhthue_id) {
		_loaihinhthue_id = loaihinhthue_id;
	}

	public String getTendoituongchothue() {
		return _tendoituongchothue;
	}

	public void setTendoituongchothue(String tendoituongchothue) {
		_tendoituongchothue = tendoituongchothue;
	}

	public long getDiachi_doituong_tinh_id() {
		return _diachi_doituong_tinh_id;
	}

	public void setDiachi_doituong_tinh_id(long diachi_doituong_tinh_id) {
		_diachi_doituong_tinh_id = diachi_doituong_tinh_id;
	}

	public long getDiachi_doituong_huyen_id() {
		return _diachi_doituong_huyen_id;
	}

	public void setDiachi_doituong_huyen_id(long diachi_doituong_huyen_id) {
		_diachi_doituong_huyen_id = diachi_doituong_huyen_id;
	}

	public long getDiachi_doituong_xa_id() {
		return _diachi_doituong_xa_id;
	}

	public void setDiachi_doituong_xa_id(long diachi_doituong_xa_id) {
		_diachi_doituong_xa_id = diachi_doituong_xa_id;
	}

	public String getDiachi_doituong_chitiet() {
		return _diachi_doituong_chitiet;
	}

	public void setDiachi_doituong_chitiet(String diachi_doituong_chitiet) {
		_diachi_doituong_chitiet = diachi_doituong_chitiet;
	}

	public Date getNgayky() {
		return _ngayky;
	}

	public void setNgayky(Date ngayky) {
		_ngayky = ngayky;
	}

	public Date getThoihan() {
		return _thoihan;
	}

	public void setThoihan(Date thoihan) {
		_thoihan = thoihan;
	}

	public int getLa_hopdongcuoi() {
		return _la_hopdongcuoi;
	}

	public void setLa_hopdongcuoi(int la_hopdongcuoi) {
		_la_hopdongcuoi = la_hopdongcuoi;
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
	private long _phuongtien_id;
	private long _loaihinhthue_id;
	private String _tendoituongchothue;
	private long _diachi_doituong_tinh_id;
	private long _diachi_doituong_huyen_id;
	private long _diachi_doituong_xa_id;
	private String _diachi_doituong_chitiet;
	private Date _ngayky;
	private Date _thoihan;
	private int _la_hopdongcuoi;
	private String _ghichu;
	private int _trangthai;
}