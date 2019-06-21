package com.book.ch2.knobble_2.two_stop;

/**
 * @Author: xjf
 * @Date: 2019/6/4 13:53
 */
public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
