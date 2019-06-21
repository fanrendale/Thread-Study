package com.book.ch1.priority_test2;

/**
 * @Author: xjf
 * @Date: 2019/5/27 22:52
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        long sum = 0;

        long start = System.currentTimeMillis();

        for (long i = 0; i < 500000000L; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("MyThread2 use time=" + (end-start) + "ms");
    }
}
