package org.opencps.thirdparty.system.service.persistence.impl;

import java.util.Iterator;
import java.util.List;

import org.opencps.thirdparty.system.model.ViewPhuongTien;
import org.opencps.thirdparty.system.model.impl.ViewPhuongTienImpl;
import org.opencps.thirdparty.system.service.persistence.ViewPhuongTienFinder;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class ViewPhuongTienFinderImpl extends ViewPhuongTienFinderBaseImpl implements ViewPhuongTienFinder{
	
	private static final String SEARCH_PHUONGTIEN = ViewPhuongTienFinder.class.getName() + ".searchByPhuongTien";
	private static final String COUNT_PHUONGTIEN = ViewPhuongTienFinder.class.getName() + ".countByPhuongTien";
	
	@SuppressWarnings("unchecked")
	public List<ViewPhuongTien> searchPhuongTien(String keyword, int start, int end) {
		
		Session session = null;
		
		try {
			
			
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), SEARCH_PHUONGTIEN);
			
			if (Validator.isNull(keyword)) {
				sql = StringUtil.replace(sql, "WHERE bienkiemsoat = ?", StringPool.BLANK);
			}
			
			SQLQuery q = session.createSQLQuery(sql);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(keyword)) {
				qPos.add(keyword);
			}

			q.setCacheable(false);
			
			q.addEntity("ViewPhuongTien", ViewPhuongTienImpl.class);

			return (List<ViewPhuongTien>) QueryUtil.list(q, getDialect(), start, end);
			

		} catch (Exception e) {
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public int countPhuongTien(String keyword) {
		
		Session session = null;
		
		try {
			
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), COUNT_PHUONGTIEN);
			
			if (Validator.isNull(keyword)) {
				sql = StringUtil.replace(sql, "WHERE bienkiemsoat = ?", StringPool.BLANK);
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(keyword)) {
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
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
