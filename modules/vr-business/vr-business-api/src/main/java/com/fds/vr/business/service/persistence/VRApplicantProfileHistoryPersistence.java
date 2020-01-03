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

import com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException;
import com.fds.vr.business.model.VRApplicantProfileHistory;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr applicant profile history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRApplicantProfileHistoryPersistenceImpl
 * @see VRApplicantProfileHistoryUtil
 * @generated
 */
@ProviderType
public interface VRApplicantProfileHistoryPersistence extends BasePersistence<VRApplicantProfileHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRApplicantProfileHistoryUtil} to access the vr applicant profile history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr applicant profile history in the entity cache if it is enabled.
	*
	* @param vrApplicantProfileHistory the vr applicant profile history
	*/
	public void cacheResult(VRApplicantProfileHistory vrApplicantProfileHistory);

	/**
	* Caches the vr applicant profile histories in the entity cache if it is enabled.
	*
	* @param vrApplicantProfileHistories the vr applicant profile histories
	*/
	public void cacheResult(
		java.util.List<VRApplicantProfileHistory> vrApplicantProfileHistories);

	/**
	* Creates a new vr applicant profile history with the primary key. Does not add the vr applicant profile history to the database.
	*
	* @param id the primary key for the new vr applicant profile history
	* @return the new vr applicant profile history
	*/
	public VRApplicantProfileHistory create(long id);

	/**
	* Removes the vr applicant profile history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history that was removed
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory remove(long id)
		throws NoSuchVRApplicantProfileHistoryException;

	public VRApplicantProfileHistory updateImpl(
		VRApplicantProfileHistory vrApplicantProfileHistory);

	/**
	* Returns the vr applicant profile history with the primary key or throws a {@link NoSuchVRApplicantProfileHistoryException} if it could not be found.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory findByPrimaryKey(long id)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the vr applicant profile history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history, or <code>null</code> if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRApplicantProfileHistory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr applicant profile histories.
	*
	* @return the vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findAll();

	/**
	* Returns a range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr applicant profile histories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr applicant profile histories.
	*
	* @return the number of vr applicant profile histories
	*/
	public int countAll();
}