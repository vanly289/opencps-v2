package org.opencps.thirdparty.system.service.persistence.impl;

import java.util.List;

import org.opencps.thirdparty.system.model.ViewGiayPhepVanTai;
import org.opencps.thirdparty.system.model.impl.ViewGiayPhepVanTaiImpl;
import org.opencps.thirdparty.system.service.persistence.ViewGiayPhepVanTaiFinder;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;

public class ViewGiayPhepVanTaiFinderImpl extends ViewGiayPhepVanTaiFinderBaseImpl implements ViewGiayPhepVanTaiFinder {

	private static final String SEARCH_GIAY_PHEP = ViewGiayPhepVanTaiFinder.class.getName() + ".searchByGiayPhep";
	
	@SuppressWarnings("unchecked")
	public List<ViewGiayPhepVanTai> searchGiayPhep(long phuongtienId) {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), SEARCH_GIAY_PHEP);
			
			System.out.println(SEARCH_GIAY_PHEP);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);
			q.addEntity("ViewGiayPhepVanTai", ViewGiayPhepVanTaiImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(phuongtienId);

			return (List<ViewGiayPhepVanTai>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

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
