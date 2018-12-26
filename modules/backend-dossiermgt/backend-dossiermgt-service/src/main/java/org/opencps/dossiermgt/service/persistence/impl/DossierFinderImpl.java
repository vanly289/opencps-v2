package org.opencps.dossiermgt.service.persistence.impl;

import java.util.List;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.impl.DossierImpl;
import org.opencps.dossiermgt.service.persistence.DossierFinder;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public class DossierFinderImpl extends DossierFinderBaseImpl implements DossierFinder {

	@SuppressWarnings("unchecked")
	public List<Dossier> getDossiersByAutoEvent(String autoEvent, int start, int end) throws SystemException{

		Session session = null;
		
		String sql = "SELECT {opencps_dossier.*} FROM opencps_dossier " + 
					"LEFT JOIN " + 
					"	opencps_dossieraction ON opencps_dossier.dossieractionId=opencps_dossieraction.dossieractionId " + 
					"LEFT JOIN " + 
					"	opencps_processaction ON opencps_dossieraction.serviceprocessid = opencps_processaction.serviceprocessid " + 
					"WHERE " + 
					"	opencps_dossier.groupId=opencps_processaction.groupId " + 
					"	AND opencps_processaction.preStepCode=opencps_dossieraction.stepCode " + 
					"	AND opencps_processaction.autoEvent = ?";
		try {
			session = openSession();
			
			if(Validator.isNull(autoEvent)) {
				sql = StringUtil.replace(sql, "AND opencps_processaction.autoEvent = ?", StringPool.BLANK);
			}

			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("opencps_dossier", DossierImpl.class);
			
			if(Validator.isNotNull(autoEvent)) {
				QueryPos qPos = QueryPos.getInstance(q);
				qPos.add(autoEvent);
			}

			List<Dossier> dossiers = (List<Dossier>) QueryUtil.list(q, getDialect(), start, end);
			
			return dossiers;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
