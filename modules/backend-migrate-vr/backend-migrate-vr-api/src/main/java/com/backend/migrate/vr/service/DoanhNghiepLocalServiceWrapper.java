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

package com.backend.migrate.vr.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DoanhNghiepLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DoanhNghiepLocalService
 * @generated
 */
@ProviderType
public class DoanhNghiepLocalServiceWrapper implements DoanhNghiepLocalService,
	ServiceWrapper<DoanhNghiepLocalService> {
	public DoanhNghiepLocalServiceWrapper(
		DoanhNghiepLocalService doanhNghiepLocalService) {
		_doanhNghiepLocalService = doanhNghiepLocalService;
	}

	/**
	* Adds the doanh nghiep to the database. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep the doanh nghiep
	* @return the doanh nghiep that was added
	*/
	@Override
	public com.backend.migrate.vr.model.DoanhNghiep addDoanhNghiep(
		com.backend.migrate.vr.model.DoanhNghiep doanhNghiep) {
		return _doanhNghiepLocalService.addDoanhNghiep(doanhNghiep);
	}

	/**
	* Creates a new doanh nghiep with the primary key. Does not add the doanh nghiep to the database.
	*
	* @param id the primary key for the new doanh nghiep
	* @return the new doanh nghiep
	*/
	@Override
	public com.backend.migrate.vr.model.DoanhNghiep createDoanhNghiep(long id) {
		return _doanhNghiepLocalService.createDoanhNghiep(id);
	}

	/**
	* Deletes the doanh nghiep from the database. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep the doanh nghiep
	* @return the doanh nghiep that was removed
	*/
	@Override
	public com.backend.migrate.vr.model.DoanhNghiep deleteDoanhNghiep(
		com.backend.migrate.vr.model.DoanhNghiep doanhNghiep) {
		return _doanhNghiepLocalService.deleteDoanhNghiep(doanhNghiep);
	}

	/**
	* Deletes the doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the doanh nghiep
	* @return the doanh nghiep that was removed
	* @throws PortalException if a doanh nghiep with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.DoanhNghiep deleteDoanhNghiep(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _doanhNghiepLocalService.deleteDoanhNghiep(id);
	}

	@Override
	public com.backend.migrate.vr.model.DoanhNghiep fetchDoanhNghiep(long id) {
		return _doanhNghiepLocalService.fetchDoanhNghiep(id);
	}

	/**
	* Returns the doanh nghiep with the primary key.
	*
	* @param id the primary key of the doanh nghiep
	* @return the doanh nghiep
	* @throws PortalException if a doanh nghiep with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.DoanhNghiep getDoanhNghiep(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _doanhNghiepLocalService.getDoanhNghiep(id);
	}

	@Override
	public com.backend.migrate.vr.model.DoanhNghiep getFirstGreaterThanId(
		long id)
		throws com.backend.migrate.vr.exception.NoSuchDoanhNghiepException {
		return _doanhNghiepLocalService.getFirstGreaterThanId(id);
	}

	/**
	* Updates the doanh nghiep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doanhNghiep the doanh nghiep
	* @return the doanh nghiep that was updated
	*/
	@Override
	public com.backend.migrate.vr.model.DoanhNghiep updateDoanhNghiep(
		com.backend.migrate.vr.model.DoanhNghiep doanhNghiep) {
		return _doanhNghiepLocalService.updateDoanhNghiep(doanhNghiep);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _doanhNghiepLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _doanhNghiepLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _doanhNghiepLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _doanhNghiepLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _doanhNghiepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of doanh nghieps.
	*
	* @return the number of doanh nghieps
	*/
	@Override
	public int getDoanhNghiepsCount() {
		return _doanhNghiepLocalService.getDoanhNghiepsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _doanhNghiepLocalService.getOSGiServiceIdentifier();
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
		return _doanhNghiepLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _doanhNghiepLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _doanhNghiepLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.DoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doanh nghieps
	* @param end the upper bound of the range of doanh nghieps (not inclusive)
	* @return the range of doanh nghieps
	*/
	@Override
	public java.util.List<com.backend.migrate.vr.model.DoanhNghiep> getDoanhNghieps(
		int start, int end) {
		return _doanhNghiepLocalService.getDoanhNghieps(start, end);
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
		return _doanhNghiepLocalService.dynamicQueryCount(dynamicQuery);
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
		return _doanhNghiepLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public DoanhNghiepLocalService getWrappedService() {
		return _doanhNghiepLocalService;
	}

	@Override
	public void setWrappedService(
		DoanhNghiepLocalService doanhNghiepLocalService) {
		_doanhNghiepLocalService = doanhNghiepLocalService;
	}

	private DoanhNghiepLocalService _doanhNghiepLocalService;
}