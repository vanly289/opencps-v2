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

import com.backend.migrate.vr.exception.NoSuchSRCPHBHGiayPhepVanTaiException;
import com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the srcphbh giay phep van tai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.SRCPHBHGiayPhepVanTaiPersistenceImpl
 * @see SRCPHBHGiayPhepVanTaiUtil
 * @generated
 */
@ProviderType
public interface SRCPHBHGiayPhepVanTaiPersistence extends BasePersistence<SRCPHBHGiayPhepVanTai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SRCPHBHGiayPhepVanTaiUtil} to access the srcphbh giay phep van tai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the srcphbh giay phep van tais where id &gt; &#63;.
	*
	* @param id the ID
	* @return the matching srcphbh giay phep van tais
	*/
	public java.util.List<SRCPHBHGiayPhepVanTai> findByGT_ID(long id);

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
	public java.util.List<SRCPHBHGiayPhepVanTai> findByGT_ID(long id,
		int start, int end);

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
	public java.util.List<SRCPHBHGiayPhepVanTai> findByGT_ID(long id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator);

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
	public java.util.List<SRCPHBHGiayPhepVanTai> findByGT_ID(long id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first srcphbh giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching srcphbh giay phep van tai
	* @throws NoSuchSRCPHBHGiayPhepVanTaiException if a matching srcphbh giay phep van tai could not be found
	*/
	public SRCPHBHGiayPhepVanTai findByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator)
		throws NoSuchSRCPHBHGiayPhepVanTaiException;

	/**
	* Returns the first srcphbh giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching srcphbh giay phep van tai, or <code>null</code> if a matching srcphbh giay phep van tai could not be found
	*/
	public SRCPHBHGiayPhepVanTai fetchByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator);

	/**
	* Returns the last srcphbh giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching srcphbh giay phep van tai
	* @throws NoSuchSRCPHBHGiayPhepVanTaiException if a matching srcphbh giay phep van tai could not be found
	*/
	public SRCPHBHGiayPhepVanTai findByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator)
		throws NoSuchSRCPHBHGiayPhepVanTaiException;

	/**
	* Returns the last srcphbh giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching srcphbh giay phep van tai, or <code>null</code> if a matching srcphbh giay phep van tai could not be found
	*/
	public SRCPHBHGiayPhepVanTai fetchByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator);

	/**
	* Removes all the srcphbh giay phep van tais where id &gt; &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByGT_ID(long id);

	/**
	* Returns the number of srcphbh giay phep van tais where id &gt; &#63;.
	*
	* @param id the ID
	* @return the number of matching srcphbh giay phep van tais
	*/
	public int countByGT_ID(long id);

	/**
	* Caches the srcphbh giay phep van tai in the entity cache if it is enabled.
	*
	* @param srcphbhGiayPhepVanTai the srcphbh giay phep van tai
	*/
	public void cacheResult(SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai);

	/**
	* Caches the srcphbh giay phep van tais in the entity cache if it is enabled.
	*
	* @param srcphbhGiayPhepVanTais the srcphbh giay phep van tais
	*/
	public void cacheResult(
		java.util.List<SRCPHBHGiayPhepVanTai> srcphbhGiayPhepVanTais);

	/**
	* Creates a new srcphbh giay phep van tai with the primary key. Does not add the srcphbh giay phep van tai to the database.
	*
	* @param id the primary key for the new srcphbh giay phep van tai
	* @return the new srcphbh giay phep van tai
	*/
	public SRCPHBHGiayPhepVanTai create(long id);

	/**
	* Removes the srcphbh giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai that was removed
	* @throws NoSuchSRCPHBHGiayPhepVanTaiException if a srcphbh giay phep van tai with the primary key could not be found
	*/
	public SRCPHBHGiayPhepVanTai remove(long id)
		throws NoSuchSRCPHBHGiayPhepVanTaiException;

	public SRCPHBHGiayPhepVanTai updateImpl(
		SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai);

	/**
	* Returns the srcphbh giay phep van tai with the primary key or throws a {@link NoSuchSRCPHBHGiayPhepVanTaiException} if it could not be found.
	*
	* @param id the primary key of the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai
	* @throws NoSuchSRCPHBHGiayPhepVanTaiException if a srcphbh giay phep van tai with the primary key could not be found
	*/
	public SRCPHBHGiayPhepVanTai findByPrimaryKey(long id)
		throws NoSuchSRCPHBHGiayPhepVanTaiException;

	/**
	* Returns the srcphbh giay phep van tai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai, or <code>null</code> if a srcphbh giay phep van tai with the primary key could not be found
	*/
	public SRCPHBHGiayPhepVanTai fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, SRCPHBHGiayPhepVanTai> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the srcphbh giay phep van tais.
	*
	* @return the srcphbh giay phep van tais
	*/
	public java.util.List<SRCPHBHGiayPhepVanTai> findAll();

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
	public java.util.List<SRCPHBHGiayPhepVanTai> findAll(int start, int end);

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
	public java.util.List<SRCPHBHGiayPhepVanTai> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator);

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
	public java.util.List<SRCPHBHGiayPhepVanTai> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCPHBHGiayPhepVanTai> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the srcphbh giay phep van tais from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of srcphbh giay phep van tais.
	*
	* @return the number of srcphbh giay phep van tais
	*/
	public int countAll();
}