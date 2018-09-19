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

import com.backend.migrate.vr.exception.NoSuchPhuongTienException;
import com.backend.migrate.vr.model.PhuongTien;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.PhuongTienPersistenceImpl
 * @see PhuongTienUtil
 * @generated
 */
@ProviderType
public interface PhuongTienPersistence extends BasePersistence<PhuongTien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PhuongTienUtil} to access the phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the phuong tiens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching phuong tiens
	*/
	public java.util.List<PhuongTien> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the phuong tiens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of phuong tiens
	* @param end the upper bound of the range of phuong tiens (not inclusive)
	* @return the range of matching phuong tiens
	*/
	public java.util.List<PhuongTien> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the phuong tiens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of phuong tiens
	* @param end the upper bound of the range of phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching phuong tiens
	*/
	public java.util.List<PhuongTien> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator);

	/**
	* Returns an ordered range of all the phuong tiens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of phuong tiens
	* @param end the upper bound of the range of phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching phuong tiens
	*/
	public java.util.List<PhuongTien> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching phuong tien
	* @throws NoSuchPhuongTienException if a matching phuong tien could not be found
	*/
	public PhuongTien findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator)
		throws NoSuchPhuongTienException;

	/**
	* Returns the first phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching phuong tien, or <code>null</code> if a matching phuong tien could not be found
	*/
	public PhuongTien fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator);

	/**
	* Returns the last phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching phuong tien
	* @throws NoSuchPhuongTienException if a matching phuong tien could not be found
	*/
	public PhuongTien findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator)
		throws NoSuchPhuongTienException;

	/**
	* Returns the last phuong tien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching phuong tien, or <code>null</code> if a matching phuong tien could not be found
	*/
	public PhuongTien fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator);

	/**
	* Returns the phuong tiens before and after the current phuong tien in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current phuong tien
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next phuong tien
	* @throws NoSuchPhuongTienException if a phuong tien with the primary key could not be found
	*/
	public PhuongTien[] findByUuid_PrevAndNext(long id, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator)
		throws NoSuchPhuongTienException;

	/**
	* Removes all the phuong tiens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of phuong tiens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching phuong tiens
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Caches the phuong tien in the entity cache if it is enabled.
	*
	* @param phuongTien the phuong tien
	*/
	public void cacheResult(PhuongTien phuongTien);

	/**
	* Caches the phuong tiens in the entity cache if it is enabled.
	*
	* @param phuongTiens the phuong tiens
	*/
	public void cacheResult(java.util.List<PhuongTien> phuongTiens);

	/**
	* Creates a new phuong tien with the primary key. Does not add the phuong tien to the database.
	*
	* @param id the primary key for the new phuong tien
	* @return the new phuong tien
	*/
	public PhuongTien create(long id);

	/**
	* Removes the phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien that was removed
	* @throws NoSuchPhuongTienException if a phuong tien with the primary key could not be found
	*/
	public PhuongTien remove(long id) throws NoSuchPhuongTienException;

	public PhuongTien updateImpl(PhuongTien phuongTien);

	/**
	* Returns the phuong tien with the primary key or throws a {@link NoSuchPhuongTienException} if it could not be found.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien
	* @throws NoSuchPhuongTienException if a phuong tien with the primary key could not be found
	*/
	public PhuongTien findByPrimaryKey(long id)
		throws NoSuchPhuongTienException;

	/**
	* Returns the phuong tien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien, or <code>null</code> if a phuong tien with the primary key could not be found
	*/
	public PhuongTien fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, PhuongTien> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the phuong tiens.
	*
	* @return the phuong tiens
	*/
	public java.util.List<PhuongTien> findAll();

	/**
	* Returns a range of all the phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phuong tiens
	* @param end the upper bound of the range of phuong tiens (not inclusive)
	* @return the range of phuong tiens
	*/
	public java.util.List<PhuongTien> findAll(int start, int end);

	/**
	* Returns an ordered range of all the phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phuong tiens
	* @param end the upper bound of the range of phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phuong tiens
	*/
	public java.util.List<PhuongTien> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator);

	/**
	* Returns an ordered range of all the phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phuong tiens
	* @param end the upper bound of the range of phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of phuong tiens
	*/
	public java.util.List<PhuongTien> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PhuongTien> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the phuong tiens from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of phuong tiens.
	*
	* @return the number of phuong tiens
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}