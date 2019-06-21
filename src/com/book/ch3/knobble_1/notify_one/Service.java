package com.book.ch3.knobble_1.notify_one;

/**
 * @Author: xjf
 * @Date: 2019/6/7 17:29
 */
public class Service {

    public void testMethod(Object lock) {
        synchronized (lock) {
            try {
                System.out.println("wait() begin. ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("wait() end. ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
