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

import com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the srcphbh giay phep van tai service. This utility wraps {@link com.backend.migrate.vr.service.persistence.impl.SRCPHBHGiayPhepVanTaiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SRCPHBHGiayPhepVanTaiPersistence
 * @see com.backend.migrate.vr.service.persistence.impl.SRCPHBHGiayPhepVanTaiPersistenceImpl
 * @generated
 */
@ProviderType
public class SRCPHBHGiayPhepVanTaiUtil {
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
	public static void clearCache(SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		getPersistence().clearCache(srcphbhGiayPhepVanTai);
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
	public static List<SRCPHBHGiayPhepVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SRCPHBHGiayPhepVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SRCPHBHGiayPhepVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SRCPHBHGiayPhepVanTai update(
		SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		return getPersistence().update(srcphbhGiayPhepVanTai);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SRCPHBHGiayPhepVanTai update(
		SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai,
		ServiceContext serviceContext) {
		return getPersistence().update(srcphbhGiayPhepVanTai, serviceContext);
	}

	/**
	* Returns all the srcphbh giay phep van tais where id &gt; &#63;.
	*
	* @param id the ID
	* @return the matching srcphbh giay phep van tais
	*/
	public static List<SRCPHBHGiayPhepVanTai> findByGT_ID(long id) {
		return getPersistence().findByGT_ID(id);
	}

	/**
	* Returns a range of all the srcphbh giay phep van tais where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of srcphbh giay phep van tais
	* @param end the upper bound of the range of srcphbh giay phep van tais (not inclusive)
	* @return the range of matching srcphbh giay phep van tais
	*/
	public static List<SRCPHBHGiayPhepVanTai> findByGT_ID(long id, int start,
		int end) {
		return getPersistence().findByGT_ID(id, start, end);
	}

	/**
	* Returns an ordered range of all the srcphbh giay phep van tais where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of srcphbh giay phep van tais
	* @param end the upper bound of the range of srcphbh giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching srcphbh giay phep van tais
	*/
	public static List<SRCPHBHGiayPhepVanTai> findByGT_ID(long id, int start,
		int end, OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator) {
		return getPersistence().findByGT_ID(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the srcphbh giay phep van tais where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of srcphbh giay phep van tais
	* @param end the upper bound of the range of srcphbh giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching srcphbh giay phep van tais
	*/
	public static List<SRCPHBHGiayPhepVanTai> findByGT_ID(long id, int start,
		int end, OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGT_ID(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first srcphbh giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching srcphbh giay phep van tai
	* @throws NoSuchSRCPHBHGiayPhepVanTaiException if a matching srcphbh giay phep van tai could not be found
	*/
	public static SRCPHBHGiayPhepVanTai findByGT_ID_First(long id,
		OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchSRCPHBHGiayPhepVanTaiException {
		return getPersistence().findByGT_ID_First(id, orderByComparator);
	}

	/**
	* Returns the first srcphbh giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching srcphbh giay phep van tai, or <code>null</code> if a matching srcphbh giay phep van tai could not be found
	*/
	public static SRCPHBHGiayPhepVanTai fetchByGT_ID_First(long id,
		OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator) {
		return getPersistence().fetchByGT_ID_First(id, orderByComparator);
	}

	/**
	* Returns the last srcphbh giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching srcphbh giay phep van tai
	* @throws NoSuchSRCPHBHGiayPhepVanTaiException if a matching srcphbh giay phep van tai could not be found
	*/
	public static SRCPHBHGiayPhepVanTai findByGT_ID_Last(long id,
		OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchSRCPHBHGiayPhepVanTaiException {
		return getPersistence().findByGT_ID_Last(id, orderByComparator);
	}

	/**
	* Returns the last srcphbh giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching srcphbh giay phep van tai, or <code>null</code> if a matching srcphbh giay phep van tai could not be found
	*/
	public static SRCPHBHGiayPhepVanTai fetchByGT_ID_Last(long id,
		OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator) {
		return getPersistence().fetchByGT_ID_Last(id, orderByComparator);
	}

	/**
	* Removes all the srcphbh giay phep van tais where id &gt; &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByGT_ID(long id) {
		getPersistence().removeByGT_ID(id);
	}

	/**
	* Returns the number of srcphbh giay phep van tais where id &gt; &#63;.
	*
	* @param id the ID
	* @return the number of matching srcphbh giay phep van tais
	*/
	public static int countByGT_ID(long id) {
		return getPersistence().countByGT_ID(id);
	}

	/**
	* Caches the srcphbh giay phep van tai in the entity cache if it is enabled.
	*
	* @param srcphbhGiayPhepVanTai the srcphbh giay phep van tai
	*/
	public static void cacheResult(SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		getPersistence().cacheResult(srcphbhGiayPhepVanTai);
	}

	/**
	* Caches the srcphbh giay phep van tais in the entity cache if it is enabled.
	*
	* @param srcphbhGiayPhepVanTais the srcphbh giay phep van tais
	*/
	public static void cacheResult(
		List<SRCPHBHGiayPhepVanTai> srcphbhGiayPhepVanTais) {
		getPersistence().cacheResult(srcphbhGiayPhepVanTais);
	}

	/**
	* Creates a new srcphbh giay phep van tai with the primary key. Does not add the srcphbh giay phep van tai to the database.
	*
	* @param id the primary key for the new srcphbh giay phep van tai
	* @return the new srcphbh giay phep van tai
	*/
	public static SRCPHBHGiayPhepVanTai create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the srcphbh giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai that was removed
	* @throws NoSuchSRCPHBHGiayPhepVanTaiException if a srcphbh giay phep van tai with the primary key could not be found
	*/
	public static SRCPHBHGiayPhepVanTai remove(long id)
		throws com.backend.migrate.vr.exception.NoSuchSRCPHBHGiayPhepVanTaiException {
		return getPersistence().remove(id);
	}

	public static SRCPHBHGiayPhepVanTai updateImpl(
		SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		return getPersistence().updateImpl(srcphbhGiayPhepVanTai);
	}

	/**
	* Returns the srcphbh giay phep van tai with the primary key or throws a {@link NoSuchSRCPHBHGiayPhepVanTaiException} if it could not be found.
	*
	* @param id the primary key of the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai
	* @throws NoSuchSRCPHBHGiayPhepVanTaiException if a srcphbh giay phep van tai with the primary key could not be found
	*/
	public static SRCPHBHGiayPhepVanTai findByPrimaryKey(long id)
		throws com.backend.migrate.vr.exception.NoSuchSRCPHBHGiayPhepVanTaiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the srcphbh giay phep van tai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai, or <code>null</code> if a srcphbh giay phep van tai with the primary key could not be found
	*/
	public static SRCPHBHGiayPhepVanTai fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, SRCPHBHGiayPhepVanTai> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the srcphbh giay phep van tais.
	*
	* @return the srcphbh giay phep van tais
	*/
	public static List<SRCPHBHGiayPhepVanTai> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the srcphbh giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of srcphbh giay phep van tais
	* @param end the upper bound of the range of srcphbh giay phep van tais (not inclusive)
	* @return the range of srcphbh giay phep van tais
	*/
	public static List<SRCPHBHGiayPhepVanTai> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the srcphbh giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of srcphbh giay phep van tais
	* @param end the upper bound of the range of srcphbh giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of srcphbh giay phep van tais
	*/
	public static List<SRCPHBHGiayPhepVanTai> findAll(int start, int end,
		OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the srcphbh giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of srcphbh giay phep van tais
	* @param end the upper bound of the range of srcphbh giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of srcphbh giay phep van tais
	*/
	public static List<SRCPHBHGiayPhepVanTai> findAll(int start, int end,
		OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the srcphbh giay phep van tais from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of srcphbh giay phep van tais.
	*
	* @return the number of srcphbh giay phep van tais
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SRCPHBHGiayPhepVanTaiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SRCPHBHGiayPhepVanTaiPersistence, SRCPHBHGiayPhepVanTaiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SRCPHBHGiayPhepVanTaiPersistence.class);
}