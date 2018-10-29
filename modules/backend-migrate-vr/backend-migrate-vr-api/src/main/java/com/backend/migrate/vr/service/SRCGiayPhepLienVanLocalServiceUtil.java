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
 * Provides the local service utility for SRCGiayPhepLienVan. This utility wraps
 * {@link com.backend.migrate.vr.service.impl.SRCGiayPhepLienVanLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SRCGiayPhepLienVanLocalService
 * @see com.backend.migrate.vr.service.base.SRCGiayPhepLienVanLocalServiceBaseImpl
 * @see com.backend.migrate.vr.service.impl.SRCGiayPhepLienVanLocalServiceImpl
 * @generated
 */
@ProviderType
public class SRCGiayPhepLienVanLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.backend.migrate.vr.service.impl.SRCGiayPhepLienVanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the src giay phep lien van to the database. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepLienVan the src giay phep lien van
	* @return the src giay phep lien van that was added
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepLienVan addSRCGiayPhepLienVan(
		com.backend.migrate.vr.model.SRCGiayPhepLienVan srcGiayPhepLienVan) {
		return getService().addSRCGiayPhepLienVan(srcGiayPhepLienVan);
	}

	/**
	* Creates a new src giay phep lien van with the primary key. Does not add the src giay phep lien van to the database.
	*
	* @param id the primary key for the new src giay phep lien van
	* @return the new src giay phep lien van
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepLienVan createSRCGiayPhepLienVan(
		long id) {
		return getService().createSRCGiayPhepLienVan(id);
	}

	/**
	* Deletes the src giay phep lien van from the database. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepLienVan the src giay phep lien van
	* @return the src giay phep lien van that was removed
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepLienVan deleteSRCGiayPhepLienVan(
		com.backend.migrate.vr.model.SRCGiayPhepLienVan srcGiayPhepLienVan) {
		return getService().deleteSRCGiayPhepLienVan(srcGiayPhepLienVan);
	}

	/**
	* Deletes the src giay phep lien van with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the src giay phep lien van
	* @return the src giay phep lien van that was removed
	* @throws PortalException if a src giay phep lien van with the primary key could not be found
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepLienVan deleteSRCGiayPhepLienVan(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSRCGiayPhepLienVan(id);
	}

	public static com.backend.migrate.vr.model.SRCGiayPhepLienVan fetchSRCGiayPhepLienVan(
		long id) {
		return getService().fetchSRCGiayPhepLienVan(id);
	}

	/**
	* Returns the src giay phep lien van with the primary key.
	*
	* @param id the primary key of the src giay phep lien van
	* @return the src giay phep lien van
	* @throws PortalException if a src giay phep lien van with the primary key could not be found
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepLienVan getSRCGiayPhepLienVan(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSRCGiayPhepLienVan(id);
	}

	/**
	* Updates the src giay phep lien van in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepLienVan the src giay phep lien van
	* @return the src giay phep lien van that was updated
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepLienVan updateSRCGiayPhepLienVan(
		com.backend.migrate.vr.model.SRCGiayPhepLienVan srcGiayPhepLienVan) {
		return getService().updateSRCGiayPhepLienVan(srcGiayPhepLienVan);
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
	* Returns the number of src giay phep lien vans.
	*
	* @return the number of src giay phep lien vans
	*/
	public static int getSRCGiayPhepLienVansCount() {
		return getService().getSRCGiayPhepLienVansCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.backend.migrate.vr.model.SRCGiayPhepLienVan> getLastest(
		long currentId) {
		return getService().getLastest(currentId);
	}

	/**
	* Returns a range of all the src giay phep lien vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep lien vans
	* @param end the upper bound of the range of src giay phep lien vans (not inclusive)
	* @return the range of src giay phep lien vans
	*/
	public static java.util.List<com.backend.migrate.vr.model.SRCGiayPhepLienVan> getSRCGiayPhepLienVans(
		int start, int end) {
		return getService().getSRCGiayPhepLienVans(start, end);
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

	public static SRCGiayPhepLienVanLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SRCGiayPhepLienVanLocalService, SRCGiayPhepLienVanLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SRCGiayPhepLienVanLocalService.class);
}