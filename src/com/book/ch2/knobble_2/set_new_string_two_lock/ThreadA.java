package com.book.ch2.knobble_2.set_new_string_two_lock;

/**
 * @Author: xjf
 * @Date: 2019/6/5 9:00
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
