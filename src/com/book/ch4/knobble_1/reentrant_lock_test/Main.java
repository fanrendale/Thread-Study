package com.book.ch4.knobble_1.reentrant_lock_test;

/**
 * 测试ReentrantLock的同步功能
 *
 * @author xjf
 * @date 2019/6/12 10:29
 */
public class Main {

    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread thread1 = new MyThread(service);
        MyThread thread2 = new MyThread(service);
        MyThread thread3 = new MyThread(service);
        MyThread thread4 = new MyThread(service);
        MyThread thread5 = new MyThread(service);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
