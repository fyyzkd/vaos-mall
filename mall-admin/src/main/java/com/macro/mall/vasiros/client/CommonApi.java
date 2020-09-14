package com.macro.mall.vasiros.client;

import com.macro.mall.model.VasirosInstance;
import com.macro.mall.vasiros.client.api.AliApi;
import com.macro.mall.vasiros.common.constant.CommonConfigConstants;
import com.macro.mall.vasiros.resource.instance.dto.InstanceParam;

/**
 * @version :
 * @ClassName: CommonApi
 * @Description: 整理阿里云、中开设的统一接口
 * 使用策略模式
 * @Auther: fyy
 * @Date: 2020/8/15
 */
public class CommonApi {

    class API {

    }

    /**
     * 实例化与阿里云/中开社接口的连接
     */
    public static CommonApi createApi() {
        AliApi aliApi = new AliApi();
        return new CommonApi();
    }

    /**
     * 创建虚机
     */
    public VasirosInstance create(int CloudPlatform, InstanceParam instanceParam) {
        VasirosInstance vasirosInstance = new VasirosInstance();
        int platForm = CloudPlatform;
        switch (platForm) {
            // 阿里云
            case CommonConfigConstants.CloudPlatform.ALI_CLOUD:
                break;
            // 中开社
            case CommonConfigConstants.CloudPlatform.Z_OPEN_IN:
                break;
            default:
                int temp = 0;
        }
        return vasirosInstance;
    }
}
