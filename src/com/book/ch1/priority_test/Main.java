package com.book.ch1.priority_test;

/**
 * 测试线程具有继承性，如线程1启动线程2，则线程2的优先级和线程1一致
 * @Author: xjf
 * @Date: 2019/5/27 22:48
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("main priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        System.out.println("main priority=" + Thread.currentThread().getPriority());

        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
