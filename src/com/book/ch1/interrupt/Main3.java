package com.book.ch1.interrupt;

/**
 * 停止线程
 *
 * @Author: xjf
 * @Date: 2019/5/25 10:05
 */
public class Main3 {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(10);
            myThread.interrupt();
            System.out.println("是否停止1？ = " + myThread.isInterrupted());
            System.out.println("是否停止2？ = " +  myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
