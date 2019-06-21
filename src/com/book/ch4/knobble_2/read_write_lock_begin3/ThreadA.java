package com.book.ch4.knobble_2.read_write_lock_begin3;

/**
 * @Author: xjf
 * @Date: 2019/6/14 9:06
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.readMethod();
    }
}
