package com.macro.mall.vasiros.sysconfig.service;

import com.macro.mall.model.SystemConfig;
import com.macro.mall.vasiros.sysconfig.dto.SystemConfigParam;

import java.util.List;

/**
 * @Interface SystemConfigService
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/23
 **/
public interface SystemConfigService {
    /**
     * 增加系统配置
     */
    int add(SystemConfigParam systemConfigParam);

    /**
     * 编辑系统配置
     */
    int update(Long id, SystemConfigParam systemConfigParam);

    /**
     * 删除系统配置
     */
    int delete(Long id);

    /**
     * 获取系统配置
     */
    List<SystemConfig> getAllList();
}
