package com.gy.demo.juc.bridge;

/**
 *
 * 小米品牌手机
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 22:34
 */
public class Xiaomi implements Brand{
    public void open() {
        System.out.println("小米手机开机");
    }

    public void close() {
        System.out.println("小米手机关机");

    }

    public void call() {
        System.out.println("小米手机打电话");

    }
}
