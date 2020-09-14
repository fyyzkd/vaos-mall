package com.macro.mall.vasiros.resource.instance.service;

import com.macro.mall.model.VasirosInstance;
import com.macro.mall.vasiros.resource.instance.dto.InstanceParam;

import java.util.List;

/**
 * @Interface InstanceOperateService
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/22
 **/
public interface InstanceOperateService {

    /**
     *  添加云主机
     */
    int add(InstanceParam instanceParam);

    /**
     * 删除云主机
     */

    int delete(Long id);

    /**
     * 编辑云主机
     */

    int update(Long id, InstanceParam instanceParam);

    /**
     * 获取指定dc或vdc下的云主机列表
     */
    List<VasirosInstance> getInstanceList(Long dcId, Long vdcId);

    /**
     * 获取云主机
     */
    List<VasirosInstance> getAllList();
}
