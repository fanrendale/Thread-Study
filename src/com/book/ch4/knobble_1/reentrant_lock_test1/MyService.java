package com.book.ch4.knobble_1.reentrant_lock_test1;

import com.book.util.PrintUtil;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xjf
 * @date 2019/6/12 10:56
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    public void methodA(){
        try {
            lock.lock();

            PrintUtil.enterPrint("methodA");

            Thread.sleep(5000);

            PrintUtil.leavePrint("methodA");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try {
            lock.lock();

            PrintUtil.enterPrint("methodB");

            Thread.sleep(5000);

            PrintUtil.leavePrint("methodB");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
