package com.book.ch3.knobble_2.join_more_test;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/11 11:17
 */
public class ThreadB extends Thread {

    @Override
    synchronized public void run() {
        try {
            PrintUtil.enterPrint("ThreadB==>run");
            Thread.sleep(5000);
            PrintUtil.leavePrint("ThreadB==>run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
