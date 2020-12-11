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

package org.opencps.synchronization.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DictGroupTemp. This utility wraps
 * {@link org.opencps.synchronization.service.impl.DictGroupTempLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DictGroupTempLocalService
 * @see org.opencps.synchronization.service.base.DictGroupTempLocalServiceBaseImpl
 * @see org.opencps.synchronization.service.impl.DictGroupTempLocalServiceImpl
 * @generated
 */
@ProviderType
public class DictGroupTempLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.synchronization.service.impl.DictGroupTempLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* @author binhth
	* @param params
	<pre>
	<ol>
	<li> keywords </li>
	<li> groupId </li>
	<li> userId </li>
	<li> collectionCode </li>
	</ol>
	</pre>
	* @param sorts
	* @param start
	* @param end
	* @param searchContext
	* @throws ParseException,
	SearchException
	*/
	public static com.liferay.portal.kernel.search.Hits luceneSearchEngine(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.Sort[] sorts, int start, int end,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return getService()
				   .luceneSearchEngine(params, sorts, start, end, searchContext);
	}

	/**
	* Returns the number of dict group temps.
	*
	* @return the number of dict group temps
	*/
	public static int getDictGroupTempsCount() {
		return getService().getDictGroupTempsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.synchronization.model.impl.DictGroupTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.synchronization.model.impl.DictGroupTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<org.opencps.synchronization.model.DictGroupTemp> findOlderThanDate(
		java.util.Date date, long groupId, int start, int end) {
		return getService().findOlderThanDate(date, groupId, start, end);
	}

	public static java.util.List<org.opencps.synchronization.model.DictGroupTemp> getDictGroupTempByDictCollection(
		long groupId, long dictCollectionId, int start, int end) {
		return getService()
				   .getDictGroupTempByDictCollection(groupId, dictCollectionId,
			start, end);
	}

	/**
	* Returns a range of all the dict group temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.synchronization.model.impl.DictGroupTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dict group temps
	* @param end the upper bound of the range of dict group temps (not inclusive)
	* @return the range of dict group temps
	*/
	public static java.util.List<org.opencps.synchronization.model.DictGroupTemp> getDictGroupTemps(
		int start, int end) {
		return getService().getDictGroupTemps(start, end);
	}

	/**
	* Returns all the dict group temps matching the UUID and company.
	*
	* @param uuid the UUID of the dict group temps
	* @param companyId the primary key of the company
	* @return the matching dict group temps, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.synchronization.model.DictGroupTemp> getDictGroupTempsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getDictGroupTempsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of dict group temps matching the UUID and company.
	*
	* @param uuid the UUID of the dict group temps
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of dict group temps
	* @param end the upper bound of the range of dict group temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching dict group temps, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.synchronization.model.DictGroupTemp> getDictGroupTempsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.synchronization.model.DictGroupTemp> orderByComparator) {
		return getService()
				   .getDictGroupTempsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	public static long countLuceneSearchEngine(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return getService().countLuceneSearchEngine(params, searchContext);
	}

	public static long countOlderThanDate(java.util.Date date, long groupId) {
		return getService().countOlderThanDate(date, groupId);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* @author binhth
	* @param userId
	* @param groupId
	* @param dictCollectionId
	* @param groupCode
	* @param groupName
	* @param groupNameEN
	* @param groupDescription
	* @param serviceContext
	* @return DictGroup
	* @throws DuplicateCategoryException
	* @throws UnauthenticationException
	* @throws UnauthorizationException
	* @throws NoSuchUserException
	*/
	public static org.opencps.synchronization.model.DictGroupTemp addDictGroupTemp(
		long userId, long groupId, long dictCollectionId,
		java.lang.String groupCode, java.lang.String groupName,
		java.lang.String groupNameEN, java.lang.String groupDescription,
		int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.asset.kernel.exception.DuplicateCategoryException,
			com.liferay.portal.kernel.exception.NoSuchUserException,
			org.opencps.auth.api.exception.UnauthenticationException,
			org.opencps.auth.api.exception.UnauthorizationException {
		return getService()
				   .addDictGroupTemp(userId, groupId, dictCollectionId,
			groupCode, groupName, groupNameEN, groupDescription, status,
			serviceContext);
	}

	/**
	* Adds the dict group temp to the database. Also notifies the appropriate model listeners.
	*
	* @param dictGroupTemp the dict group temp
	* @return the dict group temp that was added
	*/
	public static org.opencps.synchronization.model.DictGroupTemp addDictGroupTemp(
		org.opencps.synchronization.model.DictGroupTemp dictGroupTemp) {
		return getService().addDictGroupTemp(dictGroupTemp);
	}

	/**
	* Creates a new dict group temp with the primary key. Does not add the dict group temp to the database.
	*
	* @param dictGroupId the primary key for the new dict group temp
	* @return the new dict group temp
	*/
	public static org.opencps.synchronization.model.DictGroupTemp createDictGroupTemp(
		long dictGroupId) {
		return getService().createDictGroupTemp(dictGroupId);
	}

	/**
	* Deletes the dict group temp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictGroupId the primary key of the dict group temp
	* @return the dict group temp that was removed
	* @throws PortalException if a dict group temp with the primary key could not be found
	*/
	public static org.opencps.synchronization.model.DictGroupTemp deleteDictGroupTemp(
		long dictGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDictGroupTemp(dictGroupId);
	}

	/**
	* @author binhth
	* @param dictGroupId
	* @param serviceContext
	*/
	public static org.opencps.synchronization.model.DictGroupTemp deleteDictGroupTemp(
		long dictGroupId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws org.opencps.auth.api.exception.NotFoundException,
			org.opencps.auth.api.exception.UnauthenticationException,
			org.opencps.auth.api.exception.UnauthorizationException {
		return getService().deleteDictGroupTemp(dictGroupId, serviceContext);
	}

	/**
	* Deletes the dict group temp from the database. Also notifies the appropriate model listeners.
	*
	* @param dictGroupTemp the dict group temp
	* @return the dict group temp that was removed
	*/
	public static org.opencps.synchronization.model.DictGroupTemp deleteDictGroupTemp(
		org.opencps.synchronization.model.DictGroupTemp dictGroupTemp) {
		return getService().deleteDictGroupTemp(dictGroupTemp);
	}

	/**
	* @author binhth
	* @param groupCode
	* @param groupId
	* @return DictGroupTemp
	*/
	public static org.opencps.synchronization.model.DictGroupTemp fetchByF_DictGroupCode(
		java.lang.String groupCode, long groupId) {
		return getService().fetchByF_DictGroupCode(groupCode, groupId);
	}

	public static org.opencps.synchronization.model.DictGroupTemp fetchDictGroupTemp(
		long dictGroupId) {
		return getService().fetchDictGroupTemp(dictGroupId);
	}

	/**
	* Returns the dict group temp matching the UUID and group.
	*
	* @param uuid the dict group temp's UUID
	* @param groupId the primary key of the group
	* @return the matching dict group temp, or <code>null</code> if a matching dict group temp could not be found
	*/
	public static org.opencps.synchronization.model.DictGroupTemp fetchDictGroupTempByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchDictGroupTempByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.synchronization.model.DictGroupTemp getByGC_GI_DCI(
		java.lang.String groupCode, long groupId, long dictCollectionId) {
		return getService().getByGC_GI_DCI(groupCode, groupId, dictCollectionId);
	}

	/**
	* Returns the dict group temp with the primary key.
	*
	* @param dictGroupId the primary key of the dict group temp
	* @return the dict group temp
	* @throws PortalException if a dict group temp with the primary key could not be found
	*/
	public static org.opencps.synchronization.model.DictGroupTemp getDictGroupTemp(
		long dictGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDictGroupTemp(dictGroupId);
	}

	/**
	* Returns the dict group temp matching the UUID and group.
	*
	* @param uuid the dict group temp's UUID
	* @param groupId the primary key of the group
	* @return the matching dict group temp
	* @throws PortalException if a matching dict group temp could not be found
	*/
	public static org.opencps.synchronization.model.DictGroupTemp getDictGroupTempByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDictGroupTempByUuidAndGroupId(uuid, groupId);
	}

	/**
	* @author binhth
	* @param userId
	* @param dictGroupId
	* @param dictCollectionId
	* @param groupCode
	* @param groupName
	* @param groupNameEN
	* @param groupDescription
	* @param serviceContext
	* @return DictGroupTemp
	* @throws DuplicateCategoryException
	* @throws UnauthenticationException
	* @throws UnauthorizationException
	* @throws NoSuchUserException
	*/
	public static org.opencps.synchronization.model.DictGroupTemp updateDictGroupTemp(
		long userId, long dictGroupId, long dictCollectionId,
		java.lang.String groupCode, java.lang.String groupName,
		java.lang.String groupNameEN, java.lang.String groupDescription,
		int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.asset.kernel.exception.DuplicateCategoryException,
			com.liferay.portal.kernel.exception.NoSuchUserException,
			org.opencps.auth.api.exception.NotFoundException,
			org.opencps.auth.api.exception.UnauthenticationException,
			org.opencps.auth.api.exception.UnauthorizationException {
		return getService()
				   .updateDictGroupTemp(userId, dictGroupId, dictCollectionId,
			groupCode, groupName, groupNameEN, groupDescription, status,
			serviceContext);
	}

	/**
	* Updates the dict group temp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictGroupTemp the dict group temp
	* @return the dict group temp that was updated
	*/
	public static org.opencps.synchronization.model.DictGroupTemp updateDictGroupTemp(
		org.opencps.synchronization.model.DictGroupTemp dictGroupTemp) {
		return getService().updateDictGroupTemp(dictGroupTemp);
	}

	public static DictGroupTempLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DictGroupTempLocalService, DictGroupTempLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DictGroupTempLocalService.class);
}