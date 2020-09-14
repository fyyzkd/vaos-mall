package com.macro.mall.mapper;

import com.macro.mall.model.RightsGroup;
import com.macro.mall.model.RightsGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightsGroupMapper {
    long countByExample(RightsGroupExample example);

    int deleteByExample(RightsGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RightsGroup record);

    int insertSelective(RightsGroup record);

    List<RightsGroup> selectByExample(RightsGroupExample example);

    RightsGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RightsGroup record, @Param("example") RightsGroupExample example);

    int updateByExample(@Param("record") RightsGroup record, @Param("example") RightsGroupExample example);

    int updateByPrimaryKeySelective(RightsGroup record);

    int updateByPrimaryKey(RightsGroup record);
}