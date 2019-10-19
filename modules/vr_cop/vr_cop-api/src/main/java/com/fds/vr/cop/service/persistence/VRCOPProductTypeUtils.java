package com.fds.vr.cop.service.persistence;

import com.fds.vr.cop.model.VRCOPProductType;
import com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment;
import com.fds.vr.cop.xmlmodel.VRCOPProductTypeModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.common.APIDateTimeUtils;



public class VRCOPProductTypeUtils {
	
	public VRCOPProductTypeModel mapperModel(VRCOPProductType input) {

		VRCOPProductTypeModel object = new VRCOPProductTypeModel();

		try {
	
			object.setMtCore(input.getMtCore());
			object.setCOPReportRepositoryID(input.getCOPReportRepositoryID());
			object.setCOPReportNo(input.getCOPReportNo());
			object.setSequenceNo(input.getSequenceNo());
			
			object.setVehicleClass(input.getVehicleClass());
			object.setVehicleTypeCode(input.getVehicleTypeCode());
			object.setVehicleTypeDescription(input.getVehicleTypeDescription());
			object.setProductClassificationCode(input.getProductClassificationCode());
			object.setProductClassificationDescription(input.getProductClassificationDescription());
			
			object.setTradeMark(input.getTradeMark());
			object.setTradeMarkName(input.getTradeMarkName());
			object.setCommercialName(input.getCommercialName());
			
			object.setModelCode(input.getModelCode());
			object.setDesignSymbolNo(input.getDesignSymbolNo());
			
			
			object.setSyncDate(Validator.isNotNull(input.getSyncDate()) ? APIDateTimeUtils
					.convertDateToString(input.getSyncDate(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			

		} catch (Exception e) {
			_log.error(e);
		}

		return object;
	}
	
	public List<VRCOPProductTypeModel> mapperModel(List<VRCOPProductType> input) {

		List<VRCOPProductTypeModel> list = new ArrayList<VRCOPProductTypeModel>();
		
		for(VRCOPProductType  object:input) {
			list.add(mapperModel(object));
		}
		
		return list;
	}


	static Log _log = LogFactoryUtil.getLog(VRCOPProductTypeUtils.class);

}
