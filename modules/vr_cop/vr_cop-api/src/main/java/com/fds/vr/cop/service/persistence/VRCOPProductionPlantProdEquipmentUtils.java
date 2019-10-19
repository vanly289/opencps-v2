package com.fds.vr.cop.service.persistence;

import com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantProdEquipmentModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.common.APIDateTimeUtils;



public class VRCOPProductionPlantProdEquipmentUtils {
	
	public VRCOPProductionPlantProdEquipmentModel mapperModel(VRCOPProductionPlantProdEquipment input) {

		VRCOPProductionPlantProdEquipmentModel object = new VRCOPProductionPlantProdEquipmentModel();

		try {
	
			object.setMtCore(input.getMtCore());
			object.setCOPReportRepositoryID(input.getCOPReportRepositoryID());
			object.setCOPReportNo(input.getCOPReportNo());
			object.setSequenceNo(input.getSequenceNo());
			
			object.setEquipmentCode(input.getEquipmentCode());
			object.setEquipmentName(input.getEquipmentName());
			object.setEquipmentType(input.getEquipmentType());
			object.setEquipmentStatus(input.getEquipmentStatus());
			
			object.setTradeMark(input.getTradeMark());
			object.setTradeMarkName(input.getTradeMarkName());
			object.setCommercialName(input.getCommercialName());
			
			object.setModelCode(input.getModelCode());
			object.setDesignSymbolNo(input.getDesignSymbolNo());
			object.setProductionCountryCode(input.getProductionCountryCode());
			

			object.setModifyDate(Validator.isNotNull(input.getModifyDate()) ? APIDateTimeUtils
					.convertDateToString(input.getModifyDate(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			
			object.setSyncDate(Validator.isNotNull(input.getSyncDate()) ? APIDateTimeUtils
					.convertDateToString(input.getSyncDate(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			

		} catch (Exception e) {
			_log.error(e);
		}

		return object;
	}
	
	public List<VRCOPProductionPlantProdEquipmentModel> mapperModel(List<VRCOPProductionPlantProdEquipment> input) {

		List<VRCOPProductionPlantProdEquipmentModel> list = new ArrayList<VRCOPProductionPlantProdEquipmentModel>();
		
		for(VRCOPProductionPlantProdEquipment  object:input) {
			list.add(mapperModel(object));
		}
		
		return list;
	}


	static Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantProdEquipmentUtils.class);

}
