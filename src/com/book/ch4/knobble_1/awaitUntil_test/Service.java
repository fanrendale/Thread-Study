package com.book.ch4.knobble_1.awaitUntil_test;

import com.book.util.PrintUtil;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 17:13
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void awaitMethod(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);

        try {
            lock.lock();
            PrintUtil.enterPrint("await");

            //在指定的时间停止等待
            condition.awaitUntil(calendar.getTime());

            PrintUtil.leavePrint("await");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }

    public void signalMethod(){
        try {
            lock.lock();

            PrintUtil.enterPrint("signal");
            condition.signalAll();
            Thread.sleep(3000);
            PrintUtil.leavePrint("signal");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
