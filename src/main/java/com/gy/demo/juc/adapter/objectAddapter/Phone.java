package com.gy.demo.juc.adapter.objectAddapter;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 16:06
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() ==5){
            System.out.println("电压等于v，可以充电");
        }else {
            System.out.println("电压不等于v，不能充电");
        }
    }
}
