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

import com.fds.vr.business.exception.NoSuchILVehicleException;
import com.fds.vr.business.model.ILVehicle;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the il vehicle service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.ILVehiclePersistenceImpl
 * @see ILVehicleUtil
 * @generated
 */
@ProviderType
public interface ILVehiclePersistence extends BasePersistence<ILVehicle> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ILVehicleUtil} to access the il vehicle persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the il vehicles where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @return the matching il vehicles
	*/
	public java.util.List<ILVehicle> findByF_ISSU_NO(
		java.lang.String issuingDispatchNo);

	/**
	* Returns a range of all the il vehicles where issuingDispatchNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @return the range of matching il vehicles
	*/
	public java.util.List<ILVehicle> findByF_ISSU_NO(
		java.lang.String issuingDispatchNo, int start, int end);

	/**
	* Returns an ordered range of all the il vehicles where issuingDispatchNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching il vehicles
	*/
	public java.util.List<ILVehicle> findByF_ISSU_NO(
		java.lang.String issuingDispatchNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator);

	/**
	* Returns an ordered range of all the il vehicles where issuingDispatchNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching il vehicles
	*/
	public java.util.List<ILVehicle> findByF_ISSU_NO(
		java.lang.String issuingDispatchNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il vehicle
	* @throws NoSuchILVehicleException if a matching il vehicle could not be found
	*/
	public ILVehicle findByF_ISSU_NO_First(java.lang.String issuingDispatchNo,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator)
		throws NoSuchILVehicleException;

	/**
	* Returns the first il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il vehicle, or <code>null</code> if a matching il vehicle could not be found
	*/
	public ILVehicle fetchByF_ISSU_NO_First(
		java.lang.String issuingDispatchNo,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator);

	/**
	* Returns the last il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il vehicle
	* @throws NoSuchILVehicleException if a matching il vehicle could not be found
	*/
	public ILVehicle findByF_ISSU_NO_Last(java.lang.String issuingDispatchNo,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator)
		throws NoSuchILVehicleException;

	/**
	* Returns the last il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il vehicle, or <code>null</code> if a matching il vehicle could not be found
	*/
	public ILVehicle fetchByF_ISSU_NO_Last(java.lang.String issuingDispatchNo,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator);

	/**
	* Returns the il vehicles before and after the current il vehicle in the ordered set where issuingDispatchNo = &#63;.
	*
	* @param id the primary key of the current il vehicle
	* @param issuingDispatchNo the issuing dispatch no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next il vehicle
	* @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	*/
	public ILVehicle[] findByF_ISSU_NO_PrevAndNext(long id,
		java.lang.String issuingDispatchNo,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator)
		throws NoSuchILVehicleException;

	/**
	* Removes all the il vehicles where issuingDispatchNo = &#63; from the database.
	*
	* @param issuingDispatchNo the issuing dispatch no
	*/
	public void removeByF_ISSU_NO(java.lang.String issuingDispatchNo);

	/**
	* Returns the number of il vehicles where issuingDispatchNo = &#63;.
	*
	* @param issuingDispatchNo the issuing dispatch no
	* @return the number of matching il vehicles
	*/
	public int countByF_ISSU_NO(java.lang.String issuingDispatchNo);

	/**
	* Caches the il vehicle in the entity cache if it is enabled.
	*
	* @param ilVehicle the il vehicle
	*/
	public void cacheResult(ILVehicle ilVehicle);

	/**
	* Caches the il vehicles in the entity cache if it is enabled.
	*
	* @param ilVehicles the il vehicles
	*/
	public void cacheResult(java.util.List<ILVehicle> ilVehicles);

	/**
	* Creates a new il vehicle with the primary key. Does not add the il vehicle to the database.
	*
	* @param id the primary key for the new il vehicle
	* @return the new il vehicle
	*/
	public ILVehicle create(long id);

	/**
	* Removes the il vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il vehicle
	* @return the il vehicle that was removed
	* @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	*/
	public ILVehicle remove(long id) throws NoSuchILVehicleException;

	public ILVehicle updateImpl(ILVehicle ilVehicle);

	/**
	* Returns the il vehicle with the primary key or throws a {@link NoSuchILVehicleException} if it could not be found.
	*
	* @param id the primary key of the il vehicle
	* @return the il vehicle
	* @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	*/
	public ILVehicle findByPrimaryKey(long id) throws NoSuchILVehicleException;

	/**
	* Returns the il vehicle with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il vehicle
	* @return the il vehicle, or <code>null</code> if a il vehicle with the primary key could not be found
	*/
	public ILVehicle fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ILVehicle> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the il vehicles.
	*
	* @return the il vehicles
	*/
	public java.util.List<ILVehicle> findAll();

	/**
	* Returns a range of all the il vehicles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @return the range of il vehicles
	*/
	public java.util.List<ILVehicle> findAll(int start, int end);

	/**
	* Returns an ordered range of all the il vehicles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of il vehicles
	*/
	public java.util.List<ILVehicle> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator);

	/**
	* Returns an ordered range of all the il vehicles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of il vehicles
	*/
	public java.util.List<ILVehicle> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILVehicle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the il vehicles from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of il vehicles.
	*
	* @return the number of il vehicles
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}