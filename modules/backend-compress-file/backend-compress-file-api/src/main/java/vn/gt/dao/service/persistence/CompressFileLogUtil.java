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

package vn.gt.dao.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gt.dao.model.CompressFileLog;

import java.util.List;

/**
 * The persistence utility for the compress file log service. This utility wraps {@link vn.gt.dao.service.persistence.impl.CompressFileLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CompressFileLogPersistence
 * @see vn.gt.dao.service.persistence.impl.CompressFileLogPersistenceImpl
 * @generated
 */
@ProviderType
public class CompressFileLogUtil {
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
	public static void clearCache(CompressFileLog compressFileLog) {
		getPersistence().clearCache(compressFileLog);
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
	public static List<CompressFileLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompressFileLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompressFileLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CompressFileLog> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CompressFileLog update(CompressFileLog compressFileLog) {
		return getPersistence().update(compressFileLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CompressFileLog update(CompressFileLog compressFileLog,
		ServiceContext serviceContext) {
		return getPersistence().update(compressFileLog, serviceContext);
	}

	/**
	* Returns all the compress file logs where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @return the matching compress file logs
	*/
	public static List<CompressFileLog> findByHoSoId(long hoSoId) {
		return getPersistence().findByHoSoId(hoSoId);
	}

	/**
	* Returns a range of all the compress file logs where hoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoId the ho so ID
	* @param start the lower bound of the range of compress file logs
	* @param end the upper bound of the range of compress file logs (not inclusive)
	* @return the range of matching compress file logs
	*/
	public static List<CompressFileLog> findByHoSoId(long hoSoId, int start,
		int end) {
		return getPersistence().findByHoSoId(hoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the compress file logs where hoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoId the ho so ID
	* @param start the lower bound of the range of compress file logs
	* @param end the upper bound of the range of compress file logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching compress file logs
	*/
	public static List<CompressFileLog> findByHoSoId(long hoSoId, int start,
		int end, OrderByComparator<CompressFileLog> orderByComparator) {
		return getPersistence()
				   .findByHoSoId(hoSoId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the compress file logs where hoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoId the ho so ID
	* @param start the lower bound of the range of compress file logs
	* @param end the upper bound of the range of compress file logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching compress file logs
	*/
	public static List<CompressFileLog> findByHoSoId(long hoSoId, int start,
		int end, OrderByComparator<CompressFileLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByHoSoId(hoSoId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching compress file log
	* @throws NoSuchCompressFileLogException if a matching compress file log could not be found
	*/
	public static CompressFileLog findByHoSoId_First(long hoSoId,
		OrderByComparator<CompressFileLog> orderByComparator)
		throws vn.gt.dao.exception.NoSuchCompressFileLogException {
		return getPersistence().findByHoSoId_First(hoSoId, orderByComparator);
	}

	/**
	* Returns the first compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching compress file log, or <code>null</code> if a matching compress file log could not be found
	*/
	public static CompressFileLog fetchByHoSoId_First(long hoSoId,
		OrderByComparator<CompressFileLog> orderByComparator) {
		return getPersistence().fetchByHoSoId_First(hoSoId, orderByComparator);
	}

	/**
	* Returns the last compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching compress file log
	* @throws NoSuchCompressFileLogException if a matching compress file log could not be found
	*/
	public static CompressFileLog findByHoSoId_Last(long hoSoId,
		OrderByComparator<CompressFileLog> orderByComparator)
		throws vn.gt.dao.exception.NoSuchCompressFileLogException {
		return getPersistence().findByHoSoId_Last(hoSoId, orderByComparator);
	}

	/**
	* Returns the last compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching compress file log, or <code>null</code> if a matching compress file log could not be found
	*/
	public static CompressFileLog fetchByHoSoId_Last(long hoSoId,
		OrderByComparator<CompressFileLog> orderByComparator) {
		return getPersistence().fetchByHoSoId_Last(hoSoId, orderByComparator);
	}

	/**
	* Returns the compress file logs before and after the current compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param id the primary key of the current compress file log
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next compress file log
	* @throws NoSuchCompressFileLogException if a compress file log with the primary key could not be found
	*/
	public static CompressFileLog[] findByHoSoId_PrevAndNext(long id,
		long hoSoId, OrderByComparator<CompressFileLog> orderByComparator)
		throws vn.gt.dao.exception.NoSuchCompressFileLogException {
		return getPersistence()
				   .findByHoSoId_PrevAndNext(id, hoSoId, orderByComparator);
	}

	/**
	* Removes all the compress file logs where hoSoId = &#63; from the database.
	*
	* @param hoSoId the ho so ID
	*/
	public static void removeByHoSoId(long hoSoId) {
		getPersistence().removeByHoSoId(hoSoId);
	}

	/**
	* Returns the number of compress file logs where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @return the number of matching compress file logs
	*/
	public static int countByHoSoId(long hoSoId) {
		return getPersistence().countByHoSoId(hoSoId);
	}

	/**
	* Returns the compress file log where fileEntryId = &#63; or throws a {@link NoSuchCompressFileLogException} if it could not be found.
	*
	* @param fileEntryId the file entry ID
	* @return the matching compress file log
	* @throws NoSuchCompressFileLogException if a matching compress file log could not be found
	*/
	public static CompressFileLog findByFileEntryId(long fileEntryId)
		throws vn.gt.dao.exception.NoSuchCompressFileLogException {
		return getPersistence().findByFileEntryId(fileEntryId);
	}

	/**
	* Returns the compress file log where fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileEntryId the file entry ID
	* @return the matching compress file log, or <code>null</code> if a matching compress file log could not be found
	*/
	public static CompressFileLog fetchByFileEntryId(long fileEntryId) {
		return getPersistence().fetchByFileEntryId(fileEntryId);
	}

	/**
	* Returns the compress file log where fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileEntryId the file entry ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching compress file log, or <code>null</code> if a matching compress file log could not be found
	*/
	public static CompressFileLog fetchByFileEntryId(long fileEntryId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByFileEntryId(fileEntryId, retrieveFromCache);
	}

	/**
	* Removes the compress file log where fileEntryId = &#63; from the database.
	*
	* @param fileEntryId the file entry ID
	* @return the compress file log that was removed
	*/
	public static CompressFileLog removeByFileEntryId(long fileEntryId)
		throws vn.gt.dao.exception.NoSuchCompressFileLogException {
		return getPersistence().removeByFileEntryId(fileEntryId);
	}

	/**
	* Returns the number of compress file logs where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the number of matching compress file logs
	*/
	public static int countByFileEntryId(long fileEntryId) {
		return getPersistence().countByFileEntryId(fileEntryId);
	}

	/**
	* Caches the compress file log in the entity cache if it is enabled.
	*
	* @param compressFileLog the compress file log
	*/
	public static void cacheResult(CompressFileLog compressFileLog) {
		getPersistence().cacheResult(compressFileLog);
	}

	/**
	* Caches the compress file logs in the entity cache if it is enabled.
	*
	* @param compressFileLogs the compress file logs
	*/
	public static void cacheResult(List<CompressFileLog> compressFileLogs) {
		getPersistence().cacheResult(compressFileLogs);
	}

	/**
	* Creates a new compress file log with the primary key. Does not add the compress file log to the database.
	*
	* @param id the primary key for the new compress file log
	* @return the new compress file log
	*/
	public static CompressFileLog create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the compress file log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the compress file log
	* @return the compress file log that was removed
	* @throws NoSuchCompressFileLogException if a compress file log with the primary key could not be found
	*/
	public static CompressFileLog remove(long id)
		throws vn.gt.dao.exception.NoSuchCompressFileLogException {
		return getPersistence().remove(id);
	}

	public static CompressFileLog updateImpl(CompressFileLog compressFileLog) {
		return getPersistence().updateImpl(compressFileLog);
	}

	/**
	* Returns the compress file log with the primary key or throws a {@link NoSuchCompressFileLogException} if it could not be found.
	*
	* @param id the primary key of the compress file log
	* @return the compress file log
	* @throws NoSuchCompressFileLogException if a compress file log with the primary key could not be found
	*/
	public static CompressFileLog findByPrimaryKey(long id)
		throws vn.gt.dao.exception.NoSuchCompressFileLogException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the compress file log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the compress file log
	* @return the compress file log, or <code>null</code> if a compress file log with the primary key could not be found
	*/
	public static CompressFileLog fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, CompressFileLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the compress file logs.
	*
	* @return the compress file logs
	*/
	public static List<CompressFileLog> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the compress file logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compress file logs
	* @param end the upper bound of the range of compress file logs (not inclusive)
	* @return the range of compress file logs
	*/
	public static List<CompressFileLog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the compress file logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compress file logs
	* @param end the upper bound of the range of compress file logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of compress file logs
	*/
	public static List<CompressFileLog> findAll(int start, int end,
		OrderByComparator<CompressFileLog> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the compress file logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compress file logs
	* @param end the upper bound of the range of compress file logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of compress file logs
	*/
	public static List<CompressFileLog> findAll(int start, int end,
		OrderByComparator<CompressFileLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the compress file logs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of compress file logs.
	*
	* @return the number of compress file logs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CompressFileLogPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CompressFileLogPersistence, CompressFileLogPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CompressFileLogPersistence.class);
}