package com.gy.demo.juc.adapter.classAdapter;

/**
 * 适配器类
 */
public class VoltagAddapter extends Voltag220V implements IVolatag5V{
    public int output5v() {
        int i = outPut();
        int desc = i/44;
        System.out.println("输出："+desc+"v");

        return desc;
    }
}
