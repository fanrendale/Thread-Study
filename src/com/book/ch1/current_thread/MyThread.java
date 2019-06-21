package com.book.ch1.current_thread;

/**
 * @author xjf
 * @date 2019/5/24 16:53
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法：current thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法：current thread: " + Thread.currentThread().getName());
    }
}
