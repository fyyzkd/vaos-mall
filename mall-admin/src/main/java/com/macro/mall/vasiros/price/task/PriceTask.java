package com.macro.mall.vasiros.price.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Class PriceTask
 * @Description TODO
 * @Author fyy
 * @Date 2020/5/3
 **/
@Component
//@Lazy(value = false)
public class PriceTask implements ScheduledTasks {
    private Logger LOGGER = LoggerFactory.getLogger(PriceTask.class);

    @Scheduled(cron = "${cron.pricetask}")
    @Override
    public void execute() {

    }
}
