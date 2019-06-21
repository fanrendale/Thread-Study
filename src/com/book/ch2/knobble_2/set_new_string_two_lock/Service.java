package com.book.ch2.knobble_2.set_new_string_two_lock;

import com.book.util.PrintUtil;

/**
 * @Author: xjf
 * @Date: 2019/6/5 8:58
 */
public class Service {

    private String lock = "123";

    public void testMethod(){
        synchronized (lock){
            try {
                PrintUtil.enterPrint("testMethod");

                lock = "456";
                Thread.sleep(3000);

                PrintUtil.leavePrint("testMethod");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
