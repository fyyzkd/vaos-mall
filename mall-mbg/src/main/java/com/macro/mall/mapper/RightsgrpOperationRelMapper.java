package com.macro.mall.mapper;

import com.macro.mall.model.RightsgrpOperationRel;
import com.macro.mall.model.RightsgrpOperationRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightsgrpOperationRelMapper {
    long countByExample(RightsgrpOperationRelExample example);

    int deleteByExample(RightsgrpOperationRelExample example);

    int insert(RightsgrpOperationRel record);

    int insertSelective(RightsgrpOperationRel record);

    List<RightsgrpOperationRel> selectByExample(RightsgrpOperationRelExample example);

    int updateByExampleSelective(@Param("record") RightsgrpOperationRel record, @Param("example") RightsgrpOperationRelExample example);

    int updateByExample(@Param("record") RightsgrpOperationRel record, @Param("example") RightsgrpOperationRelExample example);
}