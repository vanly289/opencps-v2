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
 * This class is used by SOAP remote services, specifically {@link com.fds.vr.business.service.http.VRCorporationInspectorServiceSoap}.
 *
 * @author LamTV
 * @see com.fds.vr.business.service.http.VRCorporationInspectorServiceSoap
 * @generated
 */
@ProviderType
public class VRCorporationInspectorSoap implements Serializable {
	public static VRCorporationInspectorSoap toSoapModel(
		VRCorporationInspector model) {
		VRCorporationInspectorSoap soapModel = new VRCorporationInspectorSoap();

		soapModel.setId(model.getId());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setInspectorName(model.getInspectorName());
		soapModel.setInspectorPhone(model.getInspectorPhone());
		soapModel.setInspectorEmail(model.getInspectorEmail());
		soapModel.setContactCode(model.getContactCode());
		soapModel.setTeamId(model.getTeamId());
		soapModel.setMarkupTeamLeader(model.getMarkupTeamLeader());
		soapModel.setMarkupBoss(model.getMarkupBoss());
		soapModel.setPlace(model.getPlace());
		soapModel.setTitle(model.getTitle());
		soapModel.setFileChuKyId(model.getFileChuKyId());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRCorporationInspectorSoap[] toSoapModels(
		VRCorporationInspector[] models) {
		VRCorporationInspectorSoap[] soapModels = new VRCorporationInspectorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCorporationInspectorSoap[][] toSoapModels(
		VRCorporationInspector[][] models) {
		VRCorporationInspectorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCorporationInspectorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCorporationInspectorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCorporationInspectorSoap[] toSoapModels(
		List<VRCorporationInspector> models) {
		List<VRCorporationInspectorSoap> soapModels = new ArrayList<VRCorporationInspectorSoap>(models.size());

		for (VRCorporationInspector model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCorporationInspectorSoap[soapModels.size()]);
	}

	public VRCorporationInspectorSoap() {
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

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public String getInspectorName() {
		return _inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;
	}

	public String getInspectorPhone() {
		return _inspectorPhone;
	}

	public void setInspectorPhone(String inspectorPhone) {
		_inspectorPhone = inspectorPhone;
	}

	public String getInspectorEmail() {
		return _inspectorEmail;
	}

	public void setInspectorEmail(String inspectorEmail) {
		_inspectorEmail = inspectorEmail;
	}

	public Date getContactCode() {
		return _contactCode;
	}

	public void setContactCode(Date contactCode) {
		_contactCode = contactCode;
	}

	public long getTeamId() {
		return _teamId;
	}

	public void setTeamId(long teamId) {
		_teamId = teamId;
	}

	public long getMarkupTeamLeader() {
		return _markupTeamLeader;
	}

	public void setMarkupTeamLeader(long markupTeamLeader) {
		_markupTeamLeader = markupTeamLeader;
	}

	public long getMarkupBoss() {
		return _markupBoss;
	}

	public void setMarkupBoss(long markupBoss) {
		_markupBoss = markupBoss;
	}

	public String getPlace() {
		return _place;
	}

	public void setPlace(String place) {
		_place = place;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public long getFileChuKyId() {
		return _fileChuKyId;
	}

	public void setFileChuKyId(long fileChuKyId) {
		_fileChuKyId = fileChuKyId;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private String _corporationId;
	private long _inspectorId;
	private String _inspectorName;
	private String _inspectorPhone;
	private String _inspectorEmail;
	private Date _contactCode;
	private long _teamId;
	private long _markupTeamLeader;
	private long _markupBoss;
	private String _place;
	private String _title;
	private long _fileChuKyId;
	private Date _modifyDate;
	private Date _syncDate;
}