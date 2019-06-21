package com.book.ch4.knobble_1.lock_method_test3.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 11:15
 */
public class Service {

    private ReentrantLock lock;
    private boolean isFair;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void testMethod(){
        try {
            System.out.println("是否拥有此锁定：" + lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println("是否拥有此锁定：" + lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }

    }
}
