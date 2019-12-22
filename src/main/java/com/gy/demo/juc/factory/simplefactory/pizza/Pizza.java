package com.gy.demo.juc.factory.simplefactory.pizza;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 22:06
 */
public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void breke(){
        System.out.println(name+"breke");
    }
    public  void cuting(){
        System.out.println(name+"cuting");
    }
    public void box(){
        System.out.println(name+"box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
