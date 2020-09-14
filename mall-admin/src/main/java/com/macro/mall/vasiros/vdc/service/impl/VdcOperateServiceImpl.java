package com.macro.mall.vasiros.vdc.service.impl;

import com.macro.mall.mapper.InstanceDcVdcRelMapper;
import com.macro.mall.mapper.OmVdcMapper;
import com.macro.mall.mapper.VasirosInstanceMapper;
import com.macro.mall.model.InstanceDcVdcRel;
import com.macro.mall.model.InstanceDcVdcRelExample;
import com.macro.mall.model.OmVdc;
import com.macro.mall.model.OmVdcExample;
import com.macro.mall.vasiros.vdc.dto.VdcParam;
import com.macro.mall.vasiros.vdc.service.VdcOperateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class VdcOperateServiceImpl
 * @Description TODO
 * @Author fyy
 * @Date 2020/4/23
 **/
@Service
public class VdcOperateServiceImpl implements VdcOperateService {

    private final static Logger LOGGER = LoggerFactory.getLogger(VdcOperateServiceImpl.class);

    @Autowired
    private OmVdcMapper vdcMapper;
    @Autowired
    private InstanceDcVdcRelMapper instanceDcVdcRelMapper;
    @Autowired
    private VasirosInstanceMapper vasirosInstanceMapper;

    @Override
    public int createVdc(VdcParam vdcParam) {
        // 参数验证 ，忽略了

        OmVdc omVdc = new OmVdc();
        BeanUtils.copyProperties(vdcParam, omVdc);
        OmVdcExample example = new OmVdcExample();
        example.createCriteria().andVdcnameEqualTo(vdcParam.getVdcName());

        List<OmVdc> vdcList = vdcMapper.selectByExample(example);
        if(vdcList.size()>0){
            LOGGER.error("vdc 命名重复");
            return -1;
        }
        try{
            vdcMapper.insert(omVdc);
            LOGGER.info("vdc 新增结束");
        }catch (Exception e){
            LOGGER.error("vdc 新增过程出错:".concat(e.getMessage()));
        }
        return 0;
    }

    @Override
    public int updateVdc(Long id, VdcParam vdcParam) {
        OmVdc omVdc = vdcMapper.selectByPrimaryKey(id);
        if(omVdc == null){
            LOGGER.error("指定的vdc不存在");
        }
        BeanUtils.copyProperties(vdcParam, omVdc);
        try {
            vdcMapper.updateByPrimaryKeySelective(omVdc);
            LOGGER.info("vdc 信息更新结束");
        }catch (Exception e){
            LOGGER.error("vdc 信息更新失败");
        }
        return 0;
    }

    @Override
    public int deleteVdc(Long id) {
        // 与vdc 关联的云主机等资源也要删掉
        InstanceDcVdcRelExample example = new InstanceDcVdcRelExample();
        example.createCriteria().andVdcidEqualTo(id);
        List<InstanceDcVdcRel> instanceDcVdcRels = instanceDcVdcRelMapper.selectByExample(example);

        for(InstanceDcVdcRel instanceDcVdcRel : instanceDcVdcRels){
            vasirosInstanceMapper.deleteByPrimaryKey(instanceDcVdcRel.getInstanceid());
        }

        try{
            vdcMapper.deleteByPrimaryKey(id);
            LOGGER.info("vdc 删除结束");
        }catch (Exception e){
            LOGGER.error("vdc 删除失败:".concat(e.getMessage()));
        }
        return 0;
    }

    @Override
    public List<OmVdc> queryAllVdcInfo() {
        List<OmVdc> omVdcs = vdcMapper.selectByExample(new OmVdcExample());
        if(omVdcs.size() == 0){
            LOGGER.error("不存在vdc");
            return new ArrayList<>();
        }
        return omVdcs;
    }

    @Override
    public OmVdc queryVdcInfo(Long id) {
        OmVdc omVdc = vdcMapper.selectByPrimaryKey(id);
        if(omVdc == null){
            LOGGER.error("没有找到指定的vdc");
        }
        return omVdc;
    }
}
