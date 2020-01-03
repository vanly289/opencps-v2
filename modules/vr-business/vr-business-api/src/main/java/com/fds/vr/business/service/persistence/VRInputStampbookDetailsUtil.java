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

import com.fds.vr.business.model.VRInputStampbookDetails;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr input stampbook details service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRInputStampbookDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInputStampbookDetailsPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRInputStampbookDetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class VRInputStampbookDetailsUtil {
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
		VRInputStampbookDetails vrInputStampbookDetails) {
		getPersistence().clearCache(vrInputStampbookDetails);
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
	public static List<VRInputStampbookDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRInputStampbookDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRInputStampbookDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRInputStampbookDetails update(
		VRInputStampbookDetails vrInputStampbookDetails) {
		return getPersistence().update(vrInputStampbookDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRInputStampbookDetails update(
		VRInputStampbookDetails vrInputStampbookDetails,
		ServiceContext serviceContext) {
		return getPersistence().update(vrInputStampbookDetails, serviceContext);
	}

	/**
	* Caches the vr input stampbook details in the entity cache if it is enabled.
	*
	* @param vrInputStampbookDetails the vr input stampbook details
	*/
	public static void cacheResult(
		VRInputStampbookDetails vrInputStampbookDetails) {
		getPersistence().cacheResult(vrInputStampbookDetails);
	}

	/**
	* Caches the vr input stampbook detailses in the entity cache if it is enabled.
	*
	* @param vrInputStampbookDetailses the vr input stampbook detailses
	*/
	public static void cacheResult(
		List<VRInputStampbookDetails> vrInputStampbookDetailses) {
		getPersistence().cacheResult(vrInputStampbookDetailses);
	}

	/**
	* Creates a new vr input stampbook details with the primary key. Does not add the vr input stampbook details to the database.
	*
	* @param id the primary key for the new vr input stampbook details
	* @return the new vr input stampbook details
	*/
	public static VRInputStampbookDetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr input stampbook details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details that was removed
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence().remove(id);
	}

	public static VRInputStampbookDetails updateImpl(
		VRInputStampbookDetails vrInputStampbookDetails) {
		return getPersistence().updateImpl(vrInputStampbookDetails);
	}

	/**
	* Returns the vr input stampbook details with the primary key or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr input stampbook details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details, or <code>null</code> if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRInputStampbookDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr input stampbook detailses.
	*
	* @return the vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findAll(int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findAll(int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr input stampbook detailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr input stampbook detailses.
	*
	* @return the number of vr input stampbook detailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRInputStampbookDetailsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRInputStampbookDetailsPersistence, VRInputStampbookDetailsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRInputStampbookDetailsPersistence.class);
}