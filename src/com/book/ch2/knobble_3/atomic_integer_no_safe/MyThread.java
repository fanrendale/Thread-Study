package com.book.ch2.knobble_3.atomic_integer_no_safe;

/**
 * @Author: xjf
 * @Date: 2019/6/7 7:59
 */
public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.addCount();
    }
}
