package com.macro.mall.vasiros.resource.instance.service.impl;

import com.macro.mall.mapper.VasirosInstanceMapper;
import com.macro.mall.model.VasirosInstance;
import com.macro.mall.model.VasirosInstanceExample;
import com.macro.mall.vasiros.resource.instance.dto.InstanceParam;
import com.macro.mall.vasiros.resource.instance.service.InstanceOperateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @version :
 * @ClassName: InstanceServiceImpl
 * @Description: 云主机操作
 * @Auther: fyy
 * @Date: 2020/4/14
 */
@Service
public class InstanceOperateServiceImpl implements InstanceOperateService {
    private static final Logger LOGGER = LoggerFactory.getLogger(InstanceOperateServiceImpl.class);

    @Autowired
    private VasirosInstanceMapper vasirosInstanceMapper;

    @Override
    public int add(InstanceParam instanceParam) {
        VasirosInstance instanceModel = new VasirosInstance();
        BeanUtils.copyProperties(instanceParam, instanceModel);
        instanceModel.setCreateTime(new Date());
        instanceModel.setShowStatus(1);
        //查询是否有相同名的云主机
        VasirosInstanceExample example = new VasirosInstanceExample();
        example.createCriteria().andInstanceNameEqualTo(instanceModel.getInstanceName());
        List<VasirosInstance> instanceModelList = vasirosInstanceMapper.selectByExample(example);
        if (instanceModelList.size() > 0) {
            return 0;
        }
        // 调用新增云主机的接口
        // 云主机插入到数据库中
        vasirosInstanceMapper.insert(instanceModel);
        LOGGER.info("InstanceServiceImpl : createInstace is ok");
        return 1;
    }

    @Override
    public List<VasirosInstance> getInstanceList(Long dcId, Long vdcId) {
        return null;
    }


    @Override
    public int update(Long id, InstanceParam instanceParam) {
        VasirosInstance instanceModel = new VasirosInstance();
        BeanUtils.copyProperties(instanceParam, instanceModel);
        instanceModel.setCreateTime(new Date());
        instanceModel.setShowStatus(1);
        //查询是否有相同名的云主机
        VasirosInstanceExample example = new VasirosInstanceExample();
        example.createCriteria().andInstanceNameEqualTo(instanceModel.getInstanceName());
        List<VasirosInstance> instanceModelList = vasirosInstanceMapper.selectByExample(example);
        if (instanceModelList.size() > 0) {
            vasirosInstanceMapper.updateByPrimaryKey(instanceModel);
            LOGGER.info("InstanceServiceImpl : updateInstace is ok");
        }
        return 1;
    }

    @Override
    public int delete(Long id) {
        int count = vasirosInstanceMapper.deleteByPrimaryKey(id);
        LOGGER.info("InstanceServiceImpl : deleteInstance: " + count);
        return count;
    }

    @Override
    public List<VasirosInstance> getAllList() {
        List<VasirosInstance> instanceModelList
                = vasirosInstanceMapper.selectByExample(new VasirosInstanceExample());
        if (instanceModelList.isEmpty()) {
            return new ArrayList<>();
        }
        LOGGER.info("InstanceServiceImpl : getAllInstances : " + instanceModelList);
        return instanceModelList;
    }
}
