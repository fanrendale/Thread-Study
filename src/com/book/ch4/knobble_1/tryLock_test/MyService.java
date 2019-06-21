package com.book.ch4.knobble_1.tryLock_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 14:20
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    public void testMethod(){
        if (lock.tryLock()){
            System.out.println(Thread.currentThread().getName() + " 获得锁");
//            lock.unlock();
        }else {
            System.out.println(Thread.currentThread().getName() + " 未获得锁");
        }
    }
}
