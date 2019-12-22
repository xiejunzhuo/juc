package com.gy.demo.juc.singleton;

/**
 * 懒汉式（同步代码块方式）
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 21:30
 */
public class Singleton5 {
    private static Singleton5 instance;
    private Singleton5(){}
    public static Singleton5 getInstance(){
        if (null == instance){
            /*
            存在线程安全问题
            多个线程同时进入if（null == instance）会
            出现线程安全问题
             */
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
