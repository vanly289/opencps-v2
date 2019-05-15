package com.fds.vr.business.service.persistence.impl;

import java.util.List;

import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.model.impl.VRCorporationAttendeeImpl;
import com.fds.vr.business.service.persistence.VRCorporationAttendeeFinder;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;


public class VRCorporationAttendeeFinderImpl extends VRCorporationAttendeeFinderBaseImpl
	implements VRCorporationAttendeeFinder {

	Log log = LogFactoryUtil.getLog(VRCorporationAttendeeFinderImpl.class);

	public List<VRCorporationAttendee> findByUserId(long mtCore, long userId, String startDate, String endDate) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_corporation_attendee.*} FROM vr_corporation_attendee ");
			query.append("WHERE vr_corporation_attendee.mtCore = "+mtCore+" AND ");
			query.append("(vr_corporation_attendee.leaderId = "+userId+" OR vr_corporation_attendee.managerId = "+userId+") ");

			if (Validator.isNotNull(startDate)) {
				query.append("AND Date(vr_corporation_attendee.inspectionDate) >= '"+startDate+"' ");
				if (Validator.isNotNull(endDate)) {
					query.append("AND Date(vr_corporation_attendee.inspectionDate) <= '"+endDate+"'");
				}
			} else {
				if (Validator.isNotNull(endDate)) {
					query.append("AND Date(vr_corporation_attendee.inspectionDate) <= '"+endDate+"'");
				}
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("vr_corporation_attendee", VRCorporationAttendeeImpl.class);
			
			log.info("=========findByMappingApplicantProfile===" + query.toString() );

			return (List<VRCorporationAttendee>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}

		return null;
	}

}
