package com.book.ch4.knobble_1.must_use_more_condition_error;

import com.book.util.PrintUtil;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xjf
 * @date 2019/6/12 13:51
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void awaitA(){
        try {
            lock.lock();

            PrintUtil.enterPrint("awaitA");
            condition.await();
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
            condition.await();
            PrintUtil.leavePrint("awaitB");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll(){
        try {
            lock.lock();

            PrintUtil.enterPrint("signalAll");
            condition.signalAll();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
