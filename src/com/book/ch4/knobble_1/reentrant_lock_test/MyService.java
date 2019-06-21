package com.book.ch4.knobble_1.reentrant_lock_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xjf
 * @date 2019/6/12 10:18
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void testMethod(){
        //加锁
        lock.lock();

        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "  value=" + (i+1));

        }

        //释放锁
        lock.unlock();
    }
}
