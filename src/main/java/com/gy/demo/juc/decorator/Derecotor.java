package com.gy.demo.juc.decorator;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 13:32
 */
public class Derecotor extends Drink {

    private Drink drink;

    public Derecotor(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDesc() {
        return super.getDesc() +" "+ super.getPrice() + "&&"+ drink.getDesc();
    }

    @Override
    float cost() {

        return super.getPrice() + drink.cost();
    }
}
