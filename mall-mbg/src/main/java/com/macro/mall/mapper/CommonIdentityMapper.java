package com.macro.mall.mapper;

import com.macro.mall.model.CommonIdentity;
import com.macro.mall.model.CommonIdentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonIdentityMapper {
    long countByExample(CommonIdentityExample example);

    int deleteByExample(CommonIdentityExample example);

    int deleteByPrimaryKey(String tablename);

    int insert(CommonIdentity record);

    int insertSelective(CommonIdentity record);

    List<CommonIdentity> selectByExample(CommonIdentityExample example);

    CommonIdentity selectByPrimaryKey(String tablename);

    int updateByExampleSelective(@Param("record") CommonIdentity record, @Param("example") CommonIdentityExample example);

    int updateByExample(@Param("record") CommonIdentity record, @Param("example") CommonIdentityExample example);

    int updateByPrimaryKeySelective(CommonIdentity record);

    int updateByPrimaryKey(CommonIdentity record);
}