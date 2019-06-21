package com.book.ch7.knobble_3.thread_run_sync;

/**
 * 使用线程具有有序性
 *
 * 正常情况下，线程在运行时多个线程之间执行任务的时机是无序的。可以通过改造代码的方式使他们运行具有有序性。
 *
 * @Author: xjf
 * @Date: 2019/6/20 9:37
 */
public class Main {

    public static void main(String[] args) {
        Object lock = new Object();

        MyThread thread1 = new MyThread(lock,"A", 1);
        MyThread thread2 = new MyThread(lock,"B", 2);
        MyThread thread3 = new MyThread(lock,"C", 0);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
