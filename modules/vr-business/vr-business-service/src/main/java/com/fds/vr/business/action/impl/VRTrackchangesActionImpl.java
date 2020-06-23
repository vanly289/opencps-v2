/**
 * 
 */
package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRTrackchangesAction;
import com.fds.vr.business.model.VRTrackchanges;
import com.fds.vr.business.model.impl.VRTrackchangesModelImpl;
import com.fds.vr.business.service.VRTrackchangesLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.json.JSONException;
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

/**
 * @author ddung
 *
 */
public class VRTrackchangesActionImpl implements VRTrackchangesAction {
	
	private static final Log _log = LogFactoryUtil.getLog(VRTrackchangesActionImpl.class);

	@Override
	public VRTrackchanges updateVRTrackchanges(long id, String applicantCode, String productionPlantCode,
			long dossierId, String dossierIdCTN, String dossierNo, String contentType, JSONObject formData,
			Date syncDate, ServiceContext serviceContext) throws IOException {
		File tempFile = File.createTempFile(String.valueOf(System.currentTimeMillis()), StringPool.PERIOD + "txt");
		OutputStream outStream = new FileOutputStream(tempFile);
		byte[] by = formData.toJSONString().getBytes();
		for (int i = 0; i < by.length; i++) {
			byte b = by[i];
			outStream.write(b);
		}
		outStream.close();
		InputStream inputStream = new FileInputStream(tempFile);

		return VRTrackchangesLocalServiceUtil.updateVRTrackchanges(id, applicantCode, productionPlantCode, dossierId,
				dossierIdCTN, dossierNo, contentType, inputStream, tempFile.getName(), tempFile.length(), null,
				syncDate, serviceContext);
	}

	@Override
	public JSONObject findByApplicantCode(String applicantCode, ServiceContext serviceContext) {
		VRTrackchanges vrTrackchanges = VRTrackchangesLocalServiceUtil.findByApplicantCode(applicantCode);
		return getResult(vrTrackchanges);
	}

	@Override
	public JSONObject findByProductionPlantCode(String productionPlantCode, ServiceContext serviceContext) {
		VRTrackchanges vrTrackchanges = VRTrackchangesLocalServiceUtil.findByProductionPlantCode(productionPlantCode);
		return getResult(vrTrackchanges);
	}

	@Override
	public JSONObject findByDossierId(long dossierId, ServiceContext serviceContext) {
		VRTrackchanges vrTrackchanges = VRTrackchangesLocalServiceUtil.findByDossierId(dossierId);
		return getResult(vrTrackchanges);
	}

	private JSONObject getResult(VRTrackchanges vrTrackchanges) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			result = BusinessUtil.object2Json_originColumnName(vrTrackchanges, VRTrackchangesModelImpl.class, StringPool.BLANK);
			if (result != null && result.length() > 0) {
				File previousFile = FileUploadUtils.getFile(result.getLong("previousContentFileEntryId"));
				if (previousFile != null) {
					String previousContent = FileUploadUtils.fileToString(previousFile);
					result.put("previousContentFileEntryId", previousContent);
				}
				File currentFile = FileUploadUtils.getFile(result.getLong("currentContentFileEntryId"));
				if (currentFile != null) {
					String currentContent = FileUploadUtils.fileToString(currentFile);
					result.put("currentContentFileEntryId", currentContent);
				}
				File nextFile = FileUploadUtils.getFile(result.getLong("nextContentFileEntryId"));
				if (nextFile != null) {
					String nextContent = FileUploadUtils.fileToString(nextFile);
					result.put("nextContentFileEntryId", nextContent);
				}
			}
		} catch (JSONException e) {
			_log.error(e);
		}
		return result;
	}
}
