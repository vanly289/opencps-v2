package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionPlantEmployeeApiModel")
public class VRProductionPlantEmployeeApiModel {
	public static final Map<String, String> TABLE_COLUMNS_MAP = new LinkedHashMap<String, String>();
	public static final Map<String, Class<?>> TABLE_COLUMNS_DATA_MAP = new LinkedHashMap<String, Class<?>>();
	static {
		TABLE_COLUMNS_MAP.put("id", "id");
		TABLE_COLUMNS_DATA_MAP.put("id", long.class);
		TABLE_COLUMNS_MAP.put("mtCore", "mtcore");
		TABLE_COLUMNS_DATA_MAP.put("mtCore", long.class);
		TABLE_COLUMNS_MAP.put("productPlantID", "productplantid");
		TABLE_COLUMNS_DATA_MAP.put("productPlantID", long.class);
		TABLE_COLUMNS_MAP.put("sequenceNo", "sequenceno");
		TABLE_COLUMNS_DATA_MAP.put("sequenceNo", long.class);
		TABLE_COLUMNS_MAP.put("employeeName", "employeename");
		TABLE_COLUMNS_DATA_MAP.put("employeeName", String.class);
		TABLE_COLUMNS_MAP.put("employeeCertificateNo", "employeecertificateno");
		TABLE_COLUMNS_DATA_MAP.put("employeeCertificateNo", String.class);
		TABLE_COLUMNS_MAP.put("trainningAt", "trainningat");
		TABLE_COLUMNS_DATA_MAP.put("trainningAt", String.class);
		TABLE_COLUMNS_MAP.put("modifyDate", "modifydate");
		TABLE_COLUMNS_DATA_MAP.put("modifyDate", Date.class);
		TABLE_COLUMNS_MAP.put("syncDate", "syncdate");
		TABLE_COLUMNS_DATA_MAP.put("syncDate", Date.class);
	}
	@ApiModelProperty(example = "null", value = "", name = "id")
	protected Long id;
	@ApiModelProperty(example = "null", value = "", name = "mtcore")
	protected Long mtCore;
	@ApiModelProperty(example = "null", value = "", name = "productplantid")
	protected Long productPlantID;
	@ApiModelProperty(example = "null", value = "", name = "sequenceno")
	protected Long sequenceNo;
	@ApiModelProperty(example = "null", value = "", name = "employeename")
	protected String employeeName;
	@ApiModelProperty(example = "null", value = "", name = "employeecertificateno")
	protected String employeeCertificateNo;
	@ApiModelProperty(example = "null", value = "", name = "trainningat")
	protected String trainningAt;
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

	public Long getProductPlantID() {
		return productPlantID;
	}

	public void setProductPlantID(Long productPlantID) {
		this.productPlantID = productPlantID;
	}

	public Long getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Long sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCertificateNo() {
		return employeeCertificateNo;
	}

	public void setEmployeeCertificateNo(String employeeCertificateNo) {
		this.employeeCertificateNo = employeeCertificateNo;
	}

	public String getTrainningAt() {
		return trainningAt;
	}

	public void setTrainningAt(String trainningAt) {
		this.trainningAt = trainningAt;
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
