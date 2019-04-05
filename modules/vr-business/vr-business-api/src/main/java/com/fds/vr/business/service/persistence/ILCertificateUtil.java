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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.ILCertificate;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the il certificate service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.ILCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see ILCertificatePersistence
 * @see com.fds.vr.business.service.persistence.impl.ILCertificatePersistenceImpl
 * @generated
 */
@ProviderType
public class ILCertificateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ILCertificate ilCertificate) {
		getPersistence().clearCache(ilCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ILCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ILCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ILCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ILCertificate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ILCertificate update(ILCertificate ilCertificate) {
		return getPersistence().update(ilCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ILCertificate update(ILCertificate ilCertificate,
		ServiceContext serviceContext) {
		return getPersistence().update(ilCertificate, serviceContext);
	}

	/**
	* Returns the il certificate where dossierFileId = &#63; or throws a {@link NoSuchILCertificateException} if it could not be found.
	*
	* @param dossierFileId the dossier file ID
	* @return the matching il certificate
	* @throws NoSuchILCertificateException if a matching il certificate could not be found
	*/
	public static ILCertificate findByF_DFILE_ID(long dossierFileId)
		throws com.fds.vr.business.exception.NoSuchILCertificateException {
		return getPersistence().findByF_DFILE_ID(dossierFileId);
	}

	/**
	* Returns the il certificate where dossierFileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierFileId the dossier file ID
	* @return the matching il certificate, or <code>null</code> if a matching il certificate could not be found
	*/
	public static ILCertificate fetchByF_DFILE_ID(long dossierFileId) {
		return getPersistence().fetchByF_DFILE_ID(dossierFileId);
	}

	/**
	* Returns the il certificate where dossierFileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierFileId the dossier file ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching il certificate, or <code>null</code> if a matching il certificate could not be found
	*/
	public static ILCertificate fetchByF_DFILE_ID(long dossierFileId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_DFILE_ID(dossierFileId, retrieveFromCache);
	}

	/**
	* Removes the il certificate where dossierFileId = &#63; from the database.
	*
	* @param dossierFileId the dossier file ID
	* @return the il certificate that was removed
	*/
	public static ILCertificate removeByF_DFILE_ID(long dossierFileId)
		throws com.fds.vr.business.exception.NoSuchILCertificateException {
		return getPersistence().removeByF_DFILE_ID(dossierFileId);
	}

	/**
	* Returns the number of il certificates where dossierFileId = &#63;.
	*
	* @param dossierFileId the dossier file ID
	* @return the number of matching il certificates
	*/
	public static int countByF_DFILE_ID(long dossierFileId) {
		return getPersistence().countByF_DFILE_ID(dossierFileId);
	}

	/**
	* Returns all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @return the matching il certificates
	*/
	public static List<ILCertificate> findByF_APP_REG(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber) {
		return getPersistence()
				   .findByF_APP_REG(serviceCode, applicantIdNo,
			registrationNumber);
	}

	/**
	* Returns a range of all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il certificates
	* @param end the upper bound of the range of il certificates (not inclusive)
	* @return the range of matching il certificates
	*/
	public static List<ILCertificate> findByF_APP_REG(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber, int start, int end) {
		return getPersistence()
				   .findByF_APP_REG(serviceCode, applicantIdNo,
			registrationNumber, start, end);
	}

	/**
	* Returns an ordered range of all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il certificates
	* @param end the upper bound of the range of il certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching il certificates
	*/
	public static List<ILCertificate> findByF_APP_REG(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber, int start, int end,
		OrderByComparator<ILCertificate> orderByComparator) {
		return getPersistence()
				   .findByF_APP_REG(serviceCode, applicantIdNo,
			registrationNumber, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param start the lower bound of the range of il certificates
	* @param end the upper bound of the range of il certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching il certificates
	*/
	public static List<ILCertificate> findByF_APP_REG(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber, int start, int end,
		OrderByComparator<ILCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_APP_REG(serviceCode, applicantIdNo,
			registrationNumber, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il certificate
	* @throws NoSuchILCertificateException if a matching il certificate could not be found
	*/
	public static ILCertificate findByF_APP_REG_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILCertificateException {
		return getPersistence()
				   .findByF_APP_REG_First(serviceCode, applicantIdNo,
			registrationNumber, orderByComparator);
	}

	/**
	* Returns the first il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il certificate, or <code>null</code> if a matching il certificate could not be found
	*/
	public static ILCertificate fetchByF_APP_REG_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_APP_REG_First(serviceCode, applicantIdNo,
			registrationNumber, orderByComparator);
	}

	/**
	* Returns the last il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il certificate
	* @throws NoSuchILCertificateException if a matching il certificate could not be found
	*/
	public static ILCertificate findByF_APP_REG_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILCertificateException {
		return getPersistence()
				   .findByF_APP_REG_Last(serviceCode, applicantIdNo,
			registrationNumber, orderByComparator);
	}

	/**
	* Returns the last il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il certificate, or <code>null</code> if a matching il certificate could not be found
	*/
	public static ILCertificate fetchByF_APP_REG_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_APP_REG_Last(serviceCode, applicantIdNo,
			registrationNumber, orderByComparator);
	}

	/**
	* Returns the il certificates before and after the current il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param id the primary key of the current il certificate
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next il certificate
	* @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	*/
	public static ILCertificate[] findByF_APP_REG_PrevAndNext(long id,
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchILCertificateException {
		return getPersistence()
				   .findByF_APP_REG_PrevAndNext(id, serviceCode, applicantIdNo,
			registrationNumber, orderByComparator);
	}

	/**
	* Removes all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63; from the database.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	*/
	public static void removeByF_APP_REG(java.lang.String serviceCode,
		java.lang.String applicantIdNo, java.lang.String registrationNumber) {
		getPersistence()
			.removeByF_APP_REG(serviceCode, applicantIdNo, registrationNumber);
	}

	/**
	* Returns the number of il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @return the number of matching il certificates
	*/
	public static int countByF_APP_REG(java.lang.String serviceCode,
		java.lang.String applicantIdNo, java.lang.String registrationNumber) {
		return getPersistence()
				   .countByF_APP_REG(serviceCode, applicantIdNo,
			registrationNumber);
	}

	/**
	* Caches the il certificate in the entity cache if it is enabled.
	*
	* @param ilCertificate the il certificate
	*/
	public static void cacheResult(ILCertificate ilCertificate) {
		getPersistence().cacheResult(ilCertificate);
	}

	/**
	* Caches the il certificates in the entity cache if it is enabled.
	*
	* @param ilCertificates the il certificates
	*/
	public static void cacheResult(List<ILCertificate> ilCertificates) {
		getPersistence().cacheResult(ilCertificates);
	}

	/**
	* Creates a new il certificate with the primary key. Does not add the il certificate to the database.
	*
	* @param id the primary key for the new il certificate
	* @return the new il certificate
	*/
	public static ILCertificate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the il certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate that was removed
	* @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	*/
	public static ILCertificate remove(long id)
		throws com.fds.vr.business.exception.NoSuchILCertificateException {
		return getPersistence().remove(id);
	}

	public static ILCertificate updateImpl(ILCertificate ilCertificate) {
		return getPersistence().updateImpl(ilCertificate);
	}

	/**
	* Returns the il certificate with the primary key or throws a {@link NoSuchILCertificateException} if it could not be found.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate
	* @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	*/
	public static ILCertificate findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchILCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the il certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate, or <code>null</code> if a il certificate with the primary key could not be found
	*/
	public static ILCertificate fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ILCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the il certificates.
	*
	* @return the il certificates
	*/
	public static List<ILCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the il certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il certificates
	* @param end the upper bound of the range of il certificates (not inclusive)
	* @return the range of il certificates
	*/
	public static List<ILCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the il certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il certificates
	* @param end the upper bound of the range of il certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of il certificates
	*/
	public static List<ILCertificate> findAll(int start, int end,
		OrderByComparator<ILCertificate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the il certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il certificates
	* @param end the upper bound of the range of il certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of il certificates
	*/
	public static List<ILCertificate> findAll(int start, int end,
		OrderByComparator<ILCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the il certificates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of il certificates.
	*
	* @return the number of il certificates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ILCertificatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ILCertificatePersistence, ILCertificatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(ILCertificatePersistence.class);
}