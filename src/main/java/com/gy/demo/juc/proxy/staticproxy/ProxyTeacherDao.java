package com.gy.demo.juc.proxy.staticproxy;

/**
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/24 23:27
 */
public class ProxyTeacherDao implements ITeachDao {

    private ITeachDao iTeachDao;

    public ProxyTeacherDao(ITeachDao iTeachDao) {
        this.iTeachDao = iTeachDao;
    }

    public void teach() {
        System.out.println("开始代理，完成某些操作");
        iTeachDao.teach();
        System.out.println("提交。。。。。。。。。");
    }
}
