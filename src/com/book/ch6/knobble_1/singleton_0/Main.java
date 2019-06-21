package com.book.ch6.knobble_1.singleton_0;

/**
 * 单例模式==========饿汉模式
 *
 * 使用多线程结合单例的饿汉模式：由于getInstance()方法没有同步，所以可能出现非线程安全的问题
 *
 * @Author: xjf
 * @Date: 2019/6/17 11:58
 */
public class Main {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
