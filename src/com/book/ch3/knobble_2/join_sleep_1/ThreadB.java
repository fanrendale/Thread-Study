package com.book.ch3.knobble_2.join_sleep_1;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/10 14:26
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            PrintUtil.enterPrint("ThreadB==>run");
            Thread.sleep(5000);
            PrintUtil.leavePrint("ThreadB==>run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService(){
        PrintUtil.enterPrint("ThreadB==>bService");
    }
}
