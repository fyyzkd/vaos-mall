package com.macro.mall.vasiros.user.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.UserInfo;
import com.macro.mall.vasiros.user.dto.UserParam;
import com.macro.mall.vasiros.user.service.UserOperateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Class UserOperateController
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/29
 **/
@Controller
@RequestMapping("/user")
@Api(tags = "UserOperateController",description = "后台用户管理")
public class UserOperateController {

    @Autowired
    private UserOperateService userOperateService;

    @ApiOperation("创建用户")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody UserParam userParam){
        try {
            int count = userOperateService.add(userParam);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("编辑用户")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult edit(@PathVariable("id") Long id,
                             @RequestBody UserParam userParam){
        try {
            int count = userOperateService.update(id, userParam);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("删除用户")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable("id") Long id){
        try {
            int count = userOperateService.delete(id);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("获取某用户组的用户列表")
    @RequestMapping(value = "/getList/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UserInfo>> getList(@PathVariable("id") Long id){
        try {
            List<UserInfo> userInfoList = userOperateService.getUserList(id);
            return CommonResult.success(userInfoList);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }
}
