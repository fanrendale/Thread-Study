package com.book.ch1.interrupt;

/**
 * @Author: xjf
 * @Date: 2019/5/25 10:04
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("i = " + (i+1));

        }
    }
}
