package com.book.ch1.suspend_resume_deal_lock2;

/**
 * 线程独占对象的另一种情况
 * @Author: xjf
 * @Date: 2019/5/27 11:53
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(100);
        myThread.suspend();
        System.out.println("main end!");
    }
}
