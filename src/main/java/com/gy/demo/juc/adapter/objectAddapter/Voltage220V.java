package com.gy.demo.juc.adapter.objectAddapter;

/**
 *
 * 被适配的类
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 15:59
 */
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("输出:"+src+"v");
        return src;
    }
}
