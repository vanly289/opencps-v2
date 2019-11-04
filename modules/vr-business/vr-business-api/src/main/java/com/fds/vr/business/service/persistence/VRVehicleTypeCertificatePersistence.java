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

import com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException;
import com.fds.vr.business.model.VRVehicleTypeCertificate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr vehicle type certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleTypeCertificatePersistenceImpl
 * @see VRVehicleTypeCertificateUtil
 * @generated
 */
@ProviderType
public interface VRVehicleTypeCertificatePersistence extends BasePersistence<VRVehicleTypeCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRVehicleTypeCertificateUtil} to access the vr vehicle type certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr vehicle type certificate in the entity cache if it is enabled.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	*/
	public void cacheResult(VRVehicleTypeCertificate vrVehicleTypeCertificate);

	/**
	* Caches the vr vehicle type certificates in the entity cache if it is enabled.
	*
	* @param vrVehicleTypeCertificates the vr vehicle type certificates
	*/
	public void cacheResult(
		java.util.List<VRVehicleTypeCertificate> vrVehicleTypeCertificates);

	/**
	* Creates a new vr vehicle type certificate with the primary key. Does not add the vr vehicle type certificate to the database.
	*
	* @param id the primary key for the new vr vehicle type certificate
	* @return the new vr vehicle type certificate
	*/
	public VRVehicleTypeCertificate create(long id);

	/**
	* Removes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate remove(long id)
		throws NoSuchVRVehicleTypeCertificateException;

	public VRVehicleTypeCertificate updateImpl(
		VRVehicleTypeCertificate vrVehicleTypeCertificate);

	/**
	* Returns the vr vehicle type certificate with the primary key or throws a {@link NoSuchVRVehicleTypeCertificateException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate findByPrimaryKey(long id)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the vr vehicle type certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate, or <code>null</code> if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRVehicleTypeCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr vehicle type certificates.
	*
	* @return the vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findAll();

	/**
	* Returns a range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle type certificates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr vehicle type certificates.
	*
	* @return the number of vr vehicle type certificates
	*/
	public int countAll();
}