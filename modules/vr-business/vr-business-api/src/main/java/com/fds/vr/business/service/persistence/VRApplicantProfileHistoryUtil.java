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

import com.fds.vr.business.model.VRApplicantProfileHistory;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr applicant profile history service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRApplicantProfileHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfileHistoryPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRApplicantProfileHistoryPersistenceImpl
 * @generated
 */
@ProviderType
public class VRApplicantProfileHistoryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		getPersistence().clearCache(vrApplicantProfileHistory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VRApplicantProfileHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRApplicantProfileHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRApplicantProfileHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRApplicantProfileHistory update(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		return getPersistence().update(vrApplicantProfileHistory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRApplicantProfileHistory update(
		VRApplicantProfileHistory vrApplicantProfileHistory,
		ServiceContext serviceContext) {
		return getPersistence().update(vrApplicantProfileHistory, serviceContext);
	}

	/**
	* Caches the vr applicant profile history in the entity cache if it is enabled.
	*
	* @param vrApplicantProfileHistory the vr applicant profile history
	*/
	public static void cacheResult(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		getPersistence().cacheResult(vrApplicantProfileHistory);
	}

	/**
	* Caches the vr applicant profile histories in the entity cache if it is enabled.
	*
	* @param vrApplicantProfileHistories the vr applicant profile histories
	*/
	public static void cacheResult(
		List<VRApplicantProfileHistory> vrApplicantProfileHistories) {
		getPersistence().cacheResult(vrApplicantProfileHistories);
	}

	/**
	* Creates a new vr applicant profile history with the primary key. Does not add the vr applicant profile history to the database.
	*
	* @param id the primary key for the new vr applicant profile history
	* @return the new vr applicant profile history
	*/
	public static VRApplicantProfileHistory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr applicant profile history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history that was removed
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence().remove(id);
	}

	public static VRApplicantProfileHistory updateImpl(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		return getPersistence().updateImpl(vrApplicantProfileHistory);
	}

	/**
	* Returns the vr applicant profile history with the primary key or throws a {@link NoSuchVRApplicantProfileHistoryException} if it could not be found.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr applicant profile history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history, or <code>null</code> if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRApplicantProfileHistory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr applicant profile histories.
	*
	* @return the vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VRApplicantProfileHistory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VRApplicantProfileHistory> findAll(int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VRApplicantProfileHistory> findAll(int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr applicant profile histories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr applicant profile histories.
	*
	* @return the number of vr applicant profile histories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRApplicantProfileHistoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRApplicantProfileHistoryPersistence, VRApplicantProfileHistoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRApplicantProfileHistoryPersistence.class);
}