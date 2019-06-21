package com.book.ch6.knobble_2.singleton_lazy_error;

/**
 * 验证在多线程环境下，单例的懒汉模式会出现多个实例，没有实现单例
 *
 * 解决办法：①在获取实例的方法前加synchronized，但是该方法效率太低了，整个方法被上锁
 *          ②使用同步块，效率一样低
 *
 * @Author: xjf
 * @Date: 2019/6/17 16:19
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
