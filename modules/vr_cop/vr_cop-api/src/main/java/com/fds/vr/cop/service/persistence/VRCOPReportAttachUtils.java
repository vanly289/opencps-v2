package com.fds.vr.cop.service.persistence;

import com.fds.vr.cop.model.VRCOPProductType;
import com.fds.vr.cop.model.VRCOPReportAttach;
import com.fds.vr.cop.xmlmodel.VRCOPReportAttachModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.common.APIDateTimeUtils;



public class VRCOPReportAttachUtils {
	
	public VRCOPReportAttachModel mapperModel(VRCOPReportAttach input) {

		VRCOPReportAttachModel object = new VRCOPReportAttachModel();

		try {
	
			object.setMtCore(input.getMtCore());
			object.setCOPReportRepositoryID(input.getCOPReportRepositoryID());
			object.setCOPReportNo(input.getCOPReportNo());
			object.setSequenceNo(input.getSequenceNo());
			
			object.setDocName(input.getDocName());
			object.setDocNo(input.getDocNo());
			object.setRemarks(input.getRemarks());
			
			
			
			object.setModifyDate(Validator.isNotNull(input.getModifyDate()) ? APIDateTimeUtils
					.convertDateToString(input.getModifyDate(), APIDateTimeUtils._NORMAL_PARTTERN)
					: StringPool.BLANK);
			

		} catch (Exception e) {
			_log.error(e);
		}
		return object;
	}
	
	public List<VRCOPReportAttachModel> mapperModel(List<VRCOPReportAttach> input) {

		List<VRCOPReportAttachModel> list = new ArrayList<VRCOPReportAttachModel>();
		
		for(VRCOPReportAttach  object:input) {
			list.add(mapperModel(object));
		}
		
		return list;
	}


	static Log _log = LogFactoryUtil.getLog(VRCOPReportAttachUtils.class);

}
