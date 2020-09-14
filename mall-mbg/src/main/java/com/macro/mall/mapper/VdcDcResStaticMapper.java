package com.macro.mall.mapper;

import com.macro.mall.model.VdcDcResStatic;
import com.macro.mall.model.VdcDcResStaticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VdcDcResStaticMapper {
    long countByExample(VdcDcResStaticExample example);

    int deleteByExample(VdcDcResStaticExample example);

    int insert(VdcDcResStatic record);

    int insertSelective(VdcDcResStatic record);

    List<VdcDcResStatic> selectByExample(VdcDcResStaticExample example);

    int updateByExampleSelective(@Param("record") VdcDcResStatic record, @Param("example") VdcDcResStaticExample example);

    int updateByExample(@Param("record") VdcDcResStatic record, @Param("example") VdcDcResStaticExample example);
}