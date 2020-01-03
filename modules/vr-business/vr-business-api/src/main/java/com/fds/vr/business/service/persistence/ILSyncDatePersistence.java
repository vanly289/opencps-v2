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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.exception.NoSuchILSyncDateException;
import com.fds.vr.business.model.ILSyncDate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the il sync date service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.ILSyncDatePersistenceImpl
 * @see ILSyncDateUtil
 * @generated
 */
@ProviderType
public interface ILSyncDatePersistence extends BasePersistence<ILSyncDate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ILSyncDateUtil} to access the il sync date persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the il sync date in the entity cache if it is enabled.
	*
	* @param ilSyncDate the il sync date
	*/
	public void cacheResult(ILSyncDate ilSyncDate);

	/**
	* Caches the il sync dates in the entity cache if it is enabled.
	*
	* @param ilSyncDates the il sync dates
	*/
	public void cacheResult(java.util.List<ILSyncDate> ilSyncDates);

	/**
	* Creates a new il sync date with the primary key. Does not add the il sync date to the database.
	*
	* @param id the primary key for the new il sync date
	* @return the new il sync date
	*/
	public ILSyncDate create(long id);

	/**
	* Removes the il sync date with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il sync date
	* @return the il sync date that was removed
	* @throws NoSuchILSyncDateException if a il sync date with the primary key could not be found
	*/
	public ILSyncDate remove(long id) throws NoSuchILSyncDateException;

	public ILSyncDate updateImpl(ILSyncDate ilSyncDate);

	/**
	* Returns the il sync date with the primary key or throws a {@link NoSuchILSyncDateException} if it could not be found.
	*
	* @param id the primary key of the il sync date
	* @return the il sync date
	* @throws NoSuchILSyncDateException if a il sync date with the primary key could not be found
	*/
	public ILSyncDate findByPrimaryKey(long id)
		throws NoSuchILSyncDateException;

	/**
	* Returns the il sync date with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il sync date
	* @return the il sync date, or <code>null</code> if a il sync date with the primary key could not be found
	*/
	public ILSyncDate fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ILSyncDate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the il sync dates.
	*
	* @return the il sync dates
	*/
	public java.util.List<ILSyncDate> findAll();

	/**
	* Returns a range of all the il sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il sync dates
	* @param end the upper bound of the range of il sync dates (not inclusive)
	* @return the range of il sync dates
	*/
	public java.util.List<ILSyncDate> findAll(int start, int end);

	/**
	* Returns an ordered range of all the il sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il sync dates
	* @param end the upper bound of the range of il sync dates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of il sync dates
	*/
	public java.util.List<ILSyncDate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILSyncDate> orderByComparator);

	/**
	* Returns an ordered range of all the il sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il sync dates
	* @param end the upper bound of the range of il sync dates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of il sync dates
	*/
	public java.util.List<ILSyncDate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILSyncDate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the il sync dates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of il sync dates.
	*
	* @return the number of il sync dates
	*/
	public int countAll();
}