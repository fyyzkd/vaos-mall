package com.macro.mall.vasiros.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.HashMap;

/**
 * @Class UserGroupParam
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/28
 **/
@Data
public class UserGroupParam {

    @ApiModelProperty(value = "VDC ID")
    @NotEmpty(message = "VDCID不能为空")
    private Long vdcid;

    @ApiModelProperty(value = "用户组名称")
    @NotEmpty(message = "用户组名称不能为空")
    private String usergroupname;

    @ApiModelProperty(value = "用户组描述信息")
    private String description;

    @ApiModelProperty(value = "用户组扩展信息")
    private String extra;

    @ApiModelProperty(value = "用户组类型")
    private Integer type;

}
