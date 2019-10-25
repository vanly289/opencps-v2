package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionPlantApiModel")
public class VRProductionPlantApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtCore", long.class);
		TABLE_COLUMNS_MAP.put("mappingMA_CTY", "mappingma_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingMA_CTY", String.class);
		TABLE_COLUMNS_MAP.put("mappingTEN_CTY", "mappingten_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingTEN_CTY", String.class);
		TABLE_COLUMNS_MAP.put("mappingDIA_CHI_CTY", "mappingdia_chi_cty");
		TABLE_COLUMNS_DATA_MAP.put("mappingDIA_CHI_CTY", String.class);
		TABLE_COLUMNS_MAP.put("mappingMA_XUONG_LR", "mappingma_xuong_lr");
		TABLE_COLUMNS_DATA_MAP.put("mappingMA_XUONG_LR", String.class);
		TABLE_COLUMNS_MAP.put("mappingTEN_XUONG_LR", "mappingten_xuong_lr");
		TABLE_COLUMNS_DATA_MAP.put("mappingTEN_XUONG_LR", String.class);
		TABLE_COLUMNS_MAP.put("mappingDIA_CHI_XUONG_LR", "mappingdia_chi_xuong_lr");
		TABLE_COLUMNS_DATA_MAP.put("mappingDIA_CHI_XUONG_LR", String.class);
		TABLE_COLUMNS_MAP.put("mappingNote", "mappingnote");
		TABLE_COLUMNS_DATA_MAP.put("mappingNote", String.class);
		TABLE_COLUMNS_MAP.put("mappingStatus", "mappingstatus");
		TABLE_COLUMNS_DATA_MAP.put("mappingStatus", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantCode", "productionplantcode");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantCode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantName", "productionplantname");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantName", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantAddress", "productionplantaddress");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantAddress", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantStateCode", "productionplantstatecode");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantStateCode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantStateName", "productionplantstatename");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantStateName", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantProvinceCode", "productionplantprovincecode");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantProvinceCode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantProvinceName", "productionplantprovincename");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantProvinceName", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantDistrictCode", "productionplantdistrictcode");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantDistrictCode", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantDistrictName", "productionplantdistrictname");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantDistrictName", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantEmail", "productionplantemail");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantEmail", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantPhone", "productionplantphone");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantPhone", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantFax", "productionplantfax");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantFax", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantRepresentative", "productionplantrepresentative");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantRepresentative", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantRepresentativeTitle", "productionplantrepresentativetitle");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantRepresentativeTitle", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantContactName", "productionplantcontactname");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantContactName", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantContactEmail", "productionplantcontactemail");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantContactEmail", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantContactPhone", "productionplantcontactphone");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantContactPhone", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantType", "productionplanttype");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantType", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantStatus", "productionplantstatus");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantStatus", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantEmployeesNote", "productionplantemployeesnote");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantEmployeesNote", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantEquipmentsNote", "productionplantequipmentsnote");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantEquipmentsNote", String.class);
		TABLE_COLUMNS_MAP.put("productionPlantProdEquipmentsNote", "productionplantprodequipmentsnote");
		TABLE_COLUMNS_DATA_MAP.put("productionPlantProdEquipmentsNote", String.class);
		TABLE_COLUMNS_MAP.put("registrationId", "registrationid");
		TABLE_COLUMNS_DATA_MAP.put("registrationId", long.class);
		TABLE_COLUMNS_MAP.put("registrationFormId", "registrationformid");
		TABLE_COLUMNS_DATA_MAP.put("registrationFormId", long.class);
		TABLE_COLUMNS_MAP.put("applicantProfileId", "applicantprofileid");
		TABLE_COLUMNS_DATA_MAP.put("applicantProfileId", long.class);
		TABLE_COLUMNS_MAP.put("latestCOPReportDate", "latestcopreportdate");
		TABLE_COLUMNS_DATA_MAP.put("latestCOPReportDate", Date.class);
		TABLE_COLUMNS_MAP.put("latestCOPReportResult", "latestcopreportresult");
		TABLE_COLUMNS_DATA_MAP.put("latestCOPReportResult", String.class);
		TABLE_COLUMNS_MAP.put("nextCOPReportDate", "nextcopreportdate");
		TABLE_COLUMNS_DATA_MAP.put("nextCOPReportDate", Date.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifyDate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncDate", Date.class);
	}
	@ApiModelProperty(example = "null", value = "", name = "id")
	protected Long id;
	@ApiModelProperty(example = "null", value = "", name = "mtcore")
	protected Long mtCore;
	@ApiModelProperty(example = "null", value = "", name = "mappingma_cty")
	protected String mappingMA_CTY;
	@ApiModelProperty(example = "null", value = "", name = "mappingten_cty")
	protected String mappingTEN_CTY;
	@ApiModelProperty(example = "null", value = "", name = "mappingdia_chi_cty")
	protected String mappingDIA_CHI_CTY;
	@ApiModelProperty(example = "null", value = "", name = "mappingma_xuong_lr")
	protected String mappingMA_XUONG_LR;
	@ApiModelProperty(example = "null", value = "", name = "mappingten_xuong_lr")
	protected String mappingTEN_XUONG_LR;
	@ApiModelProperty(example = "null", value = "", name = "mappingdia_chi_xuong_lr")
	protected String mappingDIA_CHI_XUONG_LR;
	@ApiModelProperty(example = "null", value = "", name = "mappingnote")
	protected String mappingNote;
	@ApiModelProperty(example = "null", value = "", name = "mappingstatus")
	protected String mappingStatus;
	@ApiModelProperty(example = "null", value = "", name = "productionplantcode")
	protected String productionPlantCode;
	@ApiModelProperty(example = "null", value = "", name = "productionplantname")
	protected String productionPlantName;
	@ApiModelProperty(example = "null", value = "", name = "productionplantaddress")
	protected String productionPlantAddress;
	@ApiModelProperty(example = "null", value = "", name = "productionplantstatecode")
	protected String productionPlantStateCode;
	@ApiModelProperty(example = "null", value = "", name = "productionplantstatename")
	protected String productionPlantStateName;
	@ApiModelProperty(example = "null", value = "", name = "productionplantprovincecode")
	protected String productionPlantProvinceCode;
	@ApiModelProperty(example = "null", value = "", name = "productionplantprovincename")
	protected String productionPlantProvinceName;
	@ApiModelProperty(example = "null", value = "", name = "productionplantdistrictcode")
	protected String productionPlantDistrictCode;
	@ApiModelProperty(example = "null", value = "", name = "productionplantdistrictname")
	protected String productionPlantDistrictName;
	@ApiModelProperty(example = "null", value = "", name = "productionplantemail")
	protected String productionPlantEmail;
	@ApiModelProperty(example = "null", value = "", name = "productionplantphone")
	protected String productionPlantPhone;
	@ApiModelProperty(example = "null", value = "", name = "productionplantfax")
	protected String productionPlantFax;
	@ApiModelProperty(example = "null", value = "", name = "productionplantrepresentative")
	protected String productionPlantRepresentative;
	@ApiModelProperty(example = "null", value = "", name = "productionplantrepresentativetitle")
	protected String productionPlantRepresentativeTitle;
	@ApiModelProperty(example = "null", value = "", name = "productionplantcontactname")
	protected String productionPlantContactName;
	@ApiModelProperty(example = "null", value = "", name = "productionplantcontactemail")
	protected String productionPlantContactEmail;
	@ApiModelProperty(example = "null", value = "", name = "productionplantcontactphone")
	protected String productionPlantContactPhone;
	@ApiModelProperty(example = "null", value = "", name = "productionplanttype")
	protected String productionPlantType;
	@ApiModelProperty(example = "null", value = "", name = "productionplantstatus")
	protected String productionPlantStatus;
	@ApiModelProperty(example = "null", value = "", name = "productionplantemployeesnote")
	protected String productionPlantEmployeesNote;
	@ApiModelProperty(example = "null", value = "", name = "productionplantequipmentsnote")
	protected String productionPlantEquipmentsNote;
	@ApiModelProperty(example = "null", value = "", name = "productionplantprodequipmentsnote")
	protected String productionPlantProdEquipmentsNote;
	@ApiModelProperty(example = "null", value = "", name = "registrationid")
	protected Long registrationId;
	@ApiModelProperty(example = "null", value = "", name = "registrationformid")
	protected Long registrationFormId;
	@ApiModelProperty(example = "null", value = "", name = "applicantprofileid")
	protected Long applicantProfileId;
	@ApiModelProperty(example = "null", value = "", name = "latestcopreportdate")
	protected String latestCOPReportDate;
	@ApiModelProperty(example = "null", value = "", name = "latestcopreportresult")
	protected String latestCOPReportResult;
	@ApiModelProperty(example = "null", value = "", name = "nextcopreportdate")
	protected String nextCOPReportDate;
	@ApiModelProperty(example = "null", value = "", name = "modifydate")
	protected String modifyDate;
	@ApiModelProperty(example = "null", value = "", name = "syncdate")
	protected String syncDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMtCore() {
		return mtCore;
	}

	public void setMtCore(Long mtCore) {
		this.mtCore = mtCore;
	}

	public String getMappingMA_CTY() {
		return mappingMA_CTY;
	}

	public void setMappingMA_CTY(String mappingMA_CTY) {
		this.mappingMA_CTY = mappingMA_CTY;
	}

	public String getMappingTEN_CTY() {
		return mappingTEN_CTY;
	}

	public void setMappingTEN_CTY(String mappingTEN_CTY) {
		this.mappingTEN_CTY = mappingTEN_CTY;
	}

	public String getMappingDIA_CHI_CTY() {
		return mappingDIA_CHI_CTY;
	}

	public void setMappingDIA_CHI_CTY(String mappingDIA_CHI_CTY) {
		this.mappingDIA_CHI_CTY = mappingDIA_CHI_CTY;
	}

	public String getMappingMA_XUONG_LR() {
		return mappingMA_XUONG_LR;
	}

	public void setMappingMA_XUONG_LR(String mappingMA_XUONG_LR) {
		this.mappingMA_XUONG_LR = mappingMA_XUONG_LR;
	}

	public String getMappingTEN_XUONG_LR() {
		return mappingTEN_XUONG_LR;
	}

	public void setMappingTEN_XUONG_LR(String mappingTEN_XUONG_LR) {
		this.mappingTEN_XUONG_LR = mappingTEN_XUONG_LR;
	}

	public String getMappingDIA_CHI_XUONG_LR() {
		return mappingDIA_CHI_XUONG_LR;
	}

	public void setMappingDIA_CHI_XUONG_LR(String mappingDIA_CHI_XUONG_LR) {
		this.mappingDIA_CHI_XUONG_LR = mappingDIA_CHI_XUONG_LR;
	}

	public String getMappingNote() {
		return mappingNote;
	}

	public void setMappingNote(String mappingNote) {
		this.mappingNote = mappingNote;
	}

	public String getMappingStatus() {
		return mappingStatus;
	}

	public void setMappingStatus(String mappingStatus) {
		this.mappingStatus = mappingStatus;
	}

	public String getProductionPlantCode() {
		return productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		this.productionPlantCode = productionPlantCode;
	}

	public String getProductionPlantName() {
		return productionPlantName;
	}

	public void setProductionPlantName(String productionPlantName) {
		this.productionPlantName = productionPlantName;
	}

	public String getProductionPlantAddress() {
		return productionPlantAddress;
	}

	public void setProductionPlantAddress(String productionPlantAddress) {
		this.productionPlantAddress = productionPlantAddress;
	}

	public String getProductionPlantStateCode() {
		return productionPlantStateCode;
	}

	public void setProductionPlantStateCode(String productionPlantStateCode) {
		this.productionPlantStateCode = productionPlantStateCode;
	}

	public String getProductionPlantStateName() {
		return productionPlantStateName;
	}

	public void setProductionPlantStateName(String productionPlantStateName) {
		this.productionPlantStateName = productionPlantStateName;
	}

	public String getProductionPlantProvinceCode() {
		return productionPlantProvinceCode;
	}

	public void setProductionPlantProvinceCode(String productionPlantProvinceCode) {
		this.productionPlantProvinceCode = productionPlantProvinceCode;
	}

	public String getProductionPlantProvinceName() {
		return productionPlantProvinceName;
	}

	public void setProductionPlantProvinceName(String productionPlantProvinceName) {
		this.productionPlantProvinceName = productionPlantProvinceName;
	}

	public String getProductionPlantDistrictCode() {
		return productionPlantDistrictCode;
	}

	public void setProductionPlantDistrictCode(String productionPlantDistrictCode) {
		this.productionPlantDistrictCode = productionPlantDistrictCode;
	}

	public String getProductionPlantDistrictName() {
		return productionPlantDistrictName;
	}

	public void setProductionPlantDistrictName(String productionPlantDistrictName) {
		this.productionPlantDistrictName = productionPlantDistrictName;
	}

	public String getProductionPlantEmail() {
		return productionPlantEmail;
	}

	public void setProductionPlantEmail(String productionPlantEmail) {
		this.productionPlantEmail = productionPlantEmail;
	}

	public String getProductionPlantPhone() {
		return productionPlantPhone;
	}

	public void setProductionPlantPhone(String productionPlantPhone) {
		this.productionPlantPhone = productionPlantPhone;
	}

	public String getProductionPlantFax() {
		return productionPlantFax;
	}

	public void setProductionPlantFax(String productionPlantFax) {
		this.productionPlantFax = productionPlantFax;
	}

	public String getProductionPlantRepresentative() {
		return productionPlantRepresentative;
	}

	public void setProductionPlantRepresentative(String productionPlantRepresentative) {
		this.productionPlantRepresentative = productionPlantRepresentative;
	}

	public String getProductionPlantRepresentativeTitle() {
		return productionPlantRepresentativeTitle;
	}

	public void setProductionPlantRepresentativeTitle(String productionPlantRepresentativeTitle) {
		this.productionPlantRepresentativeTitle = productionPlantRepresentativeTitle;
	}

	public String getProductionPlantContactName() {
		return productionPlantContactName;
	}

	public void setProductionPlantContactName(String productionPlantContactName) {
		this.productionPlantContactName = productionPlantContactName;
	}

	public String getProductionPlantContactEmail() {
		return productionPlantContactEmail;
	}

	public void setProductionPlantContactEmail(String productionPlantContactEmail) {
		this.productionPlantContactEmail = productionPlantContactEmail;
	}

	public String getProductionPlantContactPhone() {
		return productionPlantContactPhone;
	}

	public void setProductionPlantContactPhone(String productionPlantContactPhone) {
		this.productionPlantContactPhone = productionPlantContactPhone;
	}

	public String getProductionPlantType() {
		return productionPlantType;
	}

	public void setProductionPlantType(String productionPlantType) {
		this.productionPlantType = productionPlantType;
	}

	public String getProductionPlantStatus() {
		return productionPlantStatus;
	}

	public void setProductionPlantStatus(String productionPlantStatus) {
		this.productionPlantStatus = productionPlantStatus;
	}

	public String getProductionPlantEmployeesNote() {
		return productionPlantEmployeesNote;
	}

	public void setProductionPlantEmployeesNote(String productionPlantEmployeesNote) {
		this.productionPlantEmployeesNote = productionPlantEmployeesNote;
	}

	public String getProductionPlantEquipmentsNote() {
		return productionPlantEquipmentsNote;
	}

	public void setProductionPlantEquipmentsNote(String productionPlantEquipmentsNote) {
		this.productionPlantEquipmentsNote = productionPlantEquipmentsNote;
	}

	public String getProductionPlantProdEquipmentsNote() {
		return productionPlantProdEquipmentsNote;
	}

	public void setProductionPlantProdEquipmentsNote(String productionPlantProdEquipmentsNote) {
		this.productionPlantProdEquipmentsNote = productionPlantProdEquipmentsNote;
	}

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public Long getRegistrationFormId() {
		return registrationFormId;
	}

	public void setRegistrationFormId(Long registrationFormId) {
		this.registrationFormId = registrationFormId;
	}

	public Long getApplicantProfileId() {
		return applicantProfileId;
	}

	public void setApplicantProfileId(Long applicantProfileId) {
		this.applicantProfileId = applicantProfileId;
	}

	public String getLatestCOPReportDate() {
		return latestCOPReportDate;
	}

	public void setLatestCOPReportDate(String latestCOPReportDate) {
		this.latestCOPReportDate = latestCOPReportDate;
	}

	public String getLatestCOPReportResult() {
		return latestCOPReportResult;
	}

	public void setLatestCOPReportResult(String latestCOPReportResult) {
		this.latestCOPReportResult = latestCOPReportResult;
	}

	public String getNextCOPReportDate() {
		return nextCOPReportDate;
	}

	public void setNextCOPReportDate(String nextCOPReportDate) {
		this.nextCOPReportDate = nextCOPReportDate;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getSyncDate() {
		return syncDate;
	}

	public void setSyncDate(String syncDate) {
		this.syncDate = syncDate;
	}

}
