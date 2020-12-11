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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRIssueInspectionRecord;
import com.fds.vr.business.model.VRIssueInspectionRecordModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VRIssueInspectionRecord service. Represents a row in the &quot;vr_issue_inspectionrecord&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRIssueInspectionRecordModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRIssueInspectionRecordImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRIssueInspectionRecordImpl
 * @see VRIssueInspectionRecord
 * @see VRIssueInspectionRecordModel
 * @generated
 */
@ProviderType
public class VRIssueInspectionRecordModelImpl extends BaseModelImpl<VRIssueInspectionRecord>
	implements VRIssueInspectionRecordModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr issue inspection record model instance should use the {@link VRIssueInspectionRecord} interface instead.
	 */
	public static final String TABLE_NAME = "vr_issue_inspectionrecord";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "mtCore", Types.BIGINT },
			{ "issueId", Types.BIGINT },
			{ "dossierId", Types.BIGINT },
			{ "certificateId", Types.BIGINT },
			{ "totalQuantity", Types.INTEGER },
			{ "postReview", Types.VARCHAR },
			{ "postReviewRecordNo", Types.VARCHAR },
			{ "postReviewRecordDate", Types.TIMESTAMP },
			{ "corporationId", Types.BIGINT },
			{ "inspectorCode", Types.VARCHAR },
			{ "inspectorName", Types.VARCHAR },
			{ "leaderName", Types.VARCHAR },
			{ "issueCorporationId", Types.BIGINT },
			{ "verifyCorporationId", Types.BIGINT },
			{ "inspectorId", Types.BIGINT },
			{ "issueInspectorId", Types.BIGINT },
			{ "verifyInspectorId", Types.BIGINT },
			{ "digitalIssueStatus", Types.VARCHAR },
			{ "validRemarks", Types.VARCHAR },
			{ "validInspectionNote", Types.VARCHAR },
			{ "documentFileEntryid", Types.BIGINT },
			{ "modifyDate", Types.TIMESTAMP },
			{ "syncDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("mtCore", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("issueId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dossierId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("certificateId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("totalQuantity", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("postReview", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("postReviewRecordNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("postReviewRecordDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("corporationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("inspectorCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("inspectorName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("leaderName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("issueCorporationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("verifyCorporationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("inspectorId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("issueInspectorId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("verifyInspectorId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("digitalIssueStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("validRemarks", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("validInspectionNote", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("documentFileEntryid", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifyDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("syncDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table vr_issue_inspectionrecord (id LONG not null primary key,mtCore LONG,issueId LONG,dossierId LONG,certificateId LONG,totalQuantity INTEGER,postReview VARCHAR(75) null,postReviewRecordNo VARCHAR(75) null,postReviewRecordDate DATE null,corporationId LONG,inspectorCode VARCHAR(75) null,inspectorName VARCHAR(75) null,leaderName VARCHAR(75) null,issueCorporationId LONG,verifyCorporationId LONG,inspectorId LONG,issueInspectorId LONG,verifyInspectorId LONG,digitalIssueStatus VARCHAR(75) null,validRemarks VARCHAR(75) null,validInspectionNote VARCHAR(75) null,documentFileEntryid LONG,modifyDate DATE null,syncDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_issue_inspectionrecord";
	public static final String ORDER_BY_JPQL = " ORDER BY vrIssueInspectionRecord.modifyDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_issue_inspectionrecord.modifyDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRIssueInspectionRecord"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRIssueInspectionRecord"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.fds.vr.business.model.VRIssueInspectionRecord"),
			true);
	public static final long CERTIFICATEID_COLUMN_BITMASK = 1L;
	public static final long DOSSIERID_COLUMN_BITMASK = 2L;
	public static final long ISSUEID_COLUMN_BITMASK = 4L;
	public static final long MODIFYDATE_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRIssueInspectionRecord"));

	public VRIssueInspectionRecordModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VRIssueInspectionRecord.class;
	}

	@Override
	public String getModelClassName() {
		return VRIssueInspectionRecord.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("issueId", getIssueId());
		attributes.put("dossierId", getDossierId());
		attributes.put("certificateId", getCertificateId());
		attributes.put("totalQuantity", getTotalQuantity());
		attributes.put("postReview", getPostReview());
		attributes.put("postReviewRecordNo", getPostReviewRecordNo());
		attributes.put("postReviewRecordDate", getPostReviewRecordDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorCode", getInspectorCode());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("leaderName", getLeaderName());
		attributes.put("issueCorporationId", getIssueCorporationId());
		attributes.put("verifyCorporationId", getVerifyCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("issueInspectorId", getIssueInspectorId());
		attributes.put("verifyInspectorId", getVerifyInspectorId());
		attributes.put("digitalIssueStatus", getDigitalIssueStatus());
		attributes.put("validRemarks", getValidRemarks());
		attributes.put("validInspectionNote", getValidInspectionNote());
		attributes.put("documentFileEntryid", getDocumentFileEntryid());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long issueId = (Long)attributes.get("issueId");

		if (issueId != null) {
			setIssueId(issueId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long certificateId = (Long)attributes.get("certificateId");

		if (certificateId != null) {
			setCertificateId(certificateId);
		}

		Integer totalQuantity = (Integer)attributes.get("totalQuantity");

		if (totalQuantity != null) {
			setTotalQuantity(totalQuantity);
		}

		String postReview = (String)attributes.get("postReview");

		if (postReview != null) {
			setPostReview(postReview);
		}

		String postReviewRecordNo = (String)attributes.get("postReviewRecordNo");

		if (postReviewRecordNo != null) {
			setPostReviewRecordNo(postReviewRecordNo);
		}

		Date postReviewRecordDate = (Date)attributes.get("postReviewRecordDate");

		if (postReviewRecordDate != null) {
			setPostReviewRecordDate(postReviewRecordDate);
		}

		Long corporationId = (Long)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String inspectorCode = (String)attributes.get("inspectorCode");

		if (inspectorCode != null) {
			setInspectorCode(inspectorCode);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		String leaderName = (String)attributes.get("leaderName");

		if (leaderName != null) {
			setLeaderName(leaderName);
		}

		Long issueCorporationId = (Long)attributes.get("issueCorporationId");

		if (issueCorporationId != null) {
			setIssueCorporationId(issueCorporationId);
		}

		Long verifyCorporationId = (Long)attributes.get("verifyCorporationId");

		if (verifyCorporationId != null) {
			setVerifyCorporationId(verifyCorporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Long issueInspectorId = (Long)attributes.get("issueInspectorId");

		if (issueInspectorId != null) {
			setIssueInspectorId(issueInspectorId);
		}

		Long verifyInspectorId = (Long)attributes.get("verifyInspectorId");

		if (verifyInspectorId != null) {
			setVerifyInspectorId(verifyInspectorId);
		}

		String digitalIssueStatus = (String)attributes.get("digitalIssueStatus");

		if (digitalIssueStatus != null) {
			setDigitalIssueStatus(digitalIssueStatus);
		}

		String validRemarks = (String)attributes.get("validRemarks");

		if (validRemarks != null) {
			setValidRemarks(validRemarks);
		}

		String validInspectionNote = (String)attributes.get(
				"validInspectionNote");

		if (validInspectionNote != null) {
			setValidInspectionNote(validInspectionNote);
		}

		Long documentFileEntryid = (Long)attributes.get("documentFileEntryid");

		if (documentFileEntryid != null) {
			setDocumentFileEntryid(documentFileEntryid);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getMtCore() {
		return _mtCore;
	}

	@Override
	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	@Override
	public long getIssueId() {
		return _issueId;
	}

	@Override
	public void setIssueId(long issueId) {
		_columnBitmask |= ISSUEID_COLUMN_BITMASK;

		if (!_setOriginalIssueId) {
			_setOriginalIssueId = true;

			_originalIssueId = _issueId;
		}

		_issueId = issueId;
	}

	public long getOriginalIssueId() {
		return _originalIssueId;
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_columnBitmask |= DOSSIERID_COLUMN_BITMASK;

		if (!_setOriginalDossierId) {
			_setOriginalDossierId = true;

			_originalDossierId = _dossierId;
		}

		_dossierId = dossierId;
	}

	public long getOriginalDossierId() {
		return _originalDossierId;
	}

	@Override
	public long getCertificateId() {
		return _certificateId;
	}

	@Override
	public void setCertificateId(long certificateId) {
		_columnBitmask |= CERTIFICATEID_COLUMN_BITMASK;

		if (!_setOriginalCertificateId) {
			_setOriginalCertificateId = true;

			_originalCertificateId = _certificateId;
		}

		_certificateId = certificateId;
	}

	public long getOriginalCertificateId() {
		return _originalCertificateId;
	}

	@Override
	public int getTotalQuantity() {
		return _totalQuantity;
	}

	@Override
	public void setTotalQuantity(int totalQuantity) {
		_totalQuantity = totalQuantity;
	}

	@Override
	public String getPostReview() {
		if (_postReview == null) {
			return StringPool.BLANK;
		}
		else {
			return _postReview;
		}
	}

	@Override
	public void setPostReview(String postReview) {
		_postReview = postReview;
	}

	@Override
	public String getPostReviewRecordNo() {
		if (_postReviewRecordNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _postReviewRecordNo;
		}
	}

	@Override
	public void setPostReviewRecordNo(String postReviewRecordNo) {
		_postReviewRecordNo = postReviewRecordNo;
	}

	@Override
	public Date getPostReviewRecordDate() {
		return _postReviewRecordDate;
	}

	@Override
	public void setPostReviewRecordDate(Date postReviewRecordDate) {
		_postReviewRecordDate = postReviewRecordDate;
	}

	@Override
	public long getCorporationId() {
		return _corporationId;
	}

	@Override
	public void setCorporationId(long corporationId) {
		_corporationId = corporationId;
	}

	@Override
	public String getInspectorCode() {
		if (_inspectorCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _inspectorCode;
		}
	}

	@Override
	public void setInspectorCode(String inspectorCode) {
		_inspectorCode = inspectorCode;
	}

	@Override
	public String getInspectorName() {
		if (_inspectorName == null) {
			return StringPool.BLANK;
		}
		else {
			return _inspectorName;
		}
	}

	@Override
	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;
	}

	@Override
	public String getLeaderName() {
		if (_leaderName == null) {
			return StringPool.BLANK;
		}
		else {
			return _leaderName;
		}
	}

	@Override
	public void setLeaderName(String leaderName) {
		_leaderName = leaderName;
	}

	@Override
	public long getIssueCorporationId() {
		return _issueCorporationId;
	}

	@Override
	public void setIssueCorporationId(long issueCorporationId) {
		_issueCorporationId = issueCorporationId;
	}

	@Override
	public long getVerifyCorporationId() {
		return _verifyCorporationId;
	}

	@Override
	public void setVerifyCorporationId(long verifyCorporationId) {
		_verifyCorporationId = verifyCorporationId;
	}

	@Override
	public long getInspectorId() {
		return _inspectorId;
	}

	@Override
	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	@Override
	public long getIssueInspectorId() {
		return _issueInspectorId;
	}

	@Override
	public void setIssueInspectorId(long issueInspectorId) {
		_issueInspectorId = issueInspectorId;
	}

	@Override
	public long getVerifyInspectorId() {
		return _verifyInspectorId;
	}

	@Override
	public void setVerifyInspectorId(long verifyInspectorId) {
		_verifyInspectorId = verifyInspectorId;
	}

	@Override
	public String getDigitalIssueStatus() {
		if (_digitalIssueStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _digitalIssueStatus;
		}
	}

	@Override
	public void setDigitalIssueStatus(String digitalIssueStatus) {
		_digitalIssueStatus = digitalIssueStatus;
	}

	@Override
	public String getValidRemarks() {
		if (_validRemarks == null) {
			return StringPool.BLANK;
		}
		else {
			return _validRemarks;
		}
	}

	@Override
	public void setValidRemarks(String validRemarks) {
		_validRemarks = validRemarks;
	}

	@Override
	public String getValidInspectionNote() {
		if (_validInspectionNote == null) {
			return StringPool.BLANK;
		}
		else {
			return _validInspectionNote;
		}
	}

	@Override
	public void setValidInspectionNote(String validInspectionNote) {
		_validInspectionNote = validInspectionNote;
	}

	@Override
	public long getDocumentFileEntryid() {
		return _documentFileEntryid;
	}

	@Override
	public void setDocumentFileEntryid(long documentFileEntryid) {
		_documentFileEntryid = documentFileEntryid;
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_columnBitmask = -1L;

		_modifyDate = modifyDate;
	}

	@Override
	public Date getSyncDate() {
		return _syncDate;
	}

	@Override
	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VRIssueInspectionRecord.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRIssueInspectionRecord toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRIssueInspectionRecord)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRIssueInspectionRecordImpl vrIssueInspectionRecordImpl = new VRIssueInspectionRecordImpl();

		vrIssueInspectionRecordImpl.setId(getId());
		vrIssueInspectionRecordImpl.setMtCore(getMtCore());
		vrIssueInspectionRecordImpl.setIssueId(getIssueId());
		vrIssueInspectionRecordImpl.setDossierId(getDossierId());
		vrIssueInspectionRecordImpl.setCertificateId(getCertificateId());
		vrIssueInspectionRecordImpl.setTotalQuantity(getTotalQuantity());
		vrIssueInspectionRecordImpl.setPostReview(getPostReview());
		vrIssueInspectionRecordImpl.setPostReviewRecordNo(getPostReviewRecordNo());
		vrIssueInspectionRecordImpl.setPostReviewRecordDate(getPostReviewRecordDate());
		vrIssueInspectionRecordImpl.setCorporationId(getCorporationId());
		vrIssueInspectionRecordImpl.setInspectorCode(getInspectorCode());
		vrIssueInspectionRecordImpl.setInspectorName(getInspectorName());
		vrIssueInspectionRecordImpl.setLeaderName(getLeaderName());
		vrIssueInspectionRecordImpl.setIssueCorporationId(getIssueCorporationId());
		vrIssueInspectionRecordImpl.setVerifyCorporationId(getVerifyCorporationId());
		vrIssueInspectionRecordImpl.setInspectorId(getInspectorId());
		vrIssueInspectionRecordImpl.setIssueInspectorId(getIssueInspectorId());
		vrIssueInspectionRecordImpl.setVerifyInspectorId(getVerifyInspectorId());
		vrIssueInspectionRecordImpl.setDigitalIssueStatus(getDigitalIssueStatus());
		vrIssueInspectionRecordImpl.setValidRemarks(getValidRemarks());
		vrIssueInspectionRecordImpl.setValidInspectionNote(getValidInspectionNote());
		vrIssueInspectionRecordImpl.setDocumentFileEntryid(getDocumentFileEntryid());
		vrIssueInspectionRecordImpl.setModifyDate(getModifyDate());
		vrIssueInspectionRecordImpl.setSyncDate(getSyncDate());

		vrIssueInspectionRecordImpl.resetOriginalValues();

		return vrIssueInspectionRecordImpl;
	}

	@Override
	public int compareTo(VRIssueInspectionRecord vrIssueInspectionRecord) {
		int value = 0;

		value = DateUtil.compareTo(getModifyDate(),
				vrIssueInspectionRecord.getModifyDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueInspectionRecord)) {
			return false;
		}

		VRIssueInspectionRecord vrIssueInspectionRecord = (VRIssueInspectionRecord)obj;

		long primaryKey = vrIssueInspectionRecord.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		VRIssueInspectionRecordModelImpl vrIssueInspectionRecordModelImpl = this;

		vrIssueInspectionRecordModelImpl._originalIssueId = vrIssueInspectionRecordModelImpl._issueId;

		vrIssueInspectionRecordModelImpl._setOriginalIssueId = false;

		vrIssueInspectionRecordModelImpl._originalDossierId = vrIssueInspectionRecordModelImpl._dossierId;

		vrIssueInspectionRecordModelImpl._setOriginalDossierId = false;

		vrIssueInspectionRecordModelImpl._originalCertificateId = vrIssueInspectionRecordModelImpl._certificateId;

		vrIssueInspectionRecordModelImpl._setOriginalCertificateId = false;

		vrIssueInspectionRecordModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VRIssueInspectionRecord> toCacheModel() {
		VRIssueInspectionRecordCacheModel vrIssueInspectionRecordCacheModel = new VRIssueInspectionRecordCacheModel();

		vrIssueInspectionRecordCacheModel.id = getId();

		vrIssueInspectionRecordCacheModel.mtCore = getMtCore();

		vrIssueInspectionRecordCacheModel.issueId = getIssueId();

		vrIssueInspectionRecordCacheModel.dossierId = getDossierId();

		vrIssueInspectionRecordCacheModel.certificateId = getCertificateId();

		vrIssueInspectionRecordCacheModel.totalQuantity = getTotalQuantity();

		vrIssueInspectionRecordCacheModel.postReview = getPostReview();

		String postReview = vrIssueInspectionRecordCacheModel.postReview;

		if ((postReview != null) && (postReview.length() == 0)) {
			vrIssueInspectionRecordCacheModel.postReview = null;
		}

		vrIssueInspectionRecordCacheModel.postReviewRecordNo = getPostReviewRecordNo();

		String postReviewRecordNo = vrIssueInspectionRecordCacheModel.postReviewRecordNo;

		if ((postReviewRecordNo != null) && (postReviewRecordNo.length() == 0)) {
			vrIssueInspectionRecordCacheModel.postReviewRecordNo = null;
		}

		Date postReviewRecordDate = getPostReviewRecordDate();

		if (postReviewRecordDate != null) {
			vrIssueInspectionRecordCacheModel.postReviewRecordDate = postReviewRecordDate.getTime();
		}
		else {
			vrIssueInspectionRecordCacheModel.postReviewRecordDate = Long.MIN_VALUE;
		}

		vrIssueInspectionRecordCacheModel.corporationId = getCorporationId();

		vrIssueInspectionRecordCacheModel.inspectorCode = getInspectorCode();

		String inspectorCode = vrIssueInspectionRecordCacheModel.inspectorCode;

		if ((inspectorCode != null) && (inspectorCode.length() == 0)) {
			vrIssueInspectionRecordCacheModel.inspectorCode = null;
		}

		vrIssueInspectionRecordCacheModel.inspectorName = getInspectorName();

		String inspectorName = vrIssueInspectionRecordCacheModel.inspectorName;

		if ((inspectorName != null) && (inspectorName.length() == 0)) {
			vrIssueInspectionRecordCacheModel.inspectorName = null;
		}

		vrIssueInspectionRecordCacheModel.leaderName = getLeaderName();

		String leaderName = vrIssueInspectionRecordCacheModel.leaderName;

		if ((leaderName != null) && (leaderName.length() == 0)) {
			vrIssueInspectionRecordCacheModel.leaderName = null;
		}

		vrIssueInspectionRecordCacheModel.issueCorporationId = getIssueCorporationId();

		vrIssueInspectionRecordCacheModel.verifyCorporationId = getVerifyCorporationId();

		vrIssueInspectionRecordCacheModel.inspectorId = getInspectorId();

		vrIssueInspectionRecordCacheModel.issueInspectorId = getIssueInspectorId();

		vrIssueInspectionRecordCacheModel.verifyInspectorId = getVerifyInspectorId();

		vrIssueInspectionRecordCacheModel.digitalIssueStatus = getDigitalIssueStatus();

		String digitalIssueStatus = vrIssueInspectionRecordCacheModel.digitalIssueStatus;

		if ((digitalIssueStatus != null) && (digitalIssueStatus.length() == 0)) {
			vrIssueInspectionRecordCacheModel.digitalIssueStatus = null;
		}

		vrIssueInspectionRecordCacheModel.validRemarks = getValidRemarks();

		String validRemarks = vrIssueInspectionRecordCacheModel.validRemarks;

		if ((validRemarks != null) && (validRemarks.length() == 0)) {
			vrIssueInspectionRecordCacheModel.validRemarks = null;
		}

		vrIssueInspectionRecordCacheModel.validInspectionNote = getValidInspectionNote();

		String validInspectionNote = vrIssueInspectionRecordCacheModel.validInspectionNote;

		if ((validInspectionNote != null) &&
				(validInspectionNote.length() == 0)) {
			vrIssueInspectionRecordCacheModel.validInspectionNote = null;
		}

		vrIssueInspectionRecordCacheModel.documentFileEntryid = getDocumentFileEntryid();

		Date modifyDate = getModifyDate();

		if (modifyDate != null) {
			vrIssueInspectionRecordCacheModel.modifyDate = modifyDate.getTime();
		}
		else {
			vrIssueInspectionRecordCacheModel.modifyDate = Long.MIN_VALUE;
		}

		Date syncDate = getSyncDate();

		if (syncDate != null) {
			vrIssueInspectionRecordCacheModel.syncDate = syncDate.getTime();
		}
		else {
			vrIssueInspectionRecordCacheModel.syncDate = Long.MIN_VALUE;
		}

		return vrIssueInspectionRecordCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", mtCore=");
		sb.append(getMtCore());
		sb.append(", issueId=");
		sb.append(getIssueId());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", certificateId=");
		sb.append(getCertificateId());
		sb.append(", totalQuantity=");
		sb.append(getTotalQuantity());
		sb.append(", postReview=");
		sb.append(getPostReview());
		sb.append(", postReviewRecordNo=");
		sb.append(getPostReviewRecordNo());
		sb.append(", postReviewRecordDate=");
		sb.append(getPostReviewRecordDate());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", inspectorCode=");
		sb.append(getInspectorCode());
		sb.append(", inspectorName=");
		sb.append(getInspectorName());
		sb.append(", leaderName=");
		sb.append(getLeaderName());
		sb.append(", issueCorporationId=");
		sb.append(getIssueCorporationId());
		sb.append(", verifyCorporationId=");
		sb.append(getVerifyCorporationId());
		sb.append(", inspectorId=");
		sb.append(getInspectorId());
		sb.append(", issueInspectorId=");
		sb.append(getIssueInspectorId());
		sb.append(", verifyInspectorId=");
		sb.append(getVerifyInspectorId());
		sb.append(", digitalIssueStatus=");
		sb.append(getDigitalIssueStatus());
		sb.append(", validRemarks=");
		sb.append(getValidRemarks());
		sb.append(", validInspectionNote=");
		sb.append(getValidInspectionNote());
		sb.append(", documentFileEntryid=");
		sb.append(getDocumentFileEntryid());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", syncDate=");
		sb.append(getSyncDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRIssueInspectionRecord");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mtCore</column-name><column-value><![CDATA[");
		sb.append(getMtCore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueId</column-name><column-value><![CDATA[");
		sb.append(getIssueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateId</column-name><column-value><![CDATA[");
		sb.append(getCertificateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalQuantity</column-name><column-value><![CDATA[");
		sb.append(getTotalQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postReview</column-name><column-value><![CDATA[");
		sb.append(getPostReview());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postReviewRecordNo</column-name><column-value><![CDATA[");
		sb.append(getPostReviewRecordNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postReviewRecordDate</column-name><column-value><![CDATA[");
		sb.append(getPostReviewRecordDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorCode</column-name><column-value><![CDATA[");
		sb.append(getInspectorCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorName</column-name><column-value><![CDATA[");
		sb.append(getInspectorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaderName</column-name><column-value><![CDATA[");
		sb.append(getLeaderName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueCorporationId</column-name><column-value><![CDATA[");
		sb.append(getIssueCorporationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verifyCorporationId</column-name><column-value><![CDATA[");
		sb.append(getVerifyCorporationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorId</column-name><column-value><![CDATA[");
		sb.append(getInspectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueInspectorId</column-name><column-value><![CDATA[");
		sb.append(getIssueInspectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verifyInspectorId</column-name><column-value><![CDATA[");
		sb.append(getVerifyInspectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>digitalIssueStatus</column-name><column-value><![CDATA[");
		sb.append(getDigitalIssueStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validRemarks</column-name><column-value><![CDATA[");
		sb.append(getValidRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validInspectionNote</column-name><column-value><![CDATA[");
		sb.append(getValidInspectionNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentFileEntryid</column-name><column-value><![CDATA[");
		sb.append(getDocumentFileEntryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncDate</column-name><column-value><![CDATA[");
		sb.append(getSyncDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VRIssueInspectionRecord.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRIssueInspectionRecord.class
		};
	private long _id;
	private long _mtCore;
	private long _issueId;
	private long _originalIssueId;
	private boolean _setOriginalIssueId;
	private long _dossierId;
	private long _originalDossierId;
	private boolean _setOriginalDossierId;
	private long _certificateId;
	private long _originalCertificateId;
	private boolean _setOriginalCertificateId;
	private int _totalQuantity;
	private String _postReview;
	private String _postReviewRecordNo;
	private Date _postReviewRecordDate;
	private long _corporationId;
	private String _inspectorCode;
	private String _inspectorName;
	private String _leaderName;
	private long _issueCorporationId;
	private long _verifyCorporationId;
	private long _inspectorId;
	private long _issueInspectorId;
	private long _verifyInspectorId;
	private String _digitalIssueStatus;
	private String _validRemarks;
	private String _validInspectionNote;
	private long _documentFileEntryid;
	private Date _modifyDate;
	private Date _syncDate;
	private long _columnBitmask;
	private VRIssueInspectionRecord _escapedModel;
}