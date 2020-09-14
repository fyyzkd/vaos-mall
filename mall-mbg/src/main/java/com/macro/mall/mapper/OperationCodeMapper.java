package com.macro.mall.mapper;

import com.macro.mall.model.OperationCode;
import com.macro.mall.model.OperationCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationCodeMapper {
    long countByExample(OperationCodeExample example);

    int deleteByExample(OperationCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OperationCode record);

    int insertSelective(OperationCode record);

    List<OperationCode> selectByExample(OperationCodeExample example);

    OperationCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OperationCode record, @Param("example") OperationCodeExample example);

    int updateByExample(@Param("record") OperationCode record, @Param("example") OperationCodeExample example);

    int updateByPrimaryKeySelective(OperationCode record);

    int updateByPrimaryKey(OperationCode record);
}