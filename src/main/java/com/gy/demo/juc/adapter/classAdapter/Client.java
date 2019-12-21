package com.gy.demo.juc.adapter.classAdapter;

/**
 * 类适配器使用
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("类适配器===============");
        Phone phone = new Phone();
        phone.charging(new VoltagAddapter());
    }
}
