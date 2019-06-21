package com.book.ch2.knobble_1.lock_reentry2;

/**
 * @Author: xjf
 * @Date: 2019/5/30 11:42
 */
public class Parent {

    public int i = 10;

    synchronized public void parentPrintMethod(){
        try {
            System.out.println("parent print i=" + i);
            i--;
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
