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
 * Provides a wrapper for {@link ILVehicleCustomsBorderGuardLocalService}.
 *
 * @author LamTV
 * @see ILVehicleCustomsBorderGuardLocalService
 * @generated
 */
@ProviderType
public class ILVehicleCustomsBorderGuardLocalServiceWrapper
	implements ILVehicleCustomsBorderGuardLocalService,
		ServiceWrapper<ILVehicleCustomsBorderGuardLocalService> {
	public ILVehicleCustomsBorderGuardLocalServiceWrapper(
		ILVehicleCustomsBorderGuardLocalService ilVehicleCustomsBorderGuardLocalService) {
		_ilVehicleCustomsBorderGuardLocalService = ilVehicleCustomsBorderGuardLocalService;
	}

	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard addCustomBorderGuard(
		java.lang.String registrationNumber, java.lang.String expImpGateType,
		java.lang.String expImpGateCode, java.lang.String expImpGate,
		java.lang.String driverName, java.lang.String driverLicenceNo,
		java.util.Date regDate) {
		return _ilVehicleCustomsBorderGuardLocalService.addCustomBorderGuard(registrationNumber,
			expImpGateType, expImpGateCode, expImpGate, driverName,
			driverLicenceNo, regDate);
	}

	/**
	* Adds the il vehicle customs border guard to the database. Also notifies the appropriate model listeners.
	*
	* @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	* @return the il vehicle customs border guard that was added
	*/
	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard addILVehicleCustomsBorderGuard(
		com.fds.vr.business.model.ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return _ilVehicleCustomsBorderGuardLocalService.addILVehicleCustomsBorderGuard(ilVehicleCustomsBorderGuard);
	}

	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard createCustomsBorderGuard(
		com.liferay.portal.kernel.json.JSONObject tempGuardJSON,
		java.lang.String registrationNumberForm) {
		return _ilVehicleCustomsBorderGuardLocalService.createCustomsBorderGuard(tempGuardJSON,
			registrationNumberForm);
	}

	/**
	* Creates a new il vehicle customs border guard with the primary key. Does not add the il vehicle customs border guard to the database.
	*
	* @param id the primary key for the new il vehicle customs border guard
	* @return the new il vehicle customs border guard
	*/
	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard createILVehicleCustomsBorderGuard(
		long id) {
		return _ilVehicleCustomsBorderGuardLocalService.createILVehicleCustomsBorderGuard(id);
	}

	/**
	* Deletes the il vehicle customs border guard from the database. Also notifies the appropriate model listeners.
	*
	* @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	* @return the il vehicle customs border guard that was removed
	*/
	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard deleteILVehicleCustomsBorderGuard(
		com.fds.vr.business.model.ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return _ilVehicleCustomsBorderGuardLocalService.deleteILVehicleCustomsBorderGuard(ilVehicleCustomsBorderGuard);
	}

	/**
	* Deletes the il vehicle customs border guard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard that was removed
	* @throws PortalException if a il vehicle customs border guard with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard deleteILVehicleCustomsBorderGuard(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _ilVehicleCustomsBorderGuardLocalService.deleteILVehicleCustomsBorderGuard(id);
	}

	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard fetchILVehicleCustomsBorderGuard(
		long id) {
		return _ilVehicleCustomsBorderGuardLocalService.fetchILVehicleCustomsBorderGuard(id);
	}

	/**
	* Returns the il vehicle customs border guard with the primary key.
	*
	* @param id the primary key of the il vehicle customs border guard
	* @return the il vehicle customs border guard
	* @throws PortalException if a il vehicle customs border guard with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard getILVehicleCustomsBorderGuard(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _ilVehicleCustomsBorderGuardLocalService.getILVehicleCustomsBorderGuard(id);
	}

	/**
	* Updates the il vehicle customs border guard in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	* @return the il vehicle customs border guard that was updated
	*/
	@Override
	public com.fds.vr.business.model.ILVehicleCustomsBorderGuard updateILVehicleCustomsBorderGuard(
		com.fds.vr.business.model.ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		return _ilVehicleCustomsBorderGuardLocalService.updateILVehicleCustomsBorderGuard(ilVehicleCustomsBorderGuard);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ilVehicleCustomsBorderGuardLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ilVehicleCustomsBorderGuardLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ilVehicleCustomsBorderGuardLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilVehicleCustomsBorderGuardLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilVehicleCustomsBorderGuardLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of il vehicle customs border guards.
	*
	* @return the number of il vehicle customs border guards
	*/
	@Override
	public int getILVehicleCustomsBorderGuardsCount() {
		return _ilVehicleCustomsBorderGuardLocalService.getILVehicleCustomsBorderGuardsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ilVehicleCustomsBorderGuardLocalService.getOSGiServiceIdentifier();
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
		return _ilVehicleCustomsBorderGuardLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ilVehicleCustomsBorderGuardLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ilVehicleCustomsBorderGuardLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILVehicleCustomsBorderGuard> getBorderGuardList(
		java.lang.String registrationNumber) {
		return _ilVehicleCustomsBorderGuardLocalService.getBorderGuardList(registrationNumber);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILVehicleCustomsBorderGuard> getBorderGuardList(
		java.lang.String registrationNumber, int start, int end) {
		return _ilVehicleCustomsBorderGuardLocalService.getBorderGuardList(registrationNumber,
			start, end);
	}

	/**
	* Returns a range of all the il vehicle customs border guards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il vehicle customs border guards
	* @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	* @return the range of il vehicle customs border guards
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.ILVehicleCustomsBorderGuard> getILVehicleCustomsBorderGuards(
		int start, int end) {
		return _ilVehicleCustomsBorderGuardLocalService.getILVehicleCustomsBorderGuards(start,
			end);
	}

	@Override
	public long countBorderGuardList(java.lang.String registrationNumber) {
		return _ilVehicleCustomsBorderGuardLocalService.countBorderGuardList(registrationNumber);
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
		return _ilVehicleCustomsBorderGuardLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ilVehicleCustomsBorderGuardLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ILVehicleCustomsBorderGuardLocalService getWrappedService() {
		return _ilVehicleCustomsBorderGuardLocalService;
	}

	@Override
	public void setWrappedService(
		ILVehicleCustomsBorderGuardLocalService ilVehicleCustomsBorderGuardLocalService) {
		_ilVehicleCustomsBorderGuardLocalService = ilVehicleCustomsBorderGuardLocalService;
	}

	private ILVehicleCustomsBorderGuardLocalService _ilVehicleCustomsBorderGuardLocalService;
}