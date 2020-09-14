package com.macro.mall.mapper;

import com.macro.mall.model.ControlFunction;
import com.macro.mall.model.ControlFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ControlFunctionMapper {
    long countByExample(ControlFunctionExample example);

    int deleteByExample(ControlFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ControlFunction record);

    int insertSelective(ControlFunction record);

    List<ControlFunction> selectByExample(ControlFunctionExample example);

    ControlFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ControlFunction record, @Param("example") ControlFunctionExample example);

    int updateByExample(@Param("record") ControlFunction record, @Param("example") ControlFunctionExample example);

    int updateByPrimaryKeySelective(ControlFunction record);

    int updateByPrimaryKey(ControlFunction record);
}