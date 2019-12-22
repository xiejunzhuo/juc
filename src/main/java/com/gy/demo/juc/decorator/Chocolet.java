package com.gy.demo.juc.decorator;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 13:23
 */
public class Chocolet extends Derecotor{
    public Chocolet(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(2.0f);
    }

}
