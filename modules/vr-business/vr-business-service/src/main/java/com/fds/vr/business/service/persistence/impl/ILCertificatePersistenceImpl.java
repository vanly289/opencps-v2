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

import com.fds.vr.business.exception.NoSuchILCertificateException;
import com.fds.vr.business.model.ILCertificate;
import com.fds.vr.business.model.impl.ILCertificateImpl;
import com.fds.vr.business.model.impl.ILCertificateModelImpl;
import com.fds.vr.business.service.persistence.ILCertificatePersistence;

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
 * The persistence implementation for the il certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see ILCertificatePersistence
 * @see com.fds.vr.business.service.persistence.ILCertificateUtil
 * @generated
 */
@ProviderType
public class ILCertificatePersistenceImpl extends BasePersistenceImpl<ILCertificate>
	implements ILCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ILCertificateUtil} to access the il certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ILCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateModelImpl.FINDER_CACHE_ENABLED,
			ILCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateModelImpl.FINDER_CACHE_ENABLED,
			ILCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_F_DFILE_ID = new FinderPath(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateModelImpl.FINDER_CACHE_ENABLED,
			ILCertificateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_DFILE_ID", new String[] { Long.class.getName() },
			ILCertificateModelImpl.DOSSIERFILEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DFILE_ID = new FinderPath(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_DFILE_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns the il certificate where dossierFileId = &#63; or throws a {@link NoSuchILCertificateException} if it could not be found.
	 *
	 * @param dossierFileId the dossier file ID
	 * @return the matching il certificate
	 * @throws NoSuchILCertificateException if a matching il certificate could not be found
	 */
	@Override
	public ILCertificate findByF_DFILE_ID(long dossierFileId)
		throws NoSuchILCertificateException {
		ILCertificate ilCertificate = fetchByF_DFILE_ID(dossierFileId);

		if (ilCertificate == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierFileId=");
			msg.append(dossierFileId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchILCertificateException(msg.toString());
		}

		return ilCertificate;
	}

	/**
	 * Returns the il certificate where dossierFileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierFileId the dossier file ID
	 * @return the matching il certificate, or <code>null</code> if a matching il certificate could not be found
	 */
	@Override
	public ILCertificate fetchByF_DFILE_ID(long dossierFileId) {
		return fetchByF_DFILE_ID(dossierFileId, true);
	}

	/**
	 * Returns the il certificate where dossierFileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierFileId the dossier file ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching il certificate, or <code>null</code> if a matching il certificate could not be found
	 */
	@Override
	public ILCertificate fetchByF_DFILE_ID(long dossierFileId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierFileId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_DFILE_ID,
					finderArgs, this);
		}

		if (result instanceof ILCertificate) {
			ILCertificate ilCertificate = (ILCertificate)result;

			if ((dossierFileId != ilCertificate.getDossierFileId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ILCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_F_DFILE_ID_DOSSIERFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierFileId);

				List<ILCertificate> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_DFILE_ID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ILCertificatePersistenceImpl.fetchByF_DFILE_ID(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ILCertificate ilCertificate = list.get(0);

					result = ilCertificate;

					cacheResult(ilCertificate);

					if ((ilCertificate.getDossierFileId() != dossierFileId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_DFILE_ID,
							finderArgs, ilCertificate);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DFILE_ID,
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
			return (ILCertificate)result;
		}
	}

	/**
	 * Removes the il certificate where dossierFileId = &#63; from the database.
	 *
	 * @param dossierFileId the dossier file ID
	 * @return the il certificate that was removed
	 */
	@Override
	public ILCertificate removeByF_DFILE_ID(long dossierFileId)
		throws NoSuchILCertificateException {
		ILCertificate ilCertificate = findByF_DFILE_ID(dossierFileId);

		return remove(ilCertificate);
	}

	/**
	 * Returns the number of il certificates where dossierFileId = &#63;.
	 *
	 * @param dossierFileId the dossier file ID
	 * @return the number of matching il certificates
	 */
	@Override
	public int countByF_DFILE_ID(long dossierFileId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DFILE_ID;

		Object[] finderArgs = new Object[] { dossierFileId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ILCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_F_DFILE_ID_DOSSIERFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierFileId);

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

	private static final String _FINDER_COLUMN_F_DFILE_ID_DOSSIERFILEID_2 = "ilCertificate.dossierFileId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APP_REG =
		new FinderPath(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateModelImpl.FINDER_CACHE_ENABLED,
			ILCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_APP_REG",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_REG =
		new FinderPath(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateModelImpl.FINDER_CACHE_ENABLED,
			ILCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_APP_REG",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			ILCertificateModelImpl.SERVICECODE_COLUMN_BITMASK |
			ILCertificateModelImpl.APPLICANTIDNO_COLUMN_BITMASK |
			ILCertificateModelImpl.REGISTRATIONNUMBER_COLUMN_BITMASK |
			ILCertificateModelImpl.VALIDFROM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_APP_REG = new FinderPath(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_APP_REG",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @return the matching il certificates
	 */
	@Override
	public List<ILCertificate> findByF_APP_REG(String serviceCode,
		String applicantIdNo, String registrationNumber) {
		return findByF_APP_REG(serviceCode, applicantIdNo, registrationNumber,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @param start the lower bound of the range of il certificates
	 * @param end the upper bound of the range of il certificates (not inclusive)
	 * @return the range of matching il certificates
	 */
	@Override
	public List<ILCertificate> findByF_APP_REG(String serviceCode,
		String applicantIdNo, String registrationNumber, int start, int end) {
		return findByF_APP_REG(serviceCode, applicantIdNo, registrationNumber,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @param start the lower bound of the range of il certificates
	 * @param end the upper bound of the range of il certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching il certificates
	 */
	@Override
	public List<ILCertificate> findByF_APP_REG(String serviceCode,
		String applicantIdNo, String registrationNumber, int start, int end,
		OrderByComparator<ILCertificate> orderByComparator) {
		return findByF_APP_REG(serviceCode, applicantIdNo, registrationNumber,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @param start the lower bound of the range of il certificates
	 * @param end the upper bound of the range of il certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching il certificates
	 */
	@Override
	public List<ILCertificate> findByF_APP_REG(String serviceCode,
		String applicantIdNo, String registrationNumber, int start, int end,
		OrderByComparator<ILCertificate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_REG;
			finderArgs = new Object[] {
					serviceCode, applicantIdNo, registrationNumber
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_APP_REG;
			finderArgs = new Object[] {
					serviceCode, applicantIdNo, registrationNumber,
					
					start, end, orderByComparator
				};
		}

		List<ILCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<ILCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ILCertificate ilCertificate : list) {
					if (!Objects.equals(serviceCode,
								ilCertificate.getServiceCode()) ||
							!Objects.equals(applicantIdNo,
								ilCertificate.getApplicantIdNo()) ||
							!Objects.equals(registrationNumber,
								ilCertificate.getRegistrationNumber())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_ILCERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_2);
			}

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_2);
			}

			boolean bindRegistrationNumber = false;

			if (registrationNumber == null) {
				query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_1);
			}
			else if (registrationNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_3);
			}
			else {
				bindRegistrationNumber = true;

				query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ILCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

				if (bindRegistrationNumber) {
					qPos.add(registrationNumber);
				}

				if (!pagination) {
					list = (List<ILCertificate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ILCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching il certificate
	 * @throws NoSuchILCertificateException if a matching il certificate could not be found
	 */
	@Override
	public ILCertificate findByF_APP_REG_First(String serviceCode,
		String applicantIdNo, String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator)
		throws NoSuchILCertificateException {
		ILCertificate ilCertificate = fetchByF_APP_REG_First(serviceCode,
				applicantIdNo, registrationNumber, orderByComparator);

		if (ilCertificate != null) {
			return ilCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", registrationNumber=");
		msg.append(registrationNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchILCertificateException(msg.toString());
	}

	/**
	 * Returns the first il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching il certificate, or <code>null</code> if a matching il certificate could not be found
	 */
	@Override
	public ILCertificate fetchByF_APP_REG_First(String serviceCode,
		String applicantIdNo, String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator) {
		List<ILCertificate> list = findByF_APP_REG(serviceCode, applicantIdNo,
				registrationNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching il certificate
	 * @throws NoSuchILCertificateException if a matching il certificate could not be found
	 */
	@Override
	public ILCertificate findByF_APP_REG_Last(String serviceCode,
		String applicantIdNo, String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator)
		throws NoSuchILCertificateException {
		ILCertificate ilCertificate = fetchByF_APP_REG_Last(serviceCode,
				applicantIdNo, registrationNumber, orderByComparator);

		if (ilCertificate != null) {
			return ilCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceCode=");
		msg.append(serviceCode);

		msg.append(", applicantIdNo=");
		msg.append(applicantIdNo);

		msg.append(", registrationNumber=");
		msg.append(registrationNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchILCertificateException(msg.toString());
	}

	/**
	 * Returns the last il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching il certificate, or <code>null</code> if a matching il certificate could not be found
	 */
	@Override
	public ILCertificate fetchByF_APP_REG_Last(String serviceCode,
		String applicantIdNo, String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator) {
		int count = countByF_APP_REG(serviceCode, applicantIdNo,
				registrationNumber);

		if (count == 0) {
			return null;
		}

		List<ILCertificate> list = findByF_APP_REG(serviceCode, applicantIdNo,
				registrationNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the il certificates before and after the current il certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * @param id the primary key of the current il certificate
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next il certificate
	 * @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	 */
	@Override
	public ILCertificate[] findByF_APP_REG_PrevAndNext(long id,
		String serviceCode, String applicantIdNo, String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator)
		throws NoSuchILCertificateException {
		ILCertificate ilCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ILCertificate[] array = new ILCertificateImpl[3];

			array[0] = getByF_APP_REG_PrevAndNext(session, ilCertificate,
					serviceCode, applicantIdNo, registrationNumber,
					orderByComparator, true);

			array[1] = ilCertificate;

			array[2] = getByF_APP_REG_PrevAndNext(session, ilCertificate,
					serviceCode, applicantIdNo, registrationNumber,
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

	protected ILCertificate getByF_APP_REG_PrevAndNext(Session session,
		ILCertificate ilCertificate, String serviceCode, String applicantIdNo,
		String registrationNumber,
		OrderByComparator<ILCertificate> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_ILCERTIFICATE_WHERE);

		boolean bindServiceCode = false;

		if (serviceCode == null) {
			query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_1);
		}
		else if (serviceCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_3);
		}
		else {
			bindServiceCode = true;

			query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_2);
		}

		boolean bindApplicantIdNo = false;

		if (applicantIdNo == null) {
			query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_1);
		}
		else if (applicantIdNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_3);
		}
		else {
			bindApplicantIdNo = true;

			query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_2);
		}

		boolean bindRegistrationNumber = false;

		if (registrationNumber == null) {
			query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_1);
		}
		else if (registrationNumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_3);
		}
		else {
			bindRegistrationNumber = true;

			query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_2);
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
			query.append(ILCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindServiceCode) {
			qPos.add(serviceCode);
		}

		if (bindApplicantIdNo) {
			qPos.add(applicantIdNo);
		}

		if (bindRegistrationNumber) {
			qPos.add(registrationNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(ilCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ILCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63; from the database.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 */
	@Override
	public void removeByF_APP_REG(String serviceCode, String applicantIdNo,
		String registrationNumber) {
		for (ILCertificate ilCertificate : findByF_APP_REG(serviceCode,
				applicantIdNo, registrationNumber, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(ilCertificate);
		}
	}

	/**
	 * Returns the number of il certificates where serviceCode = &#63; and applicantIdNo = &#63; and registrationNumber = &#63;.
	 *
	 * @param serviceCode the service code
	 * @param applicantIdNo the applicant ID no
	 * @param registrationNumber the registration number
	 * @return the number of matching il certificates
	 */
	@Override
	public int countByF_APP_REG(String serviceCode, String applicantIdNo,
		String registrationNumber) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_APP_REG;

		Object[] finderArgs = new Object[] {
				serviceCode, applicantIdNo, registrationNumber
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ILCERTIFICATE_WHERE);

			boolean bindServiceCode = false;

			if (serviceCode == null) {
				query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_1);
			}
			else if (serviceCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_3);
			}
			else {
				bindServiceCode = true;

				query.append(_FINDER_COLUMN_F_APP_REG_SERVICECODE_2);
			}

			boolean bindApplicantIdNo = false;

			if (applicantIdNo == null) {
				query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_1);
			}
			else if (applicantIdNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_3);
			}
			else {
				bindApplicantIdNo = true;

				query.append(_FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_2);
			}

			boolean bindRegistrationNumber = false;

			if (registrationNumber == null) {
				query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_1);
			}
			else if (registrationNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_3);
			}
			else {
				bindRegistrationNumber = true;

				query.append(_FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindServiceCode) {
					qPos.add(serviceCode);
				}

				if (bindApplicantIdNo) {
					qPos.add(applicantIdNo);
				}

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

	private static final String _FINDER_COLUMN_F_APP_REG_SERVICECODE_1 = "ilCertificate.serviceCode IS NULL AND ";
	private static final String _FINDER_COLUMN_F_APP_REG_SERVICECODE_2 = "ilCertificate.serviceCode = ? AND ";
	private static final String _FINDER_COLUMN_F_APP_REG_SERVICECODE_3 = "(ilCertificate.serviceCode IS NULL OR ilCertificate.serviceCode = '') AND ";
	private static final String _FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_1 = "ilCertificate.applicantIdNo IS NULL AND ";
	private static final String _FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_2 = "ilCertificate.applicantIdNo = ? AND ";
	private static final String _FINDER_COLUMN_F_APP_REG_APPLICANTIDNO_3 = "(ilCertificate.applicantIdNo IS NULL OR ilCertificate.applicantIdNo = '') AND ";
	private static final String _FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_1 = "ilCertificate.registrationNumber IS NULL";
	private static final String _FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_2 = "ilCertificate.registrationNumber = ?";
	private static final String _FINDER_COLUMN_F_APP_REG_REGISTRATIONNUMBER_3 = "(ilCertificate.registrationNumber IS NULL OR ilCertificate.registrationNumber = '')";

	public ILCertificatePersistenceImpl() {
		setModelClass(ILCertificate.class);
	}

	/**
	 * Caches the il certificate in the entity cache if it is enabled.
	 *
	 * @param ilCertificate the il certificate
	 */
	@Override
	public void cacheResult(ILCertificate ilCertificate) {
		entityCache.putResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateImpl.class, ilCertificate.getPrimaryKey(),
			ilCertificate);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_DFILE_ID,
			new Object[] { ilCertificate.getDossierFileId() }, ilCertificate);

		ilCertificate.resetOriginalValues();
	}

	/**
	 * Caches the il certificates in the entity cache if it is enabled.
	 *
	 * @param ilCertificates the il certificates
	 */
	@Override
	public void cacheResult(List<ILCertificate> ilCertificates) {
		for (ILCertificate ilCertificate : ilCertificates) {
			if (entityCache.getResult(
						ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
						ILCertificateImpl.class, ilCertificate.getPrimaryKey()) == null) {
				cacheResult(ilCertificate);
			}
			else {
				ilCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all il certificates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ILCertificateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the il certificate.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ILCertificate ilCertificate) {
		entityCache.removeResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateImpl.class, ilCertificate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ILCertificateModelImpl)ilCertificate, true);
	}

	@Override
	public void clearCache(List<ILCertificate> ilCertificates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ILCertificate ilCertificate : ilCertificates) {
			entityCache.removeResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
				ILCertificateImpl.class, ilCertificate.getPrimaryKey());

			clearUniqueFindersCache((ILCertificateModelImpl)ilCertificate, true);
		}
	}

	protected void cacheUniqueFindersCache(
		ILCertificateModelImpl ilCertificateModelImpl) {
		Object[] args = new Object[] { ilCertificateModelImpl.getDossierFileId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_DFILE_ID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_DFILE_ID, args,
			ilCertificateModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ILCertificateModelImpl ilCertificateModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					ilCertificateModelImpl.getDossierFileId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DFILE_ID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DFILE_ID, args);
		}

		if ((ilCertificateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_DFILE_ID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					ilCertificateModelImpl.getOriginalDossierFileId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DFILE_ID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DFILE_ID, args);
		}
	}

	/**
	 * Creates a new il certificate with the primary key. Does not add the il certificate to the database.
	 *
	 * @param id the primary key for the new il certificate
	 * @return the new il certificate
	 */
	@Override
	public ILCertificate create(long id) {
		ILCertificate ilCertificate = new ILCertificateImpl();

		ilCertificate.setNew(true);
		ilCertificate.setPrimaryKey(id);

		return ilCertificate;
	}

	/**
	 * Removes the il certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the il certificate
	 * @return the il certificate that was removed
	 * @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	 */
	@Override
	public ILCertificate remove(long id) throws NoSuchILCertificateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the il certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the il certificate
	 * @return the il certificate that was removed
	 * @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	 */
	@Override
	public ILCertificate remove(Serializable primaryKey)
		throws NoSuchILCertificateException {
		Session session = null;

		try {
			session = openSession();

			ILCertificate ilCertificate = (ILCertificate)session.get(ILCertificateImpl.class,
					primaryKey);

			if (ilCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchILCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ilCertificate);
		}
		catch (NoSuchILCertificateException nsee) {
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
	protected ILCertificate removeImpl(ILCertificate ilCertificate) {
		ilCertificate = toUnwrappedModel(ilCertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ilCertificate)) {
				ilCertificate = (ILCertificate)session.get(ILCertificateImpl.class,
						ilCertificate.getPrimaryKeyObj());
			}

			if (ilCertificate != null) {
				session.delete(ilCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ilCertificate != null) {
			clearCache(ilCertificate);
		}

		return ilCertificate;
	}

	@Override
	public ILCertificate updateImpl(ILCertificate ilCertificate) {
		ilCertificate = toUnwrappedModel(ilCertificate);

		boolean isNew = ilCertificate.isNew();

		ILCertificateModelImpl ilCertificateModelImpl = (ILCertificateModelImpl)ilCertificate;

		Session session = null;

		try {
			session = openSession();

			if (ilCertificate.isNew()) {
				session.save(ilCertificate);

				ilCertificate.setNew(false);
			}
			else {
				ilCertificate = (ILCertificate)session.merge(ilCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ILCertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ilCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_REG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ilCertificateModelImpl.getOriginalServiceCode(),
						ilCertificateModelImpl.getOriginalApplicantIdNo(),
						ilCertificateModelImpl.getOriginalRegistrationNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APP_REG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_REG,
					args);

				args = new Object[] {
						ilCertificateModelImpl.getServiceCode(),
						ilCertificateModelImpl.getApplicantIdNo(),
						ilCertificateModelImpl.getRegistrationNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_F_APP_REG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_APP_REG,
					args);
			}
		}

		entityCache.putResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ILCertificateImpl.class, ilCertificate.getPrimaryKey(),
			ilCertificate, false);

		clearUniqueFindersCache(ilCertificateModelImpl, false);
		cacheUniqueFindersCache(ilCertificateModelImpl);

		ilCertificate.resetOriginalValues();

		return ilCertificate;
	}

	protected ILCertificate toUnwrappedModel(ILCertificate ilCertificate) {
		if (ilCertificate instanceof ILCertificateImpl) {
			return ilCertificate;
		}

		ILCertificateImpl ilCertificateImpl = new ILCertificateImpl();

		ilCertificateImpl.setNew(ilCertificate.isNew());
		ilCertificateImpl.setPrimaryKey(ilCertificate.getPrimaryKey());

		ilCertificateImpl.setId(ilCertificate.getId());
		ilCertificateImpl.setDossierId(ilCertificate.getDossierId());
		ilCertificateImpl.setDossierFileId(ilCertificate.getDossierFileId());
		ilCertificateImpl.setDossierTemplateNo(ilCertificate.getDossierTemplateNo());
		ilCertificateImpl.setDossierPartNo(ilCertificate.getDossierPartNo());
		ilCertificateImpl.setFileTemplateNo(ilCertificate.getFileTemplateNo());
		ilCertificateImpl.setReferenceUid(ilCertificate.getReferenceUid());
		ilCertificateImpl.setServiceCode(ilCertificate.getServiceCode());
		ilCertificateImpl.setValidFrom(ilCertificate.getValidFrom());
		ilCertificateImpl.setValidUntil(ilCertificate.getValidUntil());
		ilCertificateImpl.setTransportOperation(ilCertificate.getTransportOperation());
		ilCertificateImpl.setApplicantName(ilCertificate.getApplicantName());
		ilCertificateImpl.setApplicantIdNo(ilCertificate.getApplicantIdNo());
		ilCertificateImpl.setApplicantAddress(ilCertificate.getApplicantAddress());
		ilCertificateImpl.setApplicantTel(ilCertificate.getApplicantTel());
		ilCertificateImpl.setApplicantFax(ilCertificate.getApplicantFax());
		ilCertificateImpl.setApplicantEmail(ilCertificate.getApplicantEmail());
		ilCertificateImpl.setApplicantWebsite(ilCertificate.getApplicantWebsite());
		ilCertificateImpl.setSignName(ilCertificate.getSignName());
		ilCertificateImpl.setSignTitle(ilCertificate.getSignTitle());
		ilCertificateImpl.setSignPlace(ilCertificate.getSignPlace());
		ilCertificateImpl.setSignDate(ilCertificate.getSignDate());
		ilCertificateImpl.setLicenceNo(ilCertificate.getLicenceNo());
		ilCertificateImpl.setLicenceName(ilCertificate.getLicenceName());
		ilCertificateImpl.setGovAgencyCode(ilCertificate.getGovAgencyCode());
		ilCertificateImpl.setGovAgencyName(ilCertificate.getGovAgencyName());
		ilCertificateImpl.setRegistrationNumber(ilCertificate.getRegistrationNumber());
		ilCertificateImpl.setManufacturedYear(ilCertificate.getManufacturedYear());
		ilCertificateImpl.setTechnicalData(ilCertificate.getTechnicalData());
		ilCertificateImpl.setTrademarkCode(ilCertificate.getTrademarkCode());
		ilCertificateImpl.setTrademarkName(ilCertificate.getTrademarkName());
		ilCertificateImpl.setModel(ilCertificate.getModel());
		ilCertificateImpl.setVehicleType(ilCertificate.getVehicleType());
		ilCertificateImpl.setVehicleColor(ilCertificate.getVehicleColor());
		ilCertificateImpl.setEngineNumber(ilCertificate.getEngineNumber());
		ilCertificateImpl.setChassisNumber(ilCertificate.getChassisNumber());
		ilCertificateImpl.setExpiredDate(ilCertificate.getExpiredDate());
		ilCertificateImpl.setBorderGate(ilCertificate.getBorderGate());
		ilCertificateImpl.setTravelingArea(ilCertificate.getTravelingArea());
		ilCertificateImpl.setDestination(ilCertificate.getDestination());
		ilCertificateImpl.setExtendedUntil(ilCertificate.getExtendedUntil());
		ilCertificateImpl.setNoticesOfExtension(ilCertificate.getNoticesOfExtension());
		ilCertificateImpl.setPurposeOfTheTrip(ilCertificate.getPurposeOfTheTrip());
		ilCertificateImpl.setIssuingDispatchNo(ilCertificate.getIssuingDispatchNo());
		ilCertificateImpl.setOfficialDispatchNo(ilCertificate.getOfficialDispatchNo());
		ilCertificateImpl.setOfficialDispatchDate(ilCertificate.getOfficialDispatchDate());
		ilCertificateImpl.setDepartureFrom(ilCertificate.getDepartureFrom());
		ilCertificateImpl.setDepartureTo(ilCertificate.getDepartureTo());
		ilCertificateImpl.setFromParkingLot(ilCertificate.getFromParkingLot());
		ilCertificateImpl.setFromProvinceCode(ilCertificate.getFromProvinceCode());
		ilCertificateImpl.setFromProvinceName(ilCertificate.getFromProvinceName());
		ilCertificateImpl.setToParkingLot(ilCertificate.getToParkingLot());
		ilCertificateImpl.setToProvinceCode(ilCertificate.getToProvinceCode());
		ilCertificateImpl.setToProvinceName(ilCertificate.getToProvinceName());
		ilCertificateImpl.setDistance(ilCertificate.getDistance());
		ilCertificateImpl.setRouteDescription(ilCertificate.getRouteDescription());
		ilCertificateImpl.setExpImpGateCode(ilCertificate.getExpImpGateCode());
		ilCertificateImpl.setExpImpGate(ilCertificate.getExpImpGate());
		ilCertificateImpl.setItemNo(ilCertificate.getItemNo());
		ilCertificateImpl.setCircularNo(ilCertificate.getCircularNo());
		ilCertificateImpl.setCircularDate(ilCertificate.getCircularDate());
		ilCertificateImpl.setNumberOfVehicle(ilCertificate.getNumberOfVehicle());
		ilCertificateImpl.setToVNAuthority(ilCertificate.getToVNAuthority());
		ilCertificateImpl.setToLAOAuthority(ilCertificate.getToLAOAuthority());
		ilCertificateImpl.setAtParkingLot(ilCertificate.getAtParkingLot());
		ilCertificateImpl.setAtProvinceName(ilCertificate.getAtProvinceName());
		ilCertificateImpl.setNumberOfLot(ilCertificate.getNumberOfLot());
		ilCertificateImpl.setApplicantContactName(ilCertificate.getApplicantContactName());
		ilCertificateImpl.setPassenger(ilCertificate.getPassenger());
		ilCertificateImpl.setCapacity(ilCertificate.getCapacity());
		ilCertificateImpl.setPurpose(ilCertificate.getPurpose());
		ilCertificateImpl.setRoutes(ilCertificate.getRoutes());
		ilCertificateImpl.setGoodsType(ilCertificate.getGoodsType());
		ilCertificateImpl.setStops(ilCertificate.getStops());
		ilCertificateImpl.setLicenceType(ilCertificate.getLicenceType());
		ilCertificateImpl.setSyncDate(ilCertificate.getSyncDate());

		return ilCertificateImpl;
	}

	/**
	 * Returns the il certificate with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the il certificate
	 * @return the il certificate
	 * @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	 */
	@Override
	public ILCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchILCertificateException {
		ILCertificate ilCertificate = fetchByPrimaryKey(primaryKey);

		if (ilCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchILCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ilCertificate;
	}

	/**
	 * Returns the il certificate with the primary key or throws a {@link NoSuchILCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the il certificate
	 * @return the il certificate
	 * @throws NoSuchILCertificateException if a il certificate with the primary key could not be found
	 */
	@Override
	public ILCertificate findByPrimaryKey(long id)
		throws NoSuchILCertificateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the il certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the il certificate
	 * @return the il certificate, or <code>null</code> if a il certificate with the primary key could not be found
	 */
	@Override
	public ILCertificate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
				ILCertificateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ILCertificate ilCertificate = (ILCertificate)serializable;

		if (ilCertificate == null) {
			Session session = null;

			try {
				session = openSession();

				ilCertificate = (ILCertificate)session.get(ILCertificateImpl.class,
						primaryKey);

				if (ilCertificate != null) {
					cacheResult(ilCertificate);
				}
				else {
					entityCache.putResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
						ILCertificateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
					ILCertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ilCertificate;
	}

	/**
	 * Returns the il certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the il certificate
	 * @return the il certificate, or <code>null</code> if a il certificate with the primary key could not be found
	 */
	@Override
	public ILCertificate fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ILCertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ILCertificate> map = new HashMap<Serializable, ILCertificate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ILCertificate ilCertificate = fetchByPrimaryKey(primaryKey);

			if (ilCertificate != null) {
				map.put(primaryKey, ilCertificate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
					ILCertificateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ILCertificate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ILCERTIFICATE_WHERE_PKS_IN);

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

			for (ILCertificate ilCertificate : (List<ILCertificate>)q.list()) {
				map.put(ilCertificate.getPrimaryKeyObj(), ilCertificate);

				cacheResult(ilCertificate);

				uncachedPrimaryKeys.remove(ilCertificate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ILCertificateModelImpl.ENTITY_CACHE_ENABLED,
					ILCertificateImpl.class, primaryKey, nullModel);
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
	 * Returns all the il certificates.
	 *
	 * @return the il certificates
	 */
	@Override
	public List<ILCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the il certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il certificates
	 * @param end the upper bound of the range of il certificates (not inclusive)
	 * @return the range of il certificates
	 */
	@Override
	public List<ILCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the il certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il certificates
	 * @param end the upper bound of the range of il certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of il certificates
	 */
	@Override
	public List<ILCertificate> findAll(int start, int end,
		OrderByComparator<ILCertificate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the il certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of il certificates
	 * @param end the upper bound of the range of il certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of il certificates
	 */
	@Override
	public List<ILCertificate> findAll(int start, int end,
		OrderByComparator<ILCertificate> orderByComparator,
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

		List<ILCertificate> list = null;

		if (retrieveFromCache) {
			list = (List<ILCertificate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ILCERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ILCERTIFICATE;

				if (pagination) {
					sql = sql.concat(ILCertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ILCertificate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ILCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the il certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ILCertificate ilCertificate : findAll()) {
			remove(ilCertificate);
		}
	}

	/**
	 * Returns the number of il certificates.
	 *
	 * @return the number of il certificates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ILCERTIFICATE);

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
		return ILCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the il certificate persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ILCertificateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ILCERTIFICATE = "SELECT ilCertificate FROM ILCertificate ilCertificate";
	private static final String _SQL_SELECT_ILCERTIFICATE_WHERE_PKS_IN = "SELECT ilCertificate FROM ILCertificate ilCertificate WHERE certificateId IN (";
	private static final String _SQL_SELECT_ILCERTIFICATE_WHERE = "SELECT ilCertificate FROM ILCertificate ilCertificate WHERE ";
	private static final String _SQL_COUNT_ILCERTIFICATE = "SELECT COUNT(ilCertificate) FROM ILCertificate ilCertificate";
	private static final String _SQL_COUNT_ILCERTIFICATE_WHERE = "SELECT COUNT(ilCertificate) FROM ILCertificate ilCertificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ilCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ILCertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ILCertificate exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ILCertificatePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}