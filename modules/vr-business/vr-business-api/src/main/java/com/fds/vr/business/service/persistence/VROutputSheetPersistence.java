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

import com.fds.vr.business.exception.NoSuchVROutputSheetException;
import com.fds.vr.business.model.VROutputSheet;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr output sheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VROutputSheetPersistenceImpl
 * @see VROutputSheetUtil
 * @generated
 */
@ProviderType
public interface VROutputSheetPersistence extends BasePersistence<VROutputSheet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VROutputSheetUtil} to access the vr output sheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr output sheet in the entity cache if it is enabled.
	*
	* @param vrOutputSheet the vr output sheet
	*/
	public void cacheResult(VROutputSheet vrOutputSheet);

	/**
	* Caches the vr output sheets in the entity cache if it is enabled.
	*
	* @param vrOutputSheets the vr output sheets
	*/
	public void cacheResult(java.util.List<VROutputSheet> vrOutputSheets);

	/**
	* Creates a new vr output sheet with the primary key. Does not add the vr output sheet to the database.
	*
	* @param id the primary key for the new vr output sheet
	* @return the new vr output sheet
	*/
	public VROutputSheet create(long id);

	/**
	* Removes the vr output sheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet that was removed
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public VROutputSheet remove(long id) throws NoSuchVROutputSheetException;

	public VROutputSheet updateImpl(VROutputSheet vrOutputSheet);

	/**
	* Returns the vr output sheet with the primary key or throws a {@link NoSuchVROutputSheetException} if it could not be found.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public VROutputSheet findByPrimaryKey(long id)
		throws NoSuchVROutputSheetException;

	/**
	* Returns the vr output sheet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet, or <code>null</code> if a vr output sheet with the primary key could not be found
	*/
	public VROutputSheet fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VROutputSheet> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr output sheets.
	*
	* @return the vr output sheets
	*/
	public java.util.List<VROutputSheet> findAll();

	/**
	* Returns a range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of vr output sheets
	*/
	public java.util.List<VROutputSheet> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr output sheets
	*/
	public java.util.List<VROutputSheet> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheet> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr output sheets
	*/
	public java.util.List<VROutputSheet> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr output sheets from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr output sheets.
	*
	* @return the number of vr output sheets
	*/
	public int countAll();
}