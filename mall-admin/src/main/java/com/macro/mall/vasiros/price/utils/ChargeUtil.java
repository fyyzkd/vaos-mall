package com.macro.mall.vasiros.price.utils;

import com.macro.mall.vasiros.common.constant.CommonConfigConstants;
import com.macro.mall.vasiros.common.utils.ConfigCache;
import org.apache.commons.lang3.StringUtils;

/**
 * @version :
 * @ClassName: ChargeUtil
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/5/30
 */
public class ChargeUtil {

    /**
     *
     * 是否开启计费功能
     *
     * @return: boolean
     **/
    public static boolean isSwitchOn(){
        String chargeSwitchControl = ConfigCache.getInstance().getfunControlCache()
                .get(CommonConfigConstants.MagicValue.CHARGE_SWITCH_CONTROL).toString();

        if(StringUtils.isNotBlank(chargeSwitchControl) && StringUtils.equalsIgnoreCase(
                CommonConfigConstants.MagicValue.enable,chargeSwitchControl)){
            return true;
        }

        return false;
    }
}
