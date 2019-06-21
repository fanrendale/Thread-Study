package com.book.ch2.knobble_3.synchronized_update_new_value;

/**
 * @Author: xjf
 * @Date: 2019/6/7 8:24
 */
public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
