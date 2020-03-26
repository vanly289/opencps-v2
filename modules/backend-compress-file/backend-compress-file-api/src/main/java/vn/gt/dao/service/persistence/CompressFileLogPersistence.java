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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import vn.gt.dao.exception.NoSuchCompressFileLogException;
import vn.gt.dao.model.CompressFileLog;

/**
 * The persistence interface for the compress file log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see vn.gt.dao.service.persistence.impl.CompressFileLogPersistenceImpl
 * @see CompressFileLogUtil
 * @generated
 */
@ProviderType
public interface CompressFileLogPersistence extends BasePersistence<CompressFileLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompressFileLogUtil} to access the compress file log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the compress file logs where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @return the matching compress file logs
	*/
	public java.util.List<CompressFileLog> findByHoSoId(long hoSoId);

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
	public java.util.List<CompressFileLog> findByHoSoId(long hoSoId, int start,
		int end);

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
	public java.util.List<CompressFileLog> findByHoSoId(long hoSoId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator);

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
	public java.util.List<CompressFileLog> findByHoSoId(long hoSoId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching compress file log
	* @throws NoSuchCompressFileLogException if a matching compress file log could not be found
	*/
	public CompressFileLog findByHoSoId_First(long hoSoId,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator)
		throws NoSuchCompressFileLogException;

	/**
	* Returns the first compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching compress file log, or <code>null</code> if a matching compress file log could not be found
	*/
	public CompressFileLog fetchByHoSoId_First(long hoSoId,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator);

	/**
	* Returns the last compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching compress file log
	* @throws NoSuchCompressFileLogException if a matching compress file log could not be found
	*/
	public CompressFileLog findByHoSoId_Last(long hoSoId,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator)
		throws NoSuchCompressFileLogException;

	/**
	* Returns the last compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching compress file log, or <code>null</code> if a matching compress file log could not be found
	*/
	public CompressFileLog fetchByHoSoId_Last(long hoSoId,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator);

	/**
	* Returns the compress file logs before and after the current compress file log in the ordered set where hoSoId = &#63;.
	*
	* @param id the primary key of the current compress file log
	* @param hoSoId the ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next compress file log
	* @throws NoSuchCompressFileLogException if a compress file log with the primary key could not be found
	*/
	public CompressFileLog[] findByHoSoId_PrevAndNext(long id, long hoSoId,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator)
		throws NoSuchCompressFileLogException;

	/**
	* Removes all the compress file logs where hoSoId = &#63; from the database.
	*
	* @param hoSoId the ho so ID
	*/
	public void removeByHoSoId(long hoSoId);

	/**
	* Returns the number of compress file logs where hoSoId = &#63;.
	*
	* @param hoSoId the ho so ID
	* @return the number of matching compress file logs
	*/
	public int countByHoSoId(long hoSoId);

	/**
	* Returns the compress file log where fileEntryId = &#63; or throws a {@link NoSuchCompressFileLogException} if it could not be found.
	*
	* @param fileEntryId the file entry ID
	* @return the matching compress file log
	* @throws NoSuchCompressFileLogException if a matching compress file log could not be found
	*/
	public CompressFileLog findByFileEntryId(long fileEntryId)
		throws NoSuchCompressFileLogException;

	/**
	* Returns the compress file log where fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileEntryId the file entry ID
	* @return the matching compress file log, or <code>null</code> if a matching compress file log could not be found
	*/
	public CompressFileLog fetchByFileEntryId(long fileEntryId);

	/**
	* Returns the compress file log where fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileEntryId the file entry ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching compress file log, or <code>null</code> if a matching compress file log could not be found
	*/
	public CompressFileLog fetchByFileEntryId(long fileEntryId,
		boolean retrieveFromCache);

	/**
	* Removes the compress file log where fileEntryId = &#63; from the database.
	*
	* @param fileEntryId the file entry ID
	* @return the compress file log that was removed
	*/
	public CompressFileLog removeByFileEntryId(long fileEntryId)
		throws NoSuchCompressFileLogException;

	/**
	* Returns the number of compress file logs where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the number of matching compress file logs
	*/
	public int countByFileEntryId(long fileEntryId);

	/**
	* Caches the compress file log in the entity cache if it is enabled.
	*
	* @param compressFileLog the compress file log
	*/
	public void cacheResult(CompressFileLog compressFileLog);

	/**
	* Caches the compress file logs in the entity cache if it is enabled.
	*
	* @param compressFileLogs the compress file logs
	*/
	public void cacheResult(java.util.List<CompressFileLog> compressFileLogs);

	/**
	* Creates a new compress file log with the primary key. Does not add the compress file log to the database.
	*
	* @param id the primary key for the new compress file log
	* @return the new compress file log
	*/
	public CompressFileLog create(long id);

	/**
	* Removes the compress file log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the compress file log
	* @return the compress file log that was removed
	* @throws NoSuchCompressFileLogException if a compress file log with the primary key could not be found
	*/
	public CompressFileLog remove(long id)
		throws NoSuchCompressFileLogException;

	public CompressFileLog updateImpl(CompressFileLog compressFileLog);

	/**
	* Returns the compress file log with the primary key or throws a {@link NoSuchCompressFileLogException} if it could not be found.
	*
	* @param id the primary key of the compress file log
	* @return the compress file log
	* @throws NoSuchCompressFileLogException if a compress file log with the primary key could not be found
	*/
	public CompressFileLog findByPrimaryKey(long id)
		throws NoSuchCompressFileLogException;

	/**
	* Returns the compress file log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the compress file log
	* @return the compress file log, or <code>null</code> if a compress file log with the primary key could not be found
	*/
	public CompressFileLog fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, CompressFileLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the compress file logs.
	*
	* @return the compress file logs
	*/
	public java.util.List<CompressFileLog> findAll();

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
	public java.util.List<CompressFileLog> findAll(int start, int end);

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
	public java.util.List<CompressFileLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator);

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
	public java.util.List<CompressFileLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the compress file logs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of compress file logs.
	*
	* @return the number of compress file logs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}