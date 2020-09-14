package com.macro.mall.mapper;

import com.macro.mall.model.RightsgrpUserRel;
import com.macro.mall.model.RightsgrpUserRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightsgrpUserRelMapper {
    long countByExample(RightsgrpUserRelExample example);

    int deleteByExample(RightsgrpUserRelExample example);

    int insert(RightsgrpUserRel record);

    int insertSelective(RightsgrpUserRel record);

    List<RightsgrpUserRel> selectByExample(RightsgrpUserRelExample example);

    int updateByExampleSelective(@Param("record") RightsgrpUserRel record, @Param("example") RightsgrpUserRelExample example);

    int updateByExample(@Param("record") RightsgrpUserRel record, @Param("example") RightsgrpUserRelExample example);
}