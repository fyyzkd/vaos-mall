package com.macro.mall.vasiros.price.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.vasiros.price.service.PriceService;
import com.macro.mall.vasiros.resource.instance.dto.InstanceParam;
import com.macro.mall.vasiros.resource.instance.service.InstanceOperateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @version :
 * @ClassName: PriceController
 * @Description: 计费管理
 * @Auther: fyy
 * @Date: 2020/4/14
 */
@Controller
@Api(tags = "PriceController", description = "后台计费管理")
@RequestMapping("/price")
public class PriceController {

}
