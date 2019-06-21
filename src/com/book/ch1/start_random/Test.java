package com.book.ch1.start_random;

/**
 * 执行start()方法的顺序不是线程的启动顺序
 *
 * @Author: xjf
 * @Date: 2019/5/23 10:00
 */
public class Test {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        MyThread thread3 = new MyThread(3);
        MyThread thread4 = new MyThread(4);
        MyThread thread5 = new MyThread(5);
        MyThread thread6 = new MyThread(6);
        MyThread thread7 = new MyThread(7);
        MyThread thread8 = new MyThread(8);
        MyThread thread9 = new MyThread(9);
        MyThread thread10 = new MyThread(10);
        MyThread thread11 = new MyThread(11);
        MyThread thread12 = new MyThread(12);
        MyThread thread13 = new MyThread(13);
        MyThread thread14 = new MyThread(14);
        MyThread thread15 = new MyThread(15);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        thread12.start();
        thread13.start();
        thread14.start();
        thread15.start();
    }
}
