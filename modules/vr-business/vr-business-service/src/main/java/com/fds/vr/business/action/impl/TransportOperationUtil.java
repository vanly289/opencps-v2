package com.fds.vr.business.action.impl;

import org.opencps.dossiermgt.model.Dossier;

import com.liferay.portal.kernel.json.JSONObject;

public class TransportOperationUtil {
	public static String getTransportOperation(JSONObject jsonData, Dossier dossier) {
		StringBuilder result = new StringBuilder(); 
		if (dossier.getServiceCode().equals("BGTVT0600001")
				|| dossier.getServiceCode().equals("BGTVT0600002")
				|| dossier.getServiceCode().equals("BGTVT0600003")
				|| dossier.getServiceCode().equals("BGTVT0600004")
				|| dossier.getServiceCode().equals("BGTVT0600004")
				|| dossier.getServiceCode().equals("BGTVT0600019")
				|| dossier.getServiceCode().equals("BGTVT0600020")
				|| dossier.getServiceCode().equals("BGTVT0600021")
				|| dossier.getServiceCode().equals("BGTVT0600022")) {
			if (jsonData.has("IsFixedRoadTransport") && "1".equals(jsonData.get("IsFixedRoadTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải hành khách bằng ô tô theo tuyến cố định");
				}
				else {
					result.append(",Vận tải hành khách bằng ô tô theo tuyến cố định");
				}
			}
			if (jsonData.has("IsContractRoadTransport") && "1".equals(jsonData.get("IsContractRoadTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải hành khách theo hợp đồng");
				}
				else {
					result.append(",Vận tải hành khách theo hợp đồng");
				}
			}
			if (jsonData.has("IsPassengerTransport") && "1".equals(jsonData.get("IsPassengerTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải khách du lịch bằng xe ô tô");
				}
				else {
					result.append(",Vận tải khách du lịch bằng xe ô tô");
				}
			}
			if (jsonData.has("IsCargoTransport") && "1".equals(jsonData.get("IsCargoTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải hàng hóa bằng xe ô tô");
				}
				else {
					result.append(",Vận tải hàng hóa bằng xe ô tô");
				}
			}
			if (jsonData.has("IsPassengerTaxi") && "1".equals(jsonData.get("IsPassengerTaxi"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải hành khách bằng xe taxi");
				}
				else {
					result.append(",Vận tải hành khách bằng xe taxi");
				}
			}			
		}
		else if (dossier.getServiceCode().equals("BGTVT0600005")
				|| dossier.getServiceCode().equals("BGTVT0600006")
				|| dossier.getServiceCode().equals("BGTVT0600007")
				|| dossier.getServiceCode().equals("BGTVT0600008")
				|| dossier.getServiceCode().equals("BGTVT0600030")
				|| dossier.getServiceCode().equals("BGTVT0600031")
				|| dossier.getServiceCode().equals("BGTVT0600032")
				|| dossier.getServiceCode().equals("BGTVT0600033")) {
			if (jsonData.has("IsFixedRoadTransport") && "1".equals(jsonData.get("IsFixedRoadTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải hành khách bằng ô tô theo tuyến cố định");
				}
				else {
					result.append(",Vận tải hành khách bằng ô tô theo tuyến cố định");
				}
			}
			if (jsonData.has("IsContractRoadTransport") && "1".equals(jsonData.get("IsContractRoadTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải hành khách theo hợp đồng");
				}
				else {
					result.append(",Vận tải hành khách theo hợp đồng");
				}
			}
			if (jsonData.has("IsPassengerTransport") && "1".equals(jsonData.get("IsPassengerTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải khách du lịch bằng xe ô tô");
				}
				else {
					result.append(",Vận tải khách du lịch bằng xe ô tô");
				}
			}
			if (jsonData.has("IsCargoTransport") && "1".equals(jsonData.get("IsCargoTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải hàng hóa bằng xe ô tô");
				}
				else {
					result.append(",Vận tải hàng hóa bằng xe ô tô");
				}
			}
			if (jsonData.has("IsTaxiTransport") && "1".equals(jsonData.get("IsTaxiTransport"))) {
				if (result.toString().isEmpty()) {
					result.append("Vận tải taxi");
				}
				else {
					result.append(",Vận tải taxi");
				}
			}			
		}
	
		return result.toString();
	}
}
