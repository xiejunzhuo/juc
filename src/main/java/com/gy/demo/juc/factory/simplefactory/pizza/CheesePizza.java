package com.gy.demo.juc.factory.simplefactory.pizza;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 22:15
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给中国披萨准备原材料");
    }
}
