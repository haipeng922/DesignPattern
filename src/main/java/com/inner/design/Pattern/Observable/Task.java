package com.inner.design.Pattern.Observable;

/**
 * @Date:           2020/6/24
 * @Author:         dengpeng
 * @Description:    任务接口
 */
@FunctionalInterface
public interface Task<T> {

    //  任务执行接口，该接口允许返回空值
    T call();

}
