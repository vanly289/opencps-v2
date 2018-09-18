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
 * Provides a wrapper for {@link PhuongTienLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PhuongTienLocalService
 * @generated
 */
@ProviderType
public class PhuongTienLocalServiceWrapper implements PhuongTienLocalService,
	ServiceWrapper<PhuongTienLocalService> {
	public PhuongTienLocalServiceWrapper(
		PhuongTienLocalService phuongTienLocalService) {
		_phuongTienLocalService = phuongTienLocalService;
	}

	/**
	* Adds the phuong tien to the database. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was added
	*/
	@Override
	public com.backend.migrate.vr.model.PhuongTien addPhuongTien(
		com.backend.migrate.vr.model.PhuongTien phuongTien) {
		return _phuongTienLocalService.addPhuongTien(phuongTien);
	}

	/**
	* Creates a new phuong tien with the primary key. Does not add the phuong tien to the database.
	*
	* @param id the primary key for the new phuong tien
	* @return the new phuong tien
	*/
	@Override
	public com.backend.migrate.vr.model.PhuongTien createPhuongTien(long id) {
		return _phuongTienLocalService.createPhuongTien(id);
	}

	/**
	* Deletes the phuong tien from the database. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was removed
	*/
	@Override
	public com.backend.migrate.vr.model.PhuongTien deletePhuongTien(
		com.backend.migrate.vr.model.PhuongTien phuongTien) {
		return _phuongTienLocalService.deletePhuongTien(phuongTien);
	}

	/**
	* Deletes the phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien that was removed
	* @throws PortalException if a phuong tien with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.PhuongTien deletePhuongTien(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _phuongTienLocalService.deletePhuongTien(id);
	}

	@Override
	public com.backend.migrate.vr.model.PhuongTien fetchPhuongTien(long id) {
		return _phuongTienLocalService.fetchPhuongTien(id);
	}

	/**
	* Returns the phuong tien with the primary key.
	*
	* @param id the primary key of the phuong tien
	* @return the phuong tien
	* @throws PortalException if a phuong tien with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.PhuongTien getPhuongTien(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _phuongTienLocalService.getPhuongTien(id);
	}

	/**
	* Updates the phuong tien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phuongTien the phuong tien
	* @return the phuong tien that was updated
	*/
	@Override
	public com.backend.migrate.vr.model.PhuongTien updatePhuongTien(
		com.backend.migrate.vr.model.PhuongTien phuongTien) {
		return _phuongTienLocalService.updatePhuongTien(phuongTien);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _phuongTienLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phuongTienLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _phuongTienLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _phuongTienLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _phuongTienLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of phuong tiens.
	*
	* @return the number of phuong tiens
	*/
	@Override
	public int getPhuongTiensCount() {
		return _phuongTienLocalService.getPhuongTiensCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _phuongTienLocalService.getOSGiServiceIdentifier();
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
		return _phuongTienLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phuongTienLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phuongTienLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phuong tiens
	* @param end the upper bound of the range of phuong tiens (not inclusive)
	* @return the range of phuong tiens
	*/
	@Override
	public java.util.List<com.backend.migrate.vr.model.PhuongTien> getPhuongTiens(
		int start, int end) {
		return _phuongTienLocalService.getPhuongTiens(start, end);
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
		return _phuongTienLocalService.dynamicQueryCount(dynamicQuery);
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
		return _phuongTienLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public PhuongTienLocalService getWrappedService() {
		return _phuongTienLocalService;
	}

	@Override
	public void setWrappedService(PhuongTienLocalService phuongTienLocalService) {
		_phuongTienLocalService = phuongTienLocalService;
	}

	private PhuongTienLocalService _phuongTienLocalService;
}