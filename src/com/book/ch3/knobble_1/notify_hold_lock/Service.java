package com.book.ch3.knobble_1.notify_hold_lock;

import com.book.util.TimeUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/7 17:01
 */
public class Service {

    /**
     * 进行wait的方法
     * @param lock
     */
    public void testMethod(Object lock){
        synchronized (lock){
            try {
                System.out.println("wait begin. ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("wait end. ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 进行notify的方法
     * @param lock
     */
    public void syncNotifyMethod(Object lock){
        synchronized (lock){
            try {
                System.out.println("notify begin. ThreadName=" + Thread.currentThread().getName() +
                        ". time=" + TimeUtil.convertToString(System.currentTimeMillis()));

                lock.notify();
                Thread.sleep(5000);

                System.out.println("notify end. ThreadName=" + Thread.currentThread().getName() +
                        ". time=" + TimeUtil.convertToString(System.currentTimeMillis()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
