package com.macro.mall.vasiros.price.service.impl;

import com.macro.mall.vasiros.price.service.PriceService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Class PriceServiceImpl
 * @Description TODO
 * @Author 10256137
 * @Date 2020/5/3
 **/
@Service
public class PriceServiceImpl implements PriceService, Serializable {


    @Override
    public void updateCost() {

    }

    @Override
    public void updatePrice() {

    }

    @Override
    public void updateBill() {
        StringBuilder temp = new StringBuilder("updateBill");
        for (int i = 0; i < 2; i++) {
            temp.append(i);
        }
    }
}
