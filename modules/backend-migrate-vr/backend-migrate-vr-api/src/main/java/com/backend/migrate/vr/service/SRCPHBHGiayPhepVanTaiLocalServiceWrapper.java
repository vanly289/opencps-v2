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
 * Provides a wrapper for {@link SRCPHBHGiayPhepVanTaiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SRCPHBHGiayPhepVanTaiLocalService
 * @generated
 */
@ProviderType
public class SRCPHBHGiayPhepVanTaiLocalServiceWrapper
	implements SRCPHBHGiayPhepVanTaiLocalService,
		ServiceWrapper<SRCPHBHGiayPhepVanTaiLocalService> {
	public SRCPHBHGiayPhepVanTaiLocalServiceWrapper(
		SRCPHBHGiayPhepVanTaiLocalService srcphbhGiayPhepVanTaiLocalService) {
		_srcphbhGiayPhepVanTaiLocalService = srcphbhGiayPhepVanTaiLocalService;
	}

	/**
	* Adds the srcphbh giay phep van tai to the database. Also notifies the appropriate model listeners.
	*
	* @param srcphbhGiayPhepVanTai the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai that was added
	*/
	@Override
	public com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai addSRCPHBHGiayPhepVanTai(
		com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		return _srcphbhGiayPhepVanTaiLocalService.addSRCPHBHGiayPhepVanTai(srcphbhGiayPhepVanTai);
	}

	/**
	* Creates a new srcphbh giay phep van tai with the primary key. Does not add the srcphbh giay phep van tai to the database.
	*
	* @param id the primary key for the new srcphbh giay phep van tai
	* @return the new srcphbh giay phep van tai
	*/
	@Override
	public com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai createSRCPHBHGiayPhepVanTai(
		long id) {
		return _srcphbhGiayPhepVanTaiLocalService.createSRCPHBHGiayPhepVanTai(id);
	}

	/**
	* Deletes the srcphbh giay phep van tai from the database. Also notifies the appropriate model listeners.
	*
	* @param srcphbhGiayPhepVanTai the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai that was removed
	*/
	@Override
	public com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai deleteSRCPHBHGiayPhepVanTai(
		com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		return _srcphbhGiayPhepVanTaiLocalService.deleteSRCPHBHGiayPhepVanTai(srcphbhGiayPhepVanTai);
	}

	/**
	* Deletes the srcphbh giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai that was removed
	* @throws PortalException if a srcphbh giay phep van tai with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai deleteSRCPHBHGiayPhepVanTai(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _srcphbhGiayPhepVanTaiLocalService.deleteSRCPHBHGiayPhepVanTai(id);
	}

	@Override
	public com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai fetchSRCPHBHGiayPhepVanTai(
		long id) {
		return _srcphbhGiayPhepVanTaiLocalService.fetchSRCPHBHGiayPhepVanTai(id);
	}

	/**
	* Returns the srcphbh giay phep van tai with the primary key.
	*
	* @param id the primary key of the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai
	* @throws PortalException if a srcphbh giay phep van tai with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai getSRCPHBHGiayPhepVanTai(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _srcphbhGiayPhepVanTaiLocalService.getSRCPHBHGiayPhepVanTai(id);
	}

	/**
	* Updates the srcphbh giay phep van tai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param srcphbhGiayPhepVanTai the srcphbh giay phep van tai
	* @return the srcphbh giay phep van tai that was updated
	*/
	@Override
	public com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai updateSRCPHBHGiayPhepVanTai(
		com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai srcphbhGiayPhepVanTai) {
		return _srcphbhGiayPhepVanTaiLocalService.updateSRCPHBHGiayPhepVanTai(srcphbhGiayPhepVanTai);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _srcphbhGiayPhepVanTaiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _srcphbhGiayPhepVanTaiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _srcphbhGiayPhepVanTaiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _srcphbhGiayPhepVanTaiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _srcphbhGiayPhepVanTaiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of srcphbh giay phep van tais.
	*
	* @return the number of srcphbh giay phep van tais
	*/
	@Override
	public int getSRCPHBHGiayPhepVanTaisCount() {
		return _srcphbhGiayPhepVanTaiLocalService.getSRCPHBHGiayPhepVanTaisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _srcphbhGiayPhepVanTaiLocalService.getOSGiServiceIdentifier();
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
		return _srcphbhGiayPhepVanTaiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _srcphbhGiayPhepVanTaiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _srcphbhGiayPhepVanTaiLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai> getLastest(
		long id) {
		return _srcphbhGiayPhepVanTaiLocalService.getLastest(id);
	}

	/**
	* Returns a range of all the srcphbh giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCPHBHGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of srcphbh giay phep van tais
	* @param end the upper bound of the range of srcphbh giay phep van tais (not inclusive)
	* @return the range of srcphbh giay phep van tais
	*/
	@Override
	public java.util.List<com.backend.migrate.vr.model.SRCPHBHGiayPhepVanTai> getSRCPHBHGiayPhepVanTais(
		int start, int end) {
		return _srcphbhGiayPhepVanTaiLocalService.getSRCPHBHGiayPhepVanTais(start,
			end);
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
		return _srcphbhGiayPhepVanTaiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _srcphbhGiayPhepVanTaiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public SRCPHBHGiayPhepVanTaiLocalService getWrappedService() {
		return _srcphbhGiayPhepVanTaiLocalService;
	}

	@Override
	public void setWrappedService(
		SRCPHBHGiayPhepVanTaiLocalService srcphbhGiayPhepVanTaiLocalService) {
		_srcphbhGiayPhepVanTaiLocalService = srcphbhGiayPhepVanTaiLocalService;
	}

	private SRCPHBHGiayPhepVanTaiLocalService _srcphbhGiayPhepVanTaiLocalService;
}