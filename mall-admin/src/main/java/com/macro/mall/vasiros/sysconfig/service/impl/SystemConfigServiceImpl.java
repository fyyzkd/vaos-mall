package com.macro.mall.vasiros.sysconfig.service.impl;

import com.macro.mall.mapper.SystemConfigMapper;
import com.macro.mall.model.SystemConfig;
import com.macro.mall.model.SystemConfigExample;
import com.macro.mall.vasiros.sysconfig.dto.SystemConfigParam;
import com.macro.mall.vasiros.sysconfig.service.SystemConfigService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class SystemConfigServiceImpl
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/23
 **/
@Service
public class SystemConfigServiceImpl implements SystemConfigService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SystemConfigServiceImpl.class);

    @Autowired
    private SystemConfigMapper systemConfigMapper;


    @Override
    public int add(SystemConfigParam systemConfigParam) {
        boolean flag = checkParamValid(systemConfigParam);
        if(!flag){
            LOGGER.error("系统配置项参数无效");
            return 0;
        }
        SystemConfig systemConfig = new SystemConfig();
        BeanUtils.copyProperties(systemConfigParam, systemConfig);

        //查询是否有相同名称的系统配置
        SystemConfigExample example = new SystemConfigExample();
        example.createCriteria().andParamNameEqualTo(systemConfig.getParamName());
        List<SystemConfig> systemConfigList = new ArrayList<>();
        systemConfigList = systemConfigMapper.selectByExample(example);
        if (systemConfigList.size() > 0) {
            LOGGER.error("系统配置项重复出现");
            return -1;
        }

        int count = 0;
        try {
            count =systemConfigMapper.insert(systemConfig);
            LOGGER.info("系统配置项添加结束");
        }catch (Exception e){
            LOGGER.error("系统配置项添加过程出错:".concat(e.getMessage()));
        }
        return count;
    }

    @Override
    public int update(Long id, SystemConfigParam systemConfigParam) {
        SystemConfig systemConfig = new SystemConfig();
        systemConfig = systemConfigMapper.selectByPrimaryKey(id);
        if(systemConfig == null){
            LOGGER.error("系统配置项不存在");
            return -1;
        }

        BeanUtils.copyProperties(systemConfigParam,systemConfig);
        try{
            systemConfigMapper.updateByPrimaryKeySelective(systemConfig);
        }catch (Exception e){
            LOGGER.error("更新系统配置失败:".concat(e.getMessage()));
        }
        LOGGER.info("系统配置更新结束");
        return 0;
    }

    @Override
    public int delete(Long id) {
        try{
            systemConfigMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            LOGGER.error("系统配置删除失败:".concat(e.getMessage()));
        }
        LOGGER.info("系统配置删除结束");
        return 0;
    }

    @Override
    public List<SystemConfig> getAllList() {
        List<SystemConfig> systemConfigList = new ArrayList<>();
        try {
            systemConfigList = systemConfigMapper.selectByExample(new SystemConfigExample());
            LOGGER.info("获取全部系统配置参数");
            return systemConfigList;
        }catch (Exception e){
            LOGGER.error("获取系统配置参数过程出错".concat(e.getMessage()));
            return new ArrayList<>();
        }
    }

    /**
     *
     * 检查参数的有效性
     *
     * @Param null
     * @return: null
     **/
    private boolean checkParamValid(SystemConfigParam systemConfigParam){
        if(StringUtils.isBlank(systemConfigParam.getName())){
            return false;
        }
        if(StringUtils.isBlank(systemConfigParam.getValue())){
            return false;
        }
        if(StringUtils.isBlank(systemConfigParam.getDesc())){
            return false;
        }
        return true;
    }
}
