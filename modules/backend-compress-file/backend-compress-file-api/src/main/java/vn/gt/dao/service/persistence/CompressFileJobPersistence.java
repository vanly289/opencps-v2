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

import vn.gt.dao.exception.NoSuchCompressFileJobException;
import vn.gt.dao.model.CompressFileJob;

/**
 * The persistence interface for the compress file job service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see vn.gt.dao.service.persistence.impl.CompressFileJobPersistenceImpl
 * @see CompressFileJobUtil
 * @generated
 */
@ProviderType
public interface CompressFileJobPersistence extends BasePersistence<CompressFileJob> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompressFileJobUtil} to access the compress file job persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the compress file job in the entity cache if it is enabled.
	*
	* @param compressFileJob the compress file job
	*/
	public void cacheResult(CompressFileJob compressFileJob);

	/**
	* Caches the compress file jobs in the entity cache if it is enabled.
	*
	* @param compressFileJobs the compress file jobs
	*/
	public void cacheResult(java.util.List<CompressFileJob> compressFileJobs);

	/**
	* Creates a new compress file job with the primary key. Does not add the compress file job to the database.
	*
	* @param id the primary key for the new compress file job
	* @return the new compress file job
	*/
	public CompressFileJob create(long id);

	/**
	* Removes the compress file job with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the compress file job
	* @return the compress file job that was removed
	* @throws NoSuchCompressFileJobException if a compress file job with the primary key could not be found
	*/
	public CompressFileJob remove(long id)
		throws NoSuchCompressFileJobException;

	public CompressFileJob updateImpl(CompressFileJob compressFileJob);

	/**
	* Returns the compress file job with the primary key or throws a {@link NoSuchCompressFileJobException} if it could not be found.
	*
	* @param id the primary key of the compress file job
	* @return the compress file job
	* @throws NoSuchCompressFileJobException if a compress file job with the primary key could not be found
	*/
	public CompressFileJob findByPrimaryKey(long id)
		throws NoSuchCompressFileJobException;

	/**
	* Returns the compress file job with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the compress file job
	* @return the compress file job, or <code>null</code> if a compress file job with the primary key could not be found
	*/
	public CompressFileJob fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, CompressFileJob> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the compress file jobs.
	*
	* @return the compress file jobs
	*/
	public java.util.List<CompressFileJob> findAll();

	/**
	* Returns a range of all the compress file jobs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileJobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compress file jobs
	* @param end the upper bound of the range of compress file jobs (not inclusive)
	* @return the range of compress file jobs
	*/
	public java.util.List<CompressFileJob> findAll(int start, int end);

	/**
	* Returns an ordered range of all the compress file jobs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileJobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compress file jobs
	* @param end the upper bound of the range of compress file jobs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of compress file jobs
	*/
	public java.util.List<CompressFileJob> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileJob> orderByComparator);

	/**
	* Returns an ordered range of all the compress file jobs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CompressFileJobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compress file jobs
	* @param end the upper bound of the range of compress file jobs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of compress file jobs
	*/
	public java.util.List<CompressFileJob> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CompressFileJob> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the compress file jobs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of compress file jobs.
	*
	* @return the number of compress file jobs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}