package com.macro.mall.mapper;

import com.macro.mall.model.InstanceDcVdcRel;
import com.macro.mall.model.InstanceDcVdcRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstanceDcVdcRelMapper {
    long countByExample(InstanceDcVdcRelExample example);

    int deleteByExample(InstanceDcVdcRelExample example);

    int insert(InstanceDcVdcRel record);

    int insertSelective(InstanceDcVdcRel record);

    List<InstanceDcVdcRel> selectByExample(InstanceDcVdcRelExample example);

    int updateByExampleSelective(@Param("record") InstanceDcVdcRel record, @Param("example") InstanceDcVdcRelExample example);

    int updateByExample(@Param("record") InstanceDcVdcRel record, @Param("example") InstanceDcVdcRelExample example);
}