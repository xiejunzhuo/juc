package com.gy.demo.juc.decorator;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 13:42
 */
public class CoffeeBarClient {
    public static void main(String[] args) {
        Drink drink= new LongBlank();
        System.out.println(drink.getDesc() +"  "+ drink.cost());


        drink = new Chocolet(drink);
        System.out.println(drink.getDesc() +"  "+ drink.cost());


        drink = new Milk(drink);
        System.out.println(drink.getDesc() +"  "+ drink.cost());


        drink = new Soy(drink);
        System.out.println(drink.getDesc() +"  "+ drink.cost());

    }
}
