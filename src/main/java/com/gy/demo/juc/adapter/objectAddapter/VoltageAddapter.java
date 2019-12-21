package com.gy.demo.juc.adapter.objectAddapter;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 15:59
 */
public class VoltageAddapter implements IVoltage5V{
    private Voltage220V voltage220V;

    public Voltage220V getVoltage220V() {
        return voltage220V;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public VoltageAddapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int outpt5V() {
        int desc = 0;
        if (null !=voltage220V){
            desc = voltage220V.output220V()/44;
            System.out.println("适配器输出:"+desc+"v");
        }
        return desc;
    }
}
