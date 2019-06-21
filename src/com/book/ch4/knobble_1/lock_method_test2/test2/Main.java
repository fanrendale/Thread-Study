package com.book.ch4.knobble_1.lock_method_test2.test2;

/**
 * Lock的hasWaiters方法：判断是否有线程在等待与锁相关的condition条件
 * Lock的getWaitQueueLength方法：获取线程在等待与锁相关的condition条件的个数
 *
 * @Author: xjf
 * @Date: 2019/6/13 10:51
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.awaitMethod();
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

        service.signalMethod();
    }
}
