package com.macro.mall.vasiros.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Class UserGroupParam
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/28
 **/
@Data
public class UserParam {

    @ApiModelProperty(value = "所属用户组")
    private Long userGroupId;
}
