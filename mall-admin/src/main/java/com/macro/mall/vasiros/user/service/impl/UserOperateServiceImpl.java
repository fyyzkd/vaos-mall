package com.macro.mall.vasiros.user.service.impl;

import com.macro.mall.mapper.UserGrpRelMapper;
import com.macro.mall.mapper.UserInfoMapper;
import com.macro.mall.model.UserGrpRel;
import com.macro.mall.model.UserGrpRelExample;
import com.macro.mall.model.UserInfo;
import com.macro.mall.model.UserInfoExample;
import com.macro.mall.vasiros.user.dto.UserParam;
import com.macro.mall.vasiros.user.service.UserOperateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class UserOperateServiceImpl
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/29
 **/
@Service
public class UserOperateServiceImpl implements UserOperateService {

    private Logger LOGGER = LoggerFactory.getLogger(UserGroupServiceImpl.class);

    @Autowired
    private UserGrpRelMapper userGrpRelMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int add(UserParam userParam) {
        /**
         * (1) 参数校验
         * (2) 是否重复
         * (3) 增加用户数据
         * (4) 添加用户组和用户关联的数据
         */
        boolean flag = checkParamValid(userParam);
        if(!flag){
            LOGGER.error("用户参数无效");
            return 0;
        }
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userParam, userInfo);

        //查询是否有相同名称的用户
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUsernameEqualTo(userInfo.getUsername());
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(example);
        if (userInfoList.size() > 0) {
            LOGGER.error("用户名称已存在");
            return -1;
        }
        try {
            userInfoMapper.insert(userInfo);
            LOGGER.info("用户新增结束");
        }catch (Exception e){
            LOGGER.error("用户新增过程出错:".concat(e.getMessage()));
            return -1;
        }

        UserInfo user = userInfoMapper.selectByExample(example).get(0);
        UserGrpRel userGrpRel = new UserGrpRel();
        userGrpRel.setUserid(user.getUserid());
        userGrpRel.setUsergroupid(userParam.getUserGroupId());
        userGrpRelMapper.insertSelective(userGrpRel);
        LOGGER.info("增加用户组与用户的关联数据");
        return 0;
    }

    @Override
    public int update(Long id, UserParam userParam) {
        /**
         * (1) 查询是否存在指定的用户
         * (2) 更新用户信息
         */
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        if(userInfo == null){
            LOGGER.error("用户不存在");
            return -1;
        }

        BeanUtils.copyProperties(userParam,userInfo);
        try{
            userInfoMapper.updateByPrimaryKeySelective(userInfo);
        }catch (Exception e){
            LOGGER.error("更新用户信息失败:".concat(e.getMessage()));
        }
        LOGGER.info("用户信息更新结束");
        return 0;
    }

    @Override
    public int delete(Long id) {
        /**
         * (1) 删除指定的用户信息
         * (2) 删除用户组和用户关联表中与用户管理的用户组信息
         */
        try{
            UserGrpRelExample example = new UserGrpRelExample();
            userGrpRelMapper.deleteByExample(example);
            userInfoMapper.deleteByPrimaryKey(id);
            LOGGER.info("用户信息删除结束");
        }catch (Exception e){
            LOGGER.error("用户信息删除失败:".concat(e.getMessage()));
        }
        return 0;
    }

    @Override
    public List<UserInfo> getUserList(Long userGroupId) {
        /**
         * (1) 获取与指定用户组关联的用户Id
         * (2) 根据用户id获取用户信息
         */
        List<UserInfo> userInfos = new ArrayList<>();

        UserGrpRelExample userGrpRelExample = new UserGrpRelExample();
        userGrpRelExample.createCriteria().andUsergroupidEqualTo(userGroupId);
        List<UserGrpRel> userGrpRels = userGrpRelMapper.selectByExample(userGrpRelExample);
        for (UserGrpRel userGrpRel : userGrpRels){
            UserInfoExample userInfoExample = new UserInfoExample();
            userInfoExample.createCriteria().andUseridEqualTo(userGrpRel.getUserid());
            List<UserInfo> userInfoList =  userInfoMapper.selectByExample(userInfoExample);
            userInfos.addAll(userInfoList);
        }
        return userInfos;
    }

    /**
     *
     * 参数校验
     *
     * @Param userParam
     * @return: boolean
     **/
    private boolean checkParamValid(UserParam userParam){
        if(userParam == null || userParam.getUserGroupId()==0 ){
            return false;
        }
        return true;
    }
}
