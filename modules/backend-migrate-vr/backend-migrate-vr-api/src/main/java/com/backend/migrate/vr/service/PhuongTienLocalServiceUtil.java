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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for PhuongTien. This utility wraps
 * {@link com.backend.migrate.vr.service.impl.PhuongTienLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PhuongTienLocalService
 * @see com.backend.migrate.vr.service.base.PhuongTienLocalServiceBaseImpl
 * @see com.backend.migrate.vr.service.impl.PhuongTienLocalServiceImpl
 * @generated
 */
@ProviderType
public class PhuongTienLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.backend.migrate.vr.service.impl.PhuongTienLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the phuong tien to the database. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was added
	*/
	public static com.backend.migrate.vr.model.PhuongTien addPhuongTien(
		com.backend.migrate.vr.model.PhuongTien phuongTien) {
		return getService().addPhuongTien(phuongTien);
	}

	public static com.backend.migrate.vr.model.PhuongTien addPhuongTien(
		long id, java.lang.String bienkiemsoat, int succhua, long loaighe_id,
		int namsanxuat, long nuocsanxuat_id, long tenhieuxe_id, long mauson_id,
		java.lang.String sokhung, java.lang.String somay,
		int namhetnienhansudung, java.util.Date namcaitao, int trongtai,
		int loaihinhvantai_id, int la_xegiuongnam, int sogiuongnam,
		java.lang.String tennguoisohuu, int doanhnghiep_id,
		int tuyenkhaithac_id, java.lang.String web_giamsathanhtrinh,
		java.lang.String tendangnhap_gsht, java.lang.String ghichu,
		int trangthai, int coquanquanly_id, long congdan_id) {
		return getService()
				   .addPhuongTien(id, bienkiemsoat, succhua, loaighe_id,
			namsanxuat, nuocsanxuat_id, tenhieuxe_id, mauson_id, sokhung,
			somay, namhetnienhansudung, namcaitao, trongtai, loaihinhvantai_id,
			la_xegiuongnam, sogiuongnam, tennguoisohuu, doanhnghiep_id,
			tuyenkhaithac_id, web_giamsathanhtrinh, tendangnhap_gsht, ghichu,
			trangthai, coquanquanly_id, congdan_id);
	}

	/**
	* Creates a new phuong tien with the primary key. Does not add the phuong tien to the database.
	*
	* @param id the primary key for the new phuong tien
	* @return the new phuong tien
	*/
	public static com.backend.migrate.vr.model.PhuongTien createPhuongTien(
		long id) {
		return getService().createPhuongTien(id);
	}

	/**
	* Deletes the phuong tien from the database. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was removed
	*/
	public static com.backend.migrate.vr.model.PhuongTien deletePhuongTien(
		com.backend.migrate.vr.model.PhuongTien phuongTien) {
		return getService().deletePhuongTien(phuongTien);
	}

	/**
	* Deletes the phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien that was removed
	* @throws PortalException if a phuong tien with the primary key could not be found
	* @throws NoSuchPhuongTienException
	*/
	public static com.backend.migrate.vr.model.PhuongTien deletePhuongTien(
		long id)
		throws com.backend.migrate.vr.exception.NoSuchPhuongTienException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePhuongTien(id);
	}

	public static com.backend.migrate.vr.model.PhuongTien fetchPhuongTien(
		long id) {
		return getService().fetchPhuongTien(id);
	}

	public static com.backend.migrate.vr.model.PhuongTien findByBKS(
		java.lang.String bienkiemsoat) {
		return getService().findByBKS(bienkiemsoat);
	}

	public static com.backend.migrate.vr.model.PhuongTien getFirstGreaterThanId(
		long id)
		throws com.backend.migrate.vr.exception.NoSuchPhuongTienException {
		return getService().getFirstGreaterThanId(id);
	}

	/**
	* Returns the phuong tien with the primary key.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien
	* @throws PortalException if a phuong tien with the primary key could not be found
	*/
	public static com.backend.migrate.vr.model.PhuongTien getPhuongTien(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPhuongTien(id);
	}

	/**
	* Updates the phuong tien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was updated
	*/
	public static com.backend.migrate.vr.model.PhuongTien updatePhuongTien(
		com.backend.migrate.vr.model.PhuongTien phuongTien) {
		return getService().updatePhuongTien(phuongTien);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of phuong tiens.
	*
	* @return the number of phuong tiens
	*/
	public static int getPhuongTiensCount() {
		return getService().getPhuongTiensCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.backend.migrate.vr.model.PhuongTien> getListGreaterThanId(
		long id) {
		return getService().getListGreaterThanId(id);
	}

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
	public static java.util.List<com.backend.migrate.vr.model.PhuongTien> getPhuongTiens(
		int start, int end) {
		return getService().getPhuongTiens(start, end);
	}

	public static long countAll() {
		return getService().countAll();
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static PhuongTienLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PhuongTienLocalService, PhuongTienLocalService> _serviceTracker =
		ServiceTrackerFactory.open(PhuongTienLocalService.class);
}