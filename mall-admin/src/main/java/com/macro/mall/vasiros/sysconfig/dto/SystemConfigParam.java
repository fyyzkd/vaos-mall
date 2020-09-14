package com.macro.mall.vasiros.sysconfig.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Class SystemConfigParam
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/23
 **/
@Data
public class SystemConfigParam {

    @ApiModelProperty(value = "系统配置名称")
    @NotEmpty(message = "参数名不能为空")
    private String name;

    @ApiModelProperty(value = "系统配置参数")
    @NotEmpty(message = "参数名不能为空")
    private String value;

    @ApiModelProperty(value = "系统配置分组")
    private String group;

    private int field_type;

    @ApiModelProperty(value = "系统配置说明")
    private String desc;

    @ApiModelProperty(value = "系统配置描述")
    private String description;

    @ApiModelProperty(value = "系统配置是否可用")
    private int visiblelevel;
}
