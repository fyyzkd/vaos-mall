package com.macro.mall.vasiros.sysconfig.service;

import com.macro.mall.model.ControlFunction;
import com.macro.mall.vasiros.sysconfig.dto.FunControlParam;

import java.util.List;

/**
 * @Interface FunControlService
 * @Description TODO
 * @Author fyy
 * @Date 2020/5/7
 **/
public interface FunControlService {
    /**
     * 增加功能配置
     */
    int add(FunControlParam funControlParam);

    /**
     * 编辑系统配置
     */
    int update(Long id, FunControlParam funControlParam);

    /**
     * 删除系统配置
     */
    int delete(Long id);

    /**
     * 获取系统配置
     */
    List<ControlFunction> getAllList();
}
