package com.book.ch2.knobble_1.lock_reentry2;

/**
 * @Author: xjf
 * @Date: 2019/5/30 11:51
 */
public class MyThread extends Thread {
    private Son son;

    public MyThread(Son son) {
        this.son = son;
    }

    @Override
    public void run() {
        son.sonPrintMethod();
    }
}
