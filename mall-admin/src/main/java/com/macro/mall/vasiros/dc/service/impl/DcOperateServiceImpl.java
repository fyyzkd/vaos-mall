package com.macro.mall.vasiros.dc.service.impl;

import com.macro.mall.vasiros.dc.dto.DcParam;
import com.macro.mall.vasiros.dc.service.DcOperateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @version :
 * @ClassName: DcServiceImpl
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/5/30
 */
@Service
public class DcOperateServiceImpl implements DcOperateService {

    private Logger LOGGER = LoggerFactory.getLogger(DcOperateServiceImpl.class);

    @Override
    public int create(DcParam dcParam) {
        boolean flag = this.checkParamValid(dcParam);
        if(!flag){
            LOGGER.error("参数校验不通过");
        }


        return 0;
    }

    @Override
    public int update(Long id, DcParam dcParam) {
        boolean flag = this.checkParamValid(dcParam);
        if(!flag){
            LOGGER.error("参数校验不通过");
        }

        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    private boolean checkParamValid(DcParam dcParam){
        if(null == dcParam){
            return false;
        }
        return true;
    }
}
