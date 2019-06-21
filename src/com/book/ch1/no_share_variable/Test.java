package com.book.ch1.no_share_variable;

/**
 * 线程间变量不共享
 *
 * @Author: xjf
 * @Date: 2019/5/23 10:25
 */
public class Test {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("线程1");
        MyThread thread2 = new MyThread("线程2");
        MyThread thread3 = new MyThread("线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
