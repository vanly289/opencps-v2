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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRVehicleTypeCertificate;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr vehicle type certificate service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRVehicleTypeCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleTypeCertificatePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleTypeCertificatePersistenceImpl
 * @generated
 */
@ProviderType
public class VRVehicleTypeCertificateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		getPersistence().clearCache(vrVehicleTypeCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VRVehicleTypeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRVehicleTypeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRVehicleTypeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRVehicleTypeCertificate update(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return getPersistence().update(vrVehicleTypeCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRVehicleTypeCertificate update(
		VRVehicleTypeCertificate vrVehicleTypeCertificate,
		ServiceContext serviceContext) {
		return getPersistence().update(vrVehicleTypeCertificate, serviceContext);
	}

	/**
	* Caches the vr vehicle type certificate in the entity cache if it is enabled.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	*/
	public static void cacheResult(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		getPersistence().cacheResult(vrVehicleTypeCertificate);
	}

	/**
	* Caches the vr vehicle type certificates in the entity cache if it is enabled.
	*
	* @param vrVehicleTypeCertificates the vr vehicle type certificates
	*/
	public static void cacheResult(
		List<VRVehicleTypeCertificate> vrVehicleTypeCertificates) {
		getPersistence().cacheResult(vrVehicleTypeCertificates);
	}

	/**
	* Creates a new vr vehicle type certificate with the primary key. Does not add the vr vehicle type certificate to the database.
	*
	* @param id the primary key for the new vr vehicle type certificate
	* @return the new vr vehicle type certificate
	*/
	public static VRVehicleTypeCertificate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence().remove(id);
	}

	public static VRVehicleTypeCertificate updateImpl(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return getPersistence().updateImpl(vrVehicleTypeCertificate);
	}

	/**
	* Returns the vr vehicle type certificate with the primary key or throws a {@link NoSuchVRVehicleTypeCertificateException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr vehicle type certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate, or <code>null</code> if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRVehicleTypeCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr vehicle type certificates.
	*
	* @return the vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findAll(int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findAll(int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr vehicle type certificates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr vehicle type certificates.
	*
	* @return the number of vr vehicle type certificates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRVehicleTypeCertificatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRVehicleTypeCertificatePersistence, VRVehicleTypeCertificatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRVehicleTypeCertificatePersistence.class);
}