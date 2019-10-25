package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRApplicantProfileApiModel")
public class VRApplicantProfileApiModel {
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
		TABLE_COLUMNS_MAP.put("mappingNote", "mappingnote");
		TABLE_COLUMNS_DATA_MAP.put("mappingNote", String.class);
		TABLE_COLUMNS_MAP.put("mappingStatus", "mappingstatus");
		TABLE_COLUMNS_DATA_MAP.put("mappingStatus", String.class);
		TABLE_COLUMNS_MAP.put("applicantCode", "applicantcode");
		TABLE_COLUMNS_DATA_MAP.put("applicantCode", String.class);
		TABLE_COLUMNS_MAP.put("applicantName", "applicantname");
		TABLE_COLUMNS_DATA_MAP.put("applicantName", String.class);
		TABLE_COLUMNS_MAP.put("applicantAddress", "applicantaddress");
		TABLE_COLUMNS_DATA_MAP.put("applicantAddress", String.class);
		TABLE_COLUMNS_MAP.put("applicantPhone", "applicantphone");
		TABLE_COLUMNS_DATA_MAP.put("applicantPhone", String.class);
		TABLE_COLUMNS_MAP.put("applicantEmail", "applicantemail");
		TABLE_COLUMNS_DATA_MAP.put("applicantEmail", String.class);
		TABLE_COLUMNS_MAP.put("applicantFax", "applicantfax");
		TABLE_COLUMNS_DATA_MAP.put("applicantFax", String.class);
		TABLE_COLUMNS_MAP.put("applicantRepresentative", "applicantrepresentative");
		TABLE_COLUMNS_DATA_MAP.put("applicantRepresentative", String.class);
		TABLE_COLUMNS_MAP.put("applicantRepresentativeTitle", "applicantrepresentativetitle");
		TABLE_COLUMNS_DATA_MAP.put("applicantRepresentativeTitle", String.class);
		TABLE_COLUMNS_MAP.put("applicantContactName", "applicantcontactname");
		TABLE_COLUMNS_DATA_MAP.put("applicantContactName", String.class);
		TABLE_COLUMNS_MAP.put("applicantContactEmail", "applicantcontactemail");
		TABLE_COLUMNS_DATA_MAP.put("applicantContactEmail", String.class);
		TABLE_COLUMNS_MAP.put("applicantContactPhone", "applicantcontactphone");
		TABLE_COLUMNS_DATA_MAP.put("applicantContactPhone", String.class);
		TABLE_COLUMNS_MAP.put("applicantNationality", "applicantnationality");
		TABLE_COLUMNS_DATA_MAP.put("applicantNationality", String.class);
		TABLE_COLUMNS_MAP.put("applicantRegion", "applicantregion");
		TABLE_COLUMNS_DATA_MAP.put("applicantRegion", String.class);
		TABLE_COLUMNS_MAP.put("applicantCity", "applicantcity");
		TABLE_COLUMNS_DATA_MAP.put("applicantCity", String.class);
		TABLE_COLUMNS_MAP.put("markupCorporation", "markupcorporation");
		TABLE_COLUMNS_DATA_MAP.put("markupCorporation", String.class);
		TABLE_COLUMNS_MAP.put("corporationId", "corporationid");
		TABLE_COLUMNS_DATA_MAP.put("corporationId", String.class);
		TABLE_COLUMNS_MAP.put("markupDesigner", "markupdesigner");
		TABLE_COLUMNS_DATA_MAP.put("markupDesigner", String.class);
		TABLE_COLUMNS_MAP.put("markupOverseasManufacturer", "markupoverseasmanufacturer");
		TABLE_COLUMNS_DATA_MAP.put("markupOverseasManufacturer", String.class);
		TABLE_COLUMNS_MAP.put("markupDomesticsManufacturer", "markupdomesticsmanufacturer");
		TABLE_COLUMNS_DATA_MAP.put("markupDomesticsManufacturer", String.class);
		TABLE_COLUMNS_MAP.put("markupImporter", "markupimporter");
		TABLE_COLUMNS_DATA_MAP.put("markupImporter", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXCG", "markupcomponentxcg");
		TABLE_COLUMNS_DATA_MAP.put("markupComponentXCG", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXMY", "markupcomponentxmy");
		TABLE_COLUMNS_DATA_MAP.put("markupComponentXMY", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXCD", "markupcomponentxcd");
		TABLE_COLUMNS_DATA_MAP.put("markupComponentXCD", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXDD", "markupcomponentxdd");
		TABLE_COLUMNS_DATA_MAP.put("markupComponentXDD", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXCN", "markupcomponentxcn");
		TABLE_COLUMNS_DATA_MAP.put("markupComponentXCN", String.class);
		TABLE_COLUMNS_MAP.put("markupComponentXCH", "markupcomponentxch");
		TABLE_COLUMNS_DATA_MAP.put("markupComponentXCH", String.class);
		TABLE_COLUMNS_MAP.put("markupXCG", "markupxcg");
		TABLE_COLUMNS_DATA_MAP.put("markupXCG", String.class);
		TABLE_COLUMNS_MAP.put("markupXMY", "markupxmy");
		TABLE_COLUMNS_DATA_MAP.put("markupXMY", String.class);
		TABLE_COLUMNS_MAP.put("markupXCD", "markupxcd");
		TABLE_COLUMNS_DATA_MAP.put("markupXCD", String.class);
		TABLE_COLUMNS_MAP.put("markupXDD", "markupxdd");
		TABLE_COLUMNS_DATA_MAP.put("markupXDD", String.class);
		TABLE_COLUMNS_MAP.put("markupXCN", "markupxcn");
		TABLE_COLUMNS_DATA_MAP.put("markupXCN", String.class);
		TABLE_COLUMNS_MAP.put("markupXCH", "markupxch");
		TABLE_COLUMNS_DATA_MAP.put("markupXCH", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXCG", "issuetypexcg");
		TABLE_COLUMNS_DATA_MAP.put("issueTypeXCG", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXMY", "issuetypexmy");
		TABLE_COLUMNS_DATA_MAP.put("issueTypeXMY", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXCD", "issuetypexcd");
		TABLE_COLUMNS_DATA_MAP.put("issueTypeXCD", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXDD", "issuetypexdd");
		TABLE_COLUMNS_DATA_MAP.put("issueTypeXDD", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXCN", "issuetypexcn");
		TABLE_COLUMNS_DATA_MAP.put("issueTypeXCN", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeXCH", "issuetypexch");
		TABLE_COLUMNS_DATA_MAP.put("issueTypeXCH", String.class);
		TABLE_COLUMNS_MAP.put("issueTypeDescription", "issuetypedescription");
		TABLE_COLUMNS_DATA_MAP.put("issueTypeDescription", String.class);
		TABLE_COLUMNS_MAP.put("applicantCeremonyDate", "applicantceremonydate");
		TABLE_COLUMNS_DATA_MAP.put("applicantCeremonyDate", String.class);
		TABLE_COLUMNS_MAP.put("applicantOperationPeriod", "applicantoperationperiod");
		TABLE_COLUMNS_DATA_MAP.put("applicantOperationPeriod", String.class);
		TABLE_COLUMNS_MAP.put("applicantBusinessType", "applicantbusinesstype");
		TABLE_COLUMNS_DATA_MAP.put("applicantBusinessType", String.class);
		TABLE_COLUMNS_MAP.put("applicantMetadata", "applicantmetadata");
		TABLE_COLUMNS_DATA_MAP.put("applicantMetadata", String.class);
		TABLE_COLUMNS_MAP.put("applicantStatus", "applicantstatus");
		TABLE_COLUMNS_DATA_MAP.put("applicantStatus", String.class);
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
	@ApiModelProperty(example = "null", value = "", name = "mappingnote")
	protected String mappingNote;
	@ApiModelProperty(example = "null", value = "", name = "mappingstatus")
	protected String mappingStatus;
	@ApiModelProperty(example = "null", value = "", name = "applicantcode")
	protected String applicantCode;
	@ApiModelProperty(example = "null", value = "", name = "applicantname")
	protected String applicantName;
	@ApiModelProperty(example = "null", value = "", name = "applicantaddress")
	protected String applicantAddress;
	@ApiModelProperty(example = "null", value = "", name = "applicantphone")
	protected String applicantPhone;
	@ApiModelProperty(example = "null", value = "", name = "applicantemail")
	protected String applicantEmail;
	@ApiModelProperty(example = "null", value = "", name = "applicantfax")
	protected String applicantFax;
	@ApiModelProperty(example = "null", value = "", name = "applicantrepresentative")
	protected String applicantRepresentative;
	@ApiModelProperty(example = "null", value = "", name = "applicantrepresentativetitle")
	protected String applicantRepresentativeTitle;
	@ApiModelProperty(example = "null", value = "", name = "applicantcontactname")
	protected String applicantContactName;
	@ApiModelProperty(example = "null", value = "", name = "applicantcontactemail")
	protected String applicantContactEmail;
	@ApiModelProperty(example = "null", value = "", name = "applicantcontactphone")
	protected String applicantContactPhone;
	@ApiModelProperty(example = "null", value = "", name = "applicantnationality")
	protected String applicantNationality;
	@ApiModelProperty(example = "null", value = "", name = "applicantregion")
	protected String applicantRegion;
	@ApiModelProperty(example = "null", value = "", name = "applicantcity")
	protected String applicantCity;
	@ApiModelProperty(example = "null", value = "", name = "markupcorporation")
	protected String markupCorporation;
	@ApiModelProperty(example = "null", value = "", name = "corporationid")
	protected String corporationId;
	@ApiModelProperty(example = "null", value = "", name = "markupdesigner")
	protected String markupDesigner;
	@ApiModelProperty(example = "null", value = "", name = "markupoverseasmanufacturer")
	protected String markupOverseasManufacturer;
	@ApiModelProperty(example = "null", value = "", name = "markupdomesticsmanufacturer")
	protected String markupDomesticsManufacturer;
	@ApiModelProperty(example = "null", value = "", name = "markupimporter")
	protected String markupImporter;
	@ApiModelProperty(example = "null", value = "", name = "markupcomponentxcg")
	protected String markupComponentXCG;
	@ApiModelProperty(example = "null", value = "", name = "markupcomponentxmy")
	protected String markupComponentXMY;
	@ApiModelProperty(example = "null", value = "", name = "markupcomponentxcd")
	protected String markupComponentXCD;
	@ApiModelProperty(example = "null", value = "", name = "markupcomponentxdd")
	protected String markupComponentXDD;
	@ApiModelProperty(example = "null", value = "", name = "markupcomponentxcn")
	protected String markupComponentXCN;
	@ApiModelProperty(example = "null", value = "", name = "markupcomponentxch")
	protected String markupComponentXCH;
	@ApiModelProperty(example = "null", value = "", name = "markupxcg")
	protected String markupXCG;
	@ApiModelProperty(example = "null", value = "", name = "markupxmy")
	protected String markupXMY;
	@ApiModelProperty(example = "null", value = "", name = "markupxcd")
	protected String markupXCD;
	@ApiModelProperty(example = "null", value = "", name = "markupxdd")
	protected String markupXDD;
	@ApiModelProperty(example = "null", value = "", name = "markupxcn")
	protected String markupXCN;
	@ApiModelProperty(example = "null", value = "", name = "markupxch")
	protected String markupXCH;
	@ApiModelProperty(example = "null", value = "", name = "issuetypexcg")
	protected String issueTypeXCG;
	@ApiModelProperty(example = "null", value = "", name = "issuetypexmy")
	protected String issueTypeXMY;
	@ApiModelProperty(example = "null", value = "", name = "issuetypexcd")
	protected String issueTypeXCD;
	@ApiModelProperty(example = "null", value = "", name = "issuetypexdd")
	protected String issueTypeXDD;
	@ApiModelProperty(example = "null", value = "", name = "issuetypexcn")
	protected String issueTypeXCN;
	@ApiModelProperty(example = "null", value = "", name = "issuetypexch")
	protected String issueTypeXCH;
	@ApiModelProperty(example = "null", value = "", name = "issuetypedescription")
	protected String issueTypeDescription;
	@ApiModelProperty(example = "null", value = "", name = "applicantceremonydate")
	protected String applicantCeremonyDate;
	@ApiModelProperty(example = "null", value = "", name = "applicantoperationperiod")
	protected String applicantOperationPeriod;
	@ApiModelProperty(example = "null", value = "", name = "applicantbusinesstype")
	protected String applicantBusinessType;
	@ApiModelProperty(example = "null", value = "", name = "applicantmetadata")
	protected String applicantMetadata;
	@ApiModelProperty(example = "null", value = "", name = "applicantstatus")
	protected String applicantStatus;
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

	public String getApplicantCode() {
		return applicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		this.applicantCode = applicantCode;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getApplicantPhone() {
		return applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public String getApplicantFax() {
		return applicantFax;
	}

	public void setApplicantFax(String applicantFax) {
		this.applicantFax = applicantFax;
	}

	public String getApplicantRepresentative() {
		return applicantRepresentative;
	}

	public void setApplicantRepresentative(String applicantRepresentative) {
		this.applicantRepresentative = applicantRepresentative;
	}

	public String getApplicantRepresentativeTitle() {
		return applicantRepresentativeTitle;
	}

	public void setApplicantRepresentativeTitle(String applicantRepresentativeTitle) {
		this.applicantRepresentativeTitle = applicantRepresentativeTitle;
	}

	public String getApplicantContactName() {
		return applicantContactName;
	}

	public void setApplicantContactName(String applicantContactName) {
		this.applicantContactName = applicantContactName;
	}

	public String getApplicantContactEmail() {
		return applicantContactEmail;
	}

	public void setApplicantContactEmail(String applicantContactEmail) {
		this.applicantContactEmail = applicantContactEmail;
	}

	public String getApplicantContactPhone() {
		return applicantContactPhone;
	}

	public void setApplicantContactPhone(String applicantContactPhone) {
		this.applicantContactPhone = applicantContactPhone;
	}

	public String getApplicantNationality() {
		return applicantNationality;
	}

	public void setApplicantNationality(String applicantNationality) {
		this.applicantNationality = applicantNationality;
	}

	public String getApplicantRegion() {
		return applicantRegion;
	}

	public void setApplicantRegion(String applicantRegion) {
		this.applicantRegion = applicantRegion;
	}

	public String getApplicantCity() {
		return applicantCity;
	}

	public void setApplicantCity(String applicantCity) {
		this.applicantCity = applicantCity;
	}

	public String getMarkupCorporation() {
		return markupCorporation;
	}

	public void setMarkupCorporation(String markupCorporation) {
		this.markupCorporation = markupCorporation;
	}

	public String getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(String corporationId) {
		this.corporationId = corporationId;
	}

	public String getMarkupDesigner() {
		return markupDesigner;
	}

	public void setMarkupDesigner(String markupDesigner) {
		this.markupDesigner = markupDesigner;
	}

	public String getMarkupOverseasManufacturer() {
		return markupOverseasManufacturer;
	}

	public void setMarkupOverseasManufacturer(String markupOverseasManufacturer) {
		this.markupOverseasManufacturer = markupOverseasManufacturer;
	}

	public String getMarkupDomesticsManufacturer() {
		return markupDomesticsManufacturer;
	}

	public void setMarkupDomesticsManufacturer(String markupDomesticsManufacturer) {
		this.markupDomesticsManufacturer = markupDomesticsManufacturer;
	}

	public String getMarkupImporter() {
		return markupImporter;
	}

	public void setMarkupImporter(String markupImporter) {
		this.markupImporter = markupImporter;
	}

	public String getMarkupComponentXCG() {
		return markupComponentXCG;
	}

	public void setMarkupComponentXCG(String markupComponentXCG) {
		this.markupComponentXCG = markupComponentXCG;
	}

	public String getMarkupComponentXMY() {
		return markupComponentXMY;
	}

	public void setMarkupComponentXMY(String markupComponentXMY) {
		this.markupComponentXMY = markupComponentXMY;
	}

	public String getMarkupComponentXCD() {
		return markupComponentXCD;
	}

	public void setMarkupComponentXCD(String markupComponentXCD) {
		this.markupComponentXCD = markupComponentXCD;
	}

	public String getMarkupComponentXDD() {
		return markupComponentXDD;
	}

	public void setMarkupComponentXDD(String markupComponentXDD) {
		this.markupComponentXDD = markupComponentXDD;
	}

	public String getMarkupComponentXCN() {
		return markupComponentXCN;
	}

	public void setMarkupComponentXCN(String markupComponentXCN) {
		this.markupComponentXCN = markupComponentXCN;
	}

	public String getMarkupComponentXCH() {
		return markupComponentXCH;
	}

	public void setMarkupComponentXCH(String markupComponentXCH) {
		this.markupComponentXCH = markupComponentXCH;
	}

	public String getMarkupXCG() {
		return markupXCG;
	}

	public void setMarkupXCG(String markupXCG) {
		this.markupXCG = markupXCG;
	}

	public String getMarkupXMY() {
		return markupXMY;
	}

	public void setMarkupXMY(String markupXMY) {
		this.markupXMY = markupXMY;
	}

	public String getMarkupXCD() {
		return markupXCD;
	}

	public void setMarkupXCD(String markupXCD) {
		this.markupXCD = markupXCD;
	}

	public String getMarkupXDD() {
		return markupXDD;
	}

	public void setMarkupXDD(String markupXDD) {
		this.markupXDD = markupXDD;
	}

	public String getMarkupXCN() {
		return markupXCN;
	}

	public void setMarkupXCN(String markupXCN) {
		this.markupXCN = markupXCN;
	}

	public String getMarkupXCH() {
		return markupXCH;
	}

	public void setMarkupXCH(String markupXCH) {
		this.markupXCH = markupXCH;
	}

	public String getIssueTypeXCG() {
		return issueTypeXCG;
	}

	public void setIssueTypeXCG(String issueTypeXCG) {
		this.issueTypeXCG = issueTypeXCG;
	}

	public String getIssueTypeXMY() {
		return issueTypeXMY;
	}

	public void setIssueTypeXMY(String issueTypeXMY) {
		this.issueTypeXMY = issueTypeXMY;
	}

	public String getIssueTypeXCD() {
		return issueTypeXCD;
	}

	public void setIssueTypeXCD(String issueTypeXCD) {
		this.issueTypeXCD = issueTypeXCD;
	}

	public String getIssueTypeXDD() {
		return issueTypeXDD;
	}

	public void setIssueTypeXDD(String issueTypeXDD) {
		this.issueTypeXDD = issueTypeXDD;
	}

	public String getIssueTypeXCN() {
		return issueTypeXCN;
	}

	public void setIssueTypeXCN(String issueTypeXCN) {
		this.issueTypeXCN = issueTypeXCN;
	}

	public String getIssueTypeXCH() {
		return issueTypeXCH;
	}

	public void setIssueTypeXCH(String issueTypeXCH) {
		this.issueTypeXCH = issueTypeXCH;
	}

	public String getIssueTypeDescription() {
		return issueTypeDescription;
	}

	public void setIssueTypeDescription(String issueTypeDescription) {
		this.issueTypeDescription = issueTypeDescription;
	}

	public String getApplicantCeremonyDate() {
		return applicantCeremonyDate;
	}

	public void setApplicantCeremonyDate(String applicantCeremonyDate) {
		this.applicantCeremonyDate = applicantCeremonyDate;
	}

	public String getApplicantOperationPeriod() {
		return applicantOperationPeriod;
	}

	public void setApplicantOperationPeriod(String applicantOperationPeriod) {
		this.applicantOperationPeriod = applicantOperationPeriod;
	}

	public String getApplicantBusinessType() {
		return applicantBusinessType;
	}

	public void setApplicantBusinessType(String applicantBusinessType) {
		this.applicantBusinessType = applicantBusinessType;
	}

	public String getApplicantMetadata() {
		return applicantMetadata;
	}

	public void setApplicantMetadata(String applicantMetadata) {
		this.applicantMetadata = applicantMetadata;
	}

	public String getApplicantStatus() {
		return applicantStatus;
	}

	public void setApplicantStatus(String applicantStatus) {
		this.applicantStatus = applicantStatus;
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
