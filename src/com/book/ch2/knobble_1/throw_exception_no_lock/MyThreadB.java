package com.book.ch2.knobble_1.throw_exception_no_lock;

/**
 * @Author: xjf
 * @Date: 2019/5/30 15:47
 */
public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
