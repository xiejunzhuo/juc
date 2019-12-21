package com.gy.demo.juc.bridge;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 22:36
 */
public class Vivo implements Brand {
    public void open() {
        System.out.println("vivo手机开机");
    }

    public void close() {
        System.out.println("vivo手机关机");

    }

    public void call() {
        System.out.println("vivo手机打电话");

    }
}
