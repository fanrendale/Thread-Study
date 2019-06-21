package com.book.ch4.knobble_1.lock_method_test1.test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 9:32
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod1(){
        try {
            lock.lock();
            System.out.println("ThreadName="  + Thread.currentThread().getName() + " testMethod1. getHoldCount=" + lock.getHoldCount());
            testMethod2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void testMethod2(){
        try {
            lock.lock();
            System.out.println("ThreadName="  + Thread.currentThread().getName() + " testMethod2. getHoldCount=" + lock.getHoldCount());
            testMethod3();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void testMethod3(){
        try {
            lock.lock();
            System.out.println("ThreadName="  + Thread.currentThread().getName() + " testMethod3. getHoldCount=" + lock.getHoldCount());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
