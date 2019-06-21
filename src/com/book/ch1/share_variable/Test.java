package com.book.ch1.share_variable;

/**
 * 线程间共享变量
 *
 * @Author: xjf
 * @Date: 2019/5/23 10:25
 */
public class Test {

    public static void main(String[] args) {

        MyThread thread  = new MyThread("MyThread");
        Thread thread1 = new Thread(thread,"线程1");
        Thread thread2 = new Thread(thread,"线程2");
        Thread thread3 = new Thread(thread,"线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
