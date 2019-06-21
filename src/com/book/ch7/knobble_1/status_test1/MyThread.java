package com.book.ch7.knobble_1.status_test1;

/**
 * @Author: xjf
 * @Date: 2019/6/19 9:03
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法中main线程的状态：" + Thread.currentThread().getState());
        System.out.println("构造方法中MyThread线程的状态：" + this.getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中main线程的状态：" + Thread.currentThread().getState());
        System.out.println("run方法中MyThread线程的状态：" + this.getState());
    }
}
