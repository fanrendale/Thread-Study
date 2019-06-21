package com.book.ch4.knobble_1.lock_method_test3.test2;

/**
 * ReentrantLock的isHeldByCurrentThread方法判断当前线程是否拥有锁
 *
 * @Author: xjf
 * @Date: 2019/6/13 11:16
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service(false);
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
