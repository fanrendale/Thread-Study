package com.book.ch1.priority_test;

/**
 * @Author: xjf
 * @Date: 2019/5/27 22:46
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());

        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
