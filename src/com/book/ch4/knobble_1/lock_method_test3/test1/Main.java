package com.book.ch4.knobble_1.lock_method_test3.test1;

/**
 * Lock的isFair：判断当前的锁是否是公平锁。
 *
 * 创建的Lock默认是非公平锁
 *
 * @Author: xjf
 * @Date: 2019/6/13 11:08
 */
public class Main {

    public static void main(String[] args) {
        Service service1 = new Service(true);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                service1.testMethod();
            }
        });
        thread1.start();

        Service service2 = new Service(false);
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                service2.testMethod();
            }
        });
        thread2.start();
    }
}
