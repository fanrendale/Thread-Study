package com.book.ch1.start_random;

/**
 * @Author: xjf
 * @Date: 2019/5/23 9:59
 */
public class MyThread extends Thread {

    private int i;

    public MyThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
