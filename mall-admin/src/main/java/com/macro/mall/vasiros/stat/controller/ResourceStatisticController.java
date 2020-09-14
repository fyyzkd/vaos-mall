package com.macro.mall.vasiros.stat.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.vasiros.stat.service.ResourceStatisticService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Class ResourceStatisticController
 * @Description 统计资源
 * @Author fyy
 * @Date 2020/4/23
 **/
@Controller
@RequestMapping("/resourceStatistic")
@Api(tags = "ResourceStatisticController", description = "资源统计管理")
public class ResourceStatisticController {
    @Autowired
    private ResourceStatisticService resourceStatisticService;

//    @ApiOperation("获取CPU资源信息")
//    @RequestMapping(value = "/query/cpu/{startTime}/{endTime}", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult queryCpu(@PathVariable Long id) {
//
//    }
}
