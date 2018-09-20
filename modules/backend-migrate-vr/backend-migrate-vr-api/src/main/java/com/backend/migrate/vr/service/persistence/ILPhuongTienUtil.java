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

import com.backend.migrate.vr.model.ILPhuongTien;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the il phuong tien service. This utility wraps {@link com.backend.migrate.vr.service.persistence.impl.ILPhuongTienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ILPhuongTienPersistence
 * @see com.backend.migrate.vr.service.persistence.impl.ILPhuongTienPersistenceImpl
 * @generated
 */
@ProviderType
public class ILPhuongTienUtil {
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
	public static void clearCache(ILPhuongTien ilPhuongTien) {
		getPersistence().clearCache(ilPhuongTien);
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
	public static List<ILPhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ILPhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ILPhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ILPhuongTien> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ILPhuongTien update(ILPhuongTien ilPhuongTien) {
		return getPersistence().update(ilPhuongTien);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ILPhuongTien update(ILPhuongTien ilPhuongTien,
		ServiceContext serviceContext) {
		return getPersistence().update(ilPhuongTien, serviceContext);
	}

	/**
	* Returns all the il phuong tiens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching il phuong tiens
	*/
	public static List<ILPhuongTien> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the il phuong tiens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @return the range of matching il phuong tiens
	*/
	public static List<ILPhuongTien> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the il phuong tiens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching il phuong tiens
	*/
	public static List<ILPhuongTien> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<ILPhuongTien> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the il phuong tiens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching il phuong tiens
	*/
	public static List<ILPhuongTien> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<ILPhuongTien> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il phuong tien
	* @throws NoSuchILPhuongTienException if a matching il phuong tien could not be found
	*/
	public static ILPhuongTien findByUuid_First(java.lang.String uuid,
		OrderByComparator<ILPhuongTien> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il phuong tien, or <code>null</code> if a matching il phuong tien could not be found
	*/
	public static ILPhuongTien fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<ILPhuongTien> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il phuong tien
	* @throws NoSuchILPhuongTienException if a matching il phuong tien could not be found
	*/
	public static ILPhuongTien findByUuid_Last(java.lang.String uuid,
		OrderByComparator<ILPhuongTien> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il phuong tien, or <code>null</code> if a matching il phuong tien could not be found
	*/
	public static ILPhuongTien fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<ILPhuongTien> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the il phuong tiens before and after the current il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current il phuong tien
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next il phuong tien
	* @throws NoSuchILPhuongTienException if a il phuong tien with the primary key could not be found
	*/
	public static ILPhuongTien[] findByUuid_PrevAndNext(long id,
		java.lang.String uuid, OrderByComparator<ILPhuongTien> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id, uuid, orderByComparator);
	}

	/**
	* Removes all the il phuong tiens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of il phuong tiens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching il phuong tiens
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the il phuong tiens where id &ge; &#63;.
	*
	* @param id the ID
	* @return the matching il phuong tiens
	*/
	public static List<ILPhuongTien> findByGT_ID(long id) {
		return getPersistence().findByGT_ID(id);
	}

	/**
	* Returns a range of all the il phuong tiens where id &ge; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @return the range of matching il phuong tiens
	*/
	public static List<ILPhuongTien> findByGT_ID(long id, int start, int end) {
		return getPersistence().findByGT_ID(id, start, end);
	}

	/**
	* Returns an ordered range of all the il phuong tiens where id &ge; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching il phuong tiens
	*/
	public static List<ILPhuongTien> findByGT_ID(long id, int start, int end,
		OrderByComparator<ILPhuongTien> orderByComparator) {
		return getPersistence().findByGT_ID(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the il phuong tiens where id &ge; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching il phuong tiens
	*/
	public static List<ILPhuongTien> findByGT_ID(long id, int start, int end,
		OrderByComparator<ILPhuongTien> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGT_ID(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first il phuong tien in the ordered set where id &ge; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il phuong tien
	* @throws NoSuchILPhuongTienException if a matching il phuong tien could not be found
	*/
	public static ILPhuongTien findByGT_ID_First(long id,
		OrderByComparator<ILPhuongTien> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getPersistence().findByGT_ID_First(id, orderByComparator);
	}

	/**
	* Returns the first il phuong tien in the ordered set where id &ge; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il phuong tien, or <code>null</code> if a matching il phuong tien could not be found
	*/
	public static ILPhuongTien fetchByGT_ID_First(long id,
		OrderByComparator<ILPhuongTien> orderByComparator) {
		return getPersistence().fetchByGT_ID_First(id, orderByComparator);
	}

	/**
	* Returns the last il phuong tien in the ordered set where id &ge; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il phuong tien
	* @throws NoSuchILPhuongTienException if a matching il phuong tien could not be found
	*/
	public static ILPhuongTien findByGT_ID_Last(long id,
		OrderByComparator<ILPhuongTien> orderByComparator)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getPersistence().findByGT_ID_Last(id, orderByComparator);
	}

	/**
	* Returns the last il phuong tien in the ordered set where id &ge; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il phuong tien, or <code>null</code> if a matching il phuong tien could not be found
	*/
	public static ILPhuongTien fetchByGT_ID_Last(long id,
		OrderByComparator<ILPhuongTien> orderByComparator) {
		return getPersistence().fetchByGT_ID_Last(id, orderByComparator);
	}

	/**
	* Removes all the il phuong tiens where id &ge; &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByGT_ID(long id) {
		getPersistence().removeByGT_ID(id);
	}

	/**
	* Returns the number of il phuong tiens where id &ge; &#63;.
	*
	* @param id the ID
	* @return the number of matching il phuong tiens
	*/
	public static int countByGT_ID(long id) {
		return getPersistence().countByGT_ID(id);
	}

	/**
	* Caches the il phuong tien in the entity cache if it is enabled.
	*
	* @param ilPhuongTien the il phuong tien
	*/
	public static void cacheResult(ILPhuongTien ilPhuongTien) {
		getPersistence().cacheResult(ilPhuongTien);
	}

	/**
	* Caches the il phuong tiens in the entity cache if it is enabled.
	*
	* @param ilPhuongTiens the il phuong tiens
	*/
	public static void cacheResult(List<ILPhuongTien> ilPhuongTiens) {
		getPersistence().cacheResult(ilPhuongTiens);
	}

	/**
	* Creates a new il phuong tien with the primary key. Does not add the il phuong tien to the database.
	*
	* @param id the primary key for the new il phuong tien
	* @return the new il phuong tien
	*/
	public static ILPhuongTien create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the il phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien that was removed
	* @throws NoSuchILPhuongTienException if a il phuong tien with the primary key could not be found
	*/
	public static ILPhuongTien remove(long id)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getPersistence().remove(id);
	}

	public static ILPhuongTien updateImpl(ILPhuongTien ilPhuongTien) {
		return getPersistence().updateImpl(ilPhuongTien);
	}

	/**
	* Returns the il phuong tien with the primary key or throws a {@link NoSuchILPhuongTienException} if it could not be found.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien
	* @throws NoSuchILPhuongTienException if a il phuong tien with the primary key could not be found
	*/
	public static ILPhuongTien findByPrimaryKey(long id)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the il phuong tien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien, or <code>null</code> if a il phuong tien with the primary key could not be found
	*/
	public static ILPhuongTien fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ILPhuongTien> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the il phuong tiens.
	*
	* @return the il phuong tiens
	*/
	public static List<ILPhuongTien> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the il phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @return the range of il phuong tiens
	*/
	public static List<ILPhuongTien> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the il phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of il phuong tiens
	*/
	public static List<ILPhuongTien> findAll(int start, int end,
		OrderByComparator<ILPhuongTien> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the il phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of il phuong tiens
	*/
	public static List<ILPhuongTien> findAll(int start, int end,
		OrderByComparator<ILPhuongTien> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the il phuong tiens from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of il phuong tiens.
	*
	* @return the number of il phuong tiens
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ILPhuongTienPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ILPhuongTienPersistence, ILPhuongTienPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ILPhuongTienPersistence.class);
}