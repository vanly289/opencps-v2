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

import com.backend.migrate.vr.exception.NoSuchViPhamException;
import com.backend.migrate.vr.model.ViPham;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vi pham service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.ViPhamPersistenceImpl
 * @see ViPhamUtil
 * @generated
 */
@ProviderType
public interface ViPhamPersistence extends BasePersistence<ViPham> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ViPhamUtil} to access the vi pham persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vi phams where id &gt; &#63;.
	*
	* @param id the ID
	* @return the matching vi phams
	*/
	public java.util.List<ViPham> findByGT_ID(long id);

	/**
	* Returns a range of all the vi phams where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @return the range of matching vi phams
	*/
	public java.util.List<ViPham> findByGT_ID(long id, int start, int end);

	/**
	* Returns an ordered range of all the vi phams where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vi phams
	*/
	public java.util.List<ViPham> findByGT_ID(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator);

	/**
	* Returns an ordered range of all the vi phams where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vi phams
	*/
	public java.util.List<ViPham> findByGT_ID(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vi pham in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vi pham
	* @throws NoSuchViPhamException if a matching vi pham could not be found
	*/
	public ViPham findByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator)
		throws NoSuchViPhamException;

	/**
	* Returns the first vi pham in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vi pham, or <code>null</code> if a matching vi pham could not be found
	*/
	public ViPham fetchByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator);

	/**
	* Returns the last vi pham in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vi pham
	* @throws NoSuchViPhamException if a matching vi pham could not be found
	*/
	public ViPham findByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator)
		throws NoSuchViPhamException;

	/**
	* Returns the last vi pham in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vi pham, or <code>null</code> if a matching vi pham could not be found
	*/
	public ViPham fetchByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator);

	/**
	* Removes all the vi phams where id &gt; &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByGT_ID(long id);

	/**
	* Returns the number of vi phams where id &gt; &#63;.
	*
	* @param id the ID
	* @return the number of matching vi phams
	*/
	public int countByGT_ID(long id);

	/**
	* Returns all the vi phams where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @return the matching vi phams
	*/
	public java.util.List<ViPham> findByPTID(long phuongtien_id);

	/**
	* Returns a range of all the vi phams where phuongtien_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phuongtien_id the phuongtien_id
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @return the range of matching vi phams
	*/
	public java.util.List<ViPham> findByPTID(long phuongtien_id, int start,
		int end);

	/**
	* Returns an ordered range of all the vi phams where phuongtien_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phuongtien_id the phuongtien_id
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vi phams
	*/
	public java.util.List<ViPham> findByPTID(long phuongtien_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator);

	/**
	* Returns an ordered range of all the vi phams where phuongtien_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phuongtien_id the phuongtien_id
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vi phams
	*/
	public java.util.List<ViPham> findByPTID(long phuongtien_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vi pham in the ordered set where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vi pham
	* @throws NoSuchViPhamException if a matching vi pham could not be found
	*/
	public ViPham findByPTID_First(long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator)
		throws NoSuchViPhamException;

	/**
	* Returns the first vi pham in the ordered set where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vi pham, or <code>null</code> if a matching vi pham could not be found
	*/
	public ViPham fetchByPTID_First(long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator);

	/**
	* Returns the last vi pham in the ordered set where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vi pham
	* @throws NoSuchViPhamException if a matching vi pham could not be found
	*/
	public ViPham findByPTID_Last(long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator)
		throws NoSuchViPhamException;

	/**
	* Returns the last vi pham in the ordered set where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vi pham, or <code>null</code> if a matching vi pham could not be found
	*/
	public ViPham fetchByPTID_Last(long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator);

	/**
	* Returns the vi phams before and after the current vi pham in the ordered set where phuongtien_id = &#63;.
	*
	* @param id the primary key of the current vi pham
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vi pham
	* @throws NoSuchViPhamException if a vi pham with the primary key could not be found
	*/
	public ViPham[] findByPTID_PrevAndNext(long id, long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator)
		throws NoSuchViPhamException;

	/**
	* Removes all the vi phams where phuongtien_id = &#63; from the database.
	*
	* @param phuongtien_id the phuongtien_id
	*/
	public void removeByPTID(long phuongtien_id);

	/**
	* Returns the number of vi phams where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @return the number of matching vi phams
	*/
	public int countByPTID(long phuongtien_id);

	/**
	* Caches the vi pham in the entity cache if it is enabled.
	*
	* @param viPham the vi pham
	*/
	public void cacheResult(ViPham viPham);

	/**
	* Caches the vi phams in the entity cache if it is enabled.
	*
	* @param viPhams the vi phams
	*/
	public void cacheResult(java.util.List<ViPham> viPhams);

	/**
	* Creates a new vi pham with the primary key. Does not add the vi pham to the database.
	*
	* @param id the primary key for the new vi pham
	* @return the new vi pham
	*/
	public ViPham create(long id);

	/**
	* Removes the vi pham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vi pham
	* @return the vi pham that was removed
	* @throws NoSuchViPhamException if a vi pham with the primary key could not be found
	*/
	public ViPham remove(long id) throws NoSuchViPhamException;

	public ViPham updateImpl(ViPham viPham);

	/**
	* Returns the vi pham with the primary key or throws a {@link NoSuchViPhamException} if it could not be found.
	*
	* @param id the primary key of the vi pham
	* @return the vi pham
	* @throws NoSuchViPhamException if a vi pham with the primary key could not be found
	*/
	public ViPham findByPrimaryKey(long id) throws NoSuchViPhamException;

	/**
	* Returns the vi pham with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vi pham
	* @return the vi pham, or <code>null</code> if a vi pham with the primary key could not be found
	*/
	public ViPham fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ViPham> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vi phams.
	*
	* @return the vi phams
	*/
	public java.util.List<ViPham> findAll();

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
	public java.util.List<ViPham> findAll(int start, int end);

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
	public java.util.List<ViPham> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator);

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
	public java.util.List<ViPham> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViPham> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vi phams from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vi phams.
	*
	* @return the number of vi phams
	*/
	public int countAll();
}