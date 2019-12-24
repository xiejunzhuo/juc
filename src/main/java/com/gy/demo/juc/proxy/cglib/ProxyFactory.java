package com.gy.demo.juc.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/25 0:09
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //1创建工具类
        Enhancer enhancer = new Enhancer();
        //2设置父类
        enhancer.setSuperclass(target.getClass());
        //3设置回调函数
        enhancer.setCallback(this);
        //4创建子类对象，即代理对象
        return enhancer.create();

    }


    /**
     * 重写  intercept 方法，会调用目标对象的方法
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cgilb代理模式开始。。。。。");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib代理提交");
        return invoke;
    }
}
