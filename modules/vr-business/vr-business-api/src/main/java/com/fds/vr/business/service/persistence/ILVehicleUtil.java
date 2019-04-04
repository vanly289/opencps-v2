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

import com.fds.vr.business.model.ILVehicle;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the il vehicle service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.ILVehiclePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see ILVehiclePersistence
 * @see com.fds.vr.business.service.persistence.impl.ILVehiclePersistenceImpl
 * @generated
 */
@ProviderType
public class ILVehicleUtil {
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
	public static void clearCache(ILVehicle ilVehicle) {
		getPersistence().clearCache(ilVehicle);
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
	public static List<ILVehicle> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ILVehicle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ILVehicle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ILVehicle> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ILVehicle update(ILVehicle ilVehicle) {
		return getPersistence().update(ilVehicle);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ILVehicle update(ILVehicle ilVehicle,
		ServiceContext serviceContext) {
		return getPersistence().update(ilVehicle, serviceContext);
	}

	/**
	* Returns all the il vehicles where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @return the matching il vehicles
	*/
	public static List<ILVehicle> findByF_ISSU_NO(
		java.lang.String issuingDispatchNo) {
		return getPersistence().findByF_ISSU_NO(issuingDispatchNo);
	}

	/**
	* Returns a range of all the il vehicles where issuingDispatchNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @return the range of matching il vehicles
	*/
	public static List<ILVehicle> findByF_ISSU_NO(
		java.lang.String issuingDispatchNo, int start, int end) {
		return getPersistence().findByF_ISSU_NO(issuingDispatchNo, start, end);
	}

	/**
	* Returns an ordered range of all the il vehicles where issuingDispatchNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching il vehicles
	*/
	public static List<ILVehicle> findByF_ISSU_NO(
		java.lang.String issuingDispatchNo, int start, int end,
		OrderByComparator<ILVehicle> orderByComparator) {
		return getPersistence()
				   .findByF_ISSU_NO(issuingDispatchNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the il vehicles where issuingDispatchNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching il vehicles
	*/
	public static List<ILVehicle> findByF_ISSU_NO(
		java.lang.String issuingDispatchNo, int start, int end,
		OrderByComparator<ILVehicle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_ISSU_NO(issuingDispatchNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il vehicle
	* @throws NoSuchILVehicleException if a matching il vehicle could not be found
	*/
	public static ILVehicle findByF_ISSU_NO_First(
		java.lang.String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILVehicleException {
		return getPersistence()
				   .findByF_ISSU_NO_First(issuingDispatchNo, orderByComparator);
	}

	/**
	* Returns the first il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il vehicle, or <code>null</code> if a matching il vehicle could not be found
	*/
	public static ILVehicle fetchByF_ISSU_NO_First(
		java.lang.String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator) {
		return getPersistence()
				   .fetchByF_ISSU_NO_First(issuingDispatchNo, orderByComparator);
	}

	/**
	* Returns the last il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il vehicle
	* @throws NoSuchILVehicleException if a matching il vehicle could not be found
	*/
	public static ILVehicle findByF_ISSU_NO_Last(
		java.lang.String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILVehicleException {
		return getPersistence()
				   .findByF_ISSU_NO_Last(issuingDispatchNo, orderByComparator);
	}

	/**
	* Returns the last il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il vehicle, or <code>null</code> if a matching il vehicle could not be found
	*/
	public static ILVehicle fetchByF_ISSU_NO_Last(
		java.lang.String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator) {
		return getPersistence()
				   .fetchByF_ISSU_NO_Last(issuingDispatchNo, orderByComparator);
	}

	/**
	* Returns the il vehicles before and after the current il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param id the primary key of the current il vehicle
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next il vehicle
	* @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	*/
	public static ILVehicle[] findByF_ISSU_NO_PrevAndNext(long id,
		java.lang.String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILVehicleException {
		return getPersistence()
				   .findByF_ISSU_NO_PrevAndNext(id, issuingDispatchNo,
			orderByComparator);
	}

	/**
	* Removes all the il vehicles where issuingDispatchNo = &#63; from the database.
	*
	* @param issuingDispatchNo the issuing dispatch no
	*/
	public static void removeByF_ISSU_NO(java.lang.String issuingDispatchNo) {
		getPersistence().removeByF_ISSU_NO(issuingDispatchNo);
	}

	/**
	* Returns the number of il vehicles where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @return the number of matching il vehicles
	*/
	public static int countByF_ISSU_NO(java.lang.String issuingDispatchNo) {
		return getPersistence().countByF_ISSU_NO(issuingDispatchNo);
	}

	/**
	* Caches the il vehicle in the entity cache if it is enabled.
	*
	* @param ilVehicle the il vehicle
	*/
	public static void cacheResult(ILVehicle ilVehicle) {
		getPersistence().cacheResult(ilVehicle);
	}

	/**
	* Caches the il vehicles in the entity cache if it is enabled.
	*
	* @param ilVehicles the il vehicles
	*/
	public static void cacheResult(List<ILVehicle> ilVehicles) {
		getPersistence().cacheResult(ilVehicles);
	}

	/**
	* Creates a new il vehicle with the primary key. Does not add the il vehicle to the database.
	*
	* @param id the primary key for the new il vehicle
	* @return the new il vehicle
	*/
	public static ILVehicle create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the il vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il vehicle
	* @return the il vehicle that was removed
	* @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	*/
	public static ILVehicle remove(long id)
		throws com.fds.vr.business.exception.NoSuchILVehicleException {
		return getPersistence().remove(id);
	}

	public static ILVehicle updateImpl(ILVehicle ilVehicle) {
		return getPersistence().updateImpl(ilVehicle);
	}

	/**
	* Returns the il vehicle with the primary key or throws a {@link NoSuchILVehicleException} if it could not be found.
	*
	* @param id the primary key of the il vehicle
	* @return the il vehicle
	* @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	*/
	public static ILVehicle findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchILVehicleException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the il vehicle with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il vehicle
	* @return the il vehicle, or <code>null</code> if a il vehicle with the primary key could not be found
	*/
	public static ILVehicle fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ILVehicle> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the il vehicles.
	*
	* @return the il vehicles
	*/
	public static List<ILVehicle> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the il vehicles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @return the range of il vehicles
	*/
	public static List<ILVehicle> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the il vehicles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of il vehicles
	*/
	public static List<ILVehicle> findAll(int start, int end,
		OrderByComparator<ILVehicle> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the il vehicles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of il vehicles
	*/
	public static List<ILVehicle> findAll(int start, int end,
		OrderByComparator<ILVehicle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the il vehicles from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of il vehicles.
	*
	* @return the number of il vehicles
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ILVehiclePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ILVehiclePersistence, ILVehiclePersistence> _serviceTracker =
		ServiceTrackerFactory.open(ILVehiclePersistence.class);
}