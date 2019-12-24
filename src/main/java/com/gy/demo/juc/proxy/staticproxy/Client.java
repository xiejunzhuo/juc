package com.gy.demo.juc.proxy.staticproxy;

/**
 * jdk代理类
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/24 23:29
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeachDao iTeachDao = new TeachDao();
        //创建代理对象, 同时将被代理对象传递给代理对象
        ProxyTeacherDao proxyTeacherDao = new ProxyTeacherDao(iTeachDao);
        //通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        proxyTeacherDao.teach();

    }
}
