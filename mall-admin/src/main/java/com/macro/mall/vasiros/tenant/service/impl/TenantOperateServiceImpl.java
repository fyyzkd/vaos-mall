package com.macro.mall.vasiros.tenant.service.impl;

import com.macro.mall.vasiros.tenant.dto.TenantParam;
import com.macro.mall.vasiros.tenant.service.TenantOperateService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Class TenantOperateServiceImpl
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/28
 **/
@Service
public class TenantOperateServiceImpl implements TenantOperateService {

    @Override
    public int addTenant(TenantParam tenantParam) {
        return 0;
    }

    @Override
    public int update(Long id, TenantParam tenantParam) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

//    @Override
//    public List<Tenant> getTenantInfo(Long vdcId) {
//        return null;
//    }
}
