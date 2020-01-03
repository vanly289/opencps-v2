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

import com.fds.vr.business.model.VRProductionPlant;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr production plant service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRProductionPlantPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantPersistenceImpl
 * @generated
 */
@ProviderType
public class VRProductionPlantUtil {
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
	public static void clearCache(VRProductionPlant vrProductionPlant) {
		getPersistence().clearCache(vrProductionPlant);
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
	public static List<VRProductionPlant> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRProductionPlant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRProductionPlant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRProductionPlant update(VRProductionPlant vrProductionPlant) {
		return getPersistence().update(vrProductionPlant);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRProductionPlant update(
		VRProductionPlant vrProductionPlant, ServiceContext serviceContext) {
		return getPersistence().update(vrProductionPlant, serviceContext);
	}

	/**
	* Caches the vr production plant in the entity cache if it is enabled.
	*
	* @param vrProductionPlant the vr production plant
	*/
	public static void cacheResult(VRProductionPlant vrProductionPlant) {
		getPersistence().cacheResult(vrProductionPlant);
	}

	/**
	* Caches the vr production plants in the entity cache if it is enabled.
	*
	* @param vrProductionPlants the vr production plants
	*/
	public static void cacheResult(List<VRProductionPlant> vrProductionPlants) {
		getPersistence().cacheResult(vrProductionPlants);
	}

	/**
	* Creates a new vr production plant with the primary key. Does not add the vr production plant to the database.
	*
	* @param id the primary key for the new vr production plant
	* @return the new vr production plant
	*/
	public static VRProductionPlant create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant that was removed
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence().remove(id);
	}

	public static VRProductionPlant updateImpl(
		VRProductionPlant vrProductionPlant) {
		return getPersistence().updateImpl(vrProductionPlant);
	}

	/**
	* Returns the vr production plant with the primary key or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr production plant with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant, or <code>null</code> if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRProductionPlant> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr production plants.
	*
	* @return the vr production plants
	*/
	public static List<VRProductionPlant> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of vr production plants
	*/
	public static List<VRProductionPlant> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plants
	*/
	public static List<VRProductionPlant> findAll(int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plants
	*/
	public static List<VRProductionPlant> findAll(int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr production plants from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr production plants.
	*
	* @return the number of vr production plants
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRProductionPlantPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductionPlantPersistence, VRProductionPlantPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRProductionPlantPersistence.class);
}