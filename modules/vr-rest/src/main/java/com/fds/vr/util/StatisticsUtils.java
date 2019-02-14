package com.fds.vr.util;

import java.util.Date;
import java.util.LinkedHashMap;

import org.opencps.dossiermgt.action.DossierStatisticAction;
import org.opencps.dossiermgt.action.impl.DossierStatisticActionImpl;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.usermgt.model.WorkingUnit;
import org.opencps.usermgt.service.WorkingUnitLocalServiceUtil;

import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.service.ILCertificateLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class StatisticsUtils {
	
	public static String thongKeTheoNam(long companyId, long groupId, 
			String govAgencyCodes, String from, String to, String headerTitle) {
				
		String fromSubmitDate = ConvertFormatDate.convertNormalDateToLuceneDate(from);
		String toSubmitDate = ConvertFormatDate.convertNormalDateToLuceneDate(to);

		JSONArray arr = JSONFactoryUtil.createJSONArray();
		
		if (Validator.isNotNull(govAgencyCodes)) {
			String[] agencies = StringUtil.split(govAgencyCodes);
			
			int stt = 0;
			int total_receiving = 0;
			int total_done = 0;
			int total_certificate = 0;
			int total_transportCertificate = 0;
			int total_nonProcessing = 0;
			for(String agency : agencies) {
				JSONObject jsonData = JSONFactoryUtil.createJSONObject();
				
				jsonData.put("govAgencyCode", agency);
				jsonData.put("stt", ++stt);
				
				WorkingUnit workingUnit = WorkingUnitLocalServiceUtil.fetWorkingUnitByGovAgencyCode(groupId, agency);
				if(workingUnit != null) {
					jsonData.put("govAgencyName", workingUnit.getName());
				}
				
				//Tổng số hồ sơ nộp = Hồ sơ đã tiếp nhận trực tuyến + Hồ sơ đã tiếp nhận trực tiếp + Hồ sơ tiếp nhận trên cổng dịch vụ công
				String subStatusDaNop = "receiving_2,waiting_1,cancelled_1,waiting_2,processing_1,processing_2,"
						+ "processing_3,processing_4,processing_5,processing_6,processing_7,ended_1,done_1,done_2,"
						+ "done_3,processing_8,processing_9,processing_10,processing_11,waiting_3,done_4,"
						+ "processing_12,processing_13,processing_14,PAYING_1";
				long total = StatisticsUtils.countHoSoByAgency_Year(
						companyId, groupId, agency, fromSubmitDate, toSubmitDate, 
						subStatusDaNop, null);
				
				total_done += total;
				jsonData.put("receiving", total);
				
				//Tổng số hồ sơ đã trả kết quả = Hồ sơ đã trả kết quả + Hồ sơ đã từ chối
				String subStatusDaTraKQ = "ended_1,done_3";
				long total2 = StatisticsUtils.countHoSoByAgency_Year(
						companyId, groupId, agency, fromSubmitDate, toSubmitDate, subStatusDaTraKQ, null);
				
				total_done += total2;
				jsonData.put("done", total2);
				
				// Tổng số GP vận tải = tổng số giấy phép trong rổ Hồ sơ đã trả kết quả của nhóm thủ tục vận tải quốc tế cho doanh nghiệp (1 hồ sơ 1 giấy phép)
				String[] thuTucVanTai = new String[]{"BGTVT0600001","BGTVT0600002","BGTVT0600003","BGTVT0600004",
						"BGTVT0600019","BGTVT0600020","BGTVT0600021","BGTVT0600022","BGTVT0600058","BGTVT0600059","BGTVT0600060"};
				long total3 = StatisticsUtils.countSoGPBySericeCode(agency, thuTucVanTai, from, to);
				
				total_certificate += total3;
				jsonData.put("certificate", total3);
				
				//Tổng số GP đã cấp cho Phương tiện = tổng số giấy phép trong rổ Hồ sơ đã trả kết quả của nhóm thủ tục liên vận đối với phương tiện (1 hồ sơ nhiều giấy phép)
				String[] thuTucLienVan = new String[]{"BGTVT0600005","BGTVT0600006","BGTVT0600007","BGTVT0600008","BGTVT0600009",
						"BGTVT0600010","BGTVT0600011","BGTVT0600012","BGTVT0600023","BGTVT0600024","BGTVT0600025","BGTVT0600026",
						"BGTVT0600027","BGTVT0600028","BGTVT0600029","BGTVT0600036","BGTVT0600037","BGTVT0600038","BGTVT0600039",
						"BGTVT0600040","BGTVT0600041","BGTVT0600042","BGTVT0600043","BGTVT0600048","BGTVT0600049","BGTVT0600050",
						"BGTVT0600051","BGTVT0600052","BGTVT0600053","BGTVT0600054","BGTVT0600055","BGTVT0600061","BGTVT0600062",
						"BGTVT0600063","BGTVT0600064"};
				
				long total4 = StatisticsUtils.countSoGPBySericeCode(agency, thuTucLienVan, from, to);
				
				total_transportCertificate += total4;
				jsonData.put("transportCertificate", total4);
				
				//Tổng số hồ chưa giải quyết = Hồ sơ chờ tiếp nhận + Hồ sơ yêu cầu sửa giấy phép + Hồ sơ yêu cầu hủy
				String subStatusChuaGiaiQuyet = "receiving_1,done_1,cancelled_1";
				long total5 = StatisticsUtils.countHoSoByAgency_Year(
						companyId, groupId, agency, fromSubmitDate, toSubmitDate, subStatusChuaGiaiQuyet, null);
				
				total_nonProcessing += total5;
				jsonData.put("nonProcessing", total5);
				
				arr.put(jsonData);
			}
			
			//TOTAL 
			JSONObject jsonData = JSONFactoryUtil.createJSONObject();
			jsonData.put("stt", "");
			jsonData.put("govAgencyName", "Tổng số");
			jsonData.put("receiving", total_receiving);
			jsonData.put("done", total_done);
			jsonData.put("certificate", total_certificate);
			jsonData.put("transportCertificate", total_transportCertificate);
			jsonData.put("nonProcessing", total_nonProcessing);
			
			arr.put(jsonData);
		}
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", arr);
		result.put("from", from);
		result.put("to", to);
		result.put("govAgencyName", headerTitle);
		
		return result.toString();
	}
	
	public static String baoCaoTinhTrangXuLyHoSo(long companyId, long groupId, String govAgencyCodes, 
			String status, String from, String to, String headerTitle) {
		
		String fromSubmitDate = ConvertFormatDate.convertNormalDateToLuceneDate(from);
		String toSubmitDate = ConvertFormatDate.convertNormalDateToLuceneDate(to);

		JSONArray arr = JSONFactoryUtil.createJSONArray();
		
		if (Validator.isNotNull(govAgencyCodes)) {
			String[] agencies = StringUtil.split(govAgencyCodes);
			
			int stt = 0;
			int total_onReceiving = 0;
			int total_offReceiving = 0;
			int total_gateReceiving = 0;
			int total_processing = 0;
			int total_approving = 0;
			int total_signing = 0;
			int total_printing = 0;
			int total_receiving = 0;
			int total_done = 0;
			for(String agency : agencies) {
				JSONObject jsonData = JSONFactoryUtil.createJSONObject();
				
				jsonData.put("govAgencyCode", agency);
				jsonData.put("stt", ++stt);
				
				WorkingUnit workingUnit = WorkingUnitLocalServiceUtil.fetWorkingUnitByGovAgencyCode(groupId, agency);
				if(workingUnit != null) {
					jsonData.put("govAgencyName", workingUnit.getName());
				}
				
				//Tổng số hồ sơ nộp = Hồ sơ đã tiếp nhận trực tuyến + Hồ sơ đã tiếp nhận trực tiếp + Hồ sơ tiếp nhận trên cổng dịch vụ công
				String subStatusDaNop = "receiving_2,waiting_1,cancelled_1,waiting_2,processing_1,processing_2,"
						+ "processing_3,processing_4,processing_5,processing_6,processing_7,ended_1,done_1,done_2,"
						+ "done_3,processing_8,processing_9,processing_10,processing_11,waiting_3,done_4,"
						+ "processing_12,processing_13,processing_14,PAYING_1";
				
				if(Validator.isNull(status) || status.contains("onReceiving")) {
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, groupId, agency, fromSubmitDate, toSubmitDate, 
							subStatusDaNop, true);
					
					total_onReceiving += total;
					jsonData.put("onReceiving", total);
				}
				
				if(Validator.isNull(status) || status.contains("offReceiving")) {
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, groupId, agency, fromSubmitDate, toSubmitDate, 
							subStatusDaNop, false);
					
					total_offReceiving += total;
					jsonData.put("offReceiving", total);
				}
				
				if(Validator.isNull(status) || status.contains("gateReceiving")) {
					long congTiepNhan = 55217;
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, congTiepNhan, agency, fromSubmitDate, toSubmitDate, 
							subStatusDaNop, true);
					
					total_gateReceiving += total;
					jsonData.put("gateReceiving", total);
				}
				
				if(Validator.isNull(status) || status.contains("processing")) {
					//Hồ sơ đã thẩm định = Hồ sơ chờ phê duyệt + Hồ sơ chờ ký số + Hồ sơ chờ đóng dấu + Hồ sơ chờ in phôi + Hồ sơ chờ thanh toán 
					// + Hồ sơ đã in và chờ trả kết quả + Hồ sơ đã trả kết quả + Hồ sơ yêu cầu sửa giấy phép + Hồ sơ yêu cầu hủy 
					// + Hồ sơ đã từ chối + Hồ sơ chờ bổ sung cấp lại + Hồ sơ trả lại giấy phép + Hồ sơ yêu cầu thẩm định lại
					String subStatusDaThamDinh = "processing_5,processing_7,processing_1,processing_13,processing_14,"
							+ "done_3,done_1,cancelled_1,ended_1,waiting_3,done_2,processing_6";
					
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, groupId, agency, fromSubmitDate, toSubmitDate, 
							subStatusDaThamDinh, null);
					
					total_processing += total;
					jsonData.put("processing", total);
				}
				
				if(Validator.isNull(status) || status.contains("approving")) {
					// Hồ sơ đã phê duyệt = Hồ sơ chờ ký số + Hồ sơ chờ đóng dấu + Hồ sơ chờ in phôi + Hồ sơ chờ thanh toán 
					// + Hồ sơ đã in và chờ trả kết quả + Hồ sơ đã trả kết quả + Hồ sơ yêu cầu sửa giấy phép + Hồ sơ yêu cầu hủy 
					// + Hồ sơ chờ bổ sung cấp lại + Hồ sơ trả lại giấy phép + Hồ sơ yêu cầu thẩm định lại
					String subStatusDaPheDuyet = "processing_7,processing_1,processing_13,processing_14,"
							+ "done_3,done_1,cancelled_1,waiting_3,done_2,processing_6";
					
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, groupId, agency, fromSubmitDate, toSubmitDate, 
							subStatusDaPheDuyet, null);
					
					total_approving += total;
					jsonData.put("approving", total);
				}
				
				if(Validator.isNull(status) || status.contains("signing")) {
					// Hồ sơ đã ký duyệt = Hồ sơ chờ đóng dấu + Hồ sơ chờ in phôi + Hồ sơ chờ thanh toán + Hồ sơ đã in và chờ trả kết quả 
					// + Hồ sơ đã trả kết quả + Hồ sơ yêu cầu sửa giấy phép + Hồ sơ yêu cầu hủy +  Hồ sơ trả lại giấy phép
					String subStatusDaKyDuyet = "processing_1,processing_13,processing_14,"
							+ "done_3,done_1,cancelled_1,done_2";
					
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, groupId, agency, fromSubmitDate, toSubmitDate, 
							subStatusDaKyDuyet, null);
					
					total_signing += total;
					jsonData.put("signing", total);
				}
				
				if(Validator.isNull(status) || status.contains("printing")) {
					String subStatusDaIn = "processing_14";
					
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, groupId, agency, fromSubmitDate, toSubmitDate, subStatusDaIn, null);
					
					total_printing += total;
					jsonData.put("printing", total);
				}
				
				if(Validator.isNull(status) || status.contains("receiving")) {
					//Tổng số hồ sơ nộp = Hồ sơ đã tiếp nhận trực tuyến + Hồ sơ đã tiếp nhận trực tiếp + Hồ sơ tiếp nhận trên cổng dịch vụ công
					
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, groupId, agency, fromSubmitDate, toSubmitDate, 
							subStatusDaNop, null);
					
					total_receiving += total;
					jsonData.put("receiving", total);
				}
				
				if(Validator.isNull(status) || status.contains("done")) {
					//Tổng số hồ sơ đã trả kết quả = Hồ sơ đã trả kết quả + Hồ sơ đã từ chối
					String subStatusDaTraKQ = "ended_1,done_3";
					
					long total = StatisticsUtils.countHoSoByAgency_Year(
							companyId, groupId, agency, fromSubmitDate, toSubmitDate, subStatusDaTraKQ, null);
					
					total_done += total;
					jsonData.put("done", total);
				}
				
				arr.put(jsonData);
			}
			
			//TOTAL 
			JSONObject jsonData = JSONFactoryUtil.createJSONObject();
			jsonData.put("stt", "");
			jsonData.put("govAgencyName", "Tổng số");
			
			if(Validator.isNull(status) || status.contains("onReceiving")) {
				jsonData.put("onReceiving", total_onReceiving);
			}
				
			if(Validator.isNull(status) || status.contains("offReceiving")) {
				jsonData.put("offReceiving", total_offReceiving);
			}
			
			if(Validator.isNull(status) || status.contains("gateReceiving")) {
				jsonData.put("gateReceiving", total_gateReceiving);
			}
			
			if(Validator.isNull(status) || status.contains("processing")) {
				jsonData.put("processing", total_processing);
			}
			
			if(Validator.isNull(status) || status.contains("approving")) {
				jsonData.put("approving", total_approving);
			}
			
			if(Validator.isNull(status) || status.contains("signing")) {
				jsonData.put("signing", total_signing);
			}
			
			if(Validator.isNull(status) || status.contains("printing")) {
				jsonData.put("printing", total_printing);
			}
			
			if(Validator.isNull(status) || status.contains("receiving")) {
				jsonData.put("receiving", total_receiving);
			}
			
			if(Validator.isNull(status) || status.contains("done")) {
				jsonData.put("done", total_done);
			}
			
			arr.put(jsonData);
		}
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", arr);
		result.put("from", from);
		result.put("to", to);
		result.put("govAgencyName", headerTitle);
		
		return result.toString();
	}
	
	public static String baoCaoCapPhep(long groupId, String govAgencyCodes, String nhomVanTai, String loaiGiayPhep, 
			String from, String to, String headerTitle) {
		JSONArray arr = JSONFactoryUtil.createJSONArray();
		
		if (Validator.isNotNull(govAgencyCodes)) {
			String[] agencies = StringUtil.split(govAgencyCodes);
			
			int stt = 0;
			int total_typeA = 0;
			int total_typeB = 0;
			int total_typeC = 0;
			int total_typeD = 0;
			int total_typeE = 0;
			int total_typeF = 0;
			int total_typeG = 0;
			int total_typeVTT = 0;
			int total_typeGH = 0;
			int total_typeVTQT = 0;
			int total_typeTM = 0;
			int total_typePTM = 0;
			int total_totalRow = 0;
			for(String agency : agencies) {
				JSONObject jsonData = JSONFactoryUtil.createJSONObject();
				
				int totalRow = 0;
				
				jsonData.put("govAgencyCode", agency);
				jsonData.put("stt", ++stt);
				
				WorkingUnit workingUnit = WorkingUnitLocalServiceUtil.fetWorkingUnitByGovAgencyCode(groupId, agency);
				if(workingUnit != null) {
					jsonData.put("govAgencyName", workingUnit.getName());
				}

				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeA"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("viettrung"))) {
					// Loại A = tổng giấy phép loại A trong rổ hồ sơ đã  trả kết quả ở tất cả các thủ tục trong DM loại A (1 hồ sơ có nhiều giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600037","BGTVT0600038","BGTVT0600041"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeA", total);
					
					total_typeA += total;
					totalRow += total;
				}
				
				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeB"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("viettrung"))) {
					// Loại A = tổng giấy phép loại A trong rổ hồ sơ đã  trả kết quả ở tất cả các thủ tục trong DM loại A (1 hồ sơ có nhiều giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600036","BGTVT0600037","BGTVT0600039","BGTVT0600040"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeB", total);
					
					total_typeB += total;
					totalRow += total;
				}
				
				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeC"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("viettrung"))) {
					// Loại A = tổng giấy phép loại A trong rổ hồ sơ đã  trả kết quả ở tất cả các thủ tục trong DM loại A (1 hồ sơ có nhiều giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600037","BGTVT0600039","BGTVT0600040"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeC", total);
					
					total_typeC += total;
					totalRow += total;
				}
				
				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeD"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("viettrung"))) {
					// Loại A = tổng giấy phép loại A trong rổ hồ sơ đã  trả kết quả ở tất cả các thủ tục trong DM loại A (1 hồ sơ có nhiều giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600041","BGTVT0600042","BGTVT0600043"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeD", total);
					
					total_typeD += total;
					totalRow += total;
				}
				
				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeE"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("viettrung"))) {
					// Loại A = tổng giấy phép loại A trong rổ hồ sơ đã  trả kết quả ở tất cả các thủ tục trong DM loại A (1 hồ sơ có nhiều giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600037","BGTVT0600038","BGTVT0600041"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeE", total);
					
					total_typeE += total;
					totalRow += total;
				}
				
				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeF"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("viettrung"))) {
					// Loại A = tổng giấy phép loại A trong rổ hồ sơ đã  trả kết quả ở tất cả các thủ tục trong DM loại A (1 hồ sơ có nhiều giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600036","BGTVT0600037","BGTVT0600039","BGTVT0600040"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeF", total);
					
					total_typeF += total;
					totalRow += total;
				}
				
				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeG"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("viettrung"))) {
					// Loại A = tổng giấy phép loại A trong rổ hồ sơ đã  trả kết quả ở tất cả các thủ tục trong DM loại A (1 hồ sơ có nhiều giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600037","BGTVT0600039","BGTVT0600040"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeG", total);
					
					total_typeG += total;
					totalRow += total;
				}
				
				if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeVTT")) {
					// Giấy phép vận tải hành khách tuyến cố định = tổng giấy phép chấp thuận trong rổ hồ sơ đã trả kết quả ở các thủ tục trong DM giấy phép chấp thuận (1 hồ sơ 1 giấy phép)
					String[] vietLao = new String[]{"BGTVT0600013","BGTVT0600014","BGTVT0600015","BGTVT0600016","BGTVT0600017"};
					
					String[] vietCam = new String[]{"BGTVT0600030","BGTVT0600031","BGTVT0600032","BGTVT0600033","BGTVT0600034"};
					
					String[] vietTrung = new String[]{"BGTVT0600044","BGTVT0600045","BGTVT0600046"};
					
					String[] vlc = new String[]{"BGTVT0600056"};
					
					String[] thuTuc = new String[]{};
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vietLao")) {
						thuTuc = ArrayUtil.append(vietLao, thuTuc);
					}
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vietCam")) {
						thuTuc = ArrayUtil.append(vietCam, thuTuc);
					}
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vietTrung")) {
						thuTuc = ArrayUtil.append(vietTrung, thuTuc);
					}
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vlc")) {
						thuTuc = ArrayUtil.append(vlc, thuTuc);
					}
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeVTT", total);
					
					total_typeVTT += total;
					totalRow += total;
				}
				
				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeGH"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("gms"))) {
					// Giấy phép gia hạn = tổng giấy phép gia hạn trong rổ hồ sơ đã trả kết quả ở các thủ tục trong DM giấy phép gia hạn (1 hồ sơ 1 giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600018","BGTVT0600035","BGTVT0600047","BGTVT0600057","BGTVT0600065"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeGH", total);
					
					total_typeGH += total;
					totalRow += total;
				}
				
				if((Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeVTQT"))
						&& (Validator.isNull(nhomVanTai) || nhomVanTai.contains("gms"))) {
					//Giấy phép vận tải quốc tế = tổng số giấy phép trong rổ Hồ sơ đã trả kết quả của nhóm thủ tục vận tải quốc tế cho doanh nghiệp (1 hồ sơ 1 giấy phép)
					String[] thuTuc = new String[]{"BGTVT0600001","BGTVT0600002","BGTVT0600003","BGTVT0600004",
							"BGTVT0600019","BGTVT0600020","BGTVT0600021","BGTVT0600022","BGTVT0600058","BGTVT0600059","BGTVT0600060"};
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeVTQT", total);
					
					total_typeVTQT += total;
					totalRow += total;
				}
				
				if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeTM")) {
					//Giấy phép liên vận cho phương tiện thương mại = tổng giấy phép liên vận cho phương tiện thương mại trong rổ hồ sơ đã trả kết quả ở các thủ tục trong DM giấy phép liên vận (1 hồ sơ n giấy phép)
					String[] vietLao = new String[]{"BGTVT0600005","BGTVT0600006","BGTVT0600007","BGTVT0600008"};
					
					String[] vietCam = new String[]{"BGTVT0600023","BGTVT0600024","BGTVT0600025","BGTVT0600026"};
					
					String[] vlc = new String[]{"BGTVT0600048","BGTVT0600049","BGTVT0600050","BGTVT0600051"};
					
					String[] gms = new String[]{"BGTVT0600061","BGTVT0600062","BGTVT0600063","BGTVT0600064"};
					
					String[] thuTuc = new String[]{};
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vietLao")) {
						thuTuc = ArrayUtil.append(vietLao, thuTuc);
					}
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vietCam")) {
						thuTuc = ArrayUtil.append(vietCam, thuTuc);
					}
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vlc")) {
						thuTuc = ArrayUtil.append(vlc, thuTuc);
					}
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("gms")) {
						thuTuc = ArrayUtil.append(gms, thuTuc);
					}
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typeTM", total);
					
					total_typeTM += total;
					totalRow += total;
				}
				
				if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typePTM")) {
					//Giấy phép liên vận cho phương tiện phi thương mại = tổng giấy phép liên vận cho phương tiện phi thương mại trong rổ hồ sơ đã trả kết quả ở các thủ tục trong DM giấy phép liên vận cho phương tiện phi thương mại (1 hồ sơ 1 giấy phép)
					String[] vietLao = new String[]{"BGTVT0600009","BGTVT0600010","BGTVT0600011","BGTVT0600012"};
					
					String[] vietCam = new String[]{"BGTVT0600027","BGTVT0600028","BGTVT0600029"};
					
					String[] vlc = new String[]{"BGTVT0600052","BGTVT0600053","BGTVT0600054","BGTVT0600055"};
					
					String[] thuTuc = new String[]{};
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vietLao")) {
						thuTuc = ArrayUtil.append(vietLao, thuTuc);
					}
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vietCam")) {
						thuTuc = ArrayUtil.append(vietCam, thuTuc);
					}
					
					if(Validator.isNull(nhomVanTai) || nhomVanTai.contains("vlc")) {
						thuTuc = ArrayUtil.append(vlc, thuTuc);
					}
					
					int total = StatisticsUtils.countSoGPBySericeCode(agency, thuTuc, from, to);
					jsonData.put("typePTM", total);
					
					total_typePTM += total;
					totalRow += total;
				}
				
				total_totalRow += totalRow;
				jsonData.put("totalRow", totalRow);
				
				arr.put(jsonData);
			}
			
			//TOTAL 
			JSONObject jsonData = JSONFactoryUtil.createJSONObject();
			jsonData.put("stt", "");
			jsonData.put("govAgencyName", "Tổng số");
			
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeA")) {
				jsonData.put("typeA", total_typeA);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeB")) {
				jsonData.put("typeB", total_typeB);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeC")) {
				jsonData.put("typeC", total_typeC);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeD")) {
				jsonData.put("typeD", total_typeD);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeE")) {
				jsonData.put("typeE", total_typeE);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeF")) {
				jsonData.put("typeF", total_typeF);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeG")) {
				jsonData.put("typeG", total_typeG);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeVTT")) {
				jsonData.put("typeVTT", total_typeVTT);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeGH")) {
				jsonData.put("typeGH", total_typeGH);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeVTQT")) {
				jsonData.put("typeVTQT", total_typeVTQT);
			}
				
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typeTM")) {
				jsonData.put("typeTM", total_typeTM);
			}
			
			if(Validator.isNull(loaiGiayPhep) || loaiGiayPhep.contains("typePTM")) {
				jsonData.put("typePTM", total_typePTM);
			}
			jsonData.put("totalRow", total_totalRow);
			
			arr.put(jsonData);
		}
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", arr);
		result.put("from", from);
		result.put("to", to);
		result.put("govAgencyName", headerTitle);
		
		return result.toString();
	}

	private static long countHoSoByAgency_Year (long companyId, 
			long groupId, String govAgencyCode, String fromSubmitDate, String toSubmitDate, String dossierSubStatus, Boolean online) {
		
		DossierStatisticAction actions = new DossierStatisticActionImpl();

		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
		
		params.put(Field.GROUP_ID, String.valueOf(groupId));
		params.put(DossierTerm.SUBSTATUS, dossierSubStatus);
		params.put(DossierTerm.FOLLOW, String.valueOf(false));
		params.put(DossierTerm.FROM_SUBMIT_DATE, fromSubmitDate);
		params.put(DossierTerm.TO_SUBMIT_DATE, toSubmitDate);
		
		if(online != null) {
			params.put(DossierTerm.ONLINE, Boolean.toString(online));
		}
		
		params.put(DossierTerm.AGENCY, govAgencyCode);
		
		long total = actions.countDossierStatistic(companyId, groupId, params,
					null);
		
		return total;
	}
	
	private static int countSoGPBySericeCode (String govAgencyCode, String[] serviceCodes, String from, String to) {
		Date fromDate = null;
		Date toDate = null;
		
		if(Validator.isNotNull(from)) {
			fromDate = ConvertFormatDate.parseStringToDate(from, ConvertFormatDate._NORMAL_DATE);
		}
		
		if(Validator.isNotNull(to)) {
			toDate = ConvertFormatDate.parseStringToDate(to, ConvertFormatDate._NORMAL_DATE);
		}
		
		return ILCertificateLocalServiceUtil.countByServiceCode(govAgencyCode, serviceCodes, fromDate, toDate);
	}
}
