package com.macro.mall.vasiros.sysconfig.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.ControlFunction;
import com.macro.mall.vasiros.sysconfig.dto.FunControlParam;
import com.macro.mall.vasiros.sysconfig.service.FunControlService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Class FunctionController
 * @Description TODO
 * @Author fyy
 * @Date 2020/5/7
 **/
@Controller
@Api(tags = "FunctionController",description = "后台功能控制管理")
@RequestMapping("/functioncontroller")
public class FuncController {

    @Autowired
    private FunControlService funControlService;

    @ApiOperation("添加功能配置项")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody FunControlParam funControlParam) {
        int count = 0;
        try {
            count = funControlService.add(funControlParam);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed("添加功能配置项失败");
    }

    @ApiOperation("更新功能配置项")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult update(@PathVariable("id") Long id,
                               @RequestBody FunControlParam funControlParam ){
        int count = funControlService.update(id, funControlParam);
        if(count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed("修改功能配置项失败");
    }

    @ApiOperation("删除功能配置项")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id){
        int count = funControlService.delete(id);
        if(count > 0){
            return CommonResult.success(count);
        }
        return CommonResult.failed("删除功能配置项失败");
    }

    @ApiOperation("获取功能配置项列表")
    @RequestMapping(value = "/allList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<ControlFunction>> getList(){
        List<ControlFunction> controlFunctions = funControlService.getAllList();
        if(controlFunctions.size() > 0){
            return CommonResult.success(controlFunctions);
        }
        return CommonResult.failed("获取功能配置列表失败");
    }

}
