package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;

@XmlRootElement(name = "VRProductionPlantProdEquipmentApiModel")
public class VRProductionPlantProdEquipmentApiModel {
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
		TABLE_COLUMNS_MAP.put("equipmentCode", "equipmentcode");
		TABLE_COLUMNS_DATA_MAP.put("equipmentCode", String.class);
		TABLE_COLUMNS_MAP.put("equipmentName", "equipmentname");
		TABLE_COLUMNS_DATA_MAP.put("equipmentName", String.class);
		TABLE_COLUMNS_MAP.put("equipmentType", "equipmenttype");
		TABLE_COLUMNS_DATA_MAP.put("equipmentType", String.class);
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
		TABLE_COLUMNS_MAP.put("productionCountryCode", "productioncountrycode");
		TABLE_COLUMNS_DATA_MAP.put("productionCountryCode", String.class);
		TABLE_COLUMNS_MAP.put("equipmentStatus", "equipmentstatus");
		TABLE_COLUMNS_DATA_MAP.put("equipmentStatus", String.class);
		TABLE_COLUMNS_MAP.put("notes", "notes");
		TABLE_COLUMNS_DATA_MAP.put("notes", String.class);
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
	@ApiModelProperty(example = "null", value = "", name = "equipmentcode")
	protected String equipmentCode;
	@ApiModelProperty(example = "null", value = "", name = "equipmentname")
	protected String equipmentName;
	@ApiModelProperty(example = "null", value = "", name = "equipmenttype")
	protected String equipmentType;
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
	@ApiModelProperty(example = "null", value = "", name = "productioncountrycode")
	protected String productionCountryCode;
	@ApiModelProperty(example = "null", value = "", name = "equipmentstatus")
	protected String equipmentStatus;
	@ApiModelProperty(example = "null", value = "", name = "notes")
	protected String notes;
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

	public String getEquipmentCode() {
		return equipmentCode;
	}

	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
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

	public String getProductionCountryCode() {
		return productionCountryCode;
	}

	public void setProductionCountryCode(String productionCountryCode) {
		this.productionCountryCode = productionCountryCode;
	}

	public String getEquipmentStatus() {
		return equipmentStatus;
	}

	public void setEquipmentStatus(String equipmentStatus) {
		this.equipmentStatus = equipmentStatus;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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
