package com.macro.mall.vasiros.init;

import com.macro.mall.vasiros.common.utils.ConfigCache;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @version :
 * @ClassName: StartInit
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/5/24
 */
@Component
public class StartInit {

    @PostConstruct
    private void initParam() {
        // 初始化系统配置参数
        ConfigCache.getInstance().initConfigCache();
    }

}
