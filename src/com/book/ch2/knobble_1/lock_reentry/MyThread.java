package com.book.ch2.knobble_1.lock_reentry;

/**
 * @Author: xjf
 * @Date: 2019/5/30 11:27
 */
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.service1();
    }
}
