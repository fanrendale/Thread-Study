package com.book.ch2.knobble_2.sync_block_string2;

/**
 * @Author: xjf
 * @Date: 2019/6/3 10:05
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}
