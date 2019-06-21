package com.book.ch4.knobble_1.awaitUntil_test;

/**
 * @Author: xjf
 * @Date: 2019/6/13 17:26
 */
public class SignalThread extends Thread {

    private Service service;

    public SignalThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.signalMethod();
    }
}
