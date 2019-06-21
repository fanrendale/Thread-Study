package com.book.ch7.knobble_1.status_test2;

/**
 * @Author: xjf
 * @Date: 2019/6/19 9:15
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("MyThread start");
            Thread.sleep(10000);
            System.out.println("MyThread end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
