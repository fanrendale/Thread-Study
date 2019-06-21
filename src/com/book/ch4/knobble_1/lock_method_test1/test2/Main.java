package com.book.ch4.knobble_1.lock_method_test1.test2;

/**
 * Lock的getQueueLength()方法获取目前正在等待获取该锁的个数是多少
 *
 * @Author: xjf
 * @Date: 2019/6/13 10:01
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.testMethod();
            }
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        Thread.sleep(2000);

        System.out.println("在等待获取锁的线程有：" + service.getLock().getQueueLength());
    }
}
