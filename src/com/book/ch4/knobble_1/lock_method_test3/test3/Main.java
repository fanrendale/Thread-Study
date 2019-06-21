package com.book.ch4.knobble_1.lock_method_test3.test3;

/**
 * ReentrantLock的isLocked：判断当前锁是否被任意线程使用
 *
 * 即如果有线程使用了该锁，则为true。如果没有一个线程使用，则为false
 *
 * @Author: xjf
 * @Date: 2019/6/13 11:23
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.testMethod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
