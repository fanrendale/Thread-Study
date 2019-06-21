package com.book.ch1.isalive_test;

/**
 * @Author: xjf
 * @Date: 2019/5/25 9:26
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run: " + this.isAlive());
    }
}
