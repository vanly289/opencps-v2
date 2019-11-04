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

import com.fds.vr.business.exception.NoSuchVRCOPReportAttachException;
import com.fds.vr.business.model.VRCOPReportAttach;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop report attach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCOPReportAttachPersistenceImpl
 * @see VRCOPReportAttachUtil
 * @generated
 */
@ProviderType
public interface VRCOPReportAttachPersistence extends BasePersistence<VRCOPReportAttach> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPReportAttachUtil} to access the vrcop report attach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vrcop report attach in the entity cache if it is enabled.
	*
	* @param vrcopReportAttach the vrcop report attach
	*/
	public void cacheResult(VRCOPReportAttach vrcopReportAttach);

	/**
	* Caches the vrcop report attachs in the entity cache if it is enabled.
	*
	* @param vrcopReportAttachs the vrcop report attachs
	*/
	public void cacheResult(
		java.util.List<VRCOPReportAttach> vrcopReportAttachs);

	/**
	* Creates a new vrcop report attach with the primary key. Does not add the vrcop report attach to the database.
	*
	* @param id the primary key for the new vrcop report attach
	* @return the new vrcop report attach
	*/
	public VRCOPReportAttach create(long id);

	/**
	* Removes the vrcop report attach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report attach
	* @return the vrcop report attach that was removed
	* @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	*/
	public VRCOPReportAttach remove(long id)
		throws NoSuchVRCOPReportAttachException;

	public VRCOPReportAttach updateImpl(VRCOPReportAttach vrcopReportAttach);

	/**
	* Returns the vrcop report attach with the primary key or throws a {@link NoSuchVRCOPReportAttachException} if it could not be found.
	*
	* @param id the primary key of the vrcop report attach
	* @return the vrcop report attach
	* @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	*/
	public VRCOPReportAttach findByPrimaryKey(long id)
		throws NoSuchVRCOPReportAttachException;

	/**
	* Returns the vrcop report attach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop report attach
	* @return the vrcop report attach, or <code>null</code> if a vrcop report attach with the primary key could not be found
	*/
	public VRCOPReportAttach fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPReportAttach> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop report attachs.
	*
	* @return the vrcop report attachs
	*/
	public java.util.List<VRCOPReportAttach> findAll();

	/**
	* Returns a range of all the vrcop report attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @return the range of vrcop report attachs
	*/
	public java.util.List<VRCOPReportAttach> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vrcop report attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop report attachs
	*/
	public java.util.List<VRCOPReportAttach> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportAttach> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop report attachs
	*/
	public java.util.List<VRCOPReportAttach> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportAttach> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop report attachs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop report attachs.
	*
	* @return the number of vrcop report attachs
	*/
	public int countAll();
}