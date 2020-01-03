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

import com.fds.vr.business.exception.NoSuchVRCorporationInspectorException;
import com.fds.vr.business.model.VRCorporationInspector;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr corporation inspector service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCorporationInspectorPersistenceImpl
 * @see VRCorporationInspectorUtil
 * @generated
 */
@ProviderType
public interface VRCorporationInspectorPersistence extends BasePersistence<VRCorporationInspector> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCorporationInspectorUtil} to access the vr corporation inspector persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr corporation inspector in the entity cache if it is enabled.
	*
	* @param vrCorporationInspector the vr corporation inspector
	*/
	public void cacheResult(VRCorporationInspector vrCorporationInspector);

	/**
	* Caches the vr corporation inspectors in the entity cache if it is enabled.
	*
	* @param vrCorporationInspectors the vr corporation inspectors
	*/
	public void cacheResult(
		java.util.List<VRCorporationInspector> vrCorporationInspectors);

	/**
	* Creates a new vr corporation inspector with the primary key. Does not add the vr corporation inspector to the database.
	*
	* @param id the primary key for the new vr corporation inspector
	* @return the new vr corporation inspector
	*/
	public VRCorporationInspector create(long id);

	/**
	* Removes the vr corporation inspector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector that was removed
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector remove(long id)
		throws NoSuchVRCorporationInspectorException;

	public VRCorporationInspector updateImpl(
		VRCorporationInspector vrCorporationInspector);

	/**
	* Returns the vr corporation inspector with the primary key or throws a {@link NoSuchVRCorporationInspectorException} if it could not be found.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector findByPrimaryKey(long id)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the vr corporation inspector with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector, or <code>null</code> if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCorporationInspector> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr corporation inspectors.
	*
	* @return the vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findAll();

	/**
	* Returns a range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr corporation inspectors from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr corporation inspectors.
	*
	* @return the number of vr corporation inspectors
	*/
	public int countAll();
}