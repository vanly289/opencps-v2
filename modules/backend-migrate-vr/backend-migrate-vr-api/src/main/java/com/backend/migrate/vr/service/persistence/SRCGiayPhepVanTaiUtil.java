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

import com.backend.migrate.vr.model.SRCGiayPhepVanTai;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the src giay phep van tai service. This utility wraps {@link com.backend.migrate.vr.service.persistence.impl.SRCGiayPhepVanTaiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SRCGiayPhepVanTaiPersistence
 * @see com.backend.migrate.vr.service.persistence.impl.SRCGiayPhepVanTaiPersistenceImpl
 * @generated
 */
@ProviderType
public class SRCGiayPhepVanTaiUtil {
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
	public static void clearCache(SRCGiayPhepVanTai srcGiayPhepVanTai) {
		getPersistence().clearCache(srcGiayPhepVanTai);
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
	public static List<SRCGiayPhepVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SRCGiayPhepVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SRCGiayPhepVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SRCGiayPhepVanTai> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SRCGiayPhepVanTai update(SRCGiayPhepVanTai srcGiayPhepVanTai) {
		return getPersistence().update(srcGiayPhepVanTai);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SRCGiayPhepVanTai update(
		SRCGiayPhepVanTai srcGiayPhepVanTai, ServiceContext serviceContext) {
		return getPersistence().update(srcGiayPhepVanTai, serviceContext);
	}

	/**
	* Returns all the src giay phep van tais where id &gt; &#63;.
	*
	* @param id the ID
	* @return the matching src giay phep van tais
	*/
	public static List<SRCGiayPhepVanTai> findByGT_ID(long id) {
		return getPersistence().findByGT_ID(id);
	}

	/**
	* Returns a range of all the src giay phep van tais where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of src giay phep van tais
	* @param end the upper bound of the range of src giay phep van tais (not inclusive)
	* @return the range of matching src giay phep van tais
	*/
	public static List<SRCGiayPhepVanTai> findByGT_ID(long id, int start,
		int end) {
		return getPersistence().findByGT_ID(id, start, end);
	}

	/**
	* Returns an ordered range of all the src giay phep van tais where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of src giay phep van tais
	* @param end the upper bound of the range of src giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching src giay phep van tais
	*/
	public static List<SRCGiayPhepVanTai> findByGT_ID(long id, int start,
		int end, OrderByComparator<SRCGiayPhepVanTai> orderByComparator) {
		return getPersistence().findByGT_ID(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the src giay phep van tais where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of src giay phep van tais
	* @param end the upper bound of the range of src giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching src giay phep van tais
	*/
	public static List<SRCGiayPhepVanTai> findByGT_ID(long id, int start,
		int end, OrderByComparator<SRCGiayPhepVanTai> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGT_ID(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first src giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching src giay phep van tai
	* @throws NoSuchSRCGiayPhepVanTaiException if a matching src giay phep van tai could not be found
	*/
	public static SRCGiayPhepVanTai findByGT_ID_First(long id,
		OrderByComparator<SRCGiayPhepVanTai> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchSRCGiayPhepVanTaiException {
		return getPersistence().findByGT_ID_First(id, orderByComparator);
	}

	/**
	* Returns the first src giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching src giay phep van tai, or <code>null</code> if a matching src giay phep van tai could not be found
	*/
	public static SRCGiayPhepVanTai fetchByGT_ID_First(long id,
		OrderByComparator<SRCGiayPhepVanTai> orderByComparator) {
		return getPersistence().fetchByGT_ID_First(id, orderByComparator);
	}

	/**
	* Returns the last src giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching src giay phep van tai
	* @throws NoSuchSRCGiayPhepVanTaiException if a matching src giay phep van tai could not be found
	*/
	public static SRCGiayPhepVanTai findByGT_ID_Last(long id,
		OrderByComparator<SRCGiayPhepVanTai> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchSRCGiayPhepVanTaiException {
		return getPersistence().findByGT_ID_Last(id, orderByComparator);
	}

	/**
	* Returns the last src giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching src giay phep van tai, or <code>null</code> if a matching src giay phep van tai could not be found
	*/
	public static SRCGiayPhepVanTai fetchByGT_ID_Last(long id,
		OrderByComparator<SRCGiayPhepVanTai> orderByComparator) {
		return getPersistence().fetchByGT_ID_Last(id, orderByComparator);
	}

	/**
	* Removes all the src giay phep van tais where id &gt; &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByGT_ID(long id) {
		getPersistence().removeByGT_ID(id);
	}

	/**
	* Returns the number of src giay phep van tais where id &gt; &#63;.
	*
	* @param id the ID
	* @return the number of matching src giay phep van tais
	*/
	public static int countByGT_ID(long id) {
		return getPersistence().countByGT_ID(id);
	}

	/**
	* Caches the src giay phep van tai in the entity cache if it is enabled.
	*
	* @param srcGiayPhepVanTai the src giay phep van tai
	*/
	public static void cacheResult(SRCGiayPhepVanTai srcGiayPhepVanTai) {
		getPersistence().cacheResult(srcGiayPhepVanTai);
	}

	/**
	* Caches the src giay phep van tais in the entity cache if it is enabled.
	*
	* @param srcGiayPhepVanTais the src giay phep van tais
	*/
	public static void cacheResult(List<SRCGiayPhepVanTai> srcGiayPhepVanTais) {
		getPersistence().cacheResult(srcGiayPhepVanTais);
	}

	/**
	* Creates a new src giay phep van tai with the primary key. Does not add the src giay phep van tai to the database.
	*
	* @param id the primary key for the new src giay phep van tai
	* @return the new src giay phep van tai
	*/
	public static SRCGiayPhepVanTai create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the src giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the src giay phep van tai
	* @return the src giay phep van tai that was removed
	* @throws NoSuchSRCGiayPhepVanTaiException if a src giay phep van tai with the primary key could not be found
	*/
	public static SRCGiayPhepVanTai remove(long id)
		throws com.backend.migrate.vr.exception.NoSuchSRCGiayPhepVanTaiException {
		return getPersistence().remove(id);
	}

	public static SRCGiayPhepVanTai updateImpl(
		SRCGiayPhepVanTai srcGiayPhepVanTai) {
		return getPersistence().updateImpl(srcGiayPhepVanTai);
	}

	/**
	* Returns the src giay phep van tai with the primary key or throws a {@link NoSuchSRCGiayPhepVanTaiException} if it could not be found.
	*
	* @param id the primary key of the src giay phep van tai
	* @return the src giay phep van tai
	* @throws NoSuchSRCGiayPhepVanTaiException if a src giay phep van tai with the primary key could not be found
	*/
	public static SRCGiayPhepVanTai findByPrimaryKey(long id)
		throws com.backend.migrate.vr.exception.NoSuchSRCGiayPhepVanTaiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the src giay phep van tai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the src giay phep van tai
	* @return the src giay phep van tai, or <code>null</code> if a src giay phep van tai with the primary key could not be found
	*/
	public static SRCGiayPhepVanTai fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, SRCGiayPhepVanTai> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the src giay phep van tais.
	*
	* @return the src giay phep van tais
	*/
	public static List<SRCGiayPhepVanTai> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the src giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep van tais
	* @param end the upper bound of the range of src giay phep van tais (not inclusive)
	* @return the range of src giay phep van tais
	*/
	public static List<SRCGiayPhepVanTai> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the src giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep van tais
	* @param end the upper bound of the range of src giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of src giay phep van tais
	*/
	public static List<SRCGiayPhepVanTai> findAll(int start, int end,
		OrderByComparator<SRCGiayPhepVanTai> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the src giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep van tais
	* @param end the upper bound of the range of src giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of src giay phep van tais
	*/
	public static List<SRCGiayPhepVanTai> findAll(int start, int end,
		OrderByComparator<SRCGiayPhepVanTai> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the src giay phep van tais from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of src giay phep van tais.
	*
	* @return the number of src giay phep van tais
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SRCGiayPhepVanTaiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SRCGiayPhepVanTaiPersistence, SRCGiayPhepVanTaiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SRCGiayPhepVanTaiPersistence.class);
}