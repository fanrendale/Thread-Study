package com.book.ch7.knobble_1.status_test4;

/**
 * @Author: xjf
 * @Date: 2019/6/19 9:33
 */
public class MyThreadB extends Thread {

    private MyObject myObject;

    public MyThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.testMethod();
    }
}
