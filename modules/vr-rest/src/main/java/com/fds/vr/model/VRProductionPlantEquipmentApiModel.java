package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "VRProductionPlantEquipmentApiModel")
public class VRProductionPlantEquipmentApiModel {
	@ApiModelProperty(example = "null", value = "")
	protected Long id;
	@ApiModelProperty(example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(example = "null", value = "")
	protected Long productPlantID;
	@ApiModelProperty(example = "null", value = "")
	protected Long sequenceNo;
	@ApiModelProperty(example = "null", value = "")
	protected String equipmentCode;
	@ApiModelProperty(example = "null", value = "")
	protected String equipmentName;
	@ApiModelProperty(example = "null", value = "")
	protected String equipmentType;
	@ApiModelProperty(example = "null", value = "")
	protected String trademark;
	@ApiModelProperty(example = "null", value = "")
	protected String trademarkName;
	@ApiModelProperty(example = "null", value = "")
	protected String commercialName;
	@ApiModelProperty(example = "null", value = "")
	protected String modelCode;
	@ApiModelProperty(example = "null", value = "")
	protected String designSymbolNo;
	@ApiModelProperty(example = "null", value = "")
	protected String productionCountryCode;
	@ApiModelProperty(example = "null", value = "")
	protected String equipmentStatus;
	@ApiModelProperty(example = "null", value = "")
	protected String expireDate;
	@ApiModelProperty(example = "null", value = "")
	protected String notes;
	@ApiModelProperty(example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(example = "null", value = "")
	protected String syncDate;
}
