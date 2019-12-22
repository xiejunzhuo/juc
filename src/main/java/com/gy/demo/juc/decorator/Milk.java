package com.gy.demo.juc.decorator;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 13:40
 */
public class Milk extends Derecotor {
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(3.0f);
    }
}
