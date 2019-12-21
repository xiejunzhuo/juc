package com.gy.demo.juc.adapter.classAdapter;

/**
 *
 * 被适配的类220v
 *
 */
public class Voltag220V {
    public int outPut(){
        int src = 220;
        System.out.println("输出："+src +"v");
        return src;
    }
}
