package com.fds.vr.business.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fds.vr.business.model.VRInputStampbookDetails;
import com.fds.vr.business.model.impl.VRInputStampbookDetailsImpl;
import com.fds.vr.business.service.persistence.VRInputStampbookDetailsFinder;


public class VRInputStampbookDetailsFinderImpl extends VRInputStampbookDetailsFinderBaseImpl
	implements VRInputStampbookDetailsFinder {

	private static final Log _log = LogFactoryUtil.getLog(VRInputStampbookDetailsFinderImpl.class);

	public Long[] findStartNoEndNoBySequence(long inputStampbookId) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT MIN(sequenceNo) as start, MAX(sequenceNo) as end FROM vr_inputstampbookdetails ");			
			query.append("WHERE issuingStatus = 0 AND bookId = ? ORDER BY ID ");		
			
					
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("start", Type.LONG);
			q.addScalar("end", Type.LONG);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(inputStampbookId);
			
			long start = 0;
			long end = 0;
			
			Iterator<Object[]> itr = q.iterate();

			if (itr.hasNext()) {
				Object[] value = itr.next();

				if (value != null) {
					start = GetterUtil.getLong(value[0]);
					end = GetterUtil.getLong(value[1]);
				}
			}
			
			return new Long[]{start, end};
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<Object[]> findStampbookByVehicleClass(String vehicleClass, long corporationId) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT vr_inputstampbook.bookId, vr_inputstampbook.stampShortNo, MIN(vr_inputstampbookdetails.sequenceNo) AS start, MAX(vr_inputstampbookdetails.sequenceNo) AS end FROM vr_inputstampbook  ");
			query.append("LEFT JOIN vr_inputstampbookdetails  ");
			query.append("ON vr_inputstampbook.id = vr_inputstampbookdetails.bookid ");
			query.append("WHERE (vr_inputstampbookdetails.issuingStatus = 0 OR vr_inputstampbookdetails.issuingStatus = 1) AND vr_inputstampbook.vehicleClass = ? AND vr_inputstampbookdetails.corporationId = ? GROUP BY vr_inputstampbook.bookid ");
			
					
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("bookId", Type.LONG);
			q.addScalar("stampShortNo", Type.STRING);
			q.addScalar("start", Type.LONG);
			q.addScalar("end", Type.LONG);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(vehicleClass);
			qPos.add(corporationId);
			
			return (List<Object[]>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
}
