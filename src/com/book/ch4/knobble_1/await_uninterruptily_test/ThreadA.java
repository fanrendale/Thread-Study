package com.book.ch4.knobble_1.await_uninterruptily_test;

/**
 * @Author: xjf
 * @Date: 2019/6/13 16:36
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
