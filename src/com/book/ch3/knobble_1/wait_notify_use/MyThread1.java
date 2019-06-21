package com.book.ch3.knobble_1.wait_notify_use;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/7 12:51
 */
public class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            try {
                PrintUtil.enterPrint("wait");

                //等待
                lock.wait();

                PrintUtil.enterPrint("wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
