package com.book.ch7.knobble_1.status_test2;

/**
 * 验证线程的状态：TIMED_WAITING
 *
 * @Author: xjf
 * @Date: 2019/6/19 9:15
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(1000);

        System.out.println("在main方法中MyThread的状态：" + myThread.getState());
    }
}
