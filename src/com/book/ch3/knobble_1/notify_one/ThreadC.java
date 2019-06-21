package com.book.ch3.knobble_1.notify_one;

/**
 * @Author: xjf
 * @Date: 2019/6/7 17:30
 */
public class ThreadC extends Thread {

    private Object lock;

    public ThreadC(Object object) {
        this.lock = object;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
