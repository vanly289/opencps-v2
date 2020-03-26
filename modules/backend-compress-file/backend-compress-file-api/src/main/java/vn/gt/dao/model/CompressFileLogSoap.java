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
public class CompressFileLogSoap implements Serializable {
	public static CompressFileLogSoap toSoapModel(CompressFileLog model) {
		CompressFileLogSoap soapModel = new CompressFileLogSoap();

		soapModel.setId(model.getId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setHoSoId(model.getHoSoId());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setOldSize(model.getOldSize());
		soapModel.setNewSize(model.getNewSize());
		soapModel.setStatus(model.getStatus());
		soapModel.setErrorMsg(model.getErrorMsg());

		return soapModel;
	}

	public static CompressFileLogSoap[] toSoapModels(CompressFileLog[] models) {
		CompressFileLogSoap[] soapModels = new CompressFileLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CompressFileLogSoap[][] toSoapModels(
		CompressFileLog[][] models) {
		CompressFileLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CompressFileLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CompressFileLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CompressFileLogSoap[] toSoapModels(
		List<CompressFileLog> models) {
		List<CompressFileLogSoap> soapModels = new ArrayList<CompressFileLogSoap>(models.size());

		for (CompressFileLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CompressFileLogSoap[soapModels.size()]);
	}

	public CompressFileLogSoap() {
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

	public long getHoSoId() {
		return _hoSoId;
	}

	public void setHoSoId(long hoSoId) {
		_hoSoId = hoSoId;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public long getOldSize() {
		return _oldSize;
	}

	public void setOldSize(long oldSize) {
		_oldSize = oldSize;
	}

	public long getNewSize() {
		return _newSize;
	}

	public void setNewSize(long newSize) {
		_newSize = newSize;
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

	public String getErrorMsg() {
		return _errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		_errorMsg = errorMsg;
	}

	private long _id;
	private Date _createDate;
	private long _hoSoId;
	private long _fileEntryId;
	private long _oldSize;
	private long _newSize;
	private boolean _status;
	private String _errorMsg;
}