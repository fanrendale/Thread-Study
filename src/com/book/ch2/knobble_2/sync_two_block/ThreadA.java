package com.book.ch2.knobble_2.sync_two_block;

/**
 * @Author: xjf
 * @Date: 2019/6/4 10:06
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print1();
    }
}
