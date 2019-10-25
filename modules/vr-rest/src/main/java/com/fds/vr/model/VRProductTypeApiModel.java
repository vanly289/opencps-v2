package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductTypeApiModel")
public class VRProductTypeApiModel {
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
		TABLE_COLUMNS_MAP.put("vehicleClass", "vehicleclass");
		TABLE_COLUMNS_DATA_MAP.put("vehicleClass", String.class);
		TABLE_COLUMNS_MAP.put("vehicleTypeCode", "vehicletypecode");
		TABLE_COLUMNS_DATA_MAP.put("vehicleTypeCode", String.class);
		TABLE_COLUMNS_MAP.put("vehicleTypeDescription", "vehicletypedescription");
		TABLE_COLUMNS_DATA_MAP.put("vehicleTypeDescription", String.class);
		TABLE_COLUMNS_MAP.put("productClassificationCode", "productclassificationcode");
		TABLE_COLUMNS_DATA_MAP.put("productClassificationCode", String.class);
		TABLE_COLUMNS_MAP.put("productClassificationDescription", "productclassificationdescription");
		TABLE_COLUMNS_DATA_MAP.put("productClassificationDescription", String.class);
		TABLE_COLUMNS_MAP.put("trademark", "trademark");
		TABLE_COLUMNS_DATA_MAP.put("trademark", String.class);
		TABLE_COLUMNS_MAP.put("trademarkName", "trademarkname");
		TABLE_COLUMNS_DATA_MAP.put("trademarkName", String.class);
		TABLE_COLUMNS_MAP.put("commercialName", "commercialname");
		TABLE_COLUMNS_DATA_MAP.put("commercialName", String.class);
		TABLE_COLUMNS_MAP.put("modelCode", "modelcode");
		TABLE_COLUMNS_DATA_MAP.put("modelCode", String.class);
		TABLE_COLUMNS_MAP.put("designSymbolNo", "designsymbolno");
		TABLE_COLUMNS_DATA_MAP.put("designSymbolNo", String.class);
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
	@ApiModelProperty(example = "null", value = "", name = "vehicleclass")
	protected String vehicleClass;
	@ApiModelProperty(example = "null", value = "", name = "vehicletypecode")
	protected String vehicleTypeCode;
	@ApiModelProperty(example = "null", value = "", name = "vehicletypedescription")
	protected String vehicleTypeDescription;
	@ApiModelProperty(example = "null", value = "", name = "productclassificationcode")
	protected String productClassificationCode;
	@ApiModelProperty(example = "null", value = "", name = "productclassificationdescription")
	protected String productClassificationDescription;
	@ApiModelProperty(example = "null", value = "", name = "trademark")
	protected String trademark;
	@ApiModelProperty(example = "null", value = "", name = "trademarkname")
	protected String trademarkName;
	@ApiModelProperty(example = "null", value = "", name = "commercialname")
	protected String commercialName;
	@ApiModelProperty(example = "null", value = "", name = "modelcode")
	protected String modelCode;
	@ApiModelProperty(example = "null", value = "", name = "designsymbolno")
	protected String designSymbolNo;
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

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleTypeCode() {
		return vehicleTypeCode;
	}

	public void setVehicleTypeCode(String vehicleTypeCode) {
		this.vehicleTypeCode = vehicleTypeCode;
	}

	public String getVehicleTypeDescription() {
		return vehicleTypeDescription;
	}

	public void setVehicleTypeDescription(String vehicleTypeDescription) {
		this.vehicleTypeDescription = vehicleTypeDescription;
	}

	public String getProductClassificationCode() {
		return productClassificationCode;
	}

	public void setProductClassificationCode(String productClassificationCode) {
		this.productClassificationCode = productClassificationCode;
	}

	public String getProductClassificationDescription() {
		return productClassificationDescription;
	}

	public void setProductClassificationDescription(String productClassificationDescription) {
		this.productClassificationDescription = productClassificationDescription;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getTrademarkName() {
		return trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
	}

	public String getCommercialName() {
		return commercialName;
	}

	public void setCommercialName(String commercialName) {
		this.commercialName = commercialName;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getDesignSymbolNo() {
		return designSymbolNo;
	}

	public void setDesignSymbolNo(String designSymbolNo) {
		this.designSymbolNo = designSymbolNo;
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
