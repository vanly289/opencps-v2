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

package com.fds.vr.business.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.exception.NoSuchILSyncDateException;
import com.fds.vr.business.model.ILSyncDate;
import com.fds.vr.business.model.impl.ILSyncDateImpl;
import com.fds.vr.business.model.impl.ILSyncDateModelImpl;
import com.fds.vr.business.service.persistence.ILSyncDatePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the il sync date service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see ILSyncDatePersistence
 * @see com.fds.vr.business.service.persistence.ILSyncDateUtil
 * @generated
 */
@ProviderType
public class ILSyncDatePersistenceImpl extends BasePersistenceImpl<ILSyncDate>
	implements ILSyncDatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ILSyncDateUtil} to access the il sync date persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ILSyncDateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			ILSyncDateModelImpl.FINDER_CACHE_ENABLED, ILSyncDateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			ILSyncDateModelImpl.FINDER_CACHE_ENABLED, ILSyncDateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			ILSyncDateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ILSyncDatePersistenceImpl() {
		setModelClass(ILSyncDate.class);
	}

	/**
	 * Caches the il sync date in the entity cache if it is enabled.
	 *
	 * @param ilSyncDate the il sync date
	 */
	@Override
	public void cacheResult(ILSyncDate ilSyncDate) {
		entityCache.putResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			ILSyncDateImpl.class, ilSyncDate.getPrimaryKey(), ilSyncDate);

		ilSyncDate.resetOriginalValues();
	}

	/**
	 * Caches the il sync dates in the entity cache if it is enabled.
	 *
	 * @param ilSyncDates the il sync dates
	 */
	@Override
	public void cacheResult(List<ILSyncDate> ilSyncDates) {
		for (ILSyncDate ilSyncDate : ilSyncDates) {
			if (entityCache.getResult(
						ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
						ILSyncDateImpl.class, ilSyncDate.getPrimaryKey()) == null) {
				cacheResult(ilSyncDate);
			}
			else {
				ilSyncDate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all il sync dates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ILSyncDateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the il sync date.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ILSyncDate ilSyncDate) {
		entityCache.removeResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			ILSyncDateImpl.class, ilSyncDate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ILSyncDate> ilSyncDates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ILSyncDate ilSyncDate : ilSyncDates) {
			entityCache.removeResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
				ILSyncDateImpl.class, ilSyncDate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new il sync date with the primary key. Does not add the il sync date to the database.
	 *
	 * @param id the primary key for the new il sync date
	 * @return the new il sync date
	 */
	@Override
	public ILSyncDate create(long id) {
		ILSyncDate ilSyncDate = new ILSyncDateImpl();

		ilSyncDate.setNew(true);
		ilSyncDate.setPrimaryKey(id);

		return ilSyncDate;
	}

	/**
	 * Removes the il sync date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the il sync date
	 * @return the il sync date that was removed
	 * @throws NoSuchILSyncDateException if a il sync date with the primary key could not be found
	 */
	@Override
	public ILSyncDate remove(long id) throws NoSuchILSyncDateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the il sync date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the il sync date
	 * @return the il sync date that was removed
	 * @throws NoSuchILSyncDateException if a il sync date with the primary key could not be found
	 */
	@Override
	public ILSyncDate remove(Serializable primaryKey)
		throws NoSuchILSyncDateException {
		Session session = null;

		try {
			session = openSession();

			ILSyncDate ilSyncDate = (ILSyncDate)session.get(ILSyncDateImpl.class,
					primaryKey);

			if (ilSyncDate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchILSyncDateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ilSyncDate);
		}
		catch (NoSuchILSyncDateException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ILSyncDate removeImpl(ILSyncDate ilSyncDate) {
		ilSyncDate = toUnwrappedModel(ilSyncDate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ilSyncDate)) {
				ilSyncDate = (ILSyncDate)session.get(ILSyncDateImpl.class,
						ilSyncDate.getPrimaryKeyObj());
			}

			if (ilSyncDate != null) {
				session.delete(ilSyncDate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ilSyncDate != null) {
			clearCache(ilSyncDate);
		}

		return ilSyncDate;
	}

	@Override
	public ILSyncDate updateImpl(ILSyncDate ilSyncDate) {
		ilSyncDate = toUnwrappedModel(ilSyncDate);

		boolean isNew = ilSyncDate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (ilSyncDate.isNew()) {
				session.save(ilSyncDate);

				ilSyncDate.setNew(false);
			}
			else {
				ilSyncDate = (ILSyncDate)session.merge(ilSyncDate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
			ILSyncDateImpl.class, ilSyncDate.getPrimaryKey(), ilSyncDate, false);

		ilSyncDate.resetOriginalValues();

		return ilSyncDate;
	}

	protected ILSyncDate toUnwrappedModel(ILSyncDate ilSyncDate) {
		if (ilSyncDate instanceof ILSyncDateImpl) {
			return ilSyncDate;
		}

		ILSyncDateImpl ilSyncDateImpl = new ILSyncDateImpl();

		ilSyncDateImpl.setNew(ilSyncDate.isNew());
		ilSyncDateImpl.setPrimaryKey(ilSyncDate.getPrimaryKey());

		ilSyncDateImpl.setId(ilSyncDate.getId());
		ilSyncDateImpl.setTableName(ilSyncDate.getTableName());
		ilSyncDateImpl.setSyncDate(ilSyncDate.getSyncDate());

		return ilSyncDateImpl;
	}

	/**
	 * Returns the il sync date with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the il sync date
	 * @return the il sync date
	 * @throws NoSuchILSyncDateException if a il sync date with the primary key could not be found
	 */
	@Override
	public ILSyncDate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchILSyncDateException {
		ILSyncDate ilSyncDate = fetchByPrimaryKey(primaryKey);

		if (ilSyncDate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchILSyncDateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ilSyncDate;
	}

	/**
	 * Returns the il sync date with the primary key or throws a {@link NoSuchILSyncDateException} if it could not be found.
	 *
	 * @param id the primary key of the il sync date
	 * @return the il sync date
	 * @throws NoSuchILSyncDateException if a il sync date with the primary key could not be found
	 */
	@Override
	public ILSyncDate findByPrimaryKey(long id)
		throws NoSuchILSyncDateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the il sync date with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the il sync date
	 * @return the il sync date, or <code>null</code> if a il sync date with the primary key could not be found
	 */
	@Override
	public ILSyncDate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
				ILSyncDateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ILSyncDate ilSyncDate = (ILSyncDate)serializable;

		if (ilSyncDate == null) {
			Session session = null;

			try {
				session = openSession();

				ilSyncDate = (ILSyncDate)session.get(ILSyncDateImpl.class,
						primaryKey);

				if (ilSyncDate != null) {
					cacheResult(ilSyncDate);
				}
				else {
					entityCache.putResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
						ILSyncDateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
					ILSyncDateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ilSyncDate;
	}

	/**
	 * Returns the il sync date with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the il sync date
	 * @return the il sync date, or <code>null</code> if a il sync date with the primary key could not be found
	 */
	@Override
	public ILSyncDate fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ILSyncDate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ILSyncDate> map = new HashMap<Serializable, ILSyncDate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ILSyncDate ilSyncDate = fetchByPrimaryKey(primaryKey);

			if (ilSyncDate != null) {
				map.put(primaryKey, ilSyncDate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
					ILSyncDateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ILSyncDate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ILSYNCDATE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (ILSyncDate ilSyncDate : (List<ILSyncDate>)q.list()) {
				map.put(ilSyncDate.getPrimaryKeyObj(), ilSyncDate);

				cacheResult(ilSyncDate);

				uncachedPrimaryKeys.remove(ilSyncDate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ILSyncDateModelImpl.ENTITY_CACHE_ENABLED,
					ILSyncDateImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the il sync dates.
	 *
	 * @return the il sync dates
	 */
	@Override
	public List<ILSyncDate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the il sync dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il sync dates
	 * @param end the upper bound of the range of il sync dates (not inclusive)
	 * @return the range of il sync dates
	 */
	@Override
	public List<ILSyncDate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the il sync dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il sync dates
	 * @param end the upper bound of the range of il sync dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of il sync dates
	 */
	@Override
	public List<ILSyncDate> findAll(int start, int end,
		OrderByComparator<ILSyncDate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the il sync dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il sync dates
	 * @param end the upper bound of the range of il sync dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of il sync dates
	 */
	@Override
	public List<ILSyncDate> findAll(int start, int end,
		OrderByComparator<ILSyncDate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ILSyncDate> list = null;

		if (retrieveFromCache) {
			list = (List<ILSyncDate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ILSYNCDATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ILSYNCDATE;

				if (pagination) {
					sql = sql.concat(ILSyncDateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ILSyncDate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ILSyncDate>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the il sync dates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ILSyncDate ilSyncDate : findAll()) {
			remove(ilSyncDate);
		}
	}

	/**
	 * Returns the number of il sync dates.
	 *
	 * @return the number of il sync dates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ILSYNCDATE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ILSyncDateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the il sync date persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ILSyncDateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ILSYNCDATE = "SELECT ilSyncDate FROM ILSyncDate ilSyncDate";
	private static final String _SQL_SELECT_ILSYNCDATE_WHERE_PKS_IN = "SELECT ilSyncDate FROM ILSyncDate ilSyncDate WHERE id IN (";
	private static final String _SQL_COUNT_ILSYNCDATE = "SELECT COUNT(ilSyncDate) FROM ILSyncDate ilSyncDate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ilSyncDate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ILSyncDate exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ILSyncDatePersistenceImpl.class);
}