package com.gy.demo.juc.decorator;

/**
 * 装饰者模式
 *
 * 被装饰的类
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 13:19
 */
public abstract class Drink {
    private float price = 0.0f;
    private String desc;

    abstract float cost();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
