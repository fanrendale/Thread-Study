package com.book.ch3.knobble_2.join_sleep_1;

/**
 * @Author: xjf
 * @Date: 2019/6/10 14:27
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
