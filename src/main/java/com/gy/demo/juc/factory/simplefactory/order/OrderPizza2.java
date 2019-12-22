package com.gy.demo.juc.factory.simplefactory.order;

import com.gy.demo.juc.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 22:52
 */
public class OrderPizza2 {

    /**
     * 构造器
     */
    public OrderPizza2() {
        Pizza pizza;
        String orderType;

        do {
            orderType = getType();
            pizza = SimpleFactory.create2(orderType);

            // 输出pizza
            // 订购成功
            if (pizza != null) {
                pizza.prepare();
                pizza.breke();
                pizza.cuting();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     *
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
