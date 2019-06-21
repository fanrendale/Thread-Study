package com.book.ch1.priority_test2;

/**
 * 测试设置优先级带来的效果
 * @Author: xjf
 * @Date: 2019/5/27 22:54
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            MyThread2 thread2 = new MyThread2();
            thread1.setPriority(Thread.MIN_PRIORITY);
            thread2.setPriority(Thread.MAX_PRIORITY);

            thread1.start();
            thread2.start();
        }


    }
}
