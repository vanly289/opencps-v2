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

import com.fds.vr.business.exception.NoSuchILVehicleException;
import com.fds.vr.business.model.ILVehicle;
import com.fds.vr.business.model.impl.ILVehicleImpl;
import com.fds.vr.business.model.impl.ILVehicleModelImpl;
import com.fds.vr.business.service.persistence.ILVehiclePersistence;

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
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the il vehicle service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see ILVehiclePersistence
 * @see com.fds.vr.business.service.persistence.ILVehicleUtil
 * @generated
 */
@ProviderType
public class ILVehiclePersistenceImpl extends BasePersistenceImpl<ILVehicle>
	implements ILVehiclePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ILVehicleUtil} to access the il vehicle persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ILVehicleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleModelImpl.FINDER_CACHE_ENABLED, ILVehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleModelImpl.FINDER_CACHE_ENABLED, ILVehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_ISSU_NO =
		new FinderPath(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleModelImpl.FINDER_CACHE_ENABLED, ILVehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_ISSU_NO",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ISSU_NO =
		new FinderPath(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleModelImpl.FINDER_CACHE_ENABLED, ILVehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_ISSU_NO",
			new String[] { String.class.getName() },
			ILVehicleModelImpl.ISSUINGDISPATCHNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_ISSU_NO = new FinderPath(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_ISSU_NO",
			new String[] { String.class.getName() });

	/**
	 * Returns all the il vehicles where issuingDispatchNo = &#63;.
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @return the matching il vehicles
	 */
	@Override
	public List<ILVehicle> findByF_ISSU_NO(String issuingDispatchNo) {
		return findByF_ISSU_NO(issuingDispatchNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the il vehicles where issuingDispatchNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @param start the lower bound of the range of il vehicles
	 * @param end the upper bound of the range of il vehicles (not inclusive)
	 * @return the range of matching il vehicles
	 */
	@Override
	public List<ILVehicle> findByF_ISSU_NO(String issuingDispatchNo, int start,
		int end) {
		return findByF_ISSU_NO(issuingDispatchNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the il vehicles where issuingDispatchNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @param start the lower bound of the range of il vehicles
	 * @param end the upper bound of the range of il vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching il vehicles
	 */
	@Override
	public List<ILVehicle> findByF_ISSU_NO(String issuingDispatchNo, int start,
		int end, OrderByComparator<ILVehicle> orderByComparator) {
		return findByF_ISSU_NO(issuingDispatchNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the il vehicles where issuingDispatchNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @param start the lower bound of the range of il vehicles
	 * @param end the upper bound of the range of il vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching il vehicles
	 */
	@Override
	public List<ILVehicle> findByF_ISSU_NO(String issuingDispatchNo, int start,
		int end, OrderByComparator<ILVehicle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ISSU_NO;
			finderArgs = new Object[] { issuingDispatchNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_ISSU_NO;
			finderArgs = new Object[] {
					issuingDispatchNo,
					
					start, end, orderByComparator
				};
		}

		List<ILVehicle> list = null;

		if (retrieveFromCache) {
			list = (List<ILVehicle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ILVehicle ilVehicle : list) {
					if (!Objects.equals(issuingDispatchNo,
								ilVehicle.getIssuingDispatchNo())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ILVEHICLE_WHERE);

			boolean bindIssuingDispatchNo = false;

			if (issuingDispatchNo == null) {
				query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_1);
			}
			else if (issuingDispatchNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_3);
			}
			else {
				bindIssuingDispatchNo = true;

				query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ILVehicleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssuingDispatchNo) {
					qPos.add(issuingDispatchNo);
				}

				if (!pagination) {
					list = (List<ILVehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ILVehicle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first il vehicle in the ordered set where issuingDispatchNo = &#63;.
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching il vehicle
	 * @throws NoSuchILVehicleException if a matching il vehicle could not be found
	 */
	@Override
	public ILVehicle findByF_ISSU_NO_First(String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator)
		throws NoSuchILVehicleException {
		ILVehicle ilVehicle = fetchByF_ISSU_NO_First(issuingDispatchNo,
				orderByComparator);

		if (ilVehicle != null) {
			return ilVehicle;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issuingDispatchNo=");
		msg.append(issuingDispatchNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchILVehicleException(msg.toString());
	}

	/**
	 * Returns the first il vehicle in the ordered set where issuingDispatchNo = &#63;.
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching il vehicle, or <code>null</code> if a matching il vehicle could not be found
	 */
	@Override
	public ILVehicle fetchByF_ISSU_NO_First(String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator) {
		List<ILVehicle> list = findByF_ISSU_NO(issuingDispatchNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last il vehicle in the ordered set where issuingDispatchNo = &#63;.
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching il vehicle
	 * @throws NoSuchILVehicleException if a matching il vehicle could not be found
	 */
	@Override
	public ILVehicle findByF_ISSU_NO_Last(String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator)
		throws NoSuchILVehicleException {
		ILVehicle ilVehicle = fetchByF_ISSU_NO_Last(issuingDispatchNo,
				orderByComparator);

		if (ilVehicle != null) {
			return ilVehicle;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issuingDispatchNo=");
		msg.append(issuingDispatchNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchILVehicleException(msg.toString());
	}

	/**
	 * Returns the last il vehicle in the ordered set where issuingDispatchNo = &#63;.
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching il vehicle, or <code>null</code> if a matching il vehicle could not be found
	 */
	@Override
	public ILVehicle fetchByF_ISSU_NO_Last(String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator) {
		int count = countByF_ISSU_NO(issuingDispatchNo);

		if (count == 0) {
			return null;
		}

		List<ILVehicle> list = findByF_ISSU_NO(issuingDispatchNo, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the il vehicles before and after the current il vehicle in the ordered set where issuingDispatchNo = &#63;.
	 *
	 * @param id the primary key of the current il vehicle
	 * @param issuingDispatchNo the issuing dispatch no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next il vehicle
	 * @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	 */
	@Override
	public ILVehicle[] findByF_ISSU_NO_PrevAndNext(long id,
		String issuingDispatchNo, OrderByComparator<ILVehicle> orderByComparator)
		throws NoSuchILVehicleException {
		ILVehicle ilVehicle = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ILVehicle[] array = new ILVehicleImpl[3];

			array[0] = getByF_ISSU_NO_PrevAndNext(session, ilVehicle,
					issuingDispatchNo, orderByComparator, true);

			array[1] = ilVehicle;

			array[2] = getByF_ISSU_NO_PrevAndNext(session, ilVehicle,
					issuingDispatchNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ILVehicle getByF_ISSU_NO_PrevAndNext(Session session,
		ILVehicle ilVehicle, String issuingDispatchNo,
		OrderByComparator<ILVehicle> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ILVEHICLE_WHERE);

		boolean bindIssuingDispatchNo = false;

		if (issuingDispatchNo == null) {
			query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_1);
		}
		else if (issuingDispatchNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_3);
		}
		else {
			bindIssuingDispatchNo = true;

			query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ILVehicleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIssuingDispatchNo) {
			qPos.add(issuingDispatchNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(ilVehicle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ILVehicle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the il vehicles where issuingDispatchNo = &#63; from the database.
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 */
	@Override
	public void removeByF_ISSU_NO(String issuingDispatchNo) {
		for (ILVehicle ilVehicle : findByF_ISSU_NO(issuingDispatchNo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(ilVehicle);
		}
	}

	/**
	 * Returns the number of il vehicles where issuingDispatchNo = &#63;.
	 *
	 * @param issuingDispatchNo the issuing dispatch no
	 * @return the number of matching il vehicles
	 */
	@Override
	public int countByF_ISSU_NO(String issuingDispatchNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_ISSU_NO;

		Object[] finderArgs = new Object[] { issuingDispatchNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ILVEHICLE_WHERE);

			boolean bindIssuingDispatchNo = false;

			if (issuingDispatchNo == null) {
				query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_1);
			}
			else if (issuingDispatchNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_3);
			}
			else {
				bindIssuingDispatchNo = true;

				query.append(_FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssuingDispatchNo) {
					qPos.add(issuingDispatchNo);
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

	private static final String _FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_1 = "ilVehicle.issuingDispatchNo IS NULL";
	private static final String _FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_2 = "ilVehicle.issuingDispatchNo = ?";
	private static final String _FINDER_COLUMN_F_ISSU_NO_ISSUINGDISPATCHNO_3 = "(ilVehicle.issuingDispatchNo IS NULL OR ilVehicle.issuingDispatchNo = '')";

	public ILVehiclePersistenceImpl() {
		setModelClass(ILVehicle.class);
	}

	/**
	 * Caches the il vehicle in the entity cache if it is enabled.
	 *
	 * @param ilVehicle the il vehicle
	 */
	@Override
	public void cacheResult(ILVehicle ilVehicle) {
		entityCache.putResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleImpl.class, ilVehicle.getPrimaryKey(), ilVehicle);

		ilVehicle.resetOriginalValues();
	}

	/**
	 * Caches the il vehicles in the entity cache if it is enabled.
	 *
	 * @param ilVehicles the il vehicles
	 */
	@Override
	public void cacheResult(List<ILVehicle> ilVehicles) {
		for (ILVehicle ilVehicle : ilVehicles) {
			if (entityCache.getResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
						ILVehicleImpl.class, ilVehicle.getPrimaryKey()) == null) {
				cacheResult(ilVehicle);
			}
			else {
				ilVehicle.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all il vehicles.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ILVehicleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the il vehicle.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ILVehicle ilVehicle) {
		entityCache.removeResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleImpl.class, ilVehicle.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ILVehicle> ilVehicles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ILVehicle ilVehicle : ilVehicles) {
			entityCache.removeResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
				ILVehicleImpl.class, ilVehicle.getPrimaryKey());
		}
	}

	/**
	 * Creates a new il vehicle with the primary key. Does not add the il vehicle to the database.
	 *
	 * @param id the primary key for the new il vehicle
	 * @return the new il vehicle
	 */
	@Override
	public ILVehicle create(long id) {
		ILVehicle ilVehicle = new ILVehicleImpl();

		ilVehicle.setNew(true);
		ilVehicle.setPrimaryKey(id);

		return ilVehicle;
	}

	/**
	 * Removes the il vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the il vehicle
	 * @return the il vehicle that was removed
	 * @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	 */
	@Override
	public ILVehicle remove(long id) throws NoSuchILVehicleException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the il vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the il vehicle
	 * @return the il vehicle that was removed
	 * @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	 */
	@Override
	public ILVehicle remove(Serializable primaryKey)
		throws NoSuchILVehicleException {
		Session session = null;

		try {
			session = openSession();

			ILVehicle ilVehicle = (ILVehicle)session.get(ILVehicleImpl.class,
					primaryKey);

			if (ilVehicle == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchILVehicleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ilVehicle);
		}
		catch (NoSuchILVehicleException nsee) {
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
	protected ILVehicle removeImpl(ILVehicle ilVehicle) {
		ilVehicle = toUnwrappedModel(ilVehicle);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ilVehicle)) {
				ilVehicle = (ILVehicle)session.get(ILVehicleImpl.class,
						ilVehicle.getPrimaryKeyObj());
			}

			if (ilVehicle != null) {
				session.delete(ilVehicle);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ilVehicle != null) {
			clearCache(ilVehicle);
		}

		return ilVehicle;
	}

	@Override
	public ILVehicle updateImpl(ILVehicle ilVehicle) {
		ilVehicle = toUnwrappedModel(ilVehicle);

		boolean isNew = ilVehicle.isNew();

		ILVehicleModelImpl ilVehicleModelImpl = (ILVehicleModelImpl)ilVehicle;

		Session session = null;

		try {
			session = openSession();

			if (ilVehicle.isNew()) {
				session.save(ilVehicle);

				ilVehicle.setNew(false);
			}
			else {
				ilVehicle = (ILVehicle)session.merge(ilVehicle);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ILVehicleModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ilVehicleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ISSU_NO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ilVehicleModelImpl.getOriginalIssuingDispatchNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_ISSU_NO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ISSU_NO,
					args);

				args = new Object[] { ilVehicleModelImpl.getIssuingDispatchNo() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_ISSU_NO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_ISSU_NO,
					args);
			}
		}

		entityCache.putResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleImpl.class, ilVehicle.getPrimaryKey(), ilVehicle, false);

		ilVehicle.resetOriginalValues();

		return ilVehicle;
	}

	protected ILVehicle toUnwrappedModel(ILVehicle ilVehicle) {
		if (ilVehicle instanceof ILVehicleImpl) {
			return ilVehicle;
		}

		ILVehicleImpl ilVehicleImpl = new ILVehicleImpl();

		ilVehicleImpl.setNew(ilVehicle.isNew());
		ilVehicleImpl.setPrimaryKey(ilVehicle.getPrimaryKey());

		ilVehicleImpl.setId(ilVehicle.getId());
		ilVehicleImpl.setIssuingDispatchNo(ilVehicle.getIssuingDispatchNo());
		ilVehicleImpl.setSequenceNo(ilVehicle.getSequenceNo());
		ilVehicleImpl.setRegistrationNumber(ilVehicle.getRegistrationNumber());
		ilVehicleImpl.setRegistrationDriver(ilVehicle.getRegistrationDriver());
		ilVehicleImpl.setVehicleModelCode(ilVehicle.getVehicleModelCode());
		ilVehicleImpl.setVehicleModelName(ilVehicle.getVehicleModelName());
		ilVehicleImpl.setCapacity(ilVehicle.getCapacity());
		ilVehicleImpl.setManufacturedYear(ilVehicle.getManufacturedYear());
		ilVehicleImpl.setVehicleExpImpGateCode(ilVehicle.getVehicleExpImpGateCode());
		ilVehicleImpl.setVehicleExpImpGate(ilVehicle.getVehicleExpImpGate());
		ilVehicleImpl.setOperationType(ilVehicle.getOperationType());
		ilVehicleImpl.setPassengerOrCargo(ilVehicle.getPassengerOrCargo());
		ilVehicleImpl.setLienVanNo(ilVehicle.getLienVanNo());
		ilVehicleImpl.setSyncDate(ilVehicle.getSyncDate());

		return ilVehicleImpl;
	}

	/**
	 * Returns the il vehicle with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the il vehicle
	 * @return the il vehicle
	 * @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	 */
	@Override
	public ILVehicle findByPrimaryKey(Serializable primaryKey)
		throws NoSuchILVehicleException {
		ILVehicle ilVehicle = fetchByPrimaryKey(primaryKey);

		if (ilVehicle == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchILVehicleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ilVehicle;
	}

	/**
	 * Returns the il vehicle with the primary key or throws a {@link NoSuchILVehicleException} if it could not be found.
	 *
	 * @param id the primary key of the il vehicle
	 * @return the il vehicle
	 * @throws NoSuchILVehicleException if a il vehicle with the primary key could not be found
	 */
	@Override
	public ILVehicle findByPrimaryKey(long id) throws NoSuchILVehicleException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the il vehicle with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the il vehicle
	 * @return the il vehicle, or <code>null</code> if a il vehicle with the primary key could not be found
	 */
	@Override
	public ILVehicle fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
				ILVehicleImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ILVehicle ilVehicle = (ILVehicle)serializable;

		if (ilVehicle == null) {
			Session session = null;

			try {
				session = openSession();

				ilVehicle = (ILVehicle)session.get(ILVehicleImpl.class,
						primaryKey);

				if (ilVehicle != null) {
					cacheResult(ilVehicle);
				}
				else {
					entityCache.putResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
						ILVehicleImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
					ILVehicleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ilVehicle;
	}

	/**
	 * Returns the il vehicle with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the il vehicle
	 * @return the il vehicle, or <code>null</code> if a il vehicle with the primary key could not be found
	 */
	@Override
	public ILVehicle fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ILVehicle> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ILVehicle> map = new HashMap<Serializable, ILVehicle>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ILVehicle ilVehicle = fetchByPrimaryKey(primaryKey);

			if (ilVehicle != null) {
				map.put(primaryKey, ilVehicle);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
					ILVehicleImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ILVehicle)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ILVEHICLE_WHERE_PKS_IN);

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

			for (ILVehicle ilVehicle : (List<ILVehicle>)q.list()) {
				map.put(ilVehicle.getPrimaryKeyObj(), ilVehicle);

				cacheResult(ilVehicle);

				uncachedPrimaryKeys.remove(ilVehicle.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ILVehicleModelImpl.ENTITY_CACHE_ENABLED,
					ILVehicleImpl.class, primaryKey, nullModel);
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
	 * Returns all the il vehicles.
	 *
	 * @return the il vehicles
	 */
	@Override
	public List<ILVehicle> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the il vehicles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il vehicles
	 * @param end the upper bound of the range of il vehicles (not inclusive)
	 * @return the range of il vehicles
	 */
	@Override
	public List<ILVehicle> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the il vehicles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il vehicles
	 * @param end the upper bound of the range of il vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of il vehicles
	 */
	@Override
	public List<ILVehicle> findAll(int start, int end,
		OrderByComparator<ILVehicle> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the il vehicles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il vehicles
	 * @param end the upper bound of the range of il vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of il vehicles
	 */
	@Override
	public List<ILVehicle> findAll(int start, int end,
		OrderByComparator<ILVehicle> orderByComparator,
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

		List<ILVehicle> list = null;

		if (retrieveFromCache) {
			list = (List<ILVehicle>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ILVEHICLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ILVEHICLE;

				if (pagination) {
					sql = sql.concat(ILVehicleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ILVehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ILVehicle>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the il vehicles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ILVehicle ilVehicle : findAll()) {
			remove(ilVehicle);
		}
	}

	/**
	 * Returns the number of il vehicles.
	 *
	 * @return the number of il vehicles
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ILVEHICLE);

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
		return ILVehicleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the il vehicle persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ILVehicleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ILVEHICLE = "SELECT ilVehicle FROM ILVehicle ilVehicle";
	private static final String _SQL_SELECT_ILVEHICLE_WHERE_PKS_IN = "SELECT ilVehicle FROM ILVehicle ilVehicle WHERE vehicleId IN (";
	private static final String _SQL_SELECT_ILVEHICLE_WHERE = "SELECT ilVehicle FROM ILVehicle ilVehicle WHERE ";
	private static final String _SQL_COUNT_ILVEHICLE = "SELECT COUNT(ilVehicle) FROM ILVehicle ilVehicle";
	private static final String _SQL_COUNT_ILVEHICLE_WHERE = "SELECT COUNT(ilVehicle) FROM ILVehicle ilVehicle WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ilVehicle.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ILVehicle exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ILVehicle exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ILVehiclePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}