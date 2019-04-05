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

import com.fds.vr.business.exception.NoSuchILCertificateException;
import com.fds.vr.business.model.ILCertificate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the il certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.ILCertificatePersistenceImpl
 * @see ILCertificateUtil
 * @generated
 */
@ProviderType
public interface ILCertificatePersistence extends BasePersistence<ILCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ILCertificateUtil} to access the il certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the il certificate where dossierFileId = &#63; or throws a {@link NoSuchILCertificateException} if it could not be found.
	*
	* @param dossierFileId the dossier file ID
	* @return the matching il certificate
	* @throws NoSuchILCertificateException if a matching il certificate could not be found
	*/
	public ILCertificate findByF_DFILE_ID(long dossierFileId)
		throws NoSuchILCertificateException;

	/**
	* Returns the il certificate where dossierFileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierFileId the dossier file ID
	* @return the matching il certificate, or <code>null</code> if a matching il certificate could not be found
	*/
	public ILCertificate fetchByF_DFILE_ID(long dossierFileId);

	/**
	* Returns the il certificate where dossierFileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierFileId the dossier file ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching il certificate, or <code>null</code> if a matching il certificate could not be found
	*/
	public ILCertificate fetchByF_DFILE_ID(long dossierFileId,
		boolean retrieveFromCache);

	/**
	* Removes the il certificate where dossierFileId = &#63; from the database.
	*
	* @param dossierFileId the dossier file ID
	* @return the il certificate that was removed
	*/
	public ILCertificate removeByF_DFILE_ID(long dossierFileId)
		throws NoSuchILCertificateException;

	/**
	* Returns the number of il certificates where dossierFileId = &#63;.
	*
	* @param dossierFileId the dossier file ID
	* @return the number of matching il certificates
	*/
	public int countByF_DFILE_ID(long dossierFileId);

	/**
	* Returns all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @return the matching il certificates
	*/
	public java.util.List<ILCertificate> findByF_APP_REG(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber);

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
	public java.util.List<ILCertificate> findByF_APP_REG(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber, int start, int end);

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
	public java.util.List<ILCertificate> findByF_APP_REG(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator);

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
	public java.util.List<ILCertificate> findByF_APP_REG(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator,
		boolean retrieveFromCache);

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
	public ILCertificate findByF_APP_REG_First(java.lang.String serviceCode,
		java.lang.String applicantIdNo, java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator)
		throws NoSuchILCertificateException;

	/**
	* Returns the first il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching il certificate, or <code>null</code> if a matching il certificate could not be found
	*/
	public ILCertificate fetchByF_APP_REG_First(java.lang.String serviceCode,
		java.lang.String applicantIdNo, java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator);

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
	public ILCertificate findByF_APP_REG_Last(java.lang.String serviceCode,
		java.lang.String applicantIdNo, java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator)
		throws NoSuchILCertificateException;

	/**
	* Returns the last il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching il certificate, or <code>null</code> if a matching il certificate could not be found
	*/
	public ILCertificate fetchByF_APP_REG_Last(java.lang.String serviceCode,
		java.lang.String applicantIdNo, java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator);

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
	public ILCertificate[] findByF_APP_REG_PrevAndNext(long id,
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String registrationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator)
		throws NoSuchILCertificateException;

	/**
	* Removes all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63; from the database.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	*/
	public void removeByF_APP_REG(java.lang.String serviceCode,
		java.lang.String applicantIdNo, java.lang.String registrationNumber);

	/**
	* Returns the number of il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param registrationNumber the registration number
	* @return the number of matching il certificates
	*/
	public int countByF_APP_REG(java.lang.String serviceCode,
		java.lang.String applicantIdNo, java.lang.String registrationNumber);

	/**
	* Caches the il certificate in the entity cache if it is enabled.
	*
	* @param ilCertificate the il certificate
	*/
	public void cacheResult(ILCertificate ilCertificate);

	/**
	* Caches the il certificates in the entity cache if it is enabled.
	*
	* @param ilCertificates the il certificates
	*/
	public void cacheResult(java.util.List<ILCertificate> ilCertificates);

	/**
	* Creates a new il certificate with the primary key. Does not add the il certificate to the database.
	*
	* @param id the primary key for the new il certificate
	* @return the new il certificate
	*/
	public ILCertificate create(long id);

	/**
	* Removes the il certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate that was removed
	* @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	*/
	public ILCertificate remove(long id) throws NoSuchILCertificateException;

	public ILCertificate updateImpl(ILCertificate ilCertificate);

	/**
	* Returns the il certificate with the primary key or throws a {@link NoSuchILCertificateException} if it could not be found.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate
	* @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	*/
	public ILCertificate findByPrimaryKey(long id)
		throws NoSuchILCertificateException;

	/**
	* Returns the il certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate, or <code>null</code> if a il certificate with the primary key could not be found
	*/
	public ILCertificate fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ILCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the il certificates.
	*
	* @return the il certificates
	*/
	public java.util.List<ILCertificate> findAll();

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
	public java.util.List<ILCertificate> findAll(int start, int end);

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
	public java.util.List<ILCertificate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator);

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
	public java.util.List<ILCertificate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ILCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the il certificates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of il certificates.
	*
	* @return the number of il certificates
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}