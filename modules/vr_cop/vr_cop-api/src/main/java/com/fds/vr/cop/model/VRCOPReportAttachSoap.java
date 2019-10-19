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

package com.fds.vr.cop.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author HoangLeTrongNhan
 * @generated
 */
@ProviderType
public class VRCOPReportAttachSoap implements Serializable {
	public static VRCOPReportAttachSoap toSoapModel(VRCOPReportAttach model) {
		VRCOPReportAttachSoap soapModel = new VRCOPReportAttachSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCOPReportRepositoryID(model.getCOPReportRepositoryID());
		soapModel.setCOPReportNo(model.getCOPReportNo());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setDocName(model.getDocName());
		soapModel.setDocNo(model.getDocNo());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setModifyDate(model.getModifyDate());

		return soapModel;
	}

	public static VRCOPReportAttachSoap[] toSoapModels(
		VRCOPReportAttach[] models) {
		VRCOPReportAttachSoap[] soapModels = new VRCOPReportAttachSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCOPReportAttachSoap[][] toSoapModels(
		VRCOPReportAttach[][] models) {
		VRCOPReportAttachSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCOPReportAttachSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCOPReportAttachSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCOPReportAttachSoap[] toSoapModels(
		List<VRCOPReportAttach> models) {
		List<VRCOPReportAttachSoap> soapModels = new ArrayList<VRCOPReportAttachSoap>(models.size());

		for (VRCOPReportAttach model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCOPReportAttachSoap[soapModels.size()]);
	}

	public VRCOPReportAttachSoap() {
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

	public int getMtCore() {
		return _mtCore;
	}

	public void setMtCore(int mtCore) {
		_mtCore = mtCore;
	}

	public long getCOPReportRepositoryID() {
		return _COPReportRepositoryID;
	}

	public void setCOPReportRepositoryID(long COPReportRepositoryID) {
		_COPReportRepositoryID = COPReportRepositoryID;
	}

	public String getCOPReportNo() {
		return _COPReportNo;
	}

	public void setCOPReportNo(String COPReportNo) {
		_COPReportNo = COPReportNo;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getDocName() {
		return _docName;
	}

	public void setDocName(String docName) {
		_docName = docName;
	}

	public String getDocNo() {
		return _docNo;
	}

	public void setDocNo(String docNo) {
		_docNo = docNo;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	private long _id;
	private int _mtCore;
	private long _COPReportRepositoryID;
	private String _COPReportNo;
	private long _sequenceNo;
	private String _docName;
	private String _docNo;
	private String _remarks;
	private Date _modifyDate;
}