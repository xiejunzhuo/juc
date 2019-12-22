package com.gy.demo.juc.decorator;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 13:21
 */
public class Coffee extends Drink{
    @Override
    float cost() {
        return super.getPrice();
    }
}
