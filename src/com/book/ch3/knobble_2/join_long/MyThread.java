package com.book.ch3.knobble_2.join_long;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/10 13:42
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            PrintUtil.enterPrint("run");
            Thread.sleep(5000);
            PrintUtil.leavePrint("run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
