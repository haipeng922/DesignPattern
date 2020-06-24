package com.inner.design.Pattern.Observable;

/**
 * @Date:           2020/6/24
 * @Author:         dengpeng
 * @Description:    任务生命周期函数
 */
public interface Tasklifecycle<T> {

    //  任务启动会触发onStart方法
    void onStart(Thread thread);

    //  任务正在运行会触发onRunning方法
    void onRunning(Thread thread);

    //  任务运行结束会触发onFinnish方法,其中result是任务执行结束后的结果
    void onFinish(Thread thread,T result);

    //  任务报错会触发onError方法
    void onError(Thread thread,Exception e);

    //  生命周期接口的空实现
    class EmptyLifecycle<T> implements Tasklifecycle<T> {

        @Override
        public void onStart(Thread thread) {
            // do nothing
        }

        @Override
        public void onRunning(Thread thread) {
            // do nothing
        }

        @Override
        public void onFinish(Thread thread, T result) {
            // do nothing
        }

        @Override
        public void onError(Thread thread, Exception e) {
            // do nothing
        }
    }

}
