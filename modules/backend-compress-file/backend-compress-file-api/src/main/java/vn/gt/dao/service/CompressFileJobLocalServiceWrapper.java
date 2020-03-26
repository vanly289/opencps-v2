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

package vn.gt.dao.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompressFileJobLocalService}.
 *
 * @author huymq
 * @see CompressFileJobLocalService
 * @generated
 */
@ProviderType
public class CompressFileJobLocalServiceWrapper
	implements CompressFileJobLocalService,
		ServiceWrapper<CompressFileJobLocalService> {
	public CompressFileJobLocalServiceWrapper(
		CompressFileJobLocalService compressFileJobLocalService) {
		_compressFileJobLocalService = compressFileJobLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _compressFileJobLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _compressFileJobLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _compressFileJobLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _compressFileJobLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _compressFileJobLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of compress file jobs.
	*
	* @return the number of compress file jobs
	*/
	@Override
	public int getCompressFileJobsCount() {
		return _compressFileJobLocalService.getCompressFileJobsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _compressFileJobLocalService.getOSGiServiceIdentifier();
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
		return _compressFileJobLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gt.dao.model.impl.CompressFileJobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _compressFileJobLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gt.dao.model.impl.CompressFileJobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _compressFileJobLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the compress file jobs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gt.dao.model.impl.CompressFileJobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compress file jobs
	* @param end the upper bound of the range of compress file jobs (not inclusive)
	* @return the range of compress file jobs
	*/
	@Override
	public java.util.List<vn.gt.dao.model.CompressFileJob> getCompressFileJobs(
		int start, int end) {
		return _compressFileJobLocalService.getCompressFileJobs(start, end);
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
		return _compressFileJobLocalService.dynamicQueryCount(dynamicQuery);
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
		return _compressFileJobLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public long getLastedHoSoId()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compressFileJobLocalService.getLastedHoSoId();
	}

	/**
	* Adds the compress file job to the database. Also notifies the appropriate model listeners.
	*
	* @param compressFileJob the compress file job
	* @return the compress file job that was added
	*/
	@Override
	public vn.gt.dao.model.CompressFileJob addCompressFileJob(
		vn.gt.dao.model.CompressFileJob compressFileJob) {
		return _compressFileJobLocalService.addCompressFileJob(compressFileJob);
	}

	@Override
	public vn.gt.dao.model.CompressFileJob addJob(
		java.util.List<org.opencps.dossiermgt.model.Dossier> listHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compressFileJobLocalService.addJob(listHoSo);
	}

	/**
	* Creates a new compress file job with the primary key. Does not add the compress file job to the database.
	*
	* @param id the primary key for the new compress file job
	* @return the new compress file job
	*/
	@Override
	public vn.gt.dao.model.CompressFileJob createCompressFileJob(long id) {
		return _compressFileJobLocalService.createCompressFileJob(id);
	}

	/**
	* Deletes the compress file job with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the compress file job
	* @return the compress file job that was removed
	* @throws PortalException if a compress file job with the primary key could not be found
	*/
	@Override
	public vn.gt.dao.model.CompressFileJob deleteCompressFileJob(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _compressFileJobLocalService.deleteCompressFileJob(id);
	}

	/**
	* Deletes the compress file job from the database. Also notifies the appropriate model listeners.
	*
	* @param compressFileJob the compress file job
	* @return the compress file job that was removed
	*/
	@Override
	public vn.gt.dao.model.CompressFileJob deleteCompressFileJob(
		vn.gt.dao.model.CompressFileJob compressFileJob) {
		return _compressFileJobLocalService.deleteCompressFileJob(compressFileJob);
	}

	@Override
	public vn.gt.dao.model.CompressFileJob fetchCompressFileJob(long id) {
		return _compressFileJobLocalService.fetchCompressFileJob(id);
	}

	/**
	* Returns the compress file job with the primary key.
	*
	* @param id the primary key of the compress file job
	* @return the compress file job
	* @throws PortalException if a compress file job with the primary key could not be found
	*/
	@Override
	public vn.gt.dao.model.CompressFileJob getCompressFileJob(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _compressFileJobLocalService.getCompressFileJob(id);
	}

	@Override
	public vn.gt.dao.model.CompressFileJob updateCompressFileJob(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _compressFileJobLocalService.updateCompressFileJob(id);
	}

	/**
	* Updates the compress file job in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param compressFileJob the compress file job
	* @return the compress file job that was updated
	*/
	@Override
	public vn.gt.dao.model.CompressFileJob updateCompressFileJob(
		vn.gt.dao.model.CompressFileJob compressFileJob) {
		return _compressFileJobLocalService.updateCompressFileJob(compressFileJob);
	}

	@Override
	public CompressFileJobLocalService getWrappedService() {
		return _compressFileJobLocalService;
	}

	@Override
	public void setWrappedService(
		CompressFileJobLocalService compressFileJobLocalService) {
		_compressFileJobLocalService = compressFileJobLocalService;
	}

	private CompressFileJobLocalService _compressFileJobLocalService;
}