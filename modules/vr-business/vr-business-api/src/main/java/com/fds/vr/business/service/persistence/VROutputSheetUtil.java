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

import com.fds.vr.business.model.VROutputSheet;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr output sheet service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VROutputSheetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VROutputSheetPersistence
 * @see com.fds.vr.business.service.persistence.impl.VROutputSheetPersistenceImpl
 * @generated
 */
@ProviderType
public class VROutputSheetUtil {
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
	public static void clearCache(VROutputSheet vrOutputSheet) {
		getPersistence().clearCache(vrOutputSheet);
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
	public static List<VROutputSheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VROutputSheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VROutputSheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VROutputSheet update(VROutputSheet vrOutputSheet) {
		return getPersistence().update(vrOutputSheet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VROutputSheet update(VROutputSheet vrOutputSheet,
		ServiceContext serviceContext) {
		return getPersistence().update(vrOutputSheet, serviceContext);
	}

	/**
	* Caches the vr output sheet in the entity cache if it is enabled.
	*
	* @param vrOutputSheet the vr output sheet
	*/
	public static void cacheResult(VROutputSheet vrOutputSheet) {
		getPersistence().cacheResult(vrOutputSheet);
	}

	/**
	* Caches the vr output sheets in the entity cache if it is enabled.
	*
	* @param vrOutputSheets the vr output sheets
	*/
	public static void cacheResult(List<VROutputSheet> vrOutputSheets) {
		getPersistence().cacheResult(vrOutputSheets);
	}

	/**
	* Creates a new vr output sheet with the primary key. Does not add the vr output sheet to the database.
	*
	* @param id the primary key for the new vr output sheet
	* @return the new vr output sheet
	*/
	public static VROutputSheet create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr output sheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet that was removed
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet remove(long id)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence().remove(id);
	}

	public static VROutputSheet updateImpl(VROutputSheet vrOutputSheet) {
		return getPersistence().updateImpl(vrOutputSheet);
	}

	/**
	* Returns the vr output sheet with the primary key or throws a {@link NoSuchVROutputSheetException} if it could not be found.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr output sheet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet, or <code>null</code> if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VROutputSheet> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr output sheets.
	*
	* @return the vr output sheets
	*/
	public static List<VROutputSheet> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of vr output sheets
	*/
	public static List<VROutputSheet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr output sheets
	*/
	public static List<VROutputSheet> findAll(int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr output sheets
	*/
	public static List<VROutputSheet> findAll(int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr output sheets from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr output sheets.
	*
	* @return the number of vr output sheets
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VROutputSheetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VROutputSheetPersistence, VROutputSheetPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VROutputSheetPersistence.class);
}