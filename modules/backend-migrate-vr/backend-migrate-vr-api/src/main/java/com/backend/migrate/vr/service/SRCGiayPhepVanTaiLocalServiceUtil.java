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
 * Provides the local service utility for SRCGiayPhepVanTai. This utility wraps
 * {@link com.backend.migrate.vr.service.impl.SRCGiayPhepVanTaiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SRCGiayPhepVanTaiLocalService
 * @see com.backend.migrate.vr.service.base.SRCGiayPhepVanTaiLocalServiceBaseImpl
 * @see com.backend.migrate.vr.service.impl.SRCGiayPhepVanTaiLocalServiceImpl
 * @generated
 */
@ProviderType
public class SRCGiayPhepVanTaiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.backend.migrate.vr.service.impl.SRCGiayPhepVanTaiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the src giay phep van tai to the database. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepVanTai the src giay phep van tai
	* @return the src giay phep van tai that was added
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepVanTai addSRCGiayPhepVanTai(
		com.backend.migrate.vr.model.SRCGiayPhepVanTai srcGiayPhepVanTai) {
		return getService().addSRCGiayPhepVanTai(srcGiayPhepVanTai);
	}

	/**
	* Creates a new src giay phep van tai with the primary key. Does not add the src giay phep van tai to the database.
	*
	* @param id the primary key for the new src giay phep van tai
	* @return the new src giay phep van tai
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepVanTai createSRCGiayPhepVanTai(
		long id) {
		return getService().createSRCGiayPhepVanTai(id);
	}

	/**
	* Deletes the src giay phep van tai from the database. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepVanTai the src giay phep van tai
	* @return the src giay phep van tai that was removed
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepVanTai deleteSRCGiayPhepVanTai(
		com.backend.migrate.vr.model.SRCGiayPhepVanTai srcGiayPhepVanTai) {
		return getService().deleteSRCGiayPhepVanTai(srcGiayPhepVanTai);
	}

	/**
	* Deletes the src giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the src giay phep van tai
	* @return the src giay phep van tai that was removed
	* @throws PortalException if a src giay phep van tai with the primary key could not be found
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepVanTai deleteSRCGiayPhepVanTai(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSRCGiayPhepVanTai(id);
	}

	public static com.backend.migrate.vr.model.SRCGiayPhepVanTai fetchSRCGiayPhepVanTai(
		long id) {
		return getService().fetchSRCGiayPhepVanTai(id);
	}

	/**
	* Returns the src giay phep van tai with the primary key.
	*
	* @param id the primary key of the src giay phep van tai
	* @return the src giay phep van tai
	* @throws PortalException if a src giay phep van tai with the primary key could not be found
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepVanTai getSRCGiayPhepVanTai(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSRCGiayPhepVanTai(id);
	}

	/**
	* Updates the src giay phep van tai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepVanTai the src giay phep van tai
	* @return the src giay phep van tai that was updated
	*/
	public static com.backend.migrate.vr.model.SRCGiayPhepVanTai updateSRCGiayPhepVanTai(
		com.backend.migrate.vr.model.SRCGiayPhepVanTai srcGiayPhepVanTai) {
		return getService().updateSRCGiayPhepVanTai(srcGiayPhepVanTai);
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
	* Returns the number of src giay phep van tais.
	*
	* @return the number of src giay phep van tais
	*/
	public static int getSRCGiayPhepVanTaisCount() {
		return getService().getSRCGiayPhepVanTaisCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.backend.migrate.vr.model.SRCGiayPhepVanTai> getLastest(
		long currentId) {
		return getService().getLastest(currentId);
	}

	/**
	* Returns a range of all the src giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep van tais
	* @param end the upper bound of the range of src giay phep van tais (not inclusive)
	* @return the range of src giay phep van tais
	*/
	public static java.util.List<com.backend.migrate.vr.model.SRCGiayPhepVanTai> getSRCGiayPhepVanTais(
		int start, int end) {
		return getService().getSRCGiayPhepVanTais(start, end);
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

	public static SRCGiayPhepVanTaiLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SRCGiayPhepVanTaiLocalService, SRCGiayPhepVanTaiLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SRCGiayPhepVanTaiLocalService.class);
}