package com.book.ch4.knobble_1.lock_method_test1.test3;

/**
 * Lock的getWaitQueueLength方法获取正在等待当前锁定的相关给定条件Condition的线程数
 *
 * @Author: xjf
 * @Date: 2019/6/13 10:20
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        ThreadA[] threadAS = new ThreadA[10];

        for (int i = 0; i < threadAS.length; i++) {
            threadAS[i] = new ThreadA(service);
        }

        for (int i = 0; i < threadAS.length; i++) {
            threadAS[i].start();
        }

//        Thread.sleep(5);

        service.signalMethod();
    }
}
