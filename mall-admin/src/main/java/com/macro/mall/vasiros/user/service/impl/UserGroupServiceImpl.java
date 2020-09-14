package com.macro.mall.vasiros.user.service.impl;

import com.macro.mall.mapper.UserGroupMapper;
import com.macro.mall.mapper.UserGrpRelMapper;
import com.macro.mall.mapper.UserInfoMapper;
import com.macro.mall.model.*;
import com.macro.mall.vasiros.common.constant.CommonConfigConstants;
import com.macro.mall.vasiros.user.dto.UserGroupParam;
import com.macro.mall.vasiros.user.service.UserGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Class UserGroupServiceImpl
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/28
 **/
@Service
public class UserGroupServiceImpl implements UserGroupService{

    private Logger LOGGER = LoggerFactory.getLogger(UserGroupServiceImpl.class);

    @Autowired
    private UserGroupMapper userGroupMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserGrpRelMapper userGrpRelMapper;

    @Override
    public int addUserGroup(UserGroupParam userGroupParam) {
        /**
         * (1) 判断用户组信息是否有效
         * (2) 判断是否重复
         * (3) 新增用户组
         */

        boolean flag = checkParamValid(userGroupParam);
        if(!flag){
            LOGGER.error("用户组参数无效");
            return 0;
        }

        //查询是否有相同名称的用户组
        UserGroupExample example = new UserGroupExample();
        example.createCriteria().andUsergroupnameEqualTo(userGroupParam.getUsergroupname());
        List<UserGroup> userGroupList = userGroupMapper.selectByExample(example);
        if (userGroupList.size() > 0) {
            LOGGER.error("用户组名称已存在");
            return -1;
        }

        UserGroup userGroup = new UserGroup();
        BeanUtils.copyProperties(userGroupParam, userGroup);
        userGroup.setCreatedtime(new Date());
        int count = 0;
        try {
            count = userGroupMapper.insert(userGroup);
            LOGGER.info("用户组新增过程结束");
        }catch (Exception e){
            LOGGER.error("用户组新增过程出错:".concat(e.getMessage()));
        }
        return count;
    }

    @Override
    public int updateUserGroup(Long id, UserGroupParam userGroupParam) {
        UserGroup userGroup = userGroupMapper.selectByPrimaryKey(id);
        if(userGroup == null){
            LOGGER.error("用户组不存在");
            return -1;
        }

        BeanUtils.copyProperties(userGroupParam,userGroup);
        try{
            userGroupMapper.updateByPrimaryKeySelective(userGroup);
            LOGGER.info("用户组信息更新结束");
        }catch (Exception e){
            LOGGER.error("更新用户组信息失败:".concat(e.getMessage()));
        }
        return 0;
    }

    @Override
    public int deleteUserGroup(Long id) {
        /**
         * (1) 获取与指定用户组关联的所有用户
         * (2) 更新与用户组关联的用户信息,状态改为已删除
         * (2) 删除用户组和用户的关联信息,应该是保留用户状态和所属vdc信息，但不再属于用户组
         */
        UserGrpRelExample userGrpRelExample = new UserGrpRelExample();
        userGrpRelExample.createCriteria().andUsergroupidEqualTo(id);
        List<UserGrpRel> userGrpRelList =  userGrpRelMapper.selectByExample(userGrpRelExample);
        for(UserGrpRel userGrpRel : userGrpRelList){
            UserInfoExample userInfoExample = new UserInfoExample();
            userInfoExample.createCriteria().andUseridEqualTo(userGrpRel.getUserid());
            List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
            for(UserInfo userInfo : userInfoList){
                userInfo.setStatus(CommonConfigConstants.UserStatus.DELETE);
                userInfoMapper.updateByPrimaryKey(userInfo);
            }

        }
        LOGGER.info("更新与用户组关联的用户状态");

        try{
            userGrpRelMapper.deleteByExample(userGrpRelExample);
            LOGGER.info("删除用户组与用户的关联关系");
            userGroupMapper.deleteByPrimaryKey(id);
            LOGGER.info("用户组删除过程结束");
        }catch (Exception e){
            LOGGER.error("用户组删除过程失败:".concat(e.getMessage()));
        }
        return 0;
    }

    @Override
    public List<UserGroup> getUserGroupList(Long vdcId) {
        UserGroupExample example = new UserGroupExample();
        example.createCriteria().andVdcidEqualTo(vdcId);
        try {
            List<UserGroup> userGroups = userGroupMapper.selectByExample(example);
            LOGGER.info("获取与指定vdc关联的用户组信息结束");
            return userGroups;
        }catch (Exception e){
            LOGGER.info("获取与指定vdc关联的用户组信息失败".concat(e.getMessage()));
            return new ArrayList<>();
        }
    }

    @Override
    public List<UserGroup> getLists() {
        try {
            List<UserGroup> userGroups = userGroupMapper.selectByExample(new UserGroupExample());
            LOGGER.info("获取全部用户组信息结束");
            return userGroups;
        }catch (Exception e){
            LOGGER.error("获取全部用户组信息过程中失败：".concat(e.getMessage()));
            return new ArrayList<>();
        }
    }


    /**
     *
     * 参数校验
     *
     * @Param userGroupParam
     * @return: boolean
     **/
    private boolean checkParamValid(UserGroupParam userGroupParam)
    {
        if(userGroupParam == null){
            return false;
        }
        return true;
    }
}
