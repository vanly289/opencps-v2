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
 * Provides a wrapper for {@link ViPhamLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ViPhamLocalService
 * @generated
 */
@ProviderType
public class ViPhamLocalServiceWrapper implements ViPhamLocalService,
	ServiceWrapper<ViPhamLocalService> {
	public ViPhamLocalServiceWrapper(ViPhamLocalService viPhamLocalService) {
		_viPhamLocalService = viPhamLocalService;
	}

	/**
	* Adds the vi pham to the database. Also notifies the appropriate model listeners.
	*
	* @param viPham the vi pham
	* @return the vi pham that was added
	*/
	@Override
	public com.backend.migrate.vr.model.ViPham addViPham(
		com.backend.migrate.vr.model.ViPham viPham) {
		return _viPhamLocalService.addViPham(viPham);
	}

	/**
	* Creates a new vi pham with the primary key. Does not add the vi pham to the database.
	*
	* @param id the primary key for the new vi pham
	* @return the new vi pham
	*/
	@Override
	public com.backend.migrate.vr.model.ViPham createViPham(long id) {
		return _viPhamLocalService.createViPham(id);
	}

	/**
	* Deletes the vi pham from the database. Also notifies the appropriate model listeners.
	*
	* @param viPham the vi pham
	* @return the vi pham that was removed
	*/
	@Override
	public com.backend.migrate.vr.model.ViPham deleteViPham(
		com.backend.migrate.vr.model.ViPham viPham) {
		return _viPhamLocalService.deleteViPham(viPham);
	}

	/**
	* Deletes the vi pham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vi pham
	* @return the vi pham that was removed
	* @throws PortalException if a vi pham with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.ViPham deleteViPham(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _viPhamLocalService.deleteViPham(id);
	}

	@Override
	public com.backend.migrate.vr.model.ViPham fetchViPham(long id) {
		return _viPhamLocalService.fetchViPham(id);
	}

	/**
	* Returns the vi pham with the primary key.
	*
	* @param id the primary key of the vi pham
	* @return the vi pham
	* @throws PortalException if a vi pham with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.ViPham getViPham(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _viPhamLocalService.getViPham(id);
	}

	/**
	* Updates the vi pham in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viPham the vi pham
	* @return the vi pham that was updated
	*/
	@Override
	public com.backend.migrate.vr.model.ViPham updateViPham(
		com.backend.migrate.vr.model.ViPham viPham) {
		return _viPhamLocalService.updateViPham(viPham);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _viPhamLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _viPhamLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _viPhamLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _viPhamLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _viPhamLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vi phams.
	*
	* @return the number of vi phams
	*/
	@Override
	public int getViPhamsCount() {
		return _viPhamLocalService.getViPhamsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _viPhamLocalService.getOSGiServiceIdentifier();
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
		return _viPhamLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _viPhamLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _viPhamLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.backend.migrate.vr.model.ViPham> getLastest(
		long id) {
		return _viPhamLocalService.getLastest(id);
	}

	@Override
	public java.util.List<com.backend.migrate.vr.model.ViPham> getListByPhuongTien(
		long phuongtien_id) {
		return _viPhamLocalService.getListByPhuongTien(phuongtien_id);
	}

	/**
	* Returns a range of all the vi phams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ViPhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vi phams
	* @param end the upper bound of the range of vi phams (not inclusive)
	* @return the range of vi phams
	*/
	@Override
	public java.util.List<com.backend.migrate.vr.model.ViPham> getViPhams(
		int start, int end) {
		return _viPhamLocalService.getViPhams(start, end);
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
		return _viPhamLocalService.dynamicQueryCount(dynamicQuery);
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
		return _viPhamLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ViPhamLocalService getWrappedService() {
		return _viPhamLocalService;
	}

	@Override
	public void setWrappedService(ViPhamLocalService viPhamLocalService) {
		_viPhamLocalService = viPhamLocalService;
	}

	private ViPhamLocalService _viPhamLocalService;
}