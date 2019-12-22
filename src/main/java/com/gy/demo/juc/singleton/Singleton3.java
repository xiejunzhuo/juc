package com.gy.demo.juc.singleton;

/**
 * 懒汉式（线程不安全）
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 21:18
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}

    /**
     * instance 如果是null就创建
     * 存在线程安全问题
     * 线程都进入if语句后会创建多个对象
     *
     * 实际开发中不能使用这种方式
     * @return
     */
    public static Singleton3 getInstance(){
        if (null ==instance){
            instance = new Singleton3();
        }
        return instance;
    }
}
