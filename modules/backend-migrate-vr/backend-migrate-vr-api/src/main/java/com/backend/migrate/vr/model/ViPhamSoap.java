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
 * This class is used by SOAP remote services, specifically {@link com.backend.migrate.vr.service.http.ViPhamServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.http.ViPhamServiceSoap
 * @generated
 */
@ProviderType
public class ViPhamSoap implements Serializable {
	public static ViPhamSoap toSoapModel(ViPham model) {
		ViPhamSoap soapModel = new ViPhamSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setPhuongtien_id(model.getPhuongtien_id());
		soapModel.setNgayvipham(model.getNgayvipham());
		soapModel.setLoaivipham_id(model.getLoaivipham_id());
		soapModel.setMota(model.getMota());
		soapModel.setUrl_bienban(model.getUrl_bienban());

		return soapModel;
	}

	public static ViPhamSoap[] toSoapModels(ViPham[] models) {
		ViPhamSoap[] soapModels = new ViPhamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ViPhamSoap[][] toSoapModels(ViPham[][] models) {
		ViPhamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ViPhamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ViPhamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ViPhamSoap[] toSoapModels(List<ViPham> models) {
		List<ViPhamSoap> soapModels = new ArrayList<ViPhamSoap>(models.size());

		for (ViPham model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ViPhamSoap[soapModels.size()]);
	}

	public ViPhamSoap() {
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

	public long getPhuongtien_id() {
		return _phuongtien_id;
	}

	public void setPhuongtien_id(long phuongtien_id) {
		_phuongtien_id = phuongtien_id;
	}

	public Date getNgayvipham() {
		return _ngayvipham;
	}

	public void setNgayvipham(Date ngayvipham) {
		_ngayvipham = ngayvipham;
	}

	public long getLoaivipham_id() {
		return _loaivipham_id;
	}

	public void setLoaivipham_id(long loaivipham_id) {
		_loaivipham_id = loaivipham_id;
	}

	public String getMota() {
		return _mota;
	}

	public void setMota(String mota) {
		_mota = mota;
	}

	public String getUrl_bienban() {
		return _url_bienban;
	}

	public void setUrl_bienban(String url_bienban) {
		_url_bienban = url_bienban;
	}

	private String _uuid;
	private long _id;
	private long _phuongtien_id;
	private Date _ngayvipham;
	private long _loaivipham_id;
	private String _mota;
	private String _url_bienban;
}