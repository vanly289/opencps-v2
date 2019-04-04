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

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ILSyncDate. This utility wraps
 * {@link com.fds.vr.business.service.impl.ILSyncDateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see ILSyncDateLocalService
 * @see com.fds.vr.business.service.base.ILSyncDateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.ILSyncDateLocalServiceImpl
 * @generated
 */
@ProviderType
public class ILSyncDateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.ILSyncDateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the il sync date to the database. Also notifies the appropriate model listeners.
	*
	* @param ilSyncDate the il sync date
	* @return the il sync date that was added
	*/
	public static com.fds.vr.business.model.ILSyncDate addILSyncDate(
		com.fds.vr.business.model.ILSyncDate ilSyncDate) {
		return getService().addILSyncDate(ilSyncDate);
	}

	/**
	* Creates a new il sync date with the primary key. Does not add the il sync date to the database.
	*
	* @param id the primary key for the new il sync date
	* @return the new il sync date
	*/
	public static com.fds.vr.business.model.ILSyncDate createILSyncDate(long id) {
		return getService().createILSyncDate(id);
	}

	/**
	* Deletes the il sync date from the database. Also notifies the appropriate model listeners.
	*
	* @param ilSyncDate the il sync date
	* @return the il sync date that was removed
	*/
	public static com.fds.vr.business.model.ILSyncDate deleteILSyncDate(
		com.fds.vr.business.model.ILSyncDate ilSyncDate) {
		return getService().deleteILSyncDate(ilSyncDate);
	}

	/**
	* Deletes the il sync date with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il sync date
	* @return the il sync date that was removed
	* @throws PortalException if a il sync date with the primary key could not be found
	*/
	public static com.fds.vr.business.model.ILSyncDate deleteILSyncDate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteILSyncDate(id);
	}

	public static com.fds.vr.business.model.ILSyncDate fetchILSyncDate(long id) {
		return getService().fetchILSyncDate(id);
	}

	/**
	* Returns the il sync date with the primary key.
	*
	* @param id the primary key of the il sync date
	* @return the il sync date
	* @throws PortalException if a il sync date with the primary key could not be found
	*/
	public static com.fds.vr.business.model.ILSyncDate getILSyncDate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getILSyncDate(id);
	}

	/**
	* Updates the il sync date in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilSyncDate the il sync date
	* @return the il sync date that was updated
	*/
	public static com.fds.vr.business.model.ILSyncDate updateILSyncDate(
		com.fds.vr.business.model.ILSyncDate ilSyncDate) {
		return getService().updateILSyncDate(ilSyncDate);
	}

	public static com.fds.vr.business.model.ILSyncDate updateSyncDate(
		java.util.Date modifiedDate) {
		return getService().updateSyncDate(modifiedDate);
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
	* Returns the number of il sync dates.
	*
	* @return the number of il sync dates
	*/
	public static int getILSyncDatesCount() {
		return getService().getILSyncDatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.Date getSyncDate() {
		return getService().getSyncDate();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the il sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il sync dates
	* @param end the upper bound of the range of il sync dates (not inclusive)
	* @return the range of il sync dates
	*/
	public static java.util.List<com.fds.vr.business.model.ILSyncDate> getILSyncDates(
		int start, int end) {
		return getService().getILSyncDates(start, end);
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

	public static ILSyncDateLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ILSyncDateLocalService, ILSyncDateLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ILSyncDateLocalService.class);
}