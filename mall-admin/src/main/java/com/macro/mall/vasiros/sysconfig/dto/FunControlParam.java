package com.macro.mall.vasiros.sysconfig.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Class FunControlParam
 * @Description 功能控制
 * @Author fyy
 * @Date 2020/5/7
 **/
@Data
public class FunControlParam {

   @ApiModelProperty(value = "功能名称")
   String name;

   @ApiModelProperty(value = "功能描述")
   String control_desc;

   @ApiModelProperty(value = "功能控制设值")
   String value;
}
