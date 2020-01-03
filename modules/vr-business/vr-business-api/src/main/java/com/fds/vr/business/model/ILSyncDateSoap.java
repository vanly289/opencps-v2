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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.fds.vr.business.service.http.ILSyncDateServiceSoap}.
 *
 * @author LamTV
 * @see com.fds.vr.business.service.http.ILSyncDateServiceSoap
 * @generated
 */
@ProviderType
public class ILSyncDateSoap implements Serializable {
	public static ILSyncDateSoap toSoapModel(ILSyncDate model) {
		ILSyncDateSoap soapModel = new ILSyncDateSoap();

		soapModel.setId(model.getId());
		soapModel.setTableName(model.getTableName());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static ILSyncDateSoap[] toSoapModels(ILSyncDate[] models) {
		ILSyncDateSoap[] soapModels = new ILSyncDateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ILSyncDateSoap[][] toSoapModels(ILSyncDate[][] models) {
		ILSyncDateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ILSyncDateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ILSyncDateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ILSyncDateSoap[] toSoapModels(List<ILSyncDate> models) {
		List<ILSyncDateSoap> soapModels = new ArrayList<ILSyncDateSoap>(models.size());

		for (ILSyncDate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ILSyncDateSoap[soapModels.size()]);
	}

	public ILSyncDateSoap() {
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

	public String getTableName() {
		return _tableName;
	}

	public void setTableName(String tableName) {
		_tableName = tableName;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private String _tableName;
	private Date _syncDate;
}