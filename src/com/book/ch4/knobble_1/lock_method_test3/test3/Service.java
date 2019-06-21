package com.book.ch4.knobble_1.lock_method_test3.test3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 11:20
 */
public class Service {

    private ReentrantLock lock;
    private boolean isFair;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void testMethod(){
        try {
            System.out.println("当前锁是否被有任意线程使用：" + lock.isLocked());
            lock.lock();
            System.out.println("当前锁是否被有任意线程使用：" + lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
