package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionClassificationAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRProductionClassification;
import com.fds.vr.business.model.impl.VRProductionClassificationImpl;
import com.fds.vr.business.service.VRProductionClassificationLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.List;

/**
 * @author trungnt
 *
 */
public class VRProductionClassificationActionImpl implements VRProductionClassificationAction{
	private Log _log = LogFactoryUtil.getLog(VRProductionClassificationActionImpl.class);
	@Override
	public JSONArray findVRProductionClassification(String productionPlantCode) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		try {
			List<VRProductionClassification> vrProductionClassifications = VRProductionClassificationLocalServiceUtil
					.findByProductionPlantCode(productionPlantCode);

			for (VRProductionClassification vrProductionClassification : vrProductionClassifications) {

				result.put(ActionUtil.object2Json(vrProductionClassification, VRProductionClassificationImpl.class, StringPool.BLANK));
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
}
