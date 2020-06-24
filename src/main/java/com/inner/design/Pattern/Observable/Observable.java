package com.inner.design.Pattern.Observable;

/**
 * @Date:           2020/6/24
 * @Author:         dengpeng
 * @Description:    可视化线程接口
 */
public interface Observable {

    enum Cycle {

        STARTED,RUNNING,DONE,ERROR

    }

    //  获取当前任务的生命周期状态
    Cycle getCycle();

    //  定义启动线程的方法，主要作用是为了屏蔽Thread的其他方法
    void start();

    //  定义线程的打断方法，作用于start方法一样，也是为了屏蔽Thread的其他方法
    void interrupt();

}
