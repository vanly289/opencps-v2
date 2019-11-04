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

import com.fds.vr.business.exception.NoSuchVRInputStampbookException;
import com.fds.vr.business.model.VRInputStampbook;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr input stampbook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRInputStampbookPersistenceImpl
 * @see VRInputStampbookUtil
 * @generated
 */
@ProviderType
public interface VRInputStampbookPersistence extends BasePersistence<VRInputStampbook> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInputStampbookUtil} to access the vr input stampbook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr input stampbook in the entity cache if it is enabled.
	*
	* @param vrInputStampbook the vr input stampbook
	*/
	public void cacheResult(VRInputStampbook vrInputStampbook);

	/**
	* Caches the vr input stampbooks in the entity cache if it is enabled.
	*
	* @param vrInputStampbooks the vr input stampbooks
	*/
	public void cacheResult(java.util.List<VRInputStampbook> vrInputStampbooks);

	/**
	* Creates a new vr input stampbook with the primary key. Does not add the vr input stampbook to the database.
	*
	* @param id the primary key for the new vr input stampbook
	* @return the new vr input stampbook
	*/
	public VRInputStampbook create(long id);

	/**
	* Removes the vr input stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook that was removed
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook remove(long id)
		throws NoSuchVRInputStampbookException;

	public VRInputStampbook updateImpl(VRInputStampbook vrInputStampbook);

	/**
	* Returns the vr input stampbook with the primary key or throws a {@link NoSuchVRInputStampbookException} if it could not be found.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook findByPrimaryKey(long id)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the vr input stampbook with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook, or <code>null</code> if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRInputStampbook> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr input stampbooks.
	*
	* @return the vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findAll();

	/**
	* Returns a range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr input stampbooks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr input stampbooks.
	*
	* @return the number of vr input stampbooks
	*/
	public int countAll();
}