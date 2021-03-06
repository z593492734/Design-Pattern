package com.my.designdemo.design.strategy.simple;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午5:36
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class CalculateStrategySubway implements CalculateStrategy {
    @Override
    public float calculatePrice(int km) {
        if (km <= 0) {
            return 0;
        }
        if (km <= 5) {
            return 3;
        }
        if (km <= 10) {
            return 4;
        }
        if (km <= 15) {
            return 5;
        }
        return 6;
    }
}
