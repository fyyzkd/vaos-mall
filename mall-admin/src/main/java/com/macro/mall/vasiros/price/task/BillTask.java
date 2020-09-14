package com.macro.mall.vasiros.price.task;

import com.macro.mall.vasiros.price.service.PriceService;
import com.macro.mall.vasiros.price.utils.ChargeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Class BillTask
 * @Description TODO
 * @Author fyy
 * @Date 2020/5/3
 **/
@Component
public class BillTask implements ScheduledTasks{
    private Logger LOGGER = LoggerFactory.getLogger(BillTask.class);

    @Autowired
    private PriceService priceService;

    /**
     * cron表达式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 每5分钟扫描一次
     */
    @Scheduled(cron = "${cron.billtask}")
    @Override
    public void execute() {
        try{
            if(ChargeUtil.isSwitchOn()){
                priceService.updateBill();
                LOGGER.info("开启计费功能");
            }
        }catch (Exception e){
            LOGGER.error(e.getMessage().concat("BillTask execute ... "));
        }
    }
}
