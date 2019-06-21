package com.book.ch4.knobble_1.lock_method_test1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 10:17
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
            System.out.println("正在等待当前锁定的相关给定条件Condition的线程数是：" + lock.getWaitQueueLength(condition));
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
