package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SystemConfig implements Serializable {
    private Long id;

    @ApiModelProperty(value = "系统配置名称")
    private String paramName;

    @ApiModelProperty(value = "系统配置参数")
    private String paramValue;

    @ApiModelProperty(value = "系统配置分组")
    private String paramgroup;

    @ApiModelProperty(value = "系统配置说明")
    private String paramDesc;

    @ApiModelProperty(value = "系统配置描述")
    private String description;

    private Byte fieldType;

    @ApiModelProperty(value = "配置是否显示")
    private Integer visiblelevel;

    @ApiModelProperty(value = "参数最大值")
    private String maxValue;

    @ApiModelProperty(value = "参数最小值")
    private String minValue;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamgroup() {
        return paramgroup;
    }

    public void setParamgroup(String paramgroup) {
        this.paramgroup = paramgroup;
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getFieldType() {
        return fieldType;
    }

    public void setFieldType(Byte fieldType) {
        this.fieldType = fieldType;
    }

    public Integer getVisiblelevel() {
        return visiblelevel;
    }

    public void setVisiblelevel(Integer visiblelevel) {
        this.visiblelevel = visiblelevel;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", paramName=").append(paramName);
        sb.append(", paramValue=").append(paramValue);
        sb.append(", paramgroup=").append(paramgroup);
        sb.append(", paramDesc=").append(paramDesc);
        sb.append(", description=").append(description);
        sb.append(", fieldType=").append(fieldType);
        sb.append(", visiblelevel=").append(visiblelevel);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", minValue=").append(minValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}