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
 * Provides the local service utility for ILVehicleCustomsBorderGuard. This utility wraps
 * {@link com.fds.vr.business.service.impl.ILVehicleCustomsBorderGuardLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see ILVehicleCustomsBorderGuardLocalService
 * @see com.fds.vr.business.service.base.ILVehicleCustomsBorderGuardLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.ILVehicleCustomsBorderGuardLocalServiceImpl
 * @generated
 */
@ProviderType
public class ILVehicleCustomsBorderGuardLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.ILVehicleCustomsBorderGuardLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard addCustomBorderGuard(
		java.lang.String registrationNumber, java.lang.String expImpGateType,
		java.lang.String expImpGate, java.lang.String driverName,
		java.lang.String driverLicenceNo, java.util.Date regDate) {
		return getService()
				   .addCustomBorderGuard(registrationNumber, expImpGateType,
			expImpGate, driverName, driverLicenceNo, regDate);
	}

	/**
	* Adds the il vehicle customs border guard to the database. Also notifies the appropriate model listeners.
	*
	* @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	* @return the il vehicle customs border guard that was added
	*/
	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard addILVehicleCustomsBorderGuard(
		com.fds.vr.business.model.ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return getService()
				   .addILVehicleCustomsBorderGuard(ilVehicleCustomsBorderGuard);
	}

	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard createCustomsBorderGuard(
		com.liferay.portal.kernel.json.JSONObject tempGuardJSON,
		java.lang.String registrationNumberForm) {
		return getService()
				   .createCustomsBorderGuard(tempGuardJSON,
			registrationNumberForm);
	}

	/**
	* Creates a new il vehicle customs border guard with the primary key. Does not add the il vehicle customs border guard to the database.
	*
	* @param id the primary key for the new il vehicle customs border guard
	* @return the new il vehicle customs border guard
	*/
	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard createILVehicleCustomsBorderGuard(
		long id) {
		return getService().createILVehicleCustomsBorderGuard(id);
	}

	/**
	* Deletes the il vehicle customs border guard from the database. Also notifies the appropriate model listeners.
	*
	* @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	* @return the il vehicle customs border guard that was removed
	*/
	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard deleteILVehicleCustomsBorderGuard(
		com.fds.vr.business.model.ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return getService()
				   .deleteILVehicleCustomsBorderGuard(ilVehicleCustomsBorderGuard);
	}

	/**
	* Deletes the il vehicle customs border guard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard that was removed
	* @throws PortalException if a il vehicle customs border guard with the primary key could not be found
	*/
	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard deleteILVehicleCustomsBorderGuard(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteILVehicleCustomsBorderGuard(id);
	}

	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard fetchILVehicleCustomsBorderGuard(
		long id) {
		return getService().fetchILVehicleCustomsBorderGuard(id);
	}

	/**
	* Returns the il vehicle customs border guard with the primary key.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard
	* @throws PortalException if a il vehicle customs border guard with the primary key could not be found
	*/
	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard getILVehicleCustomsBorderGuard(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getILVehicleCustomsBorderGuard(id);
	}

	/**
	* Updates the il vehicle customs border guard in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	* @return the il vehicle customs border guard that was updated
	*/
	public static com.fds.vr.business.model.ILVehicleCustomsBorderGuard updateILVehicleCustomsBorderGuard(
		com.fds.vr.business.model.ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return getService()
				   .updateILVehicleCustomsBorderGuard(ilVehicleCustomsBorderGuard);
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
	* Returns the number of il vehicle customs border guards.
	*
	* @return the number of il vehicle customs border guards
	*/
	public static int getILVehicleCustomsBorderGuardsCount() {
		return getService().getILVehicleCustomsBorderGuardsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.ILVehicleCustomsBorderGuard> getBorderGuardList(
		java.lang.String registrationNumber) {
		return getService().getBorderGuardList(registrationNumber);
	}

	/**
	* Returns a range of all the il vehicle customs border guards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @return the range of il vehicle customs border guards
	*/
	public static java.util.List<com.fds.vr.business.model.ILVehicleCustomsBorderGuard> getILVehicleCustomsBorderGuards(
		int start, int end) {
		return getService().getILVehicleCustomsBorderGuards(start, end);
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

	public static ILVehicleCustomsBorderGuardLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ILVehicleCustomsBorderGuardLocalService, ILVehicleCustomsBorderGuardLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ILVehicleCustomsBorderGuardLocalService.class);
}