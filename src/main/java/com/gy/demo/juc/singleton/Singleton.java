package com.gy.demo.juc.singleton;

/**
 * 饿汉式（静态变量）
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 17:16
 */
public class Singleton {
    /**
     * 构造器私有化，防止外部new
     */
    private Singleton(){
    }
    private static final Singleton SINGLETON = new Singleton();

    public static Singleton getInstance(){
        return SINGLETON;
    }
}
