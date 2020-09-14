package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class InstanceDcVdcRel implements Serializable {
    @ApiModelProperty(value = "云主机ID")
    private Long instanceid;

    @ApiModelProperty(value = "VDC ID")
    private Long vdcid;

    @ApiModelProperty(value = "DC ID")
    private Long dcid;

    @ApiModelProperty(value = "租户ID")
    private Long tenantid;

    private static final long serialVersionUID = 1L;

    public Long getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }

    public Long getVdcid() {
        return vdcid;
    }

    public void setVdcid(Long vdcid) {
        this.vdcid = vdcid;
    }

    public Long getDcid() {
        return dcid;
    }

    public void setDcid(Long dcid) {
        this.dcid = dcid;
    }

    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", instanceid=").append(instanceid);
        sb.append(", vdcid=").append(vdcid);
        sb.append(", dcid=").append(dcid);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}