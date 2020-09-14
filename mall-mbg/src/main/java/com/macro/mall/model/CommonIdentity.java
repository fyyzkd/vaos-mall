package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CommonIdentity implements Serializable {
    @ApiModelProperty(value = "表名称")
    private String tablename;

    @ApiModelProperty(value = "表自增Id")
    private Integer idvalue;

    private static final long serialVersionUID = 1L;

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Integer getIdvalue() {
        return idvalue;
    }

    public void setIdvalue(Integer idvalue) {
        this.idvalue = idvalue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tablename=").append(tablename);
        sb.append(", idvalue=").append(idvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}