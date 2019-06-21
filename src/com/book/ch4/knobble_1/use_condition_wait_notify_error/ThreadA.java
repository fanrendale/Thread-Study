package com.book.ch4.knobble_1.use_condition_wait_notify_error;


/**
 * @author xjf
 * @date 2019/6/12 11:22
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
