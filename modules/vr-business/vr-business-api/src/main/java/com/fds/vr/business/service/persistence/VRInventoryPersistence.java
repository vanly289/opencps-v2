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

import com.fds.vr.business.exception.NoSuchVRInventoryException;
import com.fds.vr.business.model.VRInventory;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRInventoryPersistenceImpl
 * @see VRInventoryUtil
 * @generated
 */
@ProviderType
public interface VRInventoryPersistence extends BasePersistence<VRInventory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInventoryUtil} to access the vr inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr inventory in the entity cache if it is enabled.
	*
	* @param vrInventory the vr inventory
	*/
	public void cacheResult(VRInventory vrInventory);

	/**
	* Caches the vr inventories in the entity cache if it is enabled.
	*
	* @param vrInventories the vr inventories
	*/
	public void cacheResult(java.util.List<VRInventory> vrInventories);

	/**
	* Creates a new vr inventory with the primary key. Does not add the vr inventory to the database.
	*
	* @param id the primary key for the new vr inventory
	* @return the new vr inventory
	*/
	public VRInventory create(long id);

	/**
	* Removes the vr inventory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory that was removed
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public VRInventory remove(long id) throws NoSuchVRInventoryException;

	public VRInventory updateImpl(VRInventory vrInventory);

	/**
	* Returns the vr inventory with the primary key or throws a {@link NoSuchVRInventoryException} if it could not be found.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public VRInventory findByPrimaryKey(long id)
		throws NoSuchVRInventoryException;

	/**
	* Returns the vr inventory with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory, or <code>null</code> if a vr inventory with the primary key could not be found
	*/
	public VRInventory fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRInventory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr inventories.
	*
	* @return the vr inventories
	*/
	public java.util.List<VRInventory> findAll();

	/**
	* Returns a range of all the vr inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of vr inventories
	*/
	public java.util.List<VRInventory> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr inventories
	*/
	public java.util.List<VRInventory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

	/**
	* Returns an ordered range of all the vr inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr inventories
	*/
	public java.util.List<VRInventory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr inventories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr inventories.
	*
	* @return the number of vr inventories
	*/
	public int countAll();
}