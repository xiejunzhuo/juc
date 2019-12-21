package com.gy.demo.juc.adapter.objectAddapter;

/**
 * 对象适配器模式和类适配器模式其实本质是相同的，只是实现方式不同
 * 利用合成复用原则，使用组合替代继承
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 15:59
 */
public class VoltageAddapter implements IVoltage5V{
    /*关联关系--聚合
     */
    private Voltage220V voltage220V;

    public VoltageAddapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int output5V() {
        int desc = 0;
        if (null !=voltage220V){
            desc = voltage220V.output220V()/44;
            System.out.println("适配器输出:"+desc+"v");
        }
        return desc;
    }
}
