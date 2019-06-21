package com.book.ch1.suspend_resume_test;

/**
 * 测试线程的暂停与恢复
 * @Author: xjf
 * @Date: 2019/5/26 10:10
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(3000);

        //A段
        myThread.suspend();
        System.out.println("A段: timer = " + System.currentTimeMillis() + " i = " + myThread.getI());
        Thread.sleep(3000);
        System.out.println("A段: timer = " + System.currentTimeMillis() + " i = " + myThread.getI());

        //B段
        myThread.resume();
        Thread.sleep(3000);

        //C段
        myThread.suspend();
        System.out.println("B段: timer = " + System.currentTimeMillis() + " i = " + myThread.getI());
        Thread.sleep(3000);
        System.out.println("B段: timer = " + System.currentTimeMillis() + " i = " + myThread.getI());

    }
}
