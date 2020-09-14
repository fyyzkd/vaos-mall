package com.macro.mall.vasiros.user.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.UserGroup;
import com.macro.mall.vasiros.user.dto.UserGroupParam;
import com.macro.mall.vasiros.user.service.UserGroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Class UserGroupController
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/28
 **/
@Controller
@Api(tags = "UserGroupController",description = "后台用户组管理")
@RequestMapping("/usergroup")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @ApiOperation("创建用户组")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createUserGroup(@RequestBody UserGroupParam userGroupParam){
        try {
            int count = userGroupService.addUserGroup(userGroupParam);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("编辑用户组")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult editUserGroup(@PathVariable("id") Long id,
                                      @RequestBody UserGroupParam userGroupParam){
        try {
            int count = userGroupService.updateUserGroup(id, userGroupParam);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("删除用户组")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult deleteUserGroup(@PathVariable("id") Long id){
        try {
            int count = userGroupService.deleteUserGroup(id);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("获取指定vdc关联的用户组列表")
    @RequestMapping(value = "/getUserGroupList/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UserGroup>> getUserGroupList(@PathVariable("id") Long id){
        try {
            List<UserGroup> userGroupList = userGroupService.getUserGroupList(id);
            return CommonResult.success(userGroupList);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }


    @ApiOperation("获取全部的用户组列表")
    @RequestMapping(value = "/getLists/", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UserGroup>> getLists(){
        try {
            List<UserGroup> userGroupList = userGroupService.getLists();
            return CommonResult.success(userGroupList);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }
}
