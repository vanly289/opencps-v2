package org.opencps.dossiermgt.vr.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.exception.NoSuchDossierFileException;
import org.opencps.dossiermgt.model.Deliverable;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;

import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProdEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportAttachLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
import com.fds.vr.business.service.VRProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class ResultDeliverableCOPUtils {

	public static void updateVRCOPBusiness(Deliverable model, int mtCore) throws NoSuchDossierFileException, JSONException {
		
		DossierFile dossierFile = DossierFileLocalServiceUtil.getByDeliverableCode(model.getDeliverableCode());
		Dossier dossier = null;
		if (dossierFile != null) {
			long dossierId = dossierFile.getDossierId();
			if (dossierId > 0) {
				dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
			}
		}

		//Process vr_productionplant
		VRProductionPlant productionPlan = new VRProductionPlantImpl();
		if (dossier != null) {
			String applicantIdNo = dossier.getApplicantIdNo();
			long dossierId = dossier.getDossierId();
			long productPlantId = productionPlan.getId();

			DossierFile dossierFileDN = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(
					dossierId, "TT302011BGTVTCOPTTDN", 1, false,
					new DossierFileComparator(false, "createDate", Date.class));

			String formData = dossierFileDN != null ? dossierFileDN.getFormData(): StringPool.BLANK;

			/** VR_PRODUCTION */
			if (Validator.isNotNull(formData)) {
				JSONObject jsonData = JSONFactoryUtil.createJSONObject(formData);
				if (jsonData.has("loai_ho_so_cop") && !jsonData.getString("loai_ho_so_cop").equals("BS")) {
					//TODO: xóa sạch 4 bảng trên, để insert lại
					// Delete vr_productionplantemployee
					VRProductionPlantEmployeeLocalServiceUtil.deleteByproductPlantId(mtCore, productPlantId);
					//Delete vr_productionplantprodequipment
					VRProductionPlantProdEquipmentLocalServiceUtil.deleteByproductPlantID(mtCore, productPlantId);
					//Delete vr_productionplantequipment
					VRProductionPlantEquipmentLocalServiceUtil.deleteByproductPlantId(mtCore, productPlantId);
					//Delete vr_producttype
					VRProductTypeLocalServiceUtil.deleteByproductPlantId(mtCore, productPlantId);
				}
				
				// Process vr_productionplantemployee
				Map<String, String> mapProductPlant = null;
				if (jsonData.has("danh_sach_nhan_vien")) {
					JSONArray employeeArr = JSONFactoryUtil.createJSONArray("danh_sach_nhan_vien");
					for (int i = 0; i < employeeArr.length(); i++) {
						mapProductPlant = new HashMap<>();
						JSONObject jsonEmployee = employeeArr.getJSONObject(i);

						mapProductPlant.put("productPlantId", String.valueOf(productionPlan.getId()));
						mapProductPlant.put("sequenceNo", String.valueOf(i));
						mapProductPlant.put("employeeName", jsonEmployee.getString("ho_ten_pl1"));
						mapProductPlant.put("employeeCertificateNo", jsonEmployee.getString("chung_chi_pl1"));
						mapProductPlant.put("trainningAt", jsonEmployee.getString("noi_dao_tao_pl1"));
						//
						//if (mapEmployee != null && mapEmployee.size() > 0) {
						VRProductionPlantEmployeeLocalServiceUtil.updateProductionPlantEmployee(mapProductPlant, mtCore);
						//}
					}
				}
				
				// Process vr_productionplantprodequipment
				if (jsonData.has("thiet_bi_san_xuat_chinh")) {
					JSONArray prodEquipmentArr = JSONFactoryUtil.createJSONArray("thiet_bi_san_xuat_chinh");
					for (int i = 0; i < prodEquipmentArr.length(); i++) {
						mapProductPlant = new HashMap<>();
						JSONObject jsonProdEquipment = prodEquipmentArr.getJSONObject(i);

						mapProductPlant.put("productPlantId", String.valueOf(productionPlan.getId()));
						mapProductPlant.put("sequenceNo", String.valueOf(i));
						mapProductPlant.put("equipmentCode", jsonProdEquipment.getString("so_luong_pl2"));
						mapProductPlant.put("equipmentName", jsonProdEquipment.getString("ten_thiet_bi_pl2"));
						mapProductPlant.put("trademarkName", jsonProdEquipment.getString("nhan_hieu_pl2"));
						mapProductPlant.put("productionCountryCode", jsonProdEquipment.getString("nuoc_san_xuat_pl2"));
						mapProductPlant.put("equipmentStatus", jsonProdEquipment.getString("tinh_trang_pl2"));
						mapProductPlant.put("notes", jsonProdEquipment.getString("ghi_chu_pl2"));
						//
						VRProductionPlantProdEquipmentLocalServiceUtil.updateProductionPlantProdEquipment(mapProductPlant, mtCore);
					}
				}
				
				// Process vr_productionplantequipment
				if (jsonData.has("thiet_bi_kiem_tra_chinh")) {
					JSONArray equipmentArr = JSONFactoryUtil.createJSONArray("thiet_bi_kiem_tra_chinh");
					for (int i = 0; i < equipmentArr.length(); i++) {
						mapProductPlant = new HashMap<>();
						JSONObject jsonEquipment = equipmentArr.getJSONObject(i);

						mapProductPlant.put("productPlantId", String.valueOf(productionPlan.getId()));
						mapProductPlant.put("sequenceNo", String.valueOf(i));
						mapProductPlant.put("equipmentCode", jsonEquipment.getString("so_luong_pl3"));
						mapProductPlant.put("equipmentName", jsonEquipment.getString("ten_thiet_bi_pl3"));
						mapProductPlant.put("trademarkName", jsonEquipment.getString("nhan_hieu_pl3"));
						mapProductPlant.put("productionCountryCode", jsonEquipment.getString("nuoc_san_xuat_pl3"));
						mapProductPlant.put("equipmentStatus", jsonEquipment.getString("tinh_trang_pl3"));
						mapProductPlant.put("expireDate", jsonEquipment.getString("ngay_hieu_luc_pl3"));
						mapProductPlant.put("notes", jsonEquipment.getString("ghi_chu_pl2"));
						//
						VRProductionPlantEquipmentLocalServiceUtil.updateProductionPlantEquipment(mapProductPlant, mtCore);
					}
				}
				
				// Process vr_producttype
				if (jsonData.has("loai_san_pham_xuong")) {
					JSONArray typeArr = JSONFactoryUtil.createJSONArray("loai_san_pham_xuong");
					for (int i = 0; i < typeArr.length(); i++) {
						mapProductPlant = new HashMap<>();
						JSONObject jsonType = typeArr.getJSONObject(i);

						mapProductPlant.put("productPlantId", String.valueOf(productionPlan.getId()));
						mapProductPlant.put("sequenceNo", String.valueOf(i));
						mapProductPlant.put("vehicleClass", jsonType.getString("so_luong_pl3"));
						mapProductPlant.put("vehicleTypeCode", jsonType.getString("ten_thiet_bi_pl3"));
						mapProductPlant.put("vehicleTypeDescription", jsonType.getString("ten_thiet_bi_pl3"));
						mapProductPlant.put("productClassificationCode", jsonType.getString("ten_thiet_bi_pl3"));
						mapProductPlant.put("productClassificationDescription", jsonType.getString("ten_thiet_bi_pl3"));
						mapProductPlant.put("trademark", jsonType.getString("nhan_hieu_pl3"));
						mapProductPlant.put("trademarkName", jsonType.getString("nhan_hieu_pl3"));
						mapProductPlant.put("commercialName", jsonType.getString("nuoc_san_xuat_pl3"));
						mapProductPlant.put("modelCode", jsonType.getString("tinh_trang_pl3"));
						mapProductPlant.put("designSymbolNo", jsonType.getString("ngay_hieu_luc_pl3"));
						
						//
						VRProductTypeLocalServiceUtil.updateProductType(mapProductPlant, mtCore);
					}
				}
			}
			/** VR_PRODUCTION */
			
			/** Process VR_COP */
			// Process vr_copreportrepository
			Map<String, String> mapReport = new HashMap<>();

			VRApplicantProfile appProFile = VRApplicantProfileLocalServiceUtil.findByMT_APP_CODE(mtCore, applicantIdNo);
			if (appProFile != null) {
				mapReport.put("applicantProfileId", String.valueOf(appProFile.getId()));
				mapReport.put("applicantCode", appProFile.getApplicantCode());
				mapReport.put("applicantName", appProFile.getApplicantName());
				mapReport.put("applicantAddress", appProFile.getApplicantAddress());
			}
			if (Validator.isNotNull(formData)) {
				JSONObject jsonData = JSONFactoryUtil.createJSONObject(formData);
				if (jsonData.has("list_COP_TrongNuoc_NuocNgoai") && jsonData.getString("list_COP_TrongNuoc_NuocNgoai").equalsIgnoreCase("NN")) {
					DictCollection collection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("VR86", dossier.getGroupId());

					DictItem dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(jsonData.getString("ma_so_xuong"),
							collection.getDictCollectionId(), dossier.getGroupId());
					//
					DictItem dictItemParent = DictItemLocalServiceUtil.fetchDictItem(dictItem.getParentItemId());
					if (dictItemParent != null) {
						mapReport.put("overseasManufacturerCode", dictItemParent.getItemCode());
						mapReport.put("overseasManufacturerName", dictItemParent.getItemName());
						mapReport.put("overseasManufacturerAddress", dictItemParent.getItemNameEN());
					}
				}
			}
			//
			DossierFile dossierFileReportKQ = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(
					dossier.getDossierId(), "TT302011BGTVTCOPTBKQ", 2, false,
					new DossierFileComparator(false, "createDate", Date.class));
			String formDataKQ = dossierFileReportKQ != null ? dossierFileReportKQ.getFormData(): StringPool.BLANK;
			if (Validator.isNotNull(formDataKQ)) {
				JSONObject jsonDataKQ = JSONFactoryUtil.createJSONObject(formDataKQ);
				mapReport.put("productionPlantCode", jsonDataKQ.getString("ma_so_xuong"));
				mapReport.put("productionPlantName", jsonDataKQ.getString("ten_xuong_san_xuat"));
				mapReport.put("productionPlantAddress", jsonDataKQ.getString("dia_chi_xuong_san_xuat"));
				mapReport.put("copReportNo", jsonDataKQ.getString("so_thong_bao"));
				mapReport.put("copReportStatus", jsonDataKQ.getString("ket_luan"));
				mapReport.put("copReportType", jsonDataKQ.getString("loai_ho_so_cop"));
				mapReport.put("copReportMetadata", formData);
				mapReport.put("copReportSignName", jsonDataKQ.getString("nguoi_ky_tb"));
				mapReport.put("copReportSignTitle", jsonDataKQ.getString("chuc_danh_ky"));
				mapReport.put("copReportSignPlace", "");
				mapReport.put("copReportDate", jsonDataKQ.getString("ngay_bao_cao"));
				mapReport.put("copReportApprovedDate", jsonDataKQ.getString("ngay_bao_cao"));
			}
			//
			DossierFile dossierFileReportCOP = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_DPT_First(
					dossier.getDossierId(), "BCKQDGCOP", 2, false,
					new DossierFileComparator(false, "createDate", Date.class));
			String formDataCOP = dossierFileReportCOP != null ? dossierFileReportCOP.getFormData(): StringPool.BLANK;
			if (Validator.isNotNull(formDataCOP)) {
				JSONObject jsonDataCOP = JSONFactoryUtil.createJSONObject(formDataCOP);
				mapReport.put("copReportExpiredDate", jsonDataCOP.getString("han_kiem_tra"));
			}
			//
			VRCOPReportRepository copReport = null;
			if (mapReport.size() > 0) {
				copReport = VRCOPReportRepositoryLocalServiceUtil.updateCOPReportRepository(mapReport, mtCore);
			}

			// n many table 
			// process table vr_COPProductionPlantProdEquipment
			if (copReport != null && Validator.isNotNull(formData)) {
				JSONObject jsonData = JSONFactoryUtil.createJSONObject(formData);
				// process table vr_COPProductionPlantProdEquipment
				Map<String, String> mapCOP = null;
				if (jsonData.has("thiet_bi_san_xuat_chinh")) {
					JSONArray equimentArr = JSONFactoryUtil.createJSONArray("thiet_bi_san_xuat_chinh");
					for (int i = 0; i < equimentArr.length(); i++) {
						mapCOP = new HashMap<>();
						JSONObject jsonEquiment = equimentArr.getJSONObject(i);

						mapCOP.put("copReportRepositoryId", String.valueOf(copReport.getId()));
						mapCOP.put("copReportNo", "so_thong_bao");
						mapCOP.put("sequenceNo", String.valueOf(i));
						mapCOP.put("equipmentCode", jsonEquiment.getString("so_luong_pl2"));
						mapCOP.put("equipmentName", jsonEquiment.getString("ten_thiet_bi_pl2"));
						mapCOP.put("trademarkName", jsonEquiment.getString("nhan_hieu_pl2"));
						mapCOP.put("productionCountryCode", jsonEquiment.getString("nuoc_san_xuat_pl2"));
						mapCOP.put("equipmentStatus", jsonEquiment.getString("tinh_trang_pl2"));
						mapCOP.put("notes", jsonEquiment.getString("ghi_chu_pl2"));
						//
						VRCOPProdEquipmentLocalServiceUtil.updateCOPProdEquipment(mapCOP, mtCore);
					}
				}
				//
				// process table vr_COPProductionPlantEquipment
				if (jsonData.has("thiet_bi_kiem_tra_chinh")) {
					JSONArray equimentArr = JSONFactoryUtil.createJSONArray("thiet_bi_kiem_tra_chinh");
					for (int i = 0; i < equimentArr.length(); i++) {
						mapCOP = new HashMap<>();
						JSONObject jsonEquiment = equimentArr.getJSONObject(i);

						mapCOP.put("copReportRepositoryId", String.valueOf(copReport.getId()));
						mapCOP.put("copReportNo", "so_thong_bao");
						mapCOP.put("sequenceNo", String.valueOf(i));
						mapCOP.put("equipmentCode", jsonEquiment.getString("so_luong_pl3"));
						mapCOP.put("equipmentName", jsonEquiment.getString("ten_thiet_bi_pl3"));
						mapCOP.put("trademarkName", jsonEquiment.getString("nhan_hieu_pl3"));
						mapCOP.put("productionCountryCode", jsonEquiment.getString("nuoc_san_xuat_pl3"));
						mapCOP.put("equipmentStatus", jsonEquiment.getString("tinh_trang_pl3"));
						mapCOP.put("ngay_hieu_luc_pl3", jsonEquiment.getString("ngay_hieu_luc_pl3"));
						mapCOP.put("notes", jsonEquiment.getString("ghi_chu_pl3"));
						//
						VRCOPProductionPlantEquipmentLocalServiceUtil.updateCOPProductionPlantEquipment(mapCOP, mtCore);
					}
				}
				//
				// process table vr_COPProductionPlantEmployee
				if (jsonData.has("danh_sach_nhan_vien")) {
					JSONArray employeeArr = JSONFactoryUtil.createJSONArray("danh_sach_nhan_vien");
					for (int i = 0; i < employeeArr.length(); i++) {
						mapCOP = new HashMap<>();
						JSONObject jsonEmployee = employeeArr.getJSONObject(i);

						mapCOP.put("copReportRepositoryId", String.valueOf("ti nua them"));
						mapCOP.put("copReportNo", "so_thong_bao");
						mapCOP.put("sequenceNo", String.valueOf(i));
						mapCOP.put("employeeName", jsonEmployee.getString("ho_ten_pl1"));
						mapCOP.put("employeeCertificateNo", jsonEmployee.getString("chung_chi_pl1"));
						mapCOP.put("trainningAt", jsonEmployee.getString("noi_dao_tao_pl1"));
						//
						VRCOPProductionPlantEmployeeLocalServiceUtil.updateCOPProductionPlantEmployee(mapCOP, mtCore);
					}
				}

				// process table vr_COPReport_attach
				if (jsonData.has("danh_sach_tai_lieu")) {
					JSONArray reportAttachArr = JSONFactoryUtil.createJSONArray("danh_sach_tai_lieu");
					for (int i = 0; i < reportAttachArr.length(); i++) {
						mapCOP = new HashMap<>();
						JSONObject jsonReportAttach = reportAttachArr.getJSONObject(i);

						mapCOP.put("copReportRepositoryId", String.valueOf(copReport.getId()));
						mapCOP.put("copReportNo", "so_thong_bao");
						mapCOP.put("sequenceNo", String.valueOf(i));
						mapCOP.put("docNo", jsonReportAttach.getString("so_hieu_pl5"));
						mapCOP.put("docName", jsonReportAttach.getString("ten_tai_lieu_pl5"));
						mapCOP.put("remarks", jsonReportAttach.getString("ghi_chu_pl5"));
						//
						VRCOPReportAttachLocalServiceUtil.updateCOPReportAttach(mapCOP, mtCore);
					}
				}
			}
			/** Process VR_COP */
		}
	}

}
