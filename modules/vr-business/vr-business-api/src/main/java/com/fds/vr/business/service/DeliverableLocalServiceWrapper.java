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
 * Provides a wrapper for {@link DeliverableLocalService}.
 *
 * @author LamTV
 * @see DeliverableLocalService
 * @generated
 */
@ProviderType
public class DeliverableLocalServiceWrapper implements DeliverableLocalService,
	ServiceWrapper<DeliverableLocalService> {
	public DeliverableLocalServiceWrapper(
		DeliverableLocalService deliverableLocalService) {
		_deliverableLocalService = deliverableLocalService;
	}

	/**
	* Adds the deliverable to the database. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was added
	*/
	@Override
	public com.fds.vr.business.model.Deliverable addDeliverable(
		com.fds.vr.business.model.Deliverable deliverable) {
		return _deliverableLocalService.addDeliverable(deliverable);
	}

	/**
	* Creates a new deliverable with the primary key. Does not add the deliverable to the database.
	*
	* @param deliverableId the primary key for the new deliverable
	* @return the new deliverable
	*/
	@Override
	public com.fds.vr.business.model.Deliverable createDeliverable(
		long deliverableId) {
		return _deliverableLocalService.createDeliverable(deliverableId);
	}

	/**
	* Deletes the deliverable from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was removed
	*/
	@Override
	public com.fds.vr.business.model.Deliverable deleteDeliverable(
		com.fds.vr.business.model.Deliverable deliverable) {
		return _deliverableLocalService.deleteDeliverable(deliverable);
	}

	/**
	* Deletes the deliverable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverableId the primary key of the deliverable
	* @return the deliverable that was removed
	* @throws PortalException if a deliverable with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.Deliverable deleteDeliverable(
		long deliverableId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.deleteDeliverable(deliverableId);
	}

	@Override
	public com.fds.vr.business.model.Deliverable fetchDeliverable(
		long deliverableId) {
		return _deliverableLocalService.fetchDeliverable(deliverableId);
	}

	/**
	* Returns the deliverable matching the UUID and group.
	*
	* @param uuid the deliverable's UUID
	* @param groupId the primary key of the group
	* @return the matching deliverable, or <code>null</code> if a matching deliverable could not be found
	*/
	@Override
	public com.fds.vr.business.model.Deliverable fetchDeliverableByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _deliverableLocalService.fetchDeliverableByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the deliverable with the primary key.
	*
	* @param deliverableId the primary key of the deliverable
	* @return the deliverable
	* @throws PortalException if a deliverable with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.Deliverable getDeliverable(
		long deliverableId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.getDeliverable(deliverableId);
	}

	/**
	* Returns the deliverable matching the UUID and group.
	*
	* @param uuid the deliverable's UUID
	* @param groupId the primary key of the group
	* @return the matching deliverable
	* @throws PortalException if a matching deliverable could not be found
	*/
	@Override
	public com.fds.vr.business.model.Deliverable getDeliverableByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.getDeliverableByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the deliverable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was updated
	*/
	@Override
	public com.fds.vr.business.model.Deliverable updateDeliverable(
		com.fds.vr.business.model.Deliverable deliverable) {
		return _deliverableLocalService.updateDeliverable(deliverable);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _deliverableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _deliverableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _deliverableLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _deliverableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of deliverables.
	*
	* @return the number of deliverables
	*/
	@Override
	public int getDeliverablesCount() {
		return _deliverableLocalService.getDeliverablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _deliverableLocalService.getOSGiServiceIdentifier();
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
		return _deliverableLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.DeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _deliverableLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.DeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _deliverableLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.Deliverable> getDeliverableByModifiedDate(
		java.lang.String synsDate, java.lang.String deliverableType,
		long deliverableState) {
		return _deliverableLocalService.getDeliverableByModifiedDate(synsDate,
			deliverableType, deliverableState);
	}

	/**
	* Returns a range of all the deliverables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.DeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of deliverables
	* @param end the upper bound of the range of deliverables (not inclusive)
	* @return the range of deliverables
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.Deliverable> getDeliverables(
		int start, int end) {
		return _deliverableLocalService.getDeliverables(start, end);
	}

	/**
	* Returns all the deliverables matching the UUID and company.
	*
	* @param uuid the UUID of the deliverables
	* @param companyId the primary key of the company
	* @return the matching deliverables, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.Deliverable> getDeliverablesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _deliverableLocalService.getDeliverablesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of deliverables matching the UUID and company.
	*
	* @param uuid the UUID of the deliverables
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of deliverables
	* @param end the upper bound of the range of deliverables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching deliverables, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.Deliverable> getDeliverablesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.fds.vr.business.model.Deliverable> orderByComparator) {
		return _deliverableLocalService.getDeliverablesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _deliverableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _deliverableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public DeliverableLocalService getWrappedService() {
		return _deliverableLocalService;
	}

	@Override
	public void setWrappedService(
		DeliverableLocalService deliverableLocalService) {
		_deliverableLocalService = deliverableLocalService;
	}

	private DeliverableLocalService _deliverableLocalService;
}