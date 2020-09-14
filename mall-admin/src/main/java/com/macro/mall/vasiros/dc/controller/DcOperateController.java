package com.macro.mall.vasiros.dc.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.vasiros.dc.dto.DcParam;
import com.macro.mall.vasiros.dc.service.DcOperateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Class DcOperateController
 * @Description TODO
 * @Author 10256137
 * @Date 2020/5/6
 **/
@Controller
@RequestMapping("/dc")
@Api(tags = "DcOperateController",description = "后台DC资源管理")
public class DcOperateController {

    @Autowired
    private DcOperateService dcOperateService;

    @ApiOperation("创建DC")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createDc(@RequestBody DcParam dcParam){
        try {
            int count = dcOperateService.create(dcParam);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("更新DC信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult updateVdc(@PathVariable("id") Long id,
                                  @RequestBody DcParam dcParam){
        try {
            int count = dcOperateService.update(id, dcParam);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("删除指定DC")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult updateVdc(@PathVariable("id") Long id){
        try {
            int count = dcOperateService.delete(id);
            return CommonResult.success(count);
        }catch (Exception e){
            return CommonResult.failed(e.getMessage());
        }
    }

//    @ApiOperation("查询指定DC")
//    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult<OmVdc> queryDc(@PathVariable("id") Long id){
//        try {
//            OmVdc omVdc = dcOperateService.queryVdcInfo(id);
//            return CommonResult.success(omVdc);
//        }catch (Exception e){
//            return CommonResult.failed(e.getMessage());
//        }
//    }
//
//    @ApiOperation("查询全部DC")
//    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult<List<OmVdc>> queryAllDcs(){
//        try {
//            List<OmVdc> omVdcs = vdcOperateService.queryAllVdcInfo();
//            return CommonResult.success(omVdcs);
//        }catch (Exception e){
//            return CommonResult.failed(e.getMessage());
//        }
//    }
}
