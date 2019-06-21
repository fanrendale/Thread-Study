package com.book.ch6.knobble_2.singleton_lazy_dcl;

/**
 * 双重检查Double-Check Locking
 * 使用双重检测机制DCL来使用单例同步，同时让代码异步
 *
 * @Author: xjf
 * @Date: 2019/6/17 16:53
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
