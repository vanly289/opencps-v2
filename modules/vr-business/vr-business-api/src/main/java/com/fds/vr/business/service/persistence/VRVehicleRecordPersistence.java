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

import com.fds.vr.business.exception.NoSuchVRVehicleRecordException;
import com.fds.vr.business.model.VRVehicleRecord;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr vehicle record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleRecordPersistenceImpl
 * @see VRVehicleRecordUtil
 * @generated
 */
@ProviderType
public interface VRVehicleRecordPersistence extends BasePersistence<VRVehicleRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRVehicleRecordUtil} to access the vr vehicle record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr vehicle record in the entity cache if it is enabled.
	*
	* @param vrVehicleRecord the vr vehicle record
	*/
	public void cacheResult(VRVehicleRecord vrVehicleRecord);

	/**
	* Caches the vr vehicle records in the entity cache if it is enabled.
	*
	* @param vrVehicleRecords the vr vehicle records
	*/
	public void cacheResult(java.util.List<VRVehicleRecord> vrVehicleRecords);

	/**
	* Creates a new vr vehicle record with the primary key. Does not add the vr vehicle record to the database.
	*
	* @param id the primary key for the new vr vehicle record
	* @return the new vr vehicle record
	*/
	public VRVehicleRecord create(long id);

	/**
	* Removes the vr vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record that was removed
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord remove(long id)
		throws NoSuchVRVehicleRecordException;

	public VRVehicleRecord updateImpl(VRVehicleRecord vrVehicleRecord);

	/**
	* Returns the vr vehicle record with the primary key or throws a {@link NoSuchVRVehicleRecordException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord findByPrimaryKey(long id)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the vr vehicle record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record, or <code>null</code> if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRVehicleRecord> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr vehicle records.
	*
	* @return the vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findAll();

	/**
	* Returns a range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle records from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr vehicle records.
	*
	* @return the number of vr vehicle records
	*/
	public int countAll();
}