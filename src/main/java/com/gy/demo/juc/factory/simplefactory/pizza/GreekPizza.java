package com.gy.demo.juc.factory.simplefactory.pizza;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 22:11
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("希腊披萨，准备原材料");
    }
}
