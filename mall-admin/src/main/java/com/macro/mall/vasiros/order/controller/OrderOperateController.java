package com.macro.mall.vasiros.order.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.vasiros.order.dto.OrderParam;
import com.macro.mall.vasiros.order.service.OrderOperateService;
import com.macro.mall.vasiros.resource.instance.dto.InstanceParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version :
 * @ClassName: OrderOperateController
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/8/14
 */
@Controller
@Api(tags = "InstanceOperateController", description = "订单后台管理")
@RequestMapping("/instance")
public class OrderOperateController {
/*

    @Autowired
    private OrderOperateService orderOperateService;


    @ApiOperation("获取全部订单信息")
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Order>> getAllItem() {
        List<Order> orderList = orderOperateService.getAllList();
        if (orderList != null && ((List) orderList).size() != 0) {
            return CommonResult.success(orderList);
        }
        return CommonResult.failed("获取订单信息失败");
    }

    @ApiOperation("新增订单")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody OrderParam orderParam) {
        int count = orderOperateService.create(orderParam);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed("新增订单失败");
    }

    @ApiOperation("修改订单")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id, @RequestBody OrderParam orderParam) {
        int count = orderOperateService.update(id, orderParam);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed("订单修改失败");
    }

    @ApiOperation("删除订单")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        int count = orderOperateService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed("订单删除失败");
    }

*/

}
