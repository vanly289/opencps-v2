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
 * Provides a wrapper for {@link PhuHieuBienHieuLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PhuHieuBienHieuLocalService
 * @generated
 */
@ProviderType
public class PhuHieuBienHieuLocalServiceWrapper
	implements PhuHieuBienHieuLocalService,
		ServiceWrapper<PhuHieuBienHieuLocalService> {
	public PhuHieuBienHieuLocalServiceWrapper(
		PhuHieuBienHieuLocalService phuHieuBienHieuLocalService) {
		_phuHieuBienHieuLocalService = phuHieuBienHieuLocalService;
	}

	/**
	* Adds the phu hieu bien hieu to the database. Also notifies the appropriate model listeners.
	*
	* @param phuHieuBienHieu the phu hieu bien hieu
	* @return the phu hieu bien hieu that was added
	*/
	@Override
	public com.backend.migrate.vr.model.PhuHieuBienHieu addPhuHieuBienHieu(
		com.backend.migrate.vr.model.PhuHieuBienHieu phuHieuBienHieu) {
		return _phuHieuBienHieuLocalService.addPhuHieuBienHieu(phuHieuBienHieu);
	}

	/**
	* Creates a new phu hieu bien hieu with the primary key. Does not add the phu hieu bien hieu to the database.
	*
	* @param id the primary key for the new phu hieu bien hieu
	* @return the new phu hieu bien hieu
	*/
	@Override
	public com.backend.migrate.vr.model.PhuHieuBienHieu createPhuHieuBienHieu(
		long id) {
		return _phuHieuBienHieuLocalService.createPhuHieuBienHieu(id);
	}

	/**
	* Deletes the phu hieu bien hieu from the database. Also notifies the appropriate model listeners.
	*
	* @param phuHieuBienHieu the phu hieu bien hieu
	* @return the phu hieu bien hieu that was removed
	*/
	@Override
	public com.backend.migrate.vr.model.PhuHieuBienHieu deletePhuHieuBienHieu(
		com.backend.migrate.vr.model.PhuHieuBienHieu phuHieuBienHieu) {
		return _phuHieuBienHieuLocalService.deletePhuHieuBienHieu(phuHieuBienHieu);
	}

	/**
	* Deletes the phu hieu bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phu hieu bien hieu
	* @return the phu hieu bien hieu that was removed
	* @throws PortalException if a phu hieu bien hieu with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.PhuHieuBienHieu deletePhuHieuBienHieu(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _phuHieuBienHieuLocalService.deletePhuHieuBienHieu(id);
	}

	@Override
	public com.backend.migrate.vr.model.PhuHieuBienHieu fetchPhuHieuBienHieu(
		long id) {
		return _phuHieuBienHieuLocalService.fetchPhuHieuBienHieu(id);
	}

	/**
	* Returns the phu hieu bien hieu with the primary key.
	*
	* @param id the primary key of the phu hieu bien hieu
	* @return the phu hieu bien hieu
	* @throws PortalException if a phu hieu bien hieu with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.PhuHieuBienHieu getPhuHieuBienHieu(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _phuHieuBienHieuLocalService.getPhuHieuBienHieu(id);
	}

	/**
	* Updates the phu hieu bien hieu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phuHieuBienHieu the phu hieu bien hieu
	* @return the phu hieu bien hieu that was updated
	*/
	@Override
	public com.backend.migrate.vr.model.PhuHieuBienHieu updatePhuHieuBienHieu(
		com.backend.migrate.vr.model.PhuHieuBienHieu phuHieuBienHieu) {
		return _phuHieuBienHieuLocalService.updatePhuHieuBienHieu(phuHieuBienHieu);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _phuHieuBienHieuLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phuHieuBienHieuLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _phuHieuBienHieuLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _phuHieuBienHieuLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _phuHieuBienHieuLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of phu hieu bien hieus.
	*
	* @return the number of phu hieu bien hieus
	*/
	@Override
	public int getPhuHieuBienHieusCount() {
		return _phuHieuBienHieuLocalService.getPhuHieuBienHieusCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _phuHieuBienHieuLocalService.getOSGiServiceIdentifier();
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
		return _phuHieuBienHieuLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phuHieuBienHieuLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phuHieuBienHieuLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.backend.migrate.vr.model.PhuHieuBienHieu> getListByPhuongTien(
		long phuongtien_id) {
		return _phuHieuBienHieuLocalService.getListByPhuongTien(phuongtien_id);
	}

	/**
	* Returns a range of all the phu hieu bien hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.PhuHieuBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phu hieu bien hieus
	* @param end the upper bound of the range of phu hieu bien hieus (not inclusive)
	* @return the range of phu hieu bien hieus
	*/
	@Override
	public java.util.List<com.backend.migrate.vr.model.PhuHieuBienHieu> getPhuHieuBienHieus(
		int start, int end) {
		return _phuHieuBienHieuLocalService.getPhuHieuBienHieus(start, end);
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
		return _phuHieuBienHieuLocalService.dynamicQueryCount(dynamicQuery);
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
		return _phuHieuBienHieuLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public PhuHieuBienHieuLocalService getWrappedService() {
		return _phuHieuBienHieuLocalService;
	}

	@Override
	public void setWrappedService(
		PhuHieuBienHieuLocalService phuHieuBienHieuLocalService) {
		_phuHieuBienHieuLocalService = phuHieuBienHieuLocalService;
	}

	private PhuHieuBienHieuLocalService _phuHieuBienHieuLocalService;
}