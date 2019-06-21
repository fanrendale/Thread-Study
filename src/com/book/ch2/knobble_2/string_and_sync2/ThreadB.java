package com.book.ch2.knobble_2.string_and_sync2;

/**
 * @Author: xjf
 * @Date: 2019/6/4 11:21
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        Service.print(new Object());
    }
}
