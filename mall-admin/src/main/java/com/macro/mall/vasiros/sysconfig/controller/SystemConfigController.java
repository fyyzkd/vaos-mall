package com.macro.mall.vasiros.sysconfig.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.SystemConfig;
import com.macro.mall.vasiros.sysconfig.dto.SystemConfigParam;
import com.macro.mall.vasiros.sysconfig.service.SystemConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.beans.Beans;
import java.util.List;

/**
 * @version :
 * @ClassName: SystemController
 * @Description: 系统配置
 * @Auther: fyy
 * @Date: 2020/4/18
 */
@RestController
@Api(tags = "SystemController", description = "系统配置")
@RequestMapping("/system")
public class SystemConfigController {

    @Autowired
    private SystemConfigService systemConfigService;

    @ApiOperation(value = "增加系统配置")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public CommonResult<SystemConfig> addSystemConfig(@RequestBody SystemConfigParam systemConfigParam) {
        int result = systemConfigService.add(systemConfigParam);
        if (result == 0) {
            CommonResult.failed();
        }
        SystemConfig systemConfig = new SystemConfig();
        BeanUtils.copyProperties(systemConfigParam, systemConfig);
        return CommonResult.success(systemConfig);
    }

    @ApiOperation(value = "删除系统配置")
    @RequestMapping(value = "/delete/{systemConfigName}", method = RequestMethod.DELETE)
    public CommonResult deleteInstance(@PathVariable Long id) {
        int count = systemConfigService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "更新系统配置")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult<Integer> createInstance(@RequestBody Long id, @RequestBody SystemConfigParam systemConfigParam) {
        Integer result = systemConfigService.update(id, systemConfigParam);
        if (result == 0) {
            CommonResult.failed();
        }
        return CommonResult.success(result);
    }

    @ApiOperation(value = "获取系统配置信息")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public CommonResult<List<SystemConfig>> listAllInstance() {
        List<SystemConfig> systemConfigModelList = systemConfigService.getAllList();
        if (systemConfigModelList.size() > 0) {
            return CommonResult.success(systemConfigModelList);
        }
        return CommonResult.failed();
    }
}
