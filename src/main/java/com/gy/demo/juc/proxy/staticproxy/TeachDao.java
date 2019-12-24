package com.gy.demo.juc.proxy.staticproxy;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/24 23:25
 */
public class TeachDao implements ITeachDao {
    public void teach() {
        System.out.println("老师正在授课。。。。。。。");
    }
}
