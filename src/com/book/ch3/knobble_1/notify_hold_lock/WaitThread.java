package com.book.ch3.knobble_1.notify_hold_lock;

/**
 * 进行wait的线程
 * @Author: xjf
 * @Date: 2019/6/7 17:05
 */
public class WaitThread extends Thread {

    private Object lock;

    public WaitThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
