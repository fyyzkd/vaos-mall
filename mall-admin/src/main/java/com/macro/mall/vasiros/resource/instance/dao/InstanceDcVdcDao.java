package com.macro.mall.vasiros.resource.instance.dao;

import com.macro.mall.model.VasirosInstance;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Interface InstanceDcVdcDao
 * @Description
 * vdc-dc-instance
 * @Author fyy
 * @Date 2020/4/24
 **/
public interface InstanceDcVdcDao {
    List<VasirosInstance>  queryList(@Param("dcId") Long dcId, @Param("vdcId") Long vdcId);

    int delete(@Param("dcId") Long dcId, @Param("vdcId") Long vdcId, @Param("instanceId") Long instanceId);
}
