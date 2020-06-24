package com.inner.design.Pattern.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @Date:           2020/6/24
 * @Author:         dengpeng
 * @Description:    观察者模式，测试运行
 */
public class ObservableTest {

    public static void main(String[] args) {

        Observable observableThread = new ObservableThread<>( () -> {

            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Finish done");

            return null;

        });

        observableThread.start();

    }

}
