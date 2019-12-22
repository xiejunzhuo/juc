package com.gy.demo.juc.singleton;

/**
 * 懒汉式（synchronized）同步方法
 * 方式
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 21:24
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){}

    /**
     * 同步代方法，解决线程安全问题，
     * 但是效率太低，每次执行getInstance时都会执行
     * 同步代码块，生产不建议使用
     * @return
     */
    public static synchronized Singleton4 getInstance() {
        if (null == instance){
            instance = new Singleton4();
        }
        return instance;
    }
}
