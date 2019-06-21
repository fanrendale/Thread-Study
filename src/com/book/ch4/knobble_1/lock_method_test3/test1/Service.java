package com.book.ch4.knobble_1.lock_method_test3.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 11:06
 */
public class Service {

    private ReentrantLock lock;
    private boolean isFair;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void testMethod(){
        try {
            lock.lock();
            System.out.println("是否是公平锁：" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
