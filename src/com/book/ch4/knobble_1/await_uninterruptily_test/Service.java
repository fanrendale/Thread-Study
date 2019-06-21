package com.book.ch4.knobble_1.await_uninterruptily_test;

import com.book.util.PrintUtil;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 16:33
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod(){
        try {
            lock.lock();
            PrintUtil.enterPrint("testMethod");

            //使用await，遇到中断标记时会抛出异常
//            condition.await();
            //使用awaitUninterruptibly，遇到中断标记时不会抛出异常
            condition.awaitUninterruptibly();

            PrintUtil.leavePrint("testMethod");
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
