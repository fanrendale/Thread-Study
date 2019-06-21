package com.book.ch2.knobble_1.synchronized_method_lock;

/**
 * @Author: xjf
 * @Date: 2019/5/30 9:04
 */
public class MyThreadB extends Thread {

    private MyObject object;

    public MyThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.methodB();
    }
}
