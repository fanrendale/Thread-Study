package com.book.ch2.knobble_2.double_sync_block;

/**
 * @Author: xjf
 * @Date: 2019/5/31 13:51
 */
public class MyThreadB extends Thread {
    private ObjectService service;

    public MyThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodB();
    }
}
