package com.book.ch1.yeild_test;

/**
 * @Author: xjf
 * @Date: 2019/5/27 22:35
 */
public class MyThread extends Thread {

    private int count = 0;

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000000; i++) {
            //放弃当前的cpu资源
            Thread.yield();
            count += ++i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("耗时： " + (endTime-startTime) + "ms");

    }
}
