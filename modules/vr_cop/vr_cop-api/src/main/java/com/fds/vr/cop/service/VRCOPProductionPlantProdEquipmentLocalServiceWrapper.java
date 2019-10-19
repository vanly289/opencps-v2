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

package com.fds.vr.cop.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VRCOPProductionPlantProdEquipmentLocalService}.
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantProdEquipmentLocalService
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantProdEquipmentLocalServiceWrapper
	implements VRCOPProductionPlantProdEquipmentLocalService,
		ServiceWrapper<VRCOPProductionPlantProdEquipmentLocalService> {
	public VRCOPProductionPlantProdEquipmentLocalServiceWrapper(
		VRCOPProductionPlantProdEquipmentLocalService vrcopProductionPlantProdEquipmentLocalService) {
		_vrcopProductionPlantProdEquipmentLocalService = vrcopProductionPlantProdEquipmentLocalService;
	}

	/**
	* Adds the vrcop production plant prod equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantProdEquipment the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was added
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment addVRCOPProductionPlantProdEquipment(
		com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return _vrcopProductionPlantProdEquipmentLocalService.addVRCOPProductionPlantProdEquipment(vrcopProductionPlantProdEquipment);
	}

	/**
	* Creates a new vrcop production plant prod equipment with the primary key. Does not add the vrcop production plant prod equipment to the database.
	*
	* @param id the primary key for the new vrcop production plant prod equipment
	* @return the new vrcop production plant prod equipment
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment createVRCOPProductionPlantProdEquipment(
		long id) {
		return _vrcopProductionPlantProdEquipmentLocalService.createVRCOPProductionPlantProdEquipment(id);
	}

	/**
	* Deletes the vrcop production plant prod equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantProdEquipment the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was removed
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment deleteVRCOPProductionPlantProdEquipment(
		com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return _vrcopProductionPlantProdEquipmentLocalService.deleteVRCOPProductionPlantProdEquipment(vrcopProductionPlantProdEquipment);
	}

	/**
	* Deletes the vrcop production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was removed
	* @throws PortalException if a vrcop production plant prod equipment with the primary key could not be found
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment deleteVRCOPProductionPlantProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductionPlantProdEquipmentLocalService.deleteVRCOPProductionPlantProdEquipment(id);
	}

	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment fetchVRCOPProductionPlantProdEquipment(
		long id) {
		return _vrcopProductionPlantProdEquipmentLocalService.fetchVRCOPProductionPlantProdEquipment(id);
	}

	/**
	* Returns the vrcop production plant prod equipment with the primary key.
	*
	* @param id the primary key of the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment
	* @throws PortalException if a vrcop production plant prod equipment with the primary key could not be found
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment getVRCOPProductionPlantProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductionPlantProdEquipmentLocalService.getVRCOPProductionPlantProdEquipment(id);
	}

	/**
	* Updates the vrcop production plant prod equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantProdEquipment the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was updated
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment updateVRCOPProductionPlantProdEquipment(
		com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return _vrcopProductionPlantProdEquipmentLocalService.updateVRCOPProductionPlantProdEquipment(vrcopProductionPlantProdEquipment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrcopProductionPlantProdEquipmentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrcopProductionPlantProdEquipmentLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrcopProductionPlantProdEquipmentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductionPlantProdEquipmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductionPlantProdEquipmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vrcop production plant prod equipments.
	*
	* @return the number of vrcop production plant prod equipments
	*/
	@Override
	public int getVRCOPProductionPlantProdEquipmentsCount() {
		return _vrcopProductionPlantProdEquipmentLocalService.getVRCOPProductionPlantProdEquipmentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrcopProductionPlantProdEquipmentLocalService.getOSGiServiceIdentifier();
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
		return _vrcopProductionPlantProdEquipmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrcopProductionPlantProdEquipmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrcopProductionPlantProdEquipmentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.cop.xmlmodel.VRCOPProductionPlantProdEquipmentModel> getListBy(
		java.lang.String COPReportNo) {
		return _vrcopProductionPlantProdEquipmentLocalService.getListBy(COPReportNo);
	}

	/**
	* Returns a range of all the vrcop production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant prod equipments
	* @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	* @return the range of vrcop production plant prod equipments
	*/
	@Override
	public java.util.List<com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment> getVRCOPProductionPlantProdEquipments(
		int start, int end) {
		return _vrcopProductionPlantProdEquipmentLocalService.getVRCOPProductionPlantProdEquipments(start,
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
		return _vrcopProductionPlantProdEquipmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrcopProductionPlantProdEquipmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRCOPProductionPlantProdEquipmentLocalService getWrappedService() {
		return _vrcopProductionPlantProdEquipmentLocalService;
	}

	@Override
	public void setWrappedService(
		VRCOPProductionPlantProdEquipmentLocalService vrcopProductionPlantProdEquipmentLocalService) {
		_vrcopProductionPlantProdEquipmentLocalService = vrcopProductionPlantProdEquipmentLocalService;
	}

	private VRCOPProductionPlantProdEquipmentLocalService _vrcopProductionPlantProdEquipmentLocalService;
}