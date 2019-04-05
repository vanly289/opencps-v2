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

import com.fds.vr.business.exception.NoSuchILVehicleCustomsBorderGuardException;
import com.fds.vr.business.model.ILVehicleCustomsBorderGuard;
import com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardImpl;
import com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl;
import com.fds.vr.business.service.persistence.ILVehicleCustomsBorderGuardPersistence;

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
 * The persistence implementation for the il vehicle customs border guard service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see ILVehicleCustomsBorderGuardPersistence
 * @see com.fds.vr.business.service.persistence.ILVehicleCustomsBorderGuardUtil
 * @generated
 */
@ProviderType
public class ILVehicleCustomsBorderGuardPersistenceImpl
	extends BasePersistenceImpl<ILVehicleCustomsBorderGuard>
	implements ILVehicleCustomsBorderGuardPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ILVehicleCustomsBorderGuardUtil} to access the il vehicle customs border guard persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ILVehicleCustomsBorderGuardImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardModelImpl.FINDER_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardModelImpl.FINDER_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_REG_NUMBER =
		new FinderPath(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardModelImpl.FINDER_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_REG_NUMBER",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_REG_NUMBER =
		new FinderPath(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardModelImpl.FINDER_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_REG_NUMBER",
			new String[] { String.class.getName() },
			ILVehicleCustomsBorderGuardModelImpl.REGISTRATIONNUMBER_COLUMN_BITMASK |
			ILVehicleCustomsBorderGuardModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_REG_NUMBER = new FinderPath(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_REG_NUMBER", new String[] { String.class.getName() });

	/**
	 * Returns all the il vehicle customs border guards where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @return the matching il vehicle customs border guards
	 */
	@Override
	public List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		String registrationNumber) {
		return findByF_REG_NUMBER(registrationNumber, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the il vehicle customs border guards where registrationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registrationNumber the registration number
	 * @param start the lower bound of the range of il vehicle customs border guards
	 * @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	 * @return the range of matching il vehicle customs border guards
	 */
	@Override
	public List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		String registrationNumber, int start, int end) {
		return findByF_REG_NUMBER(registrationNumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the il vehicle customs border guards where registrationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registrationNumber the registration number
	 * @param start the lower bound of the range of il vehicle customs border guards
	 * @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching il vehicle customs border guards
	 */
	@Override
	public List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		String registrationNumber, int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		return findByF_REG_NUMBER(registrationNumber, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the il vehicle customs border guards where registrationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registrationNumber the registration number
	 * @param start the lower bound of the range of il vehicle customs border guards
	 * @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching il vehicle customs border guards
	 */
	@Override
	public List<ILVehicleCustomsBorderGuard> findByF_REG_NUMBER(
		String registrationNumber, int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_REG_NUMBER;
			finderArgs = new Object[] { registrationNumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_REG_NUMBER;
			finderArgs = new Object[] {
					registrationNumber,
					
					start, end, orderByComparator
				};
		}

		List<ILVehicleCustomsBorderGuard> list = null;

		if (retrieveFromCache) {
			list = (List<ILVehicleCustomsBorderGuard>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard : list) {
					if (!Objects.equals(registrationNumber,
								ilVehicleCustomsBorderGuard.getRegistrationNumber())) {
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

			query.append(_SQL_SELECT_ILVEHICLECUSTOMSBORDERGUARD_WHERE);

			boolean bindRegistrationNumber = false;

			if (registrationNumber == null) {
				query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_1);
			}
			else if (registrationNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_3);
			}
			else {
				bindRegistrationNumber = true;

				query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ILVehicleCustomsBorderGuardModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegistrationNumber) {
					qPos.add(registrationNumber);
				}

				if (!pagination) {
					list = (List<ILVehicleCustomsBorderGuard>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ILVehicleCustomsBorderGuard>)QueryUtil.list(q,
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
	 * Returns the first il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching il vehicle customs border guard
	 * @throws NoSuchILVehicleCustomsBorderGuardException if a matching il vehicle customs border guard could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard findByF_REG_NUMBER_First(
		String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws NoSuchILVehicleCustomsBorderGuardException {
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard = fetchByF_REG_NUMBER_First(registrationNumber,
				orderByComparator);

		if (ilVehicleCustomsBorderGuard != null) {
			return ilVehicleCustomsBorderGuard;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registrationNumber=");
		msg.append(registrationNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchILVehicleCustomsBorderGuardException(msg.toString());
	}

	/**
	 * Returns the first il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching il vehicle customs border guard, or <code>null</code> if a matching il vehicle customs border guard could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard fetchByF_REG_NUMBER_First(
		String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		List<ILVehicleCustomsBorderGuard> list = findByF_REG_NUMBER(registrationNumber,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching il vehicle customs border guard
	 * @throws NoSuchILVehicleCustomsBorderGuardException if a matching il vehicle customs border guard could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard findByF_REG_NUMBER_Last(
		String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws NoSuchILVehicleCustomsBorderGuardException {
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard = fetchByF_REG_NUMBER_Last(registrationNumber,
				orderByComparator);

		if (ilVehicleCustomsBorderGuard != null) {
			return ilVehicleCustomsBorderGuard;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registrationNumber=");
		msg.append(registrationNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchILVehicleCustomsBorderGuardException(msg.toString());
	}

	/**
	 * Returns the last il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching il vehicle customs border guard, or <code>null</code> if a matching il vehicle customs border guard could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard fetchByF_REG_NUMBER_Last(
		String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		int count = countByF_REG_NUMBER(registrationNumber);

		if (count == 0) {
			return null;
		}

		List<ILVehicleCustomsBorderGuard> list = findByF_REG_NUMBER(registrationNumber,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the il vehicle customs border guards before and after the current il vehicle customs border guard in the ordered set where registrationNumber = &#63;.
	 *
	 * @param id the primary key of the current il vehicle customs border guard
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next il vehicle customs border guard
	 * @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard[] findByF_REG_NUMBER_PrevAndNext(
		long id, String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator)
		throws NoSuchILVehicleCustomsBorderGuardException {
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ILVehicleCustomsBorderGuard[] array = new ILVehicleCustomsBorderGuardImpl[3];

			array[0] = getByF_REG_NUMBER_PrevAndNext(session,
					ilVehicleCustomsBorderGuard, registrationNumber,
					orderByComparator, true);

			array[1] = ilVehicleCustomsBorderGuard;

			array[2] = getByF_REG_NUMBER_PrevAndNext(session,
					ilVehicleCustomsBorderGuard, registrationNumber,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ILVehicleCustomsBorderGuard getByF_REG_NUMBER_PrevAndNext(
		Session session,
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard,
		String registrationNumber,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ILVEHICLECUSTOMSBORDERGUARD_WHERE);

		boolean bindRegistrationNumber = false;

		if (registrationNumber == null) {
			query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_1);
		}
		else if (registrationNumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_3);
		}
		else {
			bindRegistrationNumber = true;

			query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_2);
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
			query.append(ILVehicleCustomsBorderGuardModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRegistrationNumber) {
			qPos.add(registrationNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(ilVehicleCustomsBorderGuard);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ILVehicleCustomsBorderGuard> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the il vehicle customs border guards where registrationNumber = &#63; from the database.
	 *
	 * @param registrationNumber the registration number
	 */
	@Override
	public void removeByF_REG_NUMBER(String registrationNumber) {
		for (ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard : findByF_REG_NUMBER(
				registrationNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(ilVehicleCustomsBorderGuard);
		}
	}

	/**
	 * Returns the number of il vehicle customs border guards where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @return the number of matching il vehicle customs border guards
	 */
	@Override
	public int countByF_REG_NUMBER(String registrationNumber) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_REG_NUMBER;

		Object[] finderArgs = new Object[] { registrationNumber };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ILVEHICLECUSTOMSBORDERGUARD_WHERE);

			boolean bindRegistrationNumber = false;

			if (registrationNumber == null) {
				query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_1);
			}
			else if (registrationNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_3);
			}
			else {
				bindRegistrationNumber = true;

				query.append(_FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegistrationNumber) {
					qPos.add(registrationNumber);
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

	private static final String _FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_1 =
		"ilVehicleCustomsBorderGuard.registrationNumber IS NULL";
	private static final String _FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_2 =
		"ilVehicleCustomsBorderGuard.registrationNumber = ?";
	private static final String _FINDER_COLUMN_F_REG_NUMBER_REGISTRATIONNUMBER_3 =
		"(ilVehicleCustomsBorderGuard.registrationNumber IS NULL OR ilVehicleCustomsBorderGuard.registrationNumber = '')";

	public ILVehicleCustomsBorderGuardPersistenceImpl() {
		setModelClass(ILVehicleCustomsBorderGuard.class);
	}

	/**
	 * Caches the il vehicle customs border guard in the entity cache if it is enabled.
	 *
	 * @param ilVehicleCustomsBorderGuard the il vehicle customs border guard
	 */
	@Override
	public void cacheResult(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		entityCache.putResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardImpl.class,
			ilVehicleCustomsBorderGuard.getPrimaryKey(),
			ilVehicleCustomsBorderGuard);

		ilVehicleCustomsBorderGuard.resetOriginalValues();
	}

	/**
	 * Caches the il vehicle customs border guards in the entity cache if it is enabled.
	 *
	 * @param ilVehicleCustomsBorderGuards the il vehicle customs border guards
	 */
	@Override
	public void cacheResult(
		List<ILVehicleCustomsBorderGuard> ilVehicleCustomsBorderGuards) {
		for (ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard : ilVehicleCustomsBorderGuards) {
			if (entityCache.getResult(
						ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
						ILVehicleCustomsBorderGuardImpl.class,
						ilVehicleCustomsBorderGuard.getPrimaryKey()) == null) {
				cacheResult(ilVehicleCustomsBorderGuard);
			}
			else {
				ilVehicleCustomsBorderGuard.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all il vehicle customs border guards.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ILVehicleCustomsBorderGuardImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the il vehicle customs border guard.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		entityCache.removeResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardImpl.class,
			ilVehicleCustomsBorderGuard.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<ILVehicleCustomsBorderGuard> ilVehicleCustomsBorderGuards) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard : ilVehicleCustomsBorderGuards) {
			entityCache.removeResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
				ILVehicleCustomsBorderGuardImpl.class,
				ilVehicleCustomsBorderGuard.getPrimaryKey());
		}
	}

	/**
	 * Creates a new il vehicle customs border guard with the primary key. Does not add the il vehicle customs border guard to the database.
	 *
	 * @param id the primary key for the new il vehicle customs border guard
	 * @return the new il vehicle customs border guard
	 */
	@Override
	public ILVehicleCustomsBorderGuard create(long id) {
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard = new ILVehicleCustomsBorderGuardImpl();

		ilVehicleCustomsBorderGuard.setNew(true);
		ilVehicleCustomsBorderGuard.setPrimaryKey(id);

		return ilVehicleCustomsBorderGuard;
	}

	/**
	 * Removes the il vehicle customs border guard with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the il vehicle customs border guard
	 * @return the il vehicle customs border guard that was removed
	 * @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard remove(long id)
		throws NoSuchILVehicleCustomsBorderGuardException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the il vehicle customs border guard with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the il vehicle customs border guard
	 * @return the il vehicle customs border guard that was removed
	 * @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard remove(Serializable primaryKey)
		throws NoSuchILVehicleCustomsBorderGuardException {
		Session session = null;

		try {
			session = openSession();

			ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard = (ILVehicleCustomsBorderGuard)session.get(ILVehicleCustomsBorderGuardImpl.class,
					primaryKey);

			if (ilVehicleCustomsBorderGuard == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchILVehicleCustomsBorderGuardException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ilVehicleCustomsBorderGuard);
		}
		catch (NoSuchILVehicleCustomsBorderGuardException nsee) {
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
	protected ILVehicleCustomsBorderGuard removeImpl(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		ilVehicleCustomsBorderGuard = toUnwrappedModel(ilVehicleCustomsBorderGuard);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ilVehicleCustomsBorderGuard)) {
				ilVehicleCustomsBorderGuard = (ILVehicleCustomsBorderGuard)session.get(ILVehicleCustomsBorderGuardImpl.class,
						ilVehicleCustomsBorderGuard.getPrimaryKeyObj());
			}

			if (ilVehicleCustomsBorderGuard != null) {
				session.delete(ilVehicleCustomsBorderGuard);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ilVehicleCustomsBorderGuard != null) {
			clearCache(ilVehicleCustomsBorderGuard);
		}

		return ilVehicleCustomsBorderGuard;
	}

	@Override
	public ILVehicleCustomsBorderGuard updateImpl(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		ilVehicleCustomsBorderGuard = toUnwrappedModel(ilVehicleCustomsBorderGuard);

		boolean isNew = ilVehicleCustomsBorderGuard.isNew();

		ILVehicleCustomsBorderGuardModelImpl ilVehicleCustomsBorderGuardModelImpl =
			(ILVehicleCustomsBorderGuardModelImpl)ilVehicleCustomsBorderGuard;

		Session session = null;

		try {
			session = openSession();

			if (ilVehicleCustomsBorderGuard.isNew()) {
				session.save(ilVehicleCustomsBorderGuard);

				ilVehicleCustomsBorderGuard.setNew(false);
			}
			else {
				ilVehicleCustomsBorderGuard = (ILVehicleCustomsBorderGuard)session.merge(ilVehicleCustomsBorderGuard);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!ILVehicleCustomsBorderGuardModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ilVehicleCustomsBorderGuardModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_REG_NUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ilVehicleCustomsBorderGuardModelImpl.getOriginalRegistrationNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_REG_NUMBER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_REG_NUMBER,
					args);

				args = new Object[] {
						ilVehicleCustomsBorderGuardModelImpl.getRegistrationNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_REG_NUMBER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_REG_NUMBER,
					args);
			}
		}

		entityCache.putResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
			ILVehicleCustomsBorderGuardImpl.class,
			ilVehicleCustomsBorderGuard.getPrimaryKey(),
			ilVehicleCustomsBorderGuard, false);

		ilVehicleCustomsBorderGuard.resetOriginalValues();

		return ilVehicleCustomsBorderGuard;
	}

	protected ILVehicleCustomsBorderGuard toUnwrappedModel(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard) {
		if (ilVehicleCustomsBorderGuard instanceof ILVehicleCustomsBorderGuardImpl) {
			return ilVehicleCustomsBorderGuard;
		}

		ILVehicleCustomsBorderGuardImpl ilVehicleCustomsBorderGuardImpl = new ILVehicleCustomsBorderGuardImpl();

		ilVehicleCustomsBorderGuardImpl.setNew(ilVehicleCustomsBorderGuard.isNew());
		ilVehicleCustomsBorderGuardImpl.setPrimaryKey(ilVehicleCustomsBorderGuard.getPrimaryKey());

		ilVehicleCustomsBorderGuardImpl.setId(ilVehicleCustomsBorderGuard.getId());
		ilVehicleCustomsBorderGuardImpl.setRegistrationNumber(ilVehicleCustomsBorderGuard.getRegistrationNumber());
		ilVehicleCustomsBorderGuardImpl.setExpImpGateType(ilVehicleCustomsBorderGuard.getExpImpGateType());
		ilVehicleCustomsBorderGuardImpl.setExpImpGate(ilVehicleCustomsBorderGuard.getExpImpGate());
		ilVehicleCustomsBorderGuardImpl.setDriverName(ilVehicleCustomsBorderGuard.getDriverName());
		ilVehicleCustomsBorderGuardImpl.setDriverLicenceNo(ilVehicleCustomsBorderGuard.getDriverLicenceNo());
		ilVehicleCustomsBorderGuardImpl.setRegistrationDate(ilVehicleCustomsBorderGuard.getRegistrationDate());
		ilVehicleCustomsBorderGuardImpl.setCustomsDepartureDate(ilVehicleCustomsBorderGuard.getCustomsDepartureDate());
		ilVehicleCustomsBorderGuardImpl.setCustomsArrivalDate(ilVehicleCustomsBorderGuard.getCustomsArrivalDate());
		ilVehicleCustomsBorderGuardImpl.setBorderGuardsDepartureDate(ilVehicleCustomsBorderGuard.getBorderGuardsDepartureDate());
		ilVehicleCustomsBorderGuardImpl.setBorderGuardsArrivalDate(ilVehicleCustomsBorderGuard.getBorderGuardsArrivalDate());
		ilVehicleCustomsBorderGuardImpl.setSyncDate(ilVehicleCustomsBorderGuard.getSyncDate());

		return ilVehicleCustomsBorderGuardImpl;
	}

	/**
	 * Returns the il vehicle customs border guard with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the il vehicle customs border guard
	 * @return the il vehicle customs border guard
	 * @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard findByPrimaryKey(Serializable primaryKey)
		throws NoSuchILVehicleCustomsBorderGuardException {
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard = fetchByPrimaryKey(primaryKey);

		if (ilVehicleCustomsBorderGuard == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchILVehicleCustomsBorderGuardException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ilVehicleCustomsBorderGuard;
	}

	/**
	 * Returns the il vehicle customs border guard with the primary key or throws a {@link NoSuchILVehicleCustomsBorderGuardException} if it could not be found.
	 *
	 * @param id the primary key of the il vehicle customs border guard
	 * @return the il vehicle customs border guard
	 * @throws NoSuchILVehicleCustomsBorderGuardException if a il vehicle customs border guard with the primary key could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard findByPrimaryKey(long id)
		throws NoSuchILVehicleCustomsBorderGuardException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the il vehicle customs border guard with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the il vehicle customs border guard
	 * @return the il vehicle customs border guard, or <code>null</code> if a il vehicle customs border guard with the primary key could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
				ILVehicleCustomsBorderGuardImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard = (ILVehicleCustomsBorderGuard)serializable;

		if (ilVehicleCustomsBorderGuard == null) {
			Session session = null;

			try {
				session = openSession();

				ilVehicleCustomsBorderGuard = (ILVehicleCustomsBorderGuard)session.get(ILVehicleCustomsBorderGuardImpl.class,
						primaryKey);

				if (ilVehicleCustomsBorderGuard != null) {
					cacheResult(ilVehicleCustomsBorderGuard);
				}
				else {
					entityCache.putResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
						ILVehicleCustomsBorderGuardImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
					ILVehicleCustomsBorderGuardImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ilVehicleCustomsBorderGuard;
	}

	/**
	 * Returns the il vehicle customs border guard with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the il vehicle customs border guard
	 * @return the il vehicle customs border guard, or <code>null</code> if a il vehicle customs border guard with the primary key could not be found
	 */
	@Override
	public ILVehicleCustomsBorderGuard fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ILVehicleCustomsBorderGuard> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ILVehicleCustomsBorderGuard> map = new HashMap<Serializable, ILVehicleCustomsBorderGuard>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard = fetchByPrimaryKey(primaryKey);

			if (ilVehicleCustomsBorderGuard != null) {
				map.put(primaryKey, ilVehicleCustomsBorderGuard);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
					ILVehicleCustomsBorderGuardImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(ILVehicleCustomsBorderGuard)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ILVEHICLECUSTOMSBORDERGUARD_WHERE_PKS_IN);

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

			for (ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard : (List<ILVehicleCustomsBorderGuard>)q.list()) {
				map.put(ilVehicleCustomsBorderGuard.getPrimaryKeyObj(),
					ilVehicleCustomsBorderGuard);

				cacheResult(ilVehicleCustomsBorderGuard);

				uncachedPrimaryKeys.remove(ilVehicleCustomsBorderGuard.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ILVehicleCustomsBorderGuardModelImpl.ENTITY_CACHE_ENABLED,
					ILVehicleCustomsBorderGuardImpl.class, primaryKey, nullModel);
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
	 * Returns all the il vehicle customs border guards.
	 *
	 * @return the il vehicle customs border guards
	 */
	@Override
	public List<ILVehicleCustomsBorderGuard> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the il vehicle customs border guards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il vehicle customs border guards
	 * @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	 * @return the range of il vehicle customs border guards
	 */
	@Override
	public List<ILVehicleCustomsBorderGuard> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the il vehicle customs border guards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il vehicle customs border guards
	 * @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of il vehicle customs border guards
	 */
	@Override
	public List<ILVehicleCustomsBorderGuard> findAll(int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the il vehicle customs border guards.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILVehicleCustomsBorderGuardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il vehicle customs border guards
	 * @param end the upper bound of the range of il vehicle customs border guards (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of il vehicle customs border guards
	 */
	@Override
	public List<ILVehicleCustomsBorderGuard> findAll(int start, int end,
		OrderByComparator<ILVehicleCustomsBorderGuard> orderByComparator,
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

		List<ILVehicleCustomsBorderGuard> list = null;

		if (retrieveFromCache) {
			list = (List<ILVehicleCustomsBorderGuard>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ILVEHICLECUSTOMSBORDERGUARD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ILVEHICLECUSTOMSBORDERGUARD;

				if (pagination) {
					sql = sql.concat(ILVehicleCustomsBorderGuardModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ILVehicleCustomsBorderGuard>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ILVehicleCustomsBorderGuard>)QueryUtil.list(q,
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
	 * Removes all the il vehicle customs border guards from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard : findAll()) {
			remove(ilVehicleCustomsBorderGuard);
		}
	}

	/**
	 * Returns the number of il vehicle customs border guards.
	 *
	 * @return the number of il vehicle customs border guards
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ILVEHICLECUSTOMSBORDERGUARD);

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
		return ILVehicleCustomsBorderGuardModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the il vehicle customs border guard persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ILVehicleCustomsBorderGuardImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ILVEHICLECUSTOMSBORDERGUARD = "SELECT ilVehicleCustomsBorderGuard FROM ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard";
	private static final String _SQL_SELECT_ILVEHICLECUSTOMSBORDERGUARD_WHERE_PKS_IN =
		"SELECT ilVehicleCustomsBorderGuard FROM ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard WHERE vehicleCustomsBorderGuardId IN (";
	private static final String _SQL_SELECT_ILVEHICLECUSTOMSBORDERGUARD_WHERE = "SELECT ilVehicleCustomsBorderGuard FROM ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard WHERE ";
	private static final String _SQL_COUNT_ILVEHICLECUSTOMSBORDERGUARD = "SELECT COUNT(ilVehicleCustomsBorderGuard) FROM ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard";
	private static final String _SQL_COUNT_ILVEHICLECUSTOMSBORDERGUARD_WHERE = "SELECT COUNT(ilVehicleCustomsBorderGuard) FROM ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ilVehicleCustomsBorderGuard.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ILVehicleCustomsBorderGuard exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ILVehicleCustomsBorderGuard exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ILVehicleCustomsBorderGuardPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}