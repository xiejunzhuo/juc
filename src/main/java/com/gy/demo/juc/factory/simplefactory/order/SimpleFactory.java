package com.gy.demo.juc.factory.simplefactory.order;

import com.gy.demo.juc.factory.simplefactory.pizza.CheesePizza;
import com.gy.demo.juc.factory.simplefactory.pizza.GreekPizza;
import com.gy.demo.juc.factory.simplefactory.pizza.PepperPizza;
import com.gy.demo.juc.factory.simplefactory.pizza.Pizza;

/**
 * 简单工厂类
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 22:18
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        System.out.println("简单工厂模式===========");
        Pizza pizza = null;
        pizza = getPizza(orderType, pizza);
        return pizza;
    }

    public static Pizza create2(String orderType){
        Pizza pizza = null;
        System.out.println("简单工厂模式===========");
        pizza = getPizza(orderType, pizza);
        return pizza;
    }

    /***
     * 获取pizza种类
     * @param orderType 输入的订单类型
     * @param pizza pizza
     * @return 返回pizza
     */
    private static Pizza getPizza(String orderType, Pizza pizza) {
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("中国披萨");
        } else if (orderType.equals("paper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
