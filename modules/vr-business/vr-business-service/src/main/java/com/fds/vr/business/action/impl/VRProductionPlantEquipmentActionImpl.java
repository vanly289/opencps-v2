package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRProductionPlantEquipmentAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException;
import com.fds.vr.business.model.VRProductionPlantEquipment;
import com.fds.vr.business.model.impl.VRProductionPlantEquipmentImpl;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

public class VRProductionPlantEquipmentActionImpl implements VRProductionPlantEquipmentAction {

	private static Log _log = LogFactoryUtil.getLog(VRProductionPlantEquipmentActionImpl.class);

	@Override
	public JSONArray findByProductionPlanCode_ProductClassificationCode(String productionPlantCode,
			String productClassificationCode) {

		JSONArray result = JSONFactoryUtil.createJSONArray();

		try {
			List<VRProductionPlantEquipment> dataList = VRProductionPlantEquipmentLocalServiceUtil
					.findByProductionPlanCode(productionPlantCode);

			if (Validator.isNotNull(productClassificationCode)) {
				switch (productClassificationCode) {
				case "XCG":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCG() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCGNK":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCGNK() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "SMRM":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupSMRM() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCH":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCH() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XCN":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXCN() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XMY":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXMY() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				case "XDD":
					for (VRProductionPlantEquipment data : dataList) {

						if (data.getMarkupXDD() == 1) {

							result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class,
									StringPool.BLANK));

						}
					}
					break;
				default:
					for (VRProductionPlantEquipment data : dataList) {

						result.put(
								ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class, StringPool.BLANK));

					}
					break;
				}
			} else {
				for (VRProductionPlantEquipment data : dataList) {

					result.put(ActionUtil.object2Json(data, VRProductionPlantEquipmentImpl.class, StringPool.BLANK));

				}

			}
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}
	
	@Override
	public boolean deleteProductionPlantEquipment(String ids) {

		boolean flag = false;

		long defaultValue = 0;

		long[] idArray = StringUtil.split(ids, defaultValue);

		VRProductionPlantEquipment vrProductionPlantEquipment = null;

		for (long id : idArray) {

			vrProductionPlantEquipment = null;

			try {

				vrProductionPlantEquipment = VRProductionPlantEquipmentLocalServiceUtil
						.getVRProductionPlantEquipment(id);

				VRProductionPlantEquipmentLocalServiceUtil.deleteVRProductionPlantEquipment(vrProductionPlantEquipment);

				flag = true;

			} catch (Exception e) {

				if (e instanceof NoSuchVRProductionPlantEquipmentException) {

					flag = false;

				}

			}

		}

		return flag;
	}

}
