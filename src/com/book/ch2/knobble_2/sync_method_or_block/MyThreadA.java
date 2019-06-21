package com.book.ch2.knobble_2.sync_method_or_block;

/**
 * @Author: xjf
 * @Date: 2019/6/3 23:00
 */
public class MyThreadA extends Thread {

    private Service service;
    private MyObject object;

    public MyThreadA(Service service, MyObject object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        service.testMethod1(object);
    }
}
