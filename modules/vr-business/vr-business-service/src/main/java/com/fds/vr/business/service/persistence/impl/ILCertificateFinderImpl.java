package com.fds.vr.business.service.persistence.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.fds.vr.business.model.ILCertificate;
import com.fds.vr.business.model.impl.ILCertificateImpl;
import com.fds.vr.business.service.persistence.ILCertificateFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class ILCertificateFinderImpl extends ILCertificateFinderBaseImpl implements ILCertificateFinder {

	private static final Log _log = LogFactoryUtil.getLog(ILCertificateFinderImpl.class);

	private static final String SEARCH_LIENVAN = ILCertificateFinder.class.getName() + ".searchLienVan";
	private static final String COUNT_LIENVAN = ILCertificateFinder.class.getName() + ".countLienVan";
	private static final String SEARCH_GIAYPHEP = ILCertificateFinder.class.getName() + ".searhGiayPhep";
	private static final String COUNT_GIAYPHEP = ILCertificateFinder.class.getName() + ".countGiayPhep";
	private static final String SEARCH_BY_REG_NUMBER = ILCertificateFinder.class.getName() + ".searchCertificateByRegNumber";
	private static final String COUNT_BY_SERVICE_CODE = ILCertificateFinder.class.getName() + ".countByServiceCode";
	
	@SuppressWarnings("unchecked")
	public List<ILCertificate> searchByRegNumber(String keyword, int start, int end) {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), SEARCH_BY_REG_NUMBER);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);
			q.addEntity("il_certificate", ILCertificateImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(keyword);

			return (List<ILCertificate>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return null;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<ILCertificate> searchLienVan(String keyword, int start, int end) {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), SEARCH_LIENVAN);
			
			if (Validator.isNull(keyword)) {
				sql = StringUtil.replace(sql, "(licenceNo = ? OR registrationNumber = ?) AND", StringPool.BLANK);
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);
			q.addEntity("il_certificate", ILCertificateImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(keyword)) {
				qPos.add(keyword);

				qPos.add(keyword);
			}
			
			return (List<ILCertificate>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return null;
	}
	
	@SuppressWarnings("unchecked")
	public int countLienVan(String keyword) {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), COUNT_LIENVAN);
			
			if (Validator.isNull(keyword)) {
				sql = StringUtil.replace(sql, "(licenceNo = ? OR registrationNumber = ?) AND", StringPool.BLANK);
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar("COUNT_VALUE", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(keyword)) {
				qPos.add(keyword);

				qPos.add(keyword);
			}
			
			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return 0;
	}

	@SuppressWarnings("unchecked")
	public List<ILCertificate> searchGiayPhep(String keyword, int start, int end) {

		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(), SEARCH_GIAYPHEP);


			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);
			q.addEntity("il_certificate", ILCertificateImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			keyword = StringPool.PERCENT + keyword + StringPool.PERCENT;

			qPos.add(keyword);

			qPos.add(keyword);


			return (List<ILCertificate>) QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return null;
	}
	
	@SuppressWarnings("unchecked")
	public int countGiayPhep(String keyword) {

		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(), COUNT_GIAYPHEP);

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar("COUNT_VALUE", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(keyword)) {
				qPos.add(keyword);

				qPos.add(keyword);
			}
			
			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return 0;
	}

	@SuppressWarnings("unchecked")
	public List<ILCertificate> findILCertificateByServiceCode(String keywords, String serviceCode, String govAgencyCode,
			String routeCode, String fromDate, String toDate, int start, int limit) {

		Session session = null;
		List<ILCertificate> certList = null;

		// StringBuilder sb = null;
		// String sql = StringPool.BLANK;
		// boolean flagSearch = false;
		// if (Validator.isNotNull(serviceCode) ||
		// Validator.isNotNull(govAgencyCode)) {
		// if (Validator.isNotNull(routeCode) || Validator.isNotNull(keywords))
		// {
		// if (Validator.isNotNull(fromDate) || Validator.isNotNull(toDate)) {
		// flagSearch = true;
		// }
		// }
		// }

		String sql = checkInputSearch(keywords, serviceCode, govAgencyCode, routeCode, fromDate, toDate);
		if (start >= 0 && limit > 0) {
			sql += " LIMIT " + start + ", " + limit + "";
		}

		_log.info("SQL: " + sql);
		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);
//			q.setCacheable(false);
			q.addEntity("il_certificate", ILCertificateImpl.class);

			certList = q.list();
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return certList;
	}

	public long countILCertificateByServiceCode(String keywords, String serviceCode, String govAgencyCode,
			String routeCode, String fromDate, String toDate) {

		Session session = null;
		long total = 0;

		String sql = countCheckInputSearch(keywords, serviceCode, govAgencyCode, routeCode, fromDate, toDate);

		_log.info("SQL: " + sql);
		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);
//			q.setCacheable(false);
			q.addScalar("COUNT_VALUE", Type.LONG);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {

				Long count = itr.next();

				if (count != null) {
					total = count.longValue();
				}
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return total;
	}

	private String checkInputSearch(String keywords, String serviceCode, String govAgencyCode, String routeCode,
			String fromDate, String toDate) {
		StringBuilder sb = new StringBuilder();

		int countCheck = 0;
		if (Validator.isNotNull(keywords)) {
			countCheck = 1;
		} else if (Validator.isNotNull(serviceCode)) {
			countCheck = 2;
		} else if (Validator.isNotNull(govAgencyCode)) {
			countCheck = 3;
		} else if (Validator.isNotNull(routeCode)) {
			countCheck = 4;
		} else if (Validator.isNotNull(fromDate)) {
			countCheck = 5;
		} else if (Validator.isNotNull(toDate)) {
			countCheck = 6;
		}
		_log.info("countCheck: " + countCheck);
		//
		if (countCheck > 0) {
			sb.append("SELECT {il_certificate.*} FROM il_certificate WHERE");
			switch (countCheck) {
			case 1:
				appendKeyWord(sb, keywords, serviceCode, govAgencyCode, routeCode, fromDate, toDate);
				break;
			case 2:
				appendServiceCode(sb, serviceCode, govAgencyCode, routeCode, fromDate, toDate);
				break;
			case 3:
				appendGovAgencyCode(sb, govAgencyCode, routeCode, fromDate, toDate);
				break;
			case 4:
				appendRouteCode(sb, routeCode, fromDate, toDate);
				break;
			case 5:
				appendFromDate(sb, fromDate, toDate);
				break;
			case 6:
				appendToDate(sb, toDate);
				break;
			}
		} else {
			sb.append("SELECT {il_certificate.*} FROM il_certificate");
		}

		return sb.toString();

	}
	
	private String countCheckInputSearch(String keywords, String serviceCode, String govAgencyCode, String routeCode,
			String fromDate, String toDate) {
		StringBuilder sb = new StringBuilder();

		int countCheck = 0;
		if (Validator.isNotNull(keywords)) {
			countCheck = 1;
		} else if (Validator.isNotNull(serviceCode)) {
			countCheck = 2;
		} else if (Validator.isNotNull(govAgencyCode)) {
			countCheck = 3;
		} else if (Validator.isNotNull(routeCode)) {
			countCheck = 4;
		} else if (Validator.isNotNull(fromDate)) {
			countCheck = 5;
		} else if (Validator.isNotNull(toDate)) {
			countCheck = 6;
		}
		_log.info("countCheck: " + countCheck);
		//
		if (countCheck > 0) {
			sb.append("SELECT COUNT(*) AS COUNT_VALUE FROM il_certificate WHERE");
			switch (countCheck) {
			case 1:
				appendKeyWord(sb, keywords, serviceCode, govAgencyCode, routeCode, fromDate, toDate);
				break;
			case 2:
				appendServiceCode(sb, serviceCode, govAgencyCode, routeCode, fromDate, toDate);
				break;
			case 3:
				appendGovAgencyCode(sb, govAgencyCode, routeCode, fromDate, toDate);
				break;
			case 4:
				appendRouteCode(sb, routeCode, fromDate, toDate);
				break;
			case 5:
				appendFromDate(sb, fromDate, toDate);
				break;
			case 6:
				appendToDate(sb, toDate);
				break;
			}
		} else {
			sb.append("SELECT COUNT(*) AS COUNT_VALUE FROM il_certificate");
		}

		return sb.toString();

	}

	private StringBuilder appendKeyWord(StringBuilder sb, String keywords, String serviceCode, String govAgencyCode,
			String routeCode, String fromDate, String toDate) {
		sb.append(" (LOWER(applicantName) LIKE '" + keywords + "'");
		sb.append(" OR LOWER(registrationNumber) LIKE '" + keywords + "'");
		sb.append(" OR LOWER(licenceNo) LIKE '" + keywords + "')");

		if (Validator.isNotNull(serviceCode)) {
			sb.append(" AND serviceCode IN (" + serviceCode + ")");
		}
		if (Validator.isNotNull(govAgencyCode)) {
			sb.append(" AND govAgencyCode = '" + govAgencyCode + "'");
		}
		if (Validator.isNotNull(routeCode)) {
			sb.append(" AND routeCode = '" + routeCode + "'");
		}
		if (Validator.isNotNull(fromDate)) {
			sb.append(" AND DATE(validFrom) = '" + fromDate + "'");
		}
		if (Validator.isNotNull(toDate)) {
			sb.append(" AND DATE(validUntil) = '" + fromDate + "'");
		}
		return sb;
	}

	private StringBuilder appendServiceCode(StringBuilder sb, String serviceCode, String govAgencyCode,
			String routeCode, String fromDate, String toDate) {
		sb.append(" serviceCode IN (" + serviceCode + ")");
		if (Validator.isNotNull(govAgencyCode)) {
			sb.append(" AND govAgencyCode = '" + govAgencyCode + "'");
		}
		if (Validator.isNotNull(routeCode)) {
			sb.append(" AND routeCode = '" + routeCode + "'");
		}
		if (Validator.isNotNull(fromDate)) {
			sb.append(" AND DATE(validFrom) = '" + fromDate + "'");
		}
		if (Validator.isNotNull(toDate)) {
			sb.append(" AND DATE(validUntil) = '" + fromDate + "'");
		}
		return sb;
	}

	private StringBuilder appendGovAgencyCode(StringBuilder sb, String govAgencyCode, String routeCode, String fromDate,
			String toDate) {
		sb.append(" govAgencyCode = '" + govAgencyCode + "'");
		if (Validator.isNotNull(routeCode)) {
			sb.append(" AND routeCode = '" + routeCode + "'");
		}
		if (Validator.isNotNull(fromDate)) {
			sb.append(" AND DATE(validFrom) = '" + fromDate + "'");
		}
		if (Validator.isNotNull(toDate)) {
			sb.append(" AND DATE(validUntil) = '" + fromDate + "'");
		}
		return sb;
	}

	private StringBuilder appendRouteCode(StringBuilder sb, String routeCode, String fromDate, String toDate) {
		sb.append(" routeCode = '" + routeCode + "'");
		if (Validator.isNotNull(fromDate)) {
			sb.append(" AND DATE(validFrom) = '" + fromDate + "'");
		}
		if (Validator.isNotNull(toDate)) {
			sb.append(" AND DATE(validUntil) = '" + fromDate + "'");
		}
		return sb;
	}

	private StringBuilder appendFromDate(StringBuilder sb, String fromDate, String toDate) {
		sb.append(" DATE(validFrom) = '" + fromDate + "'");
		if (Validator.isNotNull(toDate)) {
			sb.append(" AND DATE(validUntil) = '" + fromDate + "'");
		}
		return sb;
	}

	private StringBuilder appendToDate(StringBuilder sb, String toDate) {
		return sb.append(" DATE(validUntil) = '" + toDate + "'");
	}

	@SuppressWarnings("unchecked")
	public List<ILCertificate> findILCertificateByApplicant(String serviceCode, String applicant) {

		Session session = null;
		List<ILCertificate> certList = null;

		String sql = "SELECT {il_certificate.*} FROM il_certificate" + " WHERE serviceCode = '" + serviceCode + "'"
				+ " AND validFrom IN ("
				+ "SELECT MAX(validFrom) FROM il_certificate GROUP BY applicantIdNo) AND applicantIdNo='" + applicant
				+ "'";
		_log.info("SQL: " + sql);
		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("il_certificate", ILCertificateImpl.class);

			certList = q.list();
			// _log.info("SQL list deliverable: "+ deliverableList);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return certList;
	}

	public long countILCertificateByApplicant(String serviceCode, String applicant) {

		Session session = null;
		long total = 0;

		String sql = "SELECT COUNT(*) AS COUNT_VALUE FROM il_certificate" + " WHERE serviceCode = '" + serviceCode + "'"
				+ " AND validFrom IN ("
				+ "SELECT MAX(validFrom) FROM il_certificate GROUP BY applicantIdNo) AND applicantIdNo='" + applicant
				+ "'";

		_log.info("SQL: " + sql);
		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);
//			q.setCacheable(false);
			q.addScalar("COUNT_VALUE", Type.LONG);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {

				Long count = itr.next();

				if (count != null) {
					total = count.longValue();
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return total;
	}
	
	public int countByServiceCode(String govAgencyCode, String[] serviceCodes, Date fromDate, Date toDate) {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), COUNT_BY_SERVICE_CODE);
			
			if(serviceCodes != null && serviceCodes.length > 0) {
				
				StringBundler sb = new StringBundler(2 * serviceCodes.length - 1);

				for (int i = 0; i < serviceCodes.length; i++) {
					if (i != 0) {
						sb.append(",");
					}

					sb.append("'");
					sb.append(serviceCodes[i]);
					sb.append("'");
				}
				
				sql = StringUtil.replace(sql, "[$SERVICE_CODE$]", StringUtil.lowerCase(sb.toString()));
			} else {
				sql = StringUtil.replace(sql, "AND (serviceCode IN ([$SERVICE_CODE$]))", StringPool.BLANK);
			}
			
			Timestamp fromDateLT_TS = null;
			if(fromDate != null) {
				fromDateLT_TS = CalendarUtil.getTimestamp(fromDate);
			}
			
			if(fromDateLT_TS == null) {
				sql = StringUtil.replace(sql, "AND (signDate >= ?)", StringPool.BLANK);
			}
			
			Timestamp toDateLT_TS = null;
			if(toDate != null) {
				toDateLT_TS = CalendarUtil.getTimestamp(toDate);
			}
			
			if(toDateLT_TS == null) {
				sql = StringUtil.replace(sql, "AND (signDate <= ?)", StringPool.BLANK);
			}
			
			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar("COUNT_VALUE", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(govAgencyCode);

			if(fromDateLT_TS != null) {
				qPos.add(fromDateLT_TS);
			}
			
			if(toDateLT_TS != null) {
				qPos.add(toDateLT_TS);
			}
			
			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return 0;
	}

}
