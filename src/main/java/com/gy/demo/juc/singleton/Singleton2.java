package com.gy.demo.juc.singleton;

/**
 * 饿汉式（静态代码块）
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 21:14
 */
    public class Singleton2 {
    private Singleton2(){}
    private static  Singleton2 singleton2;
    static {
        singleton2 = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return singleton2;
    }
}
