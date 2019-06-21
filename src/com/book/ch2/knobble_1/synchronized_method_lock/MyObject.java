package com.book.ch2.knobble_1.synchronized_method_lock;

import com.book.util.TimeUtil;

/**
 * @Author: xjf
 * @Date: 2019/5/30 9:00
 */
public class MyObject {

    synchronized public void methodA(){
        try {
            System.out.println("begin methodA time=" + TimeUtil.convertToString(System.currentTimeMillis()) + " thread=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end methodA time=" + TimeUtil.convertToString(System.currentTimeMillis()) + " thread=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        try {
            System.out.println("begin methodB time=" + TimeUtil.convertToString(System.currentTimeMillis()) + " thread=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end methodB time=" + TimeUtil.convertToString(System.currentTimeMillis()) + " thread=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
