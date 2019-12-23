package com.gy.demo.juc.temple;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/23 22:25
 */
public class Client {
    public static void main(String[] args) {
        SoyeMilk soyeMilk = new penultimateSoyaMilk();
        soyeMilk.make();
        System.out.println("=====================================");
        SoyeMilk soyeMilk1 = new RedBeatMilk();
        soyeMilk1.make();
        System.out.println("=====================================");

        SoyeMilk soyeMilk2 = new NomentSoyaMilk();
        soyeMilk2.make();

    }
}
