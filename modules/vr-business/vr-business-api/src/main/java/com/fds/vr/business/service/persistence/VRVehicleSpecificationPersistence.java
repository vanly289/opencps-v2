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

import com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException;
import com.fds.vr.business.model.VRVehicleSpecification;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr vehicle specification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleSpecificationPersistenceImpl
 * @see VRVehicleSpecificationUtil
 * @generated
 */
@ProviderType
public interface VRVehicleSpecificationPersistence extends BasePersistence<VRVehicleSpecification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRVehicleSpecificationUtil} to access the vr vehicle specification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr vehicle specification in the entity cache if it is enabled.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	*/
	public void cacheResult(VRVehicleSpecification vrVehicleSpecification);

	/**
	* Caches the vr vehicle specifications in the entity cache if it is enabled.
	*
	* @param vrVehicleSpecifications the vr vehicle specifications
	*/
	public void cacheResult(
		java.util.List<VRVehicleSpecification> vrVehicleSpecifications);

	/**
	* Creates a new vr vehicle specification with the primary key. Does not add the vr vehicle specification to the database.
	*
	* @param id the primary key for the new vr vehicle specification
	* @return the new vr vehicle specification
	*/
	public VRVehicleSpecification create(long id);

	/**
	* Removes the vr vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification that was removed
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification remove(long id)
		throws NoSuchVRVehicleSpecificationException;

	public VRVehicleSpecification updateImpl(
		VRVehicleSpecification vrVehicleSpecification);

	/**
	* Returns the vr vehicle specification with the primary key or throws a {@link NoSuchVRVehicleSpecificationException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification findByPrimaryKey(long id)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the vr vehicle specification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification, or <code>null</code> if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRVehicleSpecification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr vehicle specifications.
	*
	* @return the vr vehicle specifications
	*/
	public java.util.List<VRVehicleSpecification> findAll();

	/**
	* Returns a range of all the vr vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @return the range of vr vehicle specifications
	*/
	public java.util.List<VRVehicleSpecification> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle specifications
	*/
	public java.util.List<VRVehicleSpecification> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle specifications
	*/
	public java.util.List<VRVehicleSpecification> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle specifications from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr vehicle specifications.
	*
	* @return the number of vr vehicle specifications
	*/
	public int countAll();
}