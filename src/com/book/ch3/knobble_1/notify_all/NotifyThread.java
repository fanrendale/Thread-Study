package com.book.ch3.knobble_1.notify_all;

/**
 * @Author: xjf
 * @Date: 2019/6/7 17:38
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            //唤醒当前锁对象的所有wait状态的线程
            lock.notifyAll();
        }
    }
}
