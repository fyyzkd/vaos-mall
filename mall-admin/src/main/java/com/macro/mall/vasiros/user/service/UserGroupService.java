package com.macro.mall.vasiros.user.service;

import com.macro.mall.model.UserGroup;
import com.macro.mall.vasiros.user.dto.UserGroupParam;

import java.util.List;

/**
 * @Interface UserGroupService
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/28
 **/
public interface UserGroupService {

    /**
     * 添加用户组
     */
    int addUserGroup(UserGroupParam userGroupParam);

    /**
     * 编辑用户组
     */
    int updateUserGroup(Long id, UserGroupParam userGroupParam);

    /**
     * 删除用户组
     */
    int deleteUserGroup(Long id);

    /**
     * 获取vdc下的用户组列表
     */
    List<UserGroup> getUserGroupList(Long vdcId);

    /**
     * 获取全部的用户组列表
     */
    List<UserGroup> getLists();
}
