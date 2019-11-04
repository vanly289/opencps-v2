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

import com.fds.vr.business.exception.NoSuchVRCorporationViewException;
import com.fds.vr.business.model.VRCorporationView;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr corporation view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCorporationViewPersistenceImpl
 * @see VRCorporationViewUtil
 * @generated
 */
@ProviderType
public interface VRCorporationViewPersistence extends BasePersistence<VRCorporationView> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCorporationViewUtil} to access the vr corporation view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr corporation view in the entity cache if it is enabled.
	*
	* @param vrCorporationView the vr corporation view
	*/
	public void cacheResult(VRCorporationView vrCorporationView);

	/**
	* Caches the vr corporation views in the entity cache if it is enabled.
	*
	* @param vrCorporationViews the vr corporation views
	*/
	public void cacheResult(
		java.util.List<VRCorporationView> vrCorporationViews);

	/**
	* Creates a new vr corporation view with the primary key. Does not add the vr corporation view to the database.
	*
	* @param id the primary key for the new vr corporation view
	* @return the new vr corporation view
	*/
	public VRCorporationView create(long id);

	/**
	* Removes the vr corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view that was removed
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView remove(long id)
		throws NoSuchVRCorporationViewException;

	public VRCorporationView updateImpl(VRCorporationView vrCorporationView);

	/**
	* Returns the vr corporation view with the primary key or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView findByPrimaryKey(long id)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the vr corporation view with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view, or <code>null</code> if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCorporationView> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr corporation views.
	*
	* @return the vr corporation views
	*/
	public java.util.List<VRCorporationView> findAll();

	/**
	* Returns a range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of vr corporation views
	*/
	public java.util.List<VRCorporationView> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr corporation views
	*/
	public java.util.List<VRCorporationView> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr corporation views
	*/
	public java.util.List<VRCorporationView> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr corporation views from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr corporation views.
	*
	* @return the number of vr corporation views
	*/
	public int countAll();
}