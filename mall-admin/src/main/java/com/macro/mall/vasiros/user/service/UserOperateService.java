package com.macro.mall.vasiros.user.service;

import com.macro.mall.model.UserInfo;
import com.macro.mall.vasiros.user.dto.UserParam;

import java.util.List;

/**
 * @Interface UserOperateService
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/29
 **/
public interface UserOperateService {

    /**
     * 添加用户
     */
    int add(UserParam userParam);

    /**
     * 编辑用户
     */
    int update(Long id, UserParam userParam);

    /**
     * 删除用户
     */
    int delete(Long id);

    /**
     * 获取某用户组的用户列表
     */
    List<UserInfo> getUserList(Long userGroupId);
}
