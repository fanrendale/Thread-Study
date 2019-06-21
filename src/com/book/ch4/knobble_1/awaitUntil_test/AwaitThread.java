package com.book.ch4.knobble_1.awaitUntil_test;

/**
 * @Author: xjf
 * @Date: 2019/6/13 17:25
 */
public class AwaitThread extends Thread {

    private Service service;

    public AwaitThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitMethod();
    }
}
