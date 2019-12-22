package com.gy.demo.juc.factory.simplefactory.order;

import com.gy.demo.juc.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 22:27
 */
public class OrderPizza {
    private SimpleFactory simpleFactory;
    private Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    private void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType;
        this.simpleFactory = simpleFactory;
        do {
            orderType = getOderType();
            pizza = simpleFactory.createPizza(orderType);
            if (pizza !=null){
                pizza.prepare();
                pizza.breke();
                pizza.cuting();
                pizza.box();
            }else {
                System.out.println("订购失败");
            }

        } while (true);
    }

    private String getOderType() {
        try {
            BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            return stin.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
