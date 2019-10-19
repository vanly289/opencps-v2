package com.fds.vr.cop.service.persistence;

import com.fds.vr.cop.model.VRCOPReportRepository;
import com.fds.vr.cop.xmlmodel.VRCOPReportRepositoryModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.common.APIDateTimeUtils;



public class VRCOPReportRepositoryUtils {
	
	public VRCOPReportRepositoryModel mapperModel(VRCOPReportRepository input) {

		VRCOPReportRepositoryModel object = new VRCOPReportRepositoryModel();

		try {
			
			if(Validator.isNotNull(input)) {
				
				object.setMtCore(input.getMtCore());
				object.setApplicantProfileId(input.getApplicantProfileId());
				object.setApplicantCode(input.getApplicantCode());
				object.setApplicantAddress(input.getApplicantAddress());
				object.setApplicantName(input.getApplicantName());
				
				object.setOverseasManufacturerCode(input.getOverseasManufacturerCode());
				object.setOverseasManufacturerName(input.getOverseasManufacturerName());
				object.setOverseasManufacturerAddress(input.getOverseasManufacturerAddress());
				
				object.setProductionPlantId(input.getProductionPlantId());
				object.setProductionPlantCode(input.getProductionPlantCode());
				object.setProductionPlantName(input.getProductionPlantName());
				object.setProductionPlantAddress(input.getProductionPlantAddress());
				
				object.setCOPFileEntryId(input.getCOPFileEntryId());
				object.setCOPReportApprovedDate(Validator.isNotNull(input.getCOPReportApprovedDate()) ? APIDateTimeUtils
						.convertDateToString(input.getCOPReportApprovedDate(), APIDateTimeUtils._NORMAL_PARTTERN)
						: StringPool.BLANK);
				object.setCOPReportDate(Validator.isNotNull(input.getCOPReportDate()) ? APIDateTimeUtils
						.convertDateToString(input.getCOPReportDate(), APIDateTimeUtils._NORMAL_PARTTERN)
						: StringPool.BLANK);
				object.setCOPReportExpiredDate(Validator.isNotNull(input.getCOPReportExpiredDate()) ? APIDateTimeUtils
						.convertDateToString(input.getCOPReportExpiredDate(), APIDateTimeUtils._NORMAL_PARTTERN)
						: StringPool.BLANK);
				object.setCOPReportMetadata(input.getCOPReportMetadata());
				object.setCOPReportNo(input.getCOPReportNo());
				object.setCOPReportSignName(input.getCOPReportSignName());
				object.setCOPReportSignPlace(input.getCOPReportSignPlace());
				object.setCOPReportSignTitle(input.getCOPReportSignTitle());
				object.setCOPReportStatus(input.getCOPReportStatus());
				object.setCOPReportType(input.getCOPReportType());
				
				object.setModifyDate(Validator.isNotNull(input.getModifyDate()) ? APIDateTimeUtils
						.convertDateToString(input.getModifyDate(), APIDateTimeUtils._NORMAL_PARTTERN)
						: StringPool.BLANK);
				
				object.setSyncDate(Validator.isNotNull(input.getSyncDate()) ? APIDateTimeUtils
						.convertDateToString(input.getSyncDate(), APIDateTimeUtils._NORMAL_PARTTERN)
						: StringPool.BLANK);
			}
			

		} catch (Exception e) {
			_log.error(e);
		}

		return object;
	}
	
	public List<VRCOPReportRepositoryModel> mapperModel(List<VRCOPReportRepository> input) {

		List<VRCOPReportRepositoryModel> list = new ArrayList<VRCOPReportRepositoryModel>();
		
		for(VRCOPReportRepository  object:input) {
			list.add(mapperModel(object));
		}
		
		return list;
	}


	static Log _log = LogFactoryUtil.getLog(VRCOPReportRepositoryUtils.class);

}
