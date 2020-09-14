package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserGroup implements Serializable {
    private Long id;

    @ApiModelProperty(value = "VDC ID")
    private Long vdcid;

    @ApiModelProperty(value = "用户组名称")
    private String usergroupname;

    @ApiModelProperty(value = "用户组描述信息")
    private String description;

    @ApiModelProperty(value = "用户组扩展信息")
    private String extra;

    @ApiModelProperty(value = "用户组创建时间")
    private Date createdtime;

    @ApiModelProperty(value = "用户组类型")
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVdcid() {
        return vdcid;
    }

    public void setVdcid(Long vdcid) {
        this.vdcid = vdcid;
    }

    public String getUsergroupname() {
        return usergroupname;
    }

    public void setUsergroupname(String usergroupname) {
        this.usergroupname = usergroupname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vdcid=").append(vdcid);
        sb.append(", usergroupname=").append(usergroupname);
        sb.append(", description=").append(description);
        sb.append(", extra=").append(extra);
        sb.append(", createdtime=").append(createdtime);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}