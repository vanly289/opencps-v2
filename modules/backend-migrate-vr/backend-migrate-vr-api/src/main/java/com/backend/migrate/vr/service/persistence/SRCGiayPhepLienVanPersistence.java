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

import com.backend.migrate.vr.exception.NoSuchSRCGiayPhepLienVanException;
import com.backend.migrate.vr.model.SRCGiayPhepLienVan;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the src giay phep lien van service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.SRCGiayPhepLienVanPersistenceImpl
 * @see SRCGiayPhepLienVanUtil
 * @generated
 */
@ProviderType
public interface SRCGiayPhepLienVanPersistence extends BasePersistence<SRCGiayPhepLienVan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SRCGiayPhepLienVanUtil} to access the src giay phep lien van persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the src giay phep lien vans where id &gt; &#63;.
	*
	* @param id the ID
	* @return the matching src giay phep lien vans
	*/
	public java.util.List<SRCGiayPhepLienVan> findByGT_ID(long id);

	/**
	* Returns a range of all the src giay phep lien vans where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of src giay phep lien vans
	* @param end the upper bound of the range of src giay phep lien vans (not inclusive)
	* @return the range of matching src giay phep lien vans
	*/
	public java.util.List<SRCGiayPhepLienVan> findByGT_ID(long id, int start,
		int end);

	/**
	* Returns an ordered range of all the src giay phep lien vans where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of src giay phep lien vans
	* @param end the upper bound of the range of src giay phep lien vans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching src giay phep lien vans
	*/
	public java.util.List<SRCGiayPhepLienVan> findByGT_ID(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepLienVan> orderByComparator);

	/**
	* Returns an ordered range of all the src giay phep lien vans where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of src giay phep lien vans
	* @param end the upper bound of the range of src giay phep lien vans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching src giay phep lien vans
	*/
	public java.util.List<SRCGiayPhepLienVan> findByGT_ID(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepLienVan> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first src giay phep lien van in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching src giay phep lien van
	* @throws NoSuchSRCGiayPhepLienVanException if a matching src giay phep lien van could not be found
	*/
	public SRCGiayPhepLienVan findByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepLienVan> orderByComparator)
		throws NoSuchSRCGiayPhepLienVanException;

	/**
	* Returns the first src giay phep lien van in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching src giay phep lien van, or <code>null</code> if a matching src giay phep lien van could not be found
	*/
	public SRCGiayPhepLienVan fetchByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepLienVan> orderByComparator);

	/**
	* Returns the last src giay phep lien van in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching src giay phep lien van
	* @throws NoSuchSRCGiayPhepLienVanException if a matching src giay phep lien van could not be found
	*/
	public SRCGiayPhepLienVan findByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepLienVan> orderByComparator)
		throws NoSuchSRCGiayPhepLienVanException;

	/**
	* Returns the last src giay phep lien van in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching src giay phep lien van, or <code>null</code> if a matching src giay phep lien van could not be found
	*/
	public SRCGiayPhepLienVan fetchByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepLienVan> orderByComparator);

	/**
	* Removes all the src giay phep lien vans where id &gt; &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByGT_ID(long id);

	/**
	* Returns the number of src giay phep lien vans where id &gt; &#63;.
	*
	* @param id the ID
	* @return the number of matching src giay phep lien vans
	*/
	public int countByGT_ID(long id);

	/**
	* Caches the src giay phep lien van in the entity cache if it is enabled.
	*
	* @param srcGiayPhepLienVan the src giay phep lien van
	*/
	public void cacheResult(SRCGiayPhepLienVan srcGiayPhepLienVan);

	/**
	* Caches the src giay phep lien vans in the entity cache if it is enabled.
	*
	* @param srcGiayPhepLienVans the src giay phep lien vans
	*/
	public void cacheResult(
		java.util.List<SRCGiayPhepLienVan> srcGiayPhepLienVans);

	/**
	* Creates a new src giay phep lien van with the primary key. Does not add the src giay phep lien van to the database.
	*
	* @param id the primary key for the new src giay phep lien van
	* @return the new src giay phep lien van
	*/
	public SRCGiayPhepLienVan create(long id);

	/**
	* Removes the src giay phep lien van with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the src giay phep lien van
	* @return the src giay phep lien van that was removed
	* @throws NoSuchSRCGiayPhepLienVanException if a src giay phep lien van with the primary key could not be found
	*/
	public SRCGiayPhepLienVan remove(long id)
		throws NoSuchSRCGiayPhepLienVanException;

	public SRCGiayPhepLienVan updateImpl(SRCGiayPhepLienVan srcGiayPhepLienVan);

	/**
	* Returns the src giay phep lien van with the primary key or throws a {@link NoSuchSRCGiayPhepLienVanException} if it could not be found.
	*
	* @param id the primary key of the src giay phep lien van
	* @return the src giay phep lien van
	* @throws NoSuchSRCGiayPhepLienVanException if a src giay phep lien van with the primary key could not be found
	*/
	public SRCGiayPhepLienVan findByPrimaryKey(long id)
		throws NoSuchSRCGiayPhepLienVanException;

	/**
	* Returns the src giay phep lien van with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the src giay phep lien van
	* @return the src giay phep lien van, or <code>null</code> if a src giay phep lien van with the primary key could not be found
	*/
	public SRCGiayPhepLienVan fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, SRCGiayPhepLienVan> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the src giay phep lien vans.
	*
	* @return the src giay phep lien vans
	*/
	public java.util.List<SRCGiayPhepLienVan> findAll();

	/**
	* Returns a range of all the src giay phep lien vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep lien vans
	* @param end the upper bound of the range of src giay phep lien vans (not inclusive)
	* @return the range of src giay phep lien vans
	*/
	public java.util.List<SRCGiayPhepLienVan> findAll(int start, int end);

	/**
	* Returns an ordered range of all the src giay phep lien vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep lien vans
	* @param end the upper bound of the range of src giay phep lien vans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of src giay phep lien vans
	*/
	public java.util.List<SRCGiayPhepLienVan> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepLienVan> orderByComparator);

	/**
	* Returns an ordered range of all the src giay phep lien vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep lien vans
	* @param end the upper bound of the range of src giay phep lien vans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of src giay phep lien vans
	*/
	public java.util.List<SRCGiayPhepLienVan> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepLienVan> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the src giay phep lien vans from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of src giay phep lien vans.
	*
	* @return the number of src giay phep lien vans
	*/
	public int countAll();
}