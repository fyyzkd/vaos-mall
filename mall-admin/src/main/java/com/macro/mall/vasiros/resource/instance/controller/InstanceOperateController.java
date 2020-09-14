package com.macro.mall.vasiros.resource.instance.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.VasirosInstance;
import com.macro.mall.vasiros.resource.instance.dto.InstanceParam;
import com.macro.mall.vasiros.resource.instance.service.InstanceOperateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Class InstanceOperateController
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/22
 **/
@Controller
@Api(tags = "InstanceOperateController",description = "云主机操作管理")
@RequestMapping("/instance")
public class InstanceOperateController {

    @Autowired
    private InstanceOperateService instanceOperateService;

    @ApiOperation("添加云主机")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody InstanceParam instanceParam) {
        int count = instanceOperateService.add(instanceParam);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed("添加云主机失败");
    }

    @ApiOperation("更新云主机")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable("id") Long id,
                               @RequestBody InstanceParam instanceParam){
        int count = instanceOperateService.update(id, instanceParam);
        if(count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed("修改云主机失败");
    }

    @ApiOperation("删除云主机")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable("id") Long id){
        int count = instanceOperateService.delete(id);
        if(count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed("删除云主机失败");
    }

    @ApiOperation("获取指定的云主机列表")
    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getList( @RequestParam(required = false, defaultValue = "") Long dcId,
                                 @RequestParam(required = false, defaultValue = "") Long vdcId){
        List<VasirosInstance> instanceList = instanceOperateService.getInstanceList(dcId, vdcId);
        if(instanceList.size() > 0){
            return CommonResult.success(instanceList);
        }
        return CommonResult.failed("获取指定dc云主机列表失败");
    }

    @ApiOperation("获取云主机列表")
    @RequestMapping(value = "/allList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<VasirosInstance>> getAllList(){
        List<VasirosInstance> instanceLists = instanceOperateService.getAllList();
        if(instanceLists.size() > 0){
            return CommonResult.success(instanceLists);
        }
        return CommonResult.failed("获取云主机列表失败");
    }



}
