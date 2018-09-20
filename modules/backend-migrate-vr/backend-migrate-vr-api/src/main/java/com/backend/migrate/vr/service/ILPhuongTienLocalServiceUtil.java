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
 * Provides the local service utility for ILPhuongTien. This utility wraps
 * {@link com.backend.migrate.vr.service.impl.ILPhuongTienLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ILPhuongTienLocalService
 * @see com.backend.migrate.vr.service.base.ILPhuongTienLocalServiceBaseImpl
 * @see com.backend.migrate.vr.service.impl.ILPhuongTienLocalServiceImpl
 * @generated
 */
@ProviderType
public class ILPhuongTienLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.backend.migrate.vr.service.impl.ILPhuongTienLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the il phuong tien to the database. Also notifies the appropriate model listeners.
	*
	* @param ilPhuongTien the il phuong tien
	* @return the il phuong tien that was added
	*/
	public static com.backend.migrate.vr.model.ILPhuongTien addILPhuongTien(
		com.backend.migrate.vr.model.ILPhuongTien ilPhuongTien) {
		return getService().addILPhuongTien(ilPhuongTien);
	}

	public static com.backend.migrate.vr.model.ILPhuongTien addPhuongTien(
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
	* Creates a new il phuong tien with the primary key. Does not add the il phuong tien to the database.
	*
	* @param id the primary key for the new il phuong tien
	* @return the new il phuong tien
	*/
	public static com.backend.migrate.vr.model.ILPhuongTien createILPhuongTien(
		long id) {
		return getService().createILPhuongTien(id);
	}

	/**
	* Deletes the il phuong tien from the database. Also notifies the appropriate model listeners.
	*
	* @param ilPhuongTien the il phuong tien
	* @return the il phuong tien that was removed
	*/
	public static com.backend.migrate.vr.model.ILPhuongTien deleteILPhuongTien(
		com.backend.migrate.vr.model.ILPhuongTien ilPhuongTien) {
		return getService().deleteILPhuongTien(ilPhuongTien);
	}

	/**
	* Deletes the il phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien that was removed
	* @throws PortalException if a il phuong tien with the primary key could not be found
	*/
	public static com.backend.migrate.vr.model.ILPhuongTien deleteILPhuongTien(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteILPhuongTien(id);
	}

	public static com.backend.migrate.vr.model.ILPhuongTien deletePhuongTien(
		long id)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getService().deletePhuongTien(id);
	}

	public static com.backend.migrate.vr.model.ILPhuongTien fetchILPhuongTien(
		long id) {
		return getService().fetchILPhuongTien(id);
	}

	/**
	* Returns the il phuong tien with the primary key.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien
	* @throws PortalException if a il phuong tien with the primary key could not be found
	*/
	public static com.backend.migrate.vr.model.ILPhuongTien getILPhuongTien(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getILPhuongTien(id);
	}

	public static com.backend.migrate.vr.model.ILPhuongTien getLastPhuongTien()
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getService().getLastPhuongTien();
	}

	/**
	* Updates the il phuong tien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilPhuongTien the il phuong tien
	* @return the il phuong tien that was updated
	*/
	public static com.backend.migrate.vr.model.ILPhuongTien updateILPhuongTien(
		com.backend.migrate.vr.model.ILPhuongTien ilPhuongTien) {
		return getService().updateILPhuongTien(ilPhuongTien);
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
	* Returns the number of il phuong tiens.
	*
	* @return the number of il phuong tiens
	*/
	public static int getILPhuongTiensCount() {
		return getService().getILPhuongTiensCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the il phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @return the range of il phuong tiens
	*/
	public static java.util.List<com.backend.migrate.vr.model.ILPhuongTien> getILPhuongTiens(
		int start, int end) {
		return getService().getILPhuongTiens(start, end);
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

	public static ILPhuongTienLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ILPhuongTienLocalService, ILPhuongTienLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ILPhuongTienLocalService.class);
}