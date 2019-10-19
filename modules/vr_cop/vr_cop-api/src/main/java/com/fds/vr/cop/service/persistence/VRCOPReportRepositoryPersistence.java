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

package com.fds.vr.cop.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.cop.exception.NoSuchVRCOPReportRepositoryException;
import com.fds.vr.cop.model.VRCOPReportRepository;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop report repository service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see com.fds.vr.cop.service.persistence.impl.VRCOPReportRepositoryPersistenceImpl
 * @see VRCOPReportRepositoryUtil
 * @generated
 */
@ProviderType
public interface VRCOPReportRepositoryPersistence extends BasePersistence<VRCOPReportRepository> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPReportRepositoryUtil} to access the vrcop report repository persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vrcop report repository where COPReportNo = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param COPReportNo the cop report no
	* @return the matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByCOP_REPORT_NO(
		java.lang.String COPReportNo)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the vrcop report repository where COPReportNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param COPReportNo the cop report no
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByCOP_REPORT_NO(
		java.lang.String COPReportNo);

	/**
	* Returns the vrcop report repository where COPReportNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param COPReportNo the cop report no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByCOP_REPORT_NO(
		java.lang.String COPReportNo, boolean retrieveFromCache);

	/**
	* Removes the vrcop report repository where COPReportNo = &#63; from the database.
	*
	* @param COPReportNo the cop report no
	* @return the vrcop report repository that was removed
	*/
	public VRCOPReportRepository removeByCOP_REPORT_NO(
		java.lang.String COPReportNo)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the number of vrcop report repositories where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @return the number of matching vrcop report repositories
	*/
	public int countByCOP_REPORT_NO(java.lang.String COPReportNo);

	/**
	* Caches the vrcop report repository in the entity cache if it is enabled.
	*
	* @param vrcopReportRepository the vrcop report repository
	*/
	public void cacheResult(VRCOPReportRepository vrcopReportRepository);

	/**
	* Caches the vrcop report repositories in the entity cache if it is enabled.
	*
	* @param vrcopReportRepositories the vrcop report repositories
	*/
	public void cacheResult(
		java.util.List<VRCOPReportRepository> vrcopReportRepositories);

	/**
	* Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	*
	* @param id the primary key for the new vrcop report repository
	* @return the new vrcop report repository
	*/
	public VRCOPReportRepository create(long id);

	/**
	* Removes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository that was removed
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository remove(long id)
		throws NoSuchVRCOPReportRepositoryException;

	public VRCOPReportRepository updateImpl(
		VRCOPReportRepository vrcopReportRepository);

	/**
	* Returns the vrcop report repository with the primary key or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository findByPrimaryKey(long id)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the vrcop report repository with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository, or <code>null</code> if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPReportRepository> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop report repositories.
	*
	* @return the vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findAll();

	/**
	* Returns a range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop report repositories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop report repositories.
	*
	* @return the number of vrcop report repositories
	*/
	public int countAll();
}