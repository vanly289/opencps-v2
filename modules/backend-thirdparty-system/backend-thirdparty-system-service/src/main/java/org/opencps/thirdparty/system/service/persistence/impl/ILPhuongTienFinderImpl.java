package org.opencps.thirdparty.system.service.persistence.impl;

import java.util.List;

import org.opencps.thirdparty.system.model.ILPhuongTien;
import org.opencps.thirdparty.system.model.impl.ILDoanhNghiepImpl;
import org.opencps.thirdparty.system.service.persistence.ILPhuongTienFinder;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class ILPhuongTienFinderImpl extends ILPhuongTienFinderBaseImpl implements ILPhuongTienFinder{
	private static final String SEARCH_PHUONGTIEN = ILPhuongTienFinder.class.getName() + ".searchByPhuongTien";
	
	@SuppressWarnings("unchecked")
	public List<ILPhuongTien> searchPhuongTien(String keyword, int start, int end) {
		
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
			
			q.addEntity("ILDoanhNghiep", ILDoanhNghiepImpl.class);

			return (List<ILPhuongTien>) QueryUtil.list(q, getDialect(), start, end);
			

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
