package com.book.ch4.knobble_1.lock_interruptily_test;

import com.book.util.PrintUtil;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xjf
 * @Date: 2019/6/13 14:00
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void testMethod(){
        try {
            //使用lock.lock()方法时，打中断标记后会正常运行
            //而换成lock.lockInterruptibly()方法时被标记中断会报出异常
//            lock.lock();
            lock.lockInterruptibly();
            PrintUtil.enterPrint("testMethod");
            for (int i = 0; i < Integer.MAX_VALUE/10; i++) {
                String string = new String();
                Math.random();
            }
            PrintUtil.leavePrint("testMethod");
        } catch (InterruptedException e) {
            System.out.println("进入了catch块");
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
