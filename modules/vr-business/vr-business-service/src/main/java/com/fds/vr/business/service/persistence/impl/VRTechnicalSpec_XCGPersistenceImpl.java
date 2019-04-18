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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCGException;
import com.fds.vr.business.model.VRTechnicalSpec_XCG;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGImpl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPersistence;

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
 * The persistence implementation for the vr technical spec_xcg service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPersistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGUtil
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XCG>
	implements VRTechnicalSpec_XCGPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XCGUtil} to access the vr technical spec_xcg persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XCGImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XCGModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @return the range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO;
			finderArgs = new Object[] { dossierNo, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO;
			finderArgs = new Object[] {
					dossierNo, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XCG.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XCG.getMtCore())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

			boolean bindDossierNo = false;

			if (dossierNo == null) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
			}
			else if (dossierNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
			}
			else {
				bindDossierNo = true;

				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
			}

			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierNo) {
					qPos.add(dossierNo);
				}

				qPos.add(mtCore);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByDossierNo_First(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		List<VRTechnicalSpec_XCG> list = findByDossierNo(dossierNo, mtCore, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByDossierNo_Last(String dossierNo,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCG> list = findByDossierNo(dossierNo, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcgs before and after the current vr technical spec_xcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCG[] array = new VRTechnicalSpec_XCGImpl[3];

			array[0] = getByDossierNo_PrevAndNext(session, vrTechnicalSpec_XCG,
					dossierNo, mtCore, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCG;

			array[2] = getByDossierNo_PrevAndNext(session, vrTechnicalSpec_XCG,
					dossierNo, mtCore, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCG getByDossierNo_PrevAndNext(Session session,
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG, String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

		boolean bindDossierNo = false;

		if (dossierNo == null) {
			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
		}
		else if (dossierNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
		}
		else {
			bindDossierNo = true;

			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
		}

		query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_2);

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
			query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierNo) {
			qPos.add(dossierNo);
		}

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcgs where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcgs where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcgs
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCG_WHERE);

			boolean bindDossierNo = false;

			if (dossierNo == null) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
			}
			else if (dossierNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
			}
			else {
				bindDossierNo = true;

				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
			}

			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierNo) {
					qPos.add(dossierNo);
				}

				qPos.add(mtCore);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XCG.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XCG.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XCG.dossierNo IS NULL OR vrTechnicalSpec_XCG.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XCG.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcgs where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierIdCTN(String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcgs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @return the range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierIdCTN(String dossierIdCTN,
		int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierIdCTN(String dossierIdCTN,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN;
			finderArgs = new Object[] { dossierIdCTN };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN;
			finderArgs = new Object[] {
					dossierIdCTN,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XCG.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
				}

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByDossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByDossierIdCTN_First(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		List<VRTechnicalSpec_XCG> list = findByDossierIdCTN(dossierIdCTN, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByDossierIdCTN_Last(String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCG> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcgs before and after the current vr technical spec_xcg in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCG[] array = new VRTechnicalSpec_XCGImpl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCG, dossierIdCTN, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCG;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCG, dossierIdCTN, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCG getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XCG vrTechnicalSpec_XCG,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

		boolean bindDossierIdCTN = false;

		if (dossierIdCTN == null) {
			query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1);
		}
		else if (dossierIdCTN.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3);
		}
		else {
			bindDossierIdCTN = true;

			query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2);
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
			query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierIdCTN) {
			qPos.add(dossierIdCTN);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcgs where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcgs where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xcgs
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCG_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XCG.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XCG.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XCG.dossierIdCTN IS NULL OR vrTechnicalSpec_XCG.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcgs where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcgs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @return the range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE;
			finderArgs = new Object[] { deliverableCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE;
			finderArgs = new Object[] {
					deliverableCode,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XCG.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

			boolean bindDeliverableCode = false;

			if (deliverableCode == null) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
			}
			else if (deliverableCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
			}
			else {
				bindDeliverableCode = true;

				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeliverableCode) {
					qPos.add(deliverableCode);
				}

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		List<VRTechnicalSpec_XCG> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCG> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcgs before and after the current vr technical spec_xcg in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG[] findByDeliverableCode_PrevAndNext(long id,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCG[] array = new VRTechnicalSpec_XCGImpl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCG, deliverableCode, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCG;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCG, deliverableCode, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCG getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XCG vrTechnicalSpec_XCG,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

		boolean bindDeliverableCode = false;

		if (deliverableCode == null) {
			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
		}
		else if (deliverableCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
		}
		else {
			bindDeliverableCode = true;

			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
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
			query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDeliverableCode) {
			qPos.add(deliverableCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcgs where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcgs where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xcgs
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCG_WHERE);

			boolean bindDeliverableCode = false;

			if (deliverableCode == null) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
			}
			else if (deliverableCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
			}
			else {
				bindDeliverableCode = true;

				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeliverableCode) {
					qPos.add(deliverableCode);
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

	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1 =
		"vrTechnicalSpec_XCG.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XCG.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XCG.deliverableCode IS NULL OR vrTechnicalSpec_XCG.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierId(long dossierId, long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @return the range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] {
					dossierId, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : list) {
					if ((dossierId != vrTechnicalSpec_XCG.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XCG.getMtCore())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(mtCore);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		List<VRTechnicalSpec_XCG> list = findByDossierId(dossierId, mtCore, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCG> list = findByDossierId(dossierId, mtCore,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcgs before and after the current vr technical spec_xcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCG[] array = new VRTechnicalSpec_XCGImpl[3];

			array[0] = getByDossierId_PrevAndNext(session, vrTechnicalSpec_XCG,
					dossierId, mtCore, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCG;

			array[2] = getByDossierId_PrevAndNext(session, vrTechnicalSpec_XCG,
					dossierId, mtCore, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCG getByDossierId_PrevAndNext(Session session,
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG, long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

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
			query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcgs where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcgs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcgs
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(mtCore);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCG.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XCG.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcgs where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcgs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @return the range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID;
			finderArgs = new Object[] { convertAssembleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID;
			finderArgs = new Object[] {
					convertAssembleId,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : list) {
					if ((convertAssembleId != vrTechnicalSpec_XCG.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		List<VRTechnicalSpec_XCG> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCG> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcgs before and after the current vr technical spec_xcg in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG[] findByConvertAssembleId_PrevAndNext(long id,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCG[] array = new VRTechnicalSpec_XCGImpl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCG, convertAssembleId, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCG;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCG, convertAssembleId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCG getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XCG vrTechnicalSpec_XCG,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

		query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

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
			query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcgs where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcgs where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xcgs
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCG_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

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

	private static final String _FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2 =
		"vrTechnicalSpec_XCG.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcgs where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByReferenceUid(String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcgs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @return the range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByReferenceUid(String referenceUid,
		int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findByReferenceUid(String referenceUid,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID;
			finderArgs = new Object[] { referenceUid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID;
			finderArgs = new Object[] {
					referenceUid,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCG>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XCG.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
				}

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByReferenceUid_First(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByReferenceUid_First(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		List<VRTechnicalSpec_XCG> list = findByReferenceUid(referenceUid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCG != null) {
			return vrTechnicalSpec_XCG;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGException(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg, or <code>null</code> if a matching vr technical spec_xcg could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByReferenceUid_Last(String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCG> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcgs before and after the current vr technical spec_xcg in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCG[] array = new VRTechnicalSpec_XCGImpl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCG, referenceUid, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCG;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCG, referenceUid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRTechnicalSpec_XCG getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XCG vrTechnicalSpec_XCG,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE);

		boolean bindReferenceUid = false;

		if (referenceUid == null) {
			query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1);
		}
		else if (referenceUid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3);
		}
		else {
			bindReferenceUid = true;

			query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2);
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
			query.append(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindReferenceUid) {
			qPos.add(referenceUid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCG);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcgs where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcgs where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xcgs
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCG_WHERE);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XCG.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XCG.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XCG.referenceUid IS NULL OR vrTechnicalSpec_XCG.referenceUid = '')";

	public VRTechnicalSpec_XCGPersistenceImpl() {
		setModelClass(VRTechnicalSpec_XCG.class);
	}

	/**
	 * Caches the vr technical spec_xcg in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCG the vr technical spec_xcg
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		entityCache.putResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class, vrTechnicalSpec_XCG.getPrimaryKey(),
			vrTechnicalSpec_XCG);

		vrTechnicalSpec_XCG.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xcgs in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGs the vr technical spec_xcgs
	 */
	@Override
	public void cacheResult(List<VRTechnicalSpec_XCG> vrTechnicalSpec_XCGs) {
		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : vrTechnicalSpec_XCGs) {
			if (entityCache.getResult(
						VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGImpl.class,
						vrTechnicalSpec_XCG.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XCG);
			}
			else {
				vrTechnicalSpec_XCG.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xcgs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XCGImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xcg.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		entityCache.removeResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class, vrTechnicalSpec_XCG.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRTechnicalSpec_XCG> vrTechnicalSpec_XCGs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : vrTechnicalSpec_XCGs) {
			entityCache.removeResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGImpl.class,
				vrTechnicalSpec_XCG.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xcg with the primary key. Does not add the vr technical spec_xcg to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xcg
	 * @return the new vr technical spec_xcg
	 */
	@Override
	public VRTechnicalSpec_XCG create(long id) {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = new VRTechnicalSpec_XCGImpl();

		vrTechnicalSpec_XCG.setNew(true);
		vrTechnicalSpec_XCG.setPrimaryKey(id);

		return vrTechnicalSpec_XCG;
	}

	/**
	 * Removes the vr technical spec_xcg with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xcg
	 * @return the vr technical spec_xcg that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG remove(long id)
		throws NoSuchVRTechnicalSpec_XCGException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xcg with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg
	 * @return the vr technical spec_xcg that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGException {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCG vrTechnicalSpec_XCG = (VRTechnicalSpec_XCG)session.get(VRTechnicalSpec_XCGImpl.class,
					primaryKey);

			if (vrTechnicalSpec_XCG == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XCGException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XCG);
		}
		catch (NoSuchVRTechnicalSpec_XCGException nsee) {
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
	protected VRTechnicalSpec_XCG removeImpl(
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		vrTechnicalSpec_XCG = toUnwrappedModel(vrTechnicalSpec_XCG);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XCG)) {
				vrTechnicalSpec_XCG = (VRTechnicalSpec_XCG)session.get(VRTechnicalSpec_XCGImpl.class,
						vrTechnicalSpec_XCG.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XCG != null) {
				session.delete(vrTechnicalSpec_XCG);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XCG != null) {
			clearCache(vrTechnicalSpec_XCG);
		}

		return vrTechnicalSpec_XCG;
	}

	@Override
	public VRTechnicalSpec_XCG updateImpl(
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		vrTechnicalSpec_XCG = toUnwrappedModel(vrTechnicalSpec_XCG);

		boolean isNew = vrTechnicalSpec_XCG.isNew();

		VRTechnicalSpec_XCGModelImpl vrTechnicalSpec_XCGModelImpl = (VRTechnicalSpec_XCGModelImpl)vrTechnicalSpec_XCG;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XCG.isNew()) {
				session.save(vrTechnicalSpec_XCG);

				vrTechnicalSpec_XCG.setNew(false);
			}
			else {
				vrTechnicalSpec_XCG = (VRTechnicalSpec_XCG)session.merge(vrTechnicalSpec_XCG);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XCGModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XCGModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getDossierNo(),
						vrTechnicalSpec_XCGModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XCGModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getDossierId(),
						vrTechnicalSpec_XCGModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XCGModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGImpl.class, vrTechnicalSpec_XCG.getPrimaryKey(),
			vrTechnicalSpec_XCG, false);

		vrTechnicalSpec_XCG.resetOriginalValues();

		return vrTechnicalSpec_XCG;
	}

	protected VRTechnicalSpec_XCG toUnwrappedModel(
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		if (vrTechnicalSpec_XCG instanceof VRTechnicalSpec_XCGImpl) {
			return vrTechnicalSpec_XCG;
		}

		VRTechnicalSpec_XCGImpl vrTechnicalSpec_XCGImpl = new VRTechnicalSpec_XCGImpl();

		vrTechnicalSpec_XCGImpl.setNew(vrTechnicalSpec_XCG.isNew());
		vrTechnicalSpec_XCGImpl.setPrimaryKey(vrTechnicalSpec_XCG.getPrimaryKey());

		vrTechnicalSpec_XCGImpl.setId(vrTechnicalSpec_XCG.getId());
		vrTechnicalSpec_XCGImpl.setMtCore(vrTechnicalSpec_XCG.getMtCore());
		vrTechnicalSpec_XCGImpl.setConvertAssembleId(vrTechnicalSpec_XCG.getConvertAssembleId());
		vrTechnicalSpec_XCGImpl.setDossierId(vrTechnicalSpec_XCG.getDossierId());
		vrTechnicalSpec_XCGImpl.setDossierNo(vrTechnicalSpec_XCG.getDossierNo());
		vrTechnicalSpec_XCGImpl.setReferenceUid(vrTechnicalSpec_XCG.getReferenceUid());
		vrTechnicalSpec_XCGImpl.setDossierIdCTN(vrTechnicalSpec_XCG.getDossierIdCTN());
		vrTechnicalSpec_XCGImpl.setDeliverableCode(vrTechnicalSpec_XCG.getDeliverableCode());
		vrTechnicalSpec_XCGImpl.setLoai_dong_co(vrTechnicalSpec_XCG.getLoai_dong_co());
		vrTechnicalSpec_XCGImpl.setXCG01001(vrTechnicalSpec_XCG.getXCG01001());
		vrTechnicalSpec_XCGImpl.setXCG01002(vrTechnicalSpec_XCG.getXCG01002());
		vrTechnicalSpec_XCGImpl.setXCG01003(vrTechnicalSpec_XCG.getXCG01003());
		vrTechnicalSpec_XCGImpl.setXCG01004(vrTechnicalSpec_XCG.getXCG01004());
		vrTechnicalSpec_XCGImpl.setXCG01005(vrTechnicalSpec_XCG.getXCG01005());
		vrTechnicalSpec_XCGImpl.setXCG01006(vrTechnicalSpec_XCG.getXCG01006());
		vrTechnicalSpec_XCGImpl.setXCG01007(vrTechnicalSpec_XCG.getXCG01007());
		vrTechnicalSpec_XCGImpl.setXCG01008(vrTechnicalSpec_XCG.getXCG01008());
		vrTechnicalSpec_XCGImpl.setXCG01009(vrTechnicalSpec_XCG.getXCG01009());
		vrTechnicalSpec_XCGImpl.setXCG01010(vrTechnicalSpec_XCG.getXCG01010());
		vrTechnicalSpec_XCGImpl.setXCG01011(vrTechnicalSpec_XCG.getXCG01011());
		vrTechnicalSpec_XCGImpl.setXCG01012(vrTechnicalSpec_XCG.getXCG01012());
		vrTechnicalSpec_XCGImpl.setXCG01013(vrTechnicalSpec_XCG.getXCG01013());
		vrTechnicalSpec_XCGImpl.setXCG01014(vrTechnicalSpec_XCG.getXCG01014());
		vrTechnicalSpec_XCGImpl.setXCG01016(vrTechnicalSpec_XCG.getXCG01016());
		vrTechnicalSpec_XCGImpl.setXCG01017(vrTechnicalSpec_XCG.getXCG01017());
		vrTechnicalSpec_XCGImpl.setXCG01019(vrTechnicalSpec_XCG.getXCG01019());
		vrTechnicalSpec_XCGImpl.setXCG01020(vrTechnicalSpec_XCG.getXCG01020());
		vrTechnicalSpec_XCGImpl.setXCG01021(vrTechnicalSpec_XCG.getXCG01021());
		vrTechnicalSpec_XCGImpl.setXCG01022(vrTechnicalSpec_XCG.getXCG01022());
		vrTechnicalSpec_XCGImpl.setXCG01024(vrTechnicalSpec_XCG.getXCG01024());
		vrTechnicalSpec_XCGImpl.setXCG01025(vrTechnicalSpec_XCG.getXCG01025());
		vrTechnicalSpec_XCGImpl.setXCG01026(vrTechnicalSpec_XCG.getXCG01026());
		vrTechnicalSpec_XCGImpl.setXCG01027(vrTechnicalSpec_XCG.getXCG01027());
		vrTechnicalSpec_XCGImpl.setXCG01028(vrTechnicalSpec_XCG.getXCG01028());
		vrTechnicalSpec_XCGImpl.setXCG01030(vrTechnicalSpec_XCG.getXCG01030());
		vrTechnicalSpec_XCGImpl.setXCG01031(vrTechnicalSpec_XCG.getXCG01031());
		vrTechnicalSpec_XCGImpl.setXCG01032(vrTechnicalSpec_XCG.getXCG01032());
		vrTechnicalSpec_XCGImpl.setXCG01033(vrTechnicalSpec_XCG.getXCG01033());
		vrTechnicalSpec_XCGImpl.setXCG01034(vrTechnicalSpec_XCG.getXCG01034());
		vrTechnicalSpec_XCGImpl.setXCG01035(vrTechnicalSpec_XCG.getXCG01035());
		vrTechnicalSpec_XCGImpl.setXCG01036(vrTechnicalSpec_XCG.getXCG01036());
		vrTechnicalSpec_XCGImpl.setXCG01037(vrTechnicalSpec_XCG.getXCG01037());
		vrTechnicalSpec_XCGImpl.setXCG01038(vrTechnicalSpec_XCG.getXCG01038());
		vrTechnicalSpec_XCGImpl.setXCG01039(vrTechnicalSpec_XCG.getXCG01039());
		vrTechnicalSpec_XCGImpl.setXCG01040(vrTechnicalSpec_XCG.getXCG01040());
		vrTechnicalSpec_XCGImpl.setXCG01041(vrTechnicalSpec_XCG.getXCG01041());
		vrTechnicalSpec_XCGImpl.setXCG01042(vrTechnicalSpec_XCG.getXCG01042());
		vrTechnicalSpec_XCGImpl.setXCG01043(vrTechnicalSpec_XCG.getXCG01043());
		vrTechnicalSpec_XCGImpl.setXCG01044(vrTechnicalSpec_XCG.getXCG01044());
		vrTechnicalSpec_XCGImpl.setXCG01045(vrTechnicalSpec_XCG.getXCG01045());
		vrTechnicalSpec_XCGImpl.setXCG01046(vrTechnicalSpec_XCG.getXCG01046());
		vrTechnicalSpec_XCGImpl.setXCG01047(vrTechnicalSpec_XCG.getXCG01047());
		vrTechnicalSpec_XCGImpl.setXCG01049(vrTechnicalSpec_XCG.getXCG01049());
		vrTechnicalSpec_XCGImpl.setXCG01050(vrTechnicalSpec_XCG.getXCG01050());
		vrTechnicalSpec_XCGImpl.setXCG01051(vrTechnicalSpec_XCG.getXCG01051());
		vrTechnicalSpec_XCGImpl.setXCG01052(vrTechnicalSpec_XCG.getXCG01052());
		vrTechnicalSpec_XCGImpl.setXCG01053(vrTechnicalSpec_XCG.getXCG01053());
		vrTechnicalSpec_XCGImpl.setXCG01054(vrTechnicalSpec_XCG.getXCG01054());
		vrTechnicalSpec_XCGImpl.setXCG01055(vrTechnicalSpec_XCG.getXCG01055());
		vrTechnicalSpec_XCGImpl.setXCG01056(vrTechnicalSpec_XCG.getXCG01056());
		vrTechnicalSpec_XCGImpl.setXCG01057(vrTechnicalSpec_XCG.getXCG01057());
		vrTechnicalSpec_XCGImpl.setXCG01058(vrTechnicalSpec_XCG.getXCG01058());
		vrTechnicalSpec_XCGImpl.setXCG01059(vrTechnicalSpec_XCG.getXCG01059());
		vrTechnicalSpec_XCGImpl.setXCG01060(vrTechnicalSpec_XCG.getXCG01060());
		vrTechnicalSpec_XCGImpl.setXCG01062(vrTechnicalSpec_XCG.getXCG01062());
		vrTechnicalSpec_XCGImpl.setXCG01063(vrTechnicalSpec_XCG.getXCG01063());
		vrTechnicalSpec_XCGImpl.setXCG01064(vrTechnicalSpec_XCG.getXCG01064());
		vrTechnicalSpec_XCGImpl.setXCG01065(vrTechnicalSpec_XCG.getXCG01065());
		vrTechnicalSpec_XCGImpl.setXCG01066(vrTechnicalSpec_XCG.getXCG01066());
		vrTechnicalSpec_XCGImpl.setXCG01067(vrTechnicalSpec_XCG.getXCG01067());
		vrTechnicalSpec_XCGImpl.setXCG01068(vrTechnicalSpec_XCG.getXCG01068());
		vrTechnicalSpec_XCGImpl.setXCG01069(vrTechnicalSpec_XCG.getXCG01069());
		vrTechnicalSpec_XCGImpl.setXCG01070(vrTechnicalSpec_XCG.getXCG01070());
		vrTechnicalSpec_XCGImpl.setXCG01072(vrTechnicalSpec_XCG.getXCG01072());
		vrTechnicalSpec_XCGImpl.setXCG01073(vrTechnicalSpec_XCG.getXCG01073());
		vrTechnicalSpec_XCGImpl.setXCG01074(vrTechnicalSpec_XCG.getXCG01074());
		vrTechnicalSpec_XCGImpl.setXCG01075(vrTechnicalSpec_XCG.getXCG01075());
		vrTechnicalSpec_XCGImpl.setXCG01076(vrTechnicalSpec_XCG.getXCG01076());
		vrTechnicalSpec_XCGImpl.setXCG01077(vrTechnicalSpec_XCG.getXCG01077());
		vrTechnicalSpec_XCGImpl.setXCG01078(vrTechnicalSpec_XCG.getXCG01078());
		vrTechnicalSpec_XCGImpl.setXCG01079(vrTechnicalSpec_XCG.getXCG01079());
		vrTechnicalSpec_XCGImpl.setXCG01080(vrTechnicalSpec_XCG.getXCG01080());
		vrTechnicalSpec_XCGImpl.setXCG01081(vrTechnicalSpec_XCG.getXCG01081());
		vrTechnicalSpec_XCGImpl.setXCG01082(vrTechnicalSpec_XCG.getXCG01082());
		vrTechnicalSpec_XCGImpl.setXCG01083(vrTechnicalSpec_XCG.getXCG01083());
		vrTechnicalSpec_XCGImpl.setXCG01084(vrTechnicalSpec_XCG.getXCG01084());
		vrTechnicalSpec_XCGImpl.setXCG01085(vrTechnicalSpec_XCG.getXCG01085());
		vrTechnicalSpec_XCGImpl.setXCG01086(vrTechnicalSpec_XCG.getXCG01086());
		vrTechnicalSpec_XCGImpl.setXCG01087(vrTechnicalSpec_XCG.getXCG01087());
		vrTechnicalSpec_XCGImpl.setXCG01088(vrTechnicalSpec_XCG.getXCG01088());
		vrTechnicalSpec_XCGImpl.setXCG01089(vrTechnicalSpec_XCG.getXCG01089());
		vrTechnicalSpec_XCGImpl.setXCG01090(vrTechnicalSpec_XCG.getXCG01090());
		vrTechnicalSpec_XCGImpl.setXCG01091(vrTechnicalSpec_XCG.getXCG01091());
		vrTechnicalSpec_XCGImpl.setXCG01092(vrTechnicalSpec_XCG.getXCG01092());
		vrTechnicalSpec_XCGImpl.setXCG01093(vrTechnicalSpec_XCG.getXCG01093());
		vrTechnicalSpec_XCGImpl.setXCG01094(vrTechnicalSpec_XCG.getXCG01094());
		vrTechnicalSpec_XCGImpl.setXCG01095(vrTechnicalSpec_XCG.getXCG01095());
		vrTechnicalSpec_XCGImpl.setXCG01096(vrTechnicalSpec_XCG.getXCG01096());
		vrTechnicalSpec_XCGImpl.setXCG01097(vrTechnicalSpec_XCG.getXCG01097());
		vrTechnicalSpec_XCGImpl.setXCG01098(vrTechnicalSpec_XCG.getXCG01098());
		vrTechnicalSpec_XCGImpl.setXCG01099(vrTechnicalSpec_XCG.getXCG01099());
		vrTechnicalSpec_XCGImpl.setXCG01100(vrTechnicalSpec_XCG.getXCG01100());
		vrTechnicalSpec_XCGImpl.setXCG01101(vrTechnicalSpec_XCG.getXCG01101());
		vrTechnicalSpec_XCGImpl.setXCG01102(vrTechnicalSpec_XCG.getXCG01102());
		vrTechnicalSpec_XCGImpl.setXCG01103(vrTechnicalSpec_XCG.getXCG01103());
		vrTechnicalSpec_XCGImpl.setXCG01104(vrTechnicalSpec_XCG.getXCG01104());
		vrTechnicalSpec_XCGImpl.setXCG01105(vrTechnicalSpec_XCG.getXCG01105());
		vrTechnicalSpec_XCGImpl.setXCG01106(vrTechnicalSpec_XCG.getXCG01106());
		vrTechnicalSpec_XCGImpl.setXCG01107(vrTechnicalSpec_XCG.getXCG01107());
		vrTechnicalSpec_XCGImpl.setXCG01108(vrTechnicalSpec_XCG.getXCG01108());
		vrTechnicalSpec_XCGImpl.setXCG01109(vrTechnicalSpec_XCG.getXCG01109());
		vrTechnicalSpec_XCGImpl.setXCG01110(vrTechnicalSpec_XCG.getXCG01110());
		vrTechnicalSpec_XCGImpl.setXCG01111(vrTechnicalSpec_XCG.getXCG01111());
		vrTechnicalSpec_XCGImpl.setXCG01112(vrTechnicalSpec_XCG.getXCG01112());
		vrTechnicalSpec_XCGImpl.setXCG01113(vrTechnicalSpec_XCG.getXCG01113());
		vrTechnicalSpec_XCGImpl.setXCG01114(vrTechnicalSpec_XCG.getXCG01114());
		vrTechnicalSpec_XCGImpl.setXCG01115(vrTechnicalSpec_XCG.getXCG01115());
		vrTechnicalSpec_XCGImpl.setXCG01116(vrTechnicalSpec_XCG.getXCG01116());
		vrTechnicalSpec_XCGImpl.setXCG01117(vrTechnicalSpec_XCG.getXCG01117());
		vrTechnicalSpec_XCGImpl.setXCG01118(vrTechnicalSpec_XCG.getXCG01118());
		vrTechnicalSpec_XCGImpl.setXCG01119(vrTechnicalSpec_XCG.getXCG01119());
		vrTechnicalSpec_XCGImpl.setXCG01120(vrTechnicalSpec_XCG.getXCG01120());
		vrTechnicalSpec_XCGImpl.setXCG01121(vrTechnicalSpec_XCG.getXCG01121());
		vrTechnicalSpec_XCGImpl.setXCG01122(vrTechnicalSpec_XCG.getXCG01122());
		vrTechnicalSpec_XCGImpl.setXCG01123(vrTechnicalSpec_XCG.getXCG01123());
		vrTechnicalSpec_XCGImpl.setXCG01124(vrTechnicalSpec_XCG.getXCG01124());
		vrTechnicalSpec_XCGImpl.setXCG01125(vrTechnicalSpec_XCG.getXCG01125());
		vrTechnicalSpec_XCGImpl.setXCG01126(vrTechnicalSpec_XCG.getXCG01126());
		vrTechnicalSpec_XCGImpl.setXCG01127(vrTechnicalSpec_XCG.getXCG01127());
		vrTechnicalSpec_XCGImpl.setXCG01128(vrTechnicalSpec_XCG.getXCG01128());
		vrTechnicalSpec_XCGImpl.setXCG01129(vrTechnicalSpec_XCG.getXCG01129());
		vrTechnicalSpec_XCGImpl.setXCG01130(vrTechnicalSpec_XCG.getXCG01130());
		vrTechnicalSpec_XCGImpl.setXCG01131(vrTechnicalSpec_XCG.getXCG01131());
		vrTechnicalSpec_XCGImpl.setXCG01132(vrTechnicalSpec_XCG.getXCG01132());
		vrTechnicalSpec_XCGImpl.setXCG01133(vrTechnicalSpec_XCG.getXCG01133());
		vrTechnicalSpec_XCGImpl.setXCG01134(vrTechnicalSpec_XCG.getXCG01134());
		vrTechnicalSpec_XCGImpl.setXCG01135(vrTechnicalSpec_XCG.getXCG01135());
		vrTechnicalSpec_XCGImpl.setXCG01136(vrTechnicalSpec_XCG.getXCG01136());
		vrTechnicalSpec_XCGImpl.setXCG01137(vrTechnicalSpec_XCG.getXCG01137());
		vrTechnicalSpec_XCGImpl.setXCG01138(vrTechnicalSpec_XCG.getXCG01138());
		vrTechnicalSpec_XCGImpl.setXCG01139(vrTechnicalSpec_XCG.getXCG01139());
		vrTechnicalSpec_XCGImpl.setXCG01140(vrTechnicalSpec_XCG.getXCG01140());
		vrTechnicalSpec_XCGImpl.setXCG01141(vrTechnicalSpec_XCG.getXCG01141());
		vrTechnicalSpec_XCGImpl.setXCG01142(vrTechnicalSpec_XCG.getXCG01142());
		vrTechnicalSpec_XCGImpl.setXCG01143(vrTechnicalSpec_XCG.getXCG01143());
		vrTechnicalSpec_XCGImpl.setXCG01144(vrTechnicalSpec_XCG.getXCG01144());
		vrTechnicalSpec_XCGImpl.setXCG01145(vrTechnicalSpec_XCG.getXCG01145());
		vrTechnicalSpec_XCGImpl.setXCG01146(vrTechnicalSpec_XCG.getXCG01146());
		vrTechnicalSpec_XCGImpl.setXCG01147(vrTechnicalSpec_XCG.getXCG01147());
		vrTechnicalSpec_XCGImpl.setXCG01148(vrTechnicalSpec_XCG.getXCG01148());
		vrTechnicalSpec_XCGImpl.setXCG01149(vrTechnicalSpec_XCG.getXCG01149());
		vrTechnicalSpec_XCGImpl.setXCG01150(vrTechnicalSpec_XCG.getXCG01150());
		vrTechnicalSpec_XCGImpl.setXCG01151(vrTechnicalSpec_XCG.getXCG01151());
		vrTechnicalSpec_XCGImpl.setXCG01152(vrTechnicalSpec_XCG.getXCG01152());
		vrTechnicalSpec_XCGImpl.setXCG01153(vrTechnicalSpec_XCG.getXCG01153());
		vrTechnicalSpec_XCGImpl.setXCG01154(vrTechnicalSpec_XCG.getXCG01154());
		vrTechnicalSpec_XCGImpl.setXCG01155(vrTechnicalSpec_XCG.getXCG01155());
		vrTechnicalSpec_XCGImpl.setXCG01156(vrTechnicalSpec_XCG.getXCG01156());
		vrTechnicalSpec_XCGImpl.setXCG01157(vrTechnicalSpec_XCG.getXCG01157());
		vrTechnicalSpec_XCGImpl.setXCG01158(vrTechnicalSpec_XCG.getXCG01158());
		vrTechnicalSpec_XCGImpl.setXCG01159(vrTechnicalSpec_XCG.getXCG01159());
		vrTechnicalSpec_XCGImpl.setXCG01160(vrTechnicalSpec_XCG.getXCG01160());
		vrTechnicalSpec_XCGImpl.setXCG01161(vrTechnicalSpec_XCG.getXCG01161());
		vrTechnicalSpec_XCGImpl.setXCG01162(vrTechnicalSpec_XCG.getXCG01162());
		vrTechnicalSpec_XCGImpl.setXCG01163(vrTechnicalSpec_XCG.getXCG01163());
		vrTechnicalSpec_XCGImpl.setXCG01164(vrTechnicalSpec_XCG.getXCG01164());
		vrTechnicalSpec_XCGImpl.setXCG01165(vrTechnicalSpec_XCG.getXCG01165());
		vrTechnicalSpec_XCGImpl.setXCG01166(vrTechnicalSpec_XCG.getXCG01166());
		vrTechnicalSpec_XCGImpl.setXCG01167(vrTechnicalSpec_XCG.getXCG01167());
		vrTechnicalSpec_XCGImpl.setXCG01169(vrTechnicalSpec_XCG.getXCG01169());
		vrTechnicalSpec_XCGImpl.setXCG01170(vrTechnicalSpec_XCG.getXCG01170());
		vrTechnicalSpec_XCGImpl.setXCG01171(vrTechnicalSpec_XCG.getXCG01171());
		vrTechnicalSpec_XCGImpl.setXCG01172(vrTechnicalSpec_XCG.getXCG01172());
		vrTechnicalSpec_XCGImpl.setXCG01173(vrTechnicalSpec_XCG.getXCG01173());
		vrTechnicalSpec_XCGImpl.setXCG01174(vrTechnicalSpec_XCG.getXCG01174());
		vrTechnicalSpec_XCGImpl.setXCG01175(vrTechnicalSpec_XCG.getXCG01175());
		vrTechnicalSpec_XCGImpl.setXCG01176(vrTechnicalSpec_XCG.getXCG01176());
		vrTechnicalSpec_XCGImpl.setXCG01177(vrTechnicalSpec_XCG.getXCG01177());
		vrTechnicalSpec_XCGImpl.setXCG01178(vrTechnicalSpec_XCG.getXCG01178());
		vrTechnicalSpec_XCGImpl.setXCG01179(vrTechnicalSpec_XCG.getXCG01179());
		vrTechnicalSpec_XCGImpl.setXCG01180(vrTechnicalSpec_XCG.getXCG01180());
		vrTechnicalSpec_XCGImpl.setXCG01181(vrTechnicalSpec_XCG.getXCG01181());
		vrTechnicalSpec_XCGImpl.setXCG01182(vrTechnicalSpec_XCG.getXCG01182());
		vrTechnicalSpec_XCGImpl.setXCG01183(vrTechnicalSpec_XCG.getXCG01183());
		vrTechnicalSpec_XCGImpl.setXCG01184(vrTechnicalSpec_XCG.getXCG01184());
		vrTechnicalSpec_XCGImpl.setXCG01185(vrTechnicalSpec_XCG.getXCG01185());
		vrTechnicalSpec_XCGImpl.setXCG01186(vrTechnicalSpec_XCG.getXCG01186());
		vrTechnicalSpec_XCGImpl.setXCG01187(vrTechnicalSpec_XCG.getXCG01187());
		vrTechnicalSpec_XCGImpl.setXCG01188(vrTechnicalSpec_XCG.getXCG01188());
		vrTechnicalSpec_XCGImpl.setXCG01189(vrTechnicalSpec_XCG.getXCG01189());
		vrTechnicalSpec_XCGImpl.setXCG01190(vrTechnicalSpec_XCG.getXCG01190());
		vrTechnicalSpec_XCGImpl.setXCG01191(vrTechnicalSpec_XCG.getXCG01191());
		vrTechnicalSpec_XCGImpl.setXCG01192(vrTechnicalSpec_XCG.getXCG01192());
		vrTechnicalSpec_XCGImpl.setXCG01193(vrTechnicalSpec_XCG.getXCG01193());
		vrTechnicalSpec_XCGImpl.setXCG01194(vrTechnicalSpec_XCG.getXCG01194());
		vrTechnicalSpec_XCGImpl.setXCG01195(vrTechnicalSpec_XCG.getXCG01195());
		vrTechnicalSpec_XCGImpl.setXCG01196(vrTechnicalSpec_XCG.getXCG01196());
		vrTechnicalSpec_XCGImpl.setXCG01197(vrTechnicalSpec_XCG.getXCG01197());
		vrTechnicalSpec_XCGImpl.setXCG01198(vrTechnicalSpec_XCG.getXCG01198());
		vrTechnicalSpec_XCGImpl.setXCG01199(vrTechnicalSpec_XCG.getXCG01199());
		vrTechnicalSpec_XCGImpl.setXCG01200(vrTechnicalSpec_XCG.getXCG01200());
		vrTechnicalSpec_XCGImpl.setXCG01202(vrTechnicalSpec_XCG.getXCG01202());
		vrTechnicalSpec_XCGImpl.setXCG01203(vrTechnicalSpec_XCG.getXCG01203());
		vrTechnicalSpec_XCGImpl.setXCG01204(vrTechnicalSpec_XCG.getXCG01204());
		vrTechnicalSpec_XCGImpl.setXCG01205(vrTechnicalSpec_XCG.getXCG01205());
		vrTechnicalSpec_XCGImpl.setXCG01206(vrTechnicalSpec_XCG.getXCG01206());
		vrTechnicalSpec_XCGImpl.setXCG01207(vrTechnicalSpec_XCG.getXCG01207());
		vrTechnicalSpec_XCGImpl.setXCG01208(vrTechnicalSpec_XCG.getXCG01208());
		vrTechnicalSpec_XCGImpl.setXCG01209(vrTechnicalSpec_XCG.getXCG01209());
		vrTechnicalSpec_XCGImpl.setXCG01210(vrTechnicalSpec_XCG.getXCG01210());
		vrTechnicalSpec_XCGImpl.setXCG01212(vrTechnicalSpec_XCG.getXCG01212());
		vrTechnicalSpec_XCGImpl.setXCG01213(vrTechnicalSpec_XCG.getXCG01213());
		vrTechnicalSpec_XCGImpl.setXCG01214(vrTechnicalSpec_XCG.getXCG01214());
		vrTechnicalSpec_XCGImpl.setXCG01215(vrTechnicalSpec_XCG.getXCG01215());
		vrTechnicalSpec_XCGImpl.setXCG01216(vrTechnicalSpec_XCG.getXCG01216());
		vrTechnicalSpec_XCGImpl.setXCG01217(vrTechnicalSpec_XCG.getXCG01217());
		vrTechnicalSpec_XCGImpl.setXCG01218(vrTechnicalSpec_XCG.getXCG01218());
		vrTechnicalSpec_XCGImpl.setXCG01219(vrTechnicalSpec_XCG.getXCG01219());
		vrTechnicalSpec_XCGImpl.setXCG01220(vrTechnicalSpec_XCG.getXCG01220());
		vrTechnicalSpec_XCGImpl.setXCG01221(vrTechnicalSpec_XCG.getXCG01221());
		vrTechnicalSpec_XCGImpl.setXCG01222(vrTechnicalSpec_XCG.getXCG01222());
		vrTechnicalSpec_XCGImpl.setXCG01223(vrTechnicalSpec_XCG.getXCG01223());
		vrTechnicalSpec_XCGImpl.setXCG01224(vrTechnicalSpec_XCG.getXCG01224());
		vrTechnicalSpec_XCGImpl.setXCG01225(vrTechnicalSpec_XCG.getXCG01225());
		vrTechnicalSpec_XCGImpl.setXCG01226(vrTechnicalSpec_XCG.getXCG01226());
		vrTechnicalSpec_XCGImpl.setXCG01228(vrTechnicalSpec_XCG.getXCG01228());
		vrTechnicalSpec_XCGImpl.setXCG01230(vrTechnicalSpec_XCG.getXCG01230());
		vrTechnicalSpec_XCGImpl.setXCG01231(vrTechnicalSpec_XCG.getXCG01231());
		vrTechnicalSpec_XCGImpl.setXCG01232(vrTechnicalSpec_XCG.getXCG01232());
		vrTechnicalSpec_XCGImpl.setXCG01234(vrTechnicalSpec_XCG.getXCG01234());
		vrTechnicalSpec_XCGImpl.setXCG01236(vrTechnicalSpec_XCG.getXCG01236());
		vrTechnicalSpec_XCGImpl.setXCG01237(vrTechnicalSpec_XCG.getXCG01237());
		vrTechnicalSpec_XCGImpl.setXCG01229(vrTechnicalSpec_XCG.getXCG01229());
		vrTechnicalSpec_XCGImpl.setXCG01238(vrTechnicalSpec_XCG.getXCG01238());
		vrTechnicalSpec_XCGImpl.setXCG01239(vrTechnicalSpec_XCG.getXCG01239());
		vrTechnicalSpec_XCGImpl.setXCG01240(vrTechnicalSpec_XCG.getXCG01240());
		vrTechnicalSpec_XCGImpl.setXCG01241(vrTechnicalSpec_XCG.getXCG01241());
		vrTechnicalSpec_XCGImpl.setXCG01242(vrTechnicalSpec_XCG.getXCG01242());
		vrTechnicalSpec_XCGImpl.setXCG01243(vrTechnicalSpec_XCG.getXCG01243());
		vrTechnicalSpec_XCGImpl.setXCG01235(vrTechnicalSpec_XCG.getXCG01235());
		vrTechnicalSpec_XCGImpl.setXCG01244(vrTechnicalSpec_XCG.getXCG01244());
		vrTechnicalSpec_XCGImpl.setXCG01245(vrTechnicalSpec_XCG.getXCG01245());
		vrTechnicalSpec_XCGImpl.setXCG01246(vrTechnicalSpec_XCG.getXCG01246());
		vrTechnicalSpec_XCGImpl.setXCG01247(vrTechnicalSpec_XCG.getXCG01247());
		vrTechnicalSpec_XCGImpl.setXCG01248(vrTechnicalSpec_XCG.getXCG01248());
		vrTechnicalSpec_XCGImpl.setXCG01249(vrTechnicalSpec_XCG.getXCG01249());
		vrTechnicalSpec_XCGImpl.setXCG11248(vrTechnicalSpec_XCG.getXCG11248());
		vrTechnicalSpec_XCGImpl.setXCG11249(vrTechnicalSpec_XCG.getXCG11249());
		vrTechnicalSpec_XCGImpl.setXCG01250(vrTechnicalSpec_XCG.getXCG01250());
		vrTechnicalSpec_XCGImpl.setXCG01251(vrTechnicalSpec_XCG.getXCG01251());
		vrTechnicalSpec_XCGImpl.setXCG01252(vrTechnicalSpec_XCG.getXCG01252());
		vrTechnicalSpec_XCGImpl.setXCG01253(vrTechnicalSpec_XCG.getXCG01253());
		vrTechnicalSpec_XCGImpl.setXCG01255(vrTechnicalSpec_XCG.getXCG01255());
		vrTechnicalSpec_XCGImpl.setXCG01256(vrTechnicalSpec_XCG.getXCG01256());
		vrTechnicalSpec_XCGImpl.setXCG01257(vrTechnicalSpec_XCG.getXCG01257());
		vrTechnicalSpec_XCGImpl.setXCG01258(vrTechnicalSpec_XCG.getXCG01258());
		vrTechnicalSpec_XCGImpl.setXCG01259(vrTechnicalSpec_XCG.getXCG01259());
		vrTechnicalSpec_XCGImpl.setXCG01260(vrTechnicalSpec_XCG.getXCG01260());
		vrTechnicalSpec_XCGImpl.setXCG01261(vrTechnicalSpec_XCG.getXCG01261());
		vrTechnicalSpec_XCGImpl.setXCG01262(vrTechnicalSpec_XCG.getXCG01262());
		vrTechnicalSpec_XCGImpl.setXCG11253(vrTechnicalSpec_XCG.getXCG11253());
		vrTechnicalSpec_XCGImpl.setXCG01263(vrTechnicalSpec_XCG.getXCG01263());
		vrTechnicalSpec_XCGImpl.setXCG01264(vrTechnicalSpec_XCG.getXCG01264());
		vrTechnicalSpec_XCGImpl.setXCG01265(vrTechnicalSpec_XCG.getXCG01265());
		vrTechnicalSpec_XCGImpl.setXCG01266(vrTechnicalSpec_XCG.getXCG01266());
		vrTechnicalSpec_XCGImpl.setXCG01901(vrTechnicalSpec_XCG.getXCG01901());
		vrTechnicalSpec_XCGImpl.setXCG01267(vrTechnicalSpec_XCG.getXCG01267());
		vrTechnicalSpec_XCGImpl.setXCG01902(vrTechnicalSpec_XCG.getXCG01902());
		vrTechnicalSpec_XCGImpl.setXCG01268(vrTechnicalSpec_XCG.getXCG01268());
		vrTechnicalSpec_XCGImpl.setXCG01269(vrTechnicalSpec_XCG.getXCG01269());
		vrTechnicalSpec_XCGImpl.setXCG01903(vrTechnicalSpec_XCG.getXCG01903());
		vrTechnicalSpec_XCGImpl.setXCG01270(vrTechnicalSpec_XCG.getXCG01270());
		vrTechnicalSpec_XCGImpl.setXCG01271(vrTechnicalSpec_XCG.getXCG01271());
		vrTechnicalSpec_XCGImpl.setXCG01273(vrTechnicalSpec_XCG.getXCG01273());
		vrTechnicalSpec_XCGImpl.setXCG01274(vrTechnicalSpec_XCG.getXCG01274());
		vrTechnicalSpec_XCGImpl.setXCG01275(vrTechnicalSpec_XCG.getXCG01275());
		vrTechnicalSpec_XCGImpl.setXCG01276(vrTechnicalSpec_XCG.getXCG01276());
		vrTechnicalSpec_XCGImpl.setXCG01277(vrTechnicalSpec_XCG.getXCG01277());
		vrTechnicalSpec_XCGImpl.setXCG01278(vrTechnicalSpec_XCG.getXCG01278());
		vrTechnicalSpec_XCGImpl.setXCG01279(vrTechnicalSpec_XCG.getXCG01279());
		vrTechnicalSpec_XCGImpl.setXCG01280(vrTechnicalSpec_XCG.getXCG01280());
		vrTechnicalSpec_XCGImpl.setXCG01281(vrTechnicalSpec_XCG.getXCG01281());
		vrTechnicalSpec_XCGImpl.setXCG01282(vrTechnicalSpec_XCG.getXCG01282());
		vrTechnicalSpec_XCGImpl.setXCG01283(vrTechnicalSpec_XCG.getXCG01283());
		vrTechnicalSpec_XCGImpl.setXCG01284(vrTechnicalSpec_XCG.getXCG01284());
		vrTechnicalSpec_XCGImpl.setXCG01285(vrTechnicalSpec_XCG.getXCG01285());
		vrTechnicalSpec_XCGImpl.setXCG01286(vrTechnicalSpec_XCG.getXCG01286());
		vrTechnicalSpec_XCGImpl.setXCG01287(vrTechnicalSpec_XCG.getXCG01287());
		vrTechnicalSpec_XCGImpl.setXCG01288(vrTechnicalSpec_XCG.getXCG01288());
		vrTechnicalSpec_XCGImpl.setXCG01289(vrTechnicalSpec_XCG.getXCG01289());
		vrTechnicalSpec_XCGImpl.setXCG01290(vrTechnicalSpec_XCG.getXCG01290());
		vrTechnicalSpec_XCGImpl.setXCG01291(vrTechnicalSpec_XCG.getXCG01291());
		vrTechnicalSpec_XCGImpl.setXCG01292(vrTechnicalSpec_XCG.getXCG01292());
		vrTechnicalSpec_XCGImpl.setXCG01293(vrTechnicalSpec_XCG.getXCG01293());
		vrTechnicalSpec_XCGImpl.setXCG01294(vrTechnicalSpec_XCG.getXCG01294());
		vrTechnicalSpec_XCGImpl.setXCG01295(vrTechnicalSpec_XCG.getXCG01295());
		vrTechnicalSpec_XCGImpl.setXCG01296(vrTechnicalSpec_XCG.getXCG01296());
		vrTechnicalSpec_XCGImpl.setXCG01297(vrTechnicalSpec_XCG.getXCG01297());
		vrTechnicalSpec_XCGImpl.setXCG01298(vrTechnicalSpec_XCG.getXCG01298());
		vrTechnicalSpec_XCGImpl.setXCG01300(vrTechnicalSpec_XCG.getXCG01300());
		vrTechnicalSpec_XCGImpl.setXCG01301(vrTechnicalSpec_XCG.getXCG01301());
		vrTechnicalSpec_XCGImpl.setXCG01302(vrTechnicalSpec_XCG.getXCG01302());
		vrTechnicalSpec_XCGImpl.setXCG01303(vrTechnicalSpec_XCG.getXCG01303());
		vrTechnicalSpec_XCGImpl.setXCG01304(vrTechnicalSpec_XCG.getXCG01304());
		vrTechnicalSpec_XCGImpl.setXCG01305(vrTechnicalSpec_XCG.getXCG01305());
		vrTechnicalSpec_XCGImpl.setXCG01306(vrTechnicalSpec_XCG.getXCG01306());
		vrTechnicalSpec_XCGImpl.setXCG01307(vrTechnicalSpec_XCG.getXCG01307());
		vrTechnicalSpec_XCGImpl.setXCG01308(vrTechnicalSpec_XCG.getXCG01308());
		vrTechnicalSpec_XCGImpl.setXCG01310(vrTechnicalSpec_XCG.getXCG01310());
		vrTechnicalSpec_XCGImpl.setXCG01311(vrTechnicalSpec_XCG.getXCG01311());
		vrTechnicalSpec_XCGImpl.setXCG01312(vrTechnicalSpec_XCG.getXCG01312());
		vrTechnicalSpec_XCGImpl.setXCG01313(vrTechnicalSpec_XCG.getXCG01313());
		vrTechnicalSpec_XCGImpl.setXCG01314(vrTechnicalSpec_XCG.getXCG01314());
		vrTechnicalSpec_XCGImpl.setXCG01315(vrTechnicalSpec_XCG.getXCG01315());
		vrTechnicalSpec_XCGImpl.setXCG01316(vrTechnicalSpec_XCG.getXCG01316());
		vrTechnicalSpec_XCGImpl.setXCG01317(vrTechnicalSpec_XCG.getXCG01317());
		vrTechnicalSpec_XCGImpl.setXCG01318(vrTechnicalSpec_XCG.getXCG01318());
		vrTechnicalSpec_XCGImpl.setXCG01319(vrTechnicalSpec_XCG.getXCG01319());
		vrTechnicalSpec_XCGImpl.setXCG01320(vrTechnicalSpec_XCG.getXCG01320());
		vrTechnicalSpec_XCGImpl.setXCG01321(vrTechnicalSpec_XCG.getXCG01321());
		vrTechnicalSpec_XCGImpl.setXCG01322(vrTechnicalSpec_XCG.getXCG01322());
		vrTechnicalSpec_XCGImpl.setXCG01323(vrTechnicalSpec_XCG.getXCG01323());
		vrTechnicalSpec_XCGImpl.setXCG01324(vrTechnicalSpec_XCG.getXCG01324());
		vrTechnicalSpec_XCGImpl.setXCG01325(vrTechnicalSpec_XCG.getXCG01325());
		vrTechnicalSpec_XCGImpl.setXCG01326(vrTechnicalSpec_XCG.getXCG01326());
		vrTechnicalSpec_XCGImpl.setXCG01327(vrTechnicalSpec_XCG.getXCG01327());
		vrTechnicalSpec_XCGImpl.setXCG01328(vrTechnicalSpec_XCG.getXCG01328());
		vrTechnicalSpec_XCGImpl.setXCG01330(vrTechnicalSpec_XCG.getXCG01330());
		vrTechnicalSpec_XCGImpl.setXCG01331(vrTechnicalSpec_XCG.getXCG01331());
		vrTechnicalSpec_XCGImpl.setXCG01332(vrTechnicalSpec_XCG.getXCG01332());
		vrTechnicalSpec_XCGImpl.setXCG01333(vrTechnicalSpec_XCG.getXCG01333());
		vrTechnicalSpec_XCGImpl.setXCG01334(vrTechnicalSpec_XCG.getXCG01334());
		vrTechnicalSpec_XCGImpl.setXCG01335(vrTechnicalSpec_XCG.getXCG01335());
		vrTechnicalSpec_XCGImpl.setXCG01336(vrTechnicalSpec_XCG.getXCG01336());
		vrTechnicalSpec_XCGImpl.setXCG01337(vrTechnicalSpec_XCG.getXCG01337());
		vrTechnicalSpec_XCGImpl.setXCG01338(vrTechnicalSpec_XCG.getXCG01338());
		vrTechnicalSpec_XCGImpl.setXCG01339(vrTechnicalSpec_XCG.getXCG01339());
		vrTechnicalSpec_XCGImpl.setXCG01340(vrTechnicalSpec_XCG.getXCG01340());
		vrTechnicalSpec_XCGImpl.setXCG01341(vrTechnicalSpec_XCG.getXCG01341());
		vrTechnicalSpec_XCGImpl.setXCG01342(vrTechnicalSpec_XCG.getXCG01342());
		vrTechnicalSpec_XCGImpl.setXCG01343(vrTechnicalSpec_XCG.getXCG01343());
		vrTechnicalSpec_XCGImpl.setXCG01344(vrTechnicalSpec_XCG.getXCG01344());
		vrTechnicalSpec_XCGImpl.setXCG01345(vrTechnicalSpec_XCG.getXCG01345());
		vrTechnicalSpec_XCGImpl.setXCG01346(vrTechnicalSpec_XCG.getXCG01346());
		vrTechnicalSpec_XCGImpl.setXCG01347(vrTechnicalSpec_XCG.getXCG01347());
		vrTechnicalSpec_XCGImpl.setXCG01348(vrTechnicalSpec_XCG.getXCG01348());
		vrTechnicalSpec_XCGImpl.setXCG01349(vrTechnicalSpec_XCG.getXCG01349());
		vrTechnicalSpec_XCGImpl.setXCG01350(vrTechnicalSpec_XCG.getXCG01350());
		vrTechnicalSpec_XCGImpl.setXCG01351(vrTechnicalSpec_XCG.getXCG01351());
		vrTechnicalSpec_XCGImpl.setXCG01352(vrTechnicalSpec_XCG.getXCG01352());
		vrTechnicalSpec_XCGImpl.setXCG01353(vrTechnicalSpec_XCG.getXCG01353());
		vrTechnicalSpec_XCGImpl.setXCG01354(vrTechnicalSpec_XCG.getXCG01354());
		vrTechnicalSpec_XCGImpl.setXCG01355(vrTechnicalSpec_XCG.getXCG01355());
		vrTechnicalSpec_XCGImpl.setXCG01356(vrTechnicalSpec_XCG.getXCG01356());
		vrTechnicalSpec_XCGImpl.setXCG01357(vrTechnicalSpec_XCG.getXCG01357());
		vrTechnicalSpec_XCGImpl.setXCG01358(vrTechnicalSpec_XCG.getXCG01358());
		vrTechnicalSpec_XCGImpl.setXCG01359(vrTechnicalSpec_XCG.getXCG01359());
		vrTechnicalSpec_XCGImpl.setXCG01360(vrTechnicalSpec_XCG.getXCG01360());
		vrTechnicalSpec_XCGImpl.setXCG01361(vrTechnicalSpec_XCG.getXCG01361());
		vrTechnicalSpec_XCGImpl.setXCG01362(vrTechnicalSpec_XCG.getXCG01362());
		vrTechnicalSpec_XCGImpl.setXCG01363(vrTechnicalSpec_XCG.getXCG01363());
		vrTechnicalSpec_XCGImpl.setXCG01364(vrTechnicalSpec_XCG.getXCG01364());
		vrTechnicalSpec_XCGImpl.setXCG01365(vrTechnicalSpec_XCG.getXCG01365());
		vrTechnicalSpec_XCGImpl.setXCG01366(vrTechnicalSpec_XCG.getXCG01366());
		vrTechnicalSpec_XCGImpl.setXCG01367(vrTechnicalSpec_XCG.getXCG01367());
		vrTechnicalSpec_XCGImpl.setXCG01368(vrTechnicalSpec_XCG.getXCG01368());
		vrTechnicalSpec_XCGImpl.setXCG01369(vrTechnicalSpec_XCG.getXCG01369());
		vrTechnicalSpec_XCGImpl.setXCG01370(vrTechnicalSpec_XCG.getXCG01370());
		vrTechnicalSpec_XCGImpl.setXCG01371(vrTechnicalSpec_XCG.getXCG01371());
		vrTechnicalSpec_XCGImpl.setXCG01372(vrTechnicalSpec_XCG.getXCG01372());
		vrTechnicalSpec_XCGImpl.setXCG01373(vrTechnicalSpec_XCG.getXCG01373());
		vrTechnicalSpec_XCGImpl.setXCG01374(vrTechnicalSpec_XCG.getXCG01374());
		vrTechnicalSpec_XCGImpl.setXCG01375(vrTechnicalSpec_XCG.getXCG01375());
		vrTechnicalSpec_XCGImpl.setXCG01376(vrTechnicalSpec_XCG.getXCG01376());
		vrTechnicalSpec_XCGImpl.setXCG01377(vrTechnicalSpec_XCG.getXCG01377());
		vrTechnicalSpec_XCGImpl.setXCG01378(vrTechnicalSpec_XCG.getXCG01378());
		vrTechnicalSpec_XCGImpl.setXCG01379(vrTechnicalSpec_XCG.getXCG01379());
		vrTechnicalSpec_XCGImpl.setXCG01381(vrTechnicalSpec_XCG.getXCG01381());
		vrTechnicalSpec_XCGImpl.setXCG01382(vrTechnicalSpec_XCG.getXCG01382());
		vrTechnicalSpec_XCGImpl.setXCG01383(vrTechnicalSpec_XCG.getXCG01383());
		vrTechnicalSpec_XCGImpl.setXCG01384(vrTechnicalSpec_XCG.getXCG01384());
		vrTechnicalSpec_XCGImpl.setXCG01385(vrTechnicalSpec_XCG.getXCG01385());
		vrTechnicalSpec_XCGImpl.setXCG01386(vrTechnicalSpec_XCG.getXCG01386());
		vrTechnicalSpec_XCGImpl.setXCG01387(vrTechnicalSpec_XCG.getXCG01387());
		vrTechnicalSpec_XCGImpl.setXCG01388(vrTechnicalSpec_XCG.getXCG01388());
		vrTechnicalSpec_XCGImpl.setXCG01389(vrTechnicalSpec_XCG.getXCG01389());
		vrTechnicalSpec_XCGImpl.setXCG01390(vrTechnicalSpec_XCG.getXCG01390());
		vrTechnicalSpec_XCGImpl.setXCG01391(vrTechnicalSpec_XCG.getXCG01391());
		vrTechnicalSpec_XCGImpl.setXCG01392(vrTechnicalSpec_XCG.getXCG01392());
		vrTechnicalSpec_XCGImpl.setXCG01393(vrTechnicalSpec_XCG.getXCG01393());
		vrTechnicalSpec_XCGImpl.setXCG01394(vrTechnicalSpec_XCG.getXCG01394());
		vrTechnicalSpec_XCGImpl.setXCG01395(vrTechnicalSpec_XCG.getXCG01395());
		vrTechnicalSpec_XCGImpl.setXCG01396(vrTechnicalSpec_XCG.getXCG01396());
		vrTechnicalSpec_XCGImpl.setXCG01397(vrTechnicalSpec_XCG.getXCG01397());
		vrTechnicalSpec_XCGImpl.setXCG01398(vrTechnicalSpec_XCG.getXCG01398());
		vrTechnicalSpec_XCGImpl.setXCG01399(vrTechnicalSpec_XCG.getXCG01399());
		vrTechnicalSpec_XCGImpl.setXCG01400(vrTechnicalSpec_XCG.getXCG01400());
		vrTechnicalSpec_XCGImpl.setXCG01402(vrTechnicalSpec_XCG.getXCG01402());
		vrTechnicalSpec_XCGImpl.setXCG01403(vrTechnicalSpec_XCG.getXCG01403());
		vrTechnicalSpec_XCGImpl.setXCG01404(vrTechnicalSpec_XCG.getXCG01404());
		vrTechnicalSpec_XCGImpl.setXCG01405(vrTechnicalSpec_XCG.getXCG01405());
		vrTechnicalSpec_XCGImpl.setXCG01406(vrTechnicalSpec_XCG.getXCG01406());
		vrTechnicalSpec_XCGImpl.setXCG01407(vrTechnicalSpec_XCG.getXCG01407());
		vrTechnicalSpec_XCGImpl.setXCG01408(vrTechnicalSpec_XCG.getXCG01408());
		vrTechnicalSpec_XCGImpl.setXCG01409(vrTechnicalSpec_XCG.getXCG01409());
		vrTechnicalSpec_XCGImpl.setXCG01410(vrTechnicalSpec_XCG.getXCG01410());
		vrTechnicalSpec_XCGImpl.setXCG01411(vrTechnicalSpec_XCG.getXCG01411());
		vrTechnicalSpec_XCGImpl.setXCG01412(vrTechnicalSpec_XCG.getXCG01412());
		vrTechnicalSpec_XCGImpl.setXCG01413(vrTechnicalSpec_XCG.getXCG01413());
		vrTechnicalSpec_XCGImpl.setXCG01414(vrTechnicalSpec_XCG.getXCG01414());
		vrTechnicalSpec_XCGImpl.setXCG01415(vrTechnicalSpec_XCG.getXCG01415());
		vrTechnicalSpec_XCGImpl.setXCG01416(vrTechnicalSpec_XCG.getXCG01416());
		vrTechnicalSpec_XCGImpl.setXCG01417(vrTechnicalSpec_XCG.getXCG01417());
		vrTechnicalSpec_XCGImpl.setXCG01418(vrTechnicalSpec_XCG.getXCG01418());
		vrTechnicalSpec_XCGImpl.setXCG01419(vrTechnicalSpec_XCG.getXCG01419());
		vrTechnicalSpec_XCGImpl.setXCG01420(vrTechnicalSpec_XCG.getXCG01420());
		vrTechnicalSpec_XCGImpl.setXCG01421(vrTechnicalSpec_XCG.getXCG01421());
		vrTechnicalSpec_XCGImpl.setXCG01422(vrTechnicalSpec_XCG.getXCG01422());
		vrTechnicalSpec_XCGImpl.setXCG01423(vrTechnicalSpec_XCG.getXCG01423());
		vrTechnicalSpec_XCGImpl.setXCG01424(vrTechnicalSpec_XCG.getXCG01424());
		vrTechnicalSpec_XCGImpl.setXCG01425(vrTechnicalSpec_XCG.getXCG01425());
		vrTechnicalSpec_XCGImpl.setXCG01426(vrTechnicalSpec_XCG.getXCG01426());
		vrTechnicalSpec_XCGImpl.setXCG01427(vrTechnicalSpec_XCG.getXCG01427());
		vrTechnicalSpec_XCGImpl.setXCG01428(vrTechnicalSpec_XCG.getXCG01428());
		vrTechnicalSpec_XCGImpl.setXCG01437(vrTechnicalSpec_XCG.getXCG01437());
		vrTechnicalSpec_XCGImpl.setXCG01429(vrTechnicalSpec_XCG.getXCG01429());
		vrTechnicalSpec_XCGImpl.setXCG01430(vrTechnicalSpec_XCG.getXCG01430());
		vrTechnicalSpec_XCGImpl.setXCG01431(vrTechnicalSpec_XCG.getXCG01431());
		vrTechnicalSpec_XCGImpl.setXCG01432(vrTechnicalSpec_XCG.getXCG01432());
		vrTechnicalSpec_XCGImpl.setXCG01433(vrTechnicalSpec_XCG.getXCG01433());
		vrTechnicalSpec_XCGImpl.setXCG01434(vrTechnicalSpec_XCG.getXCG01434());
		vrTechnicalSpec_XCGImpl.setXCG01435(vrTechnicalSpec_XCG.getXCG01435());
		vrTechnicalSpec_XCGImpl.setXCG01436(vrTechnicalSpec_XCG.getXCG01436());
		vrTechnicalSpec_XCGImpl.setXCG01439(vrTechnicalSpec_XCG.getXCG01439());
		vrTechnicalSpec_XCGImpl.setXCG01440(vrTechnicalSpec_XCG.getXCG01440());
		vrTechnicalSpec_XCGImpl.setXCG01441(vrTechnicalSpec_XCG.getXCG01441());
		vrTechnicalSpec_XCGImpl.setXCG01442(vrTechnicalSpec_XCG.getXCG01442());
		vrTechnicalSpec_XCGImpl.setXCG01443(vrTechnicalSpec_XCG.getXCG01443());
		vrTechnicalSpec_XCGImpl.setXCG01445(vrTechnicalSpec_XCG.getXCG01445());
		vrTechnicalSpec_XCGImpl.setXCG01446(vrTechnicalSpec_XCG.getXCG01446());
		vrTechnicalSpec_XCGImpl.setXCG01447(vrTechnicalSpec_XCG.getXCG01447());
		vrTechnicalSpec_XCGImpl.setXCG01448(vrTechnicalSpec_XCG.getXCG01448());
		vrTechnicalSpec_XCGImpl.setXCG01449(vrTechnicalSpec_XCG.getXCG01449());
		vrTechnicalSpec_XCGImpl.setXCG01450(vrTechnicalSpec_XCG.getXCG01450());
		vrTechnicalSpec_XCGImpl.setXCG01451(vrTechnicalSpec_XCG.getXCG01451());
		vrTechnicalSpec_XCGImpl.setXCG01452(vrTechnicalSpec_XCG.getXCG01452());
		vrTechnicalSpec_XCGImpl.setXCG01453(vrTechnicalSpec_XCG.getXCG01453());
		vrTechnicalSpec_XCGImpl.setXCG01454(vrTechnicalSpec_XCG.getXCG01454());
		vrTechnicalSpec_XCGImpl.setXCG01455(vrTechnicalSpec_XCG.getXCG01455());
		vrTechnicalSpec_XCGImpl.setXCG01456(vrTechnicalSpec_XCG.getXCG01456());
		vrTechnicalSpec_XCGImpl.setXCG01457(vrTechnicalSpec_XCG.getXCG01457());
		vrTechnicalSpec_XCGImpl.setXCG01458(vrTechnicalSpec_XCG.getXCG01458());
		vrTechnicalSpec_XCGImpl.setXCG01459(vrTechnicalSpec_XCG.getXCG01459());
		vrTechnicalSpec_XCGImpl.setXCG01460(vrTechnicalSpec_XCG.getXCG01460());
		vrTechnicalSpec_XCGImpl.setXCG01461(vrTechnicalSpec_XCG.getXCG01461());
		vrTechnicalSpec_XCGImpl.setXCG01462(vrTechnicalSpec_XCG.getXCG01462());
		vrTechnicalSpec_XCGImpl.setXCG01463(vrTechnicalSpec_XCG.getXCG01463());
		vrTechnicalSpec_XCGImpl.setXCG01464(vrTechnicalSpec_XCG.getXCG01464());
		vrTechnicalSpec_XCGImpl.setXCG01465(vrTechnicalSpec_XCG.getXCG01465());
		vrTechnicalSpec_XCGImpl.setXCG01466(vrTechnicalSpec_XCG.getXCG01466());
		vrTechnicalSpec_XCGImpl.setXCG01467(vrTechnicalSpec_XCG.getXCG01467());
		vrTechnicalSpec_XCGImpl.setXCG01468(vrTechnicalSpec_XCG.getXCG01468());
		vrTechnicalSpec_XCGImpl.setXCG01469(vrTechnicalSpec_XCG.getXCG01469());
		vrTechnicalSpec_XCGImpl.setXCG01470(vrTechnicalSpec_XCG.getXCG01470());
		vrTechnicalSpec_XCGImpl.setXCG01471(vrTechnicalSpec_XCG.getXCG01471());
		vrTechnicalSpec_XCGImpl.setXCG01472(vrTechnicalSpec_XCG.getXCG01472());
		vrTechnicalSpec_XCGImpl.setXCG01473(vrTechnicalSpec_XCG.getXCG01473());
		vrTechnicalSpec_XCGImpl.setXCG01474(vrTechnicalSpec_XCG.getXCG01474());
		vrTechnicalSpec_XCGImpl.setXCG01475(vrTechnicalSpec_XCG.getXCG01475());
		vrTechnicalSpec_XCGImpl.setXCG01476(vrTechnicalSpec_XCG.getXCG01476());
		vrTechnicalSpec_XCGImpl.setXCG01477(vrTechnicalSpec_XCG.getXCG01477());
		vrTechnicalSpec_XCGImpl.setXCG01478(vrTechnicalSpec_XCG.getXCG01478());
		vrTechnicalSpec_XCGImpl.setXCG01479(vrTechnicalSpec_XCG.getXCG01479());
		vrTechnicalSpec_XCGImpl.setXCG01480(vrTechnicalSpec_XCG.getXCG01480());
		vrTechnicalSpec_XCGImpl.setXCG01481(vrTechnicalSpec_XCG.getXCG01481());
		vrTechnicalSpec_XCGImpl.setXCG01482(vrTechnicalSpec_XCG.getXCG01482());
		vrTechnicalSpec_XCGImpl.setXCG01483(vrTechnicalSpec_XCG.getXCG01483());
		vrTechnicalSpec_XCGImpl.setXCG01484(vrTechnicalSpec_XCG.getXCG01484());
		vrTechnicalSpec_XCGImpl.setXCG01485(vrTechnicalSpec_XCG.getXCG01485());
		vrTechnicalSpec_XCGImpl.setXCG01486(vrTechnicalSpec_XCG.getXCG01486());
		vrTechnicalSpec_XCGImpl.setXCG01487(vrTechnicalSpec_XCG.getXCG01487());
		vrTechnicalSpec_XCGImpl.setXCG01488(vrTechnicalSpec_XCG.getXCG01488());
		vrTechnicalSpec_XCGImpl.setXCG01489(vrTechnicalSpec_XCG.getXCG01489());
		vrTechnicalSpec_XCGImpl.setXCG01490(vrTechnicalSpec_XCG.getXCG01490());
		vrTechnicalSpec_XCGImpl.setXCG01491(vrTechnicalSpec_XCG.getXCG01491());
		vrTechnicalSpec_XCGImpl.setXCG01492(vrTechnicalSpec_XCG.getXCG01492());
		vrTechnicalSpec_XCGImpl.setXCG01493(vrTechnicalSpec_XCG.getXCG01493());
		vrTechnicalSpec_XCGImpl.setXCG01494(vrTechnicalSpec_XCG.getXCG01494());
		vrTechnicalSpec_XCGImpl.setXCG01496(vrTechnicalSpec_XCG.getXCG01496());
		vrTechnicalSpec_XCGImpl.setXCG01497(vrTechnicalSpec_XCG.getXCG01497());
		vrTechnicalSpec_XCGImpl.setXCG01498(vrTechnicalSpec_XCG.getXCG01498());
		vrTechnicalSpec_XCGImpl.setXCG01499(vrTechnicalSpec_XCG.getXCG01499());
		vrTechnicalSpec_XCGImpl.setXCG01500(vrTechnicalSpec_XCG.getXCG01500());
		vrTechnicalSpec_XCGImpl.setXCG01501(vrTechnicalSpec_XCG.getXCG01501());
		vrTechnicalSpec_XCGImpl.setXCG01502(vrTechnicalSpec_XCG.getXCG01502());
		vrTechnicalSpec_XCGImpl.setXCG01503(vrTechnicalSpec_XCG.getXCG01503());
		vrTechnicalSpec_XCGImpl.setXCG01504(vrTechnicalSpec_XCG.getXCG01504());
		vrTechnicalSpec_XCGImpl.setXCG01505(vrTechnicalSpec_XCG.getXCG01505());
		vrTechnicalSpec_XCGImpl.setXCG01506(vrTechnicalSpec_XCG.getXCG01506());
		vrTechnicalSpec_XCGImpl.setXCG01507(vrTechnicalSpec_XCG.getXCG01507());
		vrTechnicalSpec_XCGImpl.setXCG01508(vrTechnicalSpec_XCG.getXCG01508());
		vrTechnicalSpec_XCGImpl.setXCG01509(vrTechnicalSpec_XCG.getXCG01509());
		vrTechnicalSpec_XCGImpl.setXCG01510(vrTechnicalSpec_XCG.getXCG01510());
		vrTechnicalSpec_XCGImpl.setXCG01512(vrTechnicalSpec_XCG.getXCG01512());
		vrTechnicalSpec_XCGImpl.setXCG01513(vrTechnicalSpec_XCG.getXCG01513());
		vrTechnicalSpec_XCGImpl.setXCG01514(vrTechnicalSpec_XCG.getXCG01514());
		vrTechnicalSpec_XCGImpl.setXCG01515(vrTechnicalSpec_XCG.getXCG01515());
		vrTechnicalSpec_XCGImpl.setXCG01516(vrTechnicalSpec_XCG.getXCG01516());
		vrTechnicalSpec_XCGImpl.setXCG01517(vrTechnicalSpec_XCG.getXCG01517());
		vrTechnicalSpec_XCGImpl.setXCG01518(vrTechnicalSpec_XCG.getXCG01518());
		vrTechnicalSpec_XCGImpl.setXCG01519(vrTechnicalSpec_XCG.getXCG01519());
		vrTechnicalSpec_XCGImpl.setXCG01520(vrTechnicalSpec_XCG.getXCG01520());
		vrTechnicalSpec_XCGImpl.setXCG01521(vrTechnicalSpec_XCG.getXCG01521());
		vrTechnicalSpec_XCGImpl.setXCG01522(vrTechnicalSpec_XCG.getXCG01522());
		vrTechnicalSpec_XCGImpl.setXCG01523(vrTechnicalSpec_XCG.getXCG01523());
		vrTechnicalSpec_XCGImpl.setXCG01524(vrTechnicalSpec_XCG.getXCG01524());
		vrTechnicalSpec_XCGImpl.setXCG01525(vrTechnicalSpec_XCG.getXCG01525());
		vrTechnicalSpec_XCGImpl.setXCG01526(vrTechnicalSpec_XCG.getXCG01526());
		vrTechnicalSpec_XCGImpl.setXCG01527(vrTechnicalSpec_XCG.getXCG01527());
		vrTechnicalSpec_XCGImpl.setXCG01528(vrTechnicalSpec_XCG.getXCG01528());
		vrTechnicalSpec_XCGImpl.setXCG01529(vrTechnicalSpec_XCG.getXCG01529());
		vrTechnicalSpec_XCGImpl.setXCG01530(vrTechnicalSpec_XCG.getXCG01530());
		vrTechnicalSpec_XCGImpl.setXCG01531(vrTechnicalSpec_XCG.getXCG01531());
		vrTechnicalSpec_XCGImpl.setXCG01904(vrTechnicalSpec_XCG.getXCG01904());
		vrTechnicalSpec_XCGImpl.setXCG01533(vrTechnicalSpec_XCG.getXCG01533());
		vrTechnicalSpec_XCGImpl.setXCG01905(vrTechnicalSpec_XCG.getXCG01905());
		vrTechnicalSpec_XCGImpl.setXCG01534(vrTechnicalSpec_XCG.getXCG01534());
		vrTechnicalSpec_XCGImpl.setXCG01906(vrTechnicalSpec_XCG.getXCG01906());
		vrTechnicalSpec_XCGImpl.setXCG01535(vrTechnicalSpec_XCG.getXCG01535());
		vrTechnicalSpec_XCGImpl.setXCG01907(vrTechnicalSpec_XCG.getXCG01907());
		vrTechnicalSpec_XCGImpl.setXCG01536(vrTechnicalSpec_XCG.getXCG01536());
		vrTechnicalSpec_XCGImpl.setXCG01908(vrTechnicalSpec_XCG.getXCG01908());
		vrTechnicalSpec_XCGImpl.setXCG01537(vrTechnicalSpec_XCG.getXCG01537());
		vrTechnicalSpec_XCGImpl.setXCG01909(vrTechnicalSpec_XCG.getXCG01909());
		vrTechnicalSpec_XCGImpl.setXCG01538(vrTechnicalSpec_XCG.getXCG01538());
		vrTechnicalSpec_XCGImpl.setXCG01910(vrTechnicalSpec_XCG.getXCG01910());
		vrTechnicalSpec_XCGImpl.setXCG01539(vrTechnicalSpec_XCG.getXCG01539());
		vrTechnicalSpec_XCGImpl.setXCG11535(vrTechnicalSpec_XCG.getXCG11535());
		vrTechnicalSpec_XCGImpl.setXCG01541(vrTechnicalSpec_XCG.getXCG01541());
		vrTechnicalSpec_XCGImpl.setXCG01542(vrTechnicalSpec_XCG.getXCG01542());
		vrTechnicalSpec_XCGImpl.setXCG01911(vrTechnicalSpec_XCG.getXCG01911());
		vrTechnicalSpec_XCGImpl.setXCG01543(vrTechnicalSpec_XCG.getXCG01543());
		vrTechnicalSpec_XCGImpl.setXCG01912(vrTechnicalSpec_XCG.getXCG01912());
		vrTechnicalSpec_XCGImpl.setXCG01544(vrTechnicalSpec_XCG.getXCG01544());
		vrTechnicalSpec_XCGImpl.setXCG01545(vrTechnicalSpec_XCG.getXCG01545());
		vrTechnicalSpec_XCGImpl.setXCG01546(vrTechnicalSpec_XCG.getXCG01546());
		vrTechnicalSpec_XCGImpl.setXCG01547(vrTechnicalSpec_XCG.getXCG01547());
		vrTechnicalSpec_XCGImpl.setXCG01548(vrTechnicalSpec_XCG.getXCG01548());
		vrTechnicalSpec_XCGImpl.setXCG01913(vrTechnicalSpec_XCG.getXCG01913());
		vrTechnicalSpec_XCGImpl.setXCG01549(vrTechnicalSpec_XCG.getXCG01549());
		vrTechnicalSpec_XCGImpl.setXCG01914(vrTechnicalSpec_XCG.getXCG01914());
		vrTechnicalSpec_XCGImpl.setXCG01550(vrTechnicalSpec_XCG.getXCG01550());
		vrTechnicalSpec_XCGImpl.setXCG01551(vrTechnicalSpec_XCG.getXCG01551());
		vrTechnicalSpec_XCGImpl.setXCG01552(vrTechnicalSpec_XCG.getXCG01552());
		vrTechnicalSpec_XCGImpl.setXCG01553(vrTechnicalSpec_XCG.getXCG01553());
		vrTechnicalSpec_XCGImpl.setXCG01554(vrTechnicalSpec_XCG.getXCG01554());
		vrTechnicalSpec_XCGImpl.setXCG01915(vrTechnicalSpec_XCG.getXCG01915());
		vrTechnicalSpec_XCGImpl.setXCG01555(vrTechnicalSpec_XCG.getXCG01555());
		vrTechnicalSpec_XCGImpl.setXCG01556(vrTechnicalSpec_XCG.getXCG01556());
		vrTechnicalSpec_XCGImpl.setXCG01557(vrTechnicalSpec_XCG.getXCG01557());
		vrTechnicalSpec_XCGImpl.setXCG01558(vrTechnicalSpec_XCG.getXCG01558());
		vrTechnicalSpec_XCGImpl.setXCG01559(vrTechnicalSpec_XCG.getXCG01559());
		vrTechnicalSpec_XCGImpl.setXCG01560(vrTechnicalSpec_XCG.getXCG01560());
		vrTechnicalSpec_XCGImpl.setXCG01561(vrTechnicalSpec_XCG.getXCG01561());
		vrTechnicalSpec_XCGImpl.setXCG01916(vrTechnicalSpec_XCG.getXCG01916());
		vrTechnicalSpec_XCGImpl.setXCG01562(vrTechnicalSpec_XCG.getXCG01562());
		vrTechnicalSpec_XCGImpl.setXCG01917(vrTechnicalSpec_XCG.getXCG01917());
		vrTechnicalSpec_XCGImpl.setXCG01563(vrTechnicalSpec_XCG.getXCG01563());
		vrTechnicalSpec_XCGImpl.setXCG01918(vrTechnicalSpec_XCG.getXCG01918());
		vrTechnicalSpec_XCGImpl.setXCG01564(vrTechnicalSpec_XCG.getXCG01564());
		vrTechnicalSpec_XCGImpl.setXCG01565(vrTechnicalSpec_XCG.getXCG01565());
		vrTechnicalSpec_XCGImpl.setXCG01566(vrTechnicalSpec_XCG.getXCG01566());
		vrTechnicalSpec_XCGImpl.setXCG01567(vrTechnicalSpec_XCG.getXCG01567());
		vrTechnicalSpec_XCGImpl.setXCG01568(vrTechnicalSpec_XCG.getXCG01568());
		vrTechnicalSpec_XCGImpl.setXCG01919(vrTechnicalSpec_XCG.getXCG01919());
		vrTechnicalSpec_XCGImpl.setXCG01569(vrTechnicalSpec_XCG.getXCG01569());
		vrTechnicalSpec_XCGImpl.setXCG01570(vrTechnicalSpec_XCG.getXCG01570());
		vrTechnicalSpec_XCGImpl.setXCG01571(vrTechnicalSpec_XCG.getXCG01571());
		vrTechnicalSpec_XCGImpl.setXCG01572(vrTechnicalSpec_XCG.getXCG01572());
		vrTechnicalSpec_XCGImpl.setXCG01920(vrTechnicalSpec_XCG.getXCG01920());
		vrTechnicalSpec_XCGImpl.setXCG01573(vrTechnicalSpec_XCG.getXCG01573());
		vrTechnicalSpec_XCGImpl.setXCG01921(vrTechnicalSpec_XCG.getXCG01921());
		vrTechnicalSpec_XCGImpl.setXCG01574(vrTechnicalSpec_XCG.getXCG01574());
		vrTechnicalSpec_XCGImpl.setXCG01922(vrTechnicalSpec_XCG.getXCG01922());
		vrTechnicalSpec_XCGImpl.setXCG01575(vrTechnicalSpec_XCG.getXCG01575());
		vrTechnicalSpec_XCGImpl.setXCG01576(vrTechnicalSpec_XCG.getXCG01576());
		vrTechnicalSpec_XCGImpl.setXCG01577(vrTechnicalSpec_XCG.getXCG01577());
		vrTechnicalSpec_XCGImpl.setXCG01578(vrTechnicalSpec_XCG.getXCG01578());
		vrTechnicalSpec_XCGImpl.setXCG01579(vrTechnicalSpec_XCG.getXCG01579());
		vrTechnicalSpec_XCGImpl.setXCG01580(vrTechnicalSpec_XCG.getXCG01580());
		vrTechnicalSpec_XCGImpl.setXCG01581(vrTechnicalSpec_XCG.getXCG01581());
		vrTechnicalSpec_XCGImpl.setXCG01582(vrTechnicalSpec_XCG.getXCG01582());
		vrTechnicalSpec_XCGImpl.setXCG01583(vrTechnicalSpec_XCG.getXCG01583());
		vrTechnicalSpec_XCGImpl.setXCG01584(vrTechnicalSpec_XCG.getXCG01584());
		vrTechnicalSpec_XCGImpl.setXCG01585(vrTechnicalSpec_XCG.getXCG01585());
		vrTechnicalSpec_XCGImpl.setXCG01586(vrTechnicalSpec_XCG.getXCG01586());
		vrTechnicalSpec_XCGImpl.setXCG01587(vrTechnicalSpec_XCG.getXCG01587());
		vrTechnicalSpec_XCGImpl.setXCG01588(vrTechnicalSpec_XCG.getXCG01588());
		vrTechnicalSpec_XCGImpl.setXCG01589(vrTechnicalSpec_XCG.getXCG01589());
		vrTechnicalSpec_XCGImpl.setXCG01590(vrTechnicalSpec_XCG.getXCG01590());
		vrTechnicalSpec_XCGImpl.setXCG01591(vrTechnicalSpec_XCG.getXCG01591());
		vrTechnicalSpec_XCGImpl.setXCG01592(vrTechnicalSpec_XCG.getXCG01592());
		vrTechnicalSpec_XCGImpl.setXCG01593(vrTechnicalSpec_XCG.getXCG01593());
		vrTechnicalSpec_XCGImpl.setXCG01594(vrTechnicalSpec_XCG.getXCG01594());
		vrTechnicalSpec_XCGImpl.setXCG01595(vrTechnicalSpec_XCG.getXCG01595());
		vrTechnicalSpec_XCGImpl.setXCG01596(vrTechnicalSpec_XCG.getXCG01596());
		vrTechnicalSpec_XCGImpl.setXCG01597(vrTechnicalSpec_XCG.getXCG01597());
		vrTechnicalSpec_XCGImpl.setXCG01598(vrTechnicalSpec_XCG.getXCG01598());
		vrTechnicalSpec_XCGImpl.setXCG01599(vrTechnicalSpec_XCG.getXCG01599());
		vrTechnicalSpec_XCGImpl.setXCG01600(vrTechnicalSpec_XCG.getXCG01600());
		vrTechnicalSpec_XCGImpl.setXCG01601(vrTechnicalSpec_XCG.getXCG01601());
		vrTechnicalSpec_XCGImpl.setXCG01602(vrTechnicalSpec_XCG.getXCG01602());
		vrTechnicalSpec_XCGImpl.setXCG01603(vrTechnicalSpec_XCG.getXCG01603());
		vrTechnicalSpec_XCGImpl.setXCG01923(vrTechnicalSpec_XCG.getXCG01923());
		vrTechnicalSpec_XCGImpl.setXCG01604(vrTechnicalSpec_XCG.getXCG01604());
		vrTechnicalSpec_XCGImpl.setXCG01924(vrTechnicalSpec_XCG.getXCG01924());
		vrTechnicalSpec_XCGImpl.setXCG01605(vrTechnicalSpec_XCG.getXCG01605());
		vrTechnicalSpec_XCGImpl.setXCG01606(vrTechnicalSpec_XCG.getXCG01606());
		vrTechnicalSpec_XCGImpl.setXCG01607(vrTechnicalSpec_XCG.getXCG01607());
		vrTechnicalSpec_XCGImpl.setXCG01608(vrTechnicalSpec_XCG.getXCG01608());
		vrTechnicalSpec_XCGImpl.setXCG01609(vrTechnicalSpec_XCG.getXCG01609());
		vrTechnicalSpec_XCGImpl.setXCG01925(vrTechnicalSpec_XCG.getXCG01925());
		vrTechnicalSpec_XCGImpl.setXCG01610(vrTechnicalSpec_XCG.getXCG01610());
		vrTechnicalSpec_XCGImpl.setXCG01926(vrTechnicalSpec_XCG.getXCG01926());
		vrTechnicalSpec_XCGImpl.setXCG01611(vrTechnicalSpec_XCG.getXCG01611());
		vrTechnicalSpec_XCGImpl.setXCG01612(vrTechnicalSpec_XCG.getXCG01612());
		vrTechnicalSpec_XCGImpl.setXCG01928(vrTechnicalSpec_XCG.getXCG01928());
		vrTechnicalSpec_XCGImpl.setXCG01613(vrTechnicalSpec_XCG.getXCG01613());
		vrTechnicalSpec_XCGImpl.setXCG01929(vrTechnicalSpec_XCG.getXCG01929());
		vrTechnicalSpec_XCGImpl.setXCG01614(vrTechnicalSpec_XCG.getXCG01614());
		vrTechnicalSpec_XCGImpl.setXCG01930(vrTechnicalSpec_XCG.getXCG01930());
		vrTechnicalSpec_XCGImpl.setXCG01615(vrTechnicalSpec_XCG.getXCG01615());
		vrTechnicalSpec_XCGImpl.setXCG01931(vrTechnicalSpec_XCG.getXCG01931());
		vrTechnicalSpec_XCGImpl.setXCG01616(vrTechnicalSpec_XCG.getXCG01616());
		vrTechnicalSpec_XCGImpl.setXCG01932(vrTechnicalSpec_XCG.getXCG01932());
		vrTechnicalSpec_XCGImpl.setXCG01617(vrTechnicalSpec_XCG.getXCG01617());
		vrTechnicalSpec_XCGImpl.setXCG01933(vrTechnicalSpec_XCG.getXCG01933());
		vrTechnicalSpec_XCGImpl.setXCG01618(vrTechnicalSpec_XCG.getXCG01618());
		vrTechnicalSpec_XCGImpl.setXCG01934(vrTechnicalSpec_XCG.getXCG01934());
		vrTechnicalSpec_XCGImpl.setXCG01619(vrTechnicalSpec_XCG.getXCG01619());
		vrTechnicalSpec_XCGImpl.setXCG01935(vrTechnicalSpec_XCG.getXCG01935());
		vrTechnicalSpec_XCGImpl.setXCG01620(vrTechnicalSpec_XCG.getXCG01620());
		vrTechnicalSpec_XCGImpl.setXCG01936(vrTechnicalSpec_XCG.getXCG01936());
		vrTechnicalSpec_XCGImpl.setXCG01621(vrTechnicalSpec_XCG.getXCG01621());
		vrTechnicalSpec_XCGImpl.setXCG01937(vrTechnicalSpec_XCG.getXCG01937());
		vrTechnicalSpec_XCGImpl.setXCG01622(vrTechnicalSpec_XCG.getXCG01622());
		vrTechnicalSpec_XCGImpl.setXCG01938(vrTechnicalSpec_XCG.getXCG01938());
		vrTechnicalSpec_XCGImpl.setXCG01623(vrTechnicalSpec_XCG.getXCG01623());
		vrTechnicalSpec_XCGImpl.setXCG01939(vrTechnicalSpec_XCG.getXCG01939());
		vrTechnicalSpec_XCGImpl.setXCG01624(vrTechnicalSpec_XCG.getXCG01624());
		vrTechnicalSpec_XCGImpl.setXCG01940(vrTechnicalSpec_XCG.getXCG01940());
		vrTechnicalSpec_XCGImpl.setXCG01625(vrTechnicalSpec_XCG.getXCG01625());
		vrTechnicalSpec_XCGImpl.setXCG01941(vrTechnicalSpec_XCG.getXCG01941());
		vrTechnicalSpec_XCGImpl.setXCG01626(vrTechnicalSpec_XCG.getXCG01626());
		vrTechnicalSpec_XCGImpl.setXCG01942(vrTechnicalSpec_XCG.getXCG01942());
		vrTechnicalSpec_XCGImpl.setXCG01627(vrTechnicalSpec_XCG.getXCG01627());
		vrTechnicalSpec_XCGImpl.setXCG01943(vrTechnicalSpec_XCG.getXCG01943());
		vrTechnicalSpec_XCGImpl.setXCG01628(vrTechnicalSpec_XCG.getXCG01628());
		vrTechnicalSpec_XCGImpl.setXCG01944(vrTechnicalSpec_XCG.getXCG01944());
		vrTechnicalSpec_XCGImpl.setXCG01630(vrTechnicalSpec_XCG.getXCG01630());
		vrTechnicalSpec_XCGImpl.setXCG01631(vrTechnicalSpec_XCG.getXCG01631());
		vrTechnicalSpec_XCGImpl.setXCG01632(vrTechnicalSpec_XCG.getXCG01632());
		vrTechnicalSpec_XCGImpl.setXCG01633(vrTechnicalSpec_XCG.getXCG01633());
		vrTechnicalSpec_XCGImpl.setXCG01634(vrTechnicalSpec_XCG.getXCG01634());
		vrTechnicalSpec_XCGImpl.setXCG01635(vrTechnicalSpec_XCG.getXCG01635());
		vrTechnicalSpec_XCGImpl.setXCG01636(vrTechnicalSpec_XCG.getXCG01636());
		vrTechnicalSpec_XCGImpl.setXCG01637(vrTechnicalSpec_XCG.getXCG01637());
		vrTechnicalSpec_XCGImpl.setXCG01638(vrTechnicalSpec_XCG.getXCG01638());
		vrTechnicalSpec_XCGImpl.setXCG01639(vrTechnicalSpec_XCG.getXCG01639());
		vrTechnicalSpec_XCGImpl.setXCG01640(vrTechnicalSpec_XCG.getXCG01640());
		vrTechnicalSpec_XCGImpl.setXCG01641(vrTechnicalSpec_XCG.getXCG01641());
		vrTechnicalSpec_XCGImpl.setXCG01642(vrTechnicalSpec_XCG.getXCG01642());
		vrTechnicalSpec_XCGImpl.setXCG01643(vrTechnicalSpec_XCG.getXCG01643());
		vrTechnicalSpec_XCGImpl.setXCG01644(vrTechnicalSpec_XCG.getXCG01644());
		vrTechnicalSpec_XCGImpl.setXCG01645(vrTechnicalSpec_XCG.getXCG01645());
		vrTechnicalSpec_XCGImpl.setXCG01646(vrTechnicalSpec_XCG.getXCG01646());
		vrTechnicalSpec_XCGImpl.setXCG01647(vrTechnicalSpec_XCG.getXCG01647());
		vrTechnicalSpec_XCGImpl.setXCG01648(vrTechnicalSpec_XCG.getXCG01648());
		vrTechnicalSpec_XCGImpl.setXCG01649(vrTechnicalSpec_XCG.getXCG01649());
		vrTechnicalSpec_XCGImpl.setXCG01650(vrTechnicalSpec_XCG.getXCG01650());
		vrTechnicalSpec_XCGImpl.setXCG01651(vrTechnicalSpec_XCG.getXCG01651());
		vrTechnicalSpec_XCGImpl.setXCG01652(vrTechnicalSpec_XCG.getXCG01652());
		vrTechnicalSpec_XCGImpl.setXCG01653(vrTechnicalSpec_XCG.getXCG01653());
		vrTechnicalSpec_XCGImpl.setXCG01654(vrTechnicalSpec_XCG.getXCG01654());
		vrTechnicalSpec_XCGImpl.setXCG01655(vrTechnicalSpec_XCG.getXCG01655());
		vrTechnicalSpec_XCGImpl.setXCG01656(vrTechnicalSpec_XCG.getXCG01656());
		vrTechnicalSpec_XCGImpl.setXCG01657(vrTechnicalSpec_XCG.getXCG01657());
		vrTechnicalSpec_XCGImpl.setXCG01658(vrTechnicalSpec_XCG.getXCG01658());
		vrTechnicalSpec_XCGImpl.setXCG01659(vrTechnicalSpec_XCG.getXCG01659());
		vrTechnicalSpec_XCGImpl.setXCG01660(vrTechnicalSpec_XCG.getXCG01660());
		vrTechnicalSpec_XCGImpl.setXCG01661(vrTechnicalSpec_XCG.getXCG01661());
		vrTechnicalSpec_XCGImpl.setXCG01662(vrTechnicalSpec_XCG.getXCG01662());
		vrTechnicalSpec_XCGImpl.setXCG01663(vrTechnicalSpec_XCG.getXCG01663());
		vrTechnicalSpec_XCGImpl.setXCG01664(vrTechnicalSpec_XCG.getXCG01664());
		vrTechnicalSpec_XCGImpl.setXCG01665(vrTechnicalSpec_XCG.getXCG01665());
		vrTechnicalSpec_XCGImpl.setXCG01666(vrTechnicalSpec_XCG.getXCG01666());
		vrTechnicalSpec_XCGImpl.setXCG01667(vrTechnicalSpec_XCG.getXCG01667());
		vrTechnicalSpec_XCGImpl.setXCG01668(vrTechnicalSpec_XCG.getXCG01668());
		vrTechnicalSpec_XCGImpl.setXCG01669(vrTechnicalSpec_XCG.getXCG01669());
		vrTechnicalSpec_XCGImpl.setXCG01670(vrTechnicalSpec_XCG.getXCG01670());
		vrTechnicalSpec_XCGImpl.setXCG01671(vrTechnicalSpec_XCG.getXCG01671());
		vrTechnicalSpec_XCGImpl.setXCG01672(vrTechnicalSpec_XCG.getXCG01672());
		vrTechnicalSpec_XCGImpl.setXCG01673(vrTechnicalSpec_XCG.getXCG01673());
		vrTechnicalSpec_XCGImpl.setXCG01674(vrTechnicalSpec_XCG.getXCG01674());
		vrTechnicalSpec_XCGImpl.setXCG01675(vrTechnicalSpec_XCG.getXCG01675());
		vrTechnicalSpec_XCGImpl.setXCG01676(vrTechnicalSpec_XCG.getXCG01676());
		vrTechnicalSpec_XCGImpl.setXCG01677(vrTechnicalSpec_XCG.getXCG01677());
		vrTechnicalSpec_XCGImpl.setXCG01678(vrTechnicalSpec_XCG.getXCG01678());
		vrTechnicalSpec_XCGImpl.setXCG01679(vrTechnicalSpec_XCG.getXCG01679());
		vrTechnicalSpec_XCGImpl.setXCG01680(vrTechnicalSpec_XCG.getXCG01680());
		vrTechnicalSpec_XCGImpl.setXCG01681(vrTechnicalSpec_XCG.getXCG01681());
		vrTechnicalSpec_XCGImpl.setXCG01682(vrTechnicalSpec_XCG.getXCG01682());
		vrTechnicalSpec_XCGImpl.setXCG01683(vrTechnicalSpec_XCG.getXCG01683());
		vrTechnicalSpec_XCGImpl.setXCG01684(vrTechnicalSpec_XCG.getXCG01684());
		vrTechnicalSpec_XCGImpl.setXCG01685(vrTechnicalSpec_XCG.getXCG01685());
		vrTechnicalSpec_XCGImpl.setXCG01686(vrTechnicalSpec_XCG.getXCG01686());
		vrTechnicalSpec_XCGImpl.setXCG01687(vrTechnicalSpec_XCG.getXCG01687());
		vrTechnicalSpec_XCGImpl.setXCG01688(vrTechnicalSpec_XCG.getXCG01688());
		vrTechnicalSpec_XCGImpl.setXCG01689(vrTechnicalSpec_XCG.getXCG01689());
		vrTechnicalSpec_XCGImpl.setXCG01690(vrTechnicalSpec_XCG.getXCG01690());
		vrTechnicalSpec_XCGImpl.setXCG01691(vrTechnicalSpec_XCG.getXCG01691());
		vrTechnicalSpec_XCGImpl.setXCG01692(vrTechnicalSpec_XCG.getXCG01692());
		vrTechnicalSpec_XCGImpl.setXCG01693(vrTechnicalSpec_XCG.getXCG01693());
		vrTechnicalSpec_XCGImpl.setXCG01694(vrTechnicalSpec_XCG.getXCG01694());
		vrTechnicalSpec_XCGImpl.setXCG01695(vrTechnicalSpec_XCG.getXCG01695());
		vrTechnicalSpec_XCGImpl.setXCG01696(vrTechnicalSpec_XCG.getXCG01696());
		vrTechnicalSpec_XCGImpl.setXCG01697(vrTechnicalSpec_XCG.getXCG01697());
		vrTechnicalSpec_XCGImpl.setXCG01698(vrTechnicalSpec_XCG.getXCG01698());
		vrTechnicalSpec_XCGImpl.setXCG01699(vrTechnicalSpec_XCG.getXCG01699());
		vrTechnicalSpec_XCGImpl.setXCG01700(vrTechnicalSpec_XCG.getXCG01700());
		vrTechnicalSpec_XCGImpl.setXCG01701(vrTechnicalSpec_XCG.getXCG01701());
		vrTechnicalSpec_XCGImpl.setXCG01702(vrTechnicalSpec_XCG.getXCG01702());
		vrTechnicalSpec_XCGImpl.setXCG01703(vrTechnicalSpec_XCG.getXCG01703());
		vrTechnicalSpec_XCGImpl.setXCG01704(vrTechnicalSpec_XCG.getXCG01704());
		vrTechnicalSpec_XCGImpl.setXCG01705(vrTechnicalSpec_XCG.getXCG01705());
		vrTechnicalSpec_XCGImpl.setXCG01706(vrTechnicalSpec_XCG.getXCG01706());
		vrTechnicalSpec_XCGImpl.setXCG01707(vrTechnicalSpec_XCG.getXCG01707());
		vrTechnicalSpec_XCGImpl.setXCG01708(vrTechnicalSpec_XCG.getXCG01708());
		vrTechnicalSpec_XCGImpl.setXCG01709(vrTechnicalSpec_XCG.getXCG01709());
		vrTechnicalSpec_XCGImpl.setXCG01710(vrTechnicalSpec_XCG.getXCG01710());
		vrTechnicalSpec_XCGImpl.setXCG01711(vrTechnicalSpec_XCG.getXCG01711());
		vrTechnicalSpec_XCGImpl.setXCG01712(vrTechnicalSpec_XCG.getXCG01712());
		vrTechnicalSpec_XCGImpl.setXCG01713(vrTechnicalSpec_XCG.getXCG01713());
		vrTechnicalSpec_XCGImpl.setXCG01714(vrTechnicalSpec_XCG.getXCG01714());
		vrTechnicalSpec_XCGImpl.setXCG01715(vrTechnicalSpec_XCG.getXCG01715());
		vrTechnicalSpec_XCGImpl.setXCG01716(vrTechnicalSpec_XCG.getXCG01716());
		vrTechnicalSpec_XCGImpl.setXCG01717(vrTechnicalSpec_XCG.getXCG01717());
		vrTechnicalSpec_XCGImpl.setXCG01718(vrTechnicalSpec_XCG.getXCG01718());
		vrTechnicalSpec_XCGImpl.setXCG01719(vrTechnicalSpec_XCG.getXCG01719());
		vrTechnicalSpec_XCGImpl.setXCG01720(vrTechnicalSpec_XCG.getXCG01720());
		vrTechnicalSpec_XCGImpl.setXCG01721(vrTechnicalSpec_XCG.getXCG01721());
		vrTechnicalSpec_XCGImpl.setXCG01722(vrTechnicalSpec_XCG.getXCG01722());
		vrTechnicalSpec_XCGImpl.setXCG01723(vrTechnicalSpec_XCG.getXCG01723());
		vrTechnicalSpec_XCGImpl.setXCG01724(vrTechnicalSpec_XCG.getXCG01724());
		vrTechnicalSpec_XCGImpl.setXCG01725(vrTechnicalSpec_XCG.getXCG01725());
		vrTechnicalSpec_XCGImpl.setXCG01726(vrTechnicalSpec_XCG.getXCG01726());
		vrTechnicalSpec_XCGImpl.setXCG01727(vrTechnicalSpec_XCG.getXCG01727());
		vrTechnicalSpec_XCGImpl.setXCG01728(vrTechnicalSpec_XCG.getXCG01728());
		vrTechnicalSpec_XCGImpl.setXCG01729(vrTechnicalSpec_XCG.getXCG01729());
		vrTechnicalSpec_XCGImpl.setXCG01730(vrTechnicalSpec_XCG.getXCG01730());
		vrTechnicalSpec_XCGImpl.setXCG01731(vrTechnicalSpec_XCG.getXCG01731());
		vrTechnicalSpec_XCGImpl.setXCG01732(vrTechnicalSpec_XCG.getXCG01732());
		vrTechnicalSpec_XCGImpl.setXCG01733(vrTechnicalSpec_XCG.getXCG01733());
		vrTechnicalSpec_XCGImpl.setXCG01734(vrTechnicalSpec_XCG.getXCG01734());
		vrTechnicalSpec_XCGImpl.setXCG01735(vrTechnicalSpec_XCG.getXCG01735());
		vrTechnicalSpec_XCGImpl.setXCG01736(vrTechnicalSpec_XCG.getXCG01736());
		vrTechnicalSpec_XCGImpl.setXCG01737(vrTechnicalSpec_XCG.getXCG01737());
		vrTechnicalSpec_XCGImpl.setXCG01738(vrTechnicalSpec_XCG.getXCG01738());
		vrTechnicalSpec_XCGImpl.setXCG01739(vrTechnicalSpec_XCG.getXCG01739());
		vrTechnicalSpec_XCGImpl.setXCG01740(vrTechnicalSpec_XCG.getXCG01740());
		vrTechnicalSpec_XCGImpl.setXCG01741(vrTechnicalSpec_XCG.getXCG01741());
		vrTechnicalSpec_XCGImpl.setXCG01742(vrTechnicalSpec_XCG.getXCG01742());
		vrTechnicalSpec_XCGImpl.setXCG01744(vrTechnicalSpec_XCG.getXCG01744());
		vrTechnicalSpec_XCGImpl.setXCG01745(vrTechnicalSpec_XCG.getXCG01745());
		vrTechnicalSpec_XCGImpl.setXCG01746(vrTechnicalSpec_XCG.getXCG01746());
		vrTechnicalSpec_XCGImpl.setXCG01747(vrTechnicalSpec_XCG.getXCG01747());
		vrTechnicalSpec_XCGImpl.setXCG01748(vrTechnicalSpec_XCG.getXCG01748());
		vrTechnicalSpec_XCGImpl.setXCG01749(vrTechnicalSpec_XCG.getXCG01749());
		vrTechnicalSpec_XCGImpl.setXCG01945(vrTechnicalSpec_XCG.getXCG01945());
		vrTechnicalSpec_XCGImpl.setXCG01750(vrTechnicalSpec_XCG.getXCG01750());
		vrTechnicalSpec_XCGImpl.setXCG01946(vrTechnicalSpec_XCG.getXCG01946());
		vrTechnicalSpec_XCGImpl.setXCG01751(vrTechnicalSpec_XCG.getXCG01751());
		vrTechnicalSpec_XCGImpl.setXCG01752(vrTechnicalSpec_XCG.getXCG01752());
		vrTechnicalSpec_XCGImpl.setXCG01753(vrTechnicalSpec_XCG.getXCG01753());
		vrTechnicalSpec_XCGImpl.setXCG01754(vrTechnicalSpec_XCG.getXCG01754());
		vrTechnicalSpec_XCGImpl.setXCG01756(vrTechnicalSpec_XCG.getXCG01756());
		vrTechnicalSpec_XCGImpl.setXCG01757(vrTechnicalSpec_XCG.getXCG01757());
		vrTechnicalSpec_XCGImpl.setXCG01758(vrTechnicalSpec_XCG.getXCG01758());
		vrTechnicalSpec_XCGImpl.setXCG01759(vrTechnicalSpec_XCG.getXCG01759());
		vrTechnicalSpec_XCGImpl.setXCG01948(vrTechnicalSpec_XCG.getXCG01948());
		vrTechnicalSpec_XCGImpl.setXCG01760(vrTechnicalSpec_XCG.getXCG01760());
		vrTechnicalSpec_XCGImpl.setXCG01949(vrTechnicalSpec_XCG.getXCG01949());
		vrTechnicalSpec_XCGImpl.setXCG01761(vrTechnicalSpec_XCG.getXCG01761());
		vrTechnicalSpec_XCGImpl.setXCG01950(vrTechnicalSpec_XCG.getXCG01950());
		vrTechnicalSpec_XCGImpl.setXCG01762(vrTechnicalSpec_XCG.getXCG01762());
		vrTechnicalSpec_XCGImpl.setXCG01951(vrTechnicalSpec_XCG.getXCG01951());
		vrTechnicalSpec_XCGImpl.setXCG01763(vrTechnicalSpec_XCG.getXCG01763());
		vrTechnicalSpec_XCGImpl.setXCG01952(vrTechnicalSpec_XCG.getXCG01952());
		vrTechnicalSpec_XCGImpl.setXCG01764(vrTechnicalSpec_XCG.getXCG01764());
		vrTechnicalSpec_XCGImpl.setXCG01953(vrTechnicalSpec_XCG.getXCG01953());
		vrTechnicalSpec_XCGImpl.setXCG01765(vrTechnicalSpec_XCG.getXCG01765());
		vrTechnicalSpec_XCGImpl.setXCG01954(vrTechnicalSpec_XCG.getXCG01954());
		vrTechnicalSpec_XCGImpl.setXCG01766(vrTechnicalSpec_XCG.getXCG01766());
		vrTechnicalSpec_XCGImpl.setXCG01955(vrTechnicalSpec_XCG.getXCG01955());
		vrTechnicalSpec_XCGImpl.setXCG01767(vrTechnicalSpec_XCG.getXCG01767());
		vrTechnicalSpec_XCGImpl.setXCG01956(vrTechnicalSpec_XCG.getXCG01956());
		vrTechnicalSpec_XCGImpl.setXCG01768(vrTechnicalSpec_XCG.getXCG01768());
		vrTechnicalSpec_XCGImpl.setXCG01957(vrTechnicalSpec_XCG.getXCG01957());
		vrTechnicalSpec_XCGImpl.setXCG01769(vrTechnicalSpec_XCG.getXCG01769());
		vrTechnicalSpec_XCGImpl.setXCG01958(vrTechnicalSpec_XCG.getXCG01958());
		vrTechnicalSpec_XCGImpl.setXCG01770(vrTechnicalSpec_XCG.getXCG01770());
		vrTechnicalSpec_XCGImpl.setXCG01771(vrTechnicalSpec_XCG.getXCG01771());
		vrTechnicalSpec_XCGImpl.setXCG01959(vrTechnicalSpec_XCG.getXCG01959());
		vrTechnicalSpec_XCGImpl.setXCG01772(vrTechnicalSpec_XCG.getXCG01772());
		vrTechnicalSpec_XCGImpl.setXCG01773(vrTechnicalSpec_XCG.getXCG01773());
		vrTechnicalSpec_XCGImpl.setXCG01774(vrTechnicalSpec_XCG.getXCG01774());
		vrTechnicalSpec_XCGImpl.setXCG01775(vrTechnicalSpec_XCG.getXCG01775());
		vrTechnicalSpec_XCGImpl.setXCG01776(vrTechnicalSpec_XCG.getXCG01776());
		vrTechnicalSpec_XCGImpl.setXCG01777(vrTechnicalSpec_XCG.getXCG01777());
		vrTechnicalSpec_XCGImpl.setXCG01778(vrTechnicalSpec_XCG.getXCG01778());
		vrTechnicalSpec_XCGImpl.setXCG01779(vrTechnicalSpec_XCG.getXCG01779());
		vrTechnicalSpec_XCGImpl.setXCG01780(vrTechnicalSpec_XCG.getXCG01780());
		vrTechnicalSpec_XCGImpl.setXCG01781(vrTechnicalSpec_XCG.getXCG01781());
		vrTechnicalSpec_XCGImpl.setXCG01783(vrTechnicalSpec_XCG.getXCG01783());
		vrTechnicalSpec_XCGImpl.setXCG01785(vrTechnicalSpec_XCG.getXCG01785());
		vrTechnicalSpec_XCGImpl.setXCG01786(vrTechnicalSpec_XCG.getXCG01786());
		vrTechnicalSpec_XCGImpl.setXCG01787(vrTechnicalSpec_XCG.getXCG01787());
		vrTechnicalSpec_XCGImpl.setXCG01788(vrTechnicalSpec_XCG.getXCG01788());
		vrTechnicalSpec_XCGImpl.setXCG01789(vrTechnicalSpec_XCG.getXCG01789());
		vrTechnicalSpec_XCGImpl.setXCG01790(vrTechnicalSpec_XCG.getXCG01790());
		vrTechnicalSpec_XCGImpl.setXCG01791(vrTechnicalSpec_XCG.getXCG01791());
		vrTechnicalSpec_XCGImpl.setXCG01792(vrTechnicalSpec_XCG.getXCG01792());
		vrTechnicalSpec_XCGImpl.setXCG01793(vrTechnicalSpec_XCG.getXCG01793());
		vrTechnicalSpec_XCGImpl.setXCG01794(vrTechnicalSpec_XCG.getXCG01794());
		vrTechnicalSpec_XCGImpl.setXCG01795(vrTechnicalSpec_XCG.getXCG01795());
		vrTechnicalSpec_XCGImpl.setXCG01796(vrTechnicalSpec_XCG.getXCG01796());
		vrTechnicalSpec_XCGImpl.setXCG01797(vrTechnicalSpec_XCG.getXCG01797());
		vrTechnicalSpec_XCGImpl.setXCG01798(vrTechnicalSpec_XCG.getXCG01798());
		vrTechnicalSpec_XCGImpl.setXCG01799(vrTechnicalSpec_XCG.getXCG01799());
		vrTechnicalSpec_XCGImpl.setXCG01801(vrTechnicalSpec_XCG.getXCG01801());
		vrTechnicalSpec_XCGImpl.setXCG01802(vrTechnicalSpec_XCG.getXCG01802());
		vrTechnicalSpec_XCGImpl.setXCG01803(vrTechnicalSpec_XCG.getXCG01803());
		vrTechnicalSpec_XCGImpl.setXCG01804(vrTechnicalSpec_XCG.getXCG01804());
		vrTechnicalSpec_XCGImpl.setXCG01805(vrTechnicalSpec_XCG.getXCG01805());
		vrTechnicalSpec_XCGImpl.setXCG01806(vrTechnicalSpec_XCG.getXCG01806());
		vrTechnicalSpec_XCGImpl.setXCG01807(vrTechnicalSpec_XCG.getXCG01807());
		vrTechnicalSpec_XCGImpl.setXCG01808(vrTechnicalSpec_XCG.getXCG01808());
		vrTechnicalSpec_XCGImpl.setXCG01809(vrTechnicalSpec_XCG.getXCG01809());
		vrTechnicalSpec_XCGImpl.setXCG01810(vrTechnicalSpec_XCG.getXCG01810());
		vrTechnicalSpec_XCGImpl.setXCG01811(vrTechnicalSpec_XCG.getXCG01811());
		vrTechnicalSpec_XCGImpl.setXCG01812(vrTechnicalSpec_XCG.getXCG01812());
		vrTechnicalSpec_XCGImpl.setXCG01813(vrTechnicalSpec_XCG.getXCG01813());
		vrTechnicalSpec_XCGImpl.setXCG01814(vrTechnicalSpec_XCG.getXCG01814());
		vrTechnicalSpec_XCGImpl.setTDTKXCG001(vrTechnicalSpec_XCG.getTDTKXCG001());
		vrTechnicalSpec_XCGImpl.setTDTKXCG002(vrTechnicalSpec_XCG.getTDTKXCG002());
		vrTechnicalSpec_XCGImpl.setTDTKXCG003(vrTechnicalSpec_XCG.getTDTKXCG003());
		vrTechnicalSpec_XCGImpl.setTDTKXCG004(vrTechnicalSpec_XCG.getTDTKXCG004());
		vrTechnicalSpec_XCGImpl.setTDTKXCG005(vrTechnicalSpec_XCG.getTDTKXCG005());
		vrTechnicalSpec_XCGImpl.setTDTKXCG006(vrTechnicalSpec_XCG.getTDTKXCG006());
		vrTechnicalSpec_XCGImpl.setTDTKXCG007(vrTechnicalSpec_XCG.getTDTKXCG007());
		vrTechnicalSpec_XCGImpl.setTDTKXCG008(vrTechnicalSpec_XCG.getTDTKXCG008());
		vrTechnicalSpec_XCGImpl.setTDTKXCG009(vrTechnicalSpec_XCG.getTDTKXCG009());
		vrTechnicalSpec_XCGImpl.setTDTKXCG010(vrTechnicalSpec_XCG.getTDTKXCG010());
		vrTechnicalSpec_XCGImpl.setTDTKXCG011(vrTechnicalSpec_XCG.getTDTKXCG011());
		vrTechnicalSpec_XCGImpl.setTDTKXCG012(vrTechnicalSpec_XCG.getTDTKXCG012());
		vrTechnicalSpec_XCGImpl.setTDTKXCG013(vrTechnicalSpec_XCG.getTDTKXCG013());
		vrTechnicalSpec_XCGImpl.setTDTKXCG014(vrTechnicalSpec_XCG.getTDTKXCG014());
		vrTechnicalSpec_XCGImpl.setTDTKXCG015(vrTechnicalSpec_XCG.getTDTKXCG015());
		vrTechnicalSpec_XCGImpl.setTDTKXCG016(vrTechnicalSpec_XCG.getTDTKXCG016());
		vrTechnicalSpec_XCGImpl.setTDTKXCG017(vrTechnicalSpec_XCG.getTDTKXCG017());
		vrTechnicalSpec_XCGImpl.setTDTKXCG018(vrTechnicalSpec_XCG.getTDTKXCG018());
		vrTechnicalSpec_XCGImpl.setTDTKXCG019(vrTechnicalSpec_XCG.getTDTKXCG019());
		vrTechnicalSpec_XCGImpl.setTDTKXCG020(vrTechnicalSpec_XCG.getTDTKXCG020());
		vrTechnicalSpec_XCGImpl.setTDTKXCG021(vrTechnicalSpec_XCG.getTDTKXCG021());
		vrTechnicalSpec_XCGImpl.setTDTKXCG022(vrTechnicalSpec_XCG.getTDTKXCG022());
		vrTechnicalSpec_XCGImpl.setTDTKXCG023(vrTechnicalSpec_XCG.getTDTKXCG023());
		vrTechnicalSpec_XCGImpl.setTDTKXCG024(vrTechnicalSpec_XCG.getTDTKXCG024());
		vrTechnicalSpec_XCGImpl.setTDTKXCG025(vrTechnicalSpec_XCG.getTDTKXCG025());
		vrTechnicalSpec_XCGImpl.setTDTKXCG026(vrTechnicalSpec_XCG.getTDTKXCG026());
		vrTechnicalSpec_XCGImpl.setTDTKXCG027(vrTechnicalSpec_XCG.getTDTKXCG027());
		vrTechnicalSpec_XCGImpl.setTDTKXCG028(vrTechnicalSpec_XCG.getTDTKXCG028());
		vrTechnicalSpec_XCGImpl.setTDTKXCG029(vrTechnicalSpec_XCG.getTDTKXCG029());
		vrTechnicalSpec_XCGImpl.setTDTKXCG030(vrTechnicalSpec_XCG.getTDTKXCG030());
		vrTechnicalSpec_XCGImpl.setTDTKXCG031(vrTechnicalSpec_XCG.getTDTKXCG031());
		vrTechnicalSpec_XCGImpl.setTDTKXCG032(vrTechnicalSpec_XCG.getTDTKXCG032());
		vrTechnicalSpec_XCGImpl.setTDTKXCG033(vrTechnicalSpec_XCG.getTDTKXCG033());
		vrTechnicalSpec_XCGImpl.setTDTKXCG034(vrTechnicalSpec_XCG.getTDTKXCG034());
		vrTechnicalSpec_XCGImpl.setTDTKXCG035(vrTechnicalSpec_XCG.getTDTKXCG035());
		vrTechnicalSpec_XCGImpl.setTDTKXCG036(vrTechnicalSpec_XCG.getTDTKXCG036());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG01(vrTechnicalSpec_XCG.getBBCNCLKLXCG01());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG02(vrTechnicalSpec_XCG.getBBCNCLKLXCG02());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG03(vrTechnicalSpec_XCG.getBBCNCLKLXCG03());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG04(vrTechnicalSpec_XCG.getBBCNCLKLXCG04());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG05(vrTechnicalSpec_XCG.getBBCNCLKLXCG05());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG06(vrTechnicalSpec_XCG.getBBCNCLKLXCG06());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG07(vrTechnicalSpec_XCG.getBBCNCLKLXCG07());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG08(vrTechnicalSpec_XCG.getBBCNCLKLXCG08());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG09(vrTechnicalSpec_XCG.getBBCNCLKLXCG09());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG10(vrTechnicalSpec_XCG.getBBCNCLKLXCG10());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG11(vrTechnicalSpec_XCG.getBBCNCLKLXCG11());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG12(vrTechnicalSpec_XCG.getBBCNCLKLXCG12());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG13(vrTechnicalSpec_XCG.getBBCNCLKLXCG13());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG14(vrTechnicalSpec_XCG.getBBCNCLKLXCG14());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG15(vrTechnicalSpec_XCG.getBBCNCLKLXCG15());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG16(vrTechnicalSpec_XCG.getBBCNCLKLXCG16());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG17(vrTechnicalSpec_XCG.getBBCNCLKLXCG17());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG18(vrTechnicalSpec_XCG.getBBCNCLKLXCG18());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG19(vrTechnicalSpec_XCG.getBBCNCLKLXCG19());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG20(vrTechnicalSpec_XCG.getBBCNCLKLXCG20());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG21(vrTechnicalSpec_XCG.getBBCNCLKLXCG21());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG22(vrTechnicalSpec_XCG.getBBCNCLKLXCG22());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG23(vrTechnicalSpec_XCG.getBBCNCLKLXCG23());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG24(vrTechnicalSpec_XCG.getBBCNCLKLXCG24());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG26(vrTechnicalSpec_XCG.getBBCNCLKLXCG26());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG27(vrTechnicalSpec_XCG.getBBCNCLKLXCG27());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG28(vrTechnicalSpec_XCG.getBBCNCLKLXCG28());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG29(vrTechnicalSpec_XCG.getBBCNCLKLXCG29());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG30(vrTechnicalSpec_XCG.getBBCNCLKLXCG30());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG31(vrTechnicalSpec_XCG.getBBCNCLKLXCG31());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG33(vrTechnicalSpec_XCG.getBBCNCLKLXCG33());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG34(vrTechnicalSpec_XCG.getBBCNCLKLXCG34());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG35(vrTechnicalSpec_XCG.getBBCNCLKLXCG35());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG36(vrTechnicalSpec_XCG.getBBCNCLKLXCG36());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG38(vrTechnicalSpec_XCG.getBBCNCLKLXCG38());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG39(vrTechnicalSpec_XCG.getBBCNCLKLXCG39());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG40(vrTechnicalSpec_XCG.getBBCNCLKLXCG40());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG42(vrTechnicalSpec_XCG.getBBCNCLKLXCG42());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG43(vrTechnicalSpec_XCG.getBBCNCLKLXCG43());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG44(vrTechnicalSpec_XCG.getBBCNCLKLXCG44());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG45(vrTechnicalSpec_XCG.getBBCNCLKLXCG45());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG46(vrTechnicalSpec_XCG.getBBCNCLKLXCG46());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG47(vrTechnicalSpec_XCG.getBBCNCLKLXCG47());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG48(vrTechnicalSpec_XCG.getBBCNCLKLXCG48());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG49(vrTechnicalSpec_XCG.getBBCNCLKLXCG49());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG50(vrTechnicalSpec_XCG.getBBCNCLKLXCG50());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG51(vrTechnicalSpec_XCG.getBBCNCLKLXCG51());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG52(vrTechnicalSpec_XCG.getBBCNCLKLXCG52());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG53(vrTechnicalSpec_XCG.getBBCNCLKLXCG53());
		vrTechnicalSpec_XCGImpl.setBBCNCLKLXCG54(vrTechnicalSpec_XCG.getBBCNCLKLXCG54());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG001(vrTechnicalSpec_XCG.getBBKTSPMXCG001());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG002(vrTechnicalSpec_XCG.getBBKTSPMXCG002());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG003(vrTechnicalSpec_XCG.getBBKTSPMXCG003());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG004(vrTechnicalSpec_XCG.getBBKTSPMXCG004());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG005(vrTechnicalSpec_XCG.getBBKTSPMXCG005());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG006(vrTechnicalSpec_XCG.getBBKTSPMXCG006());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG007(vrTechnicalSpec_XCG.getBBKTSPMXCG007());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG008(vrTechnicalSpec_XCG.getBBKTSPMXCG008());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG009(vrTechnicalSpec_XCG.getBBKTSPMXCG009());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG010(vrTechnicalSpec_XCG.getBBKTSPMXCG010());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG011(vrTechnicalSpec_XCG.getBBKTSPMXCG011());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG012(vrTechnicalSpec_XCG.getBBKTSPMXCG012());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG013(vrTechnicalSpec_XCG.getBBKTSPMXCG013());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG014(vrTechnicalSpec_XCG.getBBKTSPMXCG014());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG015(vrTechnicalSpec_XCG.getBBKTSPMXCG015());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG016(vrTechnicalSpec_XCG.getBBKTSPMXCG016());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG017(vrTechnicalSpec_XCG.getBBKTSPMXCG017());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG018(vrTechnicalSpec_XCG.getBBKTSPMXCG018());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG019(vrTechnicalSpec_XCG.getBBKTSPMXCG019());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG020(vrTechnicalSpec_XCG.getBBKTSPMXCG020());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG021(vrTechnicalSpec_XCG.getBBKTSPMXCG021());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG022(vrTechnicalSpec_XCG.getBBKTSPMXCG022());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG023(vrTechnicalSpec_XCG.getBBKTSPMXCG023());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG024(vrTechnicalSpec_XCG.getBBKTSPMXCG024());
		vrTechnicalSpec_XCGImpl.setBBKTSPMXCG025(vrTechnicalSpec_XCG.getBBKTSPMXCG025());
		vrTechnicalSpec_XCGImpl.setModifyDate(vrTechnicalSpec_XCG.getModifyDate());
		vrTechnicalSpec_XCGImpl.setSyncDate(vrTechnicalSpec_XCG.getSyncDate());

		return vrTechnicalSpec_XCGImpl;
	}

	/**
	 * Returns the vr technical spec_xcg with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg
	 * @return the vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGException {
		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XCG == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XCGException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XCG;
	}

	/**
	 * Returns the vr technical spec_xcg with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCGException} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg
	 * @return the vr technical spec_xcg
	 * @throws NoSuchVRTechnicalSpec_XCGException if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCGException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xcg with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg
	 * @return the vr technical spec_xcg, or <code>null</code> if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XCG vrTechnicalSpec_XCG = (VRTechnicalSpec_XCG)serializable;

		if (vrTechnicalSpec_XCG == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XCG = (VRTechnicalSpec_XCG)session.get(VRTechnicalSpec_XCGImpl.class,
						primaryKey);

				if (vrTechnicalSpec_XCG != null) {
					cacheResult(vrTechnicalSpec_XCG);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XCG;
	}

	/**
	 * Returns the vr technical spec_xcg with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg
	 * @return the vr technical spec_xcg, or <code>null</code> if a vr technical spec_xcg with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCG fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XCG> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XCG> map = new HashMap<Serializable, VRTechnicalSpec_XCG>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XCG vrTechnicalSpec_XCG = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XCG != null) {
				map.put(primaryKey, vrTechnicalSpec_XCG);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XCG)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : (List<VRTechnicalSpec_XCG>)q.list()) {
				map.put(vrTechnicalSpec_XCG.getPrimaryKeyObj(),
					vrTechnicalSpec_XCG);

				cacheResult(vrTechnicalSpec_XCG);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XCG.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XCGModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xcgs.
	 *
	 * @return the vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @return the range of vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcgs
	 * @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xcgs
	 */
	@Override
	public List<VRTechnicalSpec_XCG> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCG> orderByComparator,
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

		List<VRTechnicalSpec_XCG> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCG>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XCG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XCG;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XCGModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCG>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xcgs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XCG vrTechnicalSpec_XCG : findAll()) {
			remove(vrTechnicalSpec_XCG);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcgs.
	 *
	 * @return the number of vr technical spec_xcgs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XCG);

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
		return VRTechnicalSpec_XCGModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xcg persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XCGImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCG = "SELECT vrTechnicalSpec_XCG FROM VRTechnicalSpec_XCG vrTechnicalSpec_XCG";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE_PKS_IN = "SELECT vrTechnicalSpec_XCG FROM VRTechnicalSpec_XCG vrTechnicalSpec_XCG WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCG_WHERE = "SELECT vrTechnicalSpec_XCG FROM VRTechnicalSpec_XCG vrTechnicalSpec_XCG WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCG = "SELECT COUNT(vrTechnicalSpec_XCG) FROM VRTechnicalSpec_XCG vrTechnicalSpec_XCG";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCG_WHERE = "SELECT COUNT(vrTechnicalSpec_XCG) FROM VRTechnicalSpec_XCG vrTechnicalSpec_XCG WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XCG.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XCG exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XCG exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCGPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}