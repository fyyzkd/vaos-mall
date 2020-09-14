package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OmVdc implements Serializable {
    private Long vdcid;

    @ApiModelProperty(value = "vdc名称")
    private String vdcname;

    @ApiModelProperty(value = "vdc描述信息")
    private String vdcdesc;

    private Long domainid;

    @ApiModelProperty(value = "租户Id")
    private Long tenantid;

    private Integer infosecuritylevel;

    @ApiModelProperty(value = "是否容灾")
    private Byte isdisaster;

    private static final long serialVersionUID = 1L;

    public Long getVdcid() {
        return vdcid;
    }

    public void setVdcid(Long vdcid) {
        this.vdcid = vdcid;
    }

    public String getVdcname() {
        return vdcname;
    }

    public void setVdcname(String vdcname) {
        this.vdcname = vdcname;
    }

    public String getVdcdesc() {
        return vdcdesc;
    }

    public void setVdcdesc(String vdcdesc) {
        this.vdcdesc = vdcdesc;
    }

    public Long getDomainid() {
        return domainid;
    }

    public void setDomainid(Long domainid) {
        this.domainid = domainid;
    }

    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    public Integer getInfosecuritylevel() {
        return infosecuritylevel;
    }

    public void setInfosecuritylevel(Integer infosecuritylevel) {
        this.infosecuritylevel = infosecuritylevel;
    }

    public Byte getIsdisaster() {
        return isdisaster;
    }

    public void setIsdisaster(Byte isdisaster) {
        this.isdisaster = isdisaster;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vdcid=").append(vdcid);
        sb.append(", vdcname=").append(vdcname);
        sb.append(", vdcdesc=").append(vdcdesc);
        sb.append(", domainid=").append(domainid);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", infosecuritylevel=").append(infosecuritylevel);
        sb.append(", isdisaster=").append(isdisaster);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}