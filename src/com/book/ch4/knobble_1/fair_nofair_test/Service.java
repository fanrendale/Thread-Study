package com.book.ch4.knobble_1.fair_nofair_test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 9:06
 */
public class Service {

    private ReentrantLock lock;
    private boolean isFair;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void setFair(boolean fair) {
        isFair = fair;
    }

    public void testMethod(){
        try {
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " 获得锁定。");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
