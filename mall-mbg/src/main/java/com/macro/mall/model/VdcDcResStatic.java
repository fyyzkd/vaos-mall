package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class VdcDcResStatic implements Serializable {
    @ApiModelProperty(value = "VDC Id")
    private Long vdcId;

    @ApiModelProperty(value = "DC ID")
    private Long dcid;

    @ApiModelProperty(value = "DC 名称")
    private String dcname;

    @ApiModelProperty(value = "云主机个数")
    private Integer instances;

    @ApiModelProperty(value = "cpu大小")
    private Integer cpu;

    @ApiModelProperty(value = "cpu使用率")
    private Double cpuRate;

    @ApiModelProperty(value = "内存大小")
    private Integer memory;

    @ApiModelProperty(value = "内存使用率")
    private Double memRate;

    @ApiModelProperty(value = "磁盘大小")
    private Integer disk;

    @ApiModelProperty(value = "路由器个数")
    private Integer router;

    @ApiModelProperty(value = "防火墙个数")
    private Integer firewalls;

    @ApiModelProperty(value = "是否启用防火墙，0:  不启用   1: 启用")
    private Byte firewallswitch;

    @ApiModelProperty(value = "公网IP个数")
    private Integer pubnetip;

    private static final long serialVersionUID = 1L;

    public Long getVdcId() {
        return vdcId;
    }

    public void setVdcId(Long vdcId) {
        this.vdcId = vdcId;
    }

    public Long getDcid() {
        return dcid;
    }

    public void setDcid(Long dcid) {
        this.dcid = dcid;
    }

    public String getDcname() {
        return dcname;
    }

    public void setDcname(String dcname) {
        this.dcname = dcname;
    }

    public Integer getInstances() {
        return instances;
    }

    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Double getCpuRate() {
        return cpuRate;
    }

    public void setCpuRate(Double cpuRate) {
        this.cpuRate = cpuRate;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Double getMemRate() {
        return memRate;
    }

    public void setMemRate(Double memRate) {
        this.memRate = memRate;
    }

    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public Integer getRouter() {
        return router;
    }

    public void setRouter(Integer router) {
        this.router = router;
    }

    public Integer getFirewalls() {
        return firewalls;
    }

    public void setFirewalls(Integer firewalls) {
        this.firewalls = firewalls;
    }

    public Byte getFirewallswitch() {
        return firewallswitch;
    }

    public void setFirewallswitch(Byte firewallswitch) {
        this.firewallswitch = firewallswitch;
    }

    public Integer getPubnetip() {
        return pubnetip;
    }

    public void setPubnetip(Integer pubnetip) {
        this.pubnetip = pubnetip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vdcId=").append(vdcId);
        sb.append(", dcid=").append(dcid);
        sb.append(", dcname=").append(dcname);
        sb.append(", instances=").append(instances);
        sb.append(", cpu=").append(cpu);
        sb.append(", cpuRate=").append(cpuRate);
        sb.append(", memory=").append(memory);
        sb.append(", memRate=").append(memRate);
        sb.append(", disk=").append(disk);
        sb.append(", router=").append(router);
        sb.append(", firewalls=").append(firewalls);
        sb.append(", firewallswitch=").append(firewallswitch);
        sb.append(", pubnetip=").append(pubnetip);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}