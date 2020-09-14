package com.macro.mall.vasiros.tenant.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.vasiros.tenant.dto.TenantParam;
import com.macro.mall.vasiros.tenant.service.TenantOperateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Class TenantController
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/24
 **/
@Controller
@RequestMapping("/tenant")
@Api(tags = "TenantController",description = "后台租户管理")
public class TenantController {

    @Autowired
    private TenantOperateService tenantOperateService;

    @ApiOperation("新增租户")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody TenantParam tenantParam) {
        int count = 0;
        try {
            count = tenantOperateService.addTenant(tenantParam);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed("新增租户失败");
    }

    @ApiOperation("更新租户信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult update(@PathVariable("id") Long id,
                               @RequestBody TenantParam tenantParam) {
        int count = 0;
        try {
            count = tenantOperateService.update(id, tenantParam);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed("租户信息更新失败");
    }

    @ApiOperation("删除租户")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable("id") Long id) {
        int count = 0;
        try {
            count = tenantOperateService.delete(id);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed("租户信息删除失败");
    }

//    @ApiOperation("获取租户列表")
//    @RequestMapping(value = "/getList", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult getTenantList() {
//
//        try {
//            count = systemConfigService.add(systemConfigParam);
//        }catch (Exception e){
//            return CommonResult.failed(e.getMessage());
//        }
//        if (count > 0) {
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed("获取租户列表失败");
//    }
}
