package com.book.ch4.knobble_1.lock_method_test2.test1;

/**
 * Lock的hasQueuedThread方法：测试给定线程是否在等在获取锁
 * Lock的hasQueuedThreads方法：测试是否有线程在等待获取锁
 *
 * @Author: xjf
 * @Date: 2019/6/13 10:37
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

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread.sleep(1000);

        Thread thread2 = new Thread(runnable);
        thread2.start();

        Thread.sleep(1000);

        System.out.println("测试线程1是否在等待获取锁：" + service.getLock().hasQueuedThread(thread1));
        System.out.println("测试线程2是否在等待获取锁：" + service.getLock().hasQueuedThread(thread2));
        System.out.println("测试是否有线程等待获取锁：" + service.getLock().hasQueuedThreads());
    }
}
