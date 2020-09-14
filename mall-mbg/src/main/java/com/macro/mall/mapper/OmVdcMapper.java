package com.macro.mall.mapper;

import com.macro.mall.model.OmVdc;
import com.macro.mall.model.OmVdcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmVdcMapper {
    long countByExample(OmVdcExample example);

    int deleteByExample(OmVdcExample example);

    int deleteByPrimaryKey(Long vdcid);

    int insert(OmVdc record);

    int insertSelective(OmVdc record);

    List<OmVdc> selectByExample(OmVdcExample example);

    OmVdc selectByPrimaryKey(Long vdcid);

    int updateByExampleSelective(@Param("record") OmVdc record, @Param("example") OmVdcExample example);

    int updateByExample(@Param("record") OmVdc record, @Param("example") OmVdcExample example);

    int updateByPrimaryKeySelective(OmVdc record);

    int updateByPrimaryKey(OmVdc record);
}