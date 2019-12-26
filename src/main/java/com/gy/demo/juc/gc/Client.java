package com.gy.demo.juc.gc;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/25 22:19
 */
public class Client {
    public static void main(String[] args) throws Exception


    {
        System.out.println("Hello");
        System.out.println("CPU核数:"+Runtime.getRuntime().availableProcessors());
        System.out.println("freeMemory:"+Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println("maxMemory:"+Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println("totalMemory:"+Runtime.getRuntime().totalMemory()/1024/1024);

        Thread.sleep(Integer.MAX_VALUE);
    }
}
