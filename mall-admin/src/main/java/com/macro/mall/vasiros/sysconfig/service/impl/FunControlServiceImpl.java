package com.macro.mall.vasiros.sysconfig.service.impl;

import com.macro.mall.mapper.ControlFunctionMapper;
import com.macro.mall.model.ControlFunction;
import com.macro.mall.model.ControlFunctionExample;
import com.macro.mall.vasiros.sysconfig.dto.FunControlParam;
import com.macro.mall.vasiros.sysconfig.service.FunControlService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class FunControlServiceImpl
 * @Description TODO
 * @Author fyy
 * @Date 2020/5/7
 **/
@Service
public class FunControlServiceImpl implements FunControlService {

    private Logger LOGGER = LoggerFactory.getLogger(FunControlServiceImpl.class);

    @Autowired
    private ControlFunctionMapper controlFunctionMapper;

    @Override
    public int add(FunControlParam funControlParam) {
        boolean flag = checkParamValid(funControlParam);
        if(!flag){
            LOGGER.error("参数验证不通过");
        }

        ControlFunctionExample example = new ControlFunctionExample();
        example.createCriteria().andNameEqualTo(funControlParam.getName());
        List<ControlFunction> controlFunctionList = controlFunctionMapper.selectByExample(example);
        if(controlFunctionList.size() > 0){
            LOGGER.error("功能配置参数已存在");
        }

        ControlFunction controlFunction = new ControlFunction();
        BeanUtils.copyProperties(funControlParam,controlFunction);
        try{
            controlFunctionMapper.insert(controlFunction);
            LOGGER.info("新增功能配置参数结束");
        }catch (Exception e){
            LOGGER.error("新增功能配置参数过程失败".concat(e.getMessage()));
        }
        return 0;
    }

    @Override
    public int update(Long id, FunControlParam funControlParam) {
        ControlFunction controlFunction = controlFunctionMapper.selectByPrimaryKey(id);
        if(controlFunction == null){
            LOGGER.error("功能配置项不存在");
            return -1;
        }

        BeanUtils.copyProperties(funControlParam,controlFunction);
        try{
            controlFunctionMapper.updateByPrimaryKeySelective(controlFunction);
        }catch (Exception e){
            LOGGER.error("更新功能配置项过程出错:".concat(e.getMessage()));
        }
        LOGGER.info("功能配置项更新过程结束");
        return 0;
    }

    @Override
    public int delete(Long id) {
        try{
            controlFunctionMapper.deleteByPrimaryKey(id);
            LOGGER.info("删除功能配置参数过程结束");
        }catch (Exception e){
            LOGGER.error("删除功能配置项过程出错".concat(e.getMessage()));
        }
        return 0;
    }

    @Override
    public List<ControlFunction> getAllList() {
        List<ControlFunction> controlFunctionList = new ArrayList<>();
        try{
            controlFunctionList = controlFunctionMapper.selectByExample(new ControlFunctionExample());
            LOGGER.info("获取全部功能配置参数结束");
        }catch (Exception e){
            LOGGER.error("获取全部功能配置参数过程失败".concat(e.getMessage()));
        }
        return controlFunctionList;
    }

    /**
     *
     *  参数校验
     *
     * @Param funControlParam
     * @return: boolean
     **/
    private boolean checkParamValid(FunControlParam funControlParam){
        if(funControlParam == null){
            return false;
        }
        if(StringUtils.isBlank(funControlParam.getName())
                || StringUtils.isBlank(funControlParam.getValue())){
            return false;
        }
        return true;
    }
}
