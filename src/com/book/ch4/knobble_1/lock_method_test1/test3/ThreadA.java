package com.book.ch4.knobble_1.lock_method_test1.test3;

/**
 * @Author: xjf
 * @Date: 2019/6/13 10:20
 */
public class ThreadA extends Thread{

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitMethod();
    }
}
