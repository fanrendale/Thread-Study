package com.book.ch3.knobble_1.notify_all;

/**
 * notifyAll()可以唤醒当前锁对象的所有处于wait状态的线程
 *
 * @Author: xjf
 * @Date: 2019/6/7 17:31
 */
public class Main {

    public static void main(String[] args) {
        try {
            Object lock = new Object();

            ThreadA threadA = new ThreadA(lock);
            threadA.setName("A");
            threadA.start();

            ThreadB threadB = new ThreadB(lock);
            threadB.setName("B");
            threadB.start();

            ThreadC threadC = new ThreadC(lock);
            threadC.setName("C");
            threadC.start();

            Thread.sleep(2000);

            NotifyThread notifyThread = new NotifyThread(lock);
            notifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
