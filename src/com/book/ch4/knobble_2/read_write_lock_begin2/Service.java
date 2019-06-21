package com.book.ch4.knobble_2.read_write_lock_begin2;

import com.book.util.PrintUtil;
import com.book.util.TimeUtil;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: xjf
 * @Date: 2019/6/14 9:00
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void testMethod(){
        try {
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName() + " 获得锁。 时间："
                    + TimeUtil.convertToString(System.currentTimeMillis()));
            Thread.sleep(5000);
            PrintUtil.leavePrint("testMethod");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
