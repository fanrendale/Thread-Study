package com.book.ch2.knobble_2.sync_static_method;

/**
 * @Author: xjf
 * @Date: 2019/6/4 8:53
 */
public class MyThreadA extends Thread {

    @Override
    public void run() {
        Service.method1();
    }
}
