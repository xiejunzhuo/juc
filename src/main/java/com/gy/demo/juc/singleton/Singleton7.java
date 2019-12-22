package com.gy.demo.juc.singleton;

/**
 * 静态内部类
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 21:41
 */
public class Singleton7 {
    private Singleton7(){}
    private static class SingletonClass{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return SingletonClass.INSTANCE;
    }
}
