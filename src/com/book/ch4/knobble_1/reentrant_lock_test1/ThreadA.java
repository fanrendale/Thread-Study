package com.book.ch4.knobble_1.reentrant_lock_test1;

/**
 * @author xjf
 * @date 2019/6/12 10:58
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
