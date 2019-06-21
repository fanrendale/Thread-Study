package com.book.ch2.knobble_2.double_sync_block;

/**
 * @Author: xjf
 * @Date: 2019/5/31 13:51
 */
public class MyThreadA extends Thread {
    private ObjectService service;

    public MyThreadA(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodA();
    }
}
