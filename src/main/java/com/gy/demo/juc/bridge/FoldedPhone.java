package com.gy.demo.juc.bridge;

/**
 *
 * 折叠样式手机
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 22:41
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠手机开机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机开机");

    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机开机");

    }
}
