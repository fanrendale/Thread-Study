package com.book.ch3.knobble_1.notify_hold_lock;

/**
 * @Author: xjf
 * @Date: 2019/6/7 17:08
 */
public class NotifyThreadB extends Thread {

    private Object lock;

    public NotifyThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.syncNotifyMethod(lock);
    }
}
