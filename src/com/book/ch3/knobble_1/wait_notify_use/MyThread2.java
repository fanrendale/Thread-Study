package com.book.ch3.knobble_1.wait_notify_use;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/7 12:51
 */
public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            PrintUtil.enterPrint("notify");

            //通知
            lock.notify();

            PrintUtil.enterPrint("notify");

        }
    }
}
