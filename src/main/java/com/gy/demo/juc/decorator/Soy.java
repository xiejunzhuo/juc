package com.gy.demo.juc.decorator;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 13:41
 */
public class Soy extends Derecotor{
    public Soy(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(4.0f);
    }
}
