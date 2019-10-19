package com.fds.vr.cop.service.persistence;

import com.fds.vr.cop.model.VRCOPProductionPlantEmployee;
import com.fds.vr.cop.model.VRCOPReportRepository;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEmployeeModel;
import com.fds.vr.cop.xmlmodel.VRCOPReportRepositoryModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.common.APIDateTimeUtils;



public class VRCOPProductionPlantEmployeeUtils {
	
	public VRCOPProductionPlantEmployeeModel mapperModel(VRCOPProductionPlantEmployee input) {

		VRCOPProductionPlantEmployeeModel object = new VRCOPProductionPlantEmployeeModel();

		try {
	
			object.setMtCore(input.getMtCore());
			object.setCOPReportRepositoryID(input.getCOPReportRepositoryID());
			object.setCOPReportNo(input.getCOPReportNo());
			object.setSequenceNo(input.getSequenceNo());
			
			object.setEmployeeName(input.getEmployeeName());
			object.setEmployeeCertificateNo(input.getEmployeeCertificateNo());
			
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
	
	public List<VRCOPProductionPlantEmployeeModel> mapperModel(List<VRCOPProductionPlantEmployee> input) {

		List<VRCOPProductionPlantEmployeeModel> list = new ArrayList<VRCOPProductionPlantEmployeeModel>();
		
		for(VRCOPProductionPlantEmployee  object:input) {
			list.add(mapperModel(object));
		}
		
		return list;
	}


	static Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantEmployeeUtils.class);

}
