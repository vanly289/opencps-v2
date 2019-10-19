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

import com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrcop production plant prod equipment service. This utility wraps {@link com.fds.vr.cop.service.persistence.impl.VRCOPProductionPlantProdEquipmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantProdEquipmentPersistence
 * @see com.fds.vr.cop.service.persistence.impl.VRCOPProductionPlantProdEquipmentPersistenceImpl
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantProdEquipmentUtil {
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
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		getPersistence().clearCache(vrcopProductionPlantProdEquipment);
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
	public static List<VRCOPProductionPlantProdEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCOPProductionPlantProdEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCOPProductionPlantProdEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCOPProductionPlantProdEquipment update(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return getPersistence().update(vrcopProductionPlantProdEquipment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCOPProductionPlantProdEquipment update(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(vrcopProductionPlantProdEquipment, serviceContext);
	}

	/**
	* Returns all the vrcop production plant prod equipments where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @return the matching vrcop production plant prod equipments
	*/
	public static List<VRCOPProductionPlantProdEquipment> findByCOP_REPORT_NO(
		java.lang.String COPReportNo) {
		return getPersistence().findByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Returns a range of all the vrcop production plant prod equipments where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant prod equipments
	* @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	* @return the range of matching vrcop production plant prod equipments
	*/
	public static List<VRCOPProductionPlantProdEquipment> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end) {
		return getPersistence().findByCOP_REPORT_NO(COPReportNo, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop production plant prod equipments where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant prod equipments
	* @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop production plant prod equipments
	*/
	public static List<VRCOPProductionPlantProdEquipment> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		return getPersistence()
				   .findByCOP_REPORT_NO(COPReportNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop production plant prod equipments where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant prod equipments
	* @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop production plant prod equipments
	*/
	public static List<VRCOPProductionPlantProdEquipment> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCOP_REPORT_NO(COPReportNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant prod equipment
	* @throws NoSuchVRCOPProductionPlantProdEquipmentException if a matching vrcop production plant prod equipment could not be found
	*/
	public static VRCOPProductionPlantProdEquipment findByCOP_REPORT_NO_First(
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductionPlantProdEquipmentException {
		return getPersistence()
				   .findByCOP_REPORT_NO_First(COPReportNo, orderByComparator);
	}

	/**
	* Returns the first vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant prod equipment, or <code>null</code> if a matching vrcop production plant prod equipment could not be found
	*/
	public static VRCOPProductionPlantProdEquipment fetchByCOP_REPORT_NO_First(
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		return getPersistence()
				   .fetchByCOP_REPORT_NO_First(COPReportNo, orderByComparator);
	}

	/**
	* Returns the last vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant prod equipment
	* @throws NoSuchVRCOPProductionPlantProdEquipmentException if a matching vrcop production plant prod equipment could not be found
	*/
	public static VRCOPProductionPlantProdEquipment findByCOP_REPORT_NO_Last(
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductionPlantProdEquipmentException {
		return getPersistence()
				   .findByCOP_REPORT_NO_Last(COPReportNo, orderByComparator);
	}

	/**
	* Returns the last vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant prod equipment, or <code>null</code> if a matching vrcop production plant prod equipment could not be found
	*/
	public static VRCOPProductionPlantProdEquipment fetchByCOP_REPORT_NO_Last(
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		return getPersistence()
				   .fetchByCOP_REPORT_NO_Last(COPReportNo, orderByComparator);
	}

	/**
	* Returns the vrcop production plant prod equipments before and after the current vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop production plant prod equipment
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop production plant prod equipment
	* @throws NoSuchVRCOPProductionPlantProdEquipmentException if a vrcop production plant prod equipment with the primary key could not be found
	*/
	public static VRCOPProductionPlantProdEquipment[] findByCOP_REPORT_NO_PrevAndNext(
		long id, java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductionPlantProdEquipmentException {
		return getPersistence()
				   .findByCOP_REPORT_NO_PrevAndNext(id, COPReportNo,
			orderByComparator);
	}

	/**
	* Removes all the vrcop production plant prod equipments where COPReportNo = &#63; from the database.
	*
	* @param COPReportNo the cop report no
	*/
	public static void removeByCOP_REPORT_NO(java.lang.String COPReportNo) {
		getPersistence().removeByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Returns the number of vrcop production plant prod equipments where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @return the number of matching vrcop production plant prod equipments
	*/
	public static int countByCOP_REPORT_NO(java.lang.String COPReportNo) {
		return getPersistence().countByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Caches the vrcop production plant prod equipment in the entity cache if it is enabled.
	*
	* @param vrcopProductionPlantProdEquipment the vrcop production plant prod equipment
	*/
	public static void cacheResult(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		getPersistence().cacheResult(vrcopProductionPlantProdEquipment);
	}

	/**
	* Caches the vrcop production plant prod equipments in the entity cache if it is enabled.
	*
	* @param vrcopProductionPlantProdEquipments the vrcop production plant prod equipments
	*/
	public static void cacheResult(
		List<VRCOPProductionPlantProdEquipment> vrcopProductionPlantProdEquipments) {
		getPersistence().cacheResult(vrcopProductionPlantProdEquipments);
	}

	/**
	* Creates a new vrcop production plant prod equipment with the primary key. Does not add the vrcop production plant prod equipment to the database.
	*
	* @param id the primary key for the new vrcop production plant prod equipment
	* @return the new vrcop production plant prod equipment
	*/
	public static VRCOPProductionPlantProdEquipment create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrcop production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was removed
	* @throws NoSuchVRCOPProductionPlantProdEquipmentException if a vrcop production plant prod equipment with the primary key could not be found
	*/
	public static VRCOPProductionPlantProdEquipment remove(long id)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductionPlantProdEquipmentException {
		return getPersistence().remove(id);
	}

	public static VRCOPProductionPlantProdEquipment updateImpl(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return getPersistence().updateImpl(vrcopProductionPlantProdEquipment);
	}

	/**
	* Returns the vrcop production plant prod equipment with the primary key or throws a {@link NoSuchVRCOPProductionPlantProdEquipmentException} if it could not be found.
	*
	* @param id the primary key of the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment
	* @throws NoSuchVRCOPProductionPlantProdEquipmentException if a vrcop production plant prod equipment with the primary key could not be found
	*/
	public static VRCOPProductionPlantProdEquipment findByPrimaryKey(long id)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductionPlantProdEquipmentException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrcop production plant prod equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment, or <code>null</code> if a vrcop production plant prod equipment with the primary key could not be found
	*/
	public static VRCOPProductionPlantProdEquipment fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCOPProductionPlantProdEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrcop production plant prod equipments.
	*
	* @return the vrcop production plant prod equipments
	*/
	public static List<VRCOPProductionPlantProdEquipment> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrcop production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant prod equipments
	* @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	* @return the range of vrcop production plant prod equipments
	*/
	public static List<VRCOPProductionPlantProdEquipment> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrcop production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant prod equipments
	* @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop production plant prod equipments
	*/
	public static List<VRCOPProductionPlantProdEquipment> findAll(int start,
		int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant prod equipments
	* @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop production plant prod equipments
	*/
	public static List<VRCOPProductionPlantProdEquipment> findAll(int start,
		int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrcop production plant prod equipments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrcop production plant prod equipments.
	*
	* @return the number of vrcop production plant prod equipments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCOPProductionPlantProdEquipmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPProductionPlantProdEquipmentPersistence, VRCOPProductionPlantProdEquipmentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPProductionPlantProdEquipmentPersistence.class);
}