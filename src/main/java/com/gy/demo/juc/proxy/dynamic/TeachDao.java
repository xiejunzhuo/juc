package com.gy.demo.juc.proxy.dynamic;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/24 23:38
 */
public class TeachDao implements ITeachDao {
    public void teach() {
        System.out.println("老师正在授课。。。");
    }

    public void sayHello(String name) {
        System.out.println("Say hello...."+name);
    }
}
