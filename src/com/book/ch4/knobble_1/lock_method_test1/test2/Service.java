package com.book.ch4.knobble_1.lock_method_test1.test2;

import com.book.util.PrintUtil;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 9:59
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void testMethod(){
        try {
            lock.lock();
            PrintUtil.enterPrint("testMethod");
            Thread.sleep(500);
        } catch (Exception e) {
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
