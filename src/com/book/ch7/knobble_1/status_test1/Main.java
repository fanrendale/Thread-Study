package com.book.ch7.knobble_1.status_test1;

/**
 * 测试线程的不同状态：
 * NEW
 * RUNNABLE
 * TERMINATED
 * BLOCKED
 * WAITING
 * TIMED_WAITING
 *
 * @Author: xjf
 * @Date: 2019/6/19 9:05
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("main方法中的状态1：" + myThread.getState());

        Thread.sleep(1000);
        myThread.start();
        Thread.sleep(1000);

        System.out.println("main方法中的状态2：" + myThread.getState());

    }
}
