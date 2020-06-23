/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRHistoryProfileAction;
import com.fds.vr.business.model.VRHistoryProfile;
import com.fds.vr.business.model.impl.VRHistoryProfileModelImpl;
import com.fds.vr.business.service.VRHistoryProfileLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

/**
 * @author ddung
 *
 */
public class VRHistoryProfileActionImpl implements VRHistoryProfileAction {
	
	private static final Log _log = LogFactoryUtil.getLog(VRHistoryProfileActionImpl.class);

	@Override
	public VRHistoryProfile updateVRHistoryProfile(long id, String applicantCode, String productionPlantCode,
			long dossierId, String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate,
			JSONObject formData, Date syncDate, ServiceContext serviceContext) throws IOException {
		File tempFile = File.createTempFile(String.valueOf(System.currentTimeMillis()), StringPool.PERIOD + "txt");
		OutputStream outStream = new FileOutputStream(tempFile);
		byte[] by = formData.toJSONString().getBytes();
		for (int i = 0; i < by.length; i++) {
			byte b = by[i];
			outStream.write(b);
		}
		outStream.close();
		InputStream inputStream = new FileInputStream(tempFile);

		return VRHistoryProfileLocalServiceUtil.updateVRHistoryProfile(id, applicantCode, productionPlantCode,
				dossierId, dossierIdCTN, dossierNo, contentType, contentFileTemplate, inputStream, tempFile.getName(),
				tempFile.length(), null, syncDate, serviceContext);
	}

	@Override
	public JSONObject findVRHistoryProfileApplicantCode(String applicantCode, int start, int end,
			ServiceContext serviceContext) {
		List<VRHistoryProfile> vrHistoryProfiles = VRHistoryProfileLocalServiceUtil.findByApplicantCode(applicantCode,
				start, end);
		return getResult(vrHistoryProfiles);
	}

	@Override
	public JSONObject findVRHitoryProfiles(String applicantCode, String productionPlantCode, long dossierId,
			String dossierIdCTN, String dossierNo, String contentType, String contentFileTemplate, int start, int end) {
		List<VRHistoryProfile> vrHistoryProfiles = VRHistoryProfileLocalServiceUtil.findVRHitoryProfiles(applicantCode,
				productionPlantCode, dossierId, dossierIdCTN, dossierNo, contentType, contentFileTemplate, start, end);
		return getResult(vrHistoryProfiles);
	}

	private JSONObject getResult(List<VRHistoryProfile> vrHistoryProfiles) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		JSONArray array = JSONFactoryUtil.createJSONArray();
		for (VRHistoryProfile vrHistoryProfile : vrHistoryProfiles) {
			try {
				JSONObject obj = BusinessUtil.object2Json_originColumnName(vrHistoryProfile, VRHistoryProfileModelImpl.class,
						StringPool.BLANK);
				File file = FileUploadUtils.getFile(obj.getLong("contentjsonFileEntryId"));
				if (file != null) {
					String stringFile = FileUploadUtils.fileToString(file);
					obj.put("contentjsonFileEntryId", stringFile);
				}
				array.put(obj);
			} catch (Exception e) {
				_log.error(e);
			}
		}
		result.put("total", vrHistoryProfiles.size());
		result.put("data", array);
		return result;
	}

}
