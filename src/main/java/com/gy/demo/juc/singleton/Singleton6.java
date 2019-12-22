package com.gy.demo.juc.singleton;

/**
 * 懒汉式（双重检查）
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/22 21:37
 */
public class Singleton6 {
    private static volatile Singleton6 instance;
    private Singleton6(){}
    /**
    双重检测解决了线程安全问题
     也解决了懒加载问题
     同时也解决了效率问题，推荐使用

     */
    public static Singleton6 getInstance(){
        if (null == instance){
            synchronized(Singleton6.class){
                if (null == instance){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
