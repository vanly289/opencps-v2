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

import com.backend.migrate.vr.exception.NoSuchDoanhNghiepException;
import com.backend.migrate.vr.model.DoanhNghiep;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the doanh nghiep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.DoanhNghiepPersistenceImpl
 * @see DoanhNghiepUtil
 * @generated
 */
@ProviderType
public interface DoanhNghiepPersistence extends BasePersistence<DoanhNghiep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DoanhNghiepUtil} to access the doanh nghiep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the doanh nghieps where id &gt; &#63;.
	*
	* @param id the ID
	* @return the matching doanh nghieps
	*/
	public java.util.List<DoanhNghiep> findByGT_ID(long id);

	/**
	* Returns a range of all the doanh nghieps where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of doanh nghieps
	* @param end the upper bound of the range of doanh nghieps (not inclusive)
	* @return the range of matching doanh nghieps
	*/
	public java.util.List<DoanhNghiep> findByGT_ID(long id, int start, int end);

	/**
	* Returns an ordered range of all the doanh nghieps where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of doanh nghieps
	* @param end the upper bound of the range of doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching doanh nghieps
	*/
	public java.util.List<DoanhNghiep> findByGT_ID(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DoanhNghiep> orderByComparator);

	/**
	* Returns an ordered range of all the doanh nghieps where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of doanh nghieps
	* @param end the upper bound of the range of doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching doanh nghieps
	*/
	public java.util.List<DoanhNghiep> findByGT_ID(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DoanhNghiep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first doanh nghiep in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doanh nghiep
	* @throws NoSuchDoanhNghiepException if a matching doanh nghiep could not be found
	*/
	public DoanhNghiep findByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<DoanhNghiep> orderByComparator)
		throws NoSuchDoanhNghiepException;

	/**
	* Returns the first doanh nghiep in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doanh nghiep, or <code>null</code> if a matching doanh nghiep could not be found
	*/
	public DoanhNghiep fetchByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<DoanhNghiep> orderByComparator);

	/**
	* Returns the last doanh nghiep in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doanh nghiep
	* @throws NoSuchDoanhNghiepException if a matching doanh nghiep could not be found
	*/
	public DoanhNghiep findByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<DoanhNghiep> orderByComparator)
		throws NoSuchDoanhNghiepException;

	/**
	* Returns the last doanh nghiep in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doanh nghiep, or <code>null</code> if a matching doanh nghiep could not be found
	*/
	public DoanhNghiep fetchByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<DoanhNghiep> orderByComparator);

	/**
	* Removes all the doanh nghieps where id &gt; &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByGT_ID(long id);

	/**
	* Returns the number of doanh nghieps where id &gt; &#63;.
	*
	* @param id the ID
	* @return the number of matching doanh nghieps
	*/
	public int countByGT_ID(long id);

	/**
	* Caches the doanh nghiep in the entity cache if it is enabled.
	*
	* @param doanhNghiep the doanh nghiep
	*/
	public void cacheResult(DoanhNghiep doanhNghiep);

	/**
	* Caches the doanh nghieps in the entity cache if it is enabled.
	*
	* @param doanhNghieps the doanh nghieps
	*/
	public void cacheResult(java.util.List<DoanhNghiep> doanhNghieps);

	/**
	* Creates a new doanh nghiep with the primary key. Does not add the doanh nghiep to the database.
	*
	* @param id the primary key for the new doanh nghiep
	* @return the new doanh nghiep
	*/
	public DoanhNghiep create(long id);

	/**
	* Removes the doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the doanh nghiep
	* @return the doanh nghiep that was removed
	* @throws NoSuchDoanhNghiepException if a doanh nghiep with the primary key could not be found
	*/
	public DoanhNghiep remove(long id) throws NoSuchDoanhNghiepException;

	public DoanhNghiep updateImpl(DoanhNghiep doanhNghiep);

	/**
	* Returns the doanh nghiep with the primary key or throws a {@link NoSuchDoanhNghiepException} if it could not be found.
	*
	* @param id the primary key of the doanh nghiep
	* @return the doanh nghiep
	* @throws NoSuchDoanhNghiepException if a doanh nghiep with the primary key could not be found
	*/
	public DoanhNghiep findByPrimaryKey(long id)
		throws NoSuchDoanhNghiepException;

	/**
	* Returns the doanh nghiep with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the doanh nghiep
	* @return the doanh nghiep, or <code>null</code> if a doanh nghiep with the primary key could not be found
	*/
	public DoanhNghiep fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, DoanhNghiep> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the doanh nghieps.
	*
	* @return the doanh nghieps
	*/
	public java.util.List<DoanhNghiep> findAll();

	/**
	* Returns a range of all the doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doanh nghieps
	* @param end the upper bound of the range of doanh nghieps (not inclusive)
	* @return the range of doanh nghieps
	*/
	public java.util.List<DoanhNghiep> findAll(int start, int end);

	/**
	* Returns an ordered range of all the doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doanh nghieps
	* @param end the upper bound of the range of doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of doanh nghieps
	*/
	public java.util.List<DoanhNghiep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DoanhNghiep> orderByComparator);

	/**
	* Returns an ordered range of all the doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doanh nghieps
	* @param end the upper bound of the range of doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of doanh nghieps
	*/
	public java.util.List<DoanhNghiep> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DoanhNghiep> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the doanh nghieps from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of doanh nghieps.
	*
	* @return the number of doanh nghieps
	*/
	public int countAll();
}