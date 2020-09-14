package com.macro.mall.vasiros.vdc.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.OmVdc;
import com.macro.mall.vasiros.vdc.dto.VdcParam;
import com.macro.mall.vasiros.vdc.service.VdcOperateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Class VdcController
 * @Description VDC
 * @Author fyy
 * @Date 2020/4/23
 **/
@Controller
@RequestMapping("/vdc")
@Api(tags = "VdcOperateController",description = "后台VDC资源管理")
public class VdcOperateController {

    @Autowired
    private VdcOperateService vdcOperateService;

    @ApiOperation("创建VDC")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createVdc(@RequestBody VdcParam vdcParam){
        try {
            int count = vdcOperateService.createVdc(vdcParam);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("更新VDC")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult updateVdc(@PathVariable("id") Long id,
                                  @RequestBody VdcParam vdcParam){
        try {
            int count = vdcOperateService.updateVdc(id, vdcParam);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("删除指定VDC")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult updateVdc(@PathVariable("id") Long id){
        try {
            int count = vdcOperateService.deleteVdc(id);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("查询指定VDC")
    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmVdc> queryVdc(@PathVariable("id") Long id){
        try {
            OmVdc omVdc = vdcOperateService.queryVdcInfo(id);
            return CommonResult.success(omVdc);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("查询全部VDC")
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<OmVdc>> queryAllVdcs(){
        try {
            List<OmVdc> omVdcs = vdcOperateService.queryAllVdcInfo();
            return CommonResult.success(omVdcs);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

//    @ApiOperation("查询指定的vdc资源")
//    @RequestMapping(value = "/queryVdcDcResStatic/{vdcId}", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult<OmVdc> queryVdcDcResStatic(@PathVariable String vdcId) {
//        List<OmVdc> omVdcList;
//        try {
//            omVdcList = vdcOperateService.queryVdcInfo()
//        }catch (Exception e){
//            return CommonResult.failed(e.getMessage());
//        }
//        if (count > 0) {
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed("添加系统配置失败");
//    }
}
