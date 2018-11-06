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

import com.backend.migrate.vr.exception.NoSuchSRCILHopDongThueException;
import com.backend.migrate.vr.model.SRCILHopDongThue;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the srcil hop dong thue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.backend.migrate.vr.service.persistence.impl.SRCILHopDongThuePersistenceImpl
 * @see SRCILHopDongThueUtil
 * @generated
 */
@ProviderType
public interface SRCILHopDongThuePersistence extends BasePersistence<SRCILHopDongThue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SRCILHopDongThueUtil} to access the srcil hop dong thue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the srcil hop dong thues where id &gt; &#63;.
	*
	* @param id the ID
	* @return the matching srcil hop dong thues
	*/
	public java.util.List<SRCILHopDongThue> findByGT_ID(long id);

	/**
	* Returns a range of all the srcil hop dong thues where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of srcil hop dong thues
	* @param end the upper bound of the range of srcil hop dong thues (not inclusive)
	* @return the range of matching srcil hop dong thues
	*/
	public java.util.List<SRCILHopDongThue> findByGT_ID(long id, int start,
		int end);

	/**
	* Returns an ordered range of all the srcil hop dong thues where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of srcil hop dong thues
	* @param end the upper bound of the range of srcil hop dong thues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching srcil hop dong thues
	*/
	public java.util.List<SRCILHopDongThue> findByGT_ID(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCILHopDongThue> orderByComparator);

	/**
	* Returns an ordered range of all the srcil hop dong thues where id &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of srcil hop dong thues
	* @param end the upper bound of the range of srcil hop dong thues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching srcil hop dong thues
	*/
	public java.util.List<SRCILHopDongThue> findByGT_ID(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCILHopDongThue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first srcil hop dong thue in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching srcil hop dong thue
	* @throws NoSuchSRCILHopDongThueException if a matching srcil hop dong thue could not be found
	*/
	public SRCILHopDongThue findByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCILHopDongThue> orderByComparator)
		throws NoSuchSRCILHopDongThueException;

	/**
	* Returns the first srcil hop dong thue in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching srcil hop dong thue, or <code>null</code> if a matching srcil hop dong thue could not be found
	*/
	public SRCILHopDongThue fetchByGT_ID_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCILHopDongThue> orderByComparator);

	/**
	* Returns the last srcil hop dong thue in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching srcil hop dong thue
	* @throws NoSuchSRCILHopDongThueException if a matching srcil hop dong thue could not be found
	*/
	public SRCILHopDongThue findByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCILHopDongThue> orderByComparator)
		throws NoSuchSRCILHopDongThueException;

	/**
	* Returns the last srcil hop dong thue in the ordered set where id &gt; &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching srcil hop dong thue, or <code>null</code> if a matching srcil hop dong thue could not be found
	*/
	public SRCILHopDongThue fetchByGT_ID_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<SRCILHopDongThue> orderByComparator);

	/**
	* Removes all the srcil hop dong thues where id &gt; &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByGT_ID(long id);

	/**
	* Returns the number of srcil hop dong thues where id &gt; &#63;.
	*
	* @param id the ID
	* @return the number of matching srcil hop dong thues
	*/
	public int countByGT_ID(long id);

	/**
	* Caches the srcil hop dong thue in the entity cache if it is enabled.
	*
	* @param srcilHopDongThue the srcil hop dong thue
	*/
	public void cacheResult(SRCILHopDongThue srcilHopDongThue);

	/**
	* Caches the srcil hop dong thues in the entity cache if it is enabled.
	*
	* @param srcilHopDongThues the srcil hop dong thues
	*/
	public void cacheResult(java.util.List<SRCILHopDongThue> srcilHopDongThues);

	/**
	* Creates a new srcil hop dong thue with the primary key. Does not add the srcil hop dong thue to the database.
	*
	* @param id the primary key for the new srcil hop dong thue
	* @return the new srcil hop dong thue
	*/
	public SRCILHopDongThue create(long id);

	/**
	* Removes the srcil hop dong thue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the srcil hop dong thue
	* @return the srcil hop dong thue that was removed
	* @throws NoSuchSRCILHopDongThueException if a srcil hop dong thue with the primary key could not be found
	*/
	public SRCILHopDongThue remove(long id)
		throws NoSuchSRCILHopDongThueException;

	public SRCILHopDongThue updateImpl(SRCILHopDongThue srcilHopDongThue);

	/**
	* Returns the srcil hop dong thue with the primary key or throws a {@link NoSuchSRCILHopDongThueException} if it could not be found.
	*
	* @param id the primary key of the srcil hop dong thue
	* @return the srcil hop dong thue
	* @throws NoSuchSRCILHopDongThueException if a srcil hop dong thue with the primary key could not be found
	*/
	public SRCILHopDongThue findByPrimaryKey(long id)
		throws NoSuchSRCILHopDongThueException;

	/**
	* Returns the srcil hop dong thue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the srcil hop dong thue
	* @return the srcil hop dong thue, or <code>null</code> if a srcil hop dong thue with the primary key could not be found
	*/
	public SRCILHopDongThue fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, SRCILHopDongThue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the srcil hop dong thues.
	*
	* @return the srcil hop dong thues
	*/
	public java.util.List<SRCILHopDongThue> findAll();

	/**
	* Returns a range of all the srcil hop dong thues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of srcil hop dong thues
	* @param end the upper bound of the range of srcil hop dong thues (not inclusive)
	* @return the range of srcil hop dong thues
	*/
	public java.util.List<SRCILHopDongThue> findAll(int start, int end);

	/**
	* Returns an ordered range of all the srcil hop dong thues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of srcil hop dong thues
	* @param end the upper bound of the range of srcil hop dong thues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of srcil hop dong thues
	*/
	public java.util.List<SRCILHopDongThue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCILHopDongThue> orderByComparator);

	/**
	* Returns an ordered range of all the srcil hop dong thues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of srcil hop dong thues
	* @param end the upper bound of the range of srcil hop dong thues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of srcil hop dong thues
	*/
	public java.util.List<SRCILHopDongThue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SRCILHopDongThue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the srcil hop dong thues from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of srcil hop dong thues.
	*
	* @return the number of srcil hop dong thues
	*/
	public int countAll();
}