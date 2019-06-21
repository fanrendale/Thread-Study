package com.book.ch4.knobble_1.reentrant_lock_test;

/**
 * @author xjf
 * @date 2019/6/12 10:28
 */
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
