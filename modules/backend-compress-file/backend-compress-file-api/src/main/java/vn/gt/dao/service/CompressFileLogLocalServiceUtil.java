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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CompressFileLog. This utility wraps
 * {@link vn.gt.dao.service.impl.CompressFileLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see CompressFileLogLocalService
 * @see vn.gt.dao.service.base.CompressFileLogLocalServiceBaseImpl
 * @see vn.gt.dao.service.impl.CompressFileLogLocalServiceImpl
 * @generated
 */
@ProviderType
public class CompressFileLogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.service.impl.CompressFileLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
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
	* Returns the number of compress file logs.
	*
	* @return the number of compress file logs
	*/
	public static int getCompressFileLogsCount() {
		return getService().getCompressFileLogsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gt.dao.model.impl.CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gt.dao.model.impl.CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the compress file logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gt.dao.model.impl.CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compress file logs
	* @param end the upper bound of the range of compress file logs (not inclusive)
	* @return the range of compress file logs
	*/
	public static java.util.List<vn.gt.dao.model.CompressFileLog> getCompressFileLogs(
		int start, int end) {
		return getService().getCompressFileLogs(start, end);
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

	public static long getLasted()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLasted();
	}

	public static vn.gt.dao.model.CompressFileLog addCompressFileLog(
		long hoSoId, long fileEntryId, long oldSize, long newSize)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCompressFileLog(hoSoId, fileEntryId, oldSize, newSize);
	}

	public static vn.gt.dao.model.CompressFileLog addCompressFileLog(
		long hoSoId, long fileEntryId, long oldSize, long newSize,
		boolean status, java.lang.String errorMsg)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCompressFileLog(hoSoId, fileEntryId, oldSize, newSize,
			status, errorMsg);
	}

	/**
	* Adds the compress file log to the database. Also notifies the appropriate model listeners.
	*
	* @param compressFileLog the compress file log
	* @return the compress file log that was added
	*/
	public static vn.gt.dao.model.CompressFileLog addCompressFileLog(
		vn.gt.dao.model.CompressFileLog compressFileLog) {
		return getService().addCompressFileLog(compressFileLog);
	}

	/**
	* Creates a new compress file log with the primary key. Does not add the compress file log to the database.
	*
	* @param id the primary key for the new compress file log
	* @return the new compress file log
	*/
	public static vn.gt.dao.model.CompressFileLog createCompressFileLog(long id) {
		return getService().createCompressFileLog(id);
	}

	/**
	* Deletes the compress file log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the compress file log
	* @return the compress file log that was removed
	* @throws PortalException if a compress file log with the primary key could not be found
	*/
	public static vn.gt.dao.model.CompressFileLog deleteCompressFileLog(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCompressFileLog(id);
	}

	/**
	* Deletes the compress file log from the database. Also notifies the appropriate model listeners.
	*
	* @param compressFileLog the compress file log
	* @return the compress file log that was removed
	*/
	public static vn.gt.dao.model.CompressFileLog deleteCompressFileLog(
		vn.gt.dao.model.CompressFileLog compressFileLog) {
		return getService().deleteCompressFileLog(compressFileLog);
	}

	public static vn.gt.dao.model.CompressFileLog fetchCompressFileLog(long id) {
		return getService().fetchCompressFileLog(id);
	}

	/**
	* Returns the compress file log with the primary key.
	*
	* @param id the primary key of the compress file log
	* @return the compress file log
	* @throws PortalException if a compress file log with the primary key could not be found
	* @throws SystemException
	*/
	public static vn.gt.dao.model.CompressFileLog getCompressFileLog(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompressFileLog(id);
	}

	/**
	* Updates the compress file log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param compressFileLog the compress file log
	* @return the compress file log that was updated
	*/
	public static vn.gt.dao.model.CompressFileLog updateCompressFileLog(
		vn.gt.dao.model.CompressFileLog compressFileLog) {
		return getService().updateCompressFileLog(compressFileLog);
	}

	public static CompressFileLogLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CompressFileLogLocalService, CompressFileLogLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CompressFileLogLocalService.class);
}