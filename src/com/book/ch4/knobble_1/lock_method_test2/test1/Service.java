package com.book.ch4.knobble_1.lock_method_test2.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 10:36
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void awaitMethod(){
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public ReentrantLock getLock() {
        return lock;
    }

    public void setLock(ReentrantLock lock) {
        this.lock = lock;
    }
}
