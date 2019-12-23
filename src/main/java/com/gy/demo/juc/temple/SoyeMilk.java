package com.gy.demo.juc.temple;

/**
 * 模板方法模式
 * 符合一致的工序
 * 吧一样的工序抽取实现，
 * 个性的方法由子类实现
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/23 22:11
 */
public abstract class SoyeMilk {
    //模板方法，模板方法可以做成final，不让子类重写
     final void make(){
        select();
        if (needAddments()) {
            addMent();
        }
        soay();
        beat();
    }
     void select(){
        System.out.println("第一步，选择上好的材料");
    }
    abstract void addMent();
    void soay(){
        System.out.println("第三步，黄豆和配料，需要3小时");
    }
    void beat(){
        System.out.println("第四步，黄豆和配料放在豆浆机打碎");
    }

    /**
     * 钩子方法，提供默认实现，子类按照自己需要去覆盖
     * @return
     */
    boolean needAddments(){
        return true;
    }
}
