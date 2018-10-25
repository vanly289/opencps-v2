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

import com.backend.migrate.vr.exception.NoSuchSRCGiayPhepVanTaiException;
import com.backend.migrate.vr.model.SRCGiayPhepVanTai;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the src giay phep van tai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.SRCGiayPhepVanTaiPersistenceImpl
 * @see SRCGiayPhepVanTaiUtil
 * @generated
 */
@ProviderType
public interface SRCGiayPhepVanTaiPersistence extends BasePersistence<SRCGiayPhepVanTai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SRCGiayPhepVanTaiUtil} to access the src giay phep van tai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the src giay phep van tais where id &gt; &#63;.
	*
	* @param id the ID
	* @return the matching src giay phep van tais
	*/
	public java.util.List<SRCGiayPhepVanTai> findByGT_ID(long id);

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
	public java.util.List<SRCGiayPhepVanTai> findByGT_ID(long id, int start,
		int end);

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
	public java.util.List<SRCGiayPhepVanTai> findByGT_ID(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepVanTai> orderByComparator);

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
	public java.util.List<SRCGiayPhepVanTai> findByGT_ID(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepVanTai> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first src giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching src giay phep van tai
	* @throws NoSuchSRCGiayPhepVanTaiException if a matching src giay phep van tai could not be found
	*/
	public SRCGiayPhepVanTai findByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepVanTai> orderByComparator)
		throws NoSuchSRCGiayPhepVanTaiException;

	/**
	* Returns the first src giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching src giay phep van tai, or <code>null</code> if a matching src giay phep van tai could not be found
	*/
	public SRCGiayPhepVanTai fetchByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepVanTai> orderByComparator);

	/**
	* Returns the last src giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching src giay phep van tai
	* @throws NoSuchSRCGiayPhepVanTaiException if a matching src giay phep van tai could not be found
	*/
	public SRCGiayPhepVanTai findByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepVanTai> orderByComparator)
		throws NoSuchSRCGiayPhepVanTaiException;

	/**
	* Returns the last src giay phep van tai in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching src giay phep van tai, or <code>null</code> if a matching src giay phep van tai could not be found
	*/
	public SRCGiayPhepVanTai fetchByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepVanTai> orderByComparator);

	/**
	* Removes all the src giay phep van tais where id &gt; &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByGT_ID(long id);

	/**
	* Returns the number of src giay phep van tais where id &gt; &#63;.
	*
	* @param id the ID
	* @return the number of matching src giay phep van tais
	*/
	public int countByGT_ID(long id);

	/**
	* Caches the src giay phep van tai in the entity cache if it is enabled.
	*
	* @param srcGiayPhepVanTai the src giay phep van tai
	*/
	public void cacheResult(SRCGiayPhepVanTai srcGiayPhepVanTai);

	/**
	* Caches the src giay phep van tais in the entity cache if it is enabled.
	*
	* @param srcGiayPhepVanTais the src giay phep van tais
	*/
	public void cacheResult(
		java.util.List<SRCGiayPhepVanTai> srcGiayPhepVanTais);

	/**
	* Creates a new src giay phep van tai with the primary key. Does not add the src giay phep van tai to the database.
	*
	* @param id the primary key for the new src giay phep van tai
	* @return the new src giay phep van tai
	*/
	public SRCGiayPhepVanTai create(long id);

	/**
	* Removes the src giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the src giay phep van tai
	* @return the src giay phep van tai that was removed
	* @throws NoSuchSRCGiayPhepVanTaiException if a src giay phep van tai with the primary key could not be found
	*/
	public SRCGiayPhepVanTai remove(long id)
		throws NoSuchSRCGiayPhepVanTaiException;

	public SRCGiayPhepVanTai updateImpl(SRCGiayPhepVanTai srcGiayPhepVanTai);

	/**
	* Returns the src giay phep van tai with the primary key or throws a {@link NoSuchSRCGiayPhepVanTaiException} if it could not be found.
	*
	* @param id the primary key of the src giay phep van tai
	* @return the src giay phep van tai
	* @throws NoSuchSRCGiayPhepVanTaiException if a src giay phep van tai with the primary key could not be found
	*/
	public SRCGiayPhepVanTai findByPrimaryKey(long id)
		throws NoSuchSRCGiayPhepVanTaiException;

	/**
	* Returns the src giay phep van tai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the src giay phep van tai
	* @return the src giay phep van tai, or <code>null</code> if a src giay phep van tai with the primary key could not be found
	*/
	public SRCGiayPhepVanTai fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, SRCGiayPhepVanTai> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the src giay phep van tais.
	*
	* @return the src giay phep van tais
	*/
	public java.util.List<SRCGiayPhepVanTai> findAll();

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
	public java.util.List<SRCGiayPhepVanTai> findAll(int start, int end);

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
	public java.util.List<SRCGiayPhepVanTai> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepVanTai> orderByComparator);

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
	public java.util.List<SRCGiayPhepVanTai> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCGiayPhepVanTai> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the src giay phep van tais from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of src giay phep van tais.
	*
	* @return the number of src giay phep van tais
	*/
	public int countAll();
}