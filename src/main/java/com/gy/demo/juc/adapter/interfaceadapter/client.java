package com.gy.demo.juc.adapter.interfaceadapter;

import com.sun.org.apache.xerces.internal.jaxp.validation.ErrorHandlerAdaptor;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 20:36
 */
public class client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void methd1() {
                System.out.println("子类实现了接口的第一个方法");
            }
        };
        abstractClass.methd1();

        /*HandlerAdaptor就是典型的适配器模式  */

    }
}
