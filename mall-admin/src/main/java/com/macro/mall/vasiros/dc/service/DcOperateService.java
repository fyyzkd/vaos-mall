package com.macro.mall.vasiros.dc.service;

import com.macro.mall.vasiros.dc.dto.DcParam;

import java.util.List;

/**
 * @version :
 * @InterfaceName: DcService
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/5/30
 */
public interface DcOperateService {

    /**
     * 创建dc
     */
    int create(DcParam dcParam);

    /**
     * 编辑dc
     */
    int update(Long id, DcParam dcParam);

    /**
     * 删除dc
     */
    int delete(Long id);

    /**
     * 查询全部dc
//     */
//    List<> queryAllDcInfo();
//
//    /**
//     * 查询指定vdc信息
//     */
//     queryDcInfo(Long id);
}
