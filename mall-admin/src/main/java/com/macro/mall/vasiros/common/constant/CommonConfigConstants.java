package com.macro.mall.vasiros.common.constant;

/**
 * @version :
 * @InterfaceName: CommonConfigConstants
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/5/30
 */

public interface CommonConfigConstants {

    /**
     * 用户组类型: 1代表默认用户组(创建vdc时会有个默认的用户组)
     */
    public static interface UserGroupType {
        public static final int DEFAULT_USERGROUP = 1;
        public static final int CUSTOM_USERGROUP = 0;
    }

    /**
     * 用户状态
     */
    public static interface UserStatus {
        //正常
        int NORMAL = 0;

        //待审批
        int AUDITING = 1;

        //已删除
        int DELETE = 2;

        //冻结
        int FREEZED = 3;

        //拒绝
        int REFUSED = 4;

        public void nullMethod();
    }

    /**
     * 功能配置
     */
    public static interface MagicValue {
        // 是否启用
        String enable = "1";

        // 功能配置
        String CHARGE_SWITCH_CONTROL = "charge_switch_control";
    }

    /**
     * 集成中开设、阿里云
     */
    public static interface CloudPlatform {
        // 阿里云
        int ALI_CLOUD = 0;

        // 中开设
        int Z_OPEN_IN = 1;
    }

}
