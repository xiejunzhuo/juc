package com.gy.demo.juc.bridge;

/**
 * 桥接模式类
 * phone = 品牌 + 样式
 *
 * 调用者通过Phone作为桥梁获取Brand接口中的方法
 * Brand的子类执行各自的方法
 *
 *
 * jdbc中的Drive就是一个桥接模式
 * Connection
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 22:37
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }
    protected void close(){
        brand.close();
    }

    protected void call(){
        brand.call();
    }
}
