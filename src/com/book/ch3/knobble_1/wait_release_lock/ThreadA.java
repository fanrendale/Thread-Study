package com.book.ch3.knobble_1.wait_release_lock;

/**
 * @Author: xjf
 * @Date: 2019/6/7 13:44
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
