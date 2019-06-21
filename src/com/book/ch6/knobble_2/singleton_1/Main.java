package com.book.ch6.knobble_2.singleton_1;

/**
 * 多线程结合单例模式的懒汉模式
 *
 * 在多线程的环境下可能会去除多个实例
 *
 * @Author: xjf
 * @Date: 2019/6/17 16:05
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread.start();
        myThread1.start();
    }
}
