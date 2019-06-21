package com.book.ch4.knobble_1.fair_nofair_test;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/13 9:16
 */
public class ThreadA extends Thread{

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        PrintUtil.enterPrint("run");
        service.testMethod();
    }
}
