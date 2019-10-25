package com.fds.vr.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import io.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "VRProductionPlantEmployeeApiModel")
public class VRProductionPlantEmployeeApiModel {
	@ApiModelProperty(example = "null", value = "")
	protected Long id;
	@ApiModelProperty(example = "null", value = "")
	protected Long mtCore;
	@ApiModelProperty(example = "null", value = "")
	protected Long productPlantID;
	@ApiModelProperty(example = "null", value = "")
	protected Long sequenceNo;
	@ApiModelProperty(example = "null", value = "")
	protected String employeeName;
	@ApiModelProperty(example = "null", value = "")
	protected String employeeCertificateNo;
	@ApiModelProperty(example = "null", value = "")
	protected String trainningAt;
	@ApiModelProperty(example = "null", value = "")
	protected String modifyDate;
	@ApiModelProperty(example = "null", value = "")
	protected String syncDate;
}
