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

import com.fds.vr.business.model.ILCertificate;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.Dossier;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for ILCertificate. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see ILCertificateLocalServiceUtil
 * @see com.fds.vr.business.service.base.ILCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.ILCertificateLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ILCertificateLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ILCertificateLocalServiceUtil} to access the il certificate local service. Add custom service methods to {@link com.fds.vr.business.service.impl.ILCertificateLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public ILCertificate addCertificate(JSONObject jsonData, Dossier dossier,
		long dossierFileId, java.lang.String dossierTemplateNo,
		java.lang.String dossierPartNo, java.lang.String fileTemplateNo,
		java.lang.String referenceUid, long doanhnghiepid, long vehicleid);

	/**
	* Adds the il certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ILCertificate addILCertificate(ILCertificate ilCertificate);

	/**
	* Creates a new il certificate with the primary key. Does not add the il certificate to the database.
	*
	* @param id the primary key for the new il certificate
	* @return the new il certificate
	*/
	public ILCertificate createILCertificate(long id);

	/**
	* Deletes the il certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ILCertificate deleteILCertificate(ILCertificate ilCertificate);

	/**
	* Deletes the il certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate that was removed
	* @throws PortalException if a il certificate with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ILCertificate deleteILCertificate(long id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ILCertificate fetchByDossierFileId(long dossierFileId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ILCertificate fetchByLicenceNo(java.lang.String licenceNo)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ILCertificate fetchILCertificate(long id);

	/**
	* Returns the il certificate with the primary key.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate
	* @throws PortalException if a il certificate with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ILCertificate getILCertificate(long id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ILCertificate searchByRegNumbber(java.lang.String keyword);

	public ILCertificate updateCertificate(JSONObject jsonData,
		long dossierFileId);

	/**
	* Updates the il certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ILCertificate updateILCertificate(ILCertificate ilCertificate);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public int countByDossierFileId(long dossierFileId);

	public int countByServiceCode(java.lang.String govAgencyCode,
		java.lang.String[] serviceCodes, Date fromDate, Date toDate);

	/**
	* Returns the number of il certificates.
	*
	* @return the number of il certificates
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getILCertificatesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ILCertificate> getAllCertificate();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ILCertificate> getByApplicant(java.lang.String serviceCode,
		java.lang.String applicant);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ILCertificate> getCertByValidFrom(
		java.lang.String serviceCode, java.lang.String applicant,
		java.lang.String regSearch);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ILCertificate> getDocAcceptList(java.lang.String keywords,
		java.lang.String serviceCode, java.lang.String govAgencyCode,
		java.lang.String routeCode, java.lang.String fromDate,
		java.lang.String toDate, int start, int limit);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ILCertificate> getILCertificates(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ILCertificate> searchGiayPhep(java.lang.String keyword,
		int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ILCertificate> searchLienVan(java.lang.String keyword,
		int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ILCertificate> searchListByRegistionNumber(
		java.lang.String keyword);

	public long countByApplicant(java.lang.String serviceCode,
		java.lang.String applicant);

	public long countDocAcceptList(java.lang.String keywords,
		java.lang.String serviceCode, java.lang.String govAgencyCode,
		java.lang.String routeCode, java.lang.String fromDate,
		java.lang.String toDate);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}