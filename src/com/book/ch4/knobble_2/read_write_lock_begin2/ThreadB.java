package com.book.ch4.knobble_2.read_write_lock_begin2;

/**
 * @Author: xjf
 * @Date: 2019/6/14 9:06
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
