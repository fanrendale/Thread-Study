package com.book.ch1.suspend_resume_deal_lock;

/**
 * suspend会独占对象，如果多个线程访问同一个对象，被suspend后会导致死锁
 * @Author: xjf
 * @Date: 2019/5/26 14:02
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        final SynchronizedObject object = new SynchronizedObject();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                object.printString();
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(1000);

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println("thread2启动了，但是进入不了printString方法");
                System.out.println("因为printString方法被线程a永远的suspend了");
                object.printString();
            }
        };
        thread2.start();
    }
}
