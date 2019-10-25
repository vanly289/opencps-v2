package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "VRProductTypeApiModel")
public class VRProductTypeApiModel {
	@ApiModelProperty(example = "null", value = "")
	protected Long id;
	@ApiModelProperty(example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(example = "null", value = "")
	protected Long productPlantID;
	@ApiModelProperty(example = "null", value = "")
	protected Long sequenceNo;
	@ApiModelProperty(example = "null", value = "")
	protected String vehicleClass;
	@ApiModelProperty(example = "null", value = "")
	protected String vehicleTypeCode;
	@ApiModelProperty(example = "null", value = "")
	protected String vehicleTypeDescription;
	@ApiModelProperty(example = "null", value = "")
	protected String productClassificationCode;
	@ApiModelProperty(example = "null", value = "")
	protected String productClassificationDescription;
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
	protected String modifyDate;
	@ApiModelProperty(example = "null", value = "")
	protected String syncDate;
}
