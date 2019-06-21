package com.book.ch4.knobble_1.tryLock_param;

import com.book.util.TimeUtil;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 14:36
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void testMethod(){
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName() + " 获得锁。时间：" +
                        TimeUtil.convertToString(System.currentTimeMillis()));
                Thread.sleep(1000);
            }else {
                System.out.println(Thread.currentThread().getName() + " 未获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " 进入了finally块");
            if (lock.isHeldByCurrentThread()){
                System.out.println(Thread.currentThread().getName() + " 释放锁");
                lock.unlock();
            }
        }
    }
}
