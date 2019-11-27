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

import com.fds.vr.business.model.VRProductionPlantSupplier;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr production plant supplier service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRProductionPlantSupplierPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantSupplierPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantSupplierPersistenceImpl
 * @generated
 */
@ProviderType
public class VRProductionPlantSupplierUtil {
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
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		getPersistence().clearCache(vrProductionPlantSupplier);
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
	public static List<VRProductionPlantSupplier> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRProductionPlantSupplier> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRProductionPlantSupplier> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRProductionPlantSupplier update(
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		return getPersistence().update(vrProductionPlantSupplier);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRProductionPlantSupplier update(
		VRProductionPlantSupplier vrProductionPlantSupplier,
		ServiceContext serviceContext) {
		return getPersistence().update(vrProductionPlantSupplier, serviceContext);
	}

	/**
	* Caches the vr production plant supplier in the entity cache if it is enabled.
	*
	* @param vrProductionPlantSupplier the vr production plant supplier
	*/
	public static void cacheResult(
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		getPersistence().cacheResult(vrProductionPlantSupplier);
	}

	/**
	* Caches the vr production plant suppliers in the entity cache if it is enabled.
	*
	* @param vrProductionPlantSuppliers the vr production plant suppliers
	*/
	public static void cacheResult(
		List<VRProductionPlantSupplier> vrProductionPlantSuppliers) {
		getPersistence().cacheResult(vrProductionPlantSuppliers);
	}

	/**
	* Creates a new vr production plant supplier with the primary key. Does not add the vr production plant supplier to the database.
	*
	* @param id the primary key for the new vr production plant supplier
	* @return the new vr production plant supplier
	*/
	public static VRProductionPlantSupplier create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr production plant supplier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant supplier
	* @return the vr production plant supplier that was removed
	* @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	*/
	public static VRProductionPlantSupplier remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantSupplierException {
		return getPersistence().remove(id);
	}

	public static VRProductionPlantSupplier updateImpl(
		VRProductionPlantSupplier vrProductionPlantSupplier) {
		return getPersistence().updateImpl(vrProductionPlantSupplier);
	}

	/**
	* Returns the vr production plant supplier with the primary key or throws a {@link NoSuchVRProductionPlantSupplierException} if it could not be found.
	*
	* @param id the primary key of the vr production plant supplier
	* @return the vr production plant supplier
	* @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	*/
	public static VRProductionPlantSupplier findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantSupplierException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr production plant supplier with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant supplier
	* @return the vr production plant supplier, or <code>null</code> if a vr production plant supplier with the primary key could not be found
	*/
	public static VRProductionPlantSupplier fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRProductionPlantSupplier> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr production plant suppliers.
	*
	* @return the vr production plant suppliers
	*/
	public static List<VRProductionPlantSupplier> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr production plant suppliers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @return the range of vr production plant suppliers
	*/
	public static List<VRProductionPlantSupplier> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr production plant suppliers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plant suppliers
	*/
	public static List<VRProductionPlantSupplier> findAll(int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plant suppliers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plant suppliers
	*/
	public static List<VRProductionPlantSupplier> findAll(int start, int end,
		OrderByComparator<VRProductionPlantSupplier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr production plant suppliers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr production plant suppliers.
	*
	* @return the number of vr production plant suppliers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRProductionPlantSupplierPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductionPlantSupplierPersistence, VRProductionPlantSupplierPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRProductionPlantSupplierPersistence.class);
}