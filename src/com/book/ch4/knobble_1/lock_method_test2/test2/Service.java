package com.book.ch4.knobble_1.lock_method_test2.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 10:48
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void awaitMethod(){
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalMethod(){
        try {
            lock.lock();
            System.out.println("是否有线程在等待condition:" + lock.hasWaiters(condition));
            System.out.println("在等在condition的线程数：" + lock.getWaitQueueLength(condition));
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
