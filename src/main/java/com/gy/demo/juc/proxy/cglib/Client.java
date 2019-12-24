package com.gy.demo.juc.proxy.cglib;

/**
 * cglib代理模式
 * 加jar包
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/25 0:18
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeachDao teachDao = new TeachDao();
        //获取代理对象，并且将目标对象传递给代理对象
        TeachDao proxyFactory = (TeachDao) new ProxyFactory(teachDao).getProxyInstance();
        //执行代理对象的方法，出发intercept方法从而实现对目标对象的调用
        String s = proxyFactory.sayHello();
        System.out.println("res " + s);

    }
}
