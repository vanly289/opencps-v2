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

import com.fds.vr.business.exception.NoSuchVRProductionPlantException;
import com.fds.vr.business.model.VRProductionPlant;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr production plant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantPersistenceImpl
 * @see VRProductionPlantUtil
 * @generated
 */
@ProviderType
public interface VRProductionPlantPersistence extends BasePersistence<VRProductionPlant> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductionPlantUtil} to access the vr production plant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr production plant in the entity cache if it is enabled.
	*
	* @param vrProductionPlant the vr production plant
	*/
	public void cacheResult(VRProductionPlant vrProductionPlant);

	/**
	* Caches the vr production plants in the entity cache if it is enabled.
	*
	* @param vrProductionPlants the vr production plants
	*/
	public void cacheResult(
		java.util.List<VRProductionPlant> vrProductionPlants);

	/**
	* Creates a new vr production plant with the primary key. Does not add the vr production plant to the database.
	*
	* @param id the primary key for the new vr production plant
	* @return the new vr production plant
	*/
	public VRProductionPlant create(long id);

	/**
	* Removes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant that was removed
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public VRProductionPlant remove(long id)
		throws NoSuchVRProductionPlantException;

	public VRProductionPlant updateImpl(VRProductionPlant vrProductionPlant);

	/**
	* Returns the vr production plant with the primary key or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public VRProductionPlant findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the vr production plant with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant, or <code>null</code> if a vr production plant with the primary key could not be found
	*/
	public VRProductionPlant fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductionPlant> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr production plants.
	*
	* @return the vr production plants
	*/
	public java.util.List<VRProductionPlant> findAll();

	/**
	* Returns a range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of vr production plants
	*/
	public java.util.List<VRProductionPlant> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plants
	*/
	public java.util.List<VRProductionPlant> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plants
	*/
	public java.util.List<VRProductionPlant> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr production plants from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr production plants.
	*
	* @return the number of vr production plants
	*/
	public int countAll();
}