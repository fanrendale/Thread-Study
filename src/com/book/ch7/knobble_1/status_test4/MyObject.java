package com.book.ch7.knobble_1.status_test4;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/19 9:32
 */
public class MyObject {

    synchronized public void testMethod(){
        try {
            PrintUtil.enterPrint("testMethod");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
