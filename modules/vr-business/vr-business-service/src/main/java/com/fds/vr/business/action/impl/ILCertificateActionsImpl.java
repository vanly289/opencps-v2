package com.fds.vr.business.action.impl;

import java.util.Date;
import java.util.List;

import com.fds.vr.business.action.ILCertificateActions;
import com.fds.vr.business.model.ILCertificate;
import com.fds.vr.business.model.ILVehicleCustomsBorderGuard;
import com.fds.vr.business.service.ILCertificateLocalServiceUtil;
import com.fds.vr.business.service.ILVehicleCustomsBorderGuardLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class ILCertificateActionsImpl implements ILCertificateActions {

	@Override
	public JSONObject getDocAcceptList(String keywords, String serviceCode, String govAgencyCode,
			String routeCode, String fromDate, String toDate, int start, int limit) {

		JSONObject jsonData = JSONFactoryUtil.createJSONObject();
		
		List<ILCertificate> dataList = ILCertificateLocalServiceUtil.getDocAcceptList(keywords, serviceCode, govAgencyCode, routeCode, fromDate,
				toDate, start, limit);
		jsonData.put("data", dataList);

		long total = ILCertificateLocalServiceUtil.countDocAcceptList(keywords, serviceCode, govAgencyCode, routeCode, fromDate,
				toDate);
		jsonData.put("total", total);

		return jsonData;
	}

	@Override
	public ILCertificate getDetailCert(long certificateId) {
		return ILCertificateLocalServiceUtil.fetchILCertificate(certificateId);
	}

	@Override
	public List<ILVehicleCustomsBorderGuard> getBorderGuardList(String registrationNumber, int start, int end) {
		return ILVehicleCustomsBorderGuardLocalServiceUtil.getBorderGuardList(registrationNumber, start, end);
	}

	@Override
	public ILVehicleCustomsBorderGuard addCustomBorderGuard(String registrationNumber, String expImpGateType,
			String expImpGateCode,
			String expImpGate, String driverName, String driverLicenceNo, Date regDate) {

		return ILVehicleCustomsBorderGuardLocalServiceUtil.addCustomBorderGuard(registrationNumber, expImpGateType,
				expImpGateCode,
				expImpGate, driverName, driverLicenceNo, regDate);

	}

	@Override
	public ILCertificate getCertByValidFrom(String serviceCode, String applicant, String regSearch) {
		ILCertificate certInfo = null;

		List<ILCertificate> certList = ILCertificateLocalServiceUtil.getCertByValidFrom(serviceCode, applicant,
				regSearch);
		if (certList != null && certList.size() > 0) {
			certInfo = certList.get(0);
		}

		return certInfo;

	}

	@Override
	public JSONObject getCertByApplicant(String serviceCode, String applicant) {
		JSONObject jsonData = JSONFactoryUtil.createJSONObject();
		
		List<ILCertificate> dataList = ILCertificateLocalServiceUtil.getByApplicant(serviceCode, applicant);
		jsonData.put("data", dataList);

		long total = ILCertificateLocalServiceUtil.countByApplicant(serviceCode, applicant);
		jsonData.put("total", total);

		return jsonData;
	}

	@Override
	public long countBorderGuardList(String registrationNumber) {
		return ILVehicleCustomsBorderGuardLocalServiceUtil.countBorderGuardList(registrationNumber);
	}

}
