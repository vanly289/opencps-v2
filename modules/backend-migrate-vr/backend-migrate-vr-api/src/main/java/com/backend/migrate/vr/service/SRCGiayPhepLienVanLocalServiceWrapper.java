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
 * Provides a wrapper for {@link SRCGiayPhepLienVanLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SRCGiayPhepLienVanLocalService
 * @generated
 */
@ProviderType
public class SRCGiayPhepLienVanLocalServiceWrapper
	implements SRCGiayPhepLienVanLocalService,
		ServiceWrapper<SRCGiayPhepLienVanLocalService> {
	public SRCGiayPhepLienVanLocalServiceWrapper(
		SRCGiayPhepLienVanLocalService srcGiayPhepLienVanLocalService) {
		_srcGiayPhepLienVanLocalService = srcGiayPhepLienVanLocalService;
	}

	/**
	* Adds the src giay phep lien van to the database. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepLienVan the src giay phep lien van
	* @return the src giay phep lien van that was added
	*/
	@Override
	public com.backend.migrate.vr.model.SRCGiayPhepLienVan addSRCGiayPhepLienVan(
		com.backend.migrate.vr.model.SRCGiayPhepLienVan srcGiayPhepLienVan) {
		return _srcGiayPhepLienVanLocalService.addSRCGiayPhepLienVan(srcGiayPhepLienVan);
	}

	/**
	* Creates a new src giay phep lien van with the primary key. Does not add the src giay phep lien van to the database.
	*
	* @param id the primary key for the new src giay phep lien van
	* @return the new src giay phep lien van
	*/
	@Override
	public com.backend.migrate.vr.model.SRCGiayPhepLienVan createSRCGiayPhepLienVan(
		long id) {
		return _srcGiayPhepLienVanLocalService.createSRCGiayPhepLienVan(id);
	}

	/**
	* Deletes the src giay phep lien van from the database. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepLienVan the src giay phep lien van
	* @return the src giay phep lien van that was removed
	*/
	@Override
	public com.backend.migrate.vr.model.SRCGiayPhepLienVan deleteSRCGiayPhepLienVan(
		com.backend.migrate.vr.model.SRCGiayPhepLienVan srcGiayPhepLienVan) {
		return _srcGiayPhepLienVanLocalService.deleteSRCGiayPhepLienVan(srcGiayPhepLienVan);
	}

	/**
	* Deletes the src giay phep lien van with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the src giay phep lien van
	* @return the src giay phep lien van that was removed
	* @throws PortalException if a src giay phep lien van with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.SRCGiayPhepLienVan deleteSRCGiayPhepLienVan(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _srcGiayPhepLienVanLocalService.deleteSRCGiayPhepLienVan(id);
	}

	@Override
	public com.backend.migrate.vr.model.SRCGiayPhepLienVan fetchSRCGiayPhepLienVan(
		long id) {
		return _srcGiayPhepLienVanLocalService.fetchSRCGiayPhepLienVan(id);
	}

	/**
	* Returns the src giay phep lien van with the primary key.
	*
	* @param id the primary key of the src giay phep lien van
	* @return the src giay phep lien van
	* @throws PortalException if a src giay phep lien van with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.SRCGiayPhepLienVan getSRCGiayPhepLienVan(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _srcGiayPhepLienVanLocalService.getSRCGiayPhepLienVan(id);
	}

	/**
	* Updates the src giay phep lien van in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param srcGiayPhepLienVan the src giay phep lien van
	* @return the src giay phep lien van that was updated
	*/
	@Override
	public com.backend.migrate.vr.model.SRCGiayPhepLienVan updateSRCGiayPhepLienVan(
		com.backend.migrate.vr.model.SRCGiayPhepLienVan srcGiayPhepLienVan) {
		return _srcGiayPhepLienVanLocalService.updateSRCGiayPhepLienVan(srcGiayPhepLienVan);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _srcGiayPhepLienVanLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _srcGiayPhepLienVanLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _srcGiayPhepLienVanLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _srcGiayPhepLienVanLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _srcGiayPhepLienVanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of src giay phep lien vans.
	*
	* @return the number of src giay phep lien vans
	*/
	@Override
	public int getSRCGiayPhepLienVansCount() {
		return _srcGiayPhepLienVanLocalService.getSRCGiayPhepLienVansCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _srcGiayPhepLienVanLocalService.getOSGiServiceIdentifier();
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
		return _srcGiayPhepLienVanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _srcGiayPhepLienVanLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _srcGiayPhepLienVanLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.backend.migrate.vr.model.SRCGiayPhepLienVan> getLastest(
		long currentId) {
		return _srcGiayPhepLienVanLocalService.getLastest(currentId);
	}

	/**
	* Returns a range of all the src giay phep lien vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCGiayPhepLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of src giay phep lien vans
	* @param end the upper bound of the range of src giay phep lien vans (not inclusive)
	* @return the range of src giay phep lien vans
	*/
	@Override
	public java.util.List<com.backend.migrate.vr.model.SRCGiayPhepLienVan> getSRCGiayPhepLienVans(
		int start, int end) {
		return _srcGiayPhepLienVanLocalService.getSRCGiayPhepLienVans(start, end);
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
		return _srcGiayPhepLienVanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _srcGiayPhepLienVanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public SRCGiayPhepLienVanLocalService getWrappedService() {
		return _srcGiayPhepLienVanLocalService;
	}

	@Override
	public void setWrappedService(
		SRCGiayPhepLienVanLocalService srcGiayPhepLienVanLocalService) {
		_srcGiayPhepLienVanLocalService = srcGiayPhepLienVanLocalService;
	}

	private SRCGiayPhepLienVanLocalService _srcGiayPhepLienVanLocalService;
}