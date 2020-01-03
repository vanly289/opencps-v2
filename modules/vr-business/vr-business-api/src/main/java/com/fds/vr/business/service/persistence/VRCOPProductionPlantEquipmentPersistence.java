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

import com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEquipmentException;
import com.fds.vr.business.model.VRCOPProductionPlantEquipment;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop production plant equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCOPProductionPlantEquipmentPersistenceImpl
 * @see VRCOPProductionPlantEquipmentUtil
 * @generated
 */
@ProviderType
public interface VRCOPProductionPlantEquipmentPersistence
	extends BasePersistence<VRCOPProductionPlantEquipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPProductionPlantEquipmentUtil} to access the vrcop production plant equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vrcop production plant equipment in the entity cache if it is enabled.
	*
	* @param vrcopProductionPlantEquipment the vrcop production plant equipment
	*/
	public void cacheResult(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment);

	/**
	* Caches the vrcop production plant equipments in the entity cache if it is enabled.
	*
	* @param vrcopProductionPlantEquipments the vrcop production plant equipments
	*/
	public void cacheResult(
		java.util.List<VRCOPProductionPlantEquipment> vrcopProductionPlantEquipments);

	/**
	* Creates a new vrcop production plant equipment with the primary key. Does not add the vrcop production plant equipment to the database.
	*
	* @param id the primary key for the new vrcop production plant equipment
	* @return the new vrcop production plant equipment
	*/
	public VRCOPProductionPlantEquipment create(long id);

	/**
	* Removes the vrcop production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant equipment
	* @return the vrcop production plant equipment that was removed
	* @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	*/
	public VRCOPProductionPlantEquipment remove(long id)
		throws NoSuchVRCOPProductionPlantEquipmentException;

	public VRCOPProductionPlantEquipment updateImpl(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment);

	/**
	* Returns the vrcop production plant equipment with the primary key or throws a {@link NoSuchVRCOPProductionPlantEquipmentException} if it could not be found.
	*
	* @param id the primary key of the vrcop production plant equipment
	* @return the vrcop production plant equipment
	* @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	*/
	public VRCOPProductionPlantEquipment findByPrimaryKey(long id)
		throws NoSuchVRCOPProductionPlantEquipmentException;

	/**
	* Returns the vrcop production plant equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop production plant equipment
	* @return the vrcop production plant equipment, or <code>null</code> if a vrcop production plant equipment with the primary key could not be found
	*/
	public VRCOPProductionPlantEquipment fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPProductionPlantEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop production plant equipments.
	*
	* @return the vrcop production plant equipments
	*/
	public java.util.List<VRCOPProductionPlantEquipment> findAll();

	/**
	* Returns a range of all the vrcop production plant equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant equipments
	* @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	* @return the range of vrcop production plant equipments
	*/
	public java.util.List<VRCOPProductionPlantEquipment> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the vrcop production plant equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant equipments
	* @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop production plant equipments
	*/
	public java.util.List<VRCOPProductionPlantEquipment> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop production plant equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant equipments
	* @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop production plant equipments
	*/
	public java.util.List<VRCOPProductionPlantEquipment> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop production plant equipments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop production plant equipments.
	*
	* @return the number of vrcop production plant equipments
	*/
	public int countAll();
}