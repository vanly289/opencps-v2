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
 * Provides a wrapper for {@link SRCILHopDongThueLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SRCILHopDongThueLocalService
 * @generated
 */
@ProviderType
public class SRCILHopDongThueLocalServiceWrapper
	implements SRCILHopDongThueLocalService,
		ServiceWrapper<SRCILHopDongThueLocalService> {
	public SRCILHopDongThueLocalServiceWrapper(
		SRCILHopDongThueLocalService srcilHopDongThueLocalService) {
		_srcilHopDongThueLocalService = srcilHopDongThueLocalService;
	}

	/**
	* Adds the srcil hop dong thue to the database. Also notifies the appropriate model listeners.
	*
	* @param srcilHopDongThue the srcil hop dong thue
	* @return the srcil hop dong thue that was added
	*/
	@Override
	public com.backend.migrate.vr.model.SRCILHopDongThue addSRCILHopDongThue(
		com.backend.migrate.vr.model.SRCILHopDongThue srcilHopDongThue) {
		return _srcilHopDongThueLocalService.addSRCILHopDongThue(srcilHopDongThue);
	}

	/**
	* Creates a new srcil hop dong thue with the primary key. Does not add the srcil hop dong thue to the database.
	*
	* @param id the primary key for the new srcil hop dong thue
	* @return the new srcil hop dong thue
	*/
	@Override
	public com.backend.migrate.vr.model.SRCILHopDongThue createSRCILHopDongThue(
		long id) {
		return _srcilHopDongThueLocalService.createSRCILHopDongThue(id);
	}

	/**
	* Deletes the srcil hop dong thue from the database. Also notifies the appropriate model listeners.
	*
	* @param srcilHopDongThue the srcil hop dong thue
	* @return the srcil hop dong thue that was removed
	*/
	@Override
	public com.backend.migrate.vr.model.SRCILHopDongThue deleteSRCILHopDongThue(
		com.backend.migrate.vr.model.SRCILHopDongThue srcilHopDongThue) {
		return _srcilHopDongThueLocalService.deleteSRCILHopDongThue(srcilHopDongThue);
	}

	/**
	* Deletes the srcil hop dong thue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the srcil hop dong thue
	* @return the srcil hop dong thue that was removed
	* @throws PortalException if a srcil hop dong thue with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.SRCILHopDongThue deleteSRCILHopDongThue(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _srcilHopDongThueLocalService.deleteSRCILHopDongThue(id);
	}

	@Override
	public com.backend.migrate.vr.model.SRCILHopDongThue fetchSRCILHopDongThue(
		long id) {
		return _srcilHopDongThueLocalService.fetchSRCILHopDongThue(id);
	}

	/**
	* Returns the srcil hop dong thue with the primary key.
	*
	* @param id the primary key of the srcil hop dong thue
	* @return the srcil hop dong thue
	* @throws PortalException if a srcil hop dong thue with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.SRCILHopDongThue getSRCILHopDongThue(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _srcilHopDongThueLocalService.getSRCILHopDongThue(id);
	}

	/**
	* Updates the srcil hop dong thue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param srcilHopDongThue the srcil hop dong thue
	* @return the srcil hop dong thue that was updated
	*/
	@Override
	public com.backend.migrate.vr.model.SRCILHopDongThue updateSRCILHopDongThue(
		com.backend.migrate.vr.model.SRCILHopDongThue srcilHopDongThue) {
		return _srcilHopDongThueLocalService.updateSRCILHopDongThue(srcilHopDongThue);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _srcilHopDongThueLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _srcilHopDongThueLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _srcilHopDongThueLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _srcilHopDongThueLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _srcilHopDongThueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of srcil hop dong thues.
	*
	* @return the number of srcil hop dong thues
	*/
	@Override
	public int getSRCILHopDongThuesCount() {
		return _srcilHopDongThueLocalService.getSRCILHopDongThuesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _srcilHopDongThueLocalService.getOSGiServiceIdentifier();
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
		return _srcilHopDongThueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _srcilHopDongThueLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _srcilHopDongThueLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.backend.migrate.vr.model.SRCILHopDongThue> getLastest(
		long id) {
		return _srcilHopDongThueLocalService.getLastest(id);
	}

	/**
	* Returns a range of all the srcil hop dong thues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.SRCILHopDongThueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of srcil hop dong thues
	* @param end the upper bound of the range of srcil hop dong thues (not inclusive)
	* @return the range of srcil hop dong thues
	*/
	@Override
	public java.util.List<com.backend.migrate.vr.model.SRCILHopDongThue> getSRCILHopDongThues(
		int start, int end) {
		return _srcilHopDongThueLocalService.getSRCILHopDongThues(start, end);
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
		return _srcilHopDongThueLocalService.dynamicQueryCount(dynamicQuery);
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
		return _srcilHopDongThueLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public SRCILHopDongThueLocalService getWrappedService() {
		return _srcilHopDongThueLocalService;
	}

	@Override
	public void setWrappedService(
		SRCILHopDongThueLocalService srcilHopDongThueLocalService) {
		_srcilHopDongThueLocalService = srcilHopDongThueLocalService;
	}

	private SRCILHopDongThueLocalService _srcilHopDongThueLocalService;
}