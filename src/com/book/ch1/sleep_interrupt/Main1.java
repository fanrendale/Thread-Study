package com.book.ch1.sleep_interrupt;

/**
 * 测试线程先停止，再遇到了sleep
 * @Author: xjf
 * @Date: 2019/5/25 14:02
 */
public class Main1 {

    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        myThread1.interrupt();
        System.out.println("end!");
    }
}
