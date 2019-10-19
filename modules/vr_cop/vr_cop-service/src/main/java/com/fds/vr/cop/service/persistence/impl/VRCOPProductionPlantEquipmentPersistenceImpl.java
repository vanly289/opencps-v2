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

import com.fds.vr.cop.exception.NoSuchVRCOPProductionPlantEquipmentException;
import com.fds.vr.cop.model.VRCOPProductionPlantEquipment;
import com.fds.vr.cop.model.impl.VRCOPProductionPlantEquipmentImpl;
import com.fds.vr.cop.model.impl.VRCOPProductionPlantEquipmentModelImpl;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantEquipmentPersistence;

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
 * The persistence implementation for the vrcop production plant equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantEquipmentPersistence
 * @see com.fds.vr.cop.service.persistence.VRCOPProductionPlantEquipmentUtil
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEquipmentPersistenceImpl
	extends BasePersistenceImpl<VRCOPProductionPlantEquipment>
	implements VRCOPProductionPlantEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPProductionPlantEquipmentUtil} to access the vrcop production plant equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPProductionPlantEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COP_REPORT_NO =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCOP_REPORT_NO",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO =
		new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCOP_REPORT_NO",
			new String[] { String.class.getName() },
			VRCOPProductionPlantEquipmentModelImpl.COPREPORTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COP_REPORT_NO = new FinderPath(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCOP_REPORT_NO", new String[] { String.class.getName() });

	/**
	 * Returns all the vrcop production plant equipments where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @return the matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findByCOP_REPORT_NO(
		String COPReportNo) {
		return findByCOP_REPORT_NO(COPReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant equipments where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @return the range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findByCOP_REPORT_NO(
		String COPReportNo, int start, int end) {
		return findByCOP_REPORT_NO(COPReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findByCOP_REPORT_NO(
		String COPReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		return findByCOP_REPORT_NO(COPReportNo, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findByCOP_REPORT_NO(
		String COPReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO;
			finderArgs = new Object[] { COPReportNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COP_REPORT_NO;
			finderArgs = new Object[] { COPReportNo, start, end, orderByComparator };
		}

		List<VRCOPProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : list) {
					if (!Objects.equals(COPReportNo,
								vrcopProductionPlantEquipment.getCOPReportNo())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findByCOP_REPORT_NO_First(
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchByCOP_REPORT_NO_First(COPReportNo,
				orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("COPReportNo=");
		msg.append(COPReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchByCOP_REPORT_NO_First(
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		List<VRCOPProductionPlantEquipment> list = findByCOP_REPORT_NO(COPReportNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findByCOP_REPORT_NO_Last(
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchByCOP_REPORT_NO_Last(COPReportNo,
				orderByComparator);

		if (vrcopProductionPlantEquipment != null) {
			return vrcopProductionPlantEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("COPReportNo=");
		msg.append(COPReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant equipment, or <code>null</code> if a matching vrcop production plant equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchByCOP_REPORT_NO_Last(
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		int count = countByCOP_REPORT_NO(COPReportNo);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantEquipment> list = findByCOP_REPORT_NO(COPReportNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant equipments before and after the current vrcop production plant equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant equipment
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment[] findByCOP_REPORT_NO_PrevAndNext(
		long id, String COPReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEquipment[] array = new VRCOPProductionPlantEquipmentImpl[3];

			array[0] = getByCOP_REPORT_NO_PrevAndNext(session,
					vrcopProductionPlantEquipment, COPReportNo,
					orderByComparator, true);

			array[1] = vrcopProductionPlantEquipment;

			array[2] = getByCOP_REPORT_NO_PrevAndNext(session,
					vrcopProductionPlantEquipment, COPReportNo,
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

	protected VRCOPProductionPlantEquipment getByCOP_REPORT_NO_PrevAndNext(
		Session session,
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment,
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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
			query.append(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCOPReportNo) {
			qPos.add(COPReportNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant equipments where COPReportNo = &#63; from the database.
	 *
	 * @param COPReportNo the cop report no
	 */
	@Override
	public void removeByCOP_REPORT_NO(String COPReportNo) {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : findByCOP_REPORT_NO(
				COPReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant equipments where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @return the number of matching vrcop production plant equipments
	 */
	@Override
	public int countByCOP_REPORT_NO(String COPReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COP_REPORT_NO;

		Object[] finderArgs = new Object[] { COPReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1 = "vrcopProductionPlantEquipment.COPReportNo IS NULL";
	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2 = "vrcopProductionPlantEquipment.COPReportNo = ?";
	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3 = "(vrcopProductionPlantEquipment.COPReportNo IS NULL OR vrcopProductionPlantEquipment.COPReportNo = '')";

	public VRCOPProductionPlantEquipmentPersistenceImpl() {
		setModelClass(VRCOPProductionPlantEquipment.class);
	}

	/**
	 * Caches the vrcop production plant equipment in the entity cache if it is enabled.
	 *
	 * @param vrcopProductionPlantEquipment the vrcop production plant equipment
	 */
	@Override
	public void cacheResult(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		entityCache.putResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			vrcopProductionPlantEquipment.getPrimaryKey(),
			vrcopProductionPlantEquipment);

		vrcopProductionPlantEquipment.resetOriginalValues();
	}

	/**
	 * Caches the vrcop production plant equipments in the entity cache if it is enabled.
	 *
	 * @param vrcopProductionPlantEquipments the vrcop production plant equipments
	 */
	@Override
	public void cacheResult(
		List<VRCOPProductionPlantEquipment> vrcopProductionPlantEquipments) {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : vrcopProductionPlantEquipments) {
			if (entityCache.getResult(
						VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductionPlantEquipmentImpl.class,
						vrcopProductionPlantEquipment.getPrimaryKey()) == null) {
				cacheResult(vrcopProductionPlantEquipment);
			}
			else {
				vrcopProductionPlantEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop production plant equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPProductionPlantEquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop production plant equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		entityCache.removeResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			vrcopProductionPlantEquipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRCOPProductionPlantEquipment> vrcopProductionPlantEquipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : vrcopProductionPlantEquipments) {
			entityCache.removeResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductionPlantEquipmentImpl.class,
				vrcopProductionPlantEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcop production plant equipment with the primary key. Does not add the vrcop production plant equipment to the database.
	 *
	 * @param id the primary key for the new vrcop production plant equipment
	 * @return the new vrcop production plant equipment
	 */
	@Override
	public VRCOPProductionPlantEquipment create(long id) {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = new VRCOPProductionPlantEquipmentImpl();

		vrcopProductionPlantEquipment.setNew(true);
		vrcopProductionPlantEquipment.setPrimaryKey(id);

		return vrcopProductionPlantEquipment;
	}

	/**
	 * Removes the vrcop production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment that was removed
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment remove(long id)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment that was removed
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment remove(Serializable primaryKey)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)session.get(VRCOPProductionPlantEquipmentImpl.class,
					primaryKey);

			if (vrcopProductionPlantEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPProductionPlantEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopProductionPlantEquipment);
		}
		catch (NoSuchVRCOPProductionPlantEquipmentException nsee) {
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
	protected VRCOPProductionPlantEquipment removeImpl(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		vrcopProductionPlantEquipment = toUnwrappedModel(vrcopProductionPlantEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopProductionPlantEquipment)) {
				vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)session.get(VRCOPProductionPlantEquipmentImpl.class,
						vrcopProductionPlantEquipment.getPrimaryKeyObj());
			}

			if (vrcopProductionPlantEquipment != null) {
				session.delete(vrcopProductionPlantEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopProductionPlantEquipment != null) {
			clearCache(vrcopProductionPlantEquipment);
		}

		return vrcopProductionPlantEquipment;
	}

	@Override
	public VRCOPProductionPlantEquipment updateImpl(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		vrcopProductionPlantEquipment = toUnwrappedModel(vrcopProductionPlantEquipment);

		boolean isNew = vrcopProductionPlantEquipment.isNew();

		VRCOPProductionPlantEquipmentModelImpl vrcopProductionPlantEquipmentModelImpl =
			(VRCOPProductionPlantEquipmentModelImpl)vrcopProductionPlantEquipment;

		Session session = null;

		try {
			session = openSession();

			if (vrcopProductionPlantEquipment.isNew()) {
				session.save(vrcopProductionPlantEquipment);

				vrcopProductionPlantEquipment.setNew(false);
			}
			else {
				vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)session.merge(vrcopProductionPlantEquipment);
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
				!VRCOPProductionPlantEquipmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopProductionPlantEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getOriginalCOPReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO,
					args);

				args = new Object[] {
						vrcopProductionPlantEquipmentModelImpl.getCOPReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO,
					args);
			}
		}

		entityCache.putResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantEquipmentImpl.class,
			vrcopProductionPlantEquipment.getPrimaryKey(),
			vrcopProductionPlantEquipment, false);

		vrcopProductionPlantEquipment.resetOriginalValues();

		return vrcopProductionPlantEquipment;
	}

	protected VRCOPProductionPlantEquipment toUnwrappedModel(
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		if (vrcopProductionPlantEquipment instanceof VRCOPProductionPlantEquipmentImpl) {
			return vrcopProductionPlantEquipment;
		}

		VRCOPProductionPlantEquipmentImpl vrcopProductionPlantEquipmentImpl = new VRCOPProductionPlantEquipmentImpl();

		vrcopProductionPlantEquipmentImpl.setNew(vrcopProductionPlantEquipment.isNew());
		vrcopProductionPlantEquipmentImpl.setPrimaryKey(vrcopProductionPlantEquipment.getPrimaryKey());

		vrcopProductionPlantEquipmentImpl.setId(vrcopProductionPlantEquipment.getId());
		vrcopProductionPlantEquipmentImpl.setMtCore(vrcopProductionPlantEquipment.getMtCore());
		vrcopProductionPlantEquipmentImpl.setCOPReportRepositoryID(vrcopProductionPlantEquipment.getCOPReportRepositoryID());
		vrcopProductionPlantEquipmentImpl.setCOPReportNo(vrcopProductionPlantEquipment.getCOPReportNo());
		vrcopProductionPlantEquipmentImpl.setSequenceNo(vrcopProductionPlantEquipment.getSequenceNo());
		vrcopProductionPlantEquipmentImpl.setEquipmentCode(vrcopProductionPlantEquipment.getEquipmentCode());
		vrcopProductionPlantEquipmentImpl.setEquipmentName(vrcopProductionPlantEquipment.getEquipmentName());
		vrcopProductionPlantEquipmentImpl.setEquipmentType(vrcopProductionPlantEquipment.getEquipmentType());
		vrcopProductionPlantEquipmentImpl.setTradeMark(vrcopProductionPlantEquipment.getTradeMark());
		vrcopProductionPlantEquipmentImpl.setTradeMarkName(vrcopProductionPlantEquipment.getTradeMarkName());
		vrcopProductionPlantEquipmentImpl.setCommercialName(vrcopProductionPlantEquipment.getCommercialName());
		vrcopProductionPlantEquipmentImpl.setModelCode(vrcopProductionPlantEquipment.getModelCode());
		vrcopProductionPlantEquipmentImpl.setDesignSymbolNo(vrcopProductionPlantEquipment.getDesignSymbolNo());
		vrcopProductionPlantEquipmentImpl.setProductionCountryCode(vrcopProductionPlantEquipment.getProductionCountryCode());
		vrcopProductionPlantEquipmentImpl.setEquipmentStatus(vrcopProductionPlantEquipment.getEquipmentStatus());
		vrcopProductionPlantEquipmentImpl.setNotes(vrcopProductionPlantEquipment.getNotes());
		vrcopProductionPlantEquipmentImpl.setExpireDate(vrcopProductionPlantEquipment.getExpireDate());
		vrcopProductionPlantEquipmentImpl.setModifyDate(vrcopProductionPlantEquipment.getModifyDate());
		vrcopProductionPlantEquipmentImpl.setSyncDate(vrcopProductionPlantEquipment.getSyncDate());

		return vrcopProductionPlantEquipmentImpl;
	}

	/**
	 * Returns the vrcop production plant equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchByPrimaryKey(primaryKey);

		if (vrcopProductionPlantEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPProductionPlantEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopProductionPlantEquipment;
	}

	/**
	 * Returns the vrcop production plant equipment with the primary key or throws a {@link NoSuchVRCOPProductionPlantEquipmentException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment
	 * @throws NoSuchVRCOPProductionPlantEquipmentException if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment findByPrimaryKey(long id)
		throws NoSuchVRCOPProductionPlantEquipmentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop production plant equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment, or <code>null</code> if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductionPlantEquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)serializable;

		if (vrcopProductionPlantEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopProductionPlantEquipment = (VRCOPProductionPlantEquipment)session.get(VRCOPProductionPlantEquipmentImpl.class,
						primaryKey);

				if (vrcopProductionPlantEquipment != null) {
					cacheResult(vrcopProductionPlantEquipment);
				}
				else {
					entityCache.putResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductionPlantEquipmentImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopProductionPlantEquipment;
	}

	/**
	 * Returns the vrcop production plant equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop production plant equipment
	 * @return the vrcop production plant equipment, or <code>null</code> if a vrcop production plant equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantEquipment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPProductionPlantEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPProductionPlantEquipment> map = new HashMap<Serializable, VRCOPProductionPlantEquipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPProductionPlantEquipment vrcopProductionPlantEquipment = fetchByPrimaryKey(primaryKey);

			if (vrcopProductionPlantEquipment != null) {
				map.put(primaryKey, vrcopProductionPlantEquipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(VRCOPProductionPlantEquipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE_PKS_IN);

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

			for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : (List<VRCOPProductionPlantEquipment>)q.list()) {
				map.put(vrcopProductionPlantEquipment.getPrimaryKeyObj(),
					vrcopProductionPlantEquipment);

				cacheResult(vrcopProductionPlantEquipment);

				uncachedPrimaryKeys.remove(vrcopProductionPlantEquipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPProductionPlantEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantEquipmentImpl.class, primaryKey,
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
	 * Returns all the vrcop production plant equipments.
	 *
	 * @return the vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @return the range of vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findAll(int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant equipments
	 * @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop production plant equipments
	 */
	@Override
	public List<VRCOPProductionPlantEquipment> findAll(int start, int end,
		OrderByComparator<VRCOPProductionPlantEquipment> orderByComparator,
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

		List<VRCOPProductionPlantEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT;

				if (pagination) {
					sql = sql.concat(VRCOPProductionPlantEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantEquipment>)QueryUtil.list(q,
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
	 * Removes all the vrcop production plant equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPProductionPlantEquipment vrcopProductionPlantEquipment : findAll()) {
			remove(vrcopProductionPlantEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant equipments.
	 *
	 * @return the number of vrcop production plant equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT);

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
		return VRCOPProductionPlantEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop production plant equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPProductionPlantEquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT = "SELECT vrcopProductionPlantEquipment FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment";
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE_PKS_IN =
		"SELECT vrcopProductionPlantEquipment FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE = "SELECT vrcopProductionPlantEquipment FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment WHERE ";
	private static final String _SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT = "SELECT COUNT(vrcopProductionPlantEquipment) FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment";
	private static final String _SQL_COUNT_VRCOPPRODUCTIONPLANTEQUIPMENT_WHERE = "SELECT COUNT(vrcopProductionPlantEquipment) FROM VRCOPProductionPlantEquipment vrcopProductionPlantEquipment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopProductionPlantEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPProductionPlantEquipment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPProductionPlantEquipment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantEquipmentPersistenceImpl.class);
}