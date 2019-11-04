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

import com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException;
import com.fds.vr.business.model.VRInputStampbookDetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr input stampbook details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRInputStampbookDetailsPersistenceImpl
 * @see VRInputStampbookDetailsUtil
 * @generated
 */
@ProviderType
public interface VRInputStampbookDetailsPersistence extends BasePersistence<VRInputStampbookDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInputStampbookDetailsUtil} to access the vr input stampbook details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr input stampbook details in the entity cache if it is enabled.
	*
	* @param vrInputStampbookDetails the vr input stampbook details
	*/
	public void cacheResult(VRInputStampbookDetails vrInputStampbookDetails);

	/**
	* Caches the vr input stampbook detailses in the entity cache if it is enabled.
	*
	* @param vrInputStampbookDetailses the vr input stampbook detailses
	*/
	public void cacheResult(
		java.util.List<VRInputStampbookDetails> vrInputStampbookDetailses);

	/**
	* Creates a new vr input stampbook details with the primary key. Does not add the vr input stampbook details to the database.
	*
	* @param id the primary key for the new vr input stampbook details
	* @return the new vr input stampbook details
	*/
	public VRInputStampbookDetails create(long id);

	/**
	* Removes the vr input stampbook details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details that was removed
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails remove(long id)
		throws NoSuchVRInputStampbookDetailsException;

	public VRInputStampbookDetails updateImpl(
		VRInputStampbookDetails vrInputStampbookDetails);

	/**
	* Returns the vr input stampbook details with the primary key or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails findByPrimaryKey(long id)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the vr input stampbook details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details, or <code>null</code> if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRInputStampbookDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr input stampbook detailses.
	*
	* @return the vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findAll();

	/**
	* Returns a range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr input stampbook detailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr input stampbook detailses.
	*
	* @return the number of vr input stampbook detailses
	*/
	public int countAll();
}