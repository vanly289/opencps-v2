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

package com.backend.migrate.vr.service;

import aQute.bnd.annotation.ProviderType;

import com.backend.migrate.vr.exception.NoSuchPhuongTienException;
import com.backend.migrate.vr.model.PhuongTien;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for PhuongTien. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see PhuongTienLocalServiceUtil
 * @see com.backend.migrate.vr.service.base.PhuongTienLocalServiceBaseImpl
 * @see com.backend.migrate.vr.service.impl.PhuongTienLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface PhuongTienLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PhuongTienLocalServiceUtil} to access the phuong tien local service. Add custom service methods to {@link com.backend.migrate.vr.service.impl.PhuongTienLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the phuong tien to the database. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PhuongTien addPhuongTien(PhuongTien phuongTien);

	public PhuongTien addPhuongTien(long id, java.lang.String bienkiemsoat,
		int succhua, long loaighe_id, int namsanxuat, long nuocsanxuat_id,
		long tenhieuxe_id, long mauson_id, java.lang.String sokhung,
		java.lang.String somay, int namhetnienhansudung, Date namcaitao,
		int trongtai, int loaihinhvantai_id, int la_xegiuongnam,
		int sogiuongnam, java.lang.String tennguoisohuu, int doanhnghiep_id,
		int tuyenkhaithac_id, java.lang.String web_giamsathanhtrinh,
		java.lang.String tendangnhap_gsht, java.lang.String ghichu,
		int trangthai, int coquanquanly_id, long congdan_id);

	/**
	* Creates a new phuong tien with the primary key. Does not add the phuong tien to the database.
	*
	* @param id the primary key for the new phuong tien
	* @return the new phuong tien
	*/
	public PhuongTien createPhuongTien(long id);

	/**
	* Deletes the phuong tien from the database. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public PhuongTien deletePhuongTien(PhuongTien phuongTien);

	/**
	* Deletes the phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien that was removed
	* @throws PortalException if a phuong tien with the primary key could not be found
	* @throws NoSuchPhuongTienException
	*/
	@Indexable(type = IndexableType.DELETE)
	public PhuongTien deletePhuongTien(long id)
		throws PortalException, NoSuchPhuongTienException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PhuongTien fetchPhuongTien(long id);

	public PhuongTien findByBKS(java.lang.String bienkiemsoat);

	/**
	* Returns the phuong tien with the primary key.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien
	* @throws PortalException if a phuong tien with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PhuongTien getPhuongTien(long id) throws PortalException;

	/**
	* Updates the phuong tien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PhuongTien updatePhuongTien(PhuongTien phuongTien);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of phuong tiens.
	*
	* @return the number of phuong tiens
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPhuongTiensCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PhuongTien> getListGreaterThanId(long id);

	/**
	* Returns a range of all the phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phuong tiens
	* @param end the upper bound of the range of phuong tiens (not inclusive)
	* @return the range of phuong tiens
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PhuongTien> getPhuongTiens(int start, int end);

	public long countAll();

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}