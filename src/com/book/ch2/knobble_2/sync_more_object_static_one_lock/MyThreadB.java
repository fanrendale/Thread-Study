package com.book.ch2.knobble_2.sync_more_object_static_one_lock;

/**
 * @Author: xjf
 * @Date: 2019/6/4 10:45
 */
public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
