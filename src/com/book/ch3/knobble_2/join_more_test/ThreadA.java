package com.book.ch3.knobble_2.join_more_test;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/11 11:16
 */
public class ThreadA extends Thread {

    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        synchronized (threadB) {
            try {
                PrintUtil.enterPrint("ThreadA==>run");
                Thread.sleep(5000);
                PrintUtil.leavePrint("ThreadA==>run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
