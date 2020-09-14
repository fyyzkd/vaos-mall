package com.macro.mall.vasiros.resource.instance.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Class InstanceParam
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/22
 **/
@Data
public class InstanceParam {

    @ApiModelProperty(value = "云主机名称")
    @NotEmpty(message = "主机名不能为空")
    private String instanceName;

    @ApiModelProperty(value = "云主机状态：0->停用；1->运行；2->挂起")
    private Integer showStatus;

    @ApiModelProperty("所属dc")
    private Long dcId;

    @ApiModelProperty("所属vdc")
    private Long vdcId;

}
