package com.gy.demo.juc.factory.simplefactory.order;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 22:42
 */
public class PizzaStore {
    public static void main(String[] args) {
        //简单工厂模式1
        new OrderPizza(new SimpleFactory());

        //简单工厂模式2(静态简单工厂模式)
        new OrderPizza2();

    }
}
