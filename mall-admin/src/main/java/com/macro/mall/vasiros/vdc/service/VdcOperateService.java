package com.macro.mall.vasiros.vdc.service;

import com.macro.mall.model.OmVdc;
import com.macro.mall.vasiros.vdc.dto.VdcParam;

import java.util.List;

/**
 * @Interface VdcOperateService
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/23
 **/
public interface VdcOperateService {

    /**
     * 创建vdc
     */
    int createVdc(VdcParam vdcParam);

    /**
     * 编辑vdc
     */
    int updateVdc(Long id, VdcParam vdcParam);

    /**
     * 删除vdc
     */
    int deleteVdc(Long id);

    /**
     * 查询全部vdc
     */
    List<OmVdc> queryAllVdcInfo();

    /**
     * 查询指定vdc信息
     */
    OmVdc queryVdcInfo(Long id);
}
