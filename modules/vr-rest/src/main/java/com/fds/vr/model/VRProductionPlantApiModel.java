package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "VRProductionPlantApiModel")
public class VRProductionPlantApiModel {
	@ApiModelProperty(example = "null", value = "")
	protected Long id;
	@ApiModelProperty(example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(example = "null", value = "")
	protected String mappingMA_CTY;
	@ApiModelProperty(example = "null", value = "")
	protected String mappingTEN_CTY;
	@ApiModelProperty(example = "null", value = "")
	protected String mappingDIA_CHI_CTY;
	@ApiModelProperty(example = "null", value = "")
	protected String mappingMA_XUONG_LR;
	@ApiModelProperty(example = "null", value = "")
	protected String mappingTEN_XUONG_LR;
	@ApiModelProperty(example = "null", value = "")
	protected String mappingDIA_CHI_XUONG_LR;
	@ApiModelProperty(example = "null", value = "")
	protected String mappingNote;
	@ApiModelProperty(example = "null", value = "")
	protected String mappingStatus;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantCode;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantName;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantAddress;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantStateCode;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantStateName;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantProvinceCode;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantProvinceName;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantDistrictCode;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantDistrictName;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantEmail;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantPhone;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantFax;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantRepresentative;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantRepresentativeTitle;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantContactName;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantContactEmail;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantContactPhone;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantType;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantStatus;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantEmployeesNote;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantEquipmentsNote;
	@ApiModelProperty(example = "null", value = "")
	protected String productionPlantProdEquipmentsNote;
	@ApiModelProperty(example = "null", value = "")
	protected Long registrationId;
	@ApiModelProperty(example = "null", value = "")
	protected Long registrationFormId;
	@ApiModelProperty(example = "null", value = "")
	protected Long applicantProfileId;
	@ApiModelProperty(example = "null", value = "")
	protected String latestCOPReportDate;
	@ApiModelProperty(example = "null", value = "")
	protected String latestCOPReportResult;
	@ApiModelProperty(example = "null", value = "")
	protected String nextCOPReportDate;
	@ApiModelProperty(example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(example = "null", value = "")
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
