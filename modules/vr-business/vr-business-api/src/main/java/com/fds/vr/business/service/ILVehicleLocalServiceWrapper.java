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

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ILVehicleLocalService}.
 *
 * @author LamTV
 * @see ILVehicleLocalService
 * @generated
 */
@ProviderType
public class ILVehicleLocalServiceWrapper implements ILVehicleLocalService,
	ServiceWrapper<ILVehicleLocalService> {
	public ILVehicleLocalServiceWrapper(
		ILVehicleLocalService ilVehicleLocalService) {
		_ilVehicleLocalService = ilVehicleLocalService;
	}

	/**
	* Adds the il vehicle to the database. Also notifies the appropriate model listeners.
	*
	* @param ilVehicle the il vehicle
	* @return the il vehicle that was added
	*/
	@Override
	public com.fds.vr.business.model.ILVehicle addILVehicle(
		com.fds.vr.business.model.ILVehicle ilVehicle) {
		return _ilVehicleLocalService.addILVehicle(ilVehicle);
	}

	/**
	* Creates a new il vehicle with the primary key. Does not add the il vehicle to the database.
	*
	* @param id the primary key for the new il vehicle
	* @return the new il vehicle
	*/
	@Override
	public com.fds.vr.business.model.ILVehicle createILVehicle(long id) {
		return _ilVehicleLocalService.createILVehicle(id);
	}

	@Override
	public com.fds.vr.business.model.ILVehicle createVehicle(
		com.liferay.portal.kernel.json.JSONObject jsonData,
		java.lang.String issuingDispatchNo) {
		return _ilVehicleLocalService.createVehicle(jsonData, issuingDispatchNo);
	}

	/**
	* Deletes the il vehicle from the database. Also notifies the appropriate model listeners.
	*
	* @param ilVehicle the il vehicle
	* @return the il vehicle that was removed
	*/
	@Override
	public com.fds.vr.business.model.ILVehicle deleteILVehicle(
		com.fds.vr.business.model.ILVehicle ilVehicle) {
		return _ilVehicleLocalService.deleteILVehicle(ilVehicle);
	}

	/**
	* Deletes the il vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il vehicle
	* @return the il vehicle that was removed
	* @throws PortalException if a il vehicle with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.ILVehicle deleteILVehicle(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilVehicleLocalService.deleteILVehicle(id);
	}

	@Override
	public com.fds.vr.business.model.ILVehicle fetchILVehicle(long id) {
		return _ilVehicleLocalService.fetchILVehicle(id);
	}

	/**
	* Returns the il vehicle with the primary key.
	*
	* @param id the primary key of the il vehicle
	* @return the il vehicle
	* @throws PortalException if a il vehicle with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.ILVehicle getILVehicle(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilVehicleLocalService.getILVehicle(id);
	}

	/**
	* Updates the il vehicle in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilVehicle the il vehicle
	* @return the il vehicle that was updated
	*/
	@Override
	public com.fds.vr.business.model.ILVehicle updateILVehicle(
		com.fds.vr.business.model.ILVehicle ilVehicle) {
		return _ilVehicleLocalService.updateILVehicle(ilVehicle);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ilVehicleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ilVehicleLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ilVehicleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilVehicleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilVehicleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of il vehicles.
	*
	* @return the number of il vehicles
	*/
	@Override
	public int getILVehiclesCount() {
		return _ilVehicleLocalService.getILVehiclesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ilVehicleLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ilVehicleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _ilVehicleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _ilVehicleLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the il vehicles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicles
	* @param end the upper bound of the range of il vehicles (not inclusive)
	* @return the range of il vehicles
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.ILVehicle> getILVehicles(
		int start, int end) {
		return _ilVehicleLocalService.getILVehicles(start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILVehicle> getVehicleList(
		java.lang.String issuingDispatchNo) {
		return _ilVehicleLocalService.getVehicleList(issuingDispatchNo);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ilVehicleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _ilVehicleLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ILVehicleLocalService getWrappedService() {
		return _ilVehicleLocalService;
	}

	@Override
	public void setWrappedService(ILVehicleLocalService ilVehicleLocalService) {
		_ilVehicleLocalService = ilVehicleLocalService;
	}

	private ILVehicleLocalService _ilVehicleLocalService;
}