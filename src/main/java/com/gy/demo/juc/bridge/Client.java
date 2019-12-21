package com.gy.demo.juc.bridge;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 22:43
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Xiaomi());
        phone.open();
        phone.call();
        phone.close();

        System.out.println("==========================");
        Phone phone1 = new FoldedPhone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.call();

        System.out.println("=================================");
        Phone phone2 = new UpRightPhone(new Xiaomi());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
