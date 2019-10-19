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

package com.fds.vr.cop.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.cop.exception.NoSuchVRCOPReportRepositoryException;
import com.fds.vr.cop.model.VRCOPReportRepository;
import com.fds.vr.cop.model.impl.VRCOPReportRepositoryImpl;
import com.fds.vr.cop.model.impl.VRCOPReportRepositoryModelImpl;
import com.fds.vr.cop.service.persistence.VRCOPReportRepositoryPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vrcop report repository service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPReportRepositoryPersistence
 * @see com.fds.vr.cop.service.persistence.VRCOPReportRepositoryUtil
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryPersistenceImpl extends BasePersistenceImpl<VRCOPReportRepository>
	implements VRCOPReportRepositoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPReportRepositoryUtil} to access the vrcop report repository persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPReportRepositoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_COP_REPORT_NO = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCOP_REPORT_NO", new String[] { String.class.getName() },
			VRCOPReportRepositoryModelImpl.COPREPORTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COP_REPORT_NO = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCOP_REPORT_NO",
			new String[] { String.class.getName() });

	/**
	 * Returns the vrcop report repository where COPReportNo = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	 *
	 * @param COPReportNo the cop report no
	 * @return the matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByCOP_REPORT_NO(String COPReportNo)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByCOP_REPORT_NO(COPReportNo);

		if (vrcopReportRepository == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("COPReportNo=");
			msg.append(COPReportNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRCOPReportRepositoryException(msg.toString());
		}

		return vrcopReportRepository;
	}

	/**
	 * Returns the vrcop report repository where COPReportNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param COPReportNo the cop report no
	 * @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByCOP_REPORT_NO(String COPReportNo) {
		return fetchByCOP_REPORT_NO(COPReportNo, true);
	}

	/**
	 * Returns the vrcop report repository where COPReportNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param COPReportNo the cop report no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByCOP_REPORT_NO(String COPReportNo,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { COPReportNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_COP_REPORT_NO,
					finderArgs, this);
		}

		if (result instanceof VRCOPReportRepository) {
			VRCOPReportRepository vrcopReportRepository = (VRCOPReportRepository)result;

			if (!Objects.equals(COPReportNo,
						vrcopReportRepository.getCOPReportNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

			boolean bindCOPReportNo = false;

			if (COPReportNo == null) {
				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1);
			}
			else if (COPReportNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3);
			}
			else {
				bindCOPReportNo = true;

				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCOPReportNo) {
					qPos.add(COPReportNo);
				}

				List<VRCOPReportRepository> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_COP_REPORT_NO,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRCOPReportRepositoryPersistenceImpl.fetchByCOP_REPORT_NO(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRCOPReportRepository vrcopReportRepository = list.get(0);

					result = vrcopReportRepository;

					cacheResult(vrcopReportRepository);

					if ((vrcopReportRepository.getCOPReportNo() == null) ||
							!vrcopReportRepository.getCOPReportNo()
													  .equals(COPReportNo)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_COP_REPORT_NO,
							finderArgs, vrcopReportRepository);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_COP_REPORT_NO,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (VRCOPReportRepository)result;
		}
	}

	/**
	 * Removes the vrcop report repository where COPReportNo = &#63; from the database.
	 *
	 * @param COPReportNo the cop report no
	 * @return the vrcop report repository that was removed
	 */
	@Override
	public VRCOPReportRepository removeByCOP_REPORT_NO(String COPReportNo)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findByCOP_REPORT_NO(COPReportNo);

		return remove(vrcopReportRepository);
	}

	/**
	 * Returns the number of vrcop report repositories where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countByCOP_REPORT_NO(String COPReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COP_REPORT_NO;

		Object[] finderArgs = new Object[] { COPReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

			boolean bindCOPReportNo = false;

			if (COPReportNo == null) {
				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1);
			}
			else if (COPReportNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3);
			}
			else {
				bindCOPReportNo = true;

				query.append(_FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCOPReportNo) {
					qPos.add(COPReportNo);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1 = "vrcopReportRepository.COPReportNo IS NULL";
	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2 = "vrcopReportRepository.COPReportNo = ?";
	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3 = "(vrcopReportRepository.COPReportNo IS NULL OR vrcopReportRepository.COPReportNo = '')";

	public VRCOPReportRepositoryPersistenceImpl() {
		setModelClass(VRCOPReportRepository.class);
	}

	/**
	 * Caches the vrcop report repository in the entity cache if it is enabled.
	 *
	 * @param vrcopReportRepository the vrcop report repository
	 */
	@Override
	public void cacheResult(VRCOPReportRepository vrcopReportRepository) {
		entityCache.putResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			vrcopReportRepository.getPrimaryKey(), vrcopReportRepository);

		finderCache.putResult(FINDER_PATH_FETCH_BY_COP_REPORT_NO,
			new Object[] { vrcopReportRepository.getCOPReportNo() },
			vrcopReportRepository);

		vrcopReportRepository.resetOriginalValues();
	}

	/**
	 * Caches the vrcop report repositories in the entity cache if it is enabled.
	 *
	 * @param vrcopReportRepositories the vrcop report repositories
	 */
	@Override
	public void cacheResult(List<VRCOPReportRepository> vrcopReportRepositories) {
		for (VRCOPReportRepository vrcopReportRepository : vrcopReportRepositories) {
			if (entityCache.getResult(
						VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPReportRepositoryImpl.class,
						vrcopReportRepository.getPrimaryKey()) == null) {
				cacheResult(vrcopReportRepository);
			}
			else {
				vrcopReportRepository.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop report repositories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPReportRepositoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop report repository.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCOPReportRepository vrcopReportRepository) {
		entityCache.removeResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			vrcopReportRepository.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRCOPReportRepositoryModelImpl)vrcopReportRepository,
			true);
	}

	@Override
	public void clearCache(List<VRCOPReportRepository> vrcopReportRepositories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPReportRepository vrcopReportRepository : vrcopReportRepositories) {
			entityCache.removeResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPReportRepositoryImpl.class,
				vrcopReportRepository.getPrimaryKey());

			clearUniqueFindersCache((VRCOPReportRepositoryModelImpl)vrcopReportRepository,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRCOPReportRepositoryModelImpl vrcopReportRepositoryModelImpl) {
		Object[] args = new Object[] {
				vrcopReportRepositoryModelImpl.getCOPReportNo()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_COP_REPORT_NO, args,
			vrcopReportRepositoryModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRCOPReportRepositoryModelImpl vrcopReportRepositoryModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrcopReportRepositoryModelImpl.getCOPReportNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_COP_REPORT_NO, args);
		}

		if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_COP_REPORT_NO.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrcopReportRepositoryModelImpl.getOriginalCOPReportNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_COP_REPORT_NO, args);
		}
	}

	/**
	 * Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	 *
	 * @param id the primary key for the new vrcop report repository
	 * @return the new vrcop report repository
	 */
	@Override
	public VRCOPReportRepository create(long id) {
		VRCOPReportRepository vrcopReportRepository = new VRCOPReportRepositoryImpl();

		vrcopReportRepository.setNew(true);
		vrcopReportRepository.setPrimaryKey(id);

		return vrcopReportRepository;
	}

	/**
	 * Removes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop report repository
	 * @return the vrcop report repository that was removed
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository remove(long id)
		throws NoSuchVRCOPReportRepositoryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop report repository
	 * @return the vrcop report repository that was removed
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository remove(Serializable primaryKey)
		throws NoSuchVRCOPReportRepositoryException {
		Session session = null;

		try {
			session = openSession();

			VRCOPReportRepository vrcopReportRepository = (VRCOPReportRepository)session.get(VRCOPReportRepositoryImpl.class,
					primaryKey);

			if (vrcopReportRepository == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPReportRepositoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopReportRepository);
		}
		catch (NoSuchVRCOPReportRepositoryException nsee) {
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
	protected VRCOPReportRepository removeImpl(
		VRCOPReportRepository vrcopReportRepository) {
		vrcopReportRepository = toUnwrappedModel(vrcopReportRepository);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopReportRepository)) {
				vrcopReportRepository = (VRCOPReportRepository)session.get(VRCOPReportRepositoryImpl.class,
						vrcopReportRepository.getPrimaryKeyObj());
			}

			if (vrcopReportRepository != null) {
				session.delete(vrcopReportRepository);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopReportRepository != null) {
			clearCache(vrcopReportRepository);
		}

		return vrcopReportRepository;
	}

	@Override
	public VRCOPReportRepository updateImpl(
		VRCOPReportRepository vrcopReportRepository) {
		vrcopReportRepository = toUnwrappedModel(vrcopReportRepository);

		boolean isNew = vrcopReportRepository.isNew();

		VRCOPReportRepositoryModelImpl vrcopReportRepositoryModelImpl = (VRCOPReportRepositoryModelImpl)vrcopReportRepository;

		Session session = null;

		try {
			session = openSession();

			if (vrcopReportRepository.isNew()) {
				session.save(vrcopReportRepository);

				vrcopReportRepository.setNew(false);
			}
			else {
				vrcopReportRepository = (VRCOPReportRepository)session.merge(vrcopReportRepository);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRCOPReportRepositoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			vrcopReportRepository.getPrimaryKey(), vrcopReportRepository, false);

		clearUniqueFindersCache(vrcopReportRepositoryModelImpl, false);
		cacheUniqueFindersCache(vrcopReportRepositoryModelImpl);

		vrcopReportRepository.resetOriginalValues();

		return vrcopReportRepository;
	}

	protected VRCOPReportRepository toUnwrappedModel(
		VRCOPReportRepository vrcopReportRepository) {
		if (vrcopReportRepository instanceof VRCOPReportRepositoryImpl) {
			return vrcopReportRepository;
		}

		VRCOPReportRepositoryImpl vrcopReportRepositoryImpl = new VRCOPReportRepositoryImpl();

		vrcopReportRepositoryImpl.setNew(vrcopReportRepository.isNew());
		vrcopReportRepositoryImpl.setPrimaryKey(vrcopReportRepository.getPrimaryKey());

		vrcopReportRepositoryImpl.setId(vrcopReportRepository.getId());
		vrcopReportRepositoryImpl.setMtCore(vrcopReportRepository.getMtCore());
		vrcopReportRepositoryImpl.setApplicantProfileId(vrcopReportRepository.getApplicantProfileId());
		vrcopReportRepositoryImpl.setApplicantCode(vrcopReportRepository.getApplicantCode());
		vrcopReportRepositoryImpl.setApplicantName(vrcopReportRepository.getApplicantName());
		vrcopReportRepositoryImpl.setApplicantAddress(vrcopReportRepository.getApplicantAddress());
		vrcopReportRepositoryImpl.setOverseasManufacturerCode(vrcopReportRepository.getOverseasManufacturerCode());
		vrcopReportRepositoryImpl.setOverseasManufacturerName(vrcopReportRepository.getOverseasManufacturerName());
		vrcopReportRepositoryImpl.setOverseasManufacturerAddress(vrcopReportRepository.getOverseasManufacturerAddress());
		vrcopReportRepositoryImpl.setProductionPlantId(vrcopReportRepository.getProductionPlantId());
		vrcopReportRepositoryImpl.setProductionPlantCode(vrcopReportRepository.getProductionPlantCode());
		vrcopReportRepositoryImpl.setProductionPlantName(vrcopReportRepository.getProductionPlantName());
		vrcopReportRepositoryImpl.setProductionPlantAddress(vrcopReportRepository.getProductionPlantAddress());
		vrcopReportRepositoryImpl.setCOPReportNo(vrcopReportRepository.getCOPReportNo());
		vrcopReportRepositoryImpl.setCOPReportStatus(vrcopReportRepository.getCOPReportStatus());
		vrcopReportRepositoryImpl.setCOPReportType(vrcopReportRepository.getCOPReportType());
		vrcopReportRepositoryImpl.setCOPReportMetadata(vrcopReportRepository.getCOPReportMetadata());
		vrcopReportRepositoryImpl.setCOPReportSignName(vrcopReportRepository.getCOPReportSignName());
		vrcopReportRepositoryImpl.setCOPReportSignTitle(vrcopReportRepository.getCOPReportSignTitle());
		vrcopReportRepositoryImpl.setCOPReportSignPlace(vrcopReportRepository.getCOPReportSignPlace());
		vrcopReportRepositoryImpl.setCOPReportDate(vrcopReportRepository.getCOPReportDate());
		vrcopReportRepositoryImpl.setCOPReportApprovedDate(vrcopReportRepository.getCOPReportApprovedDate());
		vrcopReportRepositoryImpl.setCOPReportExpiredDate(vrcopReportRepository.getCOPReportExpiredDate());
		vrcopReportRepositoryImpl.setCOPFileEntryId(vrcopReportRepository.getCOPFileEntryId());
		vrcopReportRepositoryImpl.setModifyDate(vrcopReportRepository.getModifyDate());
		vrcopReportRepositoryImpl.setSyncDate(vrcopReportRepository.getSyncDate());

		return vrcopReportRepositoryImpl;
	}

	/**
	 * Returns the vrcop report repository with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop report repository
	 * @return the vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByPrimaryKey(primaryKey);

		if (vrcopReportRepository == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPReportRepositoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopReportRepository;
	}

	/**
	 * Returns the vrcop report repository with the primary key or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop report repository
	 * @return the vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository findByPrimaryKey(long id)
		throws NoSuchVRCOPReportRepositoryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop report repository with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop report repository
	 * @return the vrcop report repository, or <code>null</code> if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPReportRepositoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPReportRepository vrcopReportRepository = (VRCOPReportRepository)serializable;

		if (vrcopReportRepository == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopReportRepository = (VRCOPReportRepository)session.get(VRCOPReportRepositoryImpl.class,
						primaryKey);

				if (vrcopReportRepository != null) {
					cacheResult(vrcopReportRepository);
				}
				else {
					entityCache.putResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPReportRepositoryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportRepositoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopReportRepository;
	}

	/**
	 * Returns the vrcop report repository with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop report repository
	 * @return the vrcop report repository, or <code>null</code> if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPReportRepository> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPReportRepository> map = new HashMap<Serializable, VRCOPReportRepository>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPReportRepository vrcopReportRepository = fetchByPrimaryKey(primaryKey);

			if (vrcopReportRepository != null) {
				map.put(primaryKey, vrcopReportRepository);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportRepositoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCOPReportRepository)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE_PKS_IN);

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

			for (VRCOPReportRepository vrcopReportRepository : (List<VRCOPReportRepository>)q.list()) {
				map.put(vrcopReportRepository.getPrimaryKeyObj(),
					vrcopReportRepository);

				cacheResult(vrcopReportRepository);

				uncachedPrimaryKeys.remove(vrcopReportRepository.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportRepositoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the vrcop report repositories.
	 *
	 * @return the vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report repositories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findAll(int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findAll(int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
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

		List<VRCOPReportRepository> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportRepository>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPREPORTREPOSITORY;

				if (pagination) {
					sql = sql.concat(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
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
	 * Removes all the vrcop report repositories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPReportRepository vrcopReportRepository : findAll()) {
			remove(vrcopReportRepository);
		}
	}

	/**
	 * Returns the number of vrcop report repositories.
	 *
	 * @return the number of vrcop report repositories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPREPORTREPOSITORY);

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
		return VRCOPReportRepositoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop report repository persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPReportRepositoryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPREPORTREPOSITORY = "SELECT vrcopReportRepository FROM VRCOPReportRepository vrcopReportRepository";
	private static final String _SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE_PKS_IN = "SELECT vrcopReportRepository FROM VRCOPReportRepository vrcopReportRepository WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE = "SELECT vrcopReportRepository FROM VRCOPReportRepository vrcopReportRepository WHERE ";
	private static final String _SQL_COUNT_VRCOPREPORTREPOSITORY = "SELECT COUNT(vrcopReportRepository) FROM VRCOPReportRepository vrcopReportRepository";
	private static final String _SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE = "SELECT COUNT(vrcopReportRepository) FROM VRCOPReportRepository vrcopReportRepository WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopReportRepository.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPReportRepository exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPReportRepository exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPReportRepositoryPersistenceImpl.class);
}