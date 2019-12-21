package com.gy.demo.juc.adapter.interfaceadapter;

/**
 *
 * 接口适配器模式：
 * 1.当不需要全部实现接口中的方法时，可先设计一个抽象类实现接口，
 * 并为这个接口的每个方法提供一个默认实现，那么该抽象类的子类可有选择的
 * 覆盖父类的方法去实现需求
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/21 20:29
 */
public interface InterfaceAdapter {

    public void methd1();
    public void methd2();
    public void methd3();
    public void methd4();
}
