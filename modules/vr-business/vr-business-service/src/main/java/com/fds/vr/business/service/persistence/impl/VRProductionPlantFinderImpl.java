package com.fds.vr.business.service.persistence.impl;

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.model.impl.VRProductionPlantModelImpl;
import com.fds.vr.business.service.persistence.VRProductionPlantFinder;
import com.fds.vr.service.util.BusinessUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Iterator;
import java.util.List;

public class VRProductionPlantFinderImpl extends VRProductionPlantFinderBaseImpl implements VRProductionPlantFinder {

	Log log = LogFactoryUtil.getLog(VRProductionPlantFinderImpl.class);

	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		Session session = null;
		JSONArray results = JSONFactoryUtil.createJSONArray();
		try {
			session = openSession();

			log.info("===>>>>>>>>>>>>> VRProductionPlantFinder " + sql + "|" + start + "|" + end);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);

			if (Validator.isNotNull(modelClassName) && modelClazz != null) {
				q.addEntity(modelClassName, modelClazz);
				List<VRProductionPlant> vrProductionPlants = (List<VRProductionPlant>) QueryUtil.list(q, getDialect(),
						start, end);
				
				if (vrProductionPlants != null) {
					for (VRProductionPlant vrProductionPlant : vrProductionPlants) {
						JSONObject json = BusinessUtil.object2Json_originColumnName(vrProductionPlant, VRProductionPlantModelImpl.class,
								"");
						results.put(json);
					}
				}
			} else {

				if (columnNames.size() > 1) {
					Iterator<Object[]> itr = (Iterator<Object[]>) QueryUtil.iterate(q, getDialect(), start, end);

					if (itr.hasNext()) {
						while (itr.hasNext()) {
							Object[] objects = itr.next();
							JSONObject json = ActionUtil.array2Json_originColumnName(objects, columnNames, dataTypes);
							results.put(json);
						}

					}
				} else if (columnNames.size() == 1) {
					Iterator itr = QueryUtil.iterate(q, getDialect(), start, end);

					if (itr.hasNext()) {
						while (itr.hasNext()) {

							JSONObject json = JSONFactoryUtil.createJSONObject();
							json.put(columnNames.get(0), itr.next());
							results.put(json);
						}

					}
				}
			}

			return results;
		} catch (Exception e) {
			log.info(e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public long countData(String sql) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			log.info("===>>>VRProductionPlantFinder " + sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);

			q.addScalar("total", Type.LONG);

			Iterator<Long> itr = q.list().iterator();

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
