package com.book.ch2.knobble_1.synchronized_method_lock;

/**
 * 测试synchronized是对象锁
 *
 * 当一个线程调同步方法，另一个线程调非同步方法时，是异步调用
 * 当一个线程调同步方法，另一个线程调同步方法时，是同步调用
 *
 * 结论：
 * 一、A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronized类型的方法
 * 二、A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法则需等待，也就是同步
 * @Author: xjf
 * @Date: 2019/5/30 9:06
 */
public class Main {

    public static void main(String[] args) {
        MyObject object = new MyObject();

        MyThreadA threadA = new MyThreadA(object);
        threadA.setName("线程1");
        threadA.start();
        MyThreadB threadB = new MyThreadB(object);
        threadB.setName("线程2");
        threadB.start();
    }
}
