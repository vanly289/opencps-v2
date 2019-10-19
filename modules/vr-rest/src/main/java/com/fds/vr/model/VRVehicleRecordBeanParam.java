package com.fds.vr.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "mtcore", "issueid", "issuevehiclecertificateid", "dossierid",
		"applicantprofileid", "applicantname", "applicantaddress", "certificateid", "productionnumber",
		"productiondate", "frameno", "boxno", "engineno", "color", "stampshortno", "serialno", "vehiclerecordstatus",
		"printingstatus", "attachedfile", "signname", "signtitle", "signplace", "signdate", "modifydate", "syncdate",
		"certificaterecordno", "keyword", "start", "end", "order_asc", "order_desc" })
@XmlRootElement(name = "VRVehicleRecordBeanParam")
public class VRVehicleRecordBeanParam {
	@QueryParam(value = "keyword")
	protected String keyword;
	@DefaultValue("0")
	@QueryParam(value = "start")
	protected int start;
	@DefaultValue("20")
	@QueryParam(value = "end")
	protected int end;
	@QueryParam(value = "order_asc")
	protected String order_asc;
	@QueryParam(value = "order_desc")
	protected String order_desc;
	@QueryParam(value = "id")
	protected Long id;
	@QueryParam(value = "mtcore")
	protected Long mtCore;
	@QueryParam(value = "issueid")
	protected Long issueId;
	@QueryParam(value = "issuevehiclecertificateid")
	protected Long issueVehicleCertificateId;
	@QueryParam(value = "dossierid")
	protected Long dossierId;
	@QueryParam(value = "applicantprofileid")
	protected Long applicantProfileId;
	@QueryParam(value = "applicantname")
	protected String applicantName;
	@QueryParam(value = "applicantaddress")
	protected String applicantAddress;
	@QueryParam(value = "certificateid")
	protected Long certificateId;
	@QueryParam(value = "productionnumber")
	protected String productionNumber;
	@QueryParam(value = "productiondate")
	protected String productionDate;
	@QueryParam(value = "frameno")
	protected String frameNo;
	@QueryParam(value = "boxno")
	protected String boxNo;
	@QueryParam(value = "engineno")
	protected String engineNo;
	@QueryParam(value = "color")
	protected String color;
	@QueryParam(value = "stampshortno")
	protected String stampShortNo;
	@QueryParam(value = "serialno")
	protected String serialNo;
	@QueryParam(value = "vehiclerecordstatus")
	protected Long vehicleRecordStatus;
	@QueryParam(value = "printingstatus")
	protected Long printingStatus;
	@QueryParam(value = "attachedfile")
	protected Long attachedFile;
	@QueryParam(value = "signname")
	protected String signName;
	@QueryParam(value = "signtitle")
	protected String signTitle;
	@QueryParam(value = "signplace")
	protected String signPlace;
	@QueryParam(value = "signdate")
	protected String signDate;
	@QueryParam(value = "modifydate")
	protected String modifyDate;
	@QueryParam(value = "syncdate")
	protected String syncDate;
	@QueryParam(value = "certificaterecordno")
	protected String certificaterecordno;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getOrder_asc() {
		return order_asc;
	}

	public void setOrder_asc(String order_asc) {
		this.order_asc = order_asc;
	}

	public String getOrder_desc() {
		return order_desc;
	}

	public void setOrder_desc(String order_desc) {
		this.order_desc = order_desc;
	}

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

	public Long getIssueId() {
		return issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public Long getIssueVehicleCertificateId() {
		return issueVehicleCertificateId;
	}

	public void setIssueVehicleCertificateId(Long issueVehicleCertificateId) {
		this.issueVehicleCertificateId = issueVehicleCertificateId;
	}

	public Long getDossierId() {
		return dossierId;
	}

	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}

	public Long getApplicantProfileId() {
		return applicantProfileId;
	}

	public void setApplicantProfileId(Long applicantProfileId) {
		this.applicantProfileId = applicantProfileId;
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

	public Long getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
	}

	public String getProductionNumber() {
		return productionNumber;
	}

	public void setProductionNumber(String productionNumber) {
		this.productionNumber = productionNumber;
	}

	public String getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}

	public String getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public String getBoxNo() {
		return boxNo;
	}

	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStampShortNo() {
		return stampShortNo;
	}

	public void setStampShortNo(String stampShortNo) {
		this.stampShortNo = stampShortNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Long getVehicleRecordStatus() {
		return vehicleRecordStatus;
	}

	public void setVehicleRecordStatus(Long vehicleRecordStatus) {
		this.vehicleRecordStatus = vehicleRecordStatus;
	}

	public Long getPrintingStatus() {
		return printingStatus;
	}

	public void setPrintingStatus(Long printingStatus) {
		this.printingStatus = printingStatus;
	}

	public Long getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(Long attachedFile) {
		this.attachedFile = attachedFile;
	}

	public String getSignName() {
		return signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
	}

	public String getSignTitle() {
		return signTitle;
	}

	public void setSignTitle(String signTitle) {
		this.signTitle = signTitle;
	}

	public String getSignPlace() {
		return signPlace;
	}

	public void setSignPlace(String signPlace) {
		this.signPlace = signPlace;
	}

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
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

	public String getCertificaterecordno() {
		return certificaterecordno;
	}

	public void setCertificaterecordno(String certificaterecordno) {
		this.certificaterecordno = certificaterecordno;
	}

}
