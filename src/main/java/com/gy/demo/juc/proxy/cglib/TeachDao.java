package com.gy.demo.juc.proxy.cglib;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/25 0:07
 */
public class TeachDao {
    public String sayHello(){
        System.out.println("老师授课中，我是cglib代理，不需要事先接口");
        return "hello";
    }
}
