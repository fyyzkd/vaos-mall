package com.macro.mall.vasiros.common.utils;

import com.macro.mall.model.ControlFunction;
import com.macro.mall.model.SystemConfig;
import com.macro.mall.vasiros.sysconfig.service.FunControlService;
import com.macro.mall.vasiros.sysconfig.service.SystemConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version :
 * @ClassName: ConfigCache
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/5/30
 */
@Service
public class ConfigCache {
    private static Logger LOGGER = LoggerFactory.getLogger(ConfigCache.class);
    private static ConfigCache instance = new ConfigCache();

    // 功能控制
    @Autowired
    private FunControlService funControlService;

    // 系统配置
    @Autowired
    private SystemConfigService systemConfigService;

    public static Map<Object, Object> funControlCacheMap = new HashMap<>();
    public static Map<Object, Object> systemConfigCacheMap = new HashMap<>();

    private ConfigCache() {}

    @PostConstruct
    public synchronized void init() {
        instance = this;
        instance.funControlService = this.funControlService;
        instance.systemConfigService = this.systemConfigService;
    }

    public static ConfigCache getInstance() {
        return instance;
    }

    public Map<Object, Object> getfunControlCache() {
        return funControlCacheMap;
    }

    public Map<Object, Object>  getSystemConfigCache(){
        return systemConfigCacheMap;
    }

    public void initConfigCache() {
        initFunControlCache();
        initSystemConfigCache();
    }

    private void initFunControlCache() {
        List<ControlFunction> controlFunctionList = funControlService.getAllList();
        for (ControlFunction controlFunction : controlFunctionList) {
            synchronized (this) {
                funControlCacheMap.put(controlFunction.getName(), controlFunction.getControlValue());
            }
        }
        LOGGER.info("获取功能配置参数");
    }

    private void initSystemConfigCache() {
        List<SystemConfig> systemConfigList= systemConfigService.getAllList();
        for (SystemConfig systemConfig : systemConfigList) {
            synchronized (this) {
                systemConfigCacheMap.put(systemConfig.getParamName(), systemConfig.getParamValue());
            }
        }
        LOGGER.info("获取系统配置参数");
    }

    /**
     *
     *  更新功能配置参数
     *
     * @Param paramMap
     * @return: void
     **/
    public void updateFunControlCache(Map<Object, Object> paramMap){
        if(funControlCacheMap == null || paramMap == null){
            return;
        }
        synchronized (this) {
            for (Map.Entry<Object, Object> entry : paramMap.entrySet()) {
                if (funControlCacheMap.containsKey(entry.getKey())) {
                    funControlCacheMap.put(entry.getKey().toString(), entry.getValue().toString());
                }else {
                    funControlCacheMap.put(entry.getKey().toString(), entry.getValue().toString());
                }
            }
        }
        LOGGER.info("功能配置参数更新结束".concat(paramMap.toString()));
    }

    /**
     *
     *  更新系统配置参数
     *
     * @Param paramMap
     * @return: void
     **/
    public void updateSystemConfigCache(Map<Object, Object> paramMap){
        if(systemConfigCacheMap == null || paramMap == null){
            return;
        }
        synchronized (this) {
            for (Map.Entry<Object, Object> entry : paramMap.entrySet()) {
                if (systemConfigCacheMap.containsKey(entry.getKey())) {
                    systemConfigCacheMap.put(entry.getKey().toString(), entry.getValue().toString());
                }else {
                    systemConfigCacheMap.put(entry.getKey().toString(), entry.getValue().toString());
                }
            }
        }
        LOGGER.info("系统配置参数更新结束".concat(paramMap.toString()));
    }
}
