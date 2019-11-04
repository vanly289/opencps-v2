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

import com.fds.vr.business.exception.NoSuchVRIssueException;
import com.fds.vr.business.model.VRIssue;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr issue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRIssuePersistenceImpl
 * @see VRIssueUtil
 * @generated
 */
@ProviderType
public interface VRIssuePersistence extends BasePersistence<VRIssue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRIssueUtil} to access the vr issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr issue in the entity cache if it is enabled.
	*
	* @param vrIssue the vr issue
	*/
	public void cacheResult(VRIssue vrIssue);

	/**
	* Caches the vr issues in the entity cache if it is enabled.
	*
	* @param vrIssues the vr issues
	*/
	public void cacheResult(java.util.List<VRIssue> vrIssues);

	/**
	* Creates a new vr issue with the primary key. Does not add the vr issue to the database.
	*
	* @param id the primary key for the new vr issue
	* @return the new vr issue
	*/
	public VRIssue create(long id);

	/**
	* Removes the vr issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue that was removed
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue remove(long id) throws NoSuchVRIssueException;

	public VRIssue updateImpl(VRIssue vrIssue);

	/**
	* Returns the vr issue with the primary key or throws a {@link NoSuchVRIssueException} if it could not be found.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue findByPrimaryKey(long id) throws NoSuchVRIssueException;

	/**
	* Returns the vr issue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue, or <code>null</code> if a vr issue with the primary key could not be found
	*/
	public VRIssue fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRIssue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr issues.
	*
	* @return the vr issues
	*/
	public java.util.List<VRIssue> findAll();

	/**
	* Returns a range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of vr issues
	*/
	public java.util.List<VRIssue> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issues
	*/
	public java.util.List<VRIssue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issues
	*/
	public java.util.List<VRIssue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr issues from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr issues.
	*
	* @return the number of vr issues
	*/
	public int countAll();
}