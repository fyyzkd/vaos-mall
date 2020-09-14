package com.macro.mall.mapper;

import com.macro.mall.model.VasirosInstance;
import com.macro.mall.model.VasirosInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VasirosInstanceMapper {
    long countByExample(VasirosInstanceExample example);

    int deleteByExample(VasirosInstanceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VasirosInstance record);

    int insertSelective(VasirosInstance record);

    List<VasirosInstance> selectByExample(VasirosInstanceExample example);

    VasirosInstance selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VasirosInstance record, @Param("example") VasirosInstanceExample example);

    int updateByExample(@Param("record") VasirosInstance record, @Param("example") VasirosInstanceExample example);

    int updateByPrimaryKeySelective(VasirosInstance record);

    int updateByPrimaryKey(VasirosInstance record);
}