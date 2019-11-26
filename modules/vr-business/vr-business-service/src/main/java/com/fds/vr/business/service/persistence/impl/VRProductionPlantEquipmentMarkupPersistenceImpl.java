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

import com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException;
import com.fds.vr.business.model.VRProductionPlantEquipmentMarkup;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupImpl;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupModelImpl;
import com.fds.vr.business.service.persistence.VRProductionPlantEquipmentMarkupPersistence;

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
import com.liferay.portal.kernel.util.SetUtil;
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
 * The persistence implementation for the vr production plant equipment markup service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEquipmentMarkupPersistence
 * @see com.fds.vr.business.service.persistence.VRProductionPlantEquipmentMarkupUtil
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentMarkupPersistenceImpl
	extends BasePersistenceImpl<VRProductionPlantEquipmentMarkup>
	implements VRProductionPlantEquipmentMarkupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRProductionPlantEquipmentMarkupUtil} to access the vr production plant equipment markup persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRProductionPlantEquipmentMarkupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public VRProductionPlantEquipmentMarkupPersistenceImpl() {
		setModelClass(VRProductionPlantEquipmentMarkup.class);
	}

	/**
	 * Caches the vr production plant equipment markup in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantEquipmentMarkup the vr production plant equipment markup
	 */
	@Override
	public void cacheResult(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		entityCache.putResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			vrProductionPlantEquipmentMarkup.getPrimaryKey(),
			vrProductionPlantEquipmentMarkup);

		vrProductionPlantEquipmentMarkup.resetOriginalValues();
	}

	/**
	 * Caches the vr production plant equipment markups in the entity cache if it is enabled.
	 *
	 * @param vrProductionPlantEquipmentMarkups the vr production plant equipment markups
	 */
	@Override
	public void cacheResult(
		List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups) {
		for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : vrProductionPlantEquipmentMarkups) {
			if (entityCache.getResult(
						VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantEquipmentMarkupImpl.class,
						vrProductionPlantEquipmentMarkup.getPrimaryKey()) == null) {
				cacheResult(vrProductionPlantEquipmentMarkup);
			}
			else {
				vrProductionPlantEquipmentMarkup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr production plant equipment markups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRProductionPlantEquipmentMarkupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr production plant equipment markup.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		entityCache.removeResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			vrProductionPlantEquipmentMarkup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : vrProductionPlantEquipmentMarkups) {
			entityCache.removeResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantEquipmentMarkupImpl.class,
				vrProductionPlantEquipmentMarkup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr production plant equipment markup with the primary key. Does not add the vr production plant equipment markup to the database.
	 *
	 * @param id the primary key for the new vr production plant equipment markup
	 * @return the new vr production plant equipment markup
	 */
	@Override
	public VRProductionPlantEquipmentMarkup create(long id) {
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = new VRProductionPlantEquipmentMarkupImpl();

		vrProductionPlantEquipmentMarkup.setNew(true);
		vrProductionPlantEquipmentMarkup.setPrimaryKey(id);

		return vrProductionPlantEquipmentMarkup;
	}

	/**
	 * Removes the vr production plant equipment markup with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup that was removed
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup remove(long id)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr production plant equipment markup with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup that was removed
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup remove(Serializable primaryKey)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		Session session = null;

		try {
			session = openSession();

			VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)session.get(VRProductionPlantEquipmentMarkupImpl.class,
					primaryKey);

			if (vrProductionPlantEquipmentMarkup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRProductionPlantEquipmentMarkupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrProductionPlantEquipmentMarkup);
		}
		catch (NoSuchVRProductionPlantEquipmentMarkupException nsee) {
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
	protected VRProductionPlantEquipmentMarkup removeImpl(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		vrProductionPlantEquipmentMarkup = toUnwrappedModel(vrProductionPlantEquipmentMarkup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrProductionPlantEquipmentMarkup)) {
				vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)session.get(VRProductionPlantEquipmentMarkupImpl.class,
						vrProductionPlantEquipmentMarkup.getPrimaryKeyObj());
			}

			if (vrProductionPlantEquipmentMarkup != null) {
				session.delete(vrProductionPlantEquipmentMarkup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrProductionPlantEquipmentMarkup != null) {
			clearCache(vrProductionPlantEquipmentMarkup);
		}

		return vrProductionPlantEquipmentMarkup;
	}

	@Override
	public VRProductionPlantEquipmentMarkup updateImpl(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		vrProductionPlantEquipmentMarkup = toUnwrappedModel(vrProductionPlantEquipmentMarkup);

		boolean isNew = vrProductionPlantEquipmentMarkup.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vrProductionPlantEquipmentMarkup.isNew()) {
				session.save(vrProductionPlantEquipmentMarkup);

				vrProductionPlantEquipmentMarkup.setNew(false);
			}
			else {
				vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)session.merge(vrProductionPlantEquipmentMarkup);
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

		entityCache.putResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
			VRProductionPlantEquipmentMarkupImpl.class,
			vrProductionPlantEquipmentMarkup.getPrimaryKey(),
			vrProductionPlantEquipmentMarkup, false);

		vrProductionPlantEquipmentMarkup.resetOriginalValues();

		return vrProductionPlantEquipmentMarkup;
	}

	protected VRProductionPlantEquipmentMarkup toUnwrappedModel(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		if (vrProductionPlantEquipmentMarkup instanceof VRProductionPlantEquipmentMarkupImpl) {
			return vrProductionPlantEquipmentMarkup;
		}

		VRProductionPlantEquipmentMarkupImpl vrProductionPlantEquipmentMarkupImpl =
			new VRProductionPlantEquipmentMarkupImpl();

		vrProductionPlantEquipmentMarkupImpl.setNew(vrProductionPlantEquipmentMarkup.isNew());
		vrProductionPlantEquipmentMarkupImpl.setPrimaryKey(vrProductionPlantEquipmentMarkup.getPrimaryKey());

		vrProductionPlantEquipmentMarkupImpl.setId(vrProductionPlantEquipmentMarkup.getId());
		vrProductionPlantEquipmentMarkupImpl.setProductClassificationCode(vrProductionPlantEquipmentMarkup.getProductClassificationCode());
		vrProductionPlantEquipmentMarkupImpl.setProductionPlantEquipmentId(vrProductionPlantEquipmentMarkup.getProductionPlantEquipmentId());
		vrProductionPlantEquipmentMarkupImpl.setStatus(vrProductionPlantEquipmentMarkup.getStatus());

		return vrProductionPlantEquipmentMarkupImpl;
	}

	/**
	 * Returns the vr production plant equipment markup with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = fetchByPrimaryKey(primaryKey);

		if (vrProductionPlantEquipmentMarkup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRProductionPlantEquipmentMarkupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrProductionPlantEquipmentMarkup;
	}

	/**
	 * Returns the vr production plant equipment markup with the primary key or throws a {@link NoSuchVRProductionPlantEquipmentMarkupException} if it could not be found.
	 *
	 * @param id the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup
	 * @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantEquipmentMarkupException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr production plant equipment markup with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup, or <code>null</code> if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
				VRProductionPlantEquipmentMarkupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)serializable;

		if (vrProductionPlantEquipmentMarkup == null) {
			Session session = null;

			try {
				session = openSession();

				vrProductionPlantEquipmentMarkup = (VRProductionPlantEquipmentMarkup)session.get(VRProductionPlantEquipmentMarkupImpl.class,
						primaryKey);

				if (vrProductionPlantEquipmentMarkup != null) {
					cacheResult(vrProductionPlantEquipmentMarkup);
				}
				else {
					entityCache.putResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
						VRProductionPlantEquipmentMarkupImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentMarkupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrProductionPlantEquipmentMarkup;
	}

	/**
	 * Returns the vr production plant equipment markup with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr production plant equipment markup
	 * @return the vr production plant equipment markup, or <code>null</code> if a vr production plant equipment markup with the primary key could not be found
	 */
	@Override
	public VRProductionPlantEquipmentMarkup fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRProductionPlantEquipmentMarkup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRProductionPlantEquipmentMarkup> map = new HashMap<Serializable, VRProductionPlantEquipmentMarkup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup = fetchByPrimaryKey(primaryKey);

			if (vrProductionPlantEquipmentMarkup != null) {
				map.put(primaryKey, vrProductionPlantEquipmentMarkup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentMarkupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(VRProductionPlantEquipmentMarkup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE_PKS_IN);

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

			for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : (List<VRProductionPlantEquipmentMarkup>)q.list()) {
				map.put(vrProductionPlantEquipmentMarkup.getPrimaryKeyObj(),
					vrProductionPlantEquipmentMarkup);

				cacheResult(vrProductionPlantEquipmentMarkup);

				uncachedPrimaryKeys.remove(vrProductionPlantEquipmentMarkup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRProductionPlantEquipmentMarkupModelImpl.ENTITY_CACHE_ENABLED,
					VRProductionPlantEquipmentMarkupImpl.class, primaryKey,
					nullModel);
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
	 * Returns all the vr production plant equipment markups.
	 *
	 * @return the vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr production plant equipment markups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @return the range of vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipment markups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr production plant equipment markups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr production plant equipment markups
	 * @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr production plant equipment markups
	 */
	@Override
	public List<VRProductionPlantEquipmentMarkup> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator,
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

		List<VRProductionPlantEquipmentMarkup> list = null;

		if (retrieveFromCache) {
			list = (List<VRProductionPlantEquipmentMarkup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP;

				if (pagination) {
					sql = sql.concat(VRProductionPlantEquipmentMarkupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRProductionPlantEquipmentMarkup>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRProductionPlantEquipmentMarkup>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the vr production plant equipment markups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup : findAll()) {
			remove(vrProductionPlantEquipmentMarkup);
		}
	}

	/**
	 * Returns the number of vr production plant equipment markups.
	 *
	 * @return the number of vr production plant equipment markups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENTMARKUP);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VRProductionPlantEquipmentMarkupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr production plant equipment markup persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRProductionPlantEquipmentMarkupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP = "SELECT vrProductionPlantEquipmentMarkup FROM VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup";
	private static final String _SQL_SELECT_VRPRODUCTIONPLANTEQUIPMENTMARKUP_WHERE_PKS_IN =
		"SELECT vrProductionPlantEquipmentMarkup FROM VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup WHERE id_ IN (";
	private static final String _SQL_COUNT_VRPRODUCTIONPLANTEQUIPMENTMARKUP = "SELECT COUNT(vrProductionPlantEquipmentMarkup) FROM VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrProductionPlantEquipmentMarkup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRProductionPlantEquipmentMarkup exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(VRProductionPlantEquipmentMarkupPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}