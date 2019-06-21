package com.book.ch6.knobble_3.singleton_static_class;

/**
 * 使用静态内部类来实现单例，并且是线程安全的
 *
 * @Author: xjf
 * @Date: 2019/6/17 17:11
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
