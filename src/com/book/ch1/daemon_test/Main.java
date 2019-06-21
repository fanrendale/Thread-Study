package com.book.ch1.daemon_test;

/**
 * 测试使用守护线程，守护线程守护的对象是所有的线程。
 * 只要JVM中有一个非守护线程没有结束，则守护线程就全部工作
 * @Author: xjf
 * @Date: 2019/5/27 23:26
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread  = new MyThread();
        //设置为守护线程
        thread.setDaemon(true);
        thread.start();

        //
        MyThreadB myThreadB = new MyThreadB();
        myThreadB.start();

        System.out.println("main Thread isAlive : " + Thread.currentThread().isAlive());

        Thread.sleep(5000);

        System.out.println("main线程停止");
        System.out.println("main Thread isAlive : " + Thread.currentThread().isAlive());
    }
}
