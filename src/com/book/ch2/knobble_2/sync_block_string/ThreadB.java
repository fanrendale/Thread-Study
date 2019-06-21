package com.book.ch2.knobble_2.sync_block_string;

/**
 * @Author: xjf
 * @Date: 2019/6/3 9:34
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serUsernamePassword("b", "bb");
    }
}
