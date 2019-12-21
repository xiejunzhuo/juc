package com.gy.demo.juc.adapter.classAdapter;

/**
 * 手机类
 */
public class Phone {
    private static final Integer VOLTAG_5 = 5;
    public void charging(IVolatag5V iVolatag5V){
        int voltage = iVolatag5V.output5v();
        if (VOLTAG_5.equals(voltage)){
            System.out.println("电压等于5v，可以充电");
        }else if(voltage>5){
            System.out.println("电压大于5v，不能充电");
        }

    }
}
