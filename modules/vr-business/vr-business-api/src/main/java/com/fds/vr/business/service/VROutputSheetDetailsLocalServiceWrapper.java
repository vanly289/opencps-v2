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
 * Provides a wrapper for {@link VROutputSheetDetailsLocalService}.
 *
 * @author LamTV
 * @see VROutputSheetDetailsLocalService
 * @generated
 */
@ProviderType
public class VROutputSheetDetailsLocalServiceWrapper
	implements VROutputSheetDetailsLocalService,
		ServiceWrapper<VROutputSheetDetailsLocalService> {
	public VROutputSheetDetailsLocalServiceWrapper(
		VROutputSheetDetailsLocalService vrOutputSheetDetailsLocalService) {
		_vrOutputSheetDetailsLocalService = vrOutputSheetDetailsLocalService;
	}

	/**
	* Adds the vr output sheet details to the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was added
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheetDetails addVROutputSheetDetails(
		com.fds.vr.business.model.VROutputSheetDetails vrOutputSheetDetails) {
		return _vrOutputSheetDetailsLocalService.addVROutputSheetDetails(vrOutputSheetDetails);
	}

	/**
	* Creates a new vr output sheet details with the primary key. Does not add the vr output sheet details to the database.
	*
	* @param id the primary key for the new vr output sheet details
	* @return the new vr output sheet details
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheetDetails createVROutputSheetDetails(
		long id) {
		return _vrOutputSheetDetailsLocalService.createVROutputSheetDetails(id);
	}

	/**
	* Deletes the vr output sheet details from the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was removed
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheetDetails deleteVROutputSheetDetails(
		com.fds.vr.business.model.VROutputSheetDetails vrOutputSheetDetails) {
		return _vrOutputSheetDetailsLocalService.deleteVROutputSheetDetails(vrOutputSheetDetails);
	}

	/**
	* Deletes the vr output sheet details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details that was removed
	* @throws PortalException if a vr output sheet details with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheetDetails deleteVROutputSheetDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrOutputSheetDetailsLocalService.deleteVROutputSheetDetails(id);
	}

	@Override
	public com.fds.vr.business.model.VROutputSheetDetails fetchVROutputSheetDetails(
		long id) {
		return _vrOutputSheetDetailsLocalService.fetchVROutputSheetDetails(id);
	}

	/**
	* Returns the vr output sheet details with the primary key.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details
	* @throws PortalException if a vr output sheet details with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheetDetails getVROutputSheetDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrOutputSheetDetailsLocalService.getVROutputSheetDetails(id);
	}

	/**
	* Updates the vr output sheet details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was updated
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheetDetails updateVROutputSheetDetails(
		com.fds.vr.business.model.VROutputSheetDetails vrOutputSheetDetails) {
		return _vrOutputSheetDetailsLocalService.updateVROutputSheetDetails(vrOutputSheetDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrOutputSheetDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrOutputSheetDetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrOutputSheetDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrOutputSheetDetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrOutputSheetDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr output sheet detailses.
	*
	* @return the number of vr output sheet detailses
	*/
	@Override
	public int getVROutputSheetDetailsesCount() {
		return _vrOutputSheetDetailsLocalService.getVROutputSheetDetailsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrOutputSheetDetailsLocalService.getOSGiServiceIdentifier();
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
		return _vrOutputSheetDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrOutputSheetDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrOutputSheetDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of vr output sheet detailses
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VROutputSheetDetails> getVROutputSheetDetailses(
		int start, int end) {
		return _vrOutputSheetDetailsLocalService.getVROutputSheetDetailses(start,
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
		return _vrOutputSheetDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrOutputSheetDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VROutputSheetDetailsLocalService getWrappedService() {
		return _vrOutputSheetDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		VROutputSheetDetailsLocalService vrOutputSheetDetailsLocalService) {
		_vrOutputSheetDetailsLocalService = vrOutputSheetDetailsLocalService;
	}

	private VROutputSheetDetailsLocalService _vrOutputSheetDetailsLocalService;
}