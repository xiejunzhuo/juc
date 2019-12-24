package com.gy.demo.juc.proxy.dynamic;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/24 23:49
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        ITeachDao iTeachDao = new TeachDao();
        //给目标对象创建代理对象可以转成IteachDao
        ITeachDao proxyInstance = (ITeachDao) new ProxyFactory(iTeachDao).getProxyInstance();
        System.out.println("proxyInstance...."+proxyInstance.getClass());
        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();
        proxyInstance.sayHello("tom");
    }
}
