package com.book.ch1.interrupt_exit;

/**
 * 根据中断状态退出for循环
 * @Author: xjf
 * @Date: 2019/5/25 13:27
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyThread myThread  = new MyThread();
            myThread.start();
            Thread.sleep(100);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end!");
    }
}
