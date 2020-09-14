package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    @ApiModelProperty(value = "userId")
    private Long userid;

    @ApiModelProperty(value = "vdcId")
    private Long vdcid;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "Email")
    private String email;

    @ApiModelProperty(value = "联系方式")
    private String phone;

    @ApiModelProperty(value = "所属组织")
    private Long orgid;

    @ApiModelProperty(value = "类型")
    private Integer type;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "额外信息")
    private String extra;

    @ApiModelProperty(value = "创建时间")
    private Date createdtime;

    @ApiModelProperty(value = "xx时间")
    private Date auditedtime;

    @ApiModelProperty(value = "是否锁定，0是未锁定，1是锁定")
    private Integer islock;

    @ApiModelProperty(value = "锁定期限天数")
    private Integer lockperiod;

    @ApiModelProperty(value = "锁定时间")
    private Date locktime;

    @ApiModelProperty(value = "账户禁用，0是启用，1是禁用")
    private Integer isdisable;

    @ApiModelProperty(value = "账户有效期")
    private String usedate;

    @ApiModelProperty(value = "登录ip是否限制，0是不限制，1是限制")
    private Integer iplimit;

    @ApiModelProperty(value = "允许登录的ip组")
    private String allowip;

    @ApiModelProperty(value = "开始时间")
    private String begintime;

    @ApiModelProperty(value = "结束时间")
    private String endtime;

    @ApiModelProperty(value = "登录错误次数限制，0是不限制，其他数值为限制次数")
    private Integer maxtrytime;

    @ApiModelProperty(value = "描述信息")
    private String description;

    @ApiModelProperty(value = "不清楚")
    private String opinion;

    private static final long serialVersionUID = 1L;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getVdcid() {
        return vdcid;
    }

    public void setVdcid(Long vdcid) {
        this.vdcid = vdcid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Date getAuditedtime() {
        return auditedtime;
    }

    public void setAuditedtime(Date auditedtime) {
        this.auditedtime = auditedtime;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Integer getLockperiod() {
        return lockperiod;
    }

    public void setLockperiod(Integer lockperiod) {
        this.lockperiod = lockperiod;
    }

    public Date getLocktime() {
        return locktime;
    }

    public void setLocktime(Date locktime) {
        this.locktime = locktime;
    }

    public Integer getIsdisable() {
        return isdisable;
    }

    public void setIsdisable(Integer isdisable) {
        this.isdisable = isdisable;
    }

    public String getUsedate() {
        return usedate;
    }

    public void setUsedate(String usedate) {
        this.usedate = usedate;
    }

    public Integer getIplimit() {
        return iplimit;
    }

    public void setIplimit(Integer iplimit) {
        this.iplimit = iplimit;
    }

    public String getAllowip() {
        return allowip;
    }

    public void setAllowip(String allowip) {
        this.allowip = allowip;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getMaxtrytime() {
        return maxtrytime;
    }

    public void setMaxtrytime(Integer maxtrytime) {
        this.maxtrytime = maxtrytime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", vdcid=").append(vdcid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", orgid=").append(orgid);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", extra=").append(extra);
        sb.append(", createdtime=").append(createdtime);
        sb.append(", auditedtime=").append(auditedtime);
        sb.append(", islock=").append(islock);
        sb.append(", lockperiod=").append(lockperiod);
        sb.append(", locktime=").append(locktime);
        sb.append(", isdisable=").append(isdisable);
        sb.append(", usedate=").append(usedate);
        sb.append(", iplimit=").append(iplimit);
        sb.append(", allowip=").append(allowip);
        sb.append(", begintime=").append(begintime);
        sb.append(", endtime=").append(endtime);
        sb.append(", maxtrytime=").append(maxtrytime);
        sb.append(", description=").append(description);
        sb.append(", opinion=").append(opinion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}