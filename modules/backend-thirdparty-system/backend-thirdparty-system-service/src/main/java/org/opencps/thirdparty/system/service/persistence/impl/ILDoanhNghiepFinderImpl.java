package org.opencps.thirdparty.system.service.persistence.impl;

import java.util.List;

import org.opencps.thirdparty.system.model.ILDoanhNghiep;
import org.opencps.thirdparty.system.model.impl.ILDoanhNghiepImpl;
import org.opencps.thirdparty.system.service.persistence.ILDoanhNghiepFinder;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;

public class ILDoanhNghiepFinderImpl extends ILDoanhNghiepFinderBaseImpl implements ILDoanhNghiepFinder {
	
	private static final String SEARCH_DOANHNGHIEP = ILDoanhNghiepFinder.class.getName() + ".searchDoanhNghiep";
	
	@SuppressWarnings("unchecked")
	public List<ILDoanhNghiep> searchDoanhNghiep(String keyword, int start, int end) {
		
		Session session = null;
		
		keyword = StringPool.PERCENT + keyword + StringPool.PERCENT;
		
		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), SEARCH_DOANHNGHIEP);
			
			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);
			q.addEntity("ILDoanhNghiep", ILDoanhNghiepImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(keyword);

			qPos.add(keyword);

			qPos.add(keyword);
			
			return (List<ILDoanhNghiep>) QueryUtil.list(q, getDialect(), start, end);
			

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
	
}
