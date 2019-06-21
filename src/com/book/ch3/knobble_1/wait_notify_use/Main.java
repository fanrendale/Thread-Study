package com.book.ch3.knobble_1.wait_notify_use;

/**
 * 测试wait和notify的使用。当两者所获得的锁为同一个对象时，调用wait方法后将会等待，直到该对象调用了notify方法，才会继续执行
 *
 * @Author: xjf
 * @Date: 2019/6/7 12:53
 */
public class Main {

    public static void main(String[] args) {
        try {
            Object lock = new Object();

            MyThread1 thread1 = new MyThread1(lock);
            thread1.setName("A");
            thread1.start();

            Thread.sleep(3000);

            MyThread2 thread2 = new MyThread2(lock);
            thread2.setName("B");
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
