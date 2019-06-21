package com.book.ch6.knobble_5.singleton_static_block;

/**
 * 使用静态块实现单例模式
 *
 * @Author: xjf
 * @Date: 2019/6/18 8:57
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
