package com.book.ch4.knobble_1.use_condition_wait_notify_ok;

/**
 * @author xjf
 * @date 2019/6/12 11:44
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
