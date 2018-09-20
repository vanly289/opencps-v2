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

package com.backend.migrate.vr.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.backend.migrate.vr.model.ViPham;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vi pham service. This utility wraps {@link com.backend.migrate.vr.service.persistence.impl.ViPhamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ViPhamPersistence
 * @see com.backend.migrate.vr.service.persistence.impl.ViPhamPersistenceImpl
 * @generated
 */
@ProviderType
public class ViPhamUtil {
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
	public static void clearCache(ViPham viPham) {
		getPersistence().clearCache(viPham);
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
	public static List<ViPham> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ViPham> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ViPham> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<ViPham> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ViPham update(ViPham viPham) {
		return getPersistence().update(viPham);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ViPham update(ViPham viPham, ServiceContext serviceContext) {
		return getPersistence().update(viPham, serviceContext);
	}

	/**
	* Returns all the vi phams where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vi phams
	*/
	public static List<ViPham> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the vi phams where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @return the range of matching vi phams
	*/
	public static List<ViPham> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the vi phams where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vi phams
	*/
	public static List<ViPham> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ViPham> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vi phams where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vi phams
	*/
	public static List<ViPham> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ViPham> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vi pham in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vi pham
	* @throws NoSuchViPhamException if a matching vi pham could not be found
	*/
	public static ViPham findByUuid_First(java.lang.String uuid,
		OrderByComparator<ViPham> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchViPhamException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first vi pham in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vi pham, or <code>null</code> if a matching vi pham could not be found
	*/
	public static ViPham fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<ViPham> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last vi pham in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vi pham
	* @throws NoSuchViPhamException if a matching vi pham could not be found
	*/
	public static ViPham findByUuid_Last(java.lang.String uuid,
		OrderByComparator<ViPham> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchViPhamException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last vi pham in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vi pham, or <code>null</code> if a matching vi pham could not be found
	*/
	public static ViPham fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<ViPham> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the vi phams before and after the current vi pham in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current vi pham
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vi pham
	* @throws NoSuchViPhamException if a vi pham with the primary key could not be found
	*/
	public static ViPham[] findByUuid_PrevAndNext(long id,
		java.lang.String uuid, OrderByComparator<ViPham> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchViPhamException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id, uuid, orderByComparator);
	}

	/**
	* Removes all the vi phams where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of vi phams where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vi phams
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Caches the vi pham in the entity cache if it is enabled.
	*
	* @param viPham the vi pham
	*/
	public static void cacheResult(ViPham viPham) {
		getPersistence().cacheResult(viPham);
	}

	/**
	* Caches the vi phams in the entity cache if it is enabled.
	*
	* @param viPhams the vi phams
	*/
	public static void cacheResult(List<ViPham> viPhams) {
		getPersistence().cacheResult(viPhams);
	}

	/**
	* Creates a new vi pham with the primary key. Does not add the vi pham to the database.
	*
	* @param id the primary key for the new vi pham
	* @return the new vi pham
	*/
	public static ViPham create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vi pham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vi pham
	* @return the vi pham that was removed
	* @throws NoSuchViPhamException if a vi pham with the primary key could not be found
	*/
	public static ViPham remove(long id)
		throws com.backend.migrate.vr.exception.NoSuchViPhamException {
		return getPersistence().remove(id);
	}

	public static ViPham updateImpl(ViPham viPham) {
		return getPersistence().updateImpl(viPham);
	}

	/**
	* Returns the vi pham with the primary key or throws a {@link NoSuchViPhamException} if it could not be found.
	*
	* @param id the primary key of the vi pham
	* @return the vi pham
	* @throws NoSuchViPhamException if a vi pham with the primary key could not be found
	*/
	public static ViPham findByPrimaryKey(long id)
		throws com.backend.migrate.vr.exception.NoSuchViPhamException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vi pham with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vi pham
	* @return the vi pham, or <code>null</code> if a vi pham with the primary key could not be found
	*/
	public static ViPham fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ViPham> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vi phams.
	*
	* @return the vi phams
	*/
	public static List<ViPham> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vi phams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @return the range of vi phams
	*/
	public static List<ViPham> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vi phams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vi phams
	*/
	public static List<ViPham> findAll(int start, int end,
		OrderByComparator<ViPham> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vi phams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vi phams
	*/
	public static List<ViPham> findAll(int start, int end,
		OrderByComparator<ViPham> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vi phams from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vi phams.
	*
	* @return the number of vi phams
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ViPhamPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ViPhamPersistence, ViPhamPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ViPhamPersistence.class);
}