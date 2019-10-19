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

import com.fds.vr.cop.exception.NoSuchVRCOPProductionPlantProdEquipmentException;
import com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment;
import com.fds.vr.cop.model.impl.VRCOPProductionPlantProdEquipmentImpl;
import com.fds.vr.cop.model.impl.VRCOPProductionPlantProdEquipmentModelImpl;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantProdEquipmentPersistence;

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
 * The persistence implementation for the vrcop production plant prod equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantProdEquipmentPersistence
 * @see com.fds.vr.cop.service.persistence.VRCOPProductionPlantProdEquipmentUtil
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantProdEquipmentPersistenceImpl
	extends BasePersistenceImpl<VRCOPProductionPlantProdEquipment>
	implements VRCOPProductionPlantProdEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPProductionPlantProdEquipmentUtil} to access the vrcop production plant prod equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPProductionPlantProdEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COP_REPORT_NO =
		new FinderPath(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCOP_REPORT_NO",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO =
		new FinderPath(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCOP_REPORT_NO",
			new String[] { String.class.getName() },
			VRCOPProductionPlantProdEquipmentModelImpl.COPREPORTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COP_REPORT_NO = new FinderPath(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCOP_REPORT_NO", new String[] { String.class.getName() });

	/**
	 * Returns all the vrcop production plant prod equipments where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @return the matching vrcop production plant prod equipments
	 */
	@Override
	public List<VRCOPProductionPlantProdEquipment> findByCOP_REPORT_NO(
		String COPReportNo) {
		return findByCOP_REPORT_NO(COPReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant prod equipments where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant prod equipments
	 * @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	 * @return the range of matching vrcop production plant prod equipments
	 */
	@Override
	public List<VRCOPProductionPlantProdEquipment> findByCOP_REPORT_NO(
		String COPReportNo, int start, int end) {
		return findByCOP_REPORT_NO(COPReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant prod equipments where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant prod equipments
	 * @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop production plant prod equipments
	 */
	@Override
	public List<VRCOPProductionPlantProdEquipment> findByCOP_REPORT_NO(
		String COPReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		return findByCOP_REPORT_NO(COPReportNo, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant prod equipments where COPReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param COPReportNo the cop report no
	 * @param start the lower bound of the range of vrcop production plant prod equipments
	 * @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop production plant prod equipments
	 */
	@Override
	public List<VRCOPProductionPlantProdEquipment> findByCOP_REPORT_NO(
		String COPReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator,
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

		List<VRCOPProductionPlantProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment : list) {
					if (!Objects.equals(COPReportNo,
								vrcopProductionPlantProdEquipment.getCOPReportNo())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT_WHERE);

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
				query.append(VRCOPProductionPlantProdEquipmentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProductionPlantProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantProdEquipment>)QueryUtil.list(q,
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
	 * Returns the first vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant prod equipment
	 * @throws NoSuchVRCOPProductionPlantProdEquipmentException if a matching vrcop production plant prod equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment findByCOP_REPORT_NO_First(
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantProdEquipmentException {
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment = fetchByCOP_REPORT_NO_First(COPReportNo,
				orderByComparator);

		if (vrcopProductionPlantProdEquipment != null) {
			return vrcopProductionPlantProdEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("COPReportNo=");
		msg.append(COPReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the first vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop production plant prod equipment, or <code>null</code> if a matching vrcop production plant prod equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment fetchByCOP_REPORT_NO_First(
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		List<VRCOPProductionPlantProdEquipment> list = findByCOP_REPORT_NO(COPReportNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant prod equipment
	 * @throws NoSuchVRCOPProductionPlantProdEquipmentException if a matching vrcop production plant prod equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment findByCOP_REPORT_NO_Last(
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantProdEquipmentException {
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment = fetchByCOP_REPORT_NO_Last(COPReportNo,
				orderByComparator);

		if (vrcopProductionPlantProdEquipment != null) {
			return vrcopProductionPlantProdEquipment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("COPReportNo=");
		msg.append(COPReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductionPlantProdEquipmentException(msg.toString());
	}

	/**
	 * Returns the last vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop production plant prod equipment, or <code>null</code> if a matching vrcop production plant prod equipment could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment fetchByCOP_REPORT_NO_Last(
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		int count = countByCOP_REPORT_NO(COPReportNo);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductionPlantProdEquipment> list = findByCOP_REPORT_NO(COPReportNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop production plant prod equipments before and after the current vrcop production plant prod equipment in the ordered set where COPReportNo = &#63;.
	 *
	 * @param id the primary key of the current vrcop production plant prod equipment
	 * @param COPReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop production plant prod equipment
	 * @throws NoSuchVRCOPProductionPlantProdEquipmentException if a vrcop production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment[] findByCOP_REPORT_NO_PrevAndNext(
		long id, String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRCOPProductionPlantProdEquipmentException {
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantProdEquipment[] array = new VRCOPProductionPlantProdEquipmentImpl[3];

			array[0] = getByCOP_REPORT_NO_PrevAndNext(session,
					vrcopProductionPlantProdEquipment, COPReportNo,
					orderByComparator, true);

			array[1] = vrcopProductionPlantProdEquipment;

			array[2] = getByCOP_REPORT_NO_PrevAndNext(session,
					vrcopProductionPlantProdEquipment, COPReportNo,
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

	protected VRCOPProductionPlantProdEquipment getByCOP_REPORT_NO_PrevAndNext(
		Session session,
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment,
		String COPReportNo,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT_WHERE);

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
			query.append(VRCOPProductionPlantProdEquipmentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductionPlantProdEquipment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductionPlantProdEquipment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop production plant prod equipments where COPReportNo = &#63; from the database.
	 *
	 * @param COPReportNo the cop report no
	 */
	@Override
	public void removeByCOP_REPORT_NO(String COPReportNo) {
		for (VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment : findByCOP_REPORT_NO(
				COPReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductionPlantProdEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant prod equipments where COPReportNo = &#63;.
	 *
	 * @param COPReportNo the cop report no
	 * @return the number of matching vrcop production plant prod equipments
	 */
	@Override
	public int countByCOP_REPORT_NO(String COPReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COP_REPORT_NO;

		Object[] finderArgs = new Object[] { COPReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT_WHERE);

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

	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_1 = "vrcopProductionPlantProdEquipment.COPReportNo IS NULL";
	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_2 = "vrcopProductionPlantProdEquipment.COPReportNo = ?";
	private static final String _FINDER_COLUMN_COP_REPORT_NO_COPREPORTNO_3 = "(vrcopProductionPlantProdEquipment.COPReportNo IS NULL OR vrcopProductionPlantProdEquipment.COPReportNo = '')";

	public VRCOPProductionPlantProdEquipmentPersistenceImpl() {
		setModelClass(VRCOPProductionPlantProdEquipment.class);
	}

	/**
	 * Caches the vrcop production plant prod equipment in the entity cache if it is enabled.
	 *
	 * @param vrcopProductionPlantProdEquipment the vrcop production plant prod equipment
	 */
	@Override
	public void cacheResult(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		entityCache.putResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentImpl.class,
			vrcopProductionPlantProdEquipment.getPrimaryKey(),
			vrcopProductionPlantProdEquipment);

		vrcopProductionPlantProdEquipment.resetOriginalValues();
	}

	/**
	 * Caches the vrcop production plant prod equipments in the entity cache if it is enabled.
	 *
	 * @param vrcopProductionPlantProdEquipments the vrcop production plant prod equipments
	 */
	@Override
	public void cacheResult(
		List<VRCOPProductionPlantProdEquipment> vrcopProductionPlantProdEquipments) {
		for (VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment : vrcopProductionPlantProdEquipments) {
			if (entityCache.getResult(
						VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductionPlantProdEquipmentImpl.class,
						vrcopProductionPlantProdEquipment.getPrimaryKey()) == null) {
				cacheResult(vrcopProductionPlantProdEquipment);
			}
			else {
				vrcopProductionPlantProdEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop production plant prod equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPProductionPlantProdEquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop production plant prod equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		entityCache.removeResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentImpl.class,
			vrcopProductionPlantProdEquipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRCOPProductionPlantProdEquipment> vrcopProductionPlantProdEquipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment : vrcopProductionPlantProdEquipments) {
			entityCache.removeResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductionPlantProdEquipmentImpl.class,
				vrcopProductionPlantProdEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcop production plant prod equipment with the primary key. Does not add the vrcop production plant prod equipment to the database.
	 *
	 * @param id the primary key for the new vrcop production plant prod equipment
	 * @return the new vrcop production plant prod equipment
	 */
	@Override
	public VRCOPProductionPlantProdEquipment create(long id) {
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment = new VRCOPProductionPlantProdEquipmentImpl();

		vrcopProductionPlantProdEquipment.setNew(true);
		vrcopProductionPlantProdEquipment.setPrimaryKey(id);

		return vrcopProductionPlantProdEquipment;
	}

	/**
	 * Removes the vrcop production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop production plant prod equipment
	 * @return the vrcop production plant prod equipment that was removed
	 * @throws NoSuchVRCOPProductionPlantProdEquipmentException if a vrcop production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment remove(long id)
		throws NoSuchVRCOPProductionPlantProdEquipmentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop production plant prod equipment
	 * @return the vrcop production plant prod equipment that was removed
	 * @throws NoSuchVRCOPProductionPlantProdEquipmentException if a vrcop production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment remove(Serializable primaryKey)
		throws NoSuchVRCOPProductionPlantProdEquipmentException {
		Session session = null;

		try {
			session = openSession();

			VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment = (VRCOPProductionPlantProdEquipment)session.get(VRCOPProductionPlantProdEquipmentImpl.class,
					primaryKey);

			if (vrcopProductionPlantProdEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPProductionPlantProdEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopProductionPlantProdEquipment);
		}
		catch (NoSuchVRCOPProductionPlantProdEquipmentException nsee) {
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
	protected VRCOPProductionPlantProdEquipment removeImpl(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		vrcopProductionPlantProdEquipment = toUnwrappedModel(vrcopProductionPlantProdEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopProductionPlantProdEquipment)) {
				vrcopProductionPlantProdEquipment = (VRCOPProductionPlantProdEquipment)session.get(VRCOPProductionPlantProdEquipmentImpl.class,
						vrcopProductionPlantProdEquipment.getPrimaryKeyObj());
			}

			if (vrcopProductionPlantProdEquipment != null) {
				session.delete(vrcopProductionPlantProdEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopProductionPlantProdEquipment != null) {
			clearCache(vrcopProductionPlantProdEquipment);
		}

		return vrcopProductionPlantProdEquipment;
	}

	@Override
	public VRCOPProductionPlantProdEquipment updateImpl(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		vrcopProductionPlantProdEquipment = toUnwrappedModel(vrcopProductionPlantProdEquipment);

		boolean isNew = vrcopProductionPlantProdEquipment.isNew();

		VRCOPProductionPlantProdEquipmentModelImpl vrcopProductionPlantProdEquipmentModelImpl =
			(VRCOPProductionPlantProdEquipmentModelImpl)vrcopProductionPlantProdEquipment;

		Session session = null;

		try {
			session = openSession();

			if (vrcopProductionPlantProdEquipment.isNew()) {
				session.save(vrcopProductionPlantProdEquipment);

				vrcopProductionPlantProdEquipment.setNew(false);
			}
			else {
				vrcopProductionPlantProdEquipment = (VRCOPProductionPlantProdEquipment)session.merge(vrcopProductionPlantProdEquipment);
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
				!VRCOPProductionPlantProdEquipmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopProductionPlantProdEquipmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductionPlantProdEquipmentModelImpl.getOriginalCOPReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO,
					args);

				args = new Object[] {
						vrcopProductionPlantProdEquipmentModelImpl.getCOPReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COP_REPORT_NO,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COP_REPORT_NO,
					args);
			}
		}

		entityCache.putResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductionPlantProdEquipmentImpl.class,
			vrcopProductionPlantProdEquipment.getPrimaryKey(),
			vrcopProductionPlantProdEquipment, false);

		vrcopProductionPlantProdEquipment.resetOriginalValues();

		return vrcopProductionPlantProdEquipment;
	}

	protected VRCOPProductionPlantProdEquipment toUnwrappedModel(
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		if (vrcopProductionPlantProdEquipment instanceof VRCOPProductionPlantProdEquipmentImpl) {
			return vrcopProductionPlantProdEquipment;
		}

		VRCOPProductionPlantProdEquipmentImpl vrcopProductionPlantProdEquipmentImpl =
			new VRCOPProductionPlantProdEquipmentImpl();

		vrcopProductionPlantProdEquipmentImpl.setNew(vrcopProductionPlantProdEquipment.isNew());
		vrcopProductionPlantProdEquipmentImpl.setPrimaryKey(vrcopProductionPlantProdEquipment.getPrimaryKey());

		vrcopProductionPlantProdEquipmentImpl.setId(vrcopProductionPlantProdEquipment.getId());
		vrcopProductionPlantProdEquipmentImpl.setMtCore(vrcopProductionPlantProdEquipment.getMtCore());
		vrcopProductionPlantProdEquipmentImpl.setCOPReportRepositoryID(vrcopProductionPlantProdEquipment.getCOPReportRepositoryID());
		vrcopProductionPlantProdEquipmentImpl.setCOPReportNo(vrcopProductionPlantProdEquipment.getCOPReportNo());
		vrcopProductionPlantProdEquipmentImpl.setSequenceNo(vrcopProductionPlantProdEquipment.getSequenceNo());
		vrcopProductionPlantProdEquipmentImpl.setEquipmentCode(vrcopProductionPlantProdEquipment.getEquipmentCode());
		vrcopProductionPlantProdEquipmentImpl.setEquipmentName(vrcopProductionPlantProdEquipment.getEquipmentName());
		vrcopProductionPlantProdEquipmentImpl.setEquipmentType(vrcopProductionPlantProdEquipment.getEquipmentType());
		vrcopProductionPlantProdEquipmentImpl.setTradeMark(vrcopProductionPlantProdEquipment.getTradeMark());
		vrcopProductionPlantProdEquipmentImpl.setTradeMarkName(vrcopProductionPlantProdEquipment.getTradeMarkName());
		vrcopProductionPlantProdEquipmentImpl.setCommercialName(vrcopProductionPlantProdEquipment.getCommercialName());
		vrcopProductionPlantProdEquipmentImpl.setModelCode(vrcopProductionPlantProdEquipment.getModelCode());
		vrcopProductionPlantProdEquipmentImpl.setDesignSymbolNo(vrcopProductionPlantProdEquipment.getDesignSymbolNo());
		vrcopProductionPlantProdEquipmentImpl.setProductionCountryCode(vrcopProductionPlantProdEquipment.getProductionCountryCode());
		vrcopProductionPlantProdEquipmentImpl.setEquipmentStatus(vrcopProductionPlantProdEquipment.getEquipmentStatus());
		vrcopProductionPlantProdEquipmentImpl.setNotes(vrcopProductionPlantProdEquipment.getNotes());
		vrcopProductionPlantProdEquipmentImpl.setModifyDate(vrcopProductionPlantProdEquipment.getModifyDate());
		vrcopProductionPlantProdEquipmentImpl.setSyncDate(vrcopProductionPlantProdEquipment.getSyncDate());

		return vrcopProductionPlantProdEquipmentImpl;
	}

	/**
	 * Returns the vrcop production plant prod equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop production plant prod equipment
	 * @return the vrcop production plant prod equipment
	 * @throws NoSuchVRCOPProductionPlantProdEquipmentException if a vrcop production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchVRCOPProductionPlantProdEquipmentException {
		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment = fetchByPrimaryKey(primaryKey);

		if (vrcopProductionPlantProdEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPProductionPlantProdEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopProductionPlantProdEquipment;
	}

	/**
	 * Returns the vrcop production plant prod equipment with the primary key or throws a {@link NoSuchVRCOPProductionPlantProdEquipmentException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop production plant prod equipment
	 * @return the vrcop production plant prod equipment
	 * @throws NoSuchVRCOPProductionPlantProdEquipmentException if a vrcop production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment findByPrimaryKey(long id)
		throws NoSuchVRCOPProductionPlantProdEquipmentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop production plant prod equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop production plant prod equipment
	 * @return the vrcop production plant prod equipment, or <code>null</code> if a vrcop production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductionPlantProdEquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment = (VRCOPProductionPlantProdEquipment)serializable;

		if (vrcopProductionPlantProdEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopProductionPlantProdEquipment = (VRCOPProductionPlantProdEquipment)session.get(VRCOPProductionPlantProdEquipmentImpl.class,
						primaryKey);

				if (vrcopProductionPlantProdEquipment != null) {
					cacheResult(vrcopProductionPlantProdEquipment);
				}
				else {
					entityCache.putResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductionPlantProdEquipmentImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantProdEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopProductionPlantProdEquipment;
	}

	/**
	 * Returns the vrcop production plant prod equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop production plant prod equipment
	 * @return the vrcop production plant prod equipment, or <code>null</code> if a vrcop production plant prod equipment with the primary key could not be found
	 */
	@Override
	public VRCOPProductionPlantProdEquipment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPProductionPlantProdEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPProductionPlantProdEquipment> map = new HashMap<Serializable, VRCOPProductionPlantProdEquipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment = fetchByPrimaryKey(primaryKey);

			if (vrcopProductionPlantProdEquipment != null) {
				map.put(primaryKey, vrcopProductionPlantProdEquipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantProdEquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(VRCOPProductionPlantProdEquipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT_WHERE_PKS_IN);

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

			for (VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment : (List<VRCOPProductionPlantProdEquipment>)q.list()) {
				map.put(vrcopProductionPlantProdEquipment.getPrimaryKeyObj(),
					vrcopProductionPlantProdEquipment);

				cacheResult(vrcopProductionPlantProdEquipment);

				uncachedPrimaryKeys.remove(vrcopProductionPlantProdEquipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPProductionPlantProdEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductionPlantProdEquipmentImpl.class, primaryKey,
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
	 * Returns all the vrcop production plant prod equipments.
	 *
	 * @return the vrcop production plant prod equipments
	 */
	@Override
	public List<VRCOPProductionPlantProdEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop production plant prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant prod equipments
	 * @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	 * @return the range of vrcop production plant prod equipments
	 */
	@Override
	public List<VRCOPProductionPlantProdEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant prod equipments
	 * @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop production plant prod equipments
	 */
	@Override
	public List<VRCOPProductionPlantProdEquipment> findAll(int start, int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop production plant prod equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop production plant prod equipments
	 * @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop production plant prod equipments
	 */
	@Override
	public List<VRCOPProductionPlantProdEquipment> findAll(int start, int end,
		OrderByComparator<VRCOPProductionPlantProdEquipment> orderByComparator,
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

		List<VRCOPProductionPlantProdEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductionPlantProdEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT;

				if (pagination) {
					sql = sql.concat(VRCOPProductionPlantProdEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPProductionPlantProdEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductionPlantProdEquipment>)QueryUtil.list(q,
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
	 * Removes all the vrcop production plant prod equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment : findAll()) {
			remove(vrcopProductionPlantProdEquipment);
		}
	}

	/**
	 * Returns the number of vrcop production plant prod equipments.
	 *
	 * @return the number of vrcop production plant prod equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT);

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
		return VRCOPProductionPlantProdEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop production plant prod equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPProductionPlantProdEquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT = "SELECT vrcopProductionPlantProdEquipment FROM VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment";
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT_WHERE_PKS_IN =
		"SELECT vrcopProductionPlantProdEquipment FROM VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT_WHERE =
		"SELECT vrcopProductionPlantProdEquipment FROM VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment WHERE ";
	private static final String _SQL_COUNT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT = "SELECT COUNT(vrcopProductionPlantProdEquipment) FROM VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment";
	private static final String _SQL_COUNT_VRCOPPRODUCTIONPLANTPRODEQUIPMENT_WHERE =
		"SELECT COUNT(vrcopProductionPlantProdEquipment) FROM VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopProductionPlantProdEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPProductionPlantProdEquipment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPProductionPlantProdEquipment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantProdEquipmentPersistenceImpl.class);
}