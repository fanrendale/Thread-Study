package com.book.ch4.knobble_1.must_use_more_condition_ok;

import com.book.util.PrintUtil;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xjf
 * @date 2019/6/12 14:17
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA(){
        try {
            lock.lock();
            PrintUtil.enterPrint("awaitA");

            conditionA.await();

            PrintUtil.leavePrint("awaitA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            PrintUtil.enterPrint("awaitB");

            conditionB.await();

            PrintUtil.leavePrint("awaitB");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalA(){
        try {
            lock.lock();

            PrintUtil.enterPrint("signalA");
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
