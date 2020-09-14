package com.macro.mall.vasiros.vdc.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Class VdcParam
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/24
 **/
@Data
public class VdcParam {

    @ApiModelProperty(value = "VDC名称")
    private String vdcName;

    @ApiModelProperty(value = "vdc描述信息")
    private String vdcDesc;

    @ApiModelProperty(value = "对应的租户id")
    private Long tenantId;
}
