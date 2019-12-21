package com.gy.demo.juc.adapter.objectAddapter;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 16:08
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAddapter(new Voltage220V()));
    }
}
