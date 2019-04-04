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

import com.fds.vr.business.model.ILVehicleCustomsBorderGuard;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the il vehicle customs border guard service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.ILVehicleCustomsBorderGuardPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see ILVehicleCustomsBorderGuardPersistence
 * @see com.fds.vr.business.service.persistence.impl.ILVehicleCustomsBorderGuardPersistenceImpl
 * @generated
 */
@ProviderType
public class ILVehicleCustomsBorderGuardUtil {
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
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		getPersistence().clearCache(ilVehicleCustomsBorderGuard);
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
	public static List<ILVehicleCustomsBorderGuard> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ILVehicleCustomsBorderGuard> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ILVehicleCustomsBorderGuard> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ILVehicleCustomsBorderGuard update(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return getPersistence().update(ilVehicleCustomsBorderGuard);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ILVehicleCustomsBorderGuard update(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(ilVehicleCustomsBorderGuard, serviceContext);
	}

	/**
	* Returns all the il vehicle customs border guards where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @return the matching il vehicle customs border guards
	*/
	public static List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		java.lang.String registrationNumber) {
		return getPersistence().findByF_REG_NUMBER(registrationNumber);
	}

	/**
	* Returns a range of all the il vehicle customs border guards where registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @return the range of matching il vehicle customs border guards
	*/
	public static List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		java.lang.String registrationNumber, int start, int end) {
		return getPersistence()
				   .findByF_REG_NUMBER(registrationNumber, start, end);
	}

	/**
	* Returns an ordered range of all the il vehicle customs border guards where registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching il vehicle customs border guards
	*/
	public static List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		java.lang.String registrationNumber, int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		return getPersistence()
				   .findByF_REG_NUMBER(registrationNumber, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the il vehicle customs border guards where registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching il vehicle customs border guards
	*/
	public static List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		java.lang.String registrationNumber, int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_REG_NUMBER(registrationNumber, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il vehicle customs border guard
	* @throws NoSuchILVehicleCustomsBorderGuardException if a matching il vehicle customs border guard could not be found
	*/
	public static ILVehicleCustomsBorderGuard findByF_REG_NUMBER_First(
		java.lang.String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILVehicleCustomsBorderGuardException {
		return getPersistence()
				   .findByF_REG_NUMBER_First(registrationNumber,
			orderByComparator);
	}

	/**
	* Returns the first il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il vehicle customs border guard, or <code>null</code> if a matching il vehicle customs border guard could not be found
	*/
	public static ILVehicleCustomsBorderGuard fetchByF_REG_NUMBER_First(
		java.lang.String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		return getPersistence()
				   .fetchByF_REG_NUMBER_First(registrationNumber,
			orderByComparator);
	}

	/**
	* Returns the last il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il vehicle customs border guard
	* @throws NoSuchILVehicleCustomsBorderGuardException if a matching il vehicle customs border guard could not be found
	*/
	public static ILVehicleCustomsBorderGuard findByF_REG_NUMBER_Last(
		java.lang.String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILVehicleCustomsBorderGuardException {
		return getPersistence()
				   .findByF_REG_NUMBER_Last(registrationNumber,
			orderByComparator);
	}

	/**
	* Returns the last il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il vehicle customs border guard, or <code>null</code> if a matching il vehicle customs border guard could not be found
	*/
	public static ILVehicleCustomsBorderGuard fetchByF_REG_NUMBER_Last(
		java.lang.String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		return getPersistence()
				   .fetchByF_REG_NUMBER_Last(registrationNumber,
			orderByComparator);
	}

	/**
	* Returns the il vehicle customs border guards before and after the current il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param id the primary key of the current il vehicle customs border guard
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next il vehicle customs border guard
	* @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	*/
	public static ILVehicleCustomsBorderGuard[] findByF_REG_NUMBER_PrevAndNext(
		long id, java.lang.String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILVehicleCustomsBorderGuardException {
		return getPersistence()
				   .findByF_REG_NUMBER_PrevAndNext(id, registrationNumber,
			orderByComparator);
	}

	/**
	* Removes all the il vehicle customs border guards where registrationNumber = &#63; from the database.
	*
	* @param registrationNumber the registration number
	*/
	public static void removeByF_REG_NUMBER(java.lang.String registrationNumber) {
		getPersistence().removeByF_REG_NUMBER(registrationNumber);
	}

	/**
	* Returns the number of il vehicle customs border guards where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @return the number of matching il vehicle customs border guards
	*/
	public static int countByF_REG_NUMBER(java.lang.String registrationNumber) {
		return getPersistence().countByF_REG_NUMBER(registrationNumber);
	}

	/**
	* Caches the il vehicle customs border guard in the entity cache if it is enabled.
	*
	* @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	*/
	public static void cacheResult(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		getPersistence().cacheResult(ilVehicleCustomsBorderGuard);
	}

	/**
	* Caches the il vehicle customs border guards in the entity cache if it is enabled.
	*
	* @param ilVehicleCustomsBorderGuards the il vehicle customs border guards
	*/
	public static void cacheResult(
		List<ILVehicleCustomsBorderGuard> ilVehicleCustomsBorderGuards) {
		getPersistence().cacheResult(ilVehicleCustomsBorderGuards);
	}

	/**
	* Creates a new il vehicle customs border guard with the primary key. Does not add the il vehicle customs border guard to the database.
	*
	* @param id the primary key for the new il vehicle customs border guard
	* @return the new il vehicle customs border guard
	*/
	public static ILVehicleCustomsBorderGuard create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the il vehicle customs border guard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard that was removed
	* @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	*/
	public static ILVehicleCustomsBorderGuard remove(long id)
		throws com.fds.vr.business.exception.NoSuchILVehicleCustomsBorderGuardException {
		return getPersistence().remove(id);
	}

	public static ILVehicleCustomsBorderGuard updateImpl(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return getPersistence().updateImpl(ilVehicleCustomsBorderGuard);
	}

	/**
	* Returns the il vehicle customs border guard with the primary key or throws a {@link NoSuchILVehicleCustomsBorderGuardException} if it could not be found.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard
	* @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	*/
	public static ILVehicleCustomsBorderGuard findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchILVehicleCustomsBorderGuardException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the il vehicle customs border guard with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard, or <code>null</code> if a il vehicle customs border guard with the primary key could not be found
	*/
	public static ILVehicleCustomsBorderGuard fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ILVehicleCustomsBorderGuard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the il vehicle customs border guards.
	*
	* @return the il vehicle customs border guards
	*/
	public static List<ILVehicleCustomsBorderGuard> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the il vehicle customs border guards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @return the range of il vehicle customs border guards
	*/
	public static List<ILVehicleCustomsBorderGuard> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the il vehicle customs border guards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of il vehicle customs border guards
	*/
	public static List<ILVehicleCustomsBorderGuard> findAll(int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the il vehicle customs border guards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of il vehicle customs border guards
	*/
	public static List<ILVehicleCustomsBorderGuard> findAll(int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the il vehicle customs border guards from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of il vehicle customs border guards.
	*
	* @return the number of il vehicle customs border guards
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ILVehicleCustomsBorderGuardPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ILVehicleCustomsBorderGuardPersistence, ILVehicleCustomsBorderGuardPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ILVehicleCustomsBorderGuardPersistence.class);
}