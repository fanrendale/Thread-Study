package com.book.ch7.knobble_1.status_test3;

/**
 * @Author: xjf
 * @Date: 2019/6/19 9:19
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        MyObject myObject = new MyObject();

        System.out.println("MyThread start");
        myObject.testMethod();
        System.out.println("MyThread end");

    }
}
