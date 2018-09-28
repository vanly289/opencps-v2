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

import com.backend.migrate.vr.exception.NoSuchPhuHieuBienHieuException;
import com.backend.migrate.vr.model.PhuHieuBienHieu;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the phu hieu bien hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.PhuHieuBienHieuPersistenceImpl
 * @see PhuHieuBienHieuUtil
 * @generated
 */
@ProviderType
public interface PhuHieuBienHieuPersistence extends BasePersistence<PhuHieuBienHieu> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PhuHieuBienHieuUtil} to access the phu hieu bien hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the phu hieu bien hieus where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @return the matching phu hieu bien hieus
	*/
	public java.util.List<PhuHieuBienHieu> findByPTID(long phuongtien_id);

	/**
	* Returns a range of all the phu hieu bien hieus where phuongtien_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phuongtien_id the phuongtien_id
	* @param start the lower bound of the range of phu hieu bien hieus
	* @param end the upper bound of the range of phu hieu bien hieus (not inclusive)
	* @return the range of matching phu hieu bien hieus
	*/
	public java.util.List<PhuHieuBienHieu> findByPTID(long phuongtien_id,
		int start, int end);

	/**
	* Returns an ordered range of all the phu hieu bien hieus where phuongtien_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phuongtien_id the phuongtien_id
	* @param start the lower bound of the range of phu hieu bien hieus
	* @param end the upper bound of the range of phu hieu bien hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching phu hieu bien hieus
	*/
	public java.util.List<PhuHieuBienHieu> findByPTID(long phuongtien_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator);

	/**
	* Returns an ordered range of all the phu hieu bien hieus where phuongtien_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phuongtien_id the phuongtien_id
	* @param start the lower bound of the range of phu hieu bien hieus
	* @param end the upper bound of the range of phu hieu bien hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching phu hieu bien hieus
	*/
	public java.util.List<PhuHieuBienHieu> findByPTID(long phuongtien_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first phu hieu bien hieu in the ordered set where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching phu hieu bien hieu
	* @throws NoSuchPhuHieuBienHieuException if a matching phu hieu bien hieu could not be found
	*/
	public PhuHieuBienHieu findByPTID_First(long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator)
		throws NoSuchPhuHieuBienHieuException;

	/**
	* Returns the first phu hieu bien hieu in the ordered set where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching phu hieu bien hieu, or <code>null</code> if a matching phu hieu bien hieu could not be found
	*/
	public PhuHieuBienHieu fetchByPTID_First(long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator);

	/**
	* Returns the last phu hieu bien hieu in the ordered set where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching phu hieu bien hieu
	* @throws NoSuchPhuHieuBienHieuException if a matching phu hieu bien hieu could not be found
	*/
	public PhuHieuBienHieu findByPTID_Last(long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator)
		throws NoSuchPhuHieuBienHieuException;

	/**
	* Returns the last phu hieu bien hieu in the ordered set where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching phu hieu bien hieu, or <code>null</code> if a matching phu hieu bien hieu could not be found
	*/
	public PhuHieuBienHieu fetchByPTID_Last(long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator);

	/**
	* Returns the phu hieu bien hieus before and after the current phu hieu bien hieu in the ordered set where phuongtien_id = &#63;.
	*
	* @param id the primary key of the current phu hieu bien hieu
	* @param phuongtien_id the phuongtien_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next phu hieu bien hieu
	* @throws NoSuchPhuHieuBienHieuException if a phu hieu bien hieu with the primary key could not be found
	*/
	public PhuHieuBienHieu[] findByPTID_PrevAndNext(long id,
		long phuongtien_id,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator)
		throws NoSuchPhuHieuBienHieuException;

	/**
	* Removes all the phu hieu bien hieus where phuongtien_id = &#63; from the database.
	*
	* @param phuongtien_id the phuongtien_id
	*/
	public void removeByPTID(long phuongtien_id);

	/**
	* Returns the number of phu hieu bien hieus where phuongtien_id = &#63;.
	*
	* @param phuongtien_id the phuongtien_id
	* @return the number of matching phu hieu bien hieus
	*/
	public int countByPTID(long phuongtien_id);

	/**
	* Caches the phu hieu bien hieu in the entity cache if it is enabled.
	*
	* @param phuHieuBienHieu the phu hieu bien hieu
	*/
	public void cacheResult(PhuHieuBienHieu phuHieuBienHieu);

	/**
	* Caches the phu hieu bien hieus in the entity cache if it is enabled.
	*
	* @param phuHieuBienHieus the phu hieu bien hieus
	*/
	public void cacheResult(java.util.List<PhuHieuBienHieu> phuHieuBienHieus);

	/**
	* Creates a new phu hieu bien hieu with the primary key. Does not add the phu hieu bien hieu to the database.
	*
	* @param id the primary key for the new phu hieu bien hieu
	* @return the new phu hieu bien hieu
	*/
	public PhuHieuBienHieu create(long id);

	/**
	* Removes the phu hieu bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phu hieu bien hieu
	* @return the phu hieu bien hieu that was removed
	* @throws NoSuchPhuHieuBienHieuException if a phu hieu bien hieu with the primary key could not be found
	*/
	public PhuHieuBienHieu remove(long id)
		throws NoSuchPhuHieuBienHieuException;

	public PhuHieuBienHieu updateImpl(PhuHieuBienHieu phuHieuBienHieu);

	/**
	* Returns the phu hieu bien hieu with the primary key or throws a {@link NoSuchPhuHieuBienHieuException} if it could not be found.
	*
	* @param id the primary key of the phu hieu bien hieu
	* @return the phu hieu bien hieu
	* @throws NoSuchPhuHieuBienHieuException if a phu hieu bien hieu with the primary key could not be found
	*/
	public PhuHieuBienHieu findByPrimaryKey(long id)
		throws NoSuchPhuHieuBienHieuException;

	/**
	* Returns the phu hieu bien hieu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the phu hieu bien hieu
	* @return the phu hieu bien hieu, or <code>null</code> if a phu hieu bien hieu with the primary key could not be found
	*/
	public PhuHieuBienHieu fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, PhuHieuBienHieu> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the phu hieu bien hieus.
	*
	* @return the phu hieu bien hieus
	*/
	public java.util.List<PhuHieuBienHieu> findAll();

	/**
	* Returns a range of all the phu hieu bien hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phu hieu bien hieus
	* @param end the upper bound of the range of phu hieu bien hieus (not inclusive)
	* @return the range of phu hieu bien hieus
	*/
	public java.util.List<PhuHieuBienHieu> findAll(int start, int end);

	/**
	* Returns an ordered range of all the phu hieu bien hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phu hieu bien hieus
	* @param end the upper bound of the range of phu hieu bien hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phu hieu bien hieus
	*/
	public java.util.List<PhuHieuBienHieu> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator);

	/**
	* Returns an ordered range of all the phu hieu bien hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phu hieu bien hieus
	* @param end the upper bound of the range of phu hieu bien hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of phu hieu bien hieus
	*/
	public java.util.List<PhuHieuBienHieu> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PhuHieuBienHieu> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the phu hieu bien hieus from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of phu hieu bien hieus.
	*
	* @return the number of phu hieu bien hieus
	*/
	public int countAll();
}