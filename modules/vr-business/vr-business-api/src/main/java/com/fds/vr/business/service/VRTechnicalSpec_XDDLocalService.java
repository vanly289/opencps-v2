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

import com.fds.vr.business.model.VRTechnicalSpec_XDD;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for VRTechnicalSpec_XDD. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XDDLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRTechnicalSpec_XDDLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRTechnicalSpec_XDDLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRTechnicalSpec_XDDLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRTechnicalSpec_XDDLocalServiceUtil} to access the vr technical spec_xdd local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRTechnicalSpec_XDDLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr technical spec_xdd to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XDD the vr technical spec_xdd
	* @return the vr technical spec_xdd that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRTechnicalSpec_XDD addVRTechnicalSpec_XDD(
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD);

	/**
	* Creates a new vr technical spec_xdd with the primary key. Does not add the vr technical spec_xdd to the database.
	*
	* @param id the primary key for the new vr technical spec_xdd
	* @return the new vr technical spec_xdd
	*/
	public VRTechnicalSpec_XDD createVRTechnicalSpec_XDD(long id);

	/**
	* Deletes the vr technical spec_xdd from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XDD the vr technical spec_xdd
	* @return the vr technical spec_xdd that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRTechnicalSpec_XDD deleteVRTechnicalSpec_XDD(
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD);

	/**
	* Deletes the vr technical spec_xdd with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xdd
	* @return the vr technical spec_xdd that was removed
	* @throws PortalException if a vr technical spec_xdd with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRTechnicalSpec_XDD deleteVRTechnicalSpec_XDD(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRTechnicalSpec_XDD fetchVRTechnicalSpec_XDD(long id);

	/**
	* Returns the vr technical spec_xdd with the primary key.
	*
	* @param id the primary key of the vr technical spec_xdd
	* @return the vr technical spec_xdd
	* @throws PortalException if a vr technical spec_xdd with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRTechnicalSpec_XDD getVRTechnicalSpec_XDD(long id)
		throws PortalException;

	/**
	* Updates the vr technical spec_xdd in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XDD the vr technical spec_xdd
	* @return the vr technical spec_xdd that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRTechnicalSpec_XDD updateVRTechnicalSpec_XDD(
		VRTechnicalSpec_XDD vrTechnicalSpec_XDD);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	public JSONArray adminProcessData(JSONArray arrayData, long dossierId,
		long mtCore, long vehicleTypeCertificateId);

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

	/**
	* Returns the number of vr technical spec_xdds.
	*
	* @return the number of vr technical spec_xdds
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRTechnicalSpec_XDDsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRTechnicalSpec_XDD> findByConvertAssembleId(
		long convertAssembleId) throws SystemException;

	public List<VRTechnicalSpec_XDD> findByDeliverableCode(
		java.lang.String deliverableCode) throws SystemException;

	public List<VRTechnicalSpec_XDD> findByDossierId(long dossierId, int start,
		int end);

	public List<VRTechnicalSpec_XDD> findByDossierId(long dossierId, long mtCore)
		throws SystemException;

	public List<VRTechnicalSpec_XDD> findByDossierIdCTN(
		java.lang.String dossierIdCTN) throws SystemException;

	public List<VRTechnicalSpec_XDD> findByDossierNo(
		java.lang.String dossierNo, long mtCore) throws SystemException;

	public List<VRTechnicalSpec_XDD> findByReferenceUid(
		java.lang.String referenceUid) throws SystemException;

	public List<VRTechnicalSpec_XDD> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end);

	/**
	* Returns a range of all the vr technical spec_xdds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xdds
	* @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	* @return the range of vr technical spec_xdds
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRTechnicalSpec_XDD> getVRTechnicalSpec_XDDs(int start, int end);

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