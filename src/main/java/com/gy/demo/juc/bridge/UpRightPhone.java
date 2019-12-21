package com.gy.demo.juc.bridge;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 22:49
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("上滑手机开机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("上滑手机关机");

    }

    @Override
    protected void call() {
        super.call();
        System.out.println("上滑手机打电话");

    }
}
