package com.book.ch2.knobble_2.two_stop;

/**
 * @Author: xjf
 * @Date: 2019/6/4 13:53
 */
public class MyThreadA extends Thread {

    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
