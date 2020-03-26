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

package vn.gt.dao.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
@ProviderType
public class CompressFileJobSoap implements Serializable {
	public static CompressFileJobSoap toSoapModel(CompressFileJob model) {
		CompressFileJobSoap soapModel = new CompressFileJobSoap();

		soapModel.setId(model.getId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setListHoSoId(model.getListHoSoId());
		soapModel.setLastedHoSoId(model.getLastedHoSoId());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CompressFileJobSoap[] toSoapModels(CompressFileJob[] models) {
		CompressFileJobSoap[] soapModels = new CompressFileJobSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CompressFileJobSoap[][] toSoapModels(
		CompressFileJob[][] models) {
		CompressFileJobSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CompressFileJobSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CompressFileJobSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CompressFileJobSoap[] toSoapModels(
		List<CompressFileJob> models) {
		List<CompressFileJobSoap> soapModels = new ArrayList<CompressFileJobSoap>(models.size());

		for (CompressFileJob model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CompressFileJobSoap[soapModels.size()]);
	}

	public CompressFileJobSoap() {
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

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getListHoSoId() {
		return _listHoSoId;
	}

	public void setListHoSoId(String listHoSoId) {
		_listHoSoId = listHoSoId;
	}

	public long getLastedHoSoId() {
		return _lastedHoSoId;
	}

	public void setLastedHoSoId(long lastedHoSoId) {
		_lastedHoSoId = lastedHoSoId;
	}

	public boolean getStatus() {
		return _status;
	}

	public boolean isStatus() {
		return _status;
	}

	public void setStatus(boolean status) {
		_status = status;
	}

	private long _id;
	private Date _createDate;
	private Date _modifiedDate;
	private String _listHoSoId;
	private long _lastedHoSoId;
	private boolean _status;
}