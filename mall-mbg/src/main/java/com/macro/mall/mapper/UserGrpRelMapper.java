package com.macro.mall.mapper;

import com.macro.mall.model.UserGrpRel;
import com.macro.mall.model.UserGrpRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGrpRelMapper {
    long countByExample(UserGrpRelExample example);

    int deleteByExample(UserGrpRelExample example);

    int insert(UserGrpRel record);

    int insertSelective(UserGrpRel record);

    List<UserGrpRel> selectByExample(UserGrpRelExample example);

    int updateByExampleSelective(@Param("record") UserGrpRel record, @Param("example") UserGrpRelExample example);

    int updateByExample(@Param("record") UserGrpRel record, @Param("example") UserGrpRelExample example);
}