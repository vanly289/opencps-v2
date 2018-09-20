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

import com.backend.migrate.vr.exception.NoSuchILPhuongTienException;
import com.backend.migrate.vr.model.ILPhuongTien;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the il phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.ILPhuongTienPersistenceImpl
 * @see ILPhuongTienUtil
 * @generated
 */
@ProviderType
public interface ILPhuongTienPersistence extends BasePersistence<ILPhuongTien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ILPhuongTienUtil} to access the il phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the il phuong tiens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching il phuong tiens
	*/
	public java.util.List<ILPhuongTien> findByUuid(java.lang.String uuid);

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
	public java.util.List<ILPhuongTien> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<ILPhuongTien> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator);

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
	public java.util.List<ILPhuongTien> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il phuong tien
	* @throws NoSuchILPhuongTienException if a matching il phuong tien could not be found
	*/
	public ILPhuongTien findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator)
		throws NoSuchILPhuongTienException;

	/**
	* Returns the first il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il phuong tien, or <code>null</code> if a matching il phuong tien could not be found
	*/
	public ILPhuongTien fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator);

	/**
	* Returns the last il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il phuong tien
	* @throws NoSuchILPhuongTienException if a matching il phuong tien could not be found
	*/
	public ILPhuongTien findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator)
		throws NoSuchILPhuongTienException;

	/**
	* Returns the last il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il phuong tien, or <code>null</code> if a matching il phuong tien could not be found
	*/
	public ILPhuongTien fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator);

	/**
	* Returns the il phuong tiens before and after the current il phuong tien in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current il phuong tien
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next il phuong tien
	* @throws NoSuchILPhuongTienException if a il phuong tien with the primary key could not be found
	*/
	public ILPhuongTien[] findByUuid_PrevAndNext(long id,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator)
		throws NoSuchILPhuongTienException;

	/**
	* Removes all the il phuong tiens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of il phuong tiens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching il phuong tiens
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the il phuong tiens where id &ge; &#63;.
	*
	* @param id the ID
	* @return the matching il phuong tiens
	*/
	public java.util.List<ILPhuongTien> findByGT_ID(long id);

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
	public java.util.List<ILPhuongTien> findByGT_ID(long id, int start, int end);

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
	public java.util.List<ILPhuongTien> findByGT_ID(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator);

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
	public java.util.List<ILPhuongTien> findByGT_ID(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first il phuong tien in the ordered set where id &ge; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il phuong tien
	* @throws NoSuchILPhuongTienException if a matching il phuong tien could not be found
	*/
	public ILPhuongTien findByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator)
		throws NoSuchILPhuongTienException;

	/**
	* Returns the first il phuong tien in the ordered set where id &ge; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il phuong tien, or <code>null</code> if a matching il phuong tien could not be found
	*/
	public ILPhuongTien fetchByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator);

	/**
	* Returns the last il phuong tien in the ordered set where id &ge; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il phuong tien
	* @throws NoSuchILPhuongTienException if a matching il phuong tien could not be found
	*/
	public ILPhuongTien findByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator)
		throws NoSuchILPhuongTienException;

	/**
	* Returns the last il phuong tien in the ordered set where id &ge; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il phuong tien, or <code>null</code> if a matching il phuong tien could not be found
	*/
	public ILPhuongTien fetchByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator);

	/**
	* Removes all the il phuong tiens where id &ge; &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByGT_ID(long id);

	/**
	* Returns the number of il phuong tiens where id &ge; &#63;.
	*
	* @param id the ID
	* @return the number of matching il phuong tiens
	*/
	public int countByGT_ID(long id);

	/**
	* Caches the il phuong tien in the entity cache if it is enabled.
	*
	* @param ilPhuongTien the il phuong tien
	*/
	public void cacheResult(ILPhuongTien ilPhuongTien);

	/**
	* Caches the il phuong tiens in the entity cache if it is enabled.
	*
	* @param ilPhuongTiens the il phuong tiens
	*/
	public void cacheResult(java.util.List<ILPhuongTien> ilPhuongTiens);

	/**
	* Creates a new il phuong tien with the primary key. Does not add the il phuong tien to the database.
	*
	* @param id the primary key for the new il phuong tien
	* @return the new il phuong tien
	*/
	public ILPhuongTien create(long id);

	/**
	* Removes the il phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien that was removed
	* @throws NoSuchILPhuongTienException if a il phuong tien with the primary key could not be found
	*/
	public ILPhuongTien remove(long id) throws NoSuchILPhuongTienException;

	public ILPhuongTien updateImpl(ILPhuongTien ilPhuongTien);

	/**
	* Returns the il phuong tien with the primary key or throws a {@link NoSuchILPhuongTienException} if it could not be found.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien
	* @throws NoSuchILPhuongTienException if a il phuong tien with the primary key could not be found
	*/
	public ILPhuongTien findByPrimaryKey(long id)
		throws NoSuchILPhuongTienException;

	/**
	* Returns the il phuong tien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien, or <code>null</code> if a il phuong tien with the primary key could not be found
	*/
	public ILPhuongTien fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ILPhuongTien> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the il phuong tiens.
	*
	* @return the il phuong tiens
	*/
	public java.util.List<ILPhuongTien> findAll();

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
	public java.util.List<ILPhuongTien> findAll(int start, int end);

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
	public java.util.List<ILPhuongTien> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator);

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
	public java.util.List<ILPhuongTien> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILPhuongTien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the il phuong tiens from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of il phuong tiens.
	*
	* @return the number of il phuong tiens
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}