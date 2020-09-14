package com.macro.mall.vasiros.tenant.service;

import com.macro.mall.vasiros.tenant.dto.TenantParam;

/**
 * @Interface TenantOperateService
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/28
 **/
public interface TenantOperateService {

    /**
     *  增加租户
     */
    int addTenant(TenantParam tenantParam);

    /**
     * 更新租户信息
     */
    int update(Long id, TenantParam tenantParam);

    /**
     * 删除租户
     */
    int delete(Long id);

    /**
     *  查询租户信息
     */
//    List<Tenant> getTenantInfo(Long vdcId);

}
