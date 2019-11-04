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
 * Provides a wrapper for {@link ILCertificateLocalService}.
 *
 * @author LamTV
 * @see ILCertificateLocalService
 * @generated
 */
@ProviderType
public class ILCertificateLocalServiceWrapper
	implements ILCertificateLocalService,
		ServiceWrapper<ILCertificateLocalService> {
	public ILCertificateLocalServiceWrapper(
		ILCertificateLocalService ilCertificateLocalService) {
		_ilCertificateLocalService = ilCertificateLocalService;
	}

	@Override
	public com.fds.vr.business.model.ILCertificate addCertificate(
		com.liferay.portal.kernel.json.JSONObject jsonData,
		org.opencps.dossiermgt.model.Dossier dossier, long dossierFileId,
		java.lang.String dossierTemplateNo, java.lang.String dossierPartNo,
		java.lang.String fileTemplateNo, java.lang.String referenceUid,
		long doanhnghiepid, long vehicleid) {
		return _ilCertificateLocalService.addCertificate(jsonData, dossier,
			dossierFileId, dossierTemplateNo, dossierPartNo, fileTemplateNo,
			referenceUid, doanhnghiepid, vehicleid);
	}

	/**
	* Adds the il certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was added
	*/
	@Override
	public com.fds.vr.business.model.ILCertificate addILCertificate(
		com.fds.vr.business.model.ILCertificate ilCertificate) {
		return _ilCertificateLocalService.addILCertificate(ilCertificate);
	}

	/**
	* Creates a new il certificate with the primary key. Does not add the il certificate to the database.
	*
	* @param id the primary key for the new il certificate
	* @return the new il certificate
	*/
	@Override
	public com.fds.vr.business.model.ILCertificate createILCertificate(long id) {
		return _ilCertificateLocalService.createILCertificate(id);
	}

	/**
	* Deletes the il certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was removed
	*/
	@Override
	public com.fds.vr.business.model.ILCertificate deleteILCertificate(
		com.fds.vr.business.model.ILCertificate ilCertificate) {
		return _ilCertificateLocalService.deleteILCertificate(ilCertificate);
	}

	/**
	* Deletes the il certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate that was removed
	* @throws PortalException if a il certificate with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.ILCertificate deleteILCertificate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilCertificateLocalService.deleteILCertificate(id);
	}

	@Override
	public com.fds.vr.business.model.ILCertificate fetchByDossierFileId(
		long dossierFileId) {
		return _ilCertificateLocalService.fetchByDossierFileId(dossierFileId);
	}

	@Override
	public com.fds.vr.business.model.ILCertificate fetchByLicenceNo(
		java.lang.String licenceNo)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilCertificateLocalService.fetchByLicenceNo(licenceNo);
	}

	@Override
	public com.fds.vr.business.model.ILCertificate fetchILCertificate(long id) {
		return _ilCertificateLocalService.fetchILCertificate(id);
	}

	/**
	* Returns the il certificate with the primary key.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate
	* @throws PortalException if a il certificate with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.ILCertificate getILCertificate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilCertificateLocalService.getILCertificate(id);
	}

	@Override
	public com.fds.vr.business.model.ILCertificate searchByRegNumbber(
		java.lang.String keyword) {
		return _ilCertificateLocalService.searchByRegNumbber(keyword);
	}

	@Override
	public com.fds.vr.business.model.ILCertificate updateCertificate(
		com.liferay.portal.kernel.json.JSONObject jsonData, long dossierFileId) {
		return _ilCertificateLocalService.updateCertificate(jsonData,
			dossierFileId);
	}

	/**
	* Updates the il certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was updated
	*/
	@Override
	public com.fds.vr.business.model.ILCertificate updateILCertificate(
		com.fds.vr.business.model.ILCertificate ilCertificate) {
		return _ilCertificateLocalService.updateILCertificate(ilCertificate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ilCertificateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ilCertificateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ilCertificateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilCertificateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilCertificateLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByDossierFileId(long dossierFileId) {
		return _ilCertificateLocalService.countByDossierFileId(dossierFileId);
	}

	@Override
	public int countByServiceCode(java.lang.String govAgencyCode,
		java.lang.String[] serviceCodes, java.util.Date fromDate,
		java.util.Date toDate) {
		return _ilCertificateLocalService.countByServiceCode(govAgencyCode,
			serviceCodes, fromDate, toDate);
	}

	/**
	* Returns the number of il certificates.
	*
	* @return the number of il certificates
	*/
	@Override
	public int getILCertificatesCount() {
		return _ilCertificateLocalService.getILCertificatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ilCertificateLocalService.getOSGiServiceIdentifier();
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
		return _ilCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ilCertificateLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ilCertificateLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILCertificate> getAllCertificate() {
		return _ilCertificateLocalService.getAllCertificate();
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILCertificate> getByApplicant(
		java.lang.String serviceCode, java.lang.String applicant) {
		return _ilCertificateLocalService.getByApplicant(serviceCode, applicant);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILCertificate> getCertByValidFrom(
		java.lang.String serviceCode, java.lang.String applicant,
		java.lang.String regSearch) {
		return _ilCertificateLocalService.getCertByValidFrom(serviceCode,
			applicant, regSearch);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILCertificate> getDocAcceptList(
		java.lang.String keywords, java.lang.String serviceCode,
		java.lang.String govAgencyCode, java.lang.String routeCode,
		java.lang.String fromDate, java.lang.String toDate, int start, int limit) {
		return _ilCertificateLocalService.getDocAcceptList(keywords,
			serviceCode, govAgencyCode, routeCode, fromDate, toDate, start,
			limit);
	}

	/**
	* Returns a range of all the il certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il certificates
	* @param end the upper bound of the range of il certificates (not inclusive)
	* @return the range of il certificates
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.ILCertificate> getILCertificates(
		int start, int end) {
		return _ilCertificateLocalService.getILCertificates(start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILCertificate> searchGiayPhep(
		java.lang.String keyword, int start, int end) {
		return _ilCertificateLocalService.searchGiayPhep(keyword, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILCertificate> searchLienVan(
		java.lang.String keyword, int start, int end) {
		return _ilCertificateLocalService.searchLienVan(keyword, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.ILCertificate> searchListByRegistionNumber(
		java.lang.String keyword) {
		return _ilCertificateLocalService.searchListByRegistionNumber(keyword);
	}

	@Override
	public long countByApplicant(java.lang.String serviceCode,
		java.lang.String applicant) {
		return _ilCertificateLocalService.countByApplicant(serviceCode,
			applicant);
	}

	@Override
	public long countDocAcceptList(java.lang.String keywords,
		java.lang.String serviceCode, java.lang.String govAgencyCode,
		java.lang.String routeCode, java.lang.String fromDate,
		java.lang.String toDate) {
		return _ilCertificateLocalService.countDocAcceptList(keywords,
			serviceCode, govAgencyCode, routeCode, fromDate, toDate);
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
		return _ilCertificateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ilCertificateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ILCertificateLocalService getWrappedService() {
		return _ilCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		ILCertificateLocalService ilCertificateLocalService) {
		_ilCertificateLocalService = ilCertificateLocalService;
	}

	private ILCertificateLocalService _ilCertificateLocalService;
}