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

import com.fds.vr.business.exception.NoSuchILVehicleCustomsBorderGuardException;
import com.fds.vr.business.model.ILVehicleCustomsBorderGuard;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the il vehicle customs border guard service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.ILVehicleCustomsBorderGuardPersistenceImpl
 * @see ILVehicleCustomsBorderGuardUtil
 * @generated
 */
@ProviderType
public interface ILVehicleCustomsBorderGuardPersistence extends BasePersistence<ILVehicleCustomsBorderGuard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ILVehicleCustomsBorderGuardUtil} to access the il vehicle customs border guard persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the il vehicle customs border guards where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @return the matching il vehicle customs border guards
	*/
	public java.util.List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		java.lang.String registrationNumber);

	/**
	* Returns a range of all the il vehicle customs border guards where registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @return the range of matching il vehicle customs border guards
	*/
	public java.util.List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		java.lang.String registrationNumber, int start, int end);

	/**
	* Returns an ordered range of all the il vehicle customs border guards where registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching il vehicle customs border guards
	*/
	public java.util.List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		java.lang.String registrationNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator);

	/**
	* Returns an ordered range of all the il vehicle customs border guards where registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching il vehicle customs border guards
	*/
	public java.util.List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		java.lang.String registrationNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il vehicle customs border guard
	* @throws NoSuchILVehicleCustomsBorderGuardException if a matching il vehicle customs border guard could not be found
	*/
	public ILVehicleCustomsBorderGuard findByF_REG_NUMBER_First(
		java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws NoSuchILVehicleCustomsBorderGuardException;

	/**
	* Returns the first il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il vehicle customs border guard, or <code>null</code> if a matching il vehicle customs border guard could not be found
	*/
	public ILVehicleCustomsBorderGuard fetchByF_REG_NUMBER_First(
		java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator);

	/**
	* Returns the last il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il vehicle customs border guard
	* @throws NoSuchILVehicleCustomsBorderGuardException if a matching il vehicle customs border guard could not be found
	*/
	public ILVehicleCustomsBorderGuard findByF_REG_NUMBER_Last(
		java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws NoSuchILVehicleCustomsBorderGuardException;

	/**
	* Returns the last il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il vehicle customs border guard, or <code>null</code> if a matching il vehicle customs border guard could not be found
	*/
	public ILVehicleCustomsBorderGuard fetchByF_REG_NUMBER_Last(
		java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator);

	/**
	* Returns the il vehicle customs border guards before and after the current il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	*
	* @param id the primary key of the current il vehicle customs border guard
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next il vehicle customs border guard
	* @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	*/
	public ILVehicleCustomsBorderGuard[] findByF_REG_NUMBER_PrevAndNext(
		long id, java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws NoSuchILVehicleCustomsBorderGuardException;

	/**
	* Removes all the il vehicle customs border guards where registrationNumber = &#63; from the database.
	*
	* @param registrationNumber the registration number
	*/
	public void removeByF_REG_NUMBER(java.lang.String registrationNumber);

	/**
	* Returns the number of il vehicle customs border guards where registrationNumber = &#63;.
	*
	* @param registrationNumber the registration number
	* @return the number of matching il vehicle customs border guards
	*/
	public int countByF_REG_NUMBER(java.lang.String registrationNumber);

	/**
	* Caches the il vehicle customs border guard in the entity cache if it is enabled.
	*
	* @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	*/
	public void cacheResult(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard);

	/**
	* Caches the il vehicle customs border guards in the entity cache if it is enabled.
	*
	* @param ilVehicleCustomsBorderGuards the il vehicle customs border guards
	*/
	public void cacheResult(
		java.util.List<ILVehicleCustomsBorderGuard> ilVehicleCustomsBorderGuards);

	/**
	* Creates a new il vehicle customs border guard with the primary key. Does not add the il vehicle customs border guard to the database.
	*
	* @param id the primary key for the new il vehicle customs border guard
	* @return the new il vehicle customs border guard
	*/
	public ILVehicleCustomsBorderGuard create(long id);

	/**
	* Removes the il vehicle customs border guard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard that was removed
	* @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	*/
	public ILVehicleCustomsBorderGuard remove(long id)
		throws NoSuchILVehicleCustomsBorderGuardException;

	public ILVehicleCustomsBorderGuard updateImpl(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard);

	/**
	* Returns the il vehicle customs border guard with the primary key or throws a {@link NoSuchILVehicleCustomsBorderGuardException} if it could not be found.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard
	* @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	*/
	public ILVehicleCustomsBorderGuard findByPrimaryKey(long id)
		throws NoSuchILVehicleCustomsBorderGuardException;

	/**
	* Returns the il vehicle customs border guard with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard, or <code>null</code> if a il vehicle customs border guard with the primary key could not be found
	*/
	public ILVehicleCustomsBorderGuard fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ILVehicleCustomsBorderGuard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the il vehicle customs border guards.
	*
	* @return the il vehicle customs border guards
	*/
	public java.util.List<ILVehicleCustomsBorderGuard> findAll();

	/**
	* Returns a range of all the il vehicle customs border guards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @return the range of il vehicle customs border guards
	*/
	public java.util.List<ILVehicleCustomsBorderGuard> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the il vehicle customs border guards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of il vehicle customs border guards
	*/
	public java.util.List<ILVehicleCustomsBorderGuard> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator);

	/**
	* Returns an ordered range of all the il vehicle customs border guards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of il vehicle customs border guards
	*/
	public java.util.List<ILVehicleCustomsBorderGuard> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the il vehicle customs border guards from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of il vehicle customs border guards.
	*
	* @return the number of il vehicle customs border guards
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}