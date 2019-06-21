package com.book.ch2.knobble_1.sync_not_extends;

import com.book.util.TimeUtil;

/**
 * @Author: xjf
 * @Date: 2019/5/30 16:52
 */
public class Parent {

    synchronized public void parentMethod(){
        try {
            System.out.println("threadName=" + Thread.currentThread().getName() + " . ===parent begin===" +
                    " . time=" + TimeUtil.convertToString(System.currentTimeMillis()));
            Thread.sleep(3000);
            System.out.println("threadName=" + Thread.currentThread().getName() + " . ===parent end===" +
                    " . time=" + TimeUtil.convertToString(System.currentTimeMillis()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
