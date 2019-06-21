package com.book.ch1.priority_test;

/**
 * @Author: xjf
 * @Date: 2019/5/27 22:47
 */
public class MyThread2 extends Thread {

    @Override
    public synchronized void start() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
