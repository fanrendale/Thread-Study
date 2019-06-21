package com.book.ch3.knobble_1.notify_one;

/**
 * notify()方法发出通知后，如果有多个线程处于wait状态，则只会有一个线程能得到通知（随机）进行唤醒
 *
 * 如果执行多次唤醒，则可能将所有wait状态的线程唤醒
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
