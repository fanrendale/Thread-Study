package com.book.ch1.return_thread;

/**
 * interrupt加上return 来停止线程
 * @Author: xjf
 * @Date: 2019/5/25 14:32
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
