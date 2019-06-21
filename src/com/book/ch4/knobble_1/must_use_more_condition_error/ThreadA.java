package com.book.ch4.knobble_1.must_use_more_condition_error;

/**
 * @author xjf
 * @date 2019/6/12 13:57
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
