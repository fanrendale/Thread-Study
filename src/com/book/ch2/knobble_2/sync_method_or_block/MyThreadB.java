package com.book.ch2.knobble_2.sync_method_or_block;

/**
 * @Author: xjf
 * @Date: 2019/6/3 23:00
 */
public class MyThreadB extends Thread {

    private MyObject object;

    public MyThreadB( MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.speedPrintString();
    }
}
