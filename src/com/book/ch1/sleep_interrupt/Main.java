package com.book.ch1.sleep_interrupt;

/**
 * 测试线程在沉睡中被停止
 * @Author: xjf
 * @Date: 2019/5/25 13:37
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            System.out.println("状态："+MyThread.interrupted());
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
